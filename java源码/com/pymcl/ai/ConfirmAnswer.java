package com.pymcl.ai;

import com.pymcl.runtime.settings.SettingsProtocol;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AiToolHost.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0006HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/pymcl/ai/ConfirmAnswer;", "", SettingsProtocol.EXTRA_OK, "", "always", "scope", "", "<init>", "(ZZLjava/lang/String;)V", "getOk", "()Z", "getAlways", "getScope", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ConfirmAnswer {
    private final boolean always;
    private final boolean ok;
    private final String scope;

    public static /* synthetic */ ConfirmAnswer copy$default(ConfirmAnswer confirmAnswer, boolean z, boolean z2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = confirmAnswer.ok;
        }
        if ((i & 2) != 0) {
            z2 = confirmAnswer.always;
        }
        if ((i & 4) != 0) {
            str = confirmAnswer.scope;
        }
        return confirmAnswer.copy(z, z2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getOk() {
        return this.ok;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getAlways() {
        return this.always;
    }

    /* renamed from: component3, reason: from getter */
    public final String getScope() {
        return this.scope;
    }

    public final ConfirmAnswer copy(boolean ok, boolean always, String scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new ConfirmAnswer(ok, always, scope);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfirmAnswer)) {
            return false;
        }
        ConfirmAnswer confirmAnswer = (ConfirmAnswer) other;
        return this.ok == confirmAnswer.ok && this.always == confirmAnswer.always && Intrinsics.areEqual(this.scope, confirmAnswer.scope);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.ok) * 31) + Boolean.hashCode(this.always)) * 31) + this.scope.hashCode();
    }

    public String toString() {
        return "ConfirmAnswer(ok=" + this.ok + ", always=" + this.always + ", scope=" + this.scope + ")";
    }

    public ConfirmAnswer(boolean ok, boolean always, String scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.ok = ok;
        this.always = always;
        this.scope = scope;
    }

    public /* synthetic */ ConfirmAnswer(boolean z, boolean z2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? "instance" : str);
    }

    public final boolean getAlways() {
        return this.always;
    }

    public final boolean getOk() {
        return this.ok;
    }

    public final String getScope() {
        return this.scope;
    }
}
