package com.pymcl.core.instance;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Saves.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/pymcl/core/instance/SaveBackup;", "", "fileName", "", "saveName", "time", "", "sizeBytes", "path", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;)V", "getFileName", "()Ljava/lang/String;", "getSaveName", "getTime", "()J", "getSizeBytes", "getPath", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SaveBackup {
    private final String fileName;
    private final String path;
    private final String saveName;
    private final long sizeBytes;
    private final long time;

    public static /* synthetic */ SaveBackup copy$default(SaveBackup saveBackup, String str, String str2, long j, long j2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = saveBackup.fileName;
        }
        if ((i & 2) != 0) {
            str2 = saveBackup.saveName;
        }
        if ((i & 4) != 0) {
            j = saveBackup.time;
        }
        if ((i & 8) != 0) {
            j2 = saveBackup.sizeBytes;
        }
        if ((i & 16) != 0) {
            str3 = saveBackup.path;
        }
        String str4 = str3;
        long j3 = j2;
        return saveBackup.copy(str, str2, j, j3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSaveName() {
        return this.saveName;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* renamed from: component4, reason: from getter */
    public final long getSizeBytes() {
        return this.sizeBytes;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    public final SaveBackup copy(String fileName, String saveName, long time, long sizeBytes, String path) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(saveName, "saveName");
        Intrinsics.checkNotNullParameter(path, "path");
        return new SaveBackup(fileName, saveName, time, sizeBytes, path);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SaveBackup)) {
            return false;
        }
        SaveBackup saveBackup = (SaveBackup) other;
        return Intrinsics.areEqual(this.fileName, saveBackup.fileName) && Intrinsics.areEqual(this.saveName, saveBackup.saveName) && this.time == saveBackup.time && this.sizeBytes == saveBackup.sizeBytes && Intrinsics.areEqual(this.path, saveBackup.path);
    }

    public int hashCode() {
        return (((((((this.fileName.hashCode() * 31) + this.saveName.hashCode()) * 31) + Long.hashCode(this.time)) * 31) + Long.hashCode(this.sizeBytes)) * 31) + this.path.hashCode();
    }

    public String toString() {
        return "SaveBackup(fileName=" + this.fileName + ", saveName=" + this.saveName + ", time=" + this.time + ", sizeBytes=" + this.sizeBytes + ", path=" + this.path + ")";
    }

    public SaveBackup(String fileName, String saveName, long time, long sizeBytes, String path) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(saveName, "saveName");
        Intrinsics.checkNotNullParameter(path, "path");
        this.fileName = fileName;
        this.saveName = saveName;
        this.time = time;
        this.sizeBytes = sizeBytes;
        this.path = path;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getSaveName() {
        return this.saveName;
    }

    public final long getSizeBytes() {
        return this.sizeBytes;
    }

    public final long getTime() {
        return this.time;
    }
}
