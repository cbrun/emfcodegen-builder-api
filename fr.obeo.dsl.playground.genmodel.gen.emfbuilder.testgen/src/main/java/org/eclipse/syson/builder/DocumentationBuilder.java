package org.eclipse.syson.builder;

public class DocumentationBuilder  extends CommentBuilder
{
   private org.eclipse.syson.sysml.Documentation beingBuilt = org.eclipse.syson.sysml.SysmlFactory.eINSTANCE
           .createDocumentation();
   /**
    * @generated
    */
     protected org.eclipse.syson.sysml.Documentation getBeingBuilt() {
           return this.beingBuilt;
       }
     
   /**
    * @generated
    */
     public org.eclipse.syson.sysml.Documentation build() {
           return this.getBeingBuilt();
       }

      /**
        * @param value :The EString to set as aliasIds. 
        * @generated
        */
      public DocumentationBuilder aliasIds( java.lang.String ... values) {
      for (java.lang.String value : values) {
           getBeingBuilt().getAliasIds().add(value);
      }
      return this;
    }
      /** 
       * @param values :The EString to set as declaredName.
       * @generated
       */
      public DocumentationBuilder declaredName( java.lang.String value) {
        getBeingBuilt().setDeclaredName(value);
        return this;
    }
      /** 
       * @param values :The EString to set as declaredShortName.
       * @generated
       */
      public DocumentationBuilder declaredShortName( java.lang.String value) {
        getBeingBuilt().setDeclaredShortName(value);
        return this;
    }
      /** 
       * @param values :The EString to set as elementId.
       * @generated
       */
      public DocumentationBuilder elementId( java.lang.String value) {
        getBeingBuilt().setElementId(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isImpliedIncluded.
       * @generated
       */
      public DocumentationBuilder isImpliedIncluded( java.lang.Boolean value) {
        getBeingBuilt().setIsImpliedIncluded(value);
        return this;
    }
      /**
        * @param value :The Relationship to set as ownedRelationship. 
        * @generated
        */
      public DocumentationBuilder ownedRelationship( org.eclipse.syson.sysml.Relationship ... values) {
      for (org.eclipse.syson.sysml.Relationship value : values) {
           getBeingBuilt().getOwnedRelationship().add(value);
      }
      return this;
    }
      /** 
       * @param values :The Relationship to set as owningRelationship.
       * @generated
       */
      public DocumentationBuilder owningRelationship( org.eclipse.syson.sysml.Relationship value) {
        getBeingBuilt().setOwningRelationship(value);
        return this;
    }
      /**
        * @param value :The Annotation to set as annotation. 
        * @generated
        */
      public DocumentationBuilder annotation( org.eclipse.syson.sysml.Annotation ... values) {
      for (org.eclipse.syson.sysml.Annotation value : values) {
           getBeingBuilt().getAnnotation().add(value);
      }
      return this;
    }
      /** 
       * @param values :The EString to set as body.
       * @generated
       */
      public DocumentationBuilder body( java.lang.String value) {
        getBeingBuilt().setBody(value);
        return this;
    }
      /** 
       * @param values :The EString to set as locale.
       * @generated
       */
      public DocumentationBuilder locale( java.lang.String value) {
        getBeingBuilt().setLocale(value);
        return this;
    }

}
