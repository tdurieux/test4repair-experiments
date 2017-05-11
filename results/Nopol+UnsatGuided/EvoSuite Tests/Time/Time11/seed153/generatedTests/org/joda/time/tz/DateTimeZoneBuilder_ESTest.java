/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 26 03:24:17 GMT 2017
 */

package org.joda.time.tz;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.joda.time.DateTimeZone;
import org.joda.time.tz.CachedDateTimeZone;
import org.joda.time.tz.DateTimeZoneBuilder;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateTimeZoneBuilder_ESTest extends DateTimeZoneBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("fze15zzO!>:)^S", 101);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.setStandardOffset(119);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)dateTimeZoneBuilder2.toDateTimeZone("=V#6pF?>XZE+RcY", false);
      assertEquals("=V#6pF?>XZE+RcY", fixedDateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("Unknwn md: ", (-1096));
      dateTimeZoneBuilder0.addRecurringSavings("Unknwn md: ", (-678), (-1096), 'w', 'w', 'w', 'w', 'w', false, (-678));
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.toDateTimeZone("Unknwn md: ", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 119 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((byte)111);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover((byte)111, 'u', (byte)111, (byte)76, (byte) (-70), false, (byte)76);
      DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder2.setFixedSavings("org.joda.time.tz.DateTimeZoneBuilder$RuleSet", (byte)111);
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder3);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addRecurringSavings("", 24, 15, 15, 'q', 58, 76, 58, true, 2529);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: q
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-333));
      dateTimeZoneBuilder1.addCutover((byte)111, 'u', (byte)111, (-333), (byte)76, false, (byte)76);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.addCutover(85, 'u', (-2822), (byte)76, 1959, false, (-2653));
      assertSame(dateTimeZoneBuilder2, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream(" - ");
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) mockPrintStream0);
      DateTimeZoneBuilder.writeMillis(dataOutputStream0, (byte) (-94));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("org.joda.time.tz.DateTimeZoneBuilder$DSTZone", (OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo((String) null, (OutputStream) byteArrayOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      pipedOutputStream0.close();
      try { 
        dateTimeZoneBuilder0.writeTo("%0|<~kE)tRv", (OutputStream) pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe closed
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("", (DataOutput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.writeMillis((DataOutput) null, 63158400000L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream((InputStream) mockFileInputStream0, (InputStream) mockFileInputStream0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) sequenceInputStream0, 10);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) pushbackInputStream0);
      try { 
        DateTimeZoneBuilder.readMillis(dataInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-3854), (int) (byte) (-27));
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
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) null, "~{N(~");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.forTimeZone((TimeZone) null);
      long long0 = cachedDateTimeZone0.previousTransition(35088L);
      assertEquals((-766623600001L), long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.forID((String) null);
      long long0 = cachedDateTimeZone0.previousTransition((-9223372036854775808L));
      assertEquals((-9223372036854775808L), long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("Unknown mode: ", (-1091));
      dateTimeZoneBuilder1.addCutover((-1091), 'w', (-678), (-678), 2154, false, (-678));
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.toDateTimeZone("Unknown mode: ", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -678 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(88);
      FilterOutputStream filterOutputStream0 = new FilterOutputStream((OutputStream) byteArrayOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) filterOutputStream0);
      dateTimeZoneBuilder0.writeTo("aO", (OutputStream) dataOutputStream0);
      assertEquals("F\u0000\u0003UTC\u0000\u0000", byteArrayOutputStream0.toString());
      assertEquals(8, byteArrayOutputStream0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo((String) null, (DataOutput) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("/:4SE(];'*L[Jg", 7, (-3599), (-292269054), '2', 366, 71, 3183, true, 91);
      assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      MockPrintStream mockPrintStream0 = new MockPrintStream("UTC");
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) mockPrintStream0);
      dateTimeZoneBuilder0.writeTo("UTC", (DataOutput) dataOutputStream0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("Xt:Q,[itS.`");
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) mockPrintStream0);
      DateTimeZoneBuilder.writeMillis(dataOutputStream0, (-9223371990946800000L));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) pipedOutputStream0, 87);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) bufferedOutputStream0);
      DateTimeZoneBuilder.writeMillis(objectOutputStream0, 62035200000L);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setFixedSavings("e", 1689);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      dateTimeZoneBuilder0.writeTo("%0|<~kE)tRv", (OutputStream) pipedOutputStream0);
      assertEquals(14, pipedInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) byteArrayInputStream0, "v[I`X`]rcIv|");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid encoding
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[6] = (byte)80;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (int) (byte)5, (int) (byte)8);
      byteArrayInputStream0.read();
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) byteArrayInputStream0, (String) null);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      dateTimeZoneBuilder0.writeTo("%0|<~kE)tRv", (OutputStream) pipedOutputStream0);
      assertEquals(8, pipedInputStream0.available());
      
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZoneBuilder.readFrom((InputStream) pipedInputStream0, "%0|<~kE)tRv");
      assertEquals("%0|<~kE)tRv", fixedDateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) pipedInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) dataInputStream0, "p3>h/8*n0z]");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("rK'~c3->F", (-2029), (-2302), 0, 'u', (-1), 1064, 58, false, 58);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.writeTo("l1NR", (OutputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }
}