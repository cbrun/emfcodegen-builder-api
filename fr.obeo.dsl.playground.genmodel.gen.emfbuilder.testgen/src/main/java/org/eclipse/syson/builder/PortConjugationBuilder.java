package org.eclipse.syson.builder;

public class PortConjugationBuilder  extends ConjugationBuilder
{
   private org.eclipse.syson.sysml.PortConjugation beingBuilt = org.eclipse.syson.sysml.SysmlFactory.eINSTANCE
           .createPortConjugation();
   /**
    * @generated
    */
     protected org.eclipse.syson.sysml.PortConjugation getBeingBuilt() {
           return this.beingBuilt;
       }
     
   /**
    * @generated
    */
     public org.eclipse.syson.sysml.PortConjugation build() {
           return this.getBeingBuilt();
       }

      /**
        * @param value :The EString to set as aliasIds. 
        * @generated
        */
      public PortConjugationBuilder aliasIds( java.lang.String ... values) {
      for (java.lang.String value : values) {
           getBeingBuilt().getAliasIds().add(value);
      }
      return this;
    }
      /** 
       * @param values :The EString to set as declaredName.
       * @generated
       */
      public PortConjugationBuilder declaredName( java.lang.String value) {
        getBeingBuilt().setDeclaredName(value);
        return this;
    }
      /** 
       * @param values :The EString to set as declaredShortName.
       * @generated
       */
      public PortConjugationBuilder declaredShortName( java.lang.String value) {
        getBeingBuilt().setDeclaredShortName(value);
        return this;
    }
      /** 
       * @param values :The EString to set as elementId.
       * @generated
       */
      public PortConjugationBuilder elementId( java.lang.String value) {
        getBeingBuilt().setElementId(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isImpliedIncluded.
       * @generated
       */
      public PortConjugationBuilder isImpliedIncluded( java.lang.Boolean value) {
        getBeingBuilt().setIsImpliedIncluded(value);
        return this;
    }
      /**
        * @param value :The Relationship to set as ownedRelationship. 
        * @generated
        */
      public PortConjugationBuilder ownedRelationship( org.eclipse.syson.sysml.Relationship ... values) {
      for (org.eclipse.syson.sysml.Relationship value : values) {
           getBeingBuilt().getOwnedRelationship().add(value);
      }
      return this;
    }
      /** 
       * @param values :The Relationship to set as owningRelationship.
       * @generated
       */
      public PortConjugationBuilder owningRelationship( org.eclipse.syson.sysml.Relationship value) {
        getBeingBuilt().setOwningRelationship(value);
        return this;
    }
      /** 
       * @param values :The EBoolean to set as isImplied.
       * @generated
       */
      public PortConjugationBuilder isImplied( java.lang.Boolean value) {
        getBeingBuilt().setIsImplied(value);
        return this;
    }
      /**
        * @param value :The Element to set as ownedRelatedElement. 
        * @generated
        */
      public PortConjugationBuilder ownedRelatedElement( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getOwnedRelatedElement().add(value);
      }
      return this;
    }
      /** 
       * @param values :The Element to set as owningRelatedElement.
       * @generated
       */
      public PortConjugationBuilder owningRelatedElement( org.eclipse.syson.sysml.Element value) {
        getBeingBuilt().setOwningRelatedElement(value);
        return this;
    }
      /**
        * @param value :The Element to set as source. 
        * @generated
        */
      public PortConjugationBuilder source( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getSource().add(value);
      }
      return this;
    }
      /**
        * @param value :The Element to set as target. 
        * @generated
        */
      public PortConjugationBuilder target( org.eclipse.syson.sysml.Element ... values) {
      for (org.eclipse.syson.sysml.Element value : values) {
           getBeingBuilt().getTarget().add(value);
      }
      return this;
    }
      /** 
       * @param values :The Type to set as conjugatedType.
       * @generated
       */
      public PortConjugationBuilder conjugatedType( org.eclipse.syson.sysml.Type value) {
        getBeingBuilt().setConjugatedType(value);
        return this;
    }
      /** 
       * @param values :The Type to set as originalType.
       * @generated
       */
      public PortConjugationBuilder originalType( org.eclipse.syson.sysml.Type value) {
        getBeingBuilt().setOriginalType(value);
        return this;
    }
      /** 
       * @param values :The PortDefinition to set as originalPortDefinition.
       * @generated
       */
      public PortConjugationBuilder originalPortDefinition( org.eclipse.syson.sysml.PortDefinition value) {
        getBeingBuilt().setOriginalPortDefinition(value);
        return this;
    }

}
