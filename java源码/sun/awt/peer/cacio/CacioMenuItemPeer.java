package sun.awt.peer.cacio;

import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.peer.MenuItemPeer;
import javax.swing.JMenuItem;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioMenuItemPeer.class */
class CacioMenuItemPeer extends CacioMenuComponentPeer<MenuItem, JMenuItem> implements MenuItemPeer {

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioMenuItemPeer$ProxyListener.class */
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

    CacioMenuItemPeer(MenuItem i) {
        this(i, new JMenuItem());
    }

    CacioMenuItemPeer(MenuItem i, JMenuItem jmi) {
        super(i, jmi);
    }

    @Override // sun.awt.peer.cacio.CacioMenuComponentPeer
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
