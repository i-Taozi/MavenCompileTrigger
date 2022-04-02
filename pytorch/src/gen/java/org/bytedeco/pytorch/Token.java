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
public class Token extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Token(Pointer p) { super(p); }

  public native int kind(); public native Token kind(int setter);
  public native @ByRef SourceRange range(); public native Token range(SourceRange setter);
  public Token(int kind, @ByVal SourceRange range) { super((Pointer)null); allocate(kind, range); }
  private native void allocate(int kind, @ByVal SourceRange range);
  public native @StdString BytePointer text();
  public native @StdString BytePointer kindString();
}
