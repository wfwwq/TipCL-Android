package sun.awt.peer.cacio;

import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioSwingComponent.class */
interface CacioSwingComponent {
    JComponent getJComponent();

    void handleMouseEvent(MouseEvent mouseEvent);

    void handleMouseMotionEvent(MouseEvent mouseEvent);

    void handleKeyEvent(KeyEvent keyEvent);

    void handleFocusEvent(FocusEvent focusEvent);
}
