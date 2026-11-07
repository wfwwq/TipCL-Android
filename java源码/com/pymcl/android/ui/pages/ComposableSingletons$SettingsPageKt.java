package com.pymcl.android.ui.pages;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.pymcl.android.ui.components.BtnKind;
import com.pymcl.android.ui.components.UiKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.lwjgl.system.windows.User32;

/* compiled from: SettingsPage.kt */
@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes22.dex */
public final class ComposableSingletons$SettingsPageKt {
    public static final ComposableSingletons$SettingsPageKt INSTANCE = new ComposableSingletons$SettingsPageKt();

    /* renamed from: lambda$-1010814294, reason: not valid java name */
    private static Function3<ColumnScope, Composer, Integer, Unit> f94lambda$1010814294 = ComposableLambdaKt.composableLambdaInstance(-1010814294, false, new Function3() { // from class: com.pymcl.android.ui.pages.ComposableSingletons$SettingsPageKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$SettingsPageKt.lambda__1010814294$lambda$0((ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: getLambda$-1010814294$PyMCL_Android_app_debug, reason: not valid java name */
    public final Function3<ColumnScope, Composer, Integer, Unit> m7740getLambda$1010814294$PyMCL_Android_app_debug() {
        return f94lambda$1010814294;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1010814294$lambda$0(ColumnScope Group, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(Group, "$this$Group");
        ComposerKt.sourceInformation($composer, "C128@9806L156:SettingsPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1010814294, $changed, -1, "com.pymcl.android.ui.pages.ComposableSingletons$SettingsPageKt.lambda$-1010814294.<anonymous> (SettingsPage.kt:128)");
            }
            Arrangement.Horizontal horizontalM619spacedBy0680j_4 = Arrangement.INSTANCE.m619spacedBy0680j_4(Dp.m7018constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            Modifier modifier = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalM619spacedBy0680j_4, Alignment.INSTANCE.getTop(), $composer, ((48 >> 3) & 14) | ((48 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifier);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((48 << 3) & 112) << 6) & User32.WM_PENWINFIRST) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function0 = constructor;
                $composer.createNode(function0);
            } else {
                function0 = constructor;
                $composer.useNode();
            }
            Composer composerM3832constructorimpl = Updater.m3832constructorimpl($composer);
            Updater.m3839setimpl(composerM3832constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3839setimpl(composerM3832constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3832constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3832constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3832constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3832constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3839setimpl(composerM3832constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i3 = ((48 >> 6) & 112) | 6;
            Composer composer = $composer;
            ComposerKt.sourceInformationMarkerStart(composer, -1114586987, "C:SettingsPage.kt#vz4689");
            composer.startReplaceGroup(1072425509);
            ComposerKt.sourceInformation(composer, "*128@9956L2,128@9915L43");
            Iterable<String> iterableListOf = CollectionsKt.listOf((Object[]) new String[]{"保存为主题包", "加载", "删除", "导入", "导出"});
            int i4 = 0;
            for (String str : iterableListOf) {
                BtnKind btnKind = BtnKind.Normal;
                Iterable iterable = iterableListOf;
                int i5 = i4;
                ComposerKt.sourceInformationMarkerStart(composer, 1369820736, "CC(remember):SettingsPage.kt#9igjgp");
                Composer composer2 = composer;
                Object objRememberedValue = composer2.rememberedValue();
                Composer composer3 = composer;
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.pymcl.android.ui.pages.ComposableSingletons$SettingsPageKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer2.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd(composer3);
                UiKt.Btn(str, btnKind, null, false, false, null, false, (Function0) objRememberedValue, composer3, 12586032, 116);
                composer = composer3;
                iterableListOf = iterable;
                i4 = i5;
            }
            Composer composer4 = composer;
            composer4.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
