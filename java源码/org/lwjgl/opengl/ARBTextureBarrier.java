package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/ARBTextureBarrier.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/ARBTextureBarrier.class */
public class ARBTextureBarrier {
    static {
        GL.initialize();
    }

    protected ARBTextureBarrier() {
        throw new UnsupportedOperationException();
    }

    public static void glTextureBarrier() {
        GL45C.glTextureBarrier();
    }
}
