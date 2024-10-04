package org.eclipse.syson.builder;

/**
 *  A builder for the {@link AnnotatingElement}  type.
 */
  public class AnnotatingElementBuilder  extends ElementBuilder
  {
  
     private org.eclipse.syson.sysml.AnnotatingElement beingBuilt = org.eclipse.syson.sysml.SysmlFactory.eINSTANCE
             .createAnnotatingElement();
      /**
       * @generated
       */
       protected org.eclipse.syson.sysml.AnnotatingElement getBeingBuilt() {
           return this.beingBuilt;
       }
       
      /**
       * @generated
       */
       public org.eclipse.syson.sysml.AnnotatingElement build() {
           return this.getBeingBuilt();
       }

    /**
      * @param value :The EString to set as aliasIds.
 
      * @generated
      */
    public AnnotatingElementBuilder aliasIds( java.lang.String ... values) {
      for (java.lang.String value : values) {
           getBeingBuilt().getAliasIds().add(value);
      }
      return this;
    }
    /** 
     * @param values :The EString to set as declaredName.
     * @generated
     */
    public AnnotatingElementBuilder declaredName( java.lang.String value) {
        getBeingBuilt().setDeclaredName(value);
        return this;
    }
    /** 
     * @param values :The EString to set as declaredShortName.
     * @generated
     */
    public AnnotatingElementBuilder declaredShortName( java.lang.String value) {
        getBeingBuilt().setDeclaredShortName(value);
        return this;
    }
    /** 
     * @param values :The EString to set as elementId. This is a <b>required</b> attribute.
     * @generated
     */
    public AnnotatingElementBuilder elementId( java.lang.String value) {
        getBeingBuilt().setElementId(value);
        return this;
    }
    /** 
     * @param values :The EBoolean to set as isImpliedIncluded. This is a <b>required</b> attribute.
     * @generated
     */
    public AnnotatingElementBuilder isImpliedIncluded( java.lang.Boolean value) {
        getBeingBuilt().setIsImpliedIncluded(value);
        return this;
    }
    /**
      * @param value :The Relationship to set as ownedRelationship.
 
      * @generated
      */
    public AnnotatingElementBuilder ownedRelationship( org.eclipse.syson.sysml.Relationship ... values) {
      for (org.eclipse.syson.sysml.Relationship value : values) {
           getBeingBuilt().getOwnedRelationship().add(value);
      }
      return this;
    }
    /** 
     * @param values :The Relationship to set as owningRelationship.
     * @generated
     */
    public AnnotatingElementBuilder owningRelationship( org.eclipse.syson.sysml.Relationship value) {
        getBeingBuilt().setOwningRelationship(value);
        return this;
    }
    /**
      * @param value :The Annotation to set as annotation.
 
      * @generated
      */
    public AnnotatingElementBuilder annotation( org.eclipse.syson.sysml.Annotation ... values) {
      for (org.eclipse.syson.sysml.Annotation value : values) {
           getBeingBuilt().getAnnotation().add(value);
      }
      return this;
    }
}
