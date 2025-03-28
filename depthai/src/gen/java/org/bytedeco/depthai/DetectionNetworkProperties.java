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


/**
 *  Specify properties for DetectionNetwork
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class DetectionNetworkProperties extends DetectionNetworkPropertiesSerializable {
    static { Loader.load(); }
    /** Default native constructor. */
    public DetectionNetworkProperties() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DetectionNetworkProperties(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DetectionNetworkProperties(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public DetectionNetworkProperties position(long position) {
        return (DetectionNetworkProperties)super.position(position);
    }
    @Override public DetectionNetworkProperties getPointer(long i) {
        return new DetectionNetworkProperties((Pointer)this).offsetAddress(i);
    }

    public native @ByRef DetectionParserOptions parser(); public native DetectionNetworkProperties parser(DetectionParserOptions setter);
}
