// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PPM_WMI_PERF_STATE extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PPM_WMI_PERF_STATE() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PPM_WMI_PERF_STATE(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PPM_WMI_PERF_STATE(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PPM_WMI_PERF_STATE position(long position) {
        return (PPM_WMI_PERF_STATE)super.position(position);
    }
    @Override public PPM_WMI_PERF_STATE getPointer(long i) {
        return new PPM_WMI_PERF_STATE((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int Frequency(); public native PPM_WMI_PERF_STATE Frequency(int setter);            // in Mhz
    public native @Cast("DWORD") int Power(); public native PPM_WMI_PERF_STATE Power(int setter);                // in milliwatts
    public native @Cast("BYTE") byte PercentFrequency(); public native PPM_WMI_PERF_STATE PercentFrequency(byte setter);
    public native @Cast("BYTE") byte IncreaseLevel(); public native PPM_WMI_PERF_STATE IncreaseLevel(byte setter);        // goto higher state
    public native @Cast("BYTE") byte DecreaseLevel(); public native PPM_WMI_PERF_STATE DecreaseLevel(byte setter);        // goto lower state
    public native @Cast("BYTE") byte Type(); public native PPM_WMI_PERF_STATE Type(byte setter);                 // performance or throttle
    public native @Cast("DWORD") int IncreaseTime(); public native PPM_WMI_PERF_STATE IncreaseTime(int setter);         // in tick counts
    public native @Cast("DWORD") int DecreaseTime(); public native PPM_WMI_PERF_STATE DecreaseTime(int setter);         // in tick counts
    public native @Cast("DWORD64") long Control(); public native PPM_WMI_PERF_STATE Control(long setter);            // control value
    public native @Cast("DWORD64") long Status(); public native PPM_WMI_PERF_STATE Status(long setter);             // control value
    public native @Cast("DWORD") int HitCount(); public native PPM_WMI_PERF_STATE HitCount(int setter);
    public native @Cast("DWORD") int Reserved1(); public native PPM_WMI_PERF_STATE Reserved1(int setter);            // reserved for future use
    public native @Cast("DWORD64") long Reserved2(); public native PPM_WMI_PERF_STATE Reserved2(long setter);
    public native @Cast("DWORD64") long Reserved3(); public native PPM_WMI_PERF_STATE Reserved3(long setter);
}
