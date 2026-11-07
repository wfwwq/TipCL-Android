package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/NVTextureBarrier.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/NVTextureBarrier.class */
public class NVTextureBarrier {
    public static native void glTextureBarrierNV();

    static {
        GL.initialize();
    }

    protected NVTextureBarrier() {
        throw new UnsupportedOperationException();
    }
}
