package com.github.caciocavallosilano.cacio.ctc;

import sun.awt.image.SunVolatileImage;
import sun.awt.image.VolatileSurfaceManager;
import sun.java2d.SurfaceManagerFactory;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCSurfaceManagerFactory.class */
class CTCSurfaceManagerFactory extends SurfaceManagerFactory {
    CTCSurfaceManagerFactory() {
    }

    public VolatileSurfaceManager createVolatileManager(SunVolatileImage image, Object context) {
        return new CTCVolatileSurfaceManager(image, context);
    }
}
