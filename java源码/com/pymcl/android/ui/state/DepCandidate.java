package com.pymcl.android.ui.state;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LauncherUiApi.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fÊ\u0001\f\b \u0012\b\b!\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001f"}, d2 = {"Lcom/pymcl/android/ui/state/DepCandidate;", "", "projectId", "", "title", "fileId", "fileName", "source", "iconUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getProjectId", "()Ljava/lang/String;", "getTitle", "getFileId", "getFileName", "getSource", "getIconUrl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class DepCandidate {
    public static final int $stable = 0;
    private final String fileId;
    private final String fileName;
    private final String iconUrl;
    private final String projectId;
    private final String source;
    private final String title;

    public static /* synthetic */ DepCandidate copy$default(DepCandidate depCandidate, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = depCandidate.projectId;
        }
        if ((i & 2) != 0) {
            str2 = depCandidate.title;
        }
        if ((i & 4) != 0) {
            str3 = depCandidate.fileId;
        }
        if ((i & 8) != 0) {
            str4 = depCandidate.fileName;
        }
        if ((i & 16) != 0) {
            str5 = depCandidate.source;
        }
        if ((i & 32) != 0) {
            str6 = depCandidate.iconUrl;
        }
        String str7 = str5;
        String str8 = str6;
        return depCandidate.copy(str, str2, str3, str4, str7, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getProjectId() {
        return this.projectId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFileId() {
        return this.fileId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component6, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final DepCandidate copy(String projectId, String title, String fileId, String fileName, String source, String iconUrl) {
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(fileId, "fileId");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        return new DepCandidate(projectId, title, fileId, fileName, source, iconUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DepCandidate)) {
            return false;
        }
        DepCandidate depCandidate = (DepCandidate) other;
        return Intrinsics.areEqual(this.projectId, depCandidate.projectId) && Intrinsics.areEqual(this.title, depCandidate.title) && Intrinsics.areEqual(this.fileId, depCandidate.fileId) && Intrinsics.areEqual(this.fileName, depCandidate.fileName) && Intrinsics.areEqual(this.source, depCandidate.source) && Intrinsics.areEqual(this.iconUrl, depCandidate.iconUrl);
    }

    public int hashCode() {
        return (((((((((this.projectId.hashCode() * 31) + this.title.hashCode()) * 31) + this.fileId.hashCode()) * 31) + this.fileName.hashCode()) * 31) + this.source.hashCode()) * 31) + this.iconUrl.hashCode();
    }

    public String toString() {
        return "DepCandidate(projectId=" + this.projectId + ", title=" + this.title + ", fileId=" + this.fileId + ", fileName=" + this.fileName + ", source=" + this.source + ", iconUrl=" + this.iconUrl + ")";
    }

    public DepCandidate(String projectId, String title, String fileId, String fileName, String source, String iconUrl) {
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(fileId, "fileId");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        this.projectId = projectId;
        this.title = title;
        this.fileId = fileId;
        this.fileName = fileName;
        this.source = source;
        this.iconUrl = iconUrl;
    }

    public /* synthetic */ DepCandidate(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? "" : str6);
    }

    public final String getFileId() {
        return this.fileId;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getProjectId() {
        return this.projectId;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getTitle() {
        return this.title;
    }
}
