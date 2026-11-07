package com.pymcl.android.ui.state;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Models.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003JG\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011Ê\u0001\f\b!\u0012\b\b\"\u0012\u0004\b\u0003\u0010\u0002¨\u0006 "}, d2 = {"Lcom/pymcl/android/ui/state/InstalledVersion;", "", "id", "", "mc", "loader", "isolated", "", "hidden", "incomplete", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V", "getId", "()Ljava/lang/String;", "getMc", "getLoader", "getIsolated", "()Z", "getHidden", "getIncomplete", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class InstalledVersion {
    public static final int $stable = 0;
    private final boolean hidden;
    private final String id;
    private final boolean incomplete;
    private final boolean isolated;
    private final String loader;
    private final String mc;

    public static /* synthetic */ InstalledVersion copy$default(InstalledVersion installedVersion, String str, String str2, String str3, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = installedVersion.id;
        }
        if ((i & 2) != 0) {
            str2 = installedVersion.mc;
        }
        if ((i & 4) != 0) {
            str3 = installedVersion.loader;
        }
        if ((i & 8) != 0) {
            z = installedVersion.isolated;
        }
        if ((i & 16) != 0) {
            z2 = installedVersion.hidden;
        }
        if ((i & 32) != 0) {
            z3 = installedVersion.incomplete;
        }
        boolean z4 = z2;
        boolean z5 = z3;
        return installedVersion.copy(str, str2, str3, z, z4, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMc() {
        return this.mc;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLoader() {
        return this.loader;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsolated() {
        return this.isolated;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getHidden() {
        return this.hidden;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIncomplete() {
        return this.incomplete;
    }

    public final InstalledVersion copy(String id, String mc, String loader, boolean isolated, boolean hidden, boolean incomplete) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(mc, "mc");
        return new InstalledVersion(id, mc, loader, isolated, hidden, incomplete);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstalledVersion)) {
            return false;
        }
        InstalledVersion installedVersion = (InstalledVersion) other;
        return Intrinsics.areEqual(this.id, installedVersion.id) && Intrinsics.areEqual(this.mc, installedVersion.mc) && Intrinsics.areEqual(this.loader, installedVersion.loader) && this.isolated == installedVersion.isolated && this.hidden == installedVersion.hidden && this.incomplete == installedVersion.incomplete;
    }

    public int hashCode() {
        return (((((((((this.id.hashCode() * 31) + this.mc.hashCode()) * 31) + (this.loader == null ? 0 : this.loader.hashCode())) * 31) + Boolean.hashCode(this.isolated)) * 31) + Boolean.hashCode(this.hidden)) * 31) + Boolean.hashCode(this.incomplete);
    }

    public String toString() {
        return "InstalledVersion(id=" + this.id + ", mc=" + this.mc + ", loader=" + this.loader + ", isolated=" + this.isolated + ", hidden=" + this.hidden + ", incomplete=" + this.incomplete + ")";
    }

    public InstalledVersion(String id, String mc, String loader, boolean isolated, boolean hidden, boolean incomplete) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(mc, "mc");
        this.id = id;
        this.mc = mc;
        this.loader = loader;
        this.isolated = isolated;
        this.hidden = hidden;
        this.incomplete = incomplete;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ InstalledVersion(String str, String str2, String str3, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z4;
        z2 = (i & 16) != 0 ? false : z2;
        if ((i & 32) == 0) {
            z4 = z3;
        } else {
            z4 = false;
        }
        this(str, str2, str3, z, z2, z4);
    }

    public final boolean getHidden() {
        return this.hidden;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getIsolated() {
        return this.isolated;
    }

    public final String getLoader() {
        return this.loader;
    }

    public final String getMc() {
        return this.mc;
    }

    public final boolean getIncomplete() {
        return this.incomplete;
    }
}
