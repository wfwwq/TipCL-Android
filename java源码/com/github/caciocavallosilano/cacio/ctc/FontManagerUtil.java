package com.github.caciocavallosilano.cacio.ctc;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedAction;
import sun.font.Font2D;
import sun.font.FontManager;
import sun.font.FontManagerFactory;
import sun.font.FontScaler;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/FontManagerUtil.class */
public class FontManagerUtil {
    public static void setFontManager(final String fmClassName) {
        AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: com.github.caciocavallosilano.cacio.ctc.FontManagerUtil.1
            @Override // java.security.PrivilegedAction
            public Object run() throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException, IllegalArgumentException {
                try {
                    System.setProperty("sun.font.fontmanager", fmClassName);
                    Class<?> fmClass = Class.forName(fmClassName);
                    FontManager instance = (FontManager) fmClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    Field fmInstanceField = FontManagerFactory.class.getDeclaredField("instance");
                    fmInstanceField.setAccessible(true);
                    fmInstanceField.set(null, instance);
                    String currName = FontManagerFactory.getInstance().getClass().getName();
                    if (!currName.equals(fmClassName)) {
                        System.err.println("Could not change font manager to " + ((Object) fmClassName) + ", current was " + ((Object) currName));
                    }
                    return null;
                } catch (ReflectiveOperationException ex) {
                    ex.printStackTrace();
                    throw new InternalError(ex);
                }
            }
        });
    }

    public static void setFontScaler(final String fsClassName) {
        AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: com.github.caciocavallosilano.cacio.ctc.FontManagerUtil.2
            @Override // java.security.PrivilegedAction
            public Object run() {
                try {
                    Field fmInstanceField = FontScaler.class.getDeclaredField("scalerConstructor");
                    fmInstanceField.setAccessible(true);
                    fmInstanceField.set(null, Class.forName(fsClassName).getConstructor(Font2D.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE));
                    return null;
                } catch (Throwable ex) {
                    ex.printStackTrace();
                    throw new InternalError(ex);
                }
            }
        });
    }
}
