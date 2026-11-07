package com.pymcl.core.mods;

import androidx.autofill.HintConstants;
import com.pymcl.core.download.DownloadManager;
import com.pymcl.core.download.Mirrors;
import com.pymcl.core.util.FileUtil;
import com.pymcl.core.util.JsonKt;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ModTools.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u0000 @2\u00020\u0001:\u0002@AB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0007J\u001a\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013j\u0002`\u0014H\u0002J\"\u0010\u0015\u001a\u00020\u00162\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013j\u0002`\u0014H\u0002J:\u0010\u0018\u001a\u00020\u00192\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013j\u0002`\u00142\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u000eH\u0002J\"\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013j\u0002`\u00142\u0006\u0010\u001f\u001a\u00020\u0019H\u0002J*\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00190!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070#2\b\b\u0002\u0010$\u001a\u00020%J.\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00190!2\u0006\u0010'\u001a\u00020\u00072\b\b\u0002\u0010(\u001a\u00020%2\b\b\u0002\u0010$\u001a\u00020%JR\u0010)\u001a\b\u0012\u0004\u0012\u00020*0#2\u0006\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020-2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\f0/2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\f0/2\u0006\u00101\u001a\u00020\f2\u0006\u00102\u001a\u00020\f2\b\b\u0002\u00103\u001a\u000204JF\u00105\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020-0!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070#2\u0006\u00101\u001a\u00020\f2\u0006\u00102\u001a\u00020\f2\u0014\b\u0002\u00106\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00190!J>\u00107\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u00072\u0006\u00109\u001a\u00020-2\u0006\u0010:\u001a\u00020;2\u0016\b\u0002\u0010<\u001a\u0010\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\u0016\u0018\u00010=H\u0086@¢\u0006\u0002\u0010?R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000RB\u0010\n\u001a6\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\r0\u000bj\u001a\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\r`\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"Lcom/pymcl/core/mods/ModTools;", "", "catalog", "Lcom/pymcl/core/mods/ModCatalog;", "mirrors", "Lcom/pymcl/core/download/Mirrors;", "cacheFile", "Ljava/io/File;", "<init>", "(Lcom/pymcl/core/mods/ModCatalog;Lcom/pymcl/core/download/Mirrors;Ljava/io/File;)V", "hashMemo", "Ljava/util/HashMap;", "", "Lkotlin/Pair;", "", "Lkotlin/collections/HashMap;", "hashes", "f", "loadCache", "", "Lcom/pymcl/core/util/JObj;", "saveCache", "", "c", "fromCache", "Lcom/pymcl/core/mods/ModIdent;", "e", HintConstants.AUTOFILL_HINT_NAME, "sha1", "fp", "toCache", "i", "identify", "", "files", "", "useNetwork", "", "identifyDir", "dir", "mods", "missingDeps", "Lcom/pymcl/core/mods/ModTools$Dep;", "rootId", "root", "Lcom/pymcl/core/mods/ModFile;", "installedIds", "", "installedNames", "mc", "loader", "maxDepth", "", "checkUpdates", "idents", "applyUpdate", "old", "newFile", "downloads", "Lcom/pymcl/core/download/DownloadManager;", "onProgress", "Lkotlin/Function1;", "", "(Ljava/io/File;Lcom/pymcl/core/mods/ModFile;Lcom/pymcl/core/download/DownloadManager;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "Dep", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ModTools {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final long HIT_TTL = 604800000;
    public static final long MISS_TTL = 86400000;
    private final File cacheFile;
    private final ModCatalog catalog;
    private final HashMap<String, Pair<String, Long>> hashMemo;
    private final Mirrors mirrors;

    /* compiled from: ModTools.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.core.mods.ModTools", f = "ModTools.kt", i = {0, 0, 0, 0, 0}, l = {209}, m = "applyUpdate", n = {"old", "newFile", "downloads", "onProgress", "dir"}, nl = {210}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
    /* renamed from: com.pymcl.core.mods.ModTools$applyUpdate$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ModTools.this.applyUpdate(null, null, null, null, this);
        }
    }

    /* compiled from: ModTools.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/pymcl/core/mods/ModTools$Companion;", "", "<init>", "()V", "HIT_TTL", "", "MISS_TTL", "isModFile", "", "f", "Ljava/io/File;", "isPackFile", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean isModFile(File f) {
            Intrinsics.checkNotNullParameter(f, "f");
            if (!f.isFile()) {
                return false;
            }
            String name = f.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (!StringsKt.endsWith$default(name, ".jar", false, 2, (Object) null)) {
                String name2 = f.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                if (!StringsKt.endsWith$default(name2, ".jar.disabled", false, 2, (Object) null)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean isPackFile(File f) {
            Intrinsics.checkNotNullParameter(f, "f");
            if (!f.isFile()) {
                return false;
            }
            String name = f.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (!StringsKt.endsWith$default(name, ".zip", false, 2, (Object) null)) {
                String name2 = f.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                if (!StringsKt.endsWith$default(name2, ".zip.disabled", false, 2, (Object) null)) {
                    String name3 = f.getName();
                    Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
                    if (!StringsKt.endsWith$default(name3, ".jar", false, 2, (Object) null)) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public ModTools(ModCatalog catalog, Mirrors mirrors, File cacheFile) {
        Intrinsics.checkNotNullParameter(catalog, "catalog");
        Intrinsics.checkNotNullParameter(mirrors, "mirrors");
        this.catalog = catalog;
        this.mirrors = mirrors;
        this.cacheFile = cacheFile;
        this.hashMemo = new HashMap<>();
    }

    public /* synthetic */ ModTools(ModCatalog modCatalog, Mirrors mirrors, File file, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(modCatalog, mirrors, (i & 4) != 0 ? null : file);
    }

    public final Pair<String, Long> hashes(File f) {
        Pair<String, Long> pair;
        Pair<String, Long> pair2;
        Intrinsics.checkNotNullParameter(f, "f");
        synchronized (this.hashMemo) {
            String key = f.getAbsolutePath() + "|" + f.length() + "|" + f.lastModified();
            Map $this$getOrPut$iv = this.hashMemo;
            Pair<String, Long> pair3 = $this$getOrPut$iv.get(key);
            if (pair3 == null) {
                pair = TuplesKt.to(FileUtil.hash$default(FileUtil.INSTANCE, f, null, 2, null), Long.valueOf(Murmur2.INSTANCE.hash(f)));
                $this$getOrPut$iv.put(key, pair);
            } else {
                pair = pair3;
            }
            pair2 = pair;
        }
        return pair2;
    }

    private final Map<String, Object> loadCache() {
        Map<String, Object> jsonObj;
        File it = this.cacheFile;
        return (it == null || (jsonObj = FileUtil.INSTANCE.readJsonObj(it)) == null) ? JsonKt.jobj(new Pair[0]) : jsonObj;
    }

    private final void saveCache(Map<String, Object> c) {
        Object objM8116constructorimpl;
        File it = this.cacheFile;
        if (it != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                ModTools modTools = this;
                objM8116constructorimpl = Result.m8116constructorimpl(Boolean.valueOf(FileUtil.INSTANCE.writeJson(it, c)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
            }
            Result.m8115boximpl(objM8116constructorimpl);
        }
    }

    private final ModIdent fromCache(Map<String, Object> e, String name, String sha1, long fp) {
        String str = JsonKt.str(e, "mr");
        String str2 = JsonKt.str(e, "mrv");
        String str3 = JsonKt.str(e, "mru");
        Long lM8043long = JsonKt.m8043long(e, "cf");
        Long lM8043long2 = JsonKt.m8043long(e, "cff");
        String str4 = JsonKt.str(e, "title");
        String str5 = str4 == null ? "" : str4;
        String str6 = JsonKt.str(e, "icon");
        String str7 = str6 == null ? "" : str6;
        String str8 = JsonKt.str(e, "ver");
        return new ModIdent(name, sha1, fp, str, str2, str3, lM8043long, lM8043long2, str5, str7, str8 == null ? "" : str8);
    }

    private final Map<String, Object> toCache(ModIdent i) {
        return JsonKt.jobj(TuplesKt.to("mr", i.getMrProject()), TuplesKt.to("mrv", i.getMrVersion()), TuplesKt.to("mru", i.getMrUrl()), TuplesKt.to("cf", i.getCfProject()), TuplesKt.to("cff", i.getCfFile()), TuplesKt.to("title", i.getTitle()), TuplesKt.to("icon", i.getIconUrl()), TuplesKt.to("ver", i.getVersionName()), TuplesKt.to("at", Long.valueOf(System.currentTimeMillis())));
    }

    public static /* synthetic */ Map identify$default(ModTools modTools, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return modTools.identify(list, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x07c4 A[PHI: r1
  0x07c4: PHI (r1v12 java.lang.String) = (r1v11 java.lang.String), (r1v16 java.lang.String), (r1v19 java.lang.String) binds: [B:216:0x07ab, B:218:0x07b1, B:223:0x07bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0423 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0594 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0577 A[EDGE_INSN: B:266:0x0577->B:139:0x0577 BREAK  A[LOOP:6: B:130:0x053b->B:138:0x0570], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03b9 A[Catch: all -> 0x0410, LOOP:4: B:97:0x03b3->B:99:0x03b9, LOOP_END, TryCatch #0 {all -> 0x0410, blocks: (B:96:0x037a, B:97:0x03b3, B:99:0x03b9, B:100:0x03df), top: B:229:0x037a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, com.pymcl.core.mods.ModIdent> identify(java.util.List<? extends java.io.File> r50, boolean r51) {
        /*
            Method dump skipped, instructions count: 2045
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.mods.ModTools.identify(java.util.List, boolean):java.util.Map");
    }

    public static /* synthetic */ Map identifyDir$default(ModTools modTools, File file, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        return modTools.identifyDir(file, z, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, com.pymcl.core.mods.ModIdent> identifyDir(java.io.File r12, boolean r13, boolean r14) {
        /*
            r11 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.io.File[] r0 = r12.listFiles()
            if (r0 == 0) goto L4a
            r1 = 0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Collection r2 = (java.util.Collection) r2
            r3 = r0
            r4 = 0
            int r5 = r3.length
            r6 = 0
        L17:
            if (r6 >= r5) goto L35
            r7 = r3[r6]
            r8 = r7
            r9 = 0
            com.pymcl.core.mods.ModTools$Companion r10 = com.pymcl.core.mods.ModTools.INSTANCE
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8)
            if (r13 == 0) goto L29
            boolean r10 = r10.isModFile(r8)
            goto L2d
        L29:
            boolean r10 = r10.isPackFile(r8)
        L2d:
            if (r10 == 0) goto L32
            r2.add(r7)
        L32:
            int r6 = r6 + 1
            goto L17
        L35:
            java.util.List r2 = (java.util.List) r2
            r0 = r2
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 0
            com.pymcl.core.mods.ModTools$identifyDir$$inlined$sortedBy$1 r2 = new com.pymcl.core.mods.ModTools$identifyDir$$inlined$sortedBy$1
            r2.<init>()
            java.util.Comparator r2 = (java.util.Comparator) r2
            java.util.List r0 = kotlin.collections.CollectionsKt.sortedWith(r0, r2)
            if (r0 != 0) goto L4e
        L4a:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
        L4e:
            java.util.Map r0 = r11.identify(r0, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.mods.ModTools.identifyDir(java.io.File, boolean, boolean):java.util.Map");
    }

    /* compiled from: ModTools.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/pymcl/core/mods/ModTools$Dep;", "", "projectId", "", "title", "file", "Lcom/pymcl/core/mods/ModFile;", "iconUrl", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/pymcl/core/mods/ModFile;Ljava/lang/String;Ljava/lang/String;)V", "getProjectId", "()Ljava/lang/String;", "getTitle", "getFile", "()Lcom/pymcl/core/mods/ModFile;", "getIconUrl", "getSource", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Dep {
        private final ModFile file;
        private final String iconUrl;
        private final String projectId;
        private final String source;
        private final String title;

        public static /* synthetic */ Dep copy$default(Dep dep, String str, String str2, ModFile modFile, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dep.projectId;
            }
            if ((i & 2) != 0) {
                str2 = dep.title;
            }
            if ((i & 4) != 0) {
                modFile = dep.file;
            }
            if ((i & 8) != 0) {
                str3 = dep.iconUrl;
            }
            if ((i & 16) != 0) {
                str4 = dep.source;
            }
            String str5 = str4;
            ModFile modFile2 = modFile;
            return dep.copy(str, str2, modFile2, str3, str5);
        }

        /* renamed from: component1, reason: from getter */
        public final String getProjectId() {
            return this.projectId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final ModFile getFile() {
            return this.file;
        }

        /* renamed from: component4, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public final Dep copy(String projectId, String title, ModFile file, String iconUrl, String source) {
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
            Intrinsics.checkNotNullParameter(source, "source");
            return new Dep(projectId, title, file, iconUrl, source);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Dep)) {
                return false;
            }
            Dep dep = (Dep) other;
            return Intrinsics.areEqual(this.projectId, dep.projectId) && Intrinsics.areEqual(this.title, dep.title) && Intrinsics.areEqual(this.file, dep.file) && Intrinsics.areEqual(this.iconUrl, dep.iconUrl) && Intrinsics.areEqual(this.source, dep.source);
        }

        public int hashCode() {
            return (((((((this.projectId.hashCode() * 31) + this.title.hashCode()) * 31) + this.file.hashCode()) * 31) + this.iconUrl.hashCode()) * 31) + this.source.hashCode();
        }

        public String toString() {
            return "Dep(projectId=" + this.projectId + ", title=" + this.title + ", file=" + this.file + ", iconUrl=" + this.iconUrl + ", source=" + this.source + ")";
        }

        public Dep(String projectId, String title, ModFile file, String iconUrl, String source) {
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
            Intrinsics.checkNotNullParameter(source, "source");
            this.projectId = projectId;
            this.title = title;
            this.file = file;
            this.iconUrl = iconUrl;
            this.source = source;
        }

        public /* synthetic */ Dep(String str, String str2, ModFile modFile, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, modFile, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4);
        }

        public final ModFile getFile() {
            return this.file;
        }

        public final String getIconUrl() {
            return this.iconUrl;
        }

        public final String getProjectId() {
            return this.projectId;
        }

        public final String getSource() {
            return this.source;
        }

        public final String getTitle() {
            return this.title;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.pymcl.core.mods.ModTools.Dep> missingDeps(java.lang.String r26, com.pymcl.core.mods.ModFile r27, java.util.Set<java.lang.String> r28, java.util.Set<java.lang.String> r29, java.lang.String r30, java.lang.String r31, int r32) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.mods.ModTools.missingDeps(java.lang.String, com.pymcl.core.mods.ModFile, java.util.Set, java.util.Set, java.lang.String, java.lang.String, int):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Map checkUpdates$default(ModTools modTools, List list, String str, String str2, Map map, int i, Object obj) {
        if ((i & 8) != 0) {
            map = identify$default(modTools, list, false, 2, null);
        }
        return modTools.checkUpdates(list, str, str2, map);
    }

    public final Map<String, ModFile> checkUpdates(List<? extends File> files, String mc, String loader, Map<String, ModIdent> idents) {
        ModIdent i;
        Long cfProject;
        Object objM8116constructorimpl;
        Object maxElem$iv;
        Intrinsics.checkNotNullParameter(files, "files");
        Intrinsics.checkNotNullParameter(mc, "mc");
        Intrinsics.checkNotNullParameter(loader, "loader");
        Intrinsics.checkNotNullParameter(idents, "idents");
        LinkedHashMap out = new LinkedHashMap();
        try {
            Result.Companion companion = Result.INSTANCE;
            ModTools $this$checkUpdates_u24lambda_u240 = this;
            out.putAll($this$checkUpdates_u24lambda_u240.catalog.checkUpdates(files, mc, loader));
            Result.m8116constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        for (File f : files) {
            if (!out.containsKey(f.getName()) && (i = idents.get(f.getName())) != null && (cfProject = i.getCfProject()) != null) {
                long cid = cfProject.longValue();
                if (i.getMrProject() == null) {
                    try {
                        Result.Companion companion3 = Result.INSTANCE;
                        ModTools $this$checkUpdates_u24lambda_u241 = this;
                        Iterable $this$maxByOrNull$iv = $this$checkUpdates_u24lambda_u241.catalog.files("cf:" + cid, mc, loader);
                        Iterator iterator$iv = $this$maxByOrNull$iv.iterator();
                        if (iterator$iv.hasNext()) {
                            maxElem$iv = iterator$iv.next();
                            if (iterator$iv.hasNext()) {
                                ModFile it = (ModFile) maxElem$iv;
                                Comparable maxValue$iv = it.getDate();
                                while (true) {
                                    Object e$iv = iterator$iv.next();
                                    ModFile it2 = (ModFile) e$iv;
                                    String date = it2.getDate();
                                    ModTools $this$checkUpdates_u24lambda_u2412 = $this$checkUpdates_u24lambda_u241;
                                    if (maxValue$iv.compareTo(date) < 0) {
                                        maxElem$iv = e$iv;
                                        maxValue$iv = date;
                                    }
                                    if (!iterator$iv.hasNext()) {
                                        break;
                                    }
                                    $this$checkUpdates_u24lambda_u241 = $this$checkUpdates_u24lambda_u2412;
                                }
                            }
                        } else {
                            maxElem$iv = null;
                        }
                        objM8116constructorimpl = Result.m8116constructorimpl((ModFile) maxElem$iv);
                    } catch (Throwable th2) {
                        Result.Companion companion4 = Result.INSTANCE;
                        objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th2));
                    }
                    if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
                        objM8116constructorimpl = null;
                    }
                    ModFile latest = (ModFile) objM8116constructorimpl;
                    if (latest != null) {
                        String id = latest.getId();
                        Long cfFile = i.getCfFile();
                        if (!Intrinsics.areEqual(id, cfFile != null ? String.valueOf(cfFile.longValue()) : null)) {
                            String name = latest.getName();
                            String name2 = f.getName();
                            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                            if (!Intrinsics.areEqual(name, StringsKt.removeSuffix(name2, (CharSequence) ".disabled"))) {
                                out.put(f.getName(), latest);
                            }
                        }
                    }
                }
            }
        }
        return out;
    }

    public static /* synthetic */ Object applyUpdate$default(ModTools modTools, File file, ModFile modFile, DownloadManager downloadManager, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 8) != 0) {
            function1 = null;
        }
        return modTools.applyUpdate(file, modFile, downloadManager, function1, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object applyUpdate(java.io.File r23, com.pymcl.core.mods.ModFile r24, com.pymcl.core.download.DownloadManager r25, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r26, kotlin.coroutines.Continuation<? super java.io.File> r27) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.mods.ModTools.applyUpdate(java.io.File, com.pymcl.core.mods.ModFile, com.pymcl.core.download.DownloadManager, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
