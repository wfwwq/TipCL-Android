package org.lwjgl.opengl;

import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/NVFragmentCoverageToColor.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/NVFragmentCoverageToColor.class */
public class NVFragmentCoverageToColor {
    public static final int GL_FRAGMENT_COVERAGE_TO_COLOR_NV = 37597;
    public static final int GL_FRAGMENT_COVERAGE_COLOR_NV = 37598;

    public static native void glFragmentCoverageColorNV(@NativeType("GLuint") int i);

    static {
        GL.initialize();
    }

    protected NVFragmentCoverageToColor() {
        throw new UnsupportedOperationException();
    }
}
