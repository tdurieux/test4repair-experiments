/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 24 22:01:59 GMT 2017
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.text.DefaultCaret;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.renderer.DefaultPolarItemRenderer;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.StackedAreaRenderer;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.chart.text.TextBox;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.CategoryToPieDataset;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.junit.runner.RunWith;
import sun.java2d.SunGraphics2D;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StatisticalBarRenderer_ESTest extends StatisticalBarRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      TableOrder tableOrder0 = TableOrder.BY_COLUMN;
      CategoryToPieDataset categoryToPieDataset0 = new CategoryToPieDataset((CategoryDataset) null, tableOrder0, 1527);
      PiePlot piePlot0 = new PiePlot((PieDataset) categoryToPieDataset0);
      JFreeChart jFreeChart0 = new JFreeChart((Plot) piePlot0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo((EntityCollection) null);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, (double) 1527, 0.0, chartRenderingInfo0);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryItemRendererState categoryItemRendererState0 = stackedAreaRenderer0.initialise(sunGraphics2D0, rectangle2D_Double0, combinedDomainCategoryPlot0, 0, plotRenderingInfo0);
      CategoryAxis categoryAxis0 = new CategoryAxis();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((double) 0.5F, (-2100.7716885339), "Null 'locale' argument.");
      categoryItemRendererState0.setBarWidth(0.2);
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawVerticalItem(sunGraphics2D0, categoryItemRendererState0, rectangle2D_Double0, combinedDomainCategoryPlot0, categoryAxis0, cyclicNumberAxis0, defaultStatisticalCategoryDataset0, 15, 500);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 15, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      Line2D.Double line2D_Double0 = new Line2D.Double();
      Rectangle rectangle0 = line2D_Double0.getBounds();
      CategoryAxis categoryAxis0 = new CategoryAxis("Jelai Wang");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(categoryAxis0);
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("");
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawVerticalItem((Graphics2D) null, (CategoryItemRendererState) null, rectangle0, combinedDomainCategoryPlot0, categoryAxis0, numberAxis3D0, defaultStatisticalCategoryDataset0, 0, 10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.StatisticalBarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double((-1028.3798487109), (-1028.3798487109), 0.0, (-1028.3798487109));
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      LogAxis logAxis0 = new LogAxis("Can't evaluate the year.");
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawHorizontalItem((Graphics2D) null, (CategoryItemRendererState) null, rectangle2D_Double0, combinedRangeCategoryPlot0, (CategoryAxis) null, logAxis0, defaultStatisticalCategoryDataset0, 500, 10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.StatisticalBarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      StatisticalBarRenderer statisticalBarRenderer1 = new StatisticalBarRenderer();
      assertTrue(statisticalBarRenderer1.equals((Object)statisticalBarRenderer0));
      
      DefaultPolarItemRenderer defaultPolarItemRenderer0 = new DefaultPolarItemRenderer();
      Color color0 = (Color)defaultPolarItemRenderer0.getBaseFillPaint();
      statisticalBarRenderer0.setErrorIndicatorPaint(color0);
      boolean boolean0 = statisticalBarRenderer0.equals(statisticalBarRenderer1);
      assertFalse(statisticalBarRenderer1.equals((Object)statisticalBarRenderer0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      StatisticalBarRenderer statisticalBarRenderer1 = new StatisticalBarRenderer();
      boolean boolean0 = statisticalBarRenderer0.equals(statisticalBarRenderer1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Point2D.Double point2D_Double0 = new Point2D.Double(0.0, 0.0);
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      boolean boolean0 = statisticalBarRenderer0.equals(point2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      boolean boolean0 = statisticalBarRenderer0.equals(statisticalBarRenderer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      StatisticalBarRenderer statisticalBarRenderer1 = new StatisticalBarRenderer();
      assertTrue(statisticalBarRenderer1.equals((Object)statisticalBarRenderer0));
      
      statisticalBarRenderer1.setMaximumBarWidth(3.0);
      boolean boolean0 = statisticalBarRenderer0.equals(statisticalBarRenderer1);
      assertFalse(statisticalBarRenderer1.equals((Object)statisticalBarRenderer0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      DefaultCaret defaultCaret0 = new DefaultCaret();
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      CategoryAxis categoryAxis0 = new CategoryAxis();
      PeriodAxis periodAxis0 = new PeriodAxis("V_76}Uw>M");
      CategoryPlot categoryPlot0 = new CategoryPlot((CategoryDataset) defaultKeyedValues2DDataset0, categoryAxis0, (ValueAxis) periodAxis0, (CategoryItemRenderer) statisticalBarRenderer0);
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawItem((Graphics2D) null, (CategoryItemRendererState) null, defaultCaret0, categoryPlot0, categoryAxis0, periodAxis0, defaultKeyedValues2DDataset0, 274, 0, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires StatisticalCategoryDataset.
         //
         verifyException("org.jfree.chart.renderer.category.StatisticalBarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      TextBox textBox0 = new TextBox("");
      BasicStroke basicStroke0 = (BasicStroke)textBox0.getOutlineStroke();
      statisticalBarRenderer0.setErrorIndicatorStroke(basicStroke0);
      assertFalse(statisticalBarRenderer0.getAutoPopulateSeriesFillPaint());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      BasicStroke basicStroke0 = (BasicStroke)statisticalBarRenderer0.getErrorIndicatorStroke();
      assertEquals(0.5F, basicStroke0.getLineWidth(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      Color color0 = (Color)statisticalBarRenderer0.getErrorIndicatorPaint();
      assertEquals(128, color0.getGreen());
  }
}
