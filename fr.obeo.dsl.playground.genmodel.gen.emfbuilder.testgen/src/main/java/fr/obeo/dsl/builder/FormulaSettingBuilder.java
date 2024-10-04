package fr.obeo.dsl.builder;

/**
 *  A builder for the {@link FormulaSetting}  type.
 */
  public class FormulaSettingBuilder {
  
     private fr.obeo.dsl.guesstimate.FormulaSetting beingBuilt = fr.obeo.dsl.guesstimate.GuesstimateFactory.eINSTANCE
             .createFormulaSetting();
      /**
       * @generated
       */
       protected fr.obeo.dsl.guesstimate.FormulaSetting getBeingBuilt() {
           return this.beingBuilt;
       }
       
      /**
       * @generated
       */
       public fr.obeo.dsl.guesstimate.FormulaSetting build() {
           return this.getBeingBuilt();
       }

    /** 
     * @param values :The EString to set as formula. This is a <b>required</b> attribute.
     * @generated
     */
    public FormulaSettingBuilder formula( java.lang.String value) {
        getBeingBuilt().setFormula(value);
        return this;
    }
    /**
      * @param value :The Variable to set as inputs.
 
      * @generated
      */
    public FormulaSettingBuilder inputs( fr.obeo.dsl.guesstimate.Variable ... values) {
      for (fr.obeo.dsl.guesstimate.Variable value : values) {
           getBeingBuilt().getInputs().add(value);
      }
      return this;
    }
}
