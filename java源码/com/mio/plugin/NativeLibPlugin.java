package com.mio.plugin;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NativeLibPlugin.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0007b\u0002\b\u0007J\u0018\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\tH\u0007b\u0002\b\u0007¨\u0006\n"}, d2 = {"Lcom/mio/plugin/NativeLibPlugin;", "", "<init>", "()V", "getPaths", "", "split", "Lkotlin/jvm/JvmStatic;", "getJVMEnv", "", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class NativeLibPlugin {
    public static final NativeLibPlugin INSTANCE = new NativeLibPlugin();

    private NativeLibPlugin() {
    }

    @JvmStatic
    public static final String getPaths(String split) {
        Intrinsics.checkNotNullParameter(split, "split");
        return "";
    }

    @JvmStatic
    public static final Map<String, String> getJVMEnv() {
        return MapsKt.emptyMap();
    }
}
