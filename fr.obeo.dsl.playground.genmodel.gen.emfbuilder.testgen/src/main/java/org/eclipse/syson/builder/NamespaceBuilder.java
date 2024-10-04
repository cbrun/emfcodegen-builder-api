package org.eclipse.syson.builder;

import org.eclipse.syson.sysml.Element;
import org.eclipse.syson.sysml.OwningMembership;
import org.eclipse.syson.sysml.SysmlFactory;

public class NamespaceBuilder extends ElementBuilder {
	private org.eclipse.syson.sysml.Namespace beingBuilt = org.eclipse.syson.sysml.SysmlFactory.eINSTANCE
			.createNamespace();

	/**
	 * @generated
	 */
	protected org.eclipse.syson.sysml.Namespace getBeingBuilt() {
           return this.beingBuilt;
       }

	/**
	 * @generated
	 */
	public org.eclipse.syson.sysml.Namespace build() {
           return this.getBeingBuilt();
       }

	/**
	 * @param value :The EString to set as aliasIds.
	 * @generated
	 */
	public NamespaceBuilder aliasIds(java.lang.String ... values) {
      for (java.lang.String value : values) {
           getBeingBuilt().getAliasIds().add(value);
      }
      return this;
    }

	/**
	 * @param values :The EString to set as declaredName.
	 * @generated
	 */
	public NamespaceBuilder declaredName(java.lang.String value) {
        getBeingBuilt().setDeclaredName(value);
        return this;
    }

	/**
	 * @param values :The EString to set as declaredShortName.
	 * @generated
	 */
	public NamespaceBuilder declaredShortName(java.lang.String value) {
        getBeingBuilt().setDeclaredShortName(value);
        return this;
    }

	/**
	 * @param values :The EString to set as elementId.
	 * @generated
	 */
	public NamespaceBuilder elementId(java.lang.String value) {
        getBeingBuilt().setElementId(value);
        return this;
    }

	/**
	 * @param values :The EBoolean to set as isImpliedIncluded.
	 * @generated
	 */
	public NamespaceBuilder isImpliedIncluded(java.lang.Boolean value) {
        getBeingBuilt().setIsImpliedIncluded(value);
        return this;
    }

	/**
	 * @param value :The Relationship to set as ownedRelationship.
	 * @generated
	 */
	public NamespaceBuilder ownedRelationship(org.eclipse.syson.sysml.Relationship ... values) {
      for (org.eclipse.syson.sysml.Relationship value : values) {
           getBeingBuilt().getOwnedRelationship().add(value);
      }
      return this;
    }

	/**
	 * @param values :The Relationship to set as owningRelationship.
	 * @generated
	 */
	public NamespaceBuilder owningRelationship(org.eclipse.syson.sysml.Relationship value) {
        getBeingBuilt().setOwningRelationship(value);
        return this;
    }

	/**
	 * 
	 * @not-generated
	 */
	public NamespaceBuilder ownedMembers(org.eclipse.syson.sysml.Element... childrens) {
		OwningMembership membership = SysmlFactory.eINSTANCE.createOwningMembership();
		for (Element child : childrens) {
			membership.getOwnedRelatedElement().add(child);
		}
		getBeingBuilt().getOwnedRelationship().add(membership);
		return this;
	}

}
