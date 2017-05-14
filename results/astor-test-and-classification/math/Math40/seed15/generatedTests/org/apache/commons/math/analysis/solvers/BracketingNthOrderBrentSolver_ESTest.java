/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 15 22:58:36 GMT 2017
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.XMinus5Function;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BracketingNthOrderBrentSolver_ESTest extends BracketingNthOrderBrentSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve(3, (UnivariateFunction) sincFunction0, (-2815.114934629), (-271.7321416), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (3) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve((-1620), (UnivariateFunction) expm1Function0, (double) (-1620), (double) (-1620), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-1,620, -1,620]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve(835, (UnivariateFunction) sinFunction0, (double) 835, (double) 835, (double) 835, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [835, 835]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-5601.8231293414), 4);
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve(4, (UnivariateFunction) null, (-5601.8231293414), (-1306.91), (double) 4, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      bracketingNthOrderBrentSolver0.solve(1, (UnivariateFunction) sinFunction0, 0.0);
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.doSolve();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (1) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      bracketingNthOrderBrentSolver0.setup(95, expm1Function0, 95, 2364.38, 1911.51614934081);
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [95, 2,364.38], values: [181,123,908,288,902,330,000,000,000,000,000,000,000,000, \u221E]
         //
         verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(17, (UnivariateFunction) sincFunction0, (-377.6963), (-271.7321416), allowedSolution0);
      assertEquals((-364.424747816416), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(38.42537172291224, 845);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(2451, (UnivariateFunction) xMinus5Function0, 8.37461329738237E-13, (double) 845, 38.42537172291224, allowedSolution0);
      assertEquals(8.37461329738237E-13, double0, 0.01);
      assertEquals(845, bracketingNthOrderBrentSolver0.getMaximalOrder());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1109.0536464964132), 659);
      SincFunction sincFunction0 = new SincFunction();
      UnivariateFunction univariateFunction0 = sincFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(659, univariateFunction0, (-2103.0267964071113), 2734.5, allowedSolution0);
      assertEquals((-2100.154212769303), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((double) 992, (double) 992, (double) 992, 992);
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      bracketingNthOrderBrentSolver0.solve(992, (UnivariateFunction) expm1Function0, (-9.438168176533759E-290), 3.0786025796370757, allowedSolution0);
      double double0 = bracketingNthOrderBrentSolver0.doSolve();
      assertEquals(1.5393012898185379, double0, 0.01);
      assertEquals(992, bracketingNthOrderBrentSolver0.getMaximalOrder());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(17, (UnivariateFunction) sincFunction0, (-2815.114934629), (-271.7321416), allowedSolution0);
      assertEquals((-2312.2121922342594), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SincFunction sincFunction0 = new SincFunction();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateFunction) sincFunction0);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(17, (UnivariateFunction) monitoredFunction0, (-2815.114934629), (-271.7321416), allowedSolution0);
      assertEquals(15, monitoredFunction0.getCallsCount());
      assertEquals((-2312.212193092579), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(3893, (UnivariateFunction) sinFunction0, (-952.31198054361), (double) 3893, (double) 835, allowedSolution0);
      assertEquals((-153.938040025899), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1109.0536464964132), 659);
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      bracketingNthOrderBrentSolver0.solve(659, (UnivariateFunction) sincFunction0, (-2103.0267964071113), 2734.5, allowedSolution0);
      double double0 = bracketingNthOrderBrentSolver0.doSolve();
      assertEquals(659, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals((-1856.681258271568), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 442);
      SinFunction sinFunction0 = new SinFunction();
      UnivariateFunction univariateFunction0 = sinFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(442, univariateFunction0, 5.0, 83.8537, allowedSolution0);
      assertEquals(44.42685, bracketingNthOrderBrentSolver0.getStartValue(), 0.01);
      assertEquals(70.68583470577035, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(130.39425103427, 130.39425103427, 5);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      double double0 = bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) xMinus5Function0, 0.0, (double) 5);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(5.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-61.0), (-3468.432632401302), 0.0, 2);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(709702, (UnivariateFunction) sinFunction0, (-145.43538), Double.NaN, 0.0, allowedSolution0);
      assertEquals((-145.43538), bracketingNthOrderBrentSolver0.getMin(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = null;
      try {
        bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((double) 442, 5.0, (double) 442, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than the minimum (2)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((double) 992, (double) 992, (double) 992, 992);
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve(992, (UnivariateFunction) expm1Function0, (-9.438168176533759E-290), 2.3984878190403553E-145, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-0, 0], values: [-0, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = null;
      try {
        bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((double) 408, (double) 408, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 is smaller than the minimum (2)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(3878.6732874277754, 3878.6732874277754, 992);
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      bracketingNthOrderBrentSolver0.solve(992, (UnivariateFunction) expm1Function0, 0.0, 0.6006163358688354, allowedSolution0);
      double double0 = bracketingNthOrderBrentSolver0.doSolve();
      assertEquals(0.0, double0, 0.01);
      assertEquals(992, bracketingNthOrderBrentSolver0.getMaximalOrder());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = null;
      try {
        bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(1877.87512285158, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than the minimum (2)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve((-1), (UnivariateFunction) quinticFunction0, (-1.0), 2131.88328, 880.8012497212264, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1094.8437917261344), 659);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      bracketingNthOrderBrentSolver0.solve(659, (UnivariateFunction) quinticFunction0, (-2103.0267964071113), 2734.5, allowedSolution0);
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1094.8437917261344), 659);
      int int0 = bracketingNthOrderBrentSolver0.getMaximalOrder();
      assertEquals(659, int0);
  }
}
