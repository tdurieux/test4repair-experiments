/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 23 00:38:35 GMT 2017
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UnivariateRealSolverUtils_ESTest extends UnivariateRealSolverUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, 0.0, 0.0, 0.5, 500);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // number of iterations=1, maximum iterations=500, initial=0, lower bound=0, upper bound=0.5, final a value=0, final b value=0.5, f(a)=0, f(b)=0.649
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, (-488.3049709), (-488.3049709), (-488.3049709), (-2262));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad value for maximum iterations number: -2,262
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) quinticFunction0, (-1610.095375901727), 454.5, (-1610.095375901727));
      assertEquals(1.0000000000000024, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
      double double0 = UnivariateRealSolverUtils.solve(univariateRealFunction0, (-1234.816204022), 0.0, (-1234.816204022));
      assertEquals((-1234.816204022), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) expm1Function0, (-1234.816204022), 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
      double double0 = UnivariateRealSolverUtils.solve(univariateRealFunction0, (-1448.473922176337), 0.5);
      assertEquals((-1448.473922176337), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double double0 = UnivariateRealSolverUtils.midpoint(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double double0 = UnivariateRealSolverUtils.midpoint(0.0, (-2662.9133765));
      assertEquals((-1331.45668825), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.solve((UnivariateRealFunction) quinticFunction0, 3812.2700451568, 0.0, 2369.1537822203);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [3,812.27, 0]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) monitoredFunction0, 2601.89735, (-24.280285672324492), 2601.89735, 1099);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(univariateRealFunction0);
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) monitoredFunction0, (-5.10412359791947), (-5.10412359791947), 384.3074282);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // number of iterations=390, maximum iterations=2,147,483,647, initial=-5.104, lower bound=-5.104, upper bound=384.307, final a value=-5.104, final b value=384.307, f(a)=0.006, f(b)=79,908,949,557,678,180,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) monitoredFunction0, (-1.0), (-1.0), 384.3074282);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, (-4096.212), 259.4635409759247, 0.5, 1618);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=259.464,  initial=-4,096.212, upper bound=0.5
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) quinticFunction0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) monitoredFunction0, (-1.0), (-1.0), (-1.0), 1964);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=-1,  initial=-1, upper bound=-1
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.solve((UnivariateRealFunction) null, (-2426.30581882366), (-2426.30581882366));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function is null
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      UnivariateRealFunction univariateRealFunction0 = quinticFunction0.derivative();
      try { 
        UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0, 0.0, 1.0, 3488);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // number of iterations=1, maximum iterations=3,488, initial=0, lower bound=0, upper bound=1, final a value=0, final b value=1, f(a)=0.25, f(b)=1.5
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, 1.0, 1.0, 1.0091147249000564E29, 254);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // number of iterations=254, maximum iterations=254, initial=1, lower bound=1, upper bound=100,911,472,490,005,640,000,000,000,000, final a value=1, final b value=255, f(a)=1.718, f(b)=556,023,164,772,767,570,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double[] doubleArray0 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, 1.0E-15, (-1089.0), 1.054805796600225E13, 2009244390);
      assertArrayEquals(new double[] {(-1.9999999999999991), 2.000000000000001}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, Double.NaN, 4.232416719101198E161, 7.068855766206141E156);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=423,241,671,910,119,800,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,  initial=\uFFFD, upper bound=7,068,855,766,206,141,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, 1.0, 1.0, 0.0, 28);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=1,  initial=1, upper bound=0
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, (-643.01), 0.0, 0.5, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad value for maximum iterations number: 0
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) null, (double) 891, (double) 891, (double) 891, 891);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function is null
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) expm1Function0, (-61.179052657), 0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double double0 = UnivariateRealSolverUtils.midpoint(1.0, 1.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) expm1Function0, (-1448.473922176337), 0.5);
      assertEquals(2.327478144246222E-12, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double[] doubleArray0 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, Double.NaN, Double.NaN, Double.NaN);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }
}