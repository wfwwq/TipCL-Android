package sun.awt.peer.cacio;

import java.awt.AWTException;
import java.awt.BufferCapabilities;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.ColorModel;
import java.awt.peer.ContainerPeer;
import sun.awt.CausedFocusEvent;
import sun.java2d.pipe.Region;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/PlatformWindow.class */
public interface PlatformWindow {
    ColorModel getColorModel();

    GraphicsConfiguration getGraphicsConfiguration();

    Rectangle getBounds();

    void dispose();

    Graphics2D getGraphics(Color color, Color color2, Font font);

    void setBounds(int i, int i2, int i3, int i4, int i5);

    Insets getInsets();

    Point getLocationOnScreen();

    boolean canDetermineObscurity();

    boolean isObscured();

    void applyShape(Region region);

    boolean isReparentSuppored();

    void reparent(ContainerPeer containerPeer);

    boolean isRestackSupported();

    void restack();

    void setVisible(boolean z);

    boolean requestFocus(Component component, boolean z, boolean z2, long j, CausedFocusEvent.Cause cause);

    void createBuffers(int i, BufferCapabilities bufferCapabilities) throws AWTException;

    void destroyBuffers();

    void flip(int i, int i2, int i3, int i4, BufferCapabilities.FlipContents flipContents);

    Image getBackBuffer();

    void requestFocus();
}
