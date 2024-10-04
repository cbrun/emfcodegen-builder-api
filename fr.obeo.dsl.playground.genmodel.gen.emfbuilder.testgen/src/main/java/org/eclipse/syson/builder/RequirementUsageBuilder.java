package org.eclipse.syson.builder;

public class RequirementUsageBuilder  extends ConstraintUsageBuilder
{
   private org.eclipse.syson.sysml.RequirementUsage beingBuilt = org.eclipse.syson.sysml.SysmlFactory.eINSTANCE
           .createRequirementUsage();
   /**
    * @generated
    */
     protected org.eclipse.syson.sysml.RequirementUsage getBeingBuilt() {
           return this.beingBuilt;
       }
     
   /**
    * @generated
    */
     public org.eclipse.syson.sysml.RequirementUsage build() {
           return this.getBeingBuilt();
       }

      /**
        * @param value :The EString to set as aliasIds. 
        * @generated
        */
      public RequirementUsageBuilder aliasIds( java.lang.String ... values) {
      for (java.lang.String value : values) {
           getBeingBuilt().getAliasIds().add(value);
      }
      return this;
    }
      /** 
       * @param values :The EString to set as declaredName.
       * @generated
       */
      public RequirementUsageBuilder declaredName( java.lang.String value) {
        getBeingBuilt().setDeclaredName(value);
        return this;
    }
      /** 
       * @param values :The EString to set as declaredShortName.
       * @generated
       */
      public RequirementUsageBuilder declaredShortName( java.lang.String value) {
        getBeingBuilt().setDeclaredShortName(value);
        return this;
    }
      /** 
       * @param values :The EString to set as elementId.
       * @generated
       */
      public RequirementUsageBuilder elementId( java.lang.String value) {
        getBeingBuilt().setElementId(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isImpliedIncluded.
       * @generated
       */
      public RequirementUsageBuilder isImpliedIncluded( java.lang.Boolean value) {
        getBeingBuilt().setIsImpliedIncluded(value);
        return this;
    }
      /**
        * @param value :The Relationship to set as ownedRelationship. 
        * @generated
        */
      public RequirementUsageBuilder ownedRelationship( org.eclipse.syson.sysml.Relationship ... values) {
      for (org.eclipse.syson.sysml.Relationship value : values) {
           getBeingBuilt().getOwnedRelationship().add(value);
      }
      return this;
    }
      /** 
       * @param values :The Relationship to set as owningRelationship.
       * @generated
       */
      public RequirementUsageBuilder owningRelationship( org.eclipse.syson.sysml.Relationship value) {
        getBeingBuilt().setOwningRelationship(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isAbstract.
       * @generated
       */
      public RequirementUsageBuilder isAbstract( java.lang.Boolean value) {
        getBeingBuilt().setIsAbstract(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isSufficient.
       * @generated
       */
      public RequirementUsageBuilder isSufficient( java.lang.Boolean value) {
        getBeingBuilt().setIsSufficient(value);
        return this;
    }
      /** 
       * @param values :The FeatureDirectionKind to set as direction.
       * @generated
       */
      public RequirementUsageBuilder direction( org.eclipse.syson.sysml.FeatureDirectionKind value) {
        getBeingBuilt().setDirection(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isComposite.
       * @generated
       */
      public RequirementUsageBuilder isComposite( java.lang.Boolean value) {
        getBeingBuilt().setIsComposite(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isDerived.
       * @generated
       */
      public RequirementUsageBuilder isDerived( java.lang.Boolean value) {
        getBeingBuilt().setIsDerived(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isEnd.
       * @generated
       */
      public RequirementUsageBuilder isEnd( java.lang.Boolean value) {
        getBeingBuilt().setIsEnd(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isOrdered.
       * @generated
       */
      public RequirementUsageBuilder isOrdered( java.lang.Boolean value) {
        getBeingBuilt().setIsOrdered(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isPortion.
       * @generated
       */
      public RequirementUsageBuilder isPortion( java.lang.Boolean value) {
        getBeingBuilt().setIsPortion(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isReadOnly.
       * @generated
       */
      public RequirementUsageBuilder isReadOnly( java.lang.Boolean value) {
        getBeingBuilt().setIsReadOnly(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isUnique.
       * @generated
       */
      public RequirementUsageBuilder isUnique( java.lang.Boolean value) {
        getBeingBuilt().setIsUnique(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isVariation.
       * @generated
       */
      public RequirementUsageBuilder isVariation( java.lang.Boolean value) {
        getBeingBuilt().setIsVariation(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isIndividual.
       * @generated
       */
      public RequirementUsageBuilder isIndividual( java.lang.Boolean value) {
        getBeingBuilt().setIsIndividual(value);
        return this;
    }
      /** 
       * @param values :The PortionKind to set as portionKind.
       * @generated
       */
      public RequirementUsageBuilder portionKind( org.eclipse.syson.sysml.PortionKind value) {
        getBeingBuilt().setPortionKind(value);
        return this;
    }
      /** 
       * @param values :The EString to set as reqId.
       * @generated
       */
      public RequirementUsageBuilder reqId( java.lang.String value) {
        getBeingBuilt().setReqId(value);
        return this;
    }

}
