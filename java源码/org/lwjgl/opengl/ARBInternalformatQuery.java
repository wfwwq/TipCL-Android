package org.lwjgl.opengl;

import java.nio.IntBuffer;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/ARBInternalformatQuery.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/ARBInternalformatQuery.class */
public class ARBInternalformatQuery {
    public static final int GL_NUM_SAMPLE_COUNTS = 37760;

    static {
        GL.initialize();
    }

    protected ARBInternalformatQuery() {
        throw new UnsupportedOperationException();
    }

    public static void nglGetInternalformativ(int target, int internalformat, int pname, int bufSize, long params) {
        GL42C.nglGetInternalformativ(target, internalformat, pname, bufSize, params);
    }

    public static void glGetInternalformativ(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL42C.glGetInternalformativ(target, internalformat, pname, params);
    }

    @NativeType("void")
    public static int glGetInternalformati(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int pname) {
        return GL42C.glGetInternalformati(target, internalformat, pname);
    }

    public static void glGetInternalformativ(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL42C.glGetInternalformativ(target, internalformat, pname, params);
    }
}
