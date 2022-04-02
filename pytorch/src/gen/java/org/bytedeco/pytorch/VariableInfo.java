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
public class VariableInfo extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public VariableInfo(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public VariableInfo(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public VariableInfo position(long position) {
        return (VariableInfo)super.position(position);
    }
    @Override public VariableInfo getPointer(long i) {
        return new VariableInfo((Pointer)this).offsetAddress(i);
    }

  public VariableInfo() { super((Pointer)null); allocate(); }
  private native void allocate();
  public VariableInfo(@Cast("const torch::autograd::Variable*") @ByRef Tensor var) { super((Pointer)null); allocate(var); }
  private native void allocate(@Cast("const torch::autograd::Variable*") @ByRef Tensor var);

  public native @ByVal @Cast("torch::autograd::Variable*") Tensor zeros(@ByRef OptionalDeviceGuard device_guard);

  public native @ByRef Layout layout(); public native VariableInfo layout(Layout setter);
  public native @ByRef Device device(); public native VariableInfo device(Device setter);
  public native ScalarType scalar_type(); public native VariableInfo scalar_type(ScalarType setter);
  public native @ByRef @Cast("std::vector<int64_t>*") LongVector size(); public native VariableInfo size(LongVector setter);
  public native @Cast("bool") boolean requires_grad(); public native VariableInfo requires_grad(boolean setter);
  public native @Cast("bool") boolean is_empty(); public native VariableInfo is_empty(boolean setter);
}
