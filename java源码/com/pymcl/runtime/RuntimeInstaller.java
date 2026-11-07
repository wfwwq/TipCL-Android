package com.pymcl.runtime;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.os.Build;
import android.system.Os;
import android.util.Log;
import androidx.autofill.HintConstants;
import com.tungsten.fclauncher.FCLauncher;
import com.tungsten.fclauncher.utils.FCLPath;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.concurrent.AbstractCircuitBreaker;
import org.tukaani.xz.XZInputStream;

/* compiled from: RuntimeInstaller.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u000bH\u0086@¢\u0006\u0002\u0010\fJ\u0006\u0010\r\u001a\u00020\tJ\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0002J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0007H\u0002J\u0018\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0015H\u0002J\u0010\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0016\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010\u001fJ\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0007H\u0002J\u0010\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007H\u0002J\u0018\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020&2\u0006\u0010\u001c\u001a\u00020\u0015H\u0002J\u0018\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0015H\u0002J\u0010\u0010+\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/pymcl/runtime/RuntimeInstaller;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "abi", "", "installAll", "", "onStage", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "installPlugins", "dnsServers", "", "isJavaInstalled", "", "major", "", "javaDir", "Ljava/io/File;", "assetText", "path", "copyComponent", HintConstants.AUTOFILL_HINT_NAME, "copyAssetTree", "src", "dest", "installBundledJava", "downloadJava", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", AbstractCircuitBreaker.PROPERTY_NAME, "Ljava/net/HttpURLConnection;", "url", "httpText", "downloadVerified", "spec", "Lcom/pymcl/runtime/JavaDownloadFile;", "untarXz", "input", "Ljava/io/InputStream;", "target", "patchJava", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RuntimeInstaller {
    private final String abi;
    private final Context context;

    public RuntimeInstaller(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        Object[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
        Intrinsics.checkNotNullExpressionValue(SUPPORTED_ABIS, "SUPPORTED_ABIS");
        Object[] $this$first$iv = SUPPORTED_ABIS;
        for (Object element$iv : $this$first$iv) {
            String it = (String) element$iv;
            if (Intrinsics.areEqual(it, "arm64-v8a") || Intrinsics.areEqual(it, "x86_64")) {
                Intrinsics.checkNotNullExpressionValue(element$iv, "first(...)");
                this.abi = (String) element$iv;
                return;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* compiled from: RuntimeInstaller.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.runtime.RuntimeInstaller$installAll$3", f = "RuntimeInstaller.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.runtime.RuntimeInstaller$installAll$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<String, Unit> $onStage;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(Function1<? super String, Unit> function1, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$onStage = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RuntimeInstaller.this.new AnonymousClass3(this.$onStage, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) throws IOException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    RuntimeHost.init(RuntimeInstaller.this.context);
                    for (String c : RuntimeLayout.INSTANCE.getCOPY_COMPONENTS()) {
                        this.$onStage.invoke(c);
                        RuntimeInstaller.this.copyComponent(c);
                    }
                    Iterator<Integer> it = RuntimeLayout.INSTANCE.getBUNDLED_JRE().iterator();
                    while (it.hasNext()) {
                        int major = it.next().intValue();
                        this.$onStage.invoke("jre" + major);
                        RuntimeInstaller.this.installBundledJava(major);
                    }
                    this.$onStage.invoke("plugins");
                    RuntimeInstaller.this.installPlugins();
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object installAll$default(RuntimeInstaller runtimeInstaller, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1() { // from class: com.pymcl.runtime.RuntimeInstaller$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return RuntimeInstaller.installAll$lambda$0((String) obj2);
                }
            };
        }
        return runtimeInstaller.installAll(function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit installAll$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final Object installAll(Function1<? super String, Unit> function1, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass3(function1, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public final void installPlugins() {
        for (Pair pair : CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("game/MioLaunchWrapper.jar", FCLPath.MIO_LAUNCH_WRAPPER), TuplesKt.to("game/MioLibPatcher.jar", FCLPath.LIB_PATCHER_PATH)})) {
            String asset = (String) pair.component1();
            String dest = (String) pair.component2();
            File f = new File(dest);
            try {
                Result.Companion companion = Result.INSTANCE;
                RuntimeInstaller $this$installPlugins_u24lambda_u240 = this;
                FileOutputStream fileOutputStreamOpen = $this$installPlugins_u24lambda_u240.context.getAssets().open(asset);
                try {
                    InputStream input = fileOutputStreamOpen;
                    File parentFile = f.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    fileOutputStreamOpen = new FileOutputStream(f);
                    try {
                        FileOutputStream it = fileOutputStreamOpen;
                        Intrinsics.checkNotNull(input);
                        long jCopyTo$default = ByteStreamsKt.copyTo$default(input, it, 0, 2, null);
                        CloseableKt.closeFinally(fileOutputStreamOpen, null);
                        CloseableKt.closeFinally(fileOutputStreamOpen, null);
                        Result.m8116constructorimpl(Long.valueOf(jCopyTo$default));
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m8116constructorimpl(ResultKt.createFailure(th));
            }
        }
        File resolv = new File(FCLPath.JAVA_PATH, "resolv.conf");
        if (resolv.isFile()) {
            return;
        }
        try {
            Result.Companion companion3 = Result.INSTANCE;
            RuntimeInstaller $this$installPlugins_u24lambda_u241 = this;
            File parentFile2 = resolv.getParentFile();
            if (parentFile2 != null) {
                parentFile2.mkdirs();
            }
            FilesKt.writeText$default(resolv, CollectionsKt.joinToString$default($this$installPlugins_u24lambda_u241.dnsServers(), "", null, null, 0, null, new Function1() { // from class: com.pymcl.runtime.RuntimeInstaller$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RuntimeInstaller.installPlugins$lambda$1$0((String) obj);
                }
            }, 30, null), null, 2, null);
            Result.m8116constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            Result.m8116constructorimpl(ResultKt.createFailure(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence installPlugins$lambda$1$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "nameserver " + it + StringUtils.LF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.pymcl.runtime.RuntimeInstaller, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.net.Network, void] */
    private final List<String> dnsServers() {
        Object objM8116constructorimpl;
        Collection destination$iv$iv;
        Iterable dnsServers;
        try {
            Result.Companion companion = Result.INSTANCE;
            RuntimeInstaller runtimeInstaller = this;
            ConnectivityManager connectivityManager = (ConnectivityManager) runtimeInstaller.context.getSystemService(ConnectivityManager.class);
            LinkProperties linkProperties = connectivityManager.getLinkProperties(connectivityManager.setText(runtimeInstaller));
            if (linkProperties == null || (dnsServers = linkProperties.getDnsServers()) == null) {
                destination$iv$iv = CollectionsKt.emptyList();
            } else {
                Iterable $this$mapNotNull$iv = dnsServers;
                Collection destination$iv$iv2 = new ArrayList();
                for (Object element$iv$iv$iv : $this$mapNotNull$iv) {
                    InetAddress it = (InetAddress) element$iv$iv$iv;
                    String hostAddress = it.getHostAddress();
                    if (hostAddress != null) {
                        destination$iv$iv2.add(hostAddress);
                    }
                }
                destination$iv$iv = (List) destination$iv$iv2;
            }
            objM8116constructorimpl = Result.m8116constructorimpl(destination$iv$iv);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        List listEmptyList = CollectionsKt.emptyList();
        if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
            objM8116constructorimpl = listEmptyList;
        }
        List sys = (List) objM8116constructorimpl;
        return CollectionsKt.distinct(CollectionsKt.plus((Collection) sys, (Iterable) CollectionsKt.listOf((Object[]) new String[]{"223.5.5.5", "8.8.8.8"})));
    }

    public final boolean isJavaInstalled(int major) {
        return new File(javaDir(major), "version").isFile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File javaDir(int major) {
        return new File(FCLPath.JAVA_PATH, "jre" + major);
    }

    private final String assetText(String path) {
        Object objM8116constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            RuntimeInstaller $this$assetText_u24lambda_u240 = this;
            InputStream inputStreamOpen = $this$assetText_u24lambda_u240.context.getAssets().open(path);
            try {
                InputStream it = inputStreamOpen;
                Intrinsics.checkNotNull(it);
                String string = StringsKt.trim((CharSequence) StringsKt.decodeToString(ByteStreamsKt.readBytes(it))).toString();
                CloseableKt.closeFinally(inputStreamOpen, null);
                objM8116constructorimpl = Result.m8116constructorimpl(string);
            } finally {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        return (String) (Result.m8122isFailureimpl(objM8116constructorimpl) ? null : objM8116constructorimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copyComponent(String name) throws IOException {
        String text$default;
        String src = "app_runtime/" + name;
        File dest = new File(FCLPath.RUNTIME_DIR, name);
        String version = assetText(src + "/version");
        if (version != null) {
            File it = new File(dest, "version");
            String string = null;
            if (!it.isFile()) {
                it = null;
            }
            if (it != null && (text$default = FilesKt.readText$default(it, null, 1, null)) != null) {
                string = StringsKt.trim((CharSequence) text$default).toString();
            }
            if (Intrinsics.areEqual(string, version)) {
                return;
            }
        }
        FilesKt.deleteRecursively(dest);
        copyAssetTree(src, dest);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void copyAssetTree(String src, File dest) throws IOException {
        String text = this.context.getAssets().getText();
        Object[] objArr = text;
        if (text == null) {
            objArr = new String[0];
        }
        if (!(objArr.length == 0)) {
            dest.mkdirs();
            for (String str : objArr) {
                copyAssetTree(src + "/" + str, new File(dest, str));
            }
            return;
        }
        File parentFile = dest.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        InputStream inputStreamOpen = this.context.getAssets().open(src);
        try {
            InputStream inputStream = inputStreamOpen;
            FileOutputStream fileOutputStream = new FileOutputStream(dest);
            try {
                Intrinsics.checkNotNull(inputStream);
                ByteStreamsKt.copyTo$default(inputStream, fileOutputStream, 0, 2, null);
                CloseableKt.closeFinally(fileOutputStream, null);
                CloseableKt.closeFinally(inputStreamOpen, null);
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void installBundledJava(int major) throws IOException {
        String text$default;
        String base = "app_runtime/java/jre" + major;
        String version = assetText(base + "/version");
        if (version == null) {
            return;
        }
        File target = javaDir(major);
        File it = new File(target, "version");
        if (!it.isFile()) {
            it = null;
        }
        if (Intrinsics.areEqual((it == null || (text$default = FilesKt.readText$default(it, null, 1, null)) == null) ? null : StringsKt.trim((CharSequence) text$default).toString(), version)) {
            return;
        }
        FilesKt.deleteRecursively(target);
        target.mkdirs();
        for (String archive : RuntimeLayout.INSTANCE.jreArchives(major, this.abi)) {
            InputStream inputStreamOpen = this.context.getAssets().open(archive);
            try {
                InputStream it2 = inputStreamOpen;
                Intrinsics.checkNotNull(it2);
                untarXz(it2, target);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(inputStreamOpen, null);
            } finally {
            }
        }
        FilesKt.writeText$default(new File(target, "version"), version, null, 2, null);
        patchJava(target);
    }

    /* compiled from: RuntimeInstaller.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.runtime.RuntimeInstaller$downloadJava$2", f = "RuntimeInstaller.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.runtime.RuntimeInstaller$downloadJava$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $major;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(int i, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$major = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RuntimeInstaller.this.new AnonymousClass2(this.$major, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Finally extract failed */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    File fileJavaDir = RuntimeInstaller.this.javaDir(this.$major);
                    FilesKt.deleteRecursively(fileJavaDir);
                    fileJavaDir.mkdirs();
                    File file = new File(RuntimeInstaller.this.context.getCacheDir(), "jre-dl");
                    FilesKt.deleteRecursively(file);
                    file.mkdirs();
                    try {
                        Iterator<JavaDownloadFile> it = JavaDownloads.INSTANCE.archives(this.$major, RuntimeInstaller.this.abi).iterator();
                        while (true) {
                            Function2 function2 = null;
                            Object[] objArr = 0;
                            if (it.hasNext()) {
                                JavaDownloadFile next = it.next();
                                File file2 = new File(file, next.getName());
                                RuntimeInstaller.this.downloadVerified(next, file2);
                                FileInputStream fileInputStream = new FileInputStream(file2);
                                try {
                                    RuntimeInstaller.this.untarXz(fileInputStream, fileJavaDir);
                                    Unit unit = Unit.INSTANCE;
                                    CloseableKt.closeFinally(fileInputStream, null);
                                    file2.delete();
                                } finally {
                                }
                            } else {
                                String strPinnedVersion = JavaDownloads.INSTANCE.pinnedVersion(this.$major);
                                if (strPinnedVersion == null) {
                                    strPinnedVersion = RuntimeInstaller.this.httpText(JavaDownloads.INSTANCE.versionUrl(this.$major));
                                }
                                List<File> listUnpackAll = new Pack200Unpacker(new File(RuntimeInstaller.this.context.getApplicationInfo().nativeLibraryDir, Pack200Unpacker.BINARY_NAME), function2, 2, objArr == true ? 1 : 0).unpackAll(fileJavaDir);
                                if (!listUnpackAll.isEmpty()) {
                                    Log.i("PyMCL", "jre" + this.$major + ": unpack200 解出 " + listUnpackAll.size() + " 个 jar");
                                }
                                if (this.$major == 8 && !new File(fileJavaDir, "lib/rt.jar").isFile()) {
                                    throw new IOException("jre8 解包后缺少 lib/rt.jar");
                                }
                                RuntimeInstaller.this.patchJava(fileJavaDir);
                                FilesKt.writeText$default(new File(fileJavaDir, "version"), strPinnedVersion, null, 2, null);
                                FilesKt.deleteRecursively(file);
                                return Unit.INSTANCE;
                            }
                        }
                    } finally {
                    }
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final Object downloadJava(int major, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(major, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    private final HttpURLConnection open(String url) throws IOException {
        URLConnection uRLConnectionOpenConnection = new URL(url).openConnection();
        Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection $this$open_u24lambda_u240 = (HttpURLConnection) uRLConnectionOpenConnection;
        $this$open_u24lambda_u240.setConnectTimeout(20000);
        $this$open_u24lambda_u240.setReadTimeout(60000);
        $this$open_u24lambda_u240.setInstanceFollowRedirects(true);
        return $this$open_u24lambda_u240;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String httpText(String url) {
        InputStream inputStream = open(url).getInputStream();
        try {
            InputStream it = inputStream;
            Intrinsics.checkNotNull(it);
            String string = StringsKt.trim((CharSequence) StringsKt.decodeToString(ByteStreamsKt.readBytes(it))).toString();
            CloseableKt.closeFinally(inputStream, null);
            return string;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void downloadVerified(JavaDownloadFile spec, File dest) throws IOException {
        Throwable th = null;
        int i = 0;
        while (true) {
            if (i >= 3) {
                throw new IOException("下载 " + spec.getName() + " 失败：" + (th != null ? th.getMessage() : null), th);
            }
            try {
                dest.delete();
            } catch (Throwable th2) {
                e = th2;
            }
            try {
                InputStream inputStream = open(spec.getUrl()).getInputStream();
                try {
                    InputStream input = inputStream;
                    FileOutputStream fileOutputStream = new FileOutputStream(dest);
                    try {
                        FileOutputStream it = fileOutputStream;
                        Intrinsics.checkNotNull(input);
                        ByteStreamsKt.copyTo$default(input, it, 0, 2, null);
                        CloseableKt.closeFinally(fileOutputStream, null);
                        CloseableKt.closeFinally(inputStream, null);
                        JavaDownloads.INSTANCE.verify(dest, spec);
                        return;
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            try {
                                CloseableKt.closeFinally(fileOutputStream, th3);
                                throw th4;
                            } catch (Throwable th5) {
                                th = th5;
                                Throwable th6 = th;
                                try {
                                    try {
                                        throw th6;
                                    } catch (Throwable th7) {
                                        CloseableKt.closeFinally(inputStream, th6);
                                        throw th7;
                                    }
                                } catch (Throwable th8) {
                                    e = th8;
                                }
                            }
                        }
                    }
                } catch (Throwable th9) {
                    th = th9;
                }
            } catch (Throwable th10) {
                e = th10;
                th = e;
                i++;
            }
            th = e;
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void untarXz(InputStream input, File target) {
        Object objM8116constructorimpl;
        TarArchiveInputStream tarArchiveInputStream = new TarArchiveInputStream(new XZInputStream(input instanceof BufferedInputStream ? (BufferedInputStream) input : new BufferedInputStream(input, 8192)));
        try {
            TarArchiveInputStream tar = tarArchiveInputStream;
            while (true) {
                TarArchiveEntry e = tar.getNextEntry();
                if (e == null) {
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(tarArchiveInputStream, null);
                    return;
                }
                try {
                    File out = new File(target, e.getName());
                    String canonicalPath = out.getCanonicalPath();
                    Intrinsics.checkNotNullExpressionValue(canonicalPath, "getCanonicalPath(...)");
                    String canonicalPath2 = target.getCanonicalPath();
                    Intrinsics.checkNotNullExpressionValue(canonicalPath2, "getCanonicalPath(...)");
                    if (StringsKt.startsWith$default(canonicalPath, canonicalPath2, false, 2, (Object) null)) {
                        if (e.isSymbolicLink()) {
                            File parentFile = out.getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                            }
                            out.delete();
                            try {
                                Result.Companion companion = Result.INSTANCE;
                                RuntimeInstaller runtimeInstaller = this;
                                Os.symlink(e.getLinkName(), out.getPath());
                                objM8116constructorimpl = Result.m8116constructorimpl(Unit.INSTANCE);
                            } catch (Throwable th) {
                                Result.Companion companion2 = Result.INSTANCE;
                                objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
                            }
                            Result.m8115boximpl(objM8116constructorimpl);
                        } else if (e.isDirectory()) {
                            Boolean.valueOf(out.mkdirs());
                        } else {
                            File parentFile2 = out.getParentFile();
                            if (parentFile2 != null) {
                                parentFile2.mkdirs();
                            }
                            FileOutputStream fileOutputStream = new FileOutputStream(out);
                            try {
                                FileOutputStream it = fileOutputStream;
                                ByteStreamsKt.copyTo$default(tar, it, 0, 2, null);
                                CloseableKt.closeFinally(fileOutputStream, null);
                                Boolean.valueOf(out.setExecutable(true));
                            } finally {
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        CloseableKt.closeFinally(tarArchiveInputStream, th3);
                        throw th4;
                    }
                }
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void patchJava(File target) throws IOException {
        String nativeDir = this.context.getApplicationInfo().nativeLibraryDir;
        String libFolder = FCLauncher.getJavaLibDir(target.getAbsolutePath());
        if (FCLauncher.isJDK8(target.getAbsolutePath())) {
            libFolder = "/jre" + libFolder;
        }
        File ftIn = new File(target, libFolder + "/libfreetype.so.6");
        File ftOut = new File(target, libFolder + "/libfreetype.so");
        if (ftIn.exists() && (!ftOut.exists() || ftIn.length() != ftOut.length())) {
            ftIn.renameTo(ftOut);
        }
        for (String lib : CollectionsKt.listOf((Object[]) new String[]{"libawt_xawt.so", "libjsound.so"})) {
            File src = new File(nativeDir, lib);
            if (src.exists()) {
                FilesKt.copyTo$default(src, new File(target, libFolder + "/" + lib), true, 0, 4, null);
            }
        }
    }
}
