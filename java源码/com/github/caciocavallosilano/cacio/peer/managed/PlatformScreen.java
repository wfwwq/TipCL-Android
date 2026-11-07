package com.github.caciocavallosilano.cacio.peer.managed;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Rectangle;
import java.awt.image.ColorModel;
import java.util.List;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/managed/PlatformScreen.class */
public interface PlatformScreen {
    ColorModel getColorModel();

    GraphicsConfiguration getGraphicsConfiguration();

    Rectangle getBounds();

    Graphics2D getClippedGraphics(Color color, Color color2, Font font, List<Rectangle> list);
}
