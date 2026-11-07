package sun.awt.peer.cacio;

import java.awt.Frame;
import java.awt.MenuBar;
import java.awt.Rectangle;
import java.awt.peer.FramePeer;
import java.awt.peer.MenuBarPeer;
import javax.swing.JMenuBar;
import javax.swing.JRootPane;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioFramePeer.class */
class CacioFramePeer extends CacioWindowPeer implements FramePeer {
    private Rectangle mBoundsPrivate;
    static final /* synthetic */ boolean $assertionsDisabled;

    static {
        $assertionsDisabled = !CacioFramePeer.class.desiredAssertionStatus();
    }

    public CacioFramePeer(Frame awtC, PlatformWindowFactory pwf) {
        super(awtC, pwf);
    }

    public int getState() {
        return getToplevelWindow().getState();
    }

    public void setState(int state) {
        getToplevelWindow().setState(state);
    }

    public void setMaximizedBounds(Rectangle bounds) {
        getToplevelWindow().setMaximizedBounds(bounds);
    }

    public void setMenuBar(MenuBar mb) {
        MenuBarPeer mbp = GetPeer.getMenuComponent(mb);
        if (mbp == null) {
            mb.addNotify();
            mbp = (MenuBarPeer) GetPeer.getMenuComponent(mb);
        }
        if (!$assertionsDisabled && !(mbp instanceof CacioMenuBarPeer)) {
            throw new AssertionError();
        }
        JMenuBar jmb = ((CacioMenuBarPeer) mbp).getSwingMenu();
        JRootPane rp = (JRootPane) getSwingComponent();
        rp.setJMenuBar(jmb);
    }

    public void setResizable(boolean resizable) {
        getToplevelWindow().setResizable(resizable);
    }

    public void setTitle(String title) {
        getToplevelWindow().setTitle(title);
    }

    public Rectangle getBoundsPrivate() {
        return this.mBoundsPrivate;
    }

    public void setBoundsPrivate(int x, int y, int width, int height) {
        this.mBoundsPrivate = new Rectangle(x, y, width, height);
    }

    @Override // sun.awt.peer.cacio.CacioWindowPeer
    protected int getRootPaneDecorationStyle() {
        if (!isDecorateWindows() || ((Frame) getAWTComponent()).isUndecorated()) {
            return 0;
        }
        return 1;
    }

    @Override // sun.awt.peer.cacio.CacioWindowPeer
    public void updateAlwaysOnTopState() {
    }

    public void emulateActivation(boolean activate) {
    }
}
