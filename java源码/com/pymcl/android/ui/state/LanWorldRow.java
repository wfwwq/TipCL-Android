package com.pymcl.android.ui.state;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Models.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bÊ\u0001\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0013"}, d2 = {"Lcom/pymcl/android/ui/state/LanWorldRow;", "", "motd", "", "address", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMotd", "()Ljava/lang/String;", "getAddress", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class LanWorldRow {
    public static final int $stable = 0;
    private final String address;
    private final String motd;

    public static /* synthetic */ LanWorldRow copy$default(LanWorldRow lanWorldRow, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lanWorldRow.motd;
        }
        if ((i & 2) != 0) {
            str2 = lanWorldRow.address;
        }
        return lanWorldRow.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMotd() {
        return this.motd;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    public final LanWorldRow copy(String motd, String address) {
        Intrinsics.checkNotNullParameter(motd, "motd");
        Intrinsics.checkNotNullParameter(address, "address");
        return new LanWorldRow(motd, address);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LanWorldRow)) {
            return false;
        }
        LanWorldRow lanWorldRow = (LanWorldRow) other;
        return Intrinsics.areEqual(this.motd, lanWorldRow.motd) && Intrinsics.areEqual(this.address, lanWorldRow.address);
    }

    public int hashCode() {
        return (this.motd.hashCode() * 31) + this.address.hashCode();
    }

    public String toString() {
        return "LanWorldRow(motd=" + this.motd + ", address=" + this.address + ")";
    }

    public LanWorldRow(String motd, String address) {
        Intrinsics.checkNotNullParameter(motd, "motd");
        Intrinsics.checkNotNullParameter(address, "address");
        this.motd = motd;
        this.address = address;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getMotd() {
        return this.motd;
    }
}
