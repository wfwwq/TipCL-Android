package com.github.caciocavallosilano.cacio.peer;

import java.awt.Dialog;
import java.awt.Window;
import java.awt.peer.DialogPeer;
import java.awt.peer.WindowPeer;
import java.util.List;
import sun.awt.AWTAccessor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioDialogPeer.class */
public class CacioDialogPeer extends CacioWindowPeer implements DialogPeer {
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
            WindowPeer peer = AWTAccessor.getComponentAccessor().getPeer(window);
            if (peer != null) {
                peer.setModalBlocked((Dialog) getAWTComponent(), true);
            }
        }
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioWindowPeer
    protected int getRootPaneDecorationStyle() {
        if (!isDecorateDialogs() || ((Dialog) getAWTComponent()).isUndecorated()) {
            return 0;
        }
        return 2;
    }
}
