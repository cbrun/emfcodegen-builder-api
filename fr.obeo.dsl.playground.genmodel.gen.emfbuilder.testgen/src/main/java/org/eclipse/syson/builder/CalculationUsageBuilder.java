package org.eclipse.syson.builder;

/**
 *  A builder for the {@link CalculationUsage}  type.
 */
  public class CalculationUsageBuilder  extends ActionUsageBuilder
  {
  
     private org.eclipse.syson.sysml.CalculationUsage beingBuilt = org.eclipse.syson.sysml.SysmlFactory.eINSTANCE
             .createCalculationUsage();
      /**
       * @generated
       */
       protected org.eclipse.syson.sysml.CalculationUsage getBeingBuilt() {
           return this.beingBuilt;
       }
       
      /**
       * @generated
       */
       public org.eclipse.syson.sysml.CalculationUsage build() {
           return this.getBeingBuilt();
       }

    /**
      * @param value :The EString to set as aliasIds.
 
      * @generated
      */
    public CalculationUsageBuilder aliasIds( java.lang.String ... values) {
      for (java.lang.String value : values) {
           getBeingBuilt().getAliasIds().add(value);
      }
      return this;
    }
    /** 
     * @param values :The EString to set as declaredName.
     * @generated
     */
    public CalculationUsageBuilder declaredName( java.lang.String value) {
        getBeingBuilt().setDeclaredName(value);
        return this;
    }
    /** 
     * @param values :The EString to set as declaredShortName.
     * @generated
     */
    public CalculationUsageBuilder declaredShortName( java.lang.String value) {
        getBeingBuilt().setDeclaredShortName(value);
        return this;
    }
    /** 
     * @param values :The EString to set as elementId. This is a required attribute.
     * @generated
     */
    public CalculationUsageBuilder elementId( java.lang.String value) {
        getBeingBuilt().setElementId(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isImpliedIncluded. This is a required attribute.
     * @generated
     */
    public CalculationUsageBuilder isImpliedIncluded( java.lang.Boolean value) {
        getBeingBuilt().setIsImpliedIncluded(value);
        return this;
    }
    /**
      * @param value :The Relationship to set as ownedRelationship.
 
      * @generated
      */
    public CalculationUsageBuilder ownedRelationship( org.eclipse.syson.sysml.Relationship ... values) {
      for (org.eclipse.syson.sysml.Relationship value : values) {
           getBeingBuilt().getOwnedRelationship().add(value);
      }
      return this;
    }
    /** 
     * @param values :The Relationship to set as owningRelationship.
     * @generated
     */
    public CalculationUsageBuilder owningRelationship( org.eclipse.syson.sysml.Relationship value) {
        getBeingBuilt().setOwningRelationship(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isAbstract. This is a required attribute.
     * @generated
     */
    public CalculationUsageBuilder isAbstract( java.lang.Boolean value) {
        getBeingBuilt().setIsAbstract(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isSufficient. This is a required attribute.
     * @generated
     */
    public CalculationUsageBuilder isSufficient( java.lang.Boolean value) {
        getBeingBuilt().setIsSufficient(value);
        return this;
    }
    /** 
     * @param values :The FeatureDirectionKind to set as direction.
     * @generated
     */
    public CalculationUsageBuilder direction( org.eclipse.syson.sysml.FeatureDirectionKind value) {
        getBeingBuilt().setDirection(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isComposite. This is a required attribute.
     * @generated
     */
    public CalculationUsageBuilder isComposite( java.lang.Boolean value) {
        getBeingBuilt().setIsComposite(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isDerived. This is a required attribute.
     * @generated
     */
    public CalculationUsageBuilder isDerived( java.lang.Boolean value) {
        getBeingBuilt().setIsDerived(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isEnd. This is a required attribute.
     * @generated
     */
    public CalculationUsageBuilder isEnd( java.lang.Boolean value) {
        getBeingBuilt().setIsEnd(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isOrdered. This is a required attribute.
     * @generated
     */
    public CalculationUsageBuilder isOrdered( java.lang.Boolean value) {
        getBeingBuilt().setIsOrdered(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isPortion. This is a required attribute.
     * @generated
     */
    public CalculationUsageBuilder isPortion( java.lang.Boolean value) {
        getBeingBuilt().setIsPortion(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isReadOnly. This is a required attribute.
     * @generated
     */
    public CalculationUsageBuilder isReadOnly( java.lang.Boolean value) {
        getBeingBuilt().setIsReadOnly(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isUnique. This is a required attribute.
     * @generated
     */
    public CalculationUsageBuilder isUnique( java.lang.Boolean value) {
        getBeingBuilt().setIsUnique(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isVariation. This is a required attribute.
     * @generated
     */
    public CalculationUsageBuilder isVariation( java.lang.Boolean value) {
        getBeingBuilt().setIsVariation(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isIndividual. This is a required attribute.
     * @generated
     */
    public CalculationUsageBuilder isIndividual( java.lang.Boolean value) {
        getBeingBuilt().setIsIndividual(value);
        return this;
    }
    /** 
     * @param values :The PortionKind to set as portionKind.
     * @generated
     */
    public CalculationUsageBuilder portionKind( org.eclipse.syson.sysml.PortionKind value) {
        getBeingBuilt().setPortionKind(value);
        return this;
    }
}
