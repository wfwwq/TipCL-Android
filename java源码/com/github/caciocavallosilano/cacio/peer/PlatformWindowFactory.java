package com.github.caciocavallosilano.cacio.peer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/PlatformWindowFactory.class */
public interface PlatformWindowFactory {
    PlatformWindow createPlatformWindow(CacioComponent cacioComponent, PlatformWindow platformWindow);

    PlatformToplevelWindow createPlatformToplevelWindow(CacioComponent cacioComponent);

    CacioEventPump<?> createEventPump();

    PlatformWindow createPlatformToplevelWindow(CacioComponent cacioComponent, PlatformWindow platformWindow);
}
