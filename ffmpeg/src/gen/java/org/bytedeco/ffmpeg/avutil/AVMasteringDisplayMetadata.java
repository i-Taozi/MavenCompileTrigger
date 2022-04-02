// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.ffmpeg.global.avutil.*;



/**
 * Mastering display metadata capable of representing the color volume of
 * the display used to master the content (SMPTE 2086:2014).
 *
 * To be used as payload of a AVFrameSideData or AVPacketSideData with the
 * appropriate type.
 *
 * \note The struct should be allocated with av_mastering_display_metadata_alloc()
 *       and its size is not a part of the public ABI.
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class AVMasteringDisplayMetadata extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVMasteringDisplayMetadata() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVMasteringDisplayMetadata(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVMasteringDisplayMetadata(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVMasteringDisplayMetadata position(long position) {
        return (AVMasteringDisplayMetadata)super.position(position);
    }
    @Override public AVMasteringDisplayMetadata getPointer(long i) {
        return new AVMasteringDisplayMetadata((Pointer)this).offsetAddress(i);
    }

    /**
     * CIE 1931 xy chromaticity coords of color primaries (r, g, b order).
     */
    public native @ByRef AVRational display_primaries(int i, int j); public native AVMasteringDisplayMetadata display_primaries(int i, int j, AVRational setter);
    @MemberGetter public native @Cast("AVRational(* /*[3]*/ )[2]") AVRational display_primaries();

    /**
     * CIE 1931 xy chromaticity coords of white point.
     */
    public native @ByRef AVRational white_point(int i); public native AVMasteringDisplayMetadata white_point(int i, AVRational setter);
    @MemberGetter public native AVRational white_point();

    /**
     * Min luminance of mastering display (cd/m^2).
     */
    public native @ByRef AVRational min_luminance(); public native AVMasteringDisplayMetadata min_luminance(AVRational setter);

    /**
     * Max luminance of mastering display (cd/m^2).
     */
    public native @ByRef AVRational max_luminance(); public native AVMasteringDisplayMetadata max_luminance(AVRational setter);

    /**
     * Flag indicating whether the display primaries (and white point) are set.
     */
    public native int has_primaries(); public native AVMasteringDisplayMetadata has_primaries(int setter);

    /**
     * Flag indicating whether the luminance (min_ and max_) have been set.
     */
    public native int has_luminance(); public native AVMasteringDisplayMetadata has_luminance(int setter);

}
