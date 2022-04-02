// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;

@Name("std::unordered_map<torch::jit::Value*,torch::jit::Value*>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ValueValueMap extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ValueValueMap(Pointer p) { super(p); }
    public ValueValueMap()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef ValueValueMap put(@ByRef ValueValueMap x);

    public boolean empty() { return size() == 0; }
    public native long size();

    @Index public native Value get(Value i);
    public native ValueValueMap put(Value i, Value value);

    public native void erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *().first") @MemberGetter @Const Value first();
        public native @Name("operator *().second") @MemberGetter @Const Value second();
    }
}

