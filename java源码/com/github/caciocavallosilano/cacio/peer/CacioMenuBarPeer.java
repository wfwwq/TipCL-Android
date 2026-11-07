package com.github.caciocavallosilano.cacio.peer;

import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuComponent;
import java.awt.peer.MenuBarPeer;
import java.awt.peer.MenuPeer;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioMenuBarPeer.class */
public class CacioMenuBarPeer extends CacioMenuComponentPeer<MenuBar, JMenuBar> implements MenuBarPeer {
    private Menu helpMenu;
    static final /* synthetic */ boolean $assertionsDisabled;

    static {
        $assertionsDisabled = !CacioMenuBarPeer.class.desiredAssertionStatus();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CacioMenuBarPeer(MenuBar mb) {
        super(mb, new JMenuBar());
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioMenuComponentPeer
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
        MenuPeer mp = CacioComponentPeer.getPeer((MenuComponent) m);
        if (mp == null) {
            m.addNotify();
            mp = (MenuPeer) CacioComponentPeer.getPeer((MenuComponent) m);
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
