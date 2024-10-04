package org.eclipse.syson.builder;

/**
 *  A builder for the {@link AllocationUsage}  type.
 */
  public class AllocationUsageBuilder  extends ConnectionUsageBuilder
  {
  
     private org.eclipse.syson.sysml.AllocationUsage beingBuilt = org.eclipse.syson.sysml.SysmlFactory.eINSTANCE
             .createAllocationUsage();
      /**
       * @generated
       */
       protected org.eclipse.syson.sysml.AllocationUsage getBeingBuilt() {
           return this.beingBuilt;
       }
       
      /**
       * @generated
       */
       public org.eclipse.syson.sysml.AllocationUsage build() {
           return this.getBeingBuilt();
       }

    /**
      * @param value :The EString to set as aliasIds.
 
      * @generated
      */
    public AllocationUsageBuilder aliasIds( java.lang.String ... values) {
      for (java.lang.String value : values) {
           getBeingBuilt().getAliasIds().add(value);
      }
      return this;
    }
    /** 
     * @param values :The EString to set as declaredName.
     * @generated
     */
    public AllocationUsageBuilder declaredName( java.lang.String value) {
        getBeingBuilt().setDeclaredName(value);
        return this;
    }
    /** 
     * @param values :The EString to set as declaredShortName.
     * @generated
     */
    public AllocationUsageBuilder declaredShortName( java.lang.String value) {
        getBeingBuilt().setDeclaredShortName(value);
        return this;
    }
    /** 
     * @param values :The EString to set as elementId. This is a <b>required</b> attribute.
     * @generated
     */
    public AllocationUsageBuilder elementId( java.lang.String value) {
        getBeingBuilt().setElementId(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isImpliedIncluded. This is a <b>required</b> attribute.
     * @generated
     */
    public AllocationUsageBuilder isImpliedIncluded( java.lang.Boolean value) {
        getBeingBuilt().setIsImpliedIncluded(value);
        return this;
    }
    /**
      * @param value :The Relationship to set as ownedRelationship.
 
      * @generated
      */
    public AllocationUsageBuilder ownedRelationship( org.eclipse.syson.sysml.Relationship ... values) {
      for (org.eclipse.syson.sysml.Relationship value : values) {
           getBeingBuilt().getOwnedRelationship().add(value);
      }
      return this;
    }
    /** 
     * @param values :The Relationship to set as owningRelationship.
     * @generated
     */
    public AllocationUsageBuilder owningRelationship( org.eclipse.syson.sysml.Relationship value) {
        getBeingBuilt().setOwningRelationship(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isAbstract. This is a <b>required</b> attribute.
     * @generated
     */
    public AllocationUsageBuilder isAbstract( java.lang.Boolean value) {
        getBeingBuilt().setIsAbstract(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isSufficient. This is a <b>required</b> attribute.
     * @generated
     */
    public AllocationUsageBuilder isSufficient( java.lang.Boolean value) {
        getBeingBuilt().setIsSufficient(value);
        return this;
    }
    /** 
     * @param values :The FeatureDirectionKind to set as direction.
     * @generated
     */
    public AllocationUsageBuilder direction( org.eclipse.syson.sysml.FeatureDirectionKind value) {
        getBeingBuilt().setDirection(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isComposite. This is a <b>required</b> attribute.
     * @generated
     */
    public AllocationUsageBuilder isComposite( java.lang.Boolean value) {
        getBeingBuilt().setIsComposite(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isDerived. This is a <b>required</b> attribute.
     * @generated
     */
    public AllocationUsageBuilder isDerived( java.lang.Boolean value) {
        getBeingBuilt().setIsDerived(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isEnd. This is a <b>required</b> attribute.
     * @generated
     */
    public AllocationUsageBuilder isEnd( java.lang.Boolean value) {
        getBeingBuilt().setIsEnd(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isOrdered. This is a <b>required</b> attribute.
     * @generated
     */
    public AllocationUsageBuilder isOrdered( java.lang.Boolean value) {
        getBeingBuilt().setIsOrdered(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isPortion. This is a <b>required</b> attribute.
     * @generated
     */
    public AllocationUsageBuilder isPortion( java.lang.Boolean value) {
        getBeingBuilt().setIsPortion(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isReadOnly. This is a <b>required</b> attribute.
     * @generated
     */
    public AllocationUsageBuilder isReadOnly( java.lang.Boolean value) {
        getBeingBuilt().setIsReadOnly(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isUnique. This is a <b>required</b> attribute.
     * @generated
     */
    public AllocationUsageBuilder isUnique( java.lang.Boolean value) {
        getBeingBuilt().setIsUnique(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isVariation. This is a <b>required</b> attribute.
     * @generated
     */
    public AllocationUsageBuilder isVariation( java.lang.Boolean value) {
        getBeingBuilt().setIsVariation(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isImplied. This is a <b>required</b> attribute.
     * @generated
     */
    public AllocationUsageBuilder isImplied( java.lang.Boolean value) {
        getBeingBuilt().setIsImplied(value);
        return this;
    }
    /**
      * @param value :The Element to set as ownedRelatedElement.
 
      * @generated
      */
    public AllocationUsageBuilder ownedRelatedElement( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getOwnedRelatedElement().add(value);
      }
      return this;
    }
    /** 
     * @param values :The Element to set as owningRelatedElement.
     * @generated
     */
    public AllocationUsageBuilder owningRelatedElement( org.eclipse.syson.sysml.Element value) {
        getBeingBuilt().setOwningRelatedElement(value);
        return this;
    }
    /**
      * @param value :The Element to set as source.
 
      * @generated
      */
    public AllocationUsageBuilder source( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getSource().add(value);
      }
      return this;
    }
    /**
      * @param value :The Element to set as target.
 
      * @generated
      */
    public AllocationUsageBuilder target( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getTarget().add(value);
      }
      return this;
    }
    /** 
     * @param values :The EBoolean to set as isIndividual. This is a <b>required</b> attribute.
     * @generated
     */
    public AllocationUsageBuilder isIndividual( java.lang.Boolean value) {
        getBeingBuilt().setIsIndividual(value);
        return this;
    }
    /** 
     * @param values :The PortionKind to set as portionKind.
     * @generated
     */
    public AllocationUsageBuilder portionKind( org.eclipse.syson.sysml.PortionKind value) {
        getBeingBuilt().setPortionKind(value);
        return this;
    }
}
