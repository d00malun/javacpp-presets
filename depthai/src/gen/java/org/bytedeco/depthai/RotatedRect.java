// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

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

import static org.bytedeco.depthai.global.depthai.*;


/** RotatedRect structure */
@Namespace("dai") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class RotatedRect extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public RotatedRect() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RotatedRect(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RotatedRect(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public RotatedRect position(long position) {
        return (RotatedRect)super.position(position);
    }
    @Override public RotatedRect getPointer(long i) {
        return new RotatedRect((Pointer)this).offsetAddress(i);
    }

    public native @ByRef Point2f center(); public native RotatedRect center(Point2f setter);
    public native @ByRef Size2f size(); public native RotatedRect size(Size2f setter);
    /** degrees, increasing clockwise */
    public native float angle(); public native RotatedRect angle(float setter);
}
