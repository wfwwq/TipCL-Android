package com.pymcl.core.loader;

import com.pymcl.runtime.process.JavaProcessService;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Loaders.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JX\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¨\u0006\u0013"}, d2 = {"Lcom/pymcl/core/loader/UnavailableJavaRunner;", "Lcom/pymcl/core/loader/JavaProcessRunner;", "<init>", "()V", "run", "", "javaMajor", "classpath", "", "Ljava/io/File;", "mainClass", "", JavaProcessService.EXTRA_ARGS, "workDir", "timeoutSec", "", "log", "Lkotlin/Function1;", "", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UnavailableJavaRunner implements JavaProcessRunner {
    public static final UnavailableJavaRunner INSTANCE = new UnavailableJavaRunner();

    private UnavailableJavaRunner() {
    }

    @Override // com.pymcl.core.loader.JavaProcessRunner
    public int run(int javaMajor, List<? extends File> classpath, String mainClass, List<String> args, File workDir, long timeoutSec, Function1<? super String, Unit> log) throws InstallError {
        Intrinsics.checkNotNullParameter(classpath, "classpath");
        Intrinsics.checkNotNullParameter(mainClass, "mainClass");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(workDir, "workDir");
        Intrinsics.checkNotNullParameter(log, "log");
        throw new InstallError("当前构建未接入 :runtime 的 Java 子进程执行器，无法运行 Forge/NeoForge 安装处理器", null, 2, null);
    }
}
