package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/ARBWindowPos.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/ARBWindowPos.class */
public class ARBWindowPos {
    public static native void glWindowPos2iARB(@NativeType("GLint") int i, @NativeType("GLint") int i2);

    public static native void glWindowPos2sARB(@NativeType("GLshort") short s, @NativeType("GLshort") short s2);

    public static native void glWindowPos2fARB(@NativeType("GLfloat") float f, @NativeType("GLfloat") float f2);

    public static native void glWindowPos2dARB(@NativeType("GLdouble") double d, @NativeType("GLdouble") double d2);

    public static native void nglWindowPos2ivARB(long j);

    public static native void nglWindowPos2svARB(long j);

    public static native void nglWindowPos2fvARB(long j);

    public static native void nglWindowPos2dvARB(long j);

    public static native void glWindowPos3iARB(@NativeType("GLint") int i, @NativeType("GLint") int i2, @NativeType("GLint") int i3);

    public static native void glWindowPos3sARB(@NativeType("GLshort") short s, @NativeType("GLshort") short s2, @NativeType("GLshort") short s3);

    public static native void glWindowPos3fARB(@NativeType("GLfloat") float f, @NativeType("GLfloat") float f2, @NativeType("GLfloat") float f3);

    public static native void glWindowPos3dARB(@NativeType("GLdouble") double d, @NativeType("GLdouble") double d2, @NativeType("GLdouble") double d3);

    public static native void nglWindowPos3ivARB(long j);

    public static native void nglWindowPos3svARB(long j);

    public static native void nglWindowPos3fvARB(long j);

    public static native void nglWindowPos3dvARB(long j);

    static {
        GL.initialize();
    }

    protected ARBWindowPos() {
        throw new UnsupportedOperationException();
    }

    public static void glWindowPos2ivARB(@NativeType("GLint const *") IntBuffer p) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) p, 2);
        }
        nglWindowPos2ivARB(MemoryUtil.memAddress(p));
    }

    public static void glWindowPos2svARB(@NativeType("GLshort const *") ShortBuffer p) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) p, 2);
        }
        nglWindowPos2svARB(MemoryUtil.memAddress(p));
    }

    public static void glWindowPos2fvARB(@NativeType("GLfloat const *") FloatBuffer p) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) p, 2);
        }
        nglWindowPos2fvARB(MemoryUtil.memAddress(p));
    }

    public static void glWindowPos2dvARB(@NativeType("GLdouble const *") DoubleBuffer p) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) p, 2);
        }
        nglWindowPos2dvARB(MemoryUtil.memAddress(p));
    }

    public static void glWindowPos3ivARB(@NativeType("GLint const *") IntBuffer p) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) p, 3);
        }
        nglWindowPos3ivARB(MemoryUtil.memAddress(p));
    }

    public static void glWindowPos3svARB(@NativeType("GLshort const *") ShortBuffer p) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) p, 3);
        }
        nglWindowPos3svARB(MemoryUtil.memAddress(p));
    }

    public static void glWindowPos3fvARB(@NativeType("GLfloat const *") FloatBuffer p) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) p, 3);
        }
        nglWindowPos3fvARB(MemoryUtil.memAddress(p));
    }

    public static void glWindowPos3dvARB(@NativeType("GLdouble const *") DoubleBuffer p) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) p, 3);
        }
        nglWindowPos3dvARB(MemoryUtil.memAddress(p));
    }

    public static void glWindowPos2ivARB(@NativeType("GLint const *") int[] p) {
        long __functionAddress = GL.getICD().glWindowPos2ivARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(p, 2);
        }
        JNI.callPV(p, __functionAddress);
    }

    public static void glWindowPos2svARB(@NativeType("GLshort const *") short[] p) {
        long __functionAddress = GL.getICD().glWindowPos2svARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(p, 2);
        }
        JNI.callPV(p, __functionAddress);
    }

    public static void glWindowPos2fvARB(@NativeType("GLfloat const *") float[] p) {
        long __functionAddress = GL.getICD().glWindowPos2fvARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(p, 2);
        }
        JNI.callPV(p, __functionAddress);
    }

    public static void glWindowPos2dvARB(@NativeType("GLdouble const *") double[] p) {
        long __functionAddress = GL.getICD().glWindowPos2dvARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(p, 2);
        }
        JNI.callPV(p, __functionAddress);
    }

    public static void glWindowPos3ivARB(@NativeType("GLint const *") int[] p) {
        long __functionAddress = GL.getICD().glWindowPos3ivARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(p, 3);
        }
        JNI.callPV(p, __functionAddress);
    }

    public static void glWindowPos3svARB(@NativeType("GLshort const *") short[] p) {
        long __functionAddress = GL.getICD().glWindowPos3svARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(p, 3);
        }
        JNI.callPV(p, __functionAddress);
    }

    public static void glWindowPos3fvARB(@NativeType("GLfloat const *") float[] p) {
        long __functionAddress = GL.getICD().glWindowPos3fvARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(p, 3);
        }
        JNI.callPV(p, __functionAddress);
    }

    public static void glWindowPos3dvARB(@NativeType("GLdouble const *") double[] p) {
        long __functionAddress = GL.getICD().glWindowPos3dvARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(p, 3);
        }
        JNI.callPV(p, __functionAddress);
    }
}
