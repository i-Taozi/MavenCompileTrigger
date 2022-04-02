// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_xfeatures2d;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_ml.*;
import static org.bytedeco.opencv.global.opencv_ml.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;
import org.bytedeco.opencv.opencv_shape.*;
import static org.bytedeco.opencv.global.opencv_shape.*;

import static org.bytedeco.opencv.global.opencv_xfeatures2d.*;


/**
 * \brief Class implementing affine adaptation for key points.
 *
 * A \ref FeatureDetector and a \ref DescriptorExtractor are wrapped to augment the
 * detected points with their affine invariant elliptic region and to compute
 * the feature descriptors on the regions after warping them into circles.
 *
 * The interface is equivalent to \ref Feature2D, adding operations for
 * \ref Elliptic_KeyPoint "Elliptic_KeyPoints" instead of \ref KeyPoint "KeyPoints".
 */
@Namespace("cv::xfeatures2d") @Properties(inherit = org.bytedeco.opencv.presets.opencv_xfeatures2d.class)
public class AffineFeature2D extends Feature2D {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AffineFeature2D(Pointer p) { super(p); }

    /**
     * \brief Creates an instance wrapping the given keypoint detector and
     * descriptor extractor.
     */
    public static native @Ptr AffineFeature2D create(
            @Cast("cv::FeatureDetector*") @Ptr Feature2D keypoint_detector,
            @Cast("cv::DescriptorExtractor*") @Ptr Feature2D descriptor_extractor);

    /**
     * \brief Creates an instance where keypoint detector and descriptor
     * extractor are identical.
     */
    public static native @Ptr AffineFeature2D create(
            @Cast("cv::FeatureDetector*") @Ptr Feature2D keypoint_detector); // overload, don't hide
    /**
     * \brief Detects keypoints in the image using the wrapped detector and
     * performs affine adaptation to augment them with their elliptic regions.
     */
    public native void detect(
            @ByVal Mat image,
            @StdVector Elliptic_KeyPoint keypoints,
            @ByVal(nullValue = "cv::InputArray(cv::noArray())") Mat mask );
    public native void detect(
            @ByVal Mat image,
            @StdVector Elliptic_KeyPoint keypoints );
    public native void detect(
            @ByVal UMat image,
            @StdVector Elliptic_KeyPoint keypoints,
            @ByVal(nullValue = "cv::InputArray(cv::noArray())") UMat mask );
    public native void detect(
            @ByVal UMat image,
            @StdVector Elliptic_KeyPoint keypoints );
    public native void detect(
            @ByVal GpuMat image,
            @StdVector Elliptic_KeyPoint keypoints,
            @ByVal(nullValue = "cv::InputArray(cv::noArray())") GpuMat mask );
    public native void detect(
            @ByVal GpuMat image,
            @StdVector Elliptic_KeyPoint keypoints ); // overload, don't hide
    /**
     * \brief Detects keypoints and computes descriptors for their surrounding
     * regions, after warping them into circles.
     */
    public native void detectAndCompute(
            @ByVal Mat image,
            @ByVal Mat mask,
            @StdVector Elliptic_KeyPoint keypoints,
            @ByVal Mat descriptors,
            @Cast("bool") boolean useProvidedKeypoints/*=false*/ );
    public native void detectAndCompute(
            @ByVal Mat image,
            @ByVal Mat mask,
            @StdVector Elliptic_KeyPoint keypoints,
            @ByVal Mat descriptors );
    public native void detectAndCompute(
            @ByVal UMat image,
            @ByVal UMat mask,
            @StdVector Elliptic_KeyPoint keypoints,
            @ByVal UMat descriptors,
            @Cast("bool") boolean useProvidedKeypoints/*=false*/ );
    public native void detectAndCompute(
            @ByVal UMat image,
            @ByVal UMat mask,
            @StdVector Elliptic_KeyPoint keypoints,
            @ByVal UMat descriptors );
    public native void detectAndCompute(
            @ByVal GpuMat image,
            @ByVal GpuMat mask,
            @StdVector Elliptic_KeyPoint keypoints,
            @ByVal GpuMat descriptors,
            @Cast("bool") boolean useProvidedKeypoints/*=false*/ );
    public native void detectAndCompute(
            @ByVal GpuMat image,
            @ByVal GpuMat mask,
            @StdVector Elliptic_KeyPoint keypoints,
            @ByVal GpuMat descriptors );
}
