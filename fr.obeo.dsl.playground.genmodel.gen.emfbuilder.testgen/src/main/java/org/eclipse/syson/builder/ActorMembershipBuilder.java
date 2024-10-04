package org.eclipse.syson.builder;

/**
 *  A builder for the {@link ActorMembership}  type.
 */
  public class ActorMembershipBuilder  extends ParameterMembershipBuilder
  {
  
     private org.eclipse.syson.sysml.ActorMembership beingBuilt = org.eclipse.syson.sysml.SysmlFactory.eINSTANCE
             .createActorMembership();
      /**
       * @generated
       */
       protected org.eclipse.syson.sysml.ActorMembership getBeingBuilt() {
           return this.beingBuilt;
       }
       
      /**
       * @generated
       */
       public org.eclipse.syson.sysml.ActorMembership build() {
           return this.getBeingBuilt();
       }

    /**
      * @param value :The EString to set as aliasIds.
 
      * @generated
      */
    public ActorMembershipBuilder aliasIds( java.lang.String ... values) {
      for (java.lang.String value : values) {
           getBeingBuilt().getAliasIds().add(value);
      }
      return this;
    }
    /** 
     * @param values :The EString to set as declaredName.
     * @generated
     */
    public ActorMembershipBuilder declaredName( java.lang.String value) {
        getBeingBuilt().setDeclaredName(value);
        return this;
    }
    /** 
     * @param values :The EString to set as declaredShortName.
     * @generated
     */
    public ActorMembershipBuilder declaredShortName( java.lang.String value) {
        getBeingBuilt().setDeclaredShortName(value);
        return this;
    }
    /** 
     * @param values :The EString to set as elementId. This is a <b>required</b> attribute.
     * @generated
     */
    public ActorMembershipBuilder elementId( java.lang.String value) {
        getBeingBuilt().setElementId(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isImpliedIncluded. This is a <b>required</b> attribute.
     * @generated
     */
    public ActorMembershipBuilder isImpliedIncluded( java.lang.Boolean value) {
        getBeingBuilt().setIsImpliedIncluded(value);
        return this;
    }
    /**
      * @param value :The Relationship to set as ownedRelationship.
 
      * @generated
      */
    public ActorMembershipBuilder ownedRelationship( org.eclipse.syson.sysml.Relationship ... values) {
      for (org.eclipse.syson.sysml.Relationship value : values) {
           getBeingBuilt().getOwnedRelationship().add(value);
      }
      return this;
    }
    /** 
     * @param values :The Relationship to set as owningRelationship.
     * @generated
     */
    public ActorMembershipBuilder owningRelationship( org.eclipse.syson.sysml.Relationship value) {
        getBeingBuilt().setOwningRelationship(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isImplied. This is a <b>required</b> attribute.
     * @generated
     */
    public ActorMembershipBuilder isImplied( java.lang.Boolean value) {
        getBeingBuilt().setIsImplied(value);
        return this;
    }
    /**
      * @param value :The Element to set as ownedRelatedElement.
 
      * @generated
      */
    public ActorMembershipBuilder ownedRelatedElement( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getOwnedRelatedElement().add(value);
      }
      return this;
    }
    /** 
     * @param values :The Element to set as owningRelatedElement.
     * @generated
     */
    public ActorMembershipBuilder owningRelatedElement( org.eclipse.syson.sysml.Element value) {
        getBeingBuilt().setOwningRelatedElement(value);
        return this;
    }
    /**
      * @param value :The Element to set as source.
 
      * @generated
      */
    public ActorMembershipBuilder source( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getSource().add(value);
      }
      return this;
    }
    /**
      * @param value :The Element to set as target.
 
      * @generated
      */
    public ActorMembershipBuilder target( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getTarget().add(value);
      }
      return this;
    }
    /** 
     * @param values :The EString to set as memberName.
     * @generated
     */
    public ActorMembershipBuilder memberName( java.lang.String value) {
        getBeingBuilt().setMemberName(value);
        return this;
    }
    /** 
     * @param values :The EString to set as memberShortName.
     * @generated
     */
    public ActorMembershipBuilder memberShortName( java.lang.String value) {
        getBeingBuilt().setMemberShortName(value);
        return this;
    }
    /** 
     * @param values :The VisibilityKind to set as visibility. This is a <b>required</b> attribute.
     * @generated
     */
    public ActorMembershipBuilder visibility( org.eclipse.syson.sysml.VisibilityKind value) {
        getBeingBuilt().setVisibility(value);
        return this;
    }
    /** 
     * @param values :The Element to set as memberElement. This is a <b>required</b> attribute.
     * @generated
     */
    public ActorMembershipBuilder memberElement( org.eclipse.syson.sysml.Element value) {
        getBeingBuilt().setMemberElement(value);
        return this;
    }
    /** 
     * @param values :The Feature to set as feature. This is a <b>required</b> attribute.
     * @generated
     */
    public ActorMembershipBuilder feature( org.eclipse.syson.sysml.Feature value) {
        getBeingBuilt().setFeature(value);
        return this;
    }
    /** 
     * @param values :The Type to set as type. This is a <b>required</b> attribute.
     * @generated
     */
    public ActorMembershipBuilder type( org.eclipse.syson.sysml.Type value) {
        getBeingBuilt().setType(value);
        return this;
    }
}
