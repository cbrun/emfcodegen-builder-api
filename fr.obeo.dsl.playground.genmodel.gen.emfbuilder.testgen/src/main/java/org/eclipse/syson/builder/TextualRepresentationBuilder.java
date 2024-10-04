package org.eclipse.syson.builder;

public class TextualRepresentationBuilder  extends AnnotatingElementBuilder
{
   private org.eclipse.syson.sysml.TextualRepresentation beingBuilt = org.eclipse.syson.sysml.SysmlFactory.eINSTANCE
           .createTextualRepresentation();
   /**
    * @generated
    */
     protected org.eclipse.syson.sysml.TextualRepresentation getBeingBuilt() {
           return this.beingBuilt;
       }
     
   /**
    * @generated
    */
     public org.eclipse.syson.sysml.TextualRepresentation build() {
           return this.getBeingBuilt();
       }

      /**
        * @param value :The EString to set as aliasIds. 
        * @generated
        */
      public TextualRepresentationBuilder aliasIds( java.lang.String ... values) {
      for (java.lang.String value : values) {
           getBeingBuilt().getAliasIds().add(value);
      }
      return this;
    }
      /** 
       * @param values :The EString to set as declaredName.
       * @generated
       */
      public TextualRepresentationBuilder declaredName( java.lang.String value) {
        getBeingBuilt().setDeclaredName(value);
        return this;
    }
      /** 
       * @param values :The EString to set as declaredShortName.
       * @generated
       */
      public TextualRepresentationBuilder declaredShortName( java.lang.String value) {
        getBeingBuilt().setDeclaredShortName(value);
        return this;
    }
      /** 
       * @param values :The EString to set as elementId.
       * @generated
       */
      public TextualRepresentationBuilder elementId( java.lang.String value) {
        getBeingBuilt().setElementId(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isImpliedIncluded.
       * @generated
       */
      public TextualRepresentationBuilder isImpliedIncluded( java.lang.Boolean value) {
        getBeingBuilt().setIsImpliedIncluded(value);
        return this;
    }
      /**
        * @param value :The Relationship to set as ownedRelationship. 
        * @generated
        */
      public TextualRepresentationBuilder ownedRelationship( org.eclipse.syson.sysml.Relationship ... values) {
      for (org.eclipse.syson.sysml.Relationship value : values) {
           getBeingBuilt().getOwnedRelationship().add(value);
      }
      return this;
    }
      /** 
       * @param values :The Relationship to set as owningRelationship.
       * @generated
       */
      public TextualRepresentationBuilder owningRelationship( org.eclipse.syson.sysml.Relationship value) {
        getBeingBuilt().setOwningRelationship(value);
        return this;
    }
      /**
        * @param value :The Annotation to set as annotation. 
        * @generated
        */
      public TextualRepresentationBuilder annotation( org.eclipse.syson.sysml.Annotation ... values) {
      for (org.eclipse.syson.sysml.Annotation value : values) {
           getBeingBuilt().getAnnotation().add(value);
      }
      return this;
    }
      /** 
       * @param values :The EString to set as body.
       * @generated
       */
      public TextualRepresentationBuilder body( java.lang.String value) {
        getBeingBuilt().setBody(value);
        return this;
    }
      /** 
       * @param values :The EString to set as language.
       * @generated
       */
      public TextualRepresentationBuilder language( java.lang.String value) {
        getBeingBuilt().setLanguage(value);
        return this;
    }

}
