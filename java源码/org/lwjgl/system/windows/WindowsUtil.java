package org.lwjgl.system.windows;

import java.nio.IntBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/windows/WindowsUtil.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/windows/WindowsUtil.class */
public final class WindowsUtil {
    private WindowsUtil() {
    }

    public static void windowsThrowException(String msg, IntBuffer GetLastError) {
        throw new RuntimeException(msg + " (error code = " + GetLastError.get(GetLastError.position()) + ")");
    }
}
