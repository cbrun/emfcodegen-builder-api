/*******************************************************************************
 * Copyright (c) 2023 Obeo.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package fr.obeo.dsl.playground.emfcodegen.builder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.merge.java.JControlModel;
import org.eclipse.emf.codegen.merge.java.JMerger;
import org.eclipse.emf.codegen.merge.java.facade.ast.ASTFacadeHelper;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import com.google.common.base.Strings;
import com.google.common.collect.Iterables;

public class BuilderGenerator {

	private String pathToJMergeFile;
	private String outputDirectory;
	private String basePackage = "fr.obeo.dsl.biblio.app.representationsbuilders.builders.test";

	public BuilderGenerator(String pathToJMergeFile, String outputDirectory, String basePackage) {
		super();
		this.pathToJMergeFile = pathToJMergeFile;
		this.outputDirectory = outputDirectory;
		this.basePackage = basePackage;
	}

	public static void main(String[] args) {

		for (String string : args) {
			System.err.println(string);
		}
		String javaVersion = Runtime.version().toString();
		String time = LocalDateTime.now().toString();
		System.out.println("********\nBuild Time: " + time + "\nJava Version: " + javaVersion + "\n********");

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new EcoreResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(GenModelPackage.eNS_URI, GenModelPackage.eINSTANCE);
		resourceSet.getResources().add(EcorePackage.eINSTANCE.eResource());
		resourceSet.getURIConverter().getURIMap().put(
				URI.createURI("platform:/plugin/org.eclipse.emf.ecore/model/Ecore.ecore"),
				URI.createURI("http://www.eclipse.org/emf/2002/Ecore"));
		
		URI uri = URI.createURI("file://" + args[1]);
		Resource g = resourceSet.getResource(uri, true);
		BuilderGenerator gen = new BuilderGenerator(args[0], args[2], args[3]);
		for (GenModel e : Iterables.filter(g.getContents(), GenModel.class)) {
			try {
				gen.doGen(e);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		System.out.println("Generated!");
	}

	public void doGen(GenModel model) throws IOException {
		JControlModel jControlModel = new JControlModel();
		jControlModel.setConvertToStandardBraceStyle(true);
		ASTFacadeHelper facadeHelper = new ASTFacadeHelper();
		facadeHelper.setCompilerCompliance("17");
		String jmergeFile = this.pathToJMergeFile;
		if (jmergeFile == null) {
			// emf-merge file is from org.eclipse.emf.codegen.ecore/templates/emf-merge.xml
			getClass().getResource("emf-merge.xml").toString();
		}
		jControlModel.initialize(facadeHelper, jmergeFile);
		for (GenPackage pak : model.getGenPackages()) {
			StringBuffer factory = new StringBuffer();
			String builderFactoryName = pak.getPrefix() + "Builders";

			StringBuffer classBody = new StringBuffer();
			for (GenClass clazz : pak.getGenClasses()) {
				if (!clazz.isAbstract() && !clazz.isInterface() && clazz.hasFactoryInterfaceCreateMethod()) {
					classBody.append("""


							  /**
							   * @generated
							   */
							  public #builderClassName new#className() {
							    return new #builderClassName();
							  }

							""".replace("#builderClassName", builderClasssName(clazz)).replace("#className",
							clazz.getName()));
				}
			}
			factory.append("""
					package #package;
					/**
					 * @generated
					 */
					public class #factoryName {
					  #classbody
					}
					""".replace("#factoryName", builderFactoryName).replace("#classbody", classBody).replace("#package",
					getPackageDeclaration(pak)));

			String factFileName = builderFactoryName + ".java";

			generateOrMerge(jControlModel, outputDirectory, factFileName, factory.toString());

			for (GenClass clazz : pak.getGenClasses()) {

				StringBuffer body = new StringBuffer();
				for (GenFeature feat : clazz.getAllGenFeatures()) {
					if (!feat.getEcoreFeature().isDerived() && feat.getEcoreFeature().isChangeable()) {
						if (!feat.getEcoreFeature().isMany()) {
							body.append("""
									/**
									 * #javadoc
									 * @generated
									 */
									  public #builderClassName #featName(#paramType value) {
									    getBeingBuilt().set#accessor(value);
									    return this;
									  }

									""".replace("#builderClassName", builderClasssName(clazz))
									.replace("#paramType", feat.getListItemType(clazz))
									.replace("#accessor", feat.getAccessorName())
									.replace("#featName", feat.getSafeName())
									.replace("#javadoc", Strings.nullToEmpty(feat.getDocumentation())));
						} else {
							body.append("""
									  /**
									   * #javadoc
									   * @generated
									   */
									  public #builderClassName #featName(#paramType ... values) {
									    for (#paramType value : values) {
									     getBeingBuilt().get#accessor().add(value);
									    }
									    return this;
									  }

									""".replace("#builderClassName", builderClasssName(clazz))
									.replace("#paramType", feat.getListItemType(clazz))
									.replace("#accessor", feat.getAccessorName())
									.replace("#featName", feat.getSafeName())
									.replace("#javadoc", Strings.nullToEmpty(feat.getDocumentation())));
						}
					}
				}

				if (!clazz.isAbstract()) {
					body.append("""
							 /**
							  * @generated
							  */
							 private #eObjType beingBuilt = #packageFactory.create#eObjName();

							 /**
							  * @generated
							  */
							 protected #eObjType getBeingBuilt() {
							   return this.beingBuilt;
							 }

							 /**
							 * @generated
							 */
							 public #eObjType build() {							
							   return this.getBeingBuilt();
							 }

							"""
							.replace("#packageFactory",
									clazz.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor())
							.replace("#eObjType", clazz.getQualifiedInterfaceName())
							.replace("#eObjName", clazz.capName(clazz.getSafeUncapName())));
				}
				StringBuffer out = new StringBuffer();
				if (clazz.isAbstract()) {
					out.append("""
							  package #package;

							  import org.eclipse.emf.common.util.Diagnostic;
							  import org.eclipse.emf.ecore.util.Diagnostician;
							  /**
							   * @generated
							   */
							  public abstract class #builderClassName {

							    /**
							     * @generated
							     */
							    abstract protected #qualifiedType getBeingBuilt();

							    #classbody
							  }

							""".replace("#builderClassName", builderClasssName(clazz))
							.replace("#qualifiedType", qualifiedNameFromGenClass(clazz)).replace("#classbody", body)
							.replace("#package", getPackageDeclaration(pak)));
				} else {
					out.append("""
							package #package;

							import org.eclipse.emf.common.util.Diagnostic;
							import org.eclipse.emf.ecore.util.Diagnostician;
							/**
							   * @generated
							   */
							  public class #builderClassName {

							   #classbody
							  }

							""".replace("#builderClassName", builderClasssName(clazz))
							.replace("#qualifiedType", clazz.getQualifiedInterfaceName()).replace("#classbody", body)
							.replace("#package", getPackageDeclaration(pak)));
				}
				String fileName = builderClasssName(clazz) + ".java";
				String contentToGenerate = out.toString();
				generateOrMerge(jControlModel, outputDirectory, fileName, contentToGenerate);
			}
		}

	}

	private String qualifiedNameFromGenClass(GenClass clazz) {
		// genClass.getTypeParameters()%><%=genClass.getImportedInterfaceName()%><%=genClass.getInterfaceTypeArguments()
		return clazz.getTypeParameters() + clazz.getImportedInterfaceName() + clazz.getInterfaceTypeArguments();
	}

	private String getPackageDeclaration(GenPackage pak) {
		return basePackage;
	}

	private void generateOrMerge(JControlModel jControlModel, String outputDirectory, String fileName,
			String contentToGenerate) throws IOException {
		String beforeGen = null;
		if (Files.exists(Path.of(outputDirectory, fileName))) {
			beforeGen = Files.readString(Path.of(outputDirectory, fileName));
		} else {
			Files.createDirectories(Path.of(outputDirectory));
		}
		if (beforeGen != null && jControlModel.canMerge()) {
			JMerger jMerger = new JMerger(jControlModel);
			jMerger.setSourceCompilationUnit(contentToGenerate);
			jMerger.setTargetCompilationUnit(jMerger.createCompilationUnitForContents(beforeGen));
			jMerger.merge();
			String mergedContent = jMerger.getTargetCompilationUnit().getContents();
			System.out.println("MERGED " + Path.of(outputDirectory, fileName));
			Files.writeString(Path.of(outputDirectory, fileName), mergedContent);
		} else {
			System.out.println("NEW " + Path.of(outputDirectory, fileName));
			Files.writeString(Path.of(outputDirectory, fileName), contentToGenerate, StandardOpenOption.CREATE);
		}
	}

	private String builderClasssName(GenClass clazz) {
		return clazz.getName() + "Builder";
	}

}
