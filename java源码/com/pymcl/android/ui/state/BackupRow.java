package com.pymcl.android.ui.state;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Models.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rÊ\u0001\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0017"}, d2 = {"Lcom/pymcl/android/ui/state/BackupRow;", "", HintConstants.AUTOFILL_HINT_NAME, "", "time", "sizeMb", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getName", "()Ljava/lang/String;", "getTime", "getSizeMb", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class BackupRow {
    public static final int $stable = 0;
    private final String name;
    private final int sizeMb;
    private final String time;

    public static /* synthetic */ BackupRow copy$default(BackupRow backupRow, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = backupRow.name;
        }
        if ((i2 & 2) != 0) {
            str2 = backupRow.time;
        }
        if ((i2 & 4) != 0) {
            i = backupRow.sizeMb;
        }
        return backupRow.copy(str, str2, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTime() {
        return this.time;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSizeMb() {
        return this.sizeMb;
    }

    public final BackupRow copy(String name, String time, int sizeMb) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(time, "time");
        return new BackupRow(name, time, sizeMb);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BackupRow)) {
            return false;
        }
        BackupRow backupRow = (BackupRow) other;
        return Intrinsics.areEqual(this.name, backupRow.name) && Intrinsics.areEqual(this.time, backupRow.time) && this.sizeMb == backupRow.sizeMb;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.time.hashCode()) * 31) + Integer.hashCode(this.sizeMb);
    }

    public String toString() {
        return "BackupRow(name=" + this.name + ", time=" + this.time + ", sizeMb=" + this.sizeMb + ")";
    }

    public BackupRow(String name, String time, int sizeMb) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(time, "time");
        this.name = name;
        this.time = time;
        this.sizeMb = sizeMb;
    }

    public final String getName() {
        return this.name;
    }

    public final int getSizeMb() {
        return this.sizeMb;
    }

    public final String getTime() {
        return this.time;
    }
}
