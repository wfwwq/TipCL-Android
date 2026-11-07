package sun.awt.peer.cacio;

import java.awt.Component;
import sun.awt.AWTAccessor;
import sun.awt.CausedFocusEvent;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/KFMHelper.class */
class KFMHelper {
    KFMHelper() {
    }

    static boolean processSynchronousLightweightTransfer(Component target, Component lightweightChild, boolean temporary, boolean focusedWindowChangeAllowed, long time) {
        return AWTAccessor.getKeyboardFocusManagerAccessor().processSynchronousLightweightTransfer(target, lightweightChild, temporary, focusedWindowChangeAllowed, time);
    }

    static int shouldNativelyFocusHeavyweight(Component heavyweight, Component descendant, boolean temporary, boolean focusedWindowChangeAllowed, long time, CausedFocusEvent.Cause cause) {
        return AWTAccessor.getKeyboardFocusManagerAccessor().shouldNativelyFocusHeavyweight(heavyweight, descendant, temporary, focusedWindowChangeAllowed, time, cause);
    }
}
