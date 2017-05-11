/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 23 09:54:10 GMT 2017
 */

package org.apache.commons.lang.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.apache.commons.lang.time.DurationFormatUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate;
import org.evosuite.runtime.mock.java.time.chrono.MockThaiBuddhistDate;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DurationFormatUtils_ESTest extends DurationFormatUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[5];
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(mockHijrahDate0);
      durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(durationFormatUtils_TokenArray0[0]);
      DurationFormatUtils.Token durationFormatUtils_Token2 = new DurationFormatUtils.Token(durationFormatUtils_TokenArray0[0], 32);
      boolean boolean0 = durationFormatUtils_Token1.equals(durationFormatUtils_Token2);
      assertFalse(durationFormatUtils_Token2.equals((Object)durationFormatUtils_Token1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(12, 12, 365);
      MockGregorianCalendar mockGregorianCalendar1 = (MockGregorianCalendar)MockCalendar.getInstance();
      int int0 = DurationFormatUtils.reduceAndCorrect(mockGregorianCalendar0, mockGregorianCalendar1, 12, 12);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392408561320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=9,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar1.toString());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriodISO(0L, 3600000L);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[7];
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(mockThaiBuddhistDate0);
      durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token("y", 0);
      durationFormatUtils_TokenArray0[1] = durationFormatUtils_Token1;
      // Undeclared exception!
      try { 
        DurationFormatUtils.format(durationFormatUtils_TokenArray0, 11, 0, 0, (-3069), (-134), 0, 0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.DurationFormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationHMS(2419200000L);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(1L, 2419200000L, "d");
      assertEquals("27", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("M");
      durationFormatUtils_Token0.increment();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(mockJapaneseDate0);
      MockJapaneseDate mockJapaneseDate1 = (MockJapaneseDate)durationFormatUtils_Token0.getValue();
      assertSame(mockJapaneseDate1, mockJapaneseDate0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = DurationFormatUtils.lexx("loFeFgqSAoQ!i");
      boolean boolean0 = DurationFormatUtils.Token.containsTokenWithValue(durationFormatUtils_TokenArray0, (Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(12, 12, 365);
      int int0 = DurationFormatUtils.reduceAndCorrect(mockGregorianCalendar0, mockGregorianCalendar0, 12, 12);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-61725629520000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=13,MONTH=11,WEEK_OF_YEAR=52,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,DAY_OF_YEAR=364,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=48,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = DurationFormatUtils.lexx("");
      assertNotNull(durationFormatUtils_TokenArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getTimeZone("");
      String string0 = DurationFormatUtils.formatPeriod(0L, (-1518L), "", false, (TimeZone) zoneInfo0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(2419200000L, 2419200000L, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(0L, "", true);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(511L, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = DurationFormatUtils.lexx("Y1r\"1 MW8@*PV:7");
      String string0 = DurationFormatUtils.format(durationFormatUtils_TokenArray0, 100, 696, 41, 41, 120, 696, 41, true);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        DurationFormatUtils.reduceAndCorrect((Calendar) null, (Calendar) null, (-2554), (-2554));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.DurationFormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 2, 2, 2, 216);
      // Undeclared exception!
      try { 
        DurationFormatUtils.reduceAndCorrect(mockGregorianCalendar0, mockGregorianCalendar0, 216, 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      // Undeclared exception!
      try { 
        DurationFormatUtils.reduceAndCorrect(mockGregorianCalendar0, mockGregorianCalendar0, 4740, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4740
         //
         verifyException("java.util.Calendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        DurationFormatUtils.lexx((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ZoneId zoneId0 = ZoneId.systemDefault();
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getTimeZone(zoneId0);
      // Undeclared exception!
      try { 
        DurationFormatUtils.formatPeriod(0L, 1L, (String) null, true, (TimeZone) zoneInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        DurationFormatUtils.formatPeriod((-1366L), 1246L, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        DurationFormatUtils.formatDuration(1526L, (String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        DurationFormatUtils.formatDuration((long) 52, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod((-908L), 1L, "Y1r\"1 MW8@*PV:7", true, (TimeZone) null);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration((long) 8192, "jR'U\"", true);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(2003L, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", true);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(mockJapaneseDate0, 46);
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(durationFormatUtils_Token0, 46);
      DurationFormatUtils.Token durationFormatUtils_Token2 = new DurationFormatUtils.Token(durationFormatUtils_Token0);
      boolean boolean0 = durationFormatUtils_Token1.equals(durationFormatUtils_Token2);
      assertFalse(durationFormatUtils_Token2.equals((Object)durationFormatUtils_Token1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("I=u]", 1000);
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(mockThaiBuddhistDate0);
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(mockJapaneseDate0);
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("java.lang.StringBuffer@00000000190java.lang.StringBuffer@0000000020", 942);
      boolean boolean0 = durationFormatUtils_Token0.equals("Bx'");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-63), (-63), (-63), 49, 49);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(49, "java.lang.StringBuffer@00000000160java.lang.StringBuffer@00000000170java.lang.StringBuffer@00000000180java.lang.StringBuffer@00000000190java.lang.StringBuffer@00000000200java.lang.StringBuffer@0000000021-2java.lang.StringBuffer@00000000225java.lang.StringBuffer@0000000023");
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((TimeZone) simpleTimeZone0);
      int int0 = DurationFormatUtils.reduceAndCorrect(mockGregorianCalendar0, mockGregorianCalendar1, 2, 0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-64326607860000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=70,MONTH=6,WEEK_OF_YEAR=31,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=212,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=49,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(2419200000L, "java.lang.StringBuffer@0000000028942java.lang.StringBuffer@0000000029java.lang.StringBuffer@0000000030", false);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration((long) 942, "java.lang.StringBuffer@00000000190java.lang.StringBuffer@0000000020");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[1];
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(mockJapaneseDate0);
      durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
      String string0 = DurationFormatUtils.format(durationFormatUtils_TokenArray0, (-1510), 0, 0, (-1510), (-209), (-1510), (-1510), true);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriodISO((-2419201041L), 2419199980L);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-1493), "y");
      String string0 = DurationFormatUtils.formatPeriod((-4418L), 2419198516L, " 0 minutes", true, (TimeZone) simpleTimeZone0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-985), "y");
      String string0 = DurationFormatUtils.formatPeriod((-4418L), 2419198516L, "y", false, (TimeZone) simpleTimeZone0);
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1519, "y");
      String string0 = DurationFormatUtils.formatPeriod((-4415L), 2419198516L, "MQxR'/+c-LKv/:", true, (TimeZone) simpleTimeZone0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(1216L, false, false);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(0, true, true);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords((-759L), false, true);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DurationFormatUtils durationFormatUtils0 = new DurationFormatUtils();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(durationFormatUtils0);
      int int0 = durationFormatUtils_Token0.getCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO(60000L);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriodISO(1519, 511L);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("java.lang.StringBuffer@00000000190java.lang.StringBuffer@0000000020", 942);
      String string0 = durationFormatUtils_Token0.toString();
      assertNotNull(string0);
  }
}