// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;
  // Intel-IA64-Filler

//
// Line number format.
//

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class IMAGE_LINENUMBER extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IMAGE_LINENUMBER() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMAGE_LINENUMBER(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMAGE_LINENUMBER(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IMAGE_LINENUMBER position(long position) {
        return (IMAGE_LINENUMBER)super.position(position);
    }
    @Override public IMAGE_LINENUMBER getPointer(long i) {
        return new IMAGE_LINENUMBER((Pointer)this).offsetAddress(i);
    }

        @Name("Type.SymbolTableIndex") public native @Cast("DWORD") int Type_SymbolTableIndex(); public native IMAGE_LINENUMBER Type_SymbolTableIndex(int setter);               // Symbol table index of function name if Linenumber is 0.
        @Name("Type.VirtualAddress") public native @Cast("DWORD") int Type_VirtualAddress(); public native IMAGE_LINENUMBER Type_VirtualAddress(int setter);                 // Virtual address of line number.
    public native @Cast("WORD") short Linenumber(); public native IMAGE_LINENUMBER Linenumber(short setter);                         // Line number.
}
