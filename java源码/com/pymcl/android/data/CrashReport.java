package com.pymcl.android.data;

import android.content.Context;
import android.os.Build;
import com.pymcl.android.ui.state.CrashInfo;
import com.pymcl.core.crash.CrashAnalyzer;
import com.pymcl.multiplayer.TerracottaVpnService;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.apache.commons.lang3.StringUtils;

/* compiled from: CrashReport.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007J(\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005Ê\u0001\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0010"}, d2 = {"Lcom/pymcl/android/data/CrashReport;", "", "<init>", "()V", TerracottaVpnService.EXTRA_TEXT, "", "info", "Lcom/pymcl/android/ui/state/CrashInfo;", "exportZip", "Ljava/io/File;", "ctx", "Landroid/content/Context;", "share", "", "file", "title", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class CrashReport {
    public static final int $stable = 0;
    public static final CrashReport INSTANCE = new CrashReport();

    private CrashReport() {
    }

    public final String text(CrashInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        StringBuilder sb = new StringBuilder();
        sb.append("PyMCL Android 崩溃报告").append('\n');
        sb.append("实例：" + info.getInstance() + "\u3000版本：" + info.getVersion() + "\u3000退出码：" + info.getExitCode()).append('\n');
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
        Intrinsics.checkNotNullExpressionValue(SUPPORTED_ABIS, "SUPPORTED_ABIS");
        sb.append("设备：" + str + StringUtils.SPACE + str2 + " / Android " + str3 + " / " + ArraysKt.firstOrNull(SUPPORTED_ABIS)).append('\n');
        sb.append('\n');
        sb.append("【分析结论】" + info.getTitle()).append('\n');
        sb.append(info.getExplain()).append('\n');
        if (!info.getActions().isEmpty()) {
            sb.append("可尝试：" + CollectionsKt.joinToString$default(info.getActions(), "；", null, null, 0, null, null, 62, null)).append('\n');
        }
        sb.append('\n');
        sb.append("【游戏崩溃前的输出（末尾）】").append('\n');
        Iterator it = info.getLogTail().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next()).append('\n');
        }
        return CollectionsKt.joinToString$default(StringsKt.lines(sb.toString()), StringUtils.LF, null, null, 0, null, new Function1() { // from class: com.pymcl.android.data.CrashReport$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CrashReport.text$lambda$1((String) obj);
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence text$lambda$1(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return CrashAnalyzer.INSTANCE.filterSecrets(it);
    }

    public final File exportZip(Context ctx, CrashInfo info) {
        Throwable th;
        File file;
        String str;
        int i;
        int i2;
        Object next;
        Object next2;
        int i3;
        Iterable iterable;
        String str2 = StringUtils.LF;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(info, "info");
        File root = LauncherRepository.INSTANCE.rootDir(ctx);
        String ts = new SimpleDateFormat("yyyyMMdd-HHmmss", Locale.ROOT).format(new Date());
        File file2 = new File(root, "exports/错误报告-" + ts + ".zip");
        File parentFile = file2.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(file2));
        try {
            ZipOutputStream zipOutputStream2 = zipOutputStream;
            exportZip$lambda$1$put(zipOutputStream2, "分析结论.txt", INSTANCE.text(info));
            exportZip$lambda$1$put(zipOutputStream2, "游戏崩溃前的输出.txt", CollectionsKt.joinToString$default(info.getLogTail(), StringUtils.LF, null, null, 0, null, new Function1() { // from class: com.pymcl.android.data.CrashReport$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CrashReport.exportZip$lambda$1$0((String) obj);
                }
            }, 30, null));
            String gameDir = info.getGameDir();
            if (StringsKt.isBlank(gameDir)) {
                gameDir = null;
            }
            if (gameDir != null) {
                try {
                    file = new File(gameDir);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(zipOutputStream, th);
                        throw th3;
                    }
                }
            } else {
                file = null;
            }
            List<File> arrayList = new ArrayList();
            if (file != null) {
                i = 1;
                Iterable iterableListOf = CollectionsKt.listOf((Object[]) new String[]{"logs/latest.log", "logs/debug.log"});
                Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterableListOf, 10));
                Iterator it = iterableListOf.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new File(file, (String) it.next()));
                }
                Iterable iterable2 = (List) arrayList2;
                Collection arrayList3 = new ArrayList();
                for (Object obj : iterable2) {
                    if (((File) obj).isFile()) {
                        iterable = iterable2;
                        arrayList3.add(obj);
                    } else {
                        iterable = iterable2;
                    }
                    iterable2 = iterable;
                }
                Iterable iterable3 = (List) arrayList3;
                Iterator it2 = iterable3.iterator();
                while (it2.hasNext()) {
                    Iterable iterable4 = iterable3;
                    arrayList.add((File) it2.next());
                    iterable3 = iterable4;
                }
                File[] fileArrListFiles = new File(file, "crash-reports").listFiles();
                if (fileArrListFiles != null) {
                    Collection arrayList4 = new ArrayList();
                    int length = fileArrListFiles.length;
                    int i4 = 0;
                    while (i4 < length) {
                        File file3 = fileArrListFiles[i4];
                        if (file3.isFile()) {
                            i3 = i4;
                            arrayList4.add(file3);
                        } else {
                            i3 = i4;
                        }
                        i4 = i3 + 1;
                    }
                    Iterator it3 = ((List) arrayList4).iterator();
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        if (it3.hasNext()) {
                            long jLastModified = ((File) next2).lastModified();
                            do {
                                Object next3 = it3.next();
                                long jLastModified2 = ((File) next3).lastModified();
                                if (jLastModified < jLastModified2) {
                                    next2 = next3;
                                    jLastModified = jLastModified2;
                                }
                            } while (it3.hasNext());
                        }
                    } else {
                        next2 = null;
                    }
                    File file4 = (File) next2;
                    if (file4 != null) {
                        arrayList.add(file4);
                    }
                }
                File[] fileArrListFiles2 = file.listFiles();
                if (fileArrListFiles2 != null) {
                    int i5 = 0;
                    Collection arrayList5 = new ArrayList();
                    int length2 = fileArrListFiles2.length;
                    int i6 = 0;
                    while (i6 < length2) {
                        File file5 = fileArrListFiles2[i6];
                        int i7 = i6;
                        String name = file5.getName();
                        int i8 = i5;
                        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                        String str3 = str2;
                        File root2 = root;
                        try {
                            if (StringsKt.startsWith$default(name, "hs_err_pid", false, 2, (Object) null)) {
                                arrayList5.add(file5);
                            }
                            i6 = i7 + 1;
                            str2 = str3;
                            root = root2;
                            i5 = i8;
                        } catch (Throwable th4) {
                            th = th4;
                            throw th;
                        }
                    }
                    str = str2;
                    Iterator it4 = ((List) arrayList5).iterator();
                    if (it4.hasNext()) {
                        next = it4.next();
                        if (it4.hasNext()) {
                            long jLastModified3 = ((File) next).lastModified();
                            do {
                                Object next4 = it4.next();
                                long jLastModified4 = ((File) next4).lastModified();
                                if (jLastModified3 < jLastModified4) {
                                    next = next4;
                                    jLastModified3 = jLastModified4;
                                }
                            } while (it4.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    File file6 = (File) next;
                    if (file6 != null) {
                        arrayList.add(file6);
                    }
                } else {
                    str = StringUtils.LF;
                }
            } else {
                str = StringUtils.LF;
                i = 1;
            }
            for (File file7 : arrayList) {
                CrashReport crashReport = INSTANCE;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    i2 = i;
                    try {
                        exportZip$lambda$1$put(zipOutputStream2, "logs/" + file7.getName(), CollectionsKt.joinToString$default(StringsKt.lines(StringsKt.takeLast(FilesKt.readText$default(file7, null, i2, null), 2000000)), str, null, null, 0, null, new Function1() { // from class: com.pymcl.android.data.CrashReport$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return CrashReport.exportZip$lambda$1$12$0((String) obj2);
                            }
                        }, 30, null));
                        Result.m8116constructorimpl(Unit.INSTANCE);
                        i = i2;
                    } catch (Throwable th5) {
                        th = th5;
                        Result.Companion companion2 = Result.INSTANCE;
                        Result.m8116constructorimpl(ResultKt.createFailure(th));
                        i = i2;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    i2 = i;
                }
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(zipOutputStream, null);
            return file2;
        } catch (Throwable th7) {
            th = th7;
        }
    }

    private static final void exportZip$lambda$1$put(ZipOutputStream $z, String name, String s) throws IOException {
        $z.putNextEntry(new ZipEntry(name));
        byte[] bytes = s.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        $z.write(bytes);
        $z.closeEntry();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence exportZip$lambda$1$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return CrashAnalyzer.INSTANCE.filterSecrets(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence exportZip$lambda$1$12$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return CrashAnalyzer.INSTANCE.filterSecrets(it);
    }

    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1096)
        	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1050)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public final void share(
    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1096)
        	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1050)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r6v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:403)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:391)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:341)
        */
}
