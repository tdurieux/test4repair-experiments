/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 14 10:22:23 GMT 2017
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
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) quinticFunction0);
      brentSolver0.setAbsoluteAccuracy((-2518.974));
      double double0 = brentSolver0.solve((UnivariateRealFunction) quinticFunction0, (-2518.974), 5.3228671228972975E-8);
      assertEquals(6, brentSolver0.getIterationCount());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) quinticFunction0);
      double double0 = brentSolver0.solve((UnivariateRealFunction) quinticFunction0, 1.0E-15, 874.691979630232);
      assertEquals(1.0E-15, double0, 0.01);
      assertEquals(0, brentSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) sinFunction0);
      double double0 = brentSolver0.solve((-1180.1722294190165), 32.591168827885355, (-375.0));
      assertEquals(13, brentSolver0.getIterationCount());
      assertEquals((-50.26548221388166), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) sinFunction0);
      double double0 = brentSolver0.solve((-2518.974), (-15.42539092935884));
      assertEquals(16, brentSolver0.getIterationCount());
      assertEquals((-2428.451121206995), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      try { 
        brentSolver0.solve((UnivariateRealFunction) expm1Function0, 1266.91, 1.0E-6, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid interval, initial value parameters:  lower=1,266.91, initial=0, upper=0
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      try { 
        brentSolver0.solve((UnivariateRealFunction) null, (-3124.8659), 0.0, (-375.0));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) quinticFunction0);
      brentSolver0.setMaximalIterationCount((-1));
      try { 
        brentSolver0.solve((UnivariateRealFunction) quinticFunction0, (-2518.987546175705), 5.3228671228972975E-8);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (-1) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      try { 
        brentSolver0.solve((UnivariateRealFunction) null, 261.13073588592, 2911.8332);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) expm1Function0);
      // Undeclared exception!
      try { 
        brentSolver0.solve(1.0E-15, 3.24379540670198, 1655.50805);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid interval, initial value parameters:  lower=0, initial=1,655.508, upper=3.244
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) quinticFunction0);
      brentSolver0.setMaximalIterationCount(1);
      try { 
        brentSolver0.solve((-2360.033740952), 5592.894206);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (1) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      try { 
        brentSolver0.solve(1.0E-15, 31.40693);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double double0 = brentSolver0.solve((UnivariateRealFunction) quinticFunction0, Double.NaN, 0.005428069011084102);
      assertEquals(0.005428069011084102, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) sinFunction0);
      brentSolver0.functionValueAccuracy = 0.25;
      double double0 = brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-3072.0), 1.0E-14);
      assertEquals(1.0E-14, double0, 0.01);
      assertEquals(0, brentSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) sinFunction0);
      // Undeclared exception!
      try { 
        brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-3072.0), 1.0E-14);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs.  Endpoints: [-3,072, 0], Values: [0.46, 0]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) sinFunction0);
      double double0 = brentSolver0.solve((UnivariateRealFunction) sinFunction0, 1.0E-15, 1293.1408646002844, 5.322867122897271E-8);
      assertEquals(1.0E-15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) sinFunction0);
      double double0 = brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-2518.974), 2.0, 1.0E-15);
      assertEquals(1.0E-15, double0, 0.01);
      assertEquals(0, brentSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) quinticFunction0);
      brentSolver0.setAbsoluteAccuracy(Double.NaN);
      try { 
        brentSolver0.solve(1.5631048081973747E-11, 2138.3271650231027, 874.691979630232);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) quinticFunction0);
      double double0 = brentSolver0.solve(1.5631048081973747E-11, 2138.3271650231027, 874.691979630232);
      assertEquals(31, brentSolver0.getIterationCount());
      assertEquals(874.691979630232, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) expm1Function0);
      double double0 = brentSolver0.solve((UnivariateRealFunction) expm1Function0, 2.0, 2271.196968307076, 776.874598);
      assertEquals(31, brentSolver0.getIterationCount());
      assertEquals(1773.0895115019496, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) sinFunction0);
      double double0 = brentSolver0.solve((UnivariateRealFunction) quinticFunction0, (-2516.851784186391), 16.9407345198581);
      assertEquals(39, brentSolver0.getIterationCount());
      assertEquals((-0.9999999393941413), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) sinFunction0);
      double double0 = brentSolver0.solve((UnivariateRealFunction) sinFunction0, 1.0E-15, 16.9407345198581);
      assertEquals(1.0E-15, double0, 0.01);
      assertEquals(0, brentSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      brentSolver0.setMaximalIterationCount((-1830));
      try { 
        brentSolver0.solve((UnivariateRealFunction) expm1Function0, (-3111.016173), 1.0E-15, (-375.0));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (-1,830) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) sinFunction0);
      double double0 = brentSolver0.solve((-1845.411138614884), 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) sinFunction0);
      brentSolver0.functionValueAccuracy = 1.0E-14;
      double double0 = brentSolver0.solve((-2518.974), 1.0E-14);
      assertEquals(1.0E-14, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver();
      double double0 = brentSolver0.solve((UnivariateRealFunction) sinFunction0, 1.0E-15, 76.0);
      assertEquals(1.0E-15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      double double0 = brentSolver0.solve((UnivariateRealFunction) expm1Function0, 0.0, 0.5);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double double0 = brentSolver0.solve((UnivariateRealFunction) quinticFunction0, (-4178.52619), (-1023.1834292948), (-1422.9346427));
      assertEquals(29, brentSolver0.getIterationCount());
      assertEquals((-1023.1834292948), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      double double0 = brentSolver0.solve((UnivariateRealFunction) expm1Function0, (-3124.8659), 0.0, (-375.0));
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, brentSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double double0 = brentSolver0.solve((UnivariateRealFunction) quinticFunction0, (-614.52), 1.5975230370336937E-6, 7.815485805470498E-12);
      assertEquals(1, brentSolver0.getIterationCount());
      assertEquals(7.815485805470498E-12, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) expm1Function0);
      double double0 = brentSolver0.solve(0.0, 3.24379540670198, 1.0E-15);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, brentSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) quinticFunction0);
      double double0 = brentSolver0.solve((-170.797276077887), 1669.0994747561438, 1.0E-15);
      assertEquals(1.0E-15, double0, 0.01);
      assertEquals(0, brentSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      try { 
        brentSolver0.solve((-1.0), 2745.9481090808, 0.0);
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
      // Undeclared exception!
      try { 
        brentSolver0.solve((-2518.974), 1.0E-14);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs.  Endpoints: [-2,518.974, 0], Values: [0.551, 0]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }
}