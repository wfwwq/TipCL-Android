package com.github.caciocavallosilano.cacio.peer;

import java.awt.Font;
import java.awt.MenuComponent;
import java.awt.peer.MenuComponentPeer;
import javax.swing.JComponent;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioMenuComponentPeer.class */
class CacioMenuComponentPeer<AWTMenuComponentType extends MenuComponent, SwingMenuComponentType extends JComponent> implements MenuComponentPeer {
    private AWTMenuComponentType awtMenu;
    private SwingMenuComponentType swingMenu;

    CacioMenuComponentPeer(AWTMenuComponentType awtM, SwingMenuComponentType swingM) {
        this.awtMenu = awtM;
        this.swingMenu = swingM;
        postInitSwingComponent();
    }

    void postInitSwingComponent() {
    }

    public void dispose() {
    }

    public void setFont(Font f) {
        this.swingMenu.setFont(f);
    }

    AWTMenuComponentType getAWTMenu() {
        return this.awtMenu;
    }

    SwingMenuComponentType getSwingMenu() {
        return this.swingMenu;
    }
}
