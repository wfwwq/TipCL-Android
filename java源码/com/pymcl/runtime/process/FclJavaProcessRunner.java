package com.pymcl.runtime.process;

import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.pymcl.core.loader.InstallError;
import com.pymcl.core.loader.JavaProcessRunner;
import com.pymcl.core.util.FileUtil;
import com.pymcl.runtime.RuntimeInstaller;
import com.pymcl.runtime.process.FclJavaProcessRunner;
import com.tungsten.fclauncher.utils.FCLPath;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.lang3.CharUtils;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.util.spvc.Spv;

/* compiled from: FclJavaProcessRunner.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 !2\u00020\u0001:\u0002!\"B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005JX\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002Jb\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00180\u00172\b\b\u0002\u0010\u001d\u001a\u00020\u000bH\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000bH\u0002R\u0016\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/pymcl/runtime/process/FclJavaProcessRunner;", "Lcom/pymcl/core/loader/JavaProcessRunner;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "ctx", "kotlin.jvm.PlatformType", "lock", "", "run", "", "javaMajor", "classpath", "", "Ljava/io/File;", "mainClass", "", JavaProcessService.EXTRA_ARGS, "workDir", "timeoutSec", "", "log", "Lkotlin/Function1;", "", "installedMajors", "inst", "Lcom/pymcl/runtime/RuntimeInstaller;", "runLocked", "attempt", "alive", "", "pid", "Companion", "Tail", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FclJavaProcessRunner implements JavaProcessRunner {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Context ctx;
    private final Object lock;

    public FclJavaProcessRunner(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.ctx = context.getApplicationContext();
        this.lock = new Object();
    }

    /* compiled from: FclJavaProcessRunner.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0002\u0010\tJ@\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0006\u0010\u000f\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000e¨\u0006\u0013"}, d2 = {"Lcom/pymcl/runtime/process/FclJavaProcessRunner$Companion;", "", "<init>", "()V", "pickJava", "", "requested", "installed", "", "(ILjava/util/Collection;)Ljava/lang/Integer;", "buildArgs", "", "", "classpath", "Ljava/io/File;", "mainClass", JavaProcessService.EXTRA_ARGS, "tmpDir", "workDir", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Integer pickJava(int requested, Collection<Integer> installed) {
            Intrinsics.checkNotNullParameter(installed, "installed");
            if (installed.contains(Integer.valueOf(requested))) {
                return Integer.valueOf(requested);
            }
            Collection<Integer> $this$filter$iv = installed;
            Collection destination$iv$iv = new ArrayList();
            for (Object element$iv$iv : $this$filter$iv) {
                int it = ((Number) element$iv$iv).intValue();
                if (it >= requested) {
                    destination$iv$iv.add(element$iv$iv);
                }
            }
            Integer num = (Integer) CollectionsKt.minOrNull(destination$iv$iv);
            return num == null ? (Integer) CollectionsKt.maxOrNull((Iterable) installed) : num;
        }

        public final List<String> buildArgs(List<? extends File> classpath, String mainClass, List<String> args, String tmpDir, File workDir) {
            Intrinsics.checkNotNullParameter(classpath, "classpath");
            Intrinsics.checkNotNullParameter(mainClass, "mainClass");
            Intrinsics.checkNotNullParameter(args, "args");
            Intrinsics.checkNotNullParameter(tmpDir, "tmpDir");
            Intrinsics.checkNotNullParameter(workDir, "workDir");
            return CollectionsKt.plus((Collection) CollectionsKt.listOf((Object[]) new String[]{"-Djava.awt.headless=true", "-Djava.io.tmpdir=" + FileUtil.INSTANCE.toLaunchPath(tmpDir), "-Duser.home=" + FileUtil.INSTANCE.toLaunchPath(workDir), "-Dfile.encoding=UTF-8", "-Xmx1024M", "-cp", CollectionsKt.joinToString$default(classpath, ":", null, null, 0, null, new Function1() { // from class: com.pymcl.runtime.process.FclJavaProcessRunner$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FclJavaProcessRunner.Companion.buildArgs$lambda$0((File) obj);
                }
            }, 30, null), mainClass}), (Iterable) args);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence buildArgs$lambda$0(File it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return FileUtil.INSTANCE.toLaunchPath(it);
        }
    }

    @Override // com.pymcl.core.loader.JavaProcessRunner
    public int run(int javaMajor, List<? extends File> classpath, String mainClass, List<String> args, File workDir, long timeoutSec, Function1<? super String, Unit> log) {
        int iRunLocked$default;
        Intrinsics.checkNotNullParameter(classpath, "classpath");
        Intrinsics.checkNotNullParameter(mainClass, "mainClass");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(workDir, "workDir");
        Intrinsics.checkNotNullParameter(log, "log");
        synchronized (this.lock) {
            iRunLocked$default = runLocked$default(this, javaMajor, classpath, mainClass, args, workDir, timeoutSec, log, 0, 128, null);
        }
        return iRunLocked$default;
    }

    private final List<Integer> installedMajors(RuntimeInstaller inst) {
        Iterable $this$filter$iv = CollectionsKt.listOf((Object[]) new Integer[]{8, 17, 21, 25});
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            int it = ((Number) element$iv$iv).intValue();
            if (inst.isJavaInstalled(it)) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        return (List) destination$iv$iv;
    }

    static /* synthetic */ int runLocked$default(FclJavaProcessRunner fclJavaProcessRunner, int i, List list, String str, List list2, File file, long j, Function1 function1, int i2, int i3, Object obj) {
        return fclJavaProcessRunner.runLocked(i, list, str, list2, file, j, function1, (i3 & 128) != 0 ? 0 : i2);
    }

    /* compiled from: FclJavaProcessRunner.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.runtime.process.FclJavaProcessRunner$runLocked$1", f = "FclJavaProcessRunner.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
    /* renamed from: com.pymcl.runtime.process.FclJavaProcessRunner$runLocked$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ RuntimeInstaller $installer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(RuntimeInstaller runtimeInstaller, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$installer = runtimeInstaller;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$installer, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    if (RuntimeInstaller.installAll$default(this.$installer, null, this, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    private final int runLocked(int javaMajor, List<? extends File> classpath, String mainClass, List<String> args, File workDir, long timeoutSec, Function1<? super String, Unit> log, int attempt) throws InstallError, InterruptedException {
        Iterable tails;
        String text$default;
        String string;
        Integer intOrNull;
        String text$default2;
        String string2;
        Object objM8116constructorimpl;
        Context ctx = this.ctx;
        Intrinsics.checkNotNullExpressionValue(ctx, "ctx");
        RuntimeInstaller installer = new RuntimeInstaller(ctx);
        BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(installer, null), 1, null);
        if (!installer.isJavaInstalled(javaMajor) && SetsKt.setOf((Object[]) new Integer[]{8, 25}).contains(Integer.valueOf(javaMajor))) {
            log.invoke("[PyMCL] 下载 Java " + javaMajor + " …");
            try {
                Result.Companion companion = Result.INSTANCE;
                FclJavaProcessRunner fclJavaProcessRunner = this;
                BuildersKt__BuildersKt.runBlocking$default(null, new FclJavaProcessRunner$runLocked$2$1(installer, javaMajor, null), 1, null);
                objM8116constructorimpl = Result.m8116constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
            }
            Throwable it = Result.m8119exceptionOrNullimpl(objM8116constructorimpl);
            if (it != null) {
                log.invoke("[PyMCL] Java " + javaMajor + " 下载失败：" + it.getMessage() + "，改用已安装的 JRE");
            }
        }
        Integer numPickJava = INSTANCE.pickJava(javaMajor, installedMajors(installer));
        if (numPickJava == null) {
            throw new InstallError("没有可用的内置 Java 运行时", null, 2, null);
        }
        int major = numPickJava.intValue();
        if (major != javaMajor) {
            log.invoke("[PyMCL] 请求 Java " + javaMajor + "，实际使用 Java " + major);
        }
        String javaPath = new File(FCLPath.JAVA_PATH, "jre" + major).getAbsolutePath();
        File cacheDir = this.ctx.getCacheDir();
        String string3 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        File it2 = new File(cacheDir, "jpr/" + StringsKt.take(string3, 8));
        FilesKt.deleteRecursively(it2);
        it2.mkdirs();
        Companion companion3 = INSTANCE;
        String CACHE_DIR = FCLPath.CACHE_DIR;
        Intrinsics.checkNotNullExpressionValue(CACHE_DIR, "CACHE_DIR");
        Collection fullArgs = companion3.buildArgs(classpath, mainClass, args, CACHE_DIR, workDir);
        Collection $this$toTypedArray$iv = fullArgs;
        Intent intent = new Intent(this.ctx, (Class<?>) JavaProcessService.class).putExtra(JavaProcessService.EXTRA_RUN_DIR, it2.getAbsolutePath()).putExtra(JavaProcessService.EXTRA_JAVA, javaPath).putExtra(JavaProcessService.EXTRA_WORK_DIR, workDir.getAbsolutePath()).putExtra(JavaProcessService.EXTRA_ARGS, (String[]) $this$toTypedArray$iv.toArray(new String[0]));
        Intrinsics.checkNotNullExpressionValue(intent, "putExtra(...)");
        log.invoke("[PyMCL] java(" + major + ") " + mainClass + StringUtils.SPACE + args.size() + " args");
        try {
            this.ctx.startService(intent);
            Iterable $this$map$iv = CollectionsKt.listOf((Object[]) new File[]{new File(it2, "latest_api_installer.log"), new File(it2, "bridge.log")});
            Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
            for (Object item$iv$iv : $this$map$iv) {
                destination$iv$iv.add(new Tail((File) item$iv$iv, log));
            }
            Iterable tails2 = (List) destination$iv$iv;
            File exitFile = new File(it2, "exit");
            File pidFile = new File(it2, "pid");
            long deadline = System.currentTimeMillis() + (1000 * timeoutSec);
            long startDeadline = System.currentTimeMillis() + 30000;
            Integer code = null;
            long deadSince = 0;
            while (true) {
                if (code != null) {
                    break;
                }
                Thread.sleep(250L);
                Iterable $this$forEach$iv = tails2;
                for (Object element$iv : $this$forEach$iv) {
                    ((Tail) element$iv).poll();
                }
                if (exitFile.isFile()) {
                    Integer intOrNull2 = StringsKt.toIntOrNull(StringsKt.trim((CharSequence) FilesKt.readText$default(exitFile, null, 1, null)).toString());
                    if (intOrNull2 == null) {
                        intOrNull2 = Integer.valueOf(JavaProcessRunnerCodes.CRASHED);
                    }
                    code = intOrNull2;
                } else {
                    File file = pidFile.isFile() ? pidFile : null;
                    Integer pid = (file == null || (text$default2 = FilesKt.readText$default(file, null, 1, null)) == null || (string2 = StringsKt.trim((CharSequence) text$default2).toString()) == null) ? null : StringsKt.toIntOrNull(string2);
                    long now = System.currentTimeMillis();
                    if (pid == null && now > startDeadline) {
                        code = Integer.valueOf(JavaProcessRunnerCodes.START_FAILED);
                    } else if (pid == null || alive(pid.intValue())) {
                        if (now > deadline) {
                            if (pid != null) {
                                Process.killProcess(pid.intValue());
                            }
                            code = Integer.valueOf(JavaProcessRunnerCodes.TIMEOUT);
                        }
                    } else if (deadSince == 0) {
                        deadSince = now;
                    } else if (now - deadSince > 1500) {
                        code = Integer.valueOf(JavaProcessRunnerCodes.CRASHED);
                    }
                }
            }
            File file2 = pidFile.isFile() ? pidFile : null;
            if (file2 == null || (text$default = FilesKt.readText$default(file2, null, 1, null)) == null || (string = StringsKt.trim((CharSequence) text$default).toString()) == null || (intOrNull = StringsKt.toIntOrNull(string)) == null) {
                tails = tails2;
            } else {
                int pid2 = intOrNull.intValue();
                tails = tails2;
                long until = System.currentTimeMillis() + Spv.SpvOpGroupIAddNonUniformAMD;
                while (alive(pid2) && System.currentTimeMillis() < until) {
                    Thread.sleep(100L);
                }
                if (alive(pid2)) {
                    Process.killProcess(pid2);
                }
            }
            Iterable $this$forEach$iv2 = tails;
            for (Object element$iv2 : $this$forEach$iv2) {
                ((Tail) element$iv2).poll();
            }
            if (code.intValue() == -101 && attempt < 2) {
                return runLocked(javaMajor, classpath, mainClass, args, workDir, timeoutSec, log, attempt + 1);
            }
            Integer code2 = code;
            log.invoke("[PyMCL] java 退出码 " + code2);
            return code2.intValue();
        } catch (Exception e) {
            throw new InstallError("无法启动 Java 子进程服务（应用需在前台）：" + e.getMessage(), e);
        }
    }

    private final boolean alive(int pid) {
        return new File("/proc/" + pid).exists();
    }

    /* compiled from: FclJavaProcessRunner.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000f\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00060\rj\u0002`\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/pymcl/runtime/process/FclJavaProcessRunner$Tail;", "", "f", "Ljava/io/File;", "out", "Lkotlin/Function1;", "", "", "<init>", "(Ljava/io/File;Lkotlin/jvm/functions/Function1;)V", "pos", "", "buf", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "poll", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    private static final class Tail {
        private final StringBuilder buf;
        private final File f;
        private final Function1<String, Unit> out;
        private long pos;

        /* JADX WARN: Multi-variable type inference failed */
        public Tail(File f, Function1<? super String, Unit> out) {
            Intrinsics.checkNotNullParameter(f, "f");
            Intrinsics.checkNotNullParameter(out, "out");
            this.f = f;
            this.out = out;
            this.buf = new StringBuilder();
        }

        public final void poll() {
            if (!this.f.isFile() || this.f.length() <= this.pos) {
                return;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.f, "r");
            try {
                RandomAccessFile r = randomAccessFile;
                r.seek(this.pos);
                byte[] b = new byte[RangesKt.coerceAtMost((int) (r.length() - this.pos), 1048576)];
                r.readFully(b);
                this.pos += b.length;
                this.buf.append(new String(b, Charsets.UTF_8));
                CloseableKt.closeFinally(randomAccessFile, null);
                while (true) {
                    int i = this.buf.indexOf(StringUtils.LF);
                    if (i < 0) {
                        return;
                    }
                    Function1<String, Unit> function1 = this.out;
                    String strSubstring = this.buf.substring(0, i);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    function1.invoke(StringsKt.trimEnd(strSubstring, CharUtils.CR));
                    this.buf.delete(0, i + 1);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(randomAccessFile, th);
                    throw th2;
                }
            }
        }
    }
}
