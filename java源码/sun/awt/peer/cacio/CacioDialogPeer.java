package sun.awt.peer.cacio;

import java.awt.Dialog;
import java.awt.Window;
import java.awt.peer.DialogPeer;
import java.awt.peer.WindowPeer;
import java.util.List;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioDialogPeer.class */
class CacioDialogPeer extends CacioWindowPeer implements DialogPeer {
    public CacioDialogPeer(Dialog awtC, PlatformWindowFactory pwf) {
        super(awtC, pwf);
        setResizable(awtC.isResizable());
        setTitle(awtC.getTitle());
    }

    public void setResizable(boolean resizable) {
        getToplevelWindow().setResizable(resizable);
    }

    public void setTitle(String title) {
        getToplevelWindow().setTitle(title);
    }

    public void blockWindows(List<Window> windows) {
        for (Window window : windows) {
            WindowPeer peer = GetPeer.getComponent(window);
            if (peer != null) {
                peer.setModalBlocked((Dialog) getAWTComponent(), true);
            }
        }
    }

    @Override // sun.awt.peer.cacio.CacioWindowPeer
    protected int getRootPaneDecorationStyle() {
        if (!isDecorateDialogs() || ((Dialog) getAWTComponent()).isUndecorated()) {
            return 0;
        }
        return 2;
    }
}
