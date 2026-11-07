package org.lwjgl.glfw;

import java.nio.ByteBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/glfw/CallbackBridge.class
  classes12.dex
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/glfw/CallbackBridge.class */
public class CallbackBridge {
    public static final int CLIPBOARD_COPY = 2000;
    public static final int CLIPBOARD_PASTE = 2001;
    public static final int EVENT_TYPE_CHAR = 1000;
    public static final int EVENT_TYPE_CHAR_MODS = 1001;
    public static final int EVENT_TYPE_CURSOR_ENTER = 1002;
    public static final int EVENT_TYPE_CURSOR_POS = 1003;
    public static final int EVENT_TYPE_FRAMEBUFFER_SIZE = 1004;
    public static final int EVENT_TYPE_KEY = 1005;
    public static final int EVENT_TYPE_MOUSE_BUTTON = 1006;
    public static final int EVENT_TYPE_SCROLL = 1007;
    public static final int EVENT_TYPE_WINDOW_SIZE = 1008;
    public static final int ANDROID_TYPE_GRAB_STATE = 0;
    public static final int SDL = 0;
    public static final int INIT = 0;
    public static final boolean INPUT_DEBUG_ENABLED = Boolean.parseBoolean(System.getProperty("glfwstub.debugInput", "false"));
    public static boolean sGamepadDirectEnabled;

    public static native void nativeSendData(boolean z, int i, String str);

    public static native boolean nativeSetInputReady(boolean z);

    public static native String nativeClipboard(int i, byte[] bArr);

    public static native void nativeSetGrabbing(boolean z);

    public static native boolean nativeNotifyLauncher(int i, int... iArr);

    public static native boolean nativeEnableGamepadDirectInput();

    public static native ByteBuffer nativeCreateGamepadButtonBuffer();

    public static native ByteBuffer nativeCreateGamepadAxisBuffer();

    public static void enableGamepadDirectInput() {
        if (sGamepadDirectEnabled) {
            return;
        }
        sGamepadDirectEnabled = nativeEnableGamepadDirectInput();
    }

    public static void sendData(int type, String data) {
        nativeSendData(false, type, data);
    }
}
