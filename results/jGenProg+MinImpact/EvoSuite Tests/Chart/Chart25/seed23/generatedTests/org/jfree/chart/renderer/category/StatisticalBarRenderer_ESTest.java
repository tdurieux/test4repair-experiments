/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 12 13:09:44 GMT 2017
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.renderer.AbstractRenderer;
import org.jfree.chart.renderer.category.AreaRenderer;
import org.jfree.chart.renderer.category.BoxAndWhiskerRenderer;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.StackedAreaRenderer;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StatisticalBarRenderer_ESTest extends StatisticalBarRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double((double) 10, (double) 694, 0.0, (double) 1.0F);
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = stackedAreaRenderer0.initialise((Graphics2D) null, rectangle2D_Double0, combinedDomainCategoryPlot0, 1, plotRenderingInfo0);
      categoryItemRendererState0.setBarWidth(1.0F);
      CategoryAxis categoryAxis0 = new CategoryAxis();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawVerticalItem((Graphics2D) null, categoryItemRendererState0, rectangle2D_Double0, combinedDomainCategoryPlot0, categoryAxis0, (ValueAxis) null, defaultStatisticalCategoryDataset0, 10609, 10165);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 10609, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      SystemColor systemColor0 = SystemColor.desktop;
      statisticalBarRenderer0.setErrorIndicatorPaint(systemColor0);
      SystemColor systemColor1 = (SystemColor)statisticalBarRenderer0.getErrorIndicatorPaint();
      assertEquals(1, systemColor1.getTransparency());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = (Rectangle2D.Double)AbstractRenderer.DEFAULT_SHAPE;
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("~B|(j**eVeA");
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawVerticalItem((Graphics2D) null, (CategoryItemRendererState) null, rectangle2D_Double0, combinedDomainCategoryPlot0, categoryAxis3D0, (ValueAxis) null, defaultStatisticalCategoryDataset0, 252, 1928);
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
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double((double) 10, (double) 694, 0.0, (double) 1.0F);
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = stackedAreaRenderer0.initialise((Graphics2D) null, rectangle2D_Double0, combinedDomainCategoryPlot0, 1, plotRenderingInfo0);
      CategoryAxis categoryAxis0 = new CategoryAxis();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawVerticalItem((Graphics2D) null, categoryItemRendererState0, rectangle2D_Double0, combinedDomainCategoryPlot0, categoryAxis0, (ValueAxis) null, defaultStatisticalCategoryDataset0, 10628, 10165);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 10628, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = (Rectangle2D.Double)AbstractRenderer.DEFAULT_SHAPE;
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("~B|(j**eVeA");
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawHorizontalItem((Graphics2D) null, (CategoryItemRendererState) null, rectangle2D_Double0, combinedDomainCategoryPlot0, categoryAxis3D0, (ValueAxis) null, defaultStatisticalCategoryDataset0, 0, 500);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.StatisticalBarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      AreaRenderer areaRenderer0 = new AreaRenderer();
      statisticalBarRenderer0.setErrorIndicatorPaint(areaRenderer0.DEFAULT_PAINT);
      StatisticalBarRenderer statisticalBarRenderer1 = new StatisticalBarRenderer();
      boolean boolean0 = statisticalBarRenderer0.equals(statisticalBarRenderer1);
      assertFalse(statisticalBarRenderer1.equals((Object)statisticalBarRenderer0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      StatisticalBarRenderer statisticalBarRenderer1 = new StatisticalBarRenderer();
      boolean boolean0 = statisticalBarRenderer0.equals(statisticalBarRenderer1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      Point2D.Double point2D_Double0 = (Point2D.Double)line2D_Double0.getP1();
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      boolean boolean0 = statisticalBarRenderer0.equals(point2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      boolean boolean0 = statisticalBarRenderer0.equals(statisticalBarRenderer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      StatisticalBarRenderer statisticalBarRenderer1 = new StatisticalBarRenderer();
      assertTrue(statisticalBarRenderer1.equals((Object)statisticalBarRenderer0));
      
      statisticalBarRenderer1.setDrawBarOutline(true);
      boolean boolean0 = statisticalBarRenderer0.equals(statisticalBarRenderer1);
      assertFalse(statisticalBarRenderer1.equals((Object)statisticalBarRenderer0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      Line2D.Float line2D_Float0 = new Line2D.Float();
      Rectangle2D.Float rectangle2D_Float0 = (Rectangle2D.Float)line2D_Float0.getBounds2D();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo((EntityCollection) standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryItemRendererState categoryItemRendererState0 = boxAndWhiskerRenderer0.initialise((Graphics2D) null, rectangle2D_Float0, combinedDomainCategoryPlot0, 10, plotRenderingInfo0);
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("Q'14tX*'");
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-2065.0), 2738.779033);
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawHorizontalItem((Graphics2D) null, categoryItemRendererState0, rectangle2D_Float0, combinedDomainCategoryPlot0, subCategoryAxis0, cyclicNumberAxis0, defaultStatisticalCategoryDataset0, (-479), 10);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryItemRendererState categoryItemRendererState0 = boxAndWhiskerRenderer0.initialise((Graphics2D) null, rectangle2D_Double0, combinedDomainCategoryPlot0, 10, plotRenderingInfo0);
      CategoryAxis categoryAxis0 = new CategoryAxis("java.awt.geom.Rectangle2D$Double[x=0.0,y=0.0,w=0.0,h=0.0]");
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("Category");
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawItem((Graphics2D) null, categoryItemRendererState0, rectangle2D_Double0, combinedDomainCategoryPlot0, categoryAxis0, logarithmicAxis0, (CategoryDataset) null, 10, (-1), 10);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires StatisticalCategoryDataset.
         //
         verifyException("org.jfree.chart.renderer.category.StatisticalBarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      BasicStroke basicStroke0 = (BasicStroke)combinedDomainCategoryPlot0.getRangeGridlineStroke();
      statisticalBarRenderer0.setErrorIndicatorStroke(basicStroke0);
      assertEquals(0.0, statisticalBarRenderer0.getLowerClip(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      BasicStroke basicStroke0 = (BasicStroke)statisticalBarRenderer0.getErrorIndicatorStroke();
      assertEquals(0.5F, basicStroke0.getLineWidth(), 0.01F);
  }
}