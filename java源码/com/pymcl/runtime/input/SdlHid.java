package com.pymcl.runtime.input;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.tungsten.fcl.game.sdl.SdlBridge;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.libsdl.app.HIDDeviceManager;
import org.libsdl.app.SDLActivity;

/* compiled from: SdlGamepad.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\tJ\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/pymcl/runtime/input/SdlHid;", "", "<init>", "()V", "REQUEST_BLUETOOTH_CONNECT", "", "manager", "Lorg/libsdl/app/HIDDeviceManager;", "btRequested", "", "ensureAcquired", "", "ctx", "Landroid/content/Context;", "release", "setFrozen", "frozen", "requestBluetoothIfNeeded", "activity", "Landroid/app/Activity;", "onRequestPermissionsResult", "requestCode", "grantResults", "", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SdlHid {
    public static final SdlHid INSTANCE = new SdlHid();
    public static final int REQUEST_BLUETOOTH_CONNECT = 23835;
    private static boolean btRequested;
    private static HIDDeviceManager manager;

    private SdlHid() {
    }

    public final synchronized void ensureAcquired(Context ctx) {
        HIDDeviceManager hIDDeviceManagerAcquire;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        if (manager == null && SdlBridge.getSdlEnabled()) {
            try {
                hIDDeviceManagerAcquire = HIDDeviceManager.acquire(ctx);
                Log.i("PyMCL-SDLPad", "HIDDeviceManager acquired");
            } catch (Throwable t) {
                Log.w("PyMCL-SDLPad", "HIDDeviceManager unavailable", t);
                hIDDeviceManagerAcquire = null;
            }
            manager = hIDDeviceManagerAcquire;
        }
    }

    public final synchronized void release() {
        HIDDeviceManager m = manager;
        if (m == null) {
            return;
        }
        manager = null;
        try {
            HIDDeviceManager.release(m);
        } catch (Throwable t) {
            Log.w("PyMCL-SDLPad", "HIDDeviceManager release", t);
        }
    }

    public final void setFrozen(boolean frozen) {
        try {
            HIDDeviceManager hIDDeviceManager = manager;
            if (hIDDeviceManager != null) {
                hIDDeviceManager.setFrozen(frozen);
            }
        } catch (Throwable th) {
        }
    }

    public final void requestBluetoothIfNeeded(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (Build.VERSION.SDK_INT < 31 || btRequested) {
            return;
        }
        try {
            if (activity.checkSelfPermission("android.permission.BLUETOOTH_CONNECT") == 0) {
                return;
            }
            btRequested = true;
            activity.requestPermissions(new String[]{"android.permission.BLUETOOTH_CONNECT"}, REQUEST_BLUETOOTH_CONNECT);
        } catch (Throwable t) {
            Log.w("PyMCL-SDLPad", "request BLUETOOTH_CONNECT", t);
        }
    }

    public final void onRequestPermissionsResult(int requestCode, int[] grantResults) {
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        boolean granted = !(grantResults.length == 0) && grantResults[0] == 0;
        if (requestCode == 23835) {
            Log.i("PyMCL-SDLPad", "BLUETOOTH_CONNECT granted=" + granted + "（BLE Steam 手柄在 SDL 下次初始化 HIDAPI 时生效）");
        } else if (SdlBridge.getSdlEnabled()) {
            try {
                SDLActivity.nativePermissionResult(requestCode, granted);
            } catch (Throwable t) {
                Log.w("PyMCL-SDLPad", "nativePermissionResult", t);
            }
        }
    }
}
