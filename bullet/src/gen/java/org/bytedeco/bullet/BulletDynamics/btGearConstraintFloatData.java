// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletDynamics;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;
import org.bytedeco.bullet.BulletCollision.*;
import static org.bytedeco.bullet.global.BulletCollision.*;

import static org.bytedeco.bullet.global.BulletDynamics.*;


/**do not change those serialization structures, it requires an updated sBulletDNAstr/sBulletDNAstr64 */
@Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btGearConstraintFloatData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btGearConstraintFloatData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btGearConstraintFloatData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btGearConstraintFloatData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btGearConstraintFloatData position(long position) {
        return (btGearConstraintFloatData)super.position(position);
    }
    @Override public btGearConstraintFloatData getPointer(long i) {
        return new btGearConstraintFloatData((Pointer)this).offsetAddress(i);
    }

	public native @ByRef btTypedConstraintFloatData m_typeConstraintData(); public native btGearConstraintFloatData m_typeConstraintData(btTypedConstraintFloatData setter);

	public native @ByRef btVector3FloatData m_axisInA(); public native btGearConstraintFloatData m_axisInA(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_axisInB(); public native btGearConstraintFloatData m_axisInB(btVector3FloatData setter);

	public native float m_ratio(); public native btGearConstraintFloatData m_ratio(float setter);
	public native @Cast("char") byte m_padding(int i); public native btGearConstraintFloatData m_padding(int i, byte setter);
	@MemberGetter public native @Cast("char*") BytePointer m_padding();
}
