package com.pymcl.core.instance;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Saves.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u001fHÖ\u0081\u0004J\n\u0010 \u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006!"}, d2 = {"Lcom/pymcl/core/instance/TrashEntry;", "", "entryName", "", "originalName", "kind", "time", "", "sizeBytes", "path", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;)V", "getEntryName", "()Ljava/lang/String;", "getOriginalName", "getKind", "getTime", "()J", "getSizeBytes", "getPath", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TrashEntry {
    private final String entryName;
    private final String kind;
    private final String originalName;
    private final String path;
    private final long sizeBytes;
    private final long time;

    public static /* synthetic */ TrashEntry copy$default(TrashEntry trashEntry, String str, String str2, String str3, long j, long j2, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trashEntry.entryName;
        }
        if ((i & 2) != 0) {
            str2 = trashEntry.originalName;
        }
        if ((i & 4) != 0) {
            str3 = trashEntry.kind;
        }
        if ((i & 8) != 0) {
            j = trashEntry.time;
        }
        if ((i & 16) != 0) {
            j2 = trashEntry.sizeBytes;
        }
        if ((i & 32) != 0) {
            str4 = trashEntry.path;
        }
        String str5 = str4;
        long j3 = j2;
        String str6 = str3;
        return trashEntry.copy(str, str2, str6, j, j3, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEntryName() {
        return this.entryName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOriginalName() {
        return this.originalName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    /* renamed from: component4, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* renamed from: component5, reason: from getter */
    public final long getSizeBytes() {
        return this.sizeBytes;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    public final TrashEntry copy(String entryName, String originalName, String kind, long time, long sizeBytes, String path) {
        Intrinsics.checkNotNullParameter(entryName, "entryName");
        Intrinsics.checkNotNullParameter(originalName, "originalName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(path, "path");
        return new TrashEntry(entryName, originalName, kind, time, sizeBytes, path);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrashEntry)) {
            return false;
        }
        TrashEntry trashEntry = (TrashEntry) other;
        return Intrinsics.areEqual(this.entryName, trashEntry.entryName) && Intrinsics.areEqual(this.originalName, trashEntry.originalName) && Intrinsics.areEqual(this.kind, trashEntry.kind) && this.time == trashEntry.time && this.sizeBytes == trashEntry.sizeBytes && Intrinsics.areEqual(this.path, trashEntry.path);
    }

    public int hashCode() {
        return (((((((((this.entryName.hashCode() * 31) + this.originalName.hashCode()) * 31) + this.kind.hashCode()) * 31) + Long.hashCode(this.time)) * 31) + Long.hashCode(this.sizeBytes)) * 31) + this.path.hashCode();
    }

    public String toString() {
        return "TrashEntry(entryName=" + this.entryName + ", originalName=" + this.originalName + ", kind=" + this.kind + ", time=" + this.time + ", sizeBytes=" + this.sizeBytes + ", path=" + this.path + ")";
    }

    public TrashEntry(String entryName, String originalName, String kind, long time, long sizeBytes, String path) {
        Intrinsics.checkNotNullParameter(entryName, "entryName");
        Intrinsics.checkNotNullParameter(originalName, "originalName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(path, "path");
        this.entryName = entryName;
        this.originalName = originalName;
        this.kind = kind;
        this.time = time;
        this.sizeBytes = sizeBytes;
        this.path = path;
    }

    public final String getEntryName() {
        return this.entryName;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getOriginalName() {
        return this.originalName;
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
