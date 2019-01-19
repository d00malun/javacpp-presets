// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp.opencv_videostab;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_core.opencv_core.*;
import org.bytedeco.javacpp.opencv_imgproc.*;
import static org.bytedeco.javacpp.opencv_imgproc.opencv_imgproc.*;
import org.bytedeco.javacpp.opencv_imgcodecs.*;
import static org.bytedeco.javacpp.opencv_imgcodecs.opencv_imgcodecs.*;
import org.bytedeco.javacpp.opencv_videoio.*;
import static org.bytedeco.javacpp.opencv_videoio.opencv_videoio.*;
import org.bytedeco.javacpp.opencv_highgui.*;
import static org.bytedeco.javacpp.opencv_highgui.opencv_highgui.*;
import org.bytedeco.javacpp.opencv_flann.*;
import static org.bytedeco.javacpp.opencv_flann.opencv_flann.*;
import org.bytedeco.javacpp.opencv_features2d.*;
import static org.bytedeco.javacpp.opencv_features2d.opencv_features2d.*;
import org.bytedeco.javacpp.opencv_calib3d.*;
import static org.bytedeco.javacpp.opencv_calib3d.opencv_calib3d.*;
import org.bytedeco.javacpp.opencv_objdetect.*;
import static org.bytedeco.javacpp.opencv_objdetect.opencv_objdetect.*;
import org.bytedeco.javacpp.opencv_ximgproc.*;
import static org.bytedeco.javacpp.opencv_ximgproc.opencv_ximgproc.*;
import org.bytedeco.javacpp.opencv_video.*;
import static org.bytedeco.javacpp.opencv_video.opencv_video.*;
import org.bytedeco.javacpp.opencv_optflow.*;
import static org.bytedeco.javacpp.opencv_optflow.opencv_optflow.*;
import org.bytedeco.javacpp.opencv_photo.*;
import static org.bytedeco.javacpp.opencv_photo.opencv_photo.*;

import static org.bytedeco.javacpp.opencv_videostab.opencv_videostab.*;


/** \brief Describes a global 2D motion estimation method which uses keypoints detection and optical flow for
matching.
 */
@Namespace("cv::videostab") @NoOffset @Properties(inherit = org.bytedeco.javacpp.opencv_videostab.opencv_videostab_presets.class)
public class KeypointBasedMotionEstimator extends ImageMotionEstimatorBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public KeypointBasedMotionEstimator(Pointer p) { super(p); }

    public KeypointBasedMotionEstimator(@Ptr MotionEstimatorBase estimator) { super((Pointer)null); allocate(estimator); }
    private native void allocate(@Ptr MotionEstimatorBase estimator);

    public native void setMotionModel(@Cast("cv::videostab::MotionModel") int val);
    public native @Cast("cv::videostab::MotionModel") int motionModel();

    public native void setDetector(@Cast("cv::FeatureDetector*") @Ptr Feature2D val);
    public native @Cast("cv::FeatureDetector*") @Ptr Feature2D detector();

    public native void setOpticalFlowEstimator(@Ptr ISparseOptFlowEstimator val);
    public native @Ptr ISparseOptFlowEstimator opticalFlowEstimator();

    public native void setOutlierRejector(@Ptr IOutlierRejector val);
    public native @Ptr IOutlierRejector outlierRejector();

    public native @ByVal Mat estimate(@Const @ByRef Mat frame0, @Const @ByRef Mat frame1, @Cast("bool*") BoolPointer ok/*=0*/);
    public native @ByVal Mat estimate(@Const @ByRef Mat frame0, @Const @ByRef Mat frame1);
    public native @ByVal Mat estimate(@Const @ByRef Mat frame0, @Const @ByRef Mat frame1, @Cast("bool*") boolean[] ok/*=0*/);
    public native @ByVal Mat estimate(@ByVal UMat frame0, @ByVal UMat frame1, @Cast("bool*") boolean[] ok/*=0*/);
    public native @ByVal Mat estimate(@ByVal UMat frame0, @ByVal UMat frame1);
    public native @ByVal Mat estimate(@ByVal UMat frame0, @ByVal UMat frame1, @Cast("bool*") BoolPointer ok/*=0*/);
    public native @ByVal Mat estimate(@ByVal GpuMat frame0, @ByVal GpuMat frame1, @Cast("bool*") BoolPointer ok/*=0*/);
    public native @ByVal Mat estimate(@ByVal GpuMat frame0, @ByVal GpuMat frame1);
    public native @ByVal Mat estimate(@ByVal GpuMat frame0, @ByVal GpuMat frame1, @Cast("bool*") boolean[] ok/*=0*/);
}