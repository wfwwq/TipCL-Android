package com.pymcl.core.mods;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContentExport.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\"\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005J \u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005J@\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u0002H\u00100\u000e0\r\"\u0004\b\u0000\u0010\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u0002H\u00100\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/pymcl/core/mods/ModUpdateSchedule;", "", "<init>", "()V", "DEFAULT_INTERVAL", "", "due", "", "lastMs", "nowMs", "intervalMs", "delayUntilNext", "pick", "", "Lkotlin/Pair;", "", "T", "updates", "", "chosen", "", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ModUpdateSchedule {
    public static final long DEFAULT_INTERVAL = 21600000;
    public static final ModUpdateSchedule INSTANCE = new ModUpdateSchedule();

    private ModUpdateSchedule() {
    }

    public static /* synthetic */ boolean due$default(ModUpdateSchedule modUpdateSchedule, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j3 = DEFAULT_INTERVAL;
        }
        return modUpdateSchedule.due(j, j2, j3);
    }

    public final boolean due(long lastMs, long nowMs, long intervalMs) {
        return lastMs <= 0 || nowMs < lastMs || nowMs - lastMs >= intervalMs;
    }

    public static /* synthetic */ long delayUntilNext$default(ModUpdateSchedule modUpdateSchedule, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j3 = DEFAULT_INTERVAL;
        }
        return modUpdateSchedule.delayUntilNext(j, j2, j3);
    }

    public final long delayUntilNext(long lastMs, long nowMs, long intervalMs) {
        if (due(lastMs, nowMs, intervalMs)) {
            return 0L;
        }
        return intervalMs - (nowMs - lastMs);
    }

    public final <T> List<Pair<String, T>> pick(Map<String, ? extends T> updates, Set<String> chosen) {
        Intrinsics.checkNotNullParameter(updates, "updates");
        Intrinsics.checkNotNullParameter(chosen, "chosen");
        LinkedHashMap result$iv = new LinkedHashMap();
        for (Map.Entry entry$iv : updates.entrySet()) {
            String it = entry$iv.getKey();
            if (chosen.contains(it)) {
                result$iv.put(entry$iv.getKey(), entry$iv.getValue());
            }
        }
        LinkedHashMap $this$filterKeys$iv = result$iv;
        return MapsKt.toList($this$filterKeys$iv);
    }
}
