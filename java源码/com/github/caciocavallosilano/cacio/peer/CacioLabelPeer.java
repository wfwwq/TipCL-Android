package com.github.caciocavallosilano.cacio.peer;

import java.awt.Label;
import java.awt.peer.LabelPeer;
import javax.swing.JLabel;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioLabelPeer.class */
public class CacioLabelPeer extends CacioComponentPeer<Label, JLabel> implements LabelPeer {
    public CacioLabelPeer(Label label, PlatformWindowFactory pwf) {
        super(label, pwf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    /* renamed from: initSwingComponent, reason: merged with bridge method [inline-methods] */
    public JLabel mo7501initSwingComponent() {
        Label label = getAWTComponent();
        JLabel swingLabel = new JLabel();
        swingLabel.setText(label.getText());
        swingLabel.setOpaque(true);
        return swingLabel;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    public void postInitSwingComponent() {
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

    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer, com.github.caciocavallosilano.cacio.peer.CacioComponent
    public boolean isFocusable() {
        return false;
    }
}
