/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 12 15:01:46 GMT 2017
 */

package org.apache.commons.math3.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import org.apache.commons.math3.analysis.solvers.MullerSolver2;
import org.apache.commons.math3.analysis.solvers.RiddersSolver;
import org.apache.commons.math3.analysis.solvers.SecantSolver;
import org.apache.commons.math3.analysis.solvers.UnivariateSolver;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math3.ode.TestProblem5;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math3.ode.nonstiff.EulerIntegrator;
import org.apache.commons.math3.ode.nonstiff.GillIntegrator;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math3.ode.nonstiff.StepProblem;
import org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator;
import org.apache.commons.math3.ode.sampling.FixedStepHandler;
import org.apache.commons.math3.ode.sampling.StepNormalizer;
import org.apache.commons.math3.ode.sampling.StepNormalizerBounds;
import org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest;
import org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractIntegrator_ESTest extends AbstractIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Double double0 = new Double(3520.51657492728);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1465.8945), (-1465.8945), (-886.609), 3520.51657492728);
      StepProblem stepProblem0 = new StepProblem(3520.51657492728, (double) double0, 3520.51657492728);
      double[] doubleArray0 = new double[1];
      graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) stepProblem0, 3520.51657492728, doubleArray0, (-1465.8945), doubleArray0);
      double double1 = graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) stepProblem0, (-3816.086175234248), doubleArray0, 916.12, doubleArray0);
      assertArrayEquals(new double[] {(-894932.5627970484)}, doubleArray0, 0.01);
      assertEquals(916.12, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[13];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(2555.731058271421, 2555.731058271421, doubleArray0, doubleArray0);
      StepNormalizerOutputOverlapTest stepNormalizerOutputOverlapTest0 = new StepNormalizerOutputOverlapTest();
      double[] doubleArray1 = new double[0];
      try { 
        dormandPrince54Integrator0.integrate((FirstOrderDifferentialEquations) stepNormalizerOutputOverlapTest0, 2555.731058271421, doubleArray0, (-30.2785), doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 13 != 1
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator(4.547473508864641E-10);
      TestProblem5 testProblem5_0 = new TestProblem5();
      try { 
        threeEighthesIntegrator0.integrate((FirstOrderDifferentialEquations) testProblem5_0, (-3016.1652471485145), doubleArray0, (-3256.0), doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 2
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-3129.2272292587), (-3129.2272292587), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setMaxEvaluations(1090);
      assertEquals(3129.2272292587, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator((-136.0));
      StepNormalizerOutputOverlapTest stepNormalizerOutputOverlapTest0 = new StepNormalizerOutputOverlapTest();
      double double0 = classicalRungeKuttaIntegrator0.integrate((FirstOrderDifferentialEquations) stepNormalizerOutputOverlapTest0, 1510.57720468, doubleArray0, 0.0, doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(144.3078, 0.0, 0.0, 0.0);
      double double0 = graggBulirschStoerIntegrator0.getCurrentSignedStepsize();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1465.8945), (-1465.8945), (-886.609), 3520.51657492728);
      StepProblem stepProblem0 = new StepProblem(0.0, Double.NaN, 3520.51657492728);
      SecantSolver secantSolver0 = new SecantSolver(1234.3378327137293);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) stepProblem0, (-2866.5584), (-1.0), (-1372), (UnivariateSolver) secantSolver0);
      double[] doubleArray0 = new double[1];
      try { 
        graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) stepProblem0, 3520.51657492728, doubleArray0, (-1465.8945), doubleArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,372) exceeded: evaluations
         //
         verifyException("org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(Double.NaN, Double.NaN, (-886.609), 3520.51657492728);
      StepProblem stepProblem0 = new StepProblem(3520.51657492728, (-369.8945419903), 3520.51657492728);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) stepProblem0, 2.9257892371894816E-17, 2.9257892371894816E-17, (-1));
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) stepProblem0, 3520.51657492728, doubleArray0, Double.NaN, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [3,520.517, 3,520.517]
         //
         verifyException("org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1465.8945), (-1465.8945), (-886.609), 3520.51657492728);
      StepProblem stepProblem0 = new StepProblem((-1.2992997513692044), Double.NaN, 3520.51657492728);
      double[] doubleArray0 = new double[1];
      StepProblem stepProblem1 = new StepProblem(3255.463019, 3255.463019, (-886.609));
      RiddersSolver riddersSolver0 = new RiddersSolver(1.0, 1246.84041);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) stepProblem0, (-2660.517), 1.8609623908996582, 1611, (UnivariateSolver) riddersSolver0);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) stepProblem1, 3520.51657492728, (-421.97914), 2146681360);
      try { 
        graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) stepProblem0, 3520.51657492728, doubleArray0, (-1465.8945), doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [\uFFFD, 2,054.622], values: [\uFFFD, 2,941.231]
         //
         verifyException("org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(1410.677101217513, 2.2737367544323206E-10, doubleArray0, doubleArray0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE((FirstOrderDifferentialEquations) testProblem5_0);
      try { 
        dormandPrince54Integrator0.integrate(expandableStatefulODE0, 1410.677101217513);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2 != 1
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-1894.2965170004904), (-1.0), doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        dormandPrince853Integrator0.integrate((ExpandableStatefulODE) null, 3662.53);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator(3.5555555555555554);
      threeEighthesIntegrator0.setMaxEvaluations((-486));
      assertEquals(Double.NaN, threeEighthesIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, threeEighthesIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator((-2746.0));
      StepNormalizerOutputOverlapTest stepNormalizerOutputOverlapTest0 = new StepNormalizerOutputOverlapTest();
      StepNormalizerBounds stepNormalizerBounds0 = StepNormalizerBounds.FIRST;
      StepNormalizer stepNormalizer0 = new StepNormalizer((-2746.0), (FixedStepHandler) stepNormalizerOutputOverlapTest0, stepNormalizerBounds0);
      classicalRungeKuttaIntegrator0.addStepHandler(stepNormalizer0);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(0.0);
      gillIntegrator0.clearEventHandlers();
      assertEquals(Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(941.3245254);
      gillIntegrator0.clearStepHandlers();
      assertEquals(Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(1.0);
      // Undeclared exception!
      try { 
        eulerIntegrator0.computeDerivatives(1.0, (double[]) null, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-3129.2272292587), (-3129.2272292587), doubleArray0, doubleArray0);
      StepProblem stepProblem0 = new StepProblem((-3129.2272292587), (-3129.2272292587), (double) (-1));
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE((FirstOrderDifferentialEquations) stepProblem0);
      expandableStatefulODE0.setTime((-3129.2272292587));
      try { 
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-3129.2272292587));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Double double0 = new Double(3520.51657492728);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1465.8945), (-1465.8945), (-886.609), 3520.51657492728);
      StepProblem stepProblem0 = new StepProblem(3520.51657492728, (double) double0, 3520.51657492728);
      double[] doubleArray0 = new double[1];
      StepNormalizerOutputTest stepNormalizerOutputTest0 = new StepNormalizerOutputTest();
      StepNormalizer stepNormalizer0 = new StepNormalizer(4939.82917147758, (FixedStepHandler) stepNormalizerOutputTest0);
      graggBulirschStoerIntegrator0.addStepHandler(stepNormalizer0);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) stepProblem0, 3520.51657492728, (-421.97914), 2146681376);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) stepProblem0, 3520.51657492728, doubleArray0, (-1465.8945), doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(2555.2742277230263, 2555.2742277230263, doubleArray0, doubleArray0);
      StepNormalizerOutputOverlapTest stepNormalizerOutputOverlapTest0 = new StepNormalizerOutputOverlapTest();
      double[] doubleArray1 = new double[0];
      try { 
        dormandPrince54Integrator0.integrate((FirstOrderDifferentialEquations) stepNormalizerOutputOverlapTest0, 2555.2742277230263, doubleArray0, (-30.2785), doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 1
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator((-2746.0));
      classicalRungeKuttaIntegrator0.setMaxEvaluations(0);
      int int0 = classicalRungeKuttaIntegrator0.getMaxEvaluations();
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.3341791187130175, 0.0, 0.3341791187130175, 0.3341791187130175);
      StepProblem stepProblem0 = new StepProblem(0.3341791187130175, 0.3341791187130175, (-1148.9));
      MullerSolver2 mullerSolver2_0 = new MullerSolver2();
      dormandPrince54Integrator0.addEventHandler((EventHandler) stepProblem0, 0.0, (-1164.024783202097), 2145849083, (UnivariateSolver) mullerSolver2_0);
      Collection<EventHandler> collection0 = dormandPrince54Integrator0.getEventHandlers();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-1505.6559995603288), (-1505.6559995603288), doubleArray0, doubleArray0);
      String string0 = dormandPrince853Integrator0.getName();
      assertEquals("Dormand-Prince 8 (5, 3)", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator((-2746.0));
      classicalRungeKuttaIntegrator0.getStepHandlers();
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(5.554964922539782);
      double double0 = gillIntegrator0.getCurrentStepStart();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator((-2746.0));
      int int0 = classicalRungeKuttaIntegrator0.getMaxEvaluations();
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1465.8945), (-1465.8945), (-886.609), 3520.51657492728);
      int int0 = graggBulirschStoerIntegrator0.getEvaluations();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator(3520.51657492728);
      double double0 = threeEighthesIntegrator0.getCurrentSignedStepsize();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(Double.NaN, threeEighthesIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Double double0 = new Double(3520.51657492728);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1465.8945), (-1465.8945), (-886.609), 3520.51657492728);
      StepProblem stepProblem0 = new StepProblem((-1.2992997513692044), (double) double0, 3520.51657492728);
      double[] doubleArray0 = new double[1];
      graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) stepProblem0, 3520.51657492728, doubleArray0, (-1465.8945), doubleArray0);
      assertArrayEquals(new double[] {6478.842669877663}, doubleArray0, 0.01);
      
      int int0 = graggBulirschStoerIntegrator0.getEvaluations();
      assertEquals(38, int0);
  }
}
