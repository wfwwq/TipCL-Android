package com.pymcl.core.download;

import androidx.autofill.HintConstants;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DownloadManager.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fB1\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\u000fJ\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0017J\t\u0010\u001e\u001a\u00020\u0004HÆ\u0003JJ\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u0004HÆ\u0001¢\u0006\u0002\u0010 J\u0014\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010$\u001a\u00020%HÖ\u0081\u0004J\n\u0010&\u001a\u00020\u0004HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015¨\u0006'"}, d2 = {"Lcom/pymcl/core/download/DownloadItem;", "", "urls", "", "", "dest", "Ljava/io/File;", "hash", "size", "", HintConstants.AUTOFILL_HINT_NAME, "<init>", "(Ljava/util/List;Ljava/io/File;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "url", "sha1", "(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Ljava/lang/Long;)V", "getUrls", "()Ljava/util/List;", "getDest", "()Ljava/io/File;", "getHash", "()Ljava/lang/String;", "getSize", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getName", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/List;Ljava/io/File;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/pymcl/core/download/DownloadItem;", "equals", "", "other", "hashCode", "", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DownloadItem {
    private final File dest;
    private final String hash;
    private final String name;
    private final Long size;
    private final List<String> urls;

    public static /* synthetic */ DownloadItem copy$default(DownloadItem downloadItem, List list, File file, String str, Long l, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = downloadItem.urls;
        }
        if ((i & 2) != 0) {
            file = downloadItem.dest;
        }
        if ((i & 4) != 0) {
            str = downloadItem.hash;
        }
        if ((i & 8) != 0) {
            l = downloadItem.size;
        }
        if ((i & 16) != 0) {
            str2 = downloadItem.name;
        }
        String str3 = str2;
        String str4 = str;
        return downloadItem.copy(list, file, str4, l, str3);
    }

    public final List<String> component1() {
        return this.urls;
    }

    /* renamed from: component2, reason: from getter */
    public final File getDest() {
        return this.dest;
    }

    /* renamed from: component3, reason: from getter */
    public final String getHash() {
        return this.hash;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getSize() {
        return this.size;
    }

    /* renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final DownloadItem copy(List<String> urls, File dest, String hash, Long size, String name) {
        Intrinsics.checkNotNullParameter(urls, "urls");
        Intrinsics.checkNotNullParameter(dest, "dest");
        Intrinsics.checkNotNullParameter(name, "name");
        return new DownloadItem(urls, dest, hash, size, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownloadItem)) {
            return false;
        }
        DownloadItem downloadItem = (DownloadItem) other;
        return Intrinsics.areEqual(this.urls, downloadItem.urls) && Intrinsics.areEqual(this.dest, downloadItem.dest) && Intrinsics.areEqual(this.hash, downloadItem.hash) && Intrinsics.areEqual(this.size, downloadItem.size) && Intrinsics.areEqual(this.name, downloadItem.name);
    }

    public int hashCode() {
        return (((((((this.urls.hashCode() * 31) + this.dest.hashCode()) * 31) + (this.hash == null ? 0 : this.hash.hashCode())) * 31) + (this.size != null ? this.size.hashCode() : 0)) * 31) + this.name.hashCode();
    }

    public String toString() {
        return "DownloadItem(urls=" + this.urls + ", dest=" + this.dest + ", hash=" + this.hash + ", size=" + this.size + ", name=" + this.name + ")";
    }

    public DownloadItem(List<String> urls, File dest, String hash, Long size, String name) {
        Intrinsics.checkNotNullParameter(urls, "urls");
        Intrinsics.checkNotNullParameter(dest, "dest");
        Intrinsics.checkNotNullParameter(name, "name");
        this.urls = urls;
        this.dest = dest;
        this.hash = hash;
        this.size = size;
        this.name = name;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DownloadItem(List list, File file, String str, Long l, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i & 4) != 0 ? null : str;
        l = (i & 8) != 0 ? null : l;
        if ((i & 16) != 0) {
            str2 = file.getName();
            Intrinsics.checkNotNullExpressionValue(str2, "getName(...)");
        }
        this(list, file, str, l, str2);
    }

    public final File getDest() {
        return this.dest;
    }

    public final String getHash() {
        return this.hash;
    }

    public final String getName() {
        return this.name;
    }

    public final Long getSize() {
        return this.size;
    }

    public final List<String> getUrls() {
        return this.urls;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DownloadItem(String url, File dest, String sha1, Long size) {
        this(CollectionsKt.listOf(url), dest, sha1, size, null, 16, null);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(dest, "dest");
    }

    public /* synthetic */ DownloadItem(String str, File file, String str2, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, file, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : l);
    }
}
