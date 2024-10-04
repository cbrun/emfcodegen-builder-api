package fr.obeo.dsl.builder;

/**
 *  A builder for the {@link ExponentialDistribution}  type.
 */
  public class ExponentialDistributionBuilder {
  
     private fr.obeo.dsl.guesstimate.ExponentialDistribution beingBuilt = fr.obeo.dsl.guesstimate.GuesstimateFactory.eINSTANCE
             .createExponentialDistribution();
      /**
       * @generated
       */
       protected fr.obeo.dsl.guesstimate.ExponentialDistribution getBeingBuilt() {
           return this.beingBuilt;
       }
       
      /**
       * @generated
       */
       public fr.obeo.dsl.guesstimate.ExponentialDistribution build() {
           return this.getBeingBuilt();
       }

    /** 
     * @param values :The EDouble to set as mean.
     * @generated
     */
    public ExponentialDistributionBuilder mean( java.lang.Double value) {
        getBeingBuilt().setMean(value);
        return this;
    }
}
