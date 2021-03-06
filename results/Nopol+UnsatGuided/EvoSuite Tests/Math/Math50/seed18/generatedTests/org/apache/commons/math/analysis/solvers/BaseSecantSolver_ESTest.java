/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 10 22:40:28 GMT 2017
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
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.XMinus5Function;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      double double0 = pegasusSolver0.solve(227, (UnivariateRealFunction) xMinus5Function0, (-1.0), (double) 227, (-1.0));
      assertEquals((-1.0), pegasusSolver0.getMin(), 0.01);
      assertEquals(5.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BaseSecantSolver.Method[] baseSecantSolver_MethodArray0 = BaseSecantSolver.Method.values();
      assertNotNull(baseSecantSolver_MethodArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BaseSecantSolver.Method.valueOf("REGULA_FALSI");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1.0));
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(17, (UnivariateRealFunction) quinticFunction0, 0.0, (-1.0), allowedSolution0);
      assertEquals((-1.0), regulaFalsiSolver0.getMax(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.19999999999923582, (-1070.0));
      QuinticFunction quinticFunction0 = new QuinticFunction();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) quinticFunction0);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(27, (UnivariateRealFunction) monitoredFunction0, (-1.0), (-1.0), allowedSolution0);
      assertEquals((-1.0), pegasusSolver0.getMin(), 0.01);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(9.220590270857665E-9, 0.0, 0.0);
      SincFunction sincFunction0 = new SincFunction();
      UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
      double double0 = illinoisSolver0.solve(4, univariateRealFunction0, 0.0, (double) 4, 1.0E-6);
      assertEquals(1.0E-6, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, (-1884.86));
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(univariateRealFunction0);
      double double0 = pegasusSolver0.solve(2694, (UnivariateRealFunction) monitoredFunction0, 0.0, (-1884.86), 0.0);
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-1884.86), double0, 0.01);
      assertEquals(0.0, pegasusSolver0.getMin(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) expm1Function0);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-1), (UnivariateRealFunction) monitoredFunction0, (double) (-1), 1455.688, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0);
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(2306, (UnivariateRealFunction) expm1Function0, 1.2246467991473532E-16, (-588.37830704), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, -588.378]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0);
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(0, (UnivariateRealFunction) null, (double) 0, 0.0, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-801), (UnivariateRealFunction) expm1Function0, (double) (-801), 1893.4791262, (double) (-801), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-801) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, (-1.0), 0.0);
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(227, (UnivariateRealFunction) sincFunction0, (double) 227, 4.9E-324, (-228.0248187404287), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [227, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.058823529411764705, (-1547.3109361));
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(4, (UnivariateRealFunction) xMinus5Function0, (-1547.3109361), 0.058823529411764705, 0.058823529411764705, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-1,547.311, 0.059], values: [-1,552.311, -4.941]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1.0), (-1.0));
      SincFunction sincFunction0 = new SincFunction();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(0, (UnivariateRealFunction) sincFunction0, (-1931.4), (-1.0), (-1.0));
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
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1.0), 0.7853981633974483);
      SincFunction sincFunction0 = new SincFunction();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(39, (UnivariateRealFunction) sincFunction0, 4.0, 0.7853981633974483, 0.7853981633974483);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [4, 0.785]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1.0));
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(0, (UnivariateRealFunction) null, (-4031.88), (double) 0, 0.08713622391223907);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(3892.7032);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-361.7872), 0.0);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) quinticFunction0);
      pegasusSolver0.setup(106, monitoredFunction0, (-361.7872), (-2493.6953938), 0.0);
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-361.787, -2,493.695]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1.0), (-1.0), (-1.0));
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      regulaFalsiSolver0.setup(2, univariateRealFunction0, 1.3245471311735498E-8, 1287.14, 1.3245471311735498E-8);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0, 1,287.14], values: [1, 0.611]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(1878, (UnivariateRealFunction) sinFunction0, (-486.3), 1.625, 29.189039182181823, allowedSolution0);
      assertEquals(29.189039182181823, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-219.91148554688124), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(950, univariateRealFunction0, (-22.4), (double) 950, (-22.4), allowedSolution0);
      assertEquals((-22.4), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(695.247555454348, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(Double.POSITIVE_INFINITY);
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      pegasusSolver0.solve(2116891581, univariateRealFunction0, (-22.4), (double) 2116891581, (-22.4), allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals((-22.4), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(1.139399777543923E9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1.0), 0.7853981633974483);
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(39, (UnivariateRealFunction) sincFunction0, 3.3636031800315114, (double) 39, allowedSolution0);
      assertEquals(3.3636031800315114, regulaFalsiSolver0.getMin(), 0.01);
      assertEquals(31.008582337760895, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1.5);
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(70, (UnivariateRealFunction) sincFunction0, (double) 70, 720.103288882, allowedSolution0);
      assertEquals(395.051644441, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(687.9327606718497, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1.0), (-1.0));
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(746, (UnivariateRealFunction) sincFunction0, 1.0E-6, 4.0, allowedSolution0);
      assertEquals(2.0000005, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(950, univariateRealFunction0, (-22.4), (double) 950, (-22.4), allowedSolution0);
      assertEquals((-22.4), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(695.247555454348, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(931, univariateRealFunction0, (-22.4), (double) 931, (-22.4), allowedSolution0);
      assertEquals((-22.4), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(610.9178455671902, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      pegasusSolver0.solve(931, univariateRealFunction0, (-22.4), (double) 931, (-22.4), allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals((-22.4), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-22.4), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(950, univariateRealFunction0, (-22.4), (double) 950, (-22.4), allowedSolution0);
      assertEquals((-22.4), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(950.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1.0), 0.7853981633974483);
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(2146760832, (UnivariateRealFunction) sincFunction0, 0.7853981633974483, 3.3636031800315114, (-871.896342), allowedSolution0);
      assertEquals((-871.896342), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = pegasusSolver0.solve(950, univariateRealFunction0, (-22.723829792422418), (double) 950, (-22.723829792422418), allowedSolution0);
      assertEquals((-22.723829792422418), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(653.6409875724768, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1.5);
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(70, (UnivariateRealFunction) sincFunction0, (double) 70, 720.103288882, allowedSolution0);
      assertEquals(395.051644441, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(687.9327606718497, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(1878, (UnivariateRealFunction) expm1Function0, (-486.3), 1.625, 29.189039182181823, allowedSolution0);
      assertEquals(29.189039182181823, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, (-3594.52218));
      SinFunction sinFunction0 = new SinFunction();
      pegasusSolver0.setup(44532, sinFunction0, 1.0E-6, 0.0, 2.0813231423926306E-5);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(10.478942041689834, 10.478942041689834, 1844.0);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      illinoisSolver0.solve(2713, (UnivariateRealFunction) quinticFunction0, (-3589.3092531), 725.36218753966, 2156.45932);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(410.086543597118, (-268.7287), (-268.7287));
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(3396, (UnivariateRealFunction) monitoredFunction0, 1.0, 410.086543597118, allowedSolution0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.MonitoredFunction", e);
      }
  }
}
