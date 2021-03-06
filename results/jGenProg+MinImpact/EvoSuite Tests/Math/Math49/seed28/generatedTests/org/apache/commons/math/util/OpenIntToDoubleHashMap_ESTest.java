/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 28 10:46:48 GMT 2017
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
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(600);
      openIntToDoubleHashMap0.put((-248), (-631.38));
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap_Iterator0.advance();
      double double0 = openIntToDoubleHashMap_Iterator0.value();
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertEquals((-631.38), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(600);
      openIntToDoubleHashMap0.put((-248), (-631.38));
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap_Iterator0.advance();
      int int0 = openIntToDoubleHashMap_Iterator0.key();
      assertFalse(openIntToDoubleHashMap_Iterator0.hasNext());
      assertEquals((-248), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(2460);
      openIntToDoubleHashMap0.put(2460, (-1958.6808729956188));
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap_Iterator0.hasNext();
      assertEquals(1, openIntToDoubleHashMap0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-5835.925));
      openIntToDoubleHashMap0.put(6, (-419.87));
      double double0 = openIntToDoubleHashMap0.remove(1309);
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertEquals((-5835.925), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(2460);
      openIntToDoubleHashMap0.put(2460, (-1958.6808729956188));
      openIntToDoubleHashMap0.remove(2460);
      boolean boolean0 = openIntToDoubleHashMap0.containsKey(2460);
      assertEquals(0, openIntToDoubleHashMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap();
      OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new OpenIntToDoubleHashMap(openIntToDoubleHashMap0);
      assertEquals(0, openIntToDoubleHashMap1.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(600);
      openIntToDoubleHashMap0.put((-248), (-631.38));
      int int0 = openIntToDoubleHashMap0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-2098), 0.0);
      // Undeclared exception!
      try { 
        openIntToDoubleHashMap0.remove((-2098));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-2844), (-2844));
      // Undeclared exception!
      try { 
        openIntToDoubleHashMap0.put((-2844), 0.0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -235871069
         //
         verifyException("org.apache.commons.math.util.OpenIntToDoubleHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(2460);
      openIntToDoubleHashMap0.iterator();
      // Undeclared exception!
      openIntToDoubleHashMap0.iterator();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-2291), 1.0);
      // Undeclared exception!
      try { 
        openIntToDoubleHashMap0.get(4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-1065), 2023.6050266194);
      // Undeclared exception!
      try { 
        openIntToDoubleHashMap0.containsKey((-1065));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = null;
      try {
        openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(Integer.MAX_VALUE, 757.8322268);
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
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = null;
      try {
        openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(Integer.MAX_VALUE);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.util.OpenIntToDoubleHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(764.5902110157);
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
  public void test15()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0.1818181574344635);
      openIntToDoubleHashMap0.put(0, 0);
      openIntToDoubleHashMap0.put(693, (-1667.3514496236526));
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap_Iterator0.advance();
      assertEquals(2, openIntToDoubleHashMap0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap0.put(1450, 139.258111847474);
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
  public void test17()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0.1818181574344635);
      openIntToDoubleHashMap0.put(2641, (-985.6431186123506));
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap_Iterator0.advance();
      double double0 = openIntToDoubleHashMap_Iterator0.value();
      assertFalse(openIntToDoubleHashMap_Iterator0.hasNext());
      assertEquals((-985.6431186123506), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-2743.917645));
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap0.put(0, (-4457.6100086));
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
  public void test19()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0.1818181574344635);
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
  public void test20()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0.1818181574344635);
      openIntToDoubleHashMap0.put(0, 0);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap_Iterator0.advance();
      int int0 = openIntToDoubleHashMap_Iterator0.key();
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertEquals(0, int0);
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
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-2743.917645));
      openIntToDoubleHashMap0.put(0, (-4457.6100086));
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      boolean boolean0 = openIntToDoubleHashMap_Iterator0.hasNext();
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-2743.917645));
      openIntToDoubleHashMap0.put(0, (-4457.6100086));
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap_Iterator0.advance();
      boolean boolean0 = openIntToDoubleHashMap_Iterator0.hasNext();
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0.1818181574344635);
      openIntToDoubleHashMap0.put(2641, (-985.6431186123506));
      openIntToDoubleHashMap0.put(0, 0);
      double double0 = openIntToDoubleHashMap0.remove(0);
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0.1818181574344635);
      double double0 = openIntToDoubleHashMap0.remove(1143);
      assertEquals(0.1818181574344635, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-5835.925));
      openIntToDoubleHashMap0.put(3666, 3666);
      openIntToDoubleHashMap0.put(1330, 0.0);
      openIntToDoubleHashMap0.remove(3666);
      double double0 = openIntToDoubleHashMap0.put(1330, 1.625);
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0, 0.1818181574344635);
      openIntToDoubleHashMap0.put(0, 0.1818181574344635);
      openIntToDoubleHashMap0.put((-1736), (-1827.894497449));
      openIntToDoubleHashMap0.remove(0);
      openIntToDoubleHashMap0.remove((-1736));
      double double0 = openIntToDoubleHashMap0.put(0, 0.1818181574344635);
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertEquals(0.1818181574344635, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0);
      openIntToDoubleHashMap0.put(1450, 139.258111847474);
      openIntToDoubleHashMap0.put(2444, 0);
      double double0 = openIntToDoubleHashMap0.put(0, 2222.9227);
      assertEquals(3, openIntToDoubleHashMap0.size());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-5835.925));
      openIntToDoubleHashMap0.put(3666, 3666);
      openIntToDoubleHashMap0.put(1330, 0.0);
      double double0 = openIntToDoubleHashMap0.put(1330, 1.625);
      assertEquals(2, openIntToDoubleHashMap0.size());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-5835.925));
      openIntToDoubleHashMap0.put(3666, 3666);
      openIntToDoubleHashMap0.put(1330, 0.0);
      boolean boolean0 = openIntToDoubleHashMap0.containsKey(1330);
      assertEquals(2, openIntToDoubleHashMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0.1818181574344635);
      openIntToDoubleHashMap0.put(0, 0);
      openIntToDoubleHashMap0.remove(0);
      boolean boolean0 = openIntToDoubleHashMap0.containsKey(0);
      assertEquals(0, openIntToDoubleHashMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap();
      openIntToDoubleHashMap0.put(1236, 0);
      boolean boolean0 = openIntToDoubleHashMap0.containsKey(1236);
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0.1818181574344635);
      boolean boolean0 = openIntToDoubleHashMap0.containsKey(1815);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-5835.925));
      openIntToDoubleHashMap0.put(3666, 3666);
      openIntToDoubleHashMap0.put(1330, 0.0);
      double double0 = openIntToDoubleHashMap0.get(1330);
      assertEquals(2, openIntToDoubleHashMap0.size());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-5835.925));
      openIntToDoubleHashMap0.put(3666, 3666);
      double double0 = openIntToDoubleHashMap0.get(1330);
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertEquals((-5835.925), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-5835.925));
      openIntToDoubleHashMap0.put(1303, (-5835.925));
      double double0 = openIntToDoubleHashMap0.get(1303);
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertEquals((-5835.925), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0.1818181574344635);
      double double0 = openIntToDoubleHashMap0.get(0);
      assertEquals(0.1818181574344635, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0, 0.1818181574344635);
      openIntToDoubleHashMap0.put(0, 0.1818181574344635);
      openIntToDoubleHashMap0.put((-1736), (-1827.894497449));
      openIntToDoubleHashMap0.remove(0);
      openIntToDoubleHashMap0.put(0, 0.1818181574344635);
      assertEquals(2, openIntToDoubleHashMap0.size());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-5835.925));
      openIntToDoubleHashMap0.put(1330, 0.0);
      double double0 = openIntToDoubleHashMap0.put(1330, 1.625);
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0.1818181574344635);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap0.put((-1736), (-1827.894497449));
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
  public void test41()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap();
      openIntToDoubleHashMap0.size();
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
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
}
