package org.lwjgl;

import java.awt.Component;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.system.Platform;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-lwjglx.jar:org/lwjgl/Sys.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-lwjglx.jar:org/lwjgl/Sys.class */
public class Sys {
    private Sys() {
        try {
            if (Platform.get() == Platform.MACOSX) {
                System.load(System.getenv("BUNDLE_PATH") + "/AngelAuraAmethyst");
            } else if (Platform.get() == Platform.LINUX) {
                System.loadLibrary("pojavexec");
            }
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    public static String getVersion() {
        return Version.getVersion();
    }

    public static void initialize() {
        if (!GLFW.glfwInit()) {
            throw new IllegalStateException("Unable to initialize GLFW");
        }
    }

    public static long getTimerResolution() {
        return 1000L;
    }

    public static long getTime() {
        return GLFW.glfwGetTimerValue();
    }

    public static long getNanoTime() {
        return System.nanoTime();
    }

    public static boolean openURL(String url) {
        if (!Desktop.isDesktopSupported()) {
            return false;
        }
        Desktop desktop = Desktop.getDesktop();
        if (!desktop.isSupported(Desktop.Action.BROWSE)) {
            return false;
        }
        try {
            desktop.browse(new URI(url));
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public static void alert(String title, String message) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            LWJGLUtil.log("Caught exception while setting Look-and-Feel: " + e);
        }
        JOptionPane.showMessageDialog((Component) null, message, title, 2);
    }

    public static String getClipboard() {
        return GLFW.glfwGetClipboardString(GLFW.glfwGetPrimaryMonitor());
    }
}
