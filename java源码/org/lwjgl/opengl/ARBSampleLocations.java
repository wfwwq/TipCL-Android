package org.lwjgl.opengl;

import java.nio.FloatBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/ARBSampleLocations.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/ARBSampleLocations.class */
public class ARBSampleLocations {
    public static final int GL_SAMPLE_LOCATION_SUBPIXEL_BITS_ARB = 37693;
    public static final int GL_SAMPLE_LOCATION_PIXEL_GRID_WIDTH_ARB = 37694;
    public static final int GL_SAMPLE_LOCATION_PIXEL_GRID_HEIGHT_ARB = 37695;
    public static final int GL_PROGRAMMABLE_SAMPLE_LOCATION_TABLE_SIZE_ARB = 37696;
    public static final int GL_FRAMEBUFFER_PROGRAMMABLE_SAMPLE_LOCATIONS_ARB = 37698;
    public static final int GL_FRAMEBUFFER_SAMPLE_LOCATION_PIXEL_GRID_ARB = 37699;

    public static native void nglFramebufferSampleLocationsfvARB(int i, int i2, int i3, long j);

    public static native void nglNamedFramebufferSampleLocationsfvARB(int i, int i2, int i3, long j);

    public static native void glEvaluateDepthValuesARB();

    static {
        GL.initialize();
    }

    protected ARBSampleLocations() {
        throw new UnsupportedOperationException();
    }

    public static void glFramebufferSampleLocationsfvARB(@NativeType("GLenum") int target, @NativeType("GLuint") int start, @NativeType("GLfloat const *") FloatBuffer v) {
        nglFramebufferSampleLocationsfvARB(target, start, v.remaining() >> 1, MemoryUtil.memAddress(v));
    }

    public static void glNamedFramebufferSampleLocationsfvARB(@NativeType("GLuint") int framebuffer, @NativeType("GLuint") int start, @NativeType("GLfloat const *") FloatBuffer v) {
        nglNamedFramebufferSampleLocationsfvARB(framebuffer, start, v.remaining() >> 1, MemoryUtil.memAddress(v));
    }

    public static void glFramebufferSampleLocationsfvARB(@NativeType("GLenum") int target, @NativeType("GLuint") int start, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glFramebufferSampleLocationsfvARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(target, start, v.length >> 1, v, __functionAddress);
    }

    public static void glNamedFramebufferSampleLocationsfvARB(@NativeType("GLuint") int framebuffer, @NativeType("GLuint") int start, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glNamedFramebufferSampleLocationsfvARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(framebuffer, start, v.length >> 1, v, __functionAddress);
    }
}
