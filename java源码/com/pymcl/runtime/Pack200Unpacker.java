package com.pymcl.runtime;

import androidx.autofill.HintConstants;
import com.pymcl.runtime.Pack200Unpacker;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

/* compiled from: Pack200Unpacker.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012>\b\u0002\u0010\u0004\u001a8\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u0006\u0010\u0010\u001a\u00020\u0003J\u000e\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000RD\u0010\u0004\u001a8\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/pymcl/runtime/Pack200Unpacker;", "", "unpackBinary", "Ljava/io/File;", "exec", "Lkotlin/Function2;", "", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "cmd", "workDir", "", "<init>", "(Ljava/io/File;Lkotlin/jvm/functions/Function2;)V", "unpackAll", "javaDir", "unpackOne", "pack", "Companion", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Pack200Unpacker {
    public static final String BINARY_NAME = "libunpack200.so";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Function2<List<String>, File, Integer> exec;
    private final File unpackBinary;

    /* JADX WARN: Multi-variable type inference failed */
    public Pack200Unpacker(File unpackBinary, Function2<? super List<String>, ? super File, Integer> exec) {
        Intrinsics.checkNotNullParameter(unpackBinary, "unpackBinary");
        Intrinsics.checkNotNullParameter(exec, "exec");
        this.unpackBinary = unpackBinary;
        this.exec = exec;
    }

    public /* synthetic */ Pack200Unpacker(File file, AnonymousClass1 anonymousClass1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i & 2) != 0 ? new AnonymousClass1(INSTANCE) : anonymousClass1);
    }

    /* compiled from: Pack200Unpacker.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.pymcl.runtime.Pack200Unpacker$1, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<List<? extends String>, File, Integer> {
        AnonymousClass1(Object obj) {
            super(2, obj, Companion.class, "runProcess", "runProcess(Ljava/util/List;Ljava/io/File;)I", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Integer invoke2(List<String> p0, File p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            return Integer.valueOf(((Companion) this.receiver).runProcess(p0, p1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(List<? extends String> list, File file) {
            return invoke2((List<String>) list, file);
        }
    }

    public final List<File> unpackAll(File javaDir) throws IOException {
        Intrinsics.checkNotNullParameter(javaDir, "javaDir");
        List packs = INSTANCE.findPackFiles(javaDir);
        if (packs.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        if (!this.unpackBinary.isFile()) {
            throw new IOException("找不到 " + this.unpackBinary.getPath() + "（需 extractNativeLibs=true）");
        }
        List $this$map$iv = packs;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            File it = (File) item$iv$iv;
            destination$iv$iv.add(unpackOne(it));
        }
        return (List) destination$iv$iv;
    }

    public final File unpackOne(File pack) throws InterruptedException, IOException {
        Object objM8116constructorimpl;
        Intrinsics.checkNotNullParameter(pack, "pack");
        File jar = INSTANCE.jarFor(pack);
        Object last = null;
        for (int i = 0; i < 3; i++) {
            int attempt = i;
            jar.delete();
            try {
                Result.Companion companion = Result.INSTANCE;
                Pack200Unpacker $this$unpackOne_u24lambda_u240_u240 = this;
                Function2<List<String>, File, Integer> function2 = $this$unpackOne_u24lambda_u240_u240.exec;
                List<String> listListOf = CollectionsKt.listOf((Object[]) new String[]{$this$unpackOne_u24lambda_u240_u240.unpackBinary.getAbsolutePath(), "-r", pack.getAbsolutePath(), jar.getAbsolutePath()});
                File parentFile = $this$unpackOne_u24lambda_u240_u240.unpackBinary.getParentFile();
                if (parentFile == null) {
                    parentFile = new File(".");
                }
                objM8116constructorimpl = Result.m8116constructorimpl(Integer.valueOf(function2.invoke(listListOf, parentFile).intValue()));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
            }
            Throwable it = Result.m8119exceptionOrNullimpl(objM8116constructorimpl);
            if (it != null) {
                last = it.getMessage();
                objM8116constructorimpl = -1;
            }
            int code = ((Number) objM8116constructorimpl).intValue();
            if (code == 0 && jar.isFile() && jar.length() > 0) {
                pack.delete();
                return jar;
            }
            if (last == null) {
                last = "exit=" + code + ", jar=" + jar.isFile();
            }
            if (pack.isFile() && attempt < 2) {
                Thread.sleep(200L);
            }
        }
        throw new IOException("unpack200 失败：" + pack.getName() + "（" + last + "）");
    }

    /* compiled from: Pack200Unpacker.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bJ\u001e\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u000f\u001a\u00020\bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/pymcl/runtime/Pack200Unpacker$Companion;", "", "<init>", "()V", "BINARY_NAME", "", "findPackFiles", "", "Ljava/io/File;", "dir", "jarFor", "pack", "runProcess", "", "cmd", "workDir", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean findPackFiles$lambda$0(File it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (!it.isFile()) {
                return false;
            }
            String name = it.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            return StringsKt.endsWith$default(name, ".pack", false, 2, (Object) null);
        }

        public final List<File> findPackFiles(File dir) {
            Intrinsics.checkNotNullParameter(dir, "dir");
            Sequence $this$sortedBy$iv = SequencesKt.filter(FilesKt.walkTopDown(dir), new Function1() { // from class: com.pymcl.runtime.Pack200Unpacker$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(Pack200Unpacker.Companion.findPackFiles$lambda$0((File) obj));
                }
            });
            return SequencesKt.toList(SequencesKt.sortedWith($this$sortedBy$iv, new Comparator() { // from class: com.pymcl.runtime.Pack200Unpacker$Companion$findPackFiles$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    File it = (File) t;
                    File it2 = (File) t2;
                    return ComparisonsKt.compareValues(it.getPath(), it2.getPath());
                }
            }));
        }

        public final File jarFor(File pack) {
            Intrinsics.checkNotNullParameter(pack, "pack");
            File parentFile = pack.getParentFile();
            String name = pack.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            return new File(parentFile, StringsKt.removeSuffix(name, (CharSequence) ".pack"));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int runProcess(List<String> cmd, File workDir) throws IOException {
            Process p = new ProcessBuilder(cmd).directory(workDir).redirectErrorStream(true).start();
            InputStream inputStream = p.getInputStream();
            try {
                InputStream it = inputStream;
                Intrinsics.checkNotNull(it);
                ByteStreamsKt.readBytes(it);
                CloseableKt.closeFinally(inputStream, null);
                if (p.waitFor(5L, TimeUnit.MINUTES)) {
                    return p.exitValue();
                }
                p.destroyForcibly();
                return -1;
            } finally {
            }
        }
    }
}
