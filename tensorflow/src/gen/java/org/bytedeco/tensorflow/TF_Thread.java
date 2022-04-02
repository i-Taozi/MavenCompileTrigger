// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

@Opaque @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TF_Thread extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public TF_Thread() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TF_Thread(Pointer p) { super(p); }
}
