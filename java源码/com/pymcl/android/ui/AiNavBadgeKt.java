package com.pymcl.android.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import com.pymcl.android.data.AiUiExtras;
import com.pymcl.android.ui.pages.AiPageKt;
import com.pymcl.android.ui.state.AppState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AiNavBadge.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001b\u0002\b\u0005¢\u0006\u0002\u0010\u0004¨\u0006\u0006²\u0006\n\u0010\u0007\u001a\u00020\u0001X\u008a\u008e\u0002"}, d2 = {"rememberAiRunningTasks", "", "state", "Lcom/pymcl/android/ui/state/AppState;", "(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/Composer;I)I", "Landroidx/compose/runtime/Composable;", "PyMCL-Android:app_debug", "count"}, k = 2, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class AiNavBadgeKt {
    public static final int rememberAiRunningTasks(AppState state, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(state, "state");
        $composer.startReplaceGroup(-255364248);
        ComposerKt.sourceInformation($composer, "C(rememberAiRunningTasks)25@915L36,26@981L33,27@1038L599,27@1019L618:AiNavBadge.kt#n2hyjj");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-255364248, $changed, -1, "com.pymcl.android.ui.rememberAiRunningTasks (AiNavBadge.kt:24)");
        }
        ComposerKt.sourceInformationMarkerStart($composer, -591904372, "CC(remember):AiNavBadge.kt#9igjgp");
        boolean z = ((($changed & 14) ^ 6) > 4 && $composer.changed(state)) || ($changed & 6) == 4;
        Object objRememberedValue = $composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Object objAiExtras = AiPageKt.aiExtras(state);
            $composer.updateRememberedValue(objAiExtras);
            objRememberedValue = objAiExtras;
        }
        AiUiExtras ai = (AiUiExtras) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ai == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            $composer.endReplaceGroup();
            return 0;
        }
        ComposerKt.sourceInformationMarkerStart($composer, -591902263, "CC(remember):AiNavBadge.kt#9igjgp");
        Object objRememberedValue2 = $composer.rememberedValue();
        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            Object objMutableIntStateOf = SnapshotIntStateKt.mutableIntStateOf(0);
            $composer.updateRememberedValue(objMutableIntStateOf);
            objRememberedValue2 = objMutableIntStateOf;
        }
        MutableIntState count$delegate = (MutableIntState) objRememberedValue2;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, -591899873, "CC(remember):AiNavBadge.kt#9igjgp");
        boolean zChangedInstance = $composer.changedInstance(ai);
        Object objRememberedValue3 = $composer.rememberedValue();
        if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            Object obj = (Function2) new AiNavBadgeKt$rememberAiRunningTasks$1$1(ai, count$delegate, null);
            $composer.updateRememberedValue(obj);
            objRememberedValue3 = obj;
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.LaunchedEffect(ai, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, $composer, 0);
        int iRememberAiRunningTasks$lambda$2 = rememberAiRunningTasks$lambda$2(count$delegate);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        $composer.endReplaceGroup();
        return iRememberAiRunningTasks$lambda$2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int rememberAiRunningTasks$lambda$2(MutableIntState $count$delegate) {
        return $count$delegate.getIntValue();
    }
}
