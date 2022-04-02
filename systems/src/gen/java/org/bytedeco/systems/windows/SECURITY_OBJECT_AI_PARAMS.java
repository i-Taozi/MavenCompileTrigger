// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


   
@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class SECURITY_OBJECT_AI_PARAMS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SECURITY_OBJECT_AI_PARAMS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SECURITY_OBJECT_AI_PARAMS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SECURITY_OBJECT_AI_PARAMS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SECURITY_OBJECT_AI_PARAMS position(long position) {
        return (SECURITY_OBJECT_AI_PARAMS)super.position(position);
    }
    @Override public SECURITY_OBJECT_AI_PARAMS getPointer(long i) {
        return new SECURITY_OBJECT_AI_PARAMS((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int Size(); public native SECURITY_OBJECT_AI_PARAMS Size(int setter);             //Set to sizeof(SECURITY_OBJECT_AI_PARAMS)
    public native @Cast("DWORD") int ConstraintMask(); public native SECURITY_OBJECT_AI_PARAMS ConstraintMask(int setter);
}
