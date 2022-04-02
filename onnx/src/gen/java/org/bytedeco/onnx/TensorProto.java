// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;

// -------------------------------------------------------------------

@Namespace("onnx") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class TensorProto extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorProto(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TensorProto(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TensorProto position(long position) {
        return (TensorProto)super.position(position);
    }
    @Override public TensorProto getPointer(long i) {
        return new TensorProto((Pointer)this).offsetAddress(i);
    }

  public TensorProto() { super((Pointer)null); allocate(); }
  private native void allocate();

  public TensorProto(@Const @ByRef TensorProto from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef TensorProto from);

  public native @ByRef @Name("operator =") TensorProto put(@Const @ByRef TensorProto from);

  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Const Reflection GetReflection();
  public static native @Const @ByRef TensorProto default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const TensorProto internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  
  public native void Swap(TensorProto other);

  // implements Message ----------------------------------------------

  public native TensorProto New();

  public native TensorProto New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef TensorProto from);
  public native void MergeFrom(@Const @ByRef TensorProto from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
  public native @Cast("const char*") BytePointer _InternalParse(@Cast("const char*") BytePointer ptr, ParseContext ctx);
  public native String _InternalParse(String ptr, ParseContext ctx);
  public native int GetCachedSize();

  public native @ByVal @Cast("google::protobuf::Metadata*") Pointer GetMetadata();

  // nested types ----------------------------------------------------
  @MemberGetter public static native @Cast("const onnx::TensorProto::DataType") int UNDEFINED();
  public static final int UNDEFINED = UNDEFINED();
  @MemberGetter public static native @Cast("const onnx::TensorProto::DataType") int FLOAT();
  public static final int FLOAT = FLOAT();
  @MemberGetter public static native @Cast("const onnx::TensorProto::DataType") int UINT8();
  public static final int UINT8 = UINT8();
  @MemberGetter public static native @Cast("const onnx::TensorProto::DataType") int INT8();
  public static final int INT8 = INT8();
  @MemberGetter public static native @Cast("const onnx::TensorProto::DataType") int UINT16();
  public static final int UINT16 = UINT16();
  @MemberGetter public static native @Cast("const onnx::TensorProto::DataType") int INT16();
  public static final int INT16 = INT16();
  @MemberGetter public static native @Cast("const onnx::TensorProto::DataType") int INT32();
  public static final int INT32 = INT32();
  @MemberGetter public static native @Cast("const onnx::TensorProto::DataType") int INT64();
  public static final int INT64 = INT64();
  @MemberGetter public static native @Cast("const onnx::TensorProto::DataType") int STRING();
  public static final int STRING = STRING();
  @MemberGetter public static native @Cast("const onnx::TensorProto::DataType") int BOOL();
  public static final int BOOL = BOOL();
  @MemberGetter public static native @Cast("const onnx::TensorProto::DataType") int FLOAT16();
  public static final int FLOAT16 = FLOAT16();
  @MemberGetter public static native @Cast("const onnx::TensorProto::DataType") int DOUBLE();
  public static final int DOUBLE = DOUBLE();
  @MemberGetter public static native @Cast("const onnx::TensorProto::DataType") int UINT32();
  public static final int UINT32 = UINT32();
  @MemberGetter public static native @Cast("const onnx::TensorProto::DataType") int UINT64();
  public static final int UINT64 = UINT64();
  @MemberGetter public static native @Cast("const onnx::TensorProto::DataType") int COMPLEX64();
  public static final int COMPLEX64 = COMPLEX64();
  @MemberGetter public static native @Cast("const onnx::TensorProto::DataType") int COMPLEX128();
  public static final int COMPLEX128 = COMPLEX128();
  @MemberGetter public static native @Cast("const onnx::TensorProto::DataType") int BFLOAT16();
  public static final int BFLOAT16 = BFLOAT16();
  public static native @Cast("bool") boolean DataType_IsValid(int value);
  @MemberGetter public static native @Cast("const onnx::TensorProto::DataType") int DataType_MIN();
  public static final int DataType_MIN = DataType_MIN();
  @MemberGetter public static native @Cast("const onnx::TensorProto::DataType") int DataType_MAX();
  public static final int DataType_MAX = DataType_MAX();
  @MemberGetter public static native int DataType_ARRAYSIZE();
  public static final int DataType_ARRAYSIZE = DataType_ARRAYSIZE();
  public static native @Const EnumDescriptor DataType_descriptor();
  public static native @Cast("bool") boolean DataType_Parse(@StdString BytePointer name,
        @Cast("onnx::TensorProto::DataType*") IntPointer value);
  public static native @Cast("bool") boolean DataType_Parse(@StdString String name,
        @Cast("onnx::TensorProto::DataType*") IntBuffer value);
  public static native @Cast("bool") boolean DataType_Parse(@StdString BytePointer name,
        @Cast("onnx::TensorProto::DataType*") int... value);
  public static native @Cast("bool") boolean DataType_Parse(@StdString String name,
        @Cast("onnx::TensorProto::DataType*") IntPointer value);
  public static native @Cast("bool") boolean DataType_Parse(@StdString BytePointer name,
        @Cast("onnx::TensorProto::DataType*") IntBuffer value);
  public static native @Cast("bool") boolean DataType_Parse(@StdString String name,
        @Cast("onnx::TensorProto::DataType*") int... value);
  @MemberGetter public static native @Cast("const onnx::TensorProto::DataLocation") int DEFAULT();
  public static final int DEFAULT = DEFAULT();
  @MemberGetter public static native @Cast("const onnx::TensorProto::DataLocation") int EXTERNAL();
  public static final int EXTERNAL = EXTERNAL();
  public static native @Cast("bool") boolean DataLocation_IsValid(int value);
  @MemberGetter public static native @Cast("const onnx::TensorProto::DataLocation") int DataLocation_MIN();
  public static final int DataLocation_MIN = DataLocation_MIN();
  @MemberGetter public static native @Cast("const onnx::TensorProto::DataLocation") int DataLocation_MAX();
  public static final int DataLocation_MAX = DataLocation_MAX();
  @MemberGetter public static native int DataLocation_ARRAYSIZE();
  public static final int DataLocation_ARRAYSIZE = DataLocation_ARRAYSIZE();
  public static native @Const EnumDescriptor DataLocation_descriptor();
  public static native @Cast("bool") boolean DataLocation_Parse(@StdString BytePointer name,
        @Cast("onnx::TensorProto::DataLocation*") IntPointer value);
  public static native @Cast("bool") boolean DataLocation_Parse(@StdString String name,
        @Cast("onnx::TensorProto::DataLocation*") IntBuffer value);
  public static native @Cast("bool") boolean DataLocation_Parse(@StdString BytePointer name,
        @Cast("onnx::TensorProto::DataLocation*") int[] value);
  public static native @Cast("bool") boolean DataLocation_Parse(@StdString String name,
        @Cast("onnx::TensorProto::DataLocation*") IntPointer value);
  public static native @Cast("bool") boolean DataLocation_Parse(@StdString BytePointer name,
        @Cast("onnx::TensorProto::DataLocation*") IntBuffer value);
  public static native @Cast("bool") boolean DataLocation_Parse(@StdString String name,
        @Cast("onnx::TensorProto::DataLocation*") int[] value);

  // accessors -------------------------------------------------------

  /** enum onnx::TensorProto:: */
  public static final int
    kDimsFieldNumber = 1,
    kFloatDataFieldNumber = 4,
    kInt32DataFieldNumber = 5,
    kStringDataFieldNumber = 6,
    kInt64DataFieldNumber = 7,
    kDoubleDataFieldNumber = 10,
    kUint64DataFieldNumber = 11,
    kExternalDataFieldNumber = 13,
    kNameFieldNumber = 8,
    kRawDataFieldNumber = 9,
    kDocStringFieldNumber = 12,
    kSegmentFieldNumber = 3,
    kDataTypeFieldNumber = 2,
    kDataLocationFieldNumber = 14;
  // repeated int64 dims = 1;
  public native int dims_size();
  public native void clear_dims();
  public native @Cast("google::protobuf::int64") long dims(int index);
  public native void set_dims(int index, @Cast("google::protobuf::int64") long value);
  public native void add_dims(@Cast("google::protobuf::int64") long value);

  // repeated float float_data = 4 [packed = true];
  public native int float_data_size();
  public native void clear_float_data();
  public native float float_data(int index);
  public native void set_float_data(int index, float value);
  public native void add_float_data(float value);

  // repeated int32 int32_data = 5 [packed = true];
  public native int int32_data_size();
  public native void clear_int32_data();
  public native @Cast("google::protobuf::int32") int int32_data(int index);
  public native void set_int32_data(int index, @Cast("google::protobuf::int32") int value);
  public native void add_int32_data(@Cast("google::protobuf::int32") int value);

  // repeated bytes string_data = 6;
  public native int string_data_size();
  public native void clear_string_data();
  public native @StdString BytePointer string_data(int index);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_string_data(int index);
  public native void set_string_data(int index, @StdString BytePointer value);
  public native void set_string_data(int index, @StdString String value);
  public native void set_string_data(int index, @Const Pointer value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer add_string_data();
  public native void add_string_data(@StdString BytePointer value);
  public native void add_string_data(@StdString String value);
  public native void add_string_data(@Const Pointer value, @Cast("size_t") long size);

  // repeated int64 int64_data = 7 [packed = true];
  public native int int64_data_size();
  public native void clear_int64_data();
  public native @Cast("google::protobuf::int64") long int64_data(int index);
  public native void set_int64_data(int index, @Cast("google::protobuf::int64") long value);
  public native void add_int64_data(@Cast("google::protobuf::int64") long value);

  // repeated double double_data = 10 [packed = true];
  public native int double_data_size();
  public native void clear_double_data();
  public native double double_data(int index);
  public native void set_double_data(int index, double value);
  public native void add_double_data(double value);

  // repeated uint64 uint64_data = 11 [packed = true];
  public native int uint64_data_size();
  public native void clear_uint64_data();
  public native @Cast("google::protobuf::uint64") long uint64_data(int index);
  public native void set_uint64_data(int index, @Cast("google::protobuf::uint64") long value);
  public native void add_uint64_data(@Cast("google::protobuf::uint64") long value);

  // repeated .onnx.StringStringEntryProto external_data = 13;
  public native int external_data_size();
  public native void clear_external_data();
  public native StringStringEntryProto mutable_external_data(int index);
  public native @Const @ByRef StringStringEntryProto external_data(int index);
  public native StringStringEntryProto add_external_data();

  // optional string name = 8;
  public native @Cast("bool") boolean has_name();
  public native void clear_name();
  public native @StdString BytePointer name();
  public native void set_name(@StdString BytePointer value);
  public native void set_name(@StdString String value);
  public native void set_name(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_name(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_name();
  public native void set_allocated_name(@StdString @Cast({"char*", "std::string*"}) BytePointer name);

  // optional bytes raw_data = 9;
  public native @Cast("bool") boolean has_raw_data();
  public native void clear_raw_data();
  public native @StdString BytePointer raw_data();
  public native void set_raw_data(@StdString BytePointer value);
  public native void set_raw_data(@StdString String value);
  public native void set_raw_data(@Const Pointer value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_raw_data();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_raw_data();
  public native void set_allocated_raw_data(@StdString @Cast({"char*", "std::string*"}) BytePointer raw_data);

  // optional string doc_string = 12;
  public native @Cast("bool") boolean has_doc_string();
  public native void clear_doc_string();
  public native @StdString BytePointer doc_string();
  public native void set_doc_string(@StdString BytePointer value);
  public native void set_doc_string(@StdString String value);
  public native void set_doc_string(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_doc_string(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_doc_string();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_doc_string();
  public native void set_allocated_doc_string(@StdString @Cast({"char*", "std::string*"}) BytePointer doc_string);

  // optional .onnx.TensorProto.Segment segment = 3;
  public native @Cast("bool") boolean has_segment();
  public native void clear_segment();
  public native @Const @ByRef TensorProto_Segment segment();
  public native TensorProto_Segment release_segment();
  public native TensorProto_Segment mutable_segment();
  public native void set_allocated_segment(TensorProto_Segment segment);

  // optional int32 data_type = 2;
  public native @Cast("bool") boolean has_data_type();
  public native void clear_data_type();
  public native @Cast("google::protobuf::int32") int data_type();
  public native void set_data_type(@Cast("google::protobuf::int32") int value);

  // optional .onnx.TensorProto.DataLocation data_location = 14;
  public native @Cast("bool") boolean has_data_location();
  public native void clear_data_location();
  public native @Cast("onnx::TensorProto_DataLocation") int data_location();
  public native void set_data_location(@Cast("onnx::TensorProto_DataLocation") int value);
}
