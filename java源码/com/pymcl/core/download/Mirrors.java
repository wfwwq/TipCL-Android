package com.pymcl.core.download;

import com.pymcl.ai.AiSettings;
import com.pymcl.core.net.Http;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.DebugKt;

/* compiled from: Mirrors.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\u0018\u0000 #2\u00020\u0001:\u0001#B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\u0006J\u0006\u0010\u0015\u001a\u00020\u0006J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u000eJ\u0006\u0010\u0019\u001a\u00020\u000eJ\u0006\u0010\u001a\u001a\u00020\u000eJ\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001cJ\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u001c2\u0006\u0010\u001e\u001a\u00020\u0006J\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u001cJ\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u001cJ\"\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u001c2\u0006\u0010\u001e\u001a\u00020\u00062\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006$"}, d2 = {"Lcom/pymcl/core/download/Mirrors;", "", "http", "Lcom/pymcl/core/net/Http;", "downloadMode", "Lkotlin/Function0;", "", "communityMode", "clock", "", "<init>", "(Lcom/pymcl/core/net/Http;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "probeAt", "probeFast", "", "probeHook", "getProbeHook", "()Lkotlin/jvm/functions/Function0;", "setProbeHook", "(Lkotlin/jvm/functions/Function0;)V", "mode", "communityModeNorm", "invalidateProbe", "", "officialIsFast", "fileMirrorFirst", "communityMirrorFirst", "versionManifestUrls", "", "candidates", "url", "modrinthBases", "curseforgeBases", "github", "prefixes", "Companion", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Mirrors {
    public static final String BMCL = "https://bmclapi2.bangbang93.com";
    public static final String CURSEFORGE = "https://api.curseforge.com/v1";
    public static final String CURSEFORGE_MCIM = "https://mod.mcimirror.top/curseforge/v1";
    public static final String MODRINTH = "https://api.modrinth.com/v2";
    public static final String MODRINTH_MCIM = "https://mod.mcimirror.top/modrinth/v2";
    public static final long PROBE_LIMIT_MS = 4000;
    public static final long PROBE_TTL_MS = 600000;
    private final Function0<Long> clock;
    private final Function0<String> communityMode;
    private final Function0<String> downloadMode;
    private final Http http;
    private volatile long probeAt;
    private volatile boolean probeFast;
    private Function0<Boolean> probeHook;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final List<Pair<String, String>> FILE_MIRRORS = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("https://piston-meta.mojang.com/", "https://bmclapi2.bangbang93.com/"), TuplesKt.to("https://launchermeta.mojang.com/", "https://bmclapi2.bangbang93.com/"), TuplesKt.to("https://piston-data.mojang.com/", "https://bmclapi2.bangbang93.com/"), TuplesKt.to("https://resources.download.minecraft.net/", "https://bmclapi2.bangbang93.com/assets/"), TuplesKt.to("https://libraries.minecraft.net/", "https://bmclapi2.bangbang93.com/maven/"), TuplesKt.to("https://maven.minecraftforge.net/", "https://bmclapi2.bangbang93.com/maven/"), TuplesKt.to("https://files.minecraftforge.net/maven/", "https://bmclapi2.bangbang93.com/maven/"), TuplesKt.to("https://maven.neoforged.net/releases/", "https://bmclapi2.bangbang93.com/maven/"), TuplesKt.to("https://maven.fabricmc.net/", "https://bmclapi2.bangbang93.com/maven/"), TuplesKt.to("https://maven.quiltmc.org/repository/release/", "https://bmclapi2.bangbang93.com/maven/"), TuplesKt.to("https://maven.quiltmc.org/", "https://bmclapi2.bangbang93.com/maven/"), TuplesKt.to("https://meta.fabricmc.net/", "https://bmclapi2.bangbang93.com/fabric-meta/"), TuplesKt.to("https://meta.quiltmc.org/", "https://bmclapi2.bangbang93.com/quilt-meta/")});
    public static final String PROBE_URL = "https://piston-meta.mojang.com/mc/game/version_manifest_v2.json";
    private static final List<String> MANIFEST_OFFICIAL = CollectionsKt.listOf((Object[]) new String[]{PROBE_URL, "https://launchermeta.mojang.com/mc/game/version_manifest_v2.json"});
    private static final List<String> MANIFEST_MIRROR = CollectionsKt.listOf("https://bmclapi2.bangbang93.com/mc/game/version_manifest_v2.json");

    public Mirrors(Http http, Function0<String> downloadMode, Function0<String> communityMode, Function0<Long> clock) {
        Intrinsics.checkNotNullParameter(http, "http");
        Intrinsics.checkNotNullParameter(downloadMode, "downloadMode");
        Intrinsics.checkNotNullParameter(communityMode, "communityMode");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.http = http;
        this.downloadMode = downloadMode;
        this.communityMode = communityMode;
        this.clock = clock;
        this.probeAt = -1L;
        this.probeFast = true;
    }

    public /* synthetic */ Mirrors(Http http, Function0 function0, Function0 function02, AnonymousClass3 anonymousClass3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(http, (i & 2) != 0 ? new Function0() { // from class: com.pymcl.core.download.Mirrors$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
            }
        } : function0, (i & 4) != 0 ? new Function0() { // from class: com.pymcl.core.download.Mirrors$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
            }
        } : function02, (i & 8) != 0 ? AnonymousClass3.INSTANCE : anonymousClass3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Mirrors.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.pymcl.core.download.Mirrors$3, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function0<Long> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        AnonymousClass3() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    /* compiled from: Mirrors.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0018\u001a\u00020\u0005J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0018\u001a\u00020\u0005J8\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/pymcl/core/download/Mirrors$Companion;", "", "<init>", "()V", "BMCL", "", "PROBE_URL", "PROBE_LIMIT_MS", "", "PROBE_TTL_MS", "FILE_MIRRORS", "", "Lkotlin/Pair;", "getFILE_MIRRORS", "()Ljava/util/List;", "MANIFEST_OFFICIAL", "getMANIFEST_OFFICIAL", "MANIFEST_MIRROR", "getMANIFEST_MIRROR", "MODRINTH", "MODRINTH_MCIM", "CURSEFORGE", "CURSEFORGE_MCIM", "rewriteToBmcl", "url", "rewriteToMcim", "order", "primary", "secondary", "secondaryFirst", "", "exclusive", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Pair<String, String>> getFILE_MIRRORS() {
            return Mirrors.FILE_MIRRORS;
        }

        public final List<String> getMANIFEST_OFFICIAL() {
            return Mirrors.MANIFEST_OFFICIAL;
        }

        public final List<String> getMANIFEST_MIRROR() {
            return Mirrors.MANIFEST_MIRROR;
        }

        public final String rewriteToBmcl(String url) {
            Object element$iv;
            Intrinsics.checkNotNullParameter(url, "url");
            Iterable $this$firstOrNull$iv = getFILE_MIRRORS();
            Iterator it = $this$firstOrNull$iv.iterator();
            while (true) {
                if (!it.hasNext()) {
                    element$iv = null;
                    break;
                }
                element$iv = it.next();
                if (StringsKt.startsWith$default(url, (String) ((Pair) element$iv).getFirst(), false, 2, (Object) null)) {
                    break;
                }
            }
            Pair it2 = (Pair) element$iv;
            if (it2 == null) {
                return null;
            }
            Object second = it2.getSecond();
            String strSubstring = url.substring(((String) it2.getFirst()).length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return second + strSubstring;
        }

        public final String rewriteToMcim(String url) {
            Object element$iv;
            Intrinsics.checkNotNullParameter(url, "url");
            if (StringsKt.contains$default((CharSequence) url, (CharSequence) "api.modrinth.com", false, 2, (Object) null)) {
                return StringsKt.replace$default(url, "https://api.modrinth.com", "https://mod.mcimirror.top/modrinth", false, 4, (Object) null);
            }
            if (StringsKt.contains$default((CharSequence) url, (CharSequence) "https://cdn.modrinth.com", false, 2, (Object) null)) {
                return StringsKt.replace$default(url, "https://cdn.modrinth.com", "https://mod.mcimirror.top", false, 4, (Object) null);
            }
            if (StringsKt.startsWith$default(url, "https://api.curseforge.com", false, 2, (Object) null)) {
                return StringsKt.replace$default(url, "https://api.curseforge.com", "https://mod.mcimirror.top/curseforge", false, 4, (Object) null);
            }
            Iterable $this$firstOrNull$iv = CollectionsKt.listOf((Object[]) new String[]{"https://edge.forgecdn.net", "https://mediafilez.forgecdn.net"});
            Iterator it = $this$firstOrNull$iv.iterator();
            while (true) {
                if (!it.hasNext()) {
                    element$iv = null;
                    break;
                }
                element$iv = it.next();
                if (StringsKt.startsWith$default(url, (String) element$iv, false, 2, (Object) null)) {
                    break;
                }
            }
            String it2 = (String) element$iv;
            if (it2 == null) {
                return null;
            }
            String strSubstring = url.substring(it2.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return "https://mod.mcimirror.top" + strSubstring;
        }

        public final List<String> order(List<String> primary, List<String> secondary, boolean secondaryFirst, String exclusive) {
            List<String> list;
            List<String> list2;
            List l;
            Intrinsics.checkNotNullParameter(primary, "primary");
            Intrinsics.checkNotNullParameter(secondary, "secondary");
            Intrinsics.checkNotNullParameter(exclusive, "exclusive");
            if (Intrinsics.areEqual(exclusive, "official")) {
                l = primary;
            } else {
                if (Intrinsics.areEqual(exclusive, "bmclapi") || Intrinsics.areEqual(exclusive, "mcim") || secondaryFirst) {
                    list = secondary;
                    list2 = primary;
                } else {
                    list = primary;
                    list2 = secondary;
                }
                l = CollectionsKt.plus((Collection) list, (Iterable) list2);
            }
            List $this$filter$iv = l;
            Collection destination$iv$iv = new ArrayList();
            for (Object element$iv$iv : $this$filter$iv) {
                String it = (String) element$iv$iv;
                if (it.length() > 0) {
                    destination$iv$iv.add(element$iv$iv);
                }
            }
            return CollectionsKt.distinct((List) destination$iv$iv);
        }
    }

    public final Function0<Boolean> getProbeHook() {
        return this.probeHook;
    }

    public final void setProbeHook(Function0<Boolean> function0) {
        this.probeHook = function0;
    }

    public final String mode() {
        String it = StringsKt.trim((CharSequence) this.downloadMode.invoke()).toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(it, "toLowerCase(...)");
        return SetsKt.setOf((Object[]) new String[]{DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "official", "bmclapi"}).contains(it) ? it : DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
    }

    public final String communityModeNorm() {
        String it = StringsKt.trim((CharSequence) this.communityMode.invoke()).toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(it, "toLowerCase(...)");
        return SetsKt.setOf((Object[]) new String[]{DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "official", "mcim"}).contains(it) ? it : DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
    }

    public final void invalidateProbe() {
        this.probeAt = -1L;
    }

    public final synchronized boolean officialIsFast() {
        Object objM8116constructorimpl;
        Function0 it = this.probeHook;
        if (it != null) {
            return it.invoke().booleanValue();
        }
        long now = this.clock.invoke().longValue();
        if (this.probeAt >= 0 && now - this.probeAt < PROBE_TTL_MS) {
            return this.probeFast;
        }
        long t0 = System.nanoTime();
        boolean z = true;
        try {
            Result.Companion companion = Result.INSTANCE;
            Mirrors $this$officialIsFast_u24lambda_u241 = this;
            objM8116constructorimpl = Result.m8116constructorimpl(Boolean.valueOf(Http.request$default($this$officialIsFast_u24lambda_u241.http, "HEAD", PROBE_URL, null, null, AiSettings.MIN_CONTEXT, 12, null).getCode() < 400));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
            objM8116constructorimpl = false;
        }
        if (!((Boolean) objM8116constructorimpl).booleanValue() || (System.nanoTime() - t0) / 1000000 >= PROBE_LIMIT_MS) {
            z = false;
        }
        this.probeFast = z;
        this.probeAt = now;
        return this.probeFast;
    }

    public final boolean fileMirrorFirst() {
        String strMode = mode();
        if (Intrinsics.areEqual(strMode, "bmclapi")) {
            return true;
        }
        return (Intrinsics.areEqual(strMode, "official") || officialIsFast()) ? false : true;
    }

    public final boolean communityMirrorFirst() {
        return !Intrinsics.areEqual(communityModeNorm(), "official");
    }

    public final List<String> versionManifestUrls() {
        return INSTANCE.order(MANIFEST_OFFICIAL, MANIFEST_MIRROR, fileMirrorFirst(), mode());
    }

    public final List<String> candidates(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String it = INSTANCE.rewriteToBmcl(url);
        if (it != null) {
            return INSTANCE.order(CollectionsKt.listOf(url), CollectionsKt.listOf(it), fileMirrorFirst(), mode());
        }
        String it2 = INSTANCE.rewriteToMcim(url);
        if (it2 != null) {
            return INSTANCE.order(CollectionsKt.listOf(url), CollectionsKt.listOf(it2), communityMirrorFirst(), Intrinsics.areEqual(communityModeNorm(), "official") ? "official" : "");
        }
        return CollectionsKt.listOf(url);
    }

    public final List<String> modrinthBases() {
        return INSTANCE.order(CollectionsKt.listOf(MODRINTH), CollectionsKt.listOf(MODRINTH_MCIM), communityMirrorFirst(), communityModeNorm());
    }

    public final List<String> curseforgeBases() {
        return INSTANCE.order(CollectionsKt.listOf(CURSEFORGE), CollectionsKt.listOf(CURSEFORGE_MCIM), communityMirrorFirst(), communityModeNorm());
    }

    public final List<String> github(String url, List<String> prefixes) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(prefixes, "prefixes");
        if (!StringsKt.contains$default((CharSequence) url, (CharSequence) "github.com", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) url, (CharSequence) "githubusercontent.com", false, 2, (Object) null)) {
            return CollectionsKt.listOf(url);
        }
        List<String> $this$map$iv = prefixes;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            String it = (String) item$iv$iv;
            destination$iv$iv.add(it + url);
        }
        return CollectionsKt.plus((Collection<? extends String>) destination$iv$iv, url);
    }
}
