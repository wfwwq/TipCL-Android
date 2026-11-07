package com.pymcl.android.ui.state;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LauncherUiApi.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tÊ\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0016"}, d2 = {"Lcom/pymcl/android/ui/state/ConflictRow;", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "file", "detail", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getFile", "getDetail", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class ConflictRow {
    public static final int $stable = 0;
    private final String detail;
    private final String file;
    private final String type;

    public static /* synthetic */ ConflictRow copy$default(ConflictRow conflictRow, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = conflictRow.type;
        }
        if ((i & 2) != 0) {
            str2 = conflictRow.file;
        }
        if ((i & 4) != 0) {
            str3 = conflictRow.detail;
        }
        return conflictRow.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFile() {
        return this.file;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDetail() {
        return this.detail;
    }

    public final ConflictRow copy(String type, String file, String detail) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(detail, "detail");
        return new ConflictRow(type, file, detail);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConflictRow)) {
            return false;
        }
        ConflictRow conflictRow = (ConflictRow) other;
        return Intrinsics.areEqual(this.type, conflictRow.type) && Intrinsics.areEqual(this.file, conflictRow.file) && Intrinsics.areEqual(this.detail, conflictRow.detail);
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + this.file.hashCode()) * 31) + this.detail.hashCode();
    }

    public String toString() {
        return "ConflictRow(type=" + this.type + ", file=" + this.file + ", detail=" + this.detail + ")";
    }

    public ConflictRow(String type, String file, String detail) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(detail, "detail");
        this.type = type;
        this.file = file;
        this.detail = detail;
    }

    public final String getDetail() {
        return this.detail;
    }

    public final String getFile() {
        return this.file;
    }

    public final String getType() {
        return this.type;
    }
}
