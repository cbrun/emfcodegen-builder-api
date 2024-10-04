package org.eclipse.syson.builder;

public class ConcernDefinitionBuilder  extends RequirementDefinitionBuilder
{
   private org.eclipse.syson.sysml.ConcernDefinition beingBuilt = org.eclipse.syson.sysml.SysmlFactory.eINSTANCE
           .createConcernDefinition();
   /**
    * @generated
    */
     protected org.eclipse.syson.sysml.ConcernDefinition getBeingBuilt() {
           return this.beingBuilt;
       }
     
   /**
    * @generated
    */
     public org.eclipse.syson.sysml.ConcernDefinition build() {
           return this.getBeingBuilt();
       }

      /**
        * @param value :The EString to set as aliasIds. 
        * @generated
        */
      public ConcernDefinitionBuilder aliasIds( java.lang.String ... values) {
      for (java.lang.String value : values) {
           getBeingBuilt().getAliasIds().add(value);
      }
      return this;
    }
      /** 
       * @param values :The EString to set as declaredName.
       * @generated
       */
      public ConcernDefinitionBuilder declaredName( java.lang.String value) {
        getBeingBuilt().setDeclaredName(value);
        return this;
    }
      /** 
       * @param values :The EString to set as declaredShortName.
       * @generated
       */
      public ConcernDefinitionBuilder declaredShortName( java.lang.String value) {
        getBeingBuilt().setDeclaredShortName(value);
        return this;
    }
      /** 
       * @param values :The EString to set as elementId.
       * @generated
       */
      public ConcernDefinitionBuilder elementId( java.lang.String value) {
        getBeingBuilt().setElementId(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isImpliedIncluded.
       * @generated
       */
      public ConcernDefinitionBuilder isImpliedIncluded( java.lang.Boolean value) {
        getBeingBuilt().setIsImpliedIncluded(value);
        return this;
    }
      /**
        * @param value :The Relationship to set as ownedRelationship. 
        * @generated
        */
      public ConcernDefinitionBuilder ownedRelationship( org.eclipse.syson.sysml.Relationship ... values) {
      for (org.eclipse.syson.sysml.Relationship value : values) {
           getBeingBuilt().getOwnedRelationship().add(value);
      }
      return this;
    }
      /** 
       * @param values :The Relationship to set as owningRelationship.
       * @generated
       */
      public ConcernDefinitionBuilder owningRelationship( org.eclipse.syson.sysml.Relationship value) {
        getBeingBuilt().setOwningRelationship(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isAbstract.
       * @generated
       */
      public ConcernDefinitionBuilder isAbstract( java.lang.Boolean value) {
        getBeingBuilt().setIsAbstract(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isSufficient.
       * @generated
       */
      public ConcernDefinitionBuilder isSufficient( java.lang.Boolean value) {
        getBeingBuilt().setIsSufficient(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isVariation.
       * @generated
       */
      public ConcernDefinitionBuilder isVariation( java.lang.Boolean value) {
        getBeingBuilt().setIsVariation(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isIndividual.
       * @generated
       */
      public ConcernDefinitionBuilder isIndividual( java.lang.Boolean value) {
        getBeingBuilt().setIsIndividual(value);
        return this;
    }
      /** 
       * @param values :The EString to set as reqId.
       * @generated
       */
      public ConcernDefinitionBuilder reqId( java.lang.String value) {
        getBeingBuilt().setReqId(value);
        return this;
    }

}
