package org.lwjgl.opengl;

import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/EXTWin32KeyedMutex.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/EXTWin32KeyedMutex.class */
public class EXTWin32KeyedMutex {
    @NativeType("GLboolean")
    public static native boolean glAcquireKeyedMutexWin32EXT(@NativeType("GLuint") int i, @NativeType("GLuint64") long j, @NativeType("GLuint") int i2);

    @NativeType("GLboolean")
    public static native boolean glReleaseKeyedMutexWin32EXT(@NativeType("GLuint") int i, @NativeType("GLuint64") long j);

    static {
        GL.initialize();
    }

    protected EXTWin32KeyedMutex() {
        throw new UnsupportedOperationException();
    }
}
