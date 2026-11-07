package org.lwjgl.opengl;

import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/GLX11.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/GLX11.class */
public class GLX11 extends GLX {
    public static final int GLX_VENDOR = 1;
    public static final int GLX_VERSION = 2;
    public static final int GLX_EXTENSIONS = 3;

    protected GLX11() {
        throw new UnsupportedOperationException();
    }

    public static long nglXQueryExtensionsString(long display, int screen) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXQueryExtensionsString;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(display);
        }
        return JNI.callPP(display, screen, __functionAddress);
    }

    @NativeType("char const *")
    public static String glXQueryExtensionsString(@NativeType("Display *") long display, int screen) {
        long __result = nglXQueryExtensionsString(display, screen);
        return MemoryUtil.memASCIISafe(__result);
    }

    public static long nglXGetClientString(long display, int name) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXGetClientString;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(display);
        }
        return JNI.callPP(display, name, __functionAddress);
    }

    @NativeType("char const *")
    public static String glXGetClientString(@NativeType("Display *") long display, int name) {
        long __result = nglXGetClientString(display, name);
        return MemoryUtil.memASCIISafe(__result);
    }

    public static long nglXQueryServerString(long display, int screen, int name) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXQueryServerString;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(display);
        }
        return JNI.callPP(display, screen, name, __functionAddress);
    }

    @NativeType("char const *")
    public static String glXQueryServerString(@NativeType("Display *") long display, int screen, int name) {
        long __result = nglXQueryServerString(display, screen, name);
        return MemoryUtil.memASCIISafe(__result);
    }
}
