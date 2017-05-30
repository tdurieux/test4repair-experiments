

package org.apache.commons.math.linear;

import org.junit.Assert;
import org.junit.Test;

public class EigenDecompositionImpl_ESTest extends EigenDecompositionImpl_ESTest_scaffolding {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = 453.2658763040863;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 453.2658763040863);
        eigenDecompositionImpl0.getSolver();
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = -2030.1555;
        double[] doubleArray1 = new double[8];
        doubleArray1[5] = -1570.7872553098427;
        doubleArray1[6] = -1920.812338;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, Double.NEGATIVE_INFINITY);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[2] = ((double) (1));
        doubleArray0[3] = ((double) (1));
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 454.4842025409041);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(1);
        Assert.assertEquals(1.0, double0, 0.01);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 3.498288296823653E-4;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 454.4842025409041);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(5);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
        Assert.assertEquals((-3.498288296823653E-4), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 454.4842025409041);
        eigenDecompositionImpl0.getImagEigenvalue(5);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, ((double) (31)));
        ArrayRealVector arrayRealVector0 = ((ArrayRealVector) (eigenDecompositionImpl0.getEigenvector(2)));
        Assert.assertEquals(Double.NaN, arrayRealVector0.getL1Norm(), 0.01);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = ((double) (5));
        doubleArray0[5] = ((double) (5));
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = ((double) (10));
        doubleArray1[3] = ((double) (10));
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 454.4842025409041);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(250000.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = ((double) (5));
        doubleArray0[1] = ((double) (10));
        doubleArray0[2] = ((double) (5));
        doubleArray0[5] = 10.0;
        double[] doubleArray1 = new double[5];
        doubleArray1[3] = ((double) (10));
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 454.4842025409041);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals((-250000.0), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        EigenDecompositionImpl eigenDecompositionImpl0 = null;
        try {
            eigenDecompositionImpl0 = new EigenDecompositionImpl(((double[]) (null)), ((double[]) (null)), 2649.515893726);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 463.1307134770586);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), (-1564.0));
        Array2DRowRealMatrix array2DRowRealMatrix1 = ((Array2DRowRealMatrix) (eigenDecompositionImpl1.getV()));
        Assert.assertEquals(0.0, eigenDecompositionImpl1.getDeterminant(), 0.01);
        Assert.assertFalse(array2DRowRealMatrix1.equals(((Object) (array2DRowRealMatrix0))));
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = ((double) (5));
        doubleArray0[1] = ((double) (10));
        doubleArray0[2] = ((double) (5));
        doubleArray0[3] = ((double) (5));
        doubleArray0[4] = ((double) (10));
        doubleArray0[5] = 3.498288296823653E-4;
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 454.4842025409041);
        DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
        Assert.assertTrue(decompositionSolver0.isNonSingular());
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = ((double) (10));
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -25.89633602496629;
        doubleArray1[1] = 453.2658763040863;
        doubleArray1[2] = ((double) (10));
        doubleArray1[3] = ((double) (10));
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 453.2658763040863);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = ((double) (31));
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 3.498288296823653E-4;
        doubleArray1[1] = ((double) (31));
        doubleArray1[2] = ((double) (2));
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, ((double) (31)));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = -2030.1555;
        doubleArray0[1] = -2066.467385094171;
        doubleArray0[4] = -1920.812338;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = -1920.812338;
        doubleArray1[1] = 6.575291089192646;
        doubleArray1[2] = 570.3545;
        doubleArray1[3] = 1.5;
        doubleArray1[6] = -1920.812338;
        doubleArray1[7] = 2152.165448;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, Double.NEGATIVE_INFINITY);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = -2030.1555;
        doubleArray0[1] = -2066.467385094171;
        doubleArray0[5] = -1570.7872553098427;
        doubleArray0[7] = -2030.1555;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = -1920.812338;
        doubleArray1[1] = 6.575291089192646;
        doubleArray1[2] = 570.3545;
        doubleArray1[3] = 1.5;
        doubleArray1[4] = -2030.1555;
        doubleArray1[5] = -1570.7872553098427;
        doubleArray1[6] = -1920.812338;
        doubleArray1[7] = 2152.165448;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, Double.NEGATIVE_INFINITY);
        Assert.assertEquals((-2.25695242883033216E18), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[5] = ((double) (-12));
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = ((double) (-4));
        doubleArray1[1] = 454.4842025409041;
        doubleArray1[2] = ((double) (-12));
        doubleArray1[3] = ((double) (-4));
        doubleArray1[4] = ((double) (-12));
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 454.4842025409041);
        Assert.assertEquals((-331776.000001978), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = 4.958314141243575E-12;
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = 4.958314141243575E-12;
        doubleArray1[2] = ((double) (10));
        doubleArray1[3] = ((double) (10));
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 454.4842025409041);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[5] = ((double) (-12));
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = 454.4842025409041;
        doubleArray1[2] = ((double) (-12));
        doubleArray1[3] = ((double) (10));
        doubleArray1[4] = ((double) (-12));
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 454.4842025409041);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = 454.4842025409041;
        doubleArray1[2] = ((double) (-12));
        doubleArray1[3] = ((double) (10));
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 454.4842025409041);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = ((double) (10));
        doubleArray0[2] = ((double) (10));
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 3.498288296823653E-4;
        doubleArray1[1] = 3.498288296823653E-4;
        doubleArray1[2] = ((double) (10));
        doubleArray1[3] = ((double) (10));
        doubleArray1[4] = ((double) (10));
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 10.0);
        Assert.assertEquals((-0.0012238022196153751), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = ((double) (-1));
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 3.498288296823653E-4;
        doubleArray1[1] = 463.1307134770586;
        doubleArray1[2] = ((double) (2));
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 463.1307134770586);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = ((double) (-1597575846));
        double[] doubleArray1 = new double[5];
        doubleArray0[0] = 4.958314141243575E-12;
        doubleArray1[1] = 4.958314141243575E-12;
        doubleArray1[2] = ((double) (10));
        doubleArray1[3] = ((double) (10));
        doubleArray1[4] = ((double) (-1597575846));
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-955.6558988032675));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = ((double) (-49));
        doubleArray1[1] = ((double) (6));
        doubleArray1[2] = ((double) (-49));
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, ((double) (6)));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = ((double) (5));
        doubleArray0[2] = ((double) (5));
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 3.498288296823653E-4;
        doubleArray1[1] = 5.0;
        doubleArray1[2] = ((double) (2));
        doubleArray1[3] = ((double) (5));
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 3.498288296823653E-4);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = ((double) (10));
        doubleArray0[5] = ((double) (10));
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = ((double) (10));
        doubleArray1[2] = ((double) (10));
        doubleArray1[3] = ((double) (10));
        doubleArray1[4] = ((double) (10));
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-955.6558988032675));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = ((double) (1));
        doubleArray0[5] = ((double) (1));
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = ((double) (10));
        doubleArray1[1] = 454.4842025409041;
        doubleArray1[2] = ((double) (1));
        doubleArray1[3] = ((double) (10));
        doubleArray1[4] = ((double) (1));
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 454.4842025409041);
        Assert.assertEquals(2.065548903592142E7, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray0[0] = 4.958314141243575E-12;
        doubleArray1[1] = 4.958314141243575E-12;
        doubleArray0[1] = ((double) (10));
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-955.6558988032675));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = ((double) (5));
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = 4.958314141243575E-12;
        doubleArray0[1] = ((double) (10));
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-955.6558988032675));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 454.4842025409041);
        DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
        DecompositionSolver decompositionSolver1 = eigenDecompositionImpl0.getSolver();
        Assert.assertFalse(decompositionSolver1.equals(((Object) (decompositionSolver0))));
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 454.4842025409041);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 10.0);
        eigenDecompositionImpl0.getSolver();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Assert.assertEquals(6, array2DRowRealMatrix0.getColumnDimension());
    }

    @Test(timeout = 4000)
    public void test40() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.662337662337662);
        eigenDecompositionImpl0.getVT();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Assert.assertEquals(5, array2DRowRealMatrix0.getRowDimension());
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.662337662337662);
        eigenDecompositionImpl0.getD();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        Assert.assertNotNull(array2DRowRealMatrix0);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test42() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 454.4842025409041);
        eigenDecompositionImpl0.getSolver();
        eigenDecompositionImpl0.getV();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test43() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 454.4842025409041);
        eigenDecompositionImpl0.getV();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Assert.assertEquals(6, array2DRowRealMatrix0.getRowDimension());
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[4] = -1920.812338;
        double[] doubleArray1 = new double[8];
        doubleArray1[4] = -2030.1555;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, Double.NEGATIVE_INFINITY);
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        Assert.assertArrayEquals(new double[]{ 1285.4592240352786 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , -3206.2715620352783 }, doubleArray2, 0.01);
    }

    @Test(timeout = 4000)
    public void test46() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 454.4842025409041);
        eigenDecompositionImpl0.getRealEigenvalue(2);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test47() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 463.1307134770586);
        eigenDecompositionImpl0.getImagEigenvalues();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = -2030.1555;
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = 6.575291089192646;
        doubleArray1[2] = 570.3545;
        doubleArray1[3] = 1.5;
        doubleArray1[4] = -2030.1555;
        doubleArray1[5] = -1570.7872553098427;
        doubleArray1[7] = 2152.165448;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, Double.NEGATIVE_INFINITY);
        Assert.assertEquals(8.812819516128318E22, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = ((double) (-1597575846));
        double[] doubleArray1 = new double[5];
        doubleArray0[0] = ((double) (-1597575846));
        doubleArray1[1] = ((double) (10));
        doubleArray1[2] = ((double) (10));
        doubleArray1[3] = ((double) (10));
        doubleArray1[4] = ((double) (-1597575846));
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-955.6558988032675));
        Assert.assertEquals(6.513972833114099E38, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }
}

