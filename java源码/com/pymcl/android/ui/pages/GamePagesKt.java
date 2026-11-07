package com.pymcl.android.ui.pages;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.pymcl.android.data.LaunchConfigLogic;
import com.pymcl.android.ui.Destination;
import com.pymcl.android.ui.components.BtnKind;
import com.pymcl.android.ui.components.Ico;
import com.pymcl.android.ui.components.TagTone;
import com.pymcl.android.ui.components.UiKt;
import com.pymcl.android.ui.i18n.I18nKt;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.DialogSpec;
import com.pymcl.android.ui.state.InputRules;
import com.pymcl.android.ui.state.InstalledVersion;
import com.pymcl.android.ui.state.InstanceRow;
import com.pymcl.android.ui.state.JavaRow;
import com.pymcl.android.ui.state.RemoteVersion;
import com.pymcl.android.ui.theme.Py;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.windows.User32;

/* compiled from: GamePages.kt */
@Metadata(d1 = {"\u0000|\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aq\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\t¢\u0006\u0002\b\n2\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\t¢\u0006\u0002\b\nH\u0007b\u0002\b\tb\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0013H\u0007b\u0002\b\tb\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017¢\u0006\u0002\u0010\u0014\u001a/\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0003b\u0002\b\tb\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017¢\u0006\u0002\u0010\u001b\u001a'\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0013H\u0007b\u0002\b\tb\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017¢\u0006\u0002\u0010\u0014\u001a'\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0013H\u0007b\u0002\b\tb\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017¢\u0006\u0002\u0010\u0014\u001a\b\u0010\u001e\u001a\u00020\u0001H\u0002¨\u0006\u001f²\u0006\u0012\u0010 \u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!X\u008a\u008e\u0002²\u0006\u0010\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001a0!X\u008a\u008e\u0002²\u0006\n\u0010$\u001a\u00020%X\u008a\u008e\u0002²\u0006\u0010\u0010&\u001a\b\u0012\u0004\u0012\u00020%0'X\u008a\u008e\u0002²\u0006\f\u0010(\u001a\u0004\u0018\u00010%X\u008a\u008e\u0002²\u0006\n\u0010)\u001a\u00020*X\u008a\u008e\u0002²\u0006\u0010\u0010+\u001a\b\u0012\u0004\u0012\u00020%0!X\u008a\u008e\u0002²\u0006\n\u0010,\u001a\u00020*X\u008a\u008e\u0002²\u0006\n\u0010-\u001a\u00020.X\u008a\u008e\u0002²\u0006\n\u0010/\u001a\u00020.X\u008a\u008e\u0002²\u0006\n\u00100\u001a\u00020.X\u008a\u008e\u0002²\u0006\u0010\u00101\u001a\b\u0012\u0004\u0012\u0002020!X\u008a\u008e\u0002²\u0006\n\u0010$\u001a\u00020%X\u008a\u008e\u0002²\u0006\n\u00100\u001a\u00020.X\u008a\u008e\u0002²\u0006\u0012\u00101\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010!X\u008a\u008e\u0002²\u0006\n\u00104\u001a\u00020*X\u008a\u008e\u0002²\u0006\n\u00105\u001a\u00020%X\u008a\u008e\u0002²\u0006\n\u00106\u001a\u00020*X\u008a\u008e\u0002"}, d2 = {"TwoPane", "", "minWide", "Landroidx/compose/ui/unit/Dp;", "leftWeight", "", "left", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "right", "TwoPane-AjpBEmI", "(FFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/runtime/ComposableInferredTarget;", "scheme", "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]", "VersionPage", "state", "Lcom/pymcl/android/ui/state/AppState;", "(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/ComposableTarget;", "applier", "androidx.compose.ui.UiComposable", "InstalledVersionCard", SettingsProtocol.EXTRA_VALUE, "Lcom/pymcl/android/ui/state/InstalledVersion;", "(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/InstalledVersion;Landroidx/compose/runtime/Composer;I)V", "InstancePage", "JavaPage", "unusedLazy", "PyMCL-Android:app_debug", "list", "", "Lcom/pymcl/android/ui/state/RemoteVersion;", "installed", "filter", "", "types", "", "selected", "loader", "", "loaderVersions", "loaderVer", "loaderLoaded", "", "iso", "menu", "rows", "Lcom/pymcl/android/ui/state/InstanceRow;", "Lcom/pymcl/android/ui/state/JavaRow;", "distro", "path", "defJava"}, k = 2, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes22.dex */
public final class GamePagesKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstalledVersionCard$lambda$7(AppState appState, InstalledVersion installedVersion, int i, Composer composer, int i2) {
        InstalledVersionCard(appState, installedVersion, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstancePage$lambda$8(AppState appState, int i, Composer composer, int i2) {
        InstancePage(appState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit JavaPage$lambda$14(AppState appState, int i, Composer composer, int i2) {
        JavaPage(appState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TwoPane_AjpBEmI$lambda$1(float f, float f2, Function3 function3, Function3 function32, int i, int i2, Composer composer, int i3) {
        m7768TwoPaneAjpBEmI(f, f2, function3, function32, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VersionPage$lambda$30(AppState appState, int i, Composer composer, int i2) {
        VersionPage(appState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: TwoPane-AjpBEmI, reason: not valid java name */
    public static final void m7768TwoPaneAjpBEmI(final float minWide, final float leftWeight, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> left, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> right, Composer $composer, final int $changed, final int i) {
        final float minWide2;
        final float leftWeight2;
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(right, "right");
        Composer $composer2 = $composer.startRestartGroup(1480654399);
        ComposerKt.sourceInformation($composer2, "C(TwoPane)P(2:c#ui.unit.Dp,1)20@862L427,20@818L471:GamePages.kt#vz4689");
        int $dirty = $changed;
        int i2 = i & 1;
        if (i2 != 0) {
            $dirty |= 6;
        } else if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(minWide) ? 4 : 2;
        }
        int i3 = i & 2;
        if (i3 != 0) {
            $dirty |= 48;
        } else if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(leftWeight) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(left) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer2.changedInstance(right) ? 2048 : 1024;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 1171) != 1170, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
            minWide2 = minWide;
            leftWeight2 = leftWeight;
        } else {
            if (i2 != 0) {
                minWide = Dp.m7018constructorimpl(820);
            }
            if (i3 != 0) {
                leftWeight = 0.5f;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1480654399, $dirty2, -1, "com.pymcl.android.ui.pages.TwoPane (GamePages.kt:19)");
            }
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(1942977449, true, new Function3() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda61
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GamePagesKt.TwoPane_AjpBEmI$lambda$0(minWide, leftWeight, left, right, (BoxWithConstraintsScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            minWide2 = minWide;
            leftWeight2 = leftWeight;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda62
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GamePagesKt.TwoPane_AjpBEmI$lambda$1(minWide2, leftWeight2, left, right, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TwoPane_AjpBEmI$lambda$0(float $minWide, float $leftWeight, Function3 $left, Function3 $right, BoxWithConstraintsScope BoxWithConstraints, Composer $composer, int $changed) {
        Function0 function0;
        int i;
        Composer composer;
        Function0 function02;
        Function0 function03;
        Function0 function04;
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        ComposerKt.sourceInformation($composer, "C:GamePages.kt#vz4689");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(BoxWithConstraints) ? 4 : 2;
        }
        if ($composer.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1942977449, $dirty, -1, "com.pymcl.android.ui.pages.TwoPane.<anonymous> (GamePages.kt:21)");
            }
            if (Dp.m7017compareTo0680j_4(BoxWithConstraints.mo645getMaxWidthD9Ej5fM(), $minWide) >= 0) {
                $composer.startReplaceGroup(-1109443848);
                ComposerKt.sourceInformation($composer, "21@897L303");
                Arrangement.Horizontal horizontalM619spacedBy0680j_4 = Arrangement.INSTANCE.m619spacedBy0680j_4(Dp.m7018constructorimpl(12));
                ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                Modifier modifier = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalM619spacedBy0680j_4, Alignment.INSTANCE.getTop(), $composer, ((48 >> 3) & 14) | ((48 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifier);
                Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
                int i3 = ((((48 << 3) & 112) << 6) & User32.WM_PENWINFIRST) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    function02 = constructor;
                    $composer.createNode(function02);
                } else {
                    function02 = constructor;
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
                int i4 = (i3 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                int i5 = ((48 >> 6) & 112) | 6;
                RowScope rowScope = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart($composer, 900589595, "C22@968L102,23@1083L107:GamePages.kt#vz4689");
                Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.INSTANCE, $leftWeight, false, 2, null);
                Arrangement.Vertical verticalM619spacedBy0680j_4 = Arrangement.INSTANCE.m619spacedBy0680j_4(Dp.m7018constructorimpl(12));
                ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(verticalM619spacedBy0680j_4, Alignment.INSTANCE.getStart(), $composer, ((48 >> 3) & 14) | ((48 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifierWeight$default);
                Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int i6 = ((((48 << 3) & 112) << 6) & User32.WM_PENWINFIRST) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    function03 = constructor2;
                    $composer.createNode(function03);
                } else {
                    function03 = constructor2;
                    $composer.useNode();
                }
                Composer composerM3832constructorimpl2 = Updater.m3832constructorimpl($composer);
                Updater.m3839setimpl(composerM3832constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3839setimpl(composerM3832constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3832constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3832constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM3832constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM3832constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m3839setimpl(composerM3832constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                int i7 = (i6 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                $left.invoke(ColumnScopeInstance.INSTANCE, $composer, Integer.valueOf(((48 >> 6) & 112) | 6));
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                Modifier modifierWeight$default2 = RowScope.weight$default(rowScope, Modifier.INSTANCE, 1 - $leftWeight, false, 2, null);
                Arrangement.Vertical verticalM619spacedBy0680j_42 = Arrangement.INSTANCE.m619spacedBy0680j_4(Dp.m7018constructorimpl(12));
                ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(verticalM619spacedBy0680j_42, Alignment.INSTANCE.getStart(), $composer, ((48 >> 3) & 14) | ((48 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap3 = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer, modifierWeight$default2);
                Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                int i8 = ((((48 << 3) & 112) << 6) & User32.WM_PENWINFIRST) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    function04 = constructor3;
                    $composer.createNode(function04);
                } else {
                    function04 = constructor3;
                    $composer.useNode();
                }
                Composer composerM3832constructorimpl3 = Updater.m3832constructorimpl($composer);
                Updater.m3839setimpl(composerM3832constructorimpl3, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3839setimpl(composerM3832constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3832constructorimpl3.getInserting()) {
                    i2 = 48;
                    composer2 = $composer;
                } else {
                    i2 = 48;
                    composer2 = $composer;
                    if (!Intrinsics.areEqual(composerM3832constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    }
                    Updater.m3839setimpl(composerM3832constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    int i9 = (i8 >> 6) & 14;
                    Composer composer3 = composer2;
                    ComposerKt.sourceInformationMarkerStart(composer3, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    $right.invoke(ColumnScopeInstance.INSTANCE, composer3, Integer.valueOf(((i2 >> 6) & 112) | 6));
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endReplaceGroup();
                }
                composerM3832constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM3832constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                Updater.m3839setimpl(composerM3832constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                int i92 = (i8 >> 6) & 14;
                Composer composer32 = composer2;
                ComposerKt.sourceInformationMarkerStart(composer32, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                $right.invoke(ColumnScopeInstance.INSTANCE, composer32, Integer.valueOf(((i2 >> 6) & 112) | 6));
                ComposerKt.sourceInformationMarkerEnd(composer32);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-1109434186);
                ComposerKt.sourceInformation($composer, "24@1206L77");
                Arrangement.Vertical verticalM619spacedBy0680j_43 = Arrangement.INSTANCE.m619spacedBy0680j_4(Dp.m7018constructorimpl(12));
                ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                Modifier modifier2 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(verticalM619spacedBy0680j_43, Alignment.INSTANCE.getStart(), $composer, ((48 >> 3) & 14) | ((48 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap4 = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier($composer, modifier2);
                Function0 constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                int i10 = ((((48 << 3) & 112) << 6) & User32.WM_PENWINFIRST) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    function0 = constructor4;
                    $composer.createNode(function0);
                } else {
                    function0 = constructor4;
                    $composer.useNode();
                }
                Composer composerM3832constructorimpl4 = Updater.m3832constructorimpl($composer);
                Updater.m3839setimpl(composerM3832constructorimpl4, measurePolicyColumnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3839setimpl(composerM3832constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3832constructorimpl4.getInserting()) {
                    i = 48;
                    composer = $composer;
                } else {
                    i = 48;
                    composer = $composer;
                    if (!Intrinsics.areEqual(composerM3832constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    }
                    Updater.m3839setimpl(composerM3832constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                    int i11 = (i10 >> 6) & 14;
                    Composer composer4 = composer;
                    ComposerKt.sourceInformationMarkerStart(composer4, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    int i12 = ((i >> 6) & 112) | 6;
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer4, -920890011, "C24@1266L6,24@1274L7:GamePages.kt#vz4689");
                    $right.invoke(columnScopeInstance, composer4, Integer.valueOf(i12 & 14));
                    $left.invoke(columnScopeInstance, composer4, Integer.valueOf(i12 & 14));
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    $composer.endReplaceGroup();
                }
                composerM3832constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM3832constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                Updater.m3839setimpl(composerM3832constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                int i112 = (i10 >> 6) & 14;
                Composer composer42 = composer;
                ComposerKt.sourceInformationMarkerStart(composer42, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                int i122 = ((i >> 6) & 112) | 6;
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer42, -920890011, "C24@1266L6,24@1274L7:GamePages.kt#vz4689");
                $right.invoke(columnScopeInstance2, composer42, Integer.valueOf(i122 & 14));
                $left.invoke(columnScopeInstance2, composer42, Integer.valueOf(i122 & 14));
                ComposerKt.sourceInformationMarkerEnd(composer42);
                ComposerKt.sourceInformationMarkerEnd(composer42);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0336  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void VersionPage(com.pymcl.android.ui.state.AppState r28, androidx.compose.runtime.Composer r29, final int r30) {
        /*
            Method dump skipped, instructions count: 844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.GamePagesKt.VersionPage(com.pymcl.android.ui.state.AppState, androidx.compose.runtime.Composer, int):void");
    }

    private static final List<RemoteVersion> VersionPage$lambda$1(MutableState<List<RemoteVersion>> mutableState) {
        return mutableState.getValue();
    }

    private static final List<InstalledVersion> VersionPage$lambda$4(MutableState<List<InstalledVersion>> mutableState) {
        return mutableState.getValue();
    }

    private static final String VersionPage$lambda$7(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final Set<String> VersionPage$lambda$10(MutableState<Set<String>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String VersionPage$lambda$13(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int VersionPage$lambda$16(MutableIntState $loader$delegate) {
        return $loader$delegate.getIntValue();
    }

    private static final List<String> VersionPage$lambda$19(MutableState<List<String>> mutableState) {
        return mutableState.getValue();
    }

    private static final int VersionPage$lambda$22(MutableIntState $loaderVer$delegate) {
        return $loaderVer$delegate.getIntValue();
    }

    private static final boolean VersionPage$lambda$26(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void VersionPage$lambda$27(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VersionPage$lambda$29(final AppState $state, final MutableState $list$delegate, final MutableState $types$delegate, final MutableState $filter$delegate, final MutableState $selected$delegate, final List $loaders, final MutableIntState $loader$delegate, final MutableState $loaderVersions$delegate, final MutableIntState $loaderVer$delegate, final MutableState $loaderLoaded$delegate, final MutableState $installed$delegate, ColumnScope ScrollBody, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(ScrollBody, "$this$ScrollBody");
        ComposerKt.sourceInformation($composer, "C49@2739L209,49@2668L280,53@2972L1684,78@4666L2530,53@2957L4240:GamePages.kt#vz4689");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1134130227, $changed, -1, "com.pymcl.android.ui.pages.VersionPage.<anonymous> (GamePages.kt:49)");
            }
            UiKt.Section("原版游戏", "Mojang 全量版本 + Fabric / Forge / Quilt / NeoForge 加载器", null, false, ComposableLambdaKt.rememberComposableLambda(-473734939, true, new Function3() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda32
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GamePagesKt.VersionPage$lambda$29$0($state, $list$delegate, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24630, 12);
            m7768TwoPaneAjpBEmI(0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(1377859068, true, new Function3() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda34
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GamePagesKt.VersionPage$lambda$29$1($types$delegate, $filter$delegate, $list$delegate, $selected$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), ComposableLambdaKt.rememberComposableLambda(1570790269, true, new Function3() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda35
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GamePagesKt.VersionPage$lambda$29$2($state, $loaders, $loader$delegate, $loaderVersions$delegate, $loaderVer$delegate, $selected$delegate, $loaderLoaded$delegate, $installed$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, GL11.GL_AUTO_NORMAL, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VersionPage$lambda$29$0(final AppState $state, final MutableState $list$delegate, RowScope Section, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Section, "$this$Section");
        ComposerKt.sourceInformation($composer, "C50@2795L22,50@2753L64,51@2871L67,51@2830L108:GamePages.kt#vz4689");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-473734939, $changed, -1, "com.pymcl.android.ui.pages.VersionPage.<anonymous>.<anonymous> (GamePages.kt:50)");
            }
            BtnKind btnKind = BtnKind.Normal;
            ImageVector folder = Ico.INSTANCE.getFolder();
            ComposerKt.sourceInformationMarkerStart($composer, 7258811, "CC(remember):GamePages.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($state);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda59
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GamePagesKt.VersionPage$lambda$29$0$0$0($state);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Btn("打开游戏目录", btnKind, folder, false, false, null, false, (Function0) objRememberedValue, $composer, 54, 120);
            BtnKind btnKind2 = BtnKind.Normal;
            ImageVector refresh = Ico.INSTANCE.getRefresh();
            ComposerKt.sourceInformationMarkerStart($composer, 7261288, "CC(remember):GamePages.kt#9igjgp");
            boolean zChangedInstance2 = $composer.changedInstance($state);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda60
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GamePagesKt.VersionPage$lambda$29$0$1$0($state, $list$delegate);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Btn("刷新清单", btnKind2, refresh, false, false, null, false, (Function0) objRememberedValue2, $composer, 54, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VersionPage$lambda$29$0$0$0(AppState $state) {
        AppState.toast$default($state, "已打开", null, null, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VersionPage$lambda$29$0$1$0(AppState $state, MutableState $list$delegate) {
        $list$delegate.setValue(null);
        $state.launch(new GamePagesKt$VersionPage$3$1$2$1$1($state, $list$delegate, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VersionPage$lambda$29$1(final MutableState $types$delegate, final MutableState $filter$delegate, final MutableState $list$delegate, final MutableState $selected$delegate, ColumnScope TwoPane, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TwoPane, "$this$TwoPane");
        ComposerKt.sourceInformation($composer, "C54@3016L1630,54@2986L1660:GamePages.kt#vz4689");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (VersionPage$lambda$13($selected$delegate) != null) {
                return Unit.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1377859068, $changed, -1, "com.pymcl.android.ui.pages.VersionPage.<anonymous>.<anonymous> (GamePages.kt:54)");
            }
            UiKt.m7594CardDzVHIIc(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-534276500, true, new Function3() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda31
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GamePagesKt.VersionPage$lambda$29$1$0($types$delegate, $filter$delegate, $list$delegate, $selected$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:75:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x033c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02f9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit VersionPage$lambda$29$1$0(final androidx.compose.runtime.MutableState r52, final androidx.compose.runtime.MutableState r53, androidx.compose.runtime.MutableState r54, final androidx.compose.runtime.MutableState r55, androidx.compose.foundation.layout.ColumnScope r56, androidx.compose.runtime.Composer r57, int r58) {
        /*
            Method dump skipped, instructions count: 1393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.GamePagesKt.VersionPage$lambda$29$1$0(androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VersionPage$lambda$29$1$0$0$0$0$0(String $k, MutableState $types$delegate, boolean it) {
        Set<String> setVersionPage$lambda$10 = VersionPage$lambda$10($types$delegate);
        $types$delegate.setValue(it ? SetsKt.plus(setVersionPage$lambda$10, $k) : SetsKt.minus(setVersionPage$lambda$10, $k));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VersionPage$lambda$29$1$0$1$0(MutableState $filter$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $filter$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VersionPage$lambda$29$1$0$3$0$0$0(RemoteVersion $v, MutableState $selected$delegate) {
        $selected$delegate.setValue($v.getId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0220  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit VersionPage$lambda$29$1$0$3$0$1(com.pymcl.android.ui.state.RemoteVersion r36, androidx.compose.foundation.layout.RowScope r37, androidx.compose.runtime.Composer r38, int r39) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.GamePagesKt.VersionPage$lambda$29$1$0$3$0$1(com.pymcl.android.ui.state.RemoteVersion, androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VersionPage$lambda$29$2(final AppState $state, final List $loaders, final MutableIntState $loader$delegate, final MutableState $loaderVersions$delegate, final MutableIntState $loaderVer$delegate, final MutableState $selected$delegate, final MutableState $loaderLoaded$delegate, final MutableState $installed$delegate, ColumnScope TwoPane, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TwoPane, "$this$TwoPane");
        ComposerKt.sourceInformation($composer, "C79@4710L2116,79@4680L2146,102@6869L317,102@6839L347:GamePages.kt#vz4689");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (VersionPage$lambda$13($selected$delegate) == null) {
                return Unit.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1570790269, $changed, -1, "com.pymcl.android.ui.pages.VersionPage.<anonymous>.<anonymous> (GamePages.kt:79)");
            }
            UiKt.m7594CardDzVHIIc(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-341345299, true, new Function3() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda52
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GamePagesKt.VersionPage$lambda$29$2$0($state, $loaders, $loader$delegate, $loaderVersions$delegate, $loaderVer$delegate, $selected$delegate, $loaderLoaded$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 3078, 6);
            UiKt.m7594CardDzVHIIc(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-975205660, true, new Function3() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda53
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GamePagesKt.VersionPage$lambda$29$2$1($installed$delegate, $state, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit VersionPage$lambda$29$2$0(final com.pymcl.android.ui.state.AppState r50, final java.util.List r51, final androidx.compose.runtime.MutableIntState r52, final androidx.compose.runtime.MutableState r53, final androidx.compose.runtime.MutableIntState r54, final androidx.compose.runtime.MutableState r55, androidx.compose.runtime.MutableState r56, androidx.compose.foundation.layout.ColumnScope r57, androidx.compose.runtime.Composer r58, int r59) {
        /*
            Method dump skipped, instructions count: 798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.GamePagesKt.VersionPage$lambda$29$2$0(com.pymcl.android.ui.state.AppState, java.util.List, androidx.compose.runtime.MutableIntState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableIntState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VersionPage$lambda$29$2$0$1(final List $instNames, final AppState $state, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C82@4972L91,82@4895L206:GamePages.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(776414456, $changed, -1, "com.pymcl.android.ui.pages.VersionPage.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GamePages.kt:82)");
            }
            int iCoerceAtLeast = RangesKt.coerceAtLeast($instNames.indexOf($state.getSelectedInstance()), 0);
            ComposerKt.sourceInformationMarkerStart($composer, -1190014669, "CC(remember):GamePages.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($state) | $composer.changedInstance($instNames);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return GamePagesKt.VersionPage$lambda$29$2$0$1$0$0($state, $instNames, ((Integer) obj2).intValue());
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Combo($instNames, iCoerceAtLeast, (Function1) objRememberedValue, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, false, $composer, 27648, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VersionPage$lambda$29$2$0$1$0$0(AppState $state, List $instNames, int it) {
        $state.setSelectedInstance((String) $instNames.get(it));
        $state.setSelectedVersion("");
        $state.refreshData();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VersionPage$lambda$29$2$0$2(List $loaders, final MutableIntState $loader$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C83@5178L15,83@5155L64:GamePages.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-292901521, $changed, -1, "com.pymcl.android.ui.pages.VersionPage.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GamePages.kt:83)");
            }
            int iVersionPage$lambda$16 = VersionPage$lambda$16($loader$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, 1989480670, "CC(remember):GamePages.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return GamePagesKt.VersionPage$lambda$29$2$0$2$0$0($loader$delegate, ((Integer) obj2).intValue());
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Combo($loaders, iVersionPage$lambda$16, (Function1) objRememberedValue, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, $composer, 3462, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VersionPage$lambda$29$2$0$2$0$0(MutableIntState $loader$delegate, int it) {
        $loader$delegate.setIntValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VersionPage$lambda$29$2$0$3(MutableIntState $loader$delegate, MutableState $loaderVersions$delegate, final MutableIntState $loaderVer$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C:GamePages.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-116573264, $changed, -1, "com.pymcl.android.ui.pages.VersionPage.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GamePages.kt:85)");
            }
            if (VersionPage$lambda$16($loader$delegate) == 0) {
                $composer.startReplaceGroup(-357755750);
                ComposerKt.sourceInformation($composer, "85@5312L10");
                UiKt.Muted("无", null, false, 0, $composer, 6, 14);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-357755124);
                ComposerKt.sourceInformation($composer, "85@5396L18,85@5328L124");
                List<String> listVersionPage$lambda$19 = VersionPage$lambda$19($loaderVersions$delegate);
                if (listVersionPage$lambda$19.isEmpty()) {
                    listVersionPage$lambda$19 = CollectionsKt.listOf(I18nKt.tr("最新（加载中…）", new Object[0]));
                }
                List<String> list = listVersionPage$lambda$19;
                int iVersionPage$lambda$22 = VersionPage$lambda$22($loaderVer$delegate);
                ComposerKt.sourceInformationMarkerStart($composer, -357753054, "CC(remember):GamePages.kt#9igjgp");
                Object objRememberedValue = $composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return GamePagesKt.VersionPage$lambda$29$2$0$3$1$0($loaderVer$delegate, ((Integer) obj2).intValue());
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                UiKt.Combo(list, iVersionPage$lambda$22, (Function1) objRememberedValue, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, false, $composer, 28032, 32);
                $composer.endReplaceGroup();
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
    public static final Unit VersionPage$lambda$29$2$0$3$1$0(MutableIntState $loaderVer$delegate, int it) {
        $loaderVer$delegate.setIntValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VersionPage$lambda$29$2$0$4$0(AppState $state, String $ldr, MutableState $selected$delegate, MutableState $loaderVersions$delegate, MutableIntState $loaderVer$delegate) {
        String id = VersionPage$lambda$13($selected$delegate);
        if (id == null) {
            return Unit.INSTANCE;
        }
        if ($state.installVersion($state.getSelectedInstance(), id, $ldr, (String) CollectionsKt.getOrNull(VersionPage$lambda$19($loaderVersions$delegate), VersionPage$lambda$22($loaderVer$delegate)))) {
            AppState.toast$default($state, "已加入队列", I18nKt.tr("进度看下载任务", new Object[0]), null, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VersionPage$lambda$29$2$1(MutableState $installed$delegate, AppState $state, ColumnScope Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C103@6887L9,104@6913L56,105@6986L29,*107@7140L30:GamePages.kt#vz4689");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-975205660, $changed, -1, "com.pymcl.android.ui.pages.VersionPage.<anonymous>.<anonymous>.<anonymous> (GamePages.kt:103)");
            }
            UiKt.H3("已安装", null, false, $composer, 6, 6);
            UiKt.Muted("每个版本一张卡：启动、模组、设置都在卡上，「更多」里是重命名 / 复制 / 快捷方式 / 卸载", null, false, 0, $composer, 6, 14);
            SpacerKt.Spacer(SizeKt.m771height3ABfNKs(Modifier.INSTANCE, Dp.m7018constructorimpl(8)), $composer, 6);
            if (VersionPage$lambda$4($installed$delegate).isEmpty()) {
                $composer.startReplaceGroup(-869762675);
                ComposerKt.sourceInformation($composer, "106@7057L41");
                UiKt.Empty(Ico.INSTANCE.getGrass(), "这个实例还没有版本", "在左边挑一个装上", null, $composer, 432, 8);
            } else {
                $composer.startReplaceGroup(-1192799746);
            }
            $composer.endReplaceGroup();
            Iterator it = VersionPage$lambda$4($installed$delegate).iterator();
            while (it.hasNext()) {
                InstalledVersionCard($state, (InstalledVersion) it.next(), $composer, AppState.$stable | (InstalledVersion.$stable << 3));
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    private static final void InstalledVersionCard(final AppState state, final InstalledVersion v, Composer $composer, final int $changed) {
        boolean z;
        Composer $composer2 = $composer.startRestartGroup(-1481966481);
        ComposerKt.sourceInformation($composer2, "C(InstalledVersionCard)115@7307L39,116@7363L34,117@7455L1921,117@7402L1974:GamePages.kt#vz4689");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= ($changed & 8) == 0 ? $composer2.changed(state) : $composer2.changedInstance(state) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= ($changed & 64) == 0 ? $composer2.changed(v) : $composer2.changedInstance(v) ? 32 : 16;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1481966481, $dirty2, -1, "com.pymcl.android.ui.pages.InstalledVersionCard (GamePages.kt:114)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, 1759356630, "CC(remember):GamePages.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                z = false;
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(v.getIsolated()), null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            } else {
                z = false;
            }
            final MutableState iso$delegate = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1759358417, "CC(remember):GamePages.kt#9igjgp");
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue2 = objMutableStateOf$default2;
            }
            final MutableState menu$delegate = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            UiKt.m7601PaneuFdPcIQ(PaddingKt.m742paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m7018constructorimpl(8), 7, null), 0.0f, ComposableLambdaKt.rememberComposableLambda(1782106696, true, new Function3() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda50
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GamePagesKt.InstalledVersionCard$lambda$6(v, state, iso$delegate, menu$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda51
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GamePagesKt.InstalledVersionCard$lambda$7(state, v, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean InstalledVersionCard$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final boolean InstalledVersionCard$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void InstalledVersionCard$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:103:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0795  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x07a1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0863  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0871  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x08ae  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x08bc  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x092d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x05b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x069a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit InstalledVersionCard$lambda$6(final com.pymcl.android.ui.state.InstalledVersion r91, final com.pymcl.android.ui.state.AppState r92, androidx.compose.runtime.MutableState r93, final androidx.compose.runtime.MutableState r94, androidx.compose.foundation.layout.ColumnScope r95, androidx.compose.runtime.Composer r96, int r97) {
        /*
            Method dump skipped, instructions count: 2359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.GamePagesKt.InstalledVersionCard$lambda$6(com.pymcl.android.ui.state.InstalledVersion, com.pymcl.android.ui.state.AppState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstalledVersionCard$lambda$6$0$1$0(AppState $state, boolean it) {
        $state.toast("当前系统不支持", "", "info");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstalledVersionCard$lambda$6$1$0$0(AppState $state, InstalledVersion $v) {
        $state.navigate(Destination.Launch);
        $state.startGameFor($state.getSelectedInstance(), $v.getId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstalledVersionCard$lambda$6$1$1$0(AppState $state, InstalledVersion $v) {
        $state.open(new DialogSpec.Mods($state.getSelectedInstance(), $v.getId()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstalledVersionCard$lambda$6$1$2$0(AppState $state, InstalledVersion $v) {
        $state.open(new DialogSpec.VersionSetup($v.getId()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstalledVersionCard$lambda$6$1$3$0$0(MutableState $menu$delegate) {
        InstalledVersionCard$lambda$5($menu$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstalledVersionCard$lambda$6$1$3$1$0(MutableState $menu$delegate) {
        InstalledVersionCard$lambda$5($menu$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstalledVersionCard$lambda$6$1$3$2(final AppState $state, final InstalledVersion $v, final MutableState $menu$delegate, ColumnScope DropdownMenu, Composer $composer, int $changed) {
        Composer composer = $composer;
        Intrinsics.checkNotNullParameter(DropdownMenu, "$this$DropdownMenu");
        ComposerKt.sourceInformation(composer, "C*134@8826L74,134@8912L393,134@8809L497:GamePages.kt#vz4689");
        boolean z = true;
        if (!composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1394923134, $changed, -1, "com.pymcl.android.ui.pages.InstalledVersionCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GamePages.kt:133)");
            }
            for (final String str : CollectionsKt.listOf((Object[]) new String[]{"在列表中隐藏", "打开版本文件夹", "打开游戏文件夹", "存档管理…", "隔离细分…", "重命名", "复制版本", "创建桌面快捷方式", "修复（补全缺失文件）", "卸载这个版本"})) {
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(734228482, z, new Function2() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GamePagesKt.InstalledVersionCard$lambda$6$1$3$2$0$0(str, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer, 54);
                ComposerKt.sourceInformationMarkerStart(composer, -1493316709, "CC(remember):GamePages.kt#9igjgp");
                boolean zChanged = composer.changed(str) | composer.changedInstance($state) | composer.changedInstance($v);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda19
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GamePagesKt.InstalledVersionCard$lambda$6$1$3$2$0$1$0(str, $state, $v, $menu$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                AndroidMenu_androidKt.DropdownMenuItem(composableLambdaRememberComposableLambda, (Function0) objRememberedValue, null, null, null, false, null, null, null, composer, 6, TarConstants.XSTAR_MAGIC_OFFSET);
                composer = $composer;
                z = z;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstalledVersionCard$lambda$6$1$3$2$0$0(String $k, Composer $composer, int $changed) {
        long jM7967getInk0d7_KjU;
        ComposerKt.sourceInformation($composer, "C134@8828L70:GamePages.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(734228482, $changed, -1, "com.pymcl.android.ui.pages.InstalledVersionCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GamePages.kt:134)");
            }
            if (Intrinsics.areEqual($k, "卸载这个版本")) {
                $composer.startReplaceGroup(1218936136);
                ComposerKt.sourceInformation($composer, "134@8865L6");
                jM7967getInk0d7_KjU = Py.INSTANCE.getColors($composer, 6).m7959getDanger0d7_KjU();
            } else {
                $composer.startReplaceGroup(1218936837);
                ComposerKt.sourceInformation($composer, "134@8887L6");
                jM7967getInk0d7_KjU = Py.INSTANCE.getColors($composer, 6).m7967getInk0d7_KjU();
            }
            $composer.endReplaceGroup();
            UiKt.m7603TxtuDo3WH8($k, null, false, jM7967getInk0d7_KjU, 0, $composer, 0, 22);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstalledVersionCard$lambda$6$1$3$2$0$1$0(String $k, AppState $state, InstalledVersion $v, MutableState $menu$delegate) {
        InstalledVersionCard$lambda$5($menu$delegate, false);
        if (Intrinsics.areEqual($k, "存档管理…")) {
            $state.open(new DialogSpec.Saves($state.getSelectedInstance(), $v.getId()));
        } else {
            $state.toast($k, "当前系统不支持", "info");
        }
        return Unit.INSTANCE;
    }

    public static final void InstancePage(final AppState state, Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(state, "state");
        Composer $composer2 = $composer.startRestartGroup(-1825060217);
        ComposerKt.sourceInformation($composer2, "C(InstancePage)152@9536L59,153@9614L31,155@9740L12,155@9719L33,156@9768L5241,156@9757L5252:GamePages.kt#vz4689");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= ($changed & 8) == 0 ? $composer2.changed(state) : $composer2.changedInstance(state) ? 4 : 2;
        }
        if (!$composer2.shouldExecute(($dirty & 3) != 2, $dirty & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1825060217, $dirty, -1, "com.pymcl.android.ui.pages.InstancePage (GamePages.kt:151)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, -1536210046, "CC(remember):GamePages.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            }
            final MutableState rows$delegate = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1536207578, "CC(remember):GamePages.kt#9igjgp");
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue2 = objMutableStateOf$default2;
            }
            final MutableState filter$delegate = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer2, -1536203565, "CC(remember):GamePages.kt#9igjgp");
            boolean z = ($dirty & 14) == 4 || (($dirty & 8) != 0 && $composer2.changedInstance(state));
            Object objRememberedValue3 = $composer2.rememberedValue();
            if (z || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj = (Function2) new GamePagesKt$InstancePage$1$1(state, rows$delegate, null);
                $composer2.updateRememberedValue(obj);
                objRememberedValue3 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, $composer2, 6);
            UiKt.ScrollBody(null, ComposableLambdaKt.rememberComposableLambda(424505524, true, new Function3() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda46
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return GamePagesKt.InstancePage$lambda$7(state, rows$delegate, filter$delegate, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer2, 54), $composer2, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda47
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return GamePagesKt.InstancePage$lambda$8(state, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final List<InstanceRow> InstancePage$lambda$1(MutableState<List<InstanceRow>> mutableState) {
        return mutableState.getValue();
    }

    private static final String InstancePage$lambda$4(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job InstancePage$reload(AppState $state, MutableState<List<InstanceRow>> mutableState) {
        return $state.launch(new GamePagesKt$InstancePage$reload$1($state, mutableState, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x046b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit InstancePage$lambda$7(final com.pymcl.android.ui.state.AppState r56, final androidx.compose.runtime.MutableState r57, final androidx.compose.runtime.MutableState r58, androidx.compose.foundation.layout.ColumnScope r59, androidx.compose.runtime.Composer r60, int r61) {
        /*
            Method dump skipped, instructions count: 1141
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.GamePagesKt.InstancePage$lambda$7(com.pymcl.android.ui.state.AppState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstancePage$lambda$7$0(final AppState $state, final MutableState $rows$delegate, RowScope Section, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Section, "$this$Section");
        ComposerKt.sourceInformation($composer, "C158@9874L308,158@9836L346,162@10226L57,162@10195L88,163@10338L22,163@10296L64,164@10411L12,164@10373L50:GamePages.kt#vz4689");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2120292930, $changed, -1, "com.pymcl.android.ui.pages.InstancePage.<anonymous>.<anonymous> (GamePages.kt:158)");
            }
            BtnKind btnKind = BtnKind.Primary;
            ImageVector add = Ico.INSTANCE.getAdd();
            ComposerKt.sourceInformationMarkerStart($composer, 1787009398, "CC(remember):GamePages.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($state);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda27
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GamePagesKt.InstancePage$lambda$7$0$0$0($state, $rows$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Btn("新建实例", btnKind, add, false, false, null, false, (Function0) objRememberedValue, $composer, 54, 120);
            BtnKind btnKind2 = BtnKind.Normal;
            ComposerKt.sourceInformationMarkerStart($composer, 1787020411, "CC(remember):GamePages.kt#9igjgp");
            boolean zChangedInstance2 = $composer.changedInstance($state);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda28
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GamePagesKt.InstancePage$lambda$7$0$1$0($state);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Btn("导入官方启动器", btnKind2, null, false, false, null, false, (Function0) objRememberedValue2, $composer, 54, 124);
            BtnKind btnKind3 = BtnKind.Normal;
            ImageVector folder = Ico.INSTANCE.getFolder();
            ComposerKt.sourceInformationMarkerStart($composer, 1787023960, "CC(remember):GamePages.kt#9igjgp");
            boolean zChangedInstance3 = $composer.changedInstance($state);
            Object objRememberedValue3 = $composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = new Function0() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda29
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GamePagesKt.InstancePage$lambda$7$0$2$0($state);
                    }
                };
                $composer.updateRememberedValue(obj3);
                objRememberedValue3 = obj3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Btn("打开游戏目录", btnKind3, folder, false, false, null, false, (Function0) objRememberedValue3, $composer, 54, 120);
            BtnKind btnKind4 = BtnKind.Ghost;
            ImageVector refresh = Ico.INSTANCE.getRefresh();
            ComposerKt.sourceInformationMarkerStart($composer, 1787026286, "CC(remember):GamePages.kt#9igjgp");
            boolean zChangedInstance4 = $composer.changedInstance($state);
            Object objRememberedValue4 = $composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object obj4 = new Function0() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda30
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GamePagesKt.InstancePage$lambda$7$0$3$0($state, $rows$delegate);
                    }
                };
                $composer.updateRememberedValue(obj4);
                objRememberedValue4 = obj4;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Btn("刷新", btnKind4, refresh, false, false, null, false, (Function0) objRememberedValue4, $composer, 54, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstancePage$lambda$7$0$0$0(final AppState $state, final MutableState $rows$delegate) {
        $state.open(new DialogSpec.Prompt("新建实例", "实例名称（会创建独立的 .minecraft）", null, new Function1() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GamePagesKt.InstancePage$lambda$7$0$0$0$0($rows$delegate, (String) obj);
            }
        }, new Function1() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GamePagesKt.InstancePage$lambda$7$0$0$0$1($state, $rows$delegate, (String) obj);
            }
        }, 4, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String InstancePage$lambda$7$0$0$0$0(MutableState $rows$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        InputRules inputRules = InputRules.INSTANCE;
        Iterable iterableInstancePage$lambda$1 = InstancePage$lambda$1($rows$delegate);
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterableInstancePage$lambda$1, 10));
        Iterator it2 = iterableInstancePage$lambda$1.iterator();
        while (it2.hasNext()) {
            arrayList.add(((InstanceRow) it2.next()).getName());
        }
        return InputRules.instanceName$default(inputRules, it, (List) arrayList, null, false, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstancePage$lambda$7$0$0$0$1(AppState $state, MutableState $rows$delegate, String n) {
        Intrinsics.checkNotNullParameter(n, "n");
        $state.launch(new GamePagesKt$InstancePage$2$1$1$1$2$1($state, n, $rows$delegate, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstancePage$lambda$7$0$1$0(AppState $state) {
        $state.toast("没找到官方启动器", "未检测到 .minecraft 目录", "warn");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstancePage$lambda$7$0$2$0(AppState $state) {
        AppState.toast$default($state, "已打开", null, null, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstancePage$lambda$7$0$3$0(AppState $state, MutableState $rows$delegate) {
        InstancePage$reload($state, $rows$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstancePage$lambda$7$1$0$0(MutableState $filter$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $filter$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    private static final boolean InstancePage$lambda$7$3$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void InstancePage$lambda$7$3$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstancePage$lambda$7$3$3$0(AppState $state, InstanceRow $r) {
        if (!Intrinsics.areEqual($state.getSelectedInstance(), $r.getName())) {
            $state.setSelectedInstance($r.getName());
            $state.setSelectedVersion("");
            $state.refreshData();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0611 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x053c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit InstancePage$lambda$7$3$4(final com.pymcl.android.ui.state.InstanceRow r66, final com.pymcl.android.ui.state.AppState r67, final androidx.compose.runtime.MutableState r68, final androidx.compose.runtime.MutableState r69, androidx.compose.foundation.layout.RowScope r70, androidx.compose.runtime.Composer r71, int r72) {
        /*
            Method dump skipped, instructions count: 1671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.GamePagesKt.InstancePage$lambda$7$3$4(com.pymcl.android.ui.state.InstanceRow, com.pymcl.android.ui.state.AppState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstancePage$lambda$7$3$4$1$0(AppState $state, InstanceRow $r) {
        $state.navigate(Destination.Launch);
        AppState.startGameFor$default($state, $r.getName(), null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstancePage$lambda$7$3$4$2$0(AppState $state, InstanceRow $r) {
        $state.open(new DialogSpec.Mods($r.getName(), ""));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstancePage$lambda$7$3$4$3$0(AppState $state, InstanceRow $r) {
        $state.open(new DialogSpec.Saves($r.getName(), ""));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstancePage$lambda$7$3$4$4$0$0(MutableState $menu$delegate) {
        InstancePage$lambda$7$3$2($menu$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstancePage$lambda$7$3$4$4$1$0(MutableState $menu$delegate) {
        InstancePage$lambda$7$3$2($menu$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstancePage$lambda$7$3$4$4$2(final MutableState $menu$delegate, AppState $state, final InstanceRow $r, final MutableState $rows$delegate, ColumnScope DropdownMenu, Composer $composer, int $changed) {
        final AppState appState = $state;
        Composer composer = $composer;
        Intrinsics.checkNotNullParameter(DropdownMenu, "$this$DropdownMenu");
        ComposerKt.sourceInformation(composer, "C*193@12538L155,193@12705L2168,193@12521L2353:GamePages.kt#vz4689");
        if (!composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-381839647, $changed, -1, "com.pymcl.android.ui.pages.InstancePage.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GamePages.kt:192)");
            }
            for (final String str : CollectionsKt.listOf((Object[]) new String[]{"打开文件夹", "设为默认实例", "选择 Java…", "挑着更新模组…", "后台检查模组更新", "导出为整合包", "重命名…", "删除实例"})) {
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(710656097, true, new Function2() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GamePagesKt.InstancePage$lambda$7$3$4$4$2$0$0(str, appState, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer, 54);
                ComposerKt.sourceInformationMarkerStart(composer, 1426406441, "CC(remember):GamePages.kt#9igjgp");
                boolean zChanged = composer.changed($menu$delegate) | composer.changed(str) | composer.changedInstance(appState) | composer.changedInstance($r);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda21
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GamePagesKt.InstancePage$lambda$7$3$4$4$2$0$1$0(str, appState, $r, $menu$delegate, $rows$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                AndroidMenu_androidKt.DropdownMenuItem(composableLambdaRememberComposableLambda, (Function0) objRememberedValue, null, null, null, false, null, null, null, composer, 6, TarConstants.XSTAR_MAGIC_OFFSET);
                appState = $state;
                composer = $composer;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstancePage$lambda$7$3$4$4$2$0$0(String $k, AppState $state, Composer $composer, int $changed) {
        long jM7967getInk0d7_KjU;
        ComposerKt.sourceInformation($composer, "C193@12540L151:GamePages.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(710656097, $changed, -1, "com.pymcl.android.ui.pages.InstancePage.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GamePages.kt:193)");
            }
            String strTr = (Intrinsics.areEqual($k, "后台检查模组更新") && $state.getModWatcher().getEnabled()) ? I18nKt.tr($k, new Object[0]) + " ✓" : I18nKt.tr($k, new Object[0]);
            if (Intrinsics.areEqual($k, "删除实例")) {
                $composer.startReplaceGroup(40713223);
                ComposerKt.sourceInformation($composer, "193@12658L6");
                jM7967getInk0d7_KjU = Py.INSTANCE.getColors($composer, 6).m7959getDanger0d7_KjU();
            } else {
                $composer.startReplaceGroup(40713924);
                ComposerKt.sourceInformation($composer, "193@12680L6");
                jM7967getInk0d7_KjU = Py.INSTANCE.getColors($composer, 6).m7967getInk0d7_KjU();
            }
            $composer.endReplaceGroup();
            UiKt.m7603TxtuDo3WH8(strTr, null, true, jM7967getInk0d7_KjU, 0, $composer, 384, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit InstancePage$lambda$7$3$4$4$2$0$1$0(java.lang.String r17, final com.pymcl.android.ui.state.AppState r18, final com.pymcl.android.ui.state.InstanceRow r19, androidx.compose.runtime.MutableState r20, final androidx.compose.runtime.MutableState r21) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.GamePagesKt.InstancePage$lambda$7$3$4$4$2$0$1$0(java.lang.String, com.pymcl.android.ui.state.AppState, com.pymcl.android.ui.state.InstanceRow, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstancePage$lambda$7$3$4$4$2$0$1$0$0(AppState $state, InstanceRow $r, MutableState $rows$delegate) {
        $state.launch(new GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$1$1($state, $r, $rows$delegate, null));
        return Unit.INSTANCE;
    }

    public static final void JavaPage(final AppState state, Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(state, "state");
        Composer $composer2 = $composer.startRestartGroup(224898778);
        ComposerKt.sourceInformation($composer2, "C(JavaPage)230@15152L49,231@15220L33,232@15270L31,233@15321L33,234@15380L39,234@15359L60,235@15435L3882,235@15424L3893:GamePages.kt#vz4689");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= ($changed & 8) == 0 ? $composer2.changed(state) : $composer2.changedInstance(state) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 3) != 2, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(224898778, $dirty2, -1, "com.pymcl.android.ui.pages.JavaPage (GamePages.kt:229)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, 1379362443, "CC(remember):GamePages.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            }
            final MutableState rows$delegate = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1379364603, "CC(remember):GamePages.kt#9igjgp");
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objMutableIntStateOf = SnapshotIntStateKt.mutableIntStateOf(0);
                $composer2.updateRememberedValue(objMutableIntStateOf);
                objRememberedValue2 = objMutableIntStateOf;
            }
            final MutableIntState distro$delegate = (MutableIntState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1379366201, "CC(remember):GamePages.kt#9igjgp");
            Object objRememberedValue3 = $composer2.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue3 = objMutableStateOf$default2;
            }
            final MutableState path$delegate = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1379367835, "CC(remember):GamePages.kt#9igjgp");
            Object objRememberedValue4 = $composer2.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object objMutableIntStateOf2 = SnapshotIntStateKt.mutableIntStateOf(0);
                $composer2.updateRememberedValue(objMutableIntStateOf2);
                objRememberedValue4 = objMutableIntStateOf2;
            }
            final MutableIntState defJava$delegate = (MutableIntState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer2, 1379369729, "CC(remember):GamePages.kt#9igjgp");
            boolean z = ($dirty2 & 14) == 4 || (($dirty2 & 8) != 0 && $composer2.changedInstance(state));
            Object objRememberedValue5 = $composer2.rememberedValue();
            if (z || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                Object obj = (Function2) new GamePagesKt$JavaPage$1$1(state, rows$delegate, null);
                $composer2.updateRememberedValue(obj);
                objRememberedValue5 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, $composer2, 6);
            UiKt.ScrollBody(null, ComposableLambdaKt.rememberComposableLambda(-1334217849, true, new Function3() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return GamePagesKt.JavaPage$lambda$13(state, rows$delegate, distro$delegate, defJava$delegate, path$delegate, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer2, 54), $composer2, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return GamePagesKt.JavaPage$lambda$14(state, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final List<JavaRow> JavaPage$lambda$1(MutableState<List<JavaRow>> mutableState) {
        return mutableState.getValue();
    }

    private static final int JavaPage$lambda$4(MutableIntState $distro$delegate) {
        return $distro$delegate.getIntValue();
    }

    private static final String JavaPage$lambda$7(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final int JavaPage$lambda$10(MutableIntState $defJava$delegate) {
        return $defJava$delegate.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit JavaPage$lambda$13(final AppState $state, final MutableState $rows$delegate, final MutableIntState $distro$delegate, final MutableIntState $defJava$delegate, final MutableState $path$delegate, ColumnScope ScrollBody, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(ScrollBody, "$this$ScrollBody");
        ComposerKt.sourceInformation($composer, "C236@15507L244,236@15445L306,240@15775L1455,261@17240L999,240@15760L2480,297@19281L30:GamePages.kt#vz4689");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1334217849, $changed, -1, "com.pymcl.android.ui.pages.JavaPage.<anonymous> (GamePages.kt:236)");
            }
            UiKt.Section("Java", "游戏按版本挑 Java：1.20.5+ 要 21，1.18+ 要 17，老版本用 8", null, false, ComposableLambdaKt.rememberComposableLambda(1477186581, true, new Function3() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GamePagesKt.JavaPage$lambda$13$0($state, $rows$delegate, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24630, 12);
            m7768TwoPaneAjpBEmI(0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(-674632098, true, new Function3() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GamePagesKt.JavaPage$lambda$13$1($distro$delegate, $state, $rows$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), ComposableLambdaKt.rememberComposableLambda(-1336221571, true, new Function3() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GamePagesKt.JavaPage$lambda$13$2($rows$delegate, $defJava$delegate, $state, $path$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, GL11.GL_AUTO_NORMAL, 3);
            List<JavaRow> r = JavaPage$lambda$1($rows$delegate);
            if (r == null) {
                $composer.startReplaceGroup(2011959836);
                ComposerKt.sourceInformation($composer, "278@18285L21");
                UiKt.Muted("正在扫描系统 Java…", null, false, 0, $composer, 6, 14);
                $composer.endReplaceGroup();
            } else if (r.isEmpty()) {
                $composer.startReplaceGroup(2011961533);
                ComposerKt.sourceInformation($composer, "279@18337L54");
                UiKt.Empty(Ico.INSTANCE.getCoffee(), "没有找到 Java", "点上面「下载」装一个，或扫描系统已有安装", null, $composer, 432, 8);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-2053609256);
                ComposerKt.sourceInformation($composer, "281@18419L40,*283@18513L735,283@18505L743");
                UiKt.Muted(I18nKt.tr("共 {0} 个", Integer.valueOf(r.size())), null, true, 0, $composer, 384, 10);
                for (final JavaRow javaRow : r) {
                    UiKt.RowCard(null, false, null, ComposableLambdaKt.rememberComposableLambda(-1468737344, true, new Function3() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda17
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return GamePagesKt.JavaPage$lambda$13$3$0(javaRow, $state, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    }, $composer, 54), $composer, 3072, 7);
                }
                $composer.endReplaceGroup();
            }
            SpacerKt.Spacer(SizeKt.m771height3ABfNKs(Modifier.INSTANCE, Dp.m7018constructorimpl(60)), $composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit JavaPage$lambda$13$0(final AppState $state, final MutableState $rows$delegate, RowScope Section, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Section, "$this$Section");
        ComposerKt.sourceInformation($composer, "C237@15566L68,237@15521L113,238@15685L56,238@15647L94:GamePages.kt#vz4689");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1477186581, $changed, -1, "com.pymcl.android.ui.pages.JavaPage.<anonymous>.<anonymous> (GamePages.kt:237)");
            }
            BtnKind btnKind = BtnKind.Normal;
            ImageVector search = Ico.INSTANCE.getSearch();
            ComposerKt.sourceInformationMarkerStart($composer, -2057868679, "CC(remember):GamePages.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($state);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GamePagesKt.JavaPage$lambda$13$0$0$0($state, $rows$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Btn("扫描系统 Java", btnKind, search, false, false, null, false, (Function0) objRememberedValue, $composer, 54, 120);
            BtnKind btnKind2 = BtnKind.Ghost;
            ImageVector refresh = Ico.INSTANCE.getRefresh();
            ComposerKt.sourceInformationMarkerStart($composer, -2057864883, "CC(remember):GamePages.kt#9igjgp");
            boolean zChangedInstance2 = $composer.changedInstance($state);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GamePagesKt.JavaPage$lambda$13$0$1$0($state, $rows$delegate);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Btn("刷新", btnKind2, refresh, false, false, null, false, (Function0) objRememberedValue2, $composer, 54, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit JavaPage$lambda$13$0$0$0(AppState $state, MutableState $rows$delegate) {
        $rows$delegate.setValue(null);
        $state.launch(new GamePagesKt$JavaPage$2$1$1$1$1($state, $rows$delegate, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit JavaPage$lambda$13$0$1$0(AppState $state, MutableState $rows$delegate) {
        $state.launch(new GamePagesKt$JavaPage$2$1$2$1$1($state, $rows$delegate, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit JavaPage$lambda$13$1(final MutableIntState $distro$delegate, final AppState $state, final MutableState $rows$delegate, ColumnScope TwoPane, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TwoPane, "$this$TwoPane");
        ComposerKt.sourceInformation($composer, "C241@15819L1401,241@15789L1431:GamePages.kt#vz4689");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-674632098, $changed, -1, "com.pymcl.android.ui.pages.JavaPage.<anonymous>.<anonymous> (GamePages.kt:241)");
            }
            UiKt.m7594CardDzVHIIc(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-254008338, true, new Function3() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda48
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GamePagesKt.JavaPage$lambda$13$1$0($distro$delegate, $state, $rows$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0217 A[LOOP:1: B:30:0x0211->B:32:0x0217, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit JavaPage$lambda$13$1$0(final androidx.compose.runtime.MutableIntState r53, final com.pymcl.android.ui.state.AppState r54, final androidx.compose.runtime.MutableState r55, androidx.compose.foundation.layout.ColumnScope r56, androidx.compose.runtime.Composer r57, int r58) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.GamePagesKt.JavaPage$lambda$13$1$0(androidx.compose.runtime.MutableIntState, com.pymcl.android.ui.state.AppState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit JavaPage$lambda$13$1$0$0(final MutableIntState $distro$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C243@15977L15,243@15901L129:GamePages.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(620564163, $changed, -1, "com.pymcl.android.ui.pages.JavaPage.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GamePages.kt:243)");
            }
            List listListOf = CollectionsKt.listOf((Object[]) new String[]{"Adoptium Temurin", "Azul Zulu", "Microsoft OpenJDK"});
            int iJavaPage$lambda$4 = JavaPage$lambda$4($distro$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, -638290990, "CC(remember):GamePages.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda36
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return GamePagesKt.JavaPage$lambda$13$1$0$0$0$0($distro$delegate, ((Integer) obj2).intValue());
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Combo(listListOf, iJavaPage$lambda$4, (Function1) objRememberedValue, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, false, $composer, 28038, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit JavaPage$lambda$13$1$0$0$0$0(MutableIntState $distro$delegate, int it) {
        $distro$delegate.setIntValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x033c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit JavaPage$lambda$13$1$0$1$0$0$0(final com.pymcl.android.ui.state.AppState r56, final int r57, java.lang.String r58, final androidx.compose.runtime.MutableState r59, androidx.compose.foundation.layout.ColumnScope r60, androidx.compose.runtime.Composer r61, int r62) {
        /*
            Method dump skipped, instructions count: 840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.GamePagesKt.JavaPage$lambda$13$1$0$1$0$0$0(com.pymcl.android.ui.state.AppState, int, java.lang.String, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit JavaPage$lambda$13$1$0$1$0$0$0$0$1$0(final AppState $state, int $major, final MutableState $rows$delegate) {
        if (AppState.runTask$default($state, "Java " + $major, null, "java|" + $major, new Function1() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GamePagesKt.JavaPage$lambda$13$1$0$1$0$0$0$0$1$0$0($state, $rows$delegate, (String) obj);
            }
        }, new GamePagesKt$JavaPage$2$2$1$2$1$1$1$1$2$1$2($state, $major, null), 2, null)) {
            AppState.toast$default($state, "已加入队列", I18nKt.tr("进度看下载任务", new Object[0]), null, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit JavaPage$lambda$13$1$0$1$0$0$0$0$1$0$0(AppState $state, MutableState $rows$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $state.launch(new GamePagesKt$JavaPage$2$2$1$2$1$1$1$1$2$1$1$1($state, $rows$delegate, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit JavaPage$lambda$13$2(final MutableState $rows$delegate, final MutableIntState $defJava$delegate, final AppState $state, final MutableState $path$delegate, ColumnScope TwoPane, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TwoPane, "$this$TwoPane");
        ComposerKt.sourceInformation($composer, "C262@17284L945,262@17254L975:GamePages.kt#vz4689");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1336221571, $changed, -1, "com.pymcl.android.ui.pages.JavaPage.<anonymous>.<anonymous> (GamePages.kt:262)");
            }
            UiKt.m7594CardDzVHIIc(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-915597811, true, new Function3() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda75
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GamePagesKt.JavaPage$lambda$13$2$0($rows$delegate, $defJava$delegate, $state, $path$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit JavaPage$lambda$13$2$0(final MutableState $rows$delegate, final MutableIntState $defJava$delegate, final AppState $state, final MutableState $path$delegate, ColumnScope Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C263@17302L8,264@17327L113,265@17515L196,265@17457L254,268@17787L428,268@17728L487:GamePages.kt#vz4689");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-915597811, $changed, -1, "com.pymcl.android.ui.pages.JavaPage.<anonymous>.<anonymous>.<anonymous> (GamePages.kt:263)");
            }
            UiKt.H3("实例", null, false, $composer, 6, 6);
            UiKt.m7596FieldTN_CM5M("实例", null, Dp.m7018constructorimpl(90), false, ComposableSingletons$GamePagesKt.INSTANCE.m7738getLambda$41025310$PyMCL_Android_app_debug(), $composer, 24966, 10);
            UiKt.m7596FieldTN_CM5M("默认 Java", "「自动选择」由启动器按游戏版本匹配", Dp.m7018constructorimpl(90), false, ComposableLambdaKt.rememberComposableLambda(-1354161205, true, new Function2() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GamePagesKt.JavaPage$lambda$13$2$0$0($rows$delegate, $defJava$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 25014, 8);
            UiKt.m7596FieldTN_CM5M("自定义路径", "填绝对路径后点右边按钮，会先做一次规范化", Dp.m7018constructorimpl(90), false, ComposableLambdaKt.rememberComposableLambda(-1471797974, true, new Function2() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GamePagesKt.JavaPage$lambda$13$2$0$1($state, $path$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 25014, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit JavaPage$lambda$13$2$0$0(MutableState $rows$delegate, final MutableIntState $defJava$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C266@17639L16,266@17537L156:GamePages.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1354161205, $changed, -1, "com.pymcl.android.ui.pages.JavaPage.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GamePages.kt:266)");
            }
            List listListOf = CollectionsKt.listOf(I18nKt.tr(LaunchConfigLogic.JAVA_AUTO, new Object[0]));
            Iterable iterableJavaPage$lambda$1 = JavaPage$lambda$1($rows$delegate);
            if (iterableJavaPage$lambda$1 == null) {
                iterableJavaPage$lambda$1 = CollectionsKt.emptyList();
            }
            Iterable<JavaRow> iterable = iterableJavaPage$lambda$1;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (JavaRow javaRow : iterable) {
                arrayList.add("Java " + javaRow.getMajor() + " (" + javaRow.getVersion() + ")");
            }
            List listPlus = CollectionsKt.plus((Collection) listListOf, arrayList);
            int iJavaPage$lambda$10 = JavaPage$lambda$10($defJava$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, 26176667, "CC(remember):GamePages.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda74
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return GamePagesKt.JavaPage$lambda$13$2$0$0$1$0($defJava$delegate, ((Integer) obj2).intValue());
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Combo(listPlus, iJavaPage$lambda$10, (Function1) objRememberedValue, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, false, $composer, 28032, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit JavaPage$lambda$13$2$0$0$1$0(MutableIntState $defJava$delegate, int it) {
        $defJava$delegate.setIntValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0243  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit JavaPage$lambda$13$2$0$1(final com.pymcl.android.ui.state.AppState r46, final androidx.compose.runtime.MutableState r47, androidx.compose.runtime.Composer r48, int r49) {
        /*
            Method dump skipped, instructions count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.GamePagesKt.JavaPage$lambda$13$2$0$1(com.pymcl.android.ui.state.AppState, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit JavaPage$lambda$13$2$0$1$0$0$0(MutableState $path$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $path$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit JavaPage$lambda$13$2$0$1$0$1$0(AppState $state, MutableState $path$delegate) {
        if (StringsKt.isBlank(JavaPage$lambda$7($path$delegate))) {
            $state.toast("先填路径", "填一个 java.exe 的绝对路径", "warn");
        } else {
            AppState.toast$default($state, "已规范化", null, null, 6, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit JavaPage$lambda$13$3$0(JavaRow $j, final AppState $state, RowScope RowCard, Composer $composer, int $changed) {
        Function0 function0;
        Function0 function02;
        Intrinsics.checkNotNullParameter(RowCard, "$this$RowCard");
        ComposerKt.sourceInformation($composer, "C284@18535L37,285@18593L394,291@19058L24,291@19008L74,292@19131L22,292@19103L50,293@19208L22,293@19174L56:GamePages.kt#vz4689");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(RowCard) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if (!$composer.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1468737344, $dirty2, -1, "com.pymcl.android.ui.pages.JavaPage.<anonymous>.<anonymous>.<anonymous> (GamePages.kt:284)");
            }
            UiKt.m7600LetterTileuFdPcIQ(String.valueOf($j.getMajor()), Dp.m7018constructorimpl(36), false, $composer, 48, 4);
            Modifier modifierWeight$default = RowScope.weight$default(RowCard, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierWeight$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((0 << 3) & 112) << 6) & User32.WM_PENWINFIRST) | 6;
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
            Updater.m3839setimpl(composerM3832constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3839setimpl(composerM3832constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3832constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3832constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3832constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3832constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3839setimpl(composerM3832constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i3 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -221410225, "C286@18647L267,289@18939L26:GamePages.kt#vz4689");
            Arrangement.Horizontal horizontalM619spacedBy0680j_4 = Arrangement.INSTANCE.m619spacedBy0680j_4(Dp.m7018constructorimpl(6));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            Modifier modifier = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalM619spacedBy0680j_4, centerVertically, $composer, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifier);
            Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = ((((432 << 3) & 112) << 6) & User32.WM_PENWINFIRST) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function02 = constructor2;
                $composer.createNode(function02);
            } else {
                function02 = constructor2;
                $composer.useNode();
            }
            Composer composerM3832constructorimpl2 = Updater.m3832constructorimpl($composer);
            Updater.m3839setimpl(composerM3832constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3839setimpl(composerM3832constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3832constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3832constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM3832constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3832constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3839setimpl(composerM3832constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = (i4 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i6 = ((432 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1635880098, "C287@18781L35,287@18818L42:GamePages.kt#vz4689");
            UiKt.H3("Java " + $j.getVersion(), null, true, $composer, 384, 2);
            UiKt.Tag($j.getVendor(), TagTone.Neutral, true, $composer, 432, 0);
            if ($j.isDefault()) {
                $composer.startReplaceGroup(-1299693277);
                ComposerKt.sourceInformation($composer, "287@18879L9");
                UiKt.Tag("默认", null, false, $composer, 6, 6);
            } else {
                $composer.startReplaceGroup(-1635777272);
            }
            $composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Mono($j.getPath(), null, 1, $composer, 384, 2);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            BtnKind btnKind = BtnKind.Soft;
            boolean z = !$j.isDefault();
            ComposerKt.sourceInformationMarkerStart($composer, 1587670264, "CC(remember):GamePages.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($state);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda76
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GamePagesKt.JavaPage$lambda$13$3$0$1$0($state);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Btn("设为默认", btnKind, null, z, false, null, false, (Function0) objRememberedValue, $composer, 54, 116);
            BtnKind btnKind2 = BtnKind.Normal;
            ComposerKt.sourceInformationMarkerStart($composer, 1587672598, "CC(remember):GamePages.kt#9igjgp");
            boolean zChangedInstance2 = $composer.changedInstance($state);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda77
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GamePagesKt.JavaPage$lambda$13$3$0$2$0($state);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Btn("给本实例", btnKind2, null, false, false, null, false, (Function0) objRememberedValue2, $composer, 54, 124);
            ImageVector folder = Ico.INSTANCE.getFolder();
            String strTr = I18nKt.tr("打开所在目录", new Object[0]);
            ComposerKt.sourceInformationMarkerStart($composer, 1587675062, "CC(remember):GamePages.kt#9igjgp");
            boolean zChangedInstance3 = $composer.changedInstance($state);
            Object objRememberedValue3 = $composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = new Function0() { // from class: com.pymcl.android.ui.pages.GamePagesKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GamePagesKt.JavaPage$lambda$13$3$0$3$0($state);
                    }
                };
                $composer.updateRememberedValue(obj3);
                objRememberedValue3 = obj3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.m7597IconBtndrOMvmE(folder, strTr, null, (Function0) objRememberedValue3, $composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit JavaPage$lambda$13$3$0$1$0(AppState $state) {
        AppState.toast$default($state, "已设为默认", null, null, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit JavaPage$lambda$13$3$0$2$0(AppState $state) {
        AppState.toast$default($state, "已保存", null, null, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit JavaPage$lambda$13$3$0$3$0(AppState $state) {
        AppState.toast$default($state, "已打开", null, null, 6, null);
        return Unit.INSTANCE;
    }

    private static final void unusedLazy() {
    }
}
