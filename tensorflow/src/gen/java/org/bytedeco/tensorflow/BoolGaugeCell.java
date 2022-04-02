// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// GaugeCell stores each value of a gauge.
//
// A cell can be passed off to a module which may repeatedly update it without
// needing further map-indexing computations. This improves both encapsulation
// (separate modules can own a cell each, without needing to know about the map
// to which both cells belong) and performance (since map indexing and
// associated locking are both avoided).
//
// This class is thread-safe.
@Name("tensorflow::monitoring::GaugeCell<bool>") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class BoolGaugeCell extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BoolGaugeCell(Pointer p) { super(p); }

  public BoolGaugeCell(@Cast("const bool") boolean value) { super((Pointer)null); allocate(value); }
  private native void allocate(@Cast("const bool") boolean value);

  // Atomically sets the value.
  public native void Set(@Cast("const bool") boolean value);

  // Retrieves the current value.
  public native @Cast("bool") boolean value();
}
