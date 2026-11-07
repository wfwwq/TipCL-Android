package com.pymcl.android.ui.state;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Models.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003JY\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0014\u0010!\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010#\u001a\u00020$HÖ\u0081\u0004J\n\u0010%\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fÊ\u0001\f\b'\u0012\b\b(\u0012\u0004\b\u0003\u0010\u0002¨\u0006&"}, d2 = {"Lcom/pymcl/android/ui/state/InstalledEntry;", "", "filename", "", "title", "enabled", "", "version", "shared", "iconUrl", "projectId", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFilename", "()Ljava/lang/String;", "getTitle", "getEnabled", "()Z", "getVersion", "getShared", "getIconUrl", "getProjectId", "getSource", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class InstalledEntry {
    public static final int $stable = 0;
    private final boolean enabled;
    private final String filename;
    private final String iconUrl;
    private final String projectId;
    private final boolean shared;
    private final String source;
    private final String title;
    private final String version;

    public static /* synthetic */ InstalledEntry copy$default(InstalledEntry installedEntry, String str, String str2, boolean z, String str3, boolean z2, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = installedEntry.filename;
        }
        if ((i & 2) != 0) {
            str2 = installedEntry.title;
        }
        if ((i & 4) != 0) {
            z = installedEntry.enabled;
        }
        if ((i & 8) != 0) {
            str3 = installedEntry.version;
        }
        if ((i & 16) != 0) {
            z2 = installedEntry.shared;
        }
        if ((i & 32) != 0) {
            str4 = installedEntry.iconUrl;
        }
        if ((i & 64) != 0) {
            str5 = installedEntry.projectId;
        }
        if ((i & 128) != 0) {
            str6 = installedEntry.source;
        }
        String str7 = str5;
        String str8 = str6;
        boolean z3 = z2;
        String str9 = str4;
        return installedEntry.copy(str, str2, z, str3, z3, str9, str7, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFilename() {
        return this.filename;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component4, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShared() {
        return this.shared;
    }

    /* renamed from: component6, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* renamed from: component7, reason: from getter */
    public final String getProjectId() {
        return this.projectId;
    }

    /* renamed from: component8, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final InstalledEntry copy(String filename, String title, boolean enabled, String version, boolean shared, String iconUrl, String projectId, String source) {
        Intrinsics.checkNotNullParameter(filename, "filename");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(source, "source");
        return new InstalledEntry(filename, title, enabled, version, shared, iconUrl, projectId, source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstalledEntry)) {
            return false;
        }
        InstalledEntry installedEntry = (InstalledEntry) other;
        return Intrinsics.areEqual(this.filename, installedEntry.filename) && Intrinsics.areEqual(this.title, installedEntry.title) && this.enabled == installedEntry.enabled && Intrinsics.areEqual(this.version, installedEntry.version) && this.shared == installedEntry.shared && Intrinsics.areEqual(this.iconUrl, installedEntry.iconUrl) && Intrinsics.areEqual(this.projectId, installedEntry.projectId) && Intrinsics.areEqual(this.source, installedEntry.source);
    }

    public int hashCode() {
        return (((((((((((((this.filename.hashCode() * 31) + this.title.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31) + this.version.hashCode()) * 31) + Boolean.hashCode(this.shared)) * 31) + this.iconUrl.hashCode()) * 31) + this.projectId.hashCode()) * 31) + this.source.hashCode();
    }

    public String toString() {
        return "InstalledEntry(filename=" + this.filename + ", title=" + this.title + ", enabled=" + this.enabled + ", version=" + this.version + ", shared=" + this.shared + ", iconUrl=" + this.iconUrl + ", projectId=" + this.projectId + ", source=" + this.source + ")";
    }

    public InstalledEntry(String filename, String title, boolean enabled, String version, boolean shared, String iconUrl, String projectId, String source) {
        Intrinsics.checkNotNullParameter(filename, "filename");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(source, "source");
        this.filename = filename;
        this.title = title;
        this.enabled = enabled;
        this.version = version;
        this.shared = shared;
        this.iconUrl = iconUrl;
        this.projectId = projectId;
        this.source = source;
    }

    public /* synthetic */ InstalledEntry(String str, String str2, boolean z, String str3, boolean z2, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, str3, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getFilename() {
        return this.filename;
    }

    public final boolean getShared() {
        return this.shared;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getVersion() {
        return this.version;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getProjectId() {
        return this.projectId;
    }

    public final String getSource() {
        return this.source;
    }
}
