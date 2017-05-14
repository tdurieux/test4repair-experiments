/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 10 21:22:28 GMT 2017
 */

package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.math3.distribution.DiscreteDistribution;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.TestRandomGenerator;
import org.apache.commons.math3.random.Well19937a;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.random.Well44497a;
import org.apache.commons.math3.random.Well512a;
import org.apache.commons.math3.util.Pair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DiscreteDistribution_ESTest extends DiscreteDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<Pair<Float, Double>> linkedList0 = new LinkedList<Pair<Float, Double>>();
      Float float0 = new Float((double) 3596);
      Double double0 = new Double((double) 3596);
      Pair<Float, Double> pair0 = new Pair<Float, Double>(float0, double0);
      linkedList0.offerLast(pair0);
      DiscreteDistribution<Float> discreteDistribution0 = new DiscreteDistribution<Float>((List<Pair<Float, Double>>) linkedList0);
      try { 
        discreteDistribution0.sample((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-1)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Well19937a well19937a0 = new Well19937a();
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Double double0 = new Double((double) 427);
      Pair<Object, Double> pair0 = new Pair<Object, Double>((Object) null, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((RandomGenerator) well19937a0, (List<Pair<Object, Double>>) linkedList0);
      discreteDistribution0.reseedRandomGenerator(2000L);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Well19937a well19937a0 = new Well19937a();
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Double double0 = new Double((double) 427);
      Pair<Object, Double> pair0 = new Pair<Object, Double>((Object) null, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((RandomGenerator) well19937a0, (List<Pair<Object, Double>>) linkedList0);
      Object object0 = discreteDistribution0.sample();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<Pair<Float, Double>> linkedList0 = new LinkedList<Pair<Float, Double>>();
      Float float0 = new Float((double) 3596);
      Double double0 = new Double((double) 3596);
      Pair<Float, Double> pair0 = new Pair<Float, Double>(float0, double0);
      linkedList0.add(pair0);
      linkedList0.push(pair0);
      DiscreteDistribution<Float> discreteDistribution0 = new DiscreteDistribution<Float>((List<Pair<Float, Double>>) linkedList0);
      discreteDistribution0.sample(3596);
      // Undeclared exception!
      discreteDistribution0.sample(3596);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<Pair<Double, Double>> linkedList0 = new LinkedList<Pair<Double, Double>>();
      Double double0 = new Double(4379.75770072);
      Pair<Double, Double> pair0 = new Pair<Double, Double>(double0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Double> discreteDistribution0 = new DiscreteDistribution<Double>((RandomGenerator) null, (List<Pair<Double, Double>>) linkedList0);
      // Undeclared exception!
      try { 
        discreteDistribution0.sample(147);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Byte byte0 = Byte.valueOf((byte)0);
      Double double0 = Double.valueOf(2.0829952491625585E-8);
      Pair<Byte, Double> pair0 = new Pair<Byte, Double>(byte0, double0);
      Pair<Object, Double> pair1 = new Pair<Object, Double>(pair0);
      linkedList0.add(pair1);
      Integer integer0 = new Integer(427);
      Pair<Object, Double> pair2 = new Pair<Object, Double>((Object) integer0, double0);
      linkedList0.add(pair2);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((List<Pair<Object, Double>>) linkedList0);
      // Undeclared exception!
      try { 
        discreteDistribution0.sample(427);
        fail("Expecting exception: ArrayStoreException");
      
      } catch(ArrayStoreException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<Pair<Float, Double>> linkedList0 = new LinkedList<Pair<Float, Double>>();
      Float float0 = new Float(1187.0F);
      Double double0 = new Double((double) 1187.0F);
      Pair<Float, Double> pair0 = new Pair<Float, Double>(float0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Float> discreteDistribution0 = new DiscreteDistribution<Float>((RandomGenerator) null, (List<Pair<Float, Double>>) linkedList0);
      // Undeclared exception!
      try { 
        discreteDistribution0.sample();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TestRandomGenerator testRandomGenerator0 = new TestRandomGenerator();
      LinkedList<Pair<Integer, Double>> linkedList0 = new LinkedList<Pair<Integer, Double>>();
      DiscreteDistribution<Integer> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<Integer>((RandomGenerator) testRandomGenerator0, (List<Pair<Integer, Double>>) linkedList0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // array sums to zero
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Well44497a well44497a0 = new Well44497a((-647));
      DiscreteDistribution<String> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<String>((RandomGenerator) well44497a0, (List<Pair<String, Double>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DiscreteDistribution<Byte> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<Byte>((List<Pair<Byte, Double>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c();
      LinkedList<Pair<Byte, Double>> linkedList0 = new LinkedList<Pair<Byte, Double>>();
      Byte byte0 = Byte.valueOf((byte)0);
      Double double0 = new Double((-331.7868618142183));
      Pair<Byte, Double> pair0 = new Pair<Byte, Double>(byte0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Byte> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<Byte>((RandomGenerator) well19937c0, (List<Pair<Byte, Double>>) linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -331.787 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Double double0 = new Double(6250.0);
      Well512a well512a0 = new Well512a();
      LinkedList<Pair<Byte, Double>> linkedList0 = new LinkedList<Pair<Byte, Double>>();
      Byte byte0 = new Byte((byte)0);
      Pair<Byte, Double> pair0 = new Pair<Byte, Double>(byte0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Byte> discreteDistribution0 = new DiscreteDistribution<Byte>((RandomGenerator) well512a0, (List<Pair<Byte, Double>>) linkedList0);
      try { 
        discreteDistribution0.sample((int) (byte)0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (0)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<Pair<String, Double>> linkedList0 = new LinkedList<Pair<String, Double>>();
      Double double0 = new Double(194.911755);
      Pair<String, Double> pair0 = new Pair<String, Double>("", double0);
      linkedList0.add(pair0);
      linkedList0.add(pair0);
      DiscreteDistribution<String> discreteDistribution0 = new DiscreteDistribution<String>((List<Pair<String, Double>>) linkedList0);
      String string0 = discreteDistribution0.sample();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Well19937a well19937a0 = new Well19937a();
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Integer integer0 = new Integer(427);
      Double double0 = new Double((double) 427);
      Pair<Object, Double> pair0 = new Pair<Object, Double>((Object) integer0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((RandomGenerator) well19937a0, (List<Pair<Object, Double>>) linkedList0);
      List<Pair<Object, Double>> list0 = discreteDistribution0.getSamples();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<Pair<String, Double>> linkedList0 = new LinkedList<Pair<String, Double>>();
      Double double0 = new Double(194.911755);
      Pair<String, Double> pair0 = new Pair<String, Double>("", double0);
      linkedList0.add(pair0);
      DiscreteDistribution<String> discreteDistribution0 = new DiscreteDistribution<String>((List<Pair<String, Double>>) linkedList0);
      double double1 = discreteDistribution0.probability("SCALE");
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<Pair<Double, Double>> linkedList0 = new LinkedList<Pair<Double, Double>>();
      Double double0 = new Double(4379.75770072);
      Pair<Double, Double> pair0 = new Pair<Double, Double>(double0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Double> discreteDistribution0 = new DiscreteDistribution<Double>((RandomGenerator) null, (List<Pair<Double, Double>>) linkedList0);
      double double1 = discreteDistribution0.probability((Double) null);
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedList<Pair<String, Double>> linkedList0 = new LinkedList<Pair<String, Double>>();
      Double double0 = new Double(194.911755);
      Pair<String, Double> pair0 = new Pair<String, Double>("", double0);
      linkedList0.add(pair0);
      DiscreteDistribution<String> discreteDistribution0 = new DiscreteDistribution<String>((List<Pair<String, Double>>) linkedList0);
      double double1 = discreteDistribution0.probability("");
      assertEquals(1.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedList<Pair<Double, Double>> linkedList0 = new LinkedList<Pair<Double, Double>>();
      Double double0 = new Double(4379.75770072);
      Pair<Double, Double> pair0 = new Pair<Double, Double>((Double) null, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Double> discreteDistribution0 = new DiscreteDistribution<Double>((RandomGenerator) null, (List<Pair<Double, Double>>) linkedList0);
      double double1 = discreteDistribution0.probability((Double) null);
      assertEquals(1.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedList<Pair<Double, Double>> linkedList0 = new LinkedList<Pair<Double, Double>>();
      LinkedList<Pair<Object, Double>> linkedList1 = new LinkedList<Pair<Object, Double>>();
      Double double0 = new Double((-1.0));
      Pair<Object, Double> pair0 = new Pair<Object, Double>((Object) linkedList0, double0);
      linkedList1.add(pair0);
      DiscreteDistribution<Object> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<Object>((List<Pair<Object, Double>>) linkedList1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedList<Pair<Double, Double>> linkedList0 = new LinkedList<Pair<Double, Double>>();
      Double double0 = new Double(4379.75770072);
      Pair<Double, Double> pair0 = new Pair<Double, Double>(double0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Double> discreteDistribution0 = new DiscreteDistribution<Double>((RandomGenerator) null, (List<Pair<Double, Double>>) linkedList0);
      // Undeclared exception!
      try { 
        discreteDistribution0.reseedRandomGenerator((-636L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedList<Pair<String, Double>> linkedList0 = new LinkedList<Pair<String, Double>>();
      DiscreteDistribution<String> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<String>((List<Pair<String, Double>>) linkedList0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // array sums to zero
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }
}
