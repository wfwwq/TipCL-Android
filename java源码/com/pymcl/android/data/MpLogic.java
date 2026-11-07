package com.pymcl.android.data;

import com.pymcl.android.ui.state.MpPhase;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: MiscLogic.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J$\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bJ\u0016\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000bÊ\u0001\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0010"}, d2 = {"Lcom/pymcl/android/data/MpLogic;", "", "<init>", "()V", "canDisconnect", "", "p", "Lcom/pymcl/android/ui/state/MpPhase;", "kernelRunning", "codeHint", "Lkotlin/Pair;", "", "code", "kind", "canEnter", "serverUrl", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class MpLogic {
    public static final int $stable = 0;
    public static final MpLogic INSTANCE = new MpLogic();

    private MpLogic() {
    }

    public final boolean canDisconnect(MpPhase p) {
        Intrinsics.checkNotNullParameter(p, "p");
        return p == MpPhase.HostScanning || p == MpPhase.Hosting || p == MpPhase.GuestJoining || p == MpPhase.GuestReady || p == MpPhase.Error;
    }

    public final boolean kernelRunning(MpPhase p) {
        Intrinsics.checkNotNullParameter(p, "p");
        return (p == MpPhase.Stopped || p == MpPhase.NotInstalled) ? false : true;
    }

    public final Pair<Boolean, String> codeHint(String code, String kind) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(kind, "kind");
        return StringsKt.isBlank(code) ? TuplesKt.to(false, null) : Intrinsics.areEqual(kind, "TERRACOTTA") ? TuplesKt.to(true, null) : Intrinsics.areEqual(kind, "LEGACY_PCL") ? TuplesKt.to(false, "这是旧版 PCL 联机房间号，与陶瓦联机不互通") : TuplesKt.to(false, "邀请码格式不正确（应为 U/XXXX-XXXX-XXXX-XXXX）");
    }

    public final boolean canEnter(MpPhase p, String serverUrl) {
        Intrinsics.checkNotNullParameter(p, "p");
        Intrinsics.checkNotNullParameter(serverUrl, "serverUrl");
        return p == MpPhase.GuestReady && !StringsKt.isBlank(serverUrl);
    }
}
