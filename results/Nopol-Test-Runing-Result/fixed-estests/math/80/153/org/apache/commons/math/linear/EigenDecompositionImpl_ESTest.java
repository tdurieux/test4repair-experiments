

package org.apache.commons.math.linear;

import org.junit.Assert;
import org.junit.Test;

public class EigenDecompositionImpl_ESTest extends EigenDecompositionImpl_ESTest_scaffolding {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -579.9935898149864;
        doubleArray0[1] = -579.9935898149864;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -579.9935898149864;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-579.9935898149864));
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Assert.assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
        Assert.assertNotNull(array2DRowRealMatrix0);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -579.9935898149864;
        doubleArray0[1] = -579.9935898149864;
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-579.9935898149864));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[2] = 1143.2;
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(0);
        Assert.assertEquals(1143.2, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -579.9935898149864;
        doubleArray0[1] = -579.9935898149864;
        double[] doubleArray1 = new double[5];
        doubleArray1[3] = -680.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.69314718);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(3);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
        Assert.assertEquals((-579.9935898149864), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        eigenDecompositionImpl0.getImagEigenvalue(4);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -579.9935898149864;
        doubleArray0[1] = 0.6931471805599453;
        doubleArray0[2] = 1143.2;
        doubleArray0[5] = 1.0;
        double[] doubleArray1 = new double[5];
        doubleArray1[3] = -680.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.6931471805599453);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(2.1251456280515973E11, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -528.0405562698066;
        doubleArray0[1] = -528.0405562698066;
        doubleArray0[2] = 1143.2;
        doubleArray0[5] = 554.376054357;
        double[] doubleArray1 = new double[5];
        doubleArray1[3] = -680.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals((-8.1710725043974752E16), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[0];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1047479.4989455085));
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        double[][] doubleArray2 = new double[0][3];
        array2DRowRealMatrix0.data = doubleArray2;
        EigenDecompositionImpl eigenDecompositionImpl1 = null;
        try {
            eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), (-1047479.4989455085));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[5] = Double.NaN;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = Double.NaN;
        doubleArray1[1] = 751.0053836859543;
        doubleArray1[3] = -680.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.69314718);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Assert.assertEquals(6, array2DRowRealMatrix0.getColumnDimension());
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -579.161686432462;
        doubleArray0[1] = -579.161686432462;
        doubleArray0[2] = 1143.2;
        doubleArray0[3] = 1143.2;
        doubleArray0[4] = -579.161686432462;
        doubleArray0[5] = 554.376054357;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 554.376054357;
        doubleArray1[1] = 1143.2;
        doubleArray1[2] = 1143.2;
        doubleArray1[3] = -680.0;
        doubleArray1[4] = -579.161686432462;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-579.161686432462));
        Assert.assertEquals((-7.7033293510020006E17), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -579.9935898149864;
        doubleArray0[1] = -579.9935898149864;
        doubleArray0[2] = -579.9935898149864;
        doubleArray0[5] = 554.376054357;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 554.376054357;
        doubleArray1[1] = 751.6665823218157;
        doubleArray1[2] = -579.9935898149864;
        doubleArray1[3] = 554.376054357;
        doubleArray1[4] = -579.9935898149864;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals((-4.9672468363789512E16), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = -579.9935898149864;
        doubleArray0[5] = 554.376054357;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 554.376054357;
        doubleArray1[1] = 751.0053836859543;
        doubleArray1[2] = 1.0;
        doubleArray1[3] = -579.9935898149864;
        doubleArray1[4] = -579.9935898149864;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals((-1.0338447191930936E11), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[3] = 1143.2;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 554.376054357;
        doubleArray1[1] = 751.0053836859543;
        doubleArray1[2] = 0.69314718;
        doubleArray1[3] = -680.0;
        doubleArray1[4] = 0.69314718;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals((-70943.19920811591), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -579.9935898149864;
        doubleArray0[5] = 1143.2;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -579.9935898149864;
        doubleArray1[1] = 751.0053836859543;
        doubleArray1[2] = 1.0;
        doubleArray1[3] = 1143.2;
        doubleArray1[4] = -579.9935898149864;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-579.9935898149864));
        Assert.assertEquals((-4.8873792678479526E17), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -579.9935898149864;
        doubleArray0[3] = 1141.63901956124;
        doubleArray0[5] = 554.376054357;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 554.376054357;
        doubleArray1[1] = 751.6665823218157;
        doubleArray1[2] = 0.8344730815749355;
        doubleArray1[3] = -680.0;
        doubleArray1[4] = 751.6665823218157;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals((-2.9537803020005478E17), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[3] = 1141.63901956124;
        doubleArray0[5] = 554.376054357;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 554.376054357;
        doubleArray1[1] = 751.6665823218157;
        doubleArray1[2] = 0.8344730815749355;
        doubleArray1[3] = -680.0;
        doubleArray1[4] = 751.6665823218157;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals((-1.2091608448249106E11), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -528.0405562698066;
        doubleArray0[1] = -528.0405562698066;
        doubleArray0[5] = 554.376054357;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 554.376054357;
        doubleArray1[1] = 751.0053836859543;
        doubleArray1[2] = 0.69314718;
        doubleArray1[3] = -680.0;
        doubleArray1[4] = 0.69314718;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals((-7.6344133296025872E16), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[2] = 0.49214666664900414;
        double[] doubleArray1 = new double[5];
        doubleArray1[2] = 0.49214666664900414;
        doubleArray1[3] = -680.0;
        doubleArray1[4] = 0.49214666664900414;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[2] = 0.49214666664900414;
        doubleArray1[3] = -680.0;
        doubleArray1[4] = 0.49214666664900414;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = -579.161686432462;
        doubleArray0[2] = 1143.2;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 554.376054357;
        doubleArray1[1] = 1143.2;
        doubleArray1[2] = 1143.2;
        doubleArray1[3] = -680.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-579.161686432462));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[2] = -579.9935898149864;
        doubleArray0[3] = -579.9935898149864;
        doubleArray0[5] = -579.9935898149864;
        double[] doubleArray1 = new double[5];
        doubleArray1[3] = -579.9935898149864;
        doubleArray1[4] = 751.0053836859543;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-579.9935898149864));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -579.9935898149864;
        doubleArray0[1] = -579.9935898149864;
        doubleArray0[2] = -579.9935898149864;
        doubleArray0[3] = -579.9935898149864;
        double[] doubleArray1 = new double[5];
        doubleArray1[2] = -579.9935898149864;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-579.9935898149864));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = 1143.2;
        doubleArray1[2] = 1143.2;
        doubleArray1[3] = -680.0;
        doubleArray1[4] = -579.161686432462;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-579.161686432462));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -579.9935898149864;
        doubleArray1[1] = 751.0053836859543;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.6931471805599453);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-579.161686432462));
        DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
        Assert.assertFalse(decompositionSolver0.isNonSingular());
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.69314718);
        eigenDecompositionImpl0.getVT();
        DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
        Assert.assertFalse(decompositionSolver0.isNonSingular());
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-579.9935898149864));
        ArrayRealVector arrayRealVector0 = ((ArrayRealVector) (eigenDecompositionImpl0.getEigenvector(4)));
        Assert.assertEquals(Double.NaN, arrayRealVector0.getNorm(), 0.01);
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[0];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1047479.4989455085));
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Array2DRowRealMatrix array2DRowRealMatrix1 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Assert.assertTrue(array2DRowRealMatrix1.equals(((Object) (array2DRowRealMatrix0))));
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[0];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1047479.4989455085));
        eigenDecompositionImpl0.getVT();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Assert.assertEquals(1, array2DRowRealMatrix0.getRowDimension());
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[0];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1047479.4989455085));
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        Array2DRowRealMatrix array2DRowRealMatrix1 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        Assert.assertSame(array2DRowRealMatrix1, array2DRowRealMatrix0);
    }

    @Test(timeout = 4000)
    public void test40() throws Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[0];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1047479.4989455085));
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Assert.assertNotNull(array2DRowRealMatrix0);
        Array2DRowRealMatrix array2DRowRealMatrix1 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Assert.assertTrue(array2DRowRealMatrix1.equals(((Object) (array2DRowRealMatrix0))));
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[0];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1047479.4989455085));
        eigenDecompositionImpl0.getV();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Assert.assertEquals(1, array2DRowRealMatrix0.getRowDimension());
    }

    @Test(timeout = 4000)
    public void test42() throws Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[0];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1047479.4989455085));
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), (-1047479.4989455085));
        DecompositionSolver decompositionSolver0 = eigenDecompositionImpl1.getSolver();
        Assert.assertTrue(decompositionSolver0.isNonSingular());
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[0];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1047479.4989455085));
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        Assert.assertFalse(doubleArray2.equals(((Object) (doubleArray0))));
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(0);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test47() throws Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[0];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1047479.4989455085));
        double[] doubleArray2 = eigenDecompositionImpl0.getImagEigenvalues();
        Assert.assertArrayEquals(new double[]{ 0.0 }, doubleArray2, 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = -579.9935898149864;
        doubleArray0[2] = -579.9935898149864;
        double[] doubleArray1 = new double[5];
        doubleArray0[0] = 751.0053836859543;
        doubleArray1[2] = 1143.2;
        doubleArray1[3] = -680.0;
        doubleArray1[4] = -680.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-579.9935898149864));
        Assert.assertEquals(-2.0784525100045256E16, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = -579.9935898149864;
        doubleArray0[2] = -579.9935898149864;
        doubleArray0[3] = -579.9935898149864;
        doubleArray0[4] = -579.9935898149864;
        double[] doubleArray1 = new double[5];
        doubleArray0[0] = 751.0053836859543;
        doubleArray1[3] = -579.9935898149864;
        doubleArray1[4] = 751.0053836859543;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-579.9935898149864));
        Assert.assertEquals(8.2641602890332544E16, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }
}

