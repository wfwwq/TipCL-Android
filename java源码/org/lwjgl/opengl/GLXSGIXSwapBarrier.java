package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/GLXSGIXSwapBarrier.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/GLXSGIXSwapBarrier.class */
public class GLXSGIXSwapBarrier {
    protected GLXSGIXSwapBarrier() {
        throw new UnsupportedOperationException();
    }

    public static void glXBindSwapBarrierSGIX(@NativeType("Display *") long display, @NativeType("GLXDrawable") long drawable, int barrier) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXBindSwapBarrierSGIX;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(display);
            Checks.check(drawable);
        }
        JNI.callPPV(display, drawable, barrier, __functionAddress);
    }

    public static int nglXQueryMaxSwapBarriersSGIX(long display, int screen, long max) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXQueryMaxSwapBarriersSGIX;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(display);
        }
        return JNI.callPPI(display, screen, max, __functionAddress);
    }

    @NativeType("Bool")
    public static boolean glXQueryMaxSwapBarriersSGIX(@NativeType("Display *") long display, int screen, @NativeType("int *") IntBuffer max) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) max, 1);
        }
        return nglXQueryMaxSwapBarriersSGIX(display, screen, MemoryUtil.memAddress(max)) != 0;
    }

    @NativeType("Bool")
    public static boolean glXQueryMaxSwapBarriersSGIX(@NativeType("Display *") long display, int screen, @NativeType("int *") int[] max) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXQueryMaxSwapBarriersSGIX;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(display);
            Checks.check(max, 1);
        }
        return JNI.callPPI(display, screen, max, __functionAddress) != 0;
    }
}
