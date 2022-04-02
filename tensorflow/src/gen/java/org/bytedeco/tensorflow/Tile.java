// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Constructs a tensor by tiling a given tensor.
 * 
 *  This operation creates a new tensor by replicating {@code input} {@code multiples} times.
 *  The output tensor's i'th dimension has {@code input.dims(i) * multiples[i]} elements,
 *  and the values of {@code input} are replicated {@code multiples[i]} times along the 'i'th
 *  dimension. For example, tiling {@code [a b c d]} by {@code [2]} produces
 *  {@code [a b c d a b c d]}.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: 1-D or higher.
 *  * multiples: 1-D. Length must be the same as the number of dimensions in {@code input}
 * 
 *  Returns:
 *  * {@code Output}: The output tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Tile extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Tile(Pointer p) { super(p); }

  public Tile(@Const @ByRef Scope scope, @ByVal Input input,
       @ByVal Input multiples) { super((Pointer)null); allocate(scope, input, multiples); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
       @ByVal Input multiples);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native Tile operation(Operation setter);
  public native @ByRef Output output(); public native Tile output(Output setter);
}
