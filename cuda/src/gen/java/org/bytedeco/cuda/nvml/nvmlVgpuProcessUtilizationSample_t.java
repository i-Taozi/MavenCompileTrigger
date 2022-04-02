// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvml.*;


/**
 * Structure to store Utilization Value, vgpuInstance and subprocess information
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlVgpuProcessUtilizationSample_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlVgpuProcessUtilizationSample_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlVgpuProcessUtilizationSample_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlVgpuProcessUtilizationSample_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlVgpuProcessUtilizationSample_t position(long position) {
        return (nvmlVgpuProcessUtilizationSample_t)super.position(position);
    }
    @Override public nvmlVgpuProcessUtilizationSample_t getPointer(long i) {
        return new nvmlVgpuProcessUtilizationSample_t((Pointer)this).offsetAddress(i);
    }

    /** vGPU Instance */
    public native @Cast("nvmlVgpuInstance_t") int vgpuInstance(); public native nvmlVgpuProcessUtilizationSample_t vgpuInstance(int setter);
    /** PID of process running within the vGPU VM */
    public native @Cast("unsigned int") int pid(); public native nvmlVgpuProcessUtilizationSample_t pid(int setter);
    /** Name of process running within the vGPU VM */
    public native @Cast("char") byte processName(int i); public native nvmlVgpuProcessUtilizationSample_t processName(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer processName();
    /** CPU Timestamp in microseconds */
    public native @Cast("unsigned long long") long timeStamp(); public native nvmlVgpuProcessUtilizationSample_t timeStamp(long setter);
    /** SM (3D/Compute) Util Value */
    public native @Cast("unsigned int") int smUtil(); public native nvmlVgpuProcessUtilizationSample_t smUtil(int setter);
    /** Frame Buffer Memory Util Value */
    public native @Cast("unsigned int") int memUtil(); public native nvmlVgpuProcessUtilizationSample_t memUtil(int setter);
    /** Encoder Util Value */
    public native @Cast("unsigned int") int encUtil(); public native nvmlVgpuProcessUtilizationSample_t encUtil(int setter);
    /** Decoder Util Value */
    public native @Cast("unsigned int") int decUtil(); public native nvmlVgpuProcessUtilizationSample_t decUtil(int setter);
}
