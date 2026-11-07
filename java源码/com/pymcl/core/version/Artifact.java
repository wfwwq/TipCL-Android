package com.pymcl.core.version;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Versions.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ:\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/pymcl/core/version/Artifact;", "", "path", "", "url", "sha1", "size", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getPath", "()Ljava/lang/String;", "getUrl", "getSha1", "getSize", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/pymcl/core/version/Artifact;", "equals", "", "other", "hashCode", "", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class Artifact {
    private final String path;
    private final String sha1;
    private final Long size;
    private final String url;

    public static /* synthetic */ Artifact copy$default(Artifact artifact, String str, String str2, String str3, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = artifact.path;
        }
        if ((i & 2) != 0) {
            str2 = artifact.url;
        }
        if ((i & 4) != 0) {
            str3 = artifact.sha1;
        }
        if ((i & 8) != 0) {
            l = artifact.size;
        }
        return artifact.copy(str, str2, str3, l);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSha1() {
        return this.sha1;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getSize() {
        return this.size;
    }

    public final Artifact copy(String path, String url, String sha1, Long size) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(url, "url");
        return new Artifact(path, url, sha1, size);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Artifact)) {
            return false;
        }
        Artifact artifact = (Artifact) other;
        return Intrinsics.areEqual(this.path, artifact.path) && Intrinsics.areEqual(this.url, artifact.url) && Intrinsics.areEqual(this.sha1, artifact.sha1) && Intrinsics.areEqual(this.size, artifact.size);
    }

    public int hashCode() {
        return (((((this.path.hashCode() * 31) + this.url.hashCode()) * 31) + (this.sha1 == null ? 0 : this.sha1.hashCode())) * 31) + (this.size != null ? this.size.hashCode() : 0);
    }

    public String toString() {
        return "Artifact(path=" + this.path + ", url=" + this.url + ", sha1=" + this.sha1 + ", size=" + this.size + ")";
    }

    public Artifact(String path, String url, String sha1, Long size) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(url, "url");
        this.path = path;
        this.url = url;
        this.sha1 = sha1;
        this.size = size;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getSha1() {
        return this.sha1;
    }

    public final Long getSize() {
        return this.size;
    }

    public final String getUrl() {
        return this.url;
    }
}
