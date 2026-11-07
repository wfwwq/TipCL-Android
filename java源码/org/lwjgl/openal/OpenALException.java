package org.lwjgl.openal;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-lwjglx.jar:org/lwjgl/openal/OpenALException.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-lwjglx.jar:org/lwjgl/openal/OpenALException.class */
public class OpenALException extends RuntimeException {
    private static final long serialVersionUID = 1;

    public OpenALException() {
    }

    public OpenALException(int error_code) {
        super("OpenAL error: " + AL10.alGetString(error_code) + " (" + error_code + ")");
    }

    public OpenALException(String message) {
        super(message);
    }

    public OpenALException(String message, Throwable cause) {
        super(message, cause);
    }

    public OpenALException(Throwable cause) {
        super(cause);
    }
}
