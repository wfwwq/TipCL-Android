package sun.awt.peer.cacio;

import java.awt.CheckboxMenuItem;
import java.awt.MenuItem;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.peer.CheckboxMenuItemPeer;
import javax.swing.JCheckBoxMenuItem;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioCheckboxMenuItemPeer.class */
class CacioCheckboxMenuItemPeer extends CacioMenuItemPeer implements CheckboxMenuItemPeer {

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioCheckboxMenuItemPeer$ProxyListener.class */
    private class ProxyListener implements ItemListener {
        private ProxyListener() {
        }

        public void itemStateChanged(ItemEvent e) {
            CacioCheckboxMenuItemPeer.this.getAWTMenu().setState(e.getStateChange() == 1);
            CheckboxMenuItem i = CacioCheckboxMenuItemPeer.this.getAWTMenu();
            ItemListener[] l = i.getItemListeners();
            if (l != null && l.length > 0) {
                for (ItemListener itemListener : l) {
                    ItemEvent ev = new ItemEvent(i, e.getID(), i, e.getStateChange());
                    itemListener.itemStateChanged(ev);
                }
            }
        }
    }

    CacioCheckboxMenuItemPeer(MenuItem i) {
        super(i, new JCheckBoxMenuItem());
    }

    @Override // sun.awt.peer.cacio.CacioMenuItemPeer, sun.awt.peer.cacio.CacioMenuComponentPeer
    void postInitSwingComponent() {
        super.postInitSwingComponent();
        setState(getAWTMenu().getState());
        ProxyListener pl = new ProxyListener();
        getSwingMenu().addItemListener(pl);
    }

    @Override // sun.awt.peer.cacio.CacioMenuItemPeer
    boolean needActionProxy() {
        return false;
    }

    public void setState(boolean t) {
        getSwingMenu().setState(t);
    }
}
