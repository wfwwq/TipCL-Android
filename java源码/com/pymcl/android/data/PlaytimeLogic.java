package com.pymcl.android.data;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: MiscLogic.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JJ\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u0005J\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u0005J\u001c\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u0005J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0012Ê\u0001\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0017"}, d2 = {"Lcom/pymcl/android/data/PlaytimeLogic;", "", "<init>", "()V", "filter", "", "T", "rows", "instanceOf", "Lkotlin/Function1;", "", "range", "", "instances", "rangeOptions", "clampRange", "startText", "epochSec", "", "zone", "Ljava/util/TimeZone;", "durationText", "sec", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class PlaytimeLogic {
    public static final int $stable = 0;
    public static final PlaytimeLogic INSTANCE = new PlaytimeLogic();

    private PlaytimeLogic() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> List<T> filter(List<? extends T> rows, Function1<? super T, String> instanceOf, int range, List<String> instances) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(instanceOf, "instanceOf");
        Intrinsics.checkNotNullParameter(instances, "instances");
        String name = (String) CollectionsKt.getOrNull(instances, range - 1);
        if (name == null) {
            return rows;
        }
        Collection arrayList = new ArrayList();
        for (Object obj : rows) {
            if (Intrinsics.areEqual(instanceOf.invoke(obj), name)) {
                arrayList.add(obj);
            }
        }
        return (List) arrayList;
    }

    public final List<String> rangeOptions(List<String> instances) {
        Intrinsics.checkNotNullParameter(instances, "instances");
        return CollectionsKt.plus((Collection) CollectionsKt.listOf("全部实例"), (Iterable) instances);
    }

    public final int clampRange(int range, List<String> instances) {
        Intrinsics.checkNotNullParameter(instances, "instances");
        if (range >= 0 && range <= instances.size()) {
            return range;
        }
        return 0;
    }

    public static /* synthetic */ String startText$default(PlaytimeLogic playtimeLogic, long j, TimeZone timeZone, int i, Object obj) {
        if ((i & 2) != 0) {
            timeZone = TimeZone.getDefault();
            Intrinsics.checkNotNullExpressionValue(timeZone, "getDefault(...)");
        }
        return playtimeLogic.startText(j, timeZone);
    }

    public final String startText(long epochSec, TimeZone zone) {
        Intrinsics.checkNotNullParameter(zone, "zone");
        if (epochSec <= 0) {
            return "—";
        }
        SimpleDateFormat f = new SimpleDateFormat("MM-dd HH:mm", Locale.ROOT);
        f.setTimeZone(zone);
        String str = f.format(new Date(1000 * epochSec));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public final String durationText(long sec) {
        StringBuilder sbAppend;
        String str;
        if (sec < 60) {
            sbAppend = new StringBuilder().append(RangesKt.coerceAtLeast(sec, 0L));
            str = "s";
        } else {
            sbAppend = new StringBuilder().append(RangesKt.coerceAtLeast((30 + sec) / 60, 1L));
            str = "m";
        }
        return sbAppend.append(str).toString();
    }
}
