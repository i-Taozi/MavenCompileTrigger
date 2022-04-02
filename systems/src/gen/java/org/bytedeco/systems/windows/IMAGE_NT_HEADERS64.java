// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;

// #else
// #endif

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class IMAGE_NT_HEADERS64 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IMAGE_NT_HEADERS64() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMAGE_NT_HEADERS64(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMAGE_NT_HEADERS64(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IMAGE_NT_HEADERS64 position(long position) {
        return (IMAGE_NT_HEADERS64)super.position(position);
    }
    @Override public IMAGE_NT_HEADERS64 getPointer(long i) {
        return new IMAGE_NT_HEADERS64((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int Signature(); public native IMAGE_NT_HEADERS64 Signature(int setter);
    public native @ByRef IMAGE_FILE_HEADER FileHeader(); public native IMAGE_NT_HEADERS64 FileHeader(IMAGE_FILE_HEADER setter);
    public native @ByRef IMAGE_OPTIONAL_HEADER64 OptionalHeader(); public native IMAGE_NT_HEADERS64 OptionalHeader(IMAGE_OPTIONAL_HEADER64 setter);
}
