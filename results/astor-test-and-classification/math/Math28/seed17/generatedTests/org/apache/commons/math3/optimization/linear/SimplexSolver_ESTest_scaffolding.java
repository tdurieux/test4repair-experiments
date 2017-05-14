/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Jan 19 01:17:36 GMT 2017
 */

package org.apache.commons.math3.optimization.linear;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class SimplexSolver_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.math3.optimization.linear.SimplexSolver"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  public static void setSystemProperties() {
 
    /*No java.lang.System property to set*/
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SimplexSolver_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.math3.linear.RealVector$2",
      "org.apache.commons.math3.util.Precision",
      "org.apache.commons.math3.linear.RealVectorFormat",
      "org.apache.commons.math3.linear.FieldVector",
      "org.apache.commons.math3.linear.RealVector",
      "org.apache.commons.math3.optimization.GoalType",
      "org.apache.commons.math3.exception.util.ArgUtils",
      "org.apache.commons.math3.exception.MathArithmeticException",
      "org.apache.commons.math3.exception.OutOfRangeException",
      "org.apache.commons.math3.exception.NotPositiveException",
      "org.apache.commons.math3.linear.FieldMatrix",
      "org.apache.commons.math3.linear.ArrayRealVector",
      "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer",
      "org.apache.commons.math3.exception.MathIllegalArgumentException",
      "org.apache.commons.math3.exception.MathUnsupportedOperationException",
      "org.apache.commons.math3.linear.RealMatrixFormat",
      "org.apache.commons.math3.exception.ZeroException",
      "org.apache.commons.math3.linear.Array2DRowFieldMatrix",
      "org.apache.commons.math3.linear.AbstractFieldMatrix",
      "org.apache.commons.math3.util.FastMath",
      "org.apache.commons.math3.linear.SparseRealMatrix",
      "org.apache.commons.math3.optimization.linear.LinearObjectiveFunction",
      "org.apache.commons.math3.exception.NumberIsTooLargeException",
      "org.apache.commons.math3.analysis.BivariateFunction",
      "org.apache.commons.math3.exception.NotStrictlyPositiveException",
      "org.apache.commons.math3.linear.FieldMatrixChangingVisitor",
      "org.apache.commons.math3.exception.NoDataException",
      "org.apache.commons.math3.linear.RealMatrix",
      "org.apache.commons.math3.optimization.PointValuePair",
      "org.apache.commons.math3.linear.RealLinearOperator",
      "org.apache.commons.math3.linear.RealMatrixPreservingVisitor",
      "org.apache.commons.math3.exception.util.ExceptionContextProvider",
      "org.apache.commons.math3.linear.BlockRealMatrix",
      "org.apache.commons.math3.optimization.linear.UnboundedSolutionException",
      "org.apache.commons.math3.linear.OpenMapRealMatrix",
      "org.apache.commons.math3.linear.BlockFieldMatrix",
      "org.apache.commons.math3.optimization.linear.NoFeasibleSolutionException",
      "org.apache.commons.math3.exception.NumberIsTooSmallException",
      "org.apache.commons.math3.exception.MathIllegalStateException",
      "org.apache.commons.math3.linear.MatrixDimensionMismatchException",
      "org.apache.commons.math3.linear.FieldMatrixPreservingVisitor",
      "org.apache.commons.math3.optimization.linear.LinearOptimizer",
      "org.apache.commons.math3.optimization.linear.SimplexSolver",
      "org.apache.commons.math3.linear.NonSquareMatrixException",
      "org.apache.commons.math3.linear.MatrixUtils",
      "org.apache.commons.math3.optimization.linear.LinearConstraint",
      "org.apache.commons.math3.exception.MultiDimensionMismatchException",
      "org.apache.commons.math3.linear.Array2DRowRealMatrix",
      "org.apache.commons.math3.util.Pair",
      "org.apache.commons.math3.exception.MathIllegalNumberException",
      "org.apache.commons.math3.util.CompositeFormat",
      "org.apache.commons.math3.exception.util.LocalizedFormats",
      "org.apache.commons.math3.linear.AbstractRealMatrix",
      "org.apache.commons.math3.linear.AnyMatrix",
      "org.apache.commons.math3.exception.MathParseException",
      "org.apache.commons.math3.exception.MaxCountExceededException",
      "org.apache.commons.math3.exception.DimensionMismatchException",
      "org.apache.commons.math3.optimization.linear.Relationship",
      "org.apache.commons.math3.exception.util.Localizable",
      "org.apache.commons.math3.exception.util.ExceptionContext",
      "org.apache.commons.math3.exception.NullArgumentException",
      "org.apache.commons.math3.optimization.linear.SimplexTableau",
      "org.apache.commons.math3.linear.RealMatrixChangingVisitor"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(SimplexSolver_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer",
      "org.apache.commons.math3.optimization.linear.SimplexSolver",
      "org.apache.commons.math3.optimization.linear.SimplexTableau",
      "org.apache.commons.math3.linear.RealVectorAbstractTest$RealVectorTestImpl",
      "org.apache.commons.math3.optimization.linear.LinearObjectiveFunction",
      "org.apache.commons.math3.linear.RealVectorFormat",
      "org.apache.commons.math3.linear.ArrayRealVector",
      "org.apache.commons.math3.optimization.linear.Relationship",
      "org.apache.commons.math3.linear.RealMatrixFormat",
      "org.apache.commons.math3.linear.AbstractRealMatrix",
      "org.apache.commons.math3.linear.Array2DRowRealMatrix",
      "org.apache.commons.math3.linear.MatrixUtils",
      "org.apache.commons.math3.util.Precision",
      "org.apache.commons.math3.util.FastMath",
      "org.apache.commons.math3.optimization.PointValuePair",
      "org.apache.commons.math3.exception.MathIllegalStateException",
      "org.apache.commons.math3.optimization.linear.UnboundedSolutionException",
      "org.apache.commons.math3.exception.util.LocalizedFormats",
      "org.apache.commons.math3.exception.util.ExceptionContext",
      "org.apache.commons.math3.exception.MaxCountExceededException",
      "org.apache.commons.math3.exception.MathIllegalArgumentException",
      "org.apache.commons.math3.exception.MathIllegalNumberException",
      "org.apache.commons.math3.exception.OutOfRangeException",
      "org.apache.commons.math3.analysis.SincFunction",
      "org.apache.commons.math3.exception.DimensionMismatchException",
      "org.apache.commons.math3.exception.NullArgumentException",
      "org.apache.commons.math3.util.FastMathLiteralArrays",
      "org.apache.commons.math3.util.FastMath$ExpIntTable",
      "org.apache.commons.math3.util.FastMath$ExpFracTable"
    );
  }
}
