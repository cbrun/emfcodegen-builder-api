package fr.obeo.dsl.builder;

/**
 *  A builder for the {@link BetaDistribution}  type.
 */
  public class BetaDistributionBuilder {
  
     private fr.obeo.dsl.guesstimate.BetaDistribution beingBuilt = fr.obeo.dsl.guesstimate.GuesstimateFactory.eINSTANCE
             .createBetaDistribution();
      /**
       * @generated
       */
       protected fr.obeo.dsl.guesstimate.BetaDistribution getBeingBuilt() {
           return this.beingBuilt;
       }
       
      /**
       * @generated
       */
       public fr.obeo.dsl.guesstimate.BetaDistribution build() {
           return this.getBeingBuilt();
       }

    /** 
     * @param values :The EDouble to set as alpha.
     * @generated
     */
    public BetaDistributionBuilder alpha( java.lang.Double value) {
        getBeingBuilt().setAlpha(value);
        return this;
    }
    /** 
     * @param values :The EDouble to set as beta.
     * @generated
     */
    public BetaDistributionBuilder beta( java.lang.Double value) {
        getBeingBuilt().setBeta(value);
        return this;
    }
}
