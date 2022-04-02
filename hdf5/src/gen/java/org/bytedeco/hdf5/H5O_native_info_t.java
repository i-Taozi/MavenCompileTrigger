// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;

/** <!-- [H5O_info2_t_snip] -->
 <p>
 *  <!-- [H5O_native_info_t_snip] -->
/**
 * Native file format information struct for objects.
 * (For H5Oget_native_info(), H5Oget_native_info_by_name(), H5Oget_native_info_by_idx())
 */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5O_native_info_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public H5O_native_info_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public H5O_native_info_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public H5O_native_info_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public H5O_native_info_t position(long position) {
        return (H5O_native_info_t)super.position(position);
    }
    @Override public H5O_native_info_t getPointer(long i) {
        return new H5O_native_info_t((Pointer)this).offsetAddress(i);
    }

    /** Object header information */
    public native @ByRef H5O_hdr_info_t hdr(); public native H5O_native_info_t hdr(H5O_hdr_info_t setter);
    /* Extra metadata storage for obj & attributes */
        /** v1/v2 B-tree & local/fractal heap for groups, B-tree for chunked datasets */
        @Name("meta_size.obj") public native @ByRef H5_ih_info_t meta_size_obj(); public native H5O_native_info_t meta_size_obj(H5_ih_info_t setter);
        /** v2 B-tree & heap for attributes */
        @Name("meta_size.attr") public native @ByRef H5_ih_info_t meta_size_attr(); public native H5O_native_info_t meta_size_attr(H5_ih_info_t setter);
}
