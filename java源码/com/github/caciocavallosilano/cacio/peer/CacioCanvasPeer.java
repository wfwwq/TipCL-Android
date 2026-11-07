package com.github.caciocavallosilano.cacio.peer;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.peer.CanvasPeer;
import javax.swing.JPanel;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioCanvasPeer.class */
class CacioCanvasPeer extends CacioComponentPeer<Canvas, JPanel> implements CanvasPeer {
    public CacioCanvasPeer(Canvas awtC, PlatformWindowFactory pwf) {
        super(awtC, pwf);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    public void peerPaint(Graphics g, boolean update) {
    }

    public GraphicsConfiguration getAppropriateGraphicsConfiguration(GraphicsConfiguration gc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
