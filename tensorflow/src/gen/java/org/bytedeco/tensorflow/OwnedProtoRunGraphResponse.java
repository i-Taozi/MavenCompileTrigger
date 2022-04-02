// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Proto-based message wrapper for use on the client side of the RunGraph RPC.
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class OwnedProtoRunGraphResponse extends MutableRunGraphResponseWrapper {
    static { Loader.load(); }
    /** Default native constructor. */
    public OwnedProtoRunGraphResponse() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OwnedProtoRunGraphResponse(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OwnedProtoRunGraphResponse(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public OwnedProtoRunGraphResponse position(long position) {
        return (OwnedProtoRunGraphResponse)super.position(position);
    }
    @Override public OwnedProtoRunGraphResponse getPointer(long i) {
        return new OwnedProtoRunGraphResponse((Pointer)this).offsetAddress(i);
    }

  // MutableRunGraphResponseWrapper methods.
  public native @Cast("size_t") long num_recvs();
  public native @StdString BytePointer recv_key(@Cast("size_t") long i);
  public native @ByVal Status RecvValue(@Cast("size_t") long i, TensorProto out_tensor);
  public native @ByVal Status RecvValue(@Cast("size_t") long i, Tensor out_tensor);
  public native void AddRecv(@StdString BytePointer key, @Const @ByRef Tensor value);
  public native void AddRecv(@StdString String key, @Const @ByRef Tensor value);
  public native StepStats mutable_step_stats();
  public native CostGraphDef mutable_cost_graph();
  public native @Cast("size_t") long num_partition_graphs();
  public native GraphDef mutable_partition_graph(@Cast("size_t") long i);
  public native void AddPartitionGraph(@Const @ByRef GraphDef partition_graph);
  public native @Cast("tensorflow::errors::Code") int status_code();
  public native @StdString BytePointer status_error_message();
  public native void set_status(@Const @ByRef Status status);
}
