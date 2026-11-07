package sun.awt.peer.cacio;

import java.awt.AWTEvent;
import java.awt.Component;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioComponent.class */
public interface CacioComponent {
    Component getAWTComponent();

    PlatformWindow getPlatformWindow();

    void handlePeerEvent(AWTEvent aWTEvent);

    boolean isFocusable();
}
