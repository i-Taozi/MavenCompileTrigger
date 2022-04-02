// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.depthai.global.depthai.*;



// Config
@Namespace("dai::bootloader") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class NetworkConfig extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NetworkConfig() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NetworkConfig(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NetworkConfig(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NetworkConfig position(long position) {
        return (NetworkConfig)super.position(position);
    }
    @Override public NetworkConfig getPointer(long i) {
        return new NetworkConfig((Pointer)this).offsetAddress(i);
    }

    /**
     * If timeout < 0 - waits forever
     * if timeout == 0 - no timeout
     * if timeout > 0 - waits timeout milliseconds
     */
    public native int timeoutMs(); public native NetworkConfig timeoutMs(int setter);
    // Network configuration options
    // IPv4
    public native @Cast("std::uint32_t") int ipv4(); public native NetworkConfig ipv4(int setter);
    public native @Cast("std::uint32_t") int ipv4Mask(); public native NetworkConfig ipv4Mask(int setter);
    public native @Cast("std::uint32_t") int ipv4Gateway(); public native NetworkConfig ipv4Gateway(int setter);
    public native @Cast("std::uint32_t") int ipv4Dns(); public native NetworkConfig ipv4Dns(int setter);
    public native @Cast("std::uint32_t") int ipv4DnsAlt(); public native NetworkConfig ipv4DnsAlt(int setter);
    public native @Cast("bool") boolean staticIpv4(); public native NetworkConfig staticIpv4(boolean setter);
    // TODO(themarpe) - IPv6
    public native @ByRef @Cast("std::array<uint32_t,4>*") Pointer ipv6(); public native NetworkConfig ipv6(Pointer setter);
    public native @Cast("std::uint32_t") int ipv6Prefix(); public native NetworkConfig ipv6Prefix(int setter);
    public native @ByRef @Cast("std::array<uint32_t,4>*") Pointer ipv6Gateway(); public native NetworkConfig ipv6Gateway(Pointer setter);
    public native @ByRef @Cast("std::array<uint32_t,4>*") Pointer ipv6Dns(); public native NetworkConfig ipv6Dns(Pointer setter);
    public native @ByRef @Cast("std::array<uint32_t,4>*") Pointer ipv6DnsAlt(); public native NetworkConfig ipv6DnsAlt(Pointer setter);
    public native @Cast("bool") boolean staticIpv6(); public native NetworkConfig staticIpv6(boolean setter);
    // MAC address - if not flashed, overwrites autogenerated one
    public native @ByRef @Cast("std::array<uint8_t,6>*") Pointer mac(); public native NetworkConfig mac(Pointer setter);
}
