/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 15 14:26:51 GMT 2017
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
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, 1739);
      double[] doubleArray0 = new double[9];
      eventState0.stepAccepted(0.0, doubleArray0);
      assertEquals(1739, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(110.1132268951, 110.1132268951, 110.1132268951);
      double[] doubleArray0 = new double[4];
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 110.1132268951, 110.1132268951, (-332));
      eventState0.reinitializeBegin(110.1132268951, doubleArray0);
      assertEquals(110.1132268951, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(-332, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-1494.2446199925039), 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-1494.2446199925039), 0.0, 3);
      int int0 = eventState0.getMaxIterationCount();
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(0.0, eventState0.getConvergence(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(3, int0);
      assertEquals((-1494.2446199925039), eventState0.getMaxCheckInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-276.8), (-276.8), (-276.8));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-276.8), (-276.8), (-4466));
      int int0 = eventState0.getMaxIterationCount();
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals((-4466), int0);
      assertFalse(eventState0.stop());
      assertEquals((-276.8), eventState0.getMaxCheckInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(9.0, 9.0, (-1692.464));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 9.0, 9.0, (-4199));
      double double0 = eventState0.getMaxCheckInterval();
      assertEquals(-4199, eventState0.getMaxIterationCount());
      assertEquals(9.0, double0, 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-408.69935608), (-408.69935608), (-408.69935608));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-408.69935608), (-408.69935608), 0);
      double double0 = eventState0.getMaxCheckInterval();
      assertEquals(0, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals((-408.69935608), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-276.8), (-276.8), (-276.8));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-276.8), (-276.8), (-4466));
      eventState0.getEventHandler();
      assertEquals(-4466, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals((-276.8), eventState0.getMaxCheckInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, 0);
      eventState0.getConvergence();
      assertEquals(0, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, 0.0, 0.0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        eventState0.stepAccepted(4.0, doubleArray0);
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
      EventState eventState0 = new EventState((EventHandler) null, 0.0, 1632.512515836687, (-1828));
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        eventState0.reinitializeBegin(0.0, doubleArray0);
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
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, 0);
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
      EventState eventState0 = new EventState((EventHandler) null, 0.0, 0.0, 0);
      double[] doubleArray0 = new double[1];
      boolean boolean0 = eventState0.reset(0.0, doubleArray0);
      assertFalse(eventState0.stop());
      assertEquals(0, eventState0.getMaxIterationCount());
      assertFalse(boolean0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-1494.2446199925039), 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-1494.2446199925039), 0.0, 3);
      boolean boolean0 = eventState0.stop();
      assertEquals(3, eventState0.getMaxIterationCount());
      assertEquals((-1494.2446199925039), eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(0.0, eventState0.getConvergence(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(110.1132268951, 110.1132268951, 110.1132268951);
      double[] doubleArray0 = new double[4];
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 110.1132268951, 110.1132268951, (-332));
      eventState0.stepAccepted((-332), doubleArray0);
      assertEquals(-332, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(110.1132268951, eventState0.getMaxCheckInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(3009.558098220961, 3009.558098220961, 3009.558098220961);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 18.0, 3009.558098220961, 3779);
      double[] doubleArray0 = new double[3];
      eventState0.stepAccepted(3779, doubleArray0);
      assertEquals(18.0, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(3009.558098220961, eventState0.getConvergence(), 0.01);
      assertEquals(3779, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(3009.558098220961, 3009.558098220961, 3009.558098220961);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 18.0, 3009.558098220961, 3779);
      double[] doubleArray0 = new double[3];
      eventState0.reinitializeBegin(3779, doubleArray0);
      assertFalse(eventState0.stop());
      assertEquals(3009.558098220961, eventState0.getConvergence(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(18.0, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(3779, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, 1739);
      double[] doubleArray0 = new double[9];
      eventState0.reinitializeBegin((-1314.085057586678), doubleArray0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(1739, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(919.172918006212, 919.172918006212, 919.172918006212);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 919.172918006212, 919.172918006212, 2144711867);
      double double0 = eventState0.getConvergence();
      assertEquals(919.172918006212, double0, 0.01);
      assertFalse(eventState0.stop());
      assertEquals(2144711867, eventState0.getMaxIterationCount());
      assertEquals(919.172918006212, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, 1739);
      eventState0.getMaxCheckInterval();
      assertEquals(1739, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(85.2769913617304, 85.2769913617304, 85.2769913617304);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, 0);
      double double0 = eventState0.getEventTime();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(0, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(85.2769913617304, 85.2769913617304, 85.2769913617304);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, 0);
      int int0 = eventState0.getMaxIterationCount();
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, 2.0779220779220777, 0.0, 11);
      eventState0.getEventHandler();
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(11, eventState0.getMaxIterationCount());
      assertEquals(0.0, eventState0.getConvergence(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(2.0779220779220777, eventState0.getMaxCheckInterval(), 0.01);
  }
}
