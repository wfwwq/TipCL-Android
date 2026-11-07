package com.pymcl.android.ui.state;

import com.pymcl.runtime.settings.SettingsProtocol;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LauncherUiApi.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bÊ\u0001\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001a"}, d2 = {"Lcom/pymcl/android/ui/state/ContentExportResult;", "", "path", "", SettingsProtocol.EXTRA_OK, "", "failed", "summary", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getPath", "()Ljava/lang/String;", "getOk", "()I", "getFailed", "getSummary", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class ContentExportResult {
    public static final int $stable = 0;
    private final int failed;
    private final int ok;
    private final String path;
    private final String summary;

    public static /* synthetic */ ContentExportResult copy$default(ContentExportResult contentExportResult, String str, int i, int i2, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = contentExportResult.path;
        }
        if ((i3 & 2) != 0) {
            i = contentExportResult.ok;
        }
        if ((i3 & 4) != 0) {
            i2 = contentExportResult.failed;
        }
        if ((i3 & 8) != 0) {
            str2 = contentExportResult.summary;
        }
        return contentExportResult.copy(str, i, i2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* renamed from: component2, reason: from getter */
    public final int getOk() {
        return this.ok;
    }

    /* renamed from: component3, reason: from getter */
    public final int getFailed() {
        return this.failed;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    public final ContentExportResult copy(String path, int ok, int failed, String summary) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(summary, "summary");
        return new ContentExportResult(path, ok, failed, summary);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentExportResult)) {
            return false;
        }
        ContentExportResult contentExportResult = (ContentExportResult) other;
        return Intrinsics.areEqual(this.path, contentExportResult.path) && this.ok == contentExportResult.ok && this.failed == contentExportResult.failed && Intrinsics.areEqual(this.summary, contentExportResult.summary);
    }

    public int hashCode() {
        return (((((this.path.hashCode() * 31) + Integer.hashCode(this.ok)) * 31) + Integer.hashCode(this.failed)) * 31) + this.summary.hashCode();
    }

    public String toString() {
        return "ContentExportResult(path=" + this.path + ", ok=" + this.ok + ", failed=" + this.failed + ", summary=" + this.summary + ")";
    }

    public ContentExportResult(String path, int ok, int failed, String summary) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(summary, "summary");
        this.path = path;
        this.ok = ok;
        this.failed = failed;
        this.summary = summary;
    }

    public final int getFailed() {
        return this.failed;
    }

    public final int getOk() {
        return this.ok;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getSummary() {
        return this.summary;
    }
}
