package fr.obeo.dsl.builder;

public class GuesstimateBuilders {

            
    /**
      * Create a new builder for the type Variable.
      * 
      * @see fr.obeo.dsl.guesstimate.Variable
      * @return the newly created builder for the type Variable.
      */
      public VariableBuilder newVariable() {
          return new VariableBuilder();
      }
            
    /**
      * Create a new builder for the type NormalDistribution.
      * The normal distribution is a continuous probability distribution that is symmetrical around its mean, forming a bell-shaped curve. It's defined by the mean (µ) and standard deviation (σ), with most data points falling close to the mean and probabilities tapering off equally in both directions. Use it for modeling natural phenomena like heights, test scores, or any situation where the Central Limit Theorem applies, such as averaging a large number of independent variables.
      * @see fr.obeo.dsl.guesstimate.NormalDistribution
      * @return the newly created builder for the type NormalDistribution.
      */
      public NormalDistributionBuilder newNormalDistribution() {
          return new NormalDistributionBuilder();
      }
            
    /**
      * Create a new builder for the type LogNormalDistribution.
      * The lognormal distribution is a continuous probability distribution where the logarithm of the variable follows a normal distribution. Defined by the mean (µ) and standard deviation (σ) of the variable's natural logarithm, it is right-skewed and suitable for modeling data that grows multiplicatively, such as stock prices, investment returns, and the sizes of biological organisms.
      * @see fr.obeo.dsl.guesstimate.LogNormalDistribution
      * @return the newly created builder for the type LogNormalDistribution.
      */
      public LogNormalDistributionBuilder newLogNormalDistribution() {
          return new LogNormalDistributionBuilder();
      }
            
    /**
      * Create a new builder for the type UniformDistribution.
      * The uniform distribution is a continuous probability distribution where all outcomes are equally likely within a specified range, defined by minimum (a) and maximum (b) values. This distribution forms a flat, rectangular shape and is ideal for modeling scenarios with equally likely outcomes, like generating random numbers or simulating the roll of a fair die.
      * @see fr.obeo.dsl.guesstimate.UniformDistribution
      * @return the newly created builder for the type UniformDistribution.
      */
      public UniformDistributionBuilder newUniformDistribution() {
          return new UniformDistributionBuilder();
      }
            
    /**
      * Create a new builder for the type BetaDistribution.
      * The beta distribution is a continuous probability distribution defined on the interval [0, 1], often used to model probabilities themselves. With two shape parameters, α (alpha) and β (beta), it can take various forms (uniform, U-shaped, etc.), making it useful for modeling the probability of success in Bernoulli trials when the probability is not fixed, or in Bayesian statistics as a conjugate prior for binomial proportions.
      * @see fr.obeo.dsl.guesstimate.BetaDistribution
      * @return the newly created builder for the type BetaDistribution.
      */
      public BetaDistributionBuilder newBetaDistribution() {
          return new BetaDistributionBuilder();
      }
            
    /**
      * Create a new builder for the type TriangularDistribution.
      * The triangular distribution is a continuous probability distribution with a triangular-shaped probability density function, defined by three parameters: the minimum value (a), the maximum value (b), and the mode (c), which is the peak of the triangle. It is used when the exact distribution of data is unknown but a rough estimate with a known minimum, maximum, and most likely value can be provided. Common applications include project management for estimating the duration of tasks and in decision-making scenarios where limited sample data is available.
      * @see fr.obeo.dsl.guesstimate.TriangularDistribution
      * @return the newly created builder for the type TriangularDistribution.
      */
      public TriangularDistributionBuilder newTriangularDistribution() {
          return new TriangularDistributionBuilder();
      }
            
    /**
      * Create a new builder for the type BinomialDistribution.
      * The binomial distribution is a discrete probability distribution that describes the number of successes in a fixed number of independent Bernoulli trials, each with the same probability of success (p). Defined by the number of trials (n) and probability of success (p), it is ideal for scenarios like modeling the number of heads in a series of coin tosses or the number of defective items in a batch of products.
      * @see fr.obeo.dsl.guesstimate.BinomialDistribution
      * @return the newly created builder for the type BinomialDistribution.
      */
      public BinomialDistributionBuilder newBinomialDistribution() {
          return new BinomialDistributionBuilder();
      }
            
    /**
      * Create a new builder for the type FormulaSetting.
      * A variable which is defined by a formula using other variables.
      * @see fr.obeo.dsl.guesstimate.FormulaSetting
      * @return the newly created builder for the type FormulaSetting.
      */
      public FormulaSettingBuilder newFormulaSetting() {
          return new FormulaSettingBuilder();
      }
            
    /**
      * Create a new builder for the type Sheet.
      * 
      * @see fr.obeo.dsl.guesstimate.Sheet
      * @return the newly created builder for the type Sheet.
      */
      public SheetBuilder newSheet() {
          return new SheetBuilder();
      }
            
    /**
      * Create a new builder for the type PoissonDistribution.
      * The Poisson distribution is a discrete probability distribution that expresses the probability of a given number of events occurring in a fixed interval of time or space. Defined by the rate parameter (λ), it is suitable for modeling count data, such as the number of emails received per hour or the number of accidents at a traffic intersection in a day.
      * @see fr.obeo.dsl.guesstimate.PoissonDistribution
      * @return the newly created builder for the type PoissonDistribution.
      */
      public PoissonDistributionBuilder newPoissonDistribution() {
          return new PoissonDistributionBuilder();
      }
            
    /**
      * Create a new builder for the type ExponentialDistribution.
      * The exponential distribution is a continuous probability distribution often used to model the time between events in a Poisson process. Characterized by the rate parameter (λ), it has a peak at zero and a long tail extending to the right. Common applications include modeling waiting times, such as the time between arrivals in a queue or the lifespan of products.
      * @see fr.obeo.dsl.guesstimate.ExponentialDistribution
      * @return the newly created builder for the type ExponentialDistribution.
      */
      public ExponentialDistributionBuilder newExponentialDistribution() {
          return new ExponentialDistributionBuilder();
      }
            
    /**
      * Create a new builder for the type GammaDistribution.
      * The gamma distribution is a continuous probability distribution that generalizes the exponential distribution by allowing the rate parameter to be variable. Defined by shape (k) and scale (θ) parameters, it is useful for modeling waiting times with multiple stages, such as the time until the k-th event in a queuing process.
      * @see fr.obeo.dsl.guesstimate.GammaDistribution
      * @return the newly created builder for the type GammaDistribution.
      */
      public GammaDistributionBuilder newGammaDistribution() {
          return new GammaDistributionBuilder();
      }

}
