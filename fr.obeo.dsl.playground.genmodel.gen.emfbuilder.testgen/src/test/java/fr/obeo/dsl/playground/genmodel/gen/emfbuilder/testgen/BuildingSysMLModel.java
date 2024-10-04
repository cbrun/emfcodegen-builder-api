package fr.obeo.dsl.playground.genmodel.gen.emfbuilder.testgen;

import org.eclipse.syson.builder.SysmlBuilders;
import org.eclipse.syson.sysml.Namespace;

class BuildingSysMLModel {

	public static void main(String[] args) {

		SysmlBuilders b = new SysmlBuilders();
		b.newNamespace().declaredName("My SysMLv2 namespace")
			.ownedRelationship(
					b.newOwningMembership()
					.ownedRelatedElement(
							b.newPartDefinition()
							.declaredName("My definition")
							.isAbstract(true)
							.ownedRelationship(
									b.newOwningMembership()
									.ownedRelatedElement(b.newAttributeDefinition().declaredName("my attribute").build())
									.build()
									
									)
							.build()
							)
					.build()
					)
			.build();
		
		
		Namespace ns = b.newNamespace().declaredName("My SysMLv2 namespace")
		.ownedMembers(
			b.newPartDefinition()
			.declaredName("My definition")
			.isAbstract(true)
			.build()
		 )
		.build();
		
		org.eclipse.syson.sysml.Package p = b.newPackage().declaredName("My SysMLv2 namespace")
		.ownedMembers(
			b.newPartDefinition()
				.declaredName("My definition")
				.isAbstract(true)
				.ownedMembers(
						b.newAttributeDefinition().declaredName("my attribute").build(),
						b.newAttributeDefinition().declaredName("some other Attribute").build()
						)
				.build(),
				b.newPartDefinition()
				.declaredName("My definition non abstract")
				.isAbstract(false)
				.ownedMembers(
						b.newAttributeDefinition().declaredName("my attribute").build(),
						b.newAttributeDefinition().declaredName("some other Attribute").build()
						)
				.build()
		 )
		.build();
		System.out.println(p);
		
		
	}
	
	
	/**
	 * 
	 * @not-generated
	 */
//	public NamespaceBuilder ownedMembers(org.eclipse.syson.sysml.Element... childrens) {
//		OwningMembership membership = SysmlFactory.eINSTANCE.createOwningMembership();
//		for (Element child : childrens) {
//			membership.getOwnedElement().add(child);
//		}
//		getBeingBuilt().getOwnedRelationship().add(membership);
//		return this;
//	}


}
