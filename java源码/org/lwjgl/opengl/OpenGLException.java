package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-lwjglx.jar:org/lwjgl/opengl/OpenGLException.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-lwjglx.jar:org/lwjgl/opengl/OpenGLException.class */
public class OpenGLException extends RuntimeException {
    private static final long serialVersionUID = 1;

    public OpenGLException(int gl_error_code) {
        this(createErrorMessage(gl_error_code));
    }

    private static String createErrorMessage(int gl_error_code) {
        String error_string = Util.translateGLErrorString(gl_error_code);
        return error_string + " (" + gl_error_code + ")";
    }

    public OpenGLException() {
    }

    public OpenGLException(String message) {
        super(message);
    }

    public OpenGLException(String message, Throwable cause) {
        super(message, cause);
    }

    public OpenGLException(Throwable cause) {
        super(cause);
    }
}
