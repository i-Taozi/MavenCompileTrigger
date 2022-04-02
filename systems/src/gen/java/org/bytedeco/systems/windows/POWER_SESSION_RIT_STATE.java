// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


//
// Session RIT State
//
@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class POWER_SESSION_RIT_STATE extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public POWER_SESSION_RIT_STATE() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public POWER_SESSION_RIT_STATE(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public POWER_SESSION_RIT_STATE(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public POWER_SESSION_RIT_STATE position(long position) {
        return (POWER_SESSION_RIT_STATE)super.position(position);
    }
    @Override public POWER_SESSION_RIT_STATE getPointer(long i) {
        return new POWER_SESSION_RIT_STATE((Pointer)this).offsetAddress(i);
    }

    public native @Cast("BOOLEAN") boolean Active(); public native POWER_SESSION_RIT_STATE Active(boolean setter);  // TRUE - RIT input received, FALSE - RIT timeout
    public native @Cast("DWORD") int LastInputTime(); public native POWER_SESSION_RIT_STATE LastInputTime(int setter); // last input time held for this session
}
