package com.pymcl.core.launch;

import com.pymcl.runtime.process.JavaProcessService;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LaunchArgs.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0001J\u0014\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010 \u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011¨\u0006!"}, d2 = {"Lcom/pymcl/core/launch/LaunchSpec;", "", "javaMajor", "", "workingDir", "", "jvmArgs", "", "mainClass", "gameArgs", "<init>", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "getJavaMajor", "()I", "getWorkingDir", "()Ljava/lang/String;", "getJvmArgs", "()Ljava/util/List;", "getMainClass", "getGameArgs", JavaProcessService.EXTRA_ARGS, "getArgs", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class LaunchSpec {
    private final List<String> gameArgs;
    private final int javaMajor;
    private final List<String> jvmArgs;
    private final String mainClass;
    private final String workingDir;

    public static /* synthetic */ LaunchSpec copy$default(LaunchSpec launchSpec, int i, String str, List list, String str2, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = launchSpec.javaMajor;
        }
        if ((i2 & 2) != 0) {
            str = launchSpec.workingDir;
        }
        if ((i2 & 4) != 0) {
            list = launchSpec.jvmArgs;
        }
        if ((i2 & 8) != 0) {
            str2 = launchSpec.mainClass;
        }
        if ((i2 & 16) != 0) {
            list2 = launchSpec.gameArgs;
        }
        List list3 = list2;
        List list4 = list;
        return launchSpec.copy(i, str, list4, str2, list3);
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
        return this.jvmArgs;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMainClass() {
        return this.mainClass;
    }

    public final List<String> component5() {
        return this.gameArgs;
    }

    public final LaunchSpec copy(int javaMajor, String workingDir, List<String> jvmArgs, String mainClass, List<String> gameArgs) {
        Intrinsics.checkNotNullParameter(workingDir, "workingDir");
        Intrinsics.checkNotNullParameter(jvmArgs, "jvmArgs");
        Intrinsics.checkNotNullParameter(mainClass, "mainClass");
        Intrinsics.checkNotNullParameter(gameArgs, "gameArgs");
        return new LaunchSpec(javaMajor, workingDir, jvmArgs, mainClass, gameArgs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LaunchSpec)) {
            return false;
        }
        LaunchSpec launchSpec = (LaunchSpec) other;
        return this.javaMajor == launchSpec.javaMajor && Intrinsics.areEqual(this.workingDir, launchSpec.workingDir) && Intrinsics.areEqual(this.jvmArgs, launchSpec.jvmArgs) && Intrinsics.areEqual(this.mainClass, launchSpec.mainClass) && Intrinsics.areEqual(this.gameArgs, launchSpec.gameArgs);
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.javaMajor) * 31) + this.workingDir.hashCode()) * 31) + this.jvmArgs.hashCode()) * 31) + this.mainClass.hashCode()) * 31) + this.gameArgs.hashCode();
    }

    public String toString() {
        return "LaunchSpec(javaMajor=" + this.javaMajor + ", workingDir=" + this.workingDir + ", jvmArgs=" + this.jvmArgs + ", mainClass=" + this.mainClass + ", gameArgs=" + this.gameArgs + ")";
    }

    public LaunchSpec(int javaMajor, String workingDir, List<String> jvmArgs, String mainClass, List<String> gameArgs) {
        Intrinsics.checkNotNullParameter(workingDir, "workingDir");
        Intrinsics.checkNotNullParameter(jvmArgs, "jvmArgs");
        Intrinsics.checkNotNullParameter(mainClass, "mainClass");
        Intrinsics.checkNotNullParameter(gameArgs, "gameArgs");
        this.javaMajor = javaMajor;
        this.workingDir = workingDir;
        this.jvmArgs = jvmArgs;
        this.mainClass = mainClass;
        this.gameArgs = gameArgs;
    }

    public final List<String> getGameArgs() {
        return this.gameArgs;
    }

    public final int getJavaMajor() {
        return this.javaMajor;
    }

    public final List<String> getJvmArgs() {
        return this.jvmArgs;
    }

    public final String getMainClass() {
        return this.mainClass;
    }

    public final String getWorkingDir() {
        return this.workingDir;
    }

    public final List<String> getArgs() {
        return CollectionsKt.plus((Collection) CollectionsKt.plus((Collection<? extends String>) this.jvmArgs, this.mainClass), (Iterable) this.gameArgs);
    }
}
