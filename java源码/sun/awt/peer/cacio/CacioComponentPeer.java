package sun.awt.peer.cacio;

import java.awt.AWTEvent;
import java.awt.AWTException;
import java.awt.BufferCapabilities;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.PaintEvent;
import java.awt.image.ColorModel;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.awt.image.VolatileImage;
import java.awt.peer.ComponentPeer;
import java.awt.peer.ContainerPeer;
import javax.swing.JComponent;
import org.lwjgl.system.windows.User32;
import sun.awt.AWTAccessor;
import sun.awt.CausedFocusEvent;
import sun.awt.ConstrainableGraphics;
import sun.awt.PaintEventDispatcher;
import sun.awt.RepaintArea;
import sun.awt.SunToolkit;
import sun.awt.event.IgnorePaintEvent;
import sun.font.FontDesignMetrics;
import sun.java2d.pipe.Region;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioComponentPeer.class */
class CacioComponentPeer<AWTComponentType extends Component, SwingComponentType extends JComponent> implements ComponentPeer, CacioComponent {
    private AWTComponentType awtComponent;
    private SwingComponentType swingComponent;
    private ProxyWindow proxy;
    PlatformWindow platformWindow;
    private RepaintArea paintArea;
    private Rectangle viewRect;
    private boolean needsClearBackground = false;
    static final int SNFH_FAILURE = 0;
    static final int SNFH_SUCCESS_HANDLED = 1;
    static final int SNFH_SUCCESS_PROCEED = 2;

    CacioComponentPeer(AWTComponentType awtcomponenttype, PlatformWindowFactory platformWindowFactory) {
        this.awtComponent = awtcomponenttype;
        init(platformWindowFactory);
        this.swingComponent = (SwingComponentType) mo14613initSwingComponent();
        initProxy();
        postInitSwingComponent();
        setBounds(awtcomponenttype.getX(), awtcomponenttype.getY(), awtcomponenttype.getWidth(), awtcomponenttype.getHeight(), 2);
        this.paintArea = new RepaintArea() { // from class: sun.awt.peer.cacio.CacioComponentPeer.1
            protected void updateComponent(Component comp, Graphics g) {
                Graphics g2 = CacioComponentPeer.this.getGraphicsImpl();
                g2.setClip(g.getClip());
                CacioComponentPeer.this.peerPaint(g2, true);
                g2.dispose();
                super.updateComponent(comp, g);
            }

            protected void paintComponent(Component comp, Graphics g) {
                Graphics g2 = CacioComponentPeer.this.getGraphicsImpl();
                g2.setClip(g.getClip());
                CacioComponentPeer.this.peerPaint(g2, false);
                g2.dispose();
                super.paintComponent(comp, g);
            }
        };
    }

    void init(PlatformWindowFactory pwf) {
        PlatformWindow parent = null;
        Component parentComp = this.awtComponent.getParent();
        while (parentComp != null && parent == null) {
            if (parentComp.isLightweight()) {
                parentComp = parentComp.getParent();
            } else {
                CacioComponentPeer parentPeer = (CacioComponentPeer) GetPeer.getComponent(parentComp);
                parent = parentPeer.platformWindow;
            }
        }
        this.platformWindow = pwf.createPlatformWindow(this, parent);
    }

    private void initProxy() {
        if (this.swingComponent != null) {
            this.proxy = new ProxyWindow(this, this.swingComponent);
            this.proxy.setBounds(this.awtComponent.getX(), this.awtComponent.getY(), this.awtComponent.getWidth(), this.awtComponent.getHeight());
            this.proxy.setVisible(this.awtComponent.isVisible());
        }
    }

    void postInitSwingComponent() {
        this.swingComponent.setOpaque(true);
        Color bg = this.awtComponent.getBackground();
        if (bg != null) {
            setBackground(bg);
        }
        Color fg = this.awtComponent.getForeground();
        if (fg != null) {
            setForeground(fg);
        }
        Font font = this.awtComponent.getFont();
        if (font != null) {
            setFont(font);
        }
        boolean enabled = AWTAccessor.getComponentAccessor().isEnabled(this.awtComponent);
        setEnabled(enabled);
    }

    /* renamed from: initSwingComponent */
    SwingComponentType mo14613initSwingComponent() {
        return (SwingComponentType) new JComponent() { // from class: sun.awt.peer.cacio.CacioComponentPeer.2
        };
    }

    public void dispose() {
        this.platformWindow.dispose();
        if (this.proxy != null) {
            this.proxy.dispose();
        }
        CacioToolkit.disposePeer(this.awtComponent, this);
    }

    public ColorModel getColorModel() {
        return this.platformWindow.getColorModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Graphics2D getGraphicsImpl() {
        Color bg = getBackground();
        Color fg = getForeground();
        Font font = getFont();
        Graphics2D g = this.platformWindow.getGraphics(fg, bg, font);
        if (this.viewRect != null) {
            g.clipRect(this.viewRect.x, this.viewRect.y, this.viewRect.width, this.viewRect.height);
            g.translate(this.viewRect.x, this.viewRect.y);
        }
        return g;
    }

    public Graphics getGraphics() {
        ConstrainableGraphics graphicsImpl = getGraphicsImpl();
        if (hasInsets()) {
            Insets i = getInsets();
            Component c = getAWTComponent();
            int w = c.getWidth();
            int h = c.getHeight();
            graphicsImpl.constrain(i.left, i.top, (w - i.left) - i.right, (h - i.top) - i.bottom);
            graphicsImpl.translate(-i.left, -i.top);
        }
        return graphicsImpl;
    }

    boolean hasInsets() {
        return false;
    }

    public GraphicsConfiguration getGraphicsConfiguration() {
        return this.platformWindow.getGraphicsConfiguration();
    }

    public FontMetrics getFontMetrics(Font font) {
        return FontDesignMetrics.getMetrics(font);
    }

    public Point getLocationOnScreen() {
        return this.platformWindow.getLocationOnScreen();
    }

    public Dimension getMinimumSize() {
        Dimension min;
        if (this.swingComponent != null) {
            min = this.swingComponent.getMinimumSize();
        } else {
            min = new Dimension(0, 0);
        }
        return min;
    }

    public Dimension getPreferredSize() {
        Dimension pref;
        if (this.swingComponent != null) {
            pref = this.swingComponent.getPreferredSize();
        } else {
            pref = new Dimension(0, 0);
        }
        return pref;
    }

    public Toolkit getToolkit() {
        return Toolkit.getDefaultToolkit();
    }

    public void handleEvent(AWTEvent e) {
        switch (e.getID()) {
            case 400:
            case 401:
            case 402:
                handleKeyEvent((KeyEvent) e);
                break;
            case 500:
            case 501:
            case 502:
            case 504:
            case 505:
                handleMouseEvent((MouseEvent) e);
                break;
            case 503:
            case 506:
                handleMouseMotionEvent((MouseEvent) e);
                break;
            case User32.WM_DWMCOLORIZATIONCOLORCHANGED /* 800 */:
            case User32.WM_DWMWINDOWMAXIMIZEDCHANGE /* 801 */:
                if (!isLayouting()) {
                    boolean tmp = this.needsClearBackground;
                    this.needsClearBackground = false;
                    this.paintArea.paint(getAWTComponent(), tmp);
                    break;
                }
                break;
            case 1004:
            case 1005:
                handleFocusEvent((FocusEvent) e);
                break;
        }
    }

    protected void handleMouseEvent(MouseEvent e) {
        if (this.proxy != null) {
            this.proxy.handleMouseEvent(e);
        }
    }

    protected void handleMouseMotionEvent(MouseEvent e) {
        if (this.proxy != null) {
            this.proxy.handleMouseMotionEvent(e);
        }
    }

    protected void handleKeyEvent(KeyEvent e) {
        if (this.proxy != null) {
            this.proxy.handleKeyEvent(e);
        }
    }

    protected void handleFocusEvent(FocusEvent e) {
        if (this.proxy != null) {
            this.proxy.handleFocusEvent(e);
        }
    }

    protected void peerPaint(Graphics g, boolean update) {
        Graphics peerG = g.create();
        try {
            if (this.swingComponent != null) {
                JComponent c = this.swingComponent;
                c.paint(peerG);
            }
        } finally {
            peerG.dispose();
        }
    }

    protected void peerRepaint(int x, int y, int width, int height) {
        if (EventQueue.isDispatchThread()) {
            Graphics g = this.awtComponent.getGraphics();
            try {
                g.clipRect(x, y, width, height);
                peerPaint(g, false);
                g.dispose();
                return;
            } catch (Throwable th) {
                g.dispose();
                throw th;
            }
        }
        PaintEvent event = PaintEventDispatcher.getPaintEventDispatcher().createPaintEvent(this.awtComponent, 0, 0, this.awtComponent.getWidth(), this.awtComponent.getHeight());
        this.awtComponent.getToolkit().getSystemEventQueue().postEvent(event);
    }

    public boolean handlesWheelScrolling() {
        return false;
    }

    @Override // sun.awt.peer.cacio.CacioComponent
    public boolean isFocusable() {
        boolean ret;
        if (this.swingComponent != null) {
            ret = this.swingComponent.isFocusable();
        } else {
            ret = false;
        }
        return ret;
    }

    public boolean isReparentSupported() {
        return this.platformWindow.isReparentSuppored();
    }

    public void reparent(ContainerPeer newContainer) {
        this.platformWindow.reparent(newContainer);
    }

    public void layout() {
    }

    public void paint(Graphics g) {
        peerPaint(g, true);
    }

    public void print(Graphics g) {
        peerPaint(g, true);
    }

    public boolean requestFocus(Component lightweightChild, boolean temporary, boolean focusedWindowChangeAllowed, long time, CausedFocusEvent.Cause cause) {
        if (KFMHelper.processSynchronousLightweightTransfer(getAWTComponent(), lightweightChild, temporary, focusedWindowChangeAllowed, time)) {
            return true;
        }
        int result = KFMHelper.shouldNativelyFocusHeavyweight(getAWTComponent(), lightweightChild, temporary, focusedWindowChangeAllowed, time, cause);
        switch (result) {
            case 0:
                return false;
            case 1:
                return true;
            case 2:
                PlatformWindow pw = getPlatformWindow();
                pw.requestFocus();
                return CacioKeyboardFocusManagerPeer.getInstance().requestFocus(getAWTComponent(), lightweightChild, temporary, focusedWindowChangeAllowed, time, cause);
            default:
                return false;
        }
    }

    public void setBackground(Color c) {
        this.swingComponent.setBackground(c);
    }

    Color getBackground() {
        return this.swingComponent.getBackground();
    }

    public void setFont(Font f) {
        this.swingComponent.setFont(f);
    }

    Font getFont() {
        return this.swingComponent.getFont();
    }

    public void setForeground(Color c) {
        this.swingComponent.setForeground(c);
    }

    Color getForeground() {
        return this.swingComponent.getForeground();
    }

    private void setBoundsImpl(int x, int y, int width, int height, int op) {
        this.platformWindow.setBounds(x, y, width, height, op);
    }

    void setViewport(int vx, int vy, int vw, int vh) {
        setBoundsImpl(vx, vy, vw, vh, 3);
        this.viewRect = new Rectangle(vx, vy, vw, vh);
    }

    public void setBounds(int x, int y, int width, int height, int op) {
        setBoundsImpl(x, y, width, height, op);
        if (this.proxy != null) {
            this.proxy.setBounds(this.awtComponent.getX(), this.awtComponent.getY(), this.awtComponent.getWidth(), this.awtComponent.getHeight());
        }
        if (this.swingComponent != null) {
            this.swingComponent.setBounds(0, 0, width, height);
            this.swingComponent.validate();
        }
    }

    public void setEnabled(boolean enable) {
        setEnabledImpl(enable);
    }

    void setEnabledImpl(boolean enable) {
        if (this.swingComponent != null) {
            this.swingComponent.setEnabled(enable);
        }
    }

    boolean isEnabled() {
        return this.swingComponent.isEnabled();
    }

    boolean isParentsEnabled() {
        Container parent;
        Component c = getAWTComponent();
        boolean parentsEnabled = c.isEnabled();
        if (parentsEnabled && (parent = c.getParent()) != null) {
            ComponentPeer peer = GetPeer.getComponent(parent);
            if (peer instanceof CacioComponentPeer) {
                parentsEnabled = ((CacioComponentPeer) peer).isParentsEnabled();
            }
        }
        return parentsEnabled;
    }

    public void setVisible(boolean b) {
        this.needsClearBackground = b;
        if (this.proxy != null) {
            this.proxy.setVisible(b);
        }
        this.platformWindow.setVisible(b);
    }

    public void updateCursorImmediately() {
    }

    public int checkImage(Image img, int w, int h, ImageObserver o) {
        return Toolkit.getDefaultToolkit().checkImage(img, w, h, o);
    }

    public boolean prepareImage(Image img, int w, int h, ImageObserver o) {
        return Toolkit.getDefaultToolkit().prepareImage(img, w, h, o);
    }

    public Image createImage(ImageProducer producer) {
        return Toolkit.getDefaultToolkit().createImage(producer);
    }

    public Image createImage(int width, int height) {
        return Toolkit.getDefaultToolkit().createOffScreenImage(this.awtComponent, width, height);
    }

    public VolatileImage createVolatileImage(int width, int height) {
        GraphicsConfiguration gc = getGraphicsConfiguration();
        return gc.createCompatibleVolatileImage(width, height);
    }

    public void createBuffers(int numBuffers, BufferCapabilities caps) throws AWTException {
        this.platformWindow.createBuffers(numBuffers, caps);
    }

    public void destroyBuffers() {
        this.platformWindow.destroyBuffers();
    }

    public void flip(int x1, int y1, int x2, int y2, BufferCapabilities.FlipContents flipAction) {
        this.platformWindow.flip(x1, y1, x2, y2, flipAction);
    }

    public Image getBackBuffer() {
        return this.platformWindow.getBackBuffer();
    }

    public void coalescePaintEvent(PaintEvent e) {
        if (!(e instanceof IgnorePaintEvent)) {
            this.paintArea.add(e.getUpdateRect(), e.getID());
        }
    }

    public void applyShape(Region shape) {
        this.platformWindow.applyShape(shape);
    }

    public boolean canDetermineObscurity() {
        return this.platformWindow.canDetermineObscurity();
    }

    public boolean isObscured() {
        return this.platformWindow.isObscured();
    }

    @Override // sun.awt.peer.cacio.CacioComponent
    public PlatformWindow getPlatformWindow() {
        return this.platformWindow;
    }

    @Override // sun.awt.peer.cacio.CacioComponent
    public AWTComponentType getAWTComponent() {
        return this.awtComponent;
    }

    @Override // sun.awt.peer.cacio.CacioComponent
    public void handlePeerEvent(AWTEvent event) {
        postEvent(event);
    }

    private void postEvent(AWTEvent event) {
        SunToolkit.postEvent(SunToolkit.targetToAppContext(event.getSource()), event);
    }

    public Insets getInsets() {
        return (Insets) this.platformWindow.getInsets().clone();
    }

    SwingComponentType getSwingComponent() {
        return this.swingComponent;
    }

    ProxyWindow getProxyWindow() {
        return this.proxy;
    }

    public void setZOrder(ComponentPeer above) {
        System.err.println("CacioComponentPeer::setZOrder: NOT YET IMPLEMENTED");
    }

    public boolean updateGraphicsData(GraphicsConfiguration gc) {
        System.err.println("CacioComponentPeer::updateGraphicsData: NOT YET IMPLEMENTED");
        return false;
    }

    RepaintArea getPaintArea() {
        return this.paintArea;
    }

    boolean isLayouting() {
        return false;
    }

    public void clearBackground() {
        this.needsClearBackground = true;
    }
}
