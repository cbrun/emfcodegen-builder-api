package fr.obeo.dsl.builder;

/**
 *  A builder for the {@link TriangularDistribution}  type.
 */
  public class TriangularDistributionBuilder {
  
     private fr.obeo.dsl.guesstimate.TriangularDistribution beingBuilt = fr.obeo.dsl.guesstimate.GuesstimateFactory.eINSTANCE
             .createTriangularDistribution();
      /**
       * @generated
       */
       protected fr.obeo.dsl.guesstimate.TriangularDistribution getBeingBuilt() {
           return this.beingBuilt;
       }
       
      /**
       * @generated
       */
       public fr.obeo.dsl.guesstimate.TriangularDistribution build() {
           return this.getBeingBuilt();
       }

    /** 
     * @param values :The EDouble to set as min.
     * @generated
     */
    public TriangularDistributionBuilder min( java.lang.Double value) {
        getBeingBuilt().setMin(value);
        return this;
    }
    /** 
     * @param values :The EDouble to set as max.
     * @generated
     */
    public TriangularDistributionBuilder max( java.lang.Double value) {
        getBeingBuilt().setMax(value);
        return this;
    }
    /** 
     * @param values :The EDouble to set as mode.
     * @generated
     */
    public TriangularDistributionBuilder mode( java.lang.Double value) {
        getBeingBuilt().setMode(value);
        return this;
    }
}
