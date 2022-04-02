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
public class RowGroupWriter extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RowGroupWriter(Pointer p) { super(p); }

  // Forward declare a virtual class 'Contents' to aid dependency injection and more
  // easily create test fixtures
  // An implementation of the Contents class is defined in the .cc file
  public static class Contents extends Pointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Contents(Pointer p) { super(p); }
  
    public native int num_columns();
    public native @Cast("int64_t") long num_rows();

    // to be used only with ParquetFileWriter::AppendRowGroup
    public native ColumnWriter NextColumn();
    // to be used only with ParquetFileWriter::AppendBufferedRowGroup
    public native ColumnWriter column(int i);

    public native int current_column();
    public native void Close();

    // total bytes written by the page writer
    public native @Cast("int64_t") long total_bytes_written();
    // total bytes still compressed but not written
    public native @Cast("int64_t") long total_compressed_bytes();
  }

  
  ///
  public RowGroupWriter(@UniquePtr Contents contents) { super((Pointer)null); allocate(contents); }
  private native void allocate(@UniquePtr Contents contents);

  /** Construct a ColumnWriter for the indicated row group-relative column.
   * 
   *  To be used only with ParquetFileWriter::AppendRowGroup
   *  Ownership is solely within the RowGroupWriter. The ColumnWriter is only
   *  valid until the next call to NextColumn or Close. As the contents are
   *  directly written to the sink, once a new column is started, the contents
   *  of the previous one cannot be modified anymore. */
  public native ColumnWriter NextColumn();
  /** Index of currently written column. Equal to -1 if NextColumn()
   *  has not been called yet. */
  public native int current_column();
  public native void Close();

  
  ///
  public native int num_columns();

  /** Construct a ColumnWriter for the indicated row group column.
   * 
   *  To be used only with ParquetFileWriter::AppendBufferedRowGroup
   *  Ownership is solely within the RowGroupWriter. The ColumnWriter is
   *  valid until Close. The contents are buffered in memory and written to sink
   *  on Close */
  public native ColumnWriter column(int i);

  /**
   * Number of rows that shall be written as part of this RowGroup.
   */
  public native @Cast("int64_t") long num_rows();

  public native @Cast("int64_t") long total_bytes_written();
  public native @Cast("int64_t") long total_compressed_bytes();
}
