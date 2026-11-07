package com.pymcl.core.instance;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Saves.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/pymcl/core/instance/SaveTarget;", "", "version", "", "gameDir", "Ljava/io/File;", "<init>", "(Ljava/lang/String;Ljava/io/File;)V", "getVersion", "()Ljava/lang/String;", "getGameDir", "()Ljava/io/File;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SaveTarget {
    private final File gameDir;
    private final String version;

    public static /* synthetic */ SaveTarget copy$default(SaveTarget saveTarget, String str, File file, int i, Object obj) {
        if ((i & 1) != 0) {
            str = saveTarget.version;
        }
        if ((i & 2) != 0) {
            file = saveTarget.gameDir;
        }
        return saveTarget.copy(str, file);
    }

    /* renamed from: component1, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* renamed from: component2, reason: from getter */
    public final File getGameDir() {
        return this.gameDir;
    }

    public final SaveTarget copy(String version, File gameDir) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(gameDir, "gameDir");
        return new SaveTarget(version, gameDir);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SaveTarget)) {
            return false;
        }
        SaveTarget saveTarget = (SaveTarget) other;
        return Intrinsics.areEqual(this.version, saveTarget.version) && Intrinsics.areEqual(this.gameDir, saveTarget.gameDir);
    }

    public int hashCode() {
        return (this.version.hashCode() * 31) + this.gameDir.hashCode();
    }

    public String toString() {
        return "SaveTarget(version=" + this.version + ", gameDir=" + this.gameDir + ")";
    }

    public SaveTarget(String version, File gameDir) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(gameDir, "gameDir");
        this.version = version;
        this.gameDir = gameDir;
    }

    public final File getGameDir() {
        return this.gameDir;
    }

    public final String getVersion() {
        return this.version;
    }
}
