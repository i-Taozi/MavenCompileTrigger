// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Dequantize the 'input' tensor into a float Tensor.
 * 
 *  [min_range, max_range] are scalar floats that specify the range for
 *  the 'input' data. The 'mode' attribute controls exactly which calculations are
 *  used to convert the float values to their quantized equivalents.
 * 
 *  In 'MIN_COMBINED' mode, each value of the tensor will undergo the following:
 * 
 *  <pre>{@code
 *  if T == qint8: in[i] += (range(T) + 1)/ 2.0
 *  out[i] = min_range + (in[i]* (max_range - min_range) / range(T))
 *  }</pre>
 *  here {@code range(T) = numeric_limits<T>::max() - numeric_limits<T>::min()}
 * 
 *  *MIN_COMBINED Mode Example*
 * 
 *  If the input comes from a QuantizedRelu6, the output type is
 *  quint8 (range of 0-255) but the possible range of QuantizedRelu6 is
 *  0-6.  The min_range and max_range values are therefore 0.0 and 6.0.
 *  Dequantize on quint8 will take each value, cast to float, and multiply
 *  by 6 / 255.
 *  Note that if quantizedtype is qint8, the operation will additionally add
 *  each value by 128 prior to casting.
 * 
 *  If the mode is 'MIN_FIRST', then this approach is used:
 * 
 *  <pre>{@code c++
 *  num_discrete_values = 1 << (# of bits in T)
 *  range_adjust = num_discrete_values / (num_discrete_values - 1)
 *  range = (range_max - range_min) * range_adjust
 *  range_scale = range / num_discrete_values
 *  const double offset_input = static_cast<double>(input) - lowest_quantized;
 *  result = range_min + ((input - numeric_limits<T>::min()) * range_scale)
 *  }</pre>
 * 
 *  *SCALED mode Example*
 * 
 *  {@code SCALED} mode matches the quantization approach used in
 *  {@code QuantizeAndDequantize{V2|V3}}.
 * 
 *  If the mode is {@code SCALED}, we do not use the full range of the output type,
 *  choosing to elide the lowest possible value for symmetry (e.g., output range is
 *  -127 to 127, not -128 to 127 for signed 8 bit quantization), so that 0.0 maps to
 *  0.
 * 
 *  We first find the range of values in our tensor. The
 *  range we use is always centered on 0, so we find m such that
 *  <pre>{@code c++
 *    m = max(abs(input_min), abs(input_max))
 *  }</pre>
 * 
 *  Our input tensor range is then {@code [-m, m]}.
 * 
 *  Next, we choose our fixed-point quantization buckets, {@code [min_fixed, max_fixed]}.
 *  If T is signed, this is
 *  <pre>{@code
 *    num_bits = sizeof(T) * 8
 *    [min_fixed, max_fixed] =
 *        [-(1 << (num_bits - 1) - 1), (1 << (num_bits - 1)) - 1]
 *  }</pre>
 * 
 *  Otherwise, if T is unsigned, the fixed-point range is
 *  <pre>{@code
 *    [min_fixed, max_fixed] = [0, (1 << num_bits) - 1]
 *  }</pre>
 * 
 *  From this we compute our scaling factor, s:
 *  <pre>{@code c++
 *    s = (2 * m) / (max_fixed - min_fixed)
 *  }</pre>
 * 
 *  Now we can dequantize the elements of our tensor:
 *  <pre>{@code c++
 *  result = input * s
 *  }</pre>
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * min_range: The minimum scalar value possibly produced for the input.
 *  * max_range: The maximum scalar value possibly produced for the input.
 * 
 *  Returns:
 *  * {@code Output}: The output tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Dequantize extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Dequantize(Pointer p) { super(p); }

  /** Optional attribute setters for Dequantize */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
      @Override public Attrs getPointer(long i) {
          return new Attrs((Pointer)this).offsetAddress(i);
      }
  
    /** Defaults to "MIN_COMBINED" */
    public native @ByVal Attrs Mode(@StringPiece BytePointer x);
    public native @ByVal Attrs Mode(@StringPiece String x);

    public native @StringPiece BytePointer mode_(); public native Attrs mode_(BytePointer setter);
  }
  public Dequantize(@Const @ByRef Scope scope, @ByVal Input input,
             @ByVal Input min_range, @ByVal Input max_range) { super((Pointer)null); allocate(scope, input, min_range, max_range); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
             @ByVal Input min_range, @ByVal Input max_range);
  public Dequantize(@Const @ByRef Scope scope, @ByVal Input input,
             @ByVal Input min_range, @ByVal Input max_range, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, min_range, max_range, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
             @ByVal Input min_range, @ByVal Input max_range, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs Mode(@StringPiece BytePointer x);
  public static native @ByVal Attrs Mode(@StringPiece String x);

  public native @ByRef Operation operation(); public native Dequantize operation(Operation setter);
  public native @ByRef Output output(); public native Dequantize output(Output setter);
}
