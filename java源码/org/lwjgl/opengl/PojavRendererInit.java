package org.lwjgl.opengl;

import org.lwjgl.system.FunctionProvider;
import org.lwjgl.system.SharedLibrary;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/PojavRendererInit.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/PojavRendererInit.class */
public class PojavRendererInit {
    public static native void nativeInitGl4esInternals(FunctionProvider functionProvider);

    public static void onCreateCapabilities(FunctionProvider functionProvider) {
        String rendererName = null;
        if (functionProvider instanceof SharedLibrary) {
            SharedLibrary rendererLibrary = (SharedLibrary) functionProvider;
            rendererName = rendererLibrary.getName();
        }
        if (!isValidString(rendererName)) {
            rendererName = System.getProperty("org.lwjgl.opengl.libname");
        }
        if (!isValidString(rendererName)) {
            System.out.println("PojavRendererInit: Failed to find Pojav renderer name! Renderer-specific initialization may not work properly");
        }
        if (rendererName.endsWith("libgl4es_114.so") || rendererName.endsWith("libng_gl4es.so")) {
            nativeInitGl4esInternals(functionProvider);
        }
    }

    private static boolean isValidString(String s) {
        return (s == null || s.isEmpty()) ? false : true;
    }
}
