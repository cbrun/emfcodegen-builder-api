package org.eclipse.syson.builder;

public class SubclassificationBuilder  extends SpecializationBuilder
{
   private org.eclipse.syson.sysml.Subclassification beingBuilt = org.eclipse.syson.sysml.SysmlFactory.eINSTANCE
           .createSubclassification();
   /**
    * @generated
    */
     protected org.eclipse.syson.sysml.Subclassification getBeingBuilt() {
           return this.beingBuilt;
       }
     
   /**
    * @generated
    */
     public org.eclipse.syson.sysml.Subclassification build() {
           return this.getBeingBuilt();
       }

      /**
        * @param value :The EString to set as aliasIds. 
        * @generated
        */
      public SubclassificationBuilder aliasIds( java.lang.String ... values) {
      for (java.lang.String value : values) {
           getBeingBuilt().getAliasIds().add(value);
      }
      return this;
    }
      /** 
       * @param values :The EString to set as declaredName.
       * @generated
       */
      public SubclassificationBuilder declaredName( java.lang.String value) {
        getBeingBuilt().setDeclaredName(value);
        return this;
    }
      /** 
       * @param values :The EString to set as declaredShortName.
       * @generated
       */
      public SubclassificationBuilder declaredShortName( java.lang.String value) {
        getBeingBuilt().setDeclaredShortName(value);
        return this;
    }
      /** 
       * @param values :The EString to set as elementId.
       * @generated
       */
      public SubclassificationBuilder elementId( java.lang.String value) {
        getBeingBuilt().setElementId(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isImpliedIncluded.
       * @generated
       */
      public SubclassificationBuilder isImpliedIncluded( java.lang.Boolean value) {
        getBeingBuilt().setIsImpliedIncluded(value);
        return this;
    }
      /**
        * @param value :The Relationship to set as ownedRelationship. 
        * @generated
        */
      public SubclassificationBuilder ownedRelationship( org.eclipse.syson.sysml.Relationship ... values) {
      for (org.eclipse.syson.sysml.Relationship value : values) {
           getBeingBuilt().getOwnedRelationship().add(value);
      }
      return this;
    }
      /** 
       * @param values :The Relationship to set as owningRelationship.
       * @generated
       */
      public SubclassificationBuilder owningRelationship( org.eclipse.syson.sysml.Relationship value) {
        getBeingBuilt().setOwningRelationship(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isImplied.
       * @generated
       */
      public SubclassificationBuilder isImplied( java.lang.Boolean value) {
        getBeingBuilt().setIsImplied(value);
        return this;
    }
      /**
        * @param value :The Element to set as ownedRelatedElement. 
        * @generated
        */
      public SubclassificationBuilder ownedRelatedElement( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getOwnedRelatedElement().add(value);
      }
      return this;
    }
      /** 
       * @param values :The Element to set as owningRelatedElement.
       * @generated
       */
      public SubclassificationBuilder owningRelatedElement( org.eclipse.syson.sysml.Element value) {
        getBeingBuilt().setOwningRelatedElement(value);
        return this;
    }
      /**
        * @param value :The Element to set as source. 
        * @generated
        */
      public SubclassificationBuilder source( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getSource().add(value);
      }
      return this;
    }
      /**
        * @param value :The Element to set as target. 
        * @generated
        */
      public SubclassificationBuilder target( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getTarget().add(value);
      }
      return this;
    }
      /** 
       * @param values :The Type to set as general.
       * @generated
       */
      public SubclassificationBuilder general( org.eclipse.syson.sysml.Type value) {
        getBeingBuilt().setGeneral(value);
        return this;
    }
      /** 
       * @param values :The Type to set as specific.
       * @generated
       */
      public SubclassificationBuilder specific( org.eclipse.syson.sysml.Type value) {
        getBeingBuilt().setSpecific(value);
        return this;
    }
      /** 
       * @param values :The Classifier to set as subclassifier.
       * @generated
       */
      public SubclassificationBuilder subclassifier( org.eclipse.syson.sysml.Classifier value) {
        getBeingBuilt().setSubclassifier(value);
        return this;
    }
      /** 
       * @param values :The Classifier to set as superclassifier.
       * @generated
       */
      public SubclassificationBuilder superclassifier( org.eclipse.syson.sysml.Classifier value) {
        getBeingBuilt().setSuperclassifier(value);
        return this;
    }

}
