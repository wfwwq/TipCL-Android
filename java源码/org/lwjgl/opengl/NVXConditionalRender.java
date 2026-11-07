package org.lwjgl.opengl;

import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/NVXConditionalRender.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/NVXConditionalRender.class */
public class NVXConditionalRender {
    public static native void glBeginConditionalRenderNVX(@NativeType("GLuint") int i);

    public static native void glEndConditionalRenderNVX();

    static {
        GL.initialize();
    }

    protected NVXConditionalRender() {
        throw new UnsupportedOperationException();
    }
}
