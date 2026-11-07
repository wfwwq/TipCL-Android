package com.pymcl.core.loader;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Loaders.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"OPTIFINE_MOD_SUFFIX", "", "LITELOADER_TWEAKER", "LITELOADER_VERSIONS", "LAUNCHWRAPPER", "compareMc", "", "a", "b", "PyMCL-Android:core"}, k = 2, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LoadersKt {
    public static final String LAUNCHWRAPPER = "net.minecraft:launchwrapper:1.12";
    public static final String LITELOADER_TWEAKER = "com.mumfrey.liteloader.launch.LiteLoaderTweaker";
    public static final String LITELOADER_VERSIONS = "http://dl.liteloader.com/versions/versions.json";
    public static final String OPTIFINE_MOD_SUFFIX = "（Forge 模组）";

    public static final int compareMc(String a, String b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        Iterable $this$map$iv = StringsKt.split$default((CharSequence) a, new char[]{'.', '-'}, false, 0, 6, (Object) null);
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        Iterator it = $this$map$iv.iterator();
        while (true) {
            int iIntValue = 0;
            if (!it.hasNext()) {
                break;
            }
            Object item$iv$iv = it.next();
            String it2 = (String) item$iv$iv;
            Integer intOrNull = StringsKt.toIntOrNull(it2);
            if (intOrNull != null) {
                iIntValue = intOrNull.intValue();
            }
            destination$iv$iv.add(Integer.valueOf(iIntValue));
        }
        List x = (List) destination$iv$iv;
        Iterable $this$map$iv2 = StringsKt.split$default((CharSequence) b, new char[]{'.', '-'}, false, 0, 6, (Object) null);
        Collection destination$iv$iv2 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv2, 10));
        for (Object item$iv$iv2 : $this$map$iv2) {
            String it3 = (String) item$iv$iv2;
            Integer intOrNull2 = StringsKt.toIntOrNull(it3);
            destination$iv$iv2.add(Integer.valueOf(intOrNull2 != null ? intOrNull2.intValue() : 0));
        }
        List y = (List) destination$iv$iv2;
        int i = 0;
        int iMax = Math.max(x.size(), y.size());
        while (i < iMax) {
            int c = Intrinsics.compare(((Number) (i >= 0 && i < x.size() ? x.get(i) : 0)).intValue(), ((Number) (i >= 0 && i < y.size() ? y.get(i) : 0)).intValue());
            if (c != 0) {
                return c;
            }
            i++;
        }
        return 0;
    }
}
