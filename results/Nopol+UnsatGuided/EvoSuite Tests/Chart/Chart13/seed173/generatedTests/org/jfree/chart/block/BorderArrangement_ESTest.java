/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 17 02:34:08 GMT 2017
 */

package org.jfree.chart.block;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.sql.Connection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.jfree.chart.block.Arrangement;
import org.jfree.chart.block.Block;
import org.jfree.chart.block.BlockContainer;
import org.jfree.chart.block.BorderArrangement;
import org.jfree.chart.block.EmptyBlock;
import org.jfree.chart.block.RectangleConstraint;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.Size2D;
import org.jfree.data.Range;
import org.jfree.data.jdbc.JDBCXYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BorderArrangement_ESTest extends BorderArrangement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      blockContainer0.setMargin(0.0, (-1.0), 1136.405324088, 1136.405324088);
      borderArrangement0.add(blockContainer0, (Object) null);
      Range range0 = new Range(0.0, 1136.405324088);
      Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, range0, range0, (Graphics2D) null);
      assertEquals(1135.405324088, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) borderArrangement0);
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 0.0);
      assertEquals(0.0, size2D0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) borderArrangement0);
      blockContainer0.setMargin(0.0, (-1.0), 0.0, 0.0);
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 0.0);
      assertEquals((-1.0), size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      blockContainer0.setMargin(0.0, (-1.0), (-1.0), (-1.0));
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, Double.NaN);
      assertEquals((-1.0), size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeRR(blockContainer0, (Range) null, (Range) null, (Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) borderArrangement0);
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFR(blockContainer0, (Graphics2D) null, (RectangleConstraint) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFN((BlockContainer) null, (Graphics2D) null, (-3.2584156062025054));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Range(double, double): require lower (0.0) <= upper (-3.2584156062025054).
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) borderArrangement0);
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFF(blockContainer0, (Graphics2D) null, (RectangleConstraint) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      // Undeclared exception!
      try { 
        borderArrangement0.arrange((BlockContainer) null, (Graphics2D) null, (RectangleConstraint) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) borderArrangement0);
      // Undeclared exception!
      try { 
        borderArrangement0.arrange(blockContainer0, (Graphics2D) null, (RectangleConstraint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'c' argument.
         //
         verifyException("org.jfree.chart.block.AbstractBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      // Undeclared exception!
      try { 
        borderArrangement0.add(blockContainer0, borderArrangement0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) borderArrangement0);
      EmptyBlock emptyBlock0 = new EmptyBlock(1136.405324088, 1981.0);
      blockContainer0.add((Block) emptyBlock0, (Object) null);
      Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, (Graphics2D) null);
      assertEquals(1981.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BorderArrangement borderArrangement1 = new BorderArrangement();
      boolean boolean0 = borderArrangement1.equals(borderArrangement0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      boolean boolean0 = borderArrangement0.equals(rectangleEdge0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      boolean boolean0 = borderArrangement0.equals(borderArrangement0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement1 = new BorderArrangement();
      assertTrue(borderArrangement1.equals((Object)borderArrangement0));
      
      borderArrangement1.add(blockContainer0, (Object) null);
      boolean boolean0 = borderArrangement1.equals(borderArrangement0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      borderArrangement0.add(blockContainer0, (Object) null);
      Range range0 = new Range(0.0, 1136.405324088);
      Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, range0, range0, (Graphics2D) null);
      assertEquals(0.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) borderArrangement0);
      JDBCXYDataset jDBCXYDataset0 = new JDBCXYDataset((Connection) null);
      Range range0 = jDBCXYDataset0.getRangeBounds(true);
      Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, range0, range0, (Graphics2D) null);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) borderArrangement0);
      EmptyBlock emptyBlock0 = new EmptyBlock(1136.405324088, 1981.0);
      blockContainer0.add((Block) emptyBlock0, (Object) null);
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 1136.405324088);
      assertEquals(1981.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      EmptyBlock emptyBlock0 = new EmptyBlock(0.0, 0.0);
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      borderArrangement0.add(emptyBlock0, rectangleEdge0);
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFN((BlockContainer) null, (Graphics2D) null, 601.167060498935);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      EmptyBlock emptyBlock0 = new EmptyBlock(0.0, 0.0);
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      borderArrangement0.add(emptyBlock0, rectangleEdge0);
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFN((BlockContainer) null, (Graphics2D) null, 601.167060498935);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      EmptyBlock emptyBlock0 = new EmptyBlock(0.0, 0.0);
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      borderArrangement0.add(emptyBlock0, rectangleEdge0);
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFN((BlockContainer) null, (Graphics2D) null, 601.154897887014);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      EmptyBlock emptyBlock0 = new EmptyBlock(0.0, 0.0);
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      borderArrangement0.add(emptyBlock0, rectangleEdge0);
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFN((BlockContainer) null, (Graphics2D) null, 601.167060498935);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      borderArrangement0.add(blockContainer0, (Object) null);
      Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, (Graphics2D) null);
      assertEquals(0.0, size2D0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      Size2D size2D0 = blockContainer0.arrange((Graphics2D) null);
      assertEquals(0.0, size2D0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      EmptyBlock emptyBlock0 = new EmptyBlock(0.0, 0.0);
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      borderArrangement0.add(emptyBlock0, rectangleEdge0);
      Size2D size2D0 = borderArrangement0.arrangeNN((BlockContainer) null, (Graphics2D) null);
      assertEquals(0.0, size2D0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      EmptyBlock emptyBlock0 = new EmptyBlock(0.0, 0.0);
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      borderArrangement0.add(emptyBlock0, rectangleEdge0);
      Size2D size2D0 = borderArrangement0.arrangeNN((BlockContainer) null, (Graphics2D) null);
      assertEquals(0.0, size2D0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      EmptyBlock emptyBlock0 = new EmptyBlock(0.0, 0.0);
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      borderArrangement0.add(emptyBlock0, rectangleEdge0);
      Size2D size2D0 = borderArrangement0.arrangeNN((BlockContainer) null, (Graphics2D) null);
      assertEquals(0.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      EmptyBlock emptyBlock0 = new EmptyBlock(0.0, 0.0);
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      borderArrangement0.add(emptyBlock0, rectangleEdge0);
      Size2D size2D0 = borderArrangement0.arrangeNN((BlockContainer) null, (Graphics2D) null);
      assertEquals(0.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      borderArrangement0.clear();
  }
}
