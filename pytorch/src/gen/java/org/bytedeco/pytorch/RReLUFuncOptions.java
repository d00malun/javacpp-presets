// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


/** Options for {@code torch::nn::functional::rrelu}.
 * 
 *  Example:
 *  <pre>{@code
 *  namespace F = torch::nn::functional;
 *  F::rrelu(x, F::RReLUFuncOptions().lower(0.1).upper(0.4).inplace(true));
 *  }</pre> */
@Namespace("torch::nn::functional") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class RReLUFuncOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public RReLUFuncOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RReLUFuncOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RReLUFuncOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public RReLUFuncOptions position(long position) {
        return (RReLUFuncOptions)super.position(position);
    }
    @Override public RReLUFuncOptions getPointer(long i) {
        return new RReLUFuncOptions((Pointer)this).offsetAddress(i);
    }

  public native @ByRef @NoException(true) DoublePointer lower();
  public native @ByRef @NoException(true) DoublePointer upper();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer training();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer inplace();
}