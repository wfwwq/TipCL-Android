package com.pymcl.android.ui.state;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugKt;

/* compiled from: Models.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fÊ\u0001\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001a"}, d2 = {"Lcom/pymcl/android/ui/state/InstanceRow;", "", HintConstants.AUTOFILL_HINT_NAME, "", "versions", "", "isDefault", "", "javaPref", "<init>", "(Ljava/lang/String;IZLjava/lang/String;)V", "getName", "()Ljava/lang/String;", "getVersions", "()I", "()Z", "getJavaPref", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class InstanceRow {
    public static final int $stable = 0;
    private final boolean isDefault;
    private final String javaPref;
    private final String name;
    private final int versions;

    public static /* synthetic */ InstanceRow copy$default(InstanceRow instanceRow, String str, int i, boolean z, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = instanceRow.name;
        }
        if ((i2 & 2) != 0) {
            i = instanceRow.versions;
        }
        if ((i2 & 4) != 0) {
            z = instanceRow.isDefault;
        }
        if ((i2 & 8) != 0) {
            str2 = instanceRow.javaPref;
        }
        return instanceRow.copy(str, i, z, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final int getVersions() {
        return this.versions;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsDefault() {
        return this.isDefault;
    }

    /* renamed from: component4, reason: from getter */
    public final String getJavaPref() {
        return this.javaPref;
    }

    public final InstanceRow copy(String name, int versions, boolean isDefault, String javaPref) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(javaPref, "javaPref");
        return new InstanceRow(name, versions, isDefault, javaPref);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstanceRow)) {
            return false;
        }
        InstanceRow instanceRow = (InstanceRow) other;
        return Intrinsics.areEqual(this.name, instanceRow.name) && this.versions == instanceRow.versions && this.isDefault == instanceRow.isDefault && Intrinsics.areEqual(this.javaPref, instanceRow.javaPref);
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + Integer.hashCode(this.versions)) * 31) + Boolean.hashCode(this.isDefault)) * 31) + this.javaPref.hashCode();
    }

    public String toString() {
        return "InstanceRow(name=" + this.name + ", versions=" + this.versions + ", isDefault=" + this.isDefault + ", javaPref=" + this.javaPref + ")";
    }

    public InstanceRow(String name, int versions, boolean isDefault, String javaPref) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(javaPref, "javaPref");
        this.name = name;
        this.versions = versions;
        this.isDefault = isDefault;
        this.javaPref = javaPref;
    }

    public /* synthetic */ InstanceRow(String str, int i, boolean z, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, z, (i2 & 8) != 0 ? DebugKt.DEBUG_PROPERTY_VALUE_AUTO : str2);
    }

    public final String getJavaPref() {
        return this.javaPref;
    }

    public final String getName() {
        return this.name;
    }

    public final int getVersions() {
        return this.versions;
    }

    public final boolean isDefault() {
        return this.isDefault;
    }
}
