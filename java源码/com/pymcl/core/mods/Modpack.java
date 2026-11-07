package com.pymcl.core.mods;

import androidx.autofill.HintConstants;
import com.pymcl.core.download.DownloadManager;
import com.pymcl.core.download.DownloadProgress;
import com.pymcl.core.loader.InstallError;
import com.pymcl.core.loader.LoaderType;
import com.pymcl.core.util.FileUtil;
import com.pymcl.core.util.Json;
import com.pymcl.core.util.JsonKt;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;
import org.apache.commons.io.IOUtils;

/* compiled from: Modpack.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J \u0010\b\u001a\u00020\u00052\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\u0002`\fJ \u0010\r\u001a\u00020\u00052\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\u0002`\fJ \u0010\u000e\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bJV\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u001c\b\u0002\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u001bH\u0086@¢\u0006\u0002\u0010\u001dJ$\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0 2\u0006\u0010\u0015\u001a\u00020\u0007¨\u0006!"}, d2 = {"Lcom/pymcl/core/mods/Modpack;", "", "<init>", "()V", "read", "Lcom/pymcl/core/mods/PackInfo;", ArchiveStreamFactory.ZIP, "Ljava/io/File;", "readMrpack", "o", "", "", "Lcom/pymcl/core/util/JObj;", "readCurseForge", "parseCfLoader", "Lkotlin/Pair;", "Lcom/pymcl/core/loader/LoaderType;", "id", "installFiles", "", "info", "gameDir", "catalog", "Lcom/pymcl/core/mods/ModCatalog;", "downloads", "Lcom/pymcl/core/download/DownloadManager;", "onProgress", "Lkotlin/Function2;", "", "(Lcom/pymcl/core/mods/PackInfo;Ljava/io/File;Ljava/io/File;Lcom/pymcl/core/mods/ModCatalog;Lcom/pymcl/core/download/DownloadManager;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "extractOverrides", "prefixes", "", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class Modpack {
    public static final Modpack INSTANCE = new Modpack();

    /* compiled from: Modpack.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.core.mods.Modpack", f = "Modpack.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {82}, m = "installFiles", n = {"info", ArchiveStreamFactory.ZIP, "gameDir", "catalog", "downloads", "onProgress", "items"}, nl = {83}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6"}, v = 2)
    /* renamed from: com.pymcl.core.mods.Modpack$installFiles$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
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
            return Modpack.this.installFiles(null, null, null, null, null, null, this);
        }
    }

    private Modpack() {
    }

    public final PackInfo read(File zip) {
        PackInfo curseForge;
        Intrinsics.checkNotNullParameter(zip, "zip");
        ZipFile zipFile = new ZipFile(zip);
        try {
            ZipFile z = zipFile;
            ZipEntry e = z.getEntry("modrinth.index.json");
            if (e != null) {
                Modpack modpack = INSTANCE;
                Json json = Json.INSTANCE;
                InputStream inputStream = z.getInputStream(e);
                Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
                curseForge = modpack.readMrpack(json.obj(new String(ByteStreamsKt.readBytes(inputStream), Charsets.UTF_8)));
            } else {
                ZipEntry e2 = z.getEntry("manifest.json");
                if (e2 != null) {
                    Modpack modpack2 = INSTANCE;
                    Json json2 = Json.INSTANCE;
                    InputStream inputStream2 = z.getInputStream(e2);
                    Intrinsics.checkNotNullExpressionValue(inputStream2, "getInputStream(...)");
                    curseForge = modpack2.readCurseForge(json2.obj(new String(ByteStreamsKt.readBytes(inputStream2), Charsets.UTF_8)));
                } else {
                    throw new InstallError("不是可识别的整合包（缺少 modrinth.index.json 或 manifest.json）", null, 2, null);
                }
            }
            CloseableKt.closeFinally(zipFile, null);
            return curseForge;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(zipFile, th);
                throw th2;
            }
        }
    }

    public final PackInfo readMrpack(Map<String, Object> o) throws InstallError {
        ArrayList arrayList;
        int i;
        ArrayList arrayListEmptyList;
        int i2;
        ArrayList arrayList2;
        Intrinsics.checkNotNullParameter(o, "o");
        Map<String, Object> mapObj = JsonKt.obj(o, "dependencies");
        boolean z = false;
        if (mapObj == null) {
            mapObj = JsonKt.jobj(new Pair[0]);
        }
        Pair pair = mapObj.containsKey("neoforge") ? TuplesKt.to(LoaderType.NEOFORGE, JsonKt.str(mapObj, "neoforge")) : mapObj.containsKey("forge") ? TuplesKt.to(LoaderType.FORGE, JsonKt.str(mapObj, "forge")) : mapObj.containsKey("fabric-loader") ? TuplesKt.to(LoaderType.FABRIC, JsonKt.str(mapObj, "fabric-loader")) : mapObj.containsKey("quilt-loader") ? TuplesKt.to(LoaderType.QUILT, JsonKt.str(mapObj, "quilt-loader")) : TuplesKt.to(null, null);
        LoaderType loaderType = (LoaderType) pair.component1();
        String str = (String) pair.component2();
        List<Map<String, Object>> listObjs = JsonKt.objs(JsonKt.arr(o, "files"));
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : listObjs) {
            boolean z2 = z;
            if (!Intrinsics.areEqual(JsonKt.str(JsonKt.obj((Map) obj, "env"), "client"), "unsupported")) {
                arrayList3.add(obj);
            }
            z = z2;
        }
        boolean z3 = z;
        ArrayList arrayList4 = arrayList3;
        int i3 = 0;
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
        Iterator it = arrayList4.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map map = (Map) it.next();
            String str2 = JsonKt.str(map, "path");
            String str3 = str2 != null ? str2 : "";
            List<Object> listArr = JsonKt.arr(map, "downloads");
            if (listArr != null) {
                ArrayList arrayList6 = new ArrayList();
                for (Object obj2 : listArr) {
                    ArrayList arrayList7 = arrayList4;
                    String str4 = obj2 instanceof String ? (String) obj2 : null;
                    if (str4 != null) {
                        i2 = i3;
                        arrayList2 = arrayList6;
                        arrayList2.add(str4);
                    } else {
                        i2 = i3;
                        arrayList2 = arrayList6;
                    }
                    arrayList6 = arrayList2;
                    arrayList4 = arrayList7;
                    i3 = i2;
                }
                arrayList = arrayList4;
                i = i3;
                arrayListEmptyList = arrayList6;
            } else {
                arrayList = arrayList4;
                i = i3;
                arrayListEmptyList = CollectionsKt.emptyList();
            }
            arrayList5.add(new PackFile(str3, arrayListEmptyList, JsonKt.str(JsonKt.obj(map, "hashes"), "sha1"), JsonKt.m8043long(map, "fileSize")));
            arrayList4 = arrayList;
            i3 = i;
        }
        ArrayList arrayList8 = arrayList5;
        ArrayList arrayList9 = new ArrayList();
        for (Object obj3 : arrayList8) {
            if (!StringsKt.isBlank(((PackFile) obj3).getPath())) {
                arrayList9.add(obj3);
            }
        }
        ArrayList arrayList10 = arrayList9;
        String str5 = JsonKt.str(o, HintConstants.AUTOFILL_HINT_NAME);
        if (str5 == null) {
            str5 = "整合包";
        }
        String str6 = str5;
        String str7 = JsonKt.str(o, "versionId");
        String str8 = str7 == null ? "" : str7;
        String str9 = JsonKt.str(mapObj, "minecraft");
        if (str9 == null) {
            throw new InstallError("整合包缺少 minecraft 版本", null, 2, null);
        }
        List listEmptyList = CollectionsKt.emptyList();
        String[] strArr = new String[2];
        strArr[z3 ? 1 : 0] = "overrides/";
        strArr[1] = "client-overrides/";
        return new PackInfo("mrpack", str6, str8, str9, loaderType, str, arrayList10, listEmptyList, CollectionsKt.listOf((Object[]) strArr));
    }

    public final PackInfo readCurseForge(Map<String, Object> o) throws InstallError {
        Object element$iv;
        Pair pair;
        Intrinsics.checkNotNullParameter(o, "o");
        Map mc = JsonKt.obj(o, "minecraft");
        if (mc == null) {
            throw new InstallError("manifest.json 缺少 minecraft", null, 2, null);
        }
        List loaders = JsonKt.objs(JsonKt.arr(mc, "modLoaders"));
        List $this$firstOrNull$iv = loaders;
        Iterator it = $this$firstOrNull$iv.iterator();
        while (true) {
            if (!it.hasNext()) {
                element$iv = null;
                break;
            }
            element$iv = it.next();
            Map it2 = (Map) element$iv;
            if (Intrinsics.areEqual((Object) JsonKt.bool(it2, "primary"), (Object) true)) {
                break;
            }
        }
        Map map = (Map) element$iv;
        if (map == null) {
            map = (Map) CollectionsKt.firstOrNull(loaders);
        }
        String primary = JsonKt.str(map, "id");
        Pair<LoaderType, String> cfLoader = parseCfLoader(primary);
        LoaderType lt = cfLoader.component1();
        String lv = cfLoader.component2();
        Iterable $this$filter$iv = JsonKt.objs(JsonKt.arr(o, "files"));
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            Map it3 = (Map) element$iv$iv;
            if (!Intrinsics.areEqual((Object) JsonKt.bool(it3, "required"), (Object) false)) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        Iterable $this$mapNotNull$iv = (List) destination$iv$iv;
        int $i$f$mapNotNull = 0;
        Collection destination$iv$iv2 = new ArrayList();
        for (Object element$iv$iv$iv : $this$mapNotNull$iv) {
            Iterable $this$mapNotNull$iv2 = $this$mapNotNull$iv;
            Map f = (Map) element$iv$iv$iv;
            int $i$f$mapNotNull2 = $i$f$mapNotNull;
            Long lM8043long = JsonKt.m8043long(f, "projectID");
            if (lM8043long != null) {
                long p = lM8043long.longValue();
                Long lM8043long2 = JsonKt.m8043long(f, "fileID");
                if (lM8043long2 != null) {
                    long it4 = lM8043long2.longValue();
                    pair = TuplesKt.to(Long.valueOf(p), Long.valueOf(it4));
                } else {
                    pair = null;
                }
            } else {
                pair = null;
            }
            if (pair != null) {
                destination$iv$iv2.add(pair);
            }
            $this$mapNotNull$iv = $this$mapNotNull$iv2;
            $i$f$mapNotNull = $i$f$mapNotNull2;
        }
        List files = (List) destination$iv$iv2;
        String str = JsonKt.str(o, HintConstants.AUTOFILL_HINT_NAME);
        if (str == null) {
            str = "整合包";
        }
        String str2 = str;
        String str3 = JsonKt.str(o, "version");
        if (str3 == null) {
            str3 = "";
        }
        String str4 = str3;
        String str5 = JsonKt.str(mc, "version");
        if (str5 == null) {
            throw new InstallError("manifest.json 缺少游戏版本", null, 2, null);
        }
        List listEmptyList = CollectionsKt.emptyList();
        String str6 = JsonKt.str(o, "overrides");
        return new PackInfo("curseforge", str2, str4, str5, lt, lv, listEmptyList, files, CollectionsKt.listOf(StringsKt.trimEnd(str6 != null ? str6 : "overrides", IOUtils.DIR_SEPARATOR_UNIX) + "/"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<com.pymcl.core.loader.LoaderType, java.lang.String> parseCfLoader(java.lang.String r9) {
        /*
            r8 = this;
            r0 = r9
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L10
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto Le
            goto L10
        Le:
            r0 = r1
            goto L11
        L10:
            r0 = r2
        L11:
            r3 = 0
            if (r0 == 0) goto L19
            kotlin.Pair r0 = kotlin.TuplesKt.to(r3, r3)
            return r0
        L19:
            r0 = 2
            r4 = 45
            java.lang.String r0 = kotlin.text.StringsKt.substringBefore$default(r9, r4, r3, r0, r3)
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r5)
            java.lang.String r5 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            java.lang.String r5 = ""
            java.lang.String r4 = kotlin.text.StringsKt.substringAfter(r9, r4, r5)
            int r5 = r0.hashCode()
            switch(r5) {
                case -1282179931: goto L5d;
                case 97618791: goto L51;
                case 107947789: goto L45;
                case 1154621647: goto L39;
                default: goto L38;
            }
        L38:
            goto L69
        L39:
            java.lang.String r5 = "neoforge"
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L42
            goto L38
        L42:
            com.pymcl.core.loader.LoaderType r5 = com.pymcl.core.loader.LoaderType.NEOFORGE
            goto L6a
        L45:
            java.lang.String r5 = "quilt"
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L4e
            goto L38
        L4e:
            com.pymcl.core.loader.LoaderType r5 = com.pymcl.core.loader.LoaderType.QUILT
            goto L6a
        L51:
            java.lang.String r5 = "forge"
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L5a
            goto L38
        L5a:
            com.pymcl.core.loader.LoaderType r5 = com.pymcl.core.loader.LoaderType.FORGE
            goto L6a
        L5d:
            java.lang.String r5 = "fabric"
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L66
            goto L38
        L66:
            com.pymcl.core.loader.LoaderType r5 = com.pymcl.core.loader.LoaderType.FABRIC
            goto L6a
        L69:
            r5 = r3
        L6a:
            r6 = r4
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            int r7 = r6.length()
            if (r7 != 0) goto L74
            r1 = r2
        L74:
            if (r1 == 0) goto L79
            r1 = 0
            goto L7a
        L79:
            r3 = r6
        L7a:
            kotlin.Pair r1 = kotlin.TuplesKt.to(r5, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.mods.Modpack.parseCfLoader(java.lang.String):kotlin.Pair");
    }

    public static /* synthetic */ Object installFiles$default(Modpack modpack, PackInfo packInfo, File file, File file2, ModCatalog modCatalog, DownloadManager downloadManager, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 32) != 0) {
            function2 = null;
        }
        return modpack.installFiles(packInfo, file, file2, modCatalog, downloadManager, function2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object installFiles(com.pymcl.core.mods.PackInfo r34, java.io.File r35, java.io.File r36, com.pymcl.core.mods.ModCatalog r37, com.pymcl.core.download.DownloadManager r38, final kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.String, kotlin.Unit> r39, kotlin.coroutines.Continuation<? super kotlin.Unit> r40) throws com.pymcl.core.loader.InstallError, java.io.IOException {
        /*
            Method dump skipped, instructions count: 928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.mods.Modpack.installFiles(com.pymcl.core.mods.PackInfo, java.io.File, java.io.File, com.pymcl.core.mods.ModCatalog, com.pymcl.core.download.DownloadManager, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit installFiles$lambda$7(Function2 $onProgress, DownloadProgress p) {
        Intrinsics.checkNotNullParameter(p, "p");
        if ($onProgress != null) {
            $onProgress.invoke(Float.valueOf(p.getFraction() * 0.9f), p.getCurrent());
        }
        return Unit.INSTANCE;
    }

    public final void extractOverrides(File zip, List<String> prefixes, File gameDir) {
        Throwable th;
        Throwable th2;
        ZipFile z;
        int i;
        File gameDir2 = gameDir;
        Intrinsics.checkNotNullParameter(zip, "zip");
        Intrinsics.checkNotNullParameter(prefixes, "prefixes");
        Intrinsics.checkNotNullParameter(gameDir2, "gameDir");
        ZipFile zipFile = new ZipFile(zip);
        try {
            ZipFile z2 = zipFile;
            int i2 = 0;
            Iterator<String> it = prefixes.iterator();
            while (it.hasNext()) {
                final String pre = it.next();
                Enumeration<? extends ZipEntry> enumerationEntries = z2.entries();
                Intrinsics.checkNotNullExpressionValue(enumerationEntries, "entries(...)");
                Sequence $this$forEach$iv = SequencesKt.filter(SequencesKt.asSequence(CollectionsKt.iterator(enumerationEntries)), new Function1() { // from class: com.pymcl.core.mods.Modpack$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(Modpack.extractOverrides$lambda$0$0(pre, (ZipEntry) obj));
                    }
                });
                for (Object element$iv : $this$forEach$iv) {
                    ZipEntry e = (ZipEntry) element$iv;
                    FileUtil fileUtil = FileUtil.INSTANCE;
                    String name = e.getName();
                    Iterator<String> it2 = it;
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    File f = fileUtil.safeChild(gameDir2, StringsKt.removePrefix(name, (CharSequence) pre));
                    if (e.isDirectory()) {
                        f.mkdirs();
                        z = z2;
                        i = i2;
                    } else {
                        File parentFile = f.getParentFile();
                        if (parentFile != null) {
                            parentFile.mkdirs();
                        }
                        FileOutputStream inputStream = z2.getInputStream(e);
                        try {
                            InputStream i3 = inputStream;
                            inputStream = new FileOutputStream(f);
                            try {
                                FileOutputStream it3 = inputStream;
                                Intrinsics.checkNotNull(i3);
                                z = z2;
                                i = i2;
                                try {
                                    ByteStreamsKt.copyTo$default(i3, it3, 0, 2, null);
                                    Unit unit = Unit.INSTANCE;
                                    try {
                                        CloseableKt.closeFinally(inputStream, null);
                                        Unit unit2 = Unit.INSTANCE;
                                        CloseableKt.closeFinally(inputStream, null);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        try {
                                            throw th;
                                        } finally {
                                        }
                                    }
                                } catch (Throwable th4) {
                                    th2 = th4;
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            } catch (Throwable th5) {
                                th2 = th5;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    }
                    gameDir2 = gameDir;
                    it = it2;
                    i2 = i;
                    z2 = z;
                }
                gameDir2 = gameDir;
            }
            Unit unit3 = Unit.INSTANCE;
            CloseableKt.closeFinally(zipFile, null);
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean extractOverrides$lambda$0$0(String $pre, ZipEntry it) {
        String name = it.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return StringsKt.startsWith$default(name, $pre, false, 2, (Object) null) && it.getName().length() > $pre.length();
    }
}
