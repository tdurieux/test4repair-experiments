/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 28 10:25:54 GMT 2017
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.MockNullZoneChronology;
import org.joda.time.TestDateTime_Basics;
import org.joda.time.field.UnsupportedDateTimeField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateTimeFieldType_ESTest extends DateTimeFieldType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
      assertEquals("weeks", durationFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      UnsupportedDateTimeField unsupportedDateTimeField0 = (UnsupportedDateTimeField)dateTimeFieldType0.getField(mockNullZoneChronology0);
      assertEquals("weekOfWeekyear", unsupportedDateTimeField0.getName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      assertEquals("days", durationFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      assertEquals("clockhourOfDay", dateTimeFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      assertEquals("year", dateTimeFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      assertEquals("millisOfSecond", dateTimeFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      assertEquals("monthOfYear", dateTimeFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      String string0 = dateTimeFieldType0.toString();
      assertEquals("dayOfWeek", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
      assertNull(durationFieldType0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      assertEquals("era", dateTimeFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      assertEquals("hourOfDay", dateTimeFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      assertEquals("minuteOfDay", dateTimeFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      assertEquals("yearOfEra", dateTimeFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      assertEquals("secondOfDay", dateTimeFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      assertEquals("secondOfMinute", dateTimeFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      assertEquals("yearOfCentury", dateTimeFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      assertEquals("clockhourOfHalfday", dateTimeFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      String string0 = dateTimeFieldType0.getName();
      assertEquals("minuteOfHour", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      assertEquals("dayOfMonth", dateTimeFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.centuryOfEra();
      assertEquals("centuryOfEra", dateTimeFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      assertEquals("hourOfHalfday", dateTimeFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      assertEquals("halfdayOfDay", dateTimeFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TestDateTime_Basics testDateTime_Basics0 = new TestDateTime_Basics("PqW4]w-84*_<N");
      testDateTime_Basics0.testIsSupported_DateTimeFieldType();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      // Undeclared exception!
      try { 
        TestCase.assertEquals("", (Object) dateTimeFieldType0, (Object) null);
        fail("Expecting exception: AssertionFailedError");
      
      } catch(AssertionFailedError e) {
         //
         // expected:<dayOfYear> but was:<null>
         //
         verifyException("junit.framework.Assert", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
      boolean boolean0 = dateTimeFieldType0.isSupported(mockNullZoneChronology0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      boolean boolean0 = dateTimeFieldType0.isSupported((Chronology) null);
      assertTrue(boolean0);
  }
}