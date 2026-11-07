package net.java.openjdk.cacio.ctc;

import java.lang.reflect.Method;
import sun.font.FontConfigManager;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/FCMInternalWrapper.class */
public class FCMInternalWrapper {
    public static FontConfigManager.FontConfigInfo getFontConfigInfo(FontConfigManager instance) {
        return (FontConfigManager.FontConfigInfo) invokeMethod(instance, "getFontConfigInfo");
    }

    public static FontConfigManager.FcCompFont[] loadFontConfig(FontConfigManager instance) {
        return (FontConfigManager.FcCompFont[]) invokeMethod(instance, "loadFontConfig");
    }

    public static void populateFontConfig(FontConfigManager instance, FontConfigManager.FcCompFont[] arr) {
        invokeMethod(instance, "populateFontConfig", new Class[]{FontConfigManager.FcCompFont[].class}, arr);
    }

    private static Object invokeMethod(FontConfigManager instance, String method) {
        return invokeMethod(instance, method, null, new Object[0]);
    }

    private static Object invokeMethod(FontConfigManager instance, String method, Class[] clsArr, Object... objs) {
        try {
            if (clsArr == null) {
                Method m = instance.getClass().getDeclaredMethod(method, new Class[0]);
                m.setAccessible(true);
                return m.invoke(instance, new Object[0]);
            }
            Method m2 = instance.getClass().getDeclaredMethod(method, clsArr);
            m2.setAccessible(true);
            return m2.invoke(instance, objs);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }
}
