package org.eclipse.syson.builder;

public class StateSubactionMembershipBuilder  extends FeatureMembershipBuilder
{
   private org.eclipse.syson.sysml.StateSubactionMembership beingBuilt = org.eclipse.syson.sysml.SysmlFactory.eINSTANCE
           .createStateSubactionMembership();
   /**
    * @generated
    */
     protected org.eclipse.syson.sysml.StateSubactionMembership getBeingBuilt() {
           return this.beingBuilt;
       }
     
   /**
    * @generated
    */
     public org.eclipse.syson.sysml.StateSubactionMembership build() {
           return this.getBeingBuilt();
       }

      /**
        * @param value :The EString to set as aliasIds. 
        * @generated
        */
      public StateSubactionMembershipBuilder aliasIds( java.lang.String ... values) {
      for (java.lang.String value : values) {
           getBeingBuilt().getAliasIds().add(value);
      }
      return this;
    }
      /** 
       * @param values :The EString to set as declaredName.
       * @generated
       */
      public StateSubactionMembershipBuilder declaredName( java.lang.String value) {
        getBeingBuilt().setDeclaredName(value);
        return this;
    }
      /** 
       * @param values :The EString to set as declaredShortName.
       * @generated
       */
      public StateSubactionMembershipBuilder declaredShortName( java.lang.String value) {
        getBeingBuilt().setDeclaredShortName(value);
        return this;
    }
      /** 
       * @param values :The EString to set as elementId.
       * @generated
       */
      public StateSubactionMembershipBuilder elementId( java.lang.String value) {
        getBeingBuilt().setElementId(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isImpliedIncluded.
       * @generated
       */
      public StateSubactionMembershipBuilder isImpliedIncluded( java.lang.Boolean value) {
        getBeingBuilt().setIsImpliedIncluded(value);
        return this;
    }
      /**
        * @param value :The Relationship to set as ownedRelationship. 
        * @generated
        */
      public StateSubactionMembershipBuilder ownedRelationship( org.eclipse.syson.sysml.Relationship ... values) {
      for (org.eclipse.syson.sysml.Relationship value : values) {
           getBeingBuilt().getOwnedRelationship().add(value);
      }
      return this;
    }
      /** 
       * @param values :The Relationship to set as owningRelationship.
       * @generated
       */
      public StateSubactionMembershipBuilder owningRelationship( org.eclipse.syson.sysml.Relationship value) {
        getBeingBuilt().setOwningRelationship(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isImplied.
       * @generated
       */
      public StateSubactionMembershipBuilder isImplied( java.lang.Boolean value) {
        getBeingBuilt().setIsImplied(value);
        return this;
    }
      /**
        * @param value :The Element to set as ownedRelatedElement. 
        * @generated
        */
      public StateSubactionMembershipBuilder ownedRelatedElement( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getOwnedRelatedElement().add(value);
      }
      return this;
    }
      /** 
       * @param values :The Element to set as owningRelatedElement.
       * @generated
       */
      public StateSubactionMembershipBuilder owningRelatedElement( org.eclipse.syson.sysml.Element value) {
        getBeingBuilt().setOwningRelatedElement(value);
        return this;
    }
      /**
        * @param value :The Element to set as source. 
        * @generated
        */
      public StateSubactionMembershipBuilder source( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getSource().add(value);
      }
      return this;
    }
      /**
        * @param value :The Element to set as target. 
        * @generated
        */
      public StateSubactionMembershipBuilder target( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getTarget().add(value);
      }
      return this;
    }
      /** 
       * @param values :The EString to set as memberName.
       * @generated
       */
      public StateSubactionMembershipBuilder memberName( java.lang.String value) {
        getBeingBuilt().setMemberName(value);
        return this;
    }
      /** 
       * @param values :The EString to set as memberShortName.
       * @generated
       */
      public StateSubactionMembershipBuilder memberShortName( java.lang.String value) {
        getBeingBuilt().setMemberShortName(value);
        return this;
    }
      /** 
       * @param values :The VisibilityKind to set as visibility.
       * @generated
       */
      public StateSubactionMembershipBuilder visibility( org.eclipse.syson.sysml.VisibilityKind value) {
        getBeingBuilt().setVisibility(value);
        return this;
    }
      /** 
       * @param values :The Element to set as memberElement.
       * @generated
       */
      public StateSubactionMembershipBuilder memberElement( org.eclipse.syson.sysml.Element value) {
        getBeingBuilt().setMemberElement(value);
        return this;
    }
      /** 
       * @param values :The Feature to set as feature.
       * @generated
       */
      public StateSubactionMembershipBuilder feature( org.eclipse.syson.sysml.Feature value) {
        getBeingBuilt().setFeature(value);
        return this;
    }
      /** 
       * @param values :The Type to set as type.
       * @generated
       */
      public StateSubactionMembershipBuilder type( org.eclipse.syson.sysml.Type value) {
        getBeingBuilt().setType(value);
        return this;
    }
      /** 
       * @param values :The StateSubactionKind to set as kind.
       * @generated
       */
      public StateSubactionMembershipBuilder kind( org.eclipse.syson.sysml.StateSubactionKind value) {
        getBeingBuilt().setKind(value);
        return this;
    }

}