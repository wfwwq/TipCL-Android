package org.lwjgl.opengl;

import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/ARBES32Compatibility.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/ARBES32Compatibility.class */
public class ARBES32Compatibility {
    public static final int GL_PRIMITIVE_BOUNDING_BOX_ARB = 37566;
    public static final int GL_MULTISAMPLE_LINE_WIDTH_RANGE_ARB = 37761;
    public static final int GL_MULTISAMPLE_LINE_WIDTH_GRANULARITY_ARB = 37762;

    public static native void glPrimitiveBoundingBoxARB(@NativeType("GLfloat") float f, @NativeType("GLfloat") float f2, @NativeType("GLfloat") float f3, @NativeType("GLfloat") float f4, @NativeType("GLfloat") float f5, @NativeType("GLfloat") float f6, @NativeType("GLfloat") float f7, @NativeType("GLfloat") float f8);

    static {
        GL.initialize();
    }

    protected ARBES32Compatibility() {
        throw new UnsupportedOperationException();
    }
}
