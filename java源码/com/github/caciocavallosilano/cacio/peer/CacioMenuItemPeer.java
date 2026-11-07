package com.github.caciocavallosilano.cacio.peer;

import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.peer.MenuItemPeer;
import javax.swing.JMenuItem;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioMenuItemPeer.class */
public class CacioMenuItemPeer extends CacioMenuComponentPeer<MenuItem, JMenuItem> implements MenuItemPeer {

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioMenuItemPeer$ProxyListener.class */
    private class ProxyListener implements ActionListener {
        private ProxyListener() {
        }

        public void actionPerformed(ActionEvent e) {
            ActionListener[] l = CacioMenuItemPeer.this.getAWTMenu().getActionListeners();
            if (l != null && l.length > 0) {
                MenuItem i = CacioMenuItemPeer.this.getAWTMenu();
                for (int idx = 0; idx < l.length; idx++) {
                    ActionEvent ev = new ActionEvent(i, idx, e.getActionCommand());
                    l[idx].actionPerformed(ev);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CacioMenuItemPeer(MenuItem i) {
        this(i, new JMenuItem());
    }

    CacioMenuItemPeer(MenuItem i, JMenuItem jmi) {
        super(i, jmi);
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioMenuComponentPeer
    void postInitSwingComponent() {
        setLabel(getAWTMenu().getLabel());
        setEnabled(getAWTMenu().isEnabled());
        if (needActionProxy()) {
            getSwingMenu().addActionListener(new ProxyListener());
        }
    }

    boolean needActionProxy() {
        return true;
    }

    public void setLabel(String label) {
        getSwingMenu().setText(label);
    }

    public void setEnabled(boolean e) {
        getSwingMenu().setEnabled(e);
    }
}
