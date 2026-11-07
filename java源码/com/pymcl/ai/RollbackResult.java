package com.pymcl.ai;

import kotlin.Metadata;

/* compiled from: Checkpoint.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/pymcl/ai/RollbackResult;", "", "restored", "", "failed", "hadEntries", "", "rewindable", "<init>", "(IIZZ)V", "getRestored", "()I", "getFailed", "getHadEntries", "()Z", "getRewindable", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RollbackResult {
    private final int failed;
    private final boolean hadEntries;
    private final int restored;
    private final boolean rewindable;

    public static /* synthetic */ RollbackResult copy$default(RollbackResult rollbackResult, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = rollbackResult.restored;
        }
        if ((i3 & 2) != 0) {
            i2 = rollbackResult.failed;
        }
        if ((i3 & 4) != 0) {
            z = rollbackResult.hadEntries;
        }
        if ((i3 & 8) != 0) {
            z2 = rollbackResult.rewindable;
        }
        return rollbackResult.copy(i, i2, z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getRestored() {
        return this.restored;
    }

    /* renamed from: component2, reason: from getter */
    public final int getFailed() {
        return this.failed;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHadEntries() {
        return this.hadEntries;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getRewindable() {
        return this.rewindable;
    }

    public final RollbackResult copy(int restored, int failed, boolean hadEntries, boolean rewindable) {
        return new RollbackResult(restored, failed, hadEntries, rewindable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RollbackResult)) {
            return false;
        }
        RollbackResult rollbackResult = (RollbackResult) other;
        return this.restored == rollbackResult.restored && this.failed == rollbackResult.failed && this.hadEntries == rollbackResult.hadEntries && this.rewindable == rollbackResult.rewindable;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.restored) * 31) + Integer.hashCode(this.failed)) * 31) + Boolean.hashCode(this.hadEntries)) * 31) + Boolean.hashCode(this.rewindable);
    }

    public String toString() {
        return "RollbackResult(restored=" + this.restored + ", failed=" + this.failed + ", hadEntries=" + this.hadEntries + ", rewindable=" + this.rewindable + ")";
    }

    public RollbackResult(int restored, int failed, boolean hadEntries, boolean rewindable) {
        this.restored = restored;
        this.failed = failed;
        this.hadEntries = hadEntries;
        this.rewindable = rewindable;
    }

    public final int getFailed() {
        return this.failed;
    }

    public final boolean getHadEntries() {
        return this.hadEntries;
    }

    public final int getRestored() {
        return this.restored;
    }

    public final boolean getRewindable() {
        return this.rewindable;
    }
}
