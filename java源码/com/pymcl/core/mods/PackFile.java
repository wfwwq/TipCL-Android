package com.pymcl.core.mods;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Modpack.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011J@\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/pymcl/core/mods/PackFile;", "", "path", "", "urls", "", "sha1", "size", "", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;)V", "getPath", "()Ljava/lang/String;", "getUrls", "()Ljava/util/List;", "getSha1", "getSize", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;)Lcom/pymcl/core/mods/PackFile;", "equals", "", "other", "hashCode", "", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PackFile {
    private final String path;
    private final String sha1;
    private final Long size;
    private final List<String> urls;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PackFile copy$default(PackFile packFile, String str, List list, String str2, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = packFile.path;
        }
        if ((i & 2) != 0) {
            list = packFile.urls;
        }
        if ((i & 4) != 0) {
            str2 = packFile.sha1;
        }
        if ((i & 8) != 0) {
            l = packFile.size;
        }
        return packFile.copy(str, list, str2, l);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    public final List<String> component2() {
        return this.urls;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSha1() {
        return this.sha1;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getSize() {
        return this.size;
    }

    public final PackFile copy(String path, List<String> urls, String sha1, Long size) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(urls, "urls");
        return new PackFile(path, urls, sha1, size);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PackFile)) {
            return false;
        }
        PackFile packFile = (PackFile) other;
        return Intrinsics.areEqual(this.path, packFile.path) && Intrinsics.areEqual(this.urls, packFile.urls) && Intrinsics.areEqual(this.sha1, packFile.sha1) && Intrinsics.areEqual(this.size, packFile.size);
    }

    public int hashCode() {
        return (((((this.path.hashCode() * 31) + this.urls.hashCode()) * 31) + (this.sha1 == null ? 0 : this.sha1.hashCode())) * 31) + (this.size != null ? this.size.hashCode() : 0);
    }

    public String toString() {
        return "PackFile(path=" + this.path + ", urls=" + this.urls + ", sha1=" + this.sha1 + ", size=" + this.size + ")";
    }

    public PackFile(String path, List<String> urls, String sha1, Long size) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(urls, "urls");
        this.path = path;
        this.urls = urls;
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

    public final List<String> getUrls() {
        return this.urls;
    }
}
