package com.pymcl.ai;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Sse.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000H\u0086\u0002J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/pymcl/ai/Usage;", "", "prompt", "", "completion", "total", "estimated", "", "<init>", "(JJJZ)V", "getPrompt", "()J", "getCompletion", "getTotal", "getEstimated", "()Z", "plus", "o", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Usage {
    private final long completion;
    private final boolean estimated;
    private final long prompt;
    private final long total;

    public Usage() {
        this(0L, 0L, 0L, false, 15, null);
    }

    public static /* synthetic */ Usage copy$default(Usage usage, long j, long j2, long j3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = usage.prompt;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = usage.completion;
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            j3 = usage.total;
        }
        long j6 = j3;
        if ((i & 8) != 0) {
            z = usage.estimated;
        }
        return usage.copy(j4, j5, j6, z);
    }

    /* renamed from: component1, reason: from getter */
    public final long getPrompt() {
        return this.prompt;
    }

    /* renamed from: component2, reason: from getter */
    public final long getCompletion() {
        return this.completion;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTotal() {
        return this.total;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getEstimated() {
        return this.estimated;
    }

    public final Usage copy(long prompt, long completion, long total, boolean estimated) {
        return new Usage(prompt, completion, total, estimated);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Usage)) {
            return false;
        }
        Usage usage = (Usage) other;
        return this.prompt == usage.prompt && this.completion == usage.completion && this.total == usage.total && this.estimated == usage.estimated;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.prompt) * 31) + Long.hashCode(this.completion)) * 31) + Long.hashCode(this.total)) * 31) + Boolean.hashCode(this.estimated);
    }

    public String toString() {
        return "Usage(prompt=" + this.prompt + ", completion=" + this.completion + ", total=" + this.total + ", estimated=" + this.estimated + ")";
    }

    public Usage(long prompt, long completion, long total, boolean estimated) {
        this.prompt = prompt;
        this.completion = completion;
        this.total = total;
        this.estimated = estimated;
    }

    public /* synthetic */ Usage(long j, long j2, long j3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? 0L : j3, (i & 8) != 0 ? false : z);
    }

    public final long getCompletion() {
        return this.completion;
    }

    public final boolean getEstimated() {
        return this.estimated;
    }

    public final long getPrompt() {
        return this.prompt;
    }

    public final long getTotal() {
        return this.total;
    }

    public final Usage plus(Usage o) {
        Intrinsics.checkNotNullParameter(o, "o");
        return new Usage(this.prompt + o.prompt, this.completion + o.completion, this.total + o.total, this.estimated || o.estimated);
    }
}
