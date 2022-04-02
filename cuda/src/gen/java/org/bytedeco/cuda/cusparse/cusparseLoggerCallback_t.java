// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cusparse;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.cusparse.*;


//##############################################################################
//# LOGGING APIs
//##############################################################################

@Properties(inherit = org.bytedeco.cuda.presets.cusparse.class)
public class cusparseLoggerCallback_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    cusparseLoggerCallback_t(Pointer p) { super(p); }
    protected cusparseLoggerCallback_t() { allocate(); }
    private native void allocate();
    public native void call(int logLevel,
                                         @Cast("const char*") BytePointer functionName,
                                         @Cast("const char*") BytePointer message);
}
