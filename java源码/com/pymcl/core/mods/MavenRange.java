package com.pymcl.core.mods;

import com.pymcl.runtime.settings.SettingsProtocol;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* compiled from: ModConflicts.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0002\r\u000eB\u0019\b\u0002\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/pymcl/core/mods/MavenRange;", "", "intervals", "", "Lcom/pymcl/core/mods/MavenRange$Interval;", "<init>", "(Ljava/util/List;)V", "isAny", "", "()Z", "contains", "version", "", "Interval", "Companion", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MavenRange {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<Interval> intervals;

    public /* synthetic */ MavenRange(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    /* compiled from: ModConflicts.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/pymcl/core/mods/MavenRange$Interval;", "", "low", "", "lowInc", "", "high", "highInc", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Z)V", "getLow", "()Ljava/lang/String;", "getLowInc", "()Z", "getHigh", "getHighInc", "contains", SettingsProtocol.EXTRA_VALUE, "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    private static final /* data */ class Interval {
        private final String high;
        private final boolean highInc;
        private final String low;
        private final boolean lowInc;

        public static /* synthetic */ Interval copy$default(Interval interval, String str, boolean z, String str2, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = interval.low;
            }
            if ((i & 2) != 0) {
                z = interval.lowInc;
            }
            if ((i & 4) != 0) {
                str2 = interval.high;
            }
            if ((i & 8) != 0) {
                z2 = interval.highInc;
            }
            return interval.copy(str, z, str2, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLow() {
            return this.low;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getLowInc() {
            return this.lowInc;
        }

        /* renamed from: component3, reason: from getter */
        public final String getHigh() {
            return this.high;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getHighInc() {
            return this.highInc;
        }

        public final Interval copy(String low, boolean lowInc, String high, boolean highInc) {
            return new Interval(low, lowInc, high, highInc);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Interval)) {
                return false;
            }
            Interval interval = (Interval) other;
            return Intrinsics.areEqual(this.low, interval.low) && this.lowInc == interval.lowInc && Intrinsics.areEqual(this.high, interval.high) && this.highInc == interval.highInc;
        }

        public int hashCode() {
            return ((((((this.low == null ? 0 : this.low.hashCode()) * 31) + Boolean.hashCode(this.lowInc)) * 31) + (this.high != null ? this.high.hashCode() : 0)) * 31) + Boolean.hashCode(this.highInc);
        }

        public String toString() {
            return "Interval(low=" + this.low + ", lowInc=" + this.lowInc + ", high=" + this.high + ", highInc=" + this.highInc + ")";
        }

        public Interval(String low, boolean lowInc, String high, boolean highInc) {
            this.low = low;
            this.lowInc = lowInc;
            this.high = high;
            this.highInc = highInc;
        }

        public final String getHigh() {
            return this.high;
        }

        public final boolean getHighInc() {
            return this.highInc;
        }

        public final String getLow() {
            return this.low;
        }

        public final boolean getLowInc() {
            return this.lowInc;
        }

        public final boolean contains(String v) {
            int c;
            Intrinsics.checkNotNullParameter(v, "v");
            if (this.low != null && ((c = ModVersion.INSTANCE.compare(v, this.low)) < 0 || (c == 0 && !this.lowInc))) {
                return false;
            }
            if (this.high == null) {
                return true;
            }
            int c2 = ModVersion.INSTANCE.compare(v, this.high);
            return c2 <= 0 && (c2 != 0 || this.highInc);
        }
    }

    private MavenRange(List<Interval> list) {
        this.intervals = list;
    }

    public final boolean isAny() {
        return this.intervals == null;
    }

    public final boolean contains(String version) {
        Iterable $this$any$iv;
        Intrinsics.checkNotNullParameter(version, "version");
        if (this.intervals == null || StringsKt.isBlank(version)) {
            return true;
        }
        Iterable $this$any$iv2 = this.intervals;
        if (!($this$any$iv2 instanceof Collection) || !((Collection) $this$any$iv2).isEmpty()) {
            Iterator it = $this$any$iv2.iterator();
            while (true) {
                if (it.hasNext()) {
                    Object element$iv = it.next();
                    Interval it2 = (Interval) element$iv;
                    if (it2.contains(version)) {
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

    /* compiled from: ModConflicts.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/pymcl/core/mods/MavenRange$Companion;", "", "<init>", "()V", "parse", "Lcom/pymcl/core/mods/MavenRange;", "spec", "", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final MavenRange parse(String spec) {
            Intrinsics.checkNotNullParameter(spec, "spec");
            String string = StringsKt.trim((CharSequence) spec).toString();
            boolean z = false;
            boolean z2 = true;
            DefaultConstructorMarker defaultConstructorMarker = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if ((string.length() == 0) == false && !Intrinsics.areEqual(string, "*")) {
                char c = '(';
                if (string.charAt(0) == '[' || string.charAt(0) == '(') {
                    ArrayList arrayList = new ArrayList();
                    int i = 0;
                    while (i < string.length()) {
                        while (i < string.length() && (string.charAt(i) == ',' || CharsKt.isWhitespace(string.charAt(i)))) {
                            i++;
                        }
                        if (i >= string.length()) {
                            break;
                        }
                        char cCharAt = string.charAt(i);
                        if (!((cCharAt == '[' || cCharAt == c) ? z2 : z)) {
                            throw new IllegalArgumentException(("非法版本区间: " + spec).toString());
                        }
                        int iIndexOfAny$default = StringsKt.indexOfAny$default((CharSequence) string, new char[]{']', ')'}, i + 1, false, 4, (Object) null);
                        if (!(iIndexOfAny$default > i ? z2 : z)) {
                            throw new IllegalArgumentException(("非法版本区间: " + spec).toString());
                        }
                        String strSubstring = string.substring(i + 1, iIndexOfAny$default);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        char cCharAt2 = string.charAt(iIndexOfAny$default);
                        if (StringsKt.contains$default((CharSequence) strSubstring, ',', z, 2, (Object) null)) {
                            String string2 = StringsKt.trim((CharSequence) StringsKt.substringBefore$default(strSubstring, ',', (String) null, 2, (Object) null)).toString();
                            if (string2.length() == 0 ? z2 : z) {
                                string2 = null;
                            }
                            String str = string2;
                            String string3 = StringsKt.trim((CharSequence) StringsKt.substringAfter$default(strSubstring, ',', (String) null, 2, (Object) null)).toString();
                            if (string3.length() == 0 ? z2 : z) {
                                string3 = null;
                            }
                            String str2 = string3;
                            ArrayList arrayList2 = arrayList;
                            if (cCharAt != '[') {
                                z2 = false;
                            }
                            arrayList2.add(new Interval(str, z2, str2, cCharAt2 == ']'));
                        } else {
                            String string4 = StringsKt.trim((CharSequence) strSubstring).toString();
                            arrayList.add(new Interval(string4, z2, string4, z2));
                        }
                        i = iIndexOfAny$default + 1;
                        z = false;
                        z2 = true;
                        c = '(';
                    }
                    ArrayList arrayList3 = arrayList;
                    if (arrayList3.isEmpty()) {
                        arrayList3 = null;
                    }
                    return new MavenRange(arrayList3, defaultConstructorMarker);
                }
            }
            return new MavenRange(objArr2 == true ? 1 : 0, objArr == true ? 1 : 0);
        }
    }
}
