// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class ACL extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ACL() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ACL(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ACL(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ACL position(long position) {
        return (ACL)super.position(position);
    }
    @Override public ACL getPointer(long i) {
        return new ACL((Pointer)this).offsetAddress(i);
    }

    public native @Cast("BYTE") byte AclRevision(); public native ACL AclRevision(byte setter);
    public native @Cast("BYTE") byte Sbz1(); public native ACL Sbz1(byte setter);
    public native @Cast("WORD") short AclSize(); public native ACL AclSize(short setter);
    public native @Cast("WORD") short AceCount(); public native ACL AceCount(short setter);
    public native @Cast("WORD") short Sbz2(); public native ACL Sbz2(short setter);
}
