package org.lwjgl.opengl;

import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/ARBES31Compatibility.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/ARBES31Compatibility.class */
public class ARBES31Compatibility {
    static {
        GL.initialize();
    }

    protected ARBES31Compatibility() {
        throw new UnsupportedOperationException();
    }

    public static void glMemoryBarrierByRegion(@NativeType("GLbitfield") int barriers) {
        GL45C.glMemoryBarrierByRegion(barriers);
    }
}
