package com.pymcl.ai;

import com.pymcl.runtime.settings.SettingsProtocol;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Checkpoint.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0007HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/pymcl/ai/SnapshotResult;", "", SettingsProtocol.EXTRA_OK, "", "files", "", "warning", "", "<init>", "(ZILjava/lang/String;)V", "getOk", "()Z", "getFiles", "()I", "getWarning", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SnapshotResult {
    private final int files;
    private final boolean ok;
    private final String warning;

    public static /* synthetic */ SnapshotResult copy$default(SnapshotResult snapshotResult, boolean z, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = snapshotResult.ok;
        }
        if ((i2 & 2) != 0) {
            i = snapshotResult.files;
        }
        if ((i2 & 4) != 0) {
            str = snapshotResult.warning;
        }
        return snapshotResult.copy(z, i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getOk() {
        return this.ok;
    }

    /* renamed from: component2, reason: from getter */
    public final int getFiles() {
        return this.files;
    }

    /* renamed from: component3, reason: from getter */
    public final String getWarning() {
        return this.warning;
    }

    public final SnapshotResult copy(boolean ok, int files, String warning) {
        return new SnapshotResult(ok, files, warning);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SnapshotResult)) {
            return false;
        }
        SnapshotResult snapshotResult = (SnapshotResult) other;
        return this.ok == snapshotResult.ok && this.files == snapshotResult.files && Intrinsics.areEqual(this.warning, snapshotResult.warning);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.ok) * 31) + Integer.hashCode(this.files)) * 31) + (this.warning == null ? 0 : this.warning.hashCode());
    }

    public String toString() {
        return "SnapshotResult(ok=" + this.ok + ", files=" + this.files + ", warning=" + this.warning + ")";
    }

    public SnapshotResult(boolean ok, int files, String warning) {
        this.ok = ok;
        this.files = files;
        this.warning = warning;
    }

    public /* synthetic */ SnapshotResult(boolean z, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i, (i2 & 4) != 0 ? null : str);
    }

    public final int getFiles() {
        return this.files;
    }

    public final boolean getOk() {
        return this.ok;
    }

    public final String getWarning() {
        return this.warning;
    }
}
