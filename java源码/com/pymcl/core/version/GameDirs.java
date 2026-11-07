package com.pymcl.core.version;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GameInstaller.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\t¨\u0006\u001b"}, d2 = {"Lcom/pymcl/core/version/GameDirs;", "", "instanceDir", "Ljava/io/File;", "librariesDir", "assetsDir", "<init>", "(Ljava/io/File;Ljava/io/File;Ljava/io/File;)V", "getInstanceDir", "()Ljava/io/File;", "getLibrariesDir", "getAssetsDir", "versionsDir", "getVersionsDir", "nativesDir", "id", "", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class GameDirs {
    private final File assetsDir;
    private final File instanceDir;
    private final File librariesDir;

    public static /* synthetic */ GameDirs copy$default(GameDirs gameDirs, File file, File file2, File file3, int i, Object obj) {
        if ((i & 1) != 0) {
            file = gameDirs.instanceDir;
        }
        if ((i & 2) != 0) {
            file2 = gameDirs.librariesDir;
        }
        if ((i & 4) != 0) {
            file3 = gameDirs.assetsDir;
        }
        return gameDirs.copy(file, file2, file3);
    }

    /* renamed from: component1, reason: from getter */
    public final File getInstanceDir() {
        return this.instanceDir;
    }

    /* renamed from: component2, reason: from getter */
    public final File getLibrariesDir() {
        return this.librariesDir;
    }

    /* renamed from: component3, reason: from getter */
    public final File getAssetsDir() {
        return this.assetsDir;
    }

    public final GameDirs copy(File instanceDir, File librariesDir, File assetsDir) {
        Intrinsics.checkNotNullParameter(instanceDir, "instanceDir");
        Intrinsics.checkNotNullParameter(librariesDir, "librariesDir");
        Intrinsics.checkNotNullParameter(assetsDir, "assetsDir");
        return new GameDirs(instanceDir, librariesDir, assetsDir);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GameDirs)) {
            return false;
        }
        GameDirs gameDirs = (GameDirs) other;
        return Intrinsics.areEqual(this.instanceDir, gameDirs.instanceDir) && Intrinsics.areEqual(this.librariesDir, gameDirs.librariesDir) && Intrinsics.areEqual(this.assetsDir, gameDirs.assetsDir);
    }

    public int hashCode() {
        return (((this.instanceDir.hashCode() * 31) + this.librariesDir.hashCode()) * 31) + this.assetsDir.hashCode();
    }

    public String toString() {
        return "GameDirs(instanceDir=" + this.instanceDir + ", librariesDir=" + this.librariesDir + ", assetsDir=" + this.assetsDir + ")";
    }

    public GameDirs(File instanceDir, File librariesDir, File assetsDir) {
        Intrinsics.checkNotNullParameter(instanceDir, "instanceDir");
        Intrinsics.checkNotNullParameter(librariesDir, "librariesDir");
        Intrinsics.checkNotNullParameter(assetsDir, "assetsDir");
        this.instanceDir = instanceDir;
        this.librariesDir = librariesDir;
        this.assetsDir = assetsDir;
    }

    public /* synthetic */ GameDirs(File file, File file2, File file3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i & 2) != 0 ? new File(file, "libraries") : file2, (i & 4) != 0 ? new File(file, "assets") : file3);
    }

    public final File getAssetsDir() {
        return this.assetsDir;
    }

    public final File getInstanceDir() {
        return this.instanceDir;
    }

    public final File getLibrariesDir() {
        return this.librariesDir;
    }

    public final File getVersionsDir() {
        return new File(this.instanceDir, "versions");
    }

    public final File nativesDir(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new File(getVersionsDir(), id + "/natives");
    }
}
