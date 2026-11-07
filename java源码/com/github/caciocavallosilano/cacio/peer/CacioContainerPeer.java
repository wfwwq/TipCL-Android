package com.github.caciocavallosilano.cacio.peer;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.PaintEvent;
import java.awt.peer.ComponentPeer;
import java.awt.peer.ContainerPeer;
import javax.swing.JComponent;
import org.lwjgl.system.windows.User32;
import sun.awt.AWTAccessor;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioContainerPeer.class */
abstract class CacioContainerPeer<AWTComponentType extends Component, SwingComponentType extends JComponent> extends CacioComponentPeer<AWTComponentType, SwingComponentType> implements ContainerPeer {
    private boolean isLayouting;

    public CacioContainerPeer(AWTComponentType awtC, PlatformWindowFactory pwf) {
        super(awtC, pwf);
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    boolean isLayouting() {
        return this.isLayouting;
    }

    public void beginLayout() {
        this.isLayouting = true;
    }

    public void endLayout() {
        if (!getPaintArea().isEmpty() && !AWTAccessor.getComponentAccessor().getIgnoreRepaint(getAWTComponent())) {
            handlePeerEvent(new PaintEvent(getAWTComponent(), User32.WM_DWMCOLORIZATIONCOLORCHANGED, new Rectangle()));
        }
        this.isLayouting = false;
    }

    public void beginValidate() {
    }

    public void endValidate() {
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    public Insets getInsets() {
        return this.platformWindow.getInsets();
    }

    public boolean isRestackSupported() {
        return this.platformWindow.isRestackSupported();
    }

    public void restack() {
        this.platformWindow.restack();
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    public void setFont(Font font) {
        super.setFont(font);
        Container c = getAWTComponent();
        int count = c.getComponentCount();
        for (int i = 0; i < count; i++) {
            Component comp = c.getComponent(i);
            if (AWTAccessor.getComponentAccessor().getFont(comp) == null) {
                ComponentPeer peer = getPeer(comp);
                if (peer instanceof CacioComponentPeer) {
                    CacioComponentPeer ccp = (CacioComponentPeer) peer;
                    if (ccp.getFont() != font) {
                        ccp.setFont(font);
                    }
                }
            }
        }
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    public void setForeground(Color fg) {
        super.setForeground(fg);
        Container c = getAWTComponent();
        int count = c.getComponentCount();
        for (int i = 0; i < count; i++) {
            Component comp = c.getComponent(i);
            if (AWTAccessor.getComponentAccessor().getForeground(comp) == null) {
                ComponentPeer peer = getPeer(comp);
                if (peer instanceof CacioComponentPeer) {
                    CacioComponentPeer ccp = (CacioComponentPeer) peer;
                    if (ccp.getForeground() != fg) {
                        ccp.setForeground(fg);
                    }
                }
            }
        }
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    public void setBackground(Color bg) {
        super.setBackground(bg);
        Container c = getAWTComponent();
        int count = c.getComponentCount();
        for (int i = 0; i < count; i++) {
            Component comp = c.getComponent(i);
            if (AWTAccessor.getComponentAccessor().getBackground(comp) == null) {
                ComponentPeer peer = getPeer(comp);
                if (peer instanceof CacioComponentPeer) {
                    CacioComponentPeer ccp = (CacioComponentPeer) peer;
                    if (ccp.getBackground() != bg) {
                        ccp.setBackground(bg);
                    }
                }
            }
        }
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    public void setEnabled(boolean enable) {
        if (enable && !isParentsEnabled()) {
            return;
        }
        setEnabledImpl(enable);
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    void setEnabledImpl(boolean enable) {
        super.setEnabledImpl(enable);
        Container c = getAWTComponent();
        int count = c.getComponentCount();
        for (int i = 0; i < count; i++) {
            Component comp = c.getComponent(i);
            if (!enable || AWTAccessor.getComponentAccessor().isEnabled(comp)) {
                ComponentPeer peer = getPeer(comp);
                if (peer instanceof CacioComponentPeer) {
                    CacioComponentPeer ccp = (CacioComponentPeer) peer;
                    if (ccp.isEnabled() != enable) {
                        ccp.setEnabledImpl(enable);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    public void peerPaint(Graphics g, boolean update) {
        if (!update) {
            super.peerPaint(g, update);
        }
    }
}
