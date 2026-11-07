package com.pymcl.android.ui.state;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: CatalogRules.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u0005J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rJ$\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012J\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012Ê\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0016"}, d2 = {"Lcom/pymcl/android/ui/state/CatalogRules;", "", "<init>", "()V", "safeImportName", "", "raw", "fallback", "applyFavorite", "", "favs", "id", "nowFavorite", "", "modUpdateKey", "instance", "version", "files", "", "nonJars", "", "names", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class CatalogRules {
    public static final int $stable = 0;
    public static final CatalogRules INSTANCE = new CatalogRules();

    private CatalogRules() {
    }

    public final String safeImportName(String raw, String fallback) {
        Intrinsics.checkNotNullParameter(fallback, "fallback");
        String s = StringsKt.trim((CharSequence) new Regex("[\\\\/\\u0000-\\u001f]").replace(raw == null ? "" : raw, "_")).toString();
        if (!(s.length() == 0)) {
            if (!(StringsKt.trim(s, '.').length() == 0)) {
                return StringsKt.take(s, 180);
            }
        }
        return fallback;
    }

    public final Set<String> applyFavorite(Set<String> favs, String id, boolean nowFavorite) {
        Intrinsics.checkNotNullParameter(favs, "favs");
        Intrinsics.checkNotNullParameter(id, "id");
        return nowFavorite ? SetsKt.plus(favs, id) : SetsKt.minus(favs, id);
    }

    public final String modUpdateKey(String instance, String version, Collection<String> files) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(files, "files");
        return "modupd|" + instance + "|" + version + "|" + CollectionsKt.joinToString$default(CollectionsKt.sorted(files), "|", null, null, 0, null, null, 62, null);
    }

    public final List<String> nonJars(Collection<String> names) {
        Intrinsics.checkNotNullParameter(names, "names");
        Collection arrayList = new ArrayList();
        for (Object obj : names) {
            if (!StringsKt.endsWith((String) obj, ".jar", true)) {
                arrayList.add(obj);
            }
        }
        return (List) arrayList;
    }
}
