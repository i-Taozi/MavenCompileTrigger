// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.systems.macosx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.macosx.*;


@Properties(inherit = org.bytedeco.systems.presets.macosx.class)
public class utimbuf extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public utimbuf() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public utimbuf(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public utimbuf(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public utimbuf position(long position) {
        return (utimbuf)super.position(position);
    }
    @Override public utimbuf getPointer(long i) {
        return new utimbuf((Pointer)this).offsetAddress(i);
    }

	public native @ByRef @Cast("time_t*") Pointer actime(); public native utimbuf actime(Pointer setter);		/* Access time */
	public native @ByRef @Cast("time_t*") Pointer modtime(); public native utimbuf modtime(Pointer setter);		/* Modification time */
}
