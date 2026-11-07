package com.pymcl.core.version;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.apache.commons.compress.java.util.jar.Pack200;
import org.apache.commons.lang3.StringUtils;

/* compiled from: VersionFilter.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\u001a6\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\b\b\u0002\u0010\t\u001a\u00020\n\u001a\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0000\u001a\u001c\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00122\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b\"\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"filterVersions", "", "Lcom/pymcl/core/version/ManifestEntry;", "manifest", "Lcom/pymcl/core/version/VersionManifest;", "query", "", "types", "", "limit", "", "NUMERIC", "Lkotlin/text/Regex;", "versionMatches", "", "id", "word", "normalizeVersionTypes", "", "PyMCL-Android:core"}, k = 2, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class VersionFilterKt {
    private static final Regex NUMERIC = new Regex("^\\d+(\\.\\d+)*$");

    public static /* synthetic */ List filterVersions$default(VersionManifest versionManifest, String str, Collection collection, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            collection = CollectionsKt.emptyList();
        }
        if ((i2 & 8) != 0) {
            i = Integer.MAX_VALUE;
        }
        return filterVersions(versionManifest, str, collection, i);
    }

    public static final List<ManifestEntry> filterVersions(VersionManifest manifest, String query, Collection<String> types, int limit) {
        boolean z;
        Intrinsics.checkNotNullParameter(manifest, "manifest");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(types, "types");
        Set t = normalizeVersionTypes(types);
        Iterable $this$filter$iv = manifest.getVersions();
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            ManifestEntry it = (ManifestEntry) element$iv$iv;
            if (t == null || t.contains(it.getType())) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        Iterable pool = (List) destination$iv$iv;
        String q = StringsKt.trim((CharSequence) query).toString();
        if (StringsKt.equals(q, Pack200.Packer.LATEST, true) || Intrinsics.areEqual(q, "最新")) {
            String[] strArr = new String[2];
            String latestRelease = manifest.getLatestRelease();
            if (!(t == null || t.contains("release"))) {
                latestRelease = null;
            }
            strArr[0] = latestRelease;
            String it2 = t != null && t.contains("snapshot") ? manifest.getLatestSnapshot() : null;
            strArr[1] = it2;
            List ids = CollectionsKt.listOfNotNull((Object[]) strArr);
            Iterable $this$filter$iv2 = pool;
            Collection destination$iv$iv2 = new ArrayList();
            for (Object element$iv$iv2 : $this$filter$iv2) {
                ManifestEntry it3 = (ManifestEntry) element$iv$iv2;
                if (ids.contains(it3.getId())) {
                    destination$iv$iv2.add(element$iv$iv2);
                }
            }
            Iterable $this$distinctBy$iv = (List) destination$iv$iv2;
            HashSet set$iv = new HashSet();
            ArrayList list$iv = new ArrayList();
            for (Object e$iv : $this$distinctBy$iv) {
                ManifestEntry it4 = (ManifestEntry) e$iv;
                if (set$iv.add(it4.getId())) {
                    list$iv.add(e$iv);
                }
            }
            return CollectionsKt.take(list$iv, limit);
        }
        if (q.length() == 0) {
            return CollectionsKt.take(pool, limit);
        }
        Iterable $this$filter$iv3 = new Regex("\\s+").split(q, 0);
        Collection destination$iv$iv3 = new ArrayList();
        for (Object element$iv$iv3 : $this$filter$iv3) {
            String it5 = (String) element$iv$iv3;
            if (it5.length() > 0) {
                destination$iv$iv3.add(element$iv$iv3);
            }
        }
        Iterable words = (List) destination$iv$iv3;
        Iterable $this$filter$iv4 = pool;
        Collection destination$iv$iv4 = new ArrayList();
        for (Object element$iv$iv4 : $this$filter$iv4) {
            ManifestEntry e = (ManifestEntry) element$iv$iv4;
            Iterable $this$all$iv = words;
            if (($this$all$iv instanceof Collection) && ((Collection) $this$all$iv).isEmpty()) {
                z = true;
            } else {
                Iterator it6 = $this$all$iv.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        z = true;
                        break;
                    }
                    Object element$iv = it6.next();
                    Iterator it7 = it6;
                    String it8 = (String) element$iv;
                    if (!versionMatches(e.getId(), it8)) {
                        z = false;
                        break;
                    }
                    it6 = it7;
                }
            }
            if (z) {
                destination$iv$iv4.add(element$iv$iv4);
            }
        }
        List hits = (List) destination$iv$iv4;
        List $this$filter$iv5 = hits;
        Collection destination$iv$iv5 = new ArrayList();
        for (Object element$iv$iv5 : $this$filter$iv5) {
            ManifestEntry it9 = (ManifestEntry) element$iv$iv5;
            List hits2 = hits;
            Iterable $this$filter$iv6 = $this$filter$iv5;
            if (StringsKt.equals(it9.getId(), q, true)) {
                destination$iv$iv5.add(element$iv$iv5);
            }
            hits = hits2;
            $this$filter$iv5 = $this$filter$iv6;
        }
        List hits3 = hits;
        ArrayList arrayList = (List) destination$iv$iv5;
        List $this$filterNot$iv = hits3;
        Collection destination$iv$iv6 = new ArrayList();
        for (Object element$iv$iv6 : $this$filterNot$iv) {
            ManifestEntry it10 = (ManifestEntry) element$iv$iv6;
            Iterable $this$filterNot$iv2 = $this$filterNot$iv;
            if (!StringsKt.equals(it10.getId(), q, true)) {
                destination$iv$iv6.add(element$iv$iv6);
            }
            $this$filterNot$iv = $this$filterNot$iv2;
        }
        return CollectionsKt.take(CollectionsKt.plus((Collection) arrayList, destination$iv$iv6), limit);
    }

    public static final boolean versionMatches(String id, String word) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(word, "word");
        if (NUMERIC.matches(word)) {
            return Intrinsics.areEqual(id, word) || StringsKt.startsWith$default(id, new StringBuilder().append(word).append(".").toString(), false, 2, (Object) null) || StringsKt.startsWith$default(id, new StringBuilder().append(word).append("-").toString(), false, 2, (Object) null) || StringsKt.startsWith$default(id, new StringBuilder().append(word).append(StringUtils.SPACE).toString(), false, 2, (Object) null) || StringsKt.startsWith$default(id, new StringBuilder().append(word).append("_").toString(), false, 2, (Object) null);
        }
        return StringsKt.contains((CharSequence) id, (CharSequence) word, true);
    }

    public static final Set<String> normalizeVersionTypes(Collection<String> types) {
        Intrinsics.checkNotNullParameter(types, "types");
        HashSet out = new HashSet();
        Iterator<String> it = types.iterator();
        while (true) {
            HashSet hashSet = null;
            if (!it.hasNext()) {
                HashSet hashSet2 = out;
                if (!hashSet2.isEmpty()) {
                    hashSet = hashSet2;
                }
                return hashSet;
            }
            String raw = it.next();
            String lowerCase = StringsKt.trim((CharSequence) raw).toString().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            switch (lowerCase.hashCode()) {
                case -1106578487:
                    if (lowerCase.equals("legacy")) {
                        out.add("old_beta");
                        out.add("old_alpha");
                    } else {
                        String lowerCase2 = StringsKt.trim((CharSequence) raw).toString().toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                        out.add(lowerCase2);
                    }
                case -551298740:
                    if (lowerCase.equals("releases")) {
                        out.add("release");
                    } else {
                        String lowerCase22 = StringsKt.trim((CharSequence) raw).toString().toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase22, "toLowerCase(...)");
                        out.add(lowerCase22);
                    }
                case 0:
                    if (lowerCase.equals("")) {
                        break;
                    }
                    String lowerCase222 = StringsKt.trim((CharSequence) raw).toString().toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase222, "toLowerCase(...)");
                    out.add(lowerCase222);
                case 42:
                    if (lowerCase.equals("*")) {
                        break;
                    }
                    String lowerCase2222 = StringsKt.trim((CharSequence) raw).toString().toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2222, "toLowerCase(...)");
                    out.add(lowerCase2222);
                case 96673:
                    if (lowerCase.equals("all")) {
                        break;
                    }
                    String lowerCase22222 = StringsKt.trim((CharSequence) raw).toString().toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase22222, "toLowerCase(...)");
                    out.add(lowerCase22222);
                case 110119:
                    if (lowerCase.equals("old")) {
                        out.add("old_beta");
                        out.add("old_alpha");
                    } else {
                        String lowerCase222222 = StringsKt.trim((CharSequence) raw).toString().toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase222222, "toLowerCase(...)");
                        out.add(lowerCase222222);
                    }
                case 790236:
                    if (lowerCase.equals("快照")) {
                        out.add("snapshot");
                    } else {
                        String lowerCase2222222 = StringsKt.trim((CharSequence) raw).toString().toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase2222222, "toLowerCase(...)");
                        out.add(lowerCase2222222);
                    }
                case 3020272:
                    if (lowerCase.equals("beta")) {
                        out.add("old_beta");
                    } else {
                        String lowerCase22222222 = StringsKt.trim((CharSequence) raw).toString().toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase22222222, "toLowerCase(...)");
                        out.add(lowerCase22222222);
                    }
                case 27202492:
                    if (lowerCase.equals("正式版")) {
                        out.add("release");
                    } else {
                        String lowerCase222222222 = StringsKt.trim((CharSequence) raw).toString().toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase222222222, "toLowerCase(...)");
                        out.add(lowerCase222222222);
                    }
                case 36086720:
                    if (lowerCase.equals("远古版")) {
                        out.add("old_beta");
                        out.add("old_alpha");
                    } else {
                        String lowerCase2222222222 = StringsKt.trim((CharSequence) raw).toString().toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase2222222222, "toLowerCase(...)");
                        out.add(lowerCase2222222222);
                    }
                case 92909918:
                    if (lowerCase.equals("alpha")) {
                        out.add("old_alpha");
                    } else {
                        String lowerCase22222222222 = StringsKt.trim((CharSequence) raw).toString().toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase22222222222, "toLowerCase(...)");
                        out.add(lowerCase22222222222);
                    }
                case 198238472:
                    if (lowerCase.equals("old_beta")) {
                        out.add("old_beta");
                    } else {
                        String lowerCase222222222222 = StringsKt.trim((CharSequence) raw).toString().toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase222222222222, "toLowerCase(...)");
                        out.add(lowerCase222222222222);
                    }
                case 241165103:
                    if (lowerCase.equals("snapshots")) {
                        out.add("snapshot");
                    } else {
                        String lowerCase2222222222222 = StringsKt.trim((CharSequence) raw).toString().toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase2222222222222, "toLowerCase(...)");
                        out.add(lowerCase2222222222222);
                    }
                case 284874180:
                    if (lowerCase.equals("snapshot")) {
                        out.add("snapshot");
                    } else {
                        String lowerCase22222222222222 = StringsKt.trim((CharSequence) raw).toString().toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase22222222222222, "toLowerCase(...)");
                        out.add(lowerCase22222222222222);
                    }
                case 1090594823:
                    if (lowerCase.equals("release")) {
                        out.add("release");
                    } else {
                        String lowerCase222222222222222 = StringsKt.trim((CharSequence) raw).toString().toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase222222222222222, "toLowerCase(...)");
                        out.add(lowerCase222222222222222);
                    }
                case 1849706822:
                    if (lowerCase.equals("old_alpha")) {
                        out.add("old_alpha");
                    } else {
                        String lowerCase2222222222222222 = StringsKt.trim((CharSequence) raw).toString().toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase2222222222222222, "toLowerCase(...)");
                        out.add(lowerCase2222222222222222);
                    }
                default:
                    String lowerCase22222222222222222 = StringsKt.trim((CharSequence) raw).toString().toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase22222222222222222, "toLowerCase(...)");
                    out.add(lowerCase22222222222222222);
            }
        }
        return null;
    }
}
