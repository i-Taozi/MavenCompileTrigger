// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.flycapture.FlyCapture2.*;
import static org.bytedeco.flycapture.global.FlyCapture2.*;

import static org.bytedeco.flycapture.global.FlyCapture2_C.*;


    /** Information about the camera's look up table. */
    @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2_C.class)
public class fc2LUTData extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public fc2LUTData() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public fc2LUTData(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public fc2LUTData(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public fc2LUTData position(long position) {
            return (fc2LUTData)super.position(position);
        }
        @Override public fc2LUTData getPointer(long i) {
            return new fc2LUTData((Pointer)this).offsetAddress(i);
        }
    
        /** Flag indicating if LUT is supported. */
        public native @Cast("BOOL") int supported(); public native fc2LUTData supported(int setter);
        /** Flag indicating if LUT is enabled. */
        public native @Cast("BOOL") int enabled(); public native fc2LUTData enabled(int setter);
        /** The number of LUT banks available (Always 1 for PGR LUT). */
        public native @Cast("unsigned int") int numBanks(); public native fc2LUTData numBanks(int setter);
        /** The number of LUT channels per bank available. */
        public native @Cast("unsigned int") int numChannels(); public native fc2LUTData numChannels(int setter);
        /** The input bit depth of the LUT. */
        public native @Cast("unsigned int") int inputBitDepth(); public native fc2LUTData inputBitDepth(int setter);
        /** The output bit depth of the LUT. */
        public native @Cast("unsigned int") int outputBitDepth(); public native fc2LUTData outputBitDepth(int setter);
        /** The number of entries in the LUT. */
        public native @Cast("unsigned int") int numEntries(); public native fc2LUTData numEntries(int setter);
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native fc2LUTData reserved(int i, int setter);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

    }
