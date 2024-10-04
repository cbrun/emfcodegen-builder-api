package org.eclipse.syson.builder;

public class SubsettingBuilder  extends SpecializationBuilder
{
   private org.eclipse.syson.sysml.Subsetting beingBuilt = org.eclipse.syson.sysml.SysmlFactory.eINSTANCE
           .createSubsetting();
   /**
    * @generated
    */
     protected org.eclipse.syson.sysml.Subsetting getBeingBuilt() {
           return this.beingBuilt;
       }
     
   /**
    * @generated
    */
     public org.eclipse.syson.sysml.Subsetting build() {
           return this.getBeingBuilt();
       }

      /**
        * @param value :The EString to set as aliasIds. 
        * @generated
        */
      public SubsettingBuilder aliasIds( java.lang.String ... values) {
      for (java.lang.String value : values) {
           getBeingBuilt().getAliasIds().add(value);
      }
      return this;
    }
      /** 
       * @param values :The EString to set as declaredName.
       * @generated
       */
      public SubsettingBuilder declaredName( java.lang.String value) {
        getBeingBuilt().setDeclaredName(value);
        return this;
    }
      /** 
       * @param values :The EString to set as declaredShortName.
       * @generated
       */
      public SubsettingBuilder declaredShortName( java.lang.String value) {
        getBeingBuilt().setDeclaredShortName(value);
        return this;
    }
      /** 
       * @param values :The EString to set as elementId.
       * @generated
       */
      public SubsettingBuilder elementId( java.lang.String value) {
        getBeingBuilt().setElementId(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isImpliedIncluded.
       * @generated
       */
      public SubsettingBuilder isImpliedIncluded( java.lang.Boolean value) {
        getBeingBuilt().setIsImpliedIncluded(value);
        return this;
    }
      /**
        * @param value :The Relationship to set as ownedRelationship. 
        * @generated
        */
      public SubsettingBuilder ownedRelationship( org.eclipse.syson.sysml.Relationship ... values) {
      for (org.eclipse.syson.sysml.Relationship value : values) {
           getBeingBuilt().getOwnedRelationship().add(value);
      }
      return this;
    }
      /** 
       * @param values :The Relationship to set as owningRelationship.
       * @generated
       */
      public SubsettingBuilder owningRelationship( org.eclipse.syson.sysml.Relationship value) {
        getBeingBuilt().setOwningRelationship(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isImplied.
       * @generated
       */
      public SubsettingBuilder isImplied( java.lang.Boolean value) {
        getBeingBuilt().setIsImplied(value);
        return this;
    }
      /**
        * @param value :The Element to set as ownedRelatedElement. 
        * @generated
        */
      public SubsettingBuilder ownedRelatedElement( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getOwnedRelatedElement().add(value);
      }
      return this;
    }
      /** 
       * @param values :The Element to set as owningRelatedElement.
       * @generated
       */
      public SubsettingBuilder owningRelatedElement( org.eclipse.syson.sysml.Element value) {
        getBeingBuilt().setOwningRelatedElement(value);
        return this;
    }
      /**
        * @param value :The Element to set as source. 
        * @generated
        */
      public SubsettingBuilder source( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getSource().add(value);
      }
      return this;
    }
      /**
        * @param value :The Element to set as target. 
        * @generated
        */
      public SubsettingBuilder target( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getTarget().add(value);
      }
      return this;
    }
      /** 
       * @param values :The Type to set as general.
       * @generated
       */
      public SubsettingBuilder general( org.eclipse.syson.sysml.Type value) {
        getBeingBuilt().setGeneral(value);
        return this;
    }
      /** 
       * @param values :The Type to set as specific.
       * @generated
       */
      public SubsettingBuilder specific( org.eclipse.syson.sysml.Type value) {
        getBeingBuilt().setSpecific(value);
        return this;
    }
      /** 
       * @param values :The Feature to set as subsettedFeature.
       * @generated
       */
      public SubsettingBuilder subsettedFeature( org.eclipse.syson.sysml.Feature value) {
        getBeingBuilt().setSubsettedFeature(value);
        return this;
    }
      /** 
       * @param values :The Feature to set as subsettingFeature.
       * @generated
       */
      public SubsettingBuilder subsettingFeature( org.eclipse.syson.sysml.Feature value) {
        getBeingBuilt().setSubsettingFeature(value);
        return this;
    }

}
