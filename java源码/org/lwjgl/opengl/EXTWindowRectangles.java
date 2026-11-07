package org.lwjgl.opengl;

import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/EXTWindowRectangles.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/EXTWindowRectangles.class */
public class EXTWindowRectangles {
    public static final int GL_INCLUSIVE_EXT = 36624;
    public static final int GL_EXCLUSIVE_EXT = 36625;
    public static final int GL_WINDOW_RECTANGLE_EXT = 36626;
    public static final int GL_WINDOW_RECTANGLE_MODE_EXT = 36627;
    public static final int GL_MAX_WINDOW_RECTANGLES_EXT = 36628;
    public static final int GL_NUM_WINDOW_RECTANGLES_EXT = 36629;

    public static native void nglWindowRectanglesEXT(int i, int i2, long j);

    static {
        GL.initialize();
    }

    protected EXTWindowRectangles() {
        throw new UnsupportedOperationException();
    }

    public static void glWindowRectanglesEXT(@NativeType("GLenum") int mode, @NativeType("GLint const *") IntBuffer box) {
        nglWindowRectanglesEXT(mode, Checks.remainingSafe(box) >> 2, MemoryUtil.memAddressSafe(box));
    }

    public static void glWindowRectanglesEXT(@NativeType("GLenum") int mode, @NativeType("GLint const *") int[] box) {
        long __functionAddress = GL.getICD().glWindowRectanglesEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(mode, Checks.lengthSafe(box) >> 2, box, __functionAddress);
    }
}
