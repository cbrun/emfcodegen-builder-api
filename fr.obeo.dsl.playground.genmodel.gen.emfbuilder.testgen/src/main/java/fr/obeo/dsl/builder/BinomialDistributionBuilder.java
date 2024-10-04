package fr.obeo.dsl.builder;

/**
 *  A builder for the {@link BinomialDistribution}  type.
 */
  public class BinomialDistributionBuilder {
  
     private fr.obeo.dsl.guesstimate.BinomialDistribution beingBuilt = fr.obeo.dsl.guesstimate.GuesstimateFactory.eINSTANCE
             .createBinomialDistribution();
      /**
       * @generated
       */
       protected fr.obeo.dsl.guesstimate.BinomialDistribution getBeingBuilt() {
           return this.beingBuilt;
       }
       
      /**
       * @generated
       */
       public fr.obeo.dsl.guesstimate.BinomialDistribution build() {
           return this.getBeingBuilt();
       }

    /** 
     * @param values :The EInt to set as trials.
     * @generated
     */
    public BinomialDistributionBuilder trials( java.lang.Integer value) {
        getBeingBuilt().setTrials(value);
        return this;
    }
    /** 
     * @param values :The Percentage to set as p.
     * @generated
     */
    public BinomialDistributionBuilder p( java.lang.Double value) {
        getBeingBuilt().setP(value);
        return this;
    }
}
