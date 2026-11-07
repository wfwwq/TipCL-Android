package org.libsdl.app;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.UiModeManager;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.os.Message;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputConnection;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.view.PointerIconCompat;
import com.tungsten.fcl.game.sdl.SdlBridge;
import java.awt.Component;
import java.awt.Frame;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.libsdl.app.SdlImeController;
import org.lwjgl.sdl.SDLHints;
import org.lwjgl.util.spvc.Spv;

/* loaded from: classes9.dex */
public class SDLActivity extends Activity implements View.OnSystemUiVisibilityChangeListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected static final int COMMAND_CHANGE_TITLE = 1;
    protected static final int COMMAND_CHANGE_WINDOW_STYLE = 2;
    protected static final int COMMAND_SET_KEEP_SCREEN_ON = 5;
    protected static final int COMMAND_TEXTEDIT_HIDE = 3;
    protected static final int COMMAND_USER = 32768;
    private static final int SDL_MAJOR_VERSION = 3;
    private static final int SDL_MICRO_VERSION = 12;
    private static final int SDL_MINOR_VERSION = 4;
    protected static final int SDL_ORIENTATION_LANDSCAPE = 1;
    protected static final int SDL_ORIENTATION_LANDSCAPE_FLIPPED = 2;
    protected static final int SDL_ORIENTATION_PORTRAIT = 3;
    protected static final int SDL_ORIENTATION_PORTRAIT_FLIPPED = 4;
    protected static final int SDL_ORIENTATION_UNKNOWN = 0;
    private static final int SDL_SYSTEM_CURSOR_ARROW = 0;
    private static final int SDL_SYSTEM_CURSOR_CROSSHAIR = 3;
    private static final int SDL_SYSTEM_CURSOR_HAND = 11;
    private static final int SDL_SYSTEM_CURSOR_IBEAM = 1;
    private static final int SDL_SYSTEM_CURSOR_NO = 10;
    private static final int SDL_SYSTEM_CURSOR_SIZEALL = 9;
    private static final int SDL_SYSTEM_CURSOR_SIZENESW = 6;
    private static final int SDL_SYSTEM_CURSOR_SIZENS = 8;
    private static final int SDL_SYSTEM_CURSOR_SIZENWSE = 5;
    private static final int SDL_SYSTEM_CURSOR_SIZEWE = 7;
    private static final int SDL_SYSTEM_CURSOR_WAIT = 2;
    private static final int SDL_SYSTEM_CURSOR_WAITARROW = 4;
    private static final int SDL_SYSTEM_CURSOR_WINDOW_BOTTOM = 17;
    private static final int SDL_SYSTEM_CURSOR_WINDOW_BOTTOMLEFT = 18;
    private static final int SDL_SYSTEM_CURSOR_WINDOW_BOTTOMRIGHT = 16;
    private static final int SDL_SYSTEM_CURSOR_WINDOW_LEFT = 19;
    private static final int SDL_SYSTEM_CURSOR_WINDOW_RIGHT = 15;
    private static final int SDL_SYSTEM_CURSOR_WINDOW_TOP = 13;
    private static final int SDL_SYSTEM_CURSOR_WINDOW_TOPLEFT = 12;
    private static final int SDL_SYSTEM_CURSOR_WINDOW_TOPRIGHT = 14;
    private static final String TAG = "SDL";
    protected static SDLClipboardHandler mClipboardHandler;
    protected static Locale mCurrentLocale;
    public static NativeState mCurrentNativeState;
    protected static int mCurrentRotation;
    protected static Hashtable<Integer, PointerIcon> mCursors;
    protected static boolean mFullscreenModeActive;
    protected static HIDDeviceManager mHIDDeviceManager;
    public static boolean mHasFocus;
    public static boolean mIsResumedCalled;
    protected static int mLastCursorID;
    protected static ViewGroup mLayout;
    protected static SDLGenericMotionListener_API14 mMotionListener;
    public static NativeState mNextNativeState;
    protected static Thread mSDLThread;
    protected static Activity mSingleton;
    protected static SDLSurface mSurface;
    private final Runnable rehideSystemUi = new Runnable() { // from class: org.libsdl.app.SDLActivity.2
        @Override // java.lang.Runnable
        public void run() {
            SDLActivity.this.getWindow().getDecorView().setSystemUiVisibility(Spv.SpvExecutionModeMaxWorkDimINTEL);
        }
    };
    public static final boolean mHasMultiWindow = true;
    public static boolean mBrokenLibraries = true;
    protected static boolean mSDLMainFinished = false;
    protected static boolean mActivityCreated = false;
    private static SDLFileDialogState mFileDialogState = null;
    protected static boolean mDispatchingKeyEvent = false;
    static Handler commandHandler = new SDLCommandHandler(Looper.getMainLooper());

    public enum NativeState {
        INIT,
        RESUMED,
        PAUSED
    }

    public static native void nativeAddTouch(int i, String str);

    public static native boolean nativeAllowRecreateActivity();

    public static native int nativeCheckSDLThreadCounter();

    public static native void nativeCleanupMainThread();

    public static native void nativeFocusChanged(boolean z);

    public static native String nativeGetHint(String str);

    public static native boolean nativeGetHintBoolean(String str, boolean z);

    public static native String nativeGetVersion();

    public static native void nativeInitMainThread();

    public static native void nativeLowMemory();

    public static native void nativePause();

    public static native void nativePermissionResult(int i, boolean z);

    public static native void nativeQuit();

    public static native void nativeResume();

    public static native int nativeRunMain(String str, String str2, Object obj);

    public static native void nativeSendQuit();

    public static native void nativeSetNaturalOrientation(int i);

    public static native void nativeSetScreenResolution(int i, int i2, int i3, int i4, float f, float f2);

    public static native void nativeSetenv(String str, String str2);

    public static native void nativeSetupJNI();

    public static native void onNativeAccel(float f, float f2, float f3);

    public static native void onNativeClipboardChanged();

    public static native void onNativeDarkModeChanged(boolean z);

    public static native void onNativeDropFile(String str);

    public static native void onNativeFileDialog(int i, String[] strArr, int i2);

    public static native void onNativeInsetsChanged(int i, int i2, int i3, int i4);

    public static native void onNativeKeyDown(int i);

    public static native void onNativeKeyUp(int i);

    public static native void onNativeKeyboardFocusLost();

    public static native void onNativeLocaleChanged();

    public static native void onNativeMouse(int i, int i2, float f, float f2, boolean z);

    public static native void onNativePen(int i, int i2, int i3, int i4, float f, float f2, float f3);

    public static native void onNativePinchEnd();

    public static native void onNativePinchStart();

    public static native void onNativePinchUpdate(float f);

    public static native void onNativeResize();

    public static native void onNativeRotationChanged(int i);

    public static native void onNativeScreenKeyboardHidden();

    public static native void onNativeScreenKeyboardShown();

    public static native boolean onNativeSoftReturnKey();

    public static native void onNativeSurfaceChanged();

    public static native void onNativeSurfaceCreated();

    public static native void onNativeSurfaceDestroyed();

    public static native void onNativeTouch(int i, int i2, int i3, float f, float f2, float f3);

    public static SDLGenericMotionListener_API14 getMotionListener() {
        if (mMotionListener == null) {
            if (Build.VERSION.SDK_INT >= 29) {
                mMotionListener = new SDLGenericMotionListener_API29();
            } else {
                mMotionListener = new SDLGenericMotionListener_API26();
            }
        }
        return mMotionListener;
    }

    public static boolean forwardGenericMotionToSDL(View view, MotionEvent event) {
        return getMotionListener().onGenericMotion(view, event);
    }

    protected void main() {
        throw new IllegalStateException("We do not have a main() program to run. Why are you calling this?");
    }

    protected String getMainFunction() {
        return "SDL_main";
    }

    protected String[] getLibraries() {
        return new String[]{"SDL3", "main"};
    }

    public void loadLibraries() throws SecurityException, UnsatisfiedLinkError, NullPointerException {
        for (String lib : getLibraries()) {
            SDL.loadLibrary(lib, this);
        }
    }

    protected String[] getArguments() {
        return new String[0];
    }

    public static void initialize() {
        mSingleton = null;
        mSurface = null;
        SdlImeController.reset();
        mLayout = null;
        mClipboardHandler = null;
        mCursors = new Hashtable<>();
        mLastCursorID = 0;
        mSDLThread = null;
        mIsResumedCalled = false;
        mHasFocus = true;
        mNextNativeState = NativeState.INIT;
        mCurrentNativeState = NativeState.INIT;
    }

    public static void externalInitialize(SDLSurface surface, ViewGroup layout, Surface nativeSurface) {
        mSingleton = getContext();
        mSurface = surface;
        SDLSurface.setNativeSurface(nativeSurface);
        SdlImeController.reset();
        mLayout = layout;
        SDL.setContext(mSingleton);
        mClipboardHandler = new SDLClipboardHandler();
        mCursors = new Hashtable<>();
        mLastCursorID = 0;
        mSDLThread = null;
        mIsResumedCalled = false;
        mHasFocus = true;
        mNextNativeState = NativeState.INIT;
        mCurrentNativeState = NativeState.INIT;
    }

    public static SDLSurface getSDLSurface() {
        return mSurface;
    }

    protected SDLSurface createSDLSurface(Context context) {
        return new SDLSurface(context);
    }

    public static boolean isUsingSDLTextEdit() {
        return SdlImeController.isEditAvailable();
    }

    public static boolean isSDLTextInputActive() {
        return SdlImeController.isTextInputActive();
    }

    public static void commitTextInput(String text) {
        SDLInputConnection.nativeCommitText(text, 0);
    }

    public static void enableSDLEditKeyboard() {
        SdlImeController.requestShow(SdlImeController.Source.LAUNCHER);
    }

    public static void disableSDLEditKeyboard() {
        SdlImeController.requestHide(SdlImeController.Source.LAUNCHER);
    }

    public static boolean isSDLEditKeyboardShown() {
        return SdlImeController.isKeyboardShown();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        throw new IllegalStateException("We do not run SDLActivity as an activity.This only exists as a bridge to JNI. We manually set up everything else.");
    }

    protected void pauseNativeThread() {
        mNextNativeState = NativeState.PAUSED;
        mIsResumedCalled = false;
        if (mBrokenLibraries) {
            return;
        }
        handleNativeState();
    }

    protected void resumeNativeThread() {
        mNextNativeState = NativeState.RESUMED;
        mIsResumedCalled = true;
        if (mBrokenLibraries) {
            return;
        }
        handleNativeState();
    }

    @Override // android.app.Activity
    protected void onPause() {
        Log.v(TAG, "onPause()");
        super.onPause();
        if (mHIDDeviceManager != null) {
            mHIDDeviceManager.setFrozen(true);
        }
        if (!mHasMultiWindow) {
            pauseNativeThread();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        Log.v(TAG, "onResume()");
        super.onResume();
        if (mHIDDeviceManager != null) {
            mHIDDeviceManager.setFrozen(false);
        }
        if (!mHasMultiWindow) {
            resumeNativeThread();
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        Log.v(TAG, "onStop()");
        super.onStop();
        if (mHasMultiWindow) {
            pauseNativeThread();
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        Log.v(TAG, "onStart()");
        super.onStart();
        if (mHasMultiWindow) {
            resumeNativeThread();
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [android.content.res.Resources, java.lang.Class] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.content.res.Configuration, java.lang.Class] */
    public static int getNaturalOrientation() throws ClassNotFoundException {
        Activity activity = getContext();
        if (activity != null) {
            ?? cls = activity.getResources().forName(null);
            Display display = activity.getWindowManager().getDefaultDisplay();
            int rotation = display.getRotation();
            if (((rotation == 0 || rotation == 2) && ((Configuration) cls).orientation == 2) || ((rotation == 1 || rotation == 3) && ((Configuration) cls).orientation == 1)) {
                return 1;
            }
            return 3;
        }
        return 0;
    }

    public static int getCurrentRotation() {
        Activity activity = getContext();
        if (activity == null) {
            return 0;
        }
        Display display = activity.getWindowManager().getDefaultDisplay();
        switch (display.getRotation()) {
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super/*com.github.caciocavallosilano.cacio.peer.ProxyWindow*/.add(z);
        Log.v(TAG, "onWindowFocusChanged(): " + z);
        if ((z != 0 || !nativeGetHintBoolean(SDLHints.SDL_HINT_JOYSTICK_ALLOW_BACKGROUND_EVENTS, false)) && mHIDDeviceManager != null) {
            mHIDDeviceManager.setFrozen(!z);
        }
        if (mBrokenLibraries) {
            return;
        }
        mHasFocus = z;
        if (z != 0) {
            mNextNativeState = NativeState.RESUMED;
            getMotionListener().reclaimRelativeMouseModeIfNeeded();
            handleNativeState();
            nativeFocusChanged(true);
            return;
        }
        nativeFocusChanged(false);
        if (!mHasMultiWindow) {
            mNextNativeState = NativeState.PAUSED;
            handleNativeState();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        Log.v(TAG, "onTrimMemory()");
        super.onTrimMemory(level);
        if (mBrokenLibraries) {
            return;
        }
        nativeLowMemory();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Log.v(TAG, "onConfigurationChanged()");
        if (SdlBridge.getSdlEnabled()) {
            super.onConfigurationChanged(newConfig);
            if (mBrokenLibraries) {
                return;
            }
            if (mCurrentLocale == null || !mCurrentLocale.equals(newConfig.locale)) {
                mCurrentLocale = newConfig.locale;
                onNativeLocaleChanged();
            }
            switch (newConfig.uiMode & 48) {
                case 16:
                    onNativeDarkModeChanged(false);
                    break;
                case 32:
                    onNativeDarkModeChanged(true);
                    break;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, java.awt.Frame] */
    @Override // android.app.Activity
    protected void onDestroy() throws InterruptedException {
        Log.v(TAG, "onDestroy()");
        if (mHIDDeviceManager != null) {
            HIDDeviceManager.release(mHIDDeviceManager);
            mHIDDeviceManager = null;
        }
        SDLAudioManager.release(this);
        ?? r0 = mBrokenLibraries;
        if (r0 != 0) {
            super((Frame) r0);
            return;
        }
        Frame e = mSDLThread;
        if (e != null) {
            nativeSendQuit();
            try {
                e = mSDLThread;
                e.join(1000L);
            } catch (Exception e2) {
                e = e2;
                Log.v(TAG, "Problem stopping SDLThread: " + e);
            }
        }
        nativeQuit();
        super(e);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        boolean trapBack = nativeGetHintBoolean(SDLHints.SDL_HINT_ANDROID_TRAP_BACK_BUTTON, false);
        if (!trapBack && !isFinishing()) {
            super.onBackPressed();
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [android.content.ClipData$Item, boolean] */
    @Override // android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        String[] filelist;
        super.onActivityResult(requestCode, resultCode, data);
        if (SdlBridge.getSdlEnabled() && mFileDialogState != null && mFileDialogState.requestCode == requestCode) {
            if (data != null) {
                Uri singleFileUri = data.getData();
                if (singleFileUri == null) {
                    ClipData clipData = data.getClipData();
                    if (clipData == null) {
                        throw new AssertionError();
                    }
                    filelist = new String[clipData.getItemCount()];
                    for (int i = 0; i < filelist.length; i++) {
                        String uri = clipData.isPopupTrigger().getUri().toString();
                        filelist[i] = uri;
                    }
                } else {
                    filelist = new String[]{singleFileUri.toString()};
                }
            } else {
                filelist = new String[0];
            }
            onNativeFileDialog(requestCode, filelist, -1);
            mFileDialogState = null;
        }
    }

    public static void manualBackButton() {
        mSingleton.onBackPressed();
    }

    public void pressBackButton() {
        runOnUiThread(new Runnable() { // from class: org.libsdl.app.SDLActivity.1
            @Override // java.lang.Runnable
            public void run() {
                if (!SDLActivity.this.isFinishing()) {
                    SDLActivity.this.superOnBackPressed();
                }
            }
        });
    }

    public void superOnBackPressed() {
        super.onBackPressed();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        int keyCode;
        if (mBrokenLibraries || (keyCode = event.getKeyCode()) == 25 || keyCode == 24 || keyCode == 27 || keyCode == 168 || keyCode == 169) {
            return false;
        }
        mDispatchingKeyEvent = true;
        boolean result = super.dispatchKeyEvent(event);
        mDispatchingKeyEvent = false;
        return result;
    }

    public static boolean dispatchingKeyEvent() {
        return mDispatchingKeyEvent;
    }

    public static void handleNativeState() {
        if (mNextNativeState == mCurrentNativeState) {
            return;
        }
        if (mNextNativeState == NativeState.INIT) {
            mCurrentNativeState = mNextNativeState;
            return;
        }
        if (mNextNativeState == NativeState.PAUSED) {
            if (mSDLThread != null) {
                nativePause();
            }
            if (mSurface != null) {
                mSurface.handlePause();
            }
            mCurrentNativeState = mNextNativeState;
            return;
        }
        if (mNextNativeState == NativeState.RESUMED) {
            mSurface.handleResume();
            mCurrentNativeState = mNextNativeState;
        }
    }

    protected boolean onUnhandledMessage(int command, Object param) {
        return false;
    }

    protected static class SDLCommandHandler extends Handler {
        SDLCommandHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            Window window;
            if (SdlBridge.getSdlEnabled()) {
                Context context = SDLActivity.getContext();
                if (context == null) {
                    Log.e(SDLActivity.TAG, "error handling message, getContext() returned null");
                    return;
                }
                switch (msg.arg1) {
                    case 1:
                        if (SDLActivity.mSingleton == null) {
                            Log.e(SDLActivity.TAG, "error handling message, getContext() returned no Activity");
                            break;
                        } else {
                            SDLActivity.mSingleton.setTitle((String) msg.obj);
                            break;
                        }
                    case 2:
                        break;
                    case 3:
                        SdlImeController.requestHide(SdlImeController.Source.GAME);
                        break;
                    case 4:
                    default:
                        if ((context instanceof SDLActivity) && !((SDLActivity) context).onUnhandledMessage(msg.arg1, msg.obj)) {
                            Log.e(SDLActivity.TAG, "error handling message, command is " + msg.arg1);
                            break;
                        }
                        break;
                    case 5:
                        if ((context instanceof Activity) && (window = SDLActivity.mSingleton.getWindow()) != null) {
                            if ((msg.obj instanceof Integer) && ((Integer) msg.obj).intValue() != 0) {
                                window.addFlags(128);
                                break;
                            } else {
                                window.clearFlags(128);
                                break;
                            }
                        }
                        break;
                }
            }
        }
    }

    protected static boolean sendCommand(int command, Object data) {
        Message msg = commandHandler.obtainMessage();
        msg.arg1 = command;
        msg.obj = data;
        boolean result = commandHandler.sendMessage(msg);
        if (command == 2) {
            boolean bShouldWait = false;
            if (data instanceof Integer) {
                Display display = ((WindowManager) mSingleton.getSystemService("window")).getDefaultDisplay();
                DisplayMetrics realMetrics = new DisplayMetrics();
                display.getRealMetrics(realMetrics);
                boolean bFullscreenLayout = realMetrics.widthPixels == mSurface.getWidth() && realMetrics.heightPixels == mSurface.getHeight();
                if (((Integer) data).intValue() == 1) {
                    bShouldWait = bFullscreenLayout ? false : true;
                } else {
                    bShouldWait = bFullscreenLayout;
                }
            }
            if (bShouldWait && getContext() != null) {
                synchronized (getContext()) {
                    try {
                        getContext().wait(500L);
                    } catch (InterruptedException ie) {
                        ie.printStackTrace();
                    }
                }
            }
        }
        return result;
    }

    public static boolean setActivityTitle(String title) {
        return sendCommand(1, title);
    }

    public static void setWindowStyle(boolean z) {
        sendCommand(2, Integer.valueOf(z ? 1 : 0));
    }

    public static void setOrientation(int w, int h, boolean resizable, String hint) {
        if (mSingleton != null) {
            setOrientationBis(w, h, resizable, hint);
        }
    }

    public static void setOrientationBis(int w, int h, boolean resizable, String hint) {
        int req;
        int orientation_landscape = -1;
        int orientation_portrait = -1;
        if (w <= 1 || h <= 1) {
            return;
        }
        if (hint.contains("LandscapeRight") && hint.contains("LandscapeLeft")) {
            orientation_landscape = 11;
        } else if (hint.contains("LandscapeLeft")) {
            orientation_landscape = 0;
        } else if (hint.contains("LandscapeRight")) {
            orientation_landscape = 8;
        }
        boolean contains_Portrait = hint.contains("Portrait ") || hint.endsWith("Portrait");
        if (contains_Portrait && hint.contains("PortraitUpsideDown")) {
            orientation_portrait = 12;
        } else if (contains_Portrait) {
            orientation_portrait = 1;
        } else if (hint.contains("PortraitUpsideDown")) {
            orientation_portrait = 9;
        }
        boolean is_landscape_allowed = orientation_landscape != -1;
        boolean is_portrait_allowed = orientation_portrait != -1;
        if (!is_portrait_allowed && !is_landscape_allowed) {
            if (resizable) {
                req = 11;
            } else {
                req = w > h ? 6 : 7;
            }
        } else if (resizable) {
            if (is_portrait_allowed && is_landscape_allowed) {
                req = 11;
            } else {
                req = is_landscape_allowed ? orientation_landscape : orientation_portrait;
            }
        } else if (is_portrait_allowed && is_landscape_allowed) {
            req = w > h ? orientation_landscape : orientation_portrait;
        } else {
            req = is_landscape_allowed ? orientation_landscape : orientation_portrait;
        }
        Log.v(TAG, "setOrientation() requestedOrientation=" + req + " width=" + w + " height=" + h + " resizable=" + resizable + " hint=" + hint);
        mSingleton.setRequestedOrientation(req);
    }

    public static void minimizeWindow() {
        if (mSingleton == null) {
            return;
        }
        Intent startMain = new Intent("android.intent.action.MAIN");
        startMain.addCategory("android.intent.category.HOME");
        startMain.setFlags(268435456);
        mSingleton.startActivity(startMain);
    }

    public static boolean shouldMinimizeOnFocusLoss() {
        return false;
    }

    public static boolean supportsRelativeMouse() {
        if (Build.VERSION.SDK_INT < 27 && isDeXMode()) {
            return false;
        }
        return getMotionListener().supportsRelativeMouse();
    }

    public static boolean setRelativeMouseEnabled(boolean enabled) {
        if (enabled && !supportsRelativeMouse()) {
            return false;
        }
        return getMotionListener().setRelativeMouseEnabled(enabled);
    }

    public static boolean sendMessage(int command, int param) {
        if (mSingleton == null) {
            return false;
        }
        return sendCommand(command, Integer.valueOf(param));
    }

    public static Activity getContext() {
        return SDL.getContext();
    }

    public static boolean isAndroidTV() {
        UiModeManager uiModeManager = (UiModeManager) getContext().getSystemService("uimode");
        if (uiModeManager.getCurrentModeType() == 4) {
            return true;
        }
        if (Build.MANUFACTURER.equals("MINIX") && Build.MODEL.equals("NEO-U1")) {
            return true;
        }
        if (Build.MANUFACTURER.equals("Amlogic")) {
            return Build.MODEL.startsWith("TV") || Build.MODEL.equals("X96-W") || Build.MODEL.equals("A95X-R1");
        }
        return false;
    }

    public static boolean isVRHeadset() {
        return (Build.MANUFACTURER.equals("Oculus") && Build.MODEL.startsWith("Quest")) || Build.MANUFACTURER.equals("Pico");
    }

    public static double getDiagonal() {
        DisplayMetrics metrics = new DisplayMetrics();
        Activity activity = getContext();
        if (activity == null) {
            return 0.0d;
        }
        activity.getWindowManager().getDefaultDisplay().getMetrics(metrics);
        double dWidthInches = metrics.widthPixels / metrics.xdpi;
        double dHeightInches = metrics.heightPixels / metrics.ydpi;
        return Math.sqrt((dWidthInches * dWidthInches) + (dHeightInches * dHeightInches));
    }

    public static boolean isTablet() {
        return getDiagonal() >= 7.0d;
    }

    public static boolean isChromebook() {
        if (getContext() == null || !(getContext().getPackageManager().hasSystemFeature("org.chromium.arc") || getContext().getPackageManager().hasSystemFeature("org.chromium.arc.device_management"))) {
            return Build.MODEL != null && Build.MODEL.startsWith("sdk_gpc_");
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.content.res.Resources, java.lang.Class] */
    public static boolean isDeXMode() throws ClassNotFoundException {
        try {
            Class<?> cls = getContext().getResources().forName(null);
            Class<?> configClass = cls.getClass();
            return configClass.getField("SEM_DESKTOP_MODE_ENABLED").getInt(configClass) == configClass.getField("semDesktopModeEnabled").getInt(cls);
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean getManifestEnvironmentVariables() throws PackageManager.NameNotFoundException {
        try {
            if (getContext() == null) {
                return false;
            }
            ApplicationInfo applicationInfo = getContext().getPackageManager().getApplicationInfo(getContext().getPackageName(), 128);
            Bundle bundle = applicationInfo.metaData;
            if (bundle == null) {
                return false;
            }
            int trimLength = "SDL_ENV.".length();
            for (String key : bundle.keySet()) {
                if (key.startsWith("SDL_ENV.")) {
                    String name = key.substring(trimLength);
                    String value = bundle.get(key).toString();
                    nativeSetenv(name, value);
                }
            }
            return true;
        } catch (Exception e) {
            Log.v(TAG, "exception " + e.toString());
            return false;
        }
    }

    public static View getContentView() {
        return mLayout;
    }

    public static boolean showTextInput(int input_type, int x, int y, int w, int h) {
        return SdlImeController.requestShow(SdlImeController.Source.GAME, input_type, x, y, w, h);
    }

    public static void notifyImeVisibilityChanged(boolean visible) {
        SdlImeController.notifyVisibilityChanged(visible);
    }

    public static void onNativeTextInput(String text) {
        if (!SdlBridge.getSdlEnabled() || text == null || text.isEmpty()) {
            return;
        }
        try {
            SDLInputConnection.nativeCommitText(text, 1);
        } catch (UnsatisfiedLinkError e) {
        }
    }

    public static boolean isTextInputEvent(KeyEvent event) {
        if (event.isCtrlPressed()) {
            return false;
        }
        return event.isPrintingKey() || event.getKeyCode() == 62;
    }

    public static boolean handleKeyEvent(View v, int keyCode, KeyEvent event, InputConnection ic) {
        InputDevice device;
        if (!SdlBridge.getSdlEnabled()) {
            return false;
        }
        int deviceId = event.getDeviceId();
        int source = event.getSource();
        if (source == 0 && (device = InputDevice.getDevice(deviceId)) != null) {
            source = device.getSources();
        }
        if (SDLControllerManager.isDeviceSDLJoystick(deviceId)) {
            if (event.getAction() == 0) {
                if (SDLControllerManager.onNativePadDown(deviceId, keyCode, event.getScanCode())) {
                    return true;
                }
            } else if (event.getAction() == 1 && SDLControllerManager.onNativePadUp(deviceId, keyCode, event.getScanCode())) {
                return true;
            }
        }
        if ((source & 8194) == 8194 && !isVRHeadset() && (keyCode == 4 || keyCode == 125)) {
            switch (event.getAction()) {
                case 0:
                case 1:
                    return true;
            }
        }
        if (event.getAction() == 0) {
            onNativeKeyDown(keyCode);
            if (isTextInputEvent(event) && SdlImeController.isInputAccepted()) {
                if (ic != null) {
                    ic.commitText(String.valueOf((char) event.getUnicodeChar()), 1);
                } else {
                    SDLInputConnection.nativeCommitText(String.valueOf((char) event.getUnicodeChar()), 1);
                }
            }
            return true;
        }
        if (event.getAction() != 1) {
            return false;
        }
        onNativeKeyUp(keyCode);
        return true;
    }

    public static Surface getNativeSurface() {
        if (mSurface == null) {
            return null;
        }
        return SDLSurface.getNativeSurface();
    }

    public static void initTouch() {
        int[] ids = InputDevice.getDeviceIds();
        for (int id : ids) {
            InputDevice device = InputDevice.getDevice(id);
            if (device != null && ((device.getSources() & 4098) == 4098 || device.isVirtual())) {
                nativeAddTouch(device.getId(), device.getName());
            }
        }
    }

    public static int messageboxShowMessageBox(final Activity host, int flags, final String title, final String message, int[] buttonFlags, final int[] buttonIds, final String[] buttonTexts, int[] colors) throws InterruptedException {
        if (host == null || host.isFinishing() || host.isDestroyed()) {
            return -1;
        }
        if (buttonFlags.length != buttonIds.length && buttonIds.length != buttonTexts.length) {
            return -1;
        }
        final int[] selection = {-1};
        final CountDownLatch latch = new CountDownLatch(1);
        host.runOnUiThread(new Runnable() { // from class: org.libsdl.app.SDLActivity$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                SDLActivity.lambda$messageboxShowMessageBox$3(host, title, buttonIds, message, buttonTexts, selection, latch);
            }
        });
        try {
            latch.await();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return selection[0];
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.app.AlertDialog$Builder, com.github.caciocavallosilano.cacio.peer.ProxyWindow] */
    static /* synthetic */ void lambda$messageboxShowMessageBox$3(Activity host, String title, int[] buttonIds, String message, String[] buttonTexts, final int[] selection, final CountDownLatch latch) {
        try {
            ?? cancelable = new AlertDialog.Builder(host).setCancelable(false);
            if (title != null) {
                cancelable.setTitle(title);
            }
            ArrayList<Button> extraButtons = new ArrayList<>();
            if (buttonIds.length > 3) {
                LinearLayout linearLayout = new LinearLayout(host);
                linearLayout.setOrientation(1);
                if (message != null) {
                    ScrollView messageScroll = new ScrollView(host);
                    TextView messageView = new TextView(host);
                    messageView.setText(message);
                    messageScroll.addView(messageView);
                    linearLayout.addView(messageScroll);
                }
                for (int i = 3; i < buttonIds.length; i++) {
                    Button button = new Button(host);
                    button.setText(buttonTexts[i]);
                    linearLayout.addView(button);
                    extraButtons.add(button);
                }
                cancelable.setView(linearLayout);
            } else if (message != null) {
                cancelable.setMessage(message);
            }
            int slotCount = Math.min(buttonIds.length, 3);
            for (int i2 = 0; i2 < slotCount; i2++) {
                final int id = buttonIds[i2];
                DialogInterface.OnClickListener listener = new DialogInterface.OnClickListener() { // from class: org.libsdl.app.SDLActivity$$ExternalSyntheticLambda0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        SDLActivity.lambda$messageboxShowMessageBox$0(selection, id, dialogInterface, i3);
                    }
                };
                if (i2 == slotCount - 1) {
                    cancelable.setPositiveButton(buttonTexts[i2], listener);
                } else if (i2 == 0 && slotCount == 3) {
                    cancelable.processFocusEvent(buttonTexts[i2]);
                } else {
                    cancelable.setNegativeButton(buttonTexts[i2], listener);
                }
            }
            final AlertDialog dialog = cancelable.create();
            dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.libsdl.app.SDLActivity$$ExternalSyntheticLambda1
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    latch.countDown();
                }
            });
            for (int i3 = 3; i3 < buttonIds.length; i3++) {
                final int id2 = buttonIds[i3];
                extraButtons.get(i3 - 3).setOnClickListener(new View.OnClickListener() { // from class: org.libsdl.app.SDLActivity$$ExternalSyntheticLambda2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SDLActivity.lambda$messageboxShowMessageBox$2(selection, id2, dialog, view);
                    }
                });
            }
            dialog.show();
        } catch (Throwable e) {
            Log.e(TAG, "Failed to show SDL message box", e);
            latch.countDown();
        }
    }

    static /* synthetic */ void lambda$messageboxShowMessageBox$0(int[] selection, int id, DialogInterface dialog, int which) {
        selection[0] = id;
        dialog.dismiss();
    }

    static /* synthetic */ void lambda$messageboxShowMessageBox$2(int[] selection, int id, AlertDialog dialog, View v) {
        selection[0] = id;
        dialog.dismiss();
    }

    public int messageboxShowMessageBox(int flags, String title, String message, int[] buttonFlags, int[] buttonIds, String[] buttonTexts, int[] colors) {
        return messageboxShowMessageBox(this, flags, title, message, buttonFlags, buttonIds, buttonTexts, colors);
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public void onSystemUiVisibilityChange(int visibility) {
        Handler handler;
        if (mFullscreenModeActive) {
            if (((visibility & 4) == 0 || (visibility & 2) == 0) && (handler = getWindow().getDecorView().getHandler()) != null) {
                handler.removeCallbacks(this.rehideSystemUi);
                handler.postDelayed(this.rehideSystemUi, 2000L);
            }
        }
    }

    public static boolean clipboardHasText() {
        return mClipboardHandler.clipboardHasText();
    }

    public static String clipboardGetText() {
        return mClipboardHandler.clipboardGetText();
    }

    public static void clipboardSetText(String string) {
        mClipboardHandler.clipboardSetText(string);
    }

    public static int createCustomCursor(int[] colors, int width, int height, int hotSpotX, int hotSpotY) {
        Bitmap bitmap = Bitmap.createBitmap(colors, width, height, Bitmap.Config.ARGB_8888);
        mLastCursorID++;
        try {
            mCursors.put(Integer.valueOf(mLastCursorID), PointerIcon.create(bitmap, hotSpotX, hotSpotY));
            return mLastCursorID;
        } catch (Exception e) {
            return 0;
        }
    }

    public static void destroyCustomCursor(int cursorID) {
        try {
            mCursors.remove(Integer.valueOf(cursorID));
        } catch (Exception e) {
        }
    }

    public static boolean setCustomCursor(int cursorID) {
        try {
            mSurface.setPointerIcon(mCursors.get(Integer.valueOf(cursorID)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean setSystemCursor(int cursorID) {
        int cursor_type = 0;
        switch (cursorID) {
            case 0:
                cursor_type = 1000;
                break;
            case 1:
                cursor_type = 1008;
                break;
            case 2:
                cursor_type = 1004;
                break;
            case 3:
                cursor_type = 1007;
                break;
            case 4:
                cursor_type = 1004;
                break;
            case 5:
                cursor_type = PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW;
                break;
            case 6:
                cursor_type = PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW;
                break;
            case 7:
                cursor_type = PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW;
                break;
            case 8:
                cursor_type = PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW;
                break;
            case 9:
                cursor_type = PointerIconCompat.TYPE_GRAB;
                break;
            case 10:
                cursor_type = PointerIconCompat.TYPE_NO_DROP;
                break;
            case 11:
                cursor_type = 1002;
                break;
            case 12:
                cursor_type = PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW;
                break;
            case 13:
                cursor_type = PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW;
                break;
            case 14:
                cursor_type = PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW;
                break;
            case 15:
                cursor_type = PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW;
                break;
            case 16:
                cursor_type = PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW;
                break;
            case 17:
                cursor_type = PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW;
                break;
            case 18:
                cursor_type = PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW;
                break;
            case 19:
                cursor_type = PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW;
                break;
        }
        try {
            mSurface.setPointerIcon(PointerIcon.getSystemIcon(getContext(), cursor_type));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void requestPermission(String permission, int requestCode) {
        try {
            Activity activity = getContext();
            if (activity == null) {
                nativePermissionResult(requestCode, false);
            } else if (activity.checkSelfPermission(permission) != 0) {
                activity.requestPermissions(new String[]{permission}, requestCode);
            } else {
                nativePermissionResult(requestCode, true);
            }
        } catch (Throwable t) {
            Log.w(TAG, "requestPermission " + permission, t);
            try {
                nativePermissionResult(requestCode, false);
            } catch (Throwable th) {
            }
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        boolean result = false;
        if (grantResults.length > 0 && grantResults[0] == 0) {
            result = true;
        }
        nativePermissionResult(requestCode, result);
    }

    public static boolean openURL(String url) {
        return SdlBridge.openUrl(url);
    }

    public static boolean showToast(String message, int duration, int gravity, int xOffset, int yOffset) {
        if (mSingleton == null) {
            return false;
        }
        try {
        } catch (Exception e) {
        }
        try {
            mSingleton.runOnUiThread(new Runnable(message, duration, gravity, xOffset, yOffset) { // from class: org.libsdl.app.SDLActivity.1OneShotTask
                private final int mDuration;
                private final int mGravity;
                private final String mMessage;
                private final int mXOffset;
                private final int mYOffset;

                {
                    this.mMessage = message;
                    this.mDuration = duration;
                    this.mGravity = gravity;
                    this.mXOffset = xOffset;
                    this.mYOffset = yOffset;
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Toast toast = Toast.makeText(SDLActivity.mSingleton, this.mMessage, this.mDuration);
                        if (this.mGravity >= 0) {
                            toast.setGravity(this.mGravity, this.mXOffset, this.mYOffset);
                        }
                        toast.show();
                    } catch (Exception ex) {
                        Log.e(SDLActivity.TAG, ex.getMessage());
                    }
                }
            });
            return true;
        } catch (Exception e2) {
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.content.ContentResolver, com.github.caciocavallosilano.cacio.peer.ProxyWindow] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.ParcelFileDescriptor, void] */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, java.awt.AWTEvent] */
    public static int openFileDescriptor(String uri, String mode) throws Exception {
        if (mSingleton == null) {
            return -1;
        }
        try {
            ?? DoLightweightDispatching = mSingleton.getContentResolver().doLightweightDispatching(Component.isShowing());
            if (DoLightweightDispatching != 0) {
                return DoLightweightDispatching.detachFd();
            }
            return -1;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return -1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.content.Intent, java.lang.Class] */
    public static boolean showFileDialog(String[] filters, boolean allowMultiple, boolean forWrite, int requestCode) throws NoSuchFieldException {
        boolean allowMultiple2;
        if (mSingleton == null) {
            return false;
        }
        if (!forWrite) {
            allowMultiple2 = allowMultiple;
        } else {
            allowMultiple2 = false;
        }
        ArrayList<String> mimes = new ArrayList<>();
        MimeTypeMap mimeTypeMap = MimeTypeMap.getSingleton();
        if (filters != null) {
            for (String pattern : filters) {
                String[] extensions = pattern.split(";");
                if (extensions.length == 1 && extensions[0].equals("*")) {
                    mimes.add("*/*");
                } else {
                    for (String ext : extensions) {
                        String mime = mimeTypeMap.getMimeTypeFromExtension(ext);
                        if (mime != null) {
                            mimes.add(mime);
                        }
                    }
                }
            }
        }
        ?? intent = new Intent(forWrite ? "android.intent.action.CREATE_DOCUMENT" : "android.intent.action.OPEN_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.getDeclaredField("android.intent.extra.ALLOW_MULTIPLE");
        switch (mimes.size()) {
            case 0:
                intent.setType("*/*");
                break;
            case 1:
                intent.setType(mimes.get(0));
                break;
            default:
                intent.setType("*/*");
                intent.putExtra("android.intent.extra.MIME_TYPES", (String[]) mimes.toArray(new String[0]));
                break;
        }
        try {
            mSingleton.startActivityForResult(intent, requestCode);
            mFileDialogState = new SDLFileDialogState();
            mFileDialogState.requestCode = requestCode;
            mFileDialogState.multipleChoice = allowMultiple2;
            return true;
        } catch (ActivityNotFoundException e) {
            Log.e(TAG, "Unable to open file dialog.", e);
            return false;
        }
    }

    static class SDLFileDialogState {
        boolean multipleChoice;
        int requestCode;

        SDLFileDialogState() {
        }
    }

    public static String getPreferredLocales() {
        String result = "";
        LocaleList locales = LocaleList.getAdjustedDefault();
        for (int i = 0; i < locales.size(); i++) {
            if (i != 0) {
                result = result + ",";
            }
            result = result + formatLocale(locales.get(i));
        }
        return result;
    }

    public static String formatLocale(Locale locale) {
        String lang;
        if (locale.getLanguage() == "in") {
            lang = "id";
        } else if (locale.getLanguage() == "") {
            lang = "und";
        } else {
            lang = locale.getLanguage();
        }
        if (locale.getCountry() == "") {
            String result = lang;
            return result;
        }
        String result2 = lang + "_" + locale.getCountry();
        return result2;
    }
}
