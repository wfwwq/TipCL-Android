package com.pymcl.runtime;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RuntimeLayout.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/pymcl/runtime/JavaDownloadFile;", "", HintConstants.AUTOFILL_HINT_NAME, "", "url", "sha256", "size", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getName", "()Ljava/lang/String;", "getUrl", "getSha256", "getSize", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class JavaDownloadFile {
    private final String name;
    private final String sha256;
    private final long size;
    private final String url;

    public static /* synthetic */ JavaDownloadFile copy$default(JavaDownloadFile javaDownloadFile, String str, String str2, String str3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = javaDownloadFile.name;
        }
        if ((i & 2) != 0) {
            str2 = javaDownloadFile.url;
        }
        if ((i & 4) != 0) {
            str3 = javaDownloadFile.sha256;
        }
        if ((i & 8) != 0) {
            j = javaDownloadFile.size;
        }
        String str4 = str3;
        return javaDownloadFile.copy(str, str2, str4, j);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSha256() {
        return this.sha256;
    }

    /* renamed from: component4, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    public final JavaDownloadFile copy(String name, String url, String sha256, long size) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(url, "url");
        return new JavaDownloadFile(name, url, sha256, size);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JavaDownloadFile)) {
            return false;
        }
        JavaDownloadFile javaDownloadFile = (JavaDownloadFile) other;
        return Intrinsics.areEqual(this.name, javaDownloadFile.name) && Intrinsics.areEqual(this.url, javaDownloadFile.url) && Intrinsics.areEqual(this.sha256, javaDownloadFile.sha256) && this.size == javaDownloadFile.size;
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.url.hashCode()) * 31) + (this.sha256 == null ? 0 : this.sha256.hashCode())) * 31) + Long.hashCode(this.size);
    }

    public String toString() {
        return "JavaDownloadFile(name=" + this.name + ", url=" + this.url + ", sha256=" + this.sha256 + ", size=" + this.size + ")";
    }

    public JavaDownloadFile(String name, String url, String sha256, long size) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(url, "url");
        this.name = name;
        this.url = url;
        this.sha256 = sha256;
        this.size = size;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSha256() {
        return this.sha256;
    }

    public final long getSize() {
        return this.size;
    }

    public final String getUrl() {
        return this.url;
    }
}
