package com.pymcl.core.mods;

import androidx.autofill.HintConstants;
import com.pymcl.core.loader.LoaderType;
import com.pymcl.core.util.JsonKt;
import com.pymcl.core.version.ResolvedVersion;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ModTools.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tJ6\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\u0006J\u0010\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006¨\u0006\u0011"}, d2 = {"Lcom/pymcl/core/mods/LoaderDetect;", "", "<init>", "()V", "detect", "Lkotlin/Pair;", "Lcom/pymcl/core/loader/LoaderType;", "", SettingsProtocol.EXTRA_VALUE, "Lcom/pymcl/core/version/ResolvedVersion;", "libs", "", "versionId", "mc", "mrpackKey", "t", "catalogName", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LoaderDetect {
    public static final LoaderDetect INSTANCE = new LoaderDetect();

    /* compiled from: ModTools.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoaderType.values().length];
            try {
                iArr[LoaderType.FABRIC.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[LoaderType.QUILT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[LoaderType.FORGE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[LoaderType.NEOFORGE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private LoaderDetect() {
    }

    public final Pair<LoaderType, String> detect(ResolvedVersion v) {
        Intrinsics.checkNotNullParameter(v, "v");
        Iterable $this$mapNotNull$iv = JsonKt.objs(JsonKt.arr(v.getJson(), "libraries"));
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv$iv : $this$mapNotNull$iv) {
            Map it = (Map) element$iv$iv$iv;
            String str = JsonKt.str(it, HintConstants.AUTOFILL_HINT_NAME);
            if (str != null) {
                destination$iv$iv.add(str);
            }
        }
        return detect((List) destination$iv$iv, v.getId(), v.getMcVersion());
    }

    public static /* synthetic */ Pair detect$default(LoaderDetect loaderDetect, List list, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        return loaderDetect.detect(list, str, str2);
    }

    private static final String detect$ver(List<String> list, String prefix) {
        Object element$iv;
        List listSplit$default;
        List<String> $this$firstOrNull$iv = list;
        Iterator it = $this$firstOrNull$iv.iterator();
        while (true) {
            if (it.hasNext()) {
                element$iv = it.next();
                String it2 = (String) element$iv;
                if (StringsKt.startsWith$default(it2, prefix, false, 2, (Object) null)) {
                    break;
                }
            } else {
                element$iv = null;
                break;
            }
        }
        String str = (String) element$iv;
        if (str == null || (listSplit$default = StringsKt.split$default((CharSequence) str, new char[]{':'}, false, 0, 6, (Object) null)) == null) {
            return null;
        }
        return (String) CollectionsKt.getOrNull(listSplit$default, 2);
    }

    private static final String detect$stripMc(String $mc, String s) {
        String it = StringsKt.removePrefix(s, (CharSequence) ($mc + "-"));
        return $mc.length() > 0 ? StringsKt.removeSuffix(it, (CharSequence) ("-" + $mc)) : it;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<com.pymcl.core.loader.LoaderType, java.lang.String> detect(java.util.List<java.lang.String> r6, java.lang.String r7, java.lang.String r8) {
        /*
            r5 = this;
            java.lang.String r0 = "libs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "versionId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "mc"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "net.fabricmc:fabric-loader:"
            java.lang.String r0 = detect$ver(r6, r0)
            if (r0 == 0) goto L1f
            r1 = 0
            com.pymcl.core.loader.LoaderType r2 = com.pymcl.core.loader.LoaderType.FABRIC
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r0)
            return r2
        L1f:
            java.lang.String r0 = "org.quiltmc:quilt-loader:"
            java.lang.String r0 = detect$ver(r6, r0)
            if (r0 == 0) goto L2f
            r1 = 0
            com.pymcl.core.loader.LoaderType r2 = com.pymcl.core.loader.LoaderType.QUILT
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r0)
            return r2
        L2f:
            java.lang.String r0 = "net.neoforged:neoforge:"
            java.lang.String r0 = detect$ver(r6, r0)
            if (r0 == 0) goto L3f
            r1 = 0
            com.pymcl.core.loader.LoaderType r2 = com.pymcl.core.loader.LoaderType.NEOFORGE
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r0)
            return r2
        L3f:
            java.lang.String r0 = "net.neoforged:forge:"
            java.lang.String r0 = detect$ver(r6, r0)
            if (r0 == 0) goto L53
            r1 = 0
            com.pymcl.core.loader.LoaderType r2 = com.pymcl.core.loader.LoaderType.NEOFORGE
            java.lang.String r3 = detect$stripMc(r8, r0)
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r3)
            return r2
        L53:
            java.lang.String r0 = "net.minecraftforge:forge:"
            java.lang.String r0 = detect$ver(r6, r0)
            if (r0 != 0) goto L61
            java.lang.String r0 = "net.minecraftforge:fmlloader:"
            java.lang.String r0 = detect$ver(r6, r0)
        L61:
            if (r0 == 0) goto L6f
            r1 = 0
            com.pymcl.core.loader.LoaderType r2 = com.pymcl.core.loader.LoaderType.FORGE
            java.lang.String r3 = detect$stripMc(r8, r0)
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r3)
            return r2
        L6f:
            kotlin.text.Regex r0 = new kotlin.text.Regex
            java.lang.String r1 = "(?i)(neoforge|forge|fabric|quilt)[-_ ]?(?:loader)?[-_ ]?([0-9][\\w.\\-]*)"
            r0.<init>(r1)
            r1 = r7
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2 = 0
            r3 = 2
            r4 = 0
            kotlin.text.MatchResult r0 = kotlin.text.Regex.find$default(r0, r1, r2, r3, r4)
            if (r0 == 0) goto Ld9
            r1 = 0
            java.util.List r2 = r0.getGroupValues()
            r4 = 1
            java.lang.Object r2 = r2.get(r4)
            java.lang.String r2 = (java.lang.String) r2
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r4)
            java.lang.String r4 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            int r4 = r2.hashCode()
            switch(r4) {
                case -1282179931: goto Lb8;
                case 97618791: goto Lac;
                case 1154621647: goto La1;
                default: goto La0;
            }
        La0:
            goto Lc4
        La1:
            java.lang.String r4 = "neoforge"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto La0
            com.pymcl.core.loader.LoaderType r2 = com.pymcl.core.loader.LoaderType.NEOFORGE
            goto Lc6
        Lac:
            java.lang.String r4 = "forge"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto Lb5
            goto La0
        Lb5:
            com.pymcl.core.loader.LoaderType r2 = com.pymcl.core.loader.LoaderType.FORGE
            goto Lc6
        Lb8:
            java.lang.String r4 = "fabric"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto Lc1
            goto La0
        Lc1:
            com.pymcl.core.loader.LoaderType r2 = com.pymcl.core.loader.LoaderType.FABRIC
            goto Lc6
        Lc4:
            com.pymcl.core.loader.LoaderType r2 = com.pymcl.core.loader.LoaderType.QUILT
        Lc6:
            java.util.List r4 = r0.getGroupValues()
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = detect$stripMc(r8, r3)
            kotlin.Pair r3 = kotlin.TuplesKt.to(r2, r3)
            return r3
        Ld9:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.mods.LoaderDetect.detect(java.util.List, java.lang.String, java.lang.String):kotlin.Pair");
    }

    public final String mrpackKey(LoaderType t) {
        Intrinsics.checkNotNullParameter(t, "t");
        switch (WhenMappings.$EnumSwitchMapping$0[t.ordinal()]) {
            case 1:
                return "fabric-loader";
            case 2:
                return "quilt-loader";
            case 3:
                return "forge";
            case 4:
                return "neoforge";
            default:
                return null;
        }
    }

    public final String catalogName(LoaderType t) {
        switch (t == null ? -1 : WhenMappings.$EnumSwitchMapping$0[t.ordinal()]) {
            case 1:
                return "fabric";
            case 2:
                return "quilt";
            case 3:
                return "forge";
            case 4:
                return "neoforge";
            default:
                return "";
        }
    }
}
