package org.lwjgl.opengl;

import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/NVConservativeRasterPreSnapTriangles.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/NVConservativeRasterPreSnapTriangles.class */
public class NVConservativeRasterPreSnapTriangles {
    public static final int GL_CONSERVATIVE_RASTER_MODE_NV = 38221;
    public static final int GL_CONSERVATIVE_RASTER_MODE_POST_SNAP_NV = 38222;
    public static final int GL_CONSERVATIVE_RASTER_MODE_PRE_SNAP_TRIANGLES_NV = 38223;

    public static native void glConservativeRasterParameteriNV(@NativeType("GLenum") int i, @NativeType("GLint") int i2);

    static {
        GL.initialize();
    }

    protected NVConservativeRasterPreSnapTriangles() {
        throw new UnsupportedOperationException();
    }
}
