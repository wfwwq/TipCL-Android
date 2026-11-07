package com.pymcl.core.mods;

import com.pymcl.core.util.JsonKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModConflicts.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fj\u0002`\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0010J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0010HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\n¨\u0006\u001d"}, d2 = {"Lcom/pymcl/core/mods/ConflictReport;", "", "mods", "", "Lcom/pymcl/core/mods/ModMeta;", "issues", "Lcom/pymcl/core/mods/ConflictIssue;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getMods", "()Ljava/util/List;", "getIssues", "topLevel", "getTopLevel", "toJson", "", "", "Lcom/pymcl/core/util/JObj;", "mc", "loader", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ConflictReport {
    private final List<ConflictIssue> issues;
    private final List<ModMeta> mods;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConflictReport copy$default(ConflictReport conflictReport, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = conflictReport.mods;
        }
        if ((i & 2) != 0) {
            list2 = conflictReport.issues;
        }
        return conflictReport.copy(list, list2);
    }

    public final List<ModMeta> component1() {
        return this.mods;
    }

    public final List<ConflictIssue> component2() {
        return this.issues;
    }

    public final ConflictReport copy(List<ModMeta> mods, List<ConflictIssue> issues) {
        Intrinsics.checkNotNullParameter(mods, "mods");
        Intrinsics.checkNotNullParameter(issues, "issues");
        return new ConflictReport(mods, issues);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConflictReport)) {
            return false;
        }
        ConflictReport conflictReport = (ConflictReport) other;
        return Intrinsics.areEqual(this.mods, conflictReport.mods) && Intrinsics.areEqual(this.issues, conflictReport.issues);
    }

    public int hashCode() {
        return (this.mods.hashCode() * 31) + this.issues.hashCode();
    }

    public String toString() {
        return "ConflictReport(mods=" + this.mods + ", issues=" + this.issues + ")";
    }

    public ConflictReport(List<ModMeta> mods, List<ConflictIssue> issues) {
        Intrinsics.checkNotNullParameter(mods, "mods");
        Intrinsics.checkNotNullParameter(issues, "issues");
        this.mods = mods;
        this.issues = issues;
    }

    public final List<ConflictIssue> getIssues() {
        return this.issues;
    }

    public final List<ModMeta> getMods() {
        return this.mods;
    }

    public final List<ModMeta> getTopLevel() {
        Iterable $this$filter$iv = this.mods;
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            ModMeta it = (ModMeta) element$iv$iv;
            if (it.getNestedIn() == null) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        return (List) destination$iv$iv;
    }

    public static /* synthetic */ Map toJson$default(ConflictReport conflictReport, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        return conflictReport.toJson(str, str2);
    }

    public final Map<String, Object> toJson(String mc, String loader) {
        Intrinsics.checkNotNullParameter(mc, "mc");
        Intrinsics.checkNotNullParameter(loader, "loader");
        Pair[] pairArr = new Pair[5];
        int i = 0;
        pairArr[0] = TuplesKt.to("minecraft", mc);
        pairArr[1] = TuplesKt.to("loader", loader);
        Iterable $this$map$iv = getTopLevel();
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            ModMeta it = (ModMeta) item$iv$iv;
            destination$iv$iv.add(it.getFile());
        }
        pairArr[2] = TuplesKt.to("mods", Long.valueOf(CollectionsKt.distinct((List) destination$iv$iv).size()));
        Iterable $this$count$iv = this.mods;
        if (!($this$count$iv instanceof Collection) || !((Collection) $this$count$iv).isEmpty()) {
            int count$iv = 0;
            for (Object element$iv : $this$count$iv) {
                ModMeta it2 = (ModMeta) element$iv;
                ModMeta it3 = it2.getNestedIn() != null ? 1 : null;
                if (it3 != null && (count$iv = count$iv + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
            i = count$iv;
        }
        pairArr[3] = TuplesKt.to("nested_mods", Long.valueOf(i));
        Iterable $this$map$iv2 = this.issues;
        Collection destination$iv$iv2 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv2, 10));
        for (Object item$iv$iv2 : $this$map$iv2) {
            ConflictIssue it4 = (ConflictIssue) item$iv$iv2;
            destination$iv$iv2.add(it4.toJson());
        }
        pairArr[4] = TuplesKt.to("issues", CollectionsKt.toMutableList(destination$iv$iv2));
        return JsonKt.jobj(pairArr);
    }
}
