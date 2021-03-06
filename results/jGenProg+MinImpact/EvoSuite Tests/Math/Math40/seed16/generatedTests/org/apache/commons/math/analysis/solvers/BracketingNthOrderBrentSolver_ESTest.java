/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 15 19:58:28 GMT 2017
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
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateFunction univariateFunction0 = expm1Function0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, (-2132.4105314516), 1.0, 0.0, allowedSolution0);
      assertEquals((-2132.4105314516), double0, 0.01);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      bracketingNthOrderBrentSolver0.solve(2616, (UnivariateFunction) expm1Function0, (-637.36), Double.NaN, 0.0, allowedSolution0);
      double double0 = bracketingNthOrderBrentSolver0.doSolve();
      assertEquals(0.0, double0, 0.01);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-498.5175104171989), (-498.5175104171989), 982);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      bracketingNthOrderBrentSolver0.solve(982, (UnivariateFunction) xMinus5Function0, (-498.5175104171989), Double.NaN, (double) 982);
      double double0 = bracketingNthOrderBrentSolver0.doSolve();
      assertEquals(5.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 0.0, 0.0, 2);
      SincFunction sincFunction0 = new SincFunction();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateFunction) sincFunction0);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve(0, (UnivariateFunction) monitoredFunction0, (-1925.7422004), 0.0, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve(688, (UnivariateFunction) sinFunction0, (double) 688, (double) 688, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [688, 688]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve(3074, (UnivariateFunction) sincFunction0, (-19.91613736745514), (double) 3074, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-19.916, 3,074], values: [0.044, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SincFunction sincFunction0 = new SincFunction();
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve(1719, (UnivariateFunction) sincFunction0, 0.5, (double) 1719, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.3283478021621704, 0.3283478021621704, 0.3283478021621704, Integer.MAX_VALUE);
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve(Integer.MAX_VALUE, (UnivariateFunction) sinFunction0, 0.3283478021621704, 0.3283478021621704, allowedSolution0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-56.04071311171352), 5);
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve((-4445), (UnivariateFunction) sinFunction0, (double) 5, Double.NaN, Double.NaN, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-4,445) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve(1719, (UnivariateFunction) sincFunction0, 857.6547944291161, (double) 1719, (double) 1719, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,719, 1,719]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(2768.465428, 2768.465428, Double.NaN, 1659);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      UnivariateFunction univariateFunction0 = quinticFunction0.derivative();
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve(1659, univariateFunction0, 0.5, 2768.465428, (double) 1659, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(2768.465428, 2768.465428, Double.NaN, 1659);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      bracketingNthOrderBrentSolver0.setup((-1806), quinticFunction0, 8.781732866483302E-6, 0.0, Double.NaN);
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.doSolve();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,806) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(25.34537814259606, 25.34537814259606, 2);
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
  public void test13()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SincFunction sincFunction0 = new SincFunction();
      UnivariateFunction univariateFunction0 = sincFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(1719, univariateFunction0, 0.5, (double) 1719, allowedSolution0);
      assertEquals(859.2244269170527, double0, 0.01);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(1719, (UnivariateFunction) sincFunction0, 0.5, (double) 1719, allowedSolution0);
      assertEquals(857.654794444373, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-16.504404454435022), 902);
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(902, (UnivariateFunction) sincFunction0, (-9.484876E-5), (double) 902, allowedSolution0);
      assertEquals(449.2477494633404, double0, 0.01);
      assertEquals(902, bracketingNthOrderBrentSolver0.getMaximalOrder());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(1025, (UnivariateFunction) sincFunction0, (-19.91613736745514), (double) 1025, allowedSolution0);
      assertEquals(499.51323192076796, double0, 0.01);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      bracketingNthOrderBrentSolver0.solve(1742, (UnivariateFunction) expm1Function0, (-25.360523366727346), (double) 1742, allowedSolution0);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(1719, (UnivariateFunction) expm1Function0, (-25.360523366727346), (double) 1719, allowedSolution0);
      assertEquals((-5.389410695499919E-9), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(2768.465428, 2768.465428, Double.NaN, 1659);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      UnivariateFunction univariateFunction0 = quinticFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(1659, univariateFunction0, 0.5, 2768.465428, (double) 1659, allowedSolution0);
      assertEquals(0.5, bracketingNthOrderBrentSolver0.getMin(), 0.01);
      assertEquals(0.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-2.5500395730290193), (-2.5500395730290193), 902);
      SincFunction sincFunction0 = new SincFunction();
      UnivariateFunction univariateFunction0 = sincFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(902, univariateFunction0, (-9.484875573712004E-5), (double) 902, allowedSolution0);
      assertEquals(902, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(598.4717295877078, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(1.0E-14, 1.0E-14, (-1082.8033679912228), 4);
      SincFunction sincFunction0 = new SincFunction();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateFunction) sincFunction0);
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve(4, (UnivariateFunction) monitoredFunction0, 1485.6, 0.0, Double.NaN, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [1,485.6, 0], values: [0, 1]
         //
         verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(2768.465428, 2768.465428, Double.NaN, 1659);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(1659, (UnivariateFunction) quinticFunction0, (double) 1659, 0.0, Double.NaN, allowedSolution0);
      assertEquals(1659.0, bracketingNthOrderBrentSolver0.getMin(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateFunction univariateFunction0 = expm1Function0.derivative();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(univariateFunction0);
      bracketingNthOrderBrentSolver0.solve(1032, (UnivariateFunction) monitoredFunction0, (-1085.97228626787));
      assertEquals(1, monitoredFunction0.getCallsCount());
      
      double double0 = bracketingNthOrderBrentSolver0.doSolve();
      assertEquals((-1085.97228626787), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = null;
      try {
        bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(2282.344288619, (double) 1719, (double) 1719, (-10));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -10 is smaller than the minimum (2)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = null;
      try {
        bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(2145.1863851937032, 2145.1863851937032, (-1351));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1,351 is smaller than the minimum (2)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = null;
      try {
        bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(1.0E-14, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than the minimum (2)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(1722, (UnivariateFunction) expm1Function0, (-3.4787517134947734), (double) 1722, allowedSolution0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      int int0 = bracketingNthOrderBrentSolver0.getMaximalOrder();
      assertEquals(5, int0);
  }
}
