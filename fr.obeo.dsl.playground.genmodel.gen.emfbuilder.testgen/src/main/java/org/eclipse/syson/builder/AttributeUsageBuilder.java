package org.eclipse.syson.builder;

/**
 *  A builder for the {@link AttributeUsage}  type.
 */
  public class AttributeUsageBuilder  extends UsageBuilder
  {
  
     private org.eclipse.syson.sysml.AttributeUsage beingBuilt = org.eclipse.syson.sysml.SysmlFactory.eINSTANCE
             .createAttributeUsage();
      /**
       * @generated
       */
       protected org.eclipse.syson.sysml.AttributeUsage getBeingBuilt() {
           return this.beingBuilt;
       }
       
      /**
       * @generated
       */
       public org.eclipse.syson.sysml.AttributeUsage build() {
           return this.getBeingBuilt();
       }

    /**
      * @param value :The EString to set as aliasIds.
 
      * @generated
      */
    public AttributeUsageBuilder aliasIds( java.lang.String ... values) {
      for (java.lang.String value : values) {
           getBeingBuilt().getAliasIds().add(value);
      }
      return this;
    }
    /** 
     * @param values :The EString to set as declaredName.
     * @generated
     */
    public AttributeUsageBuilder declaredName( java.lang.String value) {
        getBeingBuilt().setDeclaredName(value);
        return this;
    }
    /** 
     * @param values :The EString to set as declaredShortName.
     * @generated
     */
    public AttributeUsageBuilder declaredShortName( java.lang.String value) {
        getBeingBuilt().setDeclaredShortName(value);
        return this;
    }
    /** 
     * @param values :The EString to set as elementId. This is a <b>required</b> attribute.
     * @generated
     */
    public AttributeUsageBuilder elementId( java.lang.String value) {
        getBeingBuilt().setElementId(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isImpliedIncluded. This is a <b>required</b> attribute.
     * @generated
     */
    public AttributeUsageBuilder isImpliedIncluded( java.lang.Boolean value) {
        getBeingBuilt().setIsImpliedIncluded(value);
        return this;
    }
    /**
      * @param value :The Relationship to set as ownedRelationship.
 
      * @generated
      */
    public AttributeUsageBuilder ownedRelationship( org.eclipse.syson.sysml.Relationship ... values) {
      for (org.eclipse.syson.sysml.Relationship value : values) {
           getBeingBuilt().getOwnedRelationship().add(value);
      }
      return this;
    }
    /** 
     * @param values :The Relationship to set as owningRelationship.
     * @generated
     */
    public AttributeUsageBuilder owningRelationship( org.eclipse.syson.sysml.Relationship value) {
        getBeingBuilt().setOwningRelationship(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isAbstract. This is a <b>required</b> attribute.
     * @generated
     */
    public AttributeUsageBuilder isAbstract( java.lang.Boolean value) {
        getBeingBuilt().setIsAbstract(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isSufficient. This is a <b>required</b> attribute.
     * @generated
     */
    public AttributeUsageBuilder isSufficient( java.lang.Boolean value) {
        getBeingBuilt().setIsSufficient(value);
        return this;
    }
    /** 
     * @param values :The FeatureDirectionKind to set as direction.
     * @generated
     */
    public AttributeUsageBuilder direction( org.eclipse.syson.sysml.FeatureDirectionKind value) {
        getBeingBuilt().setDirection(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isComposite. This is a <b>required</b> attribute.
     * @generated
     */
    public AttributeUsageBuilder isComposite( java.lang.Boolean value) {
        getBeingBuilt().setIsComposite(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isDerived. This is a <b>required</b> attribute.
     * @generated
     */
    public AttributeUsageBuilder isDerived( java.lang.Boolean value) {
        getBeingBuilt().setIsDerived(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isEnd. This is a <b>required</b> attribute.
     * @generated
     */
    public AttributeUsageBuilder isEnd( java.lang.Boolean value) {
        getBeingBuilt().setIsEnd(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isOrdered. This is a <b>required</b> attribute.
     * @generated
     */
    public AttributeUsageBuilder isOrdered( java.lang.Boolean value) {
        getBeingBuilt().setIsOrdered(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isPortion. This is a <b>required</b> attribute.
     * @generated
     */
    public AttributeUsageBuilder isPortion( java.lang.Boolean value) {
        getBeingBuilt().setIsPortion(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isReadOnly. This is a <b>required</b> attribute.
     * @generated
     */
    public AttributeUsageBuilder isReadOnly( java.lang.Boolean value) {
        getBeingBuilt().setIsReadOnly(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isUnique. This is a <b>required</b> attribute.
     * @generated
     */
    public AttributeUsageBuilder isUnique( java.lang.Boolean value) {
        getBeingBuilt().setIsUnique(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isVariation. This is a <b>required</b> attribute.
     * @generated
     */
    public AttributeUsageBuilder isVariation( java.lang.Boolean value) {
        getBeingBuilt().setIsVariation(value);
        return this;
    }
}
