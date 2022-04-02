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
 // namespace functional

// ============================================================================

/** Options for the {@code HuberLoss} module.
 * 
 *  Example:
 *  <pre>{@code
 *  HuberLoss model(HuberLossOptions().reduction(torch::kNone).delta(0.5));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class HuberLossOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public HuberLossOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public HuberLossOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public HuberLossOptions position(long position) {
        return (HuberLossOptions)super.position(position);
    }
    @Override public HuberLossOptions getPointer(long i) {
        return new HuberLossOptions((Pointer)this).offsetAddress(i);
    }


  public HuberLossOptions() { super((Pointer)null); allocate(); }
  private native void allocate();
public HuberLossOptions(@ByVal kNone reduction) { super((Pointer)null); allocate(reduction); }
private native void allocate(@ByVal kNone reduction);
public HuberLossOptions(@ByVal kMean reduction) { super((Pointer)null); allocate(reduction); }
private native void allocate(@ByVal kMean reduction);
public HuberLossOptions(@ByVal kSum reduction) { super((Pointer)null); allocate(reduction); }
private native void allocate(@ByVal kSum reduction);
  public native @ByRef @NoException(true) loss_reduction_t reduction();
  public native @ByRef @NoException(true) DoublePointer delta();
}
