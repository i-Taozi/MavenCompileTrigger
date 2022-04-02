// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.artoolkitplus;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.artoolkitplus.global.ARToolKitPlus.*;


@Namespace("ARToolKitPlus") @NoOffset @Properties(inherit = org.bytedeco.artoolkitplus.presets.ARToolKitPlus.class)
public class CornerPoint extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CornerPoint(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CornerPoint(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CornerPoint position(long position) {
        return (CornerPoint)super.position(position);
    }
    @Override public CornerPoint getPointer(long i) {
        return new CornerPoint((Pointer)this).offsetAddress(i);
    }

    public CornerPoint() { super((Pointer)null); allocate(); }
    private native void allocate();

    public CornerPoint(int nX, int nY) { super((Pointer)null); allocate(nX, nY); }
    private native void allocate(int nX, int nY);

    public native short x(); public native CornerPoint x(short setter);
    public native short y(); public native CornerPoint y(short setter);
}
