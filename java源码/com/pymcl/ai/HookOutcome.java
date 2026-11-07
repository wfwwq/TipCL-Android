package com.pymcl.ai;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Hooks.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bHÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/pymcl/ai/HookOutcome;", "", "block", "", "reason", "", "forceAsk", "notes", "", "<init>", "(ZLjava/lang/String;ZLjava/util/List;)V", "getBlock", "()Z", "getReason", "()Ljava/lang/String;", "getForceAsk", "getNotes", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HookOutcome {
    private final boolean block;
    private final boolean forceAsk;
    private final List<String> notes;
    private final String reason;

    public HookOutcome() {
        this(false, null, false, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HookOutcome copy$default(HookOutcome hookOutcome, boolean z, String str, boolean z2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = hookOutcome.block;
        }
        if ((i & 2) != 0) {
            str = hookOutcome.reason;
        }
        if ((i & 4) != 0) {
            z2 = hookOutcome.forceAsk;
        }
        if ((i & 8) != 0) {
            list = hookOutcome.notes;
        }
        return hookOutcome.copy(z, str, z2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getBlock() {
        return this.block;
    }

    /* renamed from: component2, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getForceAsk() {
        return this.forceAsk;
    }

    public final List<String> component4() {
        return this.notes;
    }

    public final HookOutcome copy(boolean block, String reason, boolean forceAsk, List<String> notes) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(notes, "notes");
        return new HookOutcome(block, reason, forceAsk, notes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HookOutcome)) {
            return false;
        }
        HookOutcome hookOutcome = (HookOutcome) other;
        return this.block == hookOutcome.block && Intrinsics.areEqual(this.reason, hookOutcome.reason) && this.forceAsk == hookOutcome.forceAsk && Intrinsics.areEqual(this.notes, hookOutcome.notes);
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.block) * 31) + this.reason.hashCode()) * 31) + Boolean.hashCode(this.forceAsk)) * 31) + this.notes.hashCode();
    }

    public String toString() {
        return "HookOutcome(block=" + this.block + ", reason=" + this.reason + ", forceAsk=" + this.forceAsk + ", notes=" + this.notes + ")";
    }

    public HookOutcome(boolean block, String reason, boolean forceAsk, List<String> notes) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(notes, "notes");
        this.block = block;
        this.reason = reason;
        this.forceAsk = forceAsk;
        this.notes = notes;
    }

    public /* synthetic */ HookOutcome(boolean z, String str, boolean z2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final boolean getBlock() {
        return this.block;
    }

    public final boolean getForceAsk() {
        return this.forceAsk;
    }

    public final List<String> getNotes() {
        return this.notes;
    }

    public final String getReason() {
        return this.reason;
    }
}
