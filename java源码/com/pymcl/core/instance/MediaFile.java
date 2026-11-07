package com.pymcl.core.instance;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Saves.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/pymcl/core/instance/MediaFile;", "", HintConstants.AUTOFILL_HINT_NAME, "", "path", "time", "", "sizeBytes", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJ)V", "getName", "()Ljava/lang/String;", "getPath", "getTime", "()J", "getSizeBytes", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class MediaFile {
    private final String name;
    private final String path;
    private final long sizeBytes;
    private final long time;

    public static /* synthetic */ MediaFile copy$default(MediaFile mediaFile, String str, String str2, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mediaFile.name;
        }
        if ((i & 2) != 0) {
            str2 = mediaFile.path;
        }
        if ((i & 4) != 0) {
            j = mediaFile.time;
        }
        if ((i & 8) != 0) {
            j2 = mediaFile.sizeBytes;
        }
        long j3 = j2;
        return mediaFile.copy(str, str2, j, j3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* renamed from: component4, reason: from getter */
    public final long getSizeBytes() {
        return this.sizeBytes;
    }

    public final MediaFile copy(String name, String path, long time, long sizeBytes) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(path, "path");
        return new MediaFile(name, path, time, sizeBytes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaFile)) {
            return false;
        }
        MediaFile mediaFile = (MediaFile) other;
        return Intrinsics.areEqual(this.name, mediaFile.name) && Intrinsics.areEqual(this.path, mediaFile.path) && this.time == mediaFile.time && this.sizeBytes == mediaFile.sizeBytes;
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.path.hashCode()) * 31) + Long.hashCode(this.time)) * 31) + Long.hashCode(this.sizeBytes);
    }

    public String toString() {
        return "MediaFile(name=" + this.name + ", path=" + this.path + ", time=" + this.time + ", sizeBytes=" + this.sizeBytes + ")";
    }

    public MediaFile(String name, String path, long time, long sizeBytes) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(path, "path");
        this.name = name;
        this.path = path;
        this.time = time;
        this.sizeBytes = sizeBytes;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPath() {
        return this.path;
    }

    public final long getSizeBytes() {
        return this.sizeBytes;
    }

    public final long getTime() {
        return this.time;
    }
}
