// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;



/* The workspace is just a collection of intervals */
@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_integration_cquad_workspace extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_integration_cquad_workspace() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_integration_cquad_workspace(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_integration_cquad_workspace(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_integration_cquad_workspace position(long position) {
        return (gsl_integration_cquad_workspace)super.position(position);
    }
    @Override public gsl_integration_cquad_workspace getPointer(long i) {
        return new gsl_integration_cquad_workspace((Pointer)this).offsetAddress(i);
    }

  public native @Cast("size_t") long size(); public native gsl_integration_cquad_workspace size(long setter);
  public native gsl_integration_cquad_ival ivals(); public native gsl_integration_cquad_workspace ivals(gsl_integration_cquad_ival setter);
  public native @Cast("size_t*") SizeTPointer heap(); public native gsl_integration_cquad_workspace heap(SizeTPointer setter);
}
