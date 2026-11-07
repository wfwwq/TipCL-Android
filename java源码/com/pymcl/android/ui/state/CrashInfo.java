package com.pymcl.android.ui.state;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Models.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u000eHÆ\u0003Jo\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0014\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010+\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010,\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dÊ\u0001\f\b.\u0012\b\b/\u0012\u0004\b\u0003\u0010\u0002¨\u0006-"}, d2 = {"Lcom/pymcl/android/ui/state/CrashInfo;", "", "instance", "", "version", "exitCode", "", "title", "explain", "actions", "", "logTail", "gameDir", "scene", "Lcom/pymcl/android/ui/state/CrashScene;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/pymcl/android/ui/state/CrashScene;)V", "getInstance", "()Ljava/lang/String;", "getVersion", "getExitCode", "()I", "getTitle", "getExplain", "getActions", "()Ljava/util/List;", "getLogTail", "getGameDir", "getScene", "()Lcom/pymcl/android/ui/state/CrashScene;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class CrashInfo {
    public static final int $stable = 0;
    private final List<String> actions;
    private final int exitCode;
    private final String explain;
    private final String gameDir;
    private final String instance;
    private final List<String> logTail;
    private final CrashScene scene;
    private final String title;
    private final String version;

    public static /* synthetic */ CrashInfo copy$default(CrashInfo crashInfo, String str, String str2, int i, String str3, String str4, List list, List list2, String str5, CrashScene crashScene, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = crashInfo.instance;
        }
        if ((i2 & 2) != 0) {
            str2 = crashInfo.version;
        }
        if ((i2 & 4) != 0) {
            i = crashInfo.exitCode;
        }
        if ((i2 & 8) != 0) {
            str3 = crashInfo.title;
        }
        if ((i2 & 16) != 0) {
            str4 = crashInfo.explain;
        }
        if ((i2 & 32) != 0) {
            list = crashInfo.actions;
        }
        if ((i2 & 64) != 0) {
            list2 = crashInfo.logTail;
        }
        if ((i2 & 128) != 0) {
            str5 = crashInfo.gameDir;
        }
        if ((i2 & 256) != 0) {
            crashScene = crashInfo.scene;
        }
        String str6 = str5;
        CrashScene crashScene2 = crashScene;
        List list3 = list;
        List list4 = list2;
        String str7 = str4;
        int i3 = i;
        return crashInfo.copy(str, str2, i3, str3, str7, list3, list4, str6, crashScene2);
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
    public final int getExitCode() {
        return this.exitCode;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component5, reason: from getter */
    public final String getExplain() {
        return this.explain;
    }

    public final List<String> component6() {
        return this.actions;
    }

    public final List<String> component7() {
        return this.logTail;
    }

    /* renamed from: component8, reason: from getter */
    public final String getGameDir() {
        return this.gameDir;
    }

    /* renamed from: component9, reason: from getter */
    public final CrashScene getScene() {
        return this.scene;
    }

    public final CrashInfo copy(String instance, String version, int exitCode, String title, String explain, List<String> actions, List<String> logTail, String gameDir, CrashScene scene) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(explain, "explain");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(logTail, "logTail");
        Intrinsics.checkNotNullParameter(gameDir, "gameDir");
        Intrinsics.checkNotNullParameter(scene, "scene");
        return new CrashInfo(instance, version, exitCode, title, explain, actions, logTail, gameDir, scene);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CrashInfo)) {
            return false;
        }
        CrashInfo crashInfo = (CrashInfo) other;
        return Intrinsics.areEqual(this.instance, crashInfo.instance) && Intrinsics.areEqual(this.version, crashInfo.version) && this.exitCode == crashInfo.exitCode && Intrinsics.areEqual(this.title, crashInfo.title) && Intrinsics.areEqual(this.explain, crashInfo.explain) && Intrinsics.areEqual(this.actions, crashInfo.actions) && Intrinsics.areEqual(this.logTail, crashInfo.logTail) && Intrinsics.areEqual(this.gameDir, crashInfo.gameDir) && this.scene == crashInfo.scene;
    }

    public int hashCode() {
        return (((((((((((((((this.instance.hashCode() * 31) + this.version.hashCode()) * 31) + Integer.hashCode(this.exitCode)) * 31) + this.title.hashCode()) * 31) + this.explain.hashCode()) * 31) + this.actions.hashCode()) * 31) + this.logTail.hashCode()) * 31) + this.gameDir.hashCode()) * 31) + this.scene.hashCode();
    }

    public String toString() {
        return "CrashInfo(instance=" + this.instance + ", version=" + this.version + ", exitCode=" + this.exitCode + ", title=" + this.title + ", explain=" + this.explain + ", actions=" + this.actions + ", logTail=" + this.logTail + ", gameDir=" + this.gameDir + ", scene=" + this.scene + ")";
    }

    public CrashInfo(String instance, String version, int exitCode, String title, String explain, List<String> actions, List<String> logTail, String gameDir, CrashScene scene) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(explain, "explain");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(logTail, "logTail");
        Intrinsics.checkNotNullParameter(gameDir, "gameDir");
        Intrinsics.checkNotNullParameter(scene, "scene");
        this.instance = instance;
        this.version = version;
        this.exitCode = exitCode;
        this.title = title;
        this.explain = explain;
        this.actions = actions;
        this.logTail = logTail;
        this.gameDir = gameDir;
        this.scene = scene;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CrashInfo(String str, String str2, int i, String str3, String str4, List list, List list2, String str5, CrashScene crashScene, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        CrashScene crashScene2;
        if ((i2 & 128) == 0) {
            str6 = str5;
        } else {
            str6 = "";
        }
        if ((i2 & 256) == 0) {
            crashScene2 = crashScene;
        } else {
            crashScene2 = CrashScene.GAME_RUN;
        }
        this(str, str2, i, str3, str4, list, list2, str6, crashScene2);
    }

    public final int getExitCode() {
        return this.exitCode;
    }

    public final String getExplain() {
        return this.explain;
    }

    public final String getInstance() {
        return this.instance;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getVersion() {
        return this.version;
    }

    public final List<String> getActions() {
        return this.actions;
    }

    public final String getGameDir() {
        return this.gameDir;
    }

    public final List<String> getLogTail() {
        return this.logTail;
    }

    public final CrashScene getScene() {
        return this.scene;
    }
}
