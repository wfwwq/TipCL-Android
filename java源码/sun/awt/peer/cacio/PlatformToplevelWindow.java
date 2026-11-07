package sun.awt.peer.cacio;

import java.awt.Rectangle;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/PlatformToplevelWindow.class */
public interface PlatformToplevelWindow extends PlatformWindow {
    int getState();

    void setState(int i);

    void setMaximizedBounds(Rectangle rectangle);

    void setResizable(boolean z);

    void setTitle(String str);

    void setBlocked(boolean z);
}
