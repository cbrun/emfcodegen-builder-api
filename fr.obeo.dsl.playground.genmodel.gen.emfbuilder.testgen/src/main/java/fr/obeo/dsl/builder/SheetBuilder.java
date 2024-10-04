package fr.obeo.dsl.builder;

/**
 *  A builder for the {@link Sheet}  type.
 */
  public class SheetBuilder {
  
     private fr.obeo.dsl.guesstimate.Sheet beingBuilt = fr.obeo.dsl.guesstimate.GuesstimateFactory.eINSTANCE
             .createSheet();
      /**
       * @generated
       */
       protected fr.obeo.dsl.guesstimate.Sheet getBeingBuilt() {
           return this.beingBuilt;
       }
       
      /**
       * @generated
       */
       public fr.obeo.dsl.guesstimate.Sheet build() {
           return this.getBeingBuilt();
       }

    /**
      * @param value :The Variable to set as variables.
 
      * @generated
      */
    public SheetBuilder variables( fr.obeo.dsl.guesstimate.Variable ... values) {
      for (fr.obeo.dsl.guesstimate.Variable value : values) {
           getBeingBuilt().getVariables().add(value);
      }
      return this;
    }
    /** 
     * @param values :The EInt to set as sampleSize.
     * @generated
     */
    public SheetBuilder sampleSize( java.lang.Integer value) {
        getBeingBuilt().setSampleSize(value);
        return this;
    }
}
