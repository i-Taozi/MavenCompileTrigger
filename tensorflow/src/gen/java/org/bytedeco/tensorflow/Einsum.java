// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Tensor contraction according to Einstein summation convention.
 * 
 *  Implements generalized Tensor contraction and reduction. Each input Tensor must
 *  have a corresponding input subscript appearing in the comma-separated left-hand
 *  side of the equation. The right-hand side of the equation consists of the
 *  output subscript. The input subscripts and the output subscript should consist
 *  of zero or more named axis labels and at most one ellipsis ({@code ...}).
 * 
 *  The named axis labels may be any single character other than those having
 *  special meaning, namely {@code ,.->}. The behavior of this Op is undefined if it
 *  receives an ill-formatted equation; since the validation is done at
 *  graph-building time, we omit format validation checks at runtime.
 * 
 *  Note: This Op is *not* intended to be called by the user; instead users should
 *  call {@code tf.einsum} directly. It is a hidden Op used by {@code tf.einsum}.
 * 
 *  Operations are applied to the input(s) according to the following rules:
 * 
 *   (a) Generalized Diagonals: For input dimensions corresponding to axis labels
 *       appearing more than once in the same input subscript, we take the
 *       generalized ({@code k}-dimensional) diagonal.
 *       For example, in the equation {@code iii->i} with input shape {@code [3, 3, 3]}, the
 *       generalized diagonal would consist of {@code 3} elements at indices {@code (0, 0, 0)},
 *       {@code (1, 1, 1)} and {@code (2, 2, 2)} to create a Tensor of shape {@code [3]}.
 * 
 *   (b) Reduction: Axes corresponding to labels appearing only in one input
 *       subscript but not in the output subscript are summed over prior to Tensor
 *       contraction.
 *       For example, in the equation {@code ab,bc->b}, the axis labels {@code a} and {@code c} are
 *       the reduction axis labels.
 * 
 *   (c) Batch Dimensions: Axes corresponding to labels appearing in each of the
 *       input subscripts and also in the output subscript make up the batch
 *       dimensions in Tensor contraction. Unnamed axis labels corresponding to
 *       ellipsis ({@code ...}) also correspond to batch dimensions.
 *       For example, for the equation denoting batch matrix multiplication,
 *       {@code bij,bjk->bik}, the axis label {@code b} corresponds to a batch dimension.
 * 
 *   (d) Contraction: In case of binary einsum, axes corresponding to labels
 *       appearing in two different inputs (and not in the output) are contracted
 *       against each other.
 *       Considering the batch matrix multiplication equation again
 *       ({@code bij,bjk->bik}), the contracted axis label is {@code j}.
 * 
 *   (e) Expand Diagonal: If the output subcripts contain repeated (explicit) axis
 *       labels, the opposite operation of (a) is applied. For example, in the
 *       equation {@code i->iii}, and input shape {@code [3]}, the output of shape {@code [3, 3, 3]}
 *       are all zeros, except for the (generalized) diagonal which is populated
 *       with values from the input.
 *       Note: This operation is not supported by {@code np.einsum} or {@code tf.einsum}; it is
 *       provided to enable computing the symbolic gradient of {@code tf.einsum}.
 * 
 *  The output subcripts must contain only labels appearing in at least one of the
 *  input subscripts. Furthermore, all dimensions mapping to the same axis label
 *  must be equal.
 * 
 *  Any of the input and output subscripts may contain at most a single ellipsis
 *  ({@code ...}). These ellipsis are mapped against dimensions not corresponding to any
 *  named axis label. If two inputs contain ellipsis, then they are broadcasted
 *  according to standard NumPy broadcasting
 *  [rules](http://docs.scipy.org/doc/numpy/user/basics.broadcasting.html).
 * 
 *  The broadcasted dimensions are placed in the corresponding location of the
 *  ellipsis in the output subscript. If the broadcasted dimensions are non-empty
 *  and the output subcripts do not contain ellipsis, then an InvalidArgument error
 *  is raised.
 * 
 *  \compatibility(numpy)
 *  Similar to [{@code numpy.einsum}](https://docs.scipy.org/doc/numpy/reference/generated/numpy.einsum.html).
 * 
 *  Comparison with {@code numpy.einsum}:
 * 
 *   * This Op only supports unary and binary forms of {@code numpy.einsum}.
 *   * This Op does not support implicit form. (i.e. equations without {@code ->}).
 *   * This Op also supports repeated indices in the output subscript, which is not
 *     supported by {@code numpy.einsum}.
 *  \end_compatibility
 * 
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * inputs: List of 1 or 2 Tensors.
 *  * equation: String describing the Einstein Summation operation; in the format of np.einsum.
 * 
 *  Returns:
 *  * {@code Output}: Output Tensor with shape depending upon {@code equation}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Einsum extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Einsum(Pointer p) { super(p); }

  public Einsum(@Const @ByRef Scope scope, @ByVal InputList inputs,
         @StringPiece BytePointer equation) { super((Pointer)null); allocate(scope, inputs, equation); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal InputList inputs,
         @StringPiece BytePointer equation);
  public Einsum(@Const @ByRef Scope scope, @ByVal InputList inputs,
         @StringPiece String equation) { super((Pointer)null); allocate(scope, inputs, equation); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal InputList inputs,
         @StringPiece String equation);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native Einsum operation(Operation setter);
  public native @ByRef Output output(); public native Einsum output(Output setter);
}
