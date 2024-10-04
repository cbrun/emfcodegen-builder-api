package org.eclipse.syson.builder;

/**
 *  A builder for the {@link CaseDefinition}  type.
 */
  public class CaseDefinitionBuilder  extends CalculationDefinitionBuilder
  {
  
     private org.eclipse.syson.sysml.CaseDefinition beingBuilt = org.eclipse.syson.sysml.SysmlFactory.eINSTANCE
             .createCaseDefinition();
      /**
       * @generated
       */
       protected org.eclipse.syson.sysml.CaseDefinition getBeingBuilt() {
           return this.beingBuilt;
       }
       
      /**
       * @generated
       */
       public org.eclipse.syson.sysml.CaseDefinition build() {
           return this.getBeingBuilt();
       }

    /**
      * @param value :The EString to set as aliasIds.
 
      * @generated
      */
    public CaseDefinitionBuilder aliasIds( java.lang.String ... values) {
      for (java.lang.String value : values) {
           getBeingBuilt().getAliasIds().add(value);
      }
      return this;
    }
    /** 
     * @param values :The EString to set as declaredName.
     * @generated
     */
    public CaseDefinitionBuilder declaredName( java.lang.String value) {
        getBeingBuilt().setDeclaredName(value);
        return this;
    }
    /** 
     * @param values :The EString to set as declaredShortName.
     * @generated
     */
    public CaseDefinitionBuilder declaredShortName( java.lang.String value) {
        getBeingBuilt().setDeclaredShortName(value);
        return this;
    }
    /** 
     * @param values :The EString to set as elementId. This is a required attribute.
     * @generated
     */
    public CaseDefinitionBuilder elementId( java.lang.String value) {
        getBeingBuilt().setElementId(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isImpliedIncluded. This is a required attribute.
     * @generated
     */
    public CaseDefinitionBuilder isImpliedIncluded( java.lang.Boolean value) {
        getBeingBuilt().setIsImpliedIncluded(value);
        return this;
    }
    /**
      * @param value :The Relationship to set as ownedRelationship.
 
      * @generated
      */
    public CaseDefinitionBuilder ownedRelationship( org.eclipse.syson.sysml.Relationship ... values) {
      for (org.eclipse.syson.sysml.Relationship value : values) {
           getBeingBuilt().getOwnedRelationship().add(value);
      }
      return this;
    }
    /** 
     * @param values :The Relationship to set as owningRelationship.
     * @generated
     */
    public CaseDefinitionBuilder owningRelationship( org.eclipse.syson.sysml.Relationship value) {
        getBeingBuilt().setOwningRelationship(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isAbstract. This is a required attribute.
     * @generated
     */
    public CaseDefinitionBuilder isAbstract( java.lang.Boolean value) {
        getBeingBuilt().setIsAbstract(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isSufficient. This is a required attribute.
     * @generated
     */
    public CaseDefinitionBuilder isSufficient( java.lang.Boolean value) {
        getBeingBuilt().setIsSufficient(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isVariation. This is a required attribute.
     * @generated
     */
    public CaseDefinitionBuilder isVariation( java.lang.Boolean value) {
        getBeingBuilt().setIsVariation(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isIndividual. This is a required attribute.
     * @generated
     */
    public CaseDefinitionBuilder isIndividual( java.lang.Boolean value) {
        getBeingBuilt().setIsIndividual(value);
        return this;
    }
}
