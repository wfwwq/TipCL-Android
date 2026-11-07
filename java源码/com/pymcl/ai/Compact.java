package com.pymcl.ai;

import androidx.autofill.HintConstants;
import com.pymcl.core.util.Json;
import com.pymcl.core.util.JsonKt;
import com.pymcl.multiplayer.TerracottaVpnService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: Prompt.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bJ&\u0010\u0006\u001a\u00020\u00052\u001e\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bj\u0002`\f0\nJ2\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bj\u0002`\f2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bj\u0002`\fJF\u0010\u000f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bj\u0002`\f0\n2\u001e\u0010\u0010\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bj\u0002`\f0\n2\u0006\u0010\u0011\u001a\u00020\u0005JE\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u001e\u0010\u0010\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bj\u0002`\f0\n2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005¢\u0006\u0002\u0010\u0015J \u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bj\u0002`\f2\u0006\u0010\u0017\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/pymcl/ai/Compact;", "", "<init>", "()V", "MAX_HISTORY", "", "estimate", "s", "", "msgs", "", "", "Lcom/pymcl/core/util/JObj;", "sanitize", "m", "window", "history", "turnStart", "cutPoint", "systemTokens", "contextWindow", "(Ljava/util/List;III)Ljava/lang/Integer;", "summaryMessage", TerracottaVpnService.EXTRA_TEXT, "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Compact {
    public static final Compact INSTANCE = new Compact();
    public static final int MAX_HISTORY = 24;

    private Compact() {
    }

    public final int estimate(String s) {
        Intrinsics.checkNotNullParameter(s, "s");
        int cjk = 0;
        int other = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (c > 11904) {
                cjk++;
            } else {
                other++;
            }
        }
        return (other / 4) + cjk + 1;
    }

    public final int estimate(List<? extends Map<String, Object>> msgs) {
        Intrinsics.checkNotNullParameter(msgs, "msgs");
        Iterator<T> it = msgs.iterator();
        int iEstimate = 0;
        while (it.hasNext()) {
            Map it2 = (Map) it.next();
            iEstimate += INSTANCE.estimate(Json.stringify$default(Json.INSTANCE, it2, false, 2, null)) + 4;
        }
        return iEstimate;
    }

    public final Map<String, Object> sanitize(Map<String, Object> m) {
        Intrinsics.checkNotNullParameter(m, "m");
        Pair[] pairArr = new Pair[2];
        boolean z = false;
        pairArr[0] = TuplesKt.to("role", JsonKt.str(m, "role"));
        Object obj = m.get("content");
        if (obj == null) {
            obj = "";
        }
        pairArr[1] = TuplesKt.to("content", obj);
        Map o = JsonKt.jobj(pairArr);
        Object it = m.get("tool_calls");
        if (it != null) {
            if ((it instanceof List ? (List) it : null) != null && (!r7.isEmpty())) {
                z = true;
            }
            if (z) {
                o.put("tool_calls", it);
            }
        }
        String it2 = JsonKt.str(m, "tool_call_id");
        if (it2 != null) {
            o.put("tool_call_id", it2);
        }
        String it3 = JsonKt.str(m, HintConstants.AUTOFILL_HINT_NAME);
        if (it3 != null && Intrinsics.areEqual(JsonKt.str(m, "role"), "tool")) {
            o.put(HintConstants.AUTOFILL_HINT_NAME, it3);
        }
        return o;
    }

    public final List<Map<String, Object>> window(List<? extends Map<String, Object>> history, int turnStart) {
        boolean z;
        Object element$iv;
        Intrinsics.checkNotNullParameter(history, "history");
        List<? extends Map<String, Object>> $this$firstOrNull$iv = history;
        Iterator it = $this$firstOrNull$iv.iterator();
        while (true) {
            z = true;
            if (it.hasNext()) {
                element$iv = it.next();
                Map it2 = (Map) element$iv;
                if (Intrinsics.areEqual(it2.get("summary"), (Object) true)) {
                    break;
                }
            } else {
                element$iv = null;
                break;
            }
        }
        Map summary = (Map) element$iv;
        int start = Math.min(RangesKt.coerceAtLeast(turnStart, 0), RangesKt.coerceAtLeast(history.size() - 24, 0));
        while (start < history.size() && Intrinsics.areEqual(JsonKt.str(history.get(start), "role"), "tool")) {
            start++;
        }
        Iterable $this$filter$iv = history.subList(start, history.size());
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            Map it3 = (Map) element$iv$iv;
            boolean z2 = z;
            if (!Intrinsics.areEqual(it3.get("summary"), Boolean.valueOf(z2))) {
                destination$iv$iv.add(element$iv$iv);
            }
            z = z2;
        }
        List w = (List) destination$iv$iv;
        return CollectionsKt.plus((Collection) CollectionsKt.listOfNotNull(summary), (Iterable) w);
    }

    public final Integer cutPoint(List<? extends Map<String, Object>> history, int systemTokens, int contextWindow, int turnStart) {
        Intrinsics.checkNotNullParameter(history, "history");
        int budget = (int) (contextWindow * 0.75d);
        if (estimate(history) + systemTokens <= budget) {
            return null;
        }
        int keepFrom = RangesKt.coerceAtMost(RangesKt.coerceAtLeast(history.size() - 8, 0), RangesKt.coerceAtLeast(turnStart, 0));
        int cut = keepFrom;
        while (cut > 0 && !Intrinsics.areEqual(JsonKt.str(history.get(cut), "role"), "user")) {
            cut--;
        }
        Integer numValueOf = Integer.valueOf(cut);
        int it = numValueOf.intValue();
        if (it > 0) {
            return numValueOf;
        }
        return null;
    }

    public final Map<String, Object> summaryMessage(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return JsonKt.jobj(TuplesKt.to("role", "user"), TuplesKt.to("content", "[较早的对话已压缩成摘要]\n" + text), TuplesKt.to("summary", true), TuplesKt.to("hidden", true));
    }
}
