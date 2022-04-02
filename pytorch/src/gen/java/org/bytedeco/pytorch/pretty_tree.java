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


// tree pretty printer
@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class pretty_tree extends Pointer {
    static { Loader.load(); }

  public pretty_tree(@Cast("const torch::jit::TreeRef*") @ByRef Pointer tree, @Cast("size_t") long col/*=40*/) { super((Pointer)null); allocate(tree, col); }
  private native void allocate(@Cast("const torch::jit::TreeRef*") @ByRef Pointer tree, @Cast("size_t") long col/*=40*/);
  public pretty_tree(@Cast("const torch::jit::TreeRef*") @ByRef Pointer tree) { super((Pointer)null); allocate(tree); }
  private native void allocate(@Cast("const torch::jit::TreeRef*") @ByRef Pointer tree);
  @MemberGetter public native @Cast("const torch::jit::TreeRef*") @ByRef Pointer tree();
  public native @Cast("size_t") long col(); public native pretty_tree col(long setter);
  public native @ByRef @Cast("std::unordered_map<torch::jit::TreeRef,std::string>*") Pointer flat_strings(); public native pretty_tree flat_strings(Pointer setter);
  public native @StdString BytePointer get_flat(@Cast("const torch::jit::TreeRef*") @ByRef Pointer t);
  public native void print(@Cast("std::ostream*") @ByRef Pointer out, @Cast("const torch::jit::TreeRef*") @ByRef Pointer t, int indent);
}
