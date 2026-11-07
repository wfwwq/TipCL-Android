package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/MESAFramebufferFlipY.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/MESAFramebufferFlipY.class */
public class MESAFramebufferFlipY {
    public static final int GL_FRAMEBUFFER_FLIP_Y_MESA = 35771;

    public static native void glFramebufferParameteriMESA(@NativeType("GLenum") int i, @NativeType("GLenum") int i2, @NativeType("GLint") int i3);

    public static native void nglGetFramebufferParameterivMESA(int i, int i2, long j);

    static {
        GL.initialize();
    }

    protected MESAFramebufferFlipY() {
        throw new UnsupportedOperationException();
    }

    public static void glGetFramebufferParameterivMESA(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) params, 1);
        }
        nglGetFramebufferParameterivMESA(target, pname, MemoryUtil.memAddress(params));
    }

    public static void glGetFramebufferParameterivMESA(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetFramebufferParameterivMESA;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(params, 1);
        }
        JNI.callPV(target, pname, params, __functionAddress);
    }
}
