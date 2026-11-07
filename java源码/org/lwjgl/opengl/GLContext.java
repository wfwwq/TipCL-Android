package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-lwjglx.jar:org/lwjgl/opengl/GLContext.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-lwjglx.jar:org/lwjgl/opengl/GLContext.class */
public class GLContext {
    private static ThreadLocal<ContextCapabilities> contextCapabilities = new ThreadLocal<>();

    public static GLContext createFromCurrent() {
        return new GLContext();
    }

    public static void initCapabilities() {
        if (contextCapabilities.get() == null) {
            System.out.println("LWJGLX: GL caps init");
            contextCapabilities.set(new ContextCapabilities());
        }
    }

    public static ContextCapabilities getCapabilities() {
        return contextCapabilities.get();
    }
}
