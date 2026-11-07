package com.pymcl.android.ui.dialogs;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.pymcl.android.ui.components.UiKt;
import com.pymcl.android.ui.theme.Py;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: SavesDialog.kt */
@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class ComposableSingletons$SavesDialogKt {
    public static final ComposableSingletons$SavesDialogKt INSTANCE = new ComposableSingletons$SavesDialogKt();

    /* renamed from: lambda$-871244233, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f92lambda$871244233 = ComposableLambdaKt.composableLambdaInstance(-871244233, false, new Function2() { // from class: com.pymcl.android.ui.dialogs.ComposableSingletons$SavesDialogKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$SavesDialogKt.lambda__871244233$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1870378918, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f91lambda$1870378918 = ComposableLambdaKt.composableLambdaInstance(-1870378918, false, new Function2() { // from class: com.pymcl.android.ui.dialogs.ComposableSingletons$SavesDialogKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$SavesDialogKt.lambda__1870378918$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: getLambda$-1870378918$PyMCL_Android_app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7613getLambda$1870378918$PyMCL_Android_app_debug() {
        return f91lambda$1870378918;
    }

    /* renamed from: getLambda$-871244233$PyMCL_Android_app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7614getLambda$871244233$PyMCL_Android_app_debug() {
        return f92lambda$871244233;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__871244233$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C334@22338L16:SavesDialog.kt#2dz5k2");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-871244233, $changed, -1, "com.pymcl.android.ui.dialogs.ComposableSingletons$SavesDialogKt.lambda$-871244233.<anonymous> (SavesDialog.kt:334)");
            }
            UiKt.Muted("读不了这个文件", null, false, 0, $composer, 6, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1870378918$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C344@23171L6,344@23107L79:SavesDialog.kt#2dz5k2");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1870378918, $changed, -1, "com.pymcl.android.ui.dialogs.ComposableSingletons$SavesDialogKt.lambda$-1870378918.<anonymous> (SavesDialog.kt:344)");
            }
            BoxKt.Box(BackgroundKt.m247backgroundbw27NRU$default(AspectRatioKt.aspectRatio$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 1.7777778f, false, 2, null), Py.INSTANCE.getColors($composer, 6).m7981getPaper20d7_KjU(), null, 2, null), $composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
