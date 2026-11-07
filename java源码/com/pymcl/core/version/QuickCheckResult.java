package com.pymcl.core.version;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GameInstaller.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/pymcl/core/version/QuickCheckResult;", "", "complete", "", "reason", "", "<init>", "(ZLjava/lang/String;)V", "getComplete", "()Z", "getReason", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class QuickCheckResult {
    private final boolean complete;
    private final String reason;

    public static /* synthetic */ QuickCheckResult copy$default(QuickCheckResult quickCheckResult, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = quickCheckResult.complete;
        }
        if ((i & 2) != 0) {
            str = quickCheckResult.reason;
        }
        return quickCheckResult.copy(z, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getComplete() {
        return this.complete;
    }

    /* renamed from: component2, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    public final QuickCheckResult copy(boolean complete, String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        return new QuickCheckResult(complete, reason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuickCheckResult)) {
            return false;
        }
        QuickCheckResult quickCheckResult = (QuickCheckResult) other;
        return this.complete == quickCheckResult.complete && Intrinsics.areEqual(this.reason, quickCheckResult.reason);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.complete) * 31) + this.reason.hashCode();
    }

    public String toString() {
        return "QuickCheckResult(complete=" + this.complete + ", reason=" + this.reason + ")";
    }

    public QuickCheckResult(boolean complete, String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.complete = complete;
        this.reason = reason;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final String getReason() {
        return this.reason;
    }
}
