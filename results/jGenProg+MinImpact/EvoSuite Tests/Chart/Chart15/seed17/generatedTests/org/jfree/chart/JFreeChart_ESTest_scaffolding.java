/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Jan 18 21:41:41 GMT 2017
 */

package org.jfree.chart;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class JFreeChart_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jfree.chart.JFreeChart"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  public static void setSystemProperties() {
 
    /*No java.lang.System property to set*/
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(JFreeChart_ESTest_scaffolding.class.getClassLoader() ,
      "org.jfree.chart.labels.StandardPieSectionLabelGenerator",
      "com.lowagie.text.pdf.TrueTypeFontUnicode",
      "org.jfree.chart.plot.ValueMarker",
      "com.lowagie.text.Jpeg2000",
      "com.lowagie.text.pdf.PdfOCG",
      "com.lowagie.text.Element",
      "org.jfree.data.general.ValueDataset",
      "com.lowagie.text.pdf.collection.PdfCollectionItem",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.chart.LegendItemCollection",
      "com.lowagie.text.pdf.ExtraEncoding",
      "org.jfree.data.RangeInfo",
      "com.lowagie.text.xml.xmp.PdfA1Schema",
      "org.jfree.chart.text.TextFragment",
      "com.lowagie.text.pdf.CJKFont",
      "com.lowagie.text.pdf.DefaultFontMapper$BaseFontParameters",
      "org.jfree.chart.labels.ItemLabelPosition",
      "com.lowagie.text.pdf.internal.PdfAnnotationsImp",
      "com.lowagie.text.pdf.AsianFontMapper",
      "org.jfree.chart.plot.PiePlot3D",
      "org.jfree.chart.util.PaintList",
      "org.jfree.chart.labels.ItemLabelAnchor",
      "org.jfree.chart.axis.Timeline",
      "org.jfree.chart.ui.Contributor",
      "org.jfree.chart.needle.LongNeedle",
      "org.jfree.data.time.TimeSeriesCollection",
      "com.lowagie.text.pdf.PdfStructureElement",
      "org.jfree.chart.util.RectangleAnchor",
      "org.jfree.data.time.TimePeriodFormatException",
      "org.jfree.chart.text.TextBlock",
      "com.lowagie.text.pdf.ColorDetails",
      "org.jfree.chart.axis.Axis",
      "com.lowagie.text.pdf.PdfPattern",
      "com.lowagie.text.pdf.PdfRectangle",
      "org.jfree.chart.block.BlockBorder",
      "com.lowagie.text.pdf.PdfPageEvent",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.annotations.XYAnnotation",
      "org.jfree.chart.util.ObjectUtilities",
      "org.jfree.chart.needle.MeterNeedle",
      "com.lowagie.text.pdf.PdfOutline",
      "org.jfree.chart.needle.PlumNeedle",
      "org.jfree.chart.plot.DatasetRenderingOrder",
      "org.jfree.chart.event.RendererChangeListener",
      "org.jfree.data.KeyedValues",
      "org.jfree.chart.plot.CombinedRangeCategoryPlot",
      "org.jfree.chart.block.FlowArrangement",
      "org.jfree.chart.title.CompositeTitle",
      "org.jfree.chart.event.TitleChangeListener",
      "org.jfree.chart.text.TextMeasurer",
      "org.jfree.chart.LegendItemSource",
      "com.lowagie.text.pdf.PdfAction",
      "org.jfree.chart.renderer.PolarItemRenderer",
      "org.jfree.chart.renderer.AreaRendererEndType",
      "org.jfree.data.general.DatasetChangeListener",
      "org.jfree.chart.event.TitleChangeEvent",
      "org.jfree.chart.ui.ExtensionFileFilter",
      "org.jfree.chart.needle.PointerNeedle",
      "org.jfree.chart.ui.Licences",
      "org.jfree.chart.axis.CyclicNumberAxis$CycleBoundTick",
      "org.jfree.chart.event.ChartChangeEventType",
      "com.lowagie.text.pdf.PdfNull",
      "com.lowagie.text.pdf.PdfOCProperties",
      "com.lowagie.text.xml.xmp.PdfSchema",
      "com.lowagie.text.pdf.PdfDocument",
      "org.jfree.chart.renderer.category.CategoryItemRenderer",
      "com.lowagie.text.pdf.ByteBuffer",
      "com.lowagie.text.pdf.PdfBorderDictionary",
      "org.jfree.chart.util.Size2D",
      "org.jfree.chart.util.ShapeUtilities",
      "org.jfree.data.general.SeriesChangeEvent",
      "com.lowagie.text.pdf.PdfMediaClipData",
      "org.jfree.chart.ChartPanel",
      "org.jfree.chart.labels.CategoryItemLabelGenerator",
      "org.jfree.chart.axis.TickUnits",
      "com.lowagie.text.pdf.PdfWriter",
      "com.lowagie.text.pdf.PdfLiteral",
      "com.lowagie.text.pdf.PdfPrinterGraphics2D",
      "com.lowagie.text.pdf.collection.PdfCollectionField",
      "com.lowagie.text.pdf.GrayColor",
      "org.jfree.chart.util.VerticalAlignment",
      "org.jfree.chart.plot.SeriesRenderingOrder",
      "org.jfree.chart.renderer.category.StackedAreaRenderer",
      "org.jfree.chart.block.EntityBlockResult",
      "com.lowagie.text.pdf.PdfXConformanceException",
      "org.jfree.chart.axis.NumberTick",
      "org.jfree.chart.block.BlockContainer",
      "org.jfree.chart.plot.Marker",
      "org.jfree.chart.ChartMouseListener",
      "com.lowagie.text.pdf.PdfImportedPage",
      "org.jfree.chart.renderer.category.CategoryItemRendererState",
      "org.jfree.chart.axis.SegmentedTimeline",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.chart.needle.ShipNeedle",
      "org.jfree.data.Value",
      "org.jfree.data.time.TimePeriodAnchor",
      "org.jfree.chart.plot.MultiplePiePlot",
      "org.jfree.chart.block.BlockFrame",
      "org.jfree.data.general.DefaultValueDataset",
      "com.lowagie.text.Cell",
      "com.lowagie.text.pdf.ExtendedColor",
      "com.lowagie.text.pdf.PdfDocument$PdfInfo",
      "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
      "org.jfree.chart.plot.CrosshairState",
      "org.jfree.chart.labels.XYSeriesLabelGenerator",
      "org.jfree.data.DomainOrder",
      "org.jfree.chart.axis.AxisState",
      "org.jfree.chart.renderer.AbstractRenderer",
      "org.jfree.chart.plot.RingPlot",
      "com.lowagie.text.pdf.PdfTransparencyGroup",
      "org.jfree.chart.renderer.DefaultPolarItemRenderer",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.chart.title.Title",
      "com.lowagie.text.pdf.PdfEncodings$SymbolConversion",
      "com.lowagie.text.pdf.PdfBorderArray",
      "org.jfree.chart.labels.PieToolTipGenerator",
      "org.jfree.chart.block.LineBorder",
      "org.jfree.chart.axis.DateTickMarkPosition",
      "com.lowagie.text.pdf.PdfFormXObject",
      "org.jfree.data.DefaultKeyedValues2D",
      "com.lowagie.text.pdf.FontDetails",
      "com.lowagie.text.pdf.PdfShading",
      "org.jfree.chart.block.BorderArrangement",
      "org.jfree.chart.plot.CombinedDomainXYPlot",
      "com.lowagie.text.pdf.PdfEncodings$Cp437Conversion",
      "org.jfree.data.general.SeriesDataset",
      "org.jfree.chart.ui.BasicProjectInfo",
      "com.lowagie.text.pdf.PdfReader",
      "org.jfree.data.xy.XYDataset",
      "org.jfree.chart.block.Arrangement",
      "org.jfree.chart.plot.Plot",
      "com.lowagie.text.pdf.IntHashtable$Entry",
      "org.jfree.chart.plot.ValueAxisPlot",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.LegendItem",
      "org.jfree.chart.urls.CategoryURLGenerator",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.renderer.xy.CandlestickRenderer",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.chart.entity.TickLabelEntity",
      "org.jfree.data.time.TimeSeries",
      "com.lowagie.text.pdf.PdfPageLabels",
      "com.lowagie.text.pdf.PdfDashPattern",
      "org.jfree.chart.entity.CategoryItemEntity",
      "org.jfree.chart.entity.AxisLabelEntity",
      "org.jfree.chart.plot.AbstractPieLabelDistributor",
      "org.jfree.data.general.DatasetUtilities",
      "org.jfree.chart.util.BooleanList",
      "com.lowagie.text.pdf.PdfDictionary",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator",
      "org.jfree.data.xy.IntervalXYDataset",
      "org.jfree.chart.needle.LineNeedle",
      "org.jfree.data.general.DefaultPieDataset",
      "org.jfree.chart.entity.CategoryLabelEntity",
      "org.jfree.chart.util.RectangleEdge",
      "org.jfree.chart.plot.DefaultDrawingSupplier",
      "org.jfree.chart.plot.PieLabelDistributor",
      "com.lowagie.text.ElementListener",
      "org.jfree.data.category.CategoryDataset",
      "org.jfree.chart.util.RectangleInsets",
      "org.jfree.chart.text.TextAnchor",
      "org.jfree.chart.axis.TickUnit",
      "org.jfree.chart.ChartColor",
      "org.jfree.chart.util.GradientPaintTransformer",
      "com.lowagie.text.pdf.internal.PdfVersionImp",
      "com.lowagie.text.pdf.PdfImage",
      "org.jfree.chart.util.StrokeList",
      "com.lowagie.text.pdf.interfaces.PdfVersion",
      "com.lowagie.text.pdf.internal.PdfViewerPreferencesImp",
      "org.jfree.chart.text.TextUtilities",
      "com.lowagie.text.pdf.PdfPage",
      "org.jfree.chart.axis.TickUnitSource",
      "org.jfree.chart.plot.CategoryMarker",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.plot.XYPlot",
      "org.jfree.chart.util.TableOrder",
      "com.lowagie.text.pdf.PdfName",
      "com.lowagie.text.pdf.PdfGState",
      "com.lowagie.text.pdf.RandomAccessFileOrArray",
      "com.lowagie.text.ImgWMF",
      "com.lowagie.text.pdf.PdfAppearance",
      "com.lowagie.text.pdf.PdfTextArray",
      "com.lowagie.text.Jpeg",
      "com.lowagie.text.pdf.PdfLayer",
      "org.jfree.chart.plot.ThermometerPlot",
      "com.lowagie.text.ImgRaw",
      "com.lowagie.text.pdf.PdfPTableEvent",
      "org.jfree.chart.axis.SubCategoryAxis",
      "com.lowagie.text.pdf.collection.PdfTargetDictionary",
      "org.jfree.chart.axis.NumberTickUnit",
      "com.lowagie.text.pdf.TrueTypeFont",
      "org.jfree.chart.title.TextTitle",
      "com.lowagie.text.pdf.PRIndirectReference",
      "org.jfree.data.statistics.StatisticalCategoryDataset",
      "com.lowagie.text.DocumentException",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.data.KeyedValues2D",
      "org.jfree.data.Values",
      "com.lowagie.text.pdf.PdfPSXObject",
      "org.jfree.chart.axis.CyclicNumberAxis",
      "com.lowagie.text.xml.xmp.DublinCoreSchema",
      "org.jfree.chart.text.TextBlockAnchor",
      "org.jfree.chart.needle.MiddlePinNeedle",
      "com.lowagie.text.PageSize",
      "org.jfree.data.general.SeriesException",
      "org.jfree.chart.event.ChartChangeListener",
      "org.jfree.chart.util.PaintUtilities",
      "org.jfree.chart.event.ChartProgressListener",
      "org.jfree.chart.labels.AbstractPieItemLabelGenerator",
      "org.jfree.chart.plot.WaferMapPlot",
      "org.jfree.chart.labels.CategorySeriesLabelGenerator",
      "org.jfree.chart.needle.WindNeedle",
      "com.lowagie.text.pdf.interfaces.PdfViewerPreferences",
      "com.lowagie.text.pdf.PdfEncodings$SymbolTTConversion",
      "org.jfree.chart.axis.MarkerAxisBand",
      "com.lowagie.text.pdf.PdfPCellEvent",
      "com.lowagie.text.xml.xmp.XmpWriter",
      "org.jfree.chart.axis.CategoryAxis",
      "com.lowagie.text.pdf.PdfPatternPainter",
      "org.jfree.chart.renderer.xy.XYItemRenderer",
      "org.jfree.chart.ui.ProjectInfo",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.chart.renderer.RendererState",
      "org.jfree.chart.entity.StandardEntityCollection",
      "org.jfree.chart.plot.CompassPlot",
      "com.lowagie.text.pdf.PdfBoolean",
      "org.jfree.chart.axis.DateAxis$DefaultTimeline",
      "com.lowagie.text.TextElementArray",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.chart.axis.DateAxis",
      "org.jfree.chart.plot.CategoryPlot",
      "org.jfree.chart.event.MarkerChangeListener",
      "org.jfree.chart.event.PlotChangeEvent",
      "com.lowagie.text.pdf.interfaces.PdfPageActions",
      "org.jfree.chart.plot.PiePlot",
      "com.lowagie.text.pdf.PageResources",
      "com.lowagie.text.HeaderFooter",
      "org.jfree.chart.event.RendererChangeEvent",
      "org.jfree.chart.text.G2TextMeasurer",
      "com.lowagie.text.pdf.PdfException",
      "com.lowagie.text.pdf.PdfIndirectReference",
      "org.jfree.chart.labels.PieSectionLabelGenerator",
      "com.lowagie.text.pdf.PdfPTable",
      "org.jfree.chart.axis.Tick",
      "org.jfree.data.statistics.BoxAndWhiskerItem",
      "com.lowagie.text.pdf.DocumentFont",
      "org.jfree.chart.urls.PieURLGenerator",
      "org.jfree.data.DefaultKeyedValues",
      "com.lowagie.text.pdf.PdfArray",
      "org.jfree.data.statistics.BoxAndWhiskerCategoryDataset",
      "org.jfree.chart.util.ShapeList",
      "com.lowagie.text.pdf.collection.PdfCollection",
      "com.lowagie.text.pdf.OutputStreamCounter",
      "org.jfree.chart.util.HorizontalAlignment",
      "com.lowagie.text.DocWriter",
      "org.jfree.chart.axis.CategoryAnchor",
      "org.jfree.chart.axis.SegmentedTimeline$BaseTimelineSegmentRange",
      "org.jfree.chart.labels.CategoryToolTipGenerator",
      "com.lowagie.text.pdf.PdfSpotColor",
      "org.jfree.chart.entity.XYItemEntity",
      "org.jfree.chart.plot.DialShape",
      "org.jfree.chart.axis.CategoryLabelPositions",
      "com.lowagie.text.pdf.PdfTransition",
      "org.jfree.chart.util.SortOrder",
      "org.jfree.data.DomainInfo",
      "com.lowagie.text.pdf.PdfPages",
      "org.jfree.chart.block.BlockParams",
      "org.jfree.chart.annotations.CategoryAnnotation",
      "org.jfree.chart.axis.AxisSpace",
      "org.jfree.chart.axis.SegmentedTimeline$SegmentRange",
      "org.jfree.chart.plot.PolarPlot",
      "org.jfree.chart.plot.MeterInterval",
      "org.jfree.data.time.DateRange",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.chart.util.Rotation",
      "org.jfree.chart.block.BlockResult",
      "com.lowagie.text.pdf.PdfAnnotation",
      "com.lowagie.text.pdf.PdfSignature",
      "org.jfree.chart.resources.JFreeChartResources",
      "org.jfree.data.RangeType",
      "com.lowagie.text.pdf.PdfStructureTreeRoot",
      "org.jfree.data.time.Month",
      "org.jfree.chart.title.DateTitle",
      "org.jfree.data.general.WaferMapDataset",
      "org.jfree.chart.block.EntityBlockParams",
      "org.jfree.data.general.Dataset",
      "org.jfree.chart.plot.PlotOrientation",
      "org.jfree.chart.axis.NumberAxis",
      "com.lowagie.text.DocListener",
      "org.jfree.chart.renderer.category.AreaRenderer",
      "com.lowagie.text.pdf.collection.PdfCollectionSchema",
      "com.lowagie.text.ImgCCITT",
      "org.jfree.chart.axis.ValueTick",
      "org.jfree.chart.JFreeChart",
      "com.lowagie.text.pdf.FontMapper",
      "com.lowagie.text.pdf.PdfFormField",
      "com.lowagie.text.pdf.PdfDestination",
      "org.jfree.chart.title.LegendTitle",
      "com.lowagie.text.pdf.PdfTable",
      "com.lowagie.text.pdf.PdfNumber",
      "org.jfree.chart.ChartRenderingInfo",
      "org.jfree.chart.JFreeChartInfo",
      "org.jfree.chart.event.MarkerChangeEvent",
      "org.jfree.data.time.MonthConstants",
      "com.lowagie.text.pdf.internal.PdfXConformanceImp",
      "org.jfree.chart.event.AxisChangeListener",
      "com.lowagie.text.pdf.BadPdfFormatException",
      "org.jfree.chart.axis.SegmentedTimeline$Segment",
      "com.lowagie.text.pdf.BaseFont",
      "com.lowagie.text.pdf.PdfAcroForm",
      "org.jfree.chart.ui.Library",
      "org.jfree.chart.block.ColumnArrangement",
      "com.lowagie.text.pdf.DefaultFontMapper",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.chart.plot.Zoomable",
      "com.lowagie.text.pdf.PdfEncryption",
      "com.lowagie.text.pdf.PdfGraphics2D",
      "org.jfree.chart.util.ObjectList",
      "com.lowagie.text.pdf.PRStream",
      "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer",
      "com.lowagie.text.Image",
      "com.lowagie.text.pdf.PdfContentByte",
      "org.jfree.chart.plot.PiePlotState",
      "com.lowagie.text.Meta",
      "org.jfree.chart.needle.ArrowNeedle",
      "com.lowagie.text.pdf.PdfIndirectObject",
      "com.lowagie.text.ImgTemplate",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset",
      "com.lowagie.text.pdf.PdfDocument$PdfCatalog",
      "com.lowagie.text.pdf.PdfICCBased",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.chart.labels.XYToolTipGenerator",
      "org.jfree.data.time.TimePeriod",
      "org.jfree.chart.renderer.WaferMapRenderer",
      "org.jfree.chart.plot.MeterPlot",
      "org.jfree.chart.util.LengthAdjustmentType",
      "org.jfree.chart.block.Block",
      "com.lowagie.text.pdf.PdfDate",
      "com.lowagie.text.ExceptionConverter",
      "com.lowagie.text.pdf.interfaces.PdfEncryptionSettings",
      "com.lowagie.text.pdf.PdfEncodings$WingdingsConversion",
      "com.lowagie.text.xml.xmp.XmpBasicSchema",
      "org.jfree.chart.plot.CombinedRangeXYPlot",
      "com.lowagie.text.pdf.PdfRendition",
      "org.jfree.data.general.PieDataset",
      "com.lowagie.text.xml.xmp.XmpSchema",
      "com.lowagie.text.Table",
      "org.jfree.chart.axis.AxisLocation",
      "com.lowagie.text.pdf.PdfStream",
      "org.jfree.chart.event.ChartProgressEvent",
      "com.lowagie.text.pdf.PdfTemplate",
      "org.jfree.chart.block.LengthConstraintType",
      "com.lowagie.text.pdf.PdfGraphics2D$fakeComponent",
      "com.lowagie.text.pdf.PdfObject",
      "com.lowagie.text.pdf.PdfEncodings",
      "org.jfree.data.Range",
      "org.jfree.chart.plot.CombinedDomainCategoryPlot",
      "org.jfree.data.statistics.DefaultStatisticalCategoryDataset",
      "org.jfree.chart.plot.PlotState",
      "org.jfree.data.time.Year",
      "com.lowagie.text.pdf.PdfShadingPattern",
      "org.jfree.chart.Drawable",
      "com.lowagie.text.pdf.collection.PdfCollectionSort",
      "org.jfree.chart.axis.CategoryLabelPosition",
      "org.jfree.chart.text.TextLine",
      "com.lowagie.text.pdf.interfaces.PdfAnnotations",
      "org.jfree.chart.PaintMap",
      "com.lowagie.text.pdf.interfaces.PdfRunDirection",
      "com.lowagie.text.pdf.PdfContentByte$GraphicState",
      "org.jfree.chart.axis.DateTickUnit",
      "com.lowagie.text.pdf.PdfFileSpecification",
      "com.lowagie.text.pdf.PdfDocument$Indentation",
      "org.jfree.chart.needle.PinNeedle",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.chart.entity.EntityCollection",
      "com.lowagie.text.Rectangle",
      "org.jfree.data.Values2D",
      "org.jfree.data.general.DatasetChangeEvent",
      "com.lowagie.text.pdf.interfaces.PdfDocumentActions",
      "org.jfree.data.general.SeriesChangeListener",
      "org.jfree.data.category.DefaultCategoryDataset",
      "org.jfree.chart.axis.TickType",
      "com.lowagie.text.pdf.PdfColor",
      "org.jfree.data.general.KeyedValuesDataset",
      "org.jfree.chart.entity.PieSectionEntity",
      "org.jfree.data.general.DefaultKeyedValuesDataset",
      "org.jfree.chart.util.Layer",
      "org.jfree.chart.event.PlotChangeListener",
      "com.lowagie.text.pdf.IntHashtable",
      "org.jfree.data.general.Series",
      "com.lowagie.text.pdf.Type1Font",
      "com.lowagie.text.pdf.PdfString",
      "com.lowagie.text.BadElementException",
      "com.lowagie.text.pdf.PdfContents",
      "org.jfree.chart.plot.DrawingSupplier",
      "com.lowagie.text.pdf.interfaces.PdfXConformance",
      "org.jfree.chart.util.PublicCloneable",
      "com.lowagie.text.pdf.BaseFont$StreamFont",
      "com.lowagie.text.Document",
      "org.jfree.chart.StrokeMap",
      "com.lowagie.text.pdf.PdfResources",
      "org.jfree.data.KeyedObjects2D",
      "com.lowagie.text.pdf.OutputStreamEncryption",
      "org.jfree.chart.axis.LogAxis",
      "org.jfree.chart.axis.CategoryLabelWidthType"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(JFreeChart_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jfree.chart.resources.JFreeChartResources",
      "org.jfree.chart.ui.Licences",
      "org.jfree.chart.JFreeChart",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.util.RectangleInsets",
      "org.jfree.chart.util.RectangleEdge",
      "org.jfree.chart.util.HorizontalAlignment",
      "org.jfree.chart.util.VerticalAlignment",
      "org.jfree.chart.block.LengthConstraintType",
      "org.jfree.chart.util.SerialUtilities",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.plot.XYPlot",
      "org.jfree.chart.plot.CombinedDomainXYPlot",
      "org.jfree.chart.ChartColor",
      "org.jfree.chart.plot.DefaultDrawingSupplier",
      "org.jfree.chart.plot.DatasetRenderingOrder",
      "org.jfree.chart.plot.SeriesRenderingOrder",
      "org.jfree.chart.plot.PlotOrientation",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.chart.util.ObjectList",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.chart.event.PlotChangeEvent",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.chart.axis.AxisLocation",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.title.Title",
      "org.jfree.chart.title.LegendTitle",
      "org.jfree.chart.block.FlowArrangement",
      "org.jfree.chart.block.ColumnArrangement",
      "org.jfree.chart.block.BlockBorder",
      "org.jfree.chart.block.BlockContainer",
      "org.jfree.chart.util.RectangleAnchor",
      "org.jfree.chart.block.LineBorder",
      "org.jfree.chart.event.TitleChangeEvent",
      "org.jfree.chart.event.RendererChangeEvent",
      "org.jfree.chart.text.TextAnchor",
      "org.jfree.chart.annotations.TextAnnotation",
      "org.jfree.chart.axis.Axis",
      "org.jfree.data.Range",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.chart.axis.TickUnit",
      "org.jfree.chart.axis.NumberTickUnit",
      "org.jfree.chart.axis.NumberAxis",
      "org.jfree.chart.axis.SymbolAxis",
      "org.jfree.chart.axis.TickUnits",
      "org.jfree.data.RangeType",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.plot.FastScatterPlot",
      "org.jfree.chart.title.TextTitle",
      "org.jfree.chart.axis.CategoryAxis",
      "org.jfree.chart.axis.SubCategoryAxis",
      "org.jfree.chart.axis.CategoryLabelPosition",
      "org.jfree.chart.text.TextBlockAnchor",
      "org.jfree.chart.axis.CategoryLabelWidthType",
      "org.jfree.chart.axis.CategoryLabelPositions",
      "com.lowagie.text.DocWriter",
      "com.lowagie.text.Rectangle",
      "com.lowagie.text.Image",
      "com.lowagie.text.Jpeg",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.category.DefaultIntervalCategoryDataset",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.data.resources.DataPackageResources",
      "org.jfree.chart.plot.PiePlot",
      "org.jfree.chart.axis.CyclicNumberAxis",
      "org.jfree.chart.axis.CategoryAxis3D",
      "org.jfree.chart.plot.CategoryPlot",
      "org.jfree.chart.plot.CombinedDomainCategoryPlot",
      "org.jfree.chart.util.SortOrder",
      "org.jfree.chart.axis.CategoryAnchor",
      "org.jfree.chart.plot.Marker",
      "org.jfree.chart.plot.ValueMarker",
      "org.jfree.chart.util.LengthAdjustmentType",
      "org.jfree.chart.util.Layer",
      "org.jfree.chart.ChartPanel",
      "org.jfree.chart.ChartRenderingInfo",
      "org.jfree.chart.entity.StandardEntityCollection",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.renderer.AbstractRenderer",
      "org.jfree.chart.renderer.DefaultPolarItemRenderer",
      "org.jfree.chart.util.BooleanList",
      "org.jfree.chart.util.PaintList",
      "org.jfree.chart.util.StrokeList",
      "org.jfree.chart.util.ShapeList",
      "org.jfree.chart.labels.ItemLabelPosition",
      "org.jfree.chart.labels.ItemLabelAnchor",
      "com.lowagie.text.pdf.PdfObject",
      "com.lowagie.text.pdf.ByteBuffer",
      "com.lowagie.text.pdf.PdfName",
      "com.lowagie.text.pdf.BaseFont",
      "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer",
      "org.jfree.chart.renderer.category.AreaRenderer",
      "org.jfree.chart.renderer.category.StackedAreaRenderer",
      "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator",
      "org.jfree.chart.renderer.AreaRendererEndType",
      "com.lowagie.text.pdf.AsianFontMapper",
      "com.lowagie.text.pdf.CJKFont",
      "com.lowagie.text.DocumentException",
      "com.lowagie.text.Jpeg2000",
      "org.jfree.chart.plot.MultiplePiePlot",
      "org.jfree.chart.util.Rotation",
      "org.jfree.chart.PaintMap",
      "org.jfree.chart.StrokeMap",
      "org.jfree.chart.labels.AbstractPieItemLabelGenerator",
      "org.jfree.chart.labels.StandardPieSectionLabelGenerator",
      "org.jfree.chart.plot.AbstractPieLabelDistributor",
      "org.jfree.chart.plot.PieLabelDistributor",
      "org.jfree.chart.util.ObjectUtilities",
      "org.jfree.chart.util.TableOrder",
      "org.jfree.chart.axis.PeriodAxis",
      "org.jfree.chart.renderer.category.BarRenderer",
      "org.jfree.chart.renderer.category.IntervalBarRenderer",
      "org.jfree.chart.renderer.category.GanttRenderer",
      "org.jfree.chart.util.StandardGradientPaintTransformer",
      "org.jfree.chart.util.GradientPaintTransformType",
      "org.jfree.chart.block.GridArrangement",
      "com.lowagie.text.Document",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.Day",
      "org.jfree.data.time.SerialDate",
      "org.jfree.data.time.SpreadsheetDate",
      "org.jfree.data.time.Year",
      "org.jfree.data.time.Quarter",
      "org.jfree.data.time.Month",
      "org.jfree.data.time.Hour",
      "org.jfree.chart.axis.PeriodAxisLabelInfo",
      "org.jfree.data.time.DateRange",
      "org.jfree.chart.axis.DateTickUnit",
      "org.jfree.chart.axis.DateAxis$DefaultTimeline",
      "org.jfree.chart.axis.DateAxis",
      "org.jfree.chart.axis.DateTickMarkPosition",
      "org.jfree.chart.plot.SpiderWebPlot",
      "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator",
      "org.jfree.chart.labels.StandardCategoryItemLabelGenerator",
      "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
      "org.jfree.chart.renderer.xy.CandlestickRenderer",
      "org.jfree.chart.labels.HighLowItemLabelGenerator",
      "org.jfree.chart.labels.StandardXYSeriesLabelGenerator",
      "org.jfree.data.gantt.TaskSeriesCollection",
      "org.jfree.data.category.DefaultCategoryDataset",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.chart.PolarChartPanel",
      "org.jfree.data.general.DefaultPieDataset",
      "org.jfree.data.jdbc.JDBCPieDataset",
      "org.jfree.data.DefaultKeyedValues",
      "com.lowagie.text.pdf.PdfWriter",
      "com.lowagie.text.pdf.PdfPageLabels",
      "com.lowagie.text.pdf.PdfContentByte",
      "org.jfree.chart.plot.CompassPlot",
      "org.jfree.chart.plot.CombinedRangeCategoryPlot",
      "com.lowagie.text.Phrase",
      "com.lowagie.text.Paragraph",
      "com.lowagie.text.Font",
      "org.jfree.chart.axis.ExtendedCategoryAxis",
      "org.jfree.chart.plot.MeterPlot",
      "org.jfree.chart.plot.DialShape",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.xy.DefaultWindDataset",
      "org.jfree.data.general.DefaultKeyedValuesDataset",
      "org.jfree.chart.plot.RingPlot",
      "org.jfree.chart.plot.CombinedRangeXYPlot",
      "org.jfree.chart.event.ChartProgressEvent",
      "org.jfree.data.general.DefaultValueDataset",
      "org.jfree.chart.needle.MeterNeedle",
      "org.jfree.chart.needle.ArrowNeedle",
      "org.jfree.data.time.Week",
      "org.jfree.chart.title.DateTitle",
      "org.jfree.data.jdbc.JDBCCategoryDataset",
      "org.jfree.chart.needle.PointerNeedle",
      "com.lowagie.text.pdf.PdfDestination",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.xy.XYSeriesCollection",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.jfree.data.xy.XYBarDataset",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.chart.text.TextUtilities",
      "org.jfree.chart.text.TextBlock",
      "org.jfree.chart.text.TextLine",
      "org.jfree.chart.text.TextFragment",
      "org.jfree.chart.util.Size2D",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.data.time.Minute",
      "org.jfree.data.time.Second",
      "org.jfree.chart.axis.LogAxis",
      "org.jfree.chart.axis.ModuloAxis",
      "org.jfree.chart.plot.PiePlot3D",
      "org.jfree.chart.plot.WaferMapPlot",
      "org.jfree.chart.util.ShapeUtilities",
      "com.lowagie.text.pdf.PdfDocument",
      "com.lowagie.text.PageSize",
      "com.lowagie.text.pdf.PdfDictionary",
      "com.lowagie.text.pdf.PdfDate",
      "com.lowagie.text.pdf.internal.PdfViewerPreferencesImp",
      "com.lowagie.text.pdf.internal.PdfVersionImp",
      "com.lowagie.text.pdf.internal.PdfXConformanceImp",
      "com.lowagie.text.pdf.PdfGraphics2D",
      "org.jfree.chart.renderer.WaferMapRenderer",
      "org.jfree.chart.plot.PolarPlot",
      "org.jfree.chart.labels.AbstractXYItemLabelGenerator",
      "org.jfree.chart.labels.StandardXYToolTipGenerator",
      "org.jfree.chart.labels.StandardXYZToolTipGenerator",
      "com.lowagie.text.pdf.PdfAnnotation",
      "org.jfree.chart.title.ImageTitle",
      "org.jfree.chart.plot.ThermometerPlot",
      "org.jfree.chart.text.TextBox",
      "org.jfree.chart.title.CompositeTitle",
      "com.lowagie.text.pdf.PdfFormField",
      "org.jfree.chart.labels.SymbolicXYItemLabelGenerator",
      "org.jfree.data.general.WaferMapDataset",
      "org.jfree.data.xy.DefaultTableXYDataset",
      "org.jfree.data.xy.DefaultIntervalXYDataset",
      "org.jfree.chart.renderer.xy.WindItemRenderer",
      "com.lowagie.text.pdf.PdfTemplate",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.data.statistics.DefaultStatisticalCategoryDataset",
      "com.lowagie.text.pdf.PdfLayerMembership",
      "org.jfree.data.general.Series",
      "org.jfree.data.xy.XYSeries",
      "org.jfree.data.statistics.SimpleHistogramDataset",
      "org.jfree.data.general.SubSeriesDataset",
      "org.jfree.data.time.Millisecond",
      "org.jfree.chart.plot.CategoryMarker",
      "org.jfree.chart.event.MarkerChangeEvent",
      "com.lowagie.text.Section",
      "com.lowagie.text.Chapter",
      "org.jfree.data.general.CombinedDataset",
      "org.jfree.chart.renderer.xy.XYBubbleRenderer",
      "com.lowagie.text.pdf.Type1Font",
      "com.lowagie.text.ExceptionConverter",
      "org.jfree.data.statistics.MeanAndStandardDeviation",
      "org.jfree.data.KeyedObjects",
      "org.jfree.data.KeyedObject",
      "org.jfree.chart.renderer.category.CategoryStepRenderer",
      "org.jfree.data.time.DynamicTimeSeriesCollection",
      "org.jfree.data.xy.MatrixSeries",
      "org.jfree.chart.block.BorderArrangement",
      "org.jfree.chart.axis.NumberAxis3D",
      "org.jfree.chart.block.CenterArrangement",
      "com.lowagie.text.BadElementException",
      "org.jfree.data.statistics.DefaultMultiValueCategoryDataset",
      "com.lowagie.text.Anchor",
      "org.jfree.data.category.CategoryToPieDataset",
      "org.jfree.chart.renderer.category.BarRenderer3D",
      "org.jfree.chart.renderer.category.StackedBarRenderer3D",
      "com.lowagie.text.Row",
      "org.jfree.data.time.TimeSeriesCollection",
      "org.jfree.data.time.TimePeriodAnchor",
      "com.lowagie.text.ListItem",
      "org.jfree.chart.axis.LogarithmicAxis",
      "org.jfree.data.xy.CategoryTableXYDataset",
      "org.jfree.chart.editor.ChartEditorManager",
      "org.jfree.chart.editor.DefaultChartEditor",
      "org.jfree.chart.ui.LCBLayout",
      "org.jfree.chart.ui.PaintSample",
      "org.jfree.chart.editor.DefaultTitleEditor",
      "org.jfree.chart.ui.FontDisplayField",
      "org.jfree.chart.editor.DefaultPlotEditor",
      "org.jfree.chart.ui.StrokeSample",
      "org.jfree.chart.editor.DefaultAxisEditor",
      "org.jfree.chart.editor.DefaultNumberAxisEditor",
      "org.jfree.data.general.DefaultKeyedValues2DDataset",
      "org.jfree.chart.renderer.xy.XYStepAreaRenderer",
      "org.jfree.data.time.TimePeriodFormatException",
      "org.jfree.chart.needle.WindNeedle",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.chart.annotations.XYTextAnnotation",
      "org.jfree.chart.annotations.XYPointerAnnotation",
      "com.lowagie.text.pdf.ColumnText",
      "org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator",
      "org.jfree.chart.renderer.category.LineAndShapeRenderer",
      "org.jfree.chart.renderer.category.LineRenderer3D",
      "com.lowagie.text.Chunk",
      "org.jfree.chart.labels.StandardCategoryToolTipGenerator",
      "org.jfree.chart.labels.IntervalCategoryToolTipGenerator",
      "org.jfree.chart.util.PaintUtilities",
      "com.lowagie.text.pdf.ExtendedColor",
      "com.lowagie.text.pdf.PdfGState",
      "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer",
      "org.jfree.chart.renderer.xy.XYLine3DRenderer",
      "org.jfree.chart.LegendItemCollection",
      "org.jfree.chart.axis.AxisSpace",
      "org.jfree.chart.plot.IntervalMarker",
      "org.jfree.chart.junit.ChartPanelTests",
      "org.jfree.chart.renderer.xy.DefaultXYItemRenderer",
      "org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer",
      "org.jfree.chart.axis.Tick",
      "org.jfree.chart.axis.ValueTick",
      "org.jfree.chart.axis.NumberTick",
      "org.jfree.chart.axis.TickType",
      "org.jfree.chart.renderer.xy.XYAreaRenderer",
      "com.lowagie.text.pdf.PdfGraphics2D$fakeComponent",
      "com.lowagie.text.pdf.PdfEncodings$WingdingsConversion",
      "com.lowagie.text.pdf.PdfEncodings$SymbolConversion",
      "com.lowagie.text.pdf.PdfEncodings$Cp437Conversion",
      "com.lowagie.text.pdf.PdfEncodings",
      "org.jfree.data.jdbc.JDBCXYDataset",
      "org.jfree.chart.renderer.xy.XYErrorRenderer",
      "org.jfree.data.xy.AbstractXYZDataset",
      "org.jfree.data.xy.DefaultXYZDataset",
      "org.jfree.chart.renderer.xy.XYAreaRenderer2",
      "org.jfree.chart.renderer.xy.XYBlockRenderer",
      "org.jfree.chart.renderer.LookupPaintScale",
      "org.jfree.chart.title.PaintScaleLegend",
      "org.jfree.chart.annotations.CategoryTextAnnotation",
      "org.jfree.chart.urls.StandardXYURLGenerator",
      "org.jfree.chart.renderer.category.LayeredBarRenderer",
      "org.jfree.data.time.FixedMillisecond",
      "org.jfree.chart.axis.DateTick",
      "org.jfree.data.general.DefaultKeyedValueDataset",
      "org.jfree.data.DefaultKeyedValue",
      "com.lowagie.text.pdf.PdfAction",
      "org.jfree.chart.renderer.category.DefaultCategoryItemRenderer",
      "com.lowagie.text.SimpleCell",
      "com.lowagie.text.pdf.TrueTypeFont",
      "org.jfree.data.xy.YIntervalSeriesCollection",
      "org.jfree.chart.renderer.GrayPaintScale",
      "org.jfree.data.xy.XYIntervalSeriesCollection",
      "org.jfree.chart.axis.SegmentedTimeline",
      "org.jfree.chart.renderer.category.MinMaxCategoryRenderer",
      "org.jfree.data.xy.XIntervalSeriesCollection",
      "org.jfree.chart.renderer.xy.StackedXYAreaRenderer",
      "org.jfree.chart.renderer.xy.XYDifferenceRenderer",
      "com.lowagie.text.List",
      "com.lowagie.text.FontFactoryImp",
      "com.lowagie.text.FontFactory",
      "org.jfree.chart.renderer.xy.VectorRenderer",
      "org.jfree.chart.renderer.category.ScatterRenderer",
      "org.jfree.data.xy.DefaultHighLowDataset",
      "org.jfree.data.general.SeriesChangeEvent",
      "org.jfree.data.xy.MatrixSeriesCollection",
      "com.lowagie.text.ChapterAutoNumber",
      "org.jfree.chart.renderer.xy.StandardXYItemRenderer",
      "org.jfree.data.statistics.HistogramDataset",
      "org.jfree.data.statistics.HistogramType",
      "org.jfree.chart.labels.CustomXYToolTipGenerator",
      "org.jfree.chart.renderer.xy.CyclicXYItemRenderer",
      "org.jfree.chart.renderer.category.StackedBarRenderer",
      "org.jfree.chart.renderer.category.GroupedStackedBarRenderer",
      "org.jfree.data.KeyToGroupMap",
      "org.jfree.chart.renderer.xy.XYBarRenderer",
      "org.jfree.chart.renderer.xy.StackedXYBarRenderer",
      "org.jfree.chart.entity.AxisLabelEntity",
      "org.jfree.data.time.TimeTableXYDataset",
      "org.jfree.chart.plot.MeterInterval",
      "org.jfree.data.statistics.BoxAndWhiskerItem"
    );
  }
}
