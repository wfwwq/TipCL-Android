package com.pymcl.core.mods;

import androidx.autofill.HintConstants;
import com.pymcl.ai.AiClient;
import com.pymcl.core.download.DownloadManager;
import com.pymcl.core.download.DownloadProgress;
import com.pymcl.core.download.Mirrors;
import com.pymcl.core.loader.InstallError;
import com.pymcl.core.net.Http;
import com.pymcl.core.net.HttpException;
import com.pymcl.core.net.HttpResponse;
import com.pymcl.core.util.FileUtil;
import com.pymcl.core.util.Json;
import com.pymcl.core.util.JsonKt;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.ZipEntry;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;
import org.apache.commons.io.IOUtils;

/* compiled from: ModCatalog.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 M2\u00020\u0001:\u0001MB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\fH\u0002J\u0014\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\fH\u0002JC\u0010\u000e\u001a\u0004\u0018\u00010\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0002\b\u0016JD\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00102\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020 J:\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\u00102\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020 J:\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180\u00102\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\bJ'\u0010$\u001a\u00020\u00182\u0018\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010&j\u0002`'H\u0000¢\u0006\u0002\b(J\u0018\u0010)\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\bJ\u0010\u0010*\u001a\u0004\u0018\u00010\u00182\u0006\u0010+\u001a\u00020\bJ(\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u00102\u0006\u0010+\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010.\u001a\u00020\bJ)\u0010/\u001a\u0004\u0018\u00010-2\u0018\u00100\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010&j\u0002`'H\u0000¢\u0006\u0002\b1J'\u00102\u001a\u00020-2\u0018\u00103\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010&j\u0002`'H\u0000¢\u0006\u0002\b4J\u0016\u00105\u001a\u00020-2\u0006\u00106\u001a\u00020\b2\u0006\u00107\u001a\u00020\bJ\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020-0\u00102\f\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u0010J \u0010;\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020 0\f2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020:0\u0010J\u0016\u0010=\u001a\u00020>2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010?\u001a\u00020>JR\u0010@\u001a\u00020>2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u00105\u001a\u00020-2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020B2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010D\u001a\u0010\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020G\u0018\u00010EH\u0086@¢\u0006\u0002\u0010HJ\u0016\u0010I\u001a\u00020>2\u0006\u0010J\u001a\u00020>2\u0006\u0010K\u001a\u00020>J0\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020-0\f2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020>0\u00102\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010.\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006N"}, d2 = {"Lcom/pymcl/core/mods/ModCatalog;", "", "http", "Lcom/pymcl/core/net/Http;", "mirrors", "Lcom/pymcl/core/download/Mirrors;", "cfKey", "Lkotlin/Function0;", "", "<init>", "(Lcom/pymcl/core/net/Http;Lcom/pymcl/core/download/Mirrors;Lkotlin/jvm/functions/Function0;)V", "mrHeaders", "", "cfHeaders", "getJson", "bases", "", "path", "cf", "", "method", "body", "getJson$PyMCL_Android_core", "search", "Lcom/pymcl/core/mods/ModHit;", "kind", "Lcom/pymcl/core/mods/ResKind;", "query", "source", "gameVersion", "category", "limit", "", "searchModrinth", "searchCurseForge", "slug", "cfHit", "m", "", "Lcom/pymcl/core/util/JObj;", "cfHit$PyMCL_Android_core", "resolveCfSlug", "project", "id", "files", "Lcom/pymcl/core/mods/ModFile;", "loader", "mrVersion", SettingsProtocol.EXTRA_VALUE, "mrVersion$PyMCL_Android_core", "cfFile", "f", "cfFile$PyMCL_Android_core", "file", "projectId", "fileId", "cfFiles", "fileIds", "", "cfClasses", "modIds", "targetDir", "Ljava/io/File;", "gameDir", "install", "downloads", "Lcom/pymcl/core/download/DownloadManager;", "world", "onProgress", "Lkotlin/Function1;", "", "", "(Lcom/pymcl/core/mods/ResKind;Lcom/pymcl/core/mods/ModFile;Ljava/io/File;Lcom/pymcl/core/download/DownloadManager;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unzipWorld", ArchiveStreamFactory.ZIP, "saves", "checkUpdates", "Companion", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ModCatalog {
    private final Function0<String> cfKey;
    private final Http http;
    private final Mirrors mirrors;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Map<String, Integer> CF_LOADERS = MapsKt.mapOf(TuplesKt.to("forge", 1), TuplesKt.to("fabric", 4), TuplesKt.to("quilt", 5), TuplesKt.to("neoforge", 6));

    /* compiled from: ModCatalog.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.core.mods.ModCatalog", f = "ModCatalog.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {205}, m = "install", n = {"kind", "file", "gameDir", "downloads", "world", "onProgress", "dir", HintConstants.AUTOFILL_HINT_NAME, "dest"}, nl = {206}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"}, v = 2)
    /* renamed from: com.pymcl.core.mods.ModCatalog$install$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ModCatalog.this.install(null, null, null, null, null, null, this);
        }
    }

    /* compiled from: ModCatalog.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006J$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006J\u001e\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\u0006J,\u0010\u0019\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00100\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010R \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u001b"}, d2 = {"Lcom/pymcl/core/mods/ModCatalog$Companion;", "", "<init>", "()V", "CF_LOADERS", "", "", "", "getCF_LOADERS$PyMCL_Android_core", "()Ljava/util/Map;", "isMr", "", "id", "isCf", "raw", "cfCdnUrls", "", "fileId", "", HintConstants.AUTOFILL_HINT_NAME, "projectId", "parseLink", "Lkotlin/Pair;", "Lcom/pymcl/core/mods/ResKind;", "url", "splitCfVersions", "list", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Map<String, Integer> getCF_LOADERS$PyMCL_Android_core() {
            return ModCatalog.CF_LOADERS;
        }

        public final boolean isCf(String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            return StringsKt.startsWith$default(id, "cf:", false, 2, (Object) null);
        }

        public final boolean isMr(String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            return StringsKt.startsWith$default(id, "mr:", false, 2, (Object) null);
        }

        public final String raw(String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            return StringsKt.substringAfter$default(id, ':', (String) null, 2, (Object) null);
        }

        public final List<String> cfCdnUrls(long fileId, String name, String projectId) throws UnsupportedEncodingException {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            String n = Http.INSTANCE.enc(name);
            long j = 1000;
            String p = (fileId / j) + "/" + (fileId % j) + "/" + n;
            return CollectionsKt.listOf((Object[]) new String[]{"https://edge.forgecdn.net/files/" + p, "https://mediafilez.forgecdn.net/files/" + p, "https://media.forgecdn.net/files/" + p, "https://www.curseforge.com/api/v1/mods/" + projectId + "/files/" + fileId + "/download"});
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00e7  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.Pair<java.lang.String, com.pymcl.core.mods.ResKind> parseLink(java.lang.String r8) {
            /*
                Method dump skipped, instructions count: 308
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.mods.ModCatalog.Companion.parseLink(java.lang.String):kotlin.Pair");
        }

        public final Pair<List<String>, List<String>> splitCfVersions(List<String> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            List<String> $this$partition$iv = list;
            ArrayList first$iv = new ArrayList();
            ArrayList second$iv = new ArrayList();
            Iterator it = $this$partition$iv.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object element$iv = it.next();
                Character chFirstOrNull = StringsKt.firstOrNull((String) element$iv);
                if (chFirstOrNull != null && Character.isDigit(chFirstOrNull.charValue())) {
                    first$iv.add(element$iv);
                } else {
                    second$iv.add(element$iv);
                }
            }
            Pair pair = new Pair(first$iv, second$iv);
            List v = (List) pair.component1();
            Iterable l = (List) pair.component2();
            Iterable $this$map$iv = l;
            Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
            for (Object item$iv$iv : $this$map$iv) {
                String lowerCase = ((String) item$iv$iv).toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                destination$iv$iv.add(lowerCase);
            }
            Iterable $this$filter$iv = (List) destination$iv$iv;
            Collection destination$iv$iv2 = new ArrayList();
            for (Object element$iv$iv : $this$filter$iv) {
                String it2 = (String) element$iv$iv;
                if (((ModCatalog.INSTANCE.getCF_LOADERS$PyMCL_Android_core().keySet().contains(it2) || Intrinsics.areEqual(it2, "liteloader")) ? 1 : null) != null) {
                    destination$iv$iv2.add(element$iv$iv);
                }
            }
            return TuplesKt.to(v, (List) destination$iv$iv2);
        }
    }

    public ModCatalog(Http http, Mirrors mirrors, Function0<String> cfKey) {
        Intrinsics.checkNotNullParameter(http, "http");
        Intrinsics.checkNotNullParameter(mirrors, "mirrors");
        Intrinsics.checkNotNullParameter(cfKey, "cfKey");
        this.http = http;
        this.mirrors = mirrors;
        this.cfKey = cfKey;
    }

    private final Map<String, String> mrHeaders() {
        return MapsKt.mapOf(TuplesKt.to("Accept", "application/json"), TuplesKt.to("User-Agent", "PyMCL/1.0.1"));
    }

    private final Map<String, String> cfHeaders() {
        Map $this$cfHeaders_u24lambda_u240 = MapsKt.createMapBuilder();
        $this$cfHeaders_u24lambda_u240.put("Accept", "application/json");
        $this$cfHeaders_u24lambda_u240.put("User-Agent", "PyMCL/1.0.1");
        String it = this.cfKey.invoke();
        if (!(it.length() > 0)) {
            it = null;
        }
        String it2 = it;
        if (it2 != null) {
            $this$cfHeaders_u24lambda_u240.put("x-api-key", it2);
        }
        return MapsKt.build($this$cfHeaders_u24lambda_u240);
    }

    public static /* synthetic */ Object getJson$PyMCL_Android_core$default(ModCatalog modCatalog, List list, String str, boolean z, String str2, String str3, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = "GET";
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            str3 = null;
        }
        return modCatalog.getJson$PyMCL_Android_core(list, str, z, str4, str3);
    }

    public final Object getJson$PyMCL_Android_core(List<String> bases, String path, boolean cf, String method, String body) throws Exception {
        Map mapCfHeaders;
        HttpResponse r;
        Intrinsics.checkNotNullParameter(bases, "bases");
        Intrinsics.checkNotNullParameter(path, "path");
        String method2 = method;
        Intrinsics.checkNotNullParameter(method2, "method");
        Exception last = null;
        for (String b : bases) {
            if (cf) {
                try {
                    mapCfHeaders = cfHeaders();
                } catch (Exception e) {
                    last = e;
                    method2 = method;
                }
            } else {
                mapCfHeaders = mrHeaders();
            }
            Map h = mapCfHeaders;
            if (body == null) {
                r = this.http.request(method2, b + path, h, null, AiClient.CONNECT_TIMEOUT);
            } else {
                Map<String, String> mapPlus = MapsKt.plus(h, TuplesKt.to("Content-Type", "application/json"));
                byte[] bytes = body.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                r = this.http.request(method, b + path, mapPlus, bytes, AiClient.CONNECT_TIMEOUT);
            }
            if (r.getOk()) {
                return Json.INSTANCE.parse(r.getText());
            }
            last = new HttpException(r.getCode(), b + path, r.getText());
            if (r.getCode() == 404) {
                break;
            }
            method2 = method;
        }
        if (last != null) {
            throw last;
        }
        throw new InstallError("没有可用的接口地址", null, 2, null);
    }

    public static /* synthetic */ List search$default(ModCatalog modCatalog, ResKind resKind, String str, String str2, String str3, String str4, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = "all";
        }
        String str5 = str2;
        String str6 = (i2 & 8) != 0 ? "" : str3;
        String str7 = (i2 & 16) != 0 ? "" : str4;
        if ((i2 & 32) != 0) {
            i = 30;
        }
        return modCatalog.search(resKind, str, str5, str6, str7, i);
    }

    public final List<ModHit> search(ResKind kind, String query, String source, String gameVersion, String category, int limit) throws Throwable {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(gameVersion, "gameVersion");
        Intrinsics.checkNotNullParameter(category, "category");
        String s = source.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(s, "toLowerCase(...)");
        boolean useMr = kind.getMrType() != null && (Intrinsics.areEqual(s, "all") || Intrinsics.areEqual(s, "全部") || Intrinsics.areEqual(s, "modrinth"));
        boolean useCf = Intrinsics.areEqual(s, "all") || Intrinsics.areEqual(s, "全部") || Intrinsics.areEqual(s, "curseforge");
        List errs = new ArrayList();
        List mr = new ArrayList();
        List cf = new ArrayList();
        if (useMr) {
            try {
                CollectionsKt.addAll(mr, searchModrinth(kind, query, gameVersion, category, limit));
            } catch (Exception e) {
                errs.add(e);
            }
        }
        if (useCf) {
            try {
                CollectionsKt.addAll(cf, searchCurseForge$default(this, kind, query, gameVersion, limit, null, 16, null));
            } catch (Exception e2) {
                errs.add(e2);
            }
        }
        if (mr.isEmpty() && cf.isEmpty() && !errs.isEmpty()) {
            throw ((Throwable) CollectionsKt.first(errs));
        }
        List out = new ArrayList();
        int n = Math.max(mr.size(), cf.size());
        for (int i = 0; i < n; i++) {
            ModHit it = (ModHit) CollectionsKt.getOrNull(mr, i);
            if (it != null) {
                out.add(it);
            }
            ModHit it2 = (ModHit) CollectionsKt.getOrNull(cf, i);
            if (it2 != null) {
                out.add(it2);
            }
        }
        return out;
    }

    public static /* synthetic */ List searchModrinth$default(ModCatalog modCatalog, ResKind resKind, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        if ((i2 & 8) != 0) {
            str3 = "";
        }
        if ((i2 & 16) != 0) {
            i = 30;
        }
        return modCatalog.searchModrinth(resKind, str, str2, str3, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.pymcl.core.mods.ModHit> searchModrinth(com.pymcl.core.mods.ResKind r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, int r43) {
        /*
            Method dump skipped, instructions count: 723
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.mods.ModCatalog.searchModrinth(com.pymcl.core.mods.ResKind, java.lang.String, java.lang.String, java.lang.String, int):java.util.List");
    }

    public static /* synthetic */ List searchCurseForge$default(ModCatalog modCatalog, ResKind resKind, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        if ((i2 & 8) != 0) {
            i = 30;
        }
        if ((i2 & 16) != 0) {
            str3 = "";
        }
        return modCatalog.searchCurseForge(resKind, str, str2, i, str3);
    }

    public final List<ModHit> searchCurseForge(ResKind kind, String query, String gameVersion, int limit, String slug) throws UnsupportedEncodingException {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(gameVersion, "gameVersion");
        Intrinsics.checkNotNullParameter(slug, "slug");
        String path = "/mods/search?gameId=432&classId=" + kind.getCfClass() + "&sortField=2&sortOrder=desc&pageSize=" + RangesKt.coerceAtMost(limit, 50) + "&index=0&searchFilter=" + Http.INSTANCE.enc(query);
        if (!StringsKt.isBlank(gameVersion)) {
            path = path + "&gameVersion=" + Http.INSTANCE.enc(gameVersion);
        }
        if (!StringsKt.isBlank(slug)) {
            path = path + "&slug=" + Http.INSTANCE.enc(slug);
        }
        Map o = JsonKt.o(getJson$PyMCL_Android_core$default(this, this.mirrors.curseforgeBases(), path, true, null, null, 24, null));
        Iterable $this$map$iv = JsonKt.objs(JsonKt.arr(o, "data"));
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            Map it = (Map) item$iv$iv;
            destination$iv$iv.add(cfHit$PyMCL_Android_core(it));
        }
        return (List) destination$iv$iv;
    }

    public final ModHit cfHit$PyMCL_Android_core(Map<String, Object> m) {
        Intrinsics.checkNotNullParameter(m, "m");
        Long lM8043long = JsonKt.m8043long(m, "id");
        String str = "cf:" + (lM8043long != null ? lM8043long.longValue() : 0L);
        String str2 = JsonKt.str(m, HintConstants.AUTOFILL_HINT_NAME);
        if (str2 == null) {
            str2 = "";
        }
        String str3 = JsonKt.str((Map) CollectionsKt.firstOrNull((List) JsonKt.objs(JsonKt.arr(m, "authors"))), HintConstants.AUTOFILL_HINT_NAME);
        if (str3 == null) {
            str3 = "";
        }
        Long lM8043long2 = JsonKt.m8043long(m, "downloadCount");
        long jLongValue = lM8043long2 != null ? lM8043long2.longValue() : 0L;
        String str4 = JsonKt.str(m, "summary");
        String str5 = str4 == null ? "" : str4;
        Iterable $this$mapNotNull$iv = JsonKt.objs(JsonKt.arr(m, "categories"));
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv$iv : $this$mapNotNull$iv) {
            Iterable $this$mapNotNull$iv2 = $this$mapNotNull$iv;
            Map it = (Map) element$iv$iv$iv;
            String str6 = JsonKt.str(it, HintConstants.AUTOFILL_HINT_NAME);
            if (str6 != null) {
                destination$iv$iv.add(str6);
            }
            $this$mapNotNull$iv = $this$mapNotNull$iv2;
        }
        List listTake = CollectionsKt.take((List) destination$iv$iv, 3);
        String str7 = JsonKt.str(JsonKt.obj(m, "logo"), "thumbnailUrl");
        String str8 = str7 == null ? "" : str7;
        String str9 = JsonKt.str(JsonKt.obj(m, "links"), "websiteUrl");
        String str10 = str9 == null ? "" : str9;
        String str11 = JsonKt.str(m, "slug");
        return new ModHit(str, str2, str3, jLongValue, str5, "CurseForge", listTake, str8, str10, str11 == null ? "" : str11);
    }

    public final ModHit resolveCfSlug(ResKind kind, String slug) {
        Object element$iv;
        Object objM8116constructorimpl;
        Object element$iv2;
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(slug, "slug");
        Iterable $this$firstOrNull$iv = searchCurseForge$default(this, kind, "", null, 5, slug, 4, null);
        Iterator it = $this$firstOrNull$iv.iterator();
        while (true) {
            if (!it.hasNext()) {
                element$iv = null;
                break;
            }
            element$iv = it.next();
            ModHit it2 = (ModHit) element$iv;
            if (Intrinsics.areEqual(it2.getSlug(), slug)) {
                break;
            }
        }
        ModHit modHit = (ModHit) element$iv;
        if (modHit != null) {
            return modHit;
        }
        Iterable $this$filter$iv = ResKind.getEntries();
        Collection destination$iv$iv = new ArrayList();
        for (ResKind resKind : $this$filter$iv) {
            ResKind it3 = resKind;
            if (it3 != kind) {
                destination$iv$iv.add(resKind);
            }
        }
        for (ResKind k : (List) destination$iv$iv) {
            try {
                Result.Companion companion = Result.INSTANCE;
                ModCatalog $this$resolveCfSlug_u24lambda_u242_u240 = this;
                Iterable $this$firstOrNull$iv2 = searchCurseForge$default($this$resolveCfSlug_u24lambda_u242_u240, k, "", null, 5, slug, 4, null);
                Iterator it4 = $this$firstOrNull$iv2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        element$iv2 = null;
                        break;
                    }
                    element$iv2 = it4.next();
                    ModHit it5 = (ModHit) element$iv2;
                    if (Intrinsics.areEqual(it5.getSlug(), slug)) {
                        break;
                    }
                }
                objM8116constructorimpl = Result.m8116constructorimpl((ModHit) element$iv2);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
                objM8116constructorimpl = null;
            }
            ModHit modHit2 = (ModHit) objM8116constructorimpl;
            if (modHit2 != null) {
                return modHit2;
            }
        }
        return null;
    }

    public final ModHit project(String id) {
        List listEmptyList;
        Intrinsics.checkNotNullParameter(id, "id");
        if (!INSTANCE.isMr(id)) {
            if (!INSTANCE.isCf(id)) {
                return null;
            }
            Map it = JsonKt.obj(JsonKt.o(getJson$PyMCL_Android_core$default(this, this.mirrors.curseforgeBases(), "/mods/" + INSTANCE.raw(id), true, null, null, 24, null)), "data");
            if (it != null) {
                return cfHit$PyMCL_Android_core(it);
            }
            return null;
        }
        Map p = JsonKt.o(getJson$PyMCL_Android_core$default(this, this.mirrors.modrinthBases(), "/project/" + INSTANCE.raw(id), false, null, null, 24, null));
        if (p == null) {
            return null;
        }
        int i = 0;
        String str = JsonKt.str(p, "id");
        if (str == null) {
            str = INSTANCE.raw(id);
        }
        String str2 = "mr:" + str;
        String str3 = JsonKt.str(p, "title");
        String str4 = str3 == null ? "" : str3;
        Long lM8043long = JsonKt.m8043long(p, "downloads");
        long jLongValue = lM8043long != null ? lM8043long.longValue() : 0L;
        String str5 = JsonKt.str(p, "description");
        String str6 = str5 == null ? "" : str5;
        Iterable iterableArr = JsonKt.arr(p, "categories");
        if (iterableArr != null) {
            Iterable $this$mapNotNull$iv = iterableArr;
            Collection destination$iv$iv = new ArrayList();
            for (Object element$iv$iv$iv : $this$mapNotNull$iv) {
                int i2 = i;
                String str7 = element$iv$iv$iv instanceof String ? (String) element$iv$iv$iv : null;
                if (str7 != null) {
                    destination$iv$iv.add(str7);
                }
                i = i2;
            }
            listEmptyList = (List) destination$iv$iv;
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        String str8 = JsonKt.str(p, "icon_url");
        String str9 = str8 == null ? "" : str8;
        String str10 = JsonKt.str(p, "project_type");
        if (str10 == null) {
            str10 = "mod";
        }
        String str11 = "https://modrinth.com/" + str10 + "/" + JsonKt.str(p, "slug");
        String str12 = JsonKt.str(p, "slug");
        return new ModHit(str2, str4, "", jLongValue, str6, "Modrinth", list, str9, str11, str12 == null ? "" : str12);
    }

    public static /* synthetic */ List files$default(ModCatalog modCatalog, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        return modCatalog.files(str, str2, str3);
    }

    public final List<ModFile> files(String id, String gameVersion, String loader) throws UnsupportedEncodingException {
        String str;
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(gameVersion, "gameVersion");
        Intrinsics.checkNotNullParameter(loader, "loader");
        if (!INSTANCE.isMr(id)) {
            if (!INSTANCE.isCf(id)) {
                return CollectionsKt.emptyList();
            }
            String str2 = "/mods/" + INSTANCE.raw(id) + "/files?pageSize=50";
            if (!StringsKt.isBlank(gameVersion)) {
                str2 = ((Object) str2) + "&gameVersion=" + Http.INSTANCE.enc(gameVersion);
            }
            Map<String, Integer> map = CF_LOADERS;
            String lowerCase = loader.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            Integer num = map.get(lowerCase);
            if (num != null) {
                int it = num.intValue();
                str = ((Object) str2) + "&modLoaderType=" + it;
            } else {
                str = str2;
            }
            Iterable $this$map$iv = JsonKt.objs(JsonKt.arr(JsonKt.o(getJson$PyMCL_Android_core$default(this, this.mirrors.curseforgeBases(), str, true, null, null, 24, null)), "data"));
            Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
            for (Object item$iv$iv : $this$map$iv) {
                Map it2 = (Map) item$iv$iv;
                destination$iv$iv.add(cfFile$PyMCL_Android_core(it2));
            }
            return (List) destination$iv$iv;
        }
        String path = "/project/" + INSTANCE.raw(id) + "/version";
        List q = new ArrayList();
        if (!StringsKt.isBlank(gameVersion)) {
            q.add("game_versions=" + Http.INSTANCE.enc("[\"" + gameVersion + "\"]"));
        }
        if (!StringsKt.isBlank(loader)) {
            Http.Companion companion = Http.INSTANCE;
            String lowerCase2 = loader.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            q.add("loaders=" + companion.enc("[\"" + lowerCase2 + "\"]"));
        }
        if (!q.isEmpty()) {
            path = path + "?" + CollectionsKt.joinToString$default(q, "&", null, null, 0, null, null, 62, null);
        }
        Iterable $this$mapNotNull$iv = JsonKt.objs(JsonKt.a(getJson$PyMCL_Android_core$default(this, this.mirrors.modrinthBases(), path, false, null, null, 24, null)));
        Collection destination$iv$iv2 = new ArrayList();
        for (Object element$iv$iv$iv : $this$mapNotNull$iv) {
            Iterable $this$mapNotNull$iv2 = $this$mapNotNull$iv;
            Map it3 = (Map) element$iv$iv$iv;
            ModFile modFileMrVersion$PyMCL_Android_core = mrVersion$PyMCL_Android_core(it3);
            if (modFileMrVersion$PyMCL_Android_core != null) {
                destination$iv$iv2.add(modFileMrVersion$PyMCL_Android_core);
            }
            $this$mapNotNull$iv = $this$mapNotNull$iv2;
        }
        return (List) destination$iv$iv2;
    }

    public final ModFile mrVersion$PyMCL_Android_core(Map<String, Object> v) {
        Object element$iv;
        List fs;
        String str;
        List listEmptyList;
        int $i$f$mapNotNull;
        String str2;
        Intrinsics.checkNotNullParameter(v, "v");
        List fs2 = JsonKt.objs(JsonKt.arr(v, "files"));
        List $this$firstOrNull$iv = fs2;
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
        Map f = (Map) element$iv;
        if (f == null && (f = (Map) CollectionsKt.firstOrNull(fs2)) == null) {
            return null;
        }
        String str3 = JsonKt.str(v, "id");
        String str4 = "";
        String str5 = str3 == null ? "" : str3;
        String str6 = JsonKt.str(v, "project_id");
        String str7 = str6 == null ? "" : str6;
        String str8 = JsonKt.str(f, "filename");
        String str9 = str8 == null ? "" : str8;
        String str10 = JsonKt.str(v, HintConstants.AUTOFILL_HINT_NAME);
        String str11 = (str10 == null && (str10 = JsonKt.str(v, "version_number")) == null) ? "" : str10;
        Iterable $this$mapNotNull$iv = JsonKt.arr(v, "game_versions");
        if ($this$mapNotNull$iv != null) {
            Collection destination$iv$iv = new ArrayList();
            for (Object element$iv$iv$iv : $this$mapNotNull$iv) {
                List fs3 = fs2;
                String str12 = element$iv$iv$iv instanceof String ? (String) element$iv$iv$iv : null;
                if (str12 != null) {
                    destination$iv$iv.add(str12);
                }
                fs2 = fs3;
            }
            fs = (List) destination$iv$iv;
        } else {
            fs = CollectionsKt.emptyList();
        }
        List list = fs;
        Iterable iterableArr = JsonKt.arr(v, "loaders");
        if (iterableArr != null) {
            Iterable $this$mapNotNull$iv2 = iterableArr;
            Collection destination$iv$iv2 = new ArrayList();
            for (Object element$iv$iv$iv2 : $this$mapNotNull$iv2) {
                Iterable $this$mapNotNull$iv3 = $this$mapNotNull$iv2;
                String str13 = str4;
                String str14 = element$iv$iv$iv2 instanceof String ? (String) element$iv$iv$iv2 : null;
                if (str14 != null) {
                    destination$iv$iv2.add(str14);
                }
                str4 = str13;
                $this$mapNotNull$iv2 = $this$mapNotNull$iv3;
            }
            str = str4;
            listEmptyList = (List) destination$iv$iv2;
        } else {
            str = "";
            listEmptyList = CollectionsKt.emptyList();
        }
        List list2 = listEmptyList;
        String str15 = JsonKt.str(v, "date_published");
        String strTake = StringsKt.take(str15 == null ? str : str15, 10);
        Long lM8043long = JsonKt.m8043long(f, "size");
        long jLongValue = lM8043long != null ? lM8043long.longValue() : 0L;
        List listListOfNotNull = CollectionsKt.listOfNotNull(JsonKt.str(f, "url"));
        String str16 = JsonKt.str(JsonKt.obj(f, "hashes"), "sha1");
        Iterable $this$filter$iv = JsonKt.objs(JsonKt.arr(v, "dependencies"));
        int $i$f$filter = 0;
        Collection destination$iv$iv3 = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            Iterable $this$filter$iv2 = $this$filter$iv;
            Map it3 = (Map) element$iv$iv;
            int $i$f$filter2 = $i$f$filter;
            if (Intrinsics.areEqual(JsonKt.str(it3, "dependency_type"), "required")) {
                destination$iv$iv3.add(element$iv$iv);
            }
            $this$filter$iv = $this$filter$iv2;
            $i$f$filter = $i$f$filter2;
        }
        Iterable<Map> $this$mapNotNull$iv4 = (List) destination$iv$iv3;
        int $i$f$mapNotNull2 = 0;
        Collection destination$iv$iv4 = new ArrayList();
        for (Map it4 : $this$mapNotNull$iv4) {
            Iterable $this$mapNotNull$iv5 = $this$mapNotNull$iv4;
            String p = JsonKt.str(it4, "project_id");
            if (p != null) {
                $i$f$mapNotNull = $i$f$mapNotNull2;
                str2 = "mr:" + p;
            } else {
                $i$f$mapNotNull = $i$f$mapNotNull2;
                str2 = null;
            }
            if (str2 != null) {
                destination$iv$iv4.add(str2);
            }
            $this$mapNotNull$iv4 = $this$mapNotNull$iv5;
            $i$f$mapNotNull2 = $i$f$mapNotNull;
        }
        return new ModFile(str5, str7, str9, str11, list, list2, strTake, jLongValue, listListOfNotNull, str16, (List) destination$iv$iv4);
    }

    public final ModFile cfFile$PyMCL_Android_core(Map<String, Object> f) {
        List<String> listEmptyList;
        Object element$iv;
        String str;
        int $i$f$mapNotNull;
        long fid;
        String str2;
        Intrinsics.checkNotNullParameter(f, "f");
        Long lM8043long = JsonKt.m8043long(f, "id");
        long fid2 = lM8043long != null ? lM8043long.longValue() : 0L;
        String str3 = "modId";
        Long lM8043long2 = JsonKt.m8043long(f, "modId");
        String pid = String.valueOf(lM8043long2 != null ? lM8043long2.longValue() : 0L);
        String str4 = JsonKt.str(f, "fileName");
        String name = str4 == null ? "" : str4;
        Companion companion = INSTANCE;
        Iterable $this$mapNotNull$iv = JsonKt.arr(f, "gameVersions");
        if ($this$mapNotNull$iv != null) {
            Collection destination$iv$iv = new ArrayList();
            for (Object element$iv$iv$iv : $this$mapNotNull$iv) {
                String str5 = element$iv$iv$iv instanceof String ? (String) element$iv$iv$iv : null;
                if (str5 != null) {
                    destination$iv$iv.add(str5);
                }
            }
            listEmptyList = (List) destination$iv$iv;
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        Pair<List<String>, List<String>> pairSplitCfVersions = companion.splitCfVersions(listEmptyList);
        List vers = pairSplitCfVersions.component1();
        List lds = pairSplitCfVersions.component2();
        List urls = CollectionsKt.distinct(CollectionsKt.plus((Collection) CollectionsKt.listOfNotNull(JsonKt.str(f, "downloadUrl")), (Iterable) INSTANCE.cfCdnUrls(fid2, name, pid)));
        String strValueOf = String.valueOf(fid2);
        String str6 = JsonKt.str(f, "displayName");
        String str7 = str6 == null ? name : str6;
        String str8 = JsonKt.str(f, "fileDate");
        String strTake = StringsKt.take(str8 != null ? str8 : "", 10);
        Long lM8043long3 = JsonKt.m8043long(f, "fileLength");
        long jLongValue = lM8043long3 != null ? lM8043long3.longValue() : 0L;
        Iterable $this$firstOrNull$iv = JsonKt.objs(JsonKt.arr(f, "hashes"));
        Iterator it = $this$firstOrNull$iv.iterator();
        while (true) {
            if (!it.hasNext()) {
                element$iv = null;
                break;
            }
            element$iv = it.next();
            Map it2 = (Map) element$iv;
            Iterable $this$firstOrNull$iv2 = $this$firstOrNull$iv;
            Integer numM8042int = JsonKt.m8042int(it2, "algo");
            if (numM8042int != null && numM8042int.intValue() == 1) {
                break;
            }
            $this$firstOrNull$iv = $this$firstOrNull$iv2;
        }
        String str9 = JsonKt.str((Map) element$iv, "value");
        Iterable $this$filter$iv = JsonKt.objs(JsonKt.arr(f, "dependencies"));
        Collection destination$iv$iv2 = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            Map it3 = (Map) element$iv$iv;
            String str10 = str9;
            Integer numM8042int2 = JsonKt.m8042int(it3, "relationType");
            if (numM8042int2 != null && numM8042int2.intValue() == 3) {
                destination$iv$iv2.add(element$iv$iv);
            }
            str9 = str10;
        }
        String str11 = str9;
        Iterable<Map> $this$mapNotNull$iv2 = (List) destination$iv$iv2;
        int $i$f$mapNotNull2 = 0;
        Collection destination$iv$iv3 = new ArrayList();
        for (Map it4 : $this$mapNotNull$iv2) {
            Iterable $this$mapNotNull$iv3 = $this$mapNotNull$iv2;
            Long lM8043long4 = JsonKt.m8043long(it4, str3);
            if (lM8043long4 != null) {
                str = str3;
                long m = lM8043long4.longValue();
                $i$f$mapNotNull = $i$f$mapNotNull2;
                fid = fid2;
                str2 = "cf:" + m;
            } else {
                str = str3;
                $i$f$mapNotNull = $i$f$mapNotNull2;
                fid = fid2;
                str2 = null;
            }
            if (str2 != null) {
                destination$iv$iv3.add(str2);
            }
            $this$mapNotNull$iv2 = $this$mapNotNull$iv3;
            str3 = str;
            $i$f$mapNotNull2 = $i$f$mapNotNull;
            fid2 = fid;
        }
        return new ModFile(strValueOf, pid, name, str7, vers, lds, strTake, jLongValue, urls, str11, (List) destination$iv$iv3);
    }

    public final ModFile file(String projectId, String fileId) throws InstallError {
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(fileId, "fileId");
        if (!INSTANCE.isMr(projectId)) {
            Map<String, Object> mapObj = JsonKt.obj(JsonKt.o(getJson$PyMCL_Android_core$default(this, this.mirrors.curseforgeBases(), "/mods/" + INSTANCE.raw(projectId) + "/files/" + fileId, true, null, null, 24, null)), "data");
            if (mapObj != null) {
                return cfFile$PyMCL_Android_core(mapObj);
            }
            throw new InstallError("文件不存在", null, 2, null);
        }
        Map<String, Object> mapO = JsonKt.o(getJson$PyMCL_Android_core$default(this, this.mirrors.modrinthBases(), "/version/" + fileId, false, null, null, 24, null));
        if (mapO == null) {
            throw new InstallError("版本不存在", null, 2, null);
        }
        ModFile modFileMrVersion$PyMCL_Android_core = mrVersion$PyMCL_Android_core(mapO);
        if (modFileMrVersion$PyMCL_Android_core != null) {
            return modFileMrVersion$PyMCL_Android_core;
        }
        throw new InstallError("该版本没有文件", null, 2, null);
    }

    public final List<ModFile> cfFiles(List<Long> fileIds) {
        Intrinsics.checkNotNullParameter(fileIds, "fileIds");
        if (fileIds.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        Iterable $this$map$iv = JsonKt.objs(JsonKt.arr(JsonKt.o(getJson$PyMCL_Android_core(this.mirrors.curseforgeBases(), "/mods/files", true, "POST", Json.stringify$default(Json.INSTANCE, JsonKt.jobj(TuplesKt.to("fileIds", fileIds)), false, 2, null))), "data"));
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            Map it = (Map) item$iv$iv;
            destination$iv$iv.add(cfFile$PyMCL_Android_core(it));
        }
        return (List) destination$iv$iv;
    }

    public final Map<String, Integer> cfClasses(List<Long> modIds) {
        Object objM8116constructorimpl;
        Intrinsics.checkNotNullParameter(modIds, "modIds");
        if (modIds.isEmpty()) {
            return MapsKt.emptyMap();
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            ModCatalog $this$cfClasses_u24lambda_u240 = this;
            Iterable $this$associate$iv = JsonKt.objs(JsonKt.arr(JsonKt.o($this$cfClasses_u24lambda_u240.getJson$PyMCL_Android_core($this$cfClasses_u24lambda_u240.mirrors.curseforgeBases(), "/mods", true, "POST", Json.stringify$default(Json.INSTANCE, JsonKt.jobj(TuplesKt.to("modIds", modIds)), false, 2, null))), "data"));
            int capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$associate$iv, 10)), 16);
            Map destination$iv$iv = new LinkedHashMap(capacity$iv);
            for (Object element$iv$iv : $this$associate$iv) {
                Map it = (Map) element$iv$iv;
                Long lM8043long = JsonKt.m8043long(it, "id");
                String strValueOf = String.valueOf(lM8043long != null ? lM8043long.longValue() : 0L);
                Integer numM8042int = JsonKt.m8042int(it, "classId");
                Pair pair = TuplesKt.to(strValueOf, Integer.valueOf(numM8042int != null ? numM8042int.intValue() : 6));
                destination$iv$iv.put(pair.getFirst(), pair.getSecond());
            }
            objM8116constructorimpl = Result.m8116constructorimpl(destination$iv$iv);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        Map mapEmptyMap = MapsKt.emptyMap();
        if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
            objM8116constructorimpl = mapEmptyMap;
        }
        return (Map) objM8116constructorimpl;
    }

    public final File targetDir(ResKind kind, File gameDir) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(gameDir, "gameDir");
        String dir = kind.getDir();
        if (dir.length() == 0) {
            dir = "mods";
        }
        return new File(gameDir, dir);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object install$default(ModCatalog modCatalog, ResKind resKind, ModFile modFile, File file, DownloadManager downloadManager, String str, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 16) != 0) {
            str = null;
        }
        if ((i & 32) != 0) {
            function1 = null;
        }
        return modCatalog.install(resKind, modFile, file, downloadManager, str, function1, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object install(com.pymcl.core.mods.ResKind r28, com.pymcl.core.mods.ModFile r29, java.io.File r30, com.pymcl.core.download.DownloadManager r31, java.lang.String r32, final kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r33, kotlin.coroutines.Continuation<? super java.io.File> r34) throws com.pymcl.core.loader.InstallError {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.mods.ModCatalog.install(com.pymcl.core.mods.ResKind, com.pymcl.core.mods.ModFile, java.io.File, com.pymcl.core.download.DownloadManager, java.lang.String, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit install$lambda$2(Function1 $onProgress, DownloadProgress p) {
        Intrinsics.checkNotNullParameter(p, "p");
        if ($onProgress != null) {
            $onProgress.invoke(Float.valueOf(p.getFraction()));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.File unzipWorld(java.io.File r26, java.io.File r27) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.mods.ModCatalog.unzipWorld(java.io.File, java.io.File):java.io.File");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unzipWorld$lambda$0$0(ZipEntry it) {
        String name = it.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return StringsKt.substringBefore$default(name, IOUtils.DIR_SEPARATOR_UNIX, (String) null, 2, (Object) null);
    }

    public final Map<String, ModFile> checkUpdates(List<? extends File> files, String gameVersion, String loader) {
        Map<String, Object> mapO;
        ModFile mf;
        Intrinsics.checkNotNullParameter(files, "files");
        Intrinsics.checkNotNullParameter(gameVersion, "gameVersion");
        Intrinsics.checkNotNullParameter(loader, "loader");
        if (files.isEmpty()) {
            return MapsKt.emptyMap();
        }
        List<? extends File> $this$associateBy$iv = files;
        int capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$associateBy$iv, 10)), 16);
        Map destination$iv$iv = new LinkedHashMap(capacity$iv);
        for (Object element$iv$iv : $this$associateBy$iv) {
            File it = (File) element$iv$iv;
            destination$iv$iv.put(FileUtil.hash$default(FileUtil.INSTANCE, it, null, 2, null), element$iv$iv);
            $this$associateBy$iv = $this$associateBy$iv;
        }
        Map body = JsonKt.jobj(TuplesKt.to("hashes", CollectionsKt.toList(destination$iv$iv.keySet())), TuplesKt.to("algorithm", "sha1"));
        if (!StringsKt.isBlank(gameVersion)) {
            body.put("game_versions", CollectionsKt.listOf(gameVersion));
        }
        if (!StringsKt.isBlank(loader)) {
            String lowerCase = loader.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            body.put("loaders", CollectionsKt.listOf(lowerCase));
        }
        Map o = JsonKt.o(getJson$PyMCL_Android_core(this.mirrors.modrinthBases(), "/version_files/update", false, "POST", Json.stringify$default(Json.INSTANCE, body, false, 2, null)));
        if (o == null) {
            return MapsKt.emptyMap();
        }
        LinkedHashMap out = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : o.entrySet()) {
            String sha = entry.getKey();
            Object v = entry.getValue();
            File f = (File) destination$iv$iv.get(sha);
            if (f != null && (mapO = JsonKt.o(v)) != null && (mf = mrVersion$PyMCL_Android_core(mapO)) != null && !Intrinsics.areEqual(mf.getSha1(), sha)) {
                out.put(f.getName(), mf);
            }
        }
        return out;
    }
}
