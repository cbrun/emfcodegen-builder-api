package org.eclipse.syson.builder;

public class ConjugatedPortTypingBuilder  extends FeatureTypingBuilder
{
   private org.eclipse.syson.sysml.ConjugatedPortTyping beingBuilt = org.eclipse.syson.sysml.SysmlFactory.eINSTANCE
           .createConjugatedPortTyping();
   /**
    * @generated
    */
     protected org.eclipse.syson.sysml.ConjugatedPortTyping getBeingBuilt() {
           return this.beingBuilt;
       }
     
   /**
    * @generated
    */
     public org.eclipse.syson.sysml.ConjugatedPortTyping build() {
           return this.getBeingBuilt();
       }

      /**
        * @param value :The EString to set as aliasIds. 
        * @generated
        */
      public ConjugatedPortTypingBuilder aliasIds( java.lang.String ... values) {
      for (java.lang.String value : values) {
           getBeingBuilt().getAliasIds().add(value);
      }
      return this;
    }
      /** 
       * @param values :The EString to set as declaredName.
       * @generated
       */
      public ConjugatedPortTypingBuilder declaredName( java.lang.String value) {
        getBeingBuilt().setDeclaredName(value);
        return this;
    }
      /** 
       * @param values :The EString to set as declaredShortName.
       * @generated
       */
      public ConjugatedPortTypingBuilder declaredShortName( java.lang.String value) {
        getBeingBuilt().setDeclaredShortName(value);
        return this;
    }
      /** 
       * @param values :The EString to set as elementId.
       * @generated
       */
      public ConjugatedPortTypingBuilder elementId( java.lang.String value) {
        getBeingBuilt().setElementId(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isImpliedIncluded.
       * @generated
       */
      public ConjugatedPortTypingBuilder isImpliedIncluded( java.lang.Boolean value) {
        getBeingBuilt().setIsImpliedIncluded(value);
        return this;
    }
      /**
        * @param value :The Relationship to set as ownedRelationship. 
        * @generated
        */
      public ConjugatedPortTypingBuilder ownedRelationship( org.eclipse.syson.sysml.Relationship ... values) {
      for (org.eclipse.syson.sysml.Relationship value : values) {
           getBeingBuilt().getOwnedRelationship().add(value);
      }
      return this;
    }
      /** 
       * @param values :The Relationship to set as owningRelationship.
       * @generated
       */
      public ConjugatedPortTypingBuilder owningRelationship( org.eclipse.syson.sysml.Relationship value) {
        getBeingBuilt().setOwningRelationship(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isImplied.
       * @generated
       */
      public ConjugatedPortTypingBuilder isImplied( java.lang.Boolean value) {
        getBeingBuilt().setIsImplied(value);
        return this;
    }
      /**
        * @param value :The Element to set as ownedRelatedElement. 
        * @generated
        */
      public ConjugatedPortTypingBuilder ownedRelatedElement( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getOwnedRelatedElement().add(value);
      }
      return this;
    }
      /** 
       * @param values :The Element to set as owningRelatedElement.
       * @generated
       */
      public ConjugatedPortTypingBuilder owningRelatedElement( org.eclipse.syson.sysml.Element value) {
        getBeingBuilt().setOwningRelatedElement(value);
        return this;
    }
      /**
        * @param value :The Element to set as source. 
        * @generated
        */
      public ConjugatedPortTypingBuilder source( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getSource().add(value);
      }
      return this;
    }
      /**
        * @param value :The Element to set as target. 
        * @generated
        */
      public ConjugatedPortTypingBuilder target( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getTarget().add(value);
      }
      return this;
    }
      /** 
       * @param values :The Type to set as general.
       * @generated
       */
      public ConjugatedPortTypingBuilder general( org.eclipse.syson.sysml.Type value) {
        getBeingBuilt().setGeneral(value);
        return this;
    }
      /** 
       * @param values :The Type to set as specific.
       * @generated
       */
      public ConjugatedPortTypingBuilder specific( org.eclipse.syson.sysml.Type value) {
        getBeingBuilt().setSpecific(value);
        return this;
    }
      /** 
       * @param values :The Type to set as type.
       * @generated
       */
      public ConjugatedPortTypingBuilder type( org.eclipse.syson.sysml.Type value) {
        getBeingBuilt().setType(value);
        return this;
    }
      /** 
       * @param values :The Feature to set as typedFeature.
       * @generated
       */
      public ConjugatedPortTypingBuilder typedFeature( org.eclipse.syson.sysml.Feature value) {
        getBeingBuilt().setTypedFeature(value);
        return this;
    }
      /** 
       * @param values :The ConjugatedPortDefinition to set as conjugatedPortDefinition.
       * @generated
       */
      public ConjugatedPortTypingBuilder conjugatedPortDefinition( org.eclipse.syson.sysml.ConjugatedPortDefinition value) {
        getBeingBuilt().setConjugatedPortDefinition(value);
        return this;
    }

}
