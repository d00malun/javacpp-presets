// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnxruntime;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;

import static org.bytedeco.onnxruntime.global.onnxruntime.*;


/** \brief ROCM Provider Options
*
* @see OrtApi::SessionOptionsAppendExecutionProvider_ROCM
*/
@NoOffset @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class OrtROCMProviderOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OrtROCMProviderOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OrtROCMProviderOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public OrtROCMProviderOptions position(long position) {
        return (OrtROCMProviderOptions)super.position(position);
    }
    @Override public OrtROCMProviderOptions getPointer(long i) {
        return new OrtROCMProviderOptions((Pointer)this).offsetAddress(i);
    }

// #ifdef __cplusplus
  public OrtROCMProviderOptions() { super((Pointer)null); allocate(); }
  private native void allocate();
// #endif

  /** \brief ROCM device Id
  *   Defaults to 0.
  */
  public native int device_id(); public native OrtROCMProviderOptions device_id(int setter);

  /** \brief ROCM MIOpen Convolution algorithm exaustive search option.
  *   Defaults to 0 (false).
  */
  public native int miopen_conv_exhaustive_search(); public native OrtROCMProviderOptions miopen_conv_exhaustive_search(int setter);

  /** \brief ROCM memory limit (To use all possible memory pass in maximum size_t)
  *   Defaults to SIZE_MAX.
  *   \note If a ::OrtArenaCfg has been applied, it will override this field
  */
  public native @Cast("size_t") long gpu_mem_limit(); public native OrtROCMProviderOptions gpu_mem_limit(long setter);

  /** \brief Strategy used to grow the memory arena
  *   0 = kNextPowerOfTwo<br>
  *   1 = kSameAsRequested<br>
  *   Defaults to 0.
  *   \note If a ::OrtArenaCfg has been applied, it will override this field
  */
  public native int arena_extend_strategy(); public native OrtROCMProviderOptions arena_extend_strategy(int setter);

  /** \brief Flag indicating if copying needs to take place on the same stream as the compute stream in the ROCM EP   
  *   0 = Use separate streams for copying and compute.
  *   1 = Use the same stream for copying and compute.
  *   Defaults to 1.
  *   WARNING: Setting this to 0 may result in data races for some models.
  *   Please see issue #4829 for more details.
  */
  public native int do_copy_in_default_stream(); public native OrtROCMProviderOptions do_copy_in_default_stream(int setter);

  /** \brief Flag indicating if there is a user provided compute stream
  *   Defaults to 0.
  */
  public native int has_user_compute_stream(); public native OrtROCMProviderOptions has_user_compute_stream(int setter);

  /** \brief User provided compute stream. 
  *   If provided, please set {@code has_user_compute_stream} to 1.
  */
  public native Pointer user_compute_stream(); public native OrtROCMProviderOptions user_compute_stream(Pointer setter);

  /** \brief ROCM memory arena configuration parameters
  */
  public native OrtArenaCfg default_memory_arena_cfg(); public native OrtROCMProviderOptions default_memory_arena_cfg(OrtArenaCfg setter);

}