// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** Color for debug drawing. Each value has the range [0,1]. */
@NoOffset @Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2Color extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2Color(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2Color(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public b2Color position(long position) {
        return (b2Color)super.position(position);
    }
    @Override public b2Color getPointer(long i) {
        return new b2Color((Pointer)this).offsetAddress(i);
    }

	public b2Color() { super((Pointer)null); allocate(); }
	private native void allocate();
	public b2Color(@Cast("float32") float r, @Cast("float32") float g, @Cast("float32") float b) { super((Pointer)null); allocate(r, g, b); }
	private native void allocate(@Cast("float32") float r, @Cast("float32") float g, @Cast("float32") float b);
	public native void Set(@Cast("float32") float ri, @Cast("float32") float gi, @Cast("float32") float bi);
	public native @Cast("float32") float r(); public native b2Color r(float setter);
	public native @Cast("float32") float g(); public native b2Color g(float setter);
	public native @Cast("float32") float b(); public native b2Color b(float setter);
}
