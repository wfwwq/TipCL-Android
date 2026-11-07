package com.pymcl.core.loader;

import com.pymcl.runtime.process.JavaProcessService;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Loaders.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\\\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00100\u000fH&¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/pymcl/core/loader/JavaProcessRunner;", "", "run", "", "javaMajor", "classpath", "", "Ljava/io/File;", "mainClass", "", JavaProcessService.EXTRA_ARGS, "workDir", "timeoutSec", "", "log", "Lkotlin/Function1;", "", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface JavaProcessRunner {
    int run(int javaMajor, List<? extends File> classpath, String mainClass, List<String> args, File workDir, long timeoutSec, Function1<? super String, Unit> log);

    /* compiled from: Loaders.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ int run$default(JavaProcessRunner javaProcessRunner, int i, List list, String str, List list2, File file, long j, Function1 function1, int i2, Object obj) {
        if (obj == null) {
            return javaProcessRunner.run(i, list, str, list2, file, (i2 & 32) != 0 ? 1800L : j, (i2 & 64) != 0 ? new Function1() { // from class: com.pymcl.core.loader.JavaProcessRunner$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return JavaProcessRunner.run$lambda$0((String) obj2);
                }
            } : function1);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: run");
    }

    /* JADX INFO: Access modifiers changed from: private */
    static Unit run$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
