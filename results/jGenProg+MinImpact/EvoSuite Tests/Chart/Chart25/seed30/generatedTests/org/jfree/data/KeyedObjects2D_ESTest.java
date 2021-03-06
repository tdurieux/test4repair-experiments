/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 29 16:06:25 GMT 2017
 */

package org.jfree.data;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.KeyedObjects;
import org.jfree.data.KeyedObjects2D;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class KeyedObjects2D_ESTest extends KeyedObjects2D_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.addObject("@A9", "@A9", "@A9");
      keyedObjects2D0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.setObject("", "", "");
      KeyedObjects2D keyedObjects2D1 = (KeyedObjects2D)keyedObjects2D0.clone();
      Integer integer0 = new Integer(0);
      keyedObjects2D0.setObject(integer0, integer0, "");
      boolean boolean0 = keyedObjects2D0.equals(keyedObjects2D1);
      assertEquals(2, keyedObjects2D1.getRowCount());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.setObject("", "", "");
      Object object0 = new Object();
      Comparable comparable0 = keyedObjects2D0.getRowKey(0);
      Integer integer0 = new Integer(0);
      keyedObjects2D0.setObject(comparable0, comparable0, integer0);
      keyedObjects2D0.setObject(object0, integer0, integer0);
      assertEquals(2, keyedObjects2D0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      Integer integer0 = new Integer(2037);
      keyedObjects2D0.setObject(keyedObjects2D0, integer0, (Comparable) null);
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Object object0 = keyedObjects2D0.getObject((Comparable) null, (Comparable) null);
      keyedObjects2D0.setObject(object0, (Comparable) null, (Comparable) null);
      // Undeclared exception!
      try { 
        keyedObjects2D0.setObject(keyedObjects0, (Comparable) null, (Comparable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      Integer integer0 = Integer.getInteger("org.jfree.data.KeyedObjects", 0);
      keyedObjects2D0.addObject(integer0, integer0, "org.jfree.data.KeyedObjects");
      assertEquals(1, keyedObjects2D0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      Integer integer0 = new Integer(2037);
      Object object0 = keyedObjects2D0.getObject((Comparable) null, (Comparable) integer0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.removeObject((Comparable) null, (Comparable) null);
      keyedObjects2D0.removeRow(0);
      assertEquals(0, keyedObjects2D0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.setObject("Ll3~$@bj", "Ll3~$@bj", "Ll3~$@bj");
      keyedObjects2D0.removeColumn(0);
      assertEquals(1, keyedObjects2D0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      boolean boolean0 = keyedObjects2D0.equals(keyedObjects2D0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.setObject((Object) null, (Comparable) null, (Comparable) null);
      Comparable comparable0 = keyedObjects2D0.getRowKey(0);
      assertNull(comparable0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.addObject("org.jfree.data.KeyedObjects", "org.jfree.data.KeyedObjects", "org.jfree.data.KeyedObjects");
      int int0 = keyedObjects2D0.getRowIndex("org.jfree.data.KeyedObjects");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.addObject((Object) null, (Comparable) null, (Comparable) null);
      Integer integer0 = new Integer((-1));
      keyedObjects2D0.addObject(integer0, integer0, integer0);
      int int0 = keyedObjects2D0.getRowIndex(integer0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.setObject("", "", "");
      int int0 = keyedObjects2D0.getRowCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.setObject("", "", "");
      Comparable comparable0 = keyedObjects2D0.getRowKey(0);
      String string0 = (String)keyedObjects2D0.getObject(comparable0, comparable0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      Integer integer0 = new Integer(2037);
      keyedObjects2D0.setObject(keyedObjects2D0, integer0, (Comparable) null);
      Comparable comparable0 = keyedObjects2D0.getColumnKey(0);
      assertNull(comparable0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.addObject("org.jfree.data.KeyedObjects", "org.jfree.data.KeyedObjects", "org.jfree.data.KeyedObjects");
      Comparable comparable0 = keyedObjects2D0.getColumnKey(0);
      assertEquals("org.jfree.data.KeyedObjects", comparable0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.setObject("", "", "");
      int int0 = keyedObjects2D0.getColumnIndex("");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.addObject("org.jfree.data.KeyedObjects", "org.jfree.data.KeyedObjects", "org.jfree.data.KeyedObjects");
      Integer integer0 = Integer.getInteger("org.jfree.data.KeyedObjects", 0);
      keyedObjects2D0.removeObject("org.jfree.data.KeyedObjects", integer0);
      int int0 = keyedObjects2D0.getColumnIndex(integer0);
      assertEquals(2, keyedObjects2D0.getColumnCount());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.addObject("", "", "");
      int int0 = keyedObjects2D0.getColumnCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      // Undeclared exception!
      try { 
        keyedObjects2D0.removeRow((-1372));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.removeObject((Comparable) null, (Comparable) null);
      // Undeclared exception!
      try { 
        keyedObjects2D0.removeObject((Comparable) null, (Comparable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.setObject((Object) null, (Comparable) null, (Comparable) null);
      // Undeclared exception!
      try { 
        keyedObjects2D0.removeColumn((Comparable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.addObject("@A9", "@A9", "@A9");
      // Undeclared exception!
      try { 
        keyedObjects2D0.removeColumn((Comparable) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      // Undeclared exception!
      try { 
        keyedObjects2D0.removeColumn((-965));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      // Undeclared exception!
      try { 
        keyedObjects2D0.getRowKey((-295));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      // Undeclared exception!
      try { 
        keyedObjects2D0.getObject(0, 2033);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      // Undeclared exception!
      try { 
        keyedObjects2D0.getObject((-2301), (-2301));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      // Undeclared exception!
      try { 
        keyedObjects2D0.getColumnKey((-4318));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      KeyedObjects2D keyedObjects2D1 = (KeyedObjects2D)keyedObjects2D0.clone();
      Integer integer0 = Integer.valueOf((-1));
      keyedObjects2D1.addObject((Object) null, integer0, integer0);
      keyedObjects2D1.removeObject((Comparable) null, (Comparable) null);
      // Undeclared exception!
      try { 
        keyedObjects2D0.equals(keyedObjects2D1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      Object object0 = new Object();
      keyedObjects2D0.setObject((Object) null, (Comparable) null, (Comparable) null);
      // Undeclared exception!
      try { 
        keyedObjects2D0.addObject(object0, (Comparable) null, (Comparable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.addObject("$@A9", "$@A9", "$@A9");
      keyedObjects2D0.removeColumn((Comparable) "$@A9");
      assertEquals(1, keyedObjects2D0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.addObject((Object) null, (Comparable) null, (Comparable) null);
      Object object0 = keyedObjects2D0.getObject(0, 0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.setObject("", "", "");
      String string0 = (String)keyedObjects2D0.getObject(0, 0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      // Undeclared exception!
      try { 
        keyedObjects2D0.removeRow(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      List list0 = keyedObjects2D0.getRowKeys();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      int int0 = keyedObjects2D0.getRowIndex("org.jfree.data.KeyedObjects");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      // Undeclared exception!
      try { 
        keyedObjects2D0.getColumnKey(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      List list0 = keyedObjects2D0.getColumnKeys();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      int int0 = keyedObjects2D0.getColumnCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      int int0 = keyedObjects2D0.getRowCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.addObject("", "", "");
      KeyedObjects2D keyedObjects2D1 = new KeyedObjects2D();
      keyedObjects2D1.removeObject("", "");
      boolean boolean0 = keyedObjects2D0.equals(keyedObjects2D1);
      assertEquals(1, keyedObjects2D1.getColumnCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.removeObject("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D");
      keyedObjects2D0.removeRow((Comparable) "org.jfree.data.KeyedObjects2D");
      KeyedObjects2D keyedObjects2D1 = new KeyedObjects2D();
      boolean boolean0 = keyedObjects2D0.equals(keyedObjects2D1);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      KeyedObjects2D keyedObjects2D1 = new KeyedObjects2D();
      Integer integer0 = new Integer(2037);
      keyedObjects2D1.setObject(keyedObjects2D0, integer0, (Comparable) null);
      boolean boolean0 = keyedObjects2D0.equals(keyedObjects2D1);
      assertEquals(1, keyedObjects2D1.getColumnCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      boolean boolean0 = keyedObjects2D0.equals("7ou)Zn1");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      boolean boolean0 = keyedObjects2D0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      Object object0 = new Object();
      keyedObjects2D0.setObject(object0, (Comparable) null, (Comparable) null);
      // Undeclared exception!
      try { 
        keyedObjects2D0.removeColumn(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      Integer integer0 = new Integer(2037);
      keyedObjects2D0.setObject(keyedObjects2D0, integer0, (Comparable) null);
      KeyedObjects keyedObjects0 = new KeyedObjects();
      keyedObjects2D0.setObject(keyedObjects0, (Comparable) null, (Comparable) null);
      // Undeclared exception!
      try { 
        keyedObjects2D0.getObject((Comparable) null, (Comparable) integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.removeObject("7ou)Zn1", "7ou)Zn1");
      KeyedObjects2D keyedObjects2D1 = new KeyedObjects2D();
      keyedObjects2D1.setObject(keyedObjects2D1, "7ou)Zn1", "7ou)Zn1");
      boolean boolean0 = keyedObjects2D0.equals(keyedObjects2D1);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      // Undeclared exception!
      try { 
        keyedObjects2D0.removeRow((Comparable) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      // Undeclared exception!
      try { 
        keyedObjects2D0.removeColumn(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      int int0 = keyedObjects2D0.getColumnIndex("");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      // Undeclared exception!
      try { 
        keyedObjects2D0.getRowKey(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}
