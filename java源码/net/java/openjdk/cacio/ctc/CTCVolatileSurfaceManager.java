package net.java.openjdk.cacio.ctc;

import sun.awt.image.SunVolatileImage;
import sun.awt.image.VolatileSurfaceManager;
import sun.java2d.SurfaceData;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/CTCVolatileSurfaceManager.class */
class CTCVolatileSurfaceManager extends VolatileSurfaceManager {
    protected CTCVolatileSurfaceManager(SunVolatileImage vImg, Object context) {
        super(vImg, context);
        initContents();
        this.sdBackup = this.sdCurrent;
    }

    protected boolean isAccelerationEnabled() {
        return false;
    }

    protected SurfaceData initAcceleratedSurface() {
        return null;
    }
}
