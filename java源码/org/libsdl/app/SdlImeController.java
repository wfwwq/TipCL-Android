package org.libsdl.app;

import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import com.tungsten.fcl.game.sdl.SdlBridge;

/* loaded from: classes9.dex */
final class SdlImeController {
    private static final int HEIGHT_PADDING = 15;
    private static final String TAG = "SDLImeController";
    private static SDLDummyEdit mEdit;
    private static boolean mForcedByLauncher;
    private static boolean mKeyboardShown;
    private static boolean mTextInputActive;

    enum Source {
        GAME,
        LAUNCHER,
        BACK
    }

    private SdlImeController() {
    }

    static boolean isTextInputActive() {
        return mTextInputActive;
    }

    static boolean isInputAccepted() {
        return mTextInputActive || mForcedByLauncher;
    }

    static boolean isEditAvailable() {
        return mEdit != null;
    }

    static boolean isKeyboardShown() {
        return mKeyboardShown;
    }

    static void reset() {
        if (mEdit != null) {
            ViewParent parent = mEdit.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(mEdit);
            }
            mEdit = null;
        }
        mTextInputActive = false;
        mKeyboardShown = false;
        mForcedByLauncher = false;
    }

    static void requestShow(Source source) {
        requestShow(source, 1, -1, -1, -1, -1);
    }

    static boolean requestShow(final Source source, final int inputType, final int x, final int y, final int w, final int h) {
        Log.i(TAG, "IME: show requested by " + source);
        if (source == Source.GAME) {
            mTextInputActive = true;
        }
        return post(new Runnable() { // from class: org.libsdl.app.SdlImeController$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                SdlImeController.doShow(source, inputType, x, y, w, h);
            }
        });
    }

    static void requestHide(final Source source) {
        Log.i(TAG, "IME: hide requested by " + source);
        if (source == Source.GAME) {
            mTextInputActive = false;
        }
        post(new Runnable() { // from class: org.libsdl.app.SdlImeController$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                SdlImeController.doHide(source);
            }
        });
    }

    static void notifyVisibilityChanged(boolean visible) {
        if (SdlBridge.getSdlEnabled()) {
            if (visible && isUnwantedImeVisible()) {
                Log.w(TAG, "IME: unwanted visibility while text input channel is closed, forcing hide");
                forceHideIme();
            } else {
                if (mKeyboardShown == visible) {
                    return;
                }
                mKeyboardShown = visible;
                Log.i(TAG, "IME: visibility changed to " + (visible ? "shown" : "hidden"));
                if (visible) {
                    SDLActivity.onNativeScreenKeyboardShown();
                } else {
                    SDLActivity.onNativeScreenKeyboardHidden();
                }
            }
        }
    }

    private static boolean post(Runnable task) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            task.run();
            return true;
        }
        return SDLActivity.commandHandler.post(task);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void doShow(Source source, int inputType, int x, int y, int w, int h) {
        if (SDLActivity.mLayout == null) {
            Log.w(TAG, "IME: no layout available, show by " + source + " ignored");
            return;
        }
        if (source == Source.GAME) {
            SdlBridge.notifyGameImeTakeover();
        } else if (!mTextInputActive && !mForcedByLauncher) {
            if (!SdlBridge.setNativeTextInputActive(true)) {
                Log.w(TAG, "IME: show by " + source + " rejected, native text input unavailable");
                return;
            } else {
                mForcedByLauncher = true;
                Log.i(TAG, "IME: native text input force-activated by " + source);
            }
        }
        boolean autoShow = source != Source.GAME || SdlBridge.getSdlImeAutoShowEnabled();
        if (!autoShow && mEdit == null) {
            Log.i(TAG, "IME: auto show suppressed by launcher setting, editor deferred");
            return;
        }
        if (mEdit == null) {
            mEdit = new SDLDummyEdit(SDLActivity.getContext());
            SDLActivity.mLayout.addView(mEdit, makeParams(x, y, w, h));
        } else if (x >= 0 && w > 0) {
            ViewGroup.MarginLayoutParams params = (ViewGroup.MarginLayoutParams) mEdit.getLayoutParams();
            params.width = w;
            params.height = h + 15;
            params.leftMargin = x;
            params.topMargin = y;
            mEdit.setLayoutParams(params);
        }
        mEdit.setInputType(inputType);
        mEdit.setFocusable(true);
        mEdit.setFocusableInTouchMode(true);
        mEdit.setVisibility(0);
        if (!mEdit.hasFocus()) {
            mEdit.requestFocus();
        }
        if (mKeyboardShown) {
            Log.i(TAG, "IME: already visible, show by " + source + " ignored");
            return;
        }
        if (!autoShow) {
            Log.i(TAG, "IME: auto show suppressed by launcher setting");
            return;
        }
        InputMethodManager imm = (InputMethodManager) SDLActivity.getContext().getSystemService("input_method");
        imm.showSoftInput(mEdit, 0);
        if (imm.isAcceptingText()) {
            mKeyboardShown = true;
            Log.i(TAG, "IME: shown by " + source);
            SDLActivity.onNativeScreenKeyboardShown();
        }
    }

    private static FrameLayout.LayoutParams makeParams(int x, int y, int w, int h) {
        if (x < 0 || w <= 0) {
            x = 0;
            y = 0;
            w = 1;
            h = 1;
        }
        if (h + 15 <= 0) {
            h = -14;
        }
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(w, h + 15);
        params.leftMargin = x;
        params.topMargin = y;
        return params;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void doHide(Source source) {
        if (mForcedByLauncher && source != Source.GAME) {
            SdlBridge.setNativeTextInputActive(false);
        }
        mForcedByLauncher = false;
        if (mEdit == null) {
            Log.i(TAG, "IME: no text edit available, hide ignored");
            return;
        }
        forceHideIme();
        if (mKeyboardShown) {
            mKeyboardShown = false;
            Log.i(TAG, "IME: hidden");
            SDLActivity.onNativeScreenKeyboardHidden();
        }
        if (!isInputAccepted()) {
            SDLActivity.commandHandler.postDelayed(new Runnable() { // from class: org.libsdl.app.SdlImeController$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    SdlImeController.recheckHidden();
                }
            }, 300L);
        }
    }

    private static void forceHideIme() {
        if (mEdit != null) {
            InputMethodManager imm = (InputMethodManager) SDLActivity.getContext().getSystemService("input_method");
            if (mEdit.getWindowToken() != null) {
                imm.hideSoftInputFromWindow(mEdit.getWindowToken(), 0);
            }
            ViewParent parent = mEdit.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(mEdit);
            }
            mEdit = null;
            Log.i(TAG, "IME: text edit removed from view tree");
        }
        ViewGroup layout = SDLActivity.mLayout;
        if (layout != null && layout.getWindowToken() != null) {
            InputMethodManager imm2 = (InputMethodManager) SDLActivity.getContext().getSystemService("input_method");
            imm2.hideSoftInputFromWindow(layout.getWindowToken(), 0);
        }
    }

    private static boolean isUnwantedImeVisible() {
        return SdlBridge.getSdlEnabled() && !isInputAccepted() && mEdit != null && mEdit.hasFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void recheckHidden() {
        if (mTextInputActive || mKeyboardShown || !isUnwantedImeVisible()) {
            return;
        }
        Log.i(TAG, "IME: re-hide to suppress stubborn IME");
        forceHideIme();
    }
}
