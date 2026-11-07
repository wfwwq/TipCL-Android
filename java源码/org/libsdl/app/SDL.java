package org.libsdl.app;

import android.app.Activity;
import android.content.Context;
import java.lang.reflect.Method;

/* loaded from: classes9.dex */
public class SDL {
    protected static Activity mContext;

    public static void setupJNI() {
        SDLActivity.nativeSetupJNI();
        SDLAudioManager.nativeSetupJNI();
        SDLControllerManager.nativeSetupJNI();
    }

    public static void initialize() {
        setContext(null);
        SDLActivity.initialize();
        SDLAudioManager.initialize();
        SDLControllerManager.initialize();
    }

    public static void setContext(Activity context) {
        SDLAudioManager.setContext(context);
        mContext = context;
    }

    public static Activity getContext() {
        return mContext;
    }

    static void loadLibrary(String libraryName) throws SecurityException, UnsatisfiedLinkError, NullPointerException {
        loadLibrary(libraryName, mContext);
    }

    static void loadLibrary(String libraryName, Context context) throws SecurityException, UnsatisfiedLinkError, NullPointerException {
        if (libraryName == null) {
            throw new NullPointerException("No library name provided.");
        }
        try {
            Class<?> relinkClass = context.getClassLoader().loadClass("com.getkeepsafe.relinker.ReLinker");
            Class<?> relinkListenerClass = context.getClassLoader().loadClass("com.getkeepsafe.relinker.ReLinker$LoadListener");
            Class<?> contextClass = context.getClassLoader().loadClass("android.content.Context");
            Class<?> stringClass = context.getClassLoader().loadClass("java.lang.String");
            Method forceMethod = relinkClass.getDeclaredMethod("force", new Class[0]);
            Object relinkInstance = forceMethod.invoke(null, new Object[0]);
            Class<?> relinkInstanceClass = relinkInstance.getClass();
            Method loadMethod = relinkInstanceClass.getDeclaredMethod("loadLibrary", contextClass, stringClass, stringClass, relinkListenerClass);
            loadMethod.invoke(relinkInstance, context, libraryName, null, null);
        } catch (Throwable th) {
            try {
                System.loadLibrary(libraryName);
            } catch (SecurityException se) {
                throw se;
            } catch (UnsatisfiedLinkError ule) {
                throw ule;
            }
        }
    }
}
