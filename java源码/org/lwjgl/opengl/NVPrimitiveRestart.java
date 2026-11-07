package org.lwjgl.opengl;

import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/NVPrimitiveRestart.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/NVPrimitiveRestart.class */
public class NVPrimitiveRestart {
    public static final int GL_PRIMITIVE_RESTART_NV = 34136;
    public static final int GL_PRIMITIVE_RESTART_INDEX_NV = 34137;

    public static native void glPrimitiveRestartNV();

    public static native void glPrimitiveRestartIndexNV(@NativeType("GLuint") int i);

    static {
        GL.initialize();
    }

    protected NVPrimitiveRestart() {
        throw new UnsupportedOperationException();
    }
}
