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


@Namespace("torch::jit::detail") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class AttributePolicy extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AttributePolicy() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AttributePolicy(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AttributePolicy(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AttributePolicy position(long position) {
        return (AttributePolicy)super.position(position);
    }
    @Override public AttributePolicy getPointer(long i) {
        return new AttributePolicy((Pointer)this).offsetAddress(i);
    }

  public static native @ByVal @Cast("torch::jit::detail::AttributePolicy::value_type*") IValue create(
        @StdVector SlotCursor cursors,
        @ByVal IValue v);
  public static native @Cast("bool") boolean valid(@Const @SharedPtr @ByRef ClassType typ, @Cast("size_t") long i, @Const @ByRef IValue v);
  @MemberGetter public static native @Cast("const bool") boolean all_slots();
  public static final boolean all_slots = all_slots();
}
