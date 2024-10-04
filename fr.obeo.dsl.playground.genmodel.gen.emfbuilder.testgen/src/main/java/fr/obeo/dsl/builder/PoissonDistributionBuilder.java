package fr.obeo.dsl.builder;

/**
 *  A builder for the {@link PoissonDistribution}  type.
 */
  public class PoissonDistributionBuilder {
  
     private fr.obeo.dsl.guesstimate.PoissonDistribution beingBuilt = fr.obeo.dsl.guesstimate.GuesstimateFactory.eINSTANCE
             .createPoissonDistribution();
      /**
       * @generated
       */
       protected fr.obeo.dsl.guesstimate.PoissonDistribution getBeingBuilt() {
           return this.beingBuilt;
       }
       
      /**
       * @generated
       */
       public fr.obeo.dsl.guesstimate.PoissonDistribution build() {
           return this.getBeingBuilt();
       }

    /** 
     * @param values :The EDouble to set as p.
     * @generated
     */
    public PoissonDistributionBuilder p( java.lang.Double value) {
        getBeingBuilt().setP(value);
        return this;
    }
    /** 
     * @param values :The EDouble to set as epsilon.
     * @generated
     */
    public PoissonDistributionBuilder epsilon( java.lang.Double value) {
        getBeingBuilt().setEpsilon(value);
        return this;
    }
}
