package com.pymcl.android.ui.state;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Models.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nÊ\u0001\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0019"}, d2 = {"Lcom/pymcl/android/ui/state/FeedbackRecord;", "", "title", "", "kind", NotificationCompat.CATEGORY_STATUS, "date", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getKind", "getStatus", "getDate", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class FeedbackRecord {
    public static final int $stable = 0;
    private final String date;
    private final String kind;
    private final String status;
    private final String title;

    public static /* synthetic */ FeedbackRecord copy$default(FeedbackRecord feedbackRecord, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedbackRecord.title;
        }
        if ((i & 2) != 0) {
            str2 = feedbackRecord.kind;
        }
        if ((i & 4) != 0) {
            str3 = feedbackRecord.status;
        }
        if ((i & 8) != 0) {
            str4 = feedbackRecord.date;
        }
        return feedbackRecord.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    public final FeedbackRecord copy(String title, String kind, String status, String date) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(date, "date");
        return new FeedbackRecord(title, kind, status, date);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedbackRecord)) {
            return false;
        }
        FeedbackRecord feedbackRecord = (FeedbackRecord) other;
        return Intrinsics.areEqual(this.title, feedbackRecord.title) && Intrinsics.areEqual(this.kind, feedbackRecord.kind) && Intrinsics.areEqual(this.status, feedbackRecord.status) && Intrinsics.areEqual(this.date, feedbackRecord.date);
    }

    public int hashCode() {
        return (((((this.title.hashCode() * 31) + this.kind.hashCode()) * 31) + this.status.hashCode()) * 31) + this.date.hashCode();
    }

    public String toString() {
        return "FeedbackRecord(title=" + this.title + ", kind=" + this.kind + ", status=" + this.status + ", date=" + this.date + ")";
    }

    public FeedbackRecord(String title, String kind, String status, String date) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(date, "date");
        this.title = title;
        this.kind = kind;
        this.status = status;
        this.date = date;
    }

    public final String getDate() {
        return this.date;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }
}
