package com.github.caciocavallosilano.cacio.ctc;

import sun.awt.image.SunVolatileImage;
import sun.awt.image.VolatileSurfaceManager;
import sun.java2d.SurfaceData;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCVolatileSurfaceManager.class */
class CTCVolatileSurfaceManager extends VolatileSurfaceManager {
    protected CTCVolatileSurfaceManager(SunVolatileImage vImg, Object context) {
        super(vImg, context);
    }

    protected boolean isAccelerationEnabled() {
        return false;
    }

    protected SurfaceData initAcceleratedSurface() {
        return null;
    }
}
