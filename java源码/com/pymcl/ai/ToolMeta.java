package com.pymcl.ai;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Permission.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/pymcl/ai/ToolMeta;", "", HintConstants.AUTOFILL_HINT_NAME, "", "readonly", "", "sideEffect", "risk", "longRunning", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Z)V", "getName", "()Ljava/lang/String;", "getReadonly", "()Z", "getSideEffect", "getRisk", "getLongRunning", "isDelete", "isWrite", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ToolMeta {
    private final boolean longRunning;
    private final String name;
    private final boolean readonly;
    private final String risk;
    private final String sideEffect;

    public static /* synthetic */ ToolMeta copy$default(ToolMeta toolMeta, String str, boolean z, String str2, String str3, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = toolMeta.name;
        }
        if ((i & 2) != 0) {
            z = toolMeta.readonly;
        }
        if ((i & 4) != 0) {
            str2 = toolMeta.sideEffect;
        }
        if ((i & 8) != 0) {
            str3 = toolMeta.risk;
        }
        if ((i & 16) != 0) {
            z2 = toolMeta.longRunning;
        }
        boolean z3 = z2;
        String str4 = str2;
        return toolMeta.copy(str, z, str4, str3, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getReadonly() {
        return this.readonly;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSideEffect() {
        return this.sideEffect;
    }

    /* renamed from: component4, reason: from getter */
    public final String getRisk() {
        return this.risk;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getLongRunning() {
        return this.longRunning;
    }

    public final ToolMeta copy(String name, boolean readonly, String sideEffect, String risk, boolean longRunning) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(sideEffect, "sideEffect");
        Intrinsics.checkNotNullParameter(risk, "risk");
        return new ToolMeta(name, readonly, sideEffect, risk, longRunning);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToolMeta)) {
            return false;
        }
        ToolMeta toolMeta = (ToolMeta) other;
        return Intrinsics.areEqual(this.name, toolMeta.name) && this.readonly == toolMeta.readonly && Intrinsics.areEqual(this.sideEffect, toolMeta.sideEffect) && Intrinsics.areEqual(this.risk, toolMeta.risk) && this.longRunning == toolMeta.longRunning;
    }

    public int hashCode() {
        return (((((((this.name.hashCode() * 31) + Boolean.hashCode(this.readonly)) * 31) + this.sideEffect.hashCode()) * 31) + this.risk.hashCode()) * 31) + Boolean.hashCode(this.longRunning);
    }

    public String toString() {
        return "ToolMeta(name=" + this.name + ", readonly=" + this.readonly + ", sideEffect=" + this.sideEffect + ", risk=" + this.risk + ", longRunning=" + this.longRunning + ")";
    }

    public ToolMeta(String name, boolean readonly, String sideEffect, String risk, boolean longRunning) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(sideEffect, "sideEffect");
        Intrinsics.checkNotNullParameter(risk, "risk");
        this.name = name;
        this.readonly = readonly;
        this.sideEffect = sideEffect;
        this.risk = risk;
        this.longRunning = longRunning;
    }

    public /* synthetic */ ToolMeta(String str, boolean z, String str2, String str3, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, str2, str3, (i & 16) != 0 ? false : z2);
    }

    public final boolean getLongRunning() {
        return this.longRunning;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getReadonly() {
        return this.readonly;
    }

    public final String getRisk() {
        return this.risk;
    }

    public final String getSideEffect() {
        return this.sideEffect;
    }

    public final boolean isDelete() {
        return Intrinsics.areEqual(this.sideEffect, "delete");
    }

    public final boolean isWrite() {
        return !this.readonly;
    }
}
