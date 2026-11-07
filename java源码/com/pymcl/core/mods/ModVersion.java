package com.pymcl.core.mods;

import com.pymcl.runtime.settings.SettingsProtocol;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ModConflicts.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J$\u0010\t\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0002¨\u0006\r"}, d2 = {"Lcom/pymcl/core/mods/ModVersion;", "", "<init>", "()V", "compare", "", "a", "", "b", "cmpParts", "x", "", "y", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ModVersion {
    public static final ModVersion INSTANCE = new ModVersion();

    private ModVersion() {
    }

    private static final String compare$norm(String s) {
        return StringsKt.substringBefore$default(StringsKt.removePrefix(StringsKt.removePrefix(StringsKt.trim((CharSequence) s).toString(), (CharSequence) SettingsProtocol.EXTRA_VALUE), (CharSequence) "V"), '+', (String) null, 2, (Object) null);
    }

    public final int compare(String a, String b) {
        Pair pair;
        Pair pair2;
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        String s = compare$norm(a);
        int i = StringsKt.indexOf$default((CharSequence) s, '-', 0, false, 6, (Object) null);
        if (i < 0) {
            pair = TuplesKt.to(s, "");
        } else {
            String strSubstring = s.substring(0, i);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strSubstring2 = s.substring(i + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            pair = TuplesKt.to(strSubstring, strSubstring2);
        }
        String am = (String) pair.component1();
        String ap = (String) pair.component2();
        String s2 = compare$norm(b);
        int i2 = StringsKt.indexOf$default((CharSequence) s2, '-', 0, false, 6, (Object) null);
        if (i2 < 0) {
            pair2 = TuplesKt.to(s2, "");
        } else {
            String strSubstring3 = s2.substring(0, i2);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
            String strSubstring4 = s2.substring(i2 + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
            pair2 = TuplesKt.to(strSubstring3, strSubstring4);
        }
        String bm = (String) pair2.component1();
        String bp = (String) pair2.component2();
        int c = cmpParts(StringsKt.split$default((CharSequence) am, new char[]{'.', '_'}, false, 0, 6, (Object) null), StringsKt.split$default((CharSequence) bm, new char[]{'.', '_'}, false, 0, 6, (Object) null));
        if (c != 0) {
            return c;
        }
        if (ap.length() == 0) {
            if (bp.length() == 0) {
                return 0;
            }
        }
        if (ap.length() == 0) {
            return 1;
        }
        if (bp.length() == 0) {
            return -1;
        }
        return cmpParts(StringsKt.split$default((CharSequence) ap, new char[]{'.', '-'}, false, 0, 6, (Object) null), StringsKt.split$default((CharSequence) bp, new char[]{'.', '-'}, false, 0, 6, (Object) null));
    }

    private final int cmpParts(List<String> x, List<String> y) {
        int c;
        int i = 0;
        int iMax = Math.max(x.size(), y.size());
        while (i < iMax) {
            String str = "0";
            String p = i >= 0 && i < x.size() ? x.get(i) : "0";
            if (i >= 0 && i < y.size()) {
                str = y.get(i);
            }
            String q = str;
            Long pn = StringsKt.toLongOrNull(p);
            Long qn = StringsKt.toLongOrNull(q);
            if (pn == null || qn == null) {
                String $this$takeWhile$iv = p;
                int index$iv = 0;
                int length = $this$takeWhile$iv.length();
                while (true) {
                    if (index$iv >= length) {
                        break;
                    }
                    char it = $this$takeWhile$iv.charAt(index$iv);
                    if (!Character.isDigit(it)) {
                        String strSubstring = $this$takeWhile$iv.substring(0, index$iv);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        $this$takeWhile$iv = strSubstring;
                        break;
                    }
                    index$iv++;
                }
                Long pd = StringsKt.toLongOrNull($this$takeWhile$iv);
                String $this$takeWhile$iv2 = q;
                int index$iv2 = 0;
                int length2 = $this$takeWhile$iv2.length();
                while (true) {
                    if (index$iv2 >= length2) {
                        break;
                    }
                    char it2 = $this$takeWhile$iv2.charAt(index$iv2);
                    if (!Character.isDigit(it2)) {
                        String strSubstring2 = $this$takeWhile$iv2.substring(0, index$iv2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                        $this$takeWhile$iv2 = strSubstring2;
                        break;
                    }
                    index$iv2++;
                }
                Long qd = StringsKt.toLongOrNull($this$takeWhile$iv2);
                c = (pd == null || qd == null || Intrinsics.areEqual(pd, qd)) ? StringsKt.compareTo(p, q, true) : Intrinsics.compare(pd.longValue(), qd.longValue());
            } else {
                c = Intrinsics.compare(pn.longValue(), qn.longValue());
            }
            if (c != 0) {
                return c;
            }
            i++;
        }
        return 0;
    }
}
