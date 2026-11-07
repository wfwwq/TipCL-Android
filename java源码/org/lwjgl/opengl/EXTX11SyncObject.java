package org.lwjgl.opengl;

import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/EXTX11SyncObject.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/EXTX11SyncObject.class */
public class EXTX11SyncObject {
    public static final int GL_SYNC_X11_FENCE_EXT = 37089;

    @NativeType("GLsync")
    public static native long glImportSyncEXT(@NativeType("GLenum") int i, @NativeType("GLintptr") long j, @NativeType("GLbitfield") int i2);

    static {
        GL.initialize();
    }

    protected EXTX11SyncObject() {
        throw new UnsupportedOperationException();
    }
}
