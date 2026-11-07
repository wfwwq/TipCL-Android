package sun.awt.peer.cacio;

import java.awt.Button;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.peer.ButtonPeer;
import javax.swing.JButton;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioButtonPeer.class */
class CacioButtonPeer extends CacioComponentPeer<Button, JButton> implements ButtonPeer {

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioButtonPeer$SwingButtonListener.class */
    class SwingButtonListener implements ActionListener {
        SwingButtonListener() {
        }

        public void actionPerformed(ActionEvent event) {
            Button b = CacioButtonPeer.this.getAWTComponent();
            b.getActionListeners();
            CacioButtonPeer.this.handlePeerEvent(new ActionEvent(b, 1001, b.getActionCommand()));
        }
    }

    public CacioButtonPeer(Button theButton, PlatformWindowFactory pwf) {
        super(theButton, pwf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // sun.awt.peer.cacio.CacioComponentPeer
    /* renamed from: initSwingComponent, reason: merged with bridge method [inline-methods] */
    public JButton mo14613initSwingComponent() {
        JButton jbutton = new JButton();
        Button theButton = getAWTComponent();
        jbutton.setText(theButton.getLabel());
        jbutton.addActionListener(new SwingButtonListener());
        jbutton.setMargin(new Insets(0, 0, 0, 0));
        return jbutton;
    }

    public void setLabel(String label) {
        getSwingComponent().setText(label);
    }
}
