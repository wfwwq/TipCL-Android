package com.pymcl.android.ui.state;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Models.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0014\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012Ê\u0001\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001d"}, d2 = {"Lcom/pymcl/android/ui/state/JavaRow;", "", "major", "", "version", "", "vendor", "path", "isDefault", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getMajor", "()I", "getVersion", "()Ljava/lang/String;", "getVendor", "getPath", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class JavaRow {
    public static final int $stable = 0;
    private final boolean isDefault;
    private final int major;
    private final String path;
    private final String vendor;
    private final String version;

    public static /* synthetic */ JavaRow copy$default(JavaRow javaRow, int i, String str, String str2, String str3, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = javaRow.major;
        }
        if ((i2 & 2) != 0) {
            str = javaRow.version;
        }
        if ((i2 & 4) != 0) {
            str2 = javaRow.vendor;
        }
        if ((i2 & 8) != 0) {
            str3 = javaRow.path;
        }
        if ((i2 & 16) != 0) {
            z = javaRow.isDefault;
        }
        boolean z2 = z;
        String str4 = str2;
        return javaRow.copy(i, str, str4, str3, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMajor() {
        return this.major;
    }

    /* renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* renamed from: component3, reason: from getter */
    public final String getVendor() {
        return this.vendor;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsDefault() {
        return this.isDefault;
    }

    public final JavaRow copy(int major, String version, String vendor, String path, boolean isDefault) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(vendor, "vendor");
        Intrinsics.checkNotNullParameter(path, "path");
        return new JavaRow(major, version, vendor, path, isDefault);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JavaRow)) {
            return false;
        }
        JavaRow javaRow = (JavaRow) other;
        return this.major == javaRow.major && Intrinsics.areEqual(this.version, javaRow.version) && Intrinsics.areEqual(this.vendor, javaRow.vendor) && Intrinsics.areEqual(this.path, javaRow.path) && this.isDefault == javaRow.isDefault;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.major) * 31) + this.version.hashCode()) * 31) + this.vendor.hashCode()) * 31) + this.path.hashCode()) * 31) + Boolean.hashCode(this.isDefault);
    }

    public String toString() {
        return "JavaRow(major=" + this.major + ", version=" + this.version + ", vendor=" + this.vendor + ", path=" + this.path + ", isDefault=" + this.isDefault + ")";
    }

    public JavaRow(int major, String version, String vendor, String path, boolean isDefault) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(vendor, "vendor");
        Intrinsics.checkNotNullParameter(path, "path");
        this.major = major;
        this.version = version;
        this.vendor = vendor;
        this.path = path;
        this.isDefault = isDefault;
    }

    public final int getMajor() {
        return this.major;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getVendor() {
        return this.vendor;
    }

    public final String getVersion() {
        return this.version;
    }

    public final boolean isDefault() {
        return this.isDefault;
    }
}
