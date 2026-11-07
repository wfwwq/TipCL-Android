package com.pymcl.core.mods;

import com.pymcl.runtime.settings.SettingsProtocol;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: ModConflicts.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0002J \u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002¨\u0006\u0012"}, d2 = {"Lcom/pymcl/core/mods/FabricPredicate;", "", "<init>", "()V", "matches", "", "spec", "version", "", "matchesOne", "single", "p", SettingsProtocol.EXTRA_VALUE, "sameParts", "a", "b", "n", "", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FabricPredicate {
    public static final FabricPredicate INSTANCE = new FabricPredicate();

    private FabricPredicate() {
    }

    public final boolean matches(Object spec, String version) {
        Iterable $this$any$iv;
        String string;
        Intrinsics.checkNotNullParameter(version, "version");
        if (spec == null) {
            return true;
        }
        if (spec instanceof String) {
            return matchesOne((String) spec, version);
        }
        if (!(spec instanceof List) || ((List) spec).isEmpty()) {
            return true;
        }
        Iterable $this$any$iv2 = (Iterable) spec;
        if (!($this$any$iv2 instanceof Collection) || !((Collection) $this$any$iv2).isEmpty()) {
            Iterator it = $this$any$iv2.iterator();
            while (true) {
                if (it.hasNext()) {
                    Object element$iv = it.next();
                    FabricPredicate fabricPredicate = INSTANCE;
                    if (element$iv == null || (string = element$iv.toString()) == null) {
                        string = "*";
                    }
                    if (fabricPredicate.matchesOne(string, version)) {
                        $this$any$iv = 1;
                        break;
                    }
                } else {
                    $this$any$iv = null;
                    break;
                }
            }
        } else {
            $this$any$iv = null;
        }
        return $this$any$iv != null;
    }

    public final boolean matchesOne(String spec, String version) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        Intrinsics.checkNotNullParameter(version, "version");
        String s = StringsKt.trim((CharSequence) spec).toString();
        if ((s.length() == 0) || Intrinsics.areEqual(s, "*") || StringsKt.isBlank(version)) {
            return true;
        }
        Iterable $this$all$iv = new Regex("\\s+").split(s, 0);
        if (($this$all$iv instanceof Collection) && ((Collection) $this$all$iv).isEmpty()) {
            return true;
        }
        for (Object element$iv : $this$all$iv) {
            String it = (String) element$iv;
            if (!INSTANCE.single(it, version)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0103 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0106 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010b A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010e A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean single(java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.mods.FabricPredicate.single(java.lang.String, java.lang.String):boolean");
    }

    private final boolean sameParts(String a, String b, int n) {
        List x = StringsKt.split$default((CharSequence) StringsKt.substringBefore$default(StringsKt.substringBefore$default(a, '+', (String) null, 2, (Object) null), '-', (String) null, 2, (Object) null), new char[]{'.'}, false, 0, 6, (Object) null);
        List y = StringsKt.split$default((CharSequence) StringsKt.substringBefore$default(StringsKt.substringBefore$default(b, '+', (String) null, 2, (Object) null), '-', (String) null, 2, (Object) null), new char[]{'.'}, false, 0, 6, (Object) null);
        Iterable $this$all$iv = RangesKt.until(0, n);
        if (($this$all$iv instanceof Collection) && ((Collection) $this$all$iv).isEmpty()) {
            return true;
        }
        Iterator it = $this$all$iv.iterator();
        while (it.hasNext()) {
            int element$iv = ((IntIterator) it).nextInt();
            Object obj = "0";
            String str = element$iv >= 0 && element$iv < x.size() ? x.get(element$iv) : "0";
            if (element$iv >= 0 && element$iv < y.size()) {
                obj = y.get(element$iv);
            }
            if (!Intrinsics.areEqual(str, obj)) {
                return false;
            }
        }
        return true;
    }
}
