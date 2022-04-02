// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;


@NoOffset @Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class PacketTable extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PacketTable(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PacketTable(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public PacketTable position(long position) {
        return (PacketTable)super.position(position);
    }
    @Override public PacketTable getPointer(long i) {
        return new PacketTable((Pointer)this).offsetAddress(i);
    }

    /* Null constructor
     * Sets table_id to "invalid"
     */
    public PacketTable() { super((Pointer)null); allocate(); }
    private native void allocate();

    /* "Open" Constructor
     * Opens an existing packet table, which can contain either fixed-length or
     * variable-length packets.
     */
    public PacketTable(@Cast("hid_t") long fileID, @Cast("const char*") BytePointer name) { super((Pointer)null); allocate(fileID, name); }
    private native void allocate(@Cast("hid_t") long fileID, @Cast("const char*") BytePointer name);
    public PacketTable(@Cast("hid_t") long fileID, String name) { super((Pointer)null); allocate(fileID, name); }
    private native void allocate(@Cast("hid_t") long fileID, String name);

    /* "Open" Constructor - will be deprecated because of char* name */
    public PacketTable(@Cast("hid_t") long fileID, @Cast("char*") ByteBuffer name) { super((Pointer)null); allocate(fileID, name); }
    private native void allocate(@Cast("hid_t") long fileID, @Cast("char*") ByteBuffer name);
    public PacketTable(@Cast("hid_t") long fileID, @Cast("char*") byte[] name) { super((Pointer)null); allocate(fileID, name); }
    private native void allocate(@Cast("hid_t") long fileID, @Cast("char*") byte[] name);

    /* Destructor
     * Cleans up the packet table
     */

    /* IsValid
     * Returns true if this packet table is valid, false otherwise.
     * Use this after the constructor to ensure HDF did not have
     * any trouble making or opening the packet table.
     */
    public native @Cast("bool") boolean IsValid();

    /* IsVariableLength
     * Return 1 if this packet table uses variable-length datatype,
     * return 0 if it is Fixed Length.  Returns -1 if the table is
     * invalid (not open).
     */
    public native int IsVariableLength();

    /* ResetIndex
     * Sets the "current packet" index to point to the first packet in the
     * packet table
     */
    public native void ResetIndex();

    /* SetIndex
     * Sets the current packet to point to the packet specified by index.
     * Returns 0 on success, negative on failure (if index is out of bounds)
     */
    public native int SetIndex(@Cast("hsize_t") long index);

    /* GetIndex
     * Returns the position of the current packet.
     * On failure, returns 0 and error is set to negative.
     */
    public native @Cast("hsize_t") long GetIndex(@ByRef IntPointer error);
    public native @Cast("hsize_t") long GetIndex(@ByRef IntBuffer error);
    public native @Cast("hsize_t") long GetIndex(@ByRef int[] error);

    /* GetPacketCount
     * Returns the number of packets in the packet table.  Error
     * is set to 0 on success.  On failure, returns 0 and
     * error is set to negative.
     */
    public native @Cast("hsize_t") long GetPacketCount(@ByRef IntPointer error);
    public native @Cast("hsize_t") long GetPacketCount(@ByRef IntBuffer error);
    public native @Cast("hsize_t") long GetPacketCount(@ByRef int[] error);

    public native @Cast("hsize_t") long GetPacketCount();

    /* GetTableId
     * Returns the identifier of the packet table.
     */
    public native @Cast("hid_t") long GetTableId();

    /* GetDatatype
     * Returns the datatype identifier used by the packet table, on success,
     * or FAIL, on failure.
     * Note: it is best to avoid using this identifier in applications, unless
     * the desired functionality cannot be performed via the packet table ID.
     */
    public native @Cast("hid_t") long GetDatatype();

    /* GetDataset
     * Returns the dataset identifier associated with the packet table, on
     * success, or FAIL, on failure.
     * Note: it is best to avoid using this identifier in applications, unless
     * the desired functionality cannot be performed via the packet table ID.
     */
    public native @Cast("hid_t") long GetDataset();

    /* FreeBuff
     * Frees the buffers created when variable-length packets are read.
     * Takes the number of hvl_t structs to be freed and a pointer to their
     * location in memory.
     * Returns 0 on success, negative on error.
     */
    public native int FreeBuff(@Cast("size_t") long numStructs, hvl_t buffer);
}
