/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 24 22:16:52 GMT 2017
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.MockZone;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.BasicChronology;
import org.joda.time.chrono.BasicMonthOfYearDateTimeField;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJMonthOfYearDateTimeField;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.ZonedChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BasicMonthOfYearDateTimeField_ESTest extends BasicMonthOfYearDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(islamicChronology0, 1);
      // Undeclared exception!
      try { 
        basicMonthOfYearDateTimeField0.add((long) 1, 12);
       //  fail("Expecting exception: IllegalAccessError");
       // Unstable assertion
      } catch(IllegalAccessError e) {
         //
         // tried to access field org.joda.time.field.ImpreciseDateTimeField.iUnitMillis from class org.joda.time.chrono.BasicMonthOfYearDateTimeField
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(julianChronology0, 5062500);
      // Undeclared exception!
      try { 
        basicMonthOfYearDateTimeField0.set((long) 5062500, 1094);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1094 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null, 1);
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(julianChronology0, 1);
      // Undeclared exception!
      try { 
        basicMonthOfYearDateTimeField0.set((long) 1, 1);
       //  fail("Expecting exception: IllegalAccessError");
       // Unstable assertion
      } catch(IllegalAccessError e) {
         //
         // tried to access field org.joda.time.field.ImpreciseDateTimeField.iUnitMillis from class org.joda.time.chrono.BasicMonthOfYearDateTimeField
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(copticChronology0, 1);
      // Undeclared exception!
      try { 
        basicMonthOfYearDateTimeField0.isLeap(1);
       //  fail("Expecting exception: IllegalAccessError");
       // Unstable assertion
      } catch(IllegalAccessError e) {
         //
         // tried to access field org.joda.time.field.ImpreciseDateTimeField.iUnitMillis from class org.joda.time.chrono.BasicMonthOfYearDateTimeField
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(islamicChronology0);
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.getLeapAmount(1);
       //  fail("Expecting exception: IllegalAccessError");
       // Unstable assertion
      } catch(IllegalAccessError e) {
         //
         // tried to access field org.joda.time.field.ImpreciseDateTimeField.iUnitMillis from class org.joda.time.chrono.BasicMonthOfYearDateTimeField
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = new IslamicChronology.LeapYearPatternType(1, 1);
      IslamicChronology islamicChronology0 = new IslamicChronology(iSOChronology0, mockJapaneseDate0, islamicChronology_LeapYearPatternType0);
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(islamicChronology0);
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.getDifferenceAsLong(1694L, 1);
       //  fail("Expecting exception: IllegalAccessError");
       // Unstable assertion
      } catch(IllegalAccessError e) {
         //
         // tried to access field org.joda.time.field.ImpreciseDateTimeField.iUnitMillis from class org.joda.time.chrono.BasicMonthOfYearDateTimeField
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(julianChronology0);
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.add((ReadablePartial) null, 0, (int[]) null, 1438);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Partial must not be null
         //
         verifyException("org.joda.time.DateTimeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(islamicChronology0);
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.add((long) 1, (long) 1);
       //  fail("Expecting exception: IllegalAccessError");
       // Unstable assertion
      } catch(IllegalAccessError e) {
         //
         // tried to access field org.joda.time.field.ImpreciseDateTimeField.iUnitMillis from class org.joda.time.chrono.BasicMonthOfYearDateTimeField
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = null;
      try {
        basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField((BasicChronology) null, 26);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(copticChronology0);
      int int0 = gJMonthOfYearDateTimeField0.getMinimumValue();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(islamicChronology0, 1);
      int int0 = basicMonthOfYearDateTimeField0.getMaximumValue();
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(julianChronology0, (-239));
      DurationField durationField0 = basicMonthOfYearDateTimeField0.getRangeDurationField();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockZone mockZone0 = new MockZone(0L, 17, 17);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) mockZone0);
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(islamicChronology0);
      int[] intArray0 = new int[1];
      int[] intArray1 = gJMonthOfYearDateTimeField0.add((ReadablePartial) null, 17, intArray0, 0);
      assertArrayEquals(new int[] {0}, intArray1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(islamicChronology0, 1);
      // Undeclared exception!
      try { 
        basicMonthOfYearDateTimeField0.add((long) 1, 0);
       //  fail("Expecting exception: IllegalAccessError");
       // Unstable assertion
      } catch(IllegalAccessError e) {
         //
         // tried to access field org.joda.time.field.ImpreciseDateTimeField.iUnitMillis from class org.joda.time.chrono.BasicMonthOfYearDateTimeField
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(julianChronology0, 0);
      // Undeclared exception!
      try { 
        basicMonthOfYearDateTimeField0.add((long) 0, (-93));
       //  fail("Expecting exception: IllegalAccessError");
       // Unstable assertion
      } catch(IllegalAccessError e) {
         //
         // tried to access field org.joda.time.field.ImpreciseDateTimeField.iUnitMillis from class org.joda.time.chrono.BasicMonthOfYearDateTimeField
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(julianChronology0, (-2023));
      // Undeclared exception!
      try { 
        basicMonthOfYearDateTimeField0.addWrapField((long) 1458430, 1458430);
       //  fail("Expecting exception: IllegalAccessError");
       // Unstable assertion
      } catch(IllegalAccessError e) {
         //
         // tried to access field org.joda.time.field.ImpreciseDateTimeField.iUnitMillis from class org.joda.time.chrono.BasicMonthOfYearDateTimeField
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(julianChronology0, (-2023));
      boolean boolean0 = basicMonthOfYearDateTimeField0.isLenient();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockZone mockZone0 = new MockZone(0L, 17, 17);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) mockZone0);
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(islamicChronology0);
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.get(0L);
       //  fail("Expecting exception: IllegalAccessError");
       // Unstable assertion
      } catch(IllegalAccessError e) {
         //
         // tried to access field org.joda.time.field.ImpreciseDateTimeField.iUnitMillis from class org.joda.time.chrono.BasicMonthOfYearDateTimeField
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockZone mockZone0 = new MockZone(0L, 17, 17);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) mockZone0);
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(islamicChronology0);
      ZonedChronology.ZonedDurationField zonedChronology_ZonedDurationField0 = (ZonedChronology.ZonedDurationField)gJMonthOfYearDateTimeField0.getLeapDurationField();
      assertTrue(zonedChronology_ZonedDurationField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(julianChronology0);
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.remainder(2173L);
       //  fail("Expecting exception: IllegalAccessError");
       // Unstable assertion
      } catch(IllegalAccessError e) {
         //
         // tried to access field org.joda.time.field.ImpreciseDateTimeField.iUnitMillis from class org.joda.time.chrono.BasicMonthOfYearDateTimeField
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(islamicChronology0);
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.roundFloor(1);
       //  fail("Expecting exception: IllegalAccessError");
       // Unstable assertion
      } catch(IllegalAccessError e) {
         //
         // tried to access field org.joda.time.field.ImpreciseDateTimeField.iUnitMillis from class org.joda.time.chrono.BasicMonthOfYearDateTimeField
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }
}