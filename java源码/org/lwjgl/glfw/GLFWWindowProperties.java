package org.lwjgl.glfw;

import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/GLFWWindowProperties.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/GLFWWindowProperties.class */
public class GLFWWindowProperties {
    public int x;
    public int y;
    public CharSequence title;
    public boolean shouldClose;
    public boolean isInitialSizeCalled;
    public boolean isCursorEntered;
    public int width = GLFW.mGLFWWindowWidth;
    public int height = GLFW.mGLFWWindowHeight;
    public Map<Integer, Integer> inputModes = new HashMap();
    public Map<Integer, Integer> windowAttribs = new HashMap();
}
