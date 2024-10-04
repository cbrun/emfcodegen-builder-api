package org.eclipse.syson.builder;

public class RedefinitionBuilder  extends SubsettingBuilder
{
   private org.eclipse.syson.sysml.Redefinition beingBuilt = org.eclipse.syson.sysml.SysmlFactory.eINSTANCE
           .createRedefinition();
   /**
    * @generated
    */
     protected org.eclipse.syson.sysml.Redefinition getBeingBuilt() {
           return this.beingBuilt;
       }
     
   /**
    * @generated
    */
     public org.eclipse.syson.sysml.Redefinition build() {
           return this.getBeingBuilt();
       }

      /**
        * @param value :The EString to set as aliasIds. 
        * @generated
        */
      public RedefinitionBuilder aliasIds( java.lang.String ... values) {
      for (java.lang.String value : values) {
           getBeingBuilt().getAliasIds().add(value);
      }
      return this;
    }
      /** 
       * @param values :The EString to set as declaredName.
       * @generated
       */
      public RedefinitionBuilder declaredName( java.lang.String value) {
        getBeingBuilt().setDeclaredName(value);
        return this;
    }
      /** 
       * @param values :The EString to set as declaredShortName.
       * @generated
       */
      public RedefinitionBuilder declaredShortName( java.lang.String value) {
        getBeingBuilt().setDeclaredShortName(value);
        return this;
    }
      /** 
       * @param values :The EString to set as elementId.
       * @generated
       */
      public RedefinitionBuilder elementId( java.lang.String value) {
        getBeingBuilt().setElementId(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isImpliedIncluded.
       * @generated
       */
      public RedefinitionBuilder isImpliedIncluded( java.lang.Boolean value) {
        getBeingBuilt().setIsImpliedIncluded(value);
        return this;
    }
      /**
        * @param value :The Relationship to set as ownedRelationship. 
        * @generated
        */
      public RedefinitionBuilder ownedRelationship( org.eclipse.syson.sysml.Relationship ... values) {
      for (org.eclipse.syson.sysml.Relationship value : values) {
           getBeingBuilt().getOwnedRelationship().add(value);
      }
      return this;
    }
      /** 
       * @param values :The Relationship to set as owningRelationship.
       * @generated
       */
      public RedefinitionBuilder owningRelationship( org.eclipse.syson.sysml.Relationship value) {
        getBeingBuilt().setOwningRelationship(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isImplied.
       * @generated
       */
      public RedefinitionBuilder isImplied( java.lang.Boolean value) {
        getBeingBuilt().setIsImplied(value);
        return this;
    }
      /**
        * @param value :The Element to set as ownedRelatedElement. 
        * @generated
        */
      public RedefinitionBuilder ownedRelatedElement( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getOwnedRelatedElement().add(value);
      }
      return this;
    }
      /** 
       * @param values :The Element to set as owningRelatedElement.
       * @generated
       */
      public RedefinitionBuilder owningRelatedElement( org.eclipse.syson.sysml.Element value) {
        getBeingBuilt().setOwningRelatedElement(value);
        return this;
    }
      /**
        * @param value :The Element to set as source. 
        * @generated
        */
      public RedefinitionBuilder source( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getSource().add(value);
      }
      return this;
    }
      /**
        * @param value :The Element to set as target. 
        * @generated
        */
      public RedefinitionBuilder target( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getTarget().add(value);
      }
      return this;
    }
      /** 
       * @param values :The Type to set as general.
       * @generated
       */
      public RedefinitionBuilder general( org.eclipse.syson.sysml.Type value) {
        getBeingBuilt().setGeneral(value);
        return this;
    }
      /** 
       * @param values :The Type to set as specific.
       * @generated
       */
      public RedefinitionBuilder specific( org.eclipse.syson.sysml.Type value) {
        getBeingBuilt().setSpecific(value);
        return this;
    }
      /** 
       * @param values :The Feature to set as subsettedFeature.
       * @generated
       */
      public RedefinitionBuilder subsettedFeature( org.eclipse.syson.sysml.Feature value) {
        getBeingBuilt().setSubsettedFeature(value);
        return this;
    }
      /** 
       * @param values :The Feature to set as subsettingFeature.
       * @generated
       */
      public RedefinitionBuilder subsettingFeature( org.eclipse.syson.sysml.Feature value) {
        getBeingBuilt().setSubsettingFeature(value);
        return this;
    }
      /** 
       * @param values :The Feature to set as redefinedFeature.
       * @generated
       */
      public RedefinitionBuilder redefinedFeature( org.eclipse.syson.sysml.Feature value) {
        getBeingBuilt().setRedefinedFeature(value);
        return this;
    }
      /** 
       * @param values :The Feature to set as redefiningFeature.
       * @generated
       */
      public RedefinitionBuilder redefiningFeature( org.eclipse.syson.sysml.Feature value) {
        getBeingBuilt().setRedefiningFeature(value);
        return this;
    }

}
