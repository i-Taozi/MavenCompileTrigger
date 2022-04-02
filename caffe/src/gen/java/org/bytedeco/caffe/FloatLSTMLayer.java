// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.caffe;

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
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.hdf5.*;
import static org.bytedeco.hdf5.global.hdf5.*;

import static org.bytedeco.caffe.global.caffe.*;


/**
 * \brief Processes sequential inputs using a "Long Short-Term Memory" (LSTM)
 *        [1] style recurrent neural network (RNN). Implemented by unrolling
 *        the LSTM computation through time.
 *
 * The specific architecture used in this implementation is as described in
 * "Learning to Execute" [2], reproduced below:
 *     i_t := \sigmoid[ W_{hi} * h_{t-1} + W_{xi} * x_t + b_i ]
 *     f_t := \sigmoid[ W_{hf} * h_{t-1} + W_{xf} * x_t + b_f ]
 *     o_t := \sigmoid[ W_{ho} * h_{t-1} + W_{xo} * x_t + b_o ]
 *     g_t :=    \tanh[ W_{hg} * h_{t-1} + W_{xg} * x_t + b_g ]
 *     c_t := (f_t .* c_{t-1}) + (i_t .* g_t)
 *     h_t := o_t .* \tanh[c_t]
 * In the implementation, the i, f, o, and g computations are performed as a
 * single inner product.
 *
 * Notably, this implementation lacks the "diagonal" gates, as used in the
 * LSTM architectures described by Alex Graves [3] and others.
 *
 * [1] Hochreiter, Sepp, and Schmidhuber, Jürgen. "Long short-term memory."
 *     Neural Computation 9, no. 8 (1997): 1735-1780.
 *
 * [2] Zaremba, Wojciech, and Sutskever, Ilya. "Learning to execute."
 *     arXiv preprint arXiv:1410.4615 (2014).
 *
 * [3] Graves, Alex. "Generating sequences with recurrent neural networks."
 *     arXiv preprint arXiv:1308.0850 (2013).
 */
@Name("caffe::LSTMLayer<float>") @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class FloatLSTMLayer extends FloatRecurrentLayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FloatLSTMLayer(Pointer p) { super(p); }

  public FloatLSTMLayer(@Const @ByRef LayerParameter param) { super((Pointer)null); allocate(param); }
  private native void allocate(@Const @ByRef LayerParameter param);

  @Virtual public native @Const({false, false, true}) @Cast("const char*") BytePointer type();
  @Virtual protected native @Const({false, false, true}) void FillUnrolledNet(NetParameter net_param);
  @Virtual protected native @Const({false, false, true}) void RecurrentInputBlobNames(StringVector names);
  @Virtual protected native @Const({false, false, true}) void RecurrentOutputBlobNames(StringVector names);
  @Virtual protected native @Const({false, false, true}) void RecurrentInputShapes(@Cast({"caffe::BlobShape*", "std::vector<caffe::BlobShape>*"}) @StdVector BlobShape shapes);
  @Virtual protected native @Const({false, false, true}) void OutputBlobNames(StringVector names);
}
