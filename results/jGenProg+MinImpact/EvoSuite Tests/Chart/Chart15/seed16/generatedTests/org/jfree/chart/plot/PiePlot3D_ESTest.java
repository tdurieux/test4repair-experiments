/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 15 22:58:04 GMT 2017
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.plot.DrawingSupplier;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.PlotState;
import org.jfree.data.general.DefaultKeyedValuesDataset;
import org.jfree.data.general.PieDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PiePlot3D_ESTest extends PiePlot3D_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      piePlot3D0.setDrawingSupplier((DrawingSupplier) null);
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      PiePlot3D piePlot3D1 = new PiePlot3D((PieDataset) defaultKeyedValuesDataset0);
      // Undeclared exception!
      try { 
        piePlot3D0.equals(piePlot3D1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.Plot", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = (Rectangle2D.Double)Plot.DEFAULT_LEGEND_ITEM_BOX;
      PiePlot3D piePlot3D0 = new PiePlot3D();
      PlotState plotState0 = new PlotState();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      // Undeclared exception!
      try { 
        piePlot3D0.draw((Graphics2D) null, rectangle2D_Double0, (Point2D) null, plotState0, plotRenderingInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.Plot", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      piePlot3D0.setDarkerSides(true);
      PiePlot3D piePlot3D1 = new PiePlot3D((PieDataset) defaultKeyedValuesDataset0);
      boolean boolean0 = piePlot3D0.equals(piePlot3D1);
      assertTrue(piePlot3D0.getDarkerSides());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      PiePlot3D piePlot3D1 = new PiePlot3D((PieDataset) defaultKeyedValuesDataset0);
      boolean boolean0 = piePlot3D0.equals(piePlot3D1);
      assertTrue(boolean0);
      assertFalse(piePlot3D1.isCircular());
      assertEquals(0.12, piePlot3D1.getDepthFactor(), 0.01);
      assertFalse(piePlot3D1.getDarkerSides());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      boolean boolean0 = piePlot3D0.equals(piePlot3D0);
      assertTrue(boolean0);
      assertEquals(0.12, piePlot3D0.getDepthFactor(), 0.01);
      assertFalse(piePlot3D0.isCircular());
      assertFalse(piePlot3D0.getDarkerSides());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      boolean boolean0 = piePlot3D0.getDarkerSides();
      assertEquals(0.12, piePlot3D0.getDepthFactor(), 0.01);
      assertFalse(boolean0);
      assertFalse(piePlot3D0.isCircular());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      piePlot3D0.setDarkerSides(true);
      PiePlot3D piePlot3D1 = new PiePlot3D((PieDataset) defaultKeyedValuesDataset0);
      defaultKeyedValuesDataset0.removeChangeListener(piePlot3D0);
      assertFalse(piePlot3D0.equals((Object)piePlot3D1));
      assertTrue(piePlot3D0.getDarkerSides());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D((PieDataset) null);
      piePlot3D0.equals((Object) null);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D((PieDataset) null);
      assertEquals(0.12, piePlot3D0.getDepthFactor(), 0.01);
      
      piePlot3D0.setDepthFactor(0.0);
      assertFalse(piePlot3D0.isCircular());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      piePlot3D0.getPlotType();
      assertEquals(0.12, piePlot3D0.getDepthFactor(), 0.01);
      assertFalse(piePlot3D0.isCircular());
      assertFalse(piePlot3D0.getDarkerSides());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      double double0 = piePlot3D0.getDepthFactor();
      assertEquals(0.12, double0, 0.01);
      assertFalse(piePlot3D0.isCircular());
      assertFalse(piePlot3D0.getDarkerSides());
  }
}