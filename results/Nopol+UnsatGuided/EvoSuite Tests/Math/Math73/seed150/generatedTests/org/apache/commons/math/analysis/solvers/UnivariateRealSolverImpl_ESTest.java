/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 12 14:33:22 GMT 2017
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
      MullerSolver mullerSolver0 = new MullerSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      try { 
        mullerSolver0.solve((UnivariateRealFunction) sinFunction0, (-43.3403398461733), 4.0, 4.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid interval, initial value parameters:  lower=-43.34, initial=4, upper=4
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      boolean boolean0 = bisectionSolver0.isSequence(0.0, 0.0, 0.0);
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      RiddersSolver riddersSolver0 = new RiddersSolver();
      // Undeclared exception!
      try { 
        riddersSolver0.solve((UnivariateRealFunction) expm1Function0, 1.0E-15, 2433.3504);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs.  Endpoints: [0, 2,433.35], Values: [0, \u221E]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) expm1Function0);
      boolean boolean0 = laguerreSolver0.isBracketing(0.0, (-1.0), monitoredFunction0);
      assertFalse(boolean0);
      assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      bisectionSolver0.setFunctionValueAccuracy(0.0);
      bisectionSolver0.resetFunctionValueAccuracy();
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      mullerSolver0.verifyInterval((-2661.7), 1.0E-15);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      bisectionSolver0.clearResult();
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(0, bisectionSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      boolean boolean0 = riddersSolver0.isSequence((-2524.3765), (-2323.425759), 2299.52666677166);
      assertEquals(1.0E-15, riddersSolver0.getFunctionValueAccuracy(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      laguerreSolver0.setResult(0.0, 0);
      laguerreSolver0.getResult();
      assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(0, laguerreSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      laguerreSolver0.setResult(1.0E-6, (-1160));
      laguerreSolver0.getResult();
      assertEquals(-1160, laguerreSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
      newtonSolver0.setResult((-1.0), (-1.0), 4494);
      double double0 = newtonSolver0.getResult();
      assertEquals(4494, newtonSolver0.getIterationCount());
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      laguerreSolver0.functionValueAccuracy = 0.0;
      double double0 = laguerreSolver0.getFunctionValueAccuracy();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
      newtonSolver0.functionValueAccuracy = (-2212.883766);
      double double0 = newtonSolver0.getFunctionValueAccuracy();
      assertEquals((-2212.883766), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      laguerreSolver0.setResult(0.0, 94);
      laguerreSolver0.getFunctionValue();
      assertEquals(94, laguerreSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      laguerreSolver0.setResult(1.0, 1.0, 0);
      double double0 = laguerreSolver0.getFunctionValue();
      assertEquals(1.0, double0, 0.01);
      assertEquals(0, laguerreSolver0.getIterationCount());
      assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
      secantSolver0.setResult(1839.1672, 1839.1672, (-326));
      secantSolver0.functionValue = (double) (-326);
      double double0 = secantSolver0.getFunctionValue();
      assertEquals(-326, secantSolver0.getIterationCount());
      assertEquals((-326.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      // Undeclared exception!
      try { 
        mullerSolver0.verifySequence(0.0, (-239.8075), 382.0706838);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid interval, initial value parameters:  lower=0, initial=-239.808, upper=382.071
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      // Undeclared exception!
      try { 
        mullerSolver0.verifyInterval(0.0, (-294.81));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, -294.81]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      try { 
        secantSolver0.verifyBracketing(2355.895346783, 2355.895346783, sinFunction0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,355.895, 2,355.895]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
      // Undeclared exception!
      try { 
        secantSolver0.verifyBracketing(108.195397821, 3144.48583, (UnivariateRealFunction) null);
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
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      try { 
        brentSolver0.isBracketing(0.0, 0.0, (UnivariateRealFunction) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      try { 
        laguerreSolver0.checkResultComputed();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no result available
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      try { 
        mullerSolver0.solve((UnivariateRealFunction) sinFunction0, (-2239.84807194442), 2164.660863);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs.  Endpoints: [-2,239.848, 2,164.661], Values: [-0.107, -0.103]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      riddersSolver0.verifySequence(2.2250738585072014E-308, 0.08001578014814752, 2843.0);
      assertEquals(1.0E-15, riddersSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
      boolean boolean0 = secantSolver0.isSequence(1418.93557, 2796, 508);
      assertEquals(1.0E-15, secantSolver0.getFunctionValueAccuracy(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      laguerreSolver0.verifyBracketing((-213.33), 1709.188006, expm1Function0);
      assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) quinticFunction0);
      boolean boolean0 = newtonSolver0.isBracketing(4.0, (-2212.883766), monitoredFunction0);
      assertEquals(1.0E-15, newtonSolver0.getFunctionValueAccuracy(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(univariateRealFunction0);
      boolean boolean0 = riddersSolver0.isBracketing((-209.047), (-817.5203899078), monitoredFunction0);
      assertEquals(1.0E-15, riddersSolver0.getFunctionValueAccuracy(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      boolean boolean0 = secantSolver0.isBracketing((-383.574360401), 0.0, quinticFunction0);
      assertEquals(1.0E-15, secantSolver0.getFunctionValueAccuracy(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      laguerreSolver0.setResult(0.0, (-1160));
      laguerreSolver0.checkResultComputed();
      assertEquals(-1160, laguerreSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
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
  public void test31()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      laguerreSolver0.setResult(2.0, 0.0, (-1160));
      assertEquals(-1160, laguerreSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      bisectionSolver0.setFunctionValueAccuracy(1499.357309022);
      assertEquals(1499.357309022, bisectionSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      // Undeclared exception!
      try { 
        laguerreSolver0.getResult();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no result available
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      double double0 = laguerreSolver0.getFunctionValueAccuracy();
      assertEquals(1.0E-15, double0, 0.01);
  }
}
