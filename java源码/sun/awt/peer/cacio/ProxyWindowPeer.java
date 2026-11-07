package sun.awt.peer.cacio;

import java.awt.AWTEvent;
import java.awt.AWTException;
import java.awt.BufferCapabilities;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.PaintEvent;
import java.awt.event.WindowEvent;
import java.awt.image.ColorModel;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.awt.image.VolatileImage;
import java.awt.peer.ComponentPeer;
import java.awt.peer.ContainerPeer;
import java.awt.peer.WindowPeer;
import sun.awt.CausedFocusEvent;
import sun.java2d.pipe.Region;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/ProxyWindowPeer.class */
class ProxyWindowPeer implements WindowPeer {
    private ProxyWindow proxyWindow;

    ProxyWindowPeer(ProxyWindow pw) {
        this.proxyWindow = pw;
    }

    CacioComponentPeer getTarget() {
        return this.proxyWindow.getTargetPeer();
    }

    public void toFront() {
    }

    public void toBack() {
    }

    public void setAlwaysOnTop(boolean alwaysOnTop) {
    }

    public void updateAlwaysOnTopState() {
    }

    public void updateFocusableWindowState() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setModalBlocked(Dialog blocker, boolean blocked) {
    }

    public void updateMinimumSize() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void updateIconImages() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Insets getInsets() {
        return new Insets(0, 0, 0, 0);
    }

    public void beginValidate() {
    }

    public void endValidate() {
    }

    public void beginLayout() {
    }

    public void endLayout() {
    }

    public boolean isObscured() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean canDetermineObscurity() {
        return false;
    }

    public void setVisible(boolean v) {
    }

    public void setEnabled(boolean e) {
    }

    public void paint(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void print(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setBounds(int x, int y, int width, int height, int op) {
    }

    public void handleEvent(AWTEvent e) {
        if (e instanceof WindowEvent) {
            getTarget().getAWTComponent().dispatchEvent(e);
        }
    }

    public void coalescePaintEvent(PaintEvent e) {
    }

    public Point getLocationOnScreen() {
        return getTarget().getLocationOnScreen();
    }

    public Dimension getPreferredSize() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Dimension getMinimumSize() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ColorModel getColorModel() {
        return getTarget().getColorModel();
    }

    public Toolkit getToolkit() {
        return getTarget().getToolkit();
    }

    public Graphics getGraphics() {
        return getTarget().getGraphics();
    }

    public FontMetrics getFontMetrics(Font font) {
        return getTarget().getFontMetrics(font);
    }

    public void dispose() {
        CacioToolkit.disposePeer(this.proxyWindow, this);
    }

    public void setForeground(Color c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setBackground(Color c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setFont(Font f) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void updateCursorImmediately() {
        getTarget().updateCursorImmediately();
    }

    public boolean requestFocus(Component lightweightChild, boolean temporary, boolean focusedWindowChangeAllowed, long time, CausedFocusEvent.Cause cause) {
        return getTarget().requestFocus(lightweightChild, temporary, focusedWindowChangeAllowed, time, cause);
    }

    public boolean isFocusable() {
        return getTarget().isFocusable();
    }

    public Image createImage(ImageProducer producer) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Image createImage(int width, int height) {
        return getTarget().createImage(width, height);
    }

    public VolatileImage createVolatileImage(int width, int height) {
        return getTarget().createVolatileImage(width, height);
    }

    public boolean prepareImage(Image img, int w, int h, ImageObserver o) {
        return getTarget().prepareImage(img, w, h, o);
    }

    public int checkImage(Image img, int w, int h, ImageObserver o) {
        return getTarget().checkImage(img, w, h, o);
    }

    public GraphicsConfiguration getGraphicsConfiguration() {
        return getTarget().getGraphicsConfiguration();
    }

    public boolean handlesWheelScrolling() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void createBuffers(int numBuffers, BufferCapabilities caps) throws AWTException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Image getBackBuffer() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void flip(int x1, int y1, int x2, int y2, BufferCapabilities.FlipContents flipAction) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void destroyBuffers() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void reparent(ContainerPeer newContainer) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean isReparentSupported() {
        return false;
    }

    public void layout() {
    }

    public void applyShape(Region shape) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setOpacity(float opacity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setOpaque(boolean isOpaque) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void repositionSecurityWarning() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setZOrder(ComponentPeer above) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void updateWindow() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean updateGraphicsData(GraphicsConfiguration gc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
