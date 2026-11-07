package com.pymcl.core.java;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: JavaRequirement.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/pymcl/core/java/JavaRequirement;", "", "<init>", "()V", "BUNDLED", "", "", "getBUNDLED", "()Ljava/util/Set;", "SUPPORTED", "", "getSUPPORTED", "()Ljava/util/List;", "requiredMajor", "mcVersion", "", "declared", "(Ljava/lang/String;Ljava/lang/Integer;)I", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class JavaRequirement {
    public static final JavaRequirement INSTANCE = new JavaRequirement();
    private static final Set<Integer> BUNDLED = SetsKt.setOf((Object[]) new Integer[]{17, 21});
    private static final List<Integer> SUPPORTED = CollectionsKt.listOf((Object[]) new Integer[]{8, 17, 21, 25});

    private JavaRequirement() {
    }

    public final Set<Integer> getBUNDLED() {
        return BUNDLED;
    }

    public final List<Integer> getSUPPORTED() {
        return SUPPORTED;
    }

    public static /* synthetic */ int requiredMajor$default(JavaRequirement javaRequirement, String str, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return javaRequirement.requiredMajor(str, num);
    }

    public final int requiredMajor(String mcVersion, Integer declared) {
        Integer intOrNull;
        Integer intOrNull2;
        Intrinsics.checkNotNullParameter(mcVersion, "mcVersion");
        Object obj = null;
        if (declared == null) {
            List parts = StringsKt.split$default((CharSequence) StringsKt.removePrefix(mcVersion, (CharSequence) "1."), new char[]{'.', '-', ' '}, false, 0, 6, (Object) null);
            String str = (String) CollectionsKt.getOrNull(parts, 0);
            if (str == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) {
                return 21;
            }
            int minor = intOrNull.intValue();
            String str2 = (String) CollectionsKt.getOrNull(parts, 1);
            int patch = (str2 == null || (intOrNull2 = StringsKt.toIntOrNull(str2)) == null) ? 0 : intOrNull2.intValue();
            if (!StringsKt.startsWith$default(mcVersion, "1.", false, 2, (Object) null)) {
                return 25;
            }
            if (minor <= 16) {
                return 8;
            }
            return (minor < 20 || (minor == 20 && patch <= 4)) ? 17 : 21;
        }
        Iterable $this$firstOrNull$iv = SUPPORTED;
        Iterator it = $this$firstOrNull$iv.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object element$iv = it.next();
            int it2 = ((Number) element$iv).intValue();
            int it3 = it2 >= declared.intValue() ? 1 : 0;
            if (it3 != 0) {
                obj = element$iv;
                break;
            }
        }
        Integer num = (Integer) obj;
        return num != null ? num.intValue() : ((Number) CollectionsKt.last((List) SUPPORTED)).intValue();
    }
}
