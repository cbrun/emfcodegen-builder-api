package org.eclipse.syson.builder;

public class MembershipImportBuilder  extends ImportBuilder
{
   private org.eclipse.syson.sysml.MembershipImport beingBuilt = org.eclipse.syson.sysml.SysmlFactory.eINSTANCE
           .createMembershipImport();
   /**
    * @generated
    */
     protected org.eclipse.syson.sysml.MembershipImport getBeingBuilt() {
           return this.beingBuilt;
       }
     
   /**
    * @generated
    */
     public org.eclipse.syson.sysml.MembershipImport build() {
           return this.getBeingBuilt();
       }

      /**
        * @param value :The EString to set as aliasIds. 
        * @generated
        */
      public MembershipImportBuilder aliasIds( java.lang.String ... values) {
      for (java.lang.String value : values) {
           getBeingBuilt().getAliasIds().add(value);
      }
      return this;
    }
      /** 
       * @param values :The EString to set as declaredName.
       * @generated
       */
      public MembershipImportBuilder declaredName( java.lang.String value) {
        getBeingBuilt().setDeclaredName(value);
        return this;
    }
      /** 
       * @param values :The EString to set as declaredShortName.
       * @generated
       */
      public MembershipImportBuilder declaredShortName( java.lang.String value) {
        getBeingBuilt().setDeclaredShortName(value);
        return this;
    }
      /** 
       * @param values :The EString to set as elementId.
       * @generated
       */
      public MembershipImportBuilder elementId( java.lang.String value) {
        getBeingBuilt().setElementId(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isImpliedIncluded.
       * @generated
       */
      public MembershipImportBuilder isImpliedIncluded( java.lang.Boolean value) {
        getBeingBuilt().setIsImpliedIncluded(value);
        return this;
    }
      /**
        * @param value :The Relationship to set as ownedRelationship. 
        * @generated
        */
      public MembershipImportBuilder ownedRelationship( org.eclipse.syson.sysml.Relationship ... values) {
      for (org.eclipse.syson.sysml.Relationship value : values) {
           getBeingBuilt().getOwnedRelationship().add(value);
      }
      return this;
    }
      /** 
       * @param values :The Relationship to set as owningRelationship.
       * @generated
       */
      public MembershipImportBuilder owningRelationship( org.eclipse.syson.sysml.Relationship value) {
        getBeingBuilt().setOwningRelationship(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isImplied.
       * @generated
       */
      public MembershipImportBuilder isImplied( java.lang.Boolean value) {
        getBeingBuilt().setIsImplied(value);
        return this;
    }
      /**
        * @param value :The Element to set as ownedRelatedElement. 
        * @generated
        */
      public MembershipImportBuilder ownedRelatedElement( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getOwnedRelatedElement().add(value);
      }
      return this;
    }
      /** 
       * @param values :The Element to set as owningRelatedElement.
       * @generated
       */
      public MembershipImportBuilder owningRelatedElement( org.eclipse.syson.sysml.Element value) {
        getBeingBuilt().setOwningRelatedElement(value);
        return this;
    }
      /**
        * @param value :The Element to set as source. 
        * @generated
        */
      public MembershipImportBuilder source( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getSource().add(value);
      }
      return this;
    }
      /**
        * @param value :The Element to set as target. 
        * @generated
        */
      public MembershipImportBuilder target( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getTarget().add(value);
      }
      return this;
    }
      /** 
       * @param values :The EBoolean to set as isImportAll.
       * @generated
       */
      public MembershipImportBuilder isImportAll( java.lang.Boolean value) {
        getBeingBuilt().setIsImportAll(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isRecursive.
       * @generated
       */
      public MembershipImportBuilder isRecursive( java.lang.Boolean value) {
        getBeingBuilt().setIsRecursive(value);
        return this;
    }
      /** 
       * @param values :The VisibilityKind to set as visibility.
       * @generated
       */
      public MembershipImportBuilder visibility( org.eclipse.syson.sysml.VisibilityKind value) {
        getBeingBuilt().setVisibility(value);
        return this;
    }
      /** 
       * @param values :The Membership to set as importedMembership.
       * @generated
       */
      public MembershipImportBuilder importedMembership( org.eclipse.syson.sysml.Membership value) {
        getBeingBuilt().setImportedMembership(value);
        return this;
    }

}
