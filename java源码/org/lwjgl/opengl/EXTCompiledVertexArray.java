package org.lwjgl.opengl;

import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/EXTCompiledVertexArray.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/EXTCompiledVertexArray.class */
public class EXTCompiledVertexArray {
    public static final int GL_ARRAY_ELEMENT_LOCK_FIRST_EXT = 33192;
    public static final int GL_ARRAY_ELEMENT_LOCK_COUNT_EXT = 33193;

    public static native void glLockArraysEXT(@NativeType("GLint") int i, @NativeType("GLsizei") int i2);

    public static native void glUnlockArraysEXT();

    static {
        GL.initialize();
    }

    protected EXTCompiledVertexArray() {
        throw new UnsupportedOperationException();
    }
}
