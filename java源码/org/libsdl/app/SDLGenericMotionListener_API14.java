package org.libsdl.app;

import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: SDLControllerManager.java */
/* loaded from: classes9.dex */
class SDLGenericMotionListener_API14 implements View.OnGenericMotionListener {
    protected static final int SDL_PEN_DEVICE_TYPE_DIRECT = 1;
    protected static final int SDL_PEN_DEVICE_TYPE_INDIRECT = 2;
    protected static final int SDL_PEN_DEVICE_TYPE_UNKNOWN = 0;

    SDLGenericMotionListener_API14() {
    }

    @Override // android.view.View.OnGenericMotionListener
    public boolean onGenericMotion(View v, MotionEvent event) {
        int buttons;
        if (event.getSource() == 16777232) {
            return SDLControllerManager.handleJoystickMotionEvent(event);
        }
        int action = event.getActionMasked();
        int pointerCount = event.getPointerCount();
        boolean consumed = false;
        for (int i = 0; i < pointerCount; i++) {
            int toolType = event.getToolType(i);
            if (toolType == 3) {
                switch (action) {
                    case 7:
                        float x = getEventX(event, i);
                        float y = getEventY(event, i);
                        SDLActivity.onNativeMouse(0, action, x, y, checkRelativeEvent(event));
                        consumed = true;
                        break;
                    case 8:
                        float x2 = event.getAxisValue(10, i);
                        float y2 = event.getAxisValue(9, i);
                        SDLActivity.onNativeMouse(0, action, x2, y2, false);
                        consumed = true;
                        break;
                }
            } else if (toolType == 2 || toolType == 4) {
                switch (action) {
                    case 7:
                    case 9:
                    case 10:
                        float x3 = event.getX(i);
                        float y3 = event.getY(i);
                        float p = event.getPressure(i);
                        if (p > 1.0f) {
                            p = 1.0f;
                        }
                        int buttons2 = (1 << (toolType != 2 ? 30 : 0)) | (event.getButtonState() >> 4);
                        if ((event.getButtonState() & 4) == 0) {
                            buttons = buttons2;
                        } else {
                            buttons = buttons2 | 8;
                        }
                        SDLActivity.onNativePen(event.getPointerId(i), getPenDeviceType(event.getDevice()), buttons, action, x3, y3, p);
                        consumed = true;
                        break;
                }
            }
        }
        return consumed;
    }

    boolean supportsRelativeMouse() {
        return false;
    }

    boolean inRelativeMode() {
        return false;
    }

    boolean setRelativeMouseEnabled(boolean enabled) {
        return false;
    }

    void reclaimRelativeMouseModeIfNeeded() {
    }

    boolean checkRelativeEvent(MotionEvent event) {
        return inRelativeMode();
    }

    float getEventX(MotionEvent event, int pointerIndex) {
        return event.getX(pointerIndex);
    }

    float getEventY(MotionEvent event, int pointerIndex) {
        return event.getY(pointerIndex);
    }

    int getPenDeviceType(InputDevice penDevice) {
        return 0;
    }
}
