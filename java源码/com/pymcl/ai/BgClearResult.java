package com.pymcl.ai;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Background.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0004HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u000f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/pymcl/ai/BgClearResult;", "", "removedIds", "", "", "keptRunning", "", "keptUnreported", "<init>", "(Ljava/util/List;II)V", "getRemovedIds", "()Ljava/util/List;", "getKeptRunning", "()I", "getKeptUnreported", "removed", "getRemoved", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BgClearResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int keptRunning;
    private final int keptUnreported;
    private final List<String> removedIds;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BgClearResult copy$default(BgClearResult bgClearResult, List list, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = bgClearResult.removedIds;
        }
        if ((i3 & 2) != 0) {
            i = bgClearResult.keptRunning;
        }
        if ((i3 & 4) != 0) {
            i2 = bgClearResult.keptUnreported;
        }
        return bgClearResult.copy(list, i, i2);
    }

    public final List<String> component1() {
        return this.removedIds;
    }

    /* renamed from: component2, reason: from getter */
    public final int getKeptRunning() {
        return this.keptRunning;
    }

    /* renamed from: component3, reason: from getter */
    public final int getKeptUnreported() {
        return this.keptUnreported;
    }

    public final BgClearResult copy(List<String> removedIds, int keptRunning, int keptUnreported) {
        Intrinsics.checkNotNullParameter(removedIds, "removedIds");
        return new BgClearResult(removedIds, keptRunning, keptUnreported);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BgClearResult)) {
            return false;
        }
        BgClearResult bgClearResult = (BgClearResult) other;
        return Intrinsics.areEqual(this.removedIds, bgClearResult.removedIds) && this.keptRunning == bgClearResult.keptRunning && this.keptUnreported == bgClearResult.keptUnreported;
    }

    public int hashCode() {
        return (((this.removedIds.hashCode() * 31) + Integer.hashCode(this.keptRunning)) * 31) + Integer.hashCode(this.keptUnreported);
    }

    public String toString() {
        return "BgClearResult(removedIds=" + this.removedIds + ", keptRunning=" + this.keptRunning + ", keptUnreported=" + this.keptUnreported + ")";
    }

    public BgClearResult(List<String> removedIds, int keptRunning, int keptUnreported) {
        Intrinsics.checkNotNullParameter(removedIds, "removedIds");
        this.removedIds = removedIds;
        this.keptRunning = keptRunning;
        this.keptUnreported = keptUnreported;
    }

    public final int getKeptRunning() {
        return this.keptRunning;
    }

    public final int getKeptUnreported() {
        return this.keptUnreported;
    }

    public final List<String> getRemovedIds() {
        return this.removedIds;
    }

    /* compiled from: Background.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¨\u0006\u000e"}, d2 = {"Lcom/pymcl/ai/BgClearResult$Companion;", "", "<init>", "()V", "select", "Lcom/pymcl/ai/BgClearResult;", "tasks", "", "Lcom/pymcl/ai/BgTaskInfo;", "keepUnreported", "", "activeJobs", "", "", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BgClearResult select$default(Companion companion, List list, boolean z, Set set, int i, Object obj) {
            if ((i & 4) != 0) {
                set = SetsKt.emptySet();
            }
            return companion.select(list, z, set);
        }

        public final BgClearResult select(List<BgTaskInfo> tasks, boolean keepUnreported, Set<String> activeJobs) {
            List unreported;
            Intrinsics.checkNotNullParameter(tasks, "tasks");
            Intrinsics.checkNotNullParameter(activeJobs, "activeJobs");
            List<BgTaskInfo> $this$filter$iv = tasks;
            Collection destination$iv$iv = new ArrayList();
            for (Object element$iv$iv : $this$filter$iv) {
                BgTaskInfo it = (BgTaskInfo) element$iv$iv;
                if (it.getRunning() || activeJobs.contains(it.getId())) {
                    destination$iv$iv.add(element$iv$iv);
                }
            }
            List running = (List) destination$iv$iv;
            Iterable ended = CollectionsKt.minus((Iterable) tasks, (Iterable) CollectionsKt.toSet(running));
            if (!keepUnreported) {
                unreported = CollectionsKt.emptyList();
            } else {
                Iterable $this$filter$iv2 = ended;
                Collection destination$iv$iv2 = new ArrayList();
                for (Object element$iv$iv2 : $this$filter$iv2) {
                    BgTaskInfo it2 = (BgTaskInfo) element$iv$iv2;
                    if (!it2.getReported()) {
                        destination$iv$iv2.add(element$iv$iv2);
                    }
                }
                unreported = (List) destination$iv$iv2;
            }
            Iterable $this$map$iv = CollectionsKt.minus(ended, (Iterable) CollectionsKt.toSet(unreported));
            Collection destination$iv$iv3 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
            for (Object item$iv$iv : $this$map$iv) {
                BgTaskInfo it3 = (BgTaskInfo) item$iv$iv;
                destination$iv$iv3.add(it3.getId());
            }
            return new BgClearResult((List) destination$iv$iv3, running.size(), unreported.size());
        }
    }

    public final int getRemoved() {
        return this.removedIds.size();
    }
}
