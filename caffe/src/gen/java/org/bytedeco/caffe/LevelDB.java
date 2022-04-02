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


@Namespace("caffe::db") @NoOffset @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class LevelDB extends DB {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LevelDB(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public LevelDB(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public LevelDB position(long position) {
        return (LevelDB)super.position(position);
    }
    @Override public LevelDB getPointer(long i) {
        return new LevelDB((Pointer)this).offsetAddress(i);
    }

  public LevelDB() { super((Pointer)null); allocate(); }
  private native void allocate();
  public native void Open(@StdString BytePointer source, @Cast("caffe::db::Mode") int mode);
  public native void Open(@StdString String source, @Cast("caffe::db::Mode") int mode);
  public native void Close();
  public native LevelDBCursor NewCursor();
  public native LevelDBTransaction NewTransaction();
}
