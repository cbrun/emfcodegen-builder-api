package fr.obeo.dsl.builder;

/**
 *  A builder for the {@link UniformDistribution}  type.
 */
  public class UniformDistributionBuilder {
  
     private fr.obeo.dsl.guesstimate.UniformDistribution beingBuilt = fr.obeo.dsl.guesstimate.GuesstimateFactory.eINSTANCE
             .createUniformDistribution();
      /**
       * @generated
       */
       protected fr.obeo.dsl.guesstimate.UniformDistribution getBeingBuilt() {
           return this.beingBuilt;
       }
       
      /**
       * @generated
       */
       public fr.obeo.dsl.guesstimate.UniformDistribution build() {
           return this.getBeingBuilt();
       }

    /** 
     * @param values :The EDouble to set as min.
     * @generated
     */
    public UniformDistributionBuilder min( java.lang.Double value) {
        getBeingBuilt().setMin(value);
        return this;
    }
    /** 
     * @param values :The EDouble to set as max.
     * @generated
     */
    public UniformDistributionBuilder max( java.lang.Double value) {
        getBeingBuilt().setMax(value);
        return this;
    }
}
