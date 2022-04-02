// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.llvm.global.LLVM.*;


/**
 * Represents an individual value in LLVM IR.
 *
 * This models llvm::Value.
 */
@Name("LLVMOpaqueValue") @Opaque @Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class LLVMValueRef extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public LLVMValueRef() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LLVMValueRef(Pointer p) { super(p); }
}
