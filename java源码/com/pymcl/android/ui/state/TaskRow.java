package com.pymcl.android.ui.state;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Models.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JL\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0014\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\"\u001a\u00020#HÖ\u0081\u0004J\n\u0010$\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eÊ\u0001\f\b&\u0012\b\b'\u0012\u0004\b\u0003\u0010\u0002¨\u0006%"}, d2 = {"Lcom/pymcl/android/ui/state/TaskRow;", "", "id", "", "title", NotificationCompat.CATEGORY_PROGRESS, "", "state", "Lcom/pymcl/android/ui/state/TaskState;", "detail", "kind", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Lcom/pymcl/android/ui/state/TaskState;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "getProgress", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getState", "()Lcom/pymcl/android/ui/state/TaskState;", "getDetail", "getKind", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Lcom/pymcl/android/ui/state/TaskState;Ljava/lang/String;Ljava/lang/String;)Lcom/pymcl/android/ui/state/TaskRow;", "equals", "", "other", "hashCode", "", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class TaskRow {
    public static final int $stable = 0;
    private final String detail;
    private final String id;
    private final String kind;
    private final Float progress;
    private final TaskState state;
    private final String title;

    public static /* synthetic */ TaskRow copy$default(TaskRow taskRow, String str, String str2, Float f, TaskState taskState, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taskRow.id;
        }
        if ((i & 2) != 0) {
            str2 = taskRow.title;
        }
        if ((i & 4) != 0) {
            f = taskRow.progress;
        }
        if ((i & 8) != 0) {
            taskState = taskRow.state;
        }
        if ((i & 16) != 0) {
            str3 = taskRow.detail;
        }
        if ((i & 32) != 0) {
            str4 = taskRow.kind;
        }
        String str5 = str3;
        String str6 = str4;
        return taskRow.copy(str, str2, f, taskState, str5, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final Float getProgress() {
        return this.progress;
    }

    /* renamed from: component4, reason: from getter */
    public final TaskState getState() {
        return this.state;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDetail() {
        return this.detail;
    }

    /* renamed from: component6, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    public final TaskRow copy(String id, String title, Float progress, TaskState state, String detail, String kind) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(detail, "detail");
        Intrinsics.checkNotNullParameter(kind, "kind");
        return new TaskRow(id, title, progress, state, detail, kind);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaskRow)) {
            return false;
        }
        TaskRow taskRow = (TaskRow) other;
        return Intrinsics.areEqual(this.id, taskRow.id) && Intrinsics.areEqual(this.title, taskRow.title) && Intrinsics.areEqual((Object) this.progress, (Object) taskRow.progress) && this.state == taskRow.state && Intrinsics.areEqual(this.detail, taskRow.detail) && Intrinsics.areEqual(this.kind, taskRow.kind);
    }

    public int hashCode() {
        return (((((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + (this.progress == null ? 0 : this.progress.hashCode())) * 31) + this.state.hashCode()) * 31) + this.detail.hashCode()) * 31) + this.kind.hashCode();
    }

    public String toString() {
        return "TaskRow(id=" + this.id + ", title=" + this.title + ", progress=" + this.progress + ", state=" + this.state + ", detail=" + this.detail + ", kind=" + this.kind + ")";
    }

    public TaskRow(String id, String title, Float progress, TaskState state, String detail, String kind) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(detail, "detail");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.id = id;
        this.title = title;
        this.progress = progress;
        this.state = state;
        this.detail = detail;
        this.kind = kind;
    }

    public /* synthetic */ TaskRow(String str, String str2, Float f, TaskState taskState, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, f, taskState, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "download" : str4);
    }

    public final String getDetail() {
        return this.detail;
    }

    public final String getId() {
        return this.id;
    }

    public final String getKind() {
        return this.kind;
    }

    public final Float getProgress() {
        return this.progress;
    }

    public final TaskState getState() {
        return this.state;
    }

    public final String getTitle() {
        return this.title;
    }
}
