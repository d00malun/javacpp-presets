// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp.opencv_tracking;

import org.bytedeco.javacpp.annotation.Index;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_core.opencv_core.*;
import org.bytedeco.javacpp.opencv_imgproc.*;
import static org.bytedeco.javacpp.opencv_imgproc.opencv_imgproc.*;
import org.bytedeco.javacpp.opencv_plot.*;
import static org.bytedeco.javacpp.opencv_plot.opencv_plot.*;
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
import org.bytedeco.javacpp.opencv_video.*;
import static org.bytedeco.javacpp.opencv_video.opencv_video.*;
import org.bytedeco.javacpp.opencv_dnn.*;
import static org.bytedeco.javacpp.opencv_dnn.opencv_dnn.*;

import static org.bytedeco.javacpp.opencv_tracking.opencv_tracking.*;


@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.javacpp.opencv_tracking.opencv_tracking_presets.class)
public class ClassifierThreshold extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ClassifierThreshold(Pointer p) { super(p); }


  public ClassifierThreshold( EstimatedGaussDistribution posSamples, EstimatedGaussDistribution negSamples ) { super((Pointer)null); allocate(posSamples, negSamples); }
  private native void allocate( EstimatedGaussDistribution posSamples, EstimatedGaussDistribution negSamples );

  public native void update( float value, int target );
  public native int eval( float value );

  public native Pointer getDistribution( int target );
}