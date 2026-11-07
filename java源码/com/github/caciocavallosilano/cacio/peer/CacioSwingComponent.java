package com.github.caciocavallosilano.cacio.peer;

import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioSwingComponent.class */
interface CacioSwingComponent {
    JComponent getJComponent();

    void handleMouseEvent(MouseEvent mouseEvent);

    void handleMouseMotionEvent(MouseEvent mouseEvent);

    void handleKeyEvent(KeyEvent keyEvent);

    void handleFocusEvent(FocusEvent focusEvent);
}
