package org.lwjgl.opengl;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GraphicsDevice;
import java.awt.Point;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import org.lwjgl.LWJGLException;
import org.lwjgl.PointerBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-lwjglx.jar:org/lwjgl/opengl/AWTGLCanvas.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-lwjglx.jar:org/lwjgl/opengl/AWTGLCanvas.class */
public class AWTGLCanvas extends Canvas implements Drawable, ComponentListener, HierarchyListener {
    private static final long serialVersionUID = 1;
    private ContextGL mContextGL;
    private PixelFormatLWJGL mPixelFormat;
    private ContextAttribs mCtxAttrs;

    public void setPixelFormat(PixelFormatLWJGL pf) throws LWJGLException {
        this.mPixelFormat = pf;
    }

    public void setPixelFormat(PixelFormatLWJGL pf, ContextAttribs attribs) throws LWJGLException {
        this.mPixelFormat = pf;
        this.mCtxAttrs = attribs;
    }

    public PixelFormatLWJGL getPixelFormat() {
        return this.mPixelFormat;
    }

    public ContextGL getContext() {
        return this.mContextGL;
    }

    public ContextGL createSharedContext() throws LWJGLException {
        this.mContextGL = new ContextGL(getContext().getPeerInfo(), this.mCtxAttrs, null);
        return this.mContextGL;
    }

    public void checkGLError() {
    }

    public void initContext(float r, float g, float b) {
        Display.setInitialBackground(r, g, b);
    }

    public AWTGLCanvas() throws LWJGLException {
        System.out.println("AWTGLCanvas constructor called on thread:" + Thread.currentThread().getName());
    }

    public AWTGLCanvas(PixelFormat pixel_format) throws LWJGLException {
        Display.create(pixel_format);
    }

    public AWTGLCanvas(GraphicsDevice device, PixelFormat pixel_format) throws LWJGLException {
        this(pixel_format);
    }

    public AWTGLCanvas(GraphicsDevice device, PixelFormat pixel_format, Drawable drawable) throws LWJGLException {
        this(pixel_format);
    }

    public AWTGLCanvas(GraphicsDevice device, PixelFormat pixel_format, Drawable drawable, ContextAttribs attribs) throws LWJGLException {
        this(pixel_format);
    }

    public void addNotify() {
    }

    public void removeNotify() {
    }

    public void setSwapInterval(int swap_interval) {
        ContextGL contextGL = this.mContextGL;
        ContextGL.setSwapInterval(swap_interval);
    }

    public void setVSyncEnabled(boolean enabled) {
        ContextGL contextGL = this.mContextGL;
        ContextGL.setSwapInterval(enabled ? 1 : 0);
    }

    public void swapBuffers() throws LWJGLException {
        ContextGL contextGL = this.mContextGL;
        ContextGL.swapBuffers();
    }

    @Override // org.lwjgl.opengl.Drawable
    public boolean isCurrent() throws LWJGLException {
        return this.mContextGL.isCurrent();
    }

    @Override // org.lwjgl.opengl.Drawable
    public void makeCurrent() throws LWJGLException {
        this.mContextGL.makeCurrent();
    }

    @Override // org.lwjgl.opengl.Drawable
    public void releaseContext() throws LWJGLException {
        this.mContextGL.releaseCurrent();
    }

    @Override // org.lwjgl.opengl.Drawable
    public final void destroy() {
        try {
            this.mContextGL.destroy();
        } catch (LWJGLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // org.lwjgl.opengl.Drawable
    public final void setCLSharingProperties(PointerBuffer properties) throws InterruptedException, LWJGLException {
        this.mContextGL.setCLSharingProperties(properties);
    }

    protected void initGL() {
    }

    protected void paintGL() {
    }

    public final void paint(Graphics g) {
    }

    protected void exceptionOccurred(LWJGLException exception) {
    }

    public void update(Graphics g) {
    }

    public void componentShown(ComponentEvent e) {
    }

    public void componentHidden(ComponentEvent e) {
    }

    public void componentResized(ComponentEvent e) {
    }

    public void componentMoved(ComponentEvent e) {
    }

    public void setLocation(int x, int y) {
        super.setLocation(x, y);
    }

    public void setLocation(Point p) {
        super.setLocation(p);
    }

    public void setSize(Dimension d) {
        super.setSize(d);
    }

    public void setSize(int width, int height) {
        super.setSize(width, height);
    }

    public void setBounds(int x, int y, int width, int height) {
        super.setBounds(x, y, width, height);
    }

    public void hierarchyChanged(HierarchyEvent e) {
    }
}
