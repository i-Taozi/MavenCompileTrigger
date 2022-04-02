// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_dataset;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

import static org.bytedeco.arrow.global.arrow_dataset.*;

@NoOffset @Name("arrow::util::optional<arrow::Compression::type>") @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class CompressionTypeOptional extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CompressionTypeOptional(Pointer p) { super(p); }
    public CompressionTypeOptional(Compression.type value) { this(); put(value); }
    public CompressionTypeOptional(@Cast("arrow::Compression::type") int value) { this(); put(value); }
    public CompressionTypeOptional()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef CompressionTypeOptional put(@ByRef CompressionTypeOptional x);


    @Name("value") public native Compression.type get();
    @ValueSetter public native CompressionTypeOptional put(Compression.type value);
    @ValueSetter public native CompressionTypeOptional put(@Cast("arrow::Compression::type") int value);
}

