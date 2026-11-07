package com.pymcl.android.ui.state;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: AppState.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"}, d2 = {"sampleCrash", "Lcom/pymcl/android/ui/state/CrashInfo;", "PyMCL-Android:app_debug"}, k = 2, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class AppStateKt {
    public static final CrashInfo sampleCrash() {
        return new CrashInfo("默认", "1.21.1-Fabric 0.16.5", -1, "模组缺少依赖", "Sodium 0.6.13 需要 Fabric API ≥ 0.100，但实例里没有找到。装上依赖后再启动。", CollectionsKt.listOf((Object[]) new String[]{"安装缺失的依赖", "禁用冲突模组"}), CollectionsKt.listOf((Object[]) new String[]{"[main/ERROR]: Incompatible mods found!", "net.fabricmc.loader.impl.FormattedException: Mod resolution encountered an incompatible mod set!", "A potential solution has been determined:", "\t - Install fabric-api, version 0.100.0 or later."}), null, null, 384, null);
    }
}
