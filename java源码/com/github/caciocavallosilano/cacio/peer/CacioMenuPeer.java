package com.github.caciocavallosilano.cacio.peer;

import java.awt.Menu;
import java.awt.MenuComponent;
import java.awt.MenuItem;
import java.awt.peer.MenuItemPeer;
import java.awt.peer.MenuPeer;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioMenuPeer.class */
public class CacioMenuPeer extends CacioMenuItemPeer implements MenuPeer {
    static final /* synthetic */ boolean $assertionsDisabled;

    static {
        $assertionsDisabled = !CacioMenuPeer.class.desiredAssertionStatus();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CacioMenuPeer(Menu m) {
        super(m, new JMenu());
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioMenuItemPeer, com.github.caciocavallosilano.cacio.peer.CacioMenuComponentPeer
    void postInitSwingComponent() {
        super.postInitSwingComponent();
        Menu m = getAWTMenu();
        int itemCount = m.getItemCount();
        for (int i = 0; i < itemCount; i++) {
            addItem(m.getItem(i));
        }
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioMenuItemPeer
    boolean needActionProxy() {
        return false;
    }

    public void addSeparator() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void addItem(MenuItem item) {
        MenuItemPeer mip = CacioComponentPeer.getPeer((MenuComponent) item);
        if (mip == null) {
            item.addNotify();
            mip = (MenuItemPeer) CacioComponentPeer.getPeer((MenuComponent) item);
        }
        if (!$assertionsDisabled && !(mip instanceof CacioMenuItemPeer)) {
            throw new AssertionError();
        }
        JMenuItem jmi = ((CacioMenuItemPeer) mip).getSwingMenu();
        getSwingMenu().add(jmi);
    }

    public void delItem(int index) {
        getSwingMenu().remove(index);
    }
}
