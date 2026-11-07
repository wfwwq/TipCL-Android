package com.github.caciocavallosilano.cacio.peer;

import java.awt.AWTEvent;
import java.awt.Component;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioComponent.class */
public interface CacioComponent {
    Component getAWTComponent();

    PlatformWindow getPlatformWindow();

    void handlePeerEvent(AWTEvent aWTEvent);

    boolean isFocusable();
}
