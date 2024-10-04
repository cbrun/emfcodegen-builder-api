package fr.obeo.dsl.builder;

/**
 *  A builder for the {@link Variable}  type.
 */
  public class VariableBuilder {
  
     private fr.obeo.dsl.guesstimate.Variable beingBuilt = fr.obeo.dsl.guesstimate.GuesstimateFactory.eINSTANCE
             .createVariable();
      /**
       * @generated
       */
       protected fr.obeo.dsl.guesstimate.Variable getBeingBuilt() {
           return this.beingBuilt;
       }
       
      /**
       * @generated
       */
       public fr.obeo.dsl.guesstimate.Variable build() {
           return this.getBeingBuilt();
       }

    /** 
     * @param values :The EString to set as name. This is a <b>required</b> attribute.
     * @generated
     */
    public VariableBuilder name( java.lang.String value) {
        getBeingBuilt().setName(value);
        return this;
    }
    /** 
     * @param values :The EString to set as documentation.
     * @generated
     */
    public VariableBuilder documentation( java.lang.String value) {
        getBeingBuilt().setDocumentation(value);
        return this;
    }
    /** 
     * @param values :The EString to set as definition.
     * @generated
     */
    public VariableBuilder definition( java.lang.String value) {
        getBeingBuilt().setDefinition(value);
        return this;
    }
    /** 
     * @param values :The VariableType to set as type.
     * @generated
     */
    public VariableBuilder type( fr.obeo.dsl.guesstimate.VariableType value) {
        getBeingBuilt().setType(value);
        return this;
    }
    /** 
     * @param values :The DistributionSetting to set as distribution.
     * @generated
     */
    public VariableBuilder distribution( fr.obeo.dsl.guesstimate.DistributionSetting value) {
        getBeingBuilt().setDistribution(value);
        return this;
    }
}
