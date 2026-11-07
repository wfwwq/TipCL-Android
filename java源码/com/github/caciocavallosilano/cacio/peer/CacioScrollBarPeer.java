package com.github.caciocavallosilano.cacio.peer;

import java.awt.Scrollbar;
import java.awt.peer.ScrollbarPeer;
import javax.swing.JScrollBar;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioScrollBarPeer.class */
class CacioScrollBarPeer extends CacioComponentPeer<Scrollbar, JScrollBar> implements ScrollbarPeer {
    static final /* synthetic */ boolean $assertionsDisabled;

    static {
        $assertionsDisabled = !CacioScrollBarPeer.class.desiredAssertionStatus();
    }

    CacioScrollBarPeer(Scrollbar sb, PlatformWindowFactory pwf) {
        super(sb, pwf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    /* renamed from: initSwingComponent, reason: merged with bridge method [inline-methods] */
    public JScrollBar mo7501initSwingComponent() {
        int swingOrientation;
        Scrollbar sb = getAWTComponent();
        int orientation = sb.getOrientation();
        if (orientation == 0) {
            swingOrientation = 0;
        } else {
            if (!$assertionsDisabled && orientation != 1) {
                throw new AssertionError();
            }
            swingOrientation = 1;
        }
        return new JScrollBar(swingOrientation);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    public void postInitSwingComponent() {
        super.postInitSwingComponent();
        Scrollbar sb = getAWTComponent();
        setValues(sb.getValue(), sb.getVisibleAmount(), sb.getMinimum(), sb.getMaximum());
        setLineIncrement(sb.getUnitIncrement());
        setPageIncrement(sb.getBlockIncrement());
    }

    public void setValues(int value, int visible, int minimum, int maximum) {
        getSwingComponent().setValues(value, visible, minimum, maximum);
    }

    public void setLineIncrement(int l) {
        getSwingComponent().setUnitIncrement(l);
    }

    public void setPageIncrement(int l) {
        getSwingComponent().setBlockIncrement(l);
    }
}
