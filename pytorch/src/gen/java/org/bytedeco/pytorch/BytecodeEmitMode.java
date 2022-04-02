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


@Namespace("torch::jit") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class BytecodeEmitMode extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public BytecodeEmitMode() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BytecodeEmitMode(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BytecodeEmitMode(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public BytecodeEmitMode position(long position) {
        return (BytecodeEmitMode)super.position(position);
    }
    @Override public BytecodeEmitMode getPointer(long i) {
        return new BytecodeEmitMode((Pointer)this).offsetAddress(i);
    }

  public static native @Cast("bool") boolean is_default_value_for_unspecified_arg_enabled();
  public static native void set_default_value_for_unspecified_arg_enabled(@Cast("bool") boolean enabled);

  public static native @Cast("bool") boolean is_default_args_before_out_args_enabled();
  public static native void set_default_args_before_out_args_enabled(@Cast("bool") boolean enabled);
}
