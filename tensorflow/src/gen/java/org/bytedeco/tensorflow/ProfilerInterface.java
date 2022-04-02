// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Interface for tensorflow profiler plugins.
//
// ProfileSession calls each of these methods at most once per instance, and
// implementations can rely on that guarantee for simplicity.
//
// Thread-safety: Implementations are only required to be go/thread-compatible.
// ProfileSession is go/thread-safe and synchronizes access to ProfilerInterface
// instances.
@Namespace("tensorflow::profiler") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ProfilerInterface extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ProfilerInterface(Pointer p) { super(p); }


  // Starts profiling.
  public native @ByVal Status Start();

  // Stops profiling.
  public native @ByVal Status Stop();

  // Moves collected profile data into step_stats_collector.
  public native @ByVal Status CollectData(RunMetadata run_metadata);
}
