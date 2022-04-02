// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TypeSpecProto extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TypeSpecProto(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TypeSpecProto(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TypeSpecProto position(long position) {
        return (TypeSpecProto)super.position(position);
    }
    @Override public TypeSpecProto getPointer(long i) {
        return new TypeSpecProto((Pointer)this).offsetAddress(i);
    }

  public TypeSpecProto() { super((Pointer)null); allocate(); }
  private native void allocate();

  public TypeSpecProto(@Const @ByRef TypeSpecProto from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef TypeSpecProto from);

  public native @ByRef @Name("operator =") TypeSpecProto put(@Const @ByRef TypeSpecProto from);

  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef TypeSpecProto default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const TypeSpecProto internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(TypeSpecProto other);
  

  // implements Message ----------------------------------------------

  public native TypeSpecProto New();

  public native TypeSpecProto New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef TypeSpecProto from);
  public native void MergeFrom(@Const @ByRef TypeSpecProto from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
//   #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
//   #else
  public native @Cast("bool") boolean MergePartialFromCodedStream(
        CodedInputStream input);
//   #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  public native void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") byte[] target);
  public native int GetCachedSize();

  public native @ByVal @Cast("google::protobuf::Metadata*") Pointer GetMetadata();

  // nested types ----------------------------------------------------
  @MemberGetter public static native @Cast("const tensorflow::TypeSpecProto::TypeSpecClass") int UNKNOWN();
  public static final int UNKNOWN = UNKNOWN();
  @MemberGetter public static native @Cast("const tensorflow::TypeSpecProto::TypeSpecClass") int SPARSE_TENSOR_SPEC();
  public static final int SPARSE_TENSOR_SPEC = SPARSE_TENSOR_SPEC();
  @MemberGetter public static native @Cast("const tensorflow::TypeSpecProto::TypeSpecClass") int INDEXED_SLICES_SPEC();
  public static final int INDEXED_SLICES_SPEC = INDEXED_SLICES_SPEC();
  @MemberGetter public static native @Cast("const tensorflow::TypeSpecProto::TypeSpecClass") int RAGGED_TENSOR_SPEC();
  public static final int RAGGED_TENSOR_SPEC = RAGGED_TENSOR_SPEC();
  @MemberGetter public static native @Cast("const tensorflow::TypeSpecProto::TypeSpecClass") int TENSOR_ARRAY_SPEC();
  public static final int TENSOR_ARRAY_SPEC = TENSOR_ARRAY_SPEC();
  @MemberGetter public static native @Cast("const tensorflow::TypeSpecProto::TypeSpecClass") int DATA_DATASET_SPEC();
  public static final int DATA_DATASET_SPEC = DATA_DATASET_SPEC();
  @MemberGetter public static native @Cast("const tensorflow::TypeSpecProto::TypeSpecClass") int DATA_ITERATOR_SPEC();
  public static final int DATA_ITERATOR_SPEC = DATA_ITERATOR_SPEC();
  @MemberGetter public static native @Cast("const tensorflow::TypeSpecProto::TypeSpecClass") int OPTIONAL_SPEC();
  public static final int OPTIONAL_SPEC = OPTIONAL_SPEC();
  @MemberGetter public static native @Cast("const tensorflow::TypeSpecProto::TypeSpecClass") int PER_REPLICA_SPEC();
  public static final int PER_REPLICA_SPEC = PER_REPLICA_SPEC();
  public static native @Cast("bool") boolean TypeSpecClass_IsValid(int value);
  @MemberGetter public static native @Cast("const tensorflow::TypeSpecProto::TypeSpecClass") int TypeSpecClass_MIN();
  public static final int TypeSpecClass_MIN = TypeSpecClass_MIN();
  @MemberGetter public static native @Cast("const tensorflow::TypeSpecProto::TypeSpecClass") int TypeSpecClass_MAX();
  public static final int TypeSpecClass_MAX = TypeSpecClass_MAX();
  @MemberGetter public static native int TypeSpecClass_ARRAYSIZE();
  public static final int TypeSpecClass_ARRAYSIZE = TypeSpecClass_ARRAYSIZE();
  public static native @Cast("const google::protobuf::EnumDescriptor*") Pointer TypeSpecClass_descriptor();
  public static native @Cast("bool") boolean TypeSpecClass_Parse(@StdString BytePointer name,
        @Cast("tensorflow::TypeSpecProto::TypeSpecClass*") IntPointer value);
  public static native @Cast("bool") boolean TypeSpecClass_Parse(@StdString String name,
        @Cast("tensorflow::TypeSpecProto::TypeSpecClass*") IntBuffer value);
  public static native @Cast("bool") boolean TypeSpecClass_Parse(@StdString BytePointer name,
        @Cast("tensorflow::TypeSpecProto::TypeSpecClass*") int... value);
  public static native @Cast("bool") boolean TypeSpecClass_Parse(@StdString String name,
        @Cast("tensorflow::TypeSpecProto::TypeSpecClass*") IntPointer value);
  public static native @Cast("bool") boolean TypeSpecClass_Parse(@StdString BytePointer name,
        @Cast("tensorflow::TypeSpecProto::TypeSpecClass*") IntBuffer value);
  public static native @Cast("bool") boolean TypeSpecClass_Parse(@StdString String name,
        @Cast("tensorflow::TypeSpecProto::TypeSpecClass*") int... value);

  // accessors -------------------------------------------------------

  // string type_spec_class_name = 3;
  public native void clear_type_spec_class_name();
  @MemberGetter public static native int kTypeSpecClassNameFieldNumber();
  public static final int kTypeSpecClassNameFieldNumber = kTypeSpecClassNameFieldNumber();
  public native @StdString BytePointer type_spec_class_name();
  public native void set_type_spec_class_name(@StdString BytePointer value);
  public native void set_type_spec_class_name(@StdString String value);
  public native void set_type_spec_class_name(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_type_spec_class_name(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_type_spec_class_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_type_spec_class_name();
  public native void set_allocated_type_spec_class_name(@StdString @Cast({"char*", "std::string*"}) BytePointer type_spec_class_name);

  // .tensorflow.StructuredValue type_state = 2;
  public native @Cast("bool") boolean has_type_state();
  public native void clear_type_state();
  @MemberGetter public static native int kTypeStateFieldNumber();
  public static final int kTypeStateFieldNumber = kTypeStateFieldNumber();
  public native @Const @ByRef StructuredValue type_state();
  public native StructuredValue release_type_state();
  public native StructuredValue mutable_type_state();
  public native void set_allocated_type_state(StructuredValue type_state);

  // .tensorflow.TypeSpecProto.TypeSpecClass type_spec_class = 1;
  public native void clear_type_spec_class();
  @MemberGetter public static native int kTypeSpecClassFieldNumber();
  public static final int kTypeSpecClassFieldNumber = kTypeSpecClassFieldNumber();
  public native @Cast("tensorflow::TypeSpecProto_TypeSpecClass") int type_spec_class();
  public native void set_type_spec_class(@Cast("tensorflow::TypeSpecProto_TypeSpecClass") int value);
}
