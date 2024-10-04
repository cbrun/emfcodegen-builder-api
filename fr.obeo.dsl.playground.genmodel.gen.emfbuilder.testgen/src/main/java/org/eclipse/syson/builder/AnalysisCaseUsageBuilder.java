package org.eclipse.syson.builder;

/**
 *  A builder for the {@link AnalysisCaseUsage}  type.
 */
  public class AnalysisCaseUsageBuilder  extends CaseUsageBuilder
  {
  
     private org.eclipse.syson.sysml.AnalysisCaseUsage beingBuilt = org.eclipse.syson.sysml.SysmlFactory.eINSTANCE
             .createAnalysisCaseUsage();
      /**
       * @generated
       */
       protected org.eclipse.syson.sysml.AnalysisCaseUsage getBeingBuilt() {
           return this.beingBuilt;
       }
       
      /**
       * @generated
       */
       public org.eclipse.syson.sysml.AnalysisCaseUsage build() {
           return this.getBeingBuilt();
       }

    /**
      * @param value :The EString to set as aliasIds.
 
      * @generated
      */
    public AnalysisCaseUsageBuilder aliasIds( java.lang.String ... values) {
      for (java.lang.String value : values) {
           getBeingBuilt().getAliasIds().add(value);
      }
      return this;
    }
    /** 
     * @param values :The EString to set as declaredName.
     * @generated
     */
    public AnalysisCaseUsageBuilder declaredName( java.lang.String value) {
        getBeingBuilt().setDeclaredName(value);
        return this;
    }
    /** 
     * @param values :The EString to set as declaredShortName.
     * @generated
     */
    public AnalysisCaseUsageBuilder declaredShortName( java.lang.String value) {
        getBeingBuilt().setDeclaredShortName(value);
        return this;
    }
    /** 
     * @param values :The EString to set as elementId. This is a <b>required</b> attribute.
     * @generated
     */
    public AnalysisCaseUsageBuilder elementId( java.lang.String value) {
        getBeingBuilt().setElementId(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isImpliedIncluded. This is a <b>required</b> attribute.
     * @generated
     */
    public AnalysisCaseUsageBuilder isImpliedIncluded( java.lang.Boolean value) {
        getBeingBuilt().setIsImpliedIncluded(value);
        return this;
    }
    /**
      * @param value :The Relationship to set as ownedRelationship.
 
      * @generated
      */
    public AnalysisCaseUsageBuilder ownedRelationship( org.eclipse.syson.sysml.Relationship ... values) {
      for (org.eclipse.syson.sysml.Relationship value : values) {
           getBeingBuilt().getOwnedRelationship().add(value);
      }
      return this;
    }
    /** 
     * @param values :The Relationship to set as owningRelationship.
     * @generated
     */
    public AnalysisCaseUsageBuilder owningRelationship( org.eclipse.syson.sysml.Relationship value) {
        getBeingBuilt().setOwningRelationship(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isAbstract. This is a <b>required</b> attribute.
     * @generated
     */
    public AnalysisCaseUsageBuilder isAbstract( java.lang.Boolean value) {
        getBeingBuilt().setIsAbstract(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isSufficient. This is a <b>required</b> attribute.
     * @generated
     */
    public AnalysisCaseUsageBuilder isSufficient( java.lang.Boolean value) {
        getBeingBuilt().setIsSufficient(value);
        return this;
    }
    /** 
     * @param values :The FeatureDirectionKind to set as direction.
     * @generated
     */
    public AnalysisCaseUsageBuilder direction( org.eclipse.syson.sysml.FeatureDirectionKind value) {
        getBeingBuilt().setDirection(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isComposite. This is a <b>required</b> attribute.
     * @generated
     */
    public AnalysisCaseUsageBuilder isComposite( java.lang.Boolean value) {
        getBeingBuilt().setIsComposite(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isDerived. This is a <b>required</b> attribute.
     * @generated
     */
    public AnalysisCaseUsageBuilder isDerived( java.lang.Boolean value) {
        getBeingBuilt().setIsDerived(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isEnd. This is a <b>required</b> attribute.
     * @generated
     */
    public AnalysisCaseUsageBuilder isEnd( java.lang.Boolean value) {
        getBeingBuilt().setIsEnd(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isOrdered. This is a <b>required</b> attribute.
     * @generated
     */
    public AnalysisCaseUsageBuilder isOrdered( java.lang.Boolean value) {
        getBeingBuilt().setIsOrdered(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isPortion. This is a <b>required</b> attribute.
     * @generated
     */
    public AnalysisCaseUsageBuilder isPortion( java.lang.Boolean value) {
        getBeingBuilt().setIsPortion(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isReadOnly. This is a <b>required</b> attribute.
     * @generated
     */
    public AnalysisCaseUsageBuilder isReadOnly( java.lang.Boolean value) {
        getBeingBuilt().setIsReadOnly(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isUnique. This is a <b>required</b> attribute.
     * @generated
     */
    public AnalysisCaseUsageBuilder isUnique( java.lang.Boolean value) {
        getBeingBuilt().setIsUnique(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isVariation. This is a <b>required</b> attribute.
     * @generated
     */
    public AnalysisCaseUsageBuilder isVariation( java.lang.Boolean value) {
        getBeingBuilt().setIsVariation(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isIndividual. This is a <b>required</b> attribute.
     * @generated
     */
    public AnalysisCaseUsageBuilder isIndividual( java.lang.Boolean value) {
        getBeingBuilt().setIsIndividual(value);
        return this;
    }
    /** 
     * @param values :The PortionKind to set as portionKind.
     * @generated
     */
    public AnalysisCaseUsageBuilder portionKind( org.eclipse.syson.sysml.PortionKind value) {
        getBeingBuilt().setPortionKind(value);
        return this;
    }
}
