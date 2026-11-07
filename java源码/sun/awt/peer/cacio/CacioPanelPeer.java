package sun.awt.peer.cacio;

import java.awt.Panel;
import java.awt.peer.PanelPeer;
import javax.swing.JPanel;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioPanelPeer.class */
class CacioPanelPeer extends CacioContainerPeer<Panel, JPanel> implements PanelPeer {
    public CacioPanelPeer(Panel awtC, PlatformWindowFactory pwf) {
        super(awtC, pwf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // sun.awt.peer.cacio.CacioComponentPeer
    /* renamed from: initSwingComponent, reason: merged with bridge method [inline-methods] */
    public JPanel mo14613initSwingComponent() {
        return new JPanel();
    }
}
