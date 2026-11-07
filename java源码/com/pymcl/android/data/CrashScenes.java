package com.pymcl.android.data;

import com.pymcl.android.ui.state.CrashScene;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MiscLogic.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000Ê\u0001\f\b\r\u0012\b\b\u000e\u0012\u0004\b\u0003\u0010\u0002¨\u0006\f"}, d2 = {"Lcom/pymcl/android/data/CrashScenes;", "", "<init>", "()V", "LAUNCH_FAIL_SECONDS", "", "ofGameExit", "Lcom/pymcl/android/ui/state/CrashScene;", "durationSec", "ofTaskKind", "kind", "", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class CrashScenes {
    public static final int $stable = 0;
    public static final CrashScenes INSTANCE = new CrashScenes();
    public static final long LAUNCH_FAIL_SECONDS = 30;

    private CrashScenes() {
    }

    public final CrashScene ofGameExit(long durationSec) {
        boolean z = false;
        if (0 <= durationSec && durationSec < 30) {
            z = true;
        }
        return z ? CrashScene.LAUNCH : CrashScene.GAME_RUN;
    }

    public final CrashScene ofTaskKind(String kind) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        return Intrinsics.areEqual(kind, "launch") ? CrashScene.LAUNCH : CrashScene.TASK;
    }
}
