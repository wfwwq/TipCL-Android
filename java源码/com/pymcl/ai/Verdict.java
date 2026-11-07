package com.pymcl.ai;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Permission.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/pymcl/ai/Verdict;", "", "decision", "Lcom/pymcl/ai/Decision;", "reason", "", "<init>", "(Lcom/pymcl/ai/Decision;Ljava/lang/String;)V", "getDecision", "()Lcom/pymcl/ai/Decision;", "getReason", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Verdict {
    private final Decision decision;
    private final String reason;

    public static /* synthetic */ Verdict copy$default(Verdict verdict, Decision decision, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            decision = verdict.decision;
        }
        if ((i & 2) != 0) {
            str = verdict.reason;
        }
        return verdict.copy(decision, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Decision getDecision() {
        return this.decision;
    }

    /* renamed from: component2, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    public final Verdict copy(Decision decision, String reason) {
        Intrinsics.checkNotNullParameter(decision, "decision");
        Intrinsics.checkNotNullParameter(reason, "reason");
        return new Verdict(decision, reason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Verdict)) {
            return false;
        }
        Verdict verdict = (Verdict) other;
        return this.decision == verdict.decision && Intrinsics.areEqual(this.reason, verdict.reason);
    }

    public int hashCode() {
        return (this.decision.hashCode() * 31) + this.reason.hashCode();
    }

    public String toString() {
        return "Verdict(decision=" + this.decision + ", reason=" + this.reason + ")";
    }

    public Verdict(Decision decision, String reason) {
        Intrinsics.checkNotNullParameter(decision, "decision");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.decision = decision;
        this.reason = reason;
    }

    public /* synthetic */ Verdict(Decision decision, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(decision, (i & 2) != 0 ? "" : str);
    }

    public final Decision getDecision() {
        return this.decision;
    }

    public final String getReason() {
        return this.reason;
    }
}
