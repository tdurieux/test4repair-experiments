/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 21 18:06:14 GMT 2017
 */

package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.FDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FDistributionImpl_ESTest extends FDistributionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(678.24532, 678.24532);
      // Undeclared exception!
      try { 
        fDistributionImpl0.setNumeratorDegreesOfFreedom(0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom must be positive.
         //
         verifyException("org.apache.commons.math.distribution.FDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(Double.NaN, Double.NaN);
      double double0 = fDistributionImpl0.inverseCumulativeProbability(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(18.694723849558724, 18.694723849558724);
      double double0 = fDistributionImpl0.cumulativeProbability((-126.26), 18.694723849558724);
      assertEquals(0.9999999791915231, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1102.627, 1102.627);
      double double0 = fDistributionImpl0.getInitialDomain(1102.627);
      assertEquals(1.001817146044936, double0, 0.01);
      assertEquals(1102.627, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(3.399464998481189E-5, 3.399464998481189E-5);
      double double0 = fDistributionImpl0.getInitialDomain(0.0);
      assertEquals((-1.6997613906373606E-5), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1876.914740929748, 1876.914740929748);
      double double0 = fDistributionImpl0.getDomainUpperBound(1876.914740929748);
      assertEquals(1876.914740929748, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals(1876.914740929748, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(379.5259258406301, 379.5259258406301);
      double double0 = fDistributionImpl0.getDomainLowerBound(Double.POSITIVE_INFINITY);
      assertEquals(379.5259258406301, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(379.5259258406301, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(4492.5280067, 1.0E-14);
      double double0 = fDistributionImpl0.cumulativeProbability(1.0E-14);
      assertEquals((-5.990763440877345E-13), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(2852.75175345873, 2852.75175345873);
      // Undeclared exception!
      try { 
        fDistributionImpl0.inverseCumulativeProbability(2852.75175345873);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // p must be between 0.0 and 1.0, inclusive.
         //
         verifyException("org.apache.commons.math.distribution.AbstractContinuousDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(2573.9691902, 2573.9691902);
      fDistributionImpl0.setDenominatorDegreesOfFreedom(2573.9691902);
      assertEquals(2573.9691902, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals(2573.9691902, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(379.5259258406301, 379.5259258406301);
      // Undeclared exception!
      try { 
        fDistributionImpl0.setDenominatorDegreesOfFreedom(0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom must be positive.
         //
         verifyException("org.apache.commons.math.distribution.FDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(379.5259258406301, 379.5259258406301);
      double double0 = fDistributionImpl0.cumulativeProbability(0.0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(379.5259258406301, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
      assertEquals(379.5259258406301, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0E-15, 1.0E-15);
      double double0 = fDistributionImpl0.getDenominatorDegreesOfFreedom();
      assertEquals(1.0E-15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0E-15, 1.0E-15);
      double double0 = fDistributionImpl0.getNumeratorDegreesOfFreedom();
      assertEquals(1.0E-15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = null;
      try {
        fDistributionImpl0 = new FDistributionImpl(1.580887032249125E-4, (-1495.0577103039782));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom must be positive.
         //
         verifyException("org.apache.commons.math.distribution.FDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(3.399464998481189E-5, 3.399464998481189E-5);
      // Undeclared exception!
      try { 
        fDistributionImpl0.setNumeratorDegreesOfFreedom((-1.6997613906373606E-5));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom must be positive.
         //
         verifyException("org.apache.commons.math.distribution.FDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(379.5259258406301, 379.5259258406301);
      double double0 = fDistributionImpl0.inverseCumulativeProbability(1.0);
      assertEquals(379.5259258406301, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
      assertEquals(379.5259258406301, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(678.24532, 678.24532);
      double double0 = fDistributionImpl0.inverseCumulativeProbability(0.0);
      assertEquals(678.24532, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals(678.24532, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(379.4285, 379.4285);
      fDistributionImpl0.setNumeratorDegreesOfFreedom(1.0E-8);
      // Undeclared exception!
      fDistributionImpl0.inverseCumulativeProbability(0.9999999369970185);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(379.4285, 379.4285);
      double double0 = fDistributionImpl0.cumulativeProbability(379.4285);
      assertEquals(1.0, double0, 0.01);
  }
}
