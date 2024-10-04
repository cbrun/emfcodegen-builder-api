package org.eclipse.syson.builder;

/**
 *  A builder for the {@link ActionDefinition}  type.
 */
  public class ActionDefinitionBuilder  extends OccurrenceDefinitionBuilder
  {
  
     private org.eclipse.syson.sysml.ActionDefinition beingBuilt = org.eclipse.syson.sysml.SysmlFactory.eINSTANCE
             .createActionDefinition();
      /**
       * @generated
       */
       protected org.eclipse.syson.sysml.ActionDefinition getBeingBuilt() {
           return this.beingBuilt;
       }
       
      /**
       * @generated
       */
       public org.eclipse.syson.sysml.ActionDefinition build() {
           return this.getBeingBuilt();
       }

    /**
      * @param value :The EString to set as aliasIds.
 
      * @generated
      */
    public ActionDefinitionBuilder aliasIds( java.lang.String ... values) {
      for (java.lang.String value : values) {
           getBeingBuilt().getAliasIds().add(value);
      }
      return this;
    }
    /** 
     * @param values :The EString to set as declaredName.
     * @generated
     */
    public ActionDefinitionBuilder declaredName( java.lang.String value) {
        getBeingBuilt().setDeclaredName(value);
        return this;
    }
    /** 
     * @param values :The EString to set as declaredShortName.
     * @generated
     */
    public ActionDefinitionBuilder declaredShortName( java.lang.String value) {
        getBeingBuilt().setDeclaredShortName(value);
        return this;
    }
    /** 
     * @param values :The EString to set as elementId. This is a <b>required</b> attribute.
     * @generated
     */
    public ActionDefinitionBuilder elementId( java.lang.String value) {
        getBeingBuilt().setElementId(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isImpliedIncluded. This is a <b>required</b> attribute.
     * @generated
     */
    public ActionDefinitionBuilder isImpliedIncluded( java.lang.Boolean value) {
        getBeingBuilt().setIsImpliedIncluded(value);
        return this;
    }
    /**
      * @param value :The Relationship to set as ownedRelationship.
 
      * @generated
      */
    public ActionDefinitionBuilder ownedRelationship( org.eclipse.syson.sysml.Relationship ... values) {
      for (org.eclipse.syson.sysml.Relationship value : values) {
           getBeingBuilt().getOwnedRelationship().add(value);
      }
      return this;
    }
    /** 
     * @param values :The Relationship to set as owningRelationship.
     * @generated
     */
    public ActionDefinitionBuilder owningRelationship( org.eclipse.syson.sysml.Relationship value) {
        getBeingBuilt().setOwningRelationship(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isAbstract. This is a <b>required</b> attribute.
     * @generated
     */
    public ActionDefinitionBuilder isAbstract( java.lang.Boolean value) {
        getBeingBuilt().setIsAbstract(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isSufficient. This is a <b>required</b> attribute.
     * @generated
     */
    public ActionDefinitionBuilder isSufficient( java.lang.Boolean value) {
        getBeingBuilt().setIsSufficient(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isVariation. This is a <b>required</b> attribute.
     * @generated
     */
    public ActionDefinitionBuilder isVariation( java.lang.Boolean value) {
        getBeingBuilt().setIsVariation(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isIndividual. This is a <b>required</b> attribute.
     * @generated
     */
    public ActionDefinitionBuilder isIndividual( java.lang.Boolean value) {
        getBeingBuilt().setIsIndividual(value);
        return this;
    }
}
