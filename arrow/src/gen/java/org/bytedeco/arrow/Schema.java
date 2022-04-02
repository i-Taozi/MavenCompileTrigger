// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \class Schema
 *  \brief Sequence of arrow::Field objects describing the columns of a record
 *  batch or table data structure */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class Schema extends Fingerprintable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Schema(Pointer p) { super(p); }

  public Schema(@ByVal FieldVector fields, Endianness endianness,
                    @SharedPtr @Cast({"const arrow::KeyValueMetadata*", "std::shared_ptr<const arrow::KeyValueMetadata>"}) KeyValueMetadata metadata/*=nullptr*/) { super((Pointer)null); allocate(fields, endianness, metadata); }
  private native void allocate(@ByVal FieldVector fields, Endianness endianness,
                    @SharedPtr @Cast({"const arrow::KeyValueMetadata*", "std::shared_ptr<const arrow::KeyValueMetadata>"}) KeyValueMetadata metadata/*=nullptr*/);
  public Schema(@ByVal FieldVector fields, Endianness endianness) { super((Pointer)null); allocate(fields, endianness); }
  private native void allocate(@ByVal FieldVector fields, Endianness endianness);
  public Schema(@ByVal FieldVector fields, @Cast("arrow::Endianness") int endianness,
                    @SharedPtr @Cast({"const arrow::KeyValueMetadata*", "std::shared_ptr<const arrow::KeyValueMetadata>"}) KeyValueMetadata metadata/*=nullptr*/) { super((Pointer)null); allocate(fields, endianness, metadata); }
  private native void allocate(@ByVal FieldVector fields, @Cast("arrow::Endianness") int endianness,
                    @SharedPtr @Cast({"const arrow::KeyValueMetadata*", "std::shared_ptr<const arrow::KeyValueMetadata>"}) KeyValueMetadata metadata/*=nullptr*/);
  public Schema(@ByVal FieldVector fields, @Cast("arrow::Endianness") int endianness) { super((Pointer)null); allocate(fields, endianness); }
  private native void allocate(@ByVal FieldVector fields, @Cast("arrow::Endianness") int endianness);

  public Schema(@ByVal FieldVector fields,
                    @SharedPtr @Cast({"const arrow::KeyValueMetadata*", "std::shared_ptr<const arrow::KeyValueMetadata>"}) KeyValueMetadata metadata/*=nullptr*/) { super((Pointer)null); allocate(fields, metadata); }
  private native void allocate(@ByVal FieldVector fields,
                    @SharedPtr @Cast({"const arrow::KeyValueMetadata*", "std::shared_ptr<const arrow::KeyValueMetadata>"}) KeyValueMetadata metadata/*=nullptr*/);
  public Schema(@ByVal FieldVector fields) { super((Pointer)null); allocate(fields); }
  private native void allocate(@ByVal FieldVector fields);

  public Schema(@Const @ByRef Schema arg0) { super((Pointer)null); allocate(arg0); }
  private native void allocate(@Const @ByRef Schema arg0);

  /** Returns true if all of the schema fields are equal */
  public native @Cast("bool") boolean Equals(@Const @ByRef Schema other, @Cast("bool") boolean check_metadata/*=false*/);
  public native @Cast("bool") boolean Equals(@Const @ByRef Schema other);

  /** \brief Set endianness in the schema
   * 
   *  @return new Schema */
  public native @SharedPtr @ByVal Schema WithEndianness(Endianness endianness);
  public native @SharedPtr @ByVal Schema WithEndianness(@Cast("arrow::Endianness") int endianness);

  /** \brief Return endianness in the schema */
  public native Endianness endianness();

  /** \brief Indicate if endianness is equal to platform-native endianness */
  public native @Cast("bool") boolean is_native_endian();

  /** \brief Return the number of fields (columns) in the schema */
  public native int num_fields();

  /** Return the ith schema element. Does not boundscheck */
  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::Field>"}) Field field(int i);

  public native @Const @ByRef FieldVector fields();

  public native @ByVal StringVector field_names();

  /** Returns null if name not found */
  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::Field>"}) Field GetFieldByName(@StdString String name);
  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::Field>"}) Field GetFieldByName(@StdString BytePointer name);

  /** \brief Return the indices of all fields having this name in sorted order */
  public native @ByVal FieldVector GetAllFieldsByName(@StdString String name);
  public native @ByVal FieldVector GetAllFieldsByName(@StdString BytePointer name);

  /** Returns -1 if name not found */
  public native int GetFieldIndex(@StdString String name);
  public native int GetFieldIndex(@StdString BytePointer name);

  /** Return the indices of all fields having this name */
  public native @StdVector IntPointer GetAllFieldIndices(@StdString String name);
  public native @StdVector IntBuffer GetAllFieldIndices(@StdString BytePointer name);

  /** Indicate if fields named {@code names} can be found unambiguously in the schema. */
  
  ///
  public native @ByVal Status CanReferenceFieldsByNames(@Const @ByRef StringVector names);

  /** \brief The custom key-value metadata, if any
   * 
   *  @return metadata may be null */
  public native @SharedPtr @Cast({"const arrow::KeyValueMetadata*", "std::shared_ptr<const arrow::KeyValueMetadata>"}) KeyValueMetadata metadata();

  /** \brief Render a string representation of the schema suitable for debugging
   *  @param show_metadata [in] when true, if KeyValueMetadata is non-empty,
   *  print keys and values in the output */
  public native @StdString String ToString(@Cast("bool") boolean show_metadata/*=false*/);
  public native @StdString String ToString();

  public native @ByVal SchemaResult AddField(int i,
                                             @SharedPtr @Cast({"", "std::shared_ptr<arrow::Field>"}) Field field);
  public native @ByVal SchemaResult RemoveField(int i);
  
  ///
  public native @ByVal SchemaResult SetField(int i,
                                             @SharedPtr @Cast({"", "std::shared_ptr<arrow::Field>"}) Field field);

  /** \brief Replace key-value metadata with new metadata
   * 
   *  @param metadata [in] new KeyValueMetadata
   *  @return new Schema */
  public native @SharedPtr @ByVal Schema WithMetadata(
        @SharedPtr @Cast({"const arrow::KeyValueMetadata*", "std::shared_ptr<const arrow::KeyValueMetadata>"}) KeyValueMetadata metadata);

  /** \brief Return copy of Schema without the KeyValueMetadata */
  public native @SharedPtr @ByVal Schema RemoveMetadata();

  /** \brief Indicate that the Schema has non-empty KevValueMetadata */
  public native @Cast("bool") boolean HasMetadata();

  /** \brief Indicate that the Schema has distinct field names. */
  public native @Cast("bool") boolean HasDistinctFieldNames();
}
