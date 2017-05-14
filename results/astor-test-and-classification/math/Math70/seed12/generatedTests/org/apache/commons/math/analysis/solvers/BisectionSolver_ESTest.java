/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 14 12:23:53 GMT 2017
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BisectionSolver_ESTest extends BisectionSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      UnivariateRealFunction univariateRealFunction0 = quinticFunction0.derivative();
      BisectionSolver bisectionSolver0 = new BisectionSolver(univariateRealFunction0);
      bisectionSolver0.setAbsoluteAccuracy(0.0);
      double double0 = bisectionSolver0.solve(0.0, 2298.803, 0.0);
      assertEquals(52, bisectionSolver0.getIterationCount());
      assertEquals(2298.803, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) quinticFunction0);
      double double0 = bisectionSolver0.solve((UnivariateRealFunction) quinticFunction0, (-0.9999999411671889), 0.0, 0.0);
      assertEquals(19, bisectionSolver0.getIterationCount());
      assertEquals((-0.5000004474207246), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) quinticFunction0);
      double double0 = bisectionSolver0.solve((UnivariateRealFunction) quinticFunction0, (-1422.191), 0.9999999224898466);
      assertEquals(30, bisectionSolver0.getIterationCount());
      assertEquals((-7.842355514642835E-9), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) quinticFunction0);
      double double0 = bisectionSolver0.solve((-2259.73718385), 3472.576538424, 3472.576538424);
      assertEquals(32, bisectionSolver0.getIterationCount());
      assertEquals((-0.9999996889164263), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) quinticFunction0);
      double double0 = bisectionSolver0.solve(0.0, 4386.495290864);
      assertEquals(32, bisectionSolver0.getIterationCount());
      assertEquals(2.553276304891333E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) quinticFunction0);
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) quinticFunction0, (-327.0), (-327.0), (-327.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-327, -327]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      SinFunction sinFunction0 = new SinFunction();
      bisectionSolver0.setMaximalIterationCount((-2142));
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) sinFunction0, 0.25, 1326.441955, 1326.441955);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (-2,142) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) expm1Function0, (-1916.876466365), 104.7535056, 104.7535056);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) sinFunction0, 0.0, (-936.272050209));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, -936.272]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) null, 261.13073588592, 2911.8332);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve(1215.8293851, (-1057.556323144), 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,215.829, -1,057.556]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) quinticFunction0);
      bisectionSolver0.setAbsoluteAccuracy((-1290.86658));
      try { 
        bisectionSolver0.solve(3.546753414067006E-10, 1.0E-6, 1930.845186039);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((-842.05), 0.0, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) quinticFunction0);
      // Undeclared exception!
      try { 
        bisectionSolver0.solve(3130.02, 2.5E-16);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [3,130.02, 0]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BisectionSolver bisectionSolver0 = null;
      try {
        bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function to solve cannot be null
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) quinticFunction0);
      double double0 = bisectionSolver0.solve((UnivariateRealFunction) quinticFunction0, 0.0, 3130.019668);
      assertEquals(31, bisectionSolver0.getIterationCount());
      assertEquals(3.6438224697485565E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      bisectionSolver0.setAbsoluteAccuracy((-1290.86658));
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) quinticFunction0, (-1290.86658), 1931.5058093984567);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) quinticFunction0);
      bisectionSolver0.setAbsoluteAccuracy((-1.0));
      try { 
        bisectionSolver0.solve((-1.0), 0.0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) quinticFunction0);
      Expm1Function expm1Function0 = new Expm1Function();
      double double0 = bisectionSolver0.solve((UnivariateRealFunction) expm1Function0, (-7.842355514642835E-9), 0.5683374015220544, (-1422.191));
      assertEquals(19, bisectionSolver0.getIterationCount());
      assertEquals(2.631620396672085E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) quinticFunction0);
      double double0 = bisectionSolver0.solve((-1.0), 0.0);
      assertEquals(19, bisectionSolver0.getIterationCount());
      assertEquals((-0.9999995231628418), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve(1.0E-15, 31.40693);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }
}
