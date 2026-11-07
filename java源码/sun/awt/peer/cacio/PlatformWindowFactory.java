package sun.awt.peer.cacio;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/PlatformWindowFactory.class */
public interface PlatformWindowFactory {
    PlatformWindow createPlatformWindow(CacioComponent cacioComponent, PlatformWindow platformWindow);

    PlatformToplevelWindow createPlatformToplevelWindow(CacioComponent cacioComponent);

    CacioEventPump<?> createEventPump();

    PlatformWindow createPlatformToplevelWindow(CacioComponent cacioComponent, PlatformWindow platformWindow);
}
