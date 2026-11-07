package com.pymcl.android.ui.pages;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.pymcl.android.ui.components.UiKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LaunchPage.kt */
@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes22.dex */
public final class ComposableSingletons$LaunchPageKt {
    public static final ComposableSingletons$LaunchPageKt INSTANCE = new ComposableSingletons$LaunchPageKt();
    private static Function3<RowScope, Composer, Integer, Unit> lambda$727392294 = ComposableLambdaKt.composableLambdaInstance(727392294, false, new Function3() { // from class: com.pymcl.android.ui.pages.ComposableSingletons$LaunchPageKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$LaunchPageKt.lambda_727392294$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<ColumnScope, Composer, Integer, Unit> lambda$62218958 = ComposableLambdaKt.composableLambdaInstance(62218958, false, new Function3() { // from class: com.pymcl.android.ui.pages.ComposableSingletons$LaunchPageKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$LaunchPageKt.lambda_62218958$lambda$0((ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    public final Function3<ColumnScope, Composer, Integer, Unit> getLambda$62218958$PyMCL_Android_app_debug() {
        return lambda$62218958;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$727392294$PyMCL_Android_app_debug() {
        return lambda$727392294;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_727392294$lambda$0(RowScope rowScope, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(rowScope, "<this>");
        ComposerKt.sourceInformation($composer, "C:LaunchPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(727392294, $changed, -1, "com.pymcl.android.ui.pages.ComposableSingletons$LaunchPageKt.lambda$727392294.<anonymous> (LaunchPage.kt:171)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_62218958$lambda$0(ColumnScope Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C350@22000L16,350@22018L27,350@22047L16,350@22065L27:LaunchPage.kt#vz4689");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(Card) ? 4 : 2;
        }
        if ($composer.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(62218958, $dirty, -1, "com.pymcl.android.ui.pages.ComposableSingletons$LaunchPageKt.lambda$62218958.<anonymous> (LaunchPage.kt:350)");
            }
            LaunchPageKt.CardHead("新闻主页", null, $composer, 6, 2);
            SpacerKt.Spacer(ColumnScope.weight$default(Card, Modifier.INSTANCE, 1.0f, false, 2, null), $composer, 0);
            UiKt.Muted("主页已设为空白", null, false, 0, $composer, 6, 14);
            SpacerKt.Spacer(ColumnScope.weight$default(Card, Modifier.INSTANCE, 1.0f, false, 2, null), $composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
