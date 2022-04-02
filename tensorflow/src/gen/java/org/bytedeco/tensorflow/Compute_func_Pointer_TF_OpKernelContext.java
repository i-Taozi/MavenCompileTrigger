// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

@Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Compute_func_Pointer_TF_OpKernelContext extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Compute_func_Pointer_TF_OpKernelContext(Pointer p) { super(p); }
    protected Compute_func_Pointer_TF_OpKernelContext() { allocate(); }
    private native void allocate();
    public native void call(Pointer arg0, TF_OpKernelContext arg1);
}
