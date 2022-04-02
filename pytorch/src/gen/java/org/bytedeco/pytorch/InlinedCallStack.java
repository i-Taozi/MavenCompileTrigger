// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class InlinedCallStack extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public InlinedCallStack(Pointer p) { super(p); }

  // Constructor for a leaf callstack node.
  public InlinedCallStack(Function fn, @ByVal SourceRange source_range) { super((Pointer)null); allocate(fn, source_range); }
  private native void allocate(Function fn, @ByVal SourceRange source_range);

  // Constructor for a leaf callstack node.
  public InlinedCallStack(
        Function fn,
        @ByVal SourceRange source_range,
        @ByVal ModuleInstanceInfoOptional module_instance_info) { super((Pointer)null); allocate(fn, source_range, module_instance_info); }
  private native void allocate(
        Function fn,
        @ByVal SourceRange source_range,
        @ByVal ModuleInstanceInfoOptional module_instance_info);

  // Constructor for an inner callstack node.
  public InlinedCallStack(
        @ByVal @Cast("torch::jit::InlinedCallStackPtr*") Pointer callee,
        Function fn,
        @ByVal SourceRange source_range) { super((Pointer)null); allocate(callee, fn, source_range); }
  private native void allocate(
        @ByVal @Cast("torch::jit::InlinedCallStackPtr*") Pointer callee,
        Function fn,
        @ByVal SourceRange source_range);

  public InlinedCallStack(
        @ByVal @Cast("torch::jit::InlinedCallStackPtr*") Pointer callee,
        Function fn,
        @ByVal SourceRange source_range,
        @ByVal ModuleInstanceInfoOptional module_instance_info) { super((Pointer)null); allocate(callee, fn, source_range, module_instance_info); }
  private native void allocate(
        @ByVal @Cast("torch::jit::InlinedCallStackPtr*") Pointer callee,
        Function fn,
        @ByVal SourceRange source_range,
        @ByVal ModuleInstanceInfoOptional module_instance_info);

  // Return next element in the callstack list.
  public native @ByVal @Cast("c10::optional<torch::jit::InlinedCallStackPtr>*") InlinedCallStackOptional callee();

  // Return module instance associated with the current element.
  public native @ByVal ModuleInstanceInfoOptional module_instance();

  // Returns the source range of the node
  public native @ByVal SourceRange source_range();

  public native Function function();

  public native void set_function_name(@StdString BytePointer fn_name);
  public native void set_function_name(@StdString String fn_name);

  public native @StdString BytePointer function_name();

  // Return callstack as a vector of [Function, SourceRange] pairs.
  public native @Cast("torch::jit::InlinedCallStackEntry*") @StdVector LongPointer vec();

  public native void setCallee(@ByVal @Cast("c10::optional<torch::jit::InlinedCallStackPtr>*") InlinedCallStackOptional arg0);

  public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef InlinedCallStack rhs);

  public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef InlinedCallStack rhs);
}
