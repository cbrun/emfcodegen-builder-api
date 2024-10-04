package org.eclipse.syson.builder;

public class ConjugationBuilder  extends RelationshipBuilder
{
   private org.eclipse.syson.sysml.Conjugation beingBuilt = org.eclipse.syson.sysml.SysmlFactory.eINSTANCE
           .createConjugation();
   /**
    * @generated
    */
     protected org.eclipse.syson.sysml.Conjugation getBeingBuilt() {
           return this.beingBuilt;
       }
     
   /**
    * @generated
    */
     public org.eclipse.syson.sysml.Conjugation build() {
           return this.getBeingBuilt();
       }

      /**
        * @param value :The EString to set as aliasIds. 
        * @generated
        */
      public ConjugationBuilder aliasIds( java.lang.String ... values) {
      for (java.lang.String value : values) {
           getBeingBuilt().getAliasIds().add(value);
      }
      return this;
    }
      /** 
       * @param values :The EString to set as declaredName.
       * @generated
       */
      public ConjugationBuilder declaredName( java.lang.String value) {
        getBeingBuilt().setDeclaredName(value);
        return this;
    }
      /** 
       * @param values :The EString to set as declaredShortName.
       * @generated
       */
      public ConjugationBuilder declaredShortName( java.lang.String value) {
        getBeingBuilt().setDeclaredShortName(value);
        return this;
    }
      /** 
       * @param values :The EString to set as elementId.
       * @generated
       */
      public ConjugationBuilder elementId( java.lang.String value) {
        getBeingBuilt().setElementId(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isImpliedIncluded.
       * @generated
       */
      public ConjugationBuilder isImpliedIncluded( java.lang.Boolean value) {
        getBeingBuilt().setIsImpliedIncluded(value);
        return this;
    }
      /**
        * @param value :The Relationship to set as ownedRelationship. 
        * @generated
        */
      public ConjugationBuilder ownedRelationship( org.eclipse.syson.sysml.Relationship ... values) {
      for (org.eclipse.syson.sysml.Relationship value : values) {
           getBeingBuilt().getOwnedRelationship().add(value);
      }
      return this;
    }
      /** 
       * @param values :The Relationship to set as owningRelationship.
       * @generated
       */
      public ConjugationBuilder owningRelationship( org.eclipse.syson.sysml.Relationship value) {
        getBeingBuilt().setOwningRelationship(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isImplied.
       * @generated
       */
      public ConjugationBuilder isImplied( java.lang.Boolean value) {
        getBeingBuilt().setIsImplied(value);
        return this;
    }
      /**
        * @param value :The Element to set as ownedRelatedElement. 
        * @generated
        */
      public ConjugationBuilder ownedRelatedElement( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getOwnedRelatedElement().add(value);
      }
      return this;
    }
      /** 
       * @param values :The Element to set as owningRelatedElement.
       * @generated
       */
      public ConjugationBuilder owningRelatedElement( org.eclipse.syson.sysml.Element value) {
        getBeingBuilt().setOwningRelatedElement(value);
        return this;
    }
      /**
        * @param value :The Element to set as source. 
        * @generated
        */
      public ConjugationBuilder source( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getSource().add(value);
      }
      return this;
    }
      /**
        * @param value :The Element to set as target. 
        * @generated
        */
      public ConjugationBuilder target( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getTarget().add(value);
      }
      return this;
    }
      /** 
       * @param values :The Type to set as conjugatedType.
       * @generated
       */
      public ConjugationBuilder conjugatedType( org.eclipse.syson.sysml.Type value) {
        getBeingBuilt().setConjugatedType(value);
        return this;
    }
      /** 
       * @param values :The Type to set as originalType.
       * @generated
       */
      public ConjugationBuilder originalType( org.eclipse.syson.sysml.Type value) {
        getBeingBuilt().setOriginalType(value);
        return this;
    }

}
