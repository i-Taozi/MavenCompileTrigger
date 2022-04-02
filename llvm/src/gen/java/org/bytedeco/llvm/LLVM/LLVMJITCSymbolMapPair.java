// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.llvm.global.LLVM.*;


/**
 * Represents a pair of a symbol name and an evaluated symbol.
 */
@Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class LLVMJITCSymbolMapPair extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public LLVMJITCSymbolMapPair() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public LLVMJITCSymbolMapPair(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LLVMJITCSymbolMapPair(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public LLVMJITCSymbolMapPair position(long position) {
        return (LLVMJITCSymbolMapPair)super.position(position);
    }
    @Override public LLVMJITCSymbolMapPair getPointer(long i) {
        return new LLVMJITCSymbolMapPair((Pointer)this).offsetAddress(i);
    }

  public native LLVMOrcSymbolStringPoolEntryRef Name(); public native LLVMJITCSymbolMapPair Name(LLVMOrcSymbolStringPoolEntryRef setter);
  public native @ByRef LLVMJITEvaluatedSymbol Sym(); public native LLVMJITCSymbolMapPair Sym(LLVMJITEvaluatedSymbol setter);
}
