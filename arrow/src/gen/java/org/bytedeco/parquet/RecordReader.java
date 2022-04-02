// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.parquet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.parquet.*;


/** \brief Stateful column reader that delimits semantic records for both flat
 *  and nested columns
 * 
 *  \note API EXPERIMENTAL
 *  @since 1.3.0 */
@Namespace("parquet::internal") @Properties(inherit = org.bytedeco.arrow.presets.parquet.class)
public class RecordReader extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RecordReader(Pointer p) { super(p); }

  public static native @SharedPtr RecordReader Make(
        @Const ColumnDescriptor descr, @ByVal LevelInfo leaf_info,
        MemoryPool pool/*=arrow::default_memory_pool()*/,
        @Cast("const bool") boolean read_dictionary/*=false*/);
  public static native @SharedPtr RecordReader Make(
        @Const ColumnDescriptor descr, @ByVal LevelInfo leaf_info);

  /** \brief Attempt to read indicated number of records from column chunk
   *  @return number of records read */
  public native @Cast("int64_t") long ReadRecords(@Cast("int64_t") long num_records);

  /** \brief Pre-allocate space for data. Results in better flat read performance */
  public native void Reserve(@Cast("int64_t") long num_values);

  /** \brief Clear consumed values and repetition/definition levels as the
   *  result of calling ReadRecords */
  public native void Reset();

  /** \brief Transfer filled values buffer to caller. A new one will be
   *  allocated in subsequent ReadRecords calls */
  public native @SharedPtr ResizableBuffer ReleaseValues();

  /** \brief Transfer filled validity bitmap buffer to caller. A new one will
   *  be allocated in subsequent ReadRecords calls */
  public native @SharedPtr ResizableBuffer ReleaseIsValid();

  /** \brief Return true if the record reader has more internal data yet to
   *  process */
  public native @Cast("bool") boolean HasMoreData();

  /** \brief Advance record reader to the next row group
   *  @param reader [in] obtained from RowGroupReader::GetColumnPageReader */
  public native void SetPageReader(@UniquePtr PageReader reader);

  public native void DebugPrintState();

  /** \brief Decoded definition levels */
  public native ShortPointer def_levels();

  /** \brief Decoded repetition levels */
  public native ShortPointer rep_levels();

  /** \brief Decoded values, including nulls, if any */
  public native @Cast("uint8_t*") BytePointer values();

  /** \brief Number of values written including nulls (if any) */
  public native @Cast("int64_t") long values_written();

  /** \brief Number of definition / repetition levels (from those that have
   *  been decoded) that have been consumed inside the reader. */
  public native @Cast("int64_t") long levels_position();

  /** \brief Number of definition / repetition levels that have been written
   *  internally in the reader */
  public native @Cast("int64_t") long levels_written();

  /** \brief Number of nulls in the leaf */
  public native @Cast("int64_t") long null_count();

  /** \brief True if the leaf values are nullable */
  public native @Cast("bool") boolean nullable_values();

  /** \brief True if reading directly as Arrow dictionary-encoded */
  public native @Cast("bool") boolean read_dictionary();
}
