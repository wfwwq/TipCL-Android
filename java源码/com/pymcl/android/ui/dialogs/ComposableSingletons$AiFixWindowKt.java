package com.pymcl.android.ui.dialogs;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.pymcl.android.ui.components.UiKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AiFixWindow.kt */
@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class ComposableSingletons$AiFixWindowKt {
    public static final ComposableSingletons$AiFixWindowKt INSTANCE = new ComposableSingletons$AiFixWindowKt();

    /* renamed from: lambda$-188096457, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f88lambda$188096457 = ComposableLambdaKt.composableLambdaInstance(-188096457, false, new Function3() { // from class: com.pymcl.android.ui.dialogs.ComposableSingletons$AiFixWindowKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$AiFixWindowKt.lambda__188096457$lambda$0((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: getLambda$-188096457$PyMCL_Android_app_debug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m7608getLambda$188096457$PyMCL_Android_app_debug() {
        return f88lambda$188096457;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__188096457$lambda$0(LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C130@6457L15:AiFixWindow.kt#2dz5k2");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-188096457, $changed, -1, "com.pymcl.android.ui.dialogs.ComposableSingletons$AiFixWindowKt.lambda$-188096457.<anonymous> (AiFixWindow.kt:130)");
            }
            UiKt.Muted("正在读日志…", null, false, 0, $composer, 6, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
