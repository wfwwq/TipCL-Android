package com.github.caciocavallosilano.cacio.peer.managed;

import com.github.caciocavallosilano.cacio.peer.CacioComponent;
import java.awt.GraphicsConfiguration;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/managed/PlatformScreenSelector.class */
public interface PlatformScreenSelector {
    PlatformScreen getPlatformScreen(GraphicsConfiguration graphicsConfiguration);

    PlatformScreen getPlatformScreen(CacioComponent cacioComponent);
}
