/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 25 05:55:13 GMT 2017
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.BrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BrentSolver_ESTest extends BrentSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      UnivariateRealFunction univariateRealFunction0 = quinticFunction0.derivative();
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      double double0 = brentSolver0.solve(univariateRealFunction0, (-1986.1155681843827), 1.0E-6, 0.0);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-6, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) sinFunction0);
      double double0 = brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-819.1545553772345), 1.0E-15);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) expm1Function0);
      double double0 = brentSolver0.solve(univariateRealFunction0, (-564.031753849), 0.0);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals((-564.031753849), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      brentSolver0.functionValueAccuracy = (-1.0);
      Expm1Function expm1Function0 = new Expm1Function();
      double double0 = brentSolver0.solve((UnivariateRealFunction) expm1Function0, (-1693.9709895092), 1.0, 0.0);
      assertEquals(1, brentSolver0.getIterationCount());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
      double double0 = brentSolver0.solve(univariateRealFunction0, (-1202.124295), 1909.1512713, 5.0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, brentSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) sinFunction0);
      double double0 = brentSolver0.solve((-598.1), 1.0, 0.0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, brentSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      double double0 = brentSolver0.solve((-598.1), 1.0, 0.0);
      assertEquals(20, brentSolver0.getIterationCount());
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) expm1Function0);
      double double0 = brentSolver0.solve((-598.1), 1.0, (-15.647363209722966));
      assertEquals(10, brentSolver0.getIterationCount());
      assertEquals((-8.716389609881157E-9), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) quinticFunction0);
      double double0 = brentSolver0.solve((-3233.97), 533.57297377);
      assertEquals(38, brentSolver0.getIterationCount());
      assertEquals(0.9999998433617939, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) expm1Function0);
      double double0 = brentSolver0.solve((-3233.97), 533.57297377);
      assertEquals(19, brentSolver0.getIterationCount());
      assertEquals((-8.039661201019923E-9), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) expm1Function0);
      // Undeclared exception!
      try { 
        brentSolver0.solve((UnivariateRealFunction) quinticFunction0, 1.0, (-1587.792803425), (-3867.7734));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid interval, initial value parameters:  lower=1, initial=-3,867.773, upper=-1,587.793
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      try { 
        brentSolver0.solve((UnivariateRealFunction) null, (-1318.0), 0.0, (-11.57380905716468));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      brentSolver0.setMaximalIterationCount((-281404851));
      try { 
        brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-1.0), 3533.8836);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (-281,404,851) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      try { 
        brentSolver0.solve((UnivariateRealFunction) null, 569.0, 2742.52422093);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      brentSolver0.setMaximalIterationCount((-5047919));
      try { 
        brentSolver0.solve((-598.1), 1.0, 0.0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (-5,047,919) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      try { 
        brentSolver0.solve((-3936.2261), 807.35391652, (-2044.99655516));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) quinticFunction0);
      // Undeclared exception!
      try { 
        brentSolver0.solve((-3233.97), (-3233.97));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-3,233.97, -3,233.97]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BrentSolver brentSolver0 = null;
      try {
        brentSolver0 = new BrentSolver((UnivariateRealFunction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function to solve cannot be null
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) expm1Function0);
      double double0 = brentSolver0.solve(univariateRealFunction0, (-1563.487551), (-564.031753849));
      assertEquals((-1563.487551), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver();
      double double0 = brentSolver0.solve((UnivariateRealFunction) quinticFunction0, (-2626.467336), 1.344636325546155);
      assertEquals(19, brentSolver0.getIterationCount());
      assertEquals(1.0000000000064813, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver();
      brentSolver0.setAbsoluteAccuracy((-1.0));
      double double0 = brentSolver0.solve((UnivariateRealFunction) quinticFunction0, (-1563.487551), 599.0640081055111);
      assertEquals(34, brentSolver0.getIterationCount());
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      UnivariateRealFunction univariateRealFunction0 = quinticFunction0.derivative();
      BrentSolver brentSolver0 = new BrentSolver();
      brentSolver0.setAbsoluteAccuracy((-1.0));
      brentSolver0.setRelativeAccuracy((-1.0));
      try { 
        brentSolver0.solve(univariateRealFunction0, (-464.16956206857066), 1221.7279, 175.95400365413428);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) expm1Function0);
      double double0 = brentSolver0.solve((UnivariateRealFunction) expm1Function0, Double.NaN, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) quinticFunction0);
      double double0 = brentSolver0.solve(0.0, 533.7611719713607);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      try { 
        brentSolver0.solve((UnivariateRealFunction) expm1Function0, 1.1885958883778937E-10, 781.150871);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs.  Endpoints: [0, 781.151], Values: [0, \u221E]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) sinFunction0);
      double double0 = brentSolver0.solve((UnivariateRealFunction) sinFunction0, 1.0E-15, 1.5);
      assertEquals(1.0E-15, double0, 0.01);
      assertEquals(0, brentSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) sinFunction0);
      double double0 = brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-847.647814), 1.0E-15);
      assertEquals(1.0E-15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double double0 = brentSolver0.solve((UnivariateRealFunction) quinticFunction0, (-2625.609), 1451.83229173587, (-576.832401));
      assertEquals(32, brentSolver0.getIterationCount());
      assertEquals((-1.0000001206950846), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) expm1Function0);
      double double0 = brentSolver0.solve((UnivariateRealFunction) quinticFunction0, (-4277.72827), 0.0, (-1563.487551));
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver();
      double double0 = brentSolver0.solve((UnivariateRealFunction) quinticFunction0, (-464.16956206857066), 1221.7279, 175.95400365413428);
      assertEquals(24, brentSolver0.getIterationCount());
      assertEquals(1.0000000290815292, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver();
      double double0 = brentSolver0.solve((UnivariateRealFunction) sinFunction0, 1.0E-15, 2257.762940278153, 1840.6748666772814);
      assertEquals(1.0E-15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      try { 
        brentSolver0.solve(0.8330567840754435, (-1693.9709895092), 1.0E-6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid interval, initial value parameters:  lower=0.833, initial=0, upper=-1,693.971
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      try { 
        brentSolver0.solve(0.0, 489.85314);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) sinFunction0);
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-2.4496649866766593E-14), 1.5063505998114124E-12, 1.0E-15);
      assertEquals(0, brentSolver0.getIterationCount());
  }
}
