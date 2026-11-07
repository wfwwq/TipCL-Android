package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/WGLNVVertexArrayRange.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/WGLNVVertexArrayRange.class */
public class WGLNVVertexArrayRange {
    protected WGLNVVertexArrayRange() {
        throw new UnsupportedOperationException();
    }

    public static long nwglAllocateMemoryNV(int size, float readfreq, float writefreq, float priority) {
        long __functionAddress = GL.getCapabilitiesWGL().wglAllocateMemoryNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callP(size, readfreq, writefreq, priority, __functionAddress);
    }

    @NativeType("void *")
    public static ByteBuffer wglAllocateMemoryNV(@NativeType("GLsizei") int size, @NativeType("GLfloat") float readfreq, @NativeType("GLfloat") float writefreq, @NativeType("GLfloat") float priority) {
        long __result = nwglAllocateMemoryNV(size, readfreq, writefreq, priority);
        return MemoryUtil.memByteBufferSafe(__result, size);
    }

    public static void nwglFreeMemoryNV(long pointer) {
        long __functionAddress = GL.getCapabilitiesWGL().wglFreeMemoryNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(pointer, __functionAddress);
    }

    public static void wglFreeMemoryNV(@NativeType("void *") ByteBuffer pointer) {
        nwglFreeMemoryNV(MemoryUtil.memAddress(pointer));
    }
}
