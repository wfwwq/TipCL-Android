package com.github.caciocavallosilano.cacio.agent;

import com.github.caciocavallosilano.cacio.ctc.CTCGraphicsEnvironment;
import com.github.caciocavallosilano.cacio.ctc.CTCToolkit;
import com.github.caciocavallosilano.cacio.ctc.FontManagerUtil;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.lang.instrument.Instrumentation;
import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import sun.misc.Unsafe;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-agent.jar:com/github/caciocavallosilano/cacio/agent/CTCJavaAgent.class */
public class CTCJavaAgent {
    public static void premain(String args, Instrumentation inst) {
        try {
            initializeCTCEnvironment();
            System.setProperty("swing.defaultlaf", NimbusLookAndFeel.class.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void initializeCTCEnvironment() throws Exception {
        Class<?> geCls;
        Field ge;
        Class<?> smfCls;
        Field toolkit = Toolkit.class.getDeclaredField("toolkit");
        toolkit.setAccessible(true);
        toolkit.set(null, new CTCToolkit());
        Field defaultHeadlessField = GraphicsEnvironment.class.getDeclaredField("defaultHeadless");
        defaultHeadlessField.setAccessible(true);
        defaultHeadlessField.set(null, Boolean.TRUE);
        Field headlessField = GraphicsEnvironment.class.getDeclaredField("headless");
        headlessField.setAccessible(true);
        headlessField.set(null, Boolean.TRUE);
        try {
            geCls = Class.forName("java.awt.GraphicsEnvironment$LocalGE");
        } catch (Exception | NoClassDefFoundError e) {
            geCls = Class.forName("java.awt.GraphicsEnvironment");
        }
        try {
            ge = geCls.getDeclaredField("INSTANCE");
            ge.setAccessible(true);
        } catch (Exception | NoClassDefFoundError e2) {
            ge = geCls.getDeclaredField("localEnv");
            ge.setAccessible(true);
        }
        defaultHeadlessField.set(null, Boolean.FALSE);
        headlessField.set(null, Boolean.FALSE);
        try {
            smfCls = Class.forName("com.github.caciocavallosilano.cacio.ctc.CacioSurfaceManagerFactory");
        } catch (Exception | NoClassDefFoundError e3) {
            smfCls = Class.forName("com.github.caciocavallosilano.cacio.ctc.CacioSurfaceManagerFactory");
        }
        Field smf = smfCls.getDeclaredField("instance");
        smf.setAccessible(true);
        smf.set(null, null);
        setFinalStatic(ge, new CTCGraphicsEnvironment());
        String propertyFontManager = System.getProperty("cacio.font.fontmanager");
        if (propertyFontManager != null) {
            FontManagerUtil.setFontManager(propertyFontManager);
        }
    }

    public static void setFinalStatic(Field field, Object value) throws Exception {
        Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);
        Object fieldBase = unsafe.staticFieldBase(field);
        long fieldOffset = unsafe.staticFieldOffset(field);
        unsafe.putObject(fieldBase, fieldOffset, value);
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
}
