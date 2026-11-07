package com.pymcl.android.ui.state;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Models.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003JD\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0014\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010!\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\"\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016Ê\u0001\f\b$\u0012\b\b%\u0012\u0004\b\u0003\u0010\u0002¨\u0006#"}, d2 = {"Lcom/pymcl/android/ui/state/GameExitInfo;", "", "instance", "", "version", "exitCode", "", "durationSec", "", "crash", "Lcom/pymcl/android/ui/state/CrashInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;JLcom/pymcl/android/ui/state/CrashInfo;)V", "getInstance", "()Ljava/lang/String;", "getVersion", "getExitCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDurationSec", "()J", "getCrash", "()Lcom/pymcl/android/ui/state/CrashInfo;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;JLcom/pymcl/android/ui/state/CrashInfo;)Lcom/pymcl/android/ui/state/GameExitInfo;", "equals", "", "other", "hashCode", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class GameExitInfo {
    public static final int $stable = 0;
    private final CrashInfo crash;
    private final long durationSec;
    private final Integer exitCode;
    private final String instance;
    private final String version;

    public static /* synthetic */ GameExitInfo copy$default(GameExitInfo gameExitInfo, String str, String str2, Integer num, long j, CrashInfo crashInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gameExitInfo.instance;
        }
        if ((i & 2) != 0) {
            str2 = gameExitInfo.version;
        }
        if ((i & 4) != 0) {
            num = gameExitInfo.exitCode;
        }
        if ((i & 8) != 0) {
            j = gameExitInfo.durationSec;
        }
        if ((i & 16) != 0) {
            crashInfo = gameExitInfo.crash;
        }
        CrashInfo crashInfo2 = crashInfo;
        Integer num2 = num;
        return gameExitInfo.copy(str, str2, num2, j, crashInfo2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getInstance() {
        return this.instance;
    }

    /* renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getExitCode() {
        return this.exitCode;
    }

    /* renamed from: component4, reason: from getter */
    public final long getDurationSec() {
        return this.durationSec;
    }

    /* renamed from: component5, reason: from getter */
    public final CrashInfo getCrash() {
        return this.crash;
    }

    public final GameExitInfo copy(String instance, String version, Integer exitCode, long durationSec, CrashInfo crash) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(version, "version");
        return new GameExitInfo(instance, version, exitCode, durationSec, crash);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GameExitInfo)) {
            return false;
        }
        GameExitInfo gameExitInfo = (GameExitInfo) other;
        return Intrinsics.areEqual(this.instance, gameExitInfo.instance) && Intrinsics.areEqual(this.version, gameExitInfo.version) && Intrinsics.areEqual(this.exitCode, gameExitInfo.exitCode) && this.durationSec == gameExitInfo.durationSec && Intrinsics.areEqual(this.crash, gameExitInfo.crash);
    }

    public int hashCode() {
        return (((((((this.instance.hashCode() * 31) + this.version.hashCode()) * 31) + (this.exitCode == null ? 0 : this.exitCode.hashCode())) * 31) + Long.hashCode(this.durationSec)) * 31) + (this.crash != null ? this.crash.hashCode() : 0);
    }

    public String toString() {
        return "GameExitInfo(instance=" + this.instance + ", version=" + this.version + ", exitCode=" + this.exitCode + ", durationSec=" + this.durationSec + ", crash=" + this.crash + ")";
    }

    public GameExitInfo(String instance, String version, Integer exitCode, long durationSec, CrashInfo crash) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(version, "version");
        this.instance = instance;
        this.version = version;
        this.exitCode = exitCode;
        this.durationSec = durationSec;
        this.crash = crash;
    }

    public final CrashInfo getCrash() {
        return this.crash;
    }

    public final long getDurationSec() {
        return this.durationSec;
    }

    public final Integer getExitCode() {
        return this.exitCode;
    }

    public final String getInstance() {
        return this.instance;
    }

    public final String getVersion() {
        return this.version;
    }
}
