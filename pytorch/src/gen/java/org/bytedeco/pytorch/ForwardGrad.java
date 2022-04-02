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


@Namespace("torch::autograd") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ForwardGrad extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ForwardGrad(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ForwardGrad(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ForwardGrad position(long position) {
        return (ForwardGrad)super.position(position);
    }
    @Override public ForwardGrad getPointer(long i) {
        return new ForwardGrad((Pointer)this).offsetAddress(i);
    }

  public ForwardGrad() { super((Pointer)null); allocate(); }
  private native void allocate();

  // This function must only be called when AutogradMeta or SavedVariable is
  // being destructed as it ensures that:
  //   - The only (potential) other references to this ForwardGrad are the
  //     different level it is registered to
  //   - No other thread will try to call `set_value` or `value` ever from now
  //   on
  //   - Any of the ForwardADLevel that this ForwardGrad is registered with
  //   might
  //     call `reset` at any point during this function
  public native void clear();

    public native void set_value(@Const @ByRef Tensor value, @Cast("uint64_t") long level);

    // This function removes the tangent for a given level from this ForwardGrad
    // Use the update_level flag to disable notifying the level about this reset
    // This flag is most notably used by the ForwardADLevel destructor.
    public native void reset(@Cast("uint64_t") long level, @Cast("bool") boolean update_level/*=true*/);
    public native void reset(@Cast("uint64_t") long level);

    public native @Const @ByRef Tensor value(@Cast("uint64_t") long level);

    public native @Cast("bool") boolean contains(@Cast("uint64_t") long level);

    public native @Cast("bool") boolean empty();

    public static native @Const @ByRef Tensor undef_grad();

}
