package com.pymcl.core.launch;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlinx.coroutines.DebugKt;

/* compiled from: LaunchArgs.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u000b\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\nR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/pymcl/core/launch/Gc;", "", "<init>", "()V", "PRESETS", "", "", "getPRESETS", "()Ljava/util/Map;", "apply", "", "preset", "jvm", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Gc {
    public static final Gc INSTANCE = new Gc();
    private static final Map<String, String> PRESETS;

    private Gc() {
    }

    public final Map<String, String> getPRESETS() {
        return PRESETS;
    }

    static {
        Map it = MapsKt.mapOf(TuplesKt.to(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "-XX:+UseG1GC -XX:+UnlockExperimentalVMOptions -XX:G1NewSizePercent=20 -XX:G1ReservePercent=20 -XX:MaxGCPauseMillis=50 -XX:G1HeapRegionSize=32M"), TuplesKt.to("g1", "-XX:+UseG1GC"), TuplesKt.to("zgc", "-XX:+UseZGC -XX:+UnlockExperimentalVMOptions"), TuplesKt.to("none", ""));
        PRESETS = MapsKt.plus(it, TuplesKt.to("g1_tuned", it.get(DebugKt.DEBUG_PROPERTY_VALUE_AUTO) + " -XX:+DisableExplicitGC -XX:+AlwaysPreTouch -XX:+ParallelRefProcEnabled"));
    }

    public final List<String> apply(String preset, List<String> jvm) {
        Intrinsics.checkNotNullParameter(preset, "preset");
        Intrinsics.checkNotNullParameter(jvm, "jvm");
        List<String> $this$any$iv = jvm;
        boolean z = false;
        if (!($this$any$iv instanceof Collection) || !$this$any$iv.isEmpty()) {
            Iterator it = $this$any$iv.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object element$iv = it.next();
                String it2 = (String) element$iv;
                if (new Regex("^-XX:\\+Use\\w*GC$").matches(it2)) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            return jvm;
        }
        ArgSplit argSplit = ArgSplit.INSTANCE;
        String str = PRESETS.get(preset);
        if (str == null) {
            String str2 = PRESETS.get(DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
            Intrinsics.checkNotNull(str2);
            str = str2;
        }
        return CollectionsKt.plus((Collection) argSplit.split(str), (Iterable) jvm);
    }
}
