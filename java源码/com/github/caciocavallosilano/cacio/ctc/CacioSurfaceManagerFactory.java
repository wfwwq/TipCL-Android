package com.github.caciocavallosilano.cacio.ctc;

import sun.awt.image.SunVolatileImage;
import sun.awt.image.VolatileSurfaceManager;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CacioSurfaceManagerFactory.class */
public abstract class CacioSurfaceManagerFactory {
    private static CacioSurfaceManagerFactory instance;

    public abstract VolatileSurfaceManager createVolatileManager(SunVolatileImage sunVolatileImage, Object obj);

    public static synchronized CacioSurfaceManagerFactory getInstance() {
        if (instance == null) {
            throw new IllegalStateException("No CacioSurfaceManagerFactory set.");
        }
        return instance;
    }

    public static synchronized void setInstance(CacioSurfaceManagerFactory factory) {
        if (factory == null) {
            throw new IllegalArgumentException("factory must be non-null");
        }
        if (instance != null) {
            throw new IllegalStateException("The surface manager factory is already initialized");
        }
        instance = factory;
    }
}
