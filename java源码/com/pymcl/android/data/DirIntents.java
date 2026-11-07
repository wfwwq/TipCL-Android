package com.pymcl.android.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.apache.commons.io.IOUtils;

/* compiled from: LauncherPrefs.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000Ê\u0001\f\b\n\u0012\b\b\u000b\u0012\u0004\b\u0003\u0010\u0002¨\u0006\t"}, d2 = {"Lcom/pymcl/android/data/DirIntents;", "", "<init>", "()V", "EXTERNAL_AUTHORITY", "", "externalDocId", "path", "externalRoot", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class DirIntents {
    public static final int $stable = 0;
    public static final String EXTERNAL_AUTHORITY = "com.android.externalstorage.documents";
    public static final DirIntents INSTANCE = new DirIntents();

    private DirIntents() {
    }

    public final String externalDocId(String path, String externalRoot) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(externalRoot, "externalRoot");
        String p = StringsKt.trimEnd(path, IOUtils.DIR_SEPARATOR_UNIX);
        String r = StringsKt.trimEnd(externalRoot, IOUtils.DIR_SEPARATOR_UNIX);
        if ((r.length() == 0) || !(Intrinsics.areEqual(p, r) || StringsKt.startsWith$default(p, r + "/", false, 2, (Object) null))) {
            return null;
        }
        String rel = StringsKt.trimStart(StringsKt.removePrefix(p, (CharSequence) r), IOUtils.DIR_SEPARATOR_UNIX);
        if (Intrinsics.areEqual(rel, "Android/data") || StringsKt.startsWith$default(rel, "Android/data/", false, 2, (Object) null) || StringsKt.startsWith$default(rel, "Android/obb", false, 2, (Object) null)) {
            return null;
        }
        return "primary:" + rel;
    }
}
