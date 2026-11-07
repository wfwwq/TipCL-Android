package sun.awt.peer.cacio;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.peer.CanvasPeer;
import javax.swing.JPanel;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioCanvasPeer.class */
class CacioCanvasPeer extends CacioComponentPeer<Canvas, JPanel> implements CanvasPeer {
    public CacioCanvasPeer(Canvas awtC, PlatformWindowFactory pwf) {
        super(awtC, pwf);
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    protected void peerPaint(Graphics g, boolean update) {
    }

    public GraphicsConfiguration getAppropriateGraphicsConfiguration(GraphicsConfiguration gc) {
        return gc;
    }
}
