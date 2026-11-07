package com.github.caciocavallosilano.cacio.peer.managed;

import com.github.caciocavallosilano.cacio.peer.CacioComponent;
import com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow;
import java.awt.AWTEvent;
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
import java.awt.event.PaintEvent;
import java.awt.image.ColorModel;
import java.awt.peer.ContainerPeer;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.lwjgl.system.windows.User32;
import sun.awt.ConstrainableGraphics;
import sun.java2d.pipe.Region;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/managed/ManagedWindow.class */
class ManagedWindow extends AbstractManagedWindowContainer implements PlatformToplevelWindow {
    private ManagedWindowContainer parent;
    private CacioComponent cacioComponent;
    private int x;
    private int y;
    private int width;
    private int height;
    private Color background;
    private Color foreground;
    private Font font;
    private boolean visible;

    ManagedWindow(ManagedWindowContainer p, CacioComponent cacioComp) {
        this.parent = p;
        this.cacioComponent = cacioComp;
        this.parent.add(this);
        Component c = this.cacioComponent.getAWTComponent();
        setBounds(c.getX(), c.getY(), c.getWidth(), c.getHeight(), 0);
    }

    @Override // com.github.caciocavallosilano.cacio.peer.managed.ManagedWindowContainer, com.github.caciocavallosilano.cacio.peer.PlatformWindow
    public ColorModel getColorModel() {
        return this.parent.getColorModel();
    }

    @Override // com.github.caciocavallosilano.cacio.peer.managed.ManagedWindowContainer
    public Graphics2D getClippedGraphics(Color bg, Color fg, Font font, List<Rectangle> clipRects) {
        if (clipRects != null) {
            for (Rectangle r : clipRects) {
                r.x += this.x;
                r.y += this.y;
            }
        }
        return prepareClippedGraphics(bg, fg, font, clipRects);
    }

    @Override // com.github.caciocavallosilano.cacio.peer.PlatformWindow
    public Graphics2D getGraphics(Color fg, Color bg, Font font) {
        LinkedList<Rectangle> clips;
        LinkedList<ManagedWindow> children = getChildren();
        if (children != null && children.size() > 0) {
            clips = new LinkedList<>();
            Iterator<ManagedWindow> it = children.iterator();
            while (it.hasNext()) {
                ManagedWindow child = it.next();
                if (child.isVisible()) {
                    clips.add(child.getBounds());
                }
            }
        } else {
            clips = null;
        }
        Graphics2D g2d = getClippedGraphics(fg, bg, font, clips);
        return g2d;
    }

    private Graphics2D prepareClippedGraphics(Color fg, Color bg, Font font, List<Rectangle> clipRects) {
        ConstrainableGraphics clippedGraphics = this.parent.getClippedGraphics(fg, bg, font, addClipRects(clipRects));
        if (clippedGraphics instanceof ConstrainableGraphics) {
            clippedGraphics.constrain(this.x, this.y, this.width, this.height);
        } else {
            clippedGraphics = (Graphics2D) clippedGraphics.create(this.x, this.y, this.width, this.height);
        }
        return clippedGraphics;
    }

    private List<Rectangle> addClipRects(List<Rectangle> clipRects) {
        ManagedWindow sibling;
        Deque<ManagedWindow> siblings = this.parent.getChildren();
        if (siblings.getLast() != this) {
            if (clipRects == null) {
                clipRects = new LinkedList();
            }
            Iterator<ManagedWindow> i = siblings.descendingIterator();
            Rectangle myBounds = getBounds();
            while (i.hasNext() && (sibling = i.next()) != this) {
                if (sibling.isVisible()) {
                    Rectangle bounds = sibling.getBounds();
                    if (bounds.intersects(myBounds)) {
                        clipRects.add(bounds);
                    }
                }
            }
        }
        return clipRects;
    }

    @Override // com.github.caciocavallosilano.cacio.peer.managed.ManagedWindowContainer, com.github.caciocavallosilano.cacio.peer.PlatformWindow
    public GraphicsConfiguration getGraphicsConfiguration() {
        return this.parent.getGraphicsConfiguration();
    }

    @Override // com.github.caciocavallosilano.cacio.peer.PlatformWindow
    public void dispose() {
        setVisible(false);
        this.parent.remove(this);
    }

    @Override // com.github.caciocavallosilano.cacio.peer.PlatformWindow
    public Rectangle getBounds() {
        return new Rectangle(this.x, this.y, this.width, this.height);
    }

    @Override // com.github.caciocavallosilano.cacio.peer.PlatformWindow
    public void setBounds(int x, int y, int width, int height, int op) {
        int oldX = this.x;
        int oldY = this.y;
        int oldW = this.width;
        int oldH = this.height;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        if (isVisible()) {
            this.parent.repaint(oldX, oldY, oldW, oldH);
            this.parent.repaint(x, y, width, height);
        }
    }

    @Override // com.github.caciocavallosilano.cacio.peer.PlatformWindow
    public Insets getInsets() {
        return new Insets(0, 0, 0, 0);
    }

    @Override // com.github.caciocavallosilano.cacio.peer.managed.AbstractManagedWindowContainer, com.github.caciocavallosilano.cacio.peer.managed.ManagedWindowContainer
    public Point getLocationOnScreen() {
        Point p = this.parent.getLocationOnScreen();
        p.x += this.x;
        p.y += this.y;
        return p;
    }

    @Override // com.github.caciocavallosilano.cacio.peer.PlatformWindow
    public boolean canDetermineObscurity() {
        return true;
    }

    @Override // com.github.caciocavallosilano.cacio.peer.PlatformWindow
    public boolean isObscured() {
        return isRegionObscured(0, 0, this.width, this.height);
    }

    private boolean isRegionObscured(int x, int y, int w, int h) {
        return isParentObscured(x, y, w, h) || hasOverlappingSiblings(x, y, w, h);
    }

    private boolean isParentObscured(int x, int y, int w, int h) {
        boolean isParentObscured;
        ManagedWindowContainer parent = getParent();
        if (parent instanceof ManagedWindow) {
            ManagedWindow p = (ManagedWindow) parent;
            isParentObscured = p.isRegionObscured(x + this.x, y + this.y, w, h);
        } else {
            isParentObscured = false;
        }
        return isParentObscured;
    }

    private boolean hasOverlappingSiblings(int x, int y, int w, int h) {
        ManagedWindow sibling;
        Deque<ManagedWindow> siblings = getParent().getChildren();
        boolean hasOverlappingSiblings = false;
        Rectangle myBounds = new Rectangle(x, y, w, h);
        Iterator<ManagedWindow> descIter = siblings.descendingIterator();
        while (descIter.hasNext() && !hasOverlappingSiblings && (sibling = descIter.next()) != this) {
            Rectangle siblingBounds = sibling.getBounds();
            hasOverlappingSiblings = myBounds.intersects(siblingBounds);
        }
        return hasOverlappingSiblings;
    }

    @Override // com.github.caciocavallosilano.cacio.peer.PlatformWindow
    public void applyShape(Region shape) {
    }

    @Override // com.github.caciocavallosilano.cacio.peer.PlatformWindow
    public boolean isReparentSuppored() {
        return false;
    }

    @Override // com.github.caciocavallosilano.cacio.peer.PlatformWindow
    public void reparent(ContainerPeer newContainer) {
    }

    @Override // com.github.caciocavallosilano.cacio.peer.PlatformWindow
    public boolean isRestackSupported() {
        return false;
    }

    @Override // com.github.caciocavallosilano.cacio.peer.PlatformWindow
    public void restack() {
    }

    @Override // com.github.caciocavallosilano.cacio.peer.PlatformWindow
    public void setVisible(boolean v) {
        if (v != this.visible) {
            this.visible = v;
            Rectangle b = getBounds();
            b.y = 0;
            b.x = 0;
            triggerRepaint(b);
            Iterator<ManagedWindow> it = getChildren().iterator();
            while (it.hasNext()) {
                ManagedWindow w = it.next();
                if (w.getCacioComponent().getAWTComponent().isVisible()) {
                    w.setVisible(v);
                }
            }
            FocusManager.getInstance().setVisible(this, v);
        }
    }

    private void triggerRepaint(Rectangle b) {
        Rectangle myBounds = getBounds();
        myBounds.y = 0;
        myBounds.x = 0;
        if (isVisible() && myBounds.contains(b) && !isRegionObscured(b.x, b.y, b.width, b.height)) {
            repaint(b.x, b.y, b.width, b.height);
            return;
        }
        ManagedWindowContainer c = getParent();
        if (c instanceof ManagedWindow) {
            ManagedWindow mw = (ManagedWindow) c;
            if (mw.isVisible()) {
                b.x += this.x;
                b.y += this.y;
                ((ManagedWindow) c).triggerRepaint(b);
                return;
            }
            return;
        }
        c.repaint(b.x + this.x, b.y + this.y, b.width, b.height);
    }

    boolean isVisible() {
        return this.visible;
    }

    @Override // com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow
    public int getState() {
        return 0;
    }

    @Override // com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow
    public void setState(int state) {
    }

    @Override // com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow
    public void setMaximizedBounds(Rectangle bounds) {
    }

    @Override // com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow
    public void setResizable(boolean resizable) {
    }

    @Override // com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow
    public void setTitle(String title) {
    }

    @Override // com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow
    public void setBlocked(boolean blocked) {
    }

    CacioComponent getCacioComponent() {
        return this.cacioComponent;
    }

    public void dispatchEvent(AWTEvent event) {
        getCacioComponent().handlePeerEvent(event);
    }

    @Override // com.github.caciocavallosilano.cacio.peer.managed.AbstractManagedWindowContainer
    protected boolean dispatchEventImpl(EventData event) {
        boolean dispatched = super.dispatchEventImpl(event);
        if (!dispatched) {
            event.setSource(this.cacioComponent.getAWTComponent());
            this.cacioComponent.handlePeerEvent(event.createAWTEvent());
            dispatched = true;
            if (event.getId() == 501) {
                FocusManager.getInstance().mousePressed(this);
            }
        }
        return dispatched;
    }

    void dispatchKeyEvent(EventData ev) {
        ev.setSource(this.cacioComponent.getAWTComponent());
        this.cacioComponent.handlePeerEvent(ev.createAWTEvent());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: java.awt.AWTException */
    @Override // com.github.caciocavallosilano.cacio.peer.PlatformWindow
    public void createBuffers(int numBuffers, BufferCapabilities caps) throws AWTException {
        throw new AWTException("Not yet supported.");
    }

    @Override // com.github.caciocavallosilano.cacio.peer.PlatformWindow
    public void destroyBuffers() {
    }

    @Override // com.github.caciocavallosilano.cacio.peer.PlatformWindow
    public void flip(int x1, int y1, int x2, int y2, BufferCapabilities.FlipContents flipAction) {
    }

    @Override // com.github.caciocavallosilano.cacio.peer.PlatformWindow
    public Image getBackBuffer() {
        return null;
    }

    ManagedWindowContainer getParent() {
        return this.parent;
    }

    @Override // com.github.caciocavallosilano.cacio.peer.managed.AbstractManagedWindowContainer, com.github.caciocavallosilano.cacio.peer.managed.ManagedWindowContainer
    public void repaint(int x, int y, int w, int h) {
        CacioComponent cacioComp = getCacioComponent();
        Component awtComp = cacioComp.getAWTComponent();
        Rectangle area = new Rectangle(x, y, w, h);
        PaintEvent ev = new PaintEvent(awtComp, User32.WM_DWMWINDOWMAXIMIZEDCHANGE, area);
        cacioComp.handlePeerEvent(ev);
        super.repaint(x, y, w, h);
    }

    @Override // com.github.caciocavallosilano.cacio.peer.PlatformWindow
    public void requestFocus() {
        FocusManager.getInstance().setFocusedWindowNoEvent(this);
    }
}
