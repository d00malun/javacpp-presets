// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cudnn.*;
import static org.bytedeco.cuda.global.cudnn.*;
import org.bytedeco.cuda.nvrtc.*;
import static org.bytedeco.cuda.global.nvrtc.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


@Namespace("nvinfer1::v_1_0") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IPluginV3OneRuntime extends IPluginCapability {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IPluginV3OneRuntime(Pointer p) { super(p); }

    /**
     *  \brief Return version information associated with this interface. Applications must not override this method.
     *  */
    
    
    //!
    //!
    //!
    public native @ByVal @NoException(true) InterfaceInfo getInterfaceInfo();

    /**
     *  \brief Set the tactic to be used in the subsequent call to enqueue(). If no custom tactics were advertised, this
     *  will have a value of 0, which is designated as the default tactic.
     * 
     *  @return 0 for success, else non-zero (which will cause engine termination). The returned code will be reported
     *  through the error recorder.
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) int setTactic(int tactic);

    /**
     *  \brief Called when a plugin is being prepared for execution for specific dimensions. This could
     *  happen multiple times in the execution phase, both during creation of an engine by IBuilder and execution of an
     *  engine by IExecutionContext.
     *   * IBuilder will call this function once per profile, with {@code in} resolved to the values specified by the
     *   kOPT field of the current profile.
     *   * IExecutionContext will call this during the next subsequent instance of enqueueV3() or executeV2() if:
     *     - The optimization profile is changed via setOptimizationProfile() or setOptimizationProfileAsync().
     *     - An input binding is changed via setInputTensorAddress() or setTensorAddress() or setInputShape().
     *  \warning The execution phase is timing critical during IExecutionContext but is not part of the timing loop when
     *  called from IBuilder. Performance bottlenecks of onShapeChange() will not show up during engine building but
     *  will be visible during execution if any triggering functions are called.
     * 
     *  @param in The input tensors attributes that are used for configuration.
     *  @param nbInputs Number of input tensors.
     *  @param out The output tensors attributes that are used for configuration.
     *  @param nbOutputs Number of output tensors.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) int onShapeChange(
            @Const PluginTensorDesc in, int nbInputs, @Const PluginTensorDesc out, int nbOutputs);

    /**
     *  \brief Execute the layer.
     * 
     *  @param inputDesc how to interpret the memory for the input tensors.
     *  @param outputDesc how to interpret the memory for the output tensors.
     *  @param inputs The memory for the input tensors.
     *  @param outputs The memory for the output tensors.
     *  @param workspace Workspace for execution.
     *  @param stream The stream in which to execute the kernels.
     * 
     *  @return 0 for success, else non-zero (which will cause engine termination). The returned code will be reported
     *  through the error recorder.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) int enqueue(@Const PluginTensorDesc inputDesc, @Const PluginTensorDesc outputDesc,
            @Cast("const void*const*") PointerPointer inputs, @Cast("void*const*") PointerPointer outputs, Pointer workspace, CUstream_st stream);
    public native @NoException(true) int enqueue(@Const PluginTensorDesc inputDesc, @Const PluginTensorDesc outputDesc,
            @Cast("const void*const*") @ByPtrPtr Pointer inputs, @Cast("void*const*") @ByPtrPtr Pointer outputs, Pointer workspace, CUstream_st stream);

    /**
     *  \brief Clone the plugin, attach the cloned plugin object to a execution context and grant the cloned plugin
     *  access to some context resources.
     * 
     *  This function is called automatically for each plugin when a new execution context is created. The plugin may
     *  use resources provided by the IPluginResourceContext until the plugin is deleted by TensorRT.
     * 
     *  If the plugin needs per-context resources, it can be allocated here.
     * 
     *  @param context A resource context that exposes methods to get access to execution context specific resources.
     *                 A different resource context is guaranteed for each different execution context to which the
     *                 plugin is attached.
     *  @see IPluginResourceContext
     * 
     *  \note This method should clone the entire IPluginV3 object, not just the runtime interface
     * 
     *  @return A clone of the IPluginV3 object whose runtime interface on which this method is invoked, which has
     *  attached to the provided resource context.
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) IPluginV3 attachToContext(IPluginResourceContext context);

    /**
     *  \brief Get the plugin fields which should be serialized.
     * 
     *  \note The set of plugin fields returned does not necessarily need to match that advertised through
     *  getFieldNames() of the corresponding plugin creator.
     <p>
     *  \note To serialize arbitrary plugin data, use a PluginField of
     *  PluginFieldType::kUNKNOWN, with the length of the PluginField set to the correct number of bytes.
     *  */
    public native @Const @NoException(true) PluginFieldCollection getFieldsToSerialize();
}