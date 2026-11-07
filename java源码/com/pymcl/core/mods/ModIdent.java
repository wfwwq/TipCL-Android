package com.pymcl.core.mods;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModTools.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\u0086\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u00108J\u0014\u00109\u001a\u00020!2\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010;\u001a\u00020<HÖ\u0081\u0004J\n\u0010=\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0012R\u0011\u0010 \u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b%\u0010\u0012R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030'8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010*\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b+\u0010\u0012¨\u0006>"}, d2 = {"Lcom/pymcl/core/mods/ModIdent;", "", "filename", "", "sha1", "fingerprint", "", "mrProject", "mrVersion", "mrUrl", "cfProject", "cfFile", "title", "iconUrl", "versionName", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFilename", "()Ljava/lang/String;", "getSha1", "getFingerprint", "()J", "getMrProject", "getMrVersion", "getMrUrl", "getCfProject", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCfFile", "getTitle", "getIconUrl", "getVersionName", "identified", "", "getIdentified", "()Z", "source", "getSource", "projectIds", "", "getProjectIds", "()Ljava/util/List;", "primaryId", "getPrimaryId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/pymcl/core/mods/ModIdent;", "equals", "other", "hashCode", "", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ModIdent {
    private final Long cfFile;
    private final Long cfProject;
    private final String filename;
    private final long fingerprint;
    private final String iconUrl;
    private final String mrProject;
    private final String mrUrl;
    private final String mrVersion;
    private final String sha1;
    private final String title;
    private final String versionName;

    public static /* synthetic */ ModIdent copy$default(ModIdent modIdent, String str, String str2, long j, String str3, String str4, String str5, Long l, Long l2, String str6, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = modIdent.filename;
        }
        if ((i & 2) != 0) {
            str2 = modIdent.sha1;
        }
        if ((i & 4) != 0) {
            j = modIdent.fingerprint;
        }
        if ((i & 8) != 0) {
            str3 = modIdent.mrProject;
        }
        if ((i & 16) != 0) {
            str4 = modIdent.mrVersion;
        }
        if ((i & 32) != 0) {
            str5 = modIdent.mrUrl;
        }
        if ((i & 64) != 0) {
            l = modIdent.cfProject;
        }
        if ((i & 128) != 0) {
            l2 = modIdent.cfFile;
        }
        if ((i & 256) != 0) {
            str6 = modIdent.title;
        }
        if ((i & 512) != 0) {
            str7 = modIdent.iconUrl;
        }
        if ((i & 1024) != 0) {
            str8 = modIdent.versionName;
        }
        String str9 = str7;
        String str10 = str8;
        Long l3 = l2;
        String str11 = str6;
        long j2 = j;
        return modIdent.copy(str, str2, j2, str3, str4, str5, l, l3, str11, str9, str10);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFilename() {
        return this.filename;
    }

    /* renamed from: component10, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* renamed from: component11, reason: from getter */
    public final String getVersionName() {
        return this.versionName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSha1() {
        return this.sha1;
    }

    /* renamed from: component3, reason: from getter */
    public final long getFingerprint() {
        return this.fingerprint;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMrProject() {
        return this.mrProject;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMrVersion() {
        return this.mrVersion;
    }

    /* renamed from: component6, reason: from getter */
    public final String getMrUrl() {
        return this.mrUrl;
    }

    /* renamed from: component7, reason: from getter */
    public final Long getCfProject() {
        return this.cfProject;
    }

    /* renamed from: component8, reason: from getter */
    public final Long getCfFile() {
        return this.cfFile;
    }

    /* renamed from: component9, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final ModIdent copy(String filename, String sha1, long fingerprint, String mrProject, String mrVersion, String mrUrl, Long cfProject, Long cfFile, String title, String iconUrl, String versionName) {
        Intrinsics.checkNotNullParameter(filename, "filename");
        Intrinsics.checkNotNullParameter(sha1, "sha1");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        return new ModIdent(filename, sha1, fingerprint, mrProject, mrVersion, mrUrl, cfProject, cfFile, title, iconUrl, versionName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModIdent)) {
            return false;
        }
        ModIdent modIdent = (ModIdent) other;
        return Intrinsics.areEqual(this.filename, modIdent.filename) && Intrinsics.areEqual(this.sha1, modIdent.sha1) && this.fingerprint == modIdent.fingerprint && Intrinsics.areEqual(this.mrProject, modIdent.mrProject) && Intrinsics.areEqual(this.mrVersion, modIdent.mrVersion) && Intrinsics.areEqual(this.mrUrl, modIdent.mrUrl) && Intrinsics.areEqual(this.cfProject, modIdent.cfProject) && Intrinsics.areEqual(this.cfFile, modIdent.cfFile) && Intrinsics.areEqual(this.title, modIdent.title) && Intrinsics.areEqual(this.iconUrl, modIdent.iconUrl) && Intrinsics.areEqual(this.versionName, modIdent.versionName);
    }

    public int hashCode() {
        return (((((((((((((((((((this.filename.hashCode() * 31) + this.sha1.hashCode()) * 31) + Long.hashCode(this.fingerprint)) * 31) + (this.mrProject == null ? 0 : this.mrProject.hashCode())) * 31) + (this.mrVersion == null ? 0 : this.mrVersion.hashCode())) * 31) + (this.mrUrl == null ? 0 : this.mrUrl.hashCode())) * 31) + (this.cfProject == null ? 0 : this.cfProject.hashCode())) * 31) + (this.cfFile != null ? this.cfFile.hashCode() : 0)) * 31) + this.title.hashCode()) * 31) + this.iconUrl.hashCode()) * 31) + this.versionName.hashCode();
    }

    public String toString() {
        return "ModIdent(filename=" + this.filename + ", sha1=" + this.sha1 + ", fingerprint=" + this.fingerprint + ", mrProject=" + this.mrProject + ", mrVersion=" + this.mrVersion + ", mrUrl=" + this.mrUrl + ", cfProject=" + this.cfProject + ", cfFile=" + this.cfFile + ", title=" + this.title + ", iconUrl=" + this.iconUrl + ", versionName=" + this.versionName + ")";
    }

    public ModIdent(String filename, String sha1, long fingerprint, String mrProject, String mrVersion, String mrUrl, Long cfProject, Long cfFile, String title, String iconUrl, String versionName) {
        Intrinsics.checkNotNullParameter(filename, "filename");
        Intrinsics.checkNotNullParameter(sha1, "sha1");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        this.filename = filename;
        this.sha1 = sha1;
        this.fingerprint = fingerprint;
        this.mrProject = mrProject;
        this.mrVersion = mrVersion;
        this.mrUrl = mrUrl;
        this.cfProject = cfProject;
        this.cfFile = cfFile;
        this.title = title;
        this.iconUrl = iconUrl;
        this.versionName = versionName;
    }

    public /* synthetic */ ModIdent(String str, String str2, long j, String str3, String str4, String str5, Long l, Long l2, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : l, (i & 128) != 0 ? null : l2, (i & 256) != 0 ? "" : str6, (i & 512) != 0 ? "" : str7, (i & 1024) != 0 ? "" : str8);
    }

    public final String getFilename() {
        return this.filename;
    }

    public final long getFingerprint() {
        return this.fingerprint;
    }

    public final String getSha1() {
        return this.sha1;
    }

    public final String getMrProject() {
        return this.mrProject;
    }

    public final String getMrUrl() {
        return this.mrUrl;
    }

    public final String getMrVersion() {
        return this.mrVersion;
    }

    public final Long getCfFile() {
        return this.cfFile;
    }

    public final Long getCfProject() {
        return this.cfProject;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public final boolean getIdentified() {
        return (this.mrProject == null && this.cfProject == null) ? false : true;
    }

    public final String getSource() {
        return this.mrProject != null ? "Modrinth" : this.cfProject != null ? "CurseForge" : "";
    }

    public final List<String> getProjectIds() {
        String[] strArr = new String[2];
        String it = this.mrProject;
        strArr[0] = it != null ? "mr:" + it : null;
        Long l = this.cfProject;
        strArr[1] = l != null ? "cf:" + l.longValue() : null;
        return CollectionsKt.listOfNotNull((Object[]) strArr);
    }

    public final String getPrimaryId() {
        String str = (String) CollectionsKt.firstOrNull((List) getProjectIds());
        return str == null ? "" : str;
    }
}
