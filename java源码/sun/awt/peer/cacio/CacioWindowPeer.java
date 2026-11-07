package sun.awt.peer.cacio;

import java.awt.AWTEvent;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Window;
import java.awt.event.FocusEvent;
import java.awt.event.WindowEvent;
import java.awt.geom.Area;
import java.awt.peer.ComponentPeer;
import java.awt.peer.WindowPeer;
import javax.swing.JMenuBar;
import javax.swing.JRootPane;
import javax.swing.UIManager;
import javax.swing.border.Border;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioWindowPeer.class */
class CacioWindowPeer extends CacioContainerPeer<Window, JRootPane> implements WindowPeer {
    private static boolean decorateWindows = false;
    private static boolean decorateDialogs = false;
    private static final Font defaultFont = new Font("Dialog", 0, 12);
    protected boolean blocked;

    static void setDecorateWindows(boolean decorate) {
        decorateWindows = decorate;
        decorateDialogs = decorate;
    }

    static boolean isDecorateWindows() {
        return decorateWindows;
    }

    static void setDecorateDialogs(boolean decorate) {
        decorateDialogs = decorate;
    }

    static boolean isDecorateDialogs() {
        return decorateDialogs;
    }

    CacioWindowPeer(Window awtC, PlatformWindowFactory pwf) {
        super(awtC, pwf);
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    void init(PlatformWindowFactory pwf) {
        CacioComponentPeer parentPeer;
        Window w = (Window) getAWTComponent();
        Container parent = w.getParent();
        if (parent != null) {
            ComponentPeer parentComponentPeer = GetPeer.getComponent(parent);
            if (parentComponentPeer instanceof CacioComponentPeer) {
                parentPeer = (CacioComponentPeer) parentComponentPeer;
            } else if (parentComponentPeer instanceof ProxyWindowPeer) {
                parentPeer = ((ProxyWindowPeer) parentComponentPeer).getTarget();
            } else {
                throw new InternalError("Invalid component type: " + parentComponentPeer.getClass());
            }
            PlatformWindow owner = parentPeer.platformWindow;
            this.platformWindow = pwf.createPlatformToplevelWindow(this, owner);
        } else {
            this.platformWindow = pwf.createPlatformToplevelWindow(this);
        }
        if (!w.isForegroundSet()) {
            w.setForeground(UIManager.getColor("windowText"));
        }
        if (!w.isBackgroundSet()) {
            Color c = UIManager.getColor("window");
            if (c != null) {
                c = UIManager.getColor("Panel.background");
            }
            w.setBackground(c);
        }
        if (!w.isFontSet()) {
            w.setFont(defaultFont);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // sun.awt.peer.cacio.CacioComponentPeer
    /* renamed from: initSwingComponent, reason: merged with bridge method [inline-methods] */
    public JRootPane mo14613initSwingComponent() {
        JRootPane jrootpane = new JRootPane();
        jrootpane.setDoubleBuffered(false);
        return jrootpane;
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    void postInitSwingComponent() {
        super.postInitSwingComponent();
        JRootPane jrootpane = (JRootPane) getSwingComponent();
        if (jrootpane != null) {
            int deco = getRootPaneDecorationStyle();
            jrootpane.setWindowDecorationStyle(deco);
        }
    }

    protected int getRootPaneDecorationStyle() {
        return 0;
    }

    public void setAlwaysOnTop(boolean alwaysOnTop) {
    }

    public void setModalBlocked(Dialog blocker, boolean blocked) {
        CacioWindowPeer dialogPeer;
        if (this.blocked == blocked) {
            return;
        }
        if (blocker != null && (dialogPeer = (CacioDialogPeer) GetPeer.getComponent(blocker)) != null) {
            dialogPeer.setModalBlocked(null, !blocked);
        }
        getToplevelWindow().setBlocked(blocked);
        this.blocked = blocked;
    }

    public void toBack() {
    }

    public void toFront() {
    }

    public void updateFocusableWindowState() {
    }

    public void updateIconImages() {
    }

    public void updateMinimumSize() {
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer, sun.awt.peer.cacio.CacioComponent
    public void handlePeerEvent(AWTEvent ev) {
        Window w = (Window) getAWTComponent();
        switch (ev.getID()) {
            case 1004:
                CacioKeyboardFocusManagerPeer.getInstance().setCurrentFocusedWindow(w);
                Window opposite = getOppositeWindow((FocusEvent) ev);
                WindowEvent we = new WindowEvent(w, 207, opposite);
                super.handlePeerEvent(we);
                break;
            case 1005:
                CacioKeyboardFocusManagerPeer.getInstance().setCurrentFocusedWindow(null);
                Window opposite2 = getOppositeWindow((FocusEvent) ev);
                WindowEvent we2 = new WindowEvent(w, 208, opposite2);
                super.handlePeerEvent(we2);
                break;
            default:
                super.handlePeerEvent(ev);
                break;
        }
    }

    private Window getOppositeWindow(FocusEvent ev) {
        Window oppositeComponent = ev.getOppositeComponent();
        if (oppositeComponent instanceof Window) {
            return oppositeComponent;
        }
        return null;
    }

    protected PlatformToplevelWindow getToplevelWindow() {
        return (PlatformToplevelWindow) this.platformWindow;
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    boolean hasInsets() {
        return true;
    }

    protected boolean shouldDecorate() {
        return isDecorateWindows() || ((this instanceof CacioDialogPeer) && isDecorateDialogs());
    }

    @Override // sun.awt.peer.cacio.CacioContainerPeer, sun.awt.peer.cacio.CacioComponentPeer
    public Insets getInsets() {
        Insets insets;
        int bottom;
        int right;
        if (shouldDecorate()) {
            JRootPane rp = (JRootPane) getSwingComponent();
            if (rp == null) {
                return new Insets(0, 0, 0, 0);
            }
            ProxyWindow proxy = getProxyWindow();
            if (!proxy.isVisible()) {
                proxy.setVisible(true);
            }
            Rectangle cpBounds = rp.getContentPane().getBounds();
            Point lpLoc = rp.getLayeredPane().getLocation();
            int top2 = cpBounds.y + lpLoc.y;
            int left = cpBounds.x + lpLoc.x;
            Border b = rp.getBorder();
            if (b != null) {
                Insets bi = b.getBorderInsets(rp);
                bottom = bi.bottom;
                right = bi.right;
            } else {
                bottom = 0;
                right = 0;
            }
            insets = new Insets(top2, left, bottom, right);
        } else {
            insets = (Insets) this.platformWindow.getInsets().clone();
            JMenuBar jmb = ((JRootPane) getSwingComponent()).getJMenuBar();
            if (jmb != null) {
                insets.top += jmb.getPreferredSize().height;
            }
        }
        return insets;
    }

    public void setOpacity(float opacity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setOpaque(boolean isOpaque) {
    }

    public void repositionSecurityWarning() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void updateWindow() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [javax.swing.JComponent] */
    @Override // sun.awt.peer.cacio.CacioContainerPeer, sun.awt.peer.cacio.CacioComponentPeer
    protected void peerPaint(Graphics g, boolean update) {
        ?? swingComponent;
        if ((shouldDecorate() || ((JRootPane) getSwingComponent()).getJMenuBar() != null) && (swingComponent = getSwingComponent()) != 0) {
            Insets insets = getInsets();
            Area clip = new Area(swingComponent.getBounds());
            Rectangle clip2 = new Rectangle(insets.left, insets.top, (swingComponent.getWidth() - insets.left) - insets.right, (swingComponent.getHeight() - insets.bottom) - insets.top);
            clip.subtract(new Area(clip2));
            WindowClippedGraphics windowClippedGraphics = new WindowClippedGraphics((Graphics2D) g, clip);
            try {
                swingComponent.paint(windowClippedGraphics);
                windowClippedGraphics.dispose();
            } catch (Throwable th) {
                windowClippedGraphics.dispose();
                throw th;
            }
        }
    }

    public void updateAlwaysOnTopState() {
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer, sun.awt.peer.cacio.CacioComponent
    public boolean isFocusable() {
        boolean ret = super.isFocusable();
        if (ret) {
            ret = ((Window) getAWTComponent()).isFocusable() && ((Window) getAWTComponent()).getFocusableWindowState();
        }
        return ret;
    }
}
