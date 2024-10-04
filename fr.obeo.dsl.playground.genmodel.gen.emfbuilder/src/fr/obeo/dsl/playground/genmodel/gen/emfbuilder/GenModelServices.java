package fr.obeo.dsl.playground.genmodel.gen.emfbuilder;

import java.io.File;
import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;

public class GenModelServices {

	public String qualifiedInterfaceName(GenClass g) {
		return g.getQualifiedInterfaceName();
	}

	public List<GenFeature> allGenFeatures(GenClass g) {
		return g.getAllGenFeatures();
	}

	public boolean hasFactoryInterfaceCreateMethod(GenClass g) {
		return g.hasFactoryInterfaceCreateMethod();
	}

	public String folderPath(GenPackage g) {
		StringBuffer path = new StringBuffer();
		for (String pak : g.getBasePackage().split("\\.")) {
			path.append(pak);
			path.append(File.separatorChar);
		}
		return path.toString();
	}

	public String name(GenClass g) {
		return g.getName();
	}
	
	public String safeName(GenClass clazz) {
		return clazz.capName(clazz.getSafeUncapName());
	}

	public String safeName(GenFeature g) {
		return g.getSafeName();
	}

	public String accessorName(GenFeature g) {
		return g.getAccessorName();
	}

	public String listItemType(GenFeature g) {
		return g.getListItemType();
	}
	
	public GenClass classExtendsGenClass(GenClass g) {
		return g.getClassExtendsGenClass();
	}

	public String qualifiedEFactoryInternalInstanceAccessor(GenPackage genPackage) {
		return genPackage.getQualifiedEFactoryInstanceAccessor();
	}
	public String qualifiedName(GenClass clazz) {
		return clazz.getTypeParameters() + clazz.getImportedInterfaceName() + clazz.getInterfaceTypeArguments();
	}
}
