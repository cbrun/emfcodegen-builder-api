package org.eclipse.syson.builder;

public class ObjectiveMembershipBuilder  extends FeatureMembershipBuilder
{
   private org.eclipse.syson.sysml.ObjectiveMembership beingBuilt = org.eclipse.syson.sysml.SysmlFactory.eINSTANCE
           .createObjectiveMembership();
   /**
    * @generated
    */
     protected org.eclipse.syson.sysml.ObjectiveMembership getBeingBuilt() {
           return this.beingBuilt;
       }
     
   /**
    * @generated
    */
     public org.eclipse.syson.sysml.ObjectiveMembership build() {
           return this.getBeingBuilt();
       }

      /**
        * @param value :The EString to set as aliasIds. 
        * @generated
        */
      public ObjectiveMembershipBuilder aliasIds( java.lang.String ... values) {
      for (java.lang.String value : values) {
           getBeingBuilt().getAliasIds().add(value);
      }
      return this;
    }
      /** 
       * @param values :The EString to set as declaredName.
       * @generated
       */
      public ObjectiveMembershipBuilder declaredName( java.lang.String value) {
        getBeingBuilt().setDeclaredName(value);
        return this;
    }
      /** 
       * @param values :The EString to set as declaredShortName.
       * @generated
       */
      public ObjectiveMembershipBuilder declaredShortName( java.lang.String value) {
        getBeingBuilt().setDeclaredShortName(value);
        return this;
    }
      /** 
       * @param values :The EString to set as elementId.
       * @generated
       */
      public ObjectiveMembershipBuilder elementId( java.lang.String value) {
        getBeingBuilt().setElementId(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isImpliedIncluded.
       * @generated
       */
      public ObjectiveMembershipBuilder isImpliedIncluded( java.lang.Boolean value) {
        getBeingBuilt().setIsImpliedIncluded(value);
        return this;
    }
      /**
        * @param value :The Relationship to set as ownedRelationship. 
        * @generated
        */
      public ObjectiveMembershipBuilder ownedRelationship( org.eclipse.syson.sysml.Relationship ... values) {
      for (org.eclipse.syson.sysml.Relationship value : values) {
           getBeingBuilt().getOwnedRelationship().add(value);
      }
      return this;
    }
      /** 
       * @param values :The Relationship to set as owningRelationship.
       * @generated
       */
      public ObjectiveMembershipBuilder owningRelationship( org.eclipse.syson.sysml.Relationship value) {
        getBeingBuilt().setOwningRelationship(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isImplied.
       * @generated
       */
      public ObjectiveMembershipBuilder isImplied( java.lang.Boolean value) {
        getBeingBuilt().setIsImplied(value);
        return this;
    }
      /**
        * @param value :The Element to set as ownedRelatedElement. 
        * @generated
        */
      public ObjectiveMembershipBuilder ownedRelatedElement( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getOwnedRelatedElement().add(value);
      }
      return this;
    }
      /** 
       * @param values :The Element to set as owningRelatedElement.
       * @generated
       */
      public ObjectiveMembershipBuilder owningRelatedElement( org.eclipse.syson.sysml.Element value) {
        getBeingBuilt().setOwningRelatedElement(value);
        return this;
    }
      /**
        * @param value :The Element to set as source. 
        * @generated
        */
      public ObjectiveMembershipBuilder source( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getSource().add(value);
      }
      return this;
    }
      /**
        * @param value :The Element to set as target. 
        * @generated
        */
      public ObjectiveMembershipBuilder target( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getTarget().add(value);
      }
      return this;
    }
      /** 
       * @param values :The EString to set as memberName.
       * @generated
       */
      public ObjectiveMembershipBuilder memberName( java.lang.String value) {
        getBeingBuilt().setMemberName(value);
        return this;
    }
      /** 
       * @param values :The EString to set as memberShortName.
       * @generated
       */
      public ObjectiveMembershipBuilder memberShortName( java.lang.String value) {
        getBeingBuilt().setMemberShortName(value);
        return this;
    }
      /** 
       * @param values :The VisibilityKind to set as visibility.
       * @generated
       */
      public ObjectiveMembershipBuilder visibility( org.eclipse.syson.sysml.VisibilityKind value) {
        getBeingBuilt().setVisibility(value);
        return this;
    }
      /** 
       * @param values :The Element to set as memberElement.
       * @generated
       */
      public ObjectiveMembershipBuilder memberElement( org.eclipse.syson.sysml.Element value) {
        getBeingBuilt().setMemberElement(value);
        return this;
    }
      /** 
       * @param values :The Feature to set as feature.
       * @generated
       */
      public ObjectiveMembershipBuilder feature( org.eclipse.syson.sysml.Feature value) {
        getBeingBuilt().setFeature(value);
        return this;
    }
      /** 
       * @param values :The Type to set as type.
       * @generated
       */
      public ObjectiveMembershipBuilder type( org.eclipse.syson.sysml.Type value) {
        getBeingBuilt().setType(value);
        return this;
    }

}
