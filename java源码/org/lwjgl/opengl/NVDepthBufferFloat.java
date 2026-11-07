package org.lwjgl.opengl;

import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/NVDepthBufferFloat.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/NVDepthBufferFloat.class */
public class NVDepthBufferFloat {
    public static final int GL_DEPTH_COMPONENT32F_NV = 36267;
    public static final int GL_DEPTH32F_STENCIL8_NV = 36268;
    public static final int GL_FLOAT_32_UNSIGNED_INT_24_8_REV_NV = 36269;
    public static final int GL_DEPTH_BUFFER_FLOAT_MODE_NV = 36271;

    public static native void glDepthRangedNV(@NativeType("GLdouble") double d, @NativeType("GLdouble") double d2);

    public static native void glClearDepthdNV(@NativeType("GLdouble") double d);

    public static native void glDepthBoundsdNV(@NativeType("GLdouble") double d, @NativeType("GLdouble") double d2);

    static {
        GL.initialize();
    }

    protected NVDepthBufferFloat() {
        throw new UnsupportedOperationException();
    }
}
