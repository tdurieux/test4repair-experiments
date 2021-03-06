/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 21 09:42:00 GMT 2017
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.DecompositionSolver;
import org.apache.commons.math.linear.EigenDecompositionImpl;
import org.apache.commons.math.linear.RealMatrix;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EigenDecompositionImpl_ESTest extends EigenDecompositionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = (-8.675921967900518);
      doubleArray0[2] = (-8.675921967900518);
      double[] doubleArray1 = new double[2];
      doubleArray1[1] = (-8.675921967900518);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-8.675921967900518));
      eigenDecompositionImpl0.getSolver();
      assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = (double) (-2142071306);
      doubleArray0[2] = (double) (-7);
      doubleArray0[4] = (double) (-7);
      doubleArray0[5] = (double) (-2142071306);
      doubleArray0[7] = (double) (-2142071306);
      doubleArray0[8] = (double) (-2142071306);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (double) (-2142071306);
      doubleArray1[2] = (double) (-7);
      doubleArray1[3] = 0.9999999999999998;
      doubleArray1[5] = (double) (-2142071306);
      doubleArray1[6] = 7.255501635616751;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4391.3));
      assertEquals((-4.9738019365726396E82), eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = (-640.378);
      doubleArray0[2] = (-640.378);
      double[] doubleArray1 = new double[2];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-640.378));
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-640.37799);
      doubleArray0[1] = 0.6931471805599453;
      double[] doubleArray1 = new double[2];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.6931471805599453);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 0.0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[2];
      doubleArray1[1] = (-15.816822272422014);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-15.816822272422014));
      double double0 = eigenDecompositionImpl0.getRealEigenvalue(0);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
      assertEquals(15.816822272422014, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-640.37799);
      double[] doubleArray1 = new double[2];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-15.816822272422014));
      double double0 = eigenDecompositionImpl0.getRealEigenvalue(2);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
      assertEquals((-640.37799), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[2];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.6931471805599453);
      ArrayRealVector arrayRealVector0 = (ArrayRealVector)eigenDecompositionImpl0.getEigenvector(0);
      assertEquals(Double.NaN, arrayRealVector0.getL1Norm(), 0.01);
      assertEquals(3, arrayRealVector0.getDimension());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[7] = (double) (-2142071306);
      doubleArray0[8] = (double) (-7);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (double) (-2142071306);
      doubleArray1[1] = (-33.61440651763629);
      doubleArray1[3] = 0.9999999999999998;
      doubleArray1[5] = (double) (-2142071306);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4391.3));
      double double0 = eigenDecompositionImpl0.getDeterminant();
      assertEquals(1.4344091971408367E41, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[4] = (double) (-7);
      doubleArray0[5] = (double) (-2142071306);
      doubleArray0[6] = (-33.61440651763629);
      doubleArray0[7] = (double) (-2142071306);
      doubleArray0[8] = (double) (-2142071306);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (double) (-2142071306);
      doubleArray1[2] = (double) (-7);
      doubleArray1[3] = 0.9999999999999998;
      doubleArray1[5] = (double) (-2142071306);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4391.3));
      double double0 = eigenDecompositionImpl0.getDeterminant();
      assertEquals((-8.561839437794184E82), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[2];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.6931471805599453);
      try { 
        eigenDecompositionImpl0.getRealEigenvalue(1516291309);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1516291309
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[8];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4391.3));
      try { 
        eigenDecompositionImpl0.getImagEigenvalue(2117794767);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2117794767
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((double[]) null, (double[]) null, 1140.853376);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((RealMatrix) null, 0.5235987755982989);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[4] = (double) (-7);
      double[] doubleArray1 = new double[8];
      doubleArray1[3] = 0.9999999999999998;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4391.3));
      eigenDecompositionImpl0.getVT();
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = (double) (-2142071306);
      doubleArray0[4] = (double) (-2142071306);
      doubleArray0[5] = (double) (-2142071306);
      doubleArray0[7] = (double) (-2142071306);
      double[] doubleArray1 = new double[8];
      doubleArray1[1] = (-33.61440651763629);
      doubleArray1[2] = (double) (-7);
      doubleArray1[3] = 0.9999999999999998;
      doubleArray1[4] = 12.566370614359172;
      doubleArray1[5] = (double) (-2142071306);
      doubleArray1[6] = 7.255501635616751;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4391.3));
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = (double) (-7);
      doubleArray0[2] = (double) (-7);
      doubleArray0[4] = (double) (-7);
      doubleArray0[5] = (double) (-7);
      doubleArray0[6] = (-33.61440651763629);
      doubleArray0[8] = (double) (-7);
      double[] doubleArray1 = new double[8];
      doubleArray1[1] = (-33.61440651763629);
      doubleArray1[2] = (double) (-7);
      doubleArray1[3] = 0.9999999999999998;
      doubleArray1[4] = 12.566370614359172;
      doubleArray1[5] = (double) (-7);
      doubleArray1[6] = 7.255501635616751;
      doubleArray1[7] = (-33.61440651763629);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4391.3));
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[4] = (double) (-7);
      doubleArray0[5] = (double) (-7);
      doubleArray0[6] = (-33.61440651763629);
      doubleArray0[7] = (double) (-2142071306);
      doubleArray0[8] = (double) (-2142071306);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (double) (-2142071306);
      doubleArray1[1] = (-33.61440651763629);
      doubleArray1[2] = (double) (-7);
      doubleArray1[3] = 0.9999999999999998;
      doubleArray1[5] = (double) (-2142071306);
      doubleArray1[6] = (-2.142071306E9);
      doubleArray1[7] = (-33.61440651763629);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4391.3));
      assertEquals((-3.3045827209256413E84), eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[2] = (double) (-7);
      doubleArray0[4] = (double) (-7);
      doubleArray0[5] = (double) (-7);
      doubleArray0[7] = (double) (-7);
      doubleArray0[8] = (double) (-7);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (double) (-7);
      doubleArray1[1] = (-33.61440651763629);
      doubleArray1[2] = (double) (-7);
      doubleArray1[3] = 0.9999999999999998;
      doubleArray1[4] = 17.464080512131524;
      doubleArray1[5] = (double) (-7);
      doubleArray1[6] = (-7.0);
      doubleArray1[7] = (-33.61440651763629);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4391.3));
      assertEquals((-1.1183567311567562E9), eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = (double) (-2142071306);
      doubleArray0[4] = (double) (-7);
      doubleArray0[5] = (double) (-7);
      doubleArray0[6] = (-33.61440651763629);
      doubleArray0[7] = (double) (-2142071306);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (double) (-2142071306);
      doubleArray1[1] = (-33.61440651763629);
      doubleArray1[2] = (double) (-7);
      doubleArray1[3] = 0.9999999999999998;
      doubleArray1[5] = (double) (-2142071306);
      doubleArray1[6] = (-2.142071306E9);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4391.3));
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[5] = (double) (-7);
      doubleArray0[8] = (double) (-7);
      double[] doubleArray1 = new double[8];
      doubleArray1[1] = (-33.61440651763629);
      doubleArray1[2] = (double) (-7);
      doubleArray1[3] = 0.9999999999999998;
      doubleArray1[4] = 17.464080512131524;
      doubleArray1[5] = (double) (-7);
      doubleArray1[6] = (-7.0);
      doubleArray1[7] = (-33.61440651763629);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4391.3));
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[3] = (double) (-7);
      doubleArray0[4] = (double) (-7);
      double[] doubleArray1 = new double[8];
      doubleArray1[2] = (double) (-7);
      doubleArray1[3] = 0.9999999999999998;
      doubleArray1[4] = 12.566370614359172;
      doubleArray1[5] = (double) (-7);
      doubleArray1[6] = 7.255501635616751;
      doubleArray1[7] = 6.176170685989746E-13;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4391.3));
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = (double) (-2142071306);
      doubleArray0[2] = (double) (-7);
      doubleArray0[3] = (double) (-2142071306);
      doubleArray0[5] = (double) (-2142071306);
      doubleArray0[6] = (-33.61440651763629);
      doubleArray0[4] = (double) (-2142071306);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (double) (-2142071306);
      doubleArray1[2] = (double) (-2142071306);
      doubleArray1[3] = 0.9999999999999998;
      doubleArray1[4] = 12.566370614359172;
      doubleArray1[5] = (double) (-2142071306);
      doubleArray1[6] = 12.566370614359172;
      doubleArray1[7] = (-33.61440651763629);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4391.3));
      assertEquals((-2.338236050276672E68), eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = (double) (-2142071306);
      doubleArray0[5] = (double) (-2142071306);
      doubleArray0[6] = (-33.61440651763629);
      doubleArray0[7] = (double) (-2142071306);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (double) (-2142071306);
      doubleArray1[1] = (-33.61440651763629);
      doubleArray1[2] = (double) (-2142071306);
      doubleArray1[3] = 0.9999999999999998;
      doubleArray1[4] = 12.566370614359172;
      doubleArray1[5] = (double) (-2142071306);
      doubleArray1[6] = 7.255501635616751;
      doubleArray1[7] = (-33.61440651763629);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4391.3));
      assertEquals((-2.823117092369389E53), eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = (double) (-2142071351);
      doubleArray0[2] = (double) (-7);
      doubleArray0[3] = (double) (-2142071351);
      doubleArray0[5] = (double) (-2142071351);
      doubleArray0[6] = (-33.61440651763629);
      doubleArray0[7] = (double) (-2142071351);
      doubleArray0[4] = (double) (-2142071351);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (double) (-2142071351);
      doubleArray1[1] = (-33.61440651763629);
      doubleArray1[2] = (double) (-2142071351);
      doubleArray1[3] = 0.9999999999999998;
      doubleArray1[4] = 12.566370614359172;
      doubleArray1[5] = (double) (-2142071351);
      doubleArray1[6] = 0.9999999999999998;
      doubleArray1[7] = (-33.61440651763629);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4391.3));
      assertEquals((-3.170536843432722E68), eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = (double) (-2142071306);
      doubleArray0[4] = (double) (-7);
      doubleArray0[5] = (double) (-2142071306);
      doubleArray0[6] = (-33.61440651763629);
      doubleArray0[7] = (double) (-2142071306);
      doubleArray0[8] = (double) (-2142071306);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (double) (-2142071306);
      doubleArray1[1] = (-33.61440651763629);
      doubleArray1[2] = (double) (-7);
      doubleArray1[3] = 0.9999999999999998;
      doubleArray1[6] = (-2.142071306E9);
      doubleArray1[7] = (-33.61440651763629);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4391.3));
      assertEquals((-1.098675714608355E83), eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[4] = (double) (-7);
      doubleArray0[5] = (double) (-7);
      doubleArray0[7] = (double) (-2142071306);
      doubleArray0[8] = (double) (-2142071306);
      double[] doubleArray1 = new double[8];
      doubleArray1[1] = (-33.61440651763629);
      doubleArray1[2] = (double) (-7);
      doubleArray1[3] = 0.9999999999999998;
      doubleArray1[5] = (double) (-2142071306);
      doubleArray1[6] = (-2.142071306E9);
      doubleArray1[7] = (-33.61440651763629);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4391.3));
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = (double) (-2142071306);
      doubleArray0[3] = (double) (-2142071306);
      doubleArray0[5] = (double) (-2142071306);
      doubleArray0[4] = (double) (-2142071306);
      double[] doubleArray1 = new double[8];
      doubleArray1[1] = (-33.61440651763629);
      doubleArray1[2] = (double) (-7);
      doubleArray1[3] = 0.9999999999999998;
      doubleArray1[4] = 12.566370614359172;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4425.028369572873));
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[4] = (double) (-7);
      doubleArray0[5] = (double) (-7);
      double[] doubleArray1 = new double[8];
      doubleArray1[3] = 0.9999999999999998;
      doubleArray1[4] = 0.3749305845639874;
      doubleArray1[5] = (double) (-7);
      doubleArray1[6] = (-7.0);
      doubleArray1[7] = (-33.61440651763629);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4391.3));
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[4] = (double) (-7);
      doubleArray0[6] = (-33.61440651763629);
      doubleArray0[7] = (double) (-2142071306);
      double[] doubleArray1 = new double[8];
      doubleArray1[2] = (double) (-7);
      doubleArray1[3] = 0.9999999999999998;
      doubleArray1[4] = 12.566370614359172;
      doubleArray1[5] = (double) (-2142071306);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4391.3));
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[3] = (double) (-2142071306);
      doubleArray0[4] = (double) (-7);
      doubleArray0[5] = (double) (-2142071306);
      doubleArray0[6] = (-33.61440651763629);
      doubleArray0[7] = (double) (-2142071306);
      double[] doubleArray1 = new double[8];
      doubleArray1[1] = (-33.61440651763629);
      doubleArray1[2] = (double) (-7);
      doubleArray1[6] = (-2.142071306E9);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4391.3));
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) (-2142071306);
      doubleArray0[1] = (double) (-2142071306);
      doubleArray0[2] = (double) (-7);
      doubleArray0[3] = (double) (-2142071306);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (double) (-2142071306);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4391.3));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[2] = (double) (-7);
      doubleArray0[3] = (double) (-2142071306);
      doubleArray0[7] = (double) (-2142071306);
      double[] doubleArray1 = new double[8];
      doubleArray1[2] = (double) (-7);
      doubleArray1[3] = 0.9999999999999998;
      doubleArray1[4] = 12.566370614359172;
      doubleArray1[5] = (double) (-2142071306);
      doubleArray1[6] = 7.255501635616751;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4391.3));
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[2];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getV();
      EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, 0.0);
      Array2DRowRealMatrix array2DRowRealMatrix1 = (Array2DRowRealMatrix)eigenDecompositionImpl1.getVT();
      assertNotSame(array2DRowRealMatrix1, array2DRowRealMatrix0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-640.37799);
      doubleArray0[1] = (-640.37799);
      doubleArray0[2] = (-640.37799);
      double[] doubleArray1 = new double[2];
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-640.37799));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // cannot solve degree 3 equation
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[4] = (double) (-7);
      doubleArray0[5] = (double) (-7);
      doubleArray0[6] = (-33.61440651763629);
      doubleArray0[7] = (double) (-2142071306);
      double[] doubleArray1 = new double[8];
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4391.3));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[8];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4391.3));
      eigenDecompositionImpl0.getVT();
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      assertFalse(decompositionSolver0.isNonSingular());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[8];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4391.3));
      double double0 = eigenDecompositionImpl0.getDeterminant();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[8];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4391.3));
      try { 
        eigenDecompositionImpl0.getEigenvector((-2));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[8];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4391.3));
      eigenDecompositionImpl0.getVT();
      try { 
        eigenDecompositionImpl0.getEigenvector(850);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 850
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[8];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4391.3));
      eigenDecompositionImpl0.getSolver();
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getVT();
      assertEquals(9, array2DRowRealMatrix0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[8];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4391.3));
      eigenDecompositionImpl0.getVT();
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getVT();
      assertEquals(9, array2DRowRealMatrix0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[8];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4391.3));
      eigenDecompositionImpl0.getD();
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getD();
      assertNotNull(array2DRowRealMatrix0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[8];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4388.732052886594));
      eigenDecompositionImpl0.getSolver();
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getV();
      assertNotNull(array2DRowRealMatrix0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[2];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getV();
      Array2DRowRealMatrix array2DRowRealMatrix1 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getV();
      assertSame(array2DRowRealMatrix1, array2DRowRealMatrix0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[2];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-15.816822272422014));
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getD();
      EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, (-640.37799));
      assertEquals(0.0, eigenDecompositionImpl1.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[2];
      doubleArray1[1] = 0.6931471805599453;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.6931471805599453);
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getV();
      EigenDecompositionImpl eigenDecompositionImpl1 = null;
      try {
        eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, 3.626860407847019);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // eigen decomposition of assymetric matrices not supported yet
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[8];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4391.3));
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray2, 0.01);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[2];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-15.816822272422014));
      eigenDecompositionImpl0.getRealEigenvalue(2);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[8];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4391.3));
      eigenDecompositionImpl0.getImagEigenvalue(1);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[8];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4391.3));
      eigenDecompositionImpl0.getImagEigenvalues();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }
}
