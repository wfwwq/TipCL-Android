package org.libsdl.app;

import android.os.Build;
import android.view.MotionEvent;

/* compiled from: SDLControllerManager.java */
/* loaded from: classes9.dex */
class SDLGenericMotionListener_API26 extends SDLGenericMotionListener_API24 {
    private boolean mRelativeModeEnabled;

    SDLGenericMotionListener_API26() {
    }

    @Override // org.libsdl.app.SDLGenericMotionListener_API24, org.libsdl.app.SDLGenericMotionListener_API14
    boolean supportsRelativeMouse() {
        return !SDLActivity.isDeXMode() || Build.VERSION.SDK_INT >= 27;
    }

    @Override // org.libsdl.app.SDLGenericMotionListener_API24, org.libsdl.app.SDLGenericMotionListener_API14
    boolean inRelativeMode() {
        return this.mRelativeModeEnabled;
    }

    @Override // org.libsdl.app.SDLGenericMotionListener_API24, org.libsdl.app.SDLGenericMotionListener_API14
    boolean setRelativeMouseEnabled(boolean enabled) {
        if (!SDLActivity.isDeXMode() || Build.VERSION.SDK_INT >= 27) {
            if (enabled) {
                SDLActivity.getContentView().requestPointerCapture();
            }
            this.mRelativeModeEnabled = enabled;
            return true;
        }
        return false;
    }

    @Override // org.libsdl.app.SDLGenericMotionListener_API14
    void reclaimRelativeMouseModeIfNeeded() {
        if (this.mRelativeModeEnabled && !SDLActivity.isDeXMode()) {
            SDLActivity.getContentView().requestPointerCapture();
        }
    }

    @Override // org.libsdl.app.SDLGenericMotionListener_API14
    boolean checkRelativeEvent(MotionEvent event) {
        return event.getSource() == 131076;
    }

    @Override // org.libsdl.app.SDLGenericMotionListener_API24, org.libsdl.app.SDLGenericMotionListener_API14
    float getEventX(MotionEvent event, int pointerIndex) {
        return event.getX(pointerIndex);
    }

    @Override // org.libsdl.app.SDLGenericMotionListener_API24, org.libsdl.app.SDLGenericMotionListener_API14
    float getEventY(MotionEvent event, int pointerIndex) {
        return event.getY(pointerIndex);
    }
}
