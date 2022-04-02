// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_dnn;

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

import static org.bytedeco.opencv.global.opencv_dnn.*;


    /**
     * Slice layer has several modes:
     * 1. Caffe mode
     * @param axis [in] Axis of split operation
     * @param slice_point [in] Array of split points
     *
     * Number of output blobs equals to number of split points plus one. The
     * first blob is a slice on input from 0 to \p slice_point[0] - 1 by \p axis,
     * the second output blob is a slice of input from \p slice_point[0] to
     * \p slice_point[1] - 1 by \p axis and the last output blob is a slice of
     * input from \p slice_point[-1] up to the end of \p axis size.
     *
     * 2. TensorFlow mode
     * @param begin Vector of start indices
     * @param size Vector of sizes
     *
     * More convenient numpy-like slice. One and only output blob
     * is a slice {@code input[begin[0]:begin[0]+size[0], begin[1]:begin[1]+size[1], ...]}
     *
     * 3. Torch mode
     * @param axis Axis of split operation
     *
     * Split input blob on the equal parts by \p axis.
     */
    @Namespace("cv::dnn") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_dnn.class)
public class SliceLayer extends Layer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public SliceLayer(Pointer p) { super(p); }
    
        /**
         * \brief Vector of slice ranges.
         *
         * The first dimension equals number of output blobs.
         * Inner vector has slice ranges for the first number of input dimensions.
         */
        public native @ByRef RangeVectorVector sliceRanges(); public native SliceLayer sliceRanges(RangeVectorVector setter);
        public native @ByRef IntVectorVector sliceSteps(); public native SliceLayer sliceSteps(IntVectorVector setter);
        public native int axis(); public native SliceLayer axis(int setter);
        public native int num_split(); public native SliceLayer num_split(int setter);

        public static native @Ptr SliceLayer create(@Const @ByRef LayerParams params);
    }
