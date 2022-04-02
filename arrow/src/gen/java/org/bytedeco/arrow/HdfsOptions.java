// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** Options for the HDFS implementation. */
@Namespace("arrow::fs") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class HdfsOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public HdfsOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public HdfsOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public HdfsOptions position(long position) {
        return (HdfsOptions)super.position(position);
    }
    @Override public HdfsOptions getPointer(long i) {
        return new HdfsOptions((Pointer)this).offsetAddress(i);
    }

  public HdfsOptions() { super((Pointer)null); allocate(); }
  private native void allocate();

  /** Hdfs configuration options, contains host, port, driver */
  public native @ByRef HdfsConnectionConfig connection_config(); public native HdfsOptions connection_config(HdfsConnectionConfig setter);

  /** Used by Hdfs OpenWritable Interface. */
  public native int buffer_size(); public native HdfsOptions buffer_size(int setter);
  public native short replication(); public native HdfsOptions replication(short setter);
  public native @Cast("int64_t") long default_block_size(); public native HdfsOptions default_block_size(long setter);

  public native void ConfigureEndPoint(@StdString String host, int port);
  public native void ConfigureEndPoint(@StdString BytePointer host, int port);
  public native void ConfigureReplication(short replication);
  public native void ConfigureUser(@StdString String user_name);
  public native void ConfigureUser(@StdString BytePointer user_name);
  public native void ConfigureBufferSize(int buffer_size);
  public native void ConfigureBlockSize(@Cast("int64_t") long default_block_size);
  public native void ConfigureKerberosTicketCachePath(@StdString String path);
  public native void ConfigureKerberosTicketCachePath(@StdString BytePointer path);
  public native void ConfigureExtraConf(@StdString String key, @StdString String val);
  public native void ConfigureExtraConf(@StdString BytePointer key, @StdString BytePointer val);

  public native @Cast("bool") boolean Equals(@Const @ByRef HdfsOptions other);

  public static native @ByVal HDFSOptionsResult FromUri(@Const @ByRef Uri uri);
  public static native @ByVal HDFSOptionsResult FromUri(@StdString String uri);
  public static native @ByVal HDFSOptionsResult FromUri(@StdString BytePointer uri);
}
