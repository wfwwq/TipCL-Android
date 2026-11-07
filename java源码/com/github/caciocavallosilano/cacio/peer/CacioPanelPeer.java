package com.github.caciocavallosilano.cacio.peer;

import java.awt.Panel;
import java.awt.peer.PanelPeer;
import javax.swing.JPanel;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioPanelPeer.class */
public class CacioPanelPeer extends CacioContainerPeer<Panel, JPanel> implements PanelPeer {
    public CacioPanelPeer(Panel awtC, PlatformWindowFactory pwf) {
        super(awtC, pwf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    /* renamed from: initSwingComponent, reason: merged with bridge method [inline-methods] */
    public JPanel mo7501initSwingComponent() {
        return new JPanel();
    }
}
