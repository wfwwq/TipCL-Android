package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.FloatBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/AMDSamplePositions.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/AMDSamplePositions.class */
public class AMDSamplePositions {
    public static final int GL_SUBSAMPLE_DISTANCE_AMD = 34879;

    public static native void nglSetMultisamplefvAMD(int i, int i2, long j);

    static {
        GL.initialize();
    }

    protected AMDSamplePositions() {
        throw new UnsupportedOperationException();
    }

    public static void glSetMultisamplefvAMD(@NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer val) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) val, 2);
        }
        nglSetMultisamplefvAMD(pname, index, MemoryUtil.memAddress(val));
    }

    public static void glSetMultisamplefvAMD(@NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] val) {
        long __functionAddress = GL.getICD().glSetMultisamplefvAMD;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(val, 2);
        }
        JNI.callPV(pname, index, val, __functionAddress);
    }
}
