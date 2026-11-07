package org.lwjgl.opengl;

import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/NVDrawTexture.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/NVDrawTexture.class */
public class NVDrawTexture {
    public static native void glDrawTextureNV(@NativeType("GLuint") int i, @NativeType("GLuint") int i2, @NativeType("GLfloat") float f, @NativeType("GLfloat") float f2, @NativeType("GLfloat") float f3, @NativeType("GLfloat") float f4, @NativeType("GLfloat") float f5, @NativeType("GLfloat") float f6, @NativeType("GLfloat") float f7, @NativeType("GLfloat") float f8, @NativeType("GLfloat") float f9);

    static {
        GL.initialize();
    }

    protected NVDrawTexture() {
        throw new UnsupportedOperationException();
    }
}
