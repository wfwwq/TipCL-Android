package sun.awt.peer.cacio;

import java.awt.Label;
import java.awt.peer.LabelPeer;
import javax.swing.JLabel;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioLabelPeer.class */
class CacioLabelPeer extends CacioComponentPeer<Label, JLabel> implements LabelPeer {
    public CacioLabelPeer(Label label, PlatformWindowFactory pwf) {
        super(label, pwf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // sun.awt.peer.cacio.CacioComponentPeer
    /* renamed from: initSwingComponent, reason: merged with bridge method [inline-methods] */
    public JLabel mo14613initSwingComponent() {
        Label label = getAWTComponent();
        JLabel swingLabel = new JLabel();
        swingLabel.setText(label.getText());
        swingLabel.setOpaque(true);
        return swingLabel;
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    void postInitSwingComponent() {
        super.postInitSwingComponent();
        setAlignment(getAWTComponent().getAlignment());
    }

    public void setText(String text) {
        getSwingComponent().setText(text);
    }

    public void setAlignment(int alignment) {
        JLabel swingLabel = getSwingComponent();
        switch (alignment) {
            case 0:
            default:
                swingLabel.setHorizontalAlignment(2);
                break;
            case 1:
                swingLabel.setHorizontalAlignment(0);
                break;
            case 2:
                swingLabel.setHorizontalAlignment(4);
                break;
        }
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer, sun.awt.peer.cacio.CacioComponent
    public boolean isFocusable() {
        return false;
    }
}
