// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tesseract;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.leptonica.*;
import static org.bytedeco.leptonica.global.lept.*;

import static org.bytedeco.tesseract.global.tesseract.*;

// #else
// #endif

@Properties(inherit = org.bytedeco.tesseract.presets.tesseract.class)
public class TessCancelFunc extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    TessCancelFunc(Pointer p) { super(p); }
    protected TessCancelFunc() { allocate(); }
    private native void allocate();
    public native @Cast("bool") boolean call(Pointer cancel_this, int words);
}
