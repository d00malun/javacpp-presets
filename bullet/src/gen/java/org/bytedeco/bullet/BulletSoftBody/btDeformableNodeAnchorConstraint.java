// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletSoftBody;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;
import org.bytedeco.bullet.BulletCollision.*;
import static org.bytedeco.bullet.global.BulletCollision.*;
import org.bytedeco.bullet.BulletDynamics.*;
import static org.bytedeco.bullet.global.BulletDynamics.*;

import static org.bytedeco.bullet.global.BulletSoftBody.*;


//
// Anchor Constraint between rigid and deformable node
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletSoftBody.class)
public class btDeformableNodeAnchorConstraint extends btDeformableContactConstraint {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btDeformableNodeAnchorConstraint(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btDeformableNodeAnchorConstraint(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btDeformableNodeAnchorConstraint position(long position) {
        return (btDeformableNodeAnchorConstraint)super.position(position);
    }
    @Override public btDeformableNodeAnchorConstraint getPointer(long i) {
        return new btDeformableNodeAnchorConstraint((Pointer)this).offsetAddress(i);
    }

	public native @Const btSoftBody.DeformableNodeRigidAnchor m_anchor(); public native btDeformableNodeAnchorConstraint m_anchor(btSoftBody.DeformableNodeRigidAnchor setter);

	public btDeformableNodeAnchorConstraint(@Const @ByRef btSoftBody.DeformableNodeRigidAnchor c, @Const @ByRef btContactSolverInfo infoGlobal) { super((Pointer)null); allocate(c, infoGlobal); }
	private native void allocate(@Const @ByRef btSoftBody.DeformableNodeRigidAnchor c, @Const @ByRef btContactSolverInfo infoGlobal);
	public btDeformableNodeAnchorConstraint(@Const @ByRef btDeformableNodeAnchorConstraint other) { super((Pointer)null); allocate(other); }
	private native void allocate(@Const @ByRef btDeformableNodeAnchorConstraint other);
	public btDeformableNodeAnchorConstraint() { super((Pointer)null); allocate(); }
	private native void allocate();
	public native @Cast("btScalar") double solveConstraint(@Const @ByRef btContactSolverInfo infoGlobal);

	// object A is the rigid/multi body, and object B is the deformable node/face
	public native @ByVal btVector3 getVa();
	// get the velocity of the deformable node in contact
	public native @ByVal btVector3 getVb();
	public native @ByVal btVector3 getDv(@Const btSoftBody.Node n);
	public native void applyImpulse(@Const @ByRef btVector3 impulse);

	public native void setPenetrationScale(@Cast("btScalar") double scale);
}
