package com.pymcl.core.version;

import com.pymcl.core.download.DownloadItem;
import com.pymcl.core.download.DownloadManager;
import com.pymcl.core.download.Mirrors;
import com.pymcl.core.net.Http;
import com.pymcl.core.util.FileUtil;
import com.pymcl.core.util.JsonKt;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* compiled from: GameInstaller.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u0013J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001cJ4\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001c2\b\b\u0002\u0010$\u001a\u00020\u00132\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&H\u0086@¢\u0006\u0002\u0010'J(\u0010(\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001c2\b\b\u0002\u0010$\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010)J\u0016\u0010*\u001a\u00020\t2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001cJ+\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00130,2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u0013¢\u0006\u0004\b-\u0010.J\u0016\u0010/\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001cJ \u00100\u001a\u0002012\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001c2\b\b\u0002\u0010$\u001a\u00020\u0013J\u0018\u00102\u001a\u0004\u0018\u0001032\u0006\u0010!\u001a\u00020\"2\u0006\u00104\u001a\u000205J/\u00106\u001a\u0002032\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u00107\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001c2\b\u00108\u001a\u0004\u0018\u000109¢\u0006\u0002\u0010:J\u001c\u0010;\u001a\b\u0012\u0004\u0012\u0002030<2\u0006\u0010!\u001a\u00020\"2\u0006\u00104\u001a\u000205J\u0016\u0010=\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u00104\u001a\u000205J\u001e\u0010>\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u00104\u001a\u000205H\u0086@¢\u0006\u0002\u0010?R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006@"}, d2 = {"Lcom/pymcl/core/version/GameInstaller;", "", "http", "Lcom/pymcl/core/net/Http;", "mirrors", "Lcom/pymcl/core/download/Mirrors;", "dm", "Lcom/pymcl/core/download/DownloadManager;", "cacheDir", "Ljava/io/File;", "env", "Lcom/pymcl/core/version/RuleEnv;", "<init>", "(Lcom/pymcl/core/net/Http;Lcom/pymcl/core/download/Mirrors;Lcom/pymcl/core/download/DownloadManager;Ljava/io/File;Lcom/pymcl/core/version/RuleEnv;)V", "getEnv", "()Lcom/pymcl/core/version/RuleEnv;", "skipNative", "Lkotlin/Function1;", "Lcom/pymcl/core/version/Library;", "", "getSkipNative", "()Lkotlin/jvm/functions/Function1;", "setSkipNative", "(Lkotlin/jvm/functions/Function1;)V", "manifest", "Lcom/pymcl/core/version/VersionManifest;", "force", "fetchJson", "", "url", "sha1", "installVanilla", "", "dirs", "Lcom/pymcl/core/version/GameDirs;", "id", "skipAssets", "manifestEntry", "Lcom/pymcl/core/version/ManifestEntry;", "(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;ZLcom/pymcl/core/version/ManifestEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "completeFiles", "(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifiedMarker", "markVerified", "Lkotlin/Result;", "markVerified-0E7RQCE", "(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Z)Ljava/lang/Object;", "invalidateVerified", "quickCheck", "Lcom/pymcl/core/version/QuickCheckResult;", "clientJarItem", "Lcom/pymcl/core/download/DownloadItem;", SettingsProtocol.EXTRA_VALUE, "Lcom/pymcl/core/version/ResolvedVersion;", "item", "dest", "size", "", "(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Ljava/lang/Long;)Lcom/pymcl/core/download/DownloadItem;", "libraryItems", "", "extractNatives", "installAssets", "(Lcom/pymcl/core/version/GameDirs;Lcom/pymcl/core/version/ResolvedVersion;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class GameInstaller {
    private final File cacheDir;
    private final DownloadManager dm;
    private final RuleEnv env;
    private final Http http;
    private final Mirrors mirrors;
    private Function1<? super Library, Boolean> skipNative;

    /* compiled from: GameInstaller.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.core.version.GameInstaller", f = "GameInstaller.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {71, 73}, m = "completeFiles", n = {"dirs", "id", SettingsProtocol.EXTRA_VALUE, "items", "skipAssets", "dirs", "id", SettingsProtocol.EXTRA_VALUE, "items", "skipAssets"}, nl = {72, 74}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "L$0", "L$1", "L$2", "L$3", "Z$0"}, v = 2)
    /* renamed from: com.pymcl.core.version.GameInstaller$completeFiles$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GameInstaller.this.completeFiles(null, null, false, this);
        }
    }

    /* compiled from: GameInstaller.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.core.version.GameInstaller", f = "GameInstaller.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {143, 149}, m = "installAssets", n = {"dirs", SettingsProtocol.EXTRA_VALUE, "ai", "idx", "dirs", SettingsProtocol.EXTRA_VALUE, "ai", "idx", "o", "objs", "items", "virtual"}, nl = {144, 150}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0"}, v = 2)
    /* renamed from: com.pymcl.core.version.GameInstaller$installAssets$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GameInstaller.this.installAssets(null, null, this);
        }
    }

    public GameInstaller(Http http, Mirrors mirrors, DownloadManager dm, File cacheDir, RuleEnv env) {
        Intrinsics.checkNotNullParameter(http, "http");
        Intrinsics.checkNotNullParameter(mirrors, "mirrors");
        Intrinsics.checkNotNullParameter(dm, "dm");
        Intrinsics.checkNotNullParameter(cacheDir, "cacheDir");
        Intrinsics.checkNotNullParameter(env, "env");
        this.http = http;
        this.mirrors = mirrors;
        this.dm = dm;
        this.cacheDir = cacheDir;
        this.env = env;
        this.skipNative = new Function1() { // from class: com.pymcl.core.version.GameInstaller$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(GameInstaller.skipNative$lambda$0((Library) obj));
            }
        };
    }

    public /* synthetic */ GameInstaller(Http http, Mirrors mirrors, DownloadManager downloadManager, File file, RuleEnv ruleEnv, int i, DefaultConstructorMarker defaultConstructorMarker) {
        RuleEnv ruleEnv2;
        if ((i & 16) != 0) {
            ruleEnv2 = new RuleEnv(null, null, null, null, 15, null);
        } else {
            ruleEnv2 = ruleEnv;
        }
        this(http, mirrors, downloadManager, file, ruleEnv2);
    }

    public final RuleEnv getEnv() {
        return this.env;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean skipNative$lambda$0(Library it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return StringsKt.startsWith$default(it.getName(), "org.lwjgl", false, 2, (Object) null);
    }

    public final Function1<Library, Boolean> getSkipNative() {
        return this.skipNative;
    }

    public final void setSkipNative(Function1<? super Library, Boolean> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.skipNative = function1;
    }

    public static /* synthetic */ VersionManifest manifest$default(GameInstaller gameInstaller, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return gameInstaller.manifest(z);
    }

    public final VersionManifest manifest(boolean force) throws Exception {
        File cache = new File(this.cacheDir, "version_manifest.json");
        if (!force && cache.isFile() && System.currentTimeMillis() - cache.lastModified() < 3600000) {
            try {
                Result.Companion companion = Result.INSTANCE;
                GameInstaller gameInstaller = this;
                return VersionManifest.INSTANCE.parse(FilesKt.readText$default(cache, null, 1, null));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m8116constructorimpl(ResultKt.createFailure(th));
            }
        }
        Exception err = null;
        Iterator<String> it = this.mirrors.versionManifestUrls().iterator();
        while (true) {
            Exception err2 = err;
            if (it.hasNext()) {
                String u = it.next();
                try {
                    String t = Http.getText$default(this.http, u, null, 0, 6, null);
                    VersionManifest m = VersionManifest.INSTANCE.parse(t);
                    FileUtil fileUtil = FileUtil.INSTANCE;
                    byte[] bytes = t.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    fileUtil.writeAtomic(cache, bytes);
                    return m;
                } catch (Exception e) {
                    err = e;
                }
            } else {
                if (cache.isFile()) {
                    return VersionManifest.INSTANCE.parse(FilesKt.readText$default(cache, null, 1, null));
                }
                if (err2 != null) {
                    throw err2;
                }
                throw new IllegalStateException("无法获取版本清单");
            }
        }
    }

    public static /* synthetic */ String fetchJson$default(GameInstaller gameInstaller, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return gameInstaller.fetchJson(str, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ac, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String fetchJson(java.lang.String r21, java.lang.String r22) throws java.lang.Exception {
        /*
            r20 = this;
            r1 = r20
            r2 = r21
            r3 = r22
            java.lang.String r0 = "url"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            com.pymcl.core.download.Mirrors r4 = r1.mirrors
            java.util.List r4 = r4.candidates(r2)
            java.util.Iterator r4 = r4.iterator()
            r5 = r0
        L17:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lb1
            java.lang.Object r0 = r4.next()
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            com.pymcl.core.net.Http r6 = r1.http     // Catch: java.lang.Exception -> Lad
            r10 = 6
            r11 = 0
            r8 = 0
            r9 = 0
            java.lang.String r0 = com.pymcl.core.net.Http.getText$default(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> Lad
            com.pymcl.core.util.Json r6 = com.pymcl.core.util.Json.INSTANCE     // Catch: java.lang.Exception -> Lad
            r6.parse(r0)     // Catch: java.lang.Exception -> Lad
            r6 = r3
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch: java.lang.Exception -> Lad
            r8 = 1
            if (r6 == 0) goto L42
            boolean r6 = kotlin.text.StringsKt.isBlank(r6)     // Catch: java.lang.Exception -> Lad
            if (r6 == 0) goto L40
            goto L42
        L40:
            r6 = 0
            goto L43
        L42:
            r6 = r8
        L43:
            if (r6 != 0) goto Lac
            java.lang.String r6 = "SHA-1"
            java.security.MessageDigest r6 = java.security.MessageDigest.getInstance(r6)     // Catch: java.lang.Exception -> Lad
            java.nio.charset.Charset r9 = kotlin.text.Charsets.UTF_8     // Catch: java.lang.Exception -> Lad
            byte[] r9 = r0.getBytes(r9)     // Catch: java.lang.Exception -> Lad
            java.lang.String r10 = "getBytes(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r10)     // Catch: java.lang.Exception -> Lad
            byte[] r11 = r6.digest(r9)     // Catch: java.lang.Exception -> Lad
            java.lang.String r6 = "digest(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r6)     // Catch: java.lang.Exception -> Lad
            java.lang.String r6 = ""
            r12 = r6
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12     // Catch: java.lang.Exception -> Lad
            com.pymcl.core.version.GameInstaller$$ExternalSyntheticLambda0 r17 = new com.pymcl.core.version.GameInstaller$$ExternalSyntheticLambda0     // Catch: java.lang.Exception -> Lad
            r17.<init>()     // Catch: java.lang.Exception -> Lad
            r18 = 30
            r19 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            java.lang.String r6 = kotlin.collections.ArraysKt.joinToString$default(r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Exception -> Lad
            boolean r8 = kotlin.text.StringsKt.equals(r6, r3, r8)     // Catch: java.lang.Exception -> Lad
            if (r8 == 0) goto L7d
            goto Lac
        L7d:
            com.pymcl.core.download.DownloadError r8 = new com.pymcl.core.download.DownloadError     // Catch: java.lang.Exception -> Lad
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lad
            r9.<init>()     // Catch: java.lang.Exception -> Lad
            java.lang.String r10 = "版本文件校验失败（"
            java.lang.StringBuilder r9 = r9.append(r10)     // Catch: java.lang.Exception -> Lad
            java.lang.StringBuilder r9 = r9.append(r7)     // Catch: java.lang.Exception -> Lad
            java.lang.String r10 = "）：期望 "
            java.lang.StringBuilder r9 = r9.append(r10)     // Catch: java.lang.Exception -> Lad
            java.lang.StringBuilder r9 = r9.append(r3)     // Catch: java.lang.Exception -> Lad
            java.lang.String r10 = " 实得 "
            java.lang.StringBuilder r9 = r9.append(r10)     // Catch: java.lang.Exception -> Lad
            java.lang.StringBuilder r9 = r9.append(r6)     // Catch: java.lang.Exception -> Lad
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> Lad
            r10 = 2
            r11 = 0
            r8.<init>(r9, r11, r10, r11)     // Catch: java.lang.Exception -> Lad
            throw r8     // Catch: java.lang.Exception -> Lad
        Lac:
            return r0
        Lad:
            r0 = move-exception
            r5 = r0
            goto L17
        Lb1:
            if (r5 == 0) goto Lb7
            r0 = r5
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            goto Ld1
        Lb7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "没有可用的下载地址："
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
        Ld1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.version.GameInstaller.fetchJson(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence fetchJson$lambda$0(byte it) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(it)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static /* synthetic */ Object installVanilla$default(GameInstaller gameInstaller, GameDirs gameDirs, String str, boolean z, ManifestEntry manifestEntry, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            manifestEntry = null;
        }
        return gameInstaller.installVanilla(gameDirs, str, z2, manifestEntry, continuation);
    }

    public final Object installVanilla(GameDirs dirs, String id, boolean skipAssets, ManifestEntry manifestEntry, Continuation<? super Unit> continuation) throws Exception {
        ManifestEntry e;
        File jf = new File(dirs.getVersionsDir(), id + "/" + id + ".json");
        if (!jf.isFile()) {
            if (manifestEntry == null) {
                e = manifest$default(this, false, 1, null).find(id);
                if (e == null && (e = manifest(true).find(id)) == null) {
                    throw new VersionNotFound(id);
                }
            } else {
                e = manifestEntry;
            }
            String text = fetchJson(e.getUrl(), e.getSha1());
            FileUtil fileUtil = FileUtil.INSTANCE;
            byte[] bytes = text.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            fileUtil.writeAtomic(jf, bytes);
        }
        return completeFiles(dirs, id, skipAssets, continuation);
    }

    public static /* synthetic */ Object completeFiles$default(GameInstaller gameInstaller, GameDirs gameDirs, String str, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return gameInstaller.completeFiles(gameDirs, str, z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Type inference failed for: r7v2, types: [void] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object completeFiles(com.pymcl.core.version.GameDirs r20, java.lang.String r21, boolean r22, kotlin.coroutines.Continuation<? super kotlin.Unit> r23) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.version.GameInstaller.completeFiles(com.pymcl.core.version.GameDirs, java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final File verifiedMarker(GameDirs dirs, String id) {
        Intrinsics.checkNotNullParameter(dirs, "dirs");
        Intrinsics.checkNotNullParameter(id, "id");
        return new File(dirs.getVersionsDir(), id + "/.pymcl_verified");
    }

    /* renamed from: markVerified-0E7RQCE, reason: not valid java name */
    public final Object m8045markVerified0E7RQCE(GameDirs dirs, String id, boolean skipAssets) {
        Intrinsics.checkNotNullParameter(dirs, "dirs");
        Intrinsics.checkNotNullParameter(id, "id");
        try {
            Result.Companion companion = Result.INSTANCE;
            GameInstaller $this$markVerified_0E7RQCE_u24lambda_u240 = this;
            FileUtil fileUtil = FileUtil.INSTANCE;
            File fileVerifiedMarker = $this$markVerified_0E7RQCE_u24lambda_u240.verifiedMarker(dirs, id);
            byte[] bytes = (skipAssets ? "no-assets" : "assets").getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return Result.m8116constructorimpl(Boolean.valueOf(fileUtil.writeAtomic(fileVerifiedMarker, bytes)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
    }

    public final void invalidateVerified(GameDirs dirs, String id) {
        Intrinsics.checkNotNullParameter(dirs, "dirs");
        Intrinsics.checkNotNullParameter(id, "id");
        verifiedMarker(dirs, id).delete();
    }

    public static /* synthetic */ QuickCheckResult quickCheck$default(GameInstaller gameInstaller, GameDirs gameDirs, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return gameInstaller.quickCheck(gameDirs, str, z);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v8 ??, still in use, count: 6, list:
          (r0v8 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x0075: IF  (r0v8 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:24:0x009f
          (r0v8 ?? I:com.pymcl.core.download.DownloadItem A[D('it' com.pymcl.core.download.DownloadItem)]) from 0x0078: INVOKE (r5v19 ?? I:boolean) = (r0v8 ?? I:com.pymcl.core.download.DownloadItem A[D('it' com.pymcl.core.download.DownloadItem)]) STATIC call: com.pymcl.core.version.GameInstaller.quickCheck$ok(com.pymcl.core.download.DownloadItem):boolean A[MD:(com.pymcl.core.download.DownloadItem):boolean (m)] (LINE:95)
          (r0v8 ?? I:java.awt.ItemSelectable A[D('it' com.pymcl.core.download.DownloadItem)]) from CONSTRUCTOR 
          (r0v8 ?? I:java.awt.ItemSelectable A[D('it' com.pymcl.core.download.DownloadItem)])
          (r0v8 ?? I:int A[D('it' com.pymcl.core.download.DownloadItem)])
          (r0v8 ?? I:java.lang.Object A[D('it' com.pymcl.core.download.DownloadItem)])
          (r0v8 ?? I:int A[D('it' com.pymcl.core.download.DownloadItem)])
         call: java.awt.event.ItemEvent.<init>(java.awt.ItemSelectable, int, java.lang.Object, int):void type: CONSTRUCTOR
          (r0v8 ?? I:int A[D('it' com.pymcl.core.download.DownloadItem)]) from CONSTRUCTOR 
          (r0v8 ?? I:java.awt.ItemSelectable A[D('it' com.pymcl.core.download.DownloadItem)])
          (r0v8 ?? I:int A[D('it' com.pymcl.core.download.DownloadItem)])
          (r0v8 ?? I:java.lang.Object A[D('it' com.pymcl.core.download.DownloadItem)])
          (r0v8 ?? I:int A[D('it' com.pymcl.core.download.DownloadItem)])
         call: java.awt.event.ItemEvent.<init>(java.awt.ItemSelectable, int, java.lang.Object, int):void type: CONSTRUCTOR
          (r0v8 ?? I:java.lang.Object A[D('it' com.pymcl.core.download.DownloadItem)]) from CONSTRUCTOR 
          (r0v8 ?? I:java.awt.ItemSelectable A[D('it' com.pymcl.core.download.DownloadItem)])
          (r0v8 ?? I:int A[D('it' com.pymcl.core.download.DownloadItem)])
          (r0v8 ?? I:java.lang.Object A[D('it' com.pymcl.core.download.DownloadItem)])
          (r0v8 ?? I:int A[D('it' com.pymcl.core.download.DownloadItem)])
         call: java.awt.event.ItemEvent.<init>(java.awt.ItemSelectable, int, java.lang.Object, int):void type: CONSTRUCTOR
          (r0v8 ?? I:int A[D('it' com.pymcl.core.download.DownloadItem)]) from CONSTRUCTOR 
          (r0v8 ?? I:java.awt.ItemSelectable A[D('it' com.pymcl.core.download.DownloadItem)])
          (r0v8 ?? I:int A[D('it' com.pymcl.core.download.DownloadItem)])
          (r0v8 ?? I:java.lang.Object A[D('it' com.pymcl.core.download.DownloadItem)])
          (r0v8 ?? I:int A[D('it' com.pymcl.core.download.DownloadItem)])
         call: java.awt.event.ItemEvent.<init>(java.awt.ItemSelectable, int, java.lang.Object, int):void type: CONSTRUCTOR
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1130)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1168)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:243)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:93)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public final com.pymcl.core.version.QuickCheckResult quickCheck(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v8 ??, still in use, count: 6, list:
          (r0v8 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x0075: IF  (r0v8 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:24:0x009f
          (r0v8 ?? I:com.pymcl.core.download.DownloadItem A[D('it' com.pymcl.core.download.DownloadItem)]) from 0x0078: INVOKE (r5v19 ?? I:boolean) = (r0v8 ?? I:com.pymcl.core.download.DownloadItem A[D('it' com.pymcl.core.download.DownloadItem)]) STATIC call: com.pymcl.core.version.GameInstaller.quickCheck$ok(com.pymcl.core.download.DownloadItem):boolean A[MD:(com.pymcl.core.download.DownloadItem):boolean (m)] (LINE:95)
          (r0v8 ?? I:java.awt.ItemSelectable A[D('it' com.pymcl.core.download.DownloadItem)]) from CONSTRUCTOR 
          (r0v8 ?? I:java.awt.ItemSelectable A[D('it' com.pymcl.core.download.DownloadItem)])
          (r0v8 ?? I:int A[D('it' com.pymcl.core.download.DownloadItem)])
          (r0v8 ?? I:java.lang.Object A[D('it' com.pymcl.core.download.DownloadItem)])
          (r0v8 ?? I:int A[D('it' com.pymcl.core.download.DownloadItem)])
         call: java.awt.event.ItemEvent.<init>(java.awt.ItemSelectable, int, java.lang.Object, int):void type: CONSTRUCTOR
          (r0v8 ?? I:int A[D('it' com.pymcl.core.download.DownloadItem)]) from CONSTRUCTOR 
          (r0v8 ?? I:java.awt.ItemSelectable A[D('it' com.pymcl.core.download.DownloadItem)])
          (r0v8 ?? I:int A[D('it' com.pymcl.core.download.DownloadItem)])
          (r0v8 ?? I:java.lang.Object A[D('it' com.pymcl.core.download.DownloadItem)])
          (r0v8 ?? I:int A[D('it' com.pymcl.core.download.DownloadItem)])
         call: java.awt.event.ItemEvent.<init>(java.awt.ItemSelectable, int, java.lang.Object, int):void type: CONSTRUCTOR
          (r0v8 ?? I:java.lang.Object A[D('it' com.pymcl.core.download.DownloadItem)]) from CONSTRUCTOR 
          (r0v8 ?? I:java.awt.ItemSelectable A[D('it' com.pymcl.core.download.DownloadItem)])
          (r0v8 ?? I:int A[D('it' com.pymcl.core.download.DownloadItem)])
          (r0v8 ?? I:java.lang.Object A[D('it' com.pymcl.core.download.DownloadItem)])
          (r0v8 ?? I:int A[D('it' com.pymcl.core.download.DownloadItem)])
         call: java.awt.event.ItemEvent.<init>(java.awt.ItemSelectable, int, java.lang.Object, int):void type: CONSTRUCTOR
          (r0v8 ?? I:int A[D('it' com.pymcl.core.download.DownloadItem)]) from CONSTRUCTOR 
          (r0v8 ?? I:java.awt.ItemSelectable A[D('it' com.pymcl.core.download.DownloadItem)])
          (r0v8 ?? I:int A[D('it' com.pymcl.core.download.DownloadItem)])
          (r0v8 ?? I:java.lang.Object A[D('it' com.pymcl.core.download.DownloadItem)])
          (r0v8 ?? I:int A[D('it' com.pymcl.core.download.DownloadItem)])
         call: java.awt.event.ItemEvent.<init>(java.awt.ItemSelectable, int, java.lang.Object, int):void type: CONSTRUCTOR
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1130)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1168)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:243)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:93)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r24v0 ??
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

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 1, list:
          (r0v1 ?? I:java.io.File) from 0x0004: INVOKE (r0v2 ?? I:boolean) = (r0v1 ?? I:java.io.File) VIRTUAL call: java.io.File.isFile():boolean A[MD:():boolean (c)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0000: INVOKE (r0 I:void) = 
  (r4v0 ?? I:java.awt.event.ItemEvent A[D('it' com.pymcl.core.download.DownloadItem)])
  (r0 I:java.awt.ItemSelectable)
  (r0 I:int)
  (r0 I:java.lang.Object)
  (r0 I:int)
 VIRTUAL call: java.awt.event.ItemEvent.<init>(java.awt.ItemSelectable, int, java.lang.Object, int):void (LINE:94), block:B:2:0x0000 */
    private static final boolean quickCheck$ok(com.pymcl.core.download.DownloadItem r4) {
        /*
            void r0 = r4.<init>(r0, r0, r0, r0)
            boolean r0 = r0.isFile()
            if (r0 == 0) goto L37
            java.lang.Long r0 = r4.getSize()
            if (r0 == 0) goto L35
            java.lang.Long r0 = r4.getSize()
            long r0 = r0.longValue()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L35
            void r0 = r4.<init>(r0, r0, r0, r0)
            long r0 = r0.length()
            java.lang.Long r2 = r4.getSize()
            if (r2 != 0) goto L2d
            goto L37
        L2d:
            long r2 = r2.longValue()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L37
        L35:
            r0 = 1
            goto L38
        L37:
            r0 = 0
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.version.GameInstaller.quickCheck$ok(com.pymcl.core.download.DownloadItem):boolean");
    }

    public final DownloadItem clientJarItem(GameDirs dirs, ResolvedVersion v) {
        String str;
        Intrinsics.checkNotNullParameter(dirs, "dirs");
        Intrinsics.checkNotNullParameter(v, "v");
        Map c = JsonKt.obj(JsonKt.obj(v.getJson(), "downloads"), "client");
        if (c == null || (str = JsonKt.str(c, "url")) == null) {
            return null;
        }
        return item(str, new File(dirs.getVersionsDir(), v.getJarId() + "/" + v.getJarId() + ".jar"), JsonKt.str(c, "sha1"), JsonKt.m8043long(c, "size"));
    }

    public final DownloadItem item(String url, File dest, String sha1, Long size) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(dest, "dest");
        return new DownloadItem(this.mirrors.candidates(url), dest, sha1, size, null, 16, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d9  */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.pymcl.core.download.DownloadItem> libraryItems(com.pymcl.core.version.GameDirs r22, com.pymcl.core.version.ResolvedVersion r23) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.version.GameInstaller.libraryItems(com.pymcl.core.version.GameDirs, com.pymcl.core.version.ResolvedVersion):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0150 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0143 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void extractNatives(com.pymcl.core.version.GameDirs r24, com.pymcl.core.version.ResolvedVersion r25) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.version.GameInstaller.extractNatives(com.pymcl.core.version.GameDirs, com.pymcl.core.version.ResolvedVersion):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x02f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02e8  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r3v3, types: [void] */
    /* JADX WARN: Type inference failed for: r3v7, types: [void] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object installAssets(com.pymcl.core.version.GameDirs r33, com.pymcl.core.version.ResolvedVersion r34, kotlin.coroutines.Continuation<? super kotlin.Unit> r35) {
        /*
            Method dump skipped, instructions count: 876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.version.GameInstaller.installAssets(com.pymcl.core.version.GameDirs, com.pymcl.core.version.ResolvedVersion, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
