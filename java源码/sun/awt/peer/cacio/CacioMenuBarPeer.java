package sun.awt.peer.cacio;

import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.peer.MenuBarPeer;
import java.awt.peer.MenuPeer;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioMenuBarPeer.class */
class CacioMenuBarPeer extends CacioMenuComponentPeer<MenuBar, JMenuBar> implements MenuBarPeer {
    private Menu helpMenu;
    static final /* synthetic */ boolean $assertionsDisabled;

    static {
        $assertionsDisabled = !CacioMenuBarPeer.class.desiredAssertionStatus();
    }

    CacioMenuBarPeer(MenuBar mb) {
        super(mb, new JMenuBar());
    }

    @Override // sun.awt.peer.cacio.CacioMenuComponentPeer
    void postInitSwingComponent() {
        MenuBar mb = getAWTMenu();
        int menuCount = mb.getMenuCount();
        for (int i = 0; i < menuCount; i++) {
            mb.getMenu(i);
            addMenu(mb.getMenu(i));
        }
        Menu helpMenu = mb.getHelpMenu();
        if (helpMenu != null) {
            addHelpMenu(helpMenu);
        }
    }

    public void addMenu(Menu m) {
        JMenuBar jmb = getSwingMenu();
        if (this.helpMenu != null) {
            jmb.add(getSwingMenu(m), jmb.getComponentCount() - 1);
        } else {
            jmb.add(getSwingMenu(m));
        }
        jmb.revalidate();
    }

    public void addHelpMenu(Menu m) {
        JMenuBar jmb = getSwingMenu();
        if (this.helpMenu != null) {
            jmb.remove(getSwingMenu(this.helpMenu));
        }
        this.helpMenu = m;
        jmb.add(getSwingMenu(m));
        jmb.revalidate();
    }

    private JMenu getSwingMenu(Menu m) {
        MenuPeer mp = GetPeer.getMenuComponent(m);
        if (mp == null) {
            m.addNotify();
            mp = (MenuPeer) GetPeer.getMenuComponent(m);
        }
        if ($assertionsDisabled || (mp instanceof CacioMenuPeer)) {
            return ((CacioMenuPeer) mp).getSwingMenu();
        }
        throw new AssertionError();
    }

    public void delMenu(int index) {
        getSwingMenu().remove(index);
    }
}
