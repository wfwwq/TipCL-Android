package com.pymcl.android.ui.dialogs;

import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SaveDropTarget.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000Ê\u0001\f\b\f\u0012\b\b\r\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000b"}, d2 = {"Lcom/pymcl/android/ui/dialogs/SaveDropRules;", "", "<init>", "()V", "TEXT_ONLY", "", "", "accepts", "", "mimes", "", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class SaveDropRules {
    public static final int $stable = 0;
    public static final SaveDropRules INSTANCE = new SaveDropRules();
    private static final Set<String> TEXT_ONLY = SetsKt.setOf((Object[]) new String[]{"text/plain", "text/html", "text/uri-list"});

    private SaveDropRules() {
    }

    public final boolean accepts(Collection<String> mimes) {
        Intrinsics.checkNotNullParameter(mimes, "mimes");
        Collection<String> collection = mimes;
        if (collection.isEmpty()) {
            return false;
        }
        for (String str : collection) {
            Set<String> set = TEXT_ONLY;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (!set.contains(lowerCase)) {
                return true;
            }
        }
        return false;
    }
}
