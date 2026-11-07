package com.tungsten.fcl.game.sdl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.Surface;
import android.view.ViewGroup;
import com.pymcl.runtime.settings.CrossProcessPrefs;
import com.tungsten.fcl.FCLApp;
import java.lang.ref.WeakReference;
import org.libsdl.app.SDL;
import org.libsdl.app.SDLActivity;
import org.libsdl.app.SDLSurface;
import org.lwjgl.glfw.CallbackBridge;

/* loaded from: classes12.dex */
public final class SdlBridge {
    public static final String KEY_SDL_AUTO_SHOW_IME = "sdl_auto_show_ime";
    public static final String PREFS_LAUNCHER = "launcher";
    private static final String TAG = "PyMCL-SDL";
    private static WeakReference<Activity> activityRef;
    private static Object currentSource;
    private static Surface currentSurface;
    private static volatile boolean enabled;
    private static boolean jniReady;
    private static WeakReference<ViewGroup> layoutRef;
    public static volatile Runnable onGameImeTakeover;
    private static boolean sdlInitialized;
    private static long surfaceGeneration;
    public static volatile UrlOpener urlOpener;

    public interface UrlOpener {
        boolean open(String str);
    }

    public static native void initializeControllerSubsystems();

    public static native boolean isNativeTextInputActive();

    public static native boolean isSdlRenderActive();

    public static native boolean setNativeTextInputActive(boolean z);

    /*  JADX ERROR: IllegalArgumentException in pass: ConstructorVisitor
        java.lang.IllegalArgumentException: Illegal Capacity: -1
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:161)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.BaseInvokeNode.<init>(BaseInvokeNode.java:11)
        	at jadx.core.dex.instructions.mods.ConstructorInsn.<init>(ConstructorInsn.java:32)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:76)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static synchronized boolean ensureHostContext() {
        /*
            java.lang.Class<com.tungsten.fcl.game.sdl.SdlBridge> r0 = com.tungsten.fcl.game.sdl.SdlBridge.class
            monitor-enter(r0)
            r1 = 0
            android.app.Activity r2 = org.libsdl.app.SDL.getContext()     // Catch: java.lang.Throwable -> L3c
            r3 = 1
            if (r2 == 0) goto Ld
            monitor-exit(r0)
            return r3
        Ld:
            java.lang.ref.WeakReference<android.app.Activity> r2 = com.tungsten.fcl.game.sdl.SdlBridge.activityRef     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L1a
            java.lang.ref.WeakReference<android.app.Activity> r2 = com.tungsten.fcl.game.sdl.SdlBridge.activityRef     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L3c
            android.app.Activity r2 = (android.app.Activity) r2     // Catch: java.lang.Throwable -> L3c
            goto L1b
        L1a:
            r2 = 0
        L1b:
            if (r2 != 0) goto L22
            android.app.Activity r4 = com.tungsten.fcl.FCLApp.getActivity()     // Catch: java.lang.Throwable -> L3c
            r2 = r4
        L22:
            if (r2 != 0) goto L2d
            java.lang.String r3 = "PyMCL-SDL"
            java.lang.String r4 = "SDL host context missing, keep SDL disabled"
            android.util.Log.w(r3, r4)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r0)
            return r1
        L2d:
            org.libsdl.app.SDL.initialize()     // Catch: java.lang.Throwable -> L3c
            org.libsdl.app.SDL.setContext(r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r4 = "PyMCL-SDL"
            java.lang.String r5 = "SDL host context attached without surface (non-SDL-render instance)"
            java.lang.Object.<init>()     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r0)
            return r3
        L3c:
            r2 = move-exception
            java.lang.String r3 = "PyMCL-SDL"
            java.lang.String r4 = "ensureHostContext"
            android.util.Log.w(r3, r4, r2)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r0)
            return r1
        L46:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tungsten.fcl.game.sdl.SdlBridge.ensureHostContext():boolean");
    }

    public static synchronized boolean setupJNI() {
        if (jniReady) {
            return true;
        }
        SDL.setupJNI();
        jniReady = true;
        return true;
    }

    public static synchronized boolean markSdlInitialized() {
        if (sdlInitialized) {
            return false;
        }
        sdlInitialized = true;
        return true;
    }

    public static synchronized void clearSdlInitialized() {
        sdlInitialized = false;
    }

    public static void setSdlEnabled(boolean v) {
        enabled = v;
    }

    public static boolean getSdlEnabled() {
        return enabled;
    }

    public static boolean getSdlImeAutoShowEnabled() {
        try {
            Context c = FCLApp.getAppContext();
            if (c != null) {
                return CrossProcessPrefs.get(c).getBoolean("sdl_auto_show_ime", false);
            }
            return false;
        } catch (Throwable th) {
            return false;
        }
    }

    public static void prepareSurface(Activity activity, Surface surface, ViewGroup layout, Object source) {
        activityRef = new WeakReference<>(activity);
        layoutRef = new WeakReference<>(layout);
        currentSurface = surface;
        currentSource = source;
        surfaceGeneration++;
        if (SDLActivity.getSDLSurface() == null) {
            SDL.initialize();
            SDL.setContext(activity);
            SDLActivity.externalInitialize(new SDLSurface(activity), layout, surface);
            return;
        }
        SDLSurface.setNativeSurface(surface);
    }

    public static boolean safePrepareSurface(Activity activity, Surface surface, ViewGroup layout, Object source) {
        try {
            prepareSurface(activity, surface, layout, source);
            return true;
        } catch (Throwable t) {
            Log.w(TAG, "SDL prepareSurface failed, GLFW only", t);
            return false;
        }
    }

    public static void registerSurface(Activity activity, Surface surface, ViewGroup layout) {
        activityRef = new WeakReference<>(activity);
        layoutRef = new WeakReference<>(layout);
        currentSurface = surface;
    }

    public static void syncResolution(int width, int height) {
        if (enabled) {
            try {
                SDLSurface s = SDLActivity.getSDLSurface();
                if (s == null) {
                    return;
                }
                s.surfaceChanged();
                s.nativeResize(width, height);
            } catch (Throwable t) {
                Log.w(TAG, "syncResolution", t);
            }
        }
    }

    public static boolean beginSurfaceDestroy(Object source, Surface surface) {
        return source != null && currentSource == source && surface != null && currentSurface == surface;
    }

    public static void unregisterSurface(Surface surface) {
        if (surface == null || currentSurface != surface) {
            return;
        }
        currentSurface = null;
        currentSource = null;
    }

    public static synchronized void reset() {
        currentSurface = null;
        currentSource = null;
        surfaceGeneration = 0L;
        activityRef = null;
        layoutRef = null;
        jniReady = false;
        sdlInitialized = false;
        enabled = false;
        try {
            CallbackBridge.clearSdlBridgeState();
        } catch (Throwable th) {
        }
        try {
            SDLSurface.clearNativeSurface();
        } catch (Throwable th2) {
        }
        try {
            SDL.initialize();
        } catch (Throwable th3) {
        }
    }

    public static void notifyGameImeTakeover() {
        Runnable r = onGameImeTakeover;
        if (r != null) {
            try {
                r.run();
            } catch (Throwable t) {
                Log.w(TAG, "ime takeover", t);
            }
        }
    }

    public static boolean openUrl(String url) {
        UrlOpener o = urlOpener;
        if (o != null) {
            try {
                return o.open(url);
            } catch (Throwable t) {
                Log.w(TAG, "openUrl", t);
            }
        }
        try {
            Activity a = SDL.getContext();
            if (a == null) {
                return false;
            }
            a.runOnUiThread(new SdlBridge$$ExternalSyntheticLambda0(a, url));
            return true;
        } catch (Throwable th) {
            return false;
        }
    }

    static /* synthetic */ void lambda$openUrl$0(Activity a, String url) {
        try {
            a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)).addFlags(268435456));
        } catch (Throwable t) {
            Log.w(TAG, "openUrl " + url, t);
        }
    }

    public static boolean safeIsSdlRenderActive() {
        try {
            return isSdlRenderActive();
        } catch (Throwable th) {
            return false;
        }
    }

    public static boolean safeSetNativeTextInputActive(boolean a) {
        try {
            return setNativeTextInputActive(a);
        } catch (Throwable th) {
            return false;
        }
    }

    public static boolean safeIsNativeTextInputActive() {
        try {
            return isNativeTextInputActive();
        } catch (Throwable th) {
            return false;
        }
    }
}
