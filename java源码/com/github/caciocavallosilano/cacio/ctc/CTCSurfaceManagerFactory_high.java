package com.github.caciocavallosilano.cacio.ctc;

import sun.awt.image.SunVolatileImage;
import sun.awt.image.VolatileSurfaceManager;

/* compiled from: CTCSurfaceManagerFactory.java */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCSurfaceManagerFactory_high.class */
class CTCSurfaceManagerFactory_high extends CacioSurfaceManagerFactory {
    CTCSurfaceManagerFactory_high() {
    }

    @Override // com.github.caciocavallosilano.cacio.ctc.CacioSurfaceManagerFactory
    public VolatileSurfaceManager createVolatileManager(SunVolatileImage image, Object context) {
        return new CTCVolatileSurfaceManager(image, context);
    }
}
