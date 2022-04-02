// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


// #if (NTDDI_VERSION >= NTDDI_WIN8)

// #endif  // (NTDDI_VERSION >= NTDDI_WIN8)


//
// The reparse GUID structure is used by all 3rd party layered drivers to
// store data in a reparse point. For non-Microsoft tags, The GUID field
// cannot be GUID_NULL.
// The constraints on reparse tags are defined below.
// Microsoft tags can also be used with this format of the reparse point buffer.
//

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class REPARSE_GUID_DATA_BUFFER extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public REPARSE_GUID_DATA_BUFFER() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public REPARSE_GUID_DATA_BUFFER(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public REPARSE_GUID_DATA_BUFFER(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public REPARSE_GUID_DATA_BUFFER position(long position) {
        return (REPARSE_GUID_DATA_BUFFER)super.position(position);
    }
    @Override public REPARSE_GUID_DATA_BUFFER getPointer(long i) {
        return new REPARSE_GUID_DATA_BUFFER((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int ReparseTag(); public native REPARSE_GUID_DATA_BUFFER ReparseTag(int setter);
    public native @Cast("WORD") short ReparseDataLength(); public native REPARSE_GUID_DATA_BUFFER ReparseDataLength(short setter);
    public native @Cast("WORD") short Reserved(); public native REPARSE_GUID_DATA_BUFFER Reserved(short setter);
    public native @ByRef GUID ReparseGuid(); public native REPARSE_GUID_DATA_BUFFER ReparseGuid(GUID setter);
        @Name("GenericReparseBuffer.DataBuffer") public native @Cast("BYTE") byte GenericReparseBuffer_DataBuffer(int i); public native REPARSE_GUID_DATA_BUFFER GenericReparseBuffer_DataBuffer(int i, byte setter);
        @Name("GenericReparseBuffer.DataBuffer") @MemberGetter public native @Cast("BYTE*") BytePointer GenericReparseBuffer_DataBuffer();
}
