// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.linux;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.linux.*;

// #endif


/* Unix98 requires this function to be declared here.  In other
   standards it is in <pthread.h>.  */
// #if defined __USE_UNIX98 && !defined __USE_XOPEN2K
@Properties(inherit = org.bytedeco.systems.presets.linux.class)
public class __prepare extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    __prepare(Pointer p) { super(p); }
    protected __prepare() { allocate(); }
    private native void allocate();
    public native void call();
}