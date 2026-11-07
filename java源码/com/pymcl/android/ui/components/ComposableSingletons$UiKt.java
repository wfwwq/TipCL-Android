package com.pymcl.android.ui.components;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Ui.kt */
@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class ComposableSingletons$UiKt {
    public static final ComposableSingletons$UiKt INSTANCE = new ComposableSingletons$UiKt();
    private static Function3<RowScope, Composer, Integer, Unit> lambda$386118029 = ComposableLambdaKt.composableLambdaInstance(386118029, false, new Function3() { // from class: com.pymcl.android.ui.components.ComposableSingletons$UiKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$UiKt.lambda_386118029$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$386118029$PyMCL_Android_app_debug() {
        return lambda$386118029;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_386118029$lambda$0(RowScope rowScope, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(rowScope, "<this>");
        ComposerKt.sourceInformation($composer, "C:Ui.kt#uiq9q5");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(386118029, $changed, -1, "com.pymcl.android.ui.components.ComposableSingletons$UiKt.lambda$386118029.<anonymous> (Ui.kt:187)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
