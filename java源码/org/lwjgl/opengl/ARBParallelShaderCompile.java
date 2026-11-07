package org.lwjgl.opengl;

import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/ARBParallelShaderCompile.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/ARBParallelShaderCompile.class */
public class ARBParallelShaderCompile {
    public static final int GL_MAX_SHADER_COMPILER_THREADS_ARB = 37296;
    public static final int GL_COMPLETION_STATUS_ARB = 37297;

    public static native void glMaxShaderCompilerThreadsARB(@NativeType("GLuint") int i);

    static {
        GL.initialize();
    }

    protected ARBParallelShaderCompile() {
        throw new UnsupportedOperationException();
    }
}
