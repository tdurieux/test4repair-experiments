/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 25 19:46:33 GMT 2017
 */

package org.apache.commons.lang.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.JapaneseDate;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.commons.lang.time.DurationFormatUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DurationFormatUtils_ESTest extends DurationFormatUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("", Integer.MAX_VALUE);
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token("");
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      MockGregorianCalendar mockGregorianCalendar0 = (MockGregorianCalendar)MockCalendar.getInstance(locale0);
      MockGregorianCalendar mockGregorianCalendar1 = (MockGregorianCalendar)MockCalendar.getInstance();
      int int0 = DurationFormatUtils.reduceAndCorrect(mockGregorianCalendar1, mockGregorianCalendar0, 0, 3126);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(64, 7, 64, 73, 112);
      int int0 = DurationFormatUtils.reduceAndCorrect(mockGregorianCalendar0, mockGregorianCalendar1, 7, 112);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-60133266480000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=64,MONTH=5,WEEK_OF_YEAR=24,WEEK_OF_MONTH=3,DAY_OF_MONTH=16,DAY_OF_YEAR=168,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=52,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar1.toString());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = DurationFormatUtils.lexx("M");
      String string0 = DurationFormatUtils.format(durationFormatUtils_TokenArray0, 366, 3, 1, 366, (-2897), (-1), 270, true);
      assertEquals("3", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = DurationFormatUtils.lexx(" 1 days");
      String string0 = DurationFormatUtils.format(durationFormatUtils_TokenArray0, 32, 112, 1662, 2, 32, 73, 83, false);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(3394L, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[4];
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("y", 0);
      durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
      // Undeclared exception!
      try { 
        DurationFormatUtils.format(durationFormatUtils_TokenArray0, 24, 3728, 24, 0, 137, 24, 80, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.DurationFormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriodISO(2960L, 2419200000L);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(mockMinguoDate0);
      String string0 = durationFormatUtils_Token0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("");
      String string0 = (String)durationFormatUtils_Token0.getValue();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = DurationFormatUtils.lexx("M");
      boolean boolean0 = DurationFormatUtils.Token.containsTokenWithValue(durationFormatUtils_TokenArray0, "H");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      int int0 = DurationFormatUtils.reduceAndCorrect(mockGregorianCalendar0, mockGregorianCalendar0, 7, 112);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1382732481320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2013,MONTH=9,WEEK_OF_YEAR=43,WEEK_OF_MONTH=4,DAY_OF_MONTH=25,DAY_OF_YEAR=298,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = DurationFormatUtils.lexx("");
      assertNotNull(durationFormatUtils_TokenArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod((-1L), (long) 512, "", false, (TimeZone) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod((long) (-2378), (long) (-2378), "366");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(0L, "", false);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration((-811L), "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = DurationFormatUtils.lexx("M");
      String string0 = DurationFormatUtils.format(durationFormatUtils_TokenArray0, (-2359), 366, (-2359), (-2359), (-2378), 366, (-2378), false);
      assertEquals("366", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        DurationFormatUtils.reduceAndCorrect((Calendar) null, (Calendar) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.DurationFormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      MockGregorianCalendar mockGregorianCalendar0 = (MockGregorianCalendar)MockCalendar.getInstance(locale0);
      // Undeclared exception!
      try { 
        DurationFormatUtils.reduceAndCorrect(mockGregorianCalendar0, mockGregorianCalendar0, 2225, 1045);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(414, 414, 414, 0, 224, (-1));
      // Undeclared exception!
      try { 
        DurationFormatUtils.reduceAndCorrect(mockGregorianCalendar0, mockGregorianCalendar0, 224, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 224
         //
         verifyException("java.util.Calendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        DurationFormatUtils.lexx((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.DurationFormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getTimeZone((ZoneId) zoneOffset0);
      // Undeclared exception!
      try { 
        DurationFormatUtils.formatPeriod((long) 1, 1L, (String) null, true, (TimeZone) zoneInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.DurationFormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        DurationFormatUtils.formatPeriod((-1668L), 0L, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.DurationFormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        DurationFormatUtils.formatDuration(0L, (String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.DurationFormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        DurationFormatUtils.formatDuration(2608L, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.DurationFormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getTimeZone((ZoneId) zoneOffset0);
      String string0 = DurationFormatUtils.formatPeriod((-472L), 2419200000L, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", true, (TimeZone) zoneInfo0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(0L, "The FileFilter must not be null", true);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(1249L, "He[Z[", false);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration((-3552L), "java.lang.StringBuffer@00000000180java.lang.StringBuffer@00000000190java.lang.StringBuffer@00000000200java.lang.StringBuffer@00000000210java.lang.StringBuffer@00000000220java.lang.StringBuffer@00000000230java.lang.StringBuffer@0000000024000java.lang.StringBuffer@0000000025", true);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(0L, "9Ld!OQK2i4|S!d|'K7%", true);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("java.lang.StringBuffer@00000000180java.lang.StringBuffer@00000000190java.lang.StringBuffer@00000000200java.lang.StringBuffer@00000000210java.lang.StringBuffer@00000000220java.lang.StringBuffer@00000000230java.lang.StringBuffer@0000000024001java.lang.StringBuffer@0000000025");
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token("org.evosuite.runtime.mock.java.time.chrono.MockThaiBuddhistDate@0000000002org.evosuite.runtime.mock.java.time.chrono.MockThaiBuddhistDate@0000000002");
      durationFormatUtils_Token1.increment();
      durationFormatUtils_Token0.increment();
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("");
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token("0java.lang.StringBuffer@00000000570java.lang.StringBuffer@00000000580java.lang.StringBuffer@00000000590java.lang.StringBuffer@0000000060", 256);
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      JapaneseDate japaneseDate0 = MockJapaneseDate.now();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(mockJapaneseDate0);
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(japaneseDate0);
      boolean boolean0 = durationFormatUtils_Token1.equals(durationFormatUtils_Token0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("s");
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("366");
      boolean boolean0 = durationFormatUtils_Token0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(16, 7, 16, 73, 112);
      int int0 = DurationFormatUtils.reduceAndCorrect(mockGregorianCalendar0, mockGregorianCalendar1, 7, 112);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-61652005680000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=16,MONTH=4,WEEK_OF_YEAR=18,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=122,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=52,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar1.toString());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[1];
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("S");
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(durationFormatUtils_Token0);
      durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token1;
      String string0 = DurationFormatUtils.format(durationFormatUtils_TokenArray0, 16, 16, 112, 16, 112, 16, 112, true);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getTimeZone((ZoneId) zoneOffset0);
      String string0 = DurationFormatUtils.formatPeriod((-449L), 2419200000L, "0java.lang.StringBuffer@000000000800java.lang.StringBuffer@000000000902java.lang.StringBuffer@0000000010960", false, (TimeZone) zoneInfo0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriodISO(0L, 2419200000L);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(1141L, true, true);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(0L, true, false);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(2419200000L, false, false);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(2419200000L, 2419200000L, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationHMS(2960L);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DurationFormatUtils durationFormatUtils0 = new DurationFormatUtils();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(durationFormatUtils0);
      int int0 = durationFormatUtils_Token0.getCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token((Object) null);
      boolean boolean0 = linkedHashSet0.contains(durationFormatUtils_Token0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO(416L);
      assertNotNull(string0);
  }
}
