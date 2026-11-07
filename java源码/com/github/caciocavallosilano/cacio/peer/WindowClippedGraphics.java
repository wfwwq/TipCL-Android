package com.github.caciocavallosilano.cacio.peer;

import java.awt.Color;
import java.awt.Composite;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.Paint;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.NoninvertibleTransformException;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.text.AttributedCharacterIterator;
import java.util.Map;
import sun.awt.ConstrainableGraphics;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/WindowClippedGraphics.class */
public class WindowClippedGraphics extends Graphics2D implements ConstrainableGraphics {
    private Graphics2D wrapped;
    private Shape baseClip;
    private Shape userClip = null;
    static final /* synthetic */ boolean $assertionsDisabled;

    static {
        $assertionsDisabled = !WindowClippedGraphics.class.desiredAssertionStatus();
    }

    public WindowClippedGraphics(Graphics2D w, Shape c) {
        this.wrapped = w;
        this.baseClip = c;
        this.wrapped.setClip(this.baseClip);
    }

    public void clipRect(int x, int y, int w, int h) {
        Area a;
        if (this.userClip == null) {
            this.userClip = new Rectangle(x, y, w, h);
        } else if (this.userClip instanceof Rectangle) {
            Rectangle c = this.userClip;
            Rectangle2D.intersect(c, new Rectangle(x, y, w, h), c);
        } else {
            if (this.userClip instanceof Area) {
                a = this.userClip;
            } else {
                a = new Area(this.userClip);
            }
            a.intersect(new Area(new Rectangle(x, y, w, h)));
            this.userClip = a;
        }
        this.wrapped.clipRect(x, y, w, h);
    }

    public void clip(Shape s) {
        Area a;
        if (this.userClip == null) {
            this.userClip = s;
        } else if ((this.userClip instanceof Rectangle) && (s instanceof Rectangle)) {
            Rectangle c1 = this.userClip;
            Rectangle c2 = (Rectangle) s;
            Rectangle2D.intersect(c1, c2, c1);
        } else {
            if (this.userClip instanceof Area) {
                a = this.userClip;
            } else {
                a = new Area(this.userClip);
            }
            a.intersect(new Area(s));
            this.userClip = a;
        }
        this.wrapped.clip(s);
    }

    public Shape getClip() {
        return this.userClip;
    }

    public Rectangle getClipBounds() {
        Rectangle clipBounds;
        if (this.userClip == null) {
            clipBounds = null;
        } else {
            clipBounds = this.userClip.getBounds();
        }
        return clipBounds;
    }

    public Rectangle getClipBounds(Rectangle b) {
        if (b == null) {
            return this.userClip.getBounds();
        }
        b.setBounds(this.userClip.getBounds());
        return b;
    }

    public Rectangle getClipRect() {
        return this.userClip.getBounds();
    }

    public void setClip(int x, int y, int width, int height) {
        setClip(new Rectangle(x, y, width, height));
    }

    public void setClip(Shape clip) {
        Area a;
        Shape realClip;
        this.userClip = clip;
        if (clip == null) {
            realClip = this.baseClip;
        } else {
            if (this.baseClip instanceof Area) {
                a = (Area) this.baseClip;
            } else {
                a = new Area(this.baseClip);
            }
            Shape area = new Area(clip);
            area.intersect(a);
            realClip = area;
        }
        this.wrapped.setClip(realClip);
    }

    private Shape transformShape(Shape s, AffineTransform t) {
        Area a;
        Shape r;
        if (s == null) {
            r = null;
        } else {
            if (s instanceof Area) {
                a = (Area) s;
            } else {
                a = new Area(s);
            }
            r = a.createTransformedArea(t);
        }
        return r;
    }

    public void rotate(double theta) {
        AffineTransform t = AffineTransform.getRotateInstance(theta);
        try {
            AffineTransform i = t.createInverse();
            this.baseClip = transformShape(this.baseClip, i);
            this.userClip = transformShape(this.userClip, i);
        } catch (NoninvertibleTransformException e) {
            if (!$assertionsDisabled) {
                throw new AssertionError();
            }
        }
        this.wrapped.rotate(theta);
    }

    public void rotate(double theta, double x, double y) {
        AffineTransform t = AffineTransform.getRotateInstance(theta, x, y);
        try {
            AffineTransform i = t.createInverse();
            this.baseClip = transformShape(this.baseClip, i);
            this.userClip = transformShape(this.userClip, i);
        } catch (NoninvertibleTransformException e) {
            if (!$assertionsDisabled) {
                throw new AssertionError();
            }
        }
        this.wrapped.rotate(theta, x, y);
    }

    public void scale(double sx, double sy) {
        AffineTransform t = AffineTransform.getScaleInstance(sx, sy);
        try {
            AffineTransform i = t.createInverse();
            this.baseClip = transformShape(this.baseClip, i);
            this.userClip = transformShape(this.userClip, i);
        } catch (NoninvertibleTransformException e) {
            if (!$assertionsDisabled) {
                throw new AssertionError();
            }
        }
        this.wrapped.scale(sx, sy);
    }

    public void setTransform(AffineTransform tx) {
        AffineTransform t = getTransform();
        this.baseClip = transformShape(this.baseClip, t);
        this.userClip = transformShape(this.userClip, t);
        try {
            AffineTransform i = tx.createInverse();
            this.baseClip = transformShape(this.baseClip, i);
            this.userClip = transformShape(this.userClip, i);
        } catch (NoninvertibleTransformException e) {
            if (!$assertionsDisabled) {
                throw new AssertionError();
            }
        }
        this.wrapped.setTransform(tx);
    }

    public void shear(double shx, double shy) {
        AffineTransform t = AffineTransform.getShearInstance(shx, shy);
        try {
            AffineTransform i = t.createInverse();
            this.baseClip = transformShape(this.baseClip, i);
            this.userClip = transformShape(this.userClip, i);
        } catch (NoninvertibleTransformException e) {
            if (!$assertionsDisabled) {
                throw new AssertionError();
            }
        }
        this.wrapped.shear(shx, shy);
    }

    public void transform(AffineTransform tx) {
        try {
            AffineTransform i = tx.createInverse();
            this.baseClip = transformShape(this.baseClip, i);
            this.userClip = transformShape(this.userClip, i);
        } catch (NoninvertibleTransformException e) {
            if (!$assertionsDisabled) {
                throw new AssertionError();
            }
        }
        this.wrapped.transform(tx);
    }

    public void translate(int x, int y) {
        AffineTransform t = AffineTransform.getTranslateInstance(-x, -y);
        if (this.userClip != null && (this.userClip instanceof Rectangle)) {
            Rectangle r = this.userClip;
            r.x -= x;
            r.y -= y;
        } else {
            this.userClip = transformShape(this.userClip, t);
        }
        this.baseClip = transformShape(this.baseClip, t);
        this.wrapped.translate(x, y);
    }

    public void translate(double tx, double ty) {
        AffineTransform t = AffineTransform.getTranslateInstance(tx, ty);
        try {
            AffineTransform i = t.createInverse();
            this.baseClip = transformShape(this.baseClip, i);
            this.userClip = transformShape(this.userClip, i);
        } catch (NoninvertibleTransformException e) {
            if (!$assertionsDisabled) {
                throw new AssertionError();
            }
        }
        this.wrapped.translate(tx, ty);
    }

    public Graphics create() {
        Graphics2D wrappedClone = this.wrapped.create();
        WindowClippedGraphics g = new WindowClippedGraphics(wrappedClone, this.baseClip);
        g.userClip = this.userClip;
        return g;
    }

    public Graphics create(int x, int y, int w, int h) {
        Graphics2D graphics2DCreate = super.create(x, y, w, h);
        if ((graphics2DCreate instanceof Graphics2D) && this.baseClip != null) {
            AffineTransform t = AffineTransform.getTranslateInstance(-x, -y);
            Shape s = transformShape(this.baseClip, t);
            return new WindowClippedGraphics(graphics2DCreate, s);
        }
        return graphics2DCreate;
    }

    public void addRenderingHints(Map<?, ?> hints) {
        this.wrapped.addRenderingHints(hints);
    }

    public void draw(Shape s) {
        this.wrapped.draw(s);
    }

    public void drawGlyphVector(GlyphVector g, float x, float y) {
        this.wrapped.drawGlyphVector(g, x, y);
    }

    public boolean drawImage(Image img, AffineTransform xform, ImageObserver obs) {
        return this.wrapped.drawImage(img, xform, obs);
    }

    public void drawImage(BufferedImage img, BufferedImageOp op, int x, int y) {
        this.wrapped.drawImage(img, op, x, y);
    }

    public void drawRenderableImage(RenderableImage img, AffineTransform xform) {
        this.wrapped.drawRenderableImage(img, xform);
    }

    public void drawRenderedImage(RenderedImage img, AffineTransform xform) {
        this.wrapped.drawRenderedImage(img, xform);
    }

    public void drawString(String str, int x, int y) {
        this.wrapped.drawString(str, x, y);
    }

    public void drawChars(char[] c, int o, int l, int x, int y) {
        this.wrapped.drawChars(c, o, l, x, y);
    }

    public void drawBytes(byte[] b, int o, int l, int x, int y) {
        this.wrapped.drawBytes(b, o, l, x, y);
    }

    public void drawString(String str, float x, float y) {
        this.wrapped.drawString(str, x, y);
    }

    public void drawString(AttributedCharacterIterator iterator, int x, int y) {
        this.wrapped.drawString(iterator, x, y);
    }

    public void drawString(AttributedCharacterIterator iterator, float x, float y) {
        this.wrapped.drawString(iterator, x, y);
    }

    public void fill(Shape s) {
        this.wrapped.fill(s);
    }

    public Color getBackground() {
        return this.wrapped.getBackground();
    }

    public Composite getComposite() {
        return this.wrapped.getComposite();
    }

    public GraphicsConfiguration getDeviceConfiguration() {
        return this.wrapped.getDeviceConfiguration();
    }

    public FontRenderContext getFontRenderContext() {
        return this.wrapped.getFontRenderContext();
    }

    public Paint getPaint() {
        return this.wrapped.getPaint();
    }

    public Object getRenderingHint(RenderingHints.Key hintKey) {
        return this.wrapped.getRenderingHint(hintKey);
    }

    public RenderingHints getRenderingHints() {
        return this.wrapped.getRenderingHints();
    }

    public Stroke getStroke() {
        return this.wrapped.getStroke();
    }

    public AffineTransform getTransform() {
        return this.wrapped.getTransform();
    }

    public boolean hit(Rectangle rect, Shape s, boolean onStroke) {
        return this.wrapped.hit(rect, s, onStroke);
    }

    public boolean hitClip(int x, int y, int w, int h) {
        return this.wrapped.hitClip(x, y, w, h);
    }

    public void setBackground(Color color) {
        this.wrapped.setBackground(color);
    }

    public void setComposite(Composite comp) {
        this.wrapped.setComposite(comp);
    }

    public void setPaint(Paint paint) {
        this.wrapped.setPaint(paint);
    }

    public void setRenderingHint(RenderingHints.Key hintKey, Object hintValue) {
        this.wrapped.setRenderingHint(hintKey, hintValue);
    }

    public void setRenderingHints(Map<?, ?> hints) {
        this.wrapped.setRenderingHints(hints);
    }

    public void setStroke(Stroke s) {
        this.wrapped.setStroke(s);
    }

    public void clearRect(int x, int y, int width, int height) {
        this.wrapped.clearRect(x, y, width, height);
    }

    public void copyArea(int x, int y, int width, int height, int dx, int dy) {
        this.wrapped.copyArea(x, y, width, height, dx, dy);
    }

    public void dispose() {
        this.wrapped.dispose();
    }

    public void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle) {
        this.wrapped.drawArc(x, y, width, height, startAngle, arcAngle);
    }

    public boolean drawImage(Image img, int x, int y, ImageObserver observer) {
        return this.wrapped.drawImage(img, x, y, observer);
    }

    public boolean drawImage(Image img, int x, int y, int width, int height, ImageObserver observer) {
        return this.wrapped.drawImage(img, x, y, width, height, observer);
    }

    public boolean drawImage(Image img, int x, int y, Color bgcolor, ImageObserver observer) {
        return this.wrapped.drawImage(img, x, y, bgcolor, observer);
    }

    public boolean drawImage(Image img, int x, int y, int width, int height, Color bgcolor, ImageObserver observer) {
        return this.wrapped.drawImage(img, x, y, width, height, bgcolor, observer);
    }

    public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, ImageObserver observer) {
        return this.wrapped.drawImage(img, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, observer);
    }

    public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, Color bgcolor, ImageObserver observer) {
        return this.wrapped.drawImage(img, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, bgcolor, observer);
    }

    public void drawLine(int x1, int y1, int x2, int y2) {
        this.wrapped.drawLine(x1, y1, x2, y2);
    }

    public void drawOval(int x, int y, int width, int height) {
        this.wrapped.drawOval(x, y, width, height);
    }

    public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {
        this.wrapped.drawPolygon(xPoints, yPoints, nPoints);
    }

    public void drawPolygon(Polygon p) {
        this.wrapped.drawPolygon(p);
    }

    public void fillPolygon(Polygon p) {
        this.wrapped.fillPolygon(p);
    }

    public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {
        this.wrapped.drawPolyline(xPoints, yPoints, nPoints);
    }

    public void drawRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {
        this.wrapped.drawRoundRect(x, y, width, height, arcWidth, arcHeight);
    }

    public void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle) {
        this.wrapped.fillArc(x, y, width, height, startAngle, arcAngle);
    }

    public void fillOval(int x, int y, int width, int height) {
        this.wrapped.fillOval(x, y, width, height);
    }

    public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {
        this.wrapped.fillPolygon(xPoints, yPoints, nPoints);
    }

    public void fillRect(int x, int y, int width, int height) {
        this.wrapped.fillRect(x, y, width, height);
    }

    public void drawRect(int x, int y, int width, int height) {
        this.wrapped.drawRect(x, y, width, height);
    }

    public void draw3DRect(int x, int y, int width, int height, boolean r) {
        this.wrapped.draw3DRect(x, y, width, height, r);
    }

    public void fill3DRect(int x, int y, int width, int height, boolean r) {
        this.wrapped.fill3DRect(x, y, width, height, r);
    }

    public void fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {
        this.wrapped.fillRoundRect(x, y, width, height, arcWidth, arcHeight);
    }

    public Color getColor() {
        return this.wrapped.getColor();
    }

    public Font getFont() {
        return this.wrapped.getFont();
    }

    public FontMetrics getFontMetrics(Font f) {
        return this.wrapped.getFontMetrics(f);
    }

    public FontMetrics getFontMetrics() {
        return this.wrapped.getFontMetrics();
    }

    public void setColor(Color c) {
        this.wrapped.setColor(c);
    }

    public void setFont(Font font) {
        this.wrapped.setFont(font);
    }

    public void setPaintMode() {
        this.wrapped.setPaintMode();
    }

    public void setXORMode(Color c1) {
        this.wrapped.setXORMode(c1);
    }

    public void constrain(int x, int y, int w, int h) {
        if (this.wrapped instanceof ConstrainableGraphics) {
            AffineTransform t = AffineTransform.getTranslateInstance(-x, -y);
            if (this.userClip != null && (this.userClip instanceof Rectangle)) {
                Rectangle r = this.userClip;
                r.x -= x;
                r.y -= y;
            } else {
                this.userClip = transformShape(this.userClip, t);
            }
            this.baseClip = transformShape(this.baseClip, t);
            Area newBase = new Area(this.baseClip);
            newBase.intersect(new Area(new Rectangle(0, 0, w, h)));
            this.baseClip = newBase;
            ConstrainableGraphics cg = this.wrapped;
            cg.constrain(x, y, w, h);
            return;
        }
        throw new UnsupportedOperationException();
    }
}
