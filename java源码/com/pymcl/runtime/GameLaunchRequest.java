package com.pymcl.runtime;

import com.pymcl.runtime.process.JavaProcessService;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GameLaunchRequest.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 (2\u00020\u0001:\u0001(BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003JU\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0014\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0083\u0004J\n\u0010&\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010'\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006)"}, d2 = {"Lcom/pymcl/runtime/GameLaunchRequest;", "Ljava/io/Serializable;", "javaMajor", "", "workingDir", "", JavaProcessService.EXTRA_ARGS, "", "rendererId", "lwjglVersion", "mcVersion", "windowScale", "", "<init>", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;F)V", "getJavaMajor", "()I", "getWorkingDir", "()Ljava/lang/String;", "getArgs", "()Ljava/util/List;", "getRendererId", "getLwjglVersion", "getMcVersion", "getWindowScale", "()F", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "toString", "Companion", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GameLaunchRequest implements Serializable {
    private static final long serialVersionUID = 3;
    private final List<String> args;
    private final int javaMajor;
    private final String lwjglVersion;
    private final String mcVersion;
    private final String rendererId;
    private final float windowScale;
    private final String workingDir;

    public static /* synthetic */ GameLaunchRequest copy$default(GameLaunchRequest gameLaunchRequest, int i, String str, List list, String str2, String str3, String str4, float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = gameLaunchRequest.javaMajor;
        }
        if ((i2 & 2) != 0) {
            str = gameLaunchRequest.workingDir;
        }
        if ((i2 & 4) != 0) {
            list = gameLaunchRequest.args;
        }
        if ((i2 & 8) != 0) {
            str2 = gameLaunchRequest.rendererId;
        }
        if ((i2 & 16) != 0) {
            str3 = gameLaunchRequest.lwjglVersion;
        }
        if ((i2 & 32) != 0) {
            str4 = gameLaunchRequest.mcVersion;
        }
        if ((i2 & 64) != 0) {
            f = gameLaunchRequest.windowScale;
        }
        String str5 = str4;
        float f2 = f;
        String str6 = str3;
        List list2 = list;
        return gameLaunchRequest.copy(i, str, list2, str2, str6, str5, f2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getJavaMajor() {
        return this.javaMajor;
    }

    /* renamed from: component2, reason: from getter */
    public final String getWorkingDir() {
        return this.workingDir;
    }

    public final List<String> component3() {
        return this.args;
    }

    /* renamed from: component4, reason: from getter */
    public final String getRendererId() {
        return this.rendererId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLwjglVersion() {
        return this.lwjglVersion;
    }

    /* renamed from: component6, reason: from getter */
    public final String getMcVersion() {
        return this.mcVersion;
    }

    /* renamed from: component7, reason: from getter */
    public final float getWindowScale() {
        return this.windowScale;
    }

    public final GameLaunchRequest copy(int javaMajor, String workingDir, List<String> args, String rendererId, String lwjglVersion, String mcVersion, float windowScale) {
        Intrinsics.checkNotNullParameter(workingDir, "workingDir");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(rendererId, "rendererId");
        Intrinsics.checkNotNullParameter(lwjglVersion, "lwjglVersion");
        Intrinsics.checkNotNullParameter(mcVersion, "mcVersion");
        return new GameLaunchRequest(javaMajor, workingDir, args, rendererId, lwjglVersion, mcVersion, windowScale);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GameLaunchRequest)) {
            return false;
        }
        GameLaunchRequest gameLaunchRequest = (GameLaunchRequest) other;
        return this.javaMajor == gameLaunchRequest.javaMajor && Intrinsics.areEqual(this.workingDir, gameLaunchRequest.workingDir) && Intrinsics.areEqual(this.args, gameLaunchRequest.args) && Intrinsics.areEqual(this.rendererId, gameLaunchRequest.rendererId) && Intrinsics.areEqual(this.lwjglVersion, gameLaunchRequest.lwjglVersion) && Intrinsics.areEqual(this.mcVersion, gameLaunchRequest.mcVersion) && Float.compare(this.windowScale, gameLaunchRequest.windowScale) == 0;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.javaMajor) * 31) + this.workingDir.hashCode()) * 31) + this.args.hashCode()) * 31) + this.rendererId.hashCode()) * 31) + this.lwjglVersion.hashCode()) * 31) + this.mcVersion.hashCode()) * 31) + Float.hashCode(this.windowScale);
    }

    public String toString() {
        return "GameLaunchRequest(javaMajor=" + this.javaMajor + ", workingDir=" + this.workingDir + ", args=" + this.args + ", rendererId=" + this.rendererId + ", lwjglVersion=" + this.lwjglVersion + ", mcVersion=" + this.mcVersion + ", windowScale=" + this.windowScale + ")";
    }

    public GameLaunchRequest(int javaMajor, String workingDir, List<String> args, String rendererId, String lwjglVersion, String mcVersion, float windowScale) {
        Intrinsics.checkNotNullParameter(workingDir, "workingDir");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(rendererId, "rendererId");
        Intrinsics.checkNotNullParameter(lwjglVersion, "lwjglVersion");
        Intrinsics.checkNotNullParameter(mcVersion, "mcVersion");
        this.javaMajor = javaMajor;
        this.workingDir = workingDir;
        this.args = args;
        this.rendererId = rendererId;
        this.lwjglVersion = lwjglVersion;
        this.mcVersion = mcVersion;
        this.windowScale = windowScale;
    }

    public /* synthetic */ GameLaunchRequest(int i, String str, List list, String str2, String str3, String str4, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, list, (i2 & 8) != 0 ? Renderers.INSTANCE.getGL4ES().getId() : str2, (i2 & 16) != 0 ? "3.3.3" : str3, (i2 & 32) != 0 ? "" : str4, (i2 & 64) != 0 ? 1.0f : f);
    }

    public final int getJavaMajor() {
        return this.javaMajor;
    }

    public final String getWorkingDir() {
        return this.workingDir;
    }

    public final List<String> getArgs() {
        return this.args;
    }

    public final String getRendererId() {
        return this.rendererId;
    }

    public final String getLwjglVersion() {
        return this.lwjglVersion;
    }

    public final String getMcVersion() {
        return this.mcVersion;
    }

    public final float getWindowScale() {
        return this.windowScale;
    }
}
