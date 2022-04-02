// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Wraps a tensor that is held by an Op across calls to Compute(). For
// memory safety when using asynchronous devices like GPUs, the system
// must be notified when a Tensor is used inside an Op execution. The
// wrapper ensures that all uses of the Tensor are tracked, because in
// order to retrieve the Tensor the caller must use AccessTensor which
// notifies the context.
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class PersistentTensor extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PersistentTensor(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PersistentTensor(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public PersistentTensor position(long position) {
        return (PersistentTensor)super.position(position);
    }
    @Override public PersistentTensor getPointer(long i) {
        return new PersistentTensor((Pointer)this).offsetAddress(i);
    }

  public PersistentTensor() { super((Pointer)null); allocate(); }
  private native void allocate();
  public PersistentTensor(@Const @ByRef Tensor tensor) { super((Pointer)null); allocate(tensor); }
  private native void allocate(@Const @ByRef Tensor tensor);

  // Caller does not own the returned Tensor*.
  public native Tensor AccessTensor(OpKernelConstruction context);
  // Caller does not own the returned Tensor*.
  public native Tensor AccessTensor(OpKernelContext context);

  // The check for initialization does not need to access the
  // underlying tensor buffer.
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("tensorflow::int64") long NumElements();

  public native @Cast("tensorflow::int64") long AllocatedBytes();
}
