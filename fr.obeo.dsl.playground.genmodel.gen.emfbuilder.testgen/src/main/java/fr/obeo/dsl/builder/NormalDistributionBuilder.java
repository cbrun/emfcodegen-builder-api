package fr.obeo.dsl.builder;

/**
 *  A builder for the {@link NormalDistribution}  type.
 */
  public class NormalDistributionBuilder {
  
     private fr.obeo.dsl.guesstimate.NormalDistribution beingBuilt = fr.obeo.dsl.guesstimate.GuesstimateFactory.eINSTANCE
             .createNormalDistribution();
      /**
       * @generated
       */
       protected fr.obeo.dsl.guesstimate.NormalDistribution getBeingBuilt() {
           return this.beingBuilt;
       }
       
      /**
       * @generated
       */
       public fr.obeo.dsl.guesstimate.NormalDistribution build() {
           return this.getBeingBuilt();
       }

    /** 
     * @param values :The EDouble to set as mean.
     * @generated
     */
    public NormalDistributionBuilder mean( java.lang.Double value) {
        getBeingBuilt().setMean(value);
        return this;
    }
    /** 
     * @param values :The EDouble to set as sd.
     * @generated
     */
    public NormalDistributionBuilder sd( java.lang.Double value) {
        getBeingBuilt().setSd(value);
        return this;
    }
}
