package sun.awt.peer.cacio;

import java.awt.Adjustable;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.ScrollPane;
import java.awt.peer.ComponentPeer;
import java.awt.peer.ScrollPanePeer;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioScrollPanePeer.class */
class CacioScrollPanePeer extends CacioContainerPeer<ScrollPane, JPanel> implements ScrollPanePeer {
    private JScrollBar verticalSB;
    private JScrollBar horizontalSB;
    private int childWidth;
    private int childHeight;
    private int viewX;
    private int viewY;
    private int viewWidth;
    private int viewHeight;

    CacioScrollPanePeer(ScrollPane awtC, PlatformWindowFactory pwf) {
        super(awtC, pwf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // sun.awt.peer.cacio.CacioComponentPeer
    /* renamed from: initSwingComponent, reason: merged with bridge method [inline-methods] */
    public JPanel mo14613initSwingComponent() {
        JPanel jsp = new JPanel();
        this.verticalSB = new JScrollBar(1);
        this.horizontalSB = new JScrollBar(0);
        jsp.add(this.verticalSB);
        jsp.add(this.horizontalSB);
        jsp.setLayout((LayoutManager) null);
        return jsp;
    }

    public int getHScrollbarHeight() {
        return this.horizontalSB.getHeight();
    }

    public int getVScrollbarWidth() {
        return this.verticalSB.getWidth();
    }

    public void setScrollPosition(int x, int y) {
        this.verticalSB.setValue(y);
        this.horizontalSB.setValue(x);
    }

    public void childResized(int w, int h) {
        this.childWidth = w;
        this.childHeight = h;
        this.verticalSB.setMinimum(0);
        this.verticalSB.setMaximum(w);
        this.horizontalSB.setMinimum(0);
        this.horizontalSB.setMaximum(h);
    }

    public void setUnitIncrement(Adjustable arg0, int arg1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setValue(Adjustable arg0, int arg1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public void layout() {
        this.viewWidth = layoutVerticalScrollbar();
        this.viewHeight = layoutHorizontalScrollbar();
        ScrollPane sp = (ScrollPane) getAWTComponent();
        if (sp.getComponentCount() > 0) {
            Component view = sp.getComponent(0);
            ComponentPeer peer = GetPeer.getComponent(view);
            if (peer instanceof CacioComponentPeer) {
                CacioComponentPeer ccp = (CacioComponentPeer) peer;
                ccp.setViewport(this.viewX, this.viewY, this.viewWidth, this.viewHeight);
            }
        }
        ((JPanel) getSwingComponent()).validate();
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public Dimension getPreferredSize() {
        Dimension preferredSize;
        JPanel component = (JPanel) getSwingComponent();
        if (component != null) {
            preferredSize = ((JPanel) getSwingComponent()).getSize();
        } else {
            preferredSize = super.getPreferredSize();
        }
        return preferredSize;
    }

    private int layoutVerticalScrollbar() {
        int vw;
        if (needVerticalScrollbar()) {
            this.verticalSB.setVisible(true);
            Dimension vsbSize = this.verticalSB.getPreferredSize();
            Dimension spSize = ((ScrollPane) getAWTComponent()).getSize();
            this.verticalSB.setBounds(spSize.width - vsbSize.width, 0, vsbSize.width, spSize.height);
            vw = spSize.width - vsbSize.width;
        } else {
            this.verticalSB.setVisible(false);
            vw = ((ScrollPane) getAWTComponent()).getWidth();
        }
        return vw;
    }

    private boolean needVerticalScrollbar() {
        int policy = ((ScrollPane) getAWTComponent()).getScrollbarDisplayPolicy();
        return policy == 1 || (policy != 2 && this.childHeight > ((ScrollPane) getAWTComponent()).getHeight());
    }

    private int layoutHorizontalScrollbar() {
        int vh;
        if (needHorizontalScrollbar()) {
            this.horizontalSB.setVisible(true);
            Dimension hsbSize = this.horizontalSB.getPreferredSize();
            Dimension spSize = ((ScrollPane) getAWTComponent()).getSize();
            if (this.verticalSB.isVisible()) {
                spSize.width -= this.verticalSB.getWidth();
                int vsbH = this.verticalSB.getHeight() - hsbSize.height;
                this.verticalSB.setSize(new Dimension(this.verticalSB.getWidth(), vsbH));
            }
            this.horizontalSB.setBounds(0, spSize.height - hsbSize.height, spSize.width, hsbSize.height);
            vh = spSize.height - hsbSize.height;
        } else {
            this.verticalSB.setVisible(false);
            vh = ((ScrollPane) getAWTComponent()).getHeight();
        }
        return vh;
    }

    private boolean needHorizontalScrollbar() {
        int policy = ((ScrollPane) getAWTComponent()).getScrollbarDisplayPolicy();
        return policy == 1 || (policy != 2 && this.childWidth > ((ScrollPane) getAWTComponent()).getWidth());
    }
}
