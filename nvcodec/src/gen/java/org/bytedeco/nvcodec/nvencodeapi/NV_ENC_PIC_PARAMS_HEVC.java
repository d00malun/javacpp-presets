// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.nvcodec.nvencodeapi;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.nvcodec.nvcuvid.*;
import static org.bytedeco.nvcodec.global.nvcuvid.*;

import static org.bytedeco.nvcodec.global.nvencodeapi.*;


/**
 * \struct _NV_ENC_PIC_PARAMS_HEVC
 * HEVC specific enc pic params. sent on a per frame basis.
 */
@Properties(inherit = org.bytedeco.nvcodec.presets.nvencodeapi.class)
public class NV_ENC_PIC_PARAMS_HEVC extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NV_ENC_PIC_PARAMS_HEVC() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NV_ENC_PIC_PARAMS_HEVC(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NV_ENC_PIC_PARAMS_HEVC(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NV_ENC_PIC_PARAMS_HEVC position(long position) {
        return (NV_ENC_PIC_PARAMS_HEVC)super.position(position);
    }
    @Override public NV_ENC_PIC_PARAMS_HEVC getPointer(long i) {
        return new NV_ENC_PIC_PARAMS_HEVC((Pointer)this).offsetAddress(i);
    }

    /** [in]: Specifies the display POC syntax This is required to be set if client is handling the picture type decision. */
    public native @Cast("uint32_t") int displayPOCSyntax(); public native NV_ENC_PIC_PARAMS_HEVC displayPOCSyntax(int setter);
    /** [in]: Set to 1 for a reference picture. This is ignored if NV_ENC_INITIALIZE_PARAMS::enablePTD is set to 1. */
    public native @Cast("uint32_t") int refPicFlag(); public native NV_ENC_PIC_PARAMS_HEVC refPicFlag(int setter);
    /** [in]: Specifies the temporal id of the picture */
    public native @Cast("uint32_t") int temporalId(); public native NV_ENC_PIC_PARAMS_HEVC temporalId(int setter);
    /** [in]: Forces an intra refresh with duration equal to intraRefreshFrameCnt. 
                                                                        When outputRecoveryPointSEI is set this is value is used for recovery_frame_cnt in recovery point SEI message 
                                                                        forceIntraRefreshWithFrameCnt cannot be used if B frames are used in the GOP structure specified */
    public native @Cast("uint32_t") int forceIntraRefreshWithFrameCnt(); public native NV_ENC_PIC_PARAMS_HEVC forceIntraRefreshWithFrameCnt(int setter);
    /** [in]: Set to 1 if client wants to encode this frame with each slice completely independent of other slices in the frame. 
                                                                        NV_ENC_INITIALIZE_PARAMS::enableConstrainedEncoding should be set to 1 */
    public native @Cast("uint32_t") @NoOffset int constrainedFrame(); public native NV_ENC_PIC_PARAMS_HEVC constrainedFrame(int setter);
    /** [in]: Set to 1 if client wants to change the sliceModeData field to specify new sliceSize Parameter
                                                                        When forceIntraRefreshWithFrameCnt is set it will have priority over sliceMode setting */
    public native @Cast("uint32_t") @NoOffset int sliceModeDataUpdate(); public native NV_ENC_PIC_PARAMS_HEVC sliceModeDataUpdate(int setter);
    /** [in]: Set to 1 if client wants to mark this frame as LTR */
    public native @Cast("uint32_t") @NoOffset int ltrMarkFrame(); public native NV_ENC_PIC_PARAMS_HEVC ltrMarkFrame(int setter);
    /** [in]: Set to 1 if client allows encoding this frame using the LTR frames specified in ltrFrameBitmap */
    public native @Cast("uint32_t") @NoOffset int ltrUseFrames(); public native NV_ENC_PIC_PARAMS_HEVC ltrUseFrames(int setter);
    /** [in]: Reserved bit fields and must be set to 0 */
    public native @Cast("uint32_t") @NoOffset int reservedBitFields(); public native NV_ENC_PIC_PARAMS_HEVC reservedBitFields(int setter);
    /** [in]: Array which specifies the slice type used to force intra slice for a particular slice. Currently supported only for NV_ENC_CONFIG_H264::sliceMode == 3. 
                                                                        Client should allocate array of size sliceModeData where sliceModeData is specified in field of ::_NV_ENC_CONFIG_H264 
                                                                        Array element with index n corresponds to nth slice. To force a particular slice to intra client should set corresponding array element to NV_ENC_SLICE_TYPE_I
                                                                        all other array elements should be set to NV_ENC_SLICE_TYPE_DEFAULT */
    public native @Cast("uint8_t*") BytePointer sliceTypeData(); public native NV_ENC_PIC_PARAMS_HEVC sliceTypeData(BytePointer setter);
    /** [in]: Client should set this to the number of elements allocated in sliceTypeData array. If sliceTypeData is NULL then this should be set to 0 */
    public native @Cast("uint32_t") int sliceTypeArrayCnt(); public native NV_ENC_PIC_PARAMS_HEVC sliceTypeArrayCnt(int setter);
    /** [in]: This parameter in conjunction with sliceModeData specifies the way in which the picture is divided into slices
                                                                        sliceMode = 0 CTU based slices, sliceMode = 1 Byte based slices, sliceMode = 2 CTU row based slices, sliceMode = 3, numSlices in Picture
                                                                        When forceIntraRefreshWithFrameCnt is set it will have priority over sliceMode setting
                                                                        When sliceMode == 0 and sliceModeData == 0 whole picture will be coded with one slice */
    public native @Cast("uint32_t") int sliceMode(); public native NV_ENC_PIC_PARAMS_HEVC sliceMode(int setter);
    /** [in]: Specifies the parameter needed for sliceMode. For:
                                                                        sliceMode = 0, sliceModeData specifies # of CTUs in each slice (except last slice)
                                                                        sliceMode = 1, sliceModeData specifies maximum # of bytes in each slice (except last slice)
                                                                        sliceMode = 2, sliceModeData specifies # of CTU rows in each slice (except last slice)
                                                                        sliceMode = 3, sliceModeData specifies number of slices in the picture. Driver will divide picture into slices optimally */
    public native @Cast("uint32_t") int sliceModeData(); public native NV_ENC_PIC_PARAMS_HEVC sliceModeData(int setter);
    /** [in]: Specifies the long term reference frame index to use for marking this frame as LTR.*/
    public native @Cast("uint32_t") int ltrMarkFrameIdx(); public native NV_ENC_PIC_PARAMS_HEVC ltrMarkFrameIdx(int setter);
    /** [in]: Specifies the associated bitmap of LTR frame indices to use when encoding this frame. */
    public native @Cast("uint32_t") int ltrUseFrameBitmap(); public native NV_ENC_PIC_PARAMS_HEVC ltrUseFrameBitmap(int setter);
    /** [in]: Not supported. Reserved for future use and must be set to 0. */
    public native @Cast("uint32_t") int ltrUsageMode(); public native NV_ENC_PIC_PARAMS_HEVC ltrUsageMode(int setter);
    /** [in]: Specifies the number of elements allocated in  seiPayloadArray array. */
    public native @Cast("uint32_t") int seiPayloadArrayCnt(); public native NV_ENC_PIC_PARAMS_HEVC seiPayloadArrayCnt(int setter);
    /** [in]: Reserved and must be set to 0. */
    public native @Cast("uint32_t") int reserved(); public native NV_ENC_PIC_PARAMS_HEVC reserved(int setter);
    /** [in]: Array of SEI payloads which will be inserted for this frame. */
    public native NV_ENC_SEI_PAYLOAD seiPayloadArray(); public native NV_ENC_PIC_PARAMS_HEVC seiPayloadArray(NV_ENC_SEI_PAYLOAD setter);
    /** [in]: Reserved and must be set to 0. */
    public native @Cast("uint32_t") int reserved2(int i); public native NV_ENC_PIC_PARAMS_HEVC reserved2(int i, int setter);
    @MemberGetter public native @Cast("uint32_t*") IntPointer reserved2();
    /** [in]: Reserved and must be set to NULL. */
    public native Pointer reserved3(int i); public native NV_ENC_PIC_PARAMS_HEVC reserved3(int i, Pointer setter);
    @MemberGetter public native @Cast("void**") PointerPointer reserved3();
}