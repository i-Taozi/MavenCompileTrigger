// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_xphoto;

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
import org.bytedeco.opencv.opencv_photo.*;
import static org.bytedeco.opencv.global.opencv_photo.*;

import static org.bytedeco.opencv.global.opencv_xphoto.*;


/** \brief Gray-world white balance algorithm
<p>
This algorithm scales the values of pixels based on a
gray-world assumption which states that the average of all channels
should result in a gray image.
<p>
It adds a modification which thresholds pixels based on their
saturation value and only uses pixels below the provided threshold in
finding average pixel values.
<p>
Saturation is calculated using the following for a 3-channel RGB image per
pixel I and is in the range [0, 1]:
<p>
<pre>{@code \[ \texttt{Saturation} [I] = \frac{\textrm{max}(R,G,B) - \textrm{min}(R,G,B)
}{\textrm{max}(R,G,B)} \]}</pre>
<p>
A threshold of 1 means that all pixels are used to white-balance, while a
threshold of 0 means no pixels are used. Lower thresholds are useful in
white-balancing saturated images.
<p>
Currently supports images of type \ref CV_8UC3 and \ref CV_16UC3.
 */
@Namespace("cv::xphoto") @Properties(inherit = org.bytedeco.opencv.presets.opencv_xphoto.class)
public class GrayworldWB extends WhiteBalancer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GrayworldWB(Pointer p) { super(p); }

    /** \brief Maximum saturation for a pixel to be included in the
        gray-world assumption
    @see setSaturationThreshold */
    public native float getSaturationThreshold();
    /** \copybrief getSaturationThreshold @see getSaturationThreshold */
    public native void setSaturationThreshold(float val);
}
