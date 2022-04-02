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


@Namespace("torch::optim") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Adam extends Optimizer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Adam(Pointer p) { super(p); }

   public Adam(@ByVal OptimizerParamGroupVector param_groups,
          @ByVal(nullValue = "torch::optim::AdamOptions{}") AdamOptions defaults) { super((Pointer)null); allocate(param_groups, defaults); }
   private native void allocate(@ByVal OptimizerParamGroupVector param_groups,
          @ByVal(nullValue = "torch::optim::AdamOptions{}") AdamOptions defaults);
   public Adam(@ByVal OptimizerParamGroupVector param_groups) { super((Pointer)null); allocate(param_groups); }
   private native void allocate(@ByVal OptimizerParamGroupVector param_groups);
   public Adam(
          @Cast({"", "std::vector<at::Tensor>"}) @StdMove TensorVector params,
          @ByVal(nullValue = "torch::optim::AdamOptions{}") AdamOptions defaults) { super((Pointer)null); allocate(params, defaults); }
   private native void allocate(
          @Cast({"", "std::vector<at::Tensor>"}) @StdMove TensorVector params,
          @ByVal(nullValue = "torch::optim::AdamOptions{}") AdamOptions defaults);
   public Adam(
          @Cast({"", "std::vector<at::Tensor>"}) @StdMove TensorVector params) { super((Pointer)null); allocate(params); }
   private native void allocate(
          @Cast({"", "std::vector<at::Tensor>"}) @StdMove TensorVector params);

  public native @ByVal Tensor step(@ByVal(nullValue = "torch::optim::Optimizer::LossClosure(nullptr)") LossClosure closure);
  public native @ByVal Tensor step();
  public native void save(@ByRef OutputArchive archive);
  public native void load(@ByRef InputArchive archive);
}
