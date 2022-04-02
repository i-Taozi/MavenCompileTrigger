// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.leptonica.global.lept.*;


/** Timing struct */
@Name("L_WallTimer") @Properties(inherit = org.bytedeco.leptonica.presets.lept.class)
public class L_WALLTIMER extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public L_WALLTIMER() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public L_WALLTIMER(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public L_WALLTIMER(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public L_WALLTIMER position(long position) {
        return (L_WALLTIMER)super.position(position);
    }
    @Override public L_WALLTIMER getPointer(long i) {
        return new L_WALLTIMER((Pointer)this).offsetAddress(i);
    }

    public native @Cast("l_int32") int start_sec(); public native L_WALLTIMER start_sec(int setter);
    public native @Cast("l_int32") int start_usec(); public native L_WALLTIMER start_usec(int setter);
    public native @Cast("l_int32") int stop_sec(); public native L_WALLTIMER stop_sec(int setter);
    public native @Cast("l_int32") int stop_usec(); public native L_WALLTIMER stop_usec(int setter);
}
