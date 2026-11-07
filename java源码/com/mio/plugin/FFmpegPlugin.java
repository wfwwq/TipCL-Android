package com.mio.plugin;

import android.content.Context;

/* loaded from: classes16.dex */
public class FFmpegPlugin {
    public static boolean isAvailable = false;
    public static String libraryPath;

    public static void discover(Context context) {
        isAvailable = false;
        libraryPath = null;
    }
}
