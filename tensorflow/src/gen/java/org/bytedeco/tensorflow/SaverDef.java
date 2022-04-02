// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// ===================================================================

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SaverDef extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SaverDef(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SaverDef(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SaverDef position(long position) {
        return (SaverDef)super.position(position);
    }
    @Override public SaverDef getPointer(long i) {
        return new SaverDef((Pointer)this).offsetAddress(i);
    }

  public SaverDef() { super((Pointer)null); allocate(); }
  private native void allocate();

  public SaverDef(@Const @ByRef SaverDef from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef SaverDef from);

  public native @ByRef @Name("operator =") SaverDef put(@Const @ByRef SaverDef from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef SaverDef default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const SaverDef internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(SaverDef other);
  public native void Swap(SaverDef other);
  

  // implements Message ----------------------------------------------

  public native SaverDef New();

  public native SaverDef New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef SaverDef from);
  public native void MergeFrom(@Const @ByRef SaverDef from);
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
  @MemberGetter public static native @Cast("const tensorflow::SaverDef::CheckpointFormatVersion") int LEGACY();
  public static final int LEGACY = LEGACY();
  @MemberGetter public static native @Cast("const tensorflow::SaverDef::CheckpointFormatVersion") int V1();
  public static final int V1 = V1();
  @MemberGetter public static native @Cast("const tensorflow::SaverDef::CheckpointFormatVersion") int V2();
  public static final int V2 = V2();
  public static native @Cast("bool") boolean CheckpointFormatVersion_IsValid(int value);
  @MemberGetter public static native @Cast("const tensorflow::SaverDef::CheckpointFormatVersion") int CheckpointFormatVersion_MIN();
  public static final int CheckpointFormatVersion_MIN = CheckpointFormatVersion_MIN();
  @MemberGetter public static native @Cast("const tensorflow::SaverDef::CheckpointFormatVersion") int CheckpointFormatVersion_MAX();
  public static final int CheckpointFormatVersion_MAX = CheckpointFormatVersion_MAX();
  @MemberGetter public static native int CheckpointFormatVersion_ARRAYSIZE();
  public static final int CheckpointFormatVersion_ARRAYSIZE = CheckpointFormatVersion_ARRAYSIZE();
  public static native @Cast("const google::protobuf::EnumDescriptor*") Pointer CheckpointFormatVersion_descriptor();
  public static native @Cast("bool") boolean CheckpointFormatVersion_Parse(@StdString BytePointer name,
        @Cast("tensorflow::SaverDef::CheckpointFormatVersion*") IntPointer value);
  public static native @Cast("bool") boolean CheckpointFormatVersion_Parse(@StdString String name,
        @Cast("tensorflow::SaverDef::CheckpointFormatVersion*") IntBuffer value);
  public static native @Cast("bool") boolean CheckpointFormatVersion_Parse(@StdString BytePointer name,
        @Cast("tensorflow::SaverDef::CheckpointFormatVersion*") int... value);
  public static native @Cast("bool") boolean CheckpointFormatVersion_Parse(@StdString String name,
        @Cast("tensorflow::SaverDef::CheckpointFormatVersion*") IntPointer value);
  public static native @Cast("bool") boolean CheckpointFormatVersion_Parse(@StdString BytePointer name,
        @Cast("tensorflow::SaverDef::CheckpointFormatVersion*") IntBuffer value);
  public static native @Cast("bool") boolean CheckpointFormatVersion_Parse(@StdString String name,
        @Cast("tensorflow::SaverDef::CheckpointFormatVersion*") int... value);

  // accessors -------------------------------------------------------

  // string filename_tensor_name = 1;
  public native void clear_filename_tensor_name();
  @MemberGetter public static native int kFilenameTensorNameFieldNumber();
  public static final int kFilenameTensorNameFieldNumber = kFilenameTensorNameFieldNumber();
  public native @StdString BytePointer filename_tensor_name();
  public native void set_filename_tensor_name(@StdString BytePointer value);
  public native void set_filename_tensor_name(@StdString String value);
  public native void set_filename_tensor_name(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_filename_tensor_name(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_filename_tensor_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_filename_tensor_name();
  public native void set_allocated_filename_tensor_name(@StdString @Cast({"char*", "std::string*"}) BytePointer filename_tensor_name);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_filename_tensor_name();
  public native void unsafe_arena_set_allocated_filename_tensor_name(
        @StdString @Cast({"char*", "std::string*"}) BytePointer filename_tensor_name);

  // string save_tensor_name = 2;
  public native void clear_save_tensor_name();
  @MemberGetter public static native int kSaveTensorNameFieldNumber();
  public static final int kSaveTensorNameFieldNumber = kSaveTensorNameFieldNumber();
  public native @StdString BytePointer save_tensor_name();
  public native void set_save_tensor_name(@StdString BytePointer value);
  public native void set_save_tensor_name(@StdString String value);
  public native void set_save_tensor_name(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_save_tensor_name(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_save_tensor_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_save_tensor_name();
  public native void set_allocated_save_tensor_name(@StdString @Cast({"char*", "std::string*"}) BytePointer save_tensor_name);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_save_tensor_name();
  public native void unsafe_arena_set_allocated_save_tensor_name(
        @StdString @Cast({"char*", "std::string*"}) BytePointer save_tensor_name);

  // string restore_op_name = 3;
  public native void clear_restore_op_name();
  @MemberGetter public static native int kRestoreOpNameFieldNumber();
  public static final int kRestoreOpNameFieldNumber = kRestoreOpNameFieldNumber();
  public native @StdString BytePointer restore_op_name();
  public native void set_restore_op_name(@StdString BytePointer value);
  public native void set_restore_op_name(@StdString String value);
  public native void set_restore_op_name(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_restore_op_name(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_restore_op_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_restore_op_name();
  public native void set_allocated_restore_op_name(@StdString @Cast({"char*", "std::string*"}) BytePointer restore_op_name);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_restore_op_name();
  public native void unsafe_arena_set_allocated_restore_op_name(
        @StdString @Cast({"char*", "std::string*"}) BytePointer restore_op_name);

  // int32 max_to_keep = 4;
  public native void clear_max_to_keep();
  @MemberGetter public static native int kMaxToKeepFieldNumber();
  public static final int kMaxToKeepFieldNumber = kMaxToKeepFieldNumber();
  public native @Cast("google::protobuf::int32") int max_to_keep();
  public native void set_max_to_keep(@Cast("google::protobuf::int32") int value);

  // bool sharded = 5;
  public native void clear_sharded();
  @MemberGetter public static native int kShardedFieldNumber();
  public static final int kShardedFieldNumber = kShardedFieldNumber();
  public native @Cast("bool") boolean sharded();
  public native void set_sharded(@Cast("bool") boolean value);

  // float keep_checkpoint_every_n_hours = 6;
  public native void clear_keep_checkpoint_every_n_hours();
  @MemberGetter public static native int kKeepCheckpointEveryNHoursFieldNumber();
  public static final int kKeepCheckpointEveryNHoursFieldNumber = kKeepCheckpointEveryNHoursFieldNumber();
  public native float keep_checkpoint_every_n_hours();
  public native void set_keep_checkpoint_every_n_hours(float value);

  // .tensorflow.SaverDef.CheckpointFormatVersion version = 7;
  public native void clear_version();
  @MemberGetter public static native int kVersionFieldNumber();
  public static final int kVersionFieldNumber = kVersionFieldNumber();
  public native @Cast("tensorflow::SaverDef_CheckpointFormatVersion") int version();
  public native void set_version(@Cast("tensorflow::SaverDef_CheckpointFormatVersion") int value);
}
