package org.eclipse.syson.builder;

/**
 *  A builder for the {@link BindingConnectorAsUsage}  type.
 */
  public class BindingConnectorAsUsageBuilder  extends ConnectorAsUsageBuilder
  {
  
     private org.eclipse.syson.sysml.BindingConnectorAsUsage beingBuilt = org.eclipse.syson.sysml.SysmlFactory.eINSTANCE
             .createBindingConnectorAsUsage();
      /**
       * @generated
       */
       protected org.eclipse.syson.sysml.BindingConnectorAsUsage getBeingBuilt() {
           return this.beingBuilt;
       }
       
      /**
       * @generated
       */
       public org.eclipse.syson.sysml.BindingConnectorAsUsage build() {
           return this.getBeingBuilt();
       }

    /**
      * @param value :The EString to set as aliasIds.
 
      * @generated
      */
    public BindingConnectorAsUsageBuilder aliasIds( java.lang.String ... values) {
      for (java.lang.String value : values) {
           getBeingBuilt().getAliasIds().add(value);
      }
      return this;
    }
    /** 
     * @param values :The EString to set as declaredName.
     * @generated
     */
    public BindingConnectorAsUsageBuilder declaredName( java.lang.String value) {
        getBeingBuilt().setDeclaredName(value);
        return this;
    }
    /** 
     * @param values :The EString to set as declaredShortName.
     * @generated
     */
    public BindingConnectorAsUsageBuilder declaredShortName( java.lang.String value) {
        getBeingBuilt().setDeclaredShortName(value);
        return this;
    }
    /** 
     * @param values :The EString to set as elementId. This is a required attribute.
     * @generated
     */
    public BindingConnectorAsUsageBuilder elementId( java.lang.String value) {
        getBeingBuilt().setElementId(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isImpliedIncluded. This is a required attribute.
     * @generated
     */
    public BindingConnectorAsUsageBuilder isImpliedIncluded( java.lang.Boolean value) {
        getBeingBuilt().setIsImpliedIncluded(value);
        return this;
    }
    /**
      * @param value :The Relationship to set as ownedRelationship.
 
      * @generated
      */
    public BindingConnectorAsUsageBuilder ownedRelationship( org.eclipse.syson.sysml.Relationship ... values) {
      for (org.eclipse.syson.sysml.Relationship value : values) {
           getBeingBuilt().getOwnedRelationship().add(value);
      }
      return this;
    }
    /** 
     * @param values :The Relationship to set as owningRelationship.
     * @generated
     */
    public BindingConnectorAsUsageBuilder owningRelationship( org.eclipse.syson.sysml.Relationship value) {
        getBeingBuilt().setOwningRelationship(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isAbstract. This is a required attribute.
     * @generated
     */
    public BindingConnectorAsUsageBuilder isAbstract( java.lang.Boolean value) {
        getBeingBuilt().setIsAbstract(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isSufficient. This is a required attribute.
     * @generated
     */
    public BindingConnectorAsUsageBuilder isSufficient( java.lang.Boolean value) {
        getBeingBuilt().setIsSufficient(value);
        return this;
    }
    /** 
     * @param values :The FeatureDirectionKind to set as direction.
     * @generated
     */
    public BindingConnectorAsUsageBuilder direction( org.eclipse.syson.sysml.FeatureDirectionKind value) {
        getBeingBuilt().setDirection(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isComposite. This is a required attribute.
     * @generated
     */
    public BindingConnectorAsUsageBuilder isComposite( java.lang.Boolean value) {
        getBeingBuilt().setIsComposite(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isDerived. This is a required attribute.
     * @generated
     */
    public BindingConnectorAsUsageBuilder isDerived( java.lang.Boolean value) {
        getBeingBuilt().setIsDerived(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isEnd. This is a required attribute.
     * @generated
     */
    public BindingConnectorAsUsageBuilder isEnd( java.lang.Boolean value) {
        getBeingBuilt().setIsEnd(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isOrdered. This is a required attribute.
     * @generated
     */
    public BindingConnectorAsUsageBuilder isOrdered( java.lang.Boolean value) {
        getBeingBuilt().setIsOrdered(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isPortion. This is a required attribute.
     * @generated
     */
    public BindingConnectorAsUsageBuilder isPortion( java.lang.Boolean value) {
        getBeingBuilt().setIsPortion(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isReadOnly. This is a required attribute.
     * @generated
     */
    public BindingConnectorAsUsageBuilder isReadOnly( java.lang.Boolean value) {
        getBeingBuilt().setIsReadOnly(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isUnique. This is a required attribute.
     * @generated
     */
    public BindingConnectorAsUsageBuilder isUnique( java.lang.Boolean value) {
        getBeingBuilt().setIsUnique(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isVariation. This is a required attribute.
     * @generated
     */
    public BindingConnectorAsUsageBuilder isVariation( java.lang.Boolean value) {
        getBeingBuilt().setIsVariation(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isImplied. This is a required attribute.
     * @generated
     */
    public BindingConnectorAsUsageBuilder isImplied( java.lang.Boolean value) {
        getBeingBuilt().setIsImplied(value);
        return this;
    }
    /**
      * @param value :The Element to set as ownedRelatedElement.
 
      * @generated
      */
    public BindingConnectorAsUsageBuilder ownedRelatedElement( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getOwnedRelatedElement().add(value);
      }
      return this;
    }
    /** 
     * @param values :The Element to set as owningRelatedElement.
     * @generated
     */
    public BindingConnectorAsUsageBuilder owningRelatedElement( org.eclipse.syson.sysml.Element value) {
        getBeingBuilt().setOwningRelatedElement(value);
        return this;
    }
    /**
      * @param value :The Element to set as source.
 
      * @generated
      */
    public BindingConnectorAsUsageBuilder source( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getSource().add(value);
      }
      return this;
    }
    /**
      * @param value :The Element to set as target.
 
      * @generated
      */
    public BindingConnectorAsUsageBuilder target( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getTarget().add(value);
      }
      return this;
    }
}
