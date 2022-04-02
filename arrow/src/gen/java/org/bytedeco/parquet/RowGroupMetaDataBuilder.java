// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.parquet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.parquet.*;


@Namespace("parquet") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.parquet.class)
public class RowGroupMetaDataBuilder extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RowGroupMetaDataBuilder(Pointer p) { super(p); }

  // API convenience to get a MetaData reader
  public static native @UniquePtr RowGroupMetaDataBuilder Make(
        @SharedPtr WriterProperties props, @Const SchemaDescriptor schema_,
        Pointer contents);

  public native ColumnChunkMetaDataBuilder NextColumnChunk();
  public native int num_columns();
  public native @Cast("int64_t") long num_rows();
  public native int current_column();

  public native void set_num_rows(@Cast("int64_t") long num_rows);

  // commit the metadata
  public native void Finish(@Cast("int64_t") long total_bytes_written, short row_group_ordinal/*=-1*/);
  public native void Finish(@Cast("int64_t") long total_bytes_written);
}
