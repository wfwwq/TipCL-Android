package com.pymcl.core.version;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;
import org.apache.commons.io.IOUtils;

/* compiled from: Versions.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"Lcom/pymcl/core/version/Maven;", "", "<init>", "()V", "path", "", "coord", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Maven {
    public static final Maven INSTANCE = new Maven();

    private Maven() {
    }

    public final String path(String coord) {
        Intrinsics.checkNotNullParameter(coord, "coord");
        String str = coord;
        Object ext = ArchiveStreamFactory.JAR;
        Integer numValueOf = Integer.valueOf(StringsKt.indexOf$default((CharSequence) str, '@', 0, false, 6, (Object) null));
        int it = numValueOf.intValue();
        int it2 = it >= 0 ? 1 : 0;
        if (it2 == 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int it3 = numValueOf.intValue();
            Object objSubstring = str.substring(it3 + 1);
            Intrinsics.checkNotNullExpressionValue(objSubstring, "substring(...)");
            ext = objSubstring;
            String strSubstring = str.substring(0, it3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            str = strSubstring;
        }
        List p = StringsKt.split$default((CharSequence) str, new char[]{':'}, false, 0, 6, (Object) null);
        if (!(p.size() >= 3)) {
            throw new IllegalArgumentException(("非法 maven 坐标: " + coord).toString());
        }
        String cls = p.size() > 3 ? "-" + p.get(3) : "";
        return StringsKt.replace$default((String) p.get(0), '.', IOUtils.DIR_SEPARATOR_UNIX, false, 4, (Object) null) + "/" + p.get(1) + "/" + p.get(2) + "/" + p.get(1) + "-" + p.get(2) + cls + "." + ext;
    }
}
