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


@Namespace("torch::autograd") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class CppFunctionPreHook extends FunctionPreHook {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CppFunctionPreHook(Pointer p) { super(p); }

  public native @Name("operator ()") @Cast({"", "std::vector<at::Tensor>"}) @StdMove TensorVector apply(@Cast({"", "std::vector<at::Tensor>"}) @StdMove TensorVector values);

  public native @Cast("torch::autograd::hooks_list*") @StdVector @SharedPtr PointerPointer hooks_(); public native CppFunctionPreHook hooks_(PointerPointer setter);
  public native int value_idx_(); public native CppFunctionPreHook value_idx_(int setter);
}
