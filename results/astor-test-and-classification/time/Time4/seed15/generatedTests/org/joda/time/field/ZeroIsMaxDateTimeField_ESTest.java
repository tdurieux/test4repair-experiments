/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 15 23:51:07 GMT 2017
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.MockZone;
import org.joda.time.MonthDay;
import org.joda.time.Partial;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.field.DividedDateTimeField;
import org.joda.time.field.PreciseDateTimeField;
import org.joda.time.field.TestBaseDateTimeField;
import org.joda.time.field.TestPreciseDateTimeField;
import org.joda.time.field.TestPreciseDurationDateTimeField;
import org.joda.time.field.ZeroIsMaxDateTimeField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ZeroIsMaxDateTimeField_ESTest extends ZeroIsMaxDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0 = new TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.set((long) 60, 60);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.hourOfHalfday();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfFloor(1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfFloor(1997L);
      assertEquals(1997L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfEven(1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfEven((-60000L));
      assertEquals((-60000L), long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.halfdayOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfCeiling(1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfCeiling(438L);
      assertEquals(420L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.hourOfHalfday();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundFloor(1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockZone mockZone0 = new MockZone(0L, 1, 19);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) mockZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.minuteOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundFloor(100000000L);
      assertEquals(99940999L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.hourOfHalfday();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundCeiling(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TestPreciseDateTimeField.MockStandardDateTimeField testPreciseDateTimeField_MockStandardDateTimeField0 = new TestPreciseDateTimeField.MockStandardDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDateTimeField_MockStandardDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundCeiling(2247);
      assertEquals(2280L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.remainder(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(islamicChronology0);
      DividedDateTimeField dividedDateTimeField0 = new DividedDateTimeField(dateTimeField0, dateTimeFieldType0, 1380);
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) dividedDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.remainder(1);
      assertEquals(1L, long0);
      assertEquals(1, zeroIsMaxDateTimeField0.getMinimumValue());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.minuteOfHour();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.getDifferenceAsLong(13737600000L, 851L);
      assertEquals(228959L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfMinute();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.getDifferenceAsLong(578L, 1831L);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField(dateTimeFieldType0);
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.getDifference(1054L, 0L);
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      PreciseDateTimeField preciseDateTimeField0 = (PreciseDateTimeField)dateTimeFieldType0.getField(gregorianChronology0);
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) preciseDateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.getDifference((-1371L), (-269L));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.get((-60000L));
      assertEquals((-1000), int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0 = new TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      StrictChronology strictChronology0 = StrictChronology.getInstance(islamicChronology0);
      DateTime dateTime0 = DateTime.now((Chronology) strictChronology0);
      LocalDateTime localDateTime0 = dateTime0.toLocalDateTime();
      Partial partial0 = new Partial((ReadablePartial) localDateTime0);
      int[] intArray0 = new int[7];
      int[] intArray1 = zeroIsMaxDateTimeField0.addWrapField((ReadablePartial) partial0, 1, intArray0, 1);
      assertArrayEquals(new int[] {0, 1, 1, 0, 0, 0, 0}, intArray1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.addWrapField(0L, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfSecond();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.addWrapField((-1467L), (-1521));
      assertEquals((-1988L), long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.add(0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.halfdayOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.add((long) 1, (-1123L));
      assertEquals((-48513599999L), long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.add(1L, 1);
      assertEquals(2L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.hourOfHalfday();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.add(0L, (-5642));
      assertEquals((-20311200000L), long0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField(dateTimeFieldType0);
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, dateTimeFieldType0);
      // Undeclared exception!
      try { 
        zeroIsMaxDateTimeField0.set(1L, 89);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 89 for dayOfWeek must be in the range [1,60]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(islamicChronology0);
      DividedDateTimeField dividedDateTimeField0 = new DividedDateTimeField(dateTimeField0, dateTimeFieldType0, 1380);
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) dividedDateTimeField0, dateTimeFieldType0);
      // Undeclared exception!
      try { 
        zeroIsMaxDateTimeField0.roundHalfEven((-431L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for clockhourOfHalfday must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0 = new TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      int[] intArray0 = new int[6];
      // Undeclared exception!
      try { 
        zeroIsMaxDateTimeField0.addWrapField((ReadablePartial) null, 0, intArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TestPreciseDateTimeField.MockStandardDateTimeField testPreciseDateTimeField_MockStandardDateTimeField0 = new TestPreciseDateTimeField.MockStandardDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDateTimeField_MockStandardDateTimeField0, dateTimeFieldType0);
      LocalDate localDate0 = LocalDate.now();
      int[] intArray0 = new int[9];
      // Undeclared exception!
      try { 
        zeroIsMaxDateTimeField0.addWrapField((ReadablePartial) localDate0, (-698), intArray0, (-893));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -698
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.get(3810L);
      assertEquals(63, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0 = new TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.getMinimumValue();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0 = new TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.getMaximumValue();
      assertEquals(60, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0 = new TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.set(1332L, 60);
      assertEquals(12L, long0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.minuteOfHour();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.set((-2670L), 1);
      assertEquals((-3482670L), long0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0 = new TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.get(0L);
      assertEquals(60, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, dateTimeFieldType0);
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField1 = null;
      try {
        zeroIsMaxDateTimeField1 = new ZeroIsMaxDateTimeField((DateTimeField) zeroIsMaxDateTimeField0, dateTimeFieldType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrapped field's minumum value must be zero
         //
         verifyException("org.joda.time.field.ZeroIsMaxDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundFloor((-1377L));
      assertEquals((-1380L), long0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0 = new TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.getDifference(2422L, 2422L);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.halfdayOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.getMaximumValue((ReadablePartial) null);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      YearMonth yearMonth0 = new YearMonth(1, 1);
      int int0 = zeroIsMaxDateTimeField0.getMinimumValue((ReadablePartial) yearMonth0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0 = new TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      boolean boolean0 = zeroIsMaxDateTimeField0.isLeap((-2202L));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.remainder((-1123L));
      assertEquals((-43L), long0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0 = new TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      int[] intArray0 = new int[6];
      int int0 = zeroIsMaxDateTimeField0.getMinimumValue((ReadablePartial) null, intArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.hourOfHalfday();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.getMaximumValue((-2036L));
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.getMinimumValue(3810L);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0 = new TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.addWrapField((-2202L), 1);
      assertEquals(1458L, long0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0 = new TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfEven(21260793600000L);
      assertEquals(21260793600000L, long0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0 = new TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.getLeapAmount(60);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfFloor((-761L));
      assertEquals((-780L), long0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfMinute();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      DurationField durationField0 = zeroIsMaxDateTimeField0.getLeapDurationField();
      assertNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfCeiling((-60000L));
      assertEquals((-60000L), long0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0 = new TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.getDifferenceAsLong(13L, 13L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0 = new TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundCeiling((-574L));
      assertEquals((-540L), long0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0 = new TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.add((long) 0, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.minuteOfHour();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.add(0L, 3050L);
      assertEquals(183000000L, long0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, dateTimeFieldType0);
      int[] intArray0 = new int[0];
      int int0 = zeroIsMaxDateTimeField0.getMaximumValue((ReadablePartial) null, intArray0);
      assertEquals(60, int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(islamicChronology0);
      DividedDateTimeField dividedDateTimeField0 = new DividedDateTimeField(dateTimeField0, dateTimeFieldType0, 1380);
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) dividedDateTimeField0, dateTimeFieldType0);
      MonthDay monthDay0 = new MonthDay(2392L, (Chronology) islamicChronology0);
      int[] intArray0 = new int[2];
      // Undeclared exception!
      try { 
        zeroIsMaxDateTimeField0.addWrapField((ReadablePartial) monthDay0, 1, intArray0, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MIN > MAX
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }
}
