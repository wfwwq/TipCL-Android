package org.lwjgl.opengl;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/WGLNVDelayBeforeSwap.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/WGLNVDelayBeforeSwap.class */
public class WGLNVDelayBeforeSwap {
    protected WGLNVDelayBeforeSwap() {
        throw new UnsupportedOperationException();
    }

    @NativeType("BOOL")
    public static boolean wglDelayBeforeSwapNV(@NativeType("HDC") long hDC, @NativeType("GLfloat") float seconds) {
        long __functionAddress = GL.getCapabilitiesWGL().wglDelayBeforeSwapNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(hDC);
        }
        return JNI.callPI(hDC, seconds, __functionAddress) != 0;
    }
}
