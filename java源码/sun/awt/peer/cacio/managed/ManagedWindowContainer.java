package sun.awt.peer.cacio.managed;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.ColorModel;
import java.util.Deque;
import java.util.List;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/managed/ManagedWindowContainer.class */
interface ManagedWindowContainer {
    void add(ManagedWindow managedWindow);

    void remove(ManagedWindow managedWindow);

    Deque<ManagedWindow> getChildren();

    Point getLocationOnScreen();

    void dispatchEvent(EventData eventData);

    Graphics2D getClippedGraphics(Color color, Color color2, Font font, List<Rectangle> list);

    void repaint(int i, int i2, int i3, int i4);

    ColorModel getColorModel();

    GraphicsConfiguration getGraphicsConfiguration();
}
