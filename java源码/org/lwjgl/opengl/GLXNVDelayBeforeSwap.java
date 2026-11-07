package org.lwjgl.opengl;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/GLXNVDelayBeforeSwap.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/GLXNVDelayBeforeSwap.class */
public class GLXNVDelayBeforeSwap {
    protected GLXNVDelayBeforeSwap() {
        throw new UnsupportedOperationException();
    }

    @NativeType("Bool")
    public static boolean glXDelayBeforeSwapNV(@NativeType("Display *") long display, @NativeType("GLXDrawable") long drawable, @NativeType("GLfloat") float seconds) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXDelayBeforeSwapNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(display);
            Checks.check(drawable);
        }
        return JNI.callPPI(display, drawable, seconds, __functionAddress) != 0;
    }
}
