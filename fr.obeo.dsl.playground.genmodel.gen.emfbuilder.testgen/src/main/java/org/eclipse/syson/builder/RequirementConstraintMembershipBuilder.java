package org.eclipse.syson.builder;

public class RequirementConstraintMembershipBuilder  extends FeatureMembershipBuilder
{
   private org.eclipse.syson.sysml.RequirementConstraintMembership beingBuilt = org.eclipse.syson.sysml.SysmlFactory.eINSTANCE
           .createRequirementConstraintMembership();
   /**
    * @generated
    */
     protected org.eclipse.syson.sysml.RequirementConstraintMembership getBeingBuilt() {
           return this.beingBuilt;
       }
     
   /**
    * @generated
    */
     public org.eclipse.syson.sysml.RequirementConstraintMembership build() {
           return this.getBeingBuilt();
       }

      /**
        * @param value :The EString to set as aliasIds. 
        * @generated
        */
      public RequirementConstraintMembershipBuilder aliasIds( java.lang.String ... values) {
      for (java.lang.String value : values) {
           getBeingBuilt().getAliasIds().add(value);
      }
      return this;
    }
      /** 
       * @param values :The EString to set as declaredName.
       * @generated
       */
      public RequirementConstraintMembershipBuilder declaredName( java.lang.String value) {
        getBeingBuilt().setDeclaredName(value);
        return this;
    }
      /** 
       * @param values :The EString to set as declaredShortName.
       * @generated
       */
      public RequirementConstraintMembershipBuilder declaredShortName( java.lang.String value) {
        getBeingBuilt().setDeclaredShortName(value);
        return this;
    }
      /** 
       * @param values :The EString to set as elementId.
       * @generated
       */
      public RequirementConstraintMembershipBuilder elementId( java.lang.String value) {
        getBeingBuilt().setElementId(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isImpliedIncluded.
       * @generated
       */
      public RequirementConstraintMembershipBuilder isImpliedIncluded( java.lang.Boolean value) {
        getBeingBuilt().setIsImpliedIncluded(value);
        return this;
    }
      /**
        * @param value :The Relationship to set as ownedRelationship. 
        * @generated
        */
      public RequirementConstraintMembershipBuilder ownedRelationship( org.eclipse.syson.sysml.Relationship ... values) {
      for (org.eclipse.syson.sysml.Relationship value : values) {
           getBeingBuilt().getOwnedRelationship().add(value);
      }
      return this;
    }
      /** 
       * @param values :The Relationship to set as owningRelationship.
       * @generated
       */
      public RequirementConstraintMembershipBuilder owningRelationship( org.eclipse.syson.sysml.Relationship value) {
        getBeingBuilt().setOwningRelationship(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isImplied.
       * @generated
       */
      public RequirementConstraintMembershipBuilder isImplied( java.lang.Boolean value) {
        getBeingBuilt().setIsImplied(value);
        return this;
    }
      /**
        * @param value :The Element to set as ownedRelatedElement. 
        * @generated
        */
      public RequirementConstraintMembershipBuilder ownedRelatedElement( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getOwnedRelatedElement().add(value);
      }
      return this;
    }
      /** 
       * @param values :The Element to set as owningRelatedElement.
       * @generated
       */
      public RequirementConstraintMembershipBuilder owningRelatedElement( org.eclipse.syson.sysml.Element value) {
        getBeingBuilt().setOwningRelatedElement(value);
        return this;
    }
      /**
        * @param value :The Element to set as source. 
        * @generated
        */
      public RequirementConstraintMembershipBuilder source( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getSource().add(value);
      }
      return this;
    }
      /**
        * @param value :The Element to set as target. 
        * @generated
        */
      public RequirementConstraintMembershipBuilder target( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getTarget().add(value);
      }
      return this;
    }
      /** 
       * @param values :The EString to set as memberName.
       * @generated
       */
      public RequirementConstraintMembershipBuilder memberName( java.lang.String value) {
        getBeingBuilt().setMemberName(value);
        return this;
    }
      /** 
       * @param values :The EString to set as memberShortName.
       * @generated
       */
      public RequirementConstraintMembershipBuilder memberShortName( java.lang.String value) {
        getBeingBuilt().setMemberShortName(value);
        return this;
    }
      /** 
       * @param values :The VisibilityKind to set as visibility.
       * @generated
       */
      public RequirementConstraintMembershipBuilder visibility( org.eclipse.syson.sysml.VisibilityKind value) {
        getBeingBuilt().setVisibility(value);
        return this;
    }
      /** 
       * @param values :The Element to set as memberElement.
       * @generated
       */
      public RequirementConstraintMembershipBuilder memberElement( org.eclipse.syson.sysml.Element value) {
        getBeingBuilt().setMemberElement(value);
        return this;
    }
      /** 
       * @param values :The Feature to set as feature.
       * @generated
       */
      public RequirementConstraintMembershipBuilder feature( org.eclipse.syson.sysml.Feature value) {
        getBeingBuilt().setFeature(value);
        return this;
    }
      /** 
       * @param values :The Type to set as type.
       * @generated
       */
      public RequirementConstraintMembershipBuilder type( org.eclipse.syson.sysml.Type value) {
        getBeingBuilt().setType(value);
        return this;
    }
      /** 
       * @param values :The RequirementConstraintKind to set as kind.
       * @generated
       */
      public RequirementConstraintMembershipBuilder kind( org.eclipse.syson.sysml.RequirementConstraintKind value) {
        getBeingBuilt().setKind(value);
        return this;
    }

}
