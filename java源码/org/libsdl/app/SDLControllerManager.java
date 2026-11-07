package org.libsdl.app;

import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;

/* loaded from: classes9.dex */
public class SDLControllerManager {
    private static final String TAG = "SDLControllerManager";
    protected static SDLHapticHandler mHapticHandler;
    protected static SDLJoystickHandler mJoystickHandler;

    static native void nativeAddHaptic(int i, String str);

    static native void nativeAddJoystick(int i, String str, String str2, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3, boolean z4);

    static native void nativeRemoveHaptic(int i);

    static native void nativeRemoveJoystick(int i);

    static native void nativeSetupJNI();

    static native void onNativeHat(int i, int i2, int i3, int i4);

    static native void onNativeJoy(int i, int i2, float f);

    static native void onNativeJoySensor(int i, int i2, long j, float f, float f2, float f3);

    public static native boolean onNativePadDown(int i, int i2, int i3);

    public static native boolean onNativePadUp(int i, int i2, int i3);

    static void initialize() {
        if (mJoystickHandler == null) {
            mJoystickHandler = new SDLJoystickHandler();
        }
        if (mHapticHandler == null) {
            if (Build.VERSION.SDK_INT >= 31) {
                mHapticHandler = new SDLHapticHandler_API31();
            } else {
                mHapticHandler = new SDLHapticHandler_API26();
            }
        }
    }

    public static boolean handleJoystickMotionEvent(MotionEvent event) {
        return mJoystickHandler.handleMotionEvent(event);
    }

    static void pollInputDevices() {
        mJoystickHandler.pollInputDevices();
    }

    static void joystickSetLED(int device_id, int red, int green, int blue) {
        mJoystickHandler.setLED(device_id, red, green, blue);
    }

    static void joystickSetSensorsEnabled(int device_id, boolean enabled) {
        mJoystickHandler.setSensorsEnabled(device_id, enabled);
    }

    static void pollHapticDevices() {
        mHapticHandler.pollHapticDevices();
    }

    static void hapticRun(int device_id, float intensity, int length) {
        mHapticHandler.run(device_id, intensity, length);
    }

    static void hapticRumble(int device_id, float low_frequency_intensity, float high_frequency_intensity, int length) {
        mHapticHandler.rumble(device_id, low_frequency_intensity, high_frequency_intensity, length);
    }

    static void hapticStop(int device_id) {
        mHapticHandler.stop(device_id);
    }

    public static boolean isDeviceSDLJoystick(int deviceId) {
        InputDevice device = InputDevice.getDevice(deviceId);
        if (device == null || deviceId < 0) {
            return false;
        }
        int sources = device.getSources();
        return (sources & 16) != 0 || (sources & 513) == 513 || (sources & 1025) == 1025;
    }
}
