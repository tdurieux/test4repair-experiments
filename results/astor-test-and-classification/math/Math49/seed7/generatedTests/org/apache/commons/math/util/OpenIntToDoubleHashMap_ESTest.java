/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 12 21:39:50 GMT 2017
 */

package org.apache.commons.math.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import org.apache.commons.math.util.OpenIntToDoubleHashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OpenIntToDoubleHashMap_ESTest extends OpenIntToDoubleHashMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap();
      openIntToDoubleHashMap0.put(2, 0.0);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap_Iterator0.advance();
      openIntToDoubleHashMap_Iterator0.value();
      assertEquals(1, openIntToDoubleHashMap0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap();
      openIntToDoubleHashMap0.put(2, 0.0);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap_Iterator0.advance();
      int int0 = openIntToDoubleHashMap_Iterator0.key();
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((double) 2657);
      openIntToDoubleHashMap0.put(2657, 2657);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      boolean boolean0 = openIntToDoubleHashMap_Iterator0.hasNext();
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0, 0);
      openIntToDoubleHashMap0.put(Integer.MAX_VALUE, Integer.MAX_VALUE);
      double double0 = openIntToDoubleHashMap0.remove((-3077));
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap();
      openIntToDoubleHashMap0.put(2, 0.0);
      int int0 = openIntToDoubleHashMap0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0);
      double double0 = openIntToDoubleHashMap0.get(0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-2378));
      // Undeclared exception!
      try { 
        openIntToDoubleHashMap0.remove((-2378));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-839));
      // Undeclared exception!
      try { 
        openIntToDoubleHashMap0.put((-839), 0.3333333333333333);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -235869077
         //
         verifyException("org.apache.commons.math.util.OpenIntToDoubleHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(1638, 1974.5);
      openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap0.iterator();
      // Undeclared exception!
      openIntToDoubleHashMap0.iterator();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-127), 1883.471);
      // Undeclared exception!
      try { 
        openIntToDoubleHashMap0.get(12);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-906));
      // Undeclared exception!
      try { 
        openIntToDoubleHashMap0.containsKey(2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = null;
      try {
        openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((OpenIntToDoubleHashMap) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.util.OpenIntToDoubleHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = null;
      try {
        openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-2013265919), 1531.0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.util.OpenIntToDoubleHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-1.0));
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      try { 
        openIntToDoubleHashMap_Iterator0.advance();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // iterator exhausted
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0, 0);
      openIntToDoubleHashMap0.put(0, (-1.0));
      assertEquals(1, openIntToDoubleHashMap0.size());
      
      openIntToDoubleHashMap0.put(2295, 3608.0);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap_Iterator0.advance();
      assertTrue(openIntToDoubleHashMap_Iterator0.hasNext());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0, 0);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap0.put(0, 0);
      try { 
        openIntToDoubleHashMap_Iterator0.advance();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // map has been modified while iterating
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap();
      openIntToDoubleHashMap0.put(0, 0.0);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap_Iterator0.advance();
      double double0 = openIntToDoubleHashMap_Iterator0.value();
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap();
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap0.put(0, 0.0);
      try { 
        openIntToDoubleHashMap_Iterator0.value();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // map has been modified while iterating
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap();
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      try { 
        openIntToDoubleHashMap_Iterator0.value();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // iterator exhausted
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap();
      openIntToDoubleHashMap0.put(0, 0.0);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap_Iterator0.advance();
      int int0 = openIntToDoubleHashMap_Iterator0.key();
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0, 0);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap0.put(Integer.MAX_VALUE, 1355.83);
      try { 
        openIntToDoubleHashMap_Iterator0.key();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // map has been modified while iterating
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap();
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      try { 
        openIntToDoubleHashMap_Iterator0.key();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // iterator exhausted
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap();
      openIntToDoubleHashMap0.put(0, 2601.3930326537);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      boolean boolean0 = openIntToDoubleHashMap_Iterator0.hasNext();
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0, 0);
      openIntToDoubleHashMap0.put(0, 0);
      openIntToDoubleHashMap0.put((-1532), 0.0);
      double double0 = openIntToDoubleHashMap0.put((-64), 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-837.64252171372));
      openIntToDoubleHashMap0.put((-1264), (-850.0));
      openIntToDoubleHashMap0.put(8388607, (-837.64252171372));
      double double0 = openIntToDoubleHashMap0.remove(8388607);
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertEquals((-837.64252171372), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0, 0);
      openIntToDoubleHashMap0.remove(161);
      assertEquals(0, openIntToDoubleHashMap0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-1699.84257882));
      openIntToDoubleHashMap0.put(32, 706);
      openIntToDoubleHashMap0.put((-29), (-1699.84257882));
      openIntToDoubleHashMap0.remove(32);
      double double0 = openIntToDoubleHashMap0.put((-29), (-1699.84257882));
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertEquals((-1699.84257882), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0, 0);
      openIntToDoubleHashMap0.put(Integer.MAX_VALUE, Integer.MAX_VALUE);
      openIntToDoubleHashMap0.remove(Integer.MAX_VALUE);
      openIntToDoubleHashMap0.put(Integer.MAX_VALUE, Integer.MAX_VALUE);
      assertEquals(1, openIntToDoubleHashMap0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-1699.84257882));
      openIntToDoubleHashMap0.put(32, 706);
      openIntToDoubleHashMap0.put(823, 823);
      openIntToDoubleHashMap0.remove(32);
      double double0 = openIntToDoubleHashMap0.put((-29), (-1699.84257882));
      assertEquals(2, openIntToDoubleHashMap0.size());
      assertEquals((-1699.84257882), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-837.64252171372));
      openIntToDoubleHashMap0.put((-1264), (-850.0));
      openIntToDoubleHashMap0.put(8388607, (-837.64252171372));
      double double0 = openIntToDoubleHashMap0.put(8388607, (-1264));
      assertEquals(2, openIntToDoubleHashMap0.size());
      assertEquals((-837.64252171372), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0, 0);
      openIntToDoubleHashMap0.put(Integer.MAX_VALUE, Integer.MAX_VALUE);
      double double0 = openIntToDoubleHashMap0.put((-3077), Double.NaN);
      assertEquals(2, openIntToDoubleHashMap0.size());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((double) 2657);
      openIntToDoubleHashMap0.put(255, 194.3325822705706);
      openIntToDoubleHashMap0.put(16, 2657.0);
      boolean boolean0 = openIntToDoubleHashMap0.containsKey(16);
      assertEquals(2, openIntToDoubleHashMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0, 0);
      openIntToDoubleHashMap0.put(Integer.MAX_VALUE, Integer.MAX_VALUE);
      boolean boolean0 = openIntToDoubleHashMap0.containsKey(1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-837.64252171372));
      openIntToDoubleHashMap0.put((-1264), (-850.0));
      boolean boolean0 = openIntToDoubleHashMap0.containsKey((-1264));
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0, 0);
      boolean boolean0 = openIntToDoubleHashMap0.containsKey(1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-1699.84257882));
      openIntToDoubleHashMap0.put(32, 706);
      openIntToDoubleHashMap0.put((-29), (-1699.84257882));
      double double0 = openIntToDoubleHashMap0.get((-29));
      assertEquals(2, openIntToDoubleHashMap0.size());
      assertEquals((-1699.84257882), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-1699.84257882));
      openIntToDoubleHashMap0.put(32, 706);
      openIntToDoubleHashMap0.get((-29));
      assertEquals(1, openIntToDoubleHashMap0.size());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0);
      openIntToDoubleHashMap0.put(0, 0);
      double double0 = openIntToDoubleHashMap0.get(0);
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap();
      int int0 = openIntToDoubleHashMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap();
      openIntToDoubleHashMap0.put(0, 0.0);
      double double0 = openIntToDoubleHashMap0.put(0, 0.0);
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = null;
      try {
        openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(Integer.MIN_VALUE);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.util.OpenIntToDoubleHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap();
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      boolean boolean0 = openIntToDoubleHashMap_Iterator0.hasNext();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0, (-2677.1756));
      OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new OpenIntToDoubleHashMap(openIntToDoubleHashMap0);
      assertEquals(0, openIntToDoubleHashMap1.size());
  }
}
