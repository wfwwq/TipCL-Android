package com.pymcl.android.ui.pages;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.unit.Dp;
import com.pymcl.ai.AiMode;
import com.pymcl.ai.AiSettings;
import com.pymcl.ai.Permission;
import com.pymcl.android.data.AiBridge;
import com.pymcl.android.data.AiSettingsForm;
import com.pymcl.android.data.LauncherPrefs;
import com.pymcl.android.data.SettingsExtrasIO;
import com.pymcl.android.data.SettingsLogic;
import com.pymcl.android.ui.components.BtnKind;
import com.pymcl.android.ui.components.Ico;
import com.pymcl.android.ui.components.UiKt;
import com.pymcl.android.ui.i18n.I18nKt;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.DialogSpec;
import com.pymcl.android.ui.state.UiSettings;
import com.pymcl.runtime.settings.CrossProcessPrefs;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.windows.User32;
import org.lwjgl.util.shaderc.SPV;

/* compiled from: SettingsPage.kt */
@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007b\u0002\b\u0005b\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b¢\u0006\u0002\u0010\u0004\u001aQ\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0010H\u0003b\u0002\b\u0005b\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014¢\u0006\u0002\u0010\u0011\u001a+\u0010\u0015\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0003b\u0002\b\u0005b\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b¢\u0006\u0002\u0010\u0016¨\u0006\u0017²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u008e\u0002²\u0006\n\u0010\u001a\u001a\u00020\u001bX\u008a\u008e\u0002²\u0006\n\u0010\u001c\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u0010\u001e\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u0010\u001f\u001a\u00020\u0019X\u008a\u008e\u0002²\u0006\n\u0010 \u001a\u00020\u0019X\u008a\u008e\u0002²\u0006\n\u0010!\u001a\u00020\"X\u008a\u008e\u0002²\u0006\f\u0010#\u001a\u0004\u0018\u00010$X\u008a\u008e\u0002²\u0006\n\u0010%\u001a\u00020&X\u008a\u008e\u0002²\u0006\u0010\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000b0(X\u008a\u008e\u0002²\u0006\f\u0010)\u001a\u0004\u0018\u00010\u000bX\u008a\u008e\u0002²\u0006\u0018\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000b\u0018\u00010+X\u008a\u008e\u0002²\u0006\n\u0010,\u001a\u00020\u0019X\u008a\u008e\u0002"}, d2 = {"SettingsPage", "", "state", "Lcom/pymcl/android/ui/state/AppState;", "(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/runtime/ComposableTarget;", "applier", "androidx.compose.ui.UiComposable", "Group", "title", "", "sub", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/runtime/ComposableInferredTarget;", "scheme", "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]", "AiSettingsGroup", "(Landroidx/compose/foundation/layout/ColumnScope;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/Composer;I)V", "PyMCL-Android:app_debug", "saving", "", "savedWallpaper", "Lcom/pymcl/android/data/SettingsLogic$WallpaperSnap;", "widthText", "heightText", "limitText", "importing", "autoIme", "padMode", "", "base", "Lcom/pymcl/ai/AiSettings;", "form", "Lcom/pymcl/android/data/AiSettingsForm;", "aiModels", "", "busy", "lastResult", "Lkotlin/Pair;", "showDetail"}, k = 2, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes22.dex */
public final class SettingsPageKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiSettingsGroup$lambda$22(ColumnScope columnScope, AppState appState, int i, Composer composer, int i2) {
        AiSettingsGroup(columnScope, appState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiSettingsGroup$lambda$23$0(ColumnScope columnScope, AppState appState, int i, Composer composer, int i2) {
        AiSettingsGroup(columnScope, appState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiSettingsGroup$lambda$36(ColumnScope columnScope, AppState appState, int i, Composer composer, int i2) {
        AiSettingsGroup(columnScope, appState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Group$lambda$1(String str, String str2, Function3 function3, int i, int i2, Composer composer, int i3) {
        Group(str, str2, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$21(AppState appState, int i, Composer composer, int i2) {
        SettingsPage(appState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void SettingsPage(final AppState state, Composer $composer, final int $changed) {
        Composer $composer2;
        boolean z;
        int maxMem;
        Context sctx;
        MutableState saving$delegate;
        MutableState savedWallpaper$delegate;
        UiSettings s;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer $composer3 = $composer.startRestartGroup(-639702863);
        ComposerKt.sourceInformation($composer3, "C(SettingsPage)25@998L7,27@1072L75,28@1165L81,29@1265L34,30@1326L73,32@1457L47,33@1527L48,34@1597L52,35@1702L379,35@1654L427,59@3281L14538,59@3270L14549:SettingsPage.kt#vz4689");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= ($changed & 8) == 0 ? $composer3.changed(state) : $composer3.changedInstance(state) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute(($dirty2 & 3) != 2, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-639702863, $dirty2, -1, "com.pymcl.android.ui.pages.SettingsPage (SettingsPage.kt:22)");
            }
            UiSettings s2 = state.getSettings();
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Context sctx2 = (Context) objConsume;
            ComposerKt.sourceInformationMarkerStart($composer3, -574119556, "CC(remember):SettingsPage.kt#9igjgp");
            boolean zChanged = $composer3.changed(sctx2);
            Object objRememberedValue = $composer3.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                z = false;
                Object objValueOf = Long.valueOf(SettingsExtrasIO.INSTANCE.totalMemMb(sctx2));
                $composer3.updateRememberedValue(objValueOf);
                objRememberedValue = objValueOf;
            } else {
                z = false;
            }
            final long totalMem = ((Number) objRememberedValue).longValue();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -574116574, "CC(remember):SettingsPage.kt#9igjgp");
            boolean zChanged2 = $composer3.changed(totalMem);
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objValueOf2 = Integer.valueOf(SettingsLogic.INSTANCE.maxMemoryMb(totalMem));
                $composer3.updateRememberedValue(objValueOf2);
                objRememberedValue2 = objValueOf2;
            }
            int maxMem2 = ((Number) objRememberedValue2).intValue();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -574113421, "CC(remember):SettingsPage.kt#9igjgp");
            Object objRememberedValue3 = $composer3.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                maxMem = maxMem2;
                Boolean boolValueOf = Boolean.valueOf(z);
                sctx = sctx2;
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(boolValueOf, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue3 = objMutableStateOf$default;
            } else {
                maxMem = maxMem2;
                sctx = sctx2;
            }
            MutableState saving$delegate2 = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -574111430, "CC(remember):SettingsPage.kt#9igjgp");
            Object objRememberedValue4 = $composer3.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                saving$delegate = saving$delegate2;
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(SettingsLogic.INSTANCE.snap(s2), null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue4 = objMutableStateOf$default2;
            } else {
                saving$delegate = saving$delegate2;
            }
            MutableState savedWallpaper$delegate2 = (MutableState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -574107264, "CC(remember):SettingsPage.kt#9igjgp");
            Object objRememberedValue5 = $composer3.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                savedWallpaper$delegate = savedWallpaper$delegate2;
                Object objMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(String.valueOf(s2.getWidth()), null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default3);
                objRememberedValue5 = objMutableStateOf$default3;
            } else {
                savedWallpaper$delegate = savedWallpaper$delegate2;
            }
            final MutableState widthText$delegate = (MutableState) objRememberedValue5;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -574105023, "CC(remember):SettingsPage.kt#9igjgp");
            Object objRememberedValue6 = $composer3.rememberedValue();
            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(String.valueOf(s2.getHeight()), null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default4);
                objRememberedValue6 = objMutableStateOf$default4;
            }
            final MutableState heightText$delegate = (MutableState) objRememberedValue6;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -574102779, "CC(remember):SettingsPage.kt#9igjgp");
            Object objRememberedValue7 = $composer3.rememberedValue();
            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(String.valueOf(s2.getSpeedLimit()), null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default5);
                objRememberedValue7 = objMutableStateOf$default5;
            }
            final MutableState limitText$delegate = (MutableState) objRememberedValue7;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Integer numValueOf = Integer.valueOf(s2.getWidth());
            Integer numValueOf2 = Integer.valueOf(s2.getHeight());
            Integer numValueOf3 = Integer.valueOf(s2.getSpeedLimit());
            ComposerKt.sourceInformationMarkerStart($composer3, -574099092, "CC(remember):SettingsPage.kt#9igjgp");
            boolean zChangedInstance = $composer3.changedInstance(s2);
            Object objRememberedValue8 = $composer3.rememberedValue();
            if (zChangedInstance || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                s = s2;
                Object obj = (Function2) new SettingsPageKt$SettingsPage$1$1(s, widthText$delegate, heightText$delegate, limitText$delegate, null);
                $composer3.updateRememberedValue(obj);
                objRememberedValue8 = obj;
            } else {
                s = s2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(numValueOf, numValueOf2, numValueOf3, (Function2) objRememberedValue8, $composer3, 0);
            $composer2 = $composer3;
            final Context sctx3 = sctx;
            final UiSettings s3 = s;
            final int maxMem3 = maxMem;
            final MutableState saving$delegate3 = saving$delegate;
            final MutableState savedWallpaper$delegate3 = savedWallpaper$delegate;
            UiKt.ScrollBody(null, ComposableLambdaKt.rememberComposableLambda(1798567780, true, new Function3() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda67
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return SettingsPageKt.SettingsPage$lambda$20(sctx3, state, maxMem3, saving$delegate3, widthText$delegate, heightText$delegate, savedWallpaper$delegate3, s3, limitText$delegate, totalMem, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer2, 54), $composer2, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda68
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return SettingsPageKt.SettingsPage$lambda$21(state, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final boolean SettingsPage$lambda$3(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SettingsPage$lambda$4(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final SettingsLogic.WallpaperSnap SettingsPage$lambda$6(MutableState<SettingsLogic.WallpaperSnap> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SettingsPage$lambda$9(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SettingsPage$lambda$12(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SettingsPage$lambda$15(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final void SettingsPage$saveAll(AppState $state, int maxMem, MutableState<Boolean> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, Context sctx, MutableState<SettingsLogic.WallpaperSnap> mutableState4) {
        Object obj;
        if (SettingsPage$lambda$3(mutableState)) {
            return;
        }
        Iterator it = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(SettingsPage$lambda$9(mutableState2), "宽度"), TuplesKt.to(SettingsPage$lambda$12(mutableState3), "高度")}).iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (SettingsLogic.parseIntField$default(SettingsLogic.INSTANCE, (String) ((Pair) next).getFirst(), 0, 2, null) == null) {
                obj = next;
                break;
            }
        }
        Pair blank = (Pair) obj;
        if (blank != null) {
            $state.toast("没有保存", I18nKt.tr("默认分辨率的{0}要填数字", I18nKt.tr((String) blank.getSecond(), new Object[0])), "error");
            return;
        }
        SettingsLogic.Validation v = SettingsLogic.INSTANCE.validate($state.getSettings(), maxMem);
        if (!v.getOk()) {
            $state.toast("没有保存", CollectionsKt.joinToString$default(v.getProblems(), StringUtils.LF, null, null, 0, null, new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda81
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SettingsPageKt.SettingsPage$saveAll$lambda$19((String) obj2);
                }
            }, 30, null), "error");
        } else {
            SettingsPage$lambda$4(mutableState, true);
            $state.launch(new SettingsPageKt$SettingsPage$saveAll$2($state, v, sctx, mutableState4, mutableState, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence SettingsPage$saveAll$lambda$19(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return I18nKt.tr(it, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20(final Context $sctx, final AppState $state, final int $maxMem, final MutableState $saving$delegate, final MutableState $widthText$delegate, final MutableState $heightText$delegate, final MutableState $savedWallpaper$delegate, final UiSettings $s, final MutableState $limitText$delegate, final long $totalMem, ColumnScope ScrollBody, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(ScrollBody, "$this$ScrollBody");
        ComposerKt.sourceInformation($composer, "C60@3335L390,60@3291L434,67@3746L2522,67@3734L2534,92@6438L3276,92@6388L3326,127@9723L249,130@9993L1375,130@9981L1387,139@11389L2381,139@11377L2393,155@13821L1884,155@13779L1926,182@15726L433,182@15714L445,188@16183L26,188@16168L41,189@16231L1543,189@16218L1556,201@17783L30:SettingsPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1798567780, $changed, -1, "com.pymcl.android.ui.pages.SettingsPage.<anonymous> (SettingsPage.kt:60)");
            }
            UiKt.Section("设置", "改动在点「保存设置」后一次性写入后端；外观项随点随看", null, false, ComposableLambdaKt.rememberComposableLambda(-699122922, true, new Function3() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SettingsPageKt.SettingsPage$lambda$20$0($sctx, $state, $maxMem, $saving$delegate, $widthText$delegate, $heightText$delegate, $savedWallpaper$delegate, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24630, 12);
            Group("外观", null, ComposableLambdaKt.rememberComposableLambda(-1790532446, true, new Function3() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda28
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SettingsPageKt.SettingsPage$lambda$20$1($s, $state, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 390, 2);
            Group("壁纸", "图片壁纸（jpg/png/webp）；点「选择图片…」或填写本机路径", ComposableLambdaKt.rememberComposableLambda(931364171, true, new Function3() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda29
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SettingsPageKt.SettingsPage$lambda$20$2($s, $state, $sctx, $savedWallpaper$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 438, 0);
            Group("主题包", "安卓版暂不支持主题包（PC 的 .pymcltheme 导入/导出）；外观与壁纸设置会随「保存设置」记住", ComposableSingletons$SettingsPageKt.INSTANCE.m7740getLambda$1010814294$PyMCL_Android_app_debug(), $composer, 438, 0);
            Group("下载", null, ComposableLambdaKt.rememberComposableLambda(1341974537, true, new Function3() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda30
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SettingsPageKt.SettingsPage$lambda$20$3($s, $state, $limitText$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 390, 2);
            Group("游戏", null, ComposableLambdaKt.rememberComposableLambda(-600203928, true, new Function3() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda31
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SettingsPageKt.SettingsPage$lambda$20$4($maxMem, $s, $state, $totalMem, $widthText$delegate, $heightText$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 390, 2);
            Group("游戏内操作", "这几项点了就生效（写入本机，不随「保存设置」）", ComposableLambdaKt.rememberComposableLambda(1752584903, true, new Function3() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda32
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SettingsPageKt.SettingsPage$lambda$20$5($state, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 438, 0);
            Group("存储", null, ComposableLambdaKt.rememberComposableLambda(-189593562, true, new Function3() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda34
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SettingsPageKt.SettingsPage$lambda$20$6($s, $state, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 390, 2);
            Group("AI 助手", null, ComposableLambdaKt.rememberComposableLambda(-2131772027, true, new Function3() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda35
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SettingsPageKt.SettingsPage$lambda$20$7($state, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 390, 2);
            Group("启动器", null, ComposableLambdaKt.rememberComposableLambda(221016804, true, new Function3() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda36
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SettingsPageKt.SettingsPage$lambda$20$8($s, $state, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 390, 2);
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
    public static final Unit SettingsPage$lambda$20$0(final Context $sctx, final AppState $state, final int $maxMem, final MutableState $saving$delegate, final MutableState $widthText$delegate, final MutableState $heightText$delegate, final MutableState $savedWallpaper$delegate, final RowScope Section, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Section, "$this$Section");
        ComposerKt.sourceInformation($composer, "C61@3377L229,61@3349L257,65@3702L13,65@3619L96:SettingsPage.kt#vz4689");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(Section) ? 4 : 2;
        }
        if ($composer.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-699122922, $dirty, -1, "com.pymcl.android.ui.pages.SettingsPage.<anonymous>.<anonymous> (SettingsPage.kt:61)");
            }
            BtnKind btnKind = BtnKind.Normal;
            ComposerKt.sourceInformationMarkerStart($composer, -1842228293, "CC(remember):SettingsPage.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($sctx) | (($dirty & 14) == 4) | $composer.changedInstance($state);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda143
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SettingsPageKt.SettingsPage$lambda$20$0$0$0(Section, $state, $sctx);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Btn("检查更新", btnKind, null, false, false, null, false, (Function0) objRememberedValue, $composer, 54, 124);
            String str = SettingsPage$lambda$3($saving$delegate) ? "保存中…" : "保存设置";
            BtnKind btnKind2 = BtnKind.Primary;
            ImageVector check = Ico.INSTANCE.getCheck();
            boolean z = !SettingsPage$lambda$3($saving$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, -1842218109, "CC(remember):SettingsPage.kt#9igjgp");
            boolean zChangedInstance2 = $composer.changedInstance($state) | $composer.changed($maxMem) | $composer.changedInstance($sctx);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda145
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SettingsPageKt.SettingsPage$lambda$20$0$1$0($state, $maxMem, $saving$delegate, $widthText$delegate, $heightText$delegate, $sctx, $savedWallpaper$delegate);
                    }
                };
                $composer.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Btn(str, btnKind2, check, z, false, null, false, (Function0) objRememberedValue2, $composer, 48, 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$0$0$0(RowScope $this_Section, AppState $state, Context $sctx) {
        Object objM8116constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl($sctx.getPackageManager().getPackageInfo($sctx.getPackageName(), 0).versionName);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
            objM8116constructorimpl = null;
        }
        String ver = (String) objM8116constructorimpl;
        if (ver == null) {
            ver = "?";
        }
        $state.toast(I18nKt.tr("当前版本 {0}", ver), "安卓版暂未接入在线更新检查，新版本请到发布页下载", "info");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$0$1$0(AppState $state, int $maxMem, MutableState $saving$delegate, MutableState $widthText$delegate, MutableState $heightText$delegate, Context $sctx, MutableState $savedWallpaper$delegate) {
        SettingsPage$saveAll($state, $maxMem, $saving$delegate, $widthText$delegate, $heightText$delegate, $sctx, $savedWallpaper$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$1(final UiSettings $s, final AppState $state, ColumnScope Group, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Group, "$this$Group");
        ComposerKt.sourceInformation($composer, "C68@3794L33,68@3760L67,69@3871L633,69@3840L664,79@4544L101,79@4517L128,80@4673L109,80@4658L124,81@4896L273,81@4795L374,82@5236L35,82@5182L89,85@5630L41,85@5419L252,86@5762L296,86@5684L374,87@6106L41,87@6071L76,88@6174L84,88@6160L98:SettingsPage.kt#vz4689");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1790532446, $changed, -1, "com.pymcl.android.ui.pages.SettingsPage.<anonymous>.<anonymous> (SettingsPage.kt:68)");
            }
            boolean dark = $s.getDark();
            ComposerKt.sourceInformationMarkerStart($composer, 1580206659, "CC(remember):SettingsPage.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($state);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda86
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsPageKt.SettingsPage$lambda$20$1$0$0($state, ((Boolean) obj2).booleanValue());
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.SwitchRow("深色模式", dark, "立即生效", false, (Function1) objRememberedValue, $composer, 390, 8);
            UiKt.m7596FieldTN_CM5M("主题色", "点击圆圈即时预览，保存后记住", 0.0f, false, ComposableLambdaKt.rememberComposableLambda(-2090946643, true, new Function2() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda87
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return SettingsPageKt.SettingsPage$lambda$20$1$1($s, $state, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24630, 12);
            UiKt.m7596FieldTN_CM5M("界面背景", "预设色调，立即预览", 0.0f, false, ComposableLambdaKt.rememberComposableLambda(-1223187932, true, new Function2() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda88
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return SettingsPageKt.SettingsPage$lambda$20$1$2($s, $state, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24630, 12);
            UiKt.m7596FieldTN_CM5M("卡片与控件", null, 0.0f, false, ComposableLambdaKt.rememberComposableLambda(31594085, true, new Function2() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda90
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return SettingsPageKt.SettingsPage$lambda$20$1$3($s, $state, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24582, 14);
            UiKt.m7596FieldTN_CM5M("卡片圆角", SettingsLogic.INSTANCE.cardRadiusEnabled($s) ? null : "选了「直角」时不生效", 0.0f, false, ComposableLambdaKt.rememberComposableLambda(1286376102, true, new Function2() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda91
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return SettingsPageKt.SettingsPage$lambda$20$1$4($s, $state, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24582, 12);
            boolean motion = $s.getMotion();
            ComposerKt.sourceInformationMarkerStart($composer, 1580252805, "CC(remember):SettingsPage.kt#9igjgp");
            boolean zChangedInstance2 = $composer.changedInstance($state);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda92
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return SettingsPageKt.SettingsPage$lambda$20$1$5$0($state, ((Boolean) obj3).booleanValue());
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.SwitchRow("界面动画", motion, "换页过渡、进度条、悬浮等动效；关闭则全部瞬时", false, (Function1) objRememberedValue2, $composer, 390, 8);
            final boolean flyOk = false;
            boolean flyAnimation = $s.getFlyAnimation();
            ComposerKt.sourceInformationMarkerStart($composer, 1580265419, "CC(remember):SettingsPage.kt#9igjgp");
            boolean zChangedInstance3 = $composer.changedInstance($state);
            Object objRememberedValue3 = $composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda93
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        return SettingsPageKt.SettingsPage$lambda$20$1$6$0($state, ((Boolean) obj4).booleanValue());
                    }
                };
                $composer.updateRememberedValue(obj3);
                objRememberedValue3 = obj3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.SwitchRow("下载飞入动画", flyAnimation, "安卓版暂无此动画，此项只与 PC 配置同步", false, (Function1) objRememberedValue3, $composer, 6, 0);
            UiKt.m7596FieldTN_CM5M("飞入动画时长", "安卓版暂无此动画，此项只与 PC 配置同步", 0.0f, false, ComposableLambdaKt.rememberComposableLambda(-1753809177, true, new Function2() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda94
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return SettingsPageKt.SettingsPage$lambda$20$1$7($s, $state, flyOk, (Composer) obj4, ((Integer) obj5).intValue());
                }
            }, $composer, 54), $composer, 24582, 12);
            boolean sidebarFrost = $s.getSidebarFrost();
            ComposerKt.sourceInformationMarkerStart($composer, 1580280651, "CC(remember):SettingsPage.kt#9igjgp");
            boolean zChangedInstance4 = $composer.changedInstance($state);
            Object objRememberedValue4 = $composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object obj4 = new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda95
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        return SettingsPageKt.SettingsPage$lambda$20$1$8$0($state, ((Boolean) obj5).booleanValue());
                    }
                };
                $composer.updateRememberedValue(obj4);
                objRememberedValue4 = obj4;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.SwitchRow("侧栏毛玻璃", sidebarFrost, null, false, (Function1) objRememberedValue4, $composer, 6, 12);
            UiKt.m7596FieldTN_CM5M("侧栏排法", null, 0.0f, false, ComposableLambdaKt.rememberComposableLambda(-499027160, true, new Function2() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda96
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    return SettingsPageKt.SettingsPage$lambda$20$1$9($s, $state, (Composer) obj5, ((Integer) obj6).intValue());
                }
            }, $composer, 54), $composer, 24582, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$1$0$0(AppState $state, final boolean v) {
        $state.updateSettings(new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda125
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.SettingsPage$lambda$20$1$0$0$0(v, (UiSettings) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings SettingsPage$lambda$20$1$0$0$0(boolean $v, UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UiSettings.copy$default(it, $v, 0, null, 0, 0, false, 0, false, false, 0, false, 0, null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, 0, 0, 0, null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, 0, false, -2, SPV.kDefaultMaxIdBound, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x040b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit SettingsPage$lambda$20$1$1(com.pymcl.android.ui.state.UiSettings r70, com.pymcl.android.ui.state.AppState r71, androidx.compose.runtime.Composer r72, int r73) {
        /*
            Method dump skipped, instructions count: 1045
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.SettingsPageKt.SettingsPage$lambda$20$1$1(com.pymcl.android.ui.state.UiSettings, com.pymcl.android.ui.state.AppState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$1$1$0$0$0$0(final int $i, AppState $state) {
        $state.updateSettings(new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda54
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.SettingsPage$lambda$20$1$1$0$0$0$0$0($i, (UiSettings) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings SettingsPage$lambda$20$1$1$0$0$0$0$0(int $i, UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UiSettings.copy$default(it, false, $i, null, 0, 0, false, 0, false, false, 0, false, 0, null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, 0, 0, 0, null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, 0, false, -3, SPV.kDefaultMaxIdBound, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$1$2(UiSettings $s, final AppState $state, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C79@4603L39,79@4546L97:SettingsPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1223187932, $changed, -1, "com.pymcl.android.ui.pages.SettingsPage.<anonymous>.<anonymous>.<anonymous> (SettingsPage.kt:79)");
            }
            List listListOf = CollectionsKt.listOf((Object[]) new String[]{"默认", "护眼绿", "暖米", "雾蓝"});
            int background = $s.getBackground();
            ComposerKt.sourceInformationMarkerStart($composer, 1337438379, "CC(remember):SettingsPage.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($state);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda33
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsPageKt.SettingsPage$lambda$20$1$2$0$0($state, ((Integer) obj2).intValue());
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Segmented(listListOf, background, (Function1) objRememberedValue, false, $composer, 6, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$1$2$0$0(AppState $state, final int v) {
        $state.updateSettings(new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda82
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.SettingsPage$lambda$20$1$2$0$0$0(v, (UiSettings) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings SettingsPage$lambda$20$1$2$0$0$0(int $v, UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UiSettings.copy$default(it, false, 0, null, $v, 0, false, 0, false, false, 0, false, 0, null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, 0, 0, 0, null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, 0, false, -9, SPV.kDefaultMaxIdBound, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$1$3(UiSettings uiSettings, final AppState appState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C80@4734L45,80@4675L105:SettingsPage.kt#vz4689");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(31594085, i, -1, "com.pymcl.android.ui.pages.SettingsPage.<anonymous>.<anonymous>.<anonymous> (SettingsPage.kt:80)");
            }
            List listListOf = CollectionsKt.listOf((Object[]) new String[]{"圆角", "直角"});
            boolean squareCards = uiSettings.getSquareCards();
            ComposerKt.sourceInformationMarkerStart(composer, 297146610, "CC(remember):SettingsPage.kt#9igjgp");
            boolean zChangedInstance = composer.changedInstance(appState);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Function1 function1 = new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda121
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SettingsPageKt.SettingsPage$lambda$20$1$3$0$0(appState, ((Integer) obj).intValue());
                    }
                };
                composer.updateRememberedValue(function1);
                objRememberedValue = function1;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            UiKt.Segmented(listListOf, squareCards ? 1 : 0, (Function1) objRememberedValue, false, composer, 6, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$1$3$0$0(AppState $state, final int v) {
        $state.updateSettings(new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda51
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.SettingsPage$lambda$20$1$3$0$0$0(v, (UiSettings) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings SettingsPage$lambda$20$1$3$0$0$0(int $v, UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UiSettings.copy$default(it, false, 0, null, 0, 0, $v == 1, 0, false, false, 0, false, 0, null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, 0, 0, 0, null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, 0, false, -33, SPV.kDefaultMaxIdBound, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit SettingsPage$lambda$20$1$4(com.pymcl.android.ui.state.UiSettings r34, final com.pymcl.android.ui.state.AppState r35, androidx.compose.runtime.Composer r36, int r37) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.SettingsPageKt.SettingsPage$lambda$20$1$4(com.pymcl.android.ui.state.UiSettings, com.pymcl.android.ui.state.AppState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$1$4$0$0$0(AppState $state, final float v) {
        $state.updateSettings(new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda128
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.SettingsPage$lambda$20$1$4$0$0$0$0(v, (UiSettings) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings SettingsPage$lambda$20$1$4$0$0$0$0(float $v, UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UiSettings.copy$default(it, false, 0, null, 0, 0, false, (int) $v, false, false, 0, false, 0, null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, 0, 0, 0, null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, 0, false, -65, SPV.kDefaultMaxIdBound, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$1$5$0(AppState $state, final boolean v) {
        $state.updateSettings(new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda97
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.SettingsPage$lambda$20$1$5$0$0(v, (UiSettings) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings SettingsPage$lambda$20$1$5$0$0(boolean $v, UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UiSettings.copy$default(it, false, 0, null, 0, 0, false, 0, $v, false, 0, false, 0, null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, 0, 0, 0, null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, 0, false, -129, SPV.kDefaultMaxIdBound, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$1$6$0(AppState $state, final boolean v) {
        $state.updateSettings(new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda169
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.SettingsPage$lambda$20$1$6$0$0(v, (UiSettings) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings SettingsPage$lambda$20$1$6$0$0(boolean $v, UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UiSettings.copy$default(it, false, 0, null, 0, 0, false, 0, false, $v, 0, false, 0, null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, 0, 0, 0, null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, 0, false, -257, SPV.kDefaultMaxIdBound, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit SettingsPage$lambda$20$1$7(com.pymcl.android.ui.state.UiSettings r34, final com.pymcl.android.ui.state.AppState r35, boolean r36, androidx.compose.runtime.Composer r37, int r38) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.SettingsPageKt.SettingsPage$lambda$20$1$7(com.pymcl.android.ui.state.UiSettings, com.pymcl.android.ui.state.AppState, boolean, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$1$7$0$0$0(AppState $state, final float v) {
        $state.updateSettings(new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda107
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.SettingsPage$lambda$20$1$7$0$0$0$0(v, (UiSettings) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings SettingsPage$lambda$20$1$7$0$0$0$0(float $v, UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UiSettings.copy$default(it, false, 0, null, 0, 0, false, 0, false, false, (int) $v, false, 0, null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, 0, 0, 0, null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, 0, false, -513, SPV.kDefaultMaxIdBound, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$1$8$0(AppState $state, final boolean v) {
        $state.updateSettings(new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda147
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.SettingsPage$lambda$20$1$8$0$0(v, (UiSettings) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings SettingsPage$lambda$20$1$8$0$0(boolean $v, UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UiSettings.copy$default(it, false, 0, null, 0, 0, false, 0, false, false, 0, $v, 0, null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, 0, 0, 0, null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, 0, false, -1025, SPV.kDefaultMaxIdBound, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$1$9(UiSettings $s, final AppState $state, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C88@6218L37,88@6176L80:SettingsPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-499027160, $changed, -1, "com.pymcl.android.ui.pages.SettingsPage.<anonymous>.<anonymous>.<anonymous> (SettingsPage.kt:88)");
            }
            List listListOf = CollectionsKt.listOf((Object[]) new String[]{"分组", "紧凑"});
            int navStyle = $s.getNavStyle();
            ComposerKt.sourceInformationMarkerStart($composer, 1471237837, "CC(remember):SettingsPage.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($state);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda104
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsPageKt.SettingsPage$lambda$20$1$9$0$0($state, ((Integer) obj2).intValue());
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Segmented(listListOf, navStyle, (Function1) objRememberedValue, false, $composer, 6, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$1$9$0$0(AppState $state, final int v) {
        $state.updateSettings(new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda102
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.SettingsPage$lambda$20$1$9$0$0$0(v, (UiSettings) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings SettingsPage$lambda$20$1$9$0$0$0(int $v, UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UiSettings.copy$default(it, false, 0, null, 0, 0, false, 0, false, false, 0, false, $v, null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, 0, 0, 0, null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, 0, false, -2049, SPV.kDefaultMaxIdBound, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$2(final UiSettings $s, final AppState $state, final Context $sctx, final MutableState $savedWallpaper$delegate, ColumnScope Group, Composer $composer, int $changed) {
        boolean folderOk;
        int i;
        Function0 function0;
        Intrinsics.checkNotNullParameter(Group, "$this$Group");
        ComposerKt.sourceInformation($composer, "C95@6645L34,96@6841L717,96@6733L825,108@7608L440,108@7571L477,112@8145L156,112@8061L240,113@8573L44,113@8314L303,114@8672L109,114@8630L151,115@8838L109,115@8794L153,116@8960L744:SettingsPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(931364171, $changed, -1, "com.pymcl.android.ui.pages.SettingsPage.<anonymous>.<anonymous> (SettingsPage.kt:93)");
            }
            final boolean fx = SettingsLogic.INSTANCE.wallpaperEffectsEnabled($s);
            ComposerKt.sourceInformationMarkerStart($composer, 1687777421, "CC(remember):SettingsPage.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                i = 0;
                folderOk = false;
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            } else {
                folderOk = false;
                i = 0;
            }
            final MutableState importing$delegate = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ActivityResultContracts.OpenDocument openDocument = new ActivityResultContracts.OpenDocument();
            ComposerKt.sourceInformationMarkerStart($composer, 1687784376, "CC(remember):SettingsPage.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($state) | $composer.changedInstance($sctx);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda70
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsPageKt.SettingsPage$lambda$20$2$3$0($state, importing$delegate, $sctx, (Uri) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue2 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            final ManagedActivityResultLauncher wpPicker = ActivityResultRegistryKt.rememberLauncherForActivityResult(openDocument, (Function1) objRememberedValue2, $composer, i);
            final boolean folderOk2 = folderOk;
            UiKt.m7596FieldTN_CM5M("壁纸文件", "留空就不用壁纸。安卓版暂不支持视频壁纸", 0.0f, false, ComposableLambdaKt.rememberComposableLambda(-3870314, true, new Function2() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda71
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return SettingsPageKt.SettingsPage$lambda$20$2$4($s, $state, wpPicker, importing$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24630, 12);
            UiKt.m7596FieldTN_CM5M("轮播文件夹", "安卓版暂不支持轮播，此项只与 PC 配置同步", 0.0f, false, ComposableLambdaKt.rememberComposableLambda(688595533, true, new Function2() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda72
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return SettingsPageKt.SettingsPage$lambda$20$2$5($s, $state, folderOk2, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24582, 12);
            boolean wallpaperRandom = $s.getWallpaperRandom();
            ComposerKt.sourceInformationMarkerStart($composer, 1687839127, "CC(remember):SettingsPage.kt#9igjgp");
            boolean zChangedInstance2 = $composer.changedInstance($state);
            Object objRememberedValue3 = $composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda73
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return SettingsPageKt.SettingsPage$lambda$20$2$6$0($state, ((Boolean) obj3).booleanValue());
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue3 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.SwitchRow("随机顺序", wallpaperRandom, "安卓版暂不支持轮播，此项只与 PC 配置同步", false, (Function1) objRememberedValue3, $composer, 6, 0);
            UiKt.m7596FieldTN_CM5M("模糊", fx ? null : "没设壁纸时不生效", 0.0f, false, ComposableLambdaKt.rememberComposableLambda(-351696306, true, new Function2() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda74
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return SettingsPageKt.SettingsPage$lambda$20$2$7($s, $state, fx, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer, 54), $composer, 24582, 12);
            UiKt.m7596FieldTN_CM5M("遮罩浓度", fx ? null : "没设壁纸时不生效", 0.0f, false, ComposableLambdaKt.rememberComposableLambda(-1391988145, true, new Function2() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda75
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return SettingsPageKt.SettingsPage$lambda$20$2$8($s, $state, fx, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer, 54), $composer, 24582, 12);
            Arrangement.Horizontal horizontalM619spacedBy0680j_4 = Arrangement.INSTANCE.m619spacedBy0680j_4(Dp.m7018constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            Modifier modifier = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalM619spacedBy0680j_4, Alignment.INSTANCE.getTop(), $composer, ((48 >> 3) & 14) | ((48 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifier);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i2 = ((((48 << 3) & 112) << 6) & User32.WM_PENWINFIRST) | 6;
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
            int i3 = (i2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i4 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 819691084, "C118@9177L156,118@9074L259,121@9378L193,121@9350L221,124@9630L60,124@9588L102:SettingsPage.kt#vz4689");
            BtnKind btnKind = BtnKind.Normal;
            boolean z = !Intrinsics.areEqual(SettingsLogic.INSTANCE.snap($s), SettingsPage$lambda$6($savedWallpaper$delegate));
            ComposerKt.sourceInformationMarkerStart($composer, -804839509, "CC(remember):SettingsPage.kt#9igjgp");
            boolean zChangedInstance3 = $composer.changedInstance($state);
            Object objRememberedValue4 = $composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda76
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SettingsPageKt.SettingsPage$lambda$20$2$9$0$0($state, $savedWallpaper$delegate);
                    }
                };
                $composer.updateRememberedValue(objRememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Btn("撤销上一次", btnKind, null, z, false, null, false, (Function0) objRememberedValue4, $composer, 54, 116);
            BtnKind btnKind2 = BtnKind.Normal;
            ComposerKt.sourceInformationMarkerStart($composer, -804833040, "CC(remember):SettingsPage.kt#9igjgp");
            boolean zChangedInstance4 = $composer.changedInstance($state);
            Object objRememberedValue5 = $composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new Function0() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda78
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SettingsPageKt.SettingsPage$lambda$20$2$9$1$0($state);
                    }
                };
                $composer.updateRememberedValue(objRememberedValue5);
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Btn("恢复出厂", btnKind2, null, false, false, null, false, (Function0) objRememberedValue5, $composer, 54, 124);
            BtnKind btnKind3 = BtnKind.Danger;
            ComposerKt.sourceInformationMarkerStart($composer, -804825109, "CC(remember):SettingsPage.kt#9igjgp");
            boolean zChangedInstance5 = $composer.changedInstance($state);
            Object objRememberedValue6 = $composer.rememberedValue();
            if (zChangedInstance5 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = new Function0() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda79
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SettingsPageKt.SettingsPage$lambda$20$2$9$2$0($state);
                    }
                };
                $composer.updateRememberedValue(obj3);
                objRememberedValue6 = obj3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Btn("关闭壁纸", btnKind3, null, fx, false, null, false, (Function0) objRememberedValue6, $composer, 54, 116);
            ComposerKt.sourceInformationMarkerEnd($composer);
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

    private static final boolean SettingsPage$lambda$20$2$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SettingsPage$lambda$20$2$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$2$3$0(AppState $state, MutableState $importing$delegate, Context $sctx, Uri uri) {
        if (uri == null) {
            return Unit.INSTANCE;
        }
        SettingsPage$lambda$20$2$2($importing$delegate, true);
        $state.launch(new SettingsPageKt$SettingsPage$2$3$wpPicker$1$1$1($state, $sctx, uri, $importing$delegate, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0276  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit SettingsPage$lambda$20$2$4(com.pymcl.android.ui.state.UiSettings r49, final com.pymcl.android.ui.state.AppState r50, final androidx.activity.compose.ManagedActivityResultLauncher r51, androidx.compose.runtime.MutableState r52, androidx.compose.runtime.Composer r53, int r54) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.SettingsPageKt.SettingsPage$lambda$20$2$4(com.pymcl.android.ui.state.UiSettings, com.pymcl.android.ui.state.AppState, androidx.activity.compose.ManagedActivityResultLauncher, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$2$4$0$0$0(AppState $state, final String v) {
        Intrinsics.checkNotNullParameter(v, "v");
        $state.updateSettings(new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda49
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.SettingsPage$lambda$20$2$4$0$0$0$0(v, (UiSettings) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings SettingsPage$lambda$20$2$4$0$0$0$0(String $v, UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UiSettings.copy$default(it, false, 0, null, 0, 0, false, 0, false, false, 0, false, 0, $v, null, false, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, 0, 0, 0, null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, 0, false, -4097, SPV.kDefaultMaxIdBound, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$2$4$0$1$0(RowScope $this_Row, ManagedActivityResultLauncher $wpPicker, AppState $state) {
        Object objM8116constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            $wpPicker.launch(new String[]{"image/*"});
            objM8116constructorimpl = Result.m8116constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8119exceptionOrNullimpl(objM8116constructorimpl) != null) {
            AppState.toast$default($state, "没有可用的文件管理器", null, "error", 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$2$5(UiSettings $s, final AppState $state, boolean $folderOk, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C112@8172L44,112@8147L152:SettingsPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(688595533, $changed, -1, "com.pymcl.android.ui.pages.SettingsPage.<anonymous>.<anonymous>.<anonymous> (SettingsPage.kt:112)");
            }
            String wallpaperFolder = $s.getWallpaperFolder();
            ComposerKt.sourceInformationMarkerStart($composer, 315344537, "CC(remember):SettingsPage.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($state);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda98
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsPageKt.SettingsPage$lambda$20$2$5$0$0($state, (String) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.m7599InputxAketlw(wallpaperFolder, (Function1) objRememberedValue, "壁纸文件夹（设了就轮播，优先于上面那张）", SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, 0, 0, 0, 0, null, null, true, false, $folderOk, $composer, GL11.GL_AUTO_NORMAL, 24960, 12272);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$2$5$0$0(AppState $state, final String v) {
        Intrinsics.checkNotNullParameter(v, "v");
        $state.updateSettings(new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda39
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.SettingsPage$lambda$20$2$5$0$0$0(v, (UiSettings) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings SettingsPage$lambda$20$2$5$0$0$0(String $v, UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UiSettings.copy$default(it, false, 0, null, 0, 0, false, 0, false, false, 0, false, 0, null, $v, false, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, 0, 0, 0, null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, 0, false, -8193, SPV.kDefaultMaxIdBound, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$2$6$0(AppState $state, final boolean v) {
        $state.updateSettings(new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda77
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.SettingsPage$lambda$20$2$6$0$0(v, (UiSettings) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings SettingsPage$lambda$20$2$6$0$0(boolean $v, UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UiSettings.copy$default(it, false, 0, null, 0, 0, false, 0, false, false, 0, false, 0, null, null, $v, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, 0, 0, 0, null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, 0, false, -16385, SPV.kDefaultMaxIdBound, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$2$7(UiSettings $s, final AppState $state, boolean $fx, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C114@8705L50,114@8674L105:SettingsPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-351696306, $changed, -1, "com.pymcl.android.ui.pages.SettingsPage.<anonymous>.<anonymous>.<anonymous> (SettingsPage.kt:114)");
            }
            float wallpaperBlur = $s.getWallpaperBlur();
            ComposerKt.sourceInformationMarkerStart($composer, 1322267424, "CC(remember):SettingsPage.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($state);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda138
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsPageKt.SettingsPage$lambda$20$2$7$0$0($state, ((Float) obj2).floatValue());
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Sld(wallpaperBlur, (Function1) objRememberedValue, RangesKt.rangeTo(0.0f, 40.0f), null, 0, $fx, $composer, 0, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$2$7$0$0(AppState $state, final float v) {
        $state.updateSettings(new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.SettingsPage$lambda$20$2$7$0$0$0(v, (UiSettings) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings SettingsPage$lambda$20$2$7$0$0$0(float $v, UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UiSettings.copy$default(it, false, 0, null, 0, 0, false, 0, false, false, 0, false, 0, null, null, false, 0, (int) $v, 0, 0, 0, 0, 0, 0, false, 0, null, null, 0, 0, 0, null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, 0, false, -65537, SPV.kDefaultMaxIdBound, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$2$8(UiSettings $s, final AppState $state, boolean $fx, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C115@8871L50,115@8840L105:SettingsPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1391988145, $changed, -1, "com.pymcl.android.ui.pages.SettingsPage.<anonymous>.<anonymous>.<anonymous> (SettingsPage.kt:115)");
            }
            float wallpaperMask = $s.getWallpaperMask();
            ComposerKt.sourceInformationMarkerStart($composer, -1965777183, "CC(remember):SettingsPage.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($state);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda160
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsPageKt.SettingsPage$lambda$20$2$8$0$0($state, ((Float) obj2).floatValue());
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Sld(wallpaperMask, (Function1) objRememberedValue, RangesKt.rangeTo(0.0f, 90.0f), null, 0, $fx, $composer, 0, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$2$8$0$0(AppState $state, final float v) {
        $state.updateSettings(new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda106
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.SettingsPage$lambda$20$2$8$0$0$0(v, (UiSettings) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings SettingsPage$lambda$20$2$8$0$0$0(float $v, UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UiSettings.copy$default(it, false, 0, null, 0, 0, false, 0, false, false, 0, false, 0, null, null, false, 0, 0, (int) $v, 0, 0, 0, 0, 0, false, 0, null, null, 0, 0, 0, null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, 0, false, -131073, SPV.kDefaultMaxIdBound, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$2$9$0$0(AppState $state, final MutableState $savedWallpaper$delegate) {
        $state.updateSettings(new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda89
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.SettingsPage$lambda$20$2$9$0$0$0($savedWallpaper$delegate, (UiSettings) obj);
            }
        });
        $state.toast("已撤销", "壁纸恢复到上次保存时的样子", "info");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings SettingsPage$lambda$20$2$9$0$0$0(MutableState $savedWallpaper$delegate, UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return SettingsLogic.INSTANCE.restore(it, SettingsPage$lambda$6($savedWallpaper$delegate));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$2$9$1$0(final AppState $state) {
        $state.open(new DialogSpec.Confirm("恢复出厂外观", "外观与壁纸两组恢复为默认值（其它设置不变），点「保存设置」后写入。", "恢复", false, false, new Function0() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda44
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SettingsPageKt.SettingsPage$lambda$20$2$9$1$0$0($state);
            }
        }, 24, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$2$9$1$0$0(AppState $state) {
        $state.updateSettings(new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.SettingsPage$lambda$20$2$9$1$0$0$0((UiSettings) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings SettingsPage$lambda$20$2$9$1$0$0$0(UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return SettingsLogic.INSTANCE.factoryAppearance(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$2$9$2$0(AppState $state) {
        $state.updateSettings(new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda109
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.SettingsPage$lambda$20$2$9$2$0$0((UiSettings) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings SettingsPage$lambda$20$2$9$2$0$0(UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UiSettings.copy$default(it, false, 0, null, 0, 0, false, 0, false, false, 0, false, 0, "", "", false, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, 0, 0, 0, null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, 0, false, -12289, SPV.kDefaultMaxIdBound, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$3(final UiSettings $s, final AppState $state, final MutableState $limitText$delegate, ColumnScope Group, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Group, "$this$Group");
        ComposerKt.sourceInformation($composer, "C131@10022L211,131@10007L226,132@10262L208,132@10246L224,133@10498L113,133@10483L128,134@10639L105,134@10624L120,135@10792L40,135@10757L75,136@10876L300,136@10845L331,137@11217L141,137@11189L169:SettingsPage.kt#vz4689");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1341974537, $changed, -1, "com.pymcl.android.ui.pages.SettingsPage.<anonymous>.<anonymous> (SettingsPage.kt:131)");
            }
            UiKt.m7596FieldTN_CM5M("并发线程数", null, 0.0f, false, ComposableLambdaKt.rememberComposableLambda(406740052, true, new Function2() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda41
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsPageKt.SettingsPage$lambda$20$3$0($s, $state, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 24582, 14);
            UiKt.m7596FieldTN_CM5M("单文件分片数", null, 0.0f, false, ComposableLambdaKt.rememberComposableLambda(1099205899, true, new Function2() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda42
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsPageKt.SettingsPage$lambda$20$3$1($s, $state, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 24582, 14);
            UiKt.m7596FieldTN_CM5M("文件下载源", null, 0.0f, false, ComposableLambdaKt.rememberComposableLambda(58914060, true, new Function2() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda43
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsPageKt.SettingsPage$lambda$20$3$2($s, $state, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 24582, 14);
            UiKt.m7596FieldTN_CM5M("社区资源源", null, 0.0f, false, ComposableLambdaKt.rememberComposableLambda(-981377779, true, new Function2() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda45
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsPageKt.SettingsPage$lambda$20$3$3($s, $state, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 24582, 14);
            boolean systemProxy = $s.getSystemProxy();
            ComposerKt.sourceInformationMarkerStart($composer, 1147366865, "CC(remember):SettingsPage.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($state);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda46
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsPageKt.SettingsPage$lambda$20$3$4$0($state, ((Boolean) obj2).booleanValue());
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.SwitchRow("跟随系统代理", systemProxy, null, false, (Function1) objRememberedValue, $composer, 6, 12);
            UiKt.m7596FieldTN_CM5M("限速 KB/s", "0 或留空表示不限制", 0.0f, false, ComposableLambdaKt.rememberComposableLambda(-2021669618, true, new Function2() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda47
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return SettingsPageKt.SettingsPage$lambda$20$3$5($state, $limitText$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24630, 12);
            UiKt.m7596FieldTN_CM5M("CurseForge API Key", null, 0.0f, false, ComposableLambdaKt.rememberComposableLambda(1233005839, true, new Function2() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda48
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return SettingsPageKt.SettingsPage$lambda$20$3$6($s, $state, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24582, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit SettingsPage$lambda$20$3$0(com.pymcl.android.ui.state.UiSettings r34, final com.pymcl.android.ui.state.AppState r35, androidx.compose.runtime.Composer r36, int r37) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.SettingsPageKt.SettingsPage$lambda$20$3$0(com.pymcl.android.ui.state.UiSettings, com.pymcl.android.ui.state.AppState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$3$0$0$0$0(AppState $state, final float v) {
        $state.updateSettings(new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda127
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.SettingsPage$lambda$20$3$0$0$0$0$0(v, (UiSettings) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings SettingsPage$lambda$20$3$0$0$0$0$0(float $v, UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UiSettings.copy$default(it, false, 0, null, 0, 0, false, 0, false, false, 0, false, 0, null, null, false, 0, 0, 0, 0, RangesKt.coerceIn((int) $v, 1, 64), 0, 0, 0, false, 0, null, null, 0, 0, 0, null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, 0, false, -524289, SPV.kDefaultMaxIdBound, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit SettingsPage$lambda$20$3$1(com.pymcl.android.ui.state.UiSettings r34, final com.pymcl.android.ui.state.AppState r35, androidx.compose.runtime.Composer r36, int r37) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.SettingsPageKt.SettingsPage$lambda$20$3$1(com.pymcl.android.ui.state.UiSettings, com.pymcl.android.ui.state.AppState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$3$1$0$0$0(AppState $state, final float v) {
        $state.updateSettings(new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda141
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.SettingsPage$lambda$20$3$1$0$0$0$0(v, (UiSettings) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings SettingsPage$lambda$20$3$1$0$0$0$0(float $v, UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UiSettings.copy$default(it, false, 0, null, 0, 0, false, 0, false, false, 0, false, 0, null, null, false, 0, 0, 0, 0, 0, RangesKt.coerceIn((int) $v, 1, 16), 0, 0, false, 0, null, null, 0, 0, 0, null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, 0, false, -1048577, SPV.kDefaultMaxIdBound, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$3$2(UiSettings $s, final AppState $state, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C133@10569L39,133@10500L109:SettingsPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(58914060, $changed, -1, "com.pymcl.android.ui.pages.SettingsPage.<anonymous>.<anonymous>.<anonymous> (SettingsPage.kt:133)");
            }
            List listListOf = CollectionsKt.listOf((Object[]) new String[]{"自动（官方慢则走 BMCLAPI）", "仅官方", "仅 BMCLAPI"});
            int fileSource = $s.getFileSource();
            ComposerKt.sourceInformationMarkerStart($composer, 781839123, "CC(remember):SettingsPage.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($state);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda83
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsPageKt.SettingsPage$lambda$20$3$2$0$0($state, ((Integer) obj2).intValue());
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Combo(listListOf, fileSource, (Function1) objRememberedValue, null, false, false, $composer, 6, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$3$2$0$0(AppState $state, final int v) {
        $state.updateSettings(new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda55
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.SettingsPage$lambda$20$3$2$0$0$0(v, (UiSettings) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings SettingsPage$lambda$20$3$2$0$0$0(int $v, UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UiSettings.copy$default(it, false, 0, null, 0, 0, false, 0, false, false, 0, false, 0, null, null, false, 0, 0, 0, 0, 0, 0, $v, 0, false, 0, null, null, 0, 0, 0, null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, 0, false, -2097153, SPV.kDefaultMaxIdBound, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$3$3(UiSettings $s, final AppState $state, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C134@10697L44,134@10641L101:SettingsPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-981377779, $changed, -1, "com.pymcl.android.ui.pages.SettingsPage.<anonymous>.<anonymous>.<anonymous> (SettingsPage.kt:134)");
            }
            List listListOf = CollectionsKt.listOf((Object[]) new String[]{"自动", "仅 MCIM", "仅官方"});
            int communitySource = $s.getCommunitySource();
            ComposerKt.sourceInformationMarkerStart($composer, 1788761401, "CC(remember):SettingsPage.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($state);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda59
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsPageKt.SettingsPage$lambda$20$3$3$0$0($state, ((Integer) obj2).intValue());
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Combo(listListOf, communitySource, (Function1) objRememberedValue, null, false, false, $composer, 6, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$3$3$0$0(AppState $state, final int v) {
        $state.updateSettings(new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda167
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.SettingsPage$lambda$20$3$3$0$0$0(v, (UiSettings) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings SettingsPage$lambda$20$3$3$0$0$0(int $v, UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UiSettings.copy$default(it, false, 0, null, 0, 0, false, 0, false, false, 0, false, 0, null, null, false, 0, 0, 0, 0, 0, 0, 0, $v, false, 0, null, null, 0, 0, 0, null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, 0, false, -4194305, SPV.kDefaultMaxIdBound, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$3$4$0(AppState $state, final boolean v) {
        $state.updateSettings(new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda123
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.SettingsPage$lambda$20$3$4$0$0(v, (UiSettings) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings SettingsPage$lambda$20$3$4$0$0(boolean $v, UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UiSettings.copy$default(it, false, 0, null, 0, 0, false, 0, false, false, 0, false, 0, null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, $v, 0, null, null, 0, 0, 0, null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, 0, false, -8388609, SPV.kDefaultMaxIdBound, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$3$5(final AppState $state, final MutableState $limitText$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C136@10895L176,136@10878L296:SettingsPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2021669618, $changed, -1, "com.pymcl.android.ui.pages.SettingsPage.<anonymous>.<anonymous>.<anonymous> (SettingsPage.kt:136)");
            }
            String strSettingsPage$lambda$15 = SettingsPage$lambda$15($limitText$delegate);
            int iM6696getNumberPjHm6EE = KeyboardType.INSTANCE.m6696getNumberPjHm6EE();
            Modifier modifierM790width3ABfNKs = SizeKt.m790width3ABfNKs(Modifier.INSTANCE, Dp.m7018constructorimpl(140));
            ComposerKt.sourceInformationMarkerStart($composer, -1499284322, "CC(remember):SettingsPage.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($state);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda115
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsPageKt.SettingsPage$lambda$20$3$5$0$0($limitText$delegate, $state, (String) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.m7599InputxAketlw(strSettingsPage$lambda$15, (Function1) objRememberedValue, null, modifierM790width3ABfNKs, false, false, 0, 0, iM6696getNumberPjHm6EE, 0, null, null, false, false, false, $composer, 100666368, 0, 32500);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit SettingsPage$lambda$20$3$5$0$0(androidx.compose.runtime.MutableState r8, com.pymcl.android.ui.state.AppState r9, final java.lang.String r10) {
        /*
            java.lang.String r0 = "v"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = r10
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L12
            r0 = r1
            goto L13
        L12:
            r0 = r2
        L13:
            if (r0 != 0) goto L3b
            r0 = r10
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r3 = 0
            r4 = r2
        L1a:
            int r5 = r0.length()
            if (r4 >= r5) goto L31
            char r5 = r0.charAt(r4)
            r6 = r5
            r7 = 0
            boolean r6 = java.lang.Character.isDigit(r6)
            if (r6 != 0) goto L2e
            r1 = r2
            goto L32
        L2e:
            int r4 = r4 + 1
            goto L1a
        L31:
        L32:
            if (r1 == 0) goto L46
            int r0 = r10.length()
            r1 = 7
            if (r0 > r1) goto L46
        L3b:
            SettingsPage$lambda$16(r8, r10)
            com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda69 r0 = new com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda69
            r0.<init>()
            SettingsPage$up(r9, r0)
        L46:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.SettingsPageKt.SettingsPage$lambda$20$3$5$0$0(androidx.compose.runtime.MutableState, com.pymcl.android.ui.state.AppState, java.lang.String):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings SettingsPage$lambda$20$3$5$0$0$0(String $v, UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Integer intField = SettingsLogic.INSTANCE.parseIntField($v, 7);
        return UiSettings.copy$default(it, false, 0, null, 0, 0, false, 0, false, false, 0, false, 0, null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, false, intField != null ? intField.intValue() : 0, null, null, 0, 0, 0, null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, 0, false, -16777217, SPV.kDefaultMaxIdBound, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$3$6(UiSettings $s, final AppState $state, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C137@11242L42,137@11219L137:SettingsPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1233005839, $changed, -1, "com.pymcl.android.ui.pages.SettingsPage.<anonymous>.<anonymous>.<anonymous> (SettingsPage.kt:137)");
            }
            String curseforgeKey = $s.getCurseforgeKey();
            ComposerKt.sourceInformationMarkerStart($composer, -492361575, "CC(remember):SettingsPage.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($state);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda144
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsPageKt.SettingsPage$lambda$20$3$6$0$0($state, (String) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.m7599InputxAketlw(curseforgeKey, (Function1) objRememberedValue, "CurseForge API Key（留空用内置）", SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, false, 0, 0, 0, 0, null, null, false, false, false, $composer, 28032, 0, 32736);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$3$6$0$0(AppState $state, final String v) {
        Intrinsics.checkNotNullParameter(v, "v");
        $state.updateSettings(new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.SettingsPage$lambda$20$3$6$0$0$0(v, (UiSettings) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings SettingsPage$lambda$20$3$6$0$0$0(String $v, UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UiSettings.copy$default(it, false, 0, null, 0, 0, false, 0, false, false, 0, false, 0, null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, $v, null, 0, 0, 0, null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, 0, false, -33554433, SPV.kDefaultMaxIdBound, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$4(final int $maxMem, final UiSettings $s, final AppState $state, final long $totalMem, final MutableState $widthText$delegate, final MutableState $heightText$delegate, ColumnScope Group, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Group, "$this$Group");
        ComposerKt.sourceInformation($composer, "C141@11500L44,141@11466L78,142@11602L580,142@11557L625,146@12426L728,146@12195L959,150@13214L114,150@13167L161,151@13393L82,151@13341L134,152@13507L119,152@13488L138,153@13721L39,153@13639L121:SettingsPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-600203928, $changed, -1, "com.pymcl.android.ui.pages.SettingsPage.<anonymous>.<anonymous> (SettingsPage.kt:141)");
            }
            UiKt.m7596FieldTN_CM5M("游戏目录", "安卓版固定在应用目录下，不能修改", 0.0f, false, ComposableLambdaKt.rememberComposableLambda(-1535438413, true, new Function2() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda130
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsPageKt.SettingsPage$lambda$20$4$0($s, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 24630, 12);
            UiKt.m7596FieldTN_CM5M("默认内存", I18nKt.tr("本机可分配上限约 {0} MB", Integer.valueOf($maxMem)), 0.0f, false, ComposableLambdaKt.rememberComposableLambda(-842972566, true, new Function2() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda131
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsPageKt.SettingsPage$lambda$20$4$1($s, $state, $maxMem, $totalMem, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 24582, 12);
            UiKt.m7596FieldTN_CM5M("默认分辨率", I18nKt.tr("宽 {0}–{1}，高 {2}–{3}", 320, 7680, 240, 7680), 0.0f, false, ComposableLambdaKt.rememberComposableLambda(-1883264405, true, new Function2() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda132
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsPageKt.SettingsPage$lambda$20$4$2($state, $widthText$delegate, $heightText$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 24582, 12);
            UiKt.m7596FieldTN_CM5M("新版本默认隔离", "新装的版本用这个隔离方式；已有版本在「版本设置」里改", 0.0f, false, ComposableLambdaKt.rememberComposableLambda(1371411052, true, new Function2() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda134
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsPageKt.SettingsPage$lambda$20$4$3($s, $state, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 24630, 12);
            UiKt.m7596FieldTN_CM5M("内存回收器", "JVM 参数里已写 -XX:+Use…GC 时以 JVM 参数为准", 0.0f, false, ComposableLambdaKt.rememberComposableLambda(331119213, true, new Function2() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda135
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsPageKt.SettingsPage$lambda$20$4$4($s, $state, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 24630, 12);
            UiKt.m7596FieldTN_CM5M("默认 JVM 参数", null, 0.0f, false, ComposableLambdaKt.rememberComposableLambda(-709172626, true, new Function2() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda136
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsPageKt.SettingsPage$lambda$20$4$5($s, $state, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 24582, 14);
            boolean allowMulti = $s.getAllowMulti();
            ComposerKt.sourceInformationMarkerStart($composer, -1270282481, "CC(remember):SettingsPage.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($state);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda137
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsPageKt.SettingsPage$lambda$20$4$6$0($state, ((Boolean) obj2).booleanValue());
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.SwitchRow("允许多开", allowMulti, "安卓同一时间只能运行一个游戏进程，此项只与 PC 配置同步", false, (Function1) objRememberedValue, $composer, 3462, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$4$0(UiSettings $s, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C141@11502L40:SettingsPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1535438413, $changed, -1, "com.pymcl.android.ui.pages.SettingsPage.<anonymous>.<anonymous>.<anonymous> (SettingsPage.kt:141)");
            }
            UiKt.Mono($s.getGameDir(), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0, $composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit SettingsPage$lambda$20$4$1(com.pymcl.android.ui.state.UiSettings r42, final com.pymcl.android.ui.state.AppState r43, final int r44, final long r45, androidx.compose.runtime.Composer r47, int r48) {
        /*
            Method dump skipped, instructions count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.SettingsPageKt.SettingsPage$lambda$20$4$1(com.pymcl.android.ui.state.UiSettings, com.pymcl.android.ui.state.AppState, int, long, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$4$1$0$0$0(final int $maxMem, AppState $state, final float v) {
        $state.updateSettings(new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda148
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.SettingsPage$lambda$20$4$1$0$0$0$0(v, $maxMem, (UiSettings) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings SettingsPage$lambda$20$4$1$0$0$0$0(float $v, int $maxMem, UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UiSettings.copy$default(it, false, 0, null, 0, 0, false, 0, false, false, 0, false, 0, null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, RangesKt.coerceIn(SettingsLogic.INSTANCE.roundMemory((int) $v), 512, $maxMem), 0, 0, null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, 0, false, -134217729, SPV.kDefaultMaxIdBound, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$4$1$0$1$0(long $totalMem, AppState $state) {
        final int r = SettingsLogic.INSTANCE.recommendMemoryMb($totalMem);
        $state.updateSettings(new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda161
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.SettingsPage$lambda$20$4$1$0$1$0$0(r, (UiSettings) obj);
            }
        });
        $state.toast(I18nKt.tr("推荐 {0} MB", Integer.valueOf(r)), "按本机内存估算；点「保存设置」后生效", "info");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings SettingsPage$lambda$20$4$1$0$1$0$0(int $r, UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UiSettings.copy$default(it, false, 0, null, 0, 0, false, 0, false, false, 0, false, 0, null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, $r, 0, 0, null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, 0, false, -134217729, SPV.kDefaultMaxIdBound, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0266  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit SettingsPage$lambda$20$4$2(final com.pymcl.android.ui.state.AppState r47, final androidx.compose.runtime.MutableState r48, final androidx.compose.runtime.MutableState r49, androidx.compose.runtime.Composer r50, int r51) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.SettingsPageKt.SettingsPage$lambda$20$4$2(com.pymcl.android.ui.state.AppState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit SettingsPage$lambda$20$4$2$0$0$0(androidx.compose.runtime.MutableState r8, com.pymcl.android.ui.state.AppState r9, java.lang.String r10) {
        /*
            java.lang.String r0 = "v"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = r10
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L12
            r0 = r1
            goto L13
        L12:
            r0 = r2
        L13:
            if (r0 != 0) goto L3b
            r0 = r10
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r3 = 0
            r4 = r2
        L1a:
            int r5 = r0.length()
            if (r4 >= r5) goto L31
            char r5 = r0.charAt(r4)
            r6 = r5
            r7 = 0
            boolean r6 = java.lang.Character.isDigit(r6)
            if (r6 != 0) goto L2e
            r1 = r2
            goto L32
        L2e:
            int r4 = r4 + 1
            goto L1a
        L31:
        L32:
            if (r1 == 0) goto L57
            int r0 = r10.length()
            r1 = 5
            if (r0 > r1) goto L57
        L3b:
            SettingsPage$lambda$10(r8, r10)
            com.pymcl.android.data.SettingsLogic r0 = com.pymcl.android.data.SettingsLogic.INSTANCE
            r1 = 2
            r3 = 0
            java.lang.Integer r0 = com.pymcl.android.data.SettingsLogic.parseIntField$default(r0, r10, r2, r1, r3)
            if (r0 == 0) goto L57
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1 = 0
            com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda57 r2 = new com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda57
            r2.<init>()
            SettingsPage$up(r9, r2)
        L57:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.SettingsPageKt.SettingsPage$lambda$20$4$2$0$0$0(androidx.compose.runtime.MutableState, com.pymcl.android.ui.state.AppState, java.lang.String):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings SettingsPage$lambda$20$4$2$0$0$0$0$0(int $n, UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UiSettings.copy$default(it, false, 0, null, 0, 0, false, 0, false, false, 0, false, 0, null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, 0, $n, 0, null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, 0, false, -268435457, SPV.kDefaultMaxIdBound, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit SettingsPage$lambda$20$4$2$0$1$0(androidx.compose.runtime.MutableState r8, com.pymcl.android.ui.state.AppState r9, java.lang.String r10) {
        /*
            java.lang.String r0 = "v"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = r10
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L12
            r0 = r1
            goto L13
        L12:
            r0 = r2
        L13:
            if (r0 != 0) goto L3b
            r0 = r10
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r3 = 0
            r4 = r2
        L1a:
            int r5 = r0.length()
            if (r4 >= r5) goto L31
            char r5 = r0.charAt(r4)
            r6 = r5
            r7 = 0
            boolean r6 = java.lang.Character.isDigit(r6)
            if (r6 != 0) goto L2e
            r1 = r2
            goto L32
        L2e:
            int r4 = r4 + 1
            goto L1a
        L31:
        L32:
            if (r1 == 0) goto L57
            int r0 = r10.length()
            r1 = 5
            if (r0 > r1) goto L57
        L3b:
            SettingsPage$lambda$13(r8, r10)
            com.pymcl.android.data.SettingsLogic r0 = com.pymcl.android.data.SettingsLogic.INSTANCE
            r1 = 2
            r3 = 0
            java.lang.Integer r0 = com.pymcl.android.data.SettingsLogic.parseIntField$default(r0, r10, r2, r1, r3)
            if (r0 == 0) goto L57
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1 = 0
            com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda162 r2 = new com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda162
            r2.<init>()
            SettingsPage$up(r9, r2)
        L57:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.SettingsPageKt.SettingsPage$lambda$20$4$2$0$1$0(androidx.compose.runtime.MutableState, com.pymcl.android.ui.state.AppState, java.lang.String):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings SettingsPage$lambda$20$4$2$0$1$0$0$0(int $n, UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UiSettings.copy$default(it, false, 0, null, 0, 0, false, 0, false, false, 0, false, 0, null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, 0, 0, $n, null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, 0, false, -536870913, SPV.kDefaultMaxIdBound, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$4$3(UiSettings $s, final AppState $state, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C150@13287L38,150@13216L110:SettingsPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1371411052, $changed, -1, "com.pymcl.android.ui.pages.SettingsPage.<anonymous>.<anonymous>.<anonymous> (SettingsPage.kt:150)");
            }
            List listListOf = CollectionsKt.listOf((Object[]) new String[]{"关闭（共用实例目录）", "隔离存档", "隔离 Mod 与配置", "隔离全部"});
            int isolation = $s.getIsolation();
            ComposerKt.sourceInformationMarkerStart($composer, -628936526, "CC(remember):SettingsPage.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($state);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda129
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsPageKt.SettingsPage$lambda$20$4$3$0$0($state, ((Integer) obj2).intValue());
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Combo(listListOf, isolation, (Function1) objRememberedValue, null, false, false, $composer, 6, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$4$3$0$0(AppState $state, final int v) {
        $state.updateSettings(new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda108
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.SettingsPage$lambda$20$4$3$0$0$0(v, (UiSettings) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings SettingsPage$lambda$20$4$3$0$0$0(int $v, UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UiSettings.copy$default(it, false, 0, null, 0, 0, false, 0, false, false, 0, false, 0, null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, 0, 0, 0, null, $v, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, 0, false, Integer.MAX_VALUE, SPV.kDefaultMaxIdBound, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$4$4(UiSettings $s, final AppState $state, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C151@13441L31,151@13395L78:SettingsPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(331119213, $changed, -1, "com.pymcl.android.ui.pages.SettingsPage.<anonymous>.<anonymous>.<anonymous> (SettingsPage.kt:151)");
            }
            List listListOf = CollectionsKt.listOf((Object[]) new String[]{"G1（推荐）", "调优 G1", "不指定"});
            int gc = $s.getGc();
            ComposerKt.sourceInformationMarkerStart($composer, 377985356, "CC(remember):SettingsPage.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($state);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda116
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsPageKt.SettingsPage$lambda$20$4$4$0$0($state, ((Integer) obj2).intValue());
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Combo(listListOf, gc, (Function1) objRememberedValue, null, false, false, $composer, 6, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$4$4$0$0(AppState $state, final int v) {
        $state.updateSettings(new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda40
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.SettingsPage$lambda$20$4$4$0$0$0(v, (UiSettings) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings SettingsPage$lambda$20$4$4$0$0$0(int $v, UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UiSettings.copy$default(it, false, 0, null, 0, 0, false, 0, false, false, 0, false, 0, null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, 0, 0, 0, null, 0, $v, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, 0, false, -1, 4194302, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$4$5(UiSettings $s, final AppState $state, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C152@13526L36,152@13509L115:SettingsPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-709172626, $changed, -1, "com.pymcl.android.ui.pages.SettingsPage.<anonymous>.<anonymous>.<anonymous> (SettingsPage.kt:152)");
            }
            String jvmArgs = $s.getJvmArgs();
            ComposerKt.sourceInformationMarkerStart($composer, 1384907122, "CC(remember):SettingsPage.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($state);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda114
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsPageKt.SettingsPage$lambda$20$4$5$0$0($state, (String) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.m7599InputxAketlw(jvmArgs, (Function1) objRememberedValue, "例如 -XX:+UseG1GC（可空）", SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, 0, 0, 0, 0, null, null, true, false, false, $composer, GL11.GL_AUTO_NORMAL, 384, 28656);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$4$5$0$0(AppState $state, final String v) {
        Intrinsics.checkNotNullParameter(v, "v");
        $state.updateSettings(new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda119
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.SettingsPage$lambda$20$4$5$0$0$0(v, (UiSettings) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings SettingsPage$lambda$20$4$5$0$0$0(String $v, UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UiSettings.copy$default(it, false, 0, null, 0, 0, false, 0, false, false, 0, false, 0, null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, 0, 0, 0, null, 0, 0, 0, $v, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, 0, false, -1, 4194299, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$4$6$0(AppState $state, final boolean v) {
        $state.updateSettings(new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda163
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.SettingsPage$lambda$20$4$6$0$0(v, (UiSettings) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings SettingsPage$lambda$20$4$6$0$0(boolean $v, UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UiSettings.copy$default(it, false, 0, null, 0, 0, false, 0, false, false, 0, false, 0, null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, 0, 0, 0, null, 0, 0, 0, null, $v, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, 0, false, -1, 4194295, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$5(final AppState $state, ColumnScope Group, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Group, "$this$Group");
        ComposerKt.sourceInformation($composer, "C158@14084L7,159@14116L65,160@14209L96,161@14333L103,162@14473L531,162@14449L555,172@15091L125,172@15017L199,175@15278L279,175@15229L328,180@15658L37,180@15570L125:SettingsPage.kt#vz4689");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1752584903, $changed, -1, "com.pymcl.android.ui.pages.SettingsPage.<anonymous>.<anonymous> (SettingsPage.kt:158)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer);
            Context ctx = (Context) objConsume;
            ComposerKt.sourceInformationMarkerStart($composer, 606921256, "CC(remember):SettingsPage.kt#9igjgp");
            boolean zChanged = $composer.changed(ctx);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objStore = LauncherPrefs.INSTANCE.store(ctx);
                $composer.updateRememberedValue(objStore);
                objRememberedValue = objStore;
            }
            final CrossProcessPrefs prefs = (CrossProcessPrefs) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 606924263, "CC(remember):SettingsPage.kt#9igjgp");
            Object objRememberedValue2 = $composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(LauncherPrefs.INSTANCE.readAutoIme(new SettingsPageKt$SettingsPage$2$6$autoIme$2$1(prefs))), null, 2, null);
                $composer.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue2 = objMutableStateOf$default;
            }
            final MutableState autoIme$delegate = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 606928238, "CC(remember):SettingsPage.kt#9igjgp");
            Object objRememberedValue3 = $composer.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object objMutableIntStateOf = SnapshotIntStateKt.mutableIntStateOf(LauncherPrefs.INSTANCE.readGamepadIndex(new SettingsPageKt$SettingsPage$2$6$padMode$2$1(prefs)));
                $composer.updateRememberedValue(objMutableIntStateOf);
                objRememberedValue3 = objMutableIntStateOf;
            }
            final MutableIntState padMode$delegate = (MutableIntState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 606933146, "CC(remember):SettingsPage.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance(prefs);
            Object objRememberedValue4 = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsPageKt.SettingsPage$lambda$20$5$7$0(prefs, autoIme$delegate, padMode$delegate, (DisposableEffectScope) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue4 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            EffectsKt.DisposableEffect(prefs, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, $composer, 0);
            boolean zSettingsPage$lambda$20$5$2 = SettingsPage$lambda$20$5$2(autoIme$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, 606952516, "CC(remember):SettingsPage.kt#9igjgp");
            boolean zChangedInstance2 = $composer.changedInstance(prefs);
            Object objRememberedValue5 = $composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return SettingsPageKt.SettingsPage$lambda$20$5$8$0(prefs, autoIme$delegate, ((Boolean) obj3).booleanValue());
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue5 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.SwitchRow("游戏内自动弹出输入法（SDL）", zSettingsPage$lambda$20$5$2, "SDL 游戏请求文字输入（聊天栏、告示牌、命名）时自动弹出软键盘", false, (Function1) objRememberedValue5, $composer, 390, 8);
            UiKt.m7596FieldTN_CM5M("手柄模式", "连接手柄后的处理方式；「每次询问」会在游戏里检测到手柄时问一次", 0.0f, false, ComposableLambdaKt.rememberComposableLambda(817350418, true, new Function2() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return SettingsPageKt.SettingsPage$lambda$20$5$9(prefs, padMode$delegate, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer, 54), $composer, 24630, 12);
            boolean enabled = $state.getModWatcher().getEnabled();
            ComposerKt.sourceInformationMarkerStart($composer, 606970572, "CC(remember):SettingsPage.kt#9igjgp");
            boolean zChangedInstance3 = $composer.changedInstance($state);
            Object objRememberedValue6 = $composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        return SettingsPageKt.SettingsPage$lambda$20$5$10$0($state, ((Boolean) obj4).booleanValue());
                    }
                };
                $composer.updateRememberedValue(obj3);
                objRememberedValue6 = obj3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.SwitchRow("后台检查模组更新", enabled, "启动时和每 6 小时检查一次各实例的模组更新，有更新会提示并在实例页标出", false, (Function1) objRememberedValue6, $composer, 390, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    private static final boolean SettingsPage$lambda$20$5$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void SettingsPage$lambda$20$5$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final int SettingsPage$lambda$20$5$5(MutableIntState $padMode$delegate) {
        return $padMode$delegate.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult SettingsPage$lambda$20$5$7$0(final CrossProcessPrefs $prefs, final MutableState $autoIme$delegate, final MutableIntState $padMode$delegate, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final Handler main = new Handler(Looper.getMainLooper());
        final Function0 off = $prefs.addListener(new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda142
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.SettingsPage$lambda$20$5$7$0$0(main, $prefs, $autoIme$delegate, $padMode$delegate, (String) obj);
            }
        });
        return new DisposableEffectResult() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$SettingsPage$lambda$20$5$7$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                off.invoke();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$5$7$0$0(Handler $main, final CrossProcessPrefs $prefs, final MutableState $autoIme$delegate, final MutableIntState $padMode$delegate, String key) {
        if (LauncherPrefs.INSTANCE.affectsInGameGroup(key)) {
            $main.post(new Runnable() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda37
                @Override // java.lang.Runnable
                public final void run() {
                    SettingsPageKt.SettingsPage$lambda$20$5$7$0$0$0($prefs, $autoIme$delegate, $padMode$delegate);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SettingsPage$lambda$20$5$7$0$0$0(CrossProcessPrefs $prefs, MutableState $autoIme$delegate, MutableIntState $padMode$delegate) {
        SettingsPage$lambda$20$5$3($autoIme$delegate, LauncherPrefs.INSTANCE.readAutoIme(new SettingsPageKt$SettingsPage$2$6$1$1$off$1$1$1($prefs)));
        $padMode$delegate.setIntValue(LauncherPrefs.INSTANCE.readGamepadIndex(new SettingsPageKt$SettingsPage$2$6$1$1$off$1$1$2($prefs)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$5$8$0(CrossProcessPrefs $prefs, MutableState $autoIme$delegate, boolean v) {
        SettingsPage$lambda$20$5$3($autoIme$delegate, v);
        $prefs.putBoolean("sdl_auto_show_ime", v);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$5$9(final CrossProcessPrefs $prefs, final MutableIntState $padMode$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C176@15364L178,176@15296L247:SettingsPage.kt#vz4689");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(817350418, $changed, -1, "com.pymcl.android.ui.pages.SettingsPage.<anonymous>.<anonymous>.<anonymous> (SettingsPage.kt:176)");
            }
            List<String> gamepad_labels = LauncherPrefs.INSTANCE.getGAMEPAD_LABELS();
            int iSettingsPage$lambda$20$5$5 = SettingsPage$lambda$20$5$5($padMode$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, -505260540, "CC(remember):SettingsPage.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($prefs);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda62
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsPageKt.SettingsPage$lambda$20$5$9$0$0($prefs, $padMode$delegate, ((Integer) obj2).intValue());
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Combo(gamepad_labels, iSettingsPage$lambda$20$5$5, (Function1) objRememberedValue, null, false, false, $composer, 0, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$5$9$0$0(CrossProcessPrefs $prefs, MutableIntState $padMode$delegate, int i) {
        $padMode$delegate.setIntValue(i);
        $prefs.putString("gamepad_mode", LauncherPrefs.INSTANCE.gamepadValue(i));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$5$10$0(AppState $state, boolean v) {
        $state.getModWatcher().switchTo(v);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x024a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit SettingsPage$lambda$20$6(com.pymcl.android.ui.state.UiSettings r39, final com.pymcl.android.ui.state.AppState r40, androidx.compose.foundation.layout.ColumnScope r41, androidx.compose.runtime.Composer r42, int r43) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.SettingsPageKt.SettingsPage$lambda$20$6(com.pymcl.android.ui.state.UiSettings, com.pymcl.android.ui.state.AppState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$6$0$0(AppState $state, final boolean v) {
        $state.updateSettings(new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda133
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.SettingsPage$lambda$20$6$0$0$0(v, (UiSettings) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings SettingsPage$lambda$20$6$0$0$0(boolean $v, UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UiSettings.copy$default(it, false, 0, null, 0, 0, false, 0, false, false, 0, false, 0, null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, 0, 0, 0, null, 0, 0, 0, null, false, $v, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, 0, false, -1, 4194287, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$6$1$0(AppState $state, final boolean v) {
        $state.updateSettings(new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda99
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.SettingsPage$lambda$20$6$1$0$0(v, (UiSettings) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings SettingsPage$lambda$20$6$1$0$0(boolean $v, UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UiSettings.copy$default(it, false, 0, null, 0, 0, false, 0, false, false, 0, false, 0, null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, 0, 0, 0, null, 0, 0, 0, null, false, false, $v, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, 0, false, -1, 4194271, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$7(AppState $state, ColumnScope Group, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Group, "$this$Group");
        ComposerKt.sourceInformation($composer, "C188@16185L22:SettingsPage.kt#vz4689");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(Group) ? 4 : 2;
        }
        if ($composer.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2131772027, $dirty, -1, "com.pymcl.android.ui.pages.SettingsPage.<anonymous>.<anonymous> (SettingsPage.kt:188)");
            }
            AiSettingsGroup(Group, $state, $composer, ($dirty & 14) | (AppState.$stable << 3));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$8(final UiSettings $s, final AppState $state, ColumnScope Group, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Group, "$this$Group");
        ComposerKt.sourceInformation($composer, "C190@16292L114,190@16245L161,191@16434L101,191@16419L116,195@16965L39,195@16863L141,196@17165L176,196@17017L324,197@17397L114,197@17354L157,198@17567L103,198@17524L146,199@17697L67,199@17683L81:SettingsPage.kt#vz4689");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(221016804, $changed, -1, "com.pymcl.android.ui.pages.SettingsPage.<anonymous>.<anonymous> (SettingsPage.kt:190)");
            }
            UiKt.m7596FieldTN_CM5M("启动器可见性", "安卓上游戏窗口总是覆盖启动器，此项只与 PC 配置同步", 0.0f, false, ComposableLambdaKt.rememberComposableLambda(-714217681, true, new Function2() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda149
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsPageKt.SettingsPage$lambda$20$8$0($s, $state, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 24630, 12);
            UiKt.m7596FieldTN_CM5M("启动页主页", null, 0.0f, false, ComposableLambdaKt.rememberComposableLambda(-21751834, true, new Function2() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda150
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsPageKt.SettingsPage$lambda$20$8$1($s, $state, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 24582, 14);
            if ($s.getHomepage() == 1) {
                $composer.startReplaceGroup(1943762102);
                ComposerKt.sourceInformation($composer, "192@16584L131,192@16569L146");
                UiKt.m7596FieldTN_CM5M("自定义主页", null, 0.0f, false, ComposableLambdaKt.rememberComposableLambda(-506783734, true, new Function2() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda151
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SettingsPageKt.SettingsPage$lambda$20$8$2($s, $state, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, $composer, 54), $composer, 24582, 14);
            } else {
                $composer.startReplaceGroup(127223326);
            }
            $composer.endReplaceGroup();
            final boolean updOk = false;
            boolean autoUpdate = $s.getAutoUpdate();
            ComposerKt.sourceInformationMarkerStart($composer, 1943774667, "CC(remember):SettingsPage.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($state);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda152
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsPageKt.SettingsPage$lambda$20$8$3$0($state, ((Boolean) obj2).booleanValue());
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.SwitchRow("自动检查更新", autoUpdate, "安卓版暂未接入在线更新检查，此项只与 PC 配置同步", false, (Function1) objRememberedValue, $composer, 3078, 0);
            UiKt.m7596FieldTN_CM5M("更新地址", "安卓版暂未接入在线更新检查，此项只与 PC 配置同步", 0.0f, false, ComposableLambdaKt.rememberComposableLambda(-1062043673, true, new Function2() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda153
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return SettingsPageKt.SettingsPage$lambda$20$8$4($s, $state, updOk, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24582, 12);
            UiKt.m7596FieldTN_CM5M("微软 Client ID", "留空用内置；改后需重新登录微软账号", 0.0f, false, ComposableLambdaKt.rememberComposableLambda(-2102335512, true, new Function2() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda154
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return SettingsPageKt.SettingsPage$lambda$20$8$5($s, $state, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24630, 12);
            UiKt.m7596FieldTN_CM5M("语言（预览）", "立即切换；点「保存设置」后下次打开仍是这个语言", 0.0f, false, ComposableLambdaKt.rememberComposableLambda(1152339945, true, new Function2() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda156
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return SettingsPageKt.SettingsPage$lambda$20$8$6($s, $state, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24630, 12);
            UiKt.m7596FieldTN_CM5M("启动向导", null, 0.0f, false, ComposableLambdaKt.rememberComposableLambda(112048106, true, new Function2() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda157
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return SettingsPageKt.SettingsPage$lambda$20$8$7($state, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24582, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$8$0(UiSettings $s, final AppState $state, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C190@16364L39,190@16294L110:SettingsPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-714217681, $changed, -1, "com.pymcl.android.ui.pages.SettingsPage.<anonymous>.<anonymous>.<anonymous> (SettingsPage.kt:190)");
            }
            List listListOf = CollectionsKt.listOf((Object[]) new String[]{"保持显示", "最小化", "隐藏", "隐藏，退出后重开", "关闭启动器"});
            int visibility = $s.getVisibility();
            ComposerKt.sourceInformationMarkerStart($composer, 831578262, "CC(remember):SettingsPage.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($state);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda126
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsPageKt.SettingsPage$lambda$20$8$0$0$0($state, ((Integer) obj2).intValue());
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Combo(listListOf, visibility, (Function1) objRememberedValue, null, false, false, $composer, 6, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$8$0$0$0(AppState $state, final int v) {
        $state.updateSettings(new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda175
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.SettingsPage$lambda$20$8$0$0$0$0(v, (UiSettings) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings SettingsPage$lambda$20$8$0$0$0$0(int $v, UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UiSettings.copy$default(it, false, 0, null, 0, 0, false, 0, false, false, 0, false, 0, null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, 0, 0, 0, null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, $v, 0, null, false, null, null, 0, false, -1, 4177919, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$8$1(UiSettings $s, final AppState $state, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C191@16495L37,191@16436L97:SettingsPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-21751834, $changed, -1, "com.pymcl.android.ui.pages.SettingsPage.<anonymous>.<anonymous>.<anonymous> (SettingsPage.kt:191)");
            }
            List listListOf = CollectionsKt.listOf((Object[]) new String[]{"Minecraft 新闻", "本地 HTML", "空白"});
            int homepage = $s.getHomepage();
            ComposerKt.sourceInformationMarkerStart($composer, 571325995, "CC(remember):SettingsPage.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($state);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda171
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsPageKt.SettingsPage$lambda$20$8$1$0$0($state, ((Integer) obj2).intValue());
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Combo(listListOf, homepage, (Function1) objRememberedValue, null, false, false, $composer, 6, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$8$1$0$0(AppState $state, final int v) {
        $state.updateSettings(new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda120
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.SettingsPage$lambda$20$8$1$0$0$0(v, (UiSettings) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings SettingsPage$lambda$20$8$1$0$0$0(int $v, UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UiSettings.copy$default(it, false, 0, null, 0, 0, false, 0, false, false, 0, false, 0, null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, 0, 0, 0, null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, $v, null, false, null, null, 0, false, -1, 4161535, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$8$2(UiSettings $s, final AppState $state, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C192@16610L43,192@16586L127:SettingsPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-506783734, $changed, -1, "com.pymcl.android.ui.pages.SettingsPage.<anonymous>.<anonymous>.<anonymous> (SettingsPage.kt:192)");
            }
            String customHomepage = $s.getCustomHomepage();
            ComposerKt.sourceInformationMarkerStart($composer, -1687863051, "CC(remember):SettingsPage.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($state);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda139
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsPageKt.SettingsPage$lambda$20$8$2$0$0($state, (String) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.m7599InputxAketlw(customHomepage, (Function1) objRememberedValue, "本地 .html 文件路径（主页选「本地 HTML」时生效）", SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, 0, 0, 0, 0, null, null, false, false, false, $composer, GL11.GL_AUTO_NORMAL, 0, 32752);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$8$2$0$0(AppState $state, final String v) {
        Intrinsics.checkNotNullParameter(v, "v");
        $state.updateSettings(new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda52
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.SettingsPage$lambda$20$8$2$0$0$0(v, (UiSettings) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings SettingsPage$lambda$20$8$2$0$0$0(String $v, UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UiSettings.copy$default(it, false, 0, null, 0, 0, false, 0, false, false, 0, false, 0, null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, 0, 0, 0, null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, $v, false, null, null, 0, false, -1, 4128767, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$8$3$0(AppState $state, final boolean v) {
        $state.updateSettings(new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda140
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.SettingsPage$lambda$20$8$3$0$0(v, (UiSettings) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings SettingsPage$lambda$20$8$3$0$0(boolean $v, UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UiSettings.copy$default(it, false, 0, null, 0, 0, false, 0, false, false, 0, false, 0, null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, 0, 0, 0, null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, $v, null, null, 0, false, -1, 4063231, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$8$4(UiSettings $s, final AppState $state, boolean $updOk, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C196@17186L38,196@17167L172:SettingsPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1062043673, $changed, -1, "com.pymcl.android.ui.pages.SettingsPage.<anonymous>.<anonymous>.<anonymous> (SettingsPage.kt:196)");
            }
            String updateUrl = $s.getUpdateUrl();
            ComposerKt.sourceInformationMarkerStart($composer, 1578247405, "CC(remember):SettingsPage.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($state);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda168
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsPageKt.SettingsPage$lambda$20$8$4$0$0($state, (String) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            Function1 function1 = (Function1) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.m7599InputxAketlw(updateUrl, function1, "留空用默认更新源", SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, 0, 0, 0, 0, null, null, false, false, $updOk && SettingsLogic.INSTANCE.updateUrlEnabled($s), $composer, GL11.GL_AUTO_NORMAL, 0, 16368);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$8$4$0$0(AppState $state, final String v) {
        Intrinsics.checkNotNullParameter(v, "v");
        $state.updateSettings(new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda103
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.SettingsPage$lambda$20$8$4$0$0$0(v, (UiSettings) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings SettingsPage$lambda$20$8$4$0$0$0(String $v, UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UiSettings.copy$default(it, false, 0, null, 0, 0, false, 0, false, false, 0, false, 0, null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, 0, 0, 0, null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, $v, null, 0, false, -1, 3932159, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$8$5(UiSettings $s, final AppState $state, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C197@17419L39,197@17399L110:SettingsPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2102335512, $changed, -1, "com.pymcl.android.ui.pages.SettingsPage.<anonymous>.<anonymous>.<anonymous> (SettingsPage.kt:197)");
            }
            String msClientId = $s.getMsClientId();
            ComposerKt.sourceInformationMarkerStart($composer, -1709797169, "CC(remember):SettingsPage.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($state);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsPageKt.SettingsPage$lambda$20$8$5$0$0($state, (String) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.m7599InputxAketlw(msClientId, (Function1) objRememberedValue, "微软登录 Client ID（留空用内置）", SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, 0, 0, 0, 0, null, null, false, false, false, $composer, GL11.GL_AUTO_NORMAL, 0, 32752);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$8$5$0$0(AppState $state, final String v) {
        Intrinsics.checkNotNullParameter(v, "v");
        $state.updateSettings(new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda58
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.SettingsPage$lambda$20$8$5$0$0$0(v, (UiSettings) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings SettingsPage$lambda$20$8$5$0$0$0(String $v, UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UiSettings.copy$default(it, false, 0, null, 0, 0, false, 0, false, false, 0, false, 0, null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, 0, 0, 0, null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, $v, 0, false, -1, 3670015, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$8$6(UiSettings $s, final AppState $state, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C198@17618L37,198@17569L99:SettingsPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1152339945, $changed, -1, "com.pymcl.android.ui.pages.SettingsPage.<anonymous>.<anonymous>.<anonymous> (SettingsPage.kt:198)");
            }
            List listListOf = CollectionsKt.listOf((Object[]) new String[]{"简体中文", "English"});
            int language = $s.getLanguage();
            ComposerKt.sourceInformationMarkerStart($composer, -702873554, "CC(remember):SettingsPage.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($state);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda177
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsPageKt.SettingsPage$lambda$20$8$6$0$0($state, ((Integer) obj2).intValue());
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Segmented(listListOf, language, (Function1) objRememberedValue, true, $composer, 3078, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$8$6$0$0(AppState $state, final int v) {
        $state.updateSettings(new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda165
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.SettingsPage$lambda$20$8$6$0$0$0(v, (UiSettings) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings SettingsPage$lambda$20$8$6$0$0$0(int $v, UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UiSettings.copy$default(it, false, 0, null, 0, 0, false, 0, false, false, 0, false, 0, null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, 0, 0, 0, null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, $v, false, -1, 3145727, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$8$7(final AppState $state, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C199@17727L35,199@17699L63:SettingsPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(112048106, $changed, -1, "com.pymcl.android.ui.pages.SettingsPage.<anonymous>.<anonymous>.<anonymous> (SettingsPage.kt:199)");
            }
            BtnKind btnKind = BtnKind.Normal;
            ComposerKt.sourceInformationMarkerStart($composer, 304048461, "CC(remember):SettingsPage.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($state);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda113
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SettingsPageKt.SettingsPage$lambda$20$8$7$0$0($state);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Btn("重新运行", btnKind, null, false, false, null, false, (Function0) objRememberedValue, $composer, 54, 124);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsPage$lambda$20$8$7$0$0(AppState $state) {
        $state.open(DialogSpec.FirstRun.INSTANCE);
        return Unit.INSTANCE;
    }

    private static final void Group(final String title, final String sub, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer $composer, final int $changed, final int i) {
        final String sub2;
        Composer $composer2 = $composer.startRestartGroup(1376102740);
        ComposerKt.sourceInformation($composer2, "C(Group)P(2,1)207@17970L103,207@17940L133:SettingsPage.kt#vz4689");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(title) ? 4 : 2;
        }
        int i2 = i & 2;
        if (i2 != 0) {
            $dirty |= 48;
        } else if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(sub) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(function3) ? 256 : 128;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
            sub2 = sub;
        } else {
            if (i2 != 0) {
                sub = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1376102740, $dirty2, -1, "com.pymcl.android.ui.pages.Group (SettingsPage.kt:206)");
            }
            UiKt.m7594CardDzVHIIc(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-298662172, true, new Function3() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda158
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SettingsPageKt.Group$lambda$0(title, sub, function3, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            sub2 = sub;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda159
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsPageKt.Group$lambda$1(title, sub2, function3, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Group$lambda$0(String $title, String $sub, Function3 $content, ColumnScope Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C208@17980L9,209@18027L29,209@18058L9:SettingsPage.kt#vz4689");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(Card) ? 4 : 2;
        }
        if (!$composer.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-298662172, $dirty, -1, "com.pymcl.android.ui.pages.Group.<anonymous> (SettingsPage.kt:208)");
            }
            UiKt.H2($title, null, false, $composer, 0, 6);
            if ($sub != null) {
                $composer.startReplaceGroup(748462766);
                ComposerKt.sourceInformation($composer, "208@18008L10");
                UiKt.Muted($sub, null, false, 0, $composer, 0, 14);
            } else {
                $composer.startReplaceGroup(1727518878);
            }
            $composer.endReplaceGroup();
            SpacerKt.Spacer(SizeKt.m771height3ABfNKs(Modifier.INSTANCE, Dp.m7018constructorimpl(6)), $composer, 6);
            $content.invoke(Card, $composer, Integer.valueOf($dirty & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x07b4  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x07f4  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0870  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x087d  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x099b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void AiSettingsGroup(final androidx.compose.foundation.layout.ColumnScope r62, final com.pymcl.android.ui.state.AppState r63, androidx.compose.runtime.Composer r64, final int r65) {
        /*
            Method dump skipped, instructions count: 2484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.SettingsPageKt.AiSettingsGroup(androidx.compose.foundation.layout.ColumnScope, com.pymcl.android.ui.state.AppState, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AiSettings AiSettingsGroup$lambda$2(MutableState<AiSettings> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AiSettingsForm AiSettingsGroup$lambda$5(MutableState<AiSettingsForm> mutableState) {
        return mutableState.getValue();
    }

    private static final List<String> AiSettingsGroup$lambda$8(MutableState<List<String>> mutableState) {
        return mutableState.getValue();
    }

    private static final String AiSettingsGroup$lambda$11(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final Pair<Boolean, String> AiSettingsGroup$lambda$14(MutableState<Pair<Boolean, String>> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean AiSettingsGroup$lambda$17(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AiSettingsGroup$lambda$18(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AiSettingsGroup$syncUi(AppState $state, final AiSettings st) {
        final Map c = st.toConfig();
        $state.updateSettings(new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda66
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.AiSettingsGroup$syncUi$lambda$19(st, c, (UiSettings) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings AiSettingsGroup$syncUi$lambda$19(AiSettings $st, Map $c, UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int iUiIndex = AiMode.INSTANCE.uiIndex($st.getMode());
        Object obj = $c.get("ai_gateway_url");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Object obj2 = $c.get("ai_base_url");
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) obj2;
        Object obj3 = $c.get("ai_api_key");
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
        return UiSettings.copy$default(it, false, 0, null, 0, 0, false, 0, false, false, 0, false, 0, null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, 0, 0, 0, null, 0, 0, 0, null, false, false, false, iUiIndex, str, str2, (String) obj3, $st.getModel(), $st.getContextWindow(), $st.getFallbackModel(), Permission.INSTANCE.uiIndex($st.getPermissionMode()), 0, 0, null, false, null, null, 0, false, -1, 4177983, null);
    }

    private static final void AiSettingsGroup$up(MutableState<AiSettingsForm> mutableState, MutableState<Pair<Boolean, String>> mutableState2, Function1<? super AiSettingsForm, AiSettingsForm> function1) {
        mutableState.setValue(function1.invoke(AiSettingsGroup$lambda$5(mutableState)));
        mutableState2.setValue(null);
    }

    private static final void AiSettingsGroup$run(AppState $state, MutableState<String> mutableState, String tag, Function1<? super Continuation<? super Unit>, ? extends Object> function1) {
        if (AiSettingsGroup$lambda$11(mutableState) != null) {
            return;
        }
        mutableState.setValue(tag);
        $state.launch(new SettingsPageKt$AiSettingsGroup$run$1(function1, mutableState, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiSettingsGroup$lambda$24(final MutableState $form$delegate, final MutableState $lastResult$delegate, final MutableState $aiModels$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C245@20316L91,245@20240L168:SettingsPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1715547570, $changed, -1, "com.pymcl.android.ui.pages.AiSettingsGroup.<anonymous> (SettingsPage.kt:245)");
            }
            List listListOf = CollectionsKt.listOf((Object[]) new String[]{"内置公益网关（免配置）", "自定义 OpenAI 兼容端点", "自建 AI 网关"});
            int modeIndex = AiSettingsGroup$lambda$5($form$delegate).getModeIndex();
            ComposerKt.sourceInformationMarkerStart($composer, -626224051, "CC(remember):SettingsPage.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda122
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsPageKt.AiSettingsGroup$lambda$24$0$0($form$delegate, $lastResult$delegate, $aiModels$delegate, ((Integer) obj2).intValue());
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Combo(listListOf, modeIndex, (Function1) objRememberedValue, null, false, false, $composer, 390, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiSettingsGroup$lambda$24$0$0(MutableState $form$delegate, MutableState $lastResult$delegate, MutableState $aiModels$delegate, final int v) {
        if (v != AiSettingsGroup$lambda$5($form$delegate).getModeIndex()) {
            AiSettingsGroup$up($form$delegate, $lastResult$delegate, new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda38
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SettingsPageKt.AiSettingsGroup$lambda$24$0$0$0(v, (AiSettingsForm) obj);
                }
            });
            $aiModels$delegate.setValue(CollectionsKt.emptyList());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AiSettingsForm AiSettingsGroup$lambda$24$0$0$0(int $v, AiSettingsForm it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return AiSettingsForm.copy$default(it, $v, null, null, null, null, null, null, null, 0, 510, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiSettingsGroup$lambda$25(final MutableState $form$delegate, final MutableState $lastResult$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C250@20665L37,250@20644L126:SettingsPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(256133971, $changed, -1, "com.pymcl.android.ui.pages.AiSettingsGroup.<anonymous> (SettingsPage.kt:250)");
            }
            String endpoint = AiSettingsGroup$lambda$5($form$delegate).getEndpoint();
            ComposerKt.sourceInformationMarkerStart($composer, 1331611032, "CC(remember):SettingsPage.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda170
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsPageKt.AiSettingsGroup$lambda$25$0$0($form$delegate, $lastResult$delegate, (String) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.m7599InputxAketlw(endpoint, (Function1) objRememberedValue, "https://api.example.com/v1", SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, 0, 0, 0, 0, null, null, false, true, false, $composer, GL11.GL_MAP2_COLOR_4, 3072, 24560);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiSettingsGroup$lambda$25$0$0(MutableState $form$delegate, MutableState $lastResult$delegate, final String v) {
        Intrinsics.checkNotNullParameter(v, "v");
        AiSettingsGroup$up($form$delegate, $lastResult$delegate, new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda105
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.AiSettingsGroup$lambda$25$0$0$0(v, (AiSettingsForm) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AiSettingsForm AiSettingsGroup$lambda$25$0$0$0(String $v, AiSettingsForm it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return AiSettingsForm.copy$default(it, 0, $v, null, null, null, null, null, null, 0, 509, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiSettingsGroup$lambda$26(final MutableState $form$delegate, final MutableState $lastResult$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C251@20853L35,251@20834L118:SettingsPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1867906550, $changed, -1, "com.pymcl.android.ui.pages.AiSettingsGroup.<anonymous> (SettingsPage.kt:251)");
            }
            String apiKey = AiSettingsGroup$lambda$5($form$delegate).getApiKey();
            ComposerKt.sourceInformationMarkerStart($composer, 238135885, "CC(remember):SettingsPage.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda111
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsPageKt.AiSettingsGroup$lambda$26$0$0($form$delegate, $lastResult$delegate, (String) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.m7599InputxAketlw(apiKey, (Function1) objRememberedValue, "sk-…（本地/免鉴权服务可留空）", SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, false, 0, 0, 0, 0, null, null, false, false, false, $composer, 28080, 0, 32736);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiSettingsGroup$lambda$26$0$0(MutableState $form$delegate, MutableState $lastResult$delegate, final String v) {
        Intrinsics.checkNotNullParameter(v, "v");
        AiSettingsGroup$up($form$delegate, $lastResult$delegate, new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda124
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.AiSettingsGroup$lambda$26$0$0$0(v, (AiSettingsForm) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AiSettingsForm AiSettingsGroup$lambda$26$0$0$0(String $v, AiSettingsForm it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return AiSettingsForm.copy$default(it, 0, null, $v, null, null, null, null, null, 0, 507, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiSettingsGroup$lambda$27(final MutableState $form$delegate, final MutableState $lastResult$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C254@21075L36,254@21055L120:SettingsPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1393710093, $changed, -1, "com.pymcl.android.ui.pages.AiSettingsGroup.<anonymous> (SettingsPage.kt:254)");
            }
            String gateway = AiSettingsGroup$lambda$5($form$delegate).getGateway();
            ComposerKt.sourceInformationMarkerStart($composer, 674397719, "CC(remember):SettingsPage.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda166
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsPageKt.AiSettingsGroup$lambda$27$0$0($form$delegate, $lastResult$delegate, (String) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.m7599InputxAketlw(gateway, (Function1) objRememberedValue, "https://gw.example.com", SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, 0, 0, 0, 0, null, null, false, true, false, $composer, GL11.GL_MAP2_COLOR_4, 3072, 24560);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiSettingsGroup$lambda$27$0$0(MutableState $form$delegate, MutableState $lastResult$delegate, final String v) {
        Intrinsics.checkNotNullParameter(v, "v");
        AiSettingsGroup$up($form$delegate, $lastResult$delegate, new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda101
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.AiSettingsGroup$lambda$27$0$0$0(v, (AiSettingsForm) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AiSettingsForm AiSettingsGroup$lambda$27$0$0$0(String $v, AiSettingsForm it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return AiSettingsForm.copy$default(it, 0, null, null, $v, null, null, null, null, 0, 503, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiSettingsGroup$lambda$28(final MutableState $form$delegate, final MutableState $lastResult$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C255@21267L39,255@21244L115:SettingsPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1456384470, $changed, -1, "com.pymcl.android.ui.pages.AiSettingsGroup.<anonymous> (SettingsPage.kt:255)");
            }
            String gatewayKey = AiSettingsGroup$lambda$5($form$delegate).getGatewayKey();
            ComposerKt.sourceInformationMarkerStart($composer, 573863665, "CC(remember):SettingsPage.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda53
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsPageKt.AiSettingsGroup$lambda$28$0$0($form$delegate, $lastResult$delegate, (String) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.m7599InputxAketlw(gatewayKey, (Function1) objRememberedValue, "留空不带鉴权", SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, false, 0, 0, 0, 0, null, null, false, false, false, $composer, 28080, 0, 32736);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiSettingsGroup$lambda$28$0$0(MutableState $form$delegate, MutableState $lastResult$delegate, final String v) {
        Intrinsics.checkNotNullParameter(v, "v");
        AiSettingsGroup$up($form$delegate, $lastResult$delegate, new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda56
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.AiSettingsGroup$lambda$28$0$0$0(v, (AiSettingsForm) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AiSettingsForm AiSettingsGroup$lambda$28$0$0$0(String $v, AiSettingsForm it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return AiSettingsForm.copy$default(it, 0, null, null, null, $v, null, null, null, 0, 495, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0364  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit AiSettingsGroup$lambda$30(java.lang.String r52, final com.pymcl.android.ui.state.AppState r53, final com.pymcl.android.data.AiBridge r54, final com.pymcl.ai.AiSettings r55, final androidx.compose.runtime.MutableState r56, final androidx.compose.runtime.MutableState r57, final androidx.compose.runtime.MutableState r58, final androidx.compose.runtime.MutableState r59, final androidx.compose.runtime.MutableState r60, androidx.compose.runtime.Composer r61, int r62) {
        /*
            Method dump skipped, instructions count: 878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.SettingsPageKt.AiSettingsGroup$lambda$30(java.lang.String, com.pymcl.android.ui.state.AppState, com.pymcl.android.data.AiBridge, com.pymcl.ai.AiSettings, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiSettingsGroup$lambda$30$0$0$0(MutableState $form$delegate, MutableState $lastResult$delegate, final String v) {
        Intrinsics.checkNotNullParameter(v, "v");
        AiSettingsGroup$up($form$delegate, $lastResult$delegate, new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.AiSettingsGroup$lambda$30$0$0$0$0(v, (AiSettingsForm) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AiSettingsForm AiSettingsGroup$lambda$30$0$0$0$0(String $v, AiSettingsForm it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return AiSettingsForm.copy$default(it, 0, null, null, null, null, $v, null, null, 0, 479, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiSettingsGroup$lambda$30$0$1$0(final List $opts, MutableState $form$delegate, MutableState $lastResult$delegate, final int i) {
        AiSettingsGroup$up($form$delegate, $lastResult$delegate, new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda100
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.AiSettingsGroup$lambda$30$0$1$0$0($opts, i, (AiSettingsForm) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AiSettingsForm AiSettingsGroup$lambda$30$0$1$0$0(List $opts, int $i, AiSettingsForm it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return AiSettingsForm.copy$default(it, 0, null, null, null, null, (String) $opts.get($i), null, null, 0, 479, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiSettingsGroup$lambda$30$0$2$0(RowScope $this_Row, AiBridge $ai, AiSettings $b, MutableState $form$delegate, AppState $state, MutableState $aiModels$delegate, MutableState $lastResult$delegate, MutableState $showDetail$delegate, MutableState $busy$delegate) {
        AiSettingsGroup$run($state, $busy$delegate, "models", new SettingsPageKt$AiSettingsGroup$10$1$3$1$1($this_Row, $ai, $b, $form$delegate, $state, $aiModels$delegate, $lastResult$delegate, $showDetail$delegate, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiSettingsGroup$lambda$31(final MutableState $form$delegate, final MutableState $lastResult$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C276@22808L70,276@22784L197:SettingsPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1785915286, $changed, -1, "com.pymcl.android.ui.pages.AiSettingsGroup.<anonymous> (SettingsPage.kt:276)");
            }
            String contextText = AiSettingsGroup$lambda$5($form$delegate).getContextText();
            int iM6696getNumberPjHm6EE = KeyboardType.INSTANCE.m6696getNumberPjHm6EE();
            Modifier modifierM790width3ABfNKs = SizeKt.m790width3ABfNKs(Modifier.INSTANCE, Dp.m7018constructorimpl(160));
            ComposerKt.sourceInformationMarkerStart($composer, 1722329456, "CC(remember):SettingsPage.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda112
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsPageKt.AiSettingsGroup$lambda$31$0$0($form$delegate, $lastResult$delegate, (String) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.m7599InputxAketlw(contextText, (Function1) objRememberedValue, null, modifierM790width3ABfNKs, false, false, 0, 0, iM6696getNumberPjHm6EE, 0, null, null, false, false, false, $composer, 100666416, 0, 32500);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiSettingsGroup$lambda$31$0$0(MutableState $form$delegate, MutableState $lastResult$delegate, final String v) {
        Intrinsics.checkNotNullParameter(v, "v");
        AiSettingsGroup$up($form$delegate, $lastResult$delegate, new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda164
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.AiSettingsGroup$lambda$31$0$0$0(v, (AiSettingsForm) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AiSettingsForm AiSettingsGroup$lambda$31$0$0$0(String $v, AiSettingsForm it) throws IOException {
        Intrinsics.checkNotNullParameter(it, "it");
        String str = $v;
        Appendable sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        return AiSettingsForm.copy$default(it, 0, null, null, null, null, null, StringsKt.take(((StringBuilder) sb).toString(), 9), null, 0, 447, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiSettingsGroup$lambda$32(final MutableState $form$delegate, final MutableState $lastResult$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C277@23051L37,277@23030L93:SettingsPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1270394837, $changed, -1, "com.pymcl.android.ui.pages.AiSettingsGroup.<anonymous> (SettingsPage.kt:277)");
            }
            String fallback = AiSettingsGroup$lambda$5($form$delegate).getFallback();
            ComposerKt.sourceInformationMarkerStart($composer, -1078725520, "CC(remember):SettingsPage.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda60
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsPageKt.AiSettingsGroup$lambda$32$0$0($form$delegate, $lastResult$delegate, (String) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.m7599InputxAketlw(fallback, (Function1) objRememberedValue, "留空不启用", SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, 0, 0, 0, 0, null, null, false, false, false, $composer, GL11.GL_MAP2_COLOR_4, 0, 32752);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiSettingsGroup$lambda$32$0$0(MutableState $form$delegate, MutableState $lastResult$delegate, final String v) {
        Intrinsics.checkNotNullParameter(v, "v");
        AiSettingsGroup$up($form$delegate, $lastResult$delegate, new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.AiSettingsGroup$lambda$32$0$0$0(v, (AiSettingsForm) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AiSettingsForm AiSettingsGroup$lambda$32$0$0$0(String $v, AiSettingsForm it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return AiSettingsForm.copy$default(it, 0, null, null, null, null, null, null, $v, 0, 383, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiSettingsGroup$lambda$33(final MutableState $form$delegate, final MutableState $lastResult$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C278@23212L44,278@23149L108:SettingsPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-754874388, $changed, -1, "com.pymcl.android.ui.pages.AiSettingsGroup.<anonymous> (SettingsPage.kt:278)");
            }
            List<String> ui_labels = Permission.INSTANCE.getUI_LABELS();
            int permissionIndex = AiSettingsGroup$lambda$5($form$delegate).getPermissionIndex();
            ComposerKt.sourceInformationMarkerStart($composer, 415188280, "CC(remember):SettingsPage.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda80
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsPageKt.AiSettingsGroup$lambda$33$0$0($form$delegate, $lastResult$delegate, ((Integer) obj2).intValue());
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Combo(ui_labels, permissionIndex, (Function1) objRememberedValue, null, false, false, $composer, 384, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiSettingsGroup$lambda$33$0$0(MutableState $form$delegate, MutableState $lastResult$delegate, final int v) {
        AiSettingsGroup$up($form$delegate, $lastResult$delegate, new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$$ExternalSyntheticLambda110
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsPageKt.AiSettingsGroup$lambda$33$0$0$0(v, (AiSettingsForm) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AiSettingsForm AiSettingsGroup$lambda$33$0$0$0(int $v, AiSettingsForm it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return AiSettingsForm.copy$default(it, 0, null, null, null, null, null, null, null, $v, 255, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiSettingsGroup$lambda$34$0$0(String $err, AppState $state, AiSettings $b, RowScope $this_Row, MutableState $form$delegate, AiBridge $ai, MutableState $base$delegate, MutableState $busy$delegate) {
        if ($err != null) {
            $state.toast("还不能保存", $err, "error");
            return Unit.INSTANCE;
        }
        AiSettingsGroup$run($state, $busy$delegate, "save", new SettingsPageKt$AiSettingsGroup$14$1$1$1($b, $this_Row, $form$delegate, $ai, $state, $base$delegate, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiSettingsGroup$lambda$34$1$0(String $err, AppState $state, MutableState $lastResult$delegate, RowScope $this_Row, AiBridge $ai, AiSettings $b, MutableState $form$delegate, MutableState $showDetail$delegate, MutableState $busy$delegate) {
        if ($err == null) {
            AiSettingsGroup$run($state, $busy$delegate, "test", new SettingsPageKt$AiSettingsGroup$14$2$1$1($this_Row, $state, $ai, $b, $form$delegate, $lastResult$delegate, $showDetail$delegate, null));
            return Unit.INSTANCE;
        }
        $lastResult$delegate.setValue(TuplesKt.to(false, $err));
        $state.toast("AI 连接失败", $err, "error");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiSettingsGroup$lambda$35$0$0(MutableState $showDetail$delegate) {
        AiSettingsGroup$lambda$18($showDetail$delegate, !AiSettingsGroup$lambda$17($showDetail$delegate));
        return Unit.INSTANCE;
    }
}
