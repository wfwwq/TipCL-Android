package org.lwjgl.opengl;

import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/AMDFramebufferMultisampleAdvanced.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/AMDFramebufferMultisampleAdvanced.class */
public class AMDFramebufferMultisampleAdvanced {
    public static final int GL_RENDERBUFFER_STORAGE_SAMPLES_AMD = 37298;
    public static final int GL_MAX_COLOR_FRAMEBUFFER_SAMPLES_AMD = 37299;
    public static final int GL_MAX_COLOR_FRAMEBUFFER_STORAGE_SAMPLES_AMD = 37300;
    public static final int GL_MAX_DEPTH_STENCIL_FRAMEBUFFER_SAMPLES_AMD = 37301;
    public static final int GL_NUM_SUPPORTED_MULTISAMPLE_MODES_AMD = 37302;
    public static final int GL_SUPPORTED_MULTISAMPLE_MODES_AMD = 37303;

    public static native void glRenderbufferStorageMultisampleAdvancedAMD(@NativeType("GLenum") int i, @NativeType("GLsizei") int i2, @NativeType("GLsizei") int i3, @NativeType("GLenum") int i4, @NativeType("GLsizei") int i5, @NativeType("GLsizei") int i6);

    public static native void glNamedRenderbufferStorageMultisampleAdvancedAMD(@NativeType("GLuint") int i, @NativeType("GLsizei") int i2, @NativeType("GLsizei") int i3, @NativeType("GLenum") int i4, @NativeType("GLsizei") int i5, @NativeType("GLsizei") int i6);

    static {
        GL.initialize();
    }

    protected AMDFramebufferMultisampleAdvanced() {
        throw new UnsupportedOperationException();
    }
}
