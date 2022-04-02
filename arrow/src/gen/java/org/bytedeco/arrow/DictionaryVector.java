// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;

@Name("std::vector<std::pair<int64_t,std::shared_ptr<arrow::Array> > >") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class DictionaryVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DictionaryVector(Pointer p) { super(p); }
    public DictionaryVector(long[] firstValue, @Cast({"", "std::shared_ptr<arrow::Array>"}) Array[] secondValue) { this(Math.min(firstValue.length, secondValue.length)); put(firstValue, secondValue); }
    public DictionaryVector()       { allocate();  }
    public DictionaryVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef DictionaryVector put(@ByRef DictionaryVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native @Cast("int64_t") long first(@Cast("size_t") long i); public native DictionaryVector first(@Cast("size_t") long i, long first);
    @Index(function = "at") public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::Array>"}) Array second(@Cast("size_t") long i);  public native DictionaryVector second(@Cast("size_t") long i, Array second);

    public DictionaryVector put(long[] firstValue, Array[] secondValue) {
        for (int i = 0; i < firstValue.length && i < secondValue.length; i++) {
            first(i, firstValue[i]);
            second(i, secondValue[i]);
        }
        return this;
    }
}

