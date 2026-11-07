package com.pymcl.core.download;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: DownloadManager.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u000eHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jo\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010/\u001a\u00020\u000e2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00101\u001a\u00020\u0005HÖ\u0081\u0004J\n\u00102\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0011\u0010 \u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u00063"}, d2 = {"Lcom/pymcl/core/download/DownloadProgress;", "", "taskName", "", "totalFiles", "", "doneFiles", "failedFiles", "totalBytes", "", "doneBytes", "speedBps", "current", "finished", "", "error", "<init>", "(Ljava/lang/String;IIIJJJLjava/lang/String;ZLjava/lang/String;)V", "getTaskName", "()Ljava/lang/String;", "getTotalFiles", "()I", "getDoneFiles", "getFailedFiles", "getTotalBytes", "()J", "getDoneBytes", "getSpeedBps", "getCurrent", "getFinished", "()Z", "getError", "fraction", "", "getFraction", "()F", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DownloadProgress {
    private final String current;
    private final long doneBytes;
    private final int doneFiles;
    private final String error;
    private final int failedFiles;
    private final boolean finished;
    private final long speedBps;
    private final String taskName;
    private final long totalBytes;
    private final int totalFiles;

    public DownloadProgress() {
        this(null, 0, 0, 0, 0L, 0L, 0L, null, false, null, 1023, null);
    }

    public static /* synthetic */ DownloadProgress copy$default(DownloadProgress downloadProgress, String str, int i, int i2, int i3, long j, long j2, long j3, String str2, boolean z, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = downloadProgress.taskName;
        }
        return downloadProgress.copy(str, (i4 & 2) != 0 ? downloadProgress.totalFiles : i, (i4 & 4) != 0 ? downloadProgress.doneFiles : i2, (i4 & 8) != 0 ? downloadProgress.failedFiles : i3, (i4 & 16) != 0 ? downloadProgress.totalBytes : j, (i4 & 32) != 0 ? downloadProgress.doneBytes : j2, (i4 & 64) != 0 ? downloadProgress.speedBps : j3, (i4 & 128) != 0 ? downloadProgress.current : str2, (i4 & 256) != 0 ? downloadProgress.finished : z, (i4 & 512) != 0 ? downloadProgress.error : str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTaskName() {
        return this.taskName;
    }

    /* renamed from: component10, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTotalFiles() {
        return this.totalFiles;
    }

    /* renamed from: component3, reason: from getter */
    public final int getDoneFiles() {
        return this.doneFiles;
    }

    /* renamed from: component4, reason: from getter */
    public final int getFailedFiles() {
        return this.failedFiles;
    }

    /* renamed from: component5, reason: from getter */
    public final long getTotalBytes() {
        return this.totalBytes;
    }

    /* renamed from: component6, reason: from getter */
    public final long getDoneBytes() {
        return this.doneBytes;
    }

    /* renamed from: component7, reason: from getter */
    public final long getSpeedBps() {
        return this.speedBps;
    }

    /* renamed from: component8, reason: from getter */
    public final String getCurrent() {
        return this.current;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getFinished() {
        return this.finished;
    }

    public final DownloadProgress copy(String taskName, int totalFiles, int doneFiles, int failedFiles, long totalBytes, long doneBytes, long speedBps, String current, boolean finished, String error) {
        Intrinsics.checkNotNullParameter(taskName, "taskName");
        Intrinsics.checkNotNullParameter(current, "current");
        return new DownloadProgress(taskName, totalFiles, doneFiles, failedFiles, totalBytes, doneBytes, speedBps, current, finished, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownloadProgress)) {
            return false;
        }
        DownloadProgress downloadProgress = (DownloadProgress) other;
        return Intrinsics.areEqual(this.taskName, downloadProgress.taskName) && this.totalFiles == downloadProgress.totalFiles && this.doneFiles == downloadProgress.doneFiles && this.failedFiles == downloadProgress.failedFiles && this.totalBytes == downloadProgress.totalBytes && this.doneBytes == downloadProgress.doneBytes && this.speedBps == downloadProgress.speedBps && Intrinsics.areEqual(this.current, downloadProgress.current) && this.finished == downloadProgress.finished && Intrinsics.areEqual(this.error, downloadProgress.error);
    }

    public int hashCode() {
        return (((((((((((((((((this.taskName.hashCode() * 31) + Integer.hashCode(this.totalFiles)) * 31) + Integer.hashCode(this.doneFiles)) * 31) + Integer.hashCode(this.failedFiles)) * 31) + Long.hashCode(this.totalBytes)) * 31) + Long.hashCode(this.doneBytes)) * 31) + Long.hashCode(this.speedBps)) * 31) + this.current.hashCode()) * 31) + Boolean.hashCode(this.finished)) * 31) + (this.error == null ? 0 : this.error.hashCode());
    }

    public String toString() {
        return "DownloadProgress(taskName=" + this.taskName + ", totalFiles=" + this.totalFiles + ", doneFiles=" + this.doneFiles + ", failedFiles=" + this.failedFiles + ", totalBytes=" + this.totalBytes + ", doneBytes=" + this.doneBytes + ", speedBps=" + this.speedBps + ", current=" + this.current + ", finished=" + this.finished + ", error=" + this.error + ")";
    }

    public DownloadProgress(String taskName, int totalFiles, int doneFiles, int failedFiles, long totalBytes, long doneBytes, long speedBps, String current, boolean finished, String error) {
        Intrinsics.checkNotNullParameter(taskName, "taskName");
        Intrinsics.checkNotNullParameter(current, "current");
        this.taskName = taskName;
        this.totalFiles = totalFiles;
        this.doneFiles = doneFiles;
        this.failedFiles = failedFiles;
        this.totalBytes = totalBytes;
        this.doneBytes = doneBytes;
        this.speedBps = speedBps;
        this.current = current;
        this.finished = finished;
        this.error = error;
    }

    public /* synthetic */ DownloadProgress(String str, int i, int i2, int i3, long j, long j2, long j3, String str2, boolean z, String str3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? 0 : i3, (i4 & 16) != 0 ? 0L : j, (i4 & 32) != 0 ? 0L : j2, (i4 & 64) == 0 ? j3 : 0L, (i4 & 128) == 0 ? str2 : "", (i4 & 256) == 0 ? z : false, (i4 & 512) != 0 ? null : str3);
    }

    public final int getDoneFiles() {
        return this.doneFiles;
    }

    public final int getFailedFiles() {
        return this.failedFiles;
    }

    public final String getTaskName() {
        return this.taskName;
    }

    public final int getTotalFiles() {
        return this.totalFiles;
    }

    public final String getCurrent() {
        return this.current;
    }

    public final long getDoneBytes() {
        return this.doneBytes;
    }

    public final String getError() {
        return this.error;
    }

    public final boolean getFinished() {
        return this.finished;
    }

    public final long getSpeedBps() {
        return this.speedBps;
    }

    public final long getTotalBytes() {
        return this.totalBytes;
    }

    public final float getFraction() {
        if (this.totalBytes > 0) {
            return RangesKt.coerceIn(this.doneBytes / this.totalBytes, 0.0f, 1.0f);
        }
        if (this.totalFiles > 0) {
            return this.doneFiles / this.totalFiles;
        }
        return 0.0f;
    }
}
