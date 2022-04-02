// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class HARDWARE_COUNTER_DATA extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public HARDWARE_COUNTER_DATA() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public HARDWARE_COUNTER_DATA(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public HARDWARE_COUNTER_DATA(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public HARDWARE_COUNTER_DATA position(long position) {
        return (HARDWARE_COUNTER_DATA)super.position(position);
    }
    @Override public HARDWARE_COUNTER_DATA getPointer(long i) {
        return new HARDWARE_COUNTER_DATA((Pointer)this).offsetAddress(i);
    }

    public native @Cast("HARDWARE_COUNTER_TYPE") int Type(); public native HARDWARE_COUNTER_DATA Type(int setter);
    public native @Cast("DWORD") int Reserved(); public native HARDWARE_COUNTER_DATA Reserved(int setter);
    public native @Cast("DWORD64") long Value(); public native HARDWARE_COUNTER_DATA Value(long setter);
}
