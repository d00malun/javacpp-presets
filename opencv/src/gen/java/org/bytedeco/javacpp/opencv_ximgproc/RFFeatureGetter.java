// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp.opencv_ximgproc;

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

import static org.bytedeco.javacpp.opencv_ximgproc.opencv_ximgproc.*;


/** \addtogroup ximgproc_edge
 *  \{
<p>
/**
  Helper class for training part of [P. Dollar and C. L. Zitnick. Structured Forests for Fast Edge Detection, 2013].
 */
@Namespace("cv::ximgproc") @Properties(inherit = org.bytedeco.javacpp.opencv_ximgproc.opencv_ximgproc_presets.class)
public class RFFeatureGetter extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RFFeatureGetter(Pointer p) { super(p); }


    /**
     * This functions extracts feature channels from src.
     * Than StructureEdgeDetection uses this feature space
     * to detect edges.
     *
     * @param src : source image to extract features
     * @param features : output n-channel floating point feature matrix.
     *
     * @param gnrmRad : __rf.options.gradientNormalizationRadius
     * @param gsmthRad : __rf.options.gradientSmoothingRadius
     * @param shrink : __rf.options.shrinkNumber
     * @param outNum : __rf.options.numberOfOutputChannels
     * @param gradNum : __rf.options.numberOfGradientOrientations
     */
    public native void getFeatures(@Const @ByRef Mat src, @ByRef Mat features,
                                         int gnrmRad,
                                         int gsmthRad,
                                         int shrink,
                                         int outNum,
                                         int gradNum);
}