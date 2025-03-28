// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.tvm;

import org.bytedeco.tvm.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.tvm.global.tvm_runtime.*;


/**
 * \brief Base container of module.
 *
 * Please subclass ModuleNode to create a specific runtime module.
 *
 * <pre>{@code
 *
 *  class MyModuleNode : public ModuleNode {
 *   public:
 *    // implement the interface
 *  };
 *
 *  // use make_object to create a specific
 *  // instace of MyModuleNode.
 *  Module CreateMyModule() {
 *    ObjectPtr<MyModuleNode> n =
 *      tvm::runtime::make_object<MyModuleNode>();
 *    return Module(n);
 *  }
 *
 * }</pre>
 */
@Namespace("tvm::runtime") @NoOffset @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class ModuleNode extends TVMObject {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ModuleNode(Pointer p) { super(p); }

  /** \brief virtual destructor */
  /**
   * @return The per module type key.
   * \note This key is used to for serializing custom modules.
   */
  public native @Cast("const char*") BytePointer type_key();
  /**
   * \brief Get a PackedFunc from module.
   *
   *  The PackedFunc may not be fully initialized,
   *  there might still be first time running overhead when
   *  executing the function on certain devices.
   *  For benchmarking, use prepare to eliminate
   *
   * @param name the name of the function.
   * @param sptr_to_self The ObjectPtr that points to this module node.
   *
   * @return PackedFunc(nullptr) when it is not available.
   *
   * \note The function will always remain valid.
   *   If the function need resource from the module(e.g. late linking),
   *   it should capture sptr_to_self.
   */
  public native @ByVal PackedFunc GetFunction(@Const @ByRef TVMString name, @Const @ByRef ObjectPtr sptr_to_self);
  /**
   * \brief Save the module to file.
   * @param file_name The file to be saved to.
   * @param format The format of the file.
   */
  public native void SaveToFile(@Const @ByRef TVMString file_name, @Const @ByRef TVMString format);
  /**
   * \brief Save the module to binary stream.
   * @param stream The binary stream to save to.
   * \note It is recommended to implement this for device modules,
   *   but not necessarily host modules.
   *   We can use this to do AOT loading of bundled device functions.
   */
  public native void SaveToBinary(Stream stream);
  /**
   * \brief Get the source code of module, when available.
   * @param format Format of the source code, can be empty by default.
   * @return Possible source code when available.
   */
  public native @ByVal TVMString GetSource(@Const @ByRef(nullValue = "tvm::runtime::String(\"\")") TVMString format);
  public native @ByVal TVMString GetSource();
  /**
   * \brief Get the format of the module, when available.
   * @return Possible format when available.
   */
  public native @ByVal TVMString GetFormat();
  /**
   * \brief Get packed function from current module by name.
   *
   * @param name The name of the function.
   * @param query_imports Whether also query dependency modules.
   * @return The result function.
   *  This function will return PackedFunc(nullptr) if function do not exist.
   * \note Implemented in packed_func.cc
   */
  public native @ByVal PackedFunc GetFunction(@Const @ByRef TVMString name, @Cast("bool") boolean query_imports/*=false*/);
  public native @ByVal PackedFunc GetFunction(@Const @ByRef TVMString name);
  /**
   * \brief Import another module into this module.
   * @param other The module to be imported.
   *
   * \note Cyclic dependency is not allowed among modules,
   *  An error will be thrown when cyclic dependency is detected.
   */
  public native void Import(@ByVal Module other);
  /**
   * \brief Get a function from current environment
   *  The environment includes all the imports as well as Global functions.
   *
   * @param name name of the function.
   * @return The corresponding function.
   */
  public native @Const PackedFunc GetFuncFromEnv(@Const @ByRef TVMString name);

  /** \brief Clear all imports of the module. */
  public native void ClearImports();

  /** @return The module it imports from */
  public native @StdVector Module imports();

  /**
   * \brief Returns bitmap of property.
   * By default, none of the property is set. Derived class can override this function and set its
   * own property.
   */
  public native int GetPropertyMask();

  /** \brief Returns true if this module is 'DSO exportable'. */
  public native @Cast("bool") boolean IsDSOExportable();

  /** \brief Returns true if this module is 'Binary Serializable'. */
  public native @Cast("bool") boolean IsBinarySerializable();

  /**
   * \brief Returns true if this module has a definition for a function of \p name. If
   * \p query_imports is true, also search in any imported modules.
   *
   * Note that even if this function returns true the corresponding \p GetFunction result may be
   * nullptr if the function is not yet callable without further compilation.
   *
   * The default implementation just checkis if \p GetFunction is non-null.
   */
  public native @Cast("bool") boolean ImplementsFunction(@Const @ByRef TVMString name, @Cast("bool") boolean query_imports/*=false*/);
  public native @Cast("bool") boolean ImplementsFunction(@Const @ByRef TVMString name);

  // integration with the existing components.
  @MemberGetter public static native @Cast("const uint32_t") int _type_index();
  public static final int _type_index = _type_index();
  @MemberGetter public static native @Cast("const char*") BytePointer _type_key();
  // NOTE: ModuleNode can still be sub-classed
  //
  @MemberGetter public static native @Cast("const bool") boolean _type_final();
  public static final boolean _type_final = _type_final();
  @MemberGetter public static native int _type_child_slots();
  public static final int _type_child_slots = _type_child_slots();
  public static native @Cast("uint32_t") int RuntimeTypeIndex();
  public static native @Cast("uint32_t") int _GetOrAllocRuntimeTypeIndex();
}
