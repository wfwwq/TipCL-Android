package net.java.openjdk.cacio.ctc;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;
import java.lang.reflect.Field;
import org.apache.commons.lang3.SystemProperties;
import sun.java2d.SunGraphicsEnvironment;
import sun.java2d.SurfaceManagerFactory;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/CTCGraphicsEnvironment.class */
public class CTCGraphicsEnvironment extends SunGraphicsEnvironment {
    static {
        String propertyFontManager = System.getProperty("cacio.font.fontmanager");
        if (propertyFontManager != null) {
            FontManagerUtil.setFontManager(propertyFontManager);
        }
        try {
            String propertyFontScaler = System.getProperty("cacio.font.fontscaler");
            if (propertyFontScaler != null) {
                FontManagerUtil.setFontScaler(propertyFontScaler);
            }
            if (Boolean.getBoolean(System.getProperty(SystemProperties.JAVA_AWT_HEADLESS, "true"))) {
                Class.forName("java.awt.Toolkit");
                drawStringTest();
                System.setProperty(SystemProperties.JAVA_AWT_HEADLESS, "false");
                Field headlessField = GraphicsEnvironment.class.getDeclaredField("headless");
                headlessField.setAccessible(true);
                headlessField.set(null, Boolean.FALSE);
                Field defaultHeadlessField = GraphicsEnvironment.class.getDeclaredField("defaultHeadless");
                defaultHeadlessField.setAccessible(true);
                defaultHeadlessField.set(null, Boolean.FALSE);
                Field localEnvField = GraphicsEnvironment.class.getDeclaredField("localEnv");
                localEnvField.setAccessible(true);
                localEnvField.set(null, new CTCGraphicsEnvironment());
                drawStringTest();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static void drawStringTest() {
        BufferedImage img = new BufferedImage(10, 10, 1);
        Graphics2D g2d = img.createGraphics();
        g2d.setPaint(Color.WHITE);
        g2d.drawString("Test", 0, 4);
        g2d.dispose();
    }

    public CTCGraphicsEnvironment() {
        SurfaceManagerFactory f = null;
        try {
            f = SurfaceManagerFactory.getInstance();
        } catch (IllegalStateException e) {
            SurfaceManagerFactory.setInstance(new CTCSurfaceManagerFactory());
        }
        if (f != null && !f.getClass().getName().equals(CTCSurfaceManagerFactory.class.getName())) {
            throw new IllegalStateException("The surface manager factory is already initialized to " + f.getClass().getName());
        }
    }

    protected int getNumScreens() {
        return 1;
    }

    protected GraphicsDevice makeScreenDevice(int screennum) {
        return new CTCGraphicsDevice();
    }

    public boolean isDisplayLocal() {
        return true;
    }
}
