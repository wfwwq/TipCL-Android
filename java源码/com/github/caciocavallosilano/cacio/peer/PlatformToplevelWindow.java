package com.github.caciocavallosilano.cacio.peer;

import java.awt.Rectangle;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/PlatformToplevelWindow.class */
public interface PlatformToplevelWindow extends PlatformWindow {
    int getState();

    void setState(int i);

    void setMaximizedBounds(Rectangle rectangle);

    void setResizable(boolean z);

    void setTitle(String str);

    void setBlocked(boolean z);
}
