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


    /** \brief This class allows to create and manipulate comprehensive artificial neural networks.
     *
     * Neural network is presented as directed acyclic graph (DAG), where vertices are Layer instances,
     * and edges specify relationships between layers inputs and outputs.
     *
     * Each network layer has unique integer id and unique string name inside its network.
     * LayerId can store either layer name or layer id.
     *
     * This class supports reference counting of its instances, i. e. copies point to the same instance.
     */
    @Namespace("cv::dnn") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_dnn.class)
public class Net extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Net(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public Net(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public Net position(long position) {
            return (Net)super.position(position);
        }
        @Override public Net getPointer(long i) {
            return new Net((Pointer)this).offsetAddress(i);
        }
    

        /** Default constructor. */
        public Net() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** \brief Create a network from Intel's Model Optimizer intermediate representation (IR).
         *  @param xml [in] XML configuration file with network's topology.
         *  @param bin [in] Binary file with trained weights.
         *  Networks imported from Intel's Model Optimizer are launched in Intel's Inference Engine
         *  backend.
         */
        public static native @ByVal Net readFromModelOptimizer(@Str BytePointer xml, @Str BytePointer bin);
        public static native @ByVal Net readFromModelOptimizer(@Str String xml, @Str String bin);

        /** \brief Create a network from Intel's Model Optimizer in-memory buffers with intermediate representation (IR).
         *  @param bufferModelConfig [in] buffer with model's configuration.
         *  @param bufferWeights [in] buffer with model's trained weights.
         *  @return Net object.
         */
        public static native @ByVal Net readFromModelOptimizer(@Cast("uchar*") @StdVector ByteBuffer bufferModelConfig, @Cast("uchar*") @StdVector ByteBuffer bufferWeights);
        public static native @ByVal Net readFromModelOptimizer(@Cast("uchar*") @StdVector byte[] bufferModelConfig, @Cast("uchar*") @StdVector byte[] bufferWeights);

        /** \brief Create a network from Intel's Model Optimizer in-memory buffers with intermediate representation (IR).
         *  @param bufferModelConfigPtr [in] buffer pointer of model's configuration.
         *  @param bufferModelConfigSize [in] buffer size of model's configuration.
         *  @param bufferWeightsPtr [in] buffer pointer of model's trained weights.
         *  @param bufferWeightsSize [in] buffer size of model's trained weights.
         *  @return Net object.
         */
        public static native @ByVal Net readFromModelOptimizer(@Cast("const uchar*") BytePointer bufferModelConfigPtr, @Cast("size_t") long bufferModelConfigSize,
                                                    @Cast("const uchar*") BytePointer bufferWeightsPtr, @Cast("size_t") long bufferWeightsSize);
        public static native @ByVal Net readFromModelOptimizer(@Cast("const uchar*") ByteBuffer bufferModelConfigPtr, @Cast("size_t") long bufferModelConfigSize,
                                                    @Cast("const uchar*") ByteBuffer bufferWeightsPtr, @Cast("size_t") long bufferWeightsSize);
        public static native @ByVal Net readFromModelOptimizer(@Cast("const uchar*") byte[] bufferModelConfigPtr, @Cast("size_t") long bufferModelConfigSize,
                                                    @Cast("const uchar*") byte[] bufferWeightsPtr, @Cast("size_t") long bufferWeightsSize);

        /** Returns true if there are no layers in the network. */
        public native @Cast("bool") boolean empty();

        /** \brief Dump net to String
         *  @return String with structure, hyperparameters, backend, target and fusion
         *  Call method after setInput(). To see correct backend, target and fusion run after forward().
         */
        public native @Str BytePointer dump();
        /** \brief Dump net structure, hyperparameters, backend, target and fusion to dot file
         *  @param path   path to output file with .dot extension
         *  @see dump()
         */
        public native void dumpToFile(@Str BytePointer path);
        public native void dumpToFile(@Str String path);
        /** \brief Adds new layer to the net.
         *  @param name   unique name of the adding layer.
         *  @param type   typename of the adding layer (type must be registered in LayerRegister).
         *  @param dtype  datatype of output blobs.
         *  @param params parameters which will be used to initialize the creating layer.
         *  @return unique identifier of created layer, or -1 if a failure will happen.
         */
        public native int addLayer(@Str BytePointer name, @Str BytePointer type, int dtype, @ByRef LayerParams params);
        public native int addLayer(@Str String name, @Str String type, int dtype, @ByRef LayerParams params);

        /** \overload Datatype of output blobs set to default CV_32F */
        public native int addLayer(@Str BytePointer name, @Str BytePointer type, @ByRef LayerParams params);
        public native int addLayer(@Str String name, @Str String type, @ByRef LayerParams params);

        /** \brief Adds new layer and connects its first input to the first output of previously added layer.
         *  @see addLayer()
         */
        public native int addLayerToPrev(@Str BytePointer name, @Str BytePointer type, int dtype, @ByRef LayerParams params);
        public native int addLayerToPrev(@Str String name, @Str String type, int dtype, @ByRef LayerParams params);

        /** \overload */
        public native int addLayerToPrev(@Str BytePointer name, @Str BytePointer type, @ByRef LayerParams params);
        public native int addLayerToPrev(@Str String name, @Str String type, @ByRef LayerParams params);

        /** \brief Converts string name of the layer to the integer identifier.
         *  @return id of the layer, or -1 if the layer wasn't found.
         */
        public native int getLayerId(@Str BytePointer layer);
        public native int getLayerId(@Str String layer);

        public native @ByVal StringVector getLayerNames();

        /** \brief Container for strings and integers. */

        /** \brief Returns pointer to layer with specified id or name which the network use. */
        public native @Ptr Layer getLayer(@ByVal @Cast("cv::dnn::Net::LayerId*") DictValue layerId);

        /** \brief Returns pointers to input layers of specific layer. */ // FIXIT: CV_WRAP

        /** \brief Connects output of the first layer to input of the second layer.
         *  @param outPin descriptor of the first layer output.
         *  @param inpPin descriptor of the second layer input.
         *
         * Descriptors have the following template <DFN>&lt;layer_name&gt;[.input_number]</DFN>:
         * - the first part of the template <DFN>layer_name</DFN> is string name of the added layer.
         *   If this part is empty then the network input pseudo layer will be used;
         * - the second optional part of the template <DFN>input_number</DFN>
         *   is either number of the layer input, either label one.
         *   If this part is omitted then the first layer input will be used.
         *
         *  @see setNetInputs(), Layer::inputNameToIndex(), Layer::outputNameToIndex()
         */
        public native void connect(@Str BytePointer outPin, @Str BytePointer inpPin);
        public native void connect(@Str String outPin, @Str String inpPin);

        /** \brief Connects #\p outNum output of the first layer to #\p inNum input of the second layer.
         *  @param outLayerId identifier of the first layer
         *  @param outNum number of the first layer output
         *  @param inpLayerId identifier of the second layer
         *  @param inpNum number of the second layer input
         */
        public native void connect(int outLayerId, int outNum, int inpLayerId, int inpNum);

        /** \brief Sets outputs names of the network input pseudo layer.
         *
         * Each net always has special own the network input pseudo layer with id=0.
         * This layer stores the user blobs only and don't make any computations.
         * In fact, this layer provides the only way to pass user data into the network.
         * As any other layer, this layer can label its outputs and this function provides an easy way to do this.
         */
        public native void setInputsNames(@Const @ByRef StringVector inputBlobNames);

        /** \brief Specify shape of network input.
         */
        public native void setInputShape(@Str BytePointer inputName, @Const @StdVector @ByRef IntPointer shape);
        public native void setInputShape(@Str String inputName, @Const @StdVector @ByRef IntPointer shape);

        /** \brief Runs forward pass to compute output of layer with name \p outputName.
         *  @param outputName name for layer which output is needed to get
         *  @return blob for first output of specified layer.
         *  \details By default runs forward pass for the whole network.
         */
        public native @ByVal Mat forward(@Str BytePointer outputName/*=cv::String()*/);
        public native @ByVal Mat forward();
        public native @ByVal Mat forward(@Str String outputName/*=cv::String()*/);

        /** \brief Runs forward pass to compute output of layer with name \p outputName.
         *  @param outputName name for layer which output is needed to get
         *  \details By default runs forward pass for the whole network.
         *
         *  This is an asynchronous version of forward(const String&).
         *  dnn::DNN_BACKEND_INFERENCE_ENGINE backend is required.
         */
        public native @ByVal AsyncArray forwardAsync(@Str BytePointer outputName/*=cv::String()*/);
        public native @ByVal AsyncArray forwardAsync();
        public native @ByVal AsyncArray forwardAsync(@Str String outputName/*=cv::String()*/);

        /** \brief Runs forward pass to compute output of layer with name \p outputName.
         *  @param outputBlobs contains all output blobs for specified layer.
         *  @param outputName name for layer which output is needed to get
         *  \details If \p outputName is empty, runs forward pass for the whole network.
         */
        public native void forward(@ByVal MatVector outputBlobs, @Str BytePointer outputName/*=cv::String()*/);
        public native void forward(@ByVal MatVector outputBlobs);
        public native void forward(@ByVal UMatVector outputBlobs, @Str String outputName/*=cv::String()*/);
        public native void forward(@ByVal UMatVector outputBlobs);
        public native void forward(@ByVal GpuMatVector outputBlobs, @Str BytePointer outputName/*=cv::String()*/);
        public native void forward(@ByVal GpuMatVector outputBlobs);
        public native void forward(@ByVal MatVector outputBlobs, @Str String outputName/*=cv::String()*/);
        public native void forward(@ByVal UMatVector outputBlobs, @Str BytePointer outputName/*=cv::String()*/);
        public native void forward(@ByVal GpuMatVector outputBlobs, @Str String outputName/*=cv::String()*/);

        /** \brief Runs forward pass to compute outputs of layers listed in \p outBlobNames.
         *  @param outputBlobs contains blobs for first outputs of specified layers.
         *  @param outBlobNames names for layers which outputs are needed to get
         */
        public native void forward(@ByVal MatVector outputBlobs,
                                     @Const @ByRef StringVector outBlobNames);
        public native void forward(@ByVal UMatVector outputBlobs,
                                     @Const @ByRef StringVector outBlobNames);
        public native void forward(@ByVal GpuMatVector outputBlobs,
                                     @Const @ByRef StringVector outBlobNames);

        /** \brief Runs forward pass to compute outputs of layers listed in \p outBlobNames.
         *  @param outputBlobs contains all output blobs for each layer specified in \p outBlobNames.
         *  @param outBlobNames names for layers which outputs are needed to get
         */
        public native @Name("forward") void forwardAndRetrieve(@ByRef MatVectorVector outputBlobs,
                                                            @Const @ByRef StringVector outBlobNames);

        /** \brief Returns a quantized Net from a floating-point Net.
         *  @param calibData Calibration data to compute the quantization parameters.
         *  @param inputsDtype Datatype of quantized net's inputs. Can be CV_32F or CV_8S.
         *  @param outputsDtype Datatype of quantized net's outputs. Can be CV_32F or CV_8S.
         */
        public native @ByVal Net quantize(@ByVal MatVector calibData, int inputsDtype, int outputsDtype);
        public native @ByVal Net quantize(@ByVal UMatVector calibData, int inputsDtype, int outputsDtype);
        public native @ByVal Net quantize(@ByVal GpuMatVector calibData, int inputsDtype, int outputsDtype);

        /** \brief Returns input scale and zeropoint for a quantized Net.
         *  @param scales output parameter for returning input scales.
         *  @param zeropoints output parameter for returning input zeropoints.
         */
        public native void getInputDetails(@StdVector FloatPointer scales, @StdVector IntPointer zeropoints);
        public native void getInputDetails(@StdVector FloatBuffer scales, @StdVector IntBuffer zeropoints);
        public native void getInputDetails(@StdVector float[] scales, @StdVector int[] zeropoints);

        /** \brief Returns output scale and zeropoint for a quantized Net.
         *  @param scales output parameter for returning output scales.
         *  @param zeropoints output parameter for returning output zeropoints.
         */
        public native void getOutputDetails(@StdVector FloatPointer scales, @StdVector IntPointer zeropoints);
        public native void getOutputDetails(@StdVector FloatBuffer scales, @StdVector IntBuffer zeropoints);
        public native void getOutputDetails(@StdVector float[] scales, @StdVector int[] zeropoints);

        /**
         * \brief Compile Halide layers.
         * @param scheduler [in] Path to YAML file with scheduling directives.
         * @see setPreferableBackend
         *
         * Schedule layers that support Halide backend. Then compile them for
         * specific target. For layers that not represented in scheduling file
         * or if no manual scheduling used at all, automatic scheduling will be applied.
         */
        public native void setHalideScheduler(@Str BytePointer scheduler);
        public native void setHalideScheduler(@Str String scheduler);

        /**
         * \brief Ask network to use specific computation backend where it supported.
         * @param backendId [in] backend identifier.
         * @see Backend
         *
         * If OpenCV is compiled with Intel's Inference Engine library, DNN_BACKEND_DEFAULT
         * means DNN_BACKEND_INFERENCE_ENGINE. Otherwise it equals to DNN_BACKEND_OPENCV.
         */
        public native void setPreferableBackend(int backendId);

        /**
         * \brief Ask network to make computations on specific target device.
         * @param targetId [in] target identifier.
         * @see Target
         *
         * List of supported combinations backend / target:
         * |                        | DNN_BACKEND_OPENCV | DNN_BACKEND_INFERENCE_ENGINE | DNN_BACKEND_HALIDE |  DNN_BACKEND_CUDA |
         * |------------------------|--------------------|------------------------------|--------------------|-------------------|
         * | DNN_TARGET_CPU         |                  + |                            + |                  + |                   |
         * | DNN_TARGET_OPENCL      |                  + |                            + |                  + |                   |
         * | DNN_TARGET_OPENCL_FP16 |                  + |                            + |                    |                   |
         * | DNN_TARGET_MYRIAD      |                    |                            + |                    |                   |
         * | DNN_TARGET_FPGA        |                    |                            + |                    |                   |
         * | DNN_TARGET_CUDA        |                    |                              |                    |                 + |
         * | DNN_TARGET_CUDA_FP16   |                    |                              |                    |                 + |
         * | DNN_TARGET_HDDL        |                    |                            + |                    |                   |
         */
        public native void setPreferableTarget(int targetId);

        /** \brief Sets the new input value for the network
         *  @param blob        A new blob. Should have CV_32F or CV_8U depth.
         *  @param name        A name of input layer.
         *  @param scalefactor An optional normalization scale.
         *  @param mean        An optional mean subtraction values.
         *  @see connect(String, String) to know format of the descriptor.
         *
         *  If scale or mean values are specified, a final input blob is computed
         *  as:
         * <pre>{@code \[input(n,c,h,w) = scalefactor \times (blob(n,c,h,w) - mean_c)\]}</pre>
         */
        public native void setInput(@ByVal Mat blob, @Str BytePointer name/*=""*/,
                                      double scalefactor/*=1.0*/, @Const @ByRef(nullValue = "cv::Scalar()") Scalar mean);
        public native void setInput(@ByVal Mat blob);
        public native void setInput(@ByVal Mat blob, @Str String name/*=""*/,
                                      double scalefactor/*=1.0*/, @Const @ByRef(nullValue = "cv::Scalar()") Scalar mean);
        public native void setInput(@ByVal UMat blob, @Str String name/*=""*/,
                                      double scalefactor/*=1.0*/, @Const @ByRef(nullValue = "cv::Scalar()") Scalar mean);
        public native void setInput(@ByVal UMat blob);
        public native void setInput(@ByVal UMat blob, @Str BytePointer name/*=""*/,
                                      double scalefactor/*=1.0*/, @Const @ByRef(nullValue = "cv::Scalar()") Scalar mean);
        public native void setInput(@ByVal GpuMat blob, @Str BytePointer name/*=""*/,
                                      double scalefactor/*=1.0*/, @Const @ByRef(nullValue = "cv::Scalar()") Scalar mean);
        public native void setInput(@ByVal GpuMat blob);
        public native void setInput(@ByVal GpuMat blob, @Str String name/*=""*/,
                                      double scalefactor/*=1.0*/, @Const @ByRef(nullValue = "cv::Scalar()") Scalar mean);

        /** \brief Sets the new value for the learned param of the layer.
         *  @param layer name or id of the layer.
         *  @param numParam index of the layer parameter in the Layer::blobs array.
         *  @param blob the new value.
         *  @see Layer::blobs
         *  \note If shape of the new blob differs from the previous shape,
         *  then the following forward pass may fail.
        */
        public native void setParam(@ByVal @Cast("cv::dnn::Net::LayerId*") DictValue layer, int numParam, @Const @ByRef Mat blob);

        /** \brief Returns parameter blob of the layer.
         *  @param layer name or id of the layer.
         *  @param numParam index of the layer parameter in the Layer::blobs array.
         *  @see Layer::blobs
         */
        public native @ByVal Mat getParam(@ByVal @Cast("cv::dnn::Net::LayerId*") DictValue layer, int numParam/*=0*/);
        public native @ByVal Mat getParam(@ByVal @Cast("cv::dnn::Net::LayerId*") DictValue layer);

        /** \brief Returns indexes of layers with unconnected outputs.
         */
        public native @StdVector IntPointer getUnconnectedOutLayers();

        /** \brief Returns names of layers with unconnected outputs.
         */
        public native @ByVal StringVector getUnconnectedOutLayersNames();

        /** \brief Returns input and output shapes for all layers in loaded model;
         *  preliminary inferencing isn't necessary.
         *  @param netInputShapes shapes for all input blobs in net input layer.
         *  @param layersIds output parameter for layer IDs.
         *  @param inLayersShapes output parameter for input layers shapes;
         * order is the same as in layersIds
         *  @param outLayersShapes output parameter for output layers shapes;
         * order is the same as in layersIds
         */
        public native void getLayersShapes(@Const @ByRef MatShapeVector netInputShapes,
                                             @StdVector IntPointer layersIds,
                                             @ByRef MatShapeVectorVector inLayersShapes,
                                             @ByRef MatShapeVectorVector outLayersShapes);
        public native void getLayersShapes(@Const @ByRef MatShapeVector netInputShapes,
                                             @StdVector IntBuffer layersIds,
                                             @ByRef MatShapeVectorVector inLayersShapes,
                                             @ByRef MatShapeVectorVector outLayersShapes);
        public native void getLayersShapes(@Const @ByRef MatShapeVector netInputShapes,
                                             @StdVector int[] layersIds,
                                             @ByRef MatShapeVectorVector inLayersShapes,
                                             @ByRef MatShapeVectorVector outLayersShapes);

        /** \overload */
        public native void getLayersShapes(@Const @StdVector @ByRef IntPointer netInputShape,
                                             @StdVector IntPointer layersIds,
                                             @ByRef MatShapeVectorVector inLayersShapes,
                                             @ByRef MatShapeVectorVector outLayersShapes);
        public native void getLayersShapes(@Const @StdVector @ByRef IntPointer netInputShape,
                                             @StdVector IntBuffer layersIds,
                                             @ByRef MatShapeVectorVector inLayersShapes,
                                             @ByRef MatShapeVectorVector outLayersShapes);
        public native void getLayersShapes(@Const @StdVector @ByRef IntPointer netInputShape,
                                             @StdVector int[] layersIds,
                                             @ByRef MatShapeVectorVector inLayersShapes,
                                             @ByRef MatShapeVectorVector outLayersShapes);

        /** \brief Returns input and output shapes for layer with specified
         * id in loaded model; preliminary inferencing isn't necessary.
         *  @param netInputShape shape input blob in net input layer.
         *  @param layerId id for layer.
         *  @param inLayerShapes output parameter for input layers shapes;
         * order is the same as in layersIds
         *  @param outLayerShapes output parameter for output layers shapes;
         * order is the same as in layersIds
         */
        public native void getLayerShapes(@Const @StdVector @ByRef IntPointer netInputShape,
                                            int layerId,
                                            @ByRef MatShapeVector inLayerShapes,
                                            @ByRef MatShapeVector outLayerShapes); // FIXIT: CV_WRAP

        /** \overload */
        public native void getLayerShapes(@Const @ByRef MatShapeVector netInputShapes,
                                            int layerId,
                                            @ByRef MatShapeVector inLayerShapes,
                                            @ByRef MatShapeVector outLayerShapes); // FIXIT: CV_WRAP

        /** \brief Computes FLOP for whole loaded model with specified input shapes.
         * @param netInputShapes vector of shapes for all net inputs.
         * @return computed FLOP.
         */
        public native @Cast("int64") long getFLOPS(@Const @ByRef MatShapeVector netInputShapes);
        /** \overload */
        public native @Cast("int64") long getFLOPS(@Const @StdVector @ByRef IntPointer netInputShape);
        /** \overload */
        public native @Cast("int64") long getFLOPS(int layerId,
                                       @Const @ByRef MatShapeVector netInputShapes);
        /** \overload */
        public native @Cast("int64") long getFLOPS(int layerId,
                                       @Const @StdVector @ByRef IntPointer netInputShape);

        /** \brief Returns list of types for layer used in model.
         * @param layersTypes output parameter for returning types.
         */
        public native void getLayerTypes(@ByRef StringVector layersTypes);

        /** \brief Returns count of layers of specified type.
         * @param layerType type.
         * @return count of layers
         */
        public native int getLayersCount(@Str BytePointer layerType);
        public native int getLayersCount(@Str String layerType);

        /** \brief Computes bytes number which are required to store
         * all weights and intermediate blobs for model.
         * @param netInputShapes vector of shapes for all net inputs.
         * @param weights output parameter to store resulting bytes for weights.
         * @param blobs output parameter to store resulting bytes for intermediate blobs.
         */
        public native void getMemoryConsumption(@Const @ByRef MatShapeVector netInputShapes,
                                                  @Cast("size_t*") @ByRef SizeTPointer weights, @Cast("size_t*") @ByRef SizeTPointer blobs); // FIXIT: CV_WRAP
        /** \overload */
        public native void getMemoryConsumption(@Const @StdVector @ByRef IntPointer netInputShape,
                                                  @Cast("size_t*") @ByRef SizeTPointer weights, @Cast("size_t*") @ByRef SizeTPointer blobs);
        /** \overload */
        public native void getMemoryConsumption(int layerId,
                                                  @Const @ByRef MatShapeVector netInputShapes,
                                                  @Cast("size_t*") @ByRef SizeTPointer weights, @Cast("size_t*") @ByRef SizeTPointer blobs);
        /** \overload */
        public native void getMemoryConsumption(int layerId,
                                                  @Const @StdVector @ByRef IntPointer netInputShape,
                                                  @Cast("size_t*") @ByRef SizeTPointer weights, @Cast("size_t*") @ByRef SizeTPointer blobs);

        /** \brief Computes bytes number which are required to store
         * all weights and intermediate blobs for each layer.
         * @param netInputShapes vector of shapes for all net inputs.
         * @param layerIds output vector to save layer IDs.
         * @param weights output parameter to store resulting bytes for weights.
         * @param blobs output parameter to store resulting bytes for intermediate blobs.
         */
        public native void getMemoryConsumption(@Const @ByRef MatShapeVector netInputShapes,
                                                  @StdVector IntPointer layerIds,
                                                  @Cast("size_t*") @StdVector SizeTPointer weights,
                                                  @Cast("size_t*") @StdVector SizeTPointer blobs);
        public native void getMemoryConsumption(@Const @ByRef MatShapeVector netInputShapes,
                                                  @StdVector IntBuffer layerIds,
                                                  @Cast("size_t*") @StdVector SizeTPointer weights,
                                                  @Cast("size_t*") @StdVector SizeTPointer blobs);
        public native void getMemoryConsumption(@Const @ByRef MatShapeVector netInputShapes,
                                                  @StdVector int[] layerIds,
                                                  @Cast("size_t*") @StdVector SizeTPointer weights,
                                                  @Cast("size_t*") @StdVector SizeTPointer blobs); // FIXIT: CV_WRAP
        /** \overload */
        public native void getMemoryConsumption(@Const @StdVector @ByRef IntPointer netInputShape,
                                                  @StdVector IntPointer layerIds,
                                                  @Cast("size_t*") @StdVector SizeTPointer weights,
                                                  @Cast("size_t*") @StdVector SizeTPointer blobs);
        public native void getMemoryConsumption(@Const @StdVector @ByRef IntPointer netInputShape,
                                                  @StdVector IntBuffer layerIds,
                                                  @Cast("size_t*") @StdVector SizeTPointer weights,
                                                  @Cast("size_t*") @StdVector SizeTPointer blobs);
        public native void getMemoryConsumption(@Const @StdVector @ByRef IntPointer netInputShape,
                                                  @StdVector int[] layerIds,
                                                  @Cast("size_t*") @StdVector SizeTPointer weights,
                                                  @Cast("size_t*") @StdVector SizeTPointer blobs); // FIXIT: CV_WRAP

        /** \brief Enables or disables layer fusion in the network.
         * @param fusion true to enable the fusion, false to disable. The fusion is enabled by default.
         */
        public native void enableFusion(@Cast("bool") boolean fusion);

        /** \brief Returns overall time for inference and timings (in ticks) for layers.
         *
         * Indexes in returned vector correspond to layers ids. Some layers can be fused with others,
         * in this case zero ticks count will be return for that skipped layers. Supported by DNN_BACKEND_OPENCV on DNN_TARGET_CPU only.
         *
         * @param timings [out] vector for tick timings for all layers.
         * @return overall ticks for model inference.
         */
        public native @Cast("int64") long getPerfProfile(@StdVector DoublePointer timings);
        public native @Cast("int64") long getPerfProfile(@StdVector DoubleBuffer timings);
        public native @Cast("int64") long getPerfProfile(@StdVector double[] timings);
    }
