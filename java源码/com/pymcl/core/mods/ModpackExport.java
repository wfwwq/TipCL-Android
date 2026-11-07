package com.pymcl.core.mods;

import androidx.autofill.HintConstants;
import com.pymcl.core.loader.LoaderType;
import com.pymcl.core.util.JsonKt;
import java.io.File;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: ModTools.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u00012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0006Jp\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0002`\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\u001e\u0010\u0017\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0002`\u00110\t2\b\b\u0002\u0010\u0018\u001a\u00020\u0006J2\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00062\u0018\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\n0\u001eH\u0002J\u0098\u0001\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020$0#2\b\b\u0002\u0010\u0018\u001a\u00020\u00062\u001a\b\u0002\u0010%\u001a\u0014\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001a0&J6\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020$0#2\u0006\u0010)\u001a\u00020\u00062\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020+0#2\u0006\u0010,\u001a\u00020\rJ \u0010-\u001a\n /*\u0004\u0018\u00010.0.2\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020.H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/pymcl/core/mods/ModpackExport;", "", "<init>", "()V", "NEVER", "", "", "DEFAULT_ON", "candidates", "", "Lkotlin/Pair;", "", "gameDir", "Ljava/io/File;", "versionId", "index", "", "Lcom/pymcl/core/util/JObj;", HintConstants.AUTOFILL_HINT_NAME, "version", "mc", "loader", "Lcom/pymcl/core/loader/LoaderType;", "files", "summary", "walk", "", "root", "rel", "out", "", "export", "", "include", "remote", "", "Lcom/pymcl/core/mods/ModpackExport$Remote;", "onProgress", "Lkotlin/Function2;", "", "remoteFrom", "dirRel", "idents", "Lcom/pymcl/core/mods/ModIdent;", "dir", "sha", "", "kotlin.jvm.PlatformType", "algo", "b", "Remote", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ModpackExport {
    public static final ModpackExport INSTANCE = new ModpackExport();
    private static final Set<String> NEVER = SetsKt.setOf((Object[]) new String[]{"logs", "crash-reports", "versions", "libraries", "assets", "natives", ".fabric", ".mixin.out", ".pymcl_tmp", "usercache.json", "usernamecache.json", "launcher_profiles.json", "pymcl.json", ".pymcl_verified", "debug", ".cache", "downloads", "modrinth.index.json", "manifest.json"});
    private static final Set<String> DEFAULT_ON = SetsKt.setOf((Object[]) new String[]{"mods", "config", "defaultconfigs", "kubejs", "scripts", "resourcepacks", "shaderpacks", "options.txt", "optionsof.txt", "optionsshaders.txt", "servers.dat", "global_packs", "datapacks", "resources"});

    /* compiled from: ModTools.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/pymcl/core/mods/ModpackExport$Remote;", "", "url", "", "size", "", "<init>", "(Ljava/lang/String;J)V", "getUrl", "()Ljava/lang/String;", "getSize", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Remote {
        private final long size;
        private final String url;

        public static /* synthetic */ Remote copy$default(Remote remote, String str, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = remote.url;
            }
            if ((i & 2) != 0) {
                j = remote.size;
            }
            return remote.copy(str, j);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* renamed from: component2, reason: from getter */
        public final long getSize() {
            return this.size;
        }

        public final Remote copy(String url, long size) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new Remote(url, size);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Remote)) {
                return false;
            }
            Remote remote = (Remote) other;
            return Intrinsics.areEqual(this.url, remote.url) && this.size == remote.size;
        }

        public int hashCode() {
            return (this.url.hashCode() * 31) + Long.hashCode(this.size);
        }

        public String toString() {
            return "Remote(url=" + this.url + ", size=" + this.size + ")";
        }

        public Remote(String url, long size) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
            this.size = size;
        }

        public final long getSize() {
            return this.size;
        }

        public final String getUrl() {
            return this.url;
        }
    }

    private ModpackExport() {
    }

    public static /* synthetic */ List candidates$default(ModpackExport modpackExport, File file, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return modpackExport.candidates(file, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<kotlin.Pair<java.lang.String, java.lang.Boolean>> candidates(java.io.File r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.mods.ModpackExport.candidates(java.io.File, java.lang.String):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable candidates$lambda$1(File it) {
        return Boolean.valueOf(!it.isDirectory());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable candidates$lambda$2(File it) {
        String name = it.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        String lowerCase = name.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static /* synthetic */ Map index$default(ModpackExport modpackExport, String str, String str2, String str3, Pair pair, List list, String str4, int i, Object obj) {
        if ((i & 32) != 0) {
            str4 = "";
        }
        return modpackExport.index(str, str2, str3, pair, list, str4);
    }

    public final Map<String, Object> index(String name, String version, String mc, Pair<? extends LoaderType, String> loader, List<? extends Map<String, Object>> files, String summary) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(mc, "mc");
        Intrinsics.checkNotNullParameter(files, "files");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Map deps = JsonKt.jobj(TuplesKt.to("minecraft", mc));
        if (loader != null) {
            LoaderType t = loader.component1();
            String v = loader.component2();
            String it = LoaderDetect.INSTANCE.mrpackKey(t);
            if (it != null) {
                deps.put(it, v);
            }
        }
        Pair[] pairArr = new Pair[7];
        pairArr[0] = TuplesKt.to("formatVersion", 1L);
        pairArr[1] = TuplesKt.to("game", "minecraft");
        pairArr[2] = TuplesKt.to("versionId", version);
        pairArr[3] = TuplesKt.to(HintConstants.AUTOFILL_HINT_NAME, name);
        String str = summary;
        if (str.length() == 0) {
            str = null;
        }
        pairArr[4] = TuplesKt.to("summary", str);
        pairArr[5] = TuplesKt.to("files", CollectionsKt.toMutableList((Collection) files));
        pairArr[6] = TuplesKt.to("dependencies", deps);
        Map it2 = JsonKt.jobj(pairArr);
        if (summary.length() == 0) {
            it2.remove("summary");
        }
        return it2;
    }

    private final void walk(File root, String rel, List<Pair<String, File>> out) {
        File f = new File(root, rel);
        if (!f.isDirectory()) {
            if (f.isFile()) {
                String name = f.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (!StringsKt.startsWith$default(name, ".pymcl", false, 2, (Object) null)) {
                    out.add(TuplesKt.to(rel, f));
                    return;
                }
                return;
            }
            return;
        }
        Object[] $this$sortedBy$iv = f.listFiles();
        if ($this$sortedBy$iv == null) {
            $this$sortedBy$iv = new File[0];
        }
        Iterable $this$forEach$iv = ArraysKt.sortedWith($this$sortedBy$iv, new Comparator() { // from class: com.pymcl.core.mods.ModpackExport$walk$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                File it = (File) t;
                File it2 = (File) t2;
                return ComparisonsKt.compareValues(it.getName(), it2.getName());
            }
        });
        for (Object element$iv : $this$forEach$iv) {
            File it = (File) element$iv;
            INSTANCE.walk(root, rel + "/" + it.getName(), out);
        }
    }

    public static /* synthetic */ Pair export$default(ModpackExport modpackExport, File file, File file2, String str, String str2, String str3, Pair pair, List list, Map map, String str4, Function2 function2, int i, Object obj) {
        String str5;
        Function2 function22;
        if ((i & 256) == 0) {
            str5 = str4;
        } else {
            str5 = "";
        }
        if ((i & 512) == 0) {
            function22 = function2;
        } else {
            function22 = new Function2() { // from class: com.pymcl.core.mods.ModpackExport$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ModpackExport.export$lambda$0(((Float) obj2).floatValue(), (String) obj3);
                }
            };
        }
        return modpackExport.export(file, file2, str, str2, str3, pair, list, map, str5, function22);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit export$lambda$0(float f, String str) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0272  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> export(java.io.File r33, java.io.File r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, kotlin.Pair<? extends com.pymcl.core.loader.LoaderType, java.lang.String> r38, java.util.List<java.lang.String> r39, java.util.Map<java.lang.String, com.pymcl.core.mods.ModpackExport.Remote> r40, java.lang.String r41, kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.String, kotlin.Unit> r42) {
        /*
            Method dump skipped, instructions count: 895
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.mods.ModpackExport.export(java.io.File, java.io.File, java.lang.String, java.lang.String, java.lang.String, kotlin.Pair, java.util.List, java.util.Map, java.lang.String, kotlin.jvm.functions.Function2):kotlin.Pair");
    }

    public final Map<String, Remote> remoteFrom(String dirRel, Map<String, ModIdent> idents, File dir) {
        Iterable $this$filter$iv;
        String dirRel2 = dirRel;
        File dir2 = dir;
        Intrinsics.checkNotNullParameter(dirRel2, "dirRel");
        Intrinsics.checkNotNullParameter(idents, "idents");
        Intrinsics.checkNotNullParameter(dir2, "dir");
        Iterable $this$filter$iv2 = idents.values();
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv2) {
            ModIdent it = (ModIdent) element$iv$iv;
            boolean z = false;
            if (it.getMrUrl() != null) {
                $this$filter$iv = $this$filter$iv2;
                if (StringsKt.startsWith$default(it.getMrUrl(), "https://cdn.modrinth.com/", false, 2, (Object) null) && !StringsKt.endsWith$default(it.getFilename(), ".disabled", false, 2, (Object) null)) {
                    z = true;
                }
            } else {
                $this$filter$iv = $this$filter$iv2;
            }
            if (z) {
                destination$iv$iv.add(element$iv$iv);
            }
            $this$filter$iv2 = $this$filter$iv;
        }
        Iterable<ModIdent> $this$associate$iv = (List) destination$iv$iv;
        int capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$associate$iv, 10)), 16);
        Map destination$iv$iv2 = new LinkedHashMap(capacity$iv);
        for (ModIdent it2 : $this$associate$iv) {
            String str = dirRel2 + "/" + it2.getFilename();
            String mrUrl = it2.getMrUrl();
            Intrinsics.checkNotNull(mrUrl);
            Pair pair = TuplesKt.to(str, new Remote(mrUrl, new File(dir2, it2.getFilename()).length()));
            destination$iv$iv2.put(pair.getFirst(), pair.getSecond());
            dirRel2 = dirRel;
            dir2 = dir;
            $this$associate$iv = $this$associate$iv;
        }
        return destination$iv$iv2;
    }

    private final byte[] sha(String algo, byte[] b) {
        return MessageDigest.getInstance(algo).digest(b);
    }
}
