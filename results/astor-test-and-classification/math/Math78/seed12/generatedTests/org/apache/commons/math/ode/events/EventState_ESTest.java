/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 14 10:16:52 GMT 2017
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
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, (-3));
      double[] doubleArray0 = new double[1];
      eventState0.stepAccepted(0.0, doubleArray0);
      assertFalse(eventState0.stop());
      assertEquals(-3, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(3384.5066178842953, 3384.5066178842953, 3384.5066178842953);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 3384.5066178842953, 3384.5066178842953, 3);
      double[] doubleArray0 = new double[7];
      eventState0.reinitializeBegin(3384.5066178842953, doubleArray0);
      assertFalse(eventState0.stop());
      assertEquals(3384.5066178842953, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(3, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-126.7275689005), (-126.7275689005), 1.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-126.7275689005), (-126.7275689005), 0);
      int int0 = eventState0.getMaxIterationCount();
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(0, int0);
      assertEquals((-126.7275689005), eventState0.getMaxCheckInterval(), 0.01);
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-582.0), 1.570796326794897, 0.4771212547196624);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-582.0), 0.0, (-1155));
      int int0 = eventState0.getMaxIterationCount();
      assertEquals(0.0, eventState0.getConvergence(), 0.01);
      assertEquals((-1155), int0);
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals((-582.0), eventState0.getMaxCheckInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(3034.99627309, 3034.99627309, 3034.99627309);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 3034.99627309, 3034.99627309, (-1048));
      double double0 = eventState0.getMaxCheckInterval();
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(3034.99627309, double0, 0.01);
      assertEquals(-1048, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-1103.637998), (-475.71706), (-475.71706));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-1950.722295956), (-1950.722295956), 442);
      double double0 = eventState0.getMaxCheckInterval();
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(442, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
      assertEquals((-1950.722295956), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-1103.637998), (-475.71706), (-475.71706));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-1950.722295956), (-1950.722295956), 442);
      eventState0.getEventHandler();
      assertEquals(442, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
      assertEquals((-1950.722295956), eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, (-3));
      eventState0.getConvergence();
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(-3, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, (-1337.5121679), (-1337.5121679), (-2847));
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        eventState0.stepAccepted((-1337.5121679), doubleArray0);
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
      EventState eventState0 = new EventState((EventHandler) null, (-4063.7), (-4063.7), 1);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        eventState0.reinitializeBegin(1, doubleArray0);
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
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, (-3));
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
      StepProblem stepProblem0 = new StepProblem(3034.99627309, 3034.99627309, 3034.99627309);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 3034.99627309, 3034.99627309, (-1048));
      double[] doubleArray0 = new double[3];
      boolean boolean0 = eventState0.reset(3034.99627309, doubleArray0);
      assertFalse(boolean0);
      assertFalse(eventState0.stop());
      assertEquals(-1048, eventState0.getMaxIterationCount());
      assertEquals(3034.99627309, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(3034.99627309, 3034.99627309, 3034.99627309);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 3034.99627309, 3034.99627309, (-1048));
      boolean boolean0 = eventState0.stop();
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(3034.99627309, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(-1048, eventState0.getMaxIterationCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 3170.9009672519132, 0.0, 0);
      double[] doubleArray0 = new double[1];
      eventState0.stepAccepted(3170.9009672519132, doubleArray0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(0.0, eventState0.getConvergence(), 0.01);
      assertEquals(3170.9009672519132, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(0, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(3034.99627309, 3034.99627309, 3034.99627309);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 3034.99627309, 3034.99627309, (-1048));
      double[] doubleArray0 = new double[3];
      eventState0.stepAccepted((-1048), doubleArray0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(3034.99627309, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(-1048, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 1336.162302, 272);
      eventState0.reinitializeBegin(2416.100845, (double[]) null);
      assertEquals(272, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(1336.162302, eventState0.getConvergence(), 0.01);
      assertEquals(0.0, eventState0.getMaxCheckInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(3034.99627309, 3034.99627309, 3034.99627309);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 3034.99627309, 3034.99627309, (-1048));
      double[] doubleArray0 = new double[3];
      eventState0.reinitializeBegin((-1048), doubleArray0);
      assertEquals(3034.99627309, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(-1048, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 1336.162302, 272);
      double double0 = eventState0.getConvergence();
      assertEquals(0.0, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(272, eventState0.getMaxIterationCount());
      assertEquals(1336.162302, double0, 0.01);
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 1336.162302, 272);
      double double0 = eventState0.getMaxCheckInterval();
      assertEquals(0.0, double0, 0.01);
      assertFalse(eventState0.stop());
      assertEquals(272, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(1336.162302, eventState0.getConvergence(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(3034.99627309, 3034.99627309, 3034.99627309);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 3034.99627309, 3034.99627309, (-1048));
      double double0 = eventState0.getEventTime();
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(3034.99627309, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(-1048, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 1336.162302, 272);
      int int0 = eventState0.getMaxIterationCount();
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(272, int0);
      assertEquals(0.0, eventState0.getMaxCheckInterval(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(1336.162302, eventState0.getConvergence(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, 0.0, 3189.6, (-1357));
      eventState0.getEventHandler();
      assertEquals(3189.6, eventState0.getConvergence(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(0.0, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(-1357, eventState0.getMaxIterationCount());
  }
}
