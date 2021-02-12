// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_dataset;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

import static org.bytedeco.arrow.global.arrow_dataset.*;


@Namespace("arrow::dataset") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class IpcFileWriteOptions extends FileWriteOptions {
    static { Loader.load(); }
    /** Default native constructor. */
    public IpcFileWriteOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IpcFileWriteOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IpcFileWriteOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IpcFileWriteOptions position(long position) {
        return (IpcFileWriteOptions)super.position(position);
    }
    @Override public IpcFileWriteOptions getPointer(long i) {
        return new IpcFileWriteOptions((Pointer)this).position(position + i);
    }

  /** Options passed to ipc::MakeFileWriter. use_threads is ignored */
  public native @SharedPtr IpcWriteOptions options(); public native IpcFileWriteOptions options(IpcWriteOptions setter);

  /** custom_metadata written to the file's footer */
  public native @Cast("const arrow::KeyValueMetadata*") @SharedPtr @ByRef KeyValueMetadata metadata(); public native IpcFileWriteOptions metadata(KeyValueMetadata setter);
}