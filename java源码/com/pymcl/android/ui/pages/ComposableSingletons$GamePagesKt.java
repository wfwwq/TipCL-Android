package com.pymcl.android.ui.pages;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.pymcl.android.ui.components.UiKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: GamePages.kt */
@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes22.dex */
public final class ComposableSingletons$GamePagesKt {
    public static final ComposableSingletons$GamePagesKt INSTANCE = new ComposableSingletons$GamePagesKt();

    /* renamed from: lambda$-41025310, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f93lambda$41025310 = ComposableLambdaKt.composableLambdaInstance(-41025310, false, new Function2() { // from class: com.pymcl.android.ui.pages.ComposableSingletons$GamePagesKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$GamePagesKt.lambda__41025310$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: getLambda$-41025310$PyMCL_Android_app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7738getLambda$41025310$PyMCL_Android_app_debug() {
        return f93lambda$41025310;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__41025310$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C264@17398L2,264@17361L77:GamePages.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-41025310, $changed, -1, "com.pymcl.android.ui.pages.ComposableSingletons$GamePagesKt.lambda$-41025310.<anonymous> (GamePages.kt:264)");
            }
            List listListOf = CollectionsKt.listOf((Object[]) new String[]{"默认", "生存服 1.20.1"});
            ComposerKt.sourceInformationMarkerStart($composer, -770615996, "CC(remember):GamePages.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.ComposableSingletons$GamePagesKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ComposableSingletons$GamePagesKt.lambda__41025310$lambda$0$0$0(((Integer) obj2).intValue());
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Combo(listListOf, 0, (Function1) objRememberedValue, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, false, $composer, 28086, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__41025310$lambda$0$0$0(int it) {
        return Unit.INSTANCE;
    }
}
