package org.lwjgl.opengl;

import java.nio.FloatBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/EXTGPUProgramParameters.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/EXTGPUProgramParameters.class */
public class EXTGPUProgramParameters {
    public static native void nglProgramEnvParameters4fvEXT(int i, int i2, int i3, long j);

    public static native void nglProgramLocalParameters4fvEXT(int i, int i2, int i3, long j);

    static {
        GL.initialize();
    }

    protected EXTGPUProgramParameters() {
        throw new UnsupportedOperationException();
    }

    public static void glProgramEnvParameters4fvEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer params) {
        nglProgramEnvParameters4fvEXT(target, index, params.remaining() >> 2, MemoryUtil.memAddress(params));
    }

    public static void glProgramLocalParameters4fvEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer params) {
        nglProgramLocalParameters4fvEXT(target, index, params.remaining() >> 2, MemoryUtil.memAddress(params));
    }

    public static void glProgramEnvParameters4fvEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] params) {
        long __functionAddress = GL.getICD().glProgramEnvParameters4fvEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(target, index, params.length >> 2, params, __functionAddress);
    }

    public static void glProgramLocalParameters4fvEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] params) {
        long __functionAddress = GL.getICD().glProgramLocalParameters4fvEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(target, index, params.length >> 2, params, __functionAddress);
    }
}
