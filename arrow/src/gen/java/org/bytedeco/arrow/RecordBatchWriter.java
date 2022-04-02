// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \class RecordBatchWriter
 *  \brief Abstract interface for writing a stream of record batches */
@Namespace("arrow::ipc") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class RecordBatchWriter extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RecordBatchWriter(Pointer p) { super(p); }


  /** \brief Write a record batch to the stream
   * 
   *  @param batch [in] the record batch to write to the stream
   *  @return Status */
  public native @ByVal Status WriteRecordBatch(@Const @ByRef RecordBatch batch);

  /** \brief Write possibly-chunked table by creating sequence of record batches
   *  @param table [in] table to write
   *  @return Status */
  public native @ByVal Status WriteTable(@Const @ByRef Table table);

  /** \brief Write Table with a particular chunksize
   *  @param table [in] table to write
   *  @param max_chunksize [in] maximum length of table chunks. To indicate
   *  that no maximum should be enforced, pass -1.
   *  @return Status */
  
  ///
  public native @ByVal Status WriteTable(@Const @ByRef Table table, @Cast("int64_t") long max_chunksize);

  /** \brief Perform any logic necessary to finish the stream
   * 
   *  @return Status */
  public native @ByVal Status Close();

  /** \brief Return current write statistics */
  public native @ByVal WriteStats stats();
}
