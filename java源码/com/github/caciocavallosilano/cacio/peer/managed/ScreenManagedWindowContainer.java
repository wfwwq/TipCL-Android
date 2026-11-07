package com.github.caciocavallosilano.cacio.peer.managed;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.ColorModel;
import java.util.List;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/managed/ScreenManagedWindowContainer.class */
public class ScreenManagedWindowContainer extends AbstractManagedWindowContainer {
    private PlatformScreen screen;

    @Override // com.github.caciocavallosilano.cacio.peer.managed.AbstractManagedWindowContainer, com.github.caciocavallosilano.cacio.peer.managed.ManagedWindowContainer
    public /* bridge */ /* synthetic */ void repaint(int i, int i2, int i3, int i4) {
        super.repaint(i, i2, i3, i4);
    }

    @Override // com.github.caciocavallosilano.cacio.peer.managed.AbstractManagedWindowContainer, com.github.caciocavallosilano.cacio.peer.managed.ManagedWindowContainer
    public /* bridge */ /* synthetic */ Point getLocationOnScreen() {
        return super.getLocationOnScreen();
    }

    ScreenManagedWindowContainer(PlatformScreen ps) {
        this.screen = ps;
    }

    @Override // com.github.caciocavallosilano.cacio.peer.managed.ManagedWindowContainer
    public Graphics2D getClippedGraphics(Color fg, Color bg, Font font, List<Rectangle> clipRects) {
        return this.screen.getClippedGraphics(fg, bg, font, clipRects);
    }

    @Override // com.github.caciocavallosilano.cacio.peer.managed.ManagedWindowContainer, com.github.caciocavallosilano.cacio.peer.PlatformWindow
    public ColorModel getColorModel() {
        return this.screen.getColorModel();
    }

    @Override // com.github.caciocavallosilano.cacio.peer.managed.ManagedWindowContainer, com.github.caciocavallosilano.cacio.peer.PlatformWindow
    public GraphicsConfiguration getGraphicsConfiguration() {
        return this.screen.getGraphicsConfiguration();
    }
}
