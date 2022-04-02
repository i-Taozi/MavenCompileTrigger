// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avfilter;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.ffmpeg.avutil.*;
import static org.bytedeco.ffmpeg.global.avutil.*;
import org.bytedeco.ffmpeg.swresample.*;
import static org.bytedeco.ffmpeg.global.swresample.*;
import org.bytedeco.ffmpeg.avcodec.*;
import static org.bytedeco.ffmpeg.global.avcodec.*;
import org.bytedeco.ffmpeg.avformat.*;
import static org.bytedeco.ffmpeg.global.avformat.*;
import org.bytedeco.ffmpeg.postproc.*;
import static org.bytedeco.ffmpeg.global.postproc.*;
import org.bytedeco.ffmpeg.swscale.*;
import static org.bytedeco.ffmpeg.global.swscale.*;

import static org.bytedeco.ffmpeg.global.avfilter.*;


/**
 * A link between two filters. This contains pointers to the source and
 * destination filters between which this link exists, and the indexes of
 * the pads involved. In addition, this link also contains the parameters
 * which have been negotiated and agreed upon between the filter, such as
 * image dimensions, format, etc.
 *
 * Applications must not normally access the link structure directly.
 * Use the buffersrc and buffersink API instead.
 * In the future, access to the header may be reserved for filters
 * implementation.
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avfilter.class)
public class AVFilterLink extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVFilterLink() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVFilterLink(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVFilterLink(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVFilterLink position(long position) {
        return (AVFilterLink)super.position(position);
    }
    @Override public AVFilterLink getPointer(long i) {
        return new AVFilterLink((Pointer)this).offsetAddress(i);
    }

    /** source filter */
    public native AVFilterContext src(); public native AVFilterLink src(AVFilterContext setter);
    /** output pad on the source filter */
    public native AVFilterPad srcpad(); public native AVFilterLink srcpad(AVFilterPad setter);

    /** dest filter */
    public native AVFilterContext dst(); public native AVFilterLink dst(AVFilterContext setter);
    /** input pad on the dest filter */
    public native AVFilterPad dstpad(); public native AVFilterLink dstpad(AVFilterPad setter);

    /** filter media type */
    public native @Cast("AVMediaType") int type(); public native AVFilterLink type(int setter);

    /* These parameters apply only to video */
    /** agreed upon image width */
    public native int w(); public native AVFilterLink w(int setter);
    /** agreed upon image height */
    public native int h(); public native AVFilterLink h(int setter);
    /** agreed upon sample aspect ratio */
    public native @ByRef AVRational sample_aspect_ratio(); public native AVFilterLink sample_aspect_ratio(AVRational setter);
    /* These parameters apply only to audio */
    /** channel layout of current buffer (see libavutil/channel_layout.h) */
    public native @Cast("uint64_t") long channel_layout(); public native AVFilterLink channel_layout(long setter);
    /** samples per second */
    public native int sample_rate(); public native AVFilterLink sample_rate(int setter);

    /** agreed upon media format */
    public native int format(); public native AVFilterLink format(int setter);

    /**
     * Define the time base used by the PTS of the frames/samples
     * which will pass through this link.
     * During the configuration stage, each filter is supposed to
     * change only the output timebase, while the timebase of the
     * input link is assumed to be an unchangeable property.
     */
    public native @ByRef AVRational time_base(); public native AVFilterLink time_base(AVRational setter);

    /*****************************************************************
     * All fields below this line are not part of the public API. They
     * may not be used outside of libavfilter and can be changed and
     * removed at will.
     * New public fields should be added right above.
     *****************************************************************
     */

    /**
     * Lists of supported formats / etc. supported by the input filter.
     */
    public native @ByRef AVFilterFormatsConfig incfg(); public native AVFilterLink incfg(AVFilterFormatsConfig setter);

    /**
     * Lists of supported formats / etc. supported by the output filter.
     */
    public native @ByRef AVFilterFormatsConfig outcfg(); public native AVFilterLink outcfg(AVFilterFormatsConfig setter);

    /** stage of the initialization of the link properties (dimensions, etc) */
    /** enum AVFilterLink::init_state */
    public static final int
        /** not started */
        AVLINK_UNINIT = 0,
        /** started, but incomplete */
        AVLINK_STARTINIT = 1,
        /** complete */
        AVLINK_INIT = 2;

    /**
     * Graph the filter belongs to.
     */
    public native AVFilterGraph graph(); public native AVFilterLink graph(AVFilterGraph setter);

    /**
     * Current timestamp of the link, as defined by the most recent
     * frame(s), in link time_base units.
     */
    public native @Cast("int64_t") long current_pts(); public native AVFilterLink current_pts(long setter);

    /**
     * Current timestamp of the link, as defined by the most recent
     * frame(s), in AV_TIME_BASE units.
     */
    public native @Cast("int64_t") long current_pts_us(); public native AVFilterLink current_pts_us(long setter);

    /**
     * Index in the age array.
     */
    public native int age_index(); public native AVFilterLink age_index(int setter);

    /**
     * Frame rate of the stream on the link, or 1/0 if unknown or variable;
     * if left to 0/0, will be automatically copied from the first input
     * of the source filter if it exists.
     *
     * Sources should set it to the best estimation of the real frame rate.
     * If the source frame rate is unknown or variable, set this to 1/0.
     * Filters should update it if necessary depending on their function.
     * Sinks can use it to set a default output frame rate.
     * It is similar to the r_frame_rate field in AVStream.
     */
    public native @ByRef AVRational frame_rate(); public native AVFilterLink frame_rate(AVRational setter);

    /**
     * Minimum number of samples to filter at once. If filter_frame() is
     * called with fewer samples, it will accumulate them in fifo.
     * This field and the related ones must not be changed after filtering
     * has started.
     * If 0, all related fields are ignored.
     */
    public native int min_samples(); public native AVFilterLink min_samples(int setter);

    /**
     * Maximum number of samples to filter at once. If filter_frame() is
     * called with more samples, it will split them.
     */
    public native int max_samples(); public native AVFilterLink max_samples(int setter);

    /**
     * Number of channels.
     */
    public native int channels(); public native AVFilterLink channels(int setter);

    /**
     * Number of past frames sent through the link.
     */
    public native @Cast("int64_t") long frame_count_in(); public native AVFilterLink frame_count_in(long setter);
    public native @Cast("int64_t") long frame_count_out(); public native AVFilterLink frame_count_out(long setter);

    /**
     * Number of past samples sent through the link.
     */
    public native @Cast("int64_t") long sample_count_in(); public native AVFilterLink sample_count_in(long setter);
    public native @Cast("int64_t") long sample_count_out(); public native AVFilterLink sample_count_out(long setter);

    /**
     * A pointer to a FFFramePool struct.
     */
    public native Pointer frame_pool(); public native AVFilterLink frame_pool(Pointer setter);

    /**
     * True if a frame is currently wanted on the output of this filter.
     * Set when ff_request_frame() is called by the output,
     * cleared when a frame is filtered.
     */
    public native int frame_wanted_out(); public native AVFilterLink frame_wanted_out(int setter);

    /**
     * For hwaccel pixel formats, this should be a reference to the
     * AVHWFramesContext describing the frames.
     */
    public native AVBufferRef hw_frames_ctx(); public native AVFilterLink hw_frames_ctx(AVBufferRef setter);

// #ifndef FF_INTERNAL_FIELDS

    /**
     * Internal structure members.
     * The fields below this limit are internal for libavfilter's use
     * and must in no way be accessed by applications.
     */
    public native @Cast("char") byte reserved(int i); public native AVFilterLink reserved(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer reserved();

// #else /* FF_INTERNAL_FIELDS */

// #endif /* FF_INTERNAL_FIELDS */

}
