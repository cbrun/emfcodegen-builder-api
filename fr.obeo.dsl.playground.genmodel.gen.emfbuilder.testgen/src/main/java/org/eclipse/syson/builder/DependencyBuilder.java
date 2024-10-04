package org.eclipse.syson.builder;

public class DependencyBuilder  extends RelationshipBuilder
{
   private org.eclipse.syson.sysml.Dependency beingBuilt = org.eclipse.syson.sysml.SysmlFactory.eINSTANCE
           .createDependency();
   /**
    * @generated
    */
     protected org.eclipse.syson.sysml.Dependency getBeingBuilt() {
           return this.beingBuilt;
       }
     
   /**
    * @generated
    */
     public org.eclipse.syson.sysml.Dependency build() {
           return this.getBeingBuilt();
       }

      /**
        * @param value :The EString to set as aliasIds. 
        * @generated
        */
      public DependencyBuilder aliasIds( java.lang.String ... values) {
      for (java.lang.String value : values) {
           getBeingBuilt().getAliasIds().add(value);
      }
      return this;
    }
      /** 
       * @param values :The EString to set as declaredName.
       * @generated
       */
      public DependencyBuilder declaredName( java.lang.String value) {
        getBeingBuilt().setDeclaredName(value);
        return this;
    }
      /** 
       * @param values :The EString to set as declaredShortName.
       * @generated
       */
      public DependencyBuilder declaredShortName( java.lang.String value) {
        getBeingBuilt().setDeclaredShortName(value);
        return this;
    }
      /** 
       * @param values :The EString to set as elementId.
       * @generated
       */
      public DependencyBuilder elementId( java.lang.String value) {
        getBeingBuilt().setElementId(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isImpliedIncluded.
       * @generated
       */
      public DependencyBuilder isImpliedIncluded( java.lang.Boolean value) {
        getBeingBuilt().setIsImpliedIncluded(value);
        return this;
    }
      /**
        * @param value :The Relationship to set as ownedRelationship. 
        * @generated
        */
      public DependencyBuilder ownedRelationship( org.eclipse.syson.sysml.Relationship ... values) {
      for (org.eclipse.syson.sysml.Relationship value : values) {
           getBeingBuilt().getOwnedRelationship().add(value);
      }
      return this;
    }
      /** 
       * @param values :The Relationship to set as owningRelationship.
       * @generated
       */
      public DependencyBuilder owningRelationship( org.eclipse.syson.sysml.Relationship value) {
        getBeingBuilt().setOwningRelationship(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isImplied.
       * @generated
       */
      public DependencyBuilder isImplied( java.lang.Boolean value) {
        getBeingBuilt().setIsImplied(value);
        return this;
    }
      /**
        * @param value :The Element to set as ownedRelatedElement. 
        * @generated
        */
      public DependencyBuilder ownedRelatedElement( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getOwnedRelatedElement().add(value);
      }
      return this;
    }
      /** 
       * @param values :The Element to set as owningRelatedElement.
       * @generated
       */
      public DependencyBuilder owningRelatedElement( org.eclipse.syson.sysml.Element value) {
        getBeingBuilt().setOwningRelatedElement(value);
        return this;
    }
      /**
        * @param value :The Element to set as source. 
        * @generated
        */
      public DependencyBuilder source( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getSource().add(value);
      }
      return this;
    }
      /**
        * @param value :The Element to set as target. 
        * @generated
        */
      public DependencyBuilder target( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getTarget().add(value);
      }
      return this;
    }
      /**
        * @param value :The Element to set as client. 
        * @generated
        */
      public DependencyBuilder client( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getClient().add(value);
      }
      return this;
    }
      /**
        * @param value :The Element to set as supplier. 
        * @generated
        */
      public DependencyBuilder supplier( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getSupplier().add(value);
      }
      return this;
    }

}
