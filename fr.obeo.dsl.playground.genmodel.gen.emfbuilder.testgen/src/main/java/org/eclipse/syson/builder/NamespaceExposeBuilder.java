package org.eclipse.syson.builder;

public class NamespaceExposeBuilder  extends NamespaceImportBuilder
{
   private org.eclipse.syson.sysml.NamespaceExpose beingBuilt = org.eclipse.syson.sysml.SysmlFactory.eINSTANCE
           .createNamespaceExpose();
   /**
    * @generated
    */
     protected org.eclipse.syson.sysml.NamespaceExpose getBeingBuilt() {
           return this.beingBuilt;
       }
     
   /**
    * @generated
    */
     public org.eclipse.syson.sysml.NamespaceExpose build() {
           return this.getBeingBuilt();
       }

      /**
        * @param value :The EString to set as aliasIds. 
        * @generated
        */
      public NamespaceExposeBuilder aliasIds( java.lang.String ... values) {
      for (java.lang.String value : values) {
           getBeingBuilt().getAliasIds().add(value);
      }
      return this;
    }
      /** 
       * @param values :The EString to set as declaredName.
       * @generated
       */
      public NamespaceExposeBuilder declaredName( java.lang.String value) {
        getBeingBuilt().setDeclaredName(value);
        return this;
    }
      /** 
       * @param values :The EString to set as declaredShortName.
       * @generated
       */
      public NamespaceExposeBuilder declaredShortName( java.lang.String value) {
        getBeingBuilt().setDeclaredShortName(value);
        return this;
    }
      /** 
       * @param values :The EString to set as elementId.
       * @generated
       */
      public NamespaceExposeBuilder elementId( java.lang.String value) {
        getBeingBuilt().setElementId(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isImpliedIncluded.
       * @generated
       */
      public NamespaceExposeBuilder isImpliedIncluded( java.lang.Boolean value) {
        getBeingBuilt().setIsImpliedIncluded(value);
        return this;
    }
      /**
        * @param value :The Relationship to set as ownedRelationship. 
        * @generated
        */
      public NamespaceExposeBuilder ownedRelationship( org.eclipse.syson.sysml.Relationship ... values) {
      for (org.eclipse.syson.sysml.Relationship value : values) {
           getBeingBuilt().getOwnedRelationship().add(value);
      }
      return this;
    }
      /** 
       * @param values :The Relationship to set as owningRelationship.
       * @generated
       */
      public NamespaceExposeBuilder owningRelationship( org.eclipse.syson.sysml.Relationship value) {
        getBeingBuilt().setOwningRelationship(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isImplied.
       * @generated
       */
      public NamespaceExposeBuilder isImplied( java.lang.Boolean value) {
        getBeingBuilt().setIsImplied(value);
        return this;
    }
      /**
        * @param value :The Element to set as ownedRelatedElement. 
        * @generated
        */
      public NamespaceExposeBuilder ownedRelatedElement( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getOwnedRelatedElement().add(value);
      }
      return this;
    }
      /** 
       * @param values :The Element to set as owningRelatedElement.
       * @generated
       */
      public NamespaceExposeBuilder owningRelatedElement( org.eclipse.syson.sysml.Element value) {
        getBeingBuilt().setOwningRelatedElement(value);
        return this;
    }
      /**
        * @param value :The Element to set as source. 
        * @generated
        */
      public NamespaceExposeBuilder source( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getSource().add(value);
      }
      return this;
    }
      /**
        * @param value :The Element to set as target. 
        * @generated
        */
      public NamespaceExposeBuilder target( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getTarget().add(value);
      }
      return this;
    }
      /** 
       * @param values :The EBoolean to set as isImportAll.
       * @generated
       */
      public NamespaceExposeBuilder isImportAll( java.lang.Boolean value) {
        getBeingBuilt().setIsImportAll(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isRecursive.
       * @generated
       */
      public NamespaceExposeBuilder isRecursive( java.lang.Boolean value) {
        getBeingBuilt().setIsRecursive(value);
        return this;
    }
      /** 
       * @param values :The VisibilityKind to set as visibility.
       * @generated
       */
      public NamespaceExposeBuilder visibility( org.eclipse.syson.sysml.VisibilityKind value) {
        getBeingBuilt().setVisibility(value);
        return this;
    }
      /** 
       * @param values :The Namespace to set as importedNamespace.
       * @generated
       */
      public NamespaceExposeBuilder importedNamespace( org.eclipse.syson.sysml.Namespace value) {
        getBeingBuilt().setImportedNamespace(value);
        return this;
    }

}
