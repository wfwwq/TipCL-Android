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
import java.awt.MenuBar;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.PaintEvent;
import java.awt.image.ColorModel;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.awt.image.VolatileImage;
import java.awt.peer.ComponentPeer;
import java.awt.peer.ContainerPeer;
import sun.awt.CausedFocusEvent;
import sun.awt.LightweightFrame;
import sun.java2d.pipe.Region;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioLightweightFramePeer.class */
public class CacioLightweightFramePeer extends CacioFramePeer {
    @Override // sun.awt.peer.cacio.CacioFramePeer
    public /* bridge */ /* synthetic */ void emulateActivation(boolean z) {
        super.emulateActivation(z);
    }

    @Override // sun.awt.peer.cacio.CacioFramePeer, sun.awt.peer.cacio.CacioWindowPeer
    public /* bridge */ /* synthetic */ void updateAlwaysOnTopState() {
        super.updateAlwaysOnTopState();
    }

    @Override // sun.awt.peer.cacio.CacioFramePeer
    public /* bridge */ /* synthetic */ void setBoundsPrivate(int i, int i2, int i3, int i4) {
        super.setBoundsPrivate(i, i2, i3, i4);
    }

    @Override // sun.awt.peer.cacio.CacioFramePeer
    public /* bridge */ /* synthetic */ Rectangle getBoundsPrivate() {
        return super.getBoundsPrivate();
    }

    @Override // sun.awt.peer.cacio.CacioFramePeer
    public /* bridge */ /* synthetic */ void setTitle(String str) {
        super.setTitle(str);
    }

    @Override // sun.awt.peer.cacio.CacioFramePeer
    public /* bridge */ /* synthetic */ void setResizable(boolean z) {
        super.setResizable(z);
    }

    @Override // sun.awt.peer.cacio.CacioFramePeer
    public /* bridge */ /* synthetic */ void setMenuBar(MenuBar menuBar) {
        super.setMenuBar(menuBar);
    }

    @Override // sun.awt.peer.cacio.CacioFramePeer
    public /* bridge */ /* synthetic */ void setMaximizedBounds(Rectangle rectangle) {
        super.setMaximizedBounds(rectangle);
    }

    @Override // sun.awt.peer.cacio.CacioFramePeer
    public /* bridge */ /* synthetic */ void setState(int i) {
        super.setState(i);
    }

    @Override // sun.awt.peer.cacio.CacioFramePeer
    public /* bridge */ /* synthetic */ int getState() {
        return super.getState();
    }

    @Override // sun.awt.peer.cacio.CacioWindowPeer, sun.awt.peer.cacio.CacioComponentPeer, sun.awt.peer.cacio.CacioComponent
    public /* bridge */ /* synthetic */ boolean isFocusable() {
        return super.isFocusable();
    }

    @Override // sun.awt.peer.cacio.CacioWindowPeer
    public /* bridge */ /* synthetic */ void updateWindow() {
        super.updateWindow();
    }

    @Override // sun.awt.peer.cacio.CacioWindowPeer
    public /* bridge */ /* synthetic */ void repositionSecurityWarning() {
        super.repositionSecurityWarning();
    }

    @Override // sun.awt.peer.cacio.CacioWindowPeer
    public /* bridge */ /* synthetic */ void setOpaque(boolean z) {
        super.setOpaque(z);
    }

    @Override // sun.awt.peer.cacio.CacioWindowPeer
    public /* bridge */ /* synthetic */ void setOpacity(float f) {
        super.setOpacity(f);
    }

    @Override // sun.awt.peer.cacio.CacioWindowPeer, sun.awt.peer.cacio.CacioContainerPeer, sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ Insets getInsets() {
        return super.getInsets();
    }

    @Override // sun.awt.peer.cacio.CacioWindowPeer, sun.awt.peer.cacio.CacioComponentPeer, sun.awt.peer.cacio.CacioComponent
    public /* bridge */ /* synthetic */ void handlePeerEvent(AWTEvent aWTEvent) {
        super.handlePeerEvent(aWTEvent);
    }

    @Override // sun.awt.peer.cacio.CacioWindowPeer
    public /* bridge */ /* synthetic */ void updateMinimumSize() {
        super.updateMinimumSize();
    }

    @Override // sun.awt.peer.cacio.CacioWindowPeer
    public /* bridge */ /* synthetic */ void updateIconImages() {
        super.updateIconImages();
    }

    @Override // sun.awt.peer.cacio.CacioWindowPeer
    public /* bridge */ /* synthetic */ void updateFocusableWindowState() {
        super.updateFocusableWindowState();
    }

    @Override // sun.awt.peer.cacio.CacioWindowPeer
    public /* bridge */ /* synthetic */ void toFront() {
        super.toFront();
    }

    @Override // sun.awt.peer.cacio.CacioWindowPeer
    public /* bridge */ /* synthetic */ void toBack() {
        super.toBack();
    }

    @Override // sun.awt.peer.cacio.CacioWindowPeer
    public /* bridge */ /* synthetic */ void setModalBlocked(Dialog dialog, boolean z) {
        super.setModalBlocked(dialog, z);
    }

    @Override // sun.awt.peer.cacio.CacioWindowPeer
    public /* bridge */ /* synthetic */ void setAlwaysOnTop(boolean z) {
        super.setAlwaysOnTop(z);
    }

    @Override // sun.awt.peer.cacio.CacioContainerPeer, sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    @Override // sun.awt.peer.cacio.CacioContainerPeer, sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ void setBackground(Color color) {
        super.setBackground(color);
    }

    @Override // sun.awt.peer.cacio.CacioContainerPeer, sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ void setForeground(Color color) {
        super.setForeground(color);
    }

    @Override // sun.awt.peer.cacio.CacioContainerPeer, sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ void setFont(Font font) {
        super.setFont(font);
    }

    @Override // sun.awt.peer.cacio.CacioContainerPeer
    public /* bridge */ /* synthetic */ void restack() {
        super.restack();
    }

    @Override // sun.awt.peer.cacio.CacioContainerPeer
    public /* bridge */ /* synthetic */ boolean isRestackSupported() {
        return super.isRestackSupported();
    }

    @Override // sun.awt.peer.cacio.CacioContainerPeer
    public /* bridge */ /* synthetic */ void endValidate() {
        super.endValidate();
    }

    @Override // sun.awt.peer.cacio.CacioContainerPeer
    public /* bridge */ /* synthetic */ void beginValidate() {
        super.beginValidate();
    }

    @Override // sun.awt.peer.cacio.CacioContainerPeer
    public /* bridge */ /* synthetic */ void endLayout() {
        super.endLayout();
    }

    @Override // sun.awt.peer.cacio.CacioContainerPeer
    public /* bridge */ /* synthetic */ void beginLayout() {
        super.beginLayout();
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ void clearBackground() {
        super.clearBackground();
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ boolean updateGraphicsData(GraphicsConfiguration graphicsConfiguration) {
        return super.updateGraphicsData(graphicsConfiguration);
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ void setZOrder(ComponentPeer componentPeer) {
        super.setZOrder(componentPeer);
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer, sun.awt.peer.cacio.CacioComponent
    public /* bridge */ /* synthetic */ PlatformWindow getPlatformWindow() {
        return super.getPlatformWindow();
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ boolean isObscured() {
        return super.isObscured();
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ boolean canDetermineObscurity() {
        return super.canDetermineObscurity();
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ void applyShape(Region region) {
        super.applyShape(region);
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ void coalescePaintEvent(PaintEvent paintEvent) {
        super.coalescePaintEvent(paintEvent);
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ Image getBackBuffer() {
        return super.getBackBuffer();
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ void flip(int i, int i2, int i3, int i4, BufferCapabilities.FlipContents flipContents) {
        super.flip(i, i2, i3, i4, flipContents);
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ void destroyBuffers() {
        super.destroyBuffers();
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ void createBuffers(int i, BufferCapabilities bufferCapabilities) throws AWTException {
        super.createBuffers(i, bufferCapabilities);
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ VolatileImage createVolatileImage(int i, int i2) {
        return super.createVolatileImage(i, i2);
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ Image createImage(int i, int i2) {
        return super.createImage(i, i2);
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ Image createImage(ImageProducer imageProducer) {
        return super.createImage(imageProducer);
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ boolean prepareImage(Image image, int i, int i2, ImageObserver imageObserver) {
        return super.prepareImage(image, i, i2, imageObserver);
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ int checkImage(Image image, int i, int i2, ImageObserver imageObserver) {
        return super.checkImage(image, i, i2, imageObserver);
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ void updateCursorImmediately() {
        super.updateCursorImmediately();
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ void setVisible(boolean z) {
        super.setVisible(z);
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ void setBounds(int i, int i2, int i3, int i4, int i5) {
        super.setBounds(i, i2, i3, i4, i5);
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ boolean requestFocus(Component component, boolean z, boolean z2, long j, CausedFocusEvent.Cause cause) {
        return super.requestFocus(component, z, z2, j, cause);
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ void print(Graphics graphics) {
        super.print(graphics);
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ void paint(Graphics graphics) {
        super.paint(graphics);
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ void layout() {
        super.layout();
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ void reparent(ContainerPeer containerPeer) {
        super.reparent(containerPeer);
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ boolean isReparentSupported() {
        return super.isReparentSupported();
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ boolean handlesWheelScrolling() {
        return super.handlesWheelScrolling();
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ Toolkit getToolkit() {
        return super.getToolkit();
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ Dimension getPreferredSize() {
        return super.getPreferredSize();
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ Dimension getMinimumSize() {
        return super.getMinimumSize();
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ Point getLocationOnScreen() {
        return super.getLocationOnScreen();
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ FontMetrics getFontMetrics(Font font) {
        return super.getFontMetrics(font);
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ GraphicsConfiguration getGraphicsConfiguration() {
        return super.getGraphicsConfiguration();
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ ColorModel getColorModel() {
        return super.getColorModel();
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public /* bridge */ /* synthetic */ void dispose() {
        super.dispose();
    }

    public CacioLightweightFramePeer(LightweightFrame awtC, PlatformWindowFactory pwf) {
        super(awtC, pwf);
    }

    private LightweightFrame getLwTarget() {
        return (LightweightFrame) getAWTComponent();
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public Graphics getGraphics() {
        return getLwTarget().getGraphics();
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public void handleEvent(AWTEvent e) {
        if (e.getID() == 501) {
            emulateActivation(true);
        }
        super.handleEvent(e);
    }

    public boolean isLightweightFramePeer() {
        return true;
    }
}
