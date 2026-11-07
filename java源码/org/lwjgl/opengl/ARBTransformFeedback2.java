package org.lwjgl.opengl;

import java.nio.IntBuffer;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/ARBTransformFeedback2.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/ARBTransformFeedback2.class */
public class ARBTransformFeedback2 {
    public static final int GL_TRANSFORM_FEEDBACK = 36386;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED = 36387;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE = 36388;
    public static final int GL_TRANSFORM_FEEDBACK_BINDING = 36389;

    static {
        GL.initialize();
    }

    protected ARBTransformFeedback2() {
        throw new UnsupportedOperationException();
    }

    public static void glBindTransformFeedback(@NativeType("GLenum") int target, @NativeType("GLuint") int id) {
        GL40C.glBindTransformFeedback(target, id);
    }

    public static void nglDeleteTransformFeedbacks(int n, long ids) {
        GL40C.nglDeleteTransformFeedbacks(n, ids);
    }

    public static void glDeleteTransformFeedbacks(@NativeType("GLuint const *") IntBuffer ids) {
        GL40C.glDeleteTransformFeedbacks(ids);
    }

    public static void glDeleteTransformFeedbacks(@NativeType("GLuint const *") int id) {
        GL40C.glDeleteTransformFeedbacks(id);
    }

    public static void nglGenTransformFeedbacks(int n, long ids) {
        GL40C.nglGenTransformFeedbacks(n, ids);
    }

    public static void glGenTransformFeedbacks(@NativeType("GLuint *") IntBuffer ids) {
        GL40C.glGenTransformFeedbacks(ids);
    }

    @NativeType("void")
    public static int glGenTransformFeedbacks() {
        return GL40C.glGenTransformFeedbacks();
    }

    @NativeType("GLboolean")
    public static boolean glIsTransformFeedback(@NativeType("GLuint") int id) {
        return GL40C.glIsTransformFeedback(id);
    }

    public static void glPauseTransformFeedback() {
        GL40C.glPauseTransformFeedback();
    }

    public static void glResumeTransformFeedback() {
        GL40C.glResumeTransformFeedback();
    }

    public static void glDrawTransformFeedback(@NativeType("GLenum") int mode, @NativeType("GLuint") int id) {
        GL40C.glDrawTransformFeedback(mode, id);
    }

    public static void glDeleteTransformFeedbacks(@NativeType("GLuint const *") int[] ids) {
        GL40C.glDeleteTransformFeedbacks(ids);
    }

    public static void glGenTransformFeedbacks(@NativeType("GLuint *") int[] ids) {
        GL40C.glGenTransformFeedbacks(ids);
    }
}
