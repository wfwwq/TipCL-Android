package com.pymcl.android.ui.dialogs;

import com.pymcl.android.ui.i18n.I18n;
import com.pymcl.android.ui.i18n.I18nKt;
import com.pymcl.runtime.process.JavaProcessService;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SavesStrings.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"st", "", "key", JavaProcessService.EXTRA_ARGS, "", "", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "PyMCL-Android:app_debug"}, k = 2, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class SavesStringsKt {
    public static final String st(final String key, final Object... args) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(args, "args");
        return SavesStrings.INSTANCE.resolve(key, I18n.INSTANCE.getLang() == I18n.Lang.En, I18n.INSTANCE.has(key), new Function0() { // from class: com.pymcl.android.ui.dialogs.SavesStringsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SavesStringsKt.st$lambda$0(key, args);
            }
        }, args);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String st$lambda$0(String $key, Object[] $args) {
        return I18nKt.tr($key, Arrays.copyOf($args, $args.length));
    }
}
