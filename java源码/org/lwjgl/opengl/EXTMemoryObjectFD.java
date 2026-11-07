package org.lwjgl.opengl;

import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/EXTMemoryObjectFD.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/EXTMemoryObjectFD.class */
public class EXTMemoryObjectFD {
    public static final int GL_HANDLE_TYPE_OPAQUE_FD_EXT = 38278;

    public static native void glImportMemoryFdEXT(@NativeType("GLuint") int i, @NativeType("GLuint64") long j, @NativeType("GLenum") int i2, @NativeType("GLint") int i3);

    static {
        GL.initialize();
    }

    protected EXTMemoryObjectFD() {
        throw new UnsupportedOperationException();
    }
}
