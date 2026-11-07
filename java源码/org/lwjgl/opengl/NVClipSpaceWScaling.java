package org.lwjgl.opengl;

import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/NVClipSpaceWScaling.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/NVClipSpaceWScaling.class */
public class NVClipSpaceWScaling {
    public static final int GL_VIEWPORT_POSITION_W_SCALE_NV = 37756;
    public static final int GL_VIEWPORT_POSITION_W_SCALE_X_COEFF = 37757;
    public static final int GL_VIEWPORT_POSITION_W_SCALE_Y_COEFF = 37758;

    public static native void glViewportPositionWScaleNV(@NativeType("GLuint") int i, @NativeType("GLfloat") float f, @NativeType("GLfloat") float f2);

    static {
        GL.initialize();
    }

    protected NVClipSpaceWScaling() {
        throw new UnsupportedOperationException();
    }
}
