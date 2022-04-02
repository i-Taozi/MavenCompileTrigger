// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.videoinput;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.videoinput.global.videoInputLib.*;



////////////////////////////////////////   VIDEO DEVICE   ///////////////////////////////////

@NoOffset @Properties(inherit = org.bytedeco.videoinput.presets.videoInputLib.class)
public class videoDevice extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public videoDevice(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public videoDevice(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public videoDevice position(long position) {
        return (videoDevice)super.position(position);
    }
    @Override public videoDevice getPointer(long i) {
        return new videoDevice((Pointer)this).offsetAddress(i);
    }


		public videoDevice() { super((Pointer)null); allocate(); }
		private native void allocate();
		public native void setSize(int w, int h);
		public native void NukeDownstream(IBaseFilter pBF);
		public native void destroyGraph();

		public native int videoSize(); public native videoDevice videoSize(int setter);
		public native int width(); public native videoDevice width(int setter);
		public native int height(); public native videoDevice height(int setter);
		public native int tryWidth(); public native videoDevice tryWidth(int setter);
		public native int tryHeight(); public native videoDevice tryHeight(int setter);

		public native ICaptureGraphBuilder2 pCaptureGraph(); public native videoDevice pCaptureGraph(ICaptureGraphBuilder2 setter);	// Capture graph builder object
		public native IGraphBuilder pGraph(); public native videoDevice pGraph(IGraphBuilder setter);					// Graph builder object
	    public native IMediaControl pControl(); public native videoDevice pControl(IMediaControl setter);				// Media control object
		public native IBaseFilter pVideoInputFilter(); public native videoDevice pVideoInputFilter(IBaseFilter setter);  		// Video Capture filter
		public native IBaseFilter pGrabberF(); public native videoDevice pGrabberF(IBaseFilter setter);
		public native IBaseFilter pDestFilter(); public native videoDevice pDestFilter(IBaseFilter setter);
		public native IAMStreamConfig streamConf(); public native videoDevice streamConf(IAMStreamConfig setter);
		public native ISampleGrabber pGrabber(); public native videoDevice pGrabber(ISampleGrabber setter);    			// Grabs frame
		public native @Cast("AM_MEDIA_TYPE*") _AMMediaType pAmMediaType(); public native videoDevice pAmMediaType(_AMMediaType setter);

		public native IMediaEventEx pMediaEvent(); public native videoDevice pMediaEvent(IMediaEventEx setter);

		public native @ByRef @Cast("GUID*") Pointer videoType(); public native videoDevice videoType(Pointer setter);
		public native @Cast("long") int formatType(); public native videoDevice formatType(int setter);

		public native SampleGrabberCallback sgCallback(); public native videoDevice sgCallback(SampleGrabberCallback setter);

		public native @Cast("bool") boolean tryDiffSize(); public native videoDevice tryDiffSize(boolean setter);
		public native @Cast("bool") boolean useCrossbar(); public native videoDevice useCrossbar(boolean setter);
		public native @Cast("bool") boolean readyToCapture(); public native videoDevice readyToCapture(boolean setter);
		public native @Cast("bool") boolean sizeSet(); public native videoDevice sizeSet(boolean setter);
		public native @Cast("bool") boolean setupStarted(); public native videoDevice setupStarted(boolean setter);
		public native @Cast("bool") boolean specificFormat(); public native videoDevice specificFormat(boolean setter);
		public native @Cast("bool") boolean autoReconnect(); public native videoDevice autoReconnect(boolean setter);
		public native int nFramesForReconnect(); public native videoDevice nFramesForReconnect(int setter);
		public native @Cast("unsigned long") int nFramesRunning(); public native videoDevice nFramesRunning(int setter);
		public native int connection(); public native videoDevice connection(int setter);
		public native int storeConn(); public native videoDevice storeConn(int setter);
		public native int myID(); public native videoDevice myID(int setter);
		public native @Cast("long") int requestedFrameTime(); public native videoDevice requestedFrameTime(int setter); //ie fps

		public native @Cast("char") byte nDeviceName(int i); public native videoDevice nDeviceName(int i, byte setter);
		@MemberGetter public native @Cast("char*") BytePointer nDeviceName();
		public native @Cast("WCHAR") char wDeviceName(int i); public native videoDevice wDeviceName(int i, char setter);
		@MemberGetter public native @Cast("WCHAR*") CharPointer wDeviceName();

		public native @Cast("unsigned char*") BytePointer pixels(); public native videoDevice pixels(BytePointer setter);
		public native @Cast("char*") BytePointer pBuffer(); public native videoDevice pBuffer(BytePointer setter);

}
