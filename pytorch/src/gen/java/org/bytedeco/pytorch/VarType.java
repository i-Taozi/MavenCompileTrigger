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

// This type represents a type variable, used in FunctionSchema
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class VarType extends Type {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public VarType(Pointer p) { super(p); }

  public static native @SharedPtr VarType create(@StdString BytePointer name_);
  public static native @SharedPtr VarType create(@StdString String name_);
  
  public native @StdString BytePointer str();
  public native @StdString BytePointer name();
  public native @Cast("bool") boolean hasFreeVariables();
  @MemberGetter public static native TypeKind Kind();
}
