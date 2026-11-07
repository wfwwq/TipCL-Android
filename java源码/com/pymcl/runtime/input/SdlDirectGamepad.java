package com.pymcl.runtime.input;

import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.tungsten.fcl.game.sdl.SdlBridge;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.libsdl.app.SDLActivity;

/* compiled from: SdlGamepad.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/pymcl/runtime/input/SdlDirectGamepad;", "", "<init>", "()V", "forwardKey", "", "e", "Landroid/view/KeyEvent;", "forwardMotion", "Landroid/view/MotionEvent;", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SdlDirectGamepad {
    public static final SdlDirectGamepad INSTANCE = new SdlDirectGamepad();

    private SdlDirectGamepad() {
    }

    public final boolean forwardKey(KeyEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        if (!SdlBridge.getSdlEnabled()) {
            return true;
        }
        try {
            SDLActivity.handleKeyEvent(null, e.getKeyCode(), e, null);
        } catch (Throwable t) {
            Log.w("PyMCL-SDLPad", "forwardKey", t);
        }
        return true;
    }

    public final boolean forwardMotion(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        if (!SdlBridge.getSdlEnabled()) {
            return true;
        }
        try {
            SDLActivity.forwardGenericMotionToSDL(null, e);
        } catch (Throwable t) {
            Log.w("PyMCL-SDLPad", "forwardMotion", t);
        }
        return true;
    }
}
