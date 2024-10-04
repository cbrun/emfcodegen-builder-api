package fr.obeo.dsl.playground.genmodel.gen.emfbuilder.testgen;

import fr.obeo.dsl.builder.GuesstimateBuilders;
import fr.obeo.dsl.guesstimate.Sheet;
import fr.obeo.dsl.guesstimate.VariableType;

class BuildingGuessModels {

	public static void main(String[] args) {

		GuesstimateBuilders b = new GuesstimateBuilders();
		// @formatter:off
		Sheet p = b.newSheet()
				.sampleSize(10000)
				.variables(b.newVariable().name("a")
							.type(VariableType.UNIFORM)
							.distribution(b.newUniformDistribution()
									.min(10.0)
									.max(15.0)
									.build())
							.build(),
							b.newVariable().name("b")
							.type(VariableType.TRIANGULAR)
							.distribution(b.newTriangularDistribution()
									.min(100.0)
									.max(300.0)
									.mode(150.0)
									.build())
							.build(),
							b.newVariable().name("c")
							.type(VariableType.FORMULA)
							.distribution(b.newFormulaSetting()
									.formula("a*10 + b")
									.build())
							.build()
							)
				.build();
		p.resample();
		// @formatter:on
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
