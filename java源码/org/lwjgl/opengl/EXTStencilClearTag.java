package org.lwjgl.opengl;

import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/EXTStencilClearTag.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/EXTStencilClearTag.class */
public class EXTStencilClearTag {
    public static final int GL_STENCIL_TAG_BITS_EXT = 35058;
    public static final int GL_STENCIL_CLEAR_TAG_VALUE_EXT = 35059;

    public static native void glStencilClearTagEXT(@NativeType("GLsizei") int i, @NativeType("GLuint") int i2);

    static {
        GL.initialize();
    }

    protected EXTStencilClearTag() {
        throw new UnsupportedOperationException();
    }
}
