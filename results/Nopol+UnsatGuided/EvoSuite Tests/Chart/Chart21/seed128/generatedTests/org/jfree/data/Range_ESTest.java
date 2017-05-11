/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 24 07:16:15 GMT 2017
 */

package org.jfree.data;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.Range;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Range_ESTest extends Range_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Range range0 = new Range((-1707.83), (-1707.83));
      range0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Range range0 = new Range(639.351644, 639.351644);
      Range range1 = Range.shift(range0, 639.351644);
      Range range2 = Range.combine(range0, range1);
      boolean boolean0 = range2.equals(range0);
      assertFalse(boolean0);
      assertFalse(range1.equals((Object)range2));
      assertEquals(959.027466, range2.getCentralValue(), 0.01);
      assertFalse(range0.equals((Object)range2));
      assertFalse(range2.equals((Object)range1));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Range range0 = Range.expandToInclude((Range) null, (-468.4083559999999));
      Range range1 = Range.shift(range0, (-468.4083559999999), false);
      boolean boolean0 = range0.equals(range1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Range range0 = new Range((-683.0), 0.0);
      // Undeclared exception!
      try { 
        Range.expand(range0, (-4000.46469789137), 561.228);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Range(double, double): require lower (2731634.388659806) <= upper (383318.724).
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Range range0 = new Range((-683.0), 0.0);
      Range range1 = Range.expandToInclude(range0, (-683.0));
      assertEquals((-341.5), range1.getCentralValue(), 0.01);
      assertSame(range1, range0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Range range0 = Range.expandToInclude((Range) null, (-691.9395245573));
      Range range1 = Range.combine((Range) null, range0);
      assertSame(range0, range1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Range range0 = new Range(0.0, 15.349660997885863);
      Range range1 = new Range((-901.38), (-901.38));
      Range range2 = Range.combine(range1, range0);
      boolean boolean0 = range2.intersects((-646.2291692770175), 0.0);
      assertTrue(boolean0);
      assertEquals(15.349660997885863, range2.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Range range0 = new Range((-683.0), 0.0);
      boolean boolean0 = range0.intersects(0.0, (-1880.564034065239));
      assertEquals((-341.5), range0.getCentralValue(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Range range0 = new Range(634.133807, 634.133807);
      Range range1 = Range.shift(range0, 634.133807);
      boolean boolean0 = range1.intersects(634.133807, 634.133807);
      assertEquals(1268.267614, range1.getUpperBound(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Range range0 = new Range(1000.209559921496, 1000.209559921496);
      Range range1 = Range.shift(range0, 2640.0);
      Range range2 = Range.expandToInclude(range1, 2640.0);
      double double0 = range2.constrain(2640.0);
      assertEquals(1000.2095599214958, range2.getLength(), 0.01);
      assertEquals(2640.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      Range range1 = Range.shift(range0, 0.0, false);
      assertEquals(0.0, range1.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      Range range1 = Range.shift(range0, 1589.6763118694, false);
      assertEquals(1589.6763118694, range1.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      Range range1 = Range.shift(range0, 0.0);
      assertEquals(0.0, range1.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Range range0 = new Range(0.0, 15.349660997885863);
      double double0 = range0.getUpperBound();
      assertEquals(15.349660997885863, range0.getLength(), 0.01);
      assertEquals(15.349660997885863, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      Range range1 = Range.shift(range0, (-714.43126806792));
      double double0 = range1.getUpperBound();
      assertEquals((-714.43126806792), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      double double0 = range0.getLowerBound();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Range range0 = new Range(1.0, 464.4153059983115);
      double double0 = range0.getLowerBound();
      assertEquals(463.4153059983115, range0.getLength(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Range range0 = new Range(0.0, 15.349660997885863);
      double double0 = range0.getLength();
      assertEquals(15.349660997885863, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Range range0 = new Range(0.6806394474564255, 0.6806394474564255);
      double double0 = range0.getCentralValue();
      assertEquals(0.6806394474564255, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Range range0 = new Range((-1707.83), (-1707.83));
      double double0 = range0.getCentralValue();
      assertEquals((-1707.83), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      Range range1 = Range.shift(range0, 204.832518748);
      Range range2 = Range.expandToInclude(range1, 204.832518748);
      assertSame(range2, range1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      Range range1 = Range.expandToInclude(range0, 0.0);
      assertSame(range1, range0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Range range0 = new Range(639.351644, 639.351644);
      assertEquals(0.0, range0.getLength(), 0.01);
      
      Range range1 = Range.expand(range0, 600.07, (-1782.239998));
      assertEquals(0.0, range1.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Range range0 = Range.expandToInclude((Range) null, (-691.9395245573));
      Range range1 = Range.expand(range0, (-691.9395245573), (-691.9395245573));
      assertEquals(0.0, range0.getLength(), 0.01);
      assertEquals(0.0, range1.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Range range0 = new Range((-683.0), 0.0);
      double double0 = range0.constrain(0.0);
      assertEquals(0.0, double0, 0.01);
      assertEquals((-683.0), range0.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      Range range1 = Range.combine(range0, range0);
      assertNotSame(range1, range0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        Range.shift((Range) null, 963.464131, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      boolean boolean0 = range0.contains(0.0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      boolean boolean0 = range0.contains((-1906.677782221216));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      double double0 = range0.getUpperBound();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      double double0 = range0.getLength();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Range range0 = new Range((-683.0), 0.0);
      double double0 = range0.getLowerBound();
      assertEquals((-341.5), range0.getCentralValue(), 0.01);
      assertEquals((-683.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Range range0 = Range.expandToInclude((Range) null, (-1.0));
      Range range1 = Range.shift(range0, (-1.0), false);
      Range range2 = Range.expandToInclude(range1, (-1.0));
      boolean boolean0 = range1.equals(range2);
      assertFalse(range2.equals((Object)range0));
      assertFalse(range2.equals((Object)range1));
      assertFalse(range0.equals((Object)range2));
      assertEquals((-1.0), range2.getUpperBound(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Range range0 = new Range((-1.0), (-1.0));
      Range range1 = Range.shift(range0, (-1.0));
      boolean boolean0 = range1.equals(range0);
      assertEquals((-2.0), range1.getCentralValue(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Range range0 = new Range((-683.0), 0.0);
      Object object0 = new Object();
      boolean boolean0 = range0.equals(object0);
      assertFalse(boolean0);
      assertEquals((-341.5), range0.getCentralValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Range range0 = Range.expandToInclude((Range) null, (-1.0));
      boolean boolean0 = range0.equals(range0);
      assertTrue(boolean0);
      assertEquals((-1.0), range0.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Range range0 = new Range((-683.0), 0.0);
      Range range1 = Range.shift(range0, (-1880.564034065239), false);
      assertEquals((-683.0), range0.getLowerBound(), 0.01);
      assertEquals((-2222.064034065239), range1.getCentralValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Range range0 = new Range(0.0, 3557.692290738724);
      Range range1 = Range.shift(range0, 2.0);
      assertEquals(0.0, range0.getLowerBound(), 0.01);
      assertEquals(1780.846145369362, range1.getCentralValue(), 0.01);
      assertEquals(3557.692290738724, range0.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      Range range1 = Range.shift(range0, (-1.0), true);
      assertEquals((-1.0), range1.getUpperBound(), 0.01);
      assertEquals((-1.0), range1.getCentralValue(), 0.01);
      assertEquals((-1.0), range1.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try { 
        Range.expand((Range) null, (-691.9395245573), (-691.9395245573));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'range' argument.
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Range range0 = Range.expandToInclude((Range) null, (-1.0));
      Range range1 = Range.combine(range0, (Range) null);
      assertEquals((-1.0), range1.getCentralValue(), 0.01);
      assertNotNull(range1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Range range0 = Range.combine((Range) null, (Range) null);
      assertNull(range0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Range range0 = new Range(1.0, 464.4153059983115);
      double double0 = range0.constrain(1195.55364);
      assertEquals(464.4153059983115, double0, 0.01);
      assertEquals(1.0, range0.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Range range0 = new Range(0.0, 15.349660997885863);
      Range range1 = Range.expand(range0, 4812.925767710127, 4812.925767710127);
      boolean boolean0 = range1.intersects(961.04261267, (-901.38));
      assertEquals(15.349660997885863, range0.getLength(), 0.01);
      assertFalse(boolean0);
      assertEquals(147768.9075456779, range1.getLength(), 0.01);
      assertEquals(0.0, range0.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      Range range1 = Range.shift(range0, (-714.43126806792));
      Range range2 = Range.combine(range1, range0);
      boolean boolean0 = range2.intersects((-1.0), (-1.0));
      assertTrue(boolean0);
      assertEquals(714.43126806792, range2.getLength(), 0.01);
      assertEquals(0.0, range2.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      boolean boolean0 = range0.intersects(0.0, 1.0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      boolean boolean0 = range0.intersects((-1706.0249736051514), 0.0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      Range range1 = Range.shift(range0, (-714.43126806792));
      boolean boolean0 = range1.intersects((-1.0), (-1.0));
      assertFalse(boolean0);
      assertEquals((-714.43126806792), range1.getLowerBound(), 0.01);
      assertEquals((-714.43126806792), range1.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Range range0 = new Range((-2885.48914347), (-2885.48914347));
      boolean boolean0 = range0.contains(1.0);
      assertFalse(boolean0);
      assertEquals(0.0, range0.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Range range0 = Range.expandToInclude((Range) null, (-1.0));
      double double0 = range0.constrain((-1.0));
      assertEquals((-1.0), double0, 0.01);
      assertEquals(0.0, range0.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Range range0 = new Range(0.6806394474564255, 0.6806394474564255);
      double double0 = range0.constrain(0.23881430368706338);
      assertEquals(0.6806394474564255, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Range range0 = null;
      try {
        range0 = new Range(491.4485, (-714.43126806792));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Range(double, double): require lower (491.4485) <= upper (-714.43126806792).
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      String string0 = range0.toString();
      assertEquals("Range[0.0,0.0]", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      // Undeclared exception!
      try { 
        Range.shift((Range) null, (-1.0));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      double double0 = range0.getCentralValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      Range range1 = Range.expand(range0, (-1.0), 0.0);
      assertEquals(0.0, range1.getLength(), 0.01);
      assertEquals(0.0, range0.getLength(), 0.01);
      assertEquals(0.0, range1.getLowerBound(), 0.01);
      assertEquals(0.0, range1.getUpperBound(), 0.01);
  }
}