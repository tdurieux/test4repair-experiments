/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Jan 15 22:16:52 GMT 2017
 */

package org.joda.time.tz;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class DateTimeZoneBuilder_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.joda.time.tz.DateTimeZoneBuilder"; 
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

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.timezone", "Etc/UTC"); 
    java.lang.System.setProperty("user.dir", "/tmp/time_11_Genprog_local_s1/outputMutation/AstorMain-Time/src/evosuite/default"); 
    java.lang.System.setProperty("line.separator", "\n"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DateTimeZoneBuilder_ESTest_scaffolding.class.getClassLoader() ,
      "org.joda.time.DateTimeZone",
      "org.joda.time.tz.DateTimeZoneBuilder$RuleSet",
      "org.joda.time.tz.DateTimeZoneBuilder$Recurrence",
      "org.joda.time.DateTimeUtils$MillisProvider",
      "org.joda.time.chrono.GJYearOfEraDateTimeField",
      "org.joda.time.field.OffsetDateTimeField",
      "org.joda.time.tz.DateTimeZoneBuilder$Transition",
      "org.joda.time.chrono.GJMonthOfYearDateTimeField",
      "org.joda.time.field.RemainderDateTimeField",
      "org.joda.time.JodaTimePermission",
      "org.joda.time.chrono.BasicWeekyearDateTimeField",
      "org.joda.time.tz.DateTimeZoneBuilder$Rule",
      "org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField",
      "org.joda.time.DateTimeField",
      "org.joda.time.DateTimeFieldType",
      "org.joda.time.field.FieldUtils",
      "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType",
      "org.joda.time.base.AbstractPeriod",
      "org.joda.time.ReadableInstant",
      "org.joda.time.ReadableInterval",
      "org.joda.time.chrono.BasicChronology$HalfdayField",
      "org.joda.time.DateTimeUtils$SystemMillisProvider",
      "org.joda.time.chrono.GJDayOfWeekDateTimeField",
      "org.joda.time.IllegalInstantException",
      "org.joda.time.IllegalFieldValueException",
      "org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone",
      "org.joda.time.chrono.BasicChronology$YearInfo",
      "org.joda.time.field.UnsupportedDurationField",
      "org.joda.time.tz.DefaultNameProvider",
      "org.joda.time.tz.Provider",
      "org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField",
      "org.joda.time.ReadablePeriod",
      "org.joda.time.chrono.ZonedChronology$ZonedDateTimeField",
      "org.joda.time.chrono.GregorianChronology",
      "org.joda.time.chrono.AssembledChronology$Fields",
      "org.joda.time.DurationFieldType",
      "org.joda.time.base.BaseLocal",
      "org.joda.time.chrono.ISOChronology",
      "org.joda.time.tz.NameProvider",
      "org.joda.time.chrono.BasicChronology",
      "org.joda.time.chrono.BasicYearDateTimeField",
      "org.joda.time.field.DividedDateTimeField",
      "org.joda.time.chrono.ZonedChronology",
      "org.joda.time.field.BaseDateTimeField",
      "org.joda.time.field.ZeroIsMaxDateTimeField",
      "org.joda.time.chrono.BasicMonthOfYearDateTimeField",
      "org.joda.time.base.AbstractPartial",
      "org.joda.time.DateTimeUtils",
      "org.joda.time.tz.CachedDateTimeZone$Info",
      "org.joda.time.base.BasePeriod",
      "org.joda.time.PeriodType",
      "org.joda.time.field.MillisDurationField",
      "org.joda.time.field.DecoratedDurationField",
      "org.joda.time.tz.DateTimeZoneBuilder$DSTZone",
      "org.joda.time.chrono.AssembledChronology",
      "org.joda.time.tz.ZoneInfoProvider",
      "org.joda.time.chrono.GJEraDateTimeField",
      "org.joda.time.DateTimeZone$1",
      "org.joda.time.tz.DateTimeZoneBuilder",
      "org.joda.time.chrono.BaseChronology",
      "org.joda.time.field.UnsupportedDateTimeField",
      "org.joda.time.field.ImpreciseDateTimeField",
      "org.joda.time.field.PreciseDurationField",
      "org.joda.time.tz.DateTimeZoneBuilder$OfYear",
      "org.joda.time.Period",
      "org.joda.time.chrono.BasicGJChronology",
      "org.joda.time.field.ScaledDurationField",
      "org.joda.time.chrono.ISOYearOfEraDateTimeField",
      "org.joda.time.format.DateTimeFormatter",
      "org.joda.time.DurationField",
      "org.joda.time.Chronology",
      "org.joda.time.field.PreciseDurationDateTimeField",
      "org.joda.time.LocalDateTime",
      "org.joda.time.tz.FixedDateTimeZone",
      "org.joda.time.base.BasePeriod$1",
      "org.joda.time.tz.CachedDateTimeZone",
      "org.joda.time.field.PreciseDateTimeField",
      "org.joda.time.chrono.BasicDayOfMonthDateTimeField",
      "org.joda.time.chrono.ZonedChronology$ZonedDurationField",
      "org.joda.time.ReadablePartial",
      "org.joda.time.chrono.BasicDayOfYearDateTimeField",
      "org.joda.time.DurationFieldType$StandardDurationFieldType",
      "org.joda.time.field.DecoratedDateTimeField",
      "org.joda.time.field.BaseDurationField"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DateTimeZoneBuilder_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.joda.time.tz.FixedDateTimeZone",
      "org.joda.time.DateTimeZone",
      "org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone",
      "org.joda.time.tz.DateTimeZoneBuilder$DSTZone",
      "org.joda.time.tz.CachedDateTimeZone",
      "org.joda.time.DateTimeUtils",
      "org.joda.time.chrono.BaseChronology",
      "org.joda.time.chrono.AssembledChronology",
      "org.joda.time.field.MillisDurationField",
      "org.joda.time.field.BaseDurationField",
      "org.joda.time.field.PreciseDurationField",
      "org.joda.time.DurationFieldType$StandardDurationFieldType",
      "org.joda.time.DurationFieldType",
      "org.joda.time.field.PreciseDurationDateTimeField",
      "org.joda.time.field.PreciseDateTimeField",
      "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType",
      "org.joda.time.DateTimeFieldType",
      "org.joda.time.field.DecoratedDateTimeField",
      "org.joda.time.field.ZeroIsMaxDateTimeField",
      "org.joda.time.chrono.BasicChronology$HalfdayField",
      "org.joda.time.chrono.BasicChronology",
      "org.joda.time.chrono.BasicGJChronology",
      "org.joda.time.field.ImpreciseDateTimeField",
      "org.joda.time.chrono.BasicYearDateTimeField",
      "org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField",
      "org.joda.time.chrono.GJYearOfEraDateTimeField",
      "org.joda.time.field.OffsetDateTimeField",
      "org.joda.time.field.DividedDateTimeField",
      "org.joda.time.field.DecoratedDurationField",
      "org.joda.time.field.ScaledDurationField",
      "org.joda.time.field.RemainderDateTimeField",
      "org.joda.time.chrono.GJEraDateTimeField",
      "org.joda.time.chrono.GJDayOfWeekDateTimeField",
      "org.joda.time.chrono.BasicDayOfMonthDateTimeField",
      "org.joda.time.chrono.BasicDayOfYearDateTimeField",
      "org.joda.time.chrono.BasicMonthOfYearDateTimeField",
      "org.joda.time.chrono.GJMonthOfYearDateTimeField",
      "org.joda.time.chrono.BasicWeekyearDateTimeField",
      "org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField",
      "org.joda.time.field.UnsupportedDurationField",
      "org.joda.time.chrono.GregorianChronology",
      "org.joda.time.chrono.ISOYearOfEraDateTimeField",
      "org.joda.time.chrono.ISOChronology",
      "org.joda.time.tz.DateTimeZoneBuilder$RuleSet",
      "org.joda.time.format.FormatUtils",
      "org.joda.time.PeriodType",
      "org.joda.time.tz.ZoneInfoCompiler",
      "org.joda.time.chrono.BasicSingleEraDateTimeField",
      "org.joda.time.Instant",
      "org.joda.time.chrono.GJChronology",
      "org.joda.time.field.DelegatedDateTimeField",
      "org.joda.time.field.SkipDateTimeField",
      "org.joda.time.chrono.JulianChronology",
      "org.joda.time.chrono.GJChronology$CutoverField",
      "org.joda.time.chrono.GJChronology$ImpreciseCutoverField",
      "org.joda.time.chrono.GJChronology$LinkedDurationField",
      "org.joda.time.field.SkipUndoDateTimeField",
      "org.joda.time.base.BaseDateTime",
      "org.joda.time.DateTime",
      "org.joda.time.chrono.LimitChronology",
      "org.joda.time.chrono.LimitChronology$LimitDurationField",
      "org.joda.time.chrono.LimitChronology$LimitDateTimeField",
      "org.joda.time.chrono.BuddhistChronology",
      "org.joda.time.chrono.ZonedChronology",
      "org.joda.time.chrono.ZonedChronology$ZonedDurationField",
      "org.joda.time.chrono.ZonedChronology$ZonedDateTimeField",
      "org.joda.time.base.BaseLocal",
      "org.joda.time.LocalDateTime",
      "org.joda.time.base.BasePeriod",
      "org.joda.time.Period",
      "org.joda.time.IllegalFieldValueException",
      "org.joda.time.convert.ConverterManager",
      "org.joda.time.convert.ReadableInstantConverter",
      "org.joda.time.convert.StringConverter",
      "org.joda.time.convert.CalendarConverter",
      "org.joda.time.convert.DateConverter",
      "org.joda.time.convert.LongConverter",
      "org.joda.time.convert.NullConverter",
      "org.joda.time.convert.ReadablePartialConverter",
      "org.joda.time.convert.ReadableDurationConverter",
      "org.joda.time.convert.ReadableIntervalConverter",
      "org.joda.time.convert.ReadablePeriodConverter",
      "org.joda.time.MockZone",
      "org.joda.time.DateMidnight",
      "org.joda.time.MockPartial",
      "org.joda.time.LocalDate"
    );
  }
}
