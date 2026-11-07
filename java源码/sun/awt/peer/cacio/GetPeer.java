package sun.awt.peer.cacio;

import java.awt.Component;
import java.awt.MenuComponent;
import java.awt.peer.ComponentPeer;
import java.awt.peer.MenuComponentPeer;
import sun.awt.AWTAccessor;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/GetPeer.class */
class GetPeer {
    GetPeer() {
    }

    static ComponentPeer getComponent(Component c) {
        return AWTAccessor.getComponentAccessor().getPeer(c);
    }

    static MenuComponentPeer getMenuComponent(MenuComponent c) {
        return AWTAccessor.getMenuComponentAccessor().getPeer(c);
    }
}
