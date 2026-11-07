package org.lwjgl.opengl;

import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/WGLARBCreateContext.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/WGLARBCreateContext.class */
public class WGLARBCreateContext {
    public static final int WGL_CONTEXT_MAJOR_VERSION_ARB = 8337;
    public static final int WGL_CONTEXT_MINOR_VERSION_ARB = 8338;
    public static final int WGL_CONTEXT_LAYER_PLANE_ARB = 8339;
    public static final int WGL_CONTEXT_FLAGS_ARB = 8340;
    public static final int WGL_CONTEXT_DEBUG_BIT_ARB = 1;
    public static final int WGL_CONTEXT_FORWARD_COMPATIBLE_BIT_ARB = 2;
    public static final int ERROR_INVALID_VERSION_ARB = 8341;

    protected WGLARBCreateContext() {
        throw new UnsupportedOperationException();
    }

    public static long nwglCreateContextAttribsARB(long hdc, long shareContext, long attribList) {
        long __functionAddress = GL.getCapabilitiesWGL().wglCreateContextAttribsARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(hdc);
        }
        return JNI.callPPPP(hdc, shareContext, attribList, __functionAddress);
    }

    @NativeType("HGLRC")
    public static long wglCreateContextAttribsARB(@NativeType("HDC") long hdc, @NativeType("HGLRC") long shareContext, @NativeType("int const *") IntBuffer attribList) {
        if (Checks.CHECKS) {
            Checks.checkNTSafe(attribList);
        }
        return nwglCreateContextAttribsARB(hdc, shareContext, MemoryUtil.memAddressSafe(attribList));
    }

    @NativeType("HGLRC")
    public static long wglCreateContextAttribsARB(@NativeType("HDC") long hdc, @NativeType("HGLRC") long shareContext, @NativeType("int const *") int[] attribList) {
        long __functionAddress = GL.getCapabilitiesWGL().wglCreateContextAttribsARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(hdc);
            Checks.checkNTSafe(attribList);
        }
        return JNI.callPPPP(hdc, shareContext, attribList, __functionAddress);
    }
}
