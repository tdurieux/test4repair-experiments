/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 18 01:06:35 GMT 2017
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
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.XMinus5Function;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
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
      NewtonSolver newtonSolver0 = new NewtonSolver((-1253.0565269));
      newtonSolver0.verifySequence((-1253.0565269), 3827.6, Double.NaN);
      assertEquals(1.0E-15, newtonSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals((-1253.0565269), newtonSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-14, newtonSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      bisectionSolver0.verifyInterval(1.0E-15, 93.625981);
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((double) 1864, 705.98474, 1864);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve(1864, (UnivariateFunction) quinticFunction0, 705.98474, (double) 1864, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [705.985, 1,864], values: [175,378,148,068,701.38, 22,502,428,158,710,608]
         //
         verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver(1059.81);
      SinFunction sinFunction0 = new SinFunction();
      newtonSolver0.solve(586, (DifferentiableUnivariateFunction) sinFunction0, 0.037378571927547455, 0.037378571927547455);
      newtonSolver0.verifyBracketing(0.0, 1.0E-15);
      assertEquals(0.037378571927547455, newtonSolver0.getStartValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(988.6362226724042, 1.0E-6, (-2.0));
      boolean boolean0 = laguerreSolver0.isSequence((-2358.6382255385), 0, 0.0625);
      assertEquals(1.0E-6, laguerreSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals((-2.0), laguerreSolver0.getFunctionValueAccuracy(), 0.01);
      assertTrue(boolean0);
      assertEquals(988.6362226724042, laguerreSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      bisectionSolver0.solve(298, (UnivariateFunction) expm1Function0, 0.0, 0.5);
      boolean boolean0 = bisectionSolver0.isBracketing((-1725.2156587177574), 1.0E-15);
      assertEquals(0.5, bisectionSolver0.getMax(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver(0.5);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      mullerSolver0.setup(0, xMinus5Function0, 1.0E-15, (-656.6661156226673), (-3607.83542476167));
      mullerSolver0.isBracketing(1.0E-15, 0.0);
      assertEquals(1.0E-15, mullerSolver0.getMin(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      bisectionSolver0.solve(298, (UnivariateFunction) expm1Function0, 0.0, 0.5);
      bisectionSolver0.computeObjectiveValue(0.0);
      assertEquals(0.5, bisectionSolver0.getMax(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MullerSolver2 mullerSolver2_0 = new MullerSolver2();
      // Undeclared exception!
      try { 
        mullerSolver2_0.verifySequence(0.0, 0.0, 2.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.verifyInterval(0.0, (-1726.7430669234059));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, -1,726.743]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver(0.0, 1621.1975476);
      Expm1Function expm1Function0 = new Expm1Function();
      riddersSolver0.setup(1, expm1Function0, 0.0, 0, 0.0);
      // Undeclared exception!
      try { 
        riddersSolver0.verifyBracketing((-1.0), (-1.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-1, -1]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver((-29.1913698));
      // Undeclared exception!
      try { 
        secantSolver0.setup(24, (UnivariateFunction) null, 1.0, 0, 0);
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
      BisectionSolver bisectionSolver0 = new BisectionSolver((-1433.724597838972), (-1433.724597838972));
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateFunction) null);
      bisectionSolver0.setup(0, monitoredFunction0, 0, (-2.0), (-2.0));
      // Undeclared exception!
      try { 
        bisectionSolver0.isBracketing(0, 32.17464724800647);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.MonitoredFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MullerSolver2 mullerSolver2_0 = new MullerSolver2(2821.800232553854);
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
  public void test14()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
      try { 
        secantSolver0.computeObjectiveValue(1.0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      try { 
        secantSolver0.solve((-1561), (UnivariateFunction) sinFunction0, (double) (-1561), (double) (-1561), (double) (-1561));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,561) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver((-1433.724597838972), (-1433.724597838972));
      // Undeclared exception!
      try { 
        bisectionSolver0.isBracketing(0, 32.17464724800647);
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
      MullerSolver2 mullerSolver2_0 = new MullerSolver2();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      try { 
        mullerSolver2_0.solve(0, (UnivariateFunction) sinFunction0, (double) 0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver(1059.81);
      // Undeclared exception!
      try { 
        newtonSolver0.verifyBracketing(0.0, 1.0E-15);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver((-1433.724597838972), (-1433.724597838972));
      boolean boolean0 = bisectionSolver0.isSequence(1698.18, 32.17464724800647, 1477.850371545);
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals((-1433.724597838972), bisectionSolver0.getRelativeAccuracy(), 0.01);
      assertEquals((-1433.724597838972), bisectionSolver0.getAbsoluteAccuracy(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver(1059.81);
      SinFunction sinFunction0 = new SinFunction();
      newtonSolver0.solve(586, (DifferentiableUnivariateFunction) sinFunction0, 0.037378571927547455, 0.037378571927547455);
      double double0 = newtonSolver0.computeObjectiveValue((-82.6341440923));
      assertEquals(0.037378571927547455, newtonSolver0.getStartValue(), 0.01);
      assertEquals((-0.8150034211381738), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver(1059.81);
      newtonSolver0.getEvaluations();
      assertEquals(1059.81, newtonSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-15, newtonSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-14, newtonSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      bisectionSolver0.solve(298, (UnivariateFunction) expm1Function0, 0.0, 0.5);
      double double0 = bisectionSolver0.computeObjectiveValue(93.625981);
      assertEquals(0.25, bisectionSolver0.getStartValue(), 0.01);
      assertEquals(4.584024299049549E40, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver((-1433.724597838972), (-1433.724597838972));
      bisectionSolver0.getMaxEvaluations();
      assertEquals((-1433.724597838972), bisectionSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals((-1433.724597838972), bisectionSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01);
  }
}