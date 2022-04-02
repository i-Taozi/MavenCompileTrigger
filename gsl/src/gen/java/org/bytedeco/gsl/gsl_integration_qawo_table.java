// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_integration_qawo_table extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_integration_qawo_table() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_integration_qawo_table(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_integration_qawo_table(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_integration_qawo_table position(long position) {
        return (gsl_integration_qawo_table)super.position(position);
    }
    @Override public gsl_integration_qawo_table getPointer(long i) {
        return new gsl_integration_qawo_table((Pointer)this).offsetAddress(i);
    }

  public native @Cast("size_t") long n(); public native gsl_integration_qawo_table n(long setter);
  public native double omega(); public native gsl_integration_qawo_table omega(double setter);
  public native double L(); public native gsl_integration_qawo_table L(double setter);
  public native double par(); public native gsl_integration_qawo_table par(double setter);
  public native @Cast("gsl_integration_qawo_enum") int sine(); public native gsl_integration_qawo_table sine(int setter);
  public native DoublePointer chebmo(); public native gsl_integration_qawo_table chebmo(DoublePointer setter);
}
