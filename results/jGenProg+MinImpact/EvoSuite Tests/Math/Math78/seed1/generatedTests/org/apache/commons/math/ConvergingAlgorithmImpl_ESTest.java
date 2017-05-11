/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 16 22:07:18 GMT 2017
 */

package org.apache.commons.math;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.integration.RombergIntegrator;
import org.apache.commons.math.analysis.integration.SimpsonIntegrator;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.apache.commons.math.analysis.solvers.LaguerreSolver;
import org.apache.commons.math.analysis.solvers.MullerSolver;
import org.apache.commons.math.optimization.univariate.BrentOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConvergingAlgorithmImpl_ESTest extends ConvergingAlgorithmImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RombergIntegrator rombergIntegrator0 = new RombergIntegrator();
      rombergIntegrator0.resetRelativeAccuracy();
      assertEquals(1.0E-14, rombergIntegrator0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpsonIntegrator simpsonIntegrator0 = new SimpsonIntegrator();
      simpsonIntegrator0.setAbsoluteAccuracy((-2723.2));
      assertEquals((-2723.2), simpsonIntegrator0.getAbsoluteAccuracy(), 0.01);
      
      simpsonIntegrator0.resetAbsoluteAccuracy();
      assertEquals(1.0E-15, simpsonIntegrator0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      assertEquals(1.0E-14, laguerreSolver0.getRelativeAccuracy(), 0.01);
      
      laguerreSolver0.setRelativeAccuracy(63.0);
      assertEquals(0, laguerreSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      mullerSolver0.setAbsoluteAccuracy(0.0);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(0, mullerSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      laguerreSolver0.resetRelativeAccuracy();
      assertEquals(0, laguerreSolver0.getIterationCount());
      assertEquals(1.0E-14, laguerreSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(100, laguerreSolver0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      assertEquals(1.0E-14, bisectionSolver0.getRelativeAccuracy(), 0.01);
      
      bisectionSolver0.setRelativeAccuracy(0.0);
      bisectionSolver0.getRelativeAccuracy();
      assertEquals(100, bisectionSolver0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      assertEquals(100, brentOptimizer0.getMaximalIterationCount());
      
      brentOptimizer0.setMaximalIterationCount(0);
      int int0 = brentOptimizer0.getMaximalIterationCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RombergIntegrator rombergIntegrator0 = new RombergIntegrator();
      rombergIntegrator0.setMaximalIterationCount((-1));
      int int0 = rombergIntegrator0.getMaximalIterationCount();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpsonIntegrator simpsonIntegrator0 = new SimpsonIntegrator();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      simpsonIntegrator0.integrate((UnivariateRealFunction) quinticFunction0, (-88.67997629983327), 1.0E-14);
      int int0 = simpsonIntegrator0.getIterationCount();
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RombergIntegrator rombergIntegrator0 = new RombergIntegrator();
      rombergIntegrator0.setAbsoluteAccuracy(0.0);
      rombergIntegrator0.getAbsoluteAccuracy();
      assertEquals(0, rombergIntegrator0.getIterationCount());
      assertEquals(32, rombergIntegrator0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      bisectionSolver0.setRelativeAccuracy((-2.0975742800293924));
      double double0 = bisectionSolver0.getRelativeAccuracy();
      assertEquals((-2.0975742800293924), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      double double0 = bisectionSolver0.getRelativeAccuracy();
      assertEquals(1.0E-14, double0, 0.01);
      assertEquals(0, bisectionSolver0.getIterationCount());
      assertEquals(100, bisectionSolver0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RombergIntegrator rombergIntegrator0 = new RombergIntegrator();
      rombergIntegrator0.setAbsoluteAccuracy((-4151.911320192));
      double double0 = rombergIntegrator0.getAbsoluteAccuracy();
      assertEquals((-4151.911320192), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      laguerreSolver0.resetMaximalIterationCount();
      assertEquals(1.0E-14, laguerreSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(0, laguerreSolver0.getIterationCount());
      assertEquals(100, laguerreSolver0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      mullerSolver0.setMaximalIterationCount(0);
      assertEquals(0, mullerSolver0.getMaximalIterationCount());
      
      mullerSolver0.resetMaximalIterationCount();
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpsonIntegrator simpsonIntegrator0 = new SimpsonIntegrator();
      int int0 = simpsonIntegrator0.getIterationCount();
      assertEquals(64, simpsonIntegrator0.getMaximalIterationCount());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RombergIntegrator rombergIntegrator0 = new RombergIntegrator();
      rombergIntegrator0.getAbsoluteAccuracy();
      assertEquals(0, rombergIntegrator0.getIterationCount());
      assertEquals(32, rombergIntegrator0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      int int0 = bisectionSolver0.getMaximalIterationCount();
      assertEquals(0, bisectionSolver0.getIterationCount());
      assertEquals(100, int0);
      assertEquals(1.0E-14, bisectionSolver0.getRelativeAccuracy(), 0.01);
  }
}