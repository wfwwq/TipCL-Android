package com.github.caciocavallosilano.cacio.peer.managed;

import com.github.caciocavallosilano.cacio.peer.CacioComponent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/managed/AbstractManagedWindowContainer.class */
abstract class AbstractManagedWindowContainer implements ManagedWindowContainer {
    private LinkedList<ManagedWindow> children = new LinkedList<>();

    protected AbstractManagedWindowContainer() {
    }

    @Override // com.github.caciocavallosilano.cacio.peer.managed.ManagedWindowContainer
    public final void add(ManagedWindow child) {
        this.children.add(child);
        Iterator<ManagedWindow> i = this.children.descendingIterator();
        while (i.hasNext()) {
            ManagedWindow _child = i.next();
            if (_child.isVisible()) {
                CacioComponent component = _child.getCacioComponent();
                component.getAWTComponent().repaint();
            }
        }
    }

    @Override // com.github.caciocavallosilano.cacio.peer.managed.ManagedWindowContainer
    public final void remove(ManagedWindow child) {
        this.children.remove(child);
        Iterator<ManagedWindow> i = this.children.descendingIterator();
        while (i.hasNext()) {
            ManagedWindow _child = i.next();
            if (_child.isVisible()) {
                CacioComponent component = _child.getCacioComponent();
                component.getAWTComponent().repaint();
            }
        }
    }

    @Override // com.github.caciocavallosilano.cacio.peer.managed.ManagedWindowContainer
    public final LinkedList<ManagedWindow> getChildren() {
        return this.children;
    }

    @Override // com.github.caciocavallosilano.cacio.peer.managed.ManagedWindowContainer
    public Point getLocationOnScreen() {
        return new Point(0, 0);
    }

    @Override // com.github.caciocavallosilano.cacio.peer.managed.ManagedWindowContainer
    public final void dispatchEvent(EventData event) {
        dispatchEventImpl(event);
    }

    boolean dispatchEventImpl(EventData event) {
        int id = event.getId();
        if (id >= 500 && id <= 507) {
            ManagedWindow source = findWindowAt(event.getX(), event.getY());
            if (source != null) {
                event.setSource(source);
                Rectangle b = source.getBounds();
                event.setX(event.getX() - b.x);
                event.setY(event.getY() - b.y);
                if (id == 500 || id == 501) {
                    FocusManager.getInstance().setFocusedWindowNoEvent(source);
                }
                return source.dispatchEventImpl(event);
            }
            return false;
        }
        if (id >= 400 && id <= 402) {
            FocusManager fm = FocusManager.getInstance();
            ManagedWindow window = fm.getFocusedWindow();
            if (window != null) {
                window.dispatchKeyEvent(event);
                return true;
            }
            return true;
        }
        return false;
    }

    ManagedWindow findWindowAt(int x, int y) {
        Iterator<ManagedWindow> i = this.children.descendingIterator();
        while (i.hasNext()) {
            ManagedWindow child = i.next();
            if (child.isVisible()) {
                Rectangle b = child.getBounds();
                if (x >= b.x && y >= b.y && x < b.x + b.width && y < b.y + b.height) {
                    return child;
                }
            }
        }
        return null;
    }

    @Override // com.github.caciocavallosilano.cacio.peer.managed.ManagedWindowContainer
    public void repaint(int x, int y, int w, int h) {
        if (!(this instanceof ManagedWindow)) {
            repaintSelf(x, y, w, h);
        }
        Iterator<ManagedWindow> i = this.children.descendingIterator();
        Rectangle rect = new Rectangle(x, y, w, h);
        Rectangle intersect = new Rectangle();
        while (i.hasNext()) {
            ManagedWindow child = i.next();
            if (child.isVisible()) {
                Rectangle b = child.getBounds();
                Rectangle2D.intersect(b, rect, intersect);
                if (!intersect.isEmpty()) {
                    Rectangle area = new Rectangle(intersect);
                    area.x -= b.x;
                    area.y -= b.y;
                    child.repaint(area.x, area.y, area.width, area.height);
                }
            }
        }
    }

    private void repaintSelf(int x, int y, int w, int h) {
        Rectangle r = new Rectangle(x, y, w, h);
        LinkedList<Rectangle> rects = new LinkedList<>();
        Iterator<ManagedWindow> it = this.children.iterator();
        while (it.hasNext()) {
            ManagedWindow c = it.next();
            if (c.isVisible()) {
                Rectangle b = c.getBounds();
                if (b.intersects(r)) {
                    rects.add(b);
                }
            }
        }
        Graphics2D g = getClippedGraphics(Color.WHITE, Color.WHITE, new Font("Dialog", 1, 12), rects);
        g.clearRect(x, y, w, h);
    }
}
