package com.pymcl.android.data;

import com.pymcl.runtime.settings.SettingsProtocol;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: AiConfirmOutcome.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0011\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\tR\u0011\u0010\u0013\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0016"}, d2 = {"Lcom/pymcl/android/data/AiConfirmOutcome;", "", "label", "", SettingsProtocol.EXTRA_OK, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", "getLabel", "()Ljava/lang/String;", "getOk", "()Z", "Allowed", "AlwaysInstance", "AlwaysGlobal", "Denied", "Expired", "code", "getCode", "danger", "getDanger", "Companion", "PyMCL-Android:app_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public enum AiConfirmOutcome {
    Allowed("允许", true),
    AlwaysInstance("始终允许（仅当前实例）", true),
    AlwaysGlobal("始终允许（所有实例）", true),
    Denied("拒绝", false),
    Expired("已失效", false);

    private final String label;
    private final boolean ok;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Map<String, AiConfirmOutcome> EN_ALIASES = MapsKt.mapOf(TuplesKt.to("allow", Allowed), TuplesKt.to("allowed", Allowed), TuplesKt.to("always allow (this instance only)", AlwaysInstance), TuplesKt.to("always allow (all instances)", AlwaysGlobal), TuplesKt.to("deny", Denied), TuplesKt.to("denied", Denied), TuplesKt.to("expired", Expired));

    public static EnumEntries<AiConfirmOutcome> getEntries() {
        return $ENTRIES;
    }

    AiConfirmOutcome(String label, boolean ok) {
        this.label = label;
        this.ok = ok;
    }

    public final String getLabel() {
        return this.label;
    }

    public final boolean getOk() {
        return this.ok;
    }

    /* renamed from: getCode, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* compiled from: AiConfirmOutcome.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/pymcl/android/data/AiConfirmOutcome$Companion;", "", "<init>", "()V", "EN_ALIASES", "", "", "Lcom/pymcl/android/data/AiConfirmOutcome;", "of", "resolved", "PyMCL-Android:app_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AiConfirmOutcome of(String resolved) {
            Object next;
            if (resolved == null) {
                return null;
            }
            Iterator<AiConfirmOutcome> it = AiConfirmOutcome.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                AiConfirmOutcome aiConfirmOutcome = (AiConfirmOutcome) next;
                boolean z = true;
                if (!Intrinsics.areEqual(aiConfirmOutcome.getLabel(), resolved) && !StringsKt.equals(aiConfirmOutcome.name(), resolved, true)) {
                    z = false;
                }
                if (z) {
                    break;
                }
            }
            AiConfirmOutcome aiConfirmOutcome2 = (AiConfirmOutcome) next;
            if (aiConfirmOutcome2 != null) {
                return aiConfirmOutcome2;
            }
            Map map = AiConfirmOutcome.EN_ALIASES;
            String lowerCase = StringsKt.trim((CharSequence) resolved).toString().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            AiConfirmOutcome aiConfirmOutcome3 = (AiConfirmOutcome) map.get(lowerCase);
            return aiConfirmOutcome3 == null ? StringsKt.contains$default((CharSequence) resolved, (CharSequence) "拒绝", false, 2, (Object) null) ? AiConfirmOutcome.Denied : AiConfirmOutcome.Allowed : aiConfirmOutcome3;
        }
    }

    public final boolean getDanger() {
        return this == Denied;
    }
}
