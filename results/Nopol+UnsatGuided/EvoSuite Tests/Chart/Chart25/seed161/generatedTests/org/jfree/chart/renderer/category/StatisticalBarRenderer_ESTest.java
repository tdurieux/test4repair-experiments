/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 24 22:32:04 GMT 2017
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.text.DefaultCaret;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.ModuloAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.renderer.category.LevelRenderer;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.junit.runner.RunWith;
import sun.java2d.SunGraphics2D;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StatisticalBarRenderer_ESTest extends StatisticalBarRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot((CategoryDataset) defaultStatisticalCategoryDataset0);
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0);
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, 1, chartRenderingInfo0);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      CategoryItemRendererState categoryItemRendererState0 = statisticalBarRenderer0.createState((PlotRenderingInfo) null);
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      categoryItemRendererState0.setBarWidth(1622.394208698545);
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("ZOOM_RESET_BOTH");
      ModuloAxis moduloAxis0 = new ModuloAxis("TextAnchor.TOP_LEFT", (Range) null);
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawItem(sunGraphics2D0, categoryItemRendererState0, rectangle2D_Double0, combinedDomainCategoryPlot0, categoryAxis3D0, moduloAxis0, defaultStatisticalCategoryDataset0, 703, 2491, 1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 703, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      statisticalBarRenderer0.setErrorIndicatorPaint((Paint) null);
      Color color0 = (Color)statisticalBarRenderer0.getErrorIndicatorPaint();
      assertNull(color0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo((EntityCollection) standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = new CategoryItemRendererState(plotRenderingInfo0);
      Polygon polygon0 = new Polygon();
      Rectangle rectangle0 = (Rectangle)polygon0.getBounds2D();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawVerticalItem((Graphics2D) null, categoryItemRendererState0, rectangle0, categoryPlot0, (CategoryAxis) null, (ValueAxis) null, defaultStatisticalCategoryDataset0, (-5848), 10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.StatisticalBarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo((EntityCollection) standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryStepRenderer.State categoryStepRenderer_State0 = (CategoryStepRenderer.State)categoryStepRenderer0.createState(plotRenderingInfo0);
      int[] intArray0 = new int[8];
      Polygon polygon0 = new Polygon(intArray0, intArray0, 0);
      Rectangle rectangle0 = polygon0.getBounds();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      CategoryAxis categoryAxis0 = new CategoryAxis("");
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      NumberAxis numberAxis0 = (NumberAxis)thermometerPlot0.getRangeAxis();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawVerticalItem((Graphics2D) null, categoryStepRenderer_State0, rectangle0, combinedDomainCategoryPlot0, categoryAxis0, numberAxis0, defaultStatisticalCategoryDataset0, 1407, 250);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1407, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DefaultCaret defaultCaret0 = new DefaultCaret();
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      boolean boolean0 = statisticalBarRenderer0.equals(defaultCaret0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot((CategoryDataset) defaultStatisticalCategoryDataset0);
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(1339, 3311);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CategoryAxis categoryAxis0 = new CategoryAxis("");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(categoryAxis0);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo((EntityCollection) standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryItemRendererState categoryItemRendererState0 = levelRenderer0.initialise(sunGraphics2D0, rectangle2D_Double0, combinedDomainCategoryPlot0, 0, plotRenderingInfo0);
      DateAxis dateAxis0 = new DateAxis();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawHorizontalItem(sunGraphics2D0, categoryItemRendererState0, rectangle2D_Double0, combinedDomainCategoryPlot0, categoryAxis0, dateAxis0, defaultStatisticalCategoryDataset0, 35, 1339);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 35, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo((EntityCollection) standardEntityCollection0);
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryStepRenderer.State categoryStepRenderer_State0 = (CategoryStepRenderer.State)categoryStepRenderer0.createState(plotRenderingInfo0);
      CategoryPlot categoryPlot0 = new CategoryPlot();
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      DateAxis dateAxis0 = new DateAxis();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawItem((Graphics2D) null, categoryStepRenderer_State0, rectangle2D_Double0, categoryPlot0, categoryAxis3D0, dateAxis0, (CategoryDataset) null, 5, (-187), (-914));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires StatisticalCategoryDataset.
         //
         verifyException("org.jfree.chart.renderer.category.StatisticalBarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      statisticalBarRenderer0.setErrorIndicatorStroke((Stroke) null);
      BasicStroke basicStroke0 = (BasicStroke)statisticalBarRenderer0.getErrorIndicatorStroke();
      assertNull(basicStroke0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      BasicStroke basicStroke0 = (BasicStroke)statisticalBarRenderer0.getErrorIndicatorStroke();
      assertEquals(0.5F, basicStroke0.getLineWidth(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      Color color0 = (Color)statisticalBarRenderer0.getErrorIndicatorPaint();
      assertEquals(128, color0.getRed());
  }
}