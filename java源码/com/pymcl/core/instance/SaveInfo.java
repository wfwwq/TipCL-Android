package com.pymcl.core.instance;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Saves.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b)\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018J\t\u0010'\u001a\u00020\nHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003Jx\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010.J\u0014\u0010/\u001a\u00020\n2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00101\u001a\u00020\bHÖ\u0081\u0004J\n\u00102\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0011\u0010!\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0013¨\u00063"}, d2 = {"Lcom/pymcl/core/instance/SaveInfo;", "", "dirName", "", "levelName", "lastPlayed", "", "gameMode", "", "hardcore", "", "versionName", "sizeBytes", "iconPath", "path", "readOk", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Integer;ZLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Z)V", "getDirName", "()Ljava/lang/String;", "getLevelName", "getLastPlayed", "()J", "getGameMode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHardcore", "()Z", "getVersionName", "getSizeBytes", "getIconPath", "getPath", "getReadOk", "modeLabel", "getModeLabel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Integer;ZLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Z)Lcom/pymcl/core/instance/SaveInfo;", "equals", "other", "hashCode", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SaveInfo {
    private final String dirName;
    private final Integer gameMode;
    private final boolean hardcore;
    private final String iconPath;
    private final long lastPlayed;
    private final String levelName;
    private final String path;
    private final boolean readOk;
    private final long sizeBytes;
    private final String versionName;

    public static /* synthetic */ SaveInfo copy$default(SaveInfo saveInfo, String str, String str2, long j, Integer num, boolean z, String str3, long j2, String str4, String str5, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = saveInfo.dirName;
        }
        if ((i & 2) != 0) {
            str2 = saveInfo.levelName;
        }
        if ((i & 4) != 0) {
            j = saveInfo.lastPlayed;
        }
        if ((i & 8) != 0) {
            num = saveInfo.gameMode;
        }
        if ((i & 16) != 0) {
            z = saveInfo.hardcore;
        }
        if ((i & 32) != 0) {
            str3 = saveInfo.versionName;
        }
        if ((i & 64) != 0) {
            j2 = saveInfo.sizeBytes;
        }
        if ((i & 128) != 0) {
            str4 = saveInfo.iconPath;
        }
        if ((i & 256) != 0) {
            str5 = saveInfo.path;
        }
        if ((i & 512) != 0) {
            z2 = saveInfo.readOk;
        }
        boolean z3 = z2;
        String str6 = str4;
        long j3 = j2;
        String str7 = str3;
        Integer num2 = num;
        long j4 = j;
        return saveInfo.copy(str, str2, j4, num2, z, str7, j3, str6, str5, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDirName() {
        return this.dirName;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getReadOk() {
        return this.readOk;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLevelName() {
        return this.levelName;
    }

    /* renamed from: component3, reason: from getter */
    public final long getLastPlayed() {
        return this.lastPlayed;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getGameMode() {
        return this.gameMode;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getHardcore() {
        return this.hardcore;
    }

    /* renamed from: component6, reason: from getter */
    public final String getVersionName() {
        return this.versionName;
    }

    /* renamed from: component7, reason: from getter */
    public final long getSizeBytes() {
        return this.sizeBytes;
    }

    /* renamed from: component8, reason: from getter */
    public final String getIconPath() {
        return this.iconPath;
    }

    /* renamed from: component9, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    public final SaveInfo copy(String dirName, String levelName, long lastPlayed, Integer gameMode, boolean hardcore, String versionName, long sizeBytes, String iconPath, String path, boolean readOk) {
        Intrinsics.checkNotNullParameter(dirName, "dirName");
        Intrinsics.checkNotNullParameter(levelName, "levelName");
        Intrinsics.checkNotNullParameter(path, "path");
        return new SaveInfo(dirName, levelName, lastPlayed, gameMode, hardcore, versionName, sizeBytes, iconPath, path, readOk);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SaveInfo)) {
            return false;
        }
        SaveInfo saveInfo = (SaveInfo) other;
        return Intrinsics.areEqual(this.dirName, saveInfo.dirName) && Intrinsics.areEqual(this.levelName, saveInfo.levelName) && this.lastPlayed == saveInfo.lastPlayed && Intrinsics.areEqual(this.gameMode, saveInfo.gameMode) && this.hardcore == saveInfo.hardcore && Intrinsics.areEqual(this.versionName, saveInfo.versionName) && this.sizeBytes == saveInfo.sizeBytes && Intrinsics.areEqual(this.iconPath, saveInfo.iconPath) && Intrinsics.areEqual(this.path, saveInfo.path) && this.readOk == saveInfo.readOk;
    }

    public int hashCode() {
        return (((((((((((((((((this.dirName.hashCode() * 31) + this.levelName.hashCode()) * 31) + Long.hashCode(this.lastPlayed)) * 31) + (this.gameMode == null ? 0 : this.gameMode.hashCode())) * 31) + Boolean.hashCode(this.hardcore)) * 31) + (this.versionName == null ? 0 : this.versionName.hashCode())) * 31) + Long.hashCode(this.sizeBytes)) * 31) + (this.iconPath != null ? this.iconPath.hashCode() : 0)) * 31) + this.path.hashCode()) * 31) + Boolean.hashCode(this.readOk);
    }

    public String toString() {
        return "SaveInfo(dirName=" + this.dirName + ", levelName=" + this.levelName + ", lastPlayed=" + this.lastPlayed + ", gameMode=" + this.gameMode + ", hardcore=" + this.hardcore + ", versionName=" + this.versionName + ", sizeBytes=" + this.sizeBytes + ", iconPath=" + this.iconPath + ", path=" + this.path + ", readOk=" + this.readOk + ")";
    }

    public SaveInfo(String dirName, String levelName, long lastPlayed, Integer gameMode, boolean hardcore, String versionName, long sizeBytes, String iconPath, String path, boolean readOk) {
        Intrinsics.checkNotNullParameter(dirName, "dirName");
        Intrinsics.checkNotNullParameter(levelName, "levelName");
        Intrinsics.checkNotNullParameter(path, "path");
        this.dirName = dirName;
        this.levelName = levelName;
        this.lastPlayed = lastPlayed;
        this.gameMode = gameMode;
        this.hardcore = hardcore;
        this.versionName = versionName;
        this.sizeBytes = sizeBytes;
        this.iconPath = iconPath;
        this.path = path;
        this.readOk = readOk;
    }

    public final String getDirName() {
        return this.dirName;
    }

    public final Integer getGameMode() {
        return this.gameMode;
    }

    public final boolean getHardcore() {
        return this.hardcore;
    }

    public final long getLastPlayed() {
        return this.lastPlayed;
    }

    public final String getLevelName() {
        return this.levelName;
    }

    public final String getIconPath() {
        return this.iconPath;
    }

    public final String getPath() {
        return this.path;
    }

    public final boolean getReadOk() {
        return this.readOk;
    }

    public final long getSizeBytes() {
        return this.sizeBytes;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public final String getModeLabel() {
        if (this.hardcore) {
            return "极限";
        }
        Integer num = this.gameMode;
        return (num != null && num.intValue() == 0) ? "生存" : (num != null && num.intValue() == 1) ? "创造" : (num != null && num.intValue() == 2) ? "冒险" : (num != null && num.intValue() == 3) ? "旁观" : "";
    }
}
