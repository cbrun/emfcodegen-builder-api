package org.eclipse.syson.builder;

public class ReferenceSubsettingBuilder  extends SubsettingBuilder
{
   private org.eclipse.syson.sysml.ReferenceSubsetting beingBuilt = org.eclipse.syson.sysml.SysmlFactory.eINSTANCE
           .createReferenceSubsetting();
   /**
    * @generated
    */
     protected org.eclipse.syson.sysml.ReferenceSubsetting getBeingBuilt() {
           return this.beingBuilt;
       }
     
   /**
    * @generated
    */
     public org.eclipse.syson.sysml.ReferenceSubsetting build() {
           return this.getBeingBuilt();
       }

      /**
        * @param value :The EString to set as aliasIds. 
        * @generated
        */
      public ReferenceSubsettingBuilder aliasIds( java.lang.String ... values) {
      for (java.lang.String value : values) {
           getBeingBuilt().getAliasIds().add(value);
      }
      return this;
    }
      /** 
       * @param values :The EString to set as declaredName.
       * @generated
       */
      public ReferenceSubsettingBuilder declaredName( java.lang.String value) {
        getBeingBuilt().setDeclaredName(value);
        return this;
    }
      /** 
       * @param values :The EString to set as declaredShortName.
       * @generated
       */
      public ReferenceSubsettingBuilder declaredShortName( java.lang.String value) {
        getBeingBuilt().setDeclaredShortName(value);
        return this;
    }
      /** 
       * @param values :The EString to set as elementId.
       * @generated
       */
      public ReferenceSubsettingBuilder elementId( java.lang.String value) {
        getBeingBuilt().setElementId(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isImpliedIncluded.
       * @generated
       */
      public ReferenceSubsettingBuilder isImpliedIncluded( java.lang.Boolean value) {
        getBeingBuilt().setIsImpliedIncluded(value);
        return this;
    }
      /**
        * @param value :The Relationship to set as ownedRelationship. 
        * @generated
        */
      public ReferenceSubsettingBuilder ownedRelationship( org.eclipse.syson.sysml.Relationship ... values) {
      for (org.eclipse.syson.sysml.Relationship value : values) {
           getBeingBuilt().getOwnedRelationship().add(value);
      }
      return this;
    }
      /** 
       * @param values :The Relationship to set as owningRelationship.
       * @generated
       */
      public ReferenceSubsettingBuilder owningRelationship( org.eclipse.syson.sysml.Relationship value) {
        getBeingBuilt().setOwningRelationship(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isImplied.
       * @generated
       */
      public ReferenceSubsettingBuilder isImplied( java.lang.Boolean value) {
        getBeingBuilt().setIsImplied(value);
        return this;
    }
      /**
        * @param value :The Element to set as ownedRelatedElement. 
        * @generated
        */
      public ReferenceSubsettingBuilder ownedRelatedElement( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getOwnedRelatedElement().add(value);
      }
      return this;
    }
      /** 
       * @param values :The Element to set as owningRelatedElement.
       * @generated
       */
      public ReferenceSubsettingBuilder owningRelatedElement( org.eclipse.syson.sysml.Element value) {
        getBeingBuilt().setOwningRelatedElement(value);
        return this;
    }
      /**
        * @param value :The Element to set as source. 
        * @generated
        */
      public ReferenceSubsettingBuilder source( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getSource().add(value);
      }
      return this;
    }
      /**
        * @param value :The Element to set as target. 
        * @generated
        */
      public ReferenceSubsettingBuilder target( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getTarget().add(value);
      }
      return this;
    }
      /** 
       * @param values :The Type to set as general.
       * @generated
       */
      public ReferenceSubsettingBuilder general( org.eclipse.syson.sysml.Type value) {
        getBeingBuilt().setGeneral(value);
        return this;
    }
      /** 
       * @param values :The Type to set as specific.
       * @generated
       */
      public ReferenceSubsettingBuilder specific( org.eclipse.syson.sysml.Type value) {
        getBeingBuilt().setSpecific(value);
        return this;
    }
      /** 
       * @param values :The Feature to set as subsettedFeature.
       * @generated
       */
      public ReferenceSubsettingBuilder subsettedFeature( org.eclipse.syson.sysml.Feature value) {
        getBeingBuilt().setSubsettedFeature(value);
        return this;
    }
      /** 
       * @param values :The Feature to set as subsettingFeature.
       * @generated
       */
      public ReferenceSubsettingBuilder subsettingFeature( org.eclipse.syson.sysml.Feature value) {
        getBeingBuilt().setSubsettingFeature(value);
        return this;
    }
      /** 
       * @param values :The Feature to set as referencedFeature.
       * @generated
       */
      public ReferenceSubsettingBuilder referencedFeature( org.eclipse.syson.sysml.Feature value) {
        getBeingBuilt().setReferencedFeature(value);
        return this;
    }

}
