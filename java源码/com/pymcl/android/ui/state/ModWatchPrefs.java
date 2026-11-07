package com.pymcl.android.ui.state;

import com.pymcl.android.data.LauncherPrefs;
import com.pymcl.android.ui.state.ModWatchPrefs;
import com.pymcl.runtime.settings.CrossProcessPrefs;
import com.pymcl.runtime.settings.SettingsProtocol;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModUpdateWatcher.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017BW\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0003\u0012\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\t0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016Ê\u0001\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0018"}, d2 = {"Lcom/pymcl/android/ui/state/ModWatchPrefs;", "", "getBool", "Lkotlin/Function2;", "", "", "getLongFn", "", SettingsProtocol.PUT, "", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", SettingsProtocol.EXTRA_VALUE, "enabled", "getEnabled", "()Z", "setEnabled", "(Z)V", "lastCheck", "getLastCheck", "()J", "setLastCheck", "(J)V", "Companion", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class ModWatchPrefs {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Function2<String, Boolean, Boolean> getBool;
    private final Function2<String, Long, Long> getLongFn;
    private final Function2<String, Object, Unit> put;

    /* JADX WARN: Multi-variable type inference failed */
    public ModWatchPrefs(Function2<? super String, ? super Boolean, Boolean> getBool, Function2<? super String, ? super Long, Long> getLongFn, Function2<? super String, Object, Unit> put) {
        Intrinsics.checkNotNullParameter(getBool, "getBool");
        Intrinsics.checkNotNullParameter(getLongFn, "getLongFn");
        Intrinsics.checkNotNullParameter(put, "put");
        this.getBool = getBool;
        this.getLongFn = getLongFn;
        this.put = put;
    }

    public final boolean getEnabled() {
        return this.getBool.invoke(LauncherPrefs.BG_MOD_CHECK, false).booleanValue();
    }

    public final void setEnabled(boolean v) {
        this.put.invoke(LauncherPrefs.BG_MOD_CHECK, Boolean.valueOf(v));
    }

    public final long getLastCheck() {
        return this.getLongFn.invoke(LauncherPrefs.BG_MOD_CHECK_LAST, 0L).longValue();
    }

    /* compiled from: ModUpdateWatcher.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/pymcl/android/ui/state/ModWatchPrefs$Companion;", "", "<init>", "()V", "of", "Lcom/pymcl/android/ui/state/ModWatchPrefs;", "p", "Lcom/pymcl/runtime/settings/CrossProcessPrefs;", "PyMCL-Android:app_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit of$lambda$0(CrossProcessPrefs $p, String k, Object v) {
            Intrinsics.checkNotNullParameter(k, "k");
            $p.put(k, v);
            return Unit.INSTANCE;
        }

        public final ModWatchPrefs of(final CrossProcessPrefs p) {
            Intrinsics.checkNotNullParameter(p, "p");
            return new ModWatchPrefs(new ModWatchPrefs$Companion$of$1(p), new ModWatchPrefs$Companion$of$2(p), new Function2() { // from class: com.pymcl.android.ui.state.ModWatchPrefs$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ModWatchPrefs.Companion.of$lambda$0(p, (String) obj, obj2);
                }
            });
        }
    }

    public final void setLastCheck(long v) {
        this.put.invoke(LauncherPrefs.BG_MOD_CHECK_LAST, Long.valueOf(v));
    }
}
