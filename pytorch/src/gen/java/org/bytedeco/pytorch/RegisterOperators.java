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


/** Registration class for new operators. Effectively calls
 *  {@code torch::jit::registerOperator} for every supplied operator, but allows doing
 *  so in the global scope when a {@code RegisterOperators} object is assigned to a
 *  static variable.
 *  Note: This is *not* the custom operator API. If you want to register custom
 *  operators, take a look at torch::RegisterOperators. */
@Namespace("torch::jit") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class RegisterOperators extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RegisterOperators(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RegisterOperators(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public RegisterOperators position(long position) {
        return (RegisterOperators)super.position(position);
    }
    @Override public RegisterOperators getPointer(long i) {
        return new RegisterOperators((Pointer)this).offsetAddress(i);
    }

  public RegisterOperators() { super((Pointer)null); allocate(); }
  private native void allocate();

  /** Registers a vector of already created {@code Operator}s.
   *  The operator element is now optional to filter null ops. It's backward
   *  compatible and works for selective operator registration. */
  public RegisterOperators(@ByVal OperatorOptionalVector operators) { super((Pointer)null); allocate(operators); }
  private native void allocate(@ByVal OperatorOptionalVector operators);
}
