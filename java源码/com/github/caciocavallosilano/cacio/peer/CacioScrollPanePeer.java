package com.github.caciocavallosilano.cacio.peer;

import androidx.lifecycle.viewmodel.R;
import java.awt.Adjustable;
import java.awt.Dimension;
import java.awt.ScrollPane;
import java.awt.peer.ScrollPanePeer;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioScrollPanePeer.class */
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
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Null bind block in PHI insn: 0x0000: PHI (r0v0 ?? I:androidx.compose.ui.text.R) =  binds: [] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.dex.instructions.PhiInsn.bindArg(PhiInsn.java:47)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:156)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    /* renamed from: initSwingComponent, reason: merged with bridge method [inline-methods] */
    public javax.swing.JPanel mo7501initSwingComponent() {
        /*
            r5 = this;
            javax.swing.JPanel r0 = new javax.swing.JPanel
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r5
            javax.swing.JScrollBar r1 = new javax.swing.JScrollBar
            r2 = r1
            r3 = 1
            r2.<init>()
            r0.verticalSB = r1
            r0 = r5
            javax.swing.JScrollBar r1 = new javax.swing.JScrollBar
            r2 = r1
            r3 = 0
            r2.<init>()
            r0.horizontalSB = r1
            r0 = r6
            r1 = r5
            javax.swing.JScrollBar r1 = r1.verticalSB
            void r0 = r0.<init>()
            r0 = r6
            r1 = r5
            javax.swing.JScrollBar r1 = r1.horizontalSB
            void r0 = r0.<init>()
            r0 = r6
            r1 = 0
            r0.<init>()
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.CacioScrollPanePeer.mo7501initSwingComponent():javax.swing.JPanel");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v2 ??, still in use, count: 1, list:
          (r0v2 ?? I:int) from 0x0007: RETURN (r0v2 ?? I:int)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public int getHScrollbarHeight() {
        /*
            r2 = this;
            r0 = r2
            javax.swing.JScrollBar r0 = r0.horizontalSB
            void r0 = r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.CacioScrollPanePeer.getHScrollbarHeight():int");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v2 ??, still in use, count: 1, list:
          (r0v2 ?? I:int) from 0x0007: RETURN (r0v2 ?? I:int)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public int getVScrollbarWidth() {
        /*
            r2 = this;
            r0 = r2
            javax.swing.JScrollBar r0 = r0.verticalSB
            void r0 = r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.CacioScrollPanePeer.getVScrollbarWidth():int");
    }

    public void setScrollPosition(int x, int y) {
        new R();
        new R();
    }

    public void childResized(int w, int h) {
        this.childWidth = w;
        this.childHeight = h;
        this.verticalSB.<clinit>();
        new androidx.navigation.compose.R();
        this.horizontalSB.<clinit>();
        new androidx.navigation.compose.R();
    }

    public void setUnitIncrement(Adjustable arg0, int arg1) {
        throw new UnsupportedOperationException();
    }

    public void setValue(Adjustable arg0, int arg1) {
        throw new UnsupportedOperationException();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 ??, still in use, count: 1, list:
          (r1v1 ?? I:int) from 0x0005: IPUT 
          (r1v1 ?? I:int)
          (r6v0 'this' ?? I:com.github.caciocavallosilano.cacio.peer.CacioScrollPanePeer A[D('this' com.github.caciocavallosilano.cacio.peer.CacioScrollPanePeer), IMMUTABLE_TYPE, THIS])
         (LINE:104) com.github.caciocavallosilano.cacio.peer.CacioScrollPanePeer.viewWidth int
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:78)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    public void layout() {
        /*
            r6 = this;
            r0 = r6
            r1 = r6
            void r1 = r1.<init>()
            r0.viewWidth = r1
            r0 = r6
            r1 = r6
            int r1 = r1.layoutHorizontalScrollbar()
            r0.viewHeight = r1
            r0 = r6
            java.awt.Component r0 = r0.getAWTComponent()
            java.awt.ScrollPane r0 = (java.awt.ScrollPane) r0
            r7 = r0
            r0 = r7
            int r0 = r0.getComponentCount()
            if (r0 <= 0) goto L51
            r0 = r7
            r1 = 0
            java.awt.Component r0 = r0.getComponent(r1)
            r8 = r0
            sun.awt.AWTAccessor$ComponentAccessor r0 = sun.awt.AWTAccessor.getComponentAccessor()
            r1 = r8
            java.awt.peer.ComponentPeer r0 = r0.getPeer(r1)
            r9 = r0
            r0 = r9
            boolean r0 = r0 instanceof com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
            if (r0 == 0) goto L51
            r0 = r9
            com.github.caciocavallosilano.cacio.peer.CacioComponentPeer r0 = (com.github.caciocavallosilano.cacio.peer.CacioComponentPeer) r0
            r10 = r0
            r0 = r10
            r1 = r6
            int r1 = r1.viewX
            r2 = r6
            int r2 = r2.viewY
            r3 = r6
            int r3 = r3.viewWidth
            r4 = r6
            int r4 = r4.viewHeight
            r0.setViewport(r1, r2, r3, r4)
        L51:
            r0 = r6
            javax.swing.JComponent r0 = r0.getSwingComponent()
            javax.swing.JPanel r0 = (javax.swing.JPanel) r0
            r0.validate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.CacioScrollPanePeer.layout():void");
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
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

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v5 ??, still in use, count: 1, list:
          (r2v5 ?? I:int) from 0x0038: ARITH (r1v7 ?? I:int) = (r1v6 ?? I:int) - (r2v5 ?? I:int)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    private int layoutHorizontalScrollbar() {
        /*
            r6 = this;
            r0 = r6
            boolean r0 = r0.needHorizontalScrollbar()
            if (r0 == 0) goto L87
            r0 = r6
            javax.swing.JScrollBar r0 = r0.horizontalSB
            r1 = 1
            r0.setVisible(r1)
            r0 = r6
            javax.swing.JScrollBar r0 = r0.horizontalSB
            java.awt.Dimension r0 = r0.getPreferredSize()
            r8 = r0
            r0 = r6
            java.awt.Component r0 = r0.getAWTComponent()
            java.awt.ScrollPane r0 = (java.awt.ScrollPane) r0
            java.awt.Dimension r0 = r0.getSize()
            r9 = r0
            r0 = r6
            javax.swing.JScrollBar r0 = r0.verticalSB
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L61
            r0 = r9
            r1 = r0
            int r1 = r1.width
            r2 = r6
            javax.swing.JScrollBar r2 = r2.verticalSB
            void r2 = r2.<init>()
            int r1 = r1 - r2
            r0.width = r1
            r0 = r6
            javax.swing.JScrollBar r0 = r0.verticalSB
            void r0 = r0.<init>()
            r1 = r8
            int r1 = r1.height
            int r0 = r0 - r1
            r10 = r0
            r0 = r6
            javax.swing.JScrollBar r0 = r0.verticalSB
            java.awt.Dimension r1 = new java.awt.Dimension
            r2 = r1
            r3 = r6
            javax.swing.JScrollBar r3 = r3.verticalSB
            void r3 = r3.<init>()
            r4 = r10
            r2.<init>(r3, r4)
            r0.setSize(r1)
        L61:
            r0 = r6
            javax.swing.JScrollBar r0 = r0.horizontalSB
            r1 = 0
            r2 = r9
            int r2 = r2.height
            r3 = r8
            int r3 = r3.height
            int r2 = r2 - r3
            r3 = r9
            int r3 = r3.width
            r4 = r8
            int r4 = r4.height
            r0.setBounds(r1, r2, r3, r4)
            r0 = r9
            int r0 = r0.height
            r1 = r8
            int r1 = r1.height
            int r0 = r0 - r1
            r7 = r0
            goto L9a
        L87:
            r0 = r6
            javax.swing.JScrollBar r0 = r0.verticalSB
            r1 = 0
            r0.setVisible(r1)
            r0 = r6
            java.awt.Component r0 = r0.getAWTComponent()
            java.awt.ScrollPane r0 = (java.awt.ScrollPane) r0
            int r0 = r0.getHeight()
            r7 = r0
        L9a:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.CacioScrollPanePeer.layoutHorizontalScrollbar():int");
    }

    private boolean needHorizontalScrollbar() {
        int policy = ((ScrollPane) getAWTComponent()).getScrollbarDisplayPolicy();
        return policy == 1 || (policy != 2 && this.childWidth > ((ScrollPane) getAWTComponent()).getWidth());
    }
}
