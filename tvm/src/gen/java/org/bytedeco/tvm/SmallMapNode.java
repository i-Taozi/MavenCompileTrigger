// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tvm;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;
import static org.bytedeco.mkl.global.mkl_rt.*;

import static org.bytedeco.tvm.global.tvm_runtime.*;


/** \brief A specialization of small-sized hash map */
@Namespace("tvm::runtime") @NoOffset @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class SmallMapNode extends MapNode {
    static { Loader.load(); }
    /** Default native constructor. */
    public SmallMapNode() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SmallMapNode(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SmallMapNode(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SmallMapNode position(long position) {
        return (SmallMapNode)super.position(position);
    }
    @Override public SmallMapNode getPointer(long i) {
        return new SmallMapNode((Pointer)this).offsetAddress(i);
    }
    public SmallMapNodeBase asSmallMapNodeBase() { return asSmallMapNodeBase(this); }
    @Namespace public static native @Name("static_cast<tvm::runtime::InplaceArrayBase<tvm::runtime::SmallMapNode,tvm::runtime::MapNode::KVType>*>") SmallMapNodeBase asSmallMapNodeBase(SmallMapNode pointer);


  /** \brief Defaults to the destructor of InplaceArrayBase */
  /**
   * \brief Count the number of times a key exists in the SmallMapNode
   * @param key The indexing key
   * @return The result, 0 or 1
   */
  public native @Cast("size_t") long count(@Const @ByRef ObjectRef key);
  /**
   * \brief Index value associated with a key, throw exception if the key does not exist
   * @param key The indexing key
   * @return The const reference to the value
   */
  /**
   * \brief Index value associated with a key, throw exception if the key does not exist
   * @param key The indexing key
   * @return The mutable reference to the value
   */
  public native @ByRef ObjectRef at(@Const @ByRef ObjectRef key);
  /** @return begin iterator */
  public native @ByVal @Cast("tvm::runtime::MapNode::iterator*") Pointer begin();
  /** @return end iterator */
  public native @ByVal @Cast("tvm::runtime::MapNode::iterator*") Pointer end();
  /**
   * \brief Index value associated with a key
   * @param key The indexing key
   * @return The iterator of the entry associated with the key, end iterator if not exists
   */
  public native @ByVal @Cast("tvm::runtime::MapNode::iterator*") Pointer find(@Const @ByRef ObjectRef key);
  /**
   * \brief Erase the entry associated with the iterator
   * @param position The iterator
   */
  public native void erase(@Cast("const tvm::runtime::MapNode::iterator*") @ByRef Pointer _position);
}
