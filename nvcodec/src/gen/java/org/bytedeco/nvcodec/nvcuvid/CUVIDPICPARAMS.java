// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.nvcodec.nvcuvid;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.nvcodec.global.nvcuvid.*;


/******************************************************************************************/
/** \struct CUVIDPICPARAMS
/** Picture parameters for decoding
/** This structure is used in cuvidDecodePicture API
/** IN  for cuvidDecodePicture
/******************************************************************************************/
@Properties(inherit = org.bytedeco.nvcodec.presets.nvcuvid.class)
public class CUVIDPICPARAMS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUVIDPICPARAMS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUVIDPICPARAMS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUVIDPICPARAMS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUVIDPICPARAMS position(long position) {
        return (CUVIDPICPARAMS)super.position(position);
    }
    @Override public CUVIDPICPARAMS getPointer(long i) {
        return new CUVIDPICPARAMS((Pointer)this).offsetAddress(i);
    }

    /** IN: Coded frame size in macroblocks                           */
    public native int PicWidthInMbs(); public native CUVIDPICPARAMS PicWidthInMbs(int setter);
    /** IN: Coded frame height in macroblocks                         */
    public native int FrameHeightInMbs(); public native CUVIDPICPARAMS FrameHeightInMbs(int setter);
    /** IN: Output index of the current picture                       */
    public native int CurrPicIdx(); public native CUVIDPICPARAMS CurrPicIdx(int setter);
    /** IN: 0=frame picture, 1=field picture                          */
    public native int field_pic_flag(); public native CUVIDPICPARAMS field_pic_flag(int setter);
    /** IN: 0=top field, 1=bottom field (ignored if field_pic_flag=0) */
    public native int bottom_field_flag(); public native CUVIDPICPARAMS bottom_field_flag(int setter);
    /** IN: Second field of a complementary field pair                */
    public native int second_field(); public native CUVIDPICPARAMS second_field(int setter);
    // Bitstream data
    /** IN: Number of bytes in bitstream data buffer                  */
    public native @Cast("unsigned int") int nBitstreamDataLen(); public native CUVIDPICPARAMS nBitstreamDataLen(int setter);
    /** IN: Ptr to bitstream data for this picture (slice-layer)      */
    public native @Cast("const unsigned char*") BytePointer pBitstreamData(); public native CUVIDPICPARAMS pBitstreamData(BytePointer setter);
    /** IN: Number of slices in this picture                          */
    public native @Cast("unsigned int") int nNumSlices(); public native CUVIDPICPARAMS nNumSlices(int setter);
    /** IN: nNumSlices entries, contains offset of each slice within 
                                                            the bitstream data buffer                             */
    public native @Cast("const unsigned int*") IntPointer pSliceDataOffsets(); public native CUVIDPICPARAMS pSliceDataOffsets(IntPointer setter);
    /** IN: This picture is a reference picture                       */
    public native int ref_pic_flag(); public native CUVIDPICPARAMS ref_pic_flag(int setter);
    /** IN: This picture is entirely intra coded                      */
    public native int intra_pic_flag(); public native CUVIDPICPARAMS intra_pic_flag(int setter);
    /** Reserved for future use                                       */
    public native @Cast("unsigned int") int Reserved(int i); public native CUVIDPICPARAMS Reserved(int i, int setter);
    @MemberGetter public native @Cast("unsigned int*") IntPointer Reserved();
    // IN: Codec-specific data
        /** Also used for MPEG-1 */
        @Name("CodecSpecific.mpeg2") public native @ByRef CUVIDMPEG2PICPARAMS CodecSpecific_mpeg2(); public native CUVIDPICPARAMS CodecSpecific_mpeg2(CUVIDMPEG2PICPARAMS setter);
        @Name("CodecSpecific.h264") public native @ByRef CUVIDH264PICPARAMS CodecSpecific_h264(); public native CUVIDPICPARAMS CodecSpecific_h264(CUVIDH264PICPARAMS setter);
        @Name("CodecSpecific.vc1") public native @ByRef CUVIDVC1PICPARAMS CodecSpecific_vc1(); public native CUVIDPICPARAMS CodecSpecific_vc1(CUVIDVC1PICPARAMS setter);
        @Name("CodecSpecific.mpeg4") public native @ByRef CUVIDMPEG4PICPARAMS CodecSpecific_mpeg4(); public native CUVIDPICPARAMS CodecSpecific_mpeg4(CUVIDMPEG4PICPARAMS setter);
        @Name("CodecSpecific.jpeg") public native @ByRef CUVIDJPEGPICPARAMS CodecSpecific_jpeg(); public native CUVIDPICPARAMS CodecSpecific_jpeg(CUVIDJPEGPICPARAMS setter);
        @Name("CodecSpecific.hevc") public native @ByRef CUVIDHEVCPICPARAMS CodecSpecific_hevc(); public native CUVIDPICPARAMS CodecSpecific_hevc(CUVIDHEVCPICPARAMS setter);
        @Name("CodecSpecific.vp8") public native @ByRef CUVIDVP8PICPARAMS CodecSpecific_vp8(); public native CUVIDPICPARAMS CodecSpecific_vp8(CUVIDVP8PICPARAMS setter);
        @Name("CodecSpecific.vp9") public native @ByRef CUVIDVP9PICPARAMS CodecSpecific_vp9(); public native CUVIDPICPARAMS CodecSpecific_vp9(CUVIDVP9PICPARAMS setter);
        @Name("CodecSpecific.av1") public native @ByRef CUVIDAV1PICPARAMS CodecSpecific_av1(); public native CUVIDPICPARAMS CodecSpecific_av1(CUVIDAV1PICPARAMS setter);
        @Name("CodecSpecific.CodecReserved") public native @Cast("unsigned int") int CodecSpecific_CodecReserved(int i); public native CUVIDPICPARAMS CodecSpecific_CodecReserved(int i, int setter);
        @Name("CodecSpecific.CodecReserved") @MemberGetter public native @Cast("unsigned int*") IntPointer CodecSpecific_CodecReserved();
}
