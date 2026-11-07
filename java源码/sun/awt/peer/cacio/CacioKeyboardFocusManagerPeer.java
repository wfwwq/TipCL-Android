package sun.awt.peer.cacio;

import java.awt.AWTEvent;
import java.awt.Component;
import java.awt.Window;
import java.awt.peer.KeyboardFocusManagerPeer;
import sun.awt.AppContext;
import sun.awt.CausedFocusEvent;
import sun.awt.SunToolkit;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioKeyboardFocusManagerPeer.class */
class CacioKeyboardFocusManagerPeer implements KeyboardFocusManagerPeer {
    private static CacioKeyboardFocusManagerPeer instance;
    private Window currentFocusedWindow;
    private Component currentFocusOwner;

    static CacioKeyboardFocusManagerPeer getInstance() {
        if (instance == null) {
            instance = new CacioKeyboardFocusManagerPeer();
        }
        return instance;
    }

    private CacioKeyboardFocusManagerPeer() {
    }

    public Window getCurrentFocusedWindow() {
        return this.currentFocusedWindow;
    }

    public void setCurrentFocusOwner(Component comp) {
        this.currentFocusOwner = comp;
    }

    public Component getCurrentFocusOwner() {
        return this.currentFocusOwner;
    }

    public void clearGlobalFocusOwner(Window activeWindow) {
    }

    public void setCurrentFocusedWindow(Window win) {
        this.currentFocusedWindow = win;
    }

    boolean requestFocus(Component target, Component lightweightChild, boolean temporary, boolean focusedWindowChangeAllowed, long time, CausedFocusEvent.Cause cause) {
        if (lightweightChild == null) {
            lightweightChild = target;
        }
        Component currentOwner = getCurrentFocusOwner();
        if (currentOwner != null && !currentOwner.isDisplayable()) {
            currentOwner = null;
        }
        CausedFocusEvent causedFocusEvent = new CausedFocusEvent(lightweightChild, 1004, false, currentOwner, cause);
        CausedFocusEvent causedFocusEvent2 = null;
        if (currentOwner != null) {
            causedFocusEvent2 = new CausedFocusEvent(currentOwner, 1005, false, lightweightChild, cause);
        }
        if (causedFocusEvent2 != null) {
            postEvent(causedFocusEvent2);
        }
        postEvent(causedFocusEvent);
        return true;
    }

    private void postEvent(AWTEvent ev) {
        SunToolkit.postEvent(AppContext.getAppContext(), ev);
    }
}
