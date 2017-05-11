/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 22 17:56:37 GMT 2017
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.MockNullZoneChronology;
import org.joda.time.TestDateMidnight_Basics;
import org.joda.time.TestDateTime_Basics;
import org.joda.time.TestInstant_Basics;
import org.joda.time.TestMutableDateTime_Basics;
import org.joda.time.TestMutableInterval_Constructors;
import org.joda.time.TestYearMonthDay_Basics;
import org.joda.time.TestYearMonth_Basics;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.PreciseDateTimeField;
import org.joda.time.field.UnsupportedDateTimeField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateTimeFieldType_ESTest extends DateTimeFieldType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
      assertNull(durationFieldType0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      assertEquals("year", dateTimeFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      assertEquals("weekOfWeekyear", dateTimeFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      String string0 = dateTimeFieldType0.toString();
      assertEquals("yearOfCentury", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      assertEquals("millisOfSecond", dateTimeFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      String string0 = dateTimeFieldType0.getName();
      assertEquals("clockhourOfDay", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TestYearMonthDay_Basics testYearMonthDay_Basics0 = new TestYearMonthDay_Basics("org.joda.time.TestBasePartial$MockPartial");
      // Undeclared exception!
      try { 
        testYearMonthDay_Basics0.testToDateTimeAtMidnight_nullZone();
        fail("Expecting exception: AssertionFailedError");
      
      } catch(AssertionFailedError e) {
         //
         // expected:<2005-06-09T00:00:00.000Z> but was:<2005-06-09T00:00:00.000Z>
         //
         verifyException("junit.framework.Assert", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        TestCase.assertEquals((Object) dateTimeFieldType0, object0);
        fail("Expecting exception: AssertionFailedError");
      
      } catch(AssertionFailedError e) {
         //
         // expected:<clockhourOfHalfday> but was:<java.lang.Object@274591>
         //
         verifyException("junit.framework.Assert", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
      assertEquals("days", durationFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      assertEquals("millis", durationFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      TestDateTime_Basics testDateTime_Basics0 = new TestDateTime_Basics("p");
      TestDateTime_Basics.MockEqualsChronology testDateTime_Basics_MockEqualsChronology0 = testDateTime_Basics0.new MockEqualsChronology();
      boolean boolean0 = dateTimeFieldType0.isSupported(testDateTime_Basics_MockEqualsChronology0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      assertEquals("monthOfYear", dateTimeFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      TestMutableInterval_Constructors testMutableInterval_Constructors0 = new TestMutableInterval_Constructors("year");
      TestMutableInterval_Constructors.MockInterval testMutableInterval_Constructors_MockInterval0 = testMutableInterval_Constructors0.new MockInterval();
      ISOChronology iSOChronology0 = (ISOChronology)testMutableInterval_Constructors_MockInterval0.getChronology();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(iSOChronology0);
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      TestMutableDateTime_Basics testMutableDateTime_Basics0 = new TestMutableDateTime_Basics("");
      TestMutableDateTime_Basics.MockEqualsChronology testMutableDateTime_Basics_MockEqualsChronology0 = testMutableDateTime_Basics0.new MockEqualsChronology();
      UnsupportedDateTimeField unsupportedDateTimeField0 = (UnsupportedDateTimeField)dateTimeFieldType0.getField(testMutableDateTime_Basics_MockEqualsChronology0);
      assertEquals("clockhourOfHalfday", unsupportedDateTimeField0.getName());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      assertEquals("secondOfDay", dateTimeFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      assertEquals("dayOfMonth", dateTimeFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      assertEquals("secondOfMinute", dateTimeFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      boolean boolean0 = dateTimeFieldType0.isSupported((Chronology) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.centuryOfEra();
      MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
      UnsupportedDateTimeField unsupportedDateTimeField0 = (UnsupportedDateTimeField)dateTimeFieldType0.getField(mockNullZoneChronology0);
      assertEquals("centuryOfEra", unsupportedDateTimeField0.getName());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
      UnsupportedDateTimeField unsupportedDateTimeField0 = (UnsupportedDateTimeField)dateTimeFieldType0.getField(mockNullZoneChronology0);
      assertEquals("UnsupportedDateTimeField", unsupportedDateTimeField0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      assertEquals("minuteOfHour", dateTimeFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      TestInstant_Basics testInstant_Basics0 = new TestInstant_Basics("j'P1=?DL ");
      TestInstant_Basics.MockInstant testInstant_Basics_MockInstant0 = testInstant_Basics0.new MockInstant();
      ISOChronology iSOChronology0 = (ISOChronology)testInstant_Basics_MockInstant0.getChronology();
      PreciseDateTimeField preciseDateTimeField0 = (PreciseDateTimeField)dateTimeFieldType0.getField(iSOChronology0);
      assertTrue(preciseDateTimeField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField((Chronology) null);
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField((Chronology) null);
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      TestYearMonth_Basics testYearMonth_Basics0 = new TestYearMonth_Basics("");
      TestYearMonth_Basics.MockYM testYearMonth_Basics_MockYM0 = testYearMonth_Basics0.new MockYM();
      CopticChronology copticChronology0 = (CopticChronology)testYearMonth_Basics_MockYM0.getChronology();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(copticChronology0);
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      boolean boolean0 = dateTimeFieldType0.isSupported((Chronology) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
      boolean boolean0 = dateTimeFieldType0.isSupported(mockNullZoneChronology0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
      UnsupportedDateTimeField unsupportedDateTimeField0 = (UnsupportedDateTimeField)dateTimeFieldType0.getField(mockNullZoneChronology0);
      assertFalse(unsupportedDateTimeField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TestDateMidnight_Basics testDateMidnight_Basics0 = new TestDateMidnight_Basics("");
      testDateMidnight_Basics0.testProperty();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      assertEquals("dayOfWeek", dateTimeFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      assertEquals("hourOfDay", dateTimeFieldType0.toString());
  }
}