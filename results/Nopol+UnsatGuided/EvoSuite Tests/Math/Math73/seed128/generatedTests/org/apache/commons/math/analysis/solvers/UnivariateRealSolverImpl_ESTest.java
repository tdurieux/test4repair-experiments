/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 12 11:59:17 GMT 2017
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
      SecantSolver secantSolver0 = new SecantSolver();
      // Undeclared exception!
      try { 
        secantSolver0.solve((UnivariateRealFunction) null, 0.0, (-1906.677782221216));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, -1,906.678]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      // Undeclared exception!
      try { 
        laguerreSolver0.verifySequence((-3114.78162306), (-704.68664676553), (-704.68664676553));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid interval, initial value parameters:  lower=-3,114.782, initial=-704.687, upper=-704.687
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      try { 
        brentSolver0.solve((UnivariateRealFunction) expm1Function0, (-1.0), 1401.958017, (-2741.7570763969));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid interval, initial value parameters:  lower=-1, initial=-2,741.757, upper=1,401.958
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) quinticFunction0);
      // Undeclared exception!
      try { 
        mullerSolver0.solve((UnivariateRealFunction) monitoredFunction0, 901.8825905233024, 1359.70432855824);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs.  Endpoints: [901.883, 1,359.704], Values: [596,690,812,164,969.6, 4,647,528,984,089,569]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      SinFunction sinFunction0 = new SinFunction();
      boolean boolean0 = riddersSolver0.isBracketing(0.0, 6.283185307179586, sinFunction0);
      assertEquals(1.0E-15, riddersSolver0.getFunctionValueAccuracy(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      riddersSolver0.setFunctionValueAccuracy(17.14124497403868);
      assertEquals(17.14124497403868, riddersSolver0.getFunctionValueAccuracy(), 0.01);
      
      riddersSolver0.resetFunctionValueAccuracy();
      assertEquals(1.0E-15, riddersSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      laguerreSolver0.verifySequence((-892), 6.283185307179586, 43.645998041554);
      assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      brentSolver0.verifyInterval((-3072.5303352109904), Double.NaN);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      brentSolver0.verifyBracketing((-2129.672304), 1.5, quinticFunction0);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
      newtonSolver0.setResult(2.0, (-4089));
      newtonSolver0.checkResultComputed();
      assertEquals(-4089, newtonSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      boolean boolean0 = riddersSolver0.isSequence((-1797.7537643707967), 1.0E-15, 2754.3397987954);
      assertTrue(boolean0);
      assertEquals(1.0E-15, riddersSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      riddersSolver0.resultComputed = true;
      riddersSolver0.getResult();
      assertEquals(1.0E-15, riddersSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      riddersSolver0.result = 3380.602;
      riddersSolver0.resultComputed = true;
      double double0 = riddersSolver0.getResult();
      assertEquals(3380.602, double0, 0.01);
      assertEquals(1.0E-15, riddersSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      brentSolver0.setResult((-2.0), 0);
      double double0 = brentSolver0.getResult();
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals((-2.0), double0, 0.01);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      brentSolver0.setResult((-2.0), 0);
      double double0 = brentSolver0.getFunctionValue();
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, brentSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      mullerSolver0.setResult((-548.95333615041), (-1158.19472590266), 0);
      double double0 = mullerSolver0.getFunctionValue();
      assertEquals((-1158.19472590266), double0, 0.01);
      assertEquals(0, mullerSolver0.getIterationCount());
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      // Undeclared exception!
      try { 
        riddersSolver0.verifyBracketing(231.4, 1223.755933554063, (UnivariateRealFunction) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      try { 
        brentSolver0.isBracketing(0.0, (-56.7623), (UnivariateRealFunction) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      try { 
        bisectionSolver0.checkResultComputed();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no result available
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) quinticFunction0);
      // Undeclared exception!
      try { 
        secantSolver0.verifyBracketing((-2175.26397), 0.0, monitoredFunction0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs.  Endpoints: [-2,175.264, 0], Values: [-48,703,449,017,571,680, 0]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      // Undeclared exception!
      try { 
        laguerreSolver0.verifySequence(1.0E-15, 896.258538798, 1.0E-15);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid interval, initial value parameters:  lower=0, initial=896.259, upper=0
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      // Undeclared exception!
      try { 
        mullerSolver0.verifyInterval(1.0E-15, 1.0E-15);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      boolean boolean0 = riddersSolver0.isSequence((-3057.0), 0.9999999999999999, (-2098.848211136095));
      assertFalse(boolean0);
      assertEquals(1.0E-15, riddersSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      boolean boolean0 = laguerreSolver0.isSequence((-678.60985385855), (-678.60985385855), 0.0);
      assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) expm1Function0);
      boolean boolean0 = riddersSolver0.isBracketing((-892), (-1.0), monitoredFunction0);
      assertFalse(boolean0);
      assertEquals(1.0E-15, riddersSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
      boolean boolean0 = riddersSolver0.isBracketing(1413.5413587661349, (-1834.3081), univariateRealFunction0);
      assertEquals(1.0E-15, riddersSolver0.getFunctionValueAccuracy(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      boolean boolean0 = riddersSolver0.isBracketing(1413.5413587661349, (-1834.3081), expm1Function0);
      assertEquals(1.0E-15, riddersSolver0.getFunctionValueAccuracy(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      laguerreSolver0.clearResult();
      assertEquals(0, laguerreSolver0.getIterationCount());
      assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      // Undeclared exception!
      try { 
        riddersSolver0.getFunctionValue();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no result available
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      riddersSolver0.setResult(1276.87364934451, 1276.87364934451, (-2693));
      double double0 = riddersSolver0.getFunctionValue();
      assertEquals(-2693, riddersSolver0.getIterationCount());
      assertEquals(1276.87364934451, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01);
      
      bisectionSolver0.setFunctionValueAccuracy((-1.0));
      double double0 = bisectionSolver0.getFunctionValueAccuracy();
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      try { 
        brentSolver0.getResult();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no result available
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      double double0 = bisectionSolver0.getFunctionValueAccuracy();
      assertEquals(1.0E-15, double0, 0.01);
  }
}