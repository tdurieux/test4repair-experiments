/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 24 20:08:24 GMT 2017
 */

package org.joda.time.tz;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.tz.CachedDateTimeZone;
import org.joda.time.tz.DateTimeZoneBuilder;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateTimeZoneBuilder_ESTest extends DateTimeZoneBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      String string0 = cachedDateTimeZone0.getShortName(1807L);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      String string0 = cachedDateTimeZone0.getName((-9223372036854775796L));
      assertEquals("+00:09:21", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(192);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.addCutover(192, '', 192, 192, 192, false, 192);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: 
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("\"*[sxR7,L%[_y.j", 0, 0, 0, 'w', 4, 4, 4, true, (-1381));
      dateTimeZoneBuilder1.addRecurringSavings(")=Kb9 7?m7#", 'w', (-1381), (-1381), 'w', 4, 4, 4, true, 4);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(4);
      MockFile mockFile0 = new MockFile(")=Kb9 7?m7#");
      MockPrintStream mockPrintStream0 = new MockPrintStream((File) mockFile0);
      dateTimeZoneBuilder2.writeTo("\"*[sxR7,L%[_y.j", (OutputStream) mockPrintStream0);
      //  // Unstable assertion: assertEquals(118L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setStandardOffset(1174);
      dateTimeZoneBuilder0.addCutover(1174, 'w', 1174, (-1380), 1915, true, 1174);
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("X`_f", 115);
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setStandardOffset(3342);
      dateTimeZoneBuilder0.addCutover(0, 'u', 0, 0, 999, false, (-1612));
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(3342, 'u', 1484, 0, 0, false, 0);
      assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setFixedSavings("UTC", (-469));
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)dateTimeZoneBuilder0.toDateTimeZone("UTC", false);
      assertTrue(fixedDateTimeZone0.isFixed());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)99;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) byteArrayInputStream0);
      long long0 = DateTimeZoneBuilder.readMillis(dataInputStream0);
      assertEquals((-29192355840000L), long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("X`_f", 1167);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover(1167, 'w', 1167, (-1380), 1924, true, 1167);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder2.writeTo("+00:09:21", (OutputStream) pipedOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1167 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone", (OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("Fixing duplicate name key - ", (DataOutput) dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(117);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) byteArrayOutputStream0);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo((String) null, (DataOutput) dataOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      FileSystemHandling.shouldAllThrowIOExceptions();
      MockFile mockFile0 = new MockFile("mU4lTX4VxjHY", "yU#4k1v_");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream((File) mockFile0);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) mockFileOutputStream0);
      try { 
        dateTimeZoneBuilder0.writeTo("'kOyo[FRZ P|zhI1u", (DataOutput) dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      MockFile mockFile0 = new MockFile("1.1v$");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream((File) mockFile0, false);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) mockFileOutputStream0);
      try { 
        DateTimeZoneBuilder.writeMillis(dataOutputStream0, 1807L);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readMillis((DataInput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) pipedInputStream0);
      try { 
        DateTimeZoneBuilder.readMillis(dataInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-261), 0);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) byteArrayInputStream0);
      try { 
        DateTimeZoneBuilder.readMillis(dataInputStream0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-2845), 2);
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) byteArrayInputStream0, "Asia/Gaza");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2845
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (int) (byte)0, (int) (byte) (-112));
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) byteArrayInputStream0, "BZTx8%y&VfRx?");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 8, (int) (byte)29);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) byteArrayInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, "%G*e;AC!nV!lk0l![-*");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addRecurringSavings("", 0, 0, 446, 'm', 0, 0, 0, false, (-1381));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: m
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.toDateTimeZone((String) null, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) byteArrayInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, ">A~H94Z'sS");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid encoding
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("\"*[sxR7,L%[_y.j", 0, 0, 0, 'w', 4, 4, 4, false, 4);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addRecurringSavings(")=Kb9 7?m7#", 'w', 0, 0, 'w', 4, 4, 4, false, 4);
      MockFile mockFile0 = new MockFile(")=Kb9 7?m7#");
      MockPrintStream mockPrintStream0 = new MockPrintStream((File) mockFile0);
      dateTimeZoneBuilder2.writeTo("\"*[sxR7,L%[_y.j", (OutputStream) mockPrintStream0);
      assertEquals(70L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      int int0 = cachedDateTimeZone0.getOffsetFromLocal(1807L);
      assertEquals(3600000, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight(3, 5, 4, (Chronology) null);
      assertEquals((-62061898161000L), dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      long long0 = cachedDateTimeZone0.previousTransition(846378000000L);
      assertEquals(846377999999L, long0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      long long0 = cachedDateTimeZone0.previousTransition((-9223372036854775808L));
      assertEquals((-9223372036854775808L), long0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      boolean boolean0 = cachedDateTimeZone0.isStandardOffset(1000L);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      boolean boolean0 = cachedDateTimeZone0.isStandardOffset((-9223372036854775808L));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      String string0 = cachedDateTimeZone0.getName(846378000000L, (Locale) null);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      MutableDateTime mutableDateTime0 = new MutableDateTime((DateTimeZone) cachedDateTimeZone0);
      int int0 = cachedDateTimeZone0.getOffset((ReadableInstant) mutableDateTime0);
      assertEquals(3600000, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight((Chronology) null);
      DateMidnight dateMidnight1 = dateMidnight0.minusMonths(2);
      assertEquals(1386975600000L, dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("", 0, 0, 0, 'w', 4, (-5), (-5), false, (-1381));
      dateTimeZoneBuilder1.addCutover((-5), 'w', (-1381), 4, 286, false, (-596));
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.toDateTimeZone("Buddhist", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1381 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.addRecurringSavings("\"*[sxR7,L%[_y.j", 2800, 2800, 2800, 'w', 4, (-5), (-5), false, (-1381));
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)dateTimeZoneBuilder0.toDateTimeZone("Buddhist", true);
      assertEquals("Buddhist", fixedDateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("\"*[sxR7,L%[_y.j", 0, 0, 0, 'w', 4, 4, 4, true, (-1381));
      MockFile mockFile0 = new MockFile(")=Kb9 7?m7#");
      MockPrintStream mockPrintStream0 = new MockPrintStream((File) mockFile0);
      dateTimeZoneBuilder1.writeTo("\"*[sxR7,L%[_y.j", (OutputStream) mockPrintStream0);
      assertEquals(20L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.addRecurringSavings("", 0, 0, 446, 'w', 4, (-5), (-5), true, (-1381));
      // Undeclared exception!
      dateTimeZoneBuilder0.toDateTimeZone("Buddhist", true);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.addRecurringSavings("\"*[sxR7,L%[_y.j", 0, 0, 0, 'w', 4, 0, 0, false, (-1381));
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.toDateTimeZone("Buddhist", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for dayOfMonth must be in the range [1,30]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("X`_f", 1174);
      dateTimeZoneBuilder1.addCutover(1174, 'w', 1174, 'w', 1922, true, 1174);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) pipedOutputStream0);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.writeTo("+02:00", (DataOutput) dataOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1174 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("4,55g>4gaDq OG*", 3342);
      dateTimeZoneBuilder0.addCutover(0, 'u', 0, 0, 999, false, (-1612));
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.toDateTimeZone("4,55g>4gaDq OG*", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-1281));
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover((-1281), 's', 912, 912, 912, true, (-1281));
      assertSame(dateTimeZoneBuilder2, dateTimeZoneBuilder0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      MockFile mockFile0 = new MockFile("dayOfYear");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream((File) mockFile0);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) mockFileOutputStream0);
      dateTimeZoneBuilder0.writeTo("dayOfYear", (OutputStream) dataOutputStream0);
      assertEquals(8L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo((String) null, (OutputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("+02:00", 85, 119, 115, 'X', 1915, (-2396), 85, true, 85);
      //  // Unstable assertion: assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setFixedSavings("UTC", 102);
      MockFile mockFile0 = new MockFile("mUlTX4FYY", "UTC");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream((File) mockFile0);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) mockFileOutputStream0);
      dateTimeZoneBuilder0.writeTo("UTC", (DataOutput) dataOutputStream0);
      assertEquals(16L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setFixedSavings("ZonedChronology[", 102);
      MockFile mockFile0 = new MockFile("mU4lTX4VxjHY", "yU#4k1v_");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream((File) mockFile0);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) mockFileOutputStream0);
      dateTimeZoneBuilder0.writeTo("UTC", (DataOutput) dataOutputStream0);
      assertEquals(29L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.addRecurringSavings(")=Kb9 7?m7#", 'w', 0, 0, 'w', 4, 4, 4, false, 4);
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(4);
      MockFile mockFile0 = new MockFile(")=Kb9 7?m7#");
      MockPrintStream mockPrintStream0 = new MockPrintStream((File) mockFile0);
      dateTimeZoneBuilder1.writeTo("\"*[sxR7,L%[_y.j", (OutputStream) mockPrintStream0);
      //  // Unstable assertion: assertEquals(73L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) dataInputStream0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      int int0 = cachedDateTimeZone0.getStandardOffset(1635642000000L);
      assertEquals(3600000, int0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      String string0 = cachedDateTimeZone0.getName(9223372036854775807L);
      assertEquals("+02:00", string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight((Chronology) null);
      DateMidnight dateMidnight1 = dateMidnight0.plusMonths(5);
      assertEquals(1405288800000L, dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      boolean boolean0 = cachedDateTimeZone0.isFixed();
      assertFalse(boolean0);
  }
}
