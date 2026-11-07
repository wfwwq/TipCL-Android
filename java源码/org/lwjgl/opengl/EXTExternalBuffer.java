package org.lwjgl.opengl;

import org.lwjgl.system.Checks;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/EXTExternalBuffer.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/EXTExternalBuffer.class */
public class EXTExternalBuffer {
    public static native void nglBufferStorageExternalEXT(int i, long j, long j2, long j3, int i2);

    public static native void nglNamedBufferStorageExternalEXT(int i, long j, long j2, long j3, int i2);

    static {
        GL.initialize();
    }

    protected EXTExternalBuffer() {
        throw new UnsupportedOperationException();
    }

    public static void glBufferStorageExternalEXT(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLeglClientBufferEXT") long clientBuffer, @NativeType("GLbitfield") int flags) {
        if (Checks.CHECKS) {
            Checks.check(clientBuffer);
        }
        nglBufferStorageExternalEXT(target, offset, size, clientBuffer, flags);
    }

    public static void glNamedBufferStorageExternalEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLeglClientBufferEXT") long clientBuffer, @NativeType("GLbitfield") int flags) {
        if (Checks.CHECKS) {
            Checks.check(clientBuffer);
        }
        nglNamedBufferStorageExternalEXT(buffer, offset, size, clientBuffer, flags);
    }
}
