package fr.obeo.dsl.builder;

/**
 *  A builder for the {@link LogNormalDistribution}  type.
 */
  public class LogNormalDistributionBuilder {
  
     private fr.obeo.dsl.guesstimate.LogNormalDistribution beingBuilt = fr.obeo.dsl.guesstimate.GuesstimateFactory.eINSTANCE
             .createLogNormalDistribution();
      /**
       * @generated
       */
       protected fr.obeo.dsl.guesstimate.LogNormalDistribution getBeingBuilt() {
           return this.beingBuilt;
       }
       
      /**
       * @generated
       */
       public fr.obeo.dsl.guesstimate.LogNormalDistribution build() {
           return this.getBeingBuilt();
       }

    /** 
     * @param values :The EDouble to set as scale.
     * @generated
     */
    public LogNormalDistributionBuilder scale( java.lang.Double value) {
        getBeingBuilt().setScale(value);
        return this;
    }
    /** 
     * @param values :The EDouble to set as shape.
     * @generated
     */
    public LogNormalDistributionBuilder shape( java.lang.Double value) {
        getBeingBuilt().setShape(value);
        return this;
    }
}
