package com.pymcl.core.instance;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Saves.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/pymcl/core/instance/RenameResult;", "", "newDirName", "", "levelNameUpdated", "", "<init>", "(Ljava/lang/String;Z)V", "getNewDirName", "()Ljava/lang/String;", "getLevelNameUpdated", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RenameResult {
    private final boolean levelNameUpdated;
    private final String newDirName;

    public static /* synthetic */ RenameResult copy$default(RenameResult renameResult, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = renameResult.newDirName;
        }
        if ((i & 2) != 0) {
            z = renameResult.levelNameUpdated;
        }
        return renameResult.copy(str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getNewDirName() {
        return this.newDirName;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getLevelNameUpdated() {
        return this.levelNameUpdated;
    }

    public final RenameResult copy(String newDirName, boolean levelNameUpdated) {
        Intrinsics.checkNotNullParameter(newDirName, "newDirName");
        return new RenameResult(newDirName, levelNameUpdated);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RenameResult)) {
            return false;
        }
        RenameResult renameResult = (RenameResult) other;
        return Intrinsics.areEqual(this.newDirName, renameResult.newDirName) && this.levelNameUpdated == renameResult.levelNameUpdated;
    }

    public int hashCode() {
        return (this.newDirName.hashCode() * 31) + Boolean.hashCode(this.levelNameUpdated);
    }

    public String toString() {
        return "RenameResult(newDirName=" + this.newDirName + ", levelNameUpdated=" + this.levelNameUpdated + ")";
    }

    public RenameResult(String newDirName, boolean levelNameUpdated) {
        Intrinsics.checkNotNullParameter(newDirName, "newDirName");
        this.newDirName = newDirName;
        this.levelNameUpdated = levelNameUpdated;
    }

    public final boolean getLevelNameUpdated() {
        return this.levelNameUpdated;
    }

    public final String getNewDirName() {
        return this.newDirName;
    }
}
