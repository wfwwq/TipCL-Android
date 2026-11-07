package com.pymcl.core.crash;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CrashAnalyzer.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0011\u0010\u000e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/pymcl/core/crash/CrashReason;", "", "kind", "", "extra", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getKind", "()Ljava/lang/String;", "getExtra", "()Ljava/util/List;", "title", "getTitle", "description", "getDescription", "needHelpFooter", "", "getNeedHelpFooter", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CrashReason {
    private final List<String> extra;
    private final String kind;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CrashReason copy$default(CrashReason crashReason, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = crashReason.kind;
        }
        if ((i & 2) != 0) {
            list = crashReason.extra;
        }
        return crashReason.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    public final List<String> component2() {
        return this.extra;
    }

    public final CrashReason copy(String kind, List<String> extra) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(extra, "extra");
        return new CrashReason(kind, extra);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CrashReason)) {
            return false;
        }
        CrashReason crashReason = (CrashReason) other;
        return Intrinsics.areEqual(this.kind, crashReason.kind) && Intrinsics.areEqual(this.extra, crashReason.extra);
    }

    public int hashCode() {
        return (this.kind.hashCode() * 31) + this.extra.hashCode();
    }

    public String toString() {
        return "CrashReason(kind=" + this.kind + ", extra=" + this.extra + ")";
    }

    public CrashReason(String kind, List<String> extra) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(extra, "extra");
        this.kind = kind;
        this.extra = extra;
    }

    public /* synthetic */ CrashReason(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<String> getExtra() {
        return this.extra;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getTitle() {
        String str = CrashAnalyzer.INSTANCE.getTITLES().get(this.kind);
        return str == null ? "游戏崩溃" : str;
    }

    public final String getDescription() {
        String first;
        Pair<String, Boolean> pair = CrashAnalyzer.INSTANCE.getTABLE().get(this.kind);
        return (pair == null || (first = pair.getFirst()) == null) ? "游戏发生了崩溃（" + this.kind + "）。" : first;
    }

    public final boolean getNeedHelpFooter() {
        Pair<String, Boolean> pair = CrashAnalyzer.INSTANCE.getTABLE().get(this.kind);
        if (pair != null) {
            return pair.getSecond().booleanValue();
        }
        return true;
    }
}
