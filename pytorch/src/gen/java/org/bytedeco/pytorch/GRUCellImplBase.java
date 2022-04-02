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

@Name("torch::nn::detail::RNNCellImplBase<torch::nn::GRUCellImpl>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class GRUCellImplBase extends GRUCellImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GRUCellImplBase(Pointer p) { super(p); }

  public GRUCellImplBase(@Const @ByRef RNNCellOptionsBase options_) { super((Pointer)null); allocate(options_); }
  @NoDeallocator private native void allocate(@Const @ByRef RNNCellOptionsBase options_);

  /** Initializes the parameters of the RNNCell module. */
  public native void reset();

  public native void reset_parameters();

  /** Pretty prints the RNN module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  public native @ByRef RNNCellOptionsBase options_base(); public native GRUCellImplBase options_base(RNNCellOptionsBase setter);

  public native @ByRef Tensor weight_ih(); public native GRUCellImplBase weight_ih(Tensor setter);
  public native @ByRef Tensor weight_hh(); public native GRUCellImplBase weight_hh(Tensor setter);
  public native @ByRef Tensor bias_ih(); public native GRUCellImplBase bias_ih(Tensor setter);
  public native @ByRef Tensor bias_hh(); public native GRUCellImplBase bias_hh(Tensor setter);
}
