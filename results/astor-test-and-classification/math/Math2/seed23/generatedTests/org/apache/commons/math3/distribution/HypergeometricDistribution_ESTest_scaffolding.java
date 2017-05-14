/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Jan 25 09:47:52 GMT 2017
 */

package org.apache.commons.math3.distribution;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class HypergeometricDistribution_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.math3.distribution.HypergeometricDistribution"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  public static void setSystemProperties() {
 
    /*No java.lang.System property to set*/
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(HypergeometricDistribution_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.math3.exception.util.ExceptionContextProvider",
      "org.apache.commons.math3.exception.NotANumberException",
      "org.apache.commons.math3.random.Well44497b",
      "org.apache.commons.math3.random.RandomDataImpl",
      "org.apache.commons.math3.random.AbstractWell",
      "org.apache.commons.math3.random.RandomData",
      "org.apache.commons.math3.exception.util.ArgUtils",
      "org.apache.commons.math3.exception.NumberIsTooSmallException",
      "org.apache.commons.math3.exception.OutOfRangeException",
      "org.apache.commons.math3.util.FastMath$ExpIntTable",
      "org.apache.commons.math3.util.FastMath$lnMant",
      "org.apache.commons.math3.exception.MathInternalError",
      "org.apache.commons.math3.exception.NotPositiveException",
      "org.apache.commons.math3.random.SynchronizedRandomGenerator",
      "org.apache.commons.math3.exception.MathIllegalStateException",
      "org.apache.commons.math3.random.BitsStreamGenerator",
      "org.apache.commons.math3.util.FastMath$ExpFracTable",
      "org.apache.commons.math3.exception.MathIllegalArgumentException",
      "org.apache.commons.math3.distribution.AbstractIntegerDistribution",
      "org.apache.commons.math3.exception.MathIllegalNumberException",
      "org.apache.commons.math3.exception.util.LocalizedFormats",
      "org.apache.commons.math3.distribution.HypergeometricDistribution",
      "org.apache.commons.math3.distribution.IntegerDistribution",
      "org.apache.commons.math3.util.FastMath",
      "org.apache.commons.math3.exception.util.Localizable",
      "org.apache.commons.math3.exception.NumberIsTooLargeException",
      "org.apache.commons.math3.distribution.SaddlePointExpansion",
      "org.apache.commons.math3.random.Well19937c",
      "org.apache.commons.math3.random.RandomDataGenerator",
      "org.apache.commons.math3.exception.NotStrictlyPositiveException",
      "org.apache.commons.math3.random.RandomGenerator",
      "org.apache.commons.math3.exception.util.ExceptionContext",
      "org.apache.commons.math3.exception.NotFiniteNumberException",
      "org.apache.commons.math3.util.FastMathLiteralArrays",
      "org.apache.commons.math3.random.Well1024a",
      "org.apache.commons.math3.random.Well512a"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(HypergeometricDistribution_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math3.distribution.AbstractIntegerDistribution",
      "org.apache.commons.math3.distribution.HypergeometricDistribution",
      "org.apache.commons.math3.exception.util.LocalizedFormats",
      "org.apache.commons.math3.util.FastMath",
      "org.apache.commons.math3.util.FastMathLiteralArrays",
      "org.apache.commons.math3.util.FastMath$lnMant",
      "org.apache.commons.math3.distribution.SaddlePointExpansion",
      "org.apache.commons.math3.special.Gamma",
      "org.apache.commons.math3.util.FastMath$ExpIntTable",
      "org.apache.commons.math3.util.FastMath$ExpFracTable",
      "org.apache.commons.math3.random.BitsStreamGenerator",
      "org.apache.commons.math3.random.AbstractWell",
      "org.apache.commons.math3.random.Well19937c",
      "org.apache.commons.math3.random.RandomDataImpl",
      "org.apache.commons.math3.random.RandomDataGenerator",
      "org.apache.commons.math3.exception.MathIllegalArgumentException",
      "org.apache.commons.math3.exception.MathIllegalNumberException",
      "org.apache.commons.math3.exception.NumberIsTooSmallException",
      "org.apache.commons.math3.exception.NotStrictlyPositiveException",
      "org.apache.commons.math3.exception.util.ExceptionContext",
      "org.apache.commons.math3.random.Well44497b",
      "org.apache.commons.math3.random.Well512a",
      "org.apache.commons.math3.exception.NotPositiveException",
      "org.apache.commons.math3.exception.NumberIsTooLargeException",
      "org.apache.commons.math3.random.RandomAdaptor",
      "org.apache.commons.math3.random.Well19937a",
      "org.apache.commons.math3.random.Well1024a",
      "org.apache.commons.math3.random.MersenneTwister",
      "org.apache.commons.math3.random.Well44497a",
      "org.apache.commons.math3.exception.OutOfRangeException",
      "org.apache.commons.math3.random.JDKRandomGenerator",
      "org.apache.commons.math3.random.ISAACRandom",
      "org.apache.commons.math3.exception.MathIllegalStateException",
      "org.apache.commons.math3.exception.MathInternalError"
    );
  }
}
