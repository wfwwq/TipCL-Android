package com.github.caciocavallosilano.cacio.ctc;

import java.awt.GraphicsDevice;
import sun.java2d.SunGraphicsEnvironment;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCGraphicsEnvironment.class */
public class CTCGraphicsEnvironment extends SunGraphicsEnvironment {
    public CTCGraphicsEnvironment() {
        try {
            CacioSurfaceManagerFactory.setInstance(new CTCSurfaceManagerFactory_high());
        } catch (Exception | NoClassDefFoundError e) {
            CacioSurfaceManagerFactory.setInstance(new CTCSurfaceManagerFactory_high());
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
