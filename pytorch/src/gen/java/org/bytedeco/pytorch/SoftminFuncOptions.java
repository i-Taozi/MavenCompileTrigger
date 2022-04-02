// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


/** Options for {@code torch::nn::functional::softmin}.
 * 
 *  Example:
 *  <pre>{@code
 *  namespace F = torch::nn::functional;
 *  F::softmin(input, F::SoftminFuncOptions(1));
 *  }</pre> */
@Namespace("torch::nn::functional") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SoftminFuncOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SoftminFuncOptions(Pointer p) { super(p); }

  public SoftminFuncOptions(@Cast("int64_t") long dim) { super((Pointer)null); allocate(dim); }
  private native void allocate(@Cast("int64_t") long dim);
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer dim();
  public native @ByRef @NoException(true) ScalarTypeOptional dtype();
}
