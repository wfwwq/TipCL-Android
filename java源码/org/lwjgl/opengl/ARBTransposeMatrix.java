package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/ARBTransposeMatrix.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/ARBTransposeMatrix.class */
public class ARBTransposeMatrix {
    public static final int GL_TRANSPOSE_MODELVIEW_MATRIX_ARB = 34019;
    public static final int GL_TRANSPOSE_PROJECTION_MATRIX_ARB = 34020;
    public static final int GL_TRANSPOSE_TEXTURE_MATRIX_ARB = 34021;
    public static final int GL_TRANSPOSE_COLOR_MATRIX_ARB = 34022;

    public static native void nglLoadTransposeMatrixfARB(long j);

    public static native void nglLoadTransposeMatrixdARB(long j);

    public static native void nglMultTransposeMatrixfARB(long j);

    public static native void nglMultTransposeMatrixdARB(long j);

    static {
        GL.initialize();
    }

    protected ARBTransposeMatrix() {
        throw new UnsupportedOperationException();
    }

    public static void glLoadTransposeMatrixfARB(@NativeType("GLfloat const *") FloatBuffer m) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) m, 16);
        }
        nglLoadTransposeMatrixfARB(MemoryUtil.memAddress(m));
    }

    public static void glLoadTransposeMatrixdARB(@NativeType("GLdouble const *") DoubleBuffer m) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) m, 16);
        }
        nglLoadTransposeMatrixdARB(MemoryUtil.memAddress(m));
    }

    public static void glMultTransposeMatrixfARB(@NativeType("GLfloat const *") FloatBuffer m) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) m, 16);
        }
        nglMultTransposeMatrixfARB(MemoryUtil.memAddress(m));
    }

    public static void glMultTransposeMatrixdARB(@NativeType("GLdouble const *") DoubleBuffer m) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) m, 16);
        }
        nglMultTransposeMatrixdARB(MemoryUtil.memAddress(m));
    }

    public static void glLoadTransposeMatrixfARB(@NativeType("GLfloat const *") float[] m) {
        long __functionAddress = GL.getICD().glLoadTransposeMatrixfARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(m, 16);
        }
        JNI.callPV(m, __functionAddress);
    }

    public static void glLoadTransposeMatrixdARB(@NativeType("GLdouble const *") double[] m) {
        long __functionAddress = GL.getICD().glLoadTransposeMatrixdARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(m, 16);
        }
        JNI.callPV(m, __functionAddress);
    }

    public static void glMultTransposeMatrixfARB(@NativeType("GLfloat const *") float[] m) {
        long __functionAddress = GL.getICD().glMultTransposeMatrixfARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(m, 16);
        }
        JNI.callPV(m, __functionAddress);
    }

    public static void glMultTransposeMatrixdARB(@NativeType("GLdouble const *") double[] m) {
        long __functionAddress = GL.getICD().glMultTransposeMatrixdARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(m, 16);
        }
        JNI.callPV(m, __functionAddress);
    }
}
