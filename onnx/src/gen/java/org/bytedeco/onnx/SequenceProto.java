// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;

// ===================================================================

@Namespace("onnx") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class SequenceProto extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SequenceProto(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SequenceProto(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SequenceProto position(long position) {
        return (SequenceProto)super.position(position);
    }
    @Override public SequenceProto getPointer(long i) {
        return new SequenceProto((Pointer)this).position(position + i);
    }

  public SequenceProto() { super((Pointer)null); allocate(); }
  private native void allocate();

  public SequenceProto(@Const @ByRef SequenceProto from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef SequenceProto from);

  public native @ByRef @Name("operator =") SequenceProto put(@Const @ByRef SequenceProto from);

  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Const Reflection GetReflection();
  public static native @Const @ByRef SequenceProto default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const SequenceProto internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  
  public native void Swap(SequenceProto other);

  // implements Message ----------------------------------------------

  public native SequenceProto New();

  public native SequenceProto New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef SequenceProto from);
  public native void MergeFrom(@Const @ByRef SequenceProto from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
  public native @Cast("const char*") BytePointer _InternalParse(@Cast("const char*") BytePointer ptr, ParseContext ctx);
  public native String _InternalParse(String ptr, ParseContext ctx);
  public native int GetCachedSize();

  public native @ByVal @Cast("google::protobuf::Metadata*") Pointer GetMetadata();

  // nested types ----------------------------------------------------
  @MemberGetter public static native @Cast("const onnx::SequenceProto::DataType") int UNDEFINED();
  public static final int UNDEFINED = UNDEFINED();
  @MemberGetter public static native @Cast("const onnx::SequenceProto::DataType") int TENSOR();
  public static final int TENSOR = TENSOR();
  @MemberGetter public static native @Cast("const onnx::SequenceProto::DataType") int SPARSE_TENSOR();
  public static final int SPARSE_TENSOR = SPARSE_TENSOR();
  @MemberGetter public static native @Cast("const onnx::SequenceProto::DataType") int SEQUENCE();
  public static final int SEQUENCE = SEQUENCE();
  @MemberGetter public static native @Cast("const onnx::SequenceProto::DataType") int MAP();
  public static final int MAP = MAP();
  public static native @Cast("bool") boolean DataType_IsValid(int value);
  @MemberGetter public static native @Cast("const onnx::SequenceProto::DataType") int DataType_MIN();
  public static final int DataType_MIN = DataType_MIN();
  @MemberGetter public static native @Cast("const onnx::SequenceProto::DataType") int DataType_MAX();
  public static final int DataType_MAX = DataType_MAX();
  @MemberGetter public static native int DataType_ARRAYSIZE();
  public static final int DataType_ARRAYSIZE = DataType_ARRAYSIZE();
  public static native @Const EnumDescriptor DataType_descriptor();
  public static native @Cast("bool") boolean DataType_Parse(@StdString BytePointer name,
        @Cast("onnx::SequenceProto::DataType*") IntPointer value);
  public static native @Cast("bool") boolean DataType_Parse(@StdString String name,
        @Cast("onnx::SequenceProto::DataType*") IntBuffer value);
  public static native @Cast("bool") boolean DataType_Parse(@StdString BytePointer name,
        @Cast("onnx::SequenceProto::DataType*") int... value);
  public static native @Cast("bool") boolean DataType_Parse(@StdString String name,
        @Cast("onnx::SequenceProto::DataType*") IntPointer value);
  public static native @Cast("bool") boolean DataType_Parse(@StdString BytePointer name,
        @Cast("onnx::SequenceProto::DataType*") IntBuffer value);
  public static native @Cast("bool") boolean DataType_Parse(@StdString String name,
        @Cast("onnx::SequenceProto::DataType*") int... value);

  // accessors -------------------------------------------------------

  /** enum onnx::SequenceProto:: */
  public static final int
    kTensorValuesFieldNumber = 3,
    kSparseTensorValuesFieldNumber = 4,
    kSequenceValuesFieldNumber = 5,
    kMapValuesFieldNumber = 6,
    kNameFieldNumber = 1,
    kElemTypeFieldNumber = 2;
  // repeated .onnx.TensorProto tensor_values = 3;
  public native int tensor_values_size();
  public native void clear_tensor_values();
  public native TensorProto mutable_tensor_values(int index);
  public native @Const @ByRef TensorProto tensor_values(int index);
  public native TensorProto add_tensor_values();

  // repeated .onnx.SparseTensorProto sparse_tensor_values = 4;
  public native int sparse_tensor_values_size();
  public native void clear_sparse_tensor_values();
  public native SparseTensorProto mutable_sparse_tensor_values(int index);
  public native @Const @ByRef SparseTensorProto sparse_tensor_values(int index);
  public native SparseTensorProto add_sparse_tensor_values();

  // repeated .onnx.SequenceProto sequence_values = 5;
  public native int sequence_values_size();
  public native void clear_sequence_values();
  public native SequenceProto mutable_sequence_values(int index);
  public native @Const @ByRef SequenceProto sequence_values(int index);
  public native SequenceProto add_sequence_values();

  // repeated .onnx.MapProto map_values = 6;
  public native int map_values_size();
  public native void clear_map_values();
  public native MapProto mutable_map_values(int index);
  public native @Const @ByRef MapProto map_values(int index);
  public native MapProto add_map_values();

  // optional string name = 1;
  public native @Cast("bool") boolean has_name();
  public native void clear_name();
  public native @StdString BytePointer name();
  public native void set_name(@StdString BytePointer value);
  public native void set_name(@StdString String value);
  public native void set_name(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_name(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_name();
  public native void set_allocated_name(@StdString @Cast({"char*", "std::string*"}) BytePointer name);

  // optional int32 elem_type = 2;
  public native @Cast("bool") boolean has_elem_type();
  public native void clear_elem_type();
  public native @Cast("google::protobuf::int32") int elem_type();
  public native void set_elem_type(@Cast("google::protobuf::int32") int value);
}