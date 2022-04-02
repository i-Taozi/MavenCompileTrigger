// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.clang;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;

import static org.bytedeco.llvm.global.clang.*;


/**
 * Visitor invoked for each cursor found by a traversal.
 *
 * This visitor function will be invoked for each cursor found by
 * clang_visitCursorChildren(). Its first argument is the cursor being
 * visited, its second argument is the parent visitor for that cursor,
 * and its third argument is the client data provided to
 * clang_visitCursorChildren().
 *
 * The visitor should return one of the \c CXChildVisitResult values
 * to direct clang_visitCursorChildren().
 */
@Properties(inherit = org.bytedeco.llvm.presets.clang.class)
public class CXCursorVisitor extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    CXCursorVisitor(Pointer p) { super(p); }
    protected CXCursorVisitor() { allocate(); }
    private native void allocate();
    public native @Cast("CXChildVisitResult") int call(@ByVal CXCursor cursor,
                                                   @ByVal CXCursor parent,
                                                   CXClientData client_data);
}
