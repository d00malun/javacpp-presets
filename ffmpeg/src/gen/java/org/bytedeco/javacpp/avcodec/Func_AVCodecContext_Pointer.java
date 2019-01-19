// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp.avcodec;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.javacpp.avutil.*;
import static org.bytedeco.javacpp.avutil.avutil.*;
import org.bytedeco.javacpp.swresample.*;
import static org.bytedeco.javacpp.swresample.swresample.*;

import static org.bytedeco.javacpp.avcodec.avcodec.*;


@Properties(inherit = org.bytedeco.javacpp.avcodec.avcodec_presets.class)
public class Func_AVCodecContext_Pointer extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Func_AVCodecContext_Pointer(Pointer p) { super(p); }
    protected Func_AVCodecContext_Pointer() { allocate(); }
    private native void allocate();
    public native int call(AVCodecContext c2, Pointer arg2);
}