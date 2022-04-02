// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvml.*;


@Opaque @Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlComputeInstance_st extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public nvmlComputeInstance_st() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlComputeInstance_st(Pointer p) { super(p); }
}
