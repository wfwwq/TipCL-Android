package com.pymcl.multiplayer;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MultiplayerController.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/pymcl/multiplayer/TerracottaProfile;", "", HintConstants.AUTOFILL_HINT_NAME, "", "vendor", "kind", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getVendor", "getKind", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "PyMCL-Android:multiplayer_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TerracottaProfile {
    private final String kind;
    private final String name;
    private final String vendor;

    public static /* synthetic */ TerracottaProfile copy$default(TerracottaProfile terracottaProfile, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = terracottaProfile.name;
        }
        if ((i & 2) != 0) {
            str2 = terracottaProfile.vendor;
        }
        if ((i & 4) != 0) {
            str3 = terracottaProfile.kind;
        }
        return terracottaProfile.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getVendor() {
        return this.vendor;
    }

    /* renamed from: component3, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    public final TerracottaProfile copy(String name, String vendor, String kind) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(vendor, "vendor");
        Intrinsics.checkNotNullParameter(kind, "kind");
        return new TerracottaProfile(name, vendor, kind);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TerracottaProfile)) {
            return false;
        }
        TerracottaProfile terracottaProfile = (TerracottaProfile) other;
        return Intrinsics.areEqual(this.name, terracottaProfile.name) && Intrinsics.areEqual(this.vendor, terracottaProfile.vendor) && Intrinsics.areEqual(this.kind, terracottaProfile.kind);
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.vendor.hashCode()) * 31) + this.kind.hashCode();
    }

    public String toString() {
        return "TerracottaProfile(name=" + this.name + ", vendor=" + this.vendor + ", kind=" + this.kind + ")";
    }

    public TerracottaProfile(String name, String vendor, String kind) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(vendor, "vendor");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.name = name;
        this.vendor = vendor;
        this.kind = kind;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getName() {
        return this.name;
    }

    public final String getVendor() {
        return this.vendor;
    }
}
