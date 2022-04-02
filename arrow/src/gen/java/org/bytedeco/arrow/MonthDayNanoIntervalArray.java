// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief Array of Month, Day and nanosecond values. */
@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class MonthDayNanoIntervalArray extends PrimitiveArray {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MonthDayNanoIntervalArray(Pointer p) { super(p); }


  public MonthDayNanoIntervalArray(@SharedPtr @Cast({"", "std::shared_ptr<arrow::ArrayData>"}) ArrayData data) { super((Pointer)null); allocate(data); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::ArrayData>"}) ArrayData data);

  public MonthDayNanoIntervalArray(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length,
                              @SharedPtr ArrowBuffer data,
                              @SharedPtr ArrowBuffer null_bitmap/*=nullptr*/,
                              @Cast("int64_t") long null_count/*=arrow::kUnknownNullCount*/, @Cast("int64_t") long offset/*=0*/) { super((Pointer)null); allocate(type, length, data, null_bitmap, null_count, offset); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length,
                              @SharedPtr ArrowBuffer data,
                              @SharedPtr ArrowBuffer null_bitmap/*=nullptr*/,
                              @Cast("int64_t") long null_count/*=arrow::kUnknownNullCount*/, @Cast("int64_t") long offset/*=0*/);
  public MonthDayNanoIntervalArray(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length,
                              @SharedPtr ArrowBuffer data) { super((Pointer)null); allocate(type, length, data); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length,
                              @SharedPtr ArrowBuffer data);

  public MonthDayNanoIntervalArray(@Cast("int64_t") long length, @SharedPtr ArrowBuffer data,
                              @SharedPtr ArrowBuffer null_bitmap/*=nullptr*/,
                              @Cast("int64_t") long null_count/*=arrow::kUnknownNullCount*/, @Cast("int64_t") long offset/*=0*/) { super((Pointer)null); allocate(length, data, null_bitmap, null_count, offset); }
  private native void allocate(@Cast("int64_t") long length, @SharedPtr ArrowBuffer data,
                              @SharedPtr ArrowBuffer null_bitmap/*=nullptr*/,
                              @Cast("int64_t") long null_count/*=arrow::kUnknownNullCount*/, @Cast("int64_t") long offset/*=0*/);
  public MonthDayNanoIntervalArray(@Cast("int64_t") long length, @SharedPtr ArrowBuffer data) { super((Pointer)null); allocate(length, data); }
  private native void allocate(@Cast("int64_t") long length, @SharedPtr ArrowBuffer data);

  public native @ByVal MonthDayNanoIntervalType.MonthDayNanos GetValue(@Cast("int64_t") long i);
  public native @ByVal MonthDayNanoIntervalType.MonthDayNanos Value(@Cast("int64_t") long i);

  // For compatibility with Take kernel.
  public native @ByVal MonthDayNanoIntervalType.MonthDayNanos GetView(@Cast("int64_t") long i);

  public native int byte_width();

  public native @Cast("const uint8_t*") BytePointer raw_values();
}
