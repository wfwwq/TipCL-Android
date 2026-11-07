package org.lwjgl.opengl;

import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/AMDDrawBuffersBlend.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/AMDDrawBuffersBlend.class */
public class AMDDrawBuffersBlend {
    public static native void glBlendFuncIndexedAMD(@NativeType("GLuint") int i, @NativeType("GLenum") int i2, @NativeType("GLenum") int i3);

    public static native void glBlendFuncSeparateIndexedAMD(@NativeType("GLuint") int i, @NativeType("GLenum") int i2, @NativeType("GLenum") int i3, @NativeType("GLenum") int i4, @NativeType("GLenum") int i5);

    public static native void glBlendEquationIndexedAMD(@NativeType("GLuint") int i, @NativeType("GLenum") int i2);

    public static native void glBlendEquationSeparateIndexedAMD(@NativeType("GLuint") int i, @NativeType("GLenum") int i2, @NativeType("GLenum") int i3);

    static {
        GL.initialize();
    }

    protected AMDDrawBuffersBlend() {
        throw new UnsupportedOperationException();
    }
}
