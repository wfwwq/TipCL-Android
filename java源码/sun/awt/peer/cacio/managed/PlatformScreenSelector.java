package sun.awt.peer.cacio.managed;

import java.awt.GraphicsConfiguration;
import sun.awt.peer.cacio.CacioComponent;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/managed/PlatformScreenSelector.class */
public interface PlatformScreenSelector {
    PlatformScreen getPlatformScreen(GraphicsConfiguration graphicsConfiguration);

    PlatformScreen getPlatformScreen(CacioComponent cacioComponent);
}
