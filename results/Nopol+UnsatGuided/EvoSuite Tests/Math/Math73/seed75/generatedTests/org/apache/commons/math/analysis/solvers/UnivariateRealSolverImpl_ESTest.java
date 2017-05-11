/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 12 06:25:10 GMT 2017
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.apache.commons.math.analysis.solvers.BrentSolver;
import org.apache.commons.math.analysis.solvers.LaguerreSolver;
import org.apache.commons.math.analysis.solvers.MullerSolver;
import org.apache.commons.math.analysis.solvers.NewtonSolver;
import org.apache.commons.math.analysis.solvers.RiddersSolver;
import org.apache.commons.math.analysis.solvers.SecantSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UnivariateRealSolverImpl_ESTest extends UnivariateRealSolverImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      try { 
        laguerreSolver0.solve((UnivariateRealFunction) expm1Function0, (-1760.2), 0.5, 0.5);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid interval, initial value parameters:  lower=-1,760.2, initial=0.5, upper=0.5
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      try { 
        riddersSolver0.solve((UnivariateRealFunction) expm1Function0, (-970.6), (-1.0), (-1.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs.  Endpoints: [-970.6, -1], Values: [-1, -0.632]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      try { 
        mullerSolver0.solve((UnivariateRealFunction) expm1Function0, 3.75, 773.6009212826867);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs.  Endpoints: [3.75, 773.601], Values: [41.521, \u221E]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
      boolean boolean0 = laguerreSolver0.isBracketing((-1115.1038308458396), (-1166.7505), univariateRealFunction0);
      assertFalse(boolean0);
      assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      laguerreSolver0.defaultFunctionValueAccuracy = 1.0;
      assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
      
      laguerreSolver0.resetFunctionValueAccuracy();
      assertEquals(1.0, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      laguerreSolver0.setFunctionValueAccuracy(1273.694);
      assertEquals(1273.694, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
      newtonSolver0.verifyInterval((-4372.9964386739775), 0.0);
      assertEquals(1.0E-15, newtonSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
      SinFunction sinFunction0 = new SinFunction();
      newtonSolver0.verifyBracketing(4.0, 4.421463594783848E14, sinFunction0);
      assertEquals(1.0E-15, newtonSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) expm1Function0);
      secantSolver0.solve((UnivariateRealFunction) monitoredFunction0, 0.0, 1012.757411553878, (-1.0));
      secantSolver0.checkResultComputed();
      assertEquals(0, secantSolver0.getIterationCount());
      assertEquals(1.0E-15, secantSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      laguerreSolver0.clearResult();
      assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(0, laguerreSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      bisectionSolver0.isSequence((-17.177125963522865), 1.0, 2127.742);
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
      boolean boolean0 = secantSolver0.isSequence(0.0, 0.0, 0.0);
      assertEquals(1.0E-15, secantSolver0.getFunctionValueAccuracy(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      bisectionSolver0.setResult(1646.534718577157, 768);
      double double0 = bisectionSolver0.getResult();
      assertEquals(768, bisectionSolver0.getIterationCount());
      assertEquals(1646.534718577157, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      riddersSolver0.setResult((-620.02580492902), (-620.02580492902), 262);
      double double0 = riddersSolver0.getResult();
      assertEquals(262, riddersSolver0.getIterationCount());
      assertEquals((-620.02580492902), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
      secantSolver0.functionValueAccuracy = (-1164.80845047);
      double double0 = secantSolver0.getFunctionValueAccuracy();
      assertEquals((-1164.80845047), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
      secantSolver0.setResult(3025.0017291422, 3025.0017291422, 0);
      double double0 = secantSolver0.getFunctionValue();
      assertEquals(3025.0017291422, double0, 0.01);
      assertEquals(1.0E-15, secantSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(0, secantSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      // Undeclared exception!
      try { 
        mullerSolver0.verifySequence(644.0264939859076, 1.0E-15, 644.0264939859076);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid interval, initial value parameters:  lower=644.026, initial=0, upper=644.026
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
      // Undeclared exception!
      try { 
        secantSolver0.verifyInterval((-1927.092634849996), (-1927.092634849996));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-1,927.093, -1,927.093]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      // Undeclared exception!
      try { 
        mullerSolver0.verifyBracketing(0.0, 378.77862188052313, (UnivariateRealFunction) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.isBracketing(0.0, (-928.2632075), (UnivariateRealFunction) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      try { 
        riddersSolver0.checkResultComputed();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no result available
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) sinFunction0, 2.6970309243852144, (-2258.6), 1617.1305);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2.697, -2,258.6]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      laguerreSolver0.verifySequence((-2559), 4.0, 3783.961);
      assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      try { 
        newtonSolver0.verifyBracketing((-227.8617284596), 0.0, quinticFunction0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs.  Endpoints: [-227.862, 0], Values: [-614,251,861,618.873, 0]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      SinFunction sinFunction0 = new SinFunction();
      double double0 = mullerSolver0.solve((UnivariateRealFunction) sinFunction0, 1.0E-15, 646.936552);
      assertEquals(13, mullerSolver0.getIterationCount());
      assertEquals(644.0264939859076, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      boolean boolean0 = laguerreSolver0.isBracketing(4020.69808, (-1.0), quinticFunction0);
      assertFalse(boolean0);
      assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      SinFunction sinFunction0 = new SinFunction();
      boolean boolean0 = laguerreSolver0.isBracketing((-1032.345994), (-670.0), sinFunction0);
      assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      laguerreSolver0.resultComputed = true;
      laguerreSolver0.getFunctionValue();
      assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) expm1Function0);
      secantSolver0.solve((UnivariateRealFunction) monitoredFunction0, 0.0, 1012.757411553878, (-1.0));
      secantSolver0.getResult();
      assertEquals(1.0E-15, secantSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(0, secantSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      // Undeclared exception!
      try { 
        laguerreSolver0.getFunctionValue();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no result available
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      brentSolver0.setResult((-1079.4773783), (-201.8888599146), 94);
      double double0 = brentSolver0.getFunctionValue();
      assertEquals(94, brentSolver0.getIterationCount());
      assertEquals((-201.8888599146), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      brentSolver0.setFunctionValueAccuracy(0.0);
      double double0 = brentSolver0.getFunctionValueAccuracy();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
      // Undeclared exception!
      try { 
        secantSolver0.getResult();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no result available
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      double double0 = brentSolver0.getFunctionValueAccuracy();
      assertEquals(1.0E-15, double0, 0.01);
  }
}