package com.pymcl.android.ui.pages;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.pymcl.android.ui.components.UiKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AiPage.kt */
@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes22.dex */
public final class ComposableSingletons$AiPageKt {
    public static final ComposableSingletons$AiPageKt INSTANCE = new ComposableSingletons$AiPageKt();
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$101157331 = ComposableLambdaKt.composableLambdaInstance(101157331, false, new Function3() { // from class: com.pymcl.android.ui.pages.ComposableSingletons$AiPageKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$AiPageKt.lambda_101157331$lambda$0((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$101157331$PyMCL_Android_app_debug() {
        return lambda$101157331;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_101157331$lambda$0(LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C241@13002L13:AiPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(101157331, $changed, -1, "com.pymcl.android.ui.pages.ComposableSingletons$AiPageKt.lambda$101157331.<anonymous> (AiPage.kt:241)");
            }
            UiKt.Muted("正在想…", null, false, 0, $composer, 6, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
