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


/** Options for the {@code BatchNorm} module. */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class BatchNormOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BatchNormOptions(Pointer p) { super(p); }

  /* implicit */ public BatchNormOptions(@Cast("int64_t") long num_features) { super((Pointer)null); allocate(num_features); }
private native void allocate(@Cast("int64_t") long num_features);
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer num_features();
  public native @ByRef @NoException(true) DoublePointer eps();
  public native @ByRef @NoException(true) DoubleOptional momentum();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer affine();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer track_running_stats();
}
