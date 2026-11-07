package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-lwjglx.jar:org/lwjgl/opengl/Util.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-lwjglx.jar:org/lwjgl/opengl/Util.class */
public final class Util {
    private Util() {
    }

    public static void checkGLError() throws OpenGLException {
        int err = GL30.glGetError();
        if (err != 0) {
            throw new OpenGLException(err);
        }
    }

    public static String translateGLErrorString(int error_code) {
        switch (error_code) {
            case 0:
                return "No error";
            case 1280:
                return "Invalid enum";
            case 1281:
                return "Invalid value";
            case 1282:
                return "Invalid operation";
            case 1283:
                return "Stack overflow";
            case 1284:
                return "Stack underflow";
            case 1285:
                return "Out of memory";
            case 1286:
                return "Invalid framebuffer operation";
            case ARBImaging.GL_TABLE_TOO_LARGE /* 32817 */:
                return "Table too large";
            default:
                return null;
        }
    }
}
