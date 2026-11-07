package com.pymcl.android.ui.i18n;

import com.pymcl.runtime.process.JavaProcessService;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: I18n.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"tr", "", "key", JavaProcessService.EXTRA_ARGS, "", "", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "PyMCL-Android:app_debug"}, k = 2, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class I18nKt {
    public static final String tr(String key, Object... args) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(args, "args");
        return I18n.INSTANCE.t(key, Arrays.copyOf(args, args.length));
    }
}
