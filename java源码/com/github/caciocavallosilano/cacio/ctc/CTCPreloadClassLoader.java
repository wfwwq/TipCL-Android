package com.github.caciocavallosilano.cacio.ctc;

import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import org.apache.commons.lang3.SystemProperties;
import sun.misc.Unsafe;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCPreloadClassLoader.class */
public class CTCPreloadClassLoader extends URLClassLoader {
    static final /* synthetic */ boolean $assertionsDisabled;

    static {
        $assertionsDisabled = !CTCPreloadClassLoader.class.desiredAssertionStatus();
        try {
            Field toolkit = Toolkit.class.getDeclaredField("toolkit");
            toolkit.setAccessible(true);
            toolkit.set(null, new CTCToolkit());
            Field defaultHeadlessField = GraphicsEnvironment.class.getDeclaredField("defaultHeadless");
            defaultHeadlessField.setAccessible(true);
            defaultHeadlessField.set(null, Boolean.TRUE);
            Field headlessField = GraphicsEnvironment.class.getDeclaredField("headless");
            headlessField.setAccessible(true);
            headlessField.set(null, Boolean.TRUE);
            Class<?> geCls = Class.forName("java.awt.GraphicsEnvironment$LocalGE");
            Field ge = geCls.getDeclaredField("INSTANCE");
            ge.setAccessible(true);
            defaultHeadlessField.set(null, Boolean.FALSE);
            headlessField.set(null, Boolean.FALSE);
            Class<?> smfCls = Class.forName("sun.java2d.SurfaceManagerFactory");
            Field smf = smfCls.getDeclaredField("instance");
            smf.setAccessible(true);
            smf.set(null, null);
            setFinalStatic(ge, new CTCGraphicsEnvironment());
            String propertyFontManager = System.getProperty("cacio.font.fontmanager");
            if (propertyFontManager != null) {
                FontManagerUtil.setFontManager(propertyFontManager);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.setProperty("swing.defaultlaf", NimbusLookAndFeel.class.getName());
    }

    public CTCPreloadClassLoader(ClassLoader parent) {
        super(new URL[0], parent);
    }

    @Override // java.net.URLClassLoader
    public void addURL(URL url) {
        super.addURL(url);
        try {
            System.setProperty(SystemProperties.JAVA_CLASS_PATH, ((Object) System.getProperty(SystemProperties.JAVA_CLASS_PATH)) + ":" + ((Object) new File(url.toURI()).getAbsolutePath()));
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    static URL getFileURL(File file) throws IOException {
        try {
            file = file.getCanonicalFile();
        } catch (IOException e) {
        }
        try {
            return file.toURL();
        } catch (MalformedURLException e2) {
            throw new InternalError(e2);
        }
    }

    private void appendToClassPathForInstrumentation(String path) {
        if (!$assertionsDisabled && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        super.addURL(getFileURL(new File(path)));
    }

    public static void setFinalStatic(Field field, Object value) throws Exception {
        Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);
        Object fieldBase = unsafe.staticFieldBase(field);
        long fieldOffset = unsafe.staticFieldOffset(field);
        unsafe.putObject(fieldBase, fieldOffset, value);
    }
}
