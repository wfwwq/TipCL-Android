package sun.awt.peer.cacio;

import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.peer.MenuItemPeer;
import java.awt.peer.MenuPeer;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioMenuPeer.class */
class CacioMenuPeer extends CacioMenuItemPeer implements MenuPeer {
    static final /* synthetic */ boolean $assertionsDisabled;

    static {
        $assertionsDisabled = !CacioMenuPeer.class.desiredAssertionStatus();
    }

    CacioMenuPeer(Menu m) {
        super(m, new JMenu());
    }

    @Override // sun.awt.peer.cacio.CacioMenuItemPeer, sun.awt.peer.cacio.CacioMenuComponentPeer
    void postInitSwingComponent() {
        super.postInitSwingComponent();
        Menu m = getAWTMenu();
        int itemCount = m.getItemCount();
        for (int i = 0; i < itemCount; i++) {
            addItem(m.getItem(i));
        }
    }

    @Override // sun.awt.peer.cacio.CacioMenuItemPeer
    boolean needActionProxy() {
        return false;
    }

    public void addSeparator() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void addItem(MenuItem item) {
        MenuItemPeer mip = GetPeer.getMenuComponent(item);
        if (mip == null) {
            item.addNotify();
            mip = (MenuItemPeer) GetPeer.getMenuComponent(item);
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
