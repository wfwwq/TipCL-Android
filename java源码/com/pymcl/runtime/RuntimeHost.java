package com.pymcl.runtime;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import com.mio.plugin.DriverPlugin;
import com.tungsten.fcl.FCLApp;
import com.tungsten.fclauncher.utils.FCLPath;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RuntimeHost.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007b\u0002\b\nJ\u001c\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007b\u0002\b\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/pymcl/runtime/RuntimeHost;", "", "<init>", "()V", "initialized", "", "init", "", "context", "Landroid/content/Context;", "Lkotlin/jvm/JvmStatic;", "openFolder", "activity", "Landroid/app/Activity;", "path", "", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RuntimeHost {
    public static final RuntimeHost INSTANCE = new RuntimeHost();
    private static volatile boolean initialized;

    private RuntimeHost() {
    }

    @JvmStatic
    public static final void init(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (initialized) {
            return;
        }
        FCLApp.init(context);
        FCLPath.loadPaths(context);
        DriverPlugin.init(context);
        initialized = true;
    }

    @JvmStatic
    public static final void openFolder(Activity activity, String path) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(path, "path");
        Toast.makeText(activity, path, 1).show();
    }
}
