/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 11 00:36:13 GMT 2017
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
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.TestDateMidnight_Basics;
import org.joda.time.TestDateTime_Basics;
import org.joda.time.field.UnsupportedDateTimeField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateTimeFieldType_ESTest extends DateTimeFieldType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      TestDateTime_Basics testDateTime_Basics0 = new TestDateTime_Basics("4<jG}EP&)BF@IB:6");
      TestDateTime_Basics.MockEqualsChronology testDateTime_Basics_MockEqualsChronology0 = testDateTime_Basics0.new MockEqualsChronology();
      UnsupportedDateTimeField unsupportedDateTimeField0 = (UnsupportedDateTimeField)dateTimeFieldType0.getField(testDateTime_Basics_MockEqualsChronology0);
      assertEquals("UnsupportedDateTimeField", unsupportedDateTimeField0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
      assertNull(durationFieldType0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      String string0 = dateTimeFieldType0.toString();
      assertEquals("millisOfSecond", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      assertEquals("monthOfYear", dateTimeFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      assertEquals("dayOfWeek", dateTimeFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      assertEquals("weekyear", dateTimeFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      assertEquals("minuteOfHour", dateTimeFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      assertEquals("era", dateTimeFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      assertEquals("hourOfDay", dateTimeFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      assertEquals("minuteOfDay", dateTimeFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      assertEquals("yearOfEra", dateTimeFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      assertEquals("secondOfMinute", dateTimeFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      assertEquals("yearOfCentury", dateTimeFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      assertEquals("clockhourOfHalfday", dateTimeFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      String string0 = dateTimeFieldType0.getName();
      assertEquals("secondOfDay", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      assertEquals("dayOfMonth", dateTimeFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.centuryOfEra();
      assertEquals("centuryOfEra", dateTimeFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      assertEquals("hourOfHalfday", dateTimeFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      assertEquals("millisOfDay", dateTimeFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      assertEquals("halfdayOfDay", dateTimeFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        TestCase.assertEquals("h[Xj#dct", (Object) dateTimeFieldType0, object0);
        fail("Expecting exception: AssertionFailedError");
      
      } catch(AssertionFailedError e) {
         //
         // h[Xj#dct expected:<dayOfYear> but was:<java.lang.Object@29170d96>
         //
         verifyException("junit.framework.Assert", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
      assertEquals("days", durationFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      assertEquals("weeks", durationFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      boolean boolean0 = dateTimeFieldType0.isSupported((Chronology) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      TestDateTime_Basics testDateTime_Basics0 = new TestDateTime_Basics("minuteOfHour");
      TestDateTime_Basics.MockEqualsChronology testDateTime_Basics_MockEqualsChronology0 = testDateTime_Basics0.new MockEqualsChronology();
      boolean boolean0 = dateTimeFieldType0.isSupported(testDateTime_Basics_MockEqualsChronology0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TestDateMidnight_Basics testDateMidnight_Basics0 = new TestDateMidnight_Basics(";~&O'aoD$");
      testDateMidnight_Basics0.testProperty();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TestDateTime_Basics testDateTime_Basics0 = new TestDateTime_Basics("4<jG}EP&)BF@IB:6");
      testDateTime_Basics0.testIsSupported_DateTimeFieldType();
  }
}