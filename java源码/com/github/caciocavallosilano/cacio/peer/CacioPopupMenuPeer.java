package com.github.caciocavallosilano.cacio.peer;

import java.awt.Dimension;
import java.awt.Event;
import java.awt.PopupMenu;
import java.awt.peer.PopupMenuPeer;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioPopupMenuPeer.class */
class CacioPopupMenuPeer extends CacioMenuPeer implements PopupMenuPeer {
    CacioPopupMenuPeer(PopupMenu m) {
        super(m);
    }

    public void show(Event e) {
        JMenu m = getSwingMenu();
        JPopupMenu pm = m.getPopupMenu();
        Dimension d = pm.getPreferredSize();
        pm.setLocation(e.x, e.y);
        pm.setSize(d.width, d.height);
        pm.setVisible(true);
    }
}
