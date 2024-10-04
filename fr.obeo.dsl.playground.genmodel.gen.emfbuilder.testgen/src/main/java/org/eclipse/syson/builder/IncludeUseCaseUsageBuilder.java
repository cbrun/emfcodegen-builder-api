package org.eclipse.syson.builder;

public class IncludeUseCaseUsageBuilder  extends UseCaseUsageBuilder
{
   private org.eclipse.syson.sysml.IncludeUseCaseUsage beingBuilt = org.eclipse.syson.sysml.SysmlFactory.eINSTANCE
           .createIncludeUseCaseUsage();
   /**
    * @generated
    */
     protected org.eclipse.syson.sysml.IncludeUseCaseUsage getBeingBuilt() {
           return this.beingBuilt;
       }
     
   /**
    * @generated
    */
     public org.eclipse.syson.sysml.IncludeUseCaseUsage build() {
           return this.getBeingBuilt();
       }

      /**
        * @param value :The EString to set as aliasIds. 
        * @generated
        */
      public IncludeUseCaseUsageBuilder aliasIds( java.lang.String ... values) {
      for (java.lang.String value : values) {
           getBeingBuilt().getAliasIds().add(value);
      }
      return this;
    }
      /** 
       * @param values :The EString to set as declaredName.
       * @generated
       */
      public IncludeUseCaseUsageBuilder declaredName( java.lang.String value) {
        getBeingBuilt().setDeclaredName(value);
        return this;
    }
      /** 
       * @param values :The EString to set as declaredShortName.
       * @generated
       */
      public IncludeUseCaseUsageBuilder declaredShortName( java.lang.String value) {
        getBeingBuilt().setDeclaredShortName(value);
        return this;
    }
      /** 
       * @param values :The EString to set as elementId.
       * @generated
       */
      public IncludeUseCaseUsageBuilder elementId( java.lang.String value) {
        getBeingBuilt().setElementId(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isImpliedIncluded.
       * @generated
       */
      public IncludeUseCaseUsageBuilder isImpliedIncluded( java.lang.Boolean value) {
        getBeingBuilt().setIsImpliedIncluded(value);
        return this;
    }
      /**
        * @param value :The Relationship to set as ownedRelationship. 
        * @generated
        */
      public IncludeUseCaseUsageBuilder ownedRelationship( org.eclipse.syson.sysml.Relationship ... values) {
      for (org.eclipse.syson.sysml.Relationship value : values) {
           getBeingBuilt().getOwnedRelationship().add(value);
      }
      return this;
    }
      /** 
       * @param values :The Relationship to set as owningRelationship.
       * @generated
       */
      public IncludeUseCaseUsageBuilder owningRelationship( org.eclipse.syson.sysml.Relationship value) {
        getBeingBuilt().setOwningRelationship(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isAbstract.
       * @generated
       */
      public IncludeUseCaseUsageBuilder isAbstract( java.lang.Boolean value) {
        getBeingBuilt().setIsAbstract(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isSufficient.
       * @generated
       */
      public IncludeUseCaseUsageBuilder isSufficient( java.lang.Boolean value) {
        getBeingBuilt().setIsSufficient(value);
        return this;
    }
      /** 
       * @param values :The FeatureDirectionKind to set as direction.
       * @generated
       */
      public IncludeUseCaseUsageBuilder direction( org.eclipse.syson.sysml.FeatureDirectionKind value) {
        getBeingBuilt().setDirection(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isComposite.
       * @generated
       */
      public IncludeUseCaseUsageBuilder isComposite( java.lang.Boolean value) {
        getBeingBuilt().setIsComposite(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isDerived.
       * @generated
       */
      public IncludeUseCaseUsageBuilder isDerived( java.lang.Boolean value) {
        getBeingBuilt().setIsDerived(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isEnd.
       * @generated
       */
      public IncludeUseCaseUsageBuilder isEnd( java.lang.Boolean value) {
        getBeingBuilt().setIsEnd(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isOrdered.
       * @generated
       */
      public IncludeUseCaseUsageBuilder isOrdered( java.lang.Boolean value) {
        getBeingBuilt().setIsOrdered(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isPortion.
       * @generated
       */
      public IncludeUseCaseUsageBuilder isPortion( java.lang.Boolean value) {
        getBeingBuilt().setIsPortion(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isReadOnly.
       * @generated
       */
      public IncludeUseCaseUsageBuilder isReadOnly( java.lang.Boolean value) {
        getBeingBuilt().setIsReadOnly(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isUnique.
       * @generated
       */
      public IncludeUseCaseUsageBuilder isUnique( java.lang.Boolean value) {
        getBeingBuilt().setIsUnique(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isVariation.
       * @generated
       */
      public IncludeUseCaseUsageBuilder isVariation( java.lang.Boolean value) {
        getBeingBuilt().setIsVariation(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isIndividual.
       * @generated
       */
      public IncludeUseCaseUsageBuilder isIndividual( java.lang.Boolean value) {
        getBeingBuilt().setIsIndividual(value);
        return this;
    }
      /** 
       * @param values :The PortionKind to set as portionKind.
       * @generated
       */
      public IncludeUseCaseUsageBuilder portionKind( org.eclipse.syson.sysml.PortionKind value) {
        getBeingBuilt().setPortionKind(value);
        return this;
    }

}
