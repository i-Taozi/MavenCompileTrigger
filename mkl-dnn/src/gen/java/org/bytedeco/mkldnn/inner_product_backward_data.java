// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.mkldnn.global.mklml.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;


@Namespace("mkldnn") @Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class inner_product_backward_data extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public inner_product_backward_data(Pointer p) { super(p); }

    @NoOffset public static class desc extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public desc(Pointer p) { super(p); }
    
        public native @ByRef mkldnn_inner_product_desc_t data(); public native desc data(mkldnn_inner_product_desc_t setter);
        public desc(@Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc) { super((Pointer)null); allocate(diff_src_desc, weights_desc, diff_dst_desc); }
        private native void allocate(@Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc);
    }

    public static class primitive_desc extends org.bytedeco.mkldnn.primitive_desc {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public primitive_desc(Pointer p) { super(p); }
    
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef engine e,
                        @Const @ByRef inner_product_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(desc, e, hint_fwd_pd); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef engine e,
                        @Const @ByRef inner_product_forward.primitive_desc hint_fwd_pd);

        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr, @Const @ByRef engine e,
                        @Const @ByRef inner_product_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(desc, attr, e, hint_fwd_pd); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr, @Const @ByRef engine e,
                        @Const @ByRef inner_product_forward.primitive_desc hint_fwd_pd);

        public native @ByVal memory.primitive_desc diff_src_primitive_desc();
        public native @ByVal memory.primitive_desc weights_primitive_desc();
        public native @ByVal memory.primitive_desc diff_dst_primitive_desc();
    }

    public inner_product_backward_data(@Const @ByRef primitive_desc aprimitive_desc,
                @Const @ByRef primitive.at diff_dst, @Const @ByVal primitive.at weights,
                @Const @ByRef memory diff_src) { super((Pointer)null); allocate(aprimitive_desc, diff_dst, weights, diff_src); }
    private native void allocate(@Const @ByRef primitive_desc aprimitive_desc,
                @Const @ByRef primitive.at diff_dst, @Const @ByVal primitive.at weights,
                @Const @ByRef memory diff_src);
}
