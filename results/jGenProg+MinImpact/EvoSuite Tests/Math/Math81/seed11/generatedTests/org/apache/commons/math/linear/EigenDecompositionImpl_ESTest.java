/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 14 20:13:29 GMT 2017
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.EigenDecompositionImpl;
import org.apache.commons.math.linear.RealMatrix;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EigenDecompositionImpl_ESTest extends EigenDecompositionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 4.214682760590534E7;
      doubleArray0[1] = 4.214682760590534E7;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 1.732050807568877);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 1.0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.732050807568877);
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getD();
      EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, 4.214682760590534E7);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 4.2146841542625174E7;
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.732050807568877);
      double double0 = eigenDecompositionImpl0.getRealEigenvalue(0);
      assertEquals(4.2146841542625174E7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[2] = (-1091.236023554473);
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 3.557153301561308);
      double double0 = eigenDecompositionImpl0.getRealEigenvalue(6);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
      assertEquals((-1091.236023554473), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 4.2146841542625174E7;
      doubleArray0[2] = (-1091.236023554473);
      doubleArray0[1] = 4.2146841542625174E7;
      double[] doubleArray1 = new double[6];
      doubleArray1[2] = 4.2146841542625174E7;
      doubleArray1[3] = (-1091.236023554473);
      doubleArray1[5] = 4.2146841542625174E7;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-10.67679418712645));
      double double0 = eigenDecompositionImpl0.getDeterminant();
      assertEquals(1.5836628116512144E44, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 4.2146841542625174E7;
      doubleArray0[1] = 4.2146841542625174E7;
      double[] doubleArray1 = new double[6];
      doubleArray1[2] = (-1091.236023554473);
      doubleArray1[3] = (-1091.236023554473);
      doubleArray1[5] = 4.2146841542625174E7;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-10.67679418712645));
      double double0 = eigenDecompositionImpl0.getDeterminant();
      assertEquals((-2.459986327595953E24), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 3.557153301561308);
      try { 
        eigenDecompositionImpl0.getImagEigenvalue((-3));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, (double[]) null, 1908.06117256202);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((RealMatrix) null, 2577.49361);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.732050807568877);
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getV();
      array2DRowRealMatrix0.data = null;
      EigenDecompositionImpl eigenDecompositionImpl1 = null;
      try {
        eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, 2.9802322387695312E-8);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 4.2146841542625174E7;
      doubleArray0[6] = 4.2146841542625174E7;
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (-1091.23602);
      doubleArray1[1] = 4.2146841542625174E7;
      doubleArray1[2] = 4.2146841542625174E7;
      doubleArray1[3] = 4.2146841542625174E7;
      doubleArray1[4] = (-1091.23602);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 3.557153301561308);
      ArrayRealVector arrayRealVector0 = (ArrayRealVector)eigenDecompositionImpl0.getEigenvector(4);
      assertEquals(2.790898201909244E55, eigenDecompositionImpl0.getDeterminant(), 0.01);
      assertEquals(15.572233208836462, arrayRealVector0.getLInfNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 4.2146841542625174E7;
      doubleArray0[1] = 4.2146841542625174E7;
      doubleArray0[4] = 4.2146841542625174E7;
      doubleArray0[5] = 4.2146841542625174E7;
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (-1091.236023554473);
      doubleArray1[1] = 4.2146841542625174E7;
      doubleArray1[2] = (-1091.236023554473);
      doubleArray1[3] = 4.2146841542625174E7;
      doubleArray1[4] = (-1091.236023554473);
      doubleArray1[5] = 4.2146841542625174E7;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-10.67679418712645));
      assertEquals((-3.822187250252886E53), eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 4.2146841542625174E7;
      doubleArray0[1] = 4.2146841542625174E7;
      doubleArray0[4] = 4.2146841542625174E7;
      doubleArray0[5] = 4.2146841542625174E7;
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (-1091.236023554473);
      doubleArray1[1] = 4.2146841542625174E7;
      doubleArray1[2] = 4.2146841542625174E7;
      doubleArray1[3] = 4.2146841542625174E7;
      doubleArray1[4] = (-1091.236023554473);
      doubleArray1[5] = 4.2146841542625174E7;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-10.67679418712645));
      assertEquals((-3.583813529298468E53), eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 4.2146841542625174E7;
      doubleArray0[4] = 4.2146841542625174E7;
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (-1091.236023554473);
      doubleArray1[1] = 4.2146841542625174E7;
      doubleArray1[2] = (-1091.236023554473);
      doubleArray1[3] = (-1091.236023554473);
      doubleArray1[4] = (-1091.236023554473);
      doubleArray1[5] = 4.2146841542625174E7;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 3.557153301561308);
      assertEquals((-1.5836628890574308E44), eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = 4.2146841542625174E7;
      doubleArray0[5] = 4.2146841542625174E7;
      double[] doubleArray1 = new double[6];
      doubleArray1[1] = 4.2146841542625174E7;
      doubleArray1[2] = (-1091.236023554473);
      doubleArray1[3] = 4.2146841542625174E7;
      doubleArray1[4] = 4.2146841542625174E7;
      doubleArray1[5] = 4.2146841542625174E7;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-10.67679418712645));
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 4.2146841542625174E7;
      doubleArray0[6] = 4.2146841542625174E7;
      doubleArray0[2] = (-1091.236023554473);
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (-1091.236023554473);
      doubleArray1[1] = 4.2146841542625174E7;
      doubleArray1[2] = (-1091.236023554473);
      doubleArray1[3] = (-1091.236023554473);
      doubleArray1[4] = (-1091.236023554473);
      doubleArray1[5] = 4.2146841542625174E7;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 3.55715330156131);
      assertEquals((-2.5624191934991107E44), eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 4.2146841542625174E7;
      doubleArray0[4] = 4.2146841542625174E7;
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 4.2146841542625174E7;
      doubleArray1[1] = 4.2146841542625174E7;
      doubleArray1[2] = (-1091.236023554473);
      doubleArray1[3] = 4.2146841542625174E7;
      doubleArray1[4] = 4.2146841542625174E7;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.732050807568877);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = 4.2146841542625174E7;
      doubleArray0[4] = 4.2146841542625174E7;
      double[] doubleArray1 = new double[6];
      doubleArray1[1] = 4.2146841542625174E7;
      doubleArray1[2] = (-1091.236023554473);
      doubleArray1[3] = 4.2146841542625174E7;
      doubleArray1[4] = 4.2146841542625174E7;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.732050807568877);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 4.2146841542625174E7;
      doubleArray0[1] = 4.2146841542625174E7;
      doubleArray0[4] = 4.2146841542625174E7;
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (-1091.236023554473);
      doubleArray1[1] = 4.2146841542625174E7;
      doubleArray1[2] = 4.2146841542625174E7;
      doubleArray1[3] = 4.2146841542625174E7;
      doubleArray1[4] = (-1091.236023554473);
      doubleArray1[5] = 4.2146841542625174E7;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-10.67679418712645));
      assertEquals((-1.5836616342096641E44), eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[2] = 4.2146841542625174E7;
      doubleArray0[4] = 4.2146841542625174E7;
      doubleArray0[5] = 4.2146841542625174E7;
      double[] doubleArray1 = new double[6];
      doubleArray1[2] = (-1091.236023554473);
      doubleArray1[3] = 4.2146841542625174E7;
      doubleArray1[4] = 4.2146841542625174E7;
      doubleArray1[5] = 4.2146841542625174E7;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-10.67679418712645));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 4.2146841542625174E7;
      doubleArray0[1] = 4.2146841542625174E7;
      doubleArray0[5] = 4.2146841542625174E7;
      double[] doubleArray1 = new double[6];
      doubleArray1[1] = 4.2146841542625174E7;
      doubleArray1[2] = 4.2146841542625174E7;
      doubleArray1[3] = (-1091.236023554473);
      doubleArray1[4] = (-1091.236023554473);
      doubleArray1[5] = 4.2146841542625174E7;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-10.67679418712645));
      assertEquals(6.1007916164024745E54, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = 4.214682760590534E7;
      doubleArray0[3] = 4.214682760590534E7;
      double[] doubleArray1 = new double[6];
      doubleArray1[1] = 4.214682760590534E7;
      doubleArray1[2] = (-1091.236023554473);
      doubleArray1[3] = 4.214682760590534E7;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.732050807568877);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 4.470348358154297E-8;
      doubleArray0[1] = 4.470348358154297E-8;
      doubleArray0[2] = (-1091.236023554473);
      doubleArray0[4] = 4.470348358154297E-8;
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (-1091.236023554473);
      doubleArray1[1] = 4.470348358154297E-8;
      doubleArray1[2] = 4.470348358154297E-8;
      doubleArray1[3] = 4.470348358154297E-8;
      doubleArray1[4] = (-1091.236023554473);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-10.67679418712645));
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 4.2146841542625174E7;
      doubleArray0[1] = 4.2146841542625174E7;
      doubleArray0[2] = (-1091.236023554473);
      doubleArray0[5] = 4.2146841542625174E7;
      double[] doubleArray1 = new double[6];
      doubleArray1[2] = (-1091.236023554473);
      doubleArray1[3] = (-1091.236023554473);
      doubleArray1[4] = (-1091.236023554473);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-10.67679418712645));
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      doubleArray1[2] = (-1091.236023554473);
      doubleArray1[3] = 4.2146841542625174E7;
      doubleArray1[4] = 4.2146841542625174E7;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.732050807568877);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[6] = 4.2146841542625174E7;
      doubleArray0[4] = 4.2146841542625174E7;
      doubleArray0[5] = 4.2146841542625174E7;
      double[] doubleArray1 = new double[6];
      doubleArray1[3] = 4.2146841542625174E7;
      doubleArray1[5] = 4.2146841542625174E7;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2820.9767103));
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[4] = 4.214682760590534E7;
      doubleArray0[6] = 4.214682760590534E7;
      double[] doubleArray1 = new double[6];
      doubleArray1[4] = (-1091.236023554473);
      doubleArray1[5] = (-1091.236023554473);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.732050807568877);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // cannot solve degree 3 equation
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-10.67679418712645));
      eigenDecompositionImpl0.getV();
      eigenDecompositionImpl0.getSolver();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-10.67679418712645));
      double double0 = eigenDecompositionImpl0.getDeterminant();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      double[] doubleArray1 = new double[3];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.0E-8);
      try { 
        eigenDecompositionImpl0.getEigenvector(742);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 742
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-10.67679418712645));
      eigenDecompositionImpl0.getSolver();
      try { 
        eigenDecompositionImpl0.getEigenvector(1361);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1361
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-10.67679418712645));
      eigenDecompositionImpl0.getV();
      eigenDecompositionImpl0.getVT();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-10.67679418712645));
      eigenDecompositionImpl0.getVT();
      eigenDecompositionImpl0.getVT();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-10.67679418712645));
      eigenDecompositionImpl0.getD();
      eigenDecompositionImpl0.getD();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.732050807568877);
      eigenDecompositionImpl0.getSolver();
      eigenDecompositionImpl0.getV();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.732050807568877);
      eigenDecompositionImpl0.getV();
      eigenDecompositionImpl0.getV();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.732050807568877);
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getV();
      EigenDecompositionImpl eigenDecompositionImpl1 = null;
      try {
        eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, 2.9802322387695312E-8);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 4.2146841542625174E7;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.732050807568877);
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getV();
      EigenDecompositionImpl eigenDecompositionImpl1 = null;
      try {
        eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, 2.9802322387695312E-8);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // eigen decomposition of assymetric matrices not supported yet
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 3.557153301561308);
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray2, 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-10.67679418712645));
      try { 
        eigenDecompositionImpl0.getRealEigenvalue((-967));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -967
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.732050807568877);
      eigenDecompositionImpl0.getImagEigenvalue(0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-10.67679418712645));
      eigenDecompositionImpl0.getImagEigenvalues();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }
}
