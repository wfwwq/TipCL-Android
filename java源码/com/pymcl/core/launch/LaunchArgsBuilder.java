package com.pymcl.core.launch;

import com.pymcl.core.account.AccountType;
import com.pymcl.core.loader.LoadersKt;
import com.pymcl.core.util.JsonKt;
import com.pymcl.core.version.RuleEnv;
import com.pymcl.core.version.Rules;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* compiled from: LaunchArgs.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/pymcl/core/launch/LaunchArgsBuilder;", "", "<init>", "()V", "LAUNCHER_NAME", "", "LAUNCHER_VERSION", "build", "Lcom/pymcl/core/launch/LaunchSpec;", SettingsProtocol.EXTRA_VALUE, "Lcom/pymcl/core/version/ResolvedVersion;", "o", "Lcom/pymcl/core/launch/LaunchOptions;", "compareMcSimple", "", "a", "b", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LaunchArgsBuilder {
    public static final LaunchArgsBuilder INSTANCE = new LaunchArgsBuilder();
    public static final String LAUNCHER_NAME = "PyMCL";
    public static final String LAUNCHER_VERSION = "1.0.1";

    /* compiled from: LaunchArgs.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountType.values().length];
            try {
                iArr[AccountType.AUTHLIB.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[AccountType.NIDE8.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[AccountType.OFFLINE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private LaunchArgsBuilder() {
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x05b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.pymcl.core.launch.LaunchSpec build(com.pymcl.core.version.ResolvedVersion r47, com.pymcl.core.launch.LaunchOptions r48) {
        /*
            Method dump skipped, instructions count: 2582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.launch.LaunchArgsBuilder.build(com.pymcl.core.version.ResolvedVersion, com.pymcl.core.launch.LaunchOptions):com.pymcl.core.launch.LaunchSpec");
    }

    private static final String build$sub(final Map<String, String> map, String s) {
        return new Regex("[$][{]([a-zA-Z_]+)[}]").replace(s, new Function1() { // from class: com.pymcl.core.launch.LaunchArgsBuilder$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LaunchArgsBuilder.build$sub$lambda$5(map, (MatchResult) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence build$sub$lambda$5(Map $vars, MatchResult m) {
        String it;
        Intrinsics.checkNotNullParameter(m, "m");
        String it2 = (String) $vars.get(m.getGroupValues().get(1));
        if (it2 == null || (it = Regex.INSTANCE.escapeReplacement(it2)) == null) {
            it = m.getValue();
        }
        return it;
    }

    private static final List<String> build$expand(RuleEnv env, List<Object> list) {
        Iterable $this$flatMap$iv;
        int $i$f$flatMap;
        Iterable vv;
        Iterable $this$flatMap$iv2;
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        List<Object> $this$flatMap$iv3 = list;
        int $i$f$flatMap2 = 0;
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$flatMap$iv3) {
            if (element$iv$iv instanceof String) {
                vv = CollectionsKt.listOf(element$iv$iv);
                $this$flatMap$iv = $this$flatMap$iv3;
                $i$f$flatMap = $i$f$flatMap2;
            } else if (!(element$iv$iv instanceof Map)) {
                $this$flatMap$iv = $this$flatMap$iv3;
                $i$f$flatMap = $i$f$flatMap2;
                vv = CollectionsKt.emptyList();
            } else if (Rules.INSTANCE.allowed(JsonKt.arr(JsonKt.o(element$iv$iv), "rules"), env)) {
                Object vv2 = ((Map) element$iv$iv).get("value");
                if (vv2 instanceof String) {
                    $this$flatMap$iv = $this$flatMap$iv3;
                    $i$f$flatMap = $i$f$flatMap2;
                    vv = CollectionsKt.listOf(vv2);
                } else {
                    Iterable iterableA = JsonKt.a(vv2);
                    if (iterableA != null) {
                        Iterable $this$mapNotNull$iv = iterableA;
                        Collection destination$iv$iv2 = new ArrayList();
                        for (Object element$iv$iv$iv : $this$mapNotNull$iv) {
                            Iterable $this$flatMap$iv4 = $this$flatMap$iv3;
                            int $i$f$flatMap3 = $i$f$flatMap2;
                            String str = element$iv$iv$iv instanceof String ? (String) element$iv$iv$iv : null;
                            if (str != null) {
                                destination$iv$iv2.add(str);
                            }
                            $i$f$flatMap2 = $i$f$flatMap3;
                            $this$flatMap$iv3 = $this$flatMap$iv4;
                        }
                        $this$flatMap$iv = $this$flatMap$iv3;
                        $i$f$flatMap = $i$f$flatMap2;
                        $this$flatMap$iv2 = (List) destination$iv$iv2;
                    } else {
                        $this$flatMap$iv = $this$flatMap$iv3;
                        $i$f$flatMap = $i$f$flatMap2;
                        $this$flatMap$iv2 = CollectionsKt.emptyList();
                    }
                    vv = $this$flatMap$iv2;
                }
            } else {
                $this$flatMap$iv = $this$flatMap$iv3;
                $i$f$flatMap = $i$f$flatMap2;
                vv = CollectionsKt.emptyList();
            }
            Iterable list$iv$iv = vv;
            CollectionsKt.addAll(destination$iv$iv, list$iv$iv);
            $i$f$flatMap2 = $i$f$flatMap;
            $this$flatMap$iv3 = $this$flatMap$iv;
        }
        return (List) destination$iv$iv;
    }

    private final int compareMcSimple(String a, String b) {
        return LoadersKt.compareMc(a, b);
    }
}
