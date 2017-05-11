/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 12 19:37:09 GMT 2017
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.DifferentiableUnivariateFunction;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.apache.commons.math.analysis.solvers.BrentSolver;
import org.apache.commons.math.analysis.solvers.LaguerreSolver;
import org.apache.commons.math.analysis.solvers.MullerSolver;
import org.apache.commons.math.analysis.solvers.MullerSolver2;
import org.apache.commons.math.analysis.solvers.NewtonSolver;
import org.apache.commons.math.analysis.solvers.RiddersSolver;
import org.apache.commons.math.analysis.solvers.SecantSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
      newtonSolver0.verifyInterval(4.0, 171);
      assertEquals(0.0, newtonSolver0.getStartValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver(0.0625, 0.0, 0.0625);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      brentSolver0.solve(430, (UnivariateFunction) quinticFunction0, (double) 0);
      brentSolver0.incrementEvaluationCount();
      assertEquals(Double.NaN, brentSolver0.getMax(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver(1745.1457971884);
      SincFunction sincFunction0 = new SincFunction();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateFunction) sincFunction0);
      secantSolver0.setup(2262, monitoredFunction0, 2262, 3655.58, 1745.1457971884);
      double double0 = secantSolver0.doSolve();
      assertEquals(1745.1457971884, secantSolver0.getStartValue(), 0.01);
      assertEquals(2378.481787079628, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver(0.0625, 0.0, 0.0);
      boolean boolean0 = brentSolver0.isSequence((-26.0), 1.0, 1518.24);
      assertTrue(boolean0);
      assertEquals(0.0, brentSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(0.0, brentSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(0.0625, brentSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver(0.0625, 0.0, 0.0625);
      SinFunction sinFunction0 = new SinFunction();
      brentSolver0.solve(307, (UnivariateFunction) sinFunction0, 0.0625);
      boolean boolean0 = brentSolver0.isBracketing(0.0, 0.0625);
      assertEquals(Double.NaN, brentSolver0.getMin(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver(0.0625, 0.0, 0.0625);
      SinFunction sinFunction0 = new SinFunction();
      UnivariateFunction univariateFunction0 = sinFunction0.derivative();
      brentSolver0.setup((-1484), univariateFunction0, (-1484), 3296.3, 0.0);
      brentSolver0.isBracketing(0.0, 0.0625);
      assertEquals(3296.3, brentSolver0.getMax(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      mullerSolver0.solve(2143, (UnivariateFunction) expm1Function0, 0.0);
      mullerSolver0.computeObjectiveValue(0.0);
      assertEquals(Double.NaN, mullerSolver0.getMax(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
      SincFunction sincFunction0 = new SincFunction();
      newtonSolver0.solve(171, (DifferentiableUnivariateFunction) sincFunction0, (-1804.0455575754734), 0.0);
      newtonSolver0.computeObjectiveValue(171);
      assertEquals(Double.NaN, newtonSolver0.getMin(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver((-253.34328289909));
      // Undeclared exception!
      try { 
        mullerSolver0.verifySequence((-186.278), (-253.34328289909), (-186.278));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-186.278, -253.343]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver(1.0E-15, 1.0E-15);
      // Undeclared exception!
      try { 
        bisectionSolver0.verifyInterval(1.0E-15, 1.0E-15);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      NewtonSolver newtonSolver0 = new NewtonSolver((-684.867198482575));
      newtonSolver0.setup((-736), sincFunction0, 0.0, 0.5, 1.0E-15);
      // Undeclared exception!
      try { 
        newtonSolver0.verifyBracketing(533.59990298194, 1.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [533.6, 1]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      // Undeclared exception!
      try { 
        riddersSolver0.setup(0, (UnivariateFunction) null, 0.0, 0.0, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MullerSolver2 mullerSolver2_0 = new MullerSolver2();
      // Undeclared exception!
      try { 
        mullerSolver2_0.incrementEvaluationCount();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      try { 
        brentSolver0.computeObjectiveValue(0.0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(278, (PolynomialFunction) null, 1633.1746095807757, (double) 278, (double) 278);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver(0.0625, 0.0, 0.0);
      // Undeclared exception!
      try { 
        brentSolver0.isBracketing(0.0, 0.0625);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver((-684.867198482575));
      // Undeclared exception!
      try { 
        newtonSolver0.verifyBracketing(533.59990298194, 1.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      boolean boolean0 = mullerSolver0.isSequence(576.50884429, 3044.688822242, (-3068.244));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      mullerSolver0.solve(2143, (UnivariateFunction) expm1Function0, 0.0);
      double double0 = mullerSolver0.computeObjectiveValue((-8.670112037940065));
      assertEquals(Double.NaN, mullerSolver0.getMax(), 0.01);
      assertEquals((-0.9998283601270306), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver(0.0625, 0.0, 0.0);
      brentSolver0.getMaxEvaluations();
      assertEquals(0.0, brentSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(0.0, brentSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(0.0625, brentSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MullerSolver2 mullerSolver2_0 = new MullerSolver2((-489.289926366017));
      mullerSolver2_0.verifySequence((-489.289926366017), (-1.0), 2743.583631254675);
      assertEquals(1.0E-15, mullerSolver2_0.getFunctionValueAccuracy(), 0.01);
      assertEquals((-489.289926366017), mullerSolver2_0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-14, mullerSolver2_0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver(0.0625, 0.0, 0.0);
      brentSolver0.getEvaluations();
      assertEquals(0.0625, brentSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(0.0, brentSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(0.0, brentSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MullerSolver2 mullerSolver2_0 = new MullerSolver2((-489.289926366017));
      SincFunction sincFunction0 = new SincFunction();
      double double0 = mullerSolver2_0.solve(4939, (UnivariateFunction) sincFunction0, (-1401.5520293241261), (-489.289926366017));
      assertEquals((-1401.5520293241261), mullerSolver2_0.getMin(), 0.01);
      assertEquals((-904.7786842338613), double0, 0.01);
  }
}