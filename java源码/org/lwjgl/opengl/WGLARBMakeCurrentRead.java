package org.lwjgl.opengl;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/WGLARBMakeCurrentRead.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/WGLARBMakeCurrentRead.class */
public class WGLARBMakeCurrentRead {
    public static final int ERROR_INVALID_PIXEL_TYPE_ARB = 8259;
    public static final int ERROR_INCOMPATIBLE_DEVICE_CONTEXTS_ARB = 8276;

    protected WGLARBMakeCurrentRead() {
        throw new UnsupportedOperationException();
    }

    @NativeType("BOOL")
    public static boolean wglMakeContextCurrentARB(@NativeType("HDC") long drawDC, @NativeType("HDC") long readDC, @NativeType("HGLRC") long hglrc) {
        long __functionAddress = GL.getCapabilitiesWGL().wglMakeContextCurrentARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(drawDC);
            Checks.check(readDC);
            Checks.check(hglrc);
        }
        return JNI.callPPPI(drawDC, readDC, hglrc, __functionAddress) != 0;
    }

    @NativeType("HDC")
    public static long wglGetCurrentReadDCARB() {
        long __functionAddress = GL.getCapabilitiesWGL().wglGetCurrentReadDCARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.callP(__functionAddress);
    }
}
