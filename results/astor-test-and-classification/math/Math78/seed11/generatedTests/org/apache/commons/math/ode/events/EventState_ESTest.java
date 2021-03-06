/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 14 19:18:55 GMT 2017
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
      StepProblem stepProblem0 = new StepProblem(0.4636476090008061, 0.4636476090008061, 0.4636476090008061);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.4636476090008061, 0.4636476090008061, (-3209));
      double[] doubleArray0 = new double[6];
      eventState0.stepAccepted(0.4636476090008061, doubleArray0);
      assertFalse(eventState0.stop());
      assertEquals(0.4636476090008061, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(-3209, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-2204.72962497046), (-2204.72962497046), (-2204.72962497046));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-2204.72962497046), (-2204.72962497046), 210);
      double[] doubleArray0 = new double[1];
      eventState0.reinitializeBegin((-2204.72962497046), doubleArray0);
      assertFalse(eventState0.stop());
      assertEquals((-2204.72962497046), eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(210, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, (-1075.609267371227));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-1.0), 0.0, 2);
      int int0 = eventState0.getMaxIterationCount();
      assertFalse(eventState0.stop());
      assertEquals(2, int0);
      assertEquals(0.0, eventState0.getConvergence(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals((-1.0), eventState0.getMaxCheckInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-16.425078326157525), (-16.425078326157525), (-16.425078326157525));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-16.425078326157525), 0.0, (-2512));
      int int0 = eventState0.getMaxIterationCount();
      assertEquals((-16.425078326157525), eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(0.0, eventState0.getConvergence(), 0.01);
      assertEquals((-2512), int0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(255.10163803, 255.10163803, (-1506.35959));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, (-1506.35959), (-1));
      double double0 = eventState0.getMaxCheckInterval();
      assertFalse(eventState0.stop());
      assertEquals(-1, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(1506.35959, eventState0.getConvergence(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-16.425078326157525), (-16.425078326157525), (-16.425078326157525));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-16.425078326157525), 0.0, (-2512));
      double double0 = eventState0.getMaxCheckInterval();
      assertEquals(0.0, eventState0.getConvergence(), 0.01);
      assertEquals(-2512, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals((-16.425078326157525), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.4636476090008061, 0.4636476090008061, 0.4636476090008061);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.4636476090008061, 0.4636476090008061, (-3209));
      eventState0.getEventHandler();
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(-3209, eventState0.getMaxIterationCount());
      assertEquals(0.4636476090008061, eventState0.getMaxCheckInterval(), 0.01);
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-16.425078326157525), (-16.425078326157525), (-16.425078326157525));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-16.425078326157525), 0.0, (-2512));
      double double0 = eventState0.getConvergence();
      assertFalse(eventState0.stop());
      assertEquals(0.0, double0, 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(-2512, eventState0.getMaxIterationCount());
      assertEquals((-16.425078326157525), eventState0.getMaxCheckInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, (-2409.0), (-2690.547094313701), 4580);
      // Undeclared exception!
      try { 
        eventState0.stepAccepted(1.732050807568877, (double[]) null);
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
      EventState eventState0 = new EventState((EventHandler) null, 2.2250738585072014E-308, 2.2250738585072014E-308, 4722);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        eventState0.reinitializeBegin(Double.NaN, doubleArray0);
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
      StepProblem stepProblem0 = new StepProblem((-16.425078326157525), (-16.425078326157525), (-16.425078326157525));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-16.425078326157525), 0.0, (-2512));
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
      EventState eventState0 = new EventState((EventHandler) null, 0.9092974268256817, (-90.803), (-2517));
      double[] doubleArray0 = new double[5];
      boolean boolean0 = eventState0.reset((-2986.49461713), doubleArray0);
      assertEquals(90.803, eventState0.getConvergence(), 0.01);
      assertFalse(boolean0);
      assertEquals(0.9092974268256817, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(-2517, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, 2.2250738585072014E-308, 2.2250738585072014E-308, 4722);
      boolean boolean0 = eventState0.stop();
      assertEquals(4722, eventState0.getMaxIterationCount());
      assertFalse(boolean0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.4636476090008061, 0.4636476090008061, 0.4636476090008061);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.4636476090008061, 0.4636476090008061, (-3209));
      double[] doubleArray0 = new double[6];
      eventState0.stepAccepted((-2235.45354167), doubleArray0);
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(-3209, eventState0.getMaxIterationCount());
      assertEquals(0.4636476090008061, eventState0.getMaxCheckInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-688.572), 0.0, 2243);
      double[] doubleArray0 = new double[0];
      eventState0.stepAccepted(2243, doubleArray0);
      assertEquals(0.0, eventState0.getConvergence(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(2243, eventState0.getMaxIterationCount());
      assertEquals((-688.572), eventState0.getMaxCheckInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 897.87267233, 897.87267233, 882);
      eventState0.reinitializeBegin(897.87267233, (double[]) null);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(897.87267233, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(882, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-2204.72962497046), (-2204.72962497046), (-2204.72962497046));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-2204.72962497046), (-2204.72962497046), 210);
      double[] doubleArray0 = new double[1];
      eventState0.reinitializeBegin(Double.NaN, doubleArray0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(210, eventState0.getMaxIterationCount());
      assertEquals((-2204.72962497046), eventState0.getMaxCheckInterval(), 0.01);
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, 203.4374231236, 203.4374231236, 2972);
      double double0 = eventState0.getConvergence();
      assertEquals(203.4374231236, double0, 0.01);
      assertEquals(203.4374231236, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(2972, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(255.10163803, 255.10163803, (-1506.35959));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 255.10163803, (-1506.35959), (-1));
      double double0 = eventState0.getMaxCheckInterval();
      assertEquals(-1, eventState0.getMaxIterationCount());
      assertEquals(255.10163803, double0, 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(1506.35959, eventState0.getConvergence(), 0.01);
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-2204.72962497046), (-2204.72962497046), (-2204.72962497046));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-2204.72962497046), (-2204.72962497046), 210);
      double double0 = eventState0.getEventTime();
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals((-2204.72962497046), eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(210, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(449.4, 449.4, (-1388.7));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-1388.7), 0.0, 0);
      int int0 = eventState0.getMaxIterationCount();
      assertEquals((-1388.7), eventState0.getMaxCheckInterval(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(0, int0);
      assertEquals(0.0, eventState0.getConvergence(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, 0.9092974268256817, (-90.803), (-2517));
      eventState0.getEventHandler();
      assertEquals(90.803, eventState0.getConvergence(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(-2517, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
      assertEquals(0.9092974268256817, eventState0.getMaxCheckInterval(), 0.01);
  }
}
