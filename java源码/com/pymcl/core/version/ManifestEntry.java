package com.pymcl.core.version;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Versions.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/pymcl/core/version/ManifestEntry;", "", "id", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "url", "releaseTime", "sha1", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getType", "getUrl", "getReleaseTime", "getSha1", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ManifestEntry {
    private final String id;
    private final String releaseTime;
    private final String sha1;
    private final String type;
    private final String url;

    public static /* synthetic */ ManifestEntry copy$default(ManifestEntry manifestEntry, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = manifestEntry.id;
        }
        if ((i & 2) != 0) {
            str2 = manifestEntry.type;
        }
        if ((i & 4) != 0) {
            str3 = manifestEntry.url;
        }
        if ((i & 8) != 0) {
            str4 = manifestEntry.releaseTime;
        }
        if ((i & 16) != 0) {
            str5 = manifestEntry.sha1;
        }
        String str6 = str5;
        String str7 = str3;
        return manifestEntry.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component4, reason: from getter */
    public final String getReleaseTime() {
        return this.releaseTime;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSha1() {
        return this.sha1;
    }

    public final ManifestEntry copy(String id, String type, String url, String releaseTime, String sha1) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(releaseTime, "releaseTime");
        return new ManifestEntry(id, type, url, releaseTime, sha1);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManifestEntry)) {
            return false;
        }
        ManifestEntry manifestEntry = (ManifestEntry) other;
        return Intrinsics.areEqual(this.id, manifestEntry.id) && Intrinsics.areEqual(this.type, manifestEntry.type) && Intrinsics.areEqual(this.url, manifestEntry.url) && Intrinsics.areEqual(this.releaseTime, manifestEntry.releaseTime) && Intrinsics.areEqual(this.sha1, manifestEntry.sha1);
    }

    public int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.type.hashCode()) * 31) + this.url.hashCode()) * 31) + this.releaseTime.hashCode()) * 31) + (this.sha1 == null ? 0 : this.sha1.hashCode());
    }

    public String toString() {
        return "ManifestEntry(id=" + this.id + ", type=" + this.type + ", url=" + this.url + ", releaseTime=" + this.releaseTime + ", sha1=" + this.sha1 + ")";
    }

    public ManifestEntry(String id, String type, String url, String releaseTime, String sha1) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(releaseTime, "releaseTime");
        this.id = id;
        this.type = type;
        this.url = url;
        this.releaseTime = releaseTime;
        this.sha1 = sha1;
    }

    public final String getId() {
        return this.id;
    }

    public final String getReleaseTime() {
        return this.releaseTime;
    }

    public final String getSha1() {
        return this.sha1;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }
}
