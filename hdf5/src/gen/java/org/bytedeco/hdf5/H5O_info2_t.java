// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;

/** <!-- [H5O_hdr_info_t_snip] -->
 <p>
 *  <!-- [H5O_info2_t_snip] -->
/**
 * Data model information struct for objects
 * (For H5Oget_info(), H5Oget_info_by_name(), H5Oget_info_by_idx() version 3)
 */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5O_info2_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public H5O_info2_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public H5O_info2_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public H5O_info2_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public H5O_info2_t position(long position) {
        return (H5O_info2_t)super.position(position);
    }
    @Override public H5O_info2_t getPointer(long i) {
        return new H5O_info2_t((Pointer)this).offsetAddress(i);
    }

    public native @Cast("unsigned long") long fileno(); public native H5O_info2_t fileno(long setter);    /* File number that object is located in */
    public native @ByRef H5O_token_t token(); public native H5O_info2_t token(H5O_token_t setter);     /* Token representing the object        */
    public native @Cast("H5O_type_t") int type(); public native H5O_info2_t type(int setter);      /* Basic object type (group, dataset, etc.) */
    public native @Cast("unsigned") int rc(); public native H5O_info2_t rc(int setter);        /* Reference count of object            */
    public native @ByRef @Cast("time_t*") Pointer atime(); public native H5O_info2_t atime(Pointer setter);     /* Access time                          */
    public native @ByRef @Cast("time_t*") Pointer mtime(); public native H5O_info2_t mtime(Pointer setter);     /* Modification time                    */
    public native @ByRef @Cast("time_t*") Pointer ctime(); public native H5O_info2_t ctime(Pointer setter);     /* Change time                          */
    public native @ByRef @Cast("time_t*") Pointer btime(); public native H5O_info2_t btime(Pointer setter);     /* Birth time                           */
    public native @Cast("hsize_t") long num_attrs(); public native H5O_info2_t num_attrs(long setter); /* # of attributes attached to object   */
}
