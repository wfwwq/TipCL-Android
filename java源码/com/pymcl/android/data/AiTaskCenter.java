package com.pymcl.android.data;

import com.pymcl.ai.AiText;
import com.pymcl.ai.BgClearResult;
import com.pymcl.ai.BgTaskInfo;
import com.pymcl.runtime.input.InputSettings;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: AiTaskCenter.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tJ\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020\fJ(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJL\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cJ,\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00182\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cJ\u0014\u0010\u001f\u001a\u00020 2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ(\u0010!\u001a\u00020\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0016J\"\u0010\"\u001a\u0004\u0018\u00010\u00062\u0006\u0010#\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010\u00062\u0006\u0010%\u001a\u00020\tJ\u0016\u0010&\u001a\u00020 2\u0006\u0010'\u001a\u00020 2\u0006\u0010%\u001a\u00020 J\"\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060)2\u0006\u0010\u000e\u001a\u00020\fJ\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060)2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u000e\u0010,\u001a\u00020\u00182\u0006\u0010-\u001a\u00020 J\"\u0010.\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010/\u001a\u000200J*\u00101\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006022\u0006\u0010/\u001a\u0002002\b\b\u0002\u0010\b\u001a\u00020\tJ\u0014\u00103\u001a\u00020\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000bÊ\u0001\f\b5\u0012\b\b6\u0012\u0004\b\u0003\u0010\u0002¨\u00064"}, d2 = {"Lcom/pymcl/android/data/AiTaskCenter;", "", "<init>", "()V", "stateOf", "Lkotlin/Pair;", "", "state", "en", "", "merge", "", "Lcom/pymcl/ai/BgTaskInfo;", "list", "e", "mergeSnapshot", "current", "snapshot", "rows", "Lcom/pymcl/android/data/AiTaskRow;", "tasks", "chatTitles", "", "now", "", "locale", "Ljava/util/Locale;", "tz", "Ljava/util/TimeZone;", "startedText", "ms", "runningCount", "", "needsChatRefresh", "openBlockReason", "targetChat", "runningChat", "aiRunning", "navBadge", "launcherRunning", "applyRunning", "", "ids", "runningIds", "badgePollMs", "running", "afterClear", "r", "Lcom/pymcl/ai/BgClearResult;", "clearMessage", "Lkotlin/Triple;", "canClear", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class AiTaskCenter {
    public static final int $stable = 0;
    public static final AiTaskCenter INSTANCE = new AiTaskCenter();

    private AiTaskCenter() {
    }

    public static /* synthetic */ Pair stateOf$default(AiTaskCenter aiTaskCenter, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = AiText.INSTANCE.getEnglish().invoke().booleanValue();
        }
        return aiTaskCenter.stateOf(str, z);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public final Pair<String, String> stateOf(String state, boolean en) {
        Intrinsics.checkNotNullParameter(state, "state");
        switch (state.hashCode()) {
            case -1947652542:
                if (state.equals("interrupted")) {
                    return TuplesKt.to(AiText.INSTANCE.tIn(en, "已中断", new Object[0]), "danger");
                }
                break;
            case 3548:
                if (state.equals(SettingsProtocol.EXTRA_OK)) {
                    return TuplesKt.to(AiText.INSTANCE.tIn(en, "成功", new Object[0]), SettingsProtocol.EXTRA_OK);
                }
                break;
            case 476588369:
                if (state.equals("cancelled")) {
                    return TuplesKt.to(AiText.INSTANCE.tIn(en, "已取消", new Object[0]), "neutral");
                }
                break;
            case 1550783935:
                if (state.equals("running")) {
                    return TuplesKt.to(AiText.INSTANCE.tIn(en, "进行中", new Object[0]), "warn");
                }
                break;
        }
        return TuplesKt.to(AiText.INSTANCE.tIn(en, "失败", new Object[0]), "danger");
    }

    public final List<BgTaskInfo> merge(List<BgTaskInfo> list, BgTaskInfo e) {
        List out;
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(e, "e");
        int i = 0;
        Iterator<BgTaskInfo> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (Intrinsics.areEqual(((BgTaskInfo) it.next()).getId(), e.getId())) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        List<BgTaskInfo> list2 = list;
        if (i >= 0) {
            out = CollectionsKt.toMutableList((Collection) list2);
            out.set(i, e);
        } else {
            out = CollectionsKt.plus((Collection<? extends BgTaskInfo>) list2, e);
        }
        return CollectionsKt.sortedWith(out, new Comparator() { // from class: com.pymcl.android.data.AiTaskCenter$merge$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Long.valueOf(((BgTaskInfo) t).getStartedAt()), Long.valueOf(((BgTaskInfo) t2).getStartedAt()));
            }
        });
    }

    public final List<BgTaskInfo> mergeSnapshot(List<BgTaskInfo> current, List<BgTaskInfo> snapshot) {
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        LinkedHashMap byId = new LinkedHashMap();
        for (BgTaskInfo bgTaskInfo : current) {
            byId.put(bgTaskInfo.getId(), bgTaskInfo);
        }
        for (BgTaskInfo bgTaskInfo2 : snapshot) {
            BgTaskInfo bgTaskInfo3 = (BgTaskInfo) byId.get(bgTaskInfo2.getId());
            byId.put(bgTaskInfo2.getId(), (bgTaskInfo3 == null || bgTaskInfo3.getRunning() || !bgTaskInfo2.getRunning()) ? bgTaskInfo2 : bgTaskInfo3);
        }
        Iterable iterableValues = byId.values();
        Intrinsics.checkNotNullExpressionValue(iterableValues, "<get-values>(...)");
        return CollectionsKt.sortedWith(iterableValues, new Comparator() { // from class: com.pymcl.android.data.AiTaskCenter$mergeSnapshot$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Long.valueOf(((BgTaskInfo) t).getStartedAt()), Long.valueOf(((BgTaskInfo) t2).getStartedAt()));
            }
        });
    }

    public static /* synthetic */ List rows$default(AiTaskCenter aiTaskCenter, List list, Map map, long j, Locale locale, TimeZone timeZone, int i, Object obj) {
        if ((i & 4) != 0) {
            j = System.currentTimeMillis();
        }
        long j2 = j;
        if ((i & 8) != 0) {
            locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        }
        Locale locale2 = locale;
        if ((i & 16) != 0) {
            timeZone = TimeZone.getDefault();
            Intrinsics.checkNotNullExpressionValue(timeZone, "getDefault(...)");
        }
        return aiTaskCenter.rows(list, map, j2, locale2, timeZone);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.pymcl.android.data.AiTaskRow> rows(java.util.List<com.pymcl.ai.BgTaskInfo> r30, java.util.Map<java.lang.String, java.lang.String> r31, long r32, java.util.Locale r34, java.util.TimeZone r35) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.AiTaskCenter.rows(java.util.List, java.util.Map, long, java.util.Locale, java.util.TimeZone):java.util.List");
    }

    public static /* synthetic */ String startedText$default(AiTaskCenter aiTaskCenter, long j, long j2, Locale locale, TimeZone timeZone, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = System.currentTimeMillis();
        }
        long j3 = j2;
        if ((i & 4) != 0) {
            locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        }
        Locale locale2 = locale;
        if ((i & 8) != 0) {
            timeZone = TimeZone.getDefault();
            Intrinsics.checkNotNullExpressionValue(timeZone, "getDefault(...)");
        }
        return aiTaskCenter.startedText(j, j3, locale2, timeZone);
    }

    public final String startedText(long ms, long now, Locale locale, TimeZone tz) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(tz, "tz");
        if (ms <= 0) {
            return "";
        }
        SimpleDateFormat day = new SimpleDateFormat("yyyyMMdd", locale);
        day.setTimeZone(tz);
        String fmt = Intrinsics.areEqual(day.format(new Date(ms)), day.format(new Date(now))) ? "HH:mm" : "MM-dd HH:mm";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(fmt, locale);
        simpleDateFormat.setTimeZone(tz);
        String str = simpleDateFormat.format(new Date(ms));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public final int runningCount(List<BgTaskInfo> tasks) {
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        List<BgTaskInfo> list = tasks;
        if ((list instanceof Collection) && list.isEmpty()) {
            return 0;
        }
        int i = 0;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((BgTaskInfo) it.next()).getRunning() && (i = i + 1) < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        return i;
    }

    public final boolean needsChatRefresh(List<BgTaskInfo> tasks, Map<String, String> chatTitles) {
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        Intrinsics.checkNotNullParameter(chatTitles, "chatTitles");
        List<BgTaskInfo> list = tasks;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (BgTaskInfo bgTaskInfo : list) {
            if (((!(bgTaskInfo.getChatId().length() > 0) || chatTitles.containsKey(bgTaskInfo.getChatId())) ? null : 1) != null) {
                return true;
            }
        }
        return false;
    }

    public final String openBlockReason(String targetChat, String runningChat, boolean aiRunning) {
        Intrinsics.checkNotNullParameter(targetChat, "targetChat");
        if (!aiRunning || runningChat == null || Intrinsics.areEqual(runningChat, targetChat)) {
            return null;
        }
        return AiText.INSTANCE.t("助手正在另一个对话里工作，等它说完再切换", new Object[0]);
    }

    public final int navBadge(int launcherRunning, int aiRunning) {
        return RangesKt.coerceAtLeast(launcherRunning, 0) + RangesKt.coerceAtLeast(aiRunning, 0);
    }

    public final Set<String> applyRunning(Set<String> ids, BgTaskInfo e) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(e, "e");
        return e.getRunning() ? SetsKt.plus(ids, e.getId()) : SetsKt.minus(ids, e.getId());
    }

    public final Set<String> runningIds(List<BgTaskInfo> snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Collection arrayList = new ArrayList();
        for (Object obj : snapshot) {
            if (((BgTaskInfo) obj).getRunning()) {
                arrayList.add(obj);
            }
        }
        Iterable iterable = (List) arrayList;
        Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList2.add(((BgTaskInfo) it.next()).getId());
        }
        return CollectionsKt.toSet((List) arrayList2);
    }

    public final long badgePollMs(int running) {
        if (running > 0) {
            return InputSettings.MAX_LONG_PRESS_MS;
        }
        return 30000L;
    }

    public final List<BgTaskInfo> afterClear(List<BgTaskInfo> tasks, BgClearResult r) {
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        Intrinsics.checkNotNullParameter(r, "r");
        Set gone = CollectionsKt.toSet(r.getRemovedIds());
        Collection arrayList = new ArrayList();
        for (Object obj : tasks) {
            if (!gone.contains(((BgTaskInfo) obj).getId())) {
                arrayList.add(obj);
            }
        }
        return (List) arrayList;
    }

    public static /* synthetic */ Triple clearMessage$default(AiTaskCenter aiTaskCenter, BgClearResult bgClearResult, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = AiText.INSTANCE.getEnglish().invoke().booleanValue();
        }
        return aiTaskCenter.clearMessage(bgClearResult, z);
    }

    public final Triple<String, String, String> clearMessage(BgClearResult r, boolean en) {
        Intrinsics.checkNotNullParameter(r, "r");
        return (r.getRemoved() == 0 && r.getKeptUnreported() == 0) ? new Triple<>(AiText.INSTANCE.tIn(en, "没有已结束的 AI 任务记录", new Object[0]), "", "info") : r.getRemoved() == 0 ? new Triple<>(AiText.INSTANCE.tIn(en, "暂时没有可清除的记录", new Object[0]), AiText.INSTANCE.tIn(en, "{0} 条结果还没汇报给助手，汇报后再清除", Integer.valueOf(r.getKeptUnreported())), "info") : r.getKeptUnreported() > 0 ? new Triple<>(AiText.INSTANCE.tIn(en, "已清除 {0} 条 AI 任务记录", Integer.valueOf(r.getRemoved())), AiText.INSTANCE.tIn(en, "{0} 条结果还没汇报给助手，汇报后再清除", Integer.valueOf(r.getKeptUnreported())), SettingsProtocol.EXTRA_OK) : new Triple<>(AiText.INSTANCE.tIn(en, "已清除 {0} 条 AI 任务记录", Integer.valueOf(r.getRemoved())), "", SettingsProtocol.EXTRA_OK);
    }

    public final boolean canClear(List<BgTaskInfo> tasks) {
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        List<BgTaskInfo> list = tasks;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((BgTaskInfo) it.next()).getRunning()) {
                return true;
            }
        }
        return false;
    }
}
