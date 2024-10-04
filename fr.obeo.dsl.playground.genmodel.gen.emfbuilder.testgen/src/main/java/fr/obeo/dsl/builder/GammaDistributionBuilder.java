package fr.obeo.dsl.builder;

/**
 *  A builder for the {@link GammaDistribution}  type.
 */
  public class GammaDistributionBuilder {
  
     private fr.obeo.dsl.guesstimate.GammaDistribution beingBuilt = fr.obeo.dsl.guesstimate.GuesstimateFactory.eINSTANCE
             .createGammaDistribution();
      /**
       * @generated
       */
       protected fr.obeo.dsl.guesstimate.GammaDistribution getBeingBuilt() {
           return this.beingBuilt;
       }
       
      /**
       * @generated
       */
       public fr.obeo.dsl.guesstimate.GammaDistribution build() {
           return this.getBeingBuilt();
       }

    /** 
     * @param values :The EDouble to set as shape.
     * @generated
     */
    public GammaDistributionBuilder shape( java.lang.Double value) {
        getBeingBuilt().setShape(value);
        return this;
    }
    /** 
     * @param values :The EDouble to set as scale.
     * @generated
     */
    public GammaDistributionBuilder scale( java.lang.Double value) {
        getBeingBuilt().setScale(value);
        return this;
    }
}
