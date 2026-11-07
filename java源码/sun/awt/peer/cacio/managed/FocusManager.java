package sun.awt.peer.cacio.managed;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.awt.peer.cacio.CacioComponent;
import sun.security.action.GetPropertyAction;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/managed/FocusManager.class */
public class FocusManager {
    private static Logger logger = Logger.getLogger(FocusManager.class.getName());
    private static FocusManager instance;
    private static final Class focusManagerCls;
    private Stack<ManagedWindow> focusedWindowStack = new Stack<>();

    static {
        String focusMgrClsName = (String) AccessController.doPrivileged((PrivilegedAction) new GetPropertyAction("cacio.focusmgr"));
        Class cls = FocusManager.class;
        if (focusMgrClsName != null) {
            try {
                cls = Class.forName(focusMgrClsName);
            } catch (ClassNotFoundException e) {
                logger.log(Level.SEVERE, "Unable to load FocusManager implementation", (Throwable) e);
            }
        }
        focusManagerCls = cls;
    }

    static FocusManager getInstance() {
        if (instance == null) {
            try {
                instance = (FocusManager) focusManagerCls.newInstance();
            } catch (ReflectiveOperationException e) {
                logger.log(Level.SEVERE, "Unable to create FocusManager instance", (Throwable) e);
            }
        }
        return instance.getContextInstance();
    }

    protected FocusManager getContextInstance() {
        return instance;
    }

    ManagedWindow getFocusedWindow() {
        if (this.focusedWindowStack.isEmpty()) {
            return null;
        }
        return this.focusedWindowStack.lastElement();
    }

    void setVisible(ManagedWindow w, boolean v) {
        if (v) {
            setFocusedWindow(w);
        } else {
            hideWindow(w);
        }
    }

    private void hideWindow(ManagedWindow w) {
        if (getFocusedWindow() == w) {
            if (this.focusedWindowStack.size() > 1) {
                ManagedWindow previous = this.focusedWindowStack.get(this.focusedWindowStack.size() - 2);
                setFocusedWindow(previous);
            } else {
                setFocusedWindow(null);
            }
        }
        this.focusedWindowStack.remove(w);
    }

    void mousePressed(ManagedWindow w) {
        if (w != getFocusedWindow()) {
            setFocusedWindow(w);
        }
    }

    void setFocusedWindow(ManagedWindow w) {
        if (w != null) {
            if (w.getCacioComponent() == null || w.getCacioComponent().isFocusable()) {
                ManagedWindow old = getFocusedWindow();
                setFocusedWindowNoEvent(w);
                focusLost(old, w);
                focusGained(w, old);
            }
        }
    }

    void setFocusedWindowNoEvent(ManagedWindow w) {
        if (w == null) {
            this.focusedWindowStack.pop();
        } else {
            this.focusedWindowStack.removeElement(w);
            this.focusedWindowStack.push(w);
        }
    }

    private void focusLost(ManagedWindow w, ManagedWindow lostTo) {
        if (w != null) {
            CacioComponent cacioComp = w.getCacioComponent();
            Component c = cacioComp.getAWTComponent();
            Component opposite = getAWTComponent(lostTo);
            FocusEvent fe = new FocusEvent(c, 1005, false, opposite);
            cacioComp.handlePeerEvent(fe);
        }
    }

    private void focusGained(ManagedWindow w, ManagedWindow lost) {
        if (w != null) {
            CacioComponent cacioComp = w.getCacioComponent();
            Component c = cacioComp.getAWTComponent();
            Component opposite = getAWTComponent(lost);
            FocusEvent fe = new FocusEvent(c, 1004, false, opposite);
            cacioComp.handlePeerEvent(fe);
        }
    }

    private Component getAWTComponent(ManagedWindow w) {
        Component c;
        if (w != null) {
            CacioComponent cacio = w.getCacioComponent();
            c = cacio.getAWTComponent();
        } else {
            c = null;
        }
        return c;
    }
}
