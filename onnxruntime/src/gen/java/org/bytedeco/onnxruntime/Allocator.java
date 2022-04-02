// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.onnxruntime;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;

import static org.bytedeco.onnxruntime.global.onnxruntime.*;


@Namespace("Ort") @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class Allocator extends BaseAllocator {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Allocator(Pointer p) { super(p); }

  public Allocator(@Const @ByRef Session session, @Const @ByRef MemoryInfo arg1) { super((Pointer)null); allocate(session, arg1); }
  private native void allocate(@Const @ByRef Session session, @Const @ByRef MemoryInfo arg1);

  public native Pointer Alloc(@Cast("size_t") long size);
  // The return value will own the allocation
  public native @ByVal MemoryAllocation GetAllocation(@Cast("size_t") long size);
  public native void Free(Pointer p);
  public native @ByVal UnownedMemoryInfo GetInfo();
}
