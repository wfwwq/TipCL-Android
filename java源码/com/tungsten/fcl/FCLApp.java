package com.tungsten.fcl;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
public final class FCLApp {
    private static WeakReference<Activity> activity = new WeakReference<>(null);
    private static Context appContext;

    private FCLApp() {
    }

    public static void init(Context context) {
        appContext = context.getApplicationContext();
    }

    public static Context getAppContext() {
        return appContext;
    }

    public static Activity getActivity() {
        return activity.get();
    }

    public static void setActivity(Activity a) {
        activity = new WeakReference<>(a);
    }
}
