/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 17 21:52:43 GMT 2017
 */

package org.apache.commons.math.ode.events;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.events.EventHandler;
import org.apache.commons.math.ode.events.EventState;
import org.apache.commons.math.ode.nonstiff.StepProblem;
import org.apache.commons.math.ode.sampling.StepInterpolator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EventState_ESTest extends EventState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-5099.6), (-5099.6), (-5099.6));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-5099.6), (-5099.6), 2301);
      double[] doubleArray0 = new double[1];
      eventState0.stepAccepted(2301, doubleArray0);
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(2301, eventState0.getMaxIterationCount());
      assertEquals((-5099.6), eventState0.getMaxCheckInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(429.304211, 429.304211, 429.304211);
      double[] doubleArray0 = new double[3];
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 429.304211, 429.304211, (-41));
      eventState0.reinitializeBegin(429.304211, doubleArray0);
      assertEquals(429.304211, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(-41, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, (-2.185039863261519), (-1284.139130872026), 3130);
      int int0 = eventState0.getMaxIterationCount();
      assertEquals((-2.185039863261519), eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(3130, int0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(1284.139130872026, eventState0.getConvergence(), 0.01);
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, (-1159));
      int int0 = eventState0.getMaxIterationCount();
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals((-1159), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, (-1159));
      eventState0.getMaxCheckInterval();
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(-1159, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, (-2733.6909932), 0.3333333333333333, 40);
      double double0 = eventState0.getMaxCheckInterval();
      assertEquals(40, eventState0.getMaxIterationCount());
      assertEquals((-2733.6909932), double0, 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(0.3333333333333333, eventState0.getConvergence(), 0.01);
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, (-1159));
      eventState0.getEventHandler();
      assertEquals(-1159, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, 2035);
      eventState0.getConvergence();
      assertEquals(2035, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, (-2.185039863261519), (-1284.139130872026), 3130);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        eventState0.stepAccepted((-3501.8748), doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.events.EventState", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, (-1.0), 2461.94, 0);
      double[] doubleArray0 = new double[8];
      // Undeclared exception!
      try { 
        eventState0.reinitializeBegin(0.5403023058681398, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.events.EventState", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, 2035);
      // Undeclared exception!
      try { 
        eventState0.evaluateStep((StepInterpolator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.events.EventState", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-5099.6), (-5099.6), (-5099.6));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-5099.6), (-5099.6), 2301);
      double[] doubleArray0 = new double[1];
      boolean boolean0 = eventState0.reset((-5099.6), doubleArray0);
      assertEquals((-5099.6), eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(2301, eventState0.getMaxIterationCount());
      assertFalse(boolean0);
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, (-1159));
      boolean boolean0 = eventState0.stop();
      assertFalse(boolean0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(-1159, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(835.05630145, 835.05630145, 1.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.3333333333333333, 835.05630145, (-1404));
      double[] doubleArray0 = new double[1];
      eventState0.stepAccepted(1.0, doubleArray0);
      assertEquals(0.3333333333333333, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(-1404, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
      assertEquals(835.05630145, eventState0.getConvergence(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, (-1159));
      double[] doubleArray0 = new double[1];
      eventState0.stepAccepted((-1159), doubleArray0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(-1159, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(299.326341, (-1427.55595), (-1427.55595));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 299.326341, 0.0, (-709));
      double[] doubleArray0 = new double[3];
      eventState0.reinitializeBegin((-177.29424078562), doubleArray0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(-709, eventState0.getMaxIterationCount());
      assertEquals(0.0, eventState0.getConvergence(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(299.326341, eventState0.getMaxCheckInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, (-1159));
      double[] doubleArray0 = new double[1];
      eventState0.reinitializeBegin((-1159), doubleArray0);
      assertEquals(-1159, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, (double) (-6), (double) (-6), (-6));
      double double0 = eventState0.getConvergence();
      assertEquals(-6, eventState0.getMaxIterationCount());
      assertEquals((-6.0), eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(6.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 13.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 4126.163761104864, (-1538.0), 46);
      double double0 = eventState0.getMaxCheckInterval();
      assertEquals(46, eventState0.getMaxIterationCount());
      assertEquals(4126.163761104864, double0, 0.01);
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(1538.0, eventState0.getConvergence(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, (-1159));
      double double0 = eventState0.getEventTime();
      assertEquals(-1159, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-0.25), (-0.25), 3348.4202710104);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 1239.22504617607, (-0.25), 0);
      int int0 = eventState0.getMaxIterationCount();
      assertEquals(0.25, eventState0.getConvergence(), 0.01);
      assertEquals(0, int0);
      assertEquals(1239.22504617607, eventState0.getMaxCheckInterval(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, 2100.272528, 2100.272528, 2257);
      eventState0.getEventHandler();
      assertEquals(2257, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(2100.272528, eventState0.getMaxCheckInterval(), 0.01);
  }
}
