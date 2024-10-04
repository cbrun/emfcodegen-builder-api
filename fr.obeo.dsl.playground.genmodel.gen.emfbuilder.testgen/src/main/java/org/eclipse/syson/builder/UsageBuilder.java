package org.eclipse.syson.builder;

public class UsageBuilder  extends FeatureBuilder
{
   private org.eclipse.syson.sysml.Usage beingBuilt = org.eclipse.syson.sysml.SysmlFactory.eINSTANCE
           .createUsage();
   /**
    * @generated
    */
     protected org.eclipse.syson.sysml.Usage getBeingBuilt() {
           return this.beingBuilt;
       }
     
   /**
    * @generated
    */
     public org.eclipse.syson.sysml.Usage build() {
           return this.getBeingBuilt();
       }

      /**
        * @param value :The EString to set as aliasIds. 
        * @generated
        */
      public UsageBuilder aliasIds( java.lang.String ... values) {
      for (java.lang.String value : values) {
           getBeingBuilt().getAliasIds().add(value);
      }
      return this;
    }
      /** 
       * @param values :The EString to set as declaredName.
       * @generated
       */
      public UsageBuilder declaredName( java.lang.String value) {
        getBeingBuilt().setDeclaredName(value);
        return this;
    }
      /** 
       * @param values :The EString to set as declaredShortName.
       * @generated
       */
      public UsageBuilder declaredShortName( java.lang.String value) {
        getBeingBuilt().setDeclaredShortName(value);
        return this;
    }
      /** 
       * @param values :The EString to set as elementId.
       * @generated
       */
      public UsageBuilder elementId( java.lang.String value) {
        getBeingBuilt().setElementId(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isImpliedIncluded.
       * @generated
       */
      public UsageBuilder isImpliedIncluded( java.lang.Boolean value) {
        getBeingBuilt().setIsImpliedIncluded(value);
        return this;
    }
      /**
        * @param value :The Relationship to set as ownedRelationship. 
        * @generated
        */
      public UsageBuilder ownedRelationship( org.eclipse.syson.sysml.Relationship ... values) {
      for (org.eclipse.syson.sysml.Relationship value : values) {
           getBeingBuilt().getOwnedRelationship().add(value);
      }
      return this;
    }
      /** 
       * @param values :The Relationship to set as owningRelationship.
       * @generated
       */
      public UsageBuilder owningRelationship( org.eclipse.syson.sysml.Relationship value) {
        getBeingBuilt().setOwningRelationship(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isAbstract.
       * @generated
       */
      public UsageBuilder isAbstract( java.lang.Boolean value) {
        getBeingBuilt().setIsAbstract(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isSufficient.
       * @generated
       */
      public UsageBuilder isSufficient( java.lang.Boolean value) {
        getBeingBuilt().setIsSufficient(value);
        return this;
    }
      /** 
       * @param values :The FeatureDirectionKind to set as direction.
       * @generated
       */
      public UsageBuilder direction( org.eclipse.syson.sysml.FeatureDirectionKind value) {
        getBeingBuilt().setDirection(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isComposite.
       * @generated
       */
      public UsageBuilder isComposite( java.lang.Boolean value) {
        getBeingBuilt().setIsComposite(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isDerived.
       * @generated
       */
      public UsageBuilder isDerived( java.lang.Boolean value) {
        getBeingBuilt().setIsDerived(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isEnd.
       * @generated
       */
      public UsageBuilder isEnd( java.lang.Boolean value) {
        getBeingBuilt().setIsEnd(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isOrdered.
       * @generated
       */
      public UsageBuilder isOrdered( java.lang.Boolean value) {
        getBeingBuilt().setIsOrdered(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isPortion.
       * @generated
       */
      public UsageBuilder isPortion( java.lang.Boolean value) {
        getBeingBuilt().setIsPortion(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isReadOnly.
       * @generated
       */
      public UsageBuilder isReadOnly( java.lang.Boolean value) {
        getBeingBuilt().setIsReadOnly(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isUnique.
       * @generated
       */
      public UsageBuilder isUnique( java.lang.Boolean value) {
        getBeingBuilt().setIsUnique(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isVariation.
       * @generated
       */
      public UsageBuilder isVariation( java.lang.Boolean value) {
        getBeingBuilt().setIsVariation(value);
        return this;
    }

}
