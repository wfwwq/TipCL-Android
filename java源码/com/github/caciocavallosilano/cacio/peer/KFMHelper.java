package com.github.caciocavallosilano.cacio.peer;

import java.awt.Component;
import java.awt.event.FocusEvent;
import sun.awt.AWTAccessor;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/KFMHelper.class */
class KFMHelper {
    KFMHelper() {
    }

    static boolean processSynchronousLightweightTransfer(Component target, Component lightweightChild, boolean temporary, boolean focusedWindowChangeAllowed, long time) {
        return AWTAccessor.getKeyboardFocusManagerAccessor().processSynchronousLightweightTransfer(target, lightweightChild, temporary, focusedWindowChangeAllowed, time);
    }

    static int shouldNativelyFocusHeavyweight(Component heavyweight, Component descendant, boolean temporary, boolean focusedWindowChangeAllowed, long time, FocusEvent.Cause cause) {
        return AWTAccessor.getKeyboardFocusManagerAccessor().shouldNativelyFocusHeavyweight(heavyweight, descendant, temporary, focusedWindowChangeAllowed, time, cause);
    }
}
