package com.pymcl.android.ui.pages;

import android.content.Context;
import android.net.Uri;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.pymcl.ai.AiText;
import com.pymcl.ai.BgTaskInfo;
import com.pymcl.android.data.AiTaskCenter;
import com.pymcl.android.data.AiTaskRow;
import com.pymcl.android.data.AiUiExtras;
import com.pymcl.android.data.CrashScenes;
import com.pymcl.android.data.FeedbackLogic;
import com.pymcl.android.data.MpLogic;
import com.pymcl.android.data.PlaytimeLogic;
import com.pymcl.android.data.ServerLogic;
import com.pymcl.android.data.SettingsExtrasIO;
import com.pymcl.android.data.TaskCrashLogic;
import com.pymcl.android.ui.Destination;
import com.pymcl.android.ui.components.BtnKind;
import com.pymcl.android.ui.components.Ico;
import com.pymcl.android.ui.components.UiKt;
import com.pymcl.android.ui.i18n.I18nKt;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.DialogSpec;
import com.pymcl.android.ui.state.FeedbackRecord;
import com.pymcl.android.ui.state.HelpArticle;
import com.pymcl.android.ui.state.LanWorldRow;
import com.pymcl.android.ui.state.MpPhase;
import com.pymcl.android.ui.state.MpState;
import com.pymcl.android.ui.state.PlaytimeRow;
import com.pymcl.android.ui.state.TaskRow;
import com.pymcl.android.ui.state.TaskState;
import com.pymcl.android.ui.theme.Py;
import com.pymcl.core.instance.ServerEntry;
import com.pymcl.multiplayer.TerracottaInterop;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.apache.commons.lang3.concurrent.AbstractCircuitBreaker;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.windows.User32;

/* compiled from: MiscPages.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007b\u0002\b\u0005b\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b¢\u0006\u0002\u0010\u0004\u001a'\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0003b\u0002\b\u0005b\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b¢\u0006\u0002\u0010\f\u001aa\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016H\u0003b\u0002\b\u0005b\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b¢\u0006\u0002\u0010\u0017\u001a'\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007b\u0002\b\u0005b\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b¢\u0006\u0002\u0010\u0004\u001a'\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007b\u0002\b\u0005b\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b¢\u0006\u0002\u0010\u0004\u001a'\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007b\u0002\b\u0005b\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b¢\u0006\u0002\u0010\u0004\u001a'\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003b\u0002\b\u0005b\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b¢\u0006\u0002\u0010\u0004\u001a'\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007b\u0002\b\u0005b\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b¢\u0006\u0002\u0010\u0004¨\u0006\u001d²\u0006\n\u0010\u001e\u001a\u00020\u001fX\u008a\u0084\u0002²\u0006\n\u0010 \u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u0010!\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u0010\"\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\u0010\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u008a\u0084\u0002²\u0006\u0010\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0$X\u008a\u008e\u0002²\u0006\n\u0010'\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\u0010\u0010(\u001a\b\u0012\u0004\u0012\u00020)0$X\u008a\u008e\u0002²\u0006\n\u0010*\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u0010!\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\u0010\u0010+\u001a\b\u0012\u0004\u0012\u00020,0$X\u008a\u008e\u0002²\u0006\f\u0010-\u001a\u0004\u0018\u00010\u000bX\u008a\u008e\u0002²\u0006\u0012\u0010.\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010$X\u008a\u008e\u0002²\u0006\n\u00100\u001a\u000201X\u008a\u008e\u0002²\u0006\n\u0010!\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u00102\u001a\u000201X\u008a\u008e\u0002²\u0006\u0010\u00103\u001a\b\u0012\u0004\u0012\u0002040$X\u008a\u008e\u0002²\u0006\u0016\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b06X\u008a\u008e\u0002²\u0006\n\u00107\u001a\u000201X\u008a\u008e\u0002²\u0006\n\u0010\u000f\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u00108\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u00109\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u0010:\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\u0010\u0010;\u001a\b\u0012\u0004\u0012\u00020<0$X\u008a\u008e\u0002²\u0006\u0010\u0010=\u001a\b\u0012\u0004\u0012\u00020>0$X\u008a\u008e\u0002²\u0006\u0010\u0010?\u001a\b\u0012\u0004\u0012\u00020@0$X\u008a\u008e\u0002²\u0006\n\u0010A\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\f\u0010B\u001a\u0004\u0018\u00010\u000bX\u008a\u008e\u0002²\u0006\n\u0010C\u001a\u00020\u0013X\u008a\u008e\u0002"}, d2 = {"MultiplayerPage", "", "state", "Lcom/pymcl/android/ui/state/AppState;", "(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/runtime/ComposableTarget;", "applier", "androidx.compose.ui.UiComposable", "Glyph", "ch", "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "MpAction", "glyph", "title", "hint", "btn", "danger", "", "enabled", "onClick", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ServersPage", "PlaytimePage", "TasksPage", "AiBackgroundTasksSection", "FeedbackPage", "PyMCL-Android:app_debug", "mp", "Lcom/pymcl/android/ui/state/MpState;", "code", "busy", "lanOn", "lan", "", "Lcom/pymcl/android/ui/state/LanWorldRow;", "instances", "inst", "all", "Lcom/pymcl/core/instance/ServerEntry;", "loading", "rows", "Lcom/pymcl/android/ui/state/PlaytimeRow;", "detail", "sessions", "Lcom/pymcl/android/data/SettingsExtrasIO$SessionRow;", "range", "", "tick", "tasks", "Lcom/pymcl/ai/BgTaskInfo;", "titles", "", "kind", "body", "contact", NotificationCompat.CATEGORY_SYSTEM, "attachments", "Landroid/net/Uri;", "hist", "Lcom/pymcl/android/ui/state/FeedbackRecord;", "arts", "Lcom/pymcl/android/ui/state/HelpArticle;", "q", AbstractCircuitBreaker.PROPERTY_NAME, "sending"}, k = 2, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes22.dex */
public final class MiscPagesKt {

    /* compiled from: MiscPages.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MpPhase.values().length];
            try {
                iArr[MpPhase.NotInstalled.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[MpPhase.Stopped.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[MpPhase.Idle.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[MpPhase.HostScanning.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[MpPhase.Hosting.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr[MpPhase.GuestJoining.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                iArr[MpPhase.GuestReady.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[MpPhase.Error.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TaskState.values().length];
            try {
                iArr2[TaskState.Done.ordinal()] = 1;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr2[TaskState.Failed.ordinal()] = 2;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr2[TaskState.Cancelled.ordinal()] = 3;
            } catch (NoSuchFieldError e11) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiBackgroundTasksSection$lambda$1(AppState appState, int i, Composer composer, int i2) {
        AiBackgroundTasksSection(appState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiBackgroundTasksSection$lambda$11(AppState appState, int i, Composer composer, int i2) {
        AiBackgroundTasksSection(appState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiBackgroundTasksSection$lambda$14(AppState appState, int i, Composer composer, int i2) {
        AiBackgroundTasksSection(appState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FeedbackPage$lambda$43(AppState appState, int i, Composer composer, int i2) {
        FeedbackPage(appState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Glyph$lambda$1(String str, int i, Composer composer, int i2) {
        Glyph(str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MpAction$lambda$1(String str, String str2, String str3, String str4, boolean z, boolean z2, Function0 function0, int i, int i2, Composer composer, int i3) {
        MpAction(str, str2, str3, str4, z, z2, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultiplayerPage$lambda$16(AppState appState, int i, Composer composer, int i2) {
        MultiplayerPage(appState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlaytimePage$lambda$24(AppState appState, int i, Composer composer, int i2) {
        PlaytimePage(appState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ServersPage$lambda$21(AppState appState, int i, Composer composer, int i2) {
        ServersPage(appState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TasksPage$lambda$1(AppState appState, int i, Composer composer, int i2) {
        TasksPage(appState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void MultiplayerPage(final AppState state, Composer $composer, final int $changed) {
        Composer $composer2;
        State mp$delegate;
        Context ctx;
        MutableState busy$delegate;
        MutableState lanOn$delegate;
        State lan$delegate;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer $composer3 = $composer.startRestartGroup(1542189112);
        ComposerKt.sourceInformation($composer3, "C(MultiplayerPage)33@1342L41,33@1384L69,34@1510L7,35@1534L31,36@1582L34,37@1634L34,38@1684L101,38@1786L37,39@1890L7,41@1992L248,41@1972L268,46@2327L102,55@2902L6183,55@2891L6194:MiscPages.kt#vz4689");
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
                ComposerKt.traceEventStart(1542189112, $dirty2, -1, "com.pymcl.android.ui.pages.MultiplayerPage (MiscPages.kt:31)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, 280023841, "CC(remember):MiscPages.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objTerracottaStates = state.getApi().terracottaStates();
                $composer3.updateRememberedValue(objTerracottaStates);
                objRememberedValue = objTerracottaStates;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            State mp$delegate2 = SnapshotStateKt.collectAsState((Flow) objRememberedValue, new MpState(MpPhase.Stopped, null, null, null, "联机内核未启动", null, null, 110, null), null, $composer3, MpState.$stable << 3, 2);
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Context ctx2 = (Context) objConsume;
            ComposerKt.sourceInformationMarkerStart($composer3, 280029975, "CC(remember):MiscPages.kt#9igjgp");
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue2 = objMutableStateOf$default;
            }
            final MutableState code$delegate = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 280031514, "CC(remember):MiscPages.kt#9igjgp");
            Object objRememberedValue3 = $composer3.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                mp$delegate = mp$delegate2;
                ctx = ctx2;
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue3 = objMutableStateOf$default2;
            } else {
                mp$delegate = mp$delegate2;
                ctx = ctx2;
            }
            MutableState busy$delegate2 = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 280033178, "CC(remember):MiscPages.kt#9igjgp");
            Object objRememberedValue4 = $composer3.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                busy$delegate = busy$delegate2;
                Object objMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default3);
                objRememberedValue4 = objMutableStateOf$default3;
            } else {
                busy$delegate = busy$delegate2;
            }
            MutableState lanOn$delegate2 = (MutableState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            boolean zMultiplayerPage$lambda$9 = MultiplayerPage$lambda$9(lanOn$delegate2);
            ComposerKt.sourceInformationMarkerStart($composer3, 280034845, "CC(remember):MiscPages.kt#9igjgp");
            boolean zChanged = $composer3.changed(zMultiplayerPage$lambda$9);
            Object objRememberedValue5 = $composer3.rememberedValue();
            if (zChanged || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                Object objLanWorlds = MultiplayerPage$lambda$9(lanOn$delegate2) ? state.getApi().lanWorlds() : FlowKt.flowOf(CollectionsKt.emptyList());
                $composer3.updateRememberedValue(objLanWorlds);
                objRememberedValue5 = objLanWorlds;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Context ctx3 = ctx;
            State lan$delegate2 = SnapshotStateKt.collectAsState((Flow) objRememberedValue5, CollectionsKt.emptyList(), null, $composer3, 48, 2);
            $composer2 = $composer3;
            ProvidableCompositionLocal<ClipboardManager> localClipboardManager = CompositionLocalsKt.getLocalClipboardManager();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume2 = $composer3.consume(localClipboardManager);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final ClipboardManager clip = (ClipboardManager) objConsume2;
            ComposerKt.sourceInformationMarkerStart($composer2, 280044848, "CC(remember):MiscPages.kt#9igjgp");
            boolean zChangedInstance = (($dirty2 & 14) == 4 || (($dirty2 & 8) != 0 && $composer2.changedInstance(state))) | $composer2.changedInstance(ctx3);
            Object objRememberedValue6 = $composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                lanOn$delegate = lanOn$delegate2;
                lan$delegate = lan$delegate2;
                Object obj = (Function2) new MiscPagesKt$MultiplayerPage$1$1(state, ctx3, null);
                $composer2.updateRememberedValue(obj);
                objRememberedValue6 = obj;
            } else {
                lanOn$delegate = lanOn$delegate2;
                lan$delegate = lan$delegate2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(ctx3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, $composer2, 0);
            String strMultiplayerPage$lambda$3 = MultiplayerPage$lambda$3(code$delegate);
            ComposerKt.sourceInformationMarkerStart($composer2, 280055422, "CC(remember):MiscPages.kt#9igjgp");
            boolean zChanged2 = $composer2.changed(strMultiplayerPage$lambda$3);
            Object objRememberedValue7 = $composer2.rememberedValue();
            if (zChanged2 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                Object objCodeHint = MpLogic.INSTANCE.codeHint(MultiplayerPage$lambda$3(code$delegate), TerracottaInterop.INSTANCE.classify(MultiplayerPage$lambda$3(code$delegate)).name());
                $composer2.updateRememberedValue(objCodeHint);
                objRememberedValue7 = objCodeHint;
            }
            Pair pair = (Pair) objRememberedValue7;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final boolean codeOk = ((Boolean) pair.component1()).booleanValue();
            final String codeHint = (String) pair.component2();
            final State mp$delegate3 = mp$delegate;
            final MutableState lanOn$delegate3 = lanOn$delegate;
            final State lan$delegate3 = lan$delegate;
            final MutableState busy$delegate3 = busy$delegate;
            UiKt.ScrollBody(null, ComposableLambdaKt.rememberComposableLambda(-314507541, true, new Function3() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return MiscPagesKt.MultiplayerPage$lambda$15(state, mp$delegate3, busy$delegate3, lanOn$delegate3, lan$delegate3, codeHint, codeOk, code$delegate, clip, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer2, 54), $composer2, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda28
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return MiscPagesKt.MultiplayerPage$lambda$16(state, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final MpState MultiplayerPage$lambda$1(State<MpState> state) {
        return (MpState) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String MultiplayerPage$lambda$3(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean MultiplayerPage$lambda$6(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MultiplayerPage$lambda$7(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final void MultiplayerPage$lambda$10(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean MultiplayerPage$lambda$9(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final List<LanWorldRow> MultiplayerPage$lambda$12(State<? extends List<LanWorldRow>> state) {
        return (List) state.getValue();
    }

    private static final void MultiplayerPage$act(AppState $state, MutableState<Boolean> mutableState, Function1<? super Continuation<? super Unit>, ? extends Object> function1) {
        if (MultiplayerPage$lambda$6(mutableState)) {
            return;
        }
        MultiplayerPage$lambda$7(mutableState, true);
        $state.launch(new MiscPagesKt$MultiplayerPage$act$1(function1, mutableState, null));
    }

    private static final void MultiplayerPage$enter(AppState $state, String addr) {
        if (!StringsKt.isBlank(addr)) {
            if (!$state.getGameRunning()) {
                $state.navigate(Destination.Launch);
                $state.startGame(addr);
                return;
            } else {
                $state.toast("游戏正在运行", "请先退出当前游戏", "warn");
                return;
            }
        }
        $state.toast("还没有拿到房间地址", "请等连接完成后再进入", "warn");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultiplayerPage$lambda$15(final AppState $state, final State $mp$delegate, final MutableState $busy$delegate, final MutableState $lanOn$delegate, final State $lan$delegate, final String $codeHint, final boolean $codeOk, final MutableState $code$delegate, final ClipboardManager $clip, ColumnScope ScrollBody, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(ScrollBody, "$this$ScrollBody");
        ComposerKt.sourceInformation($composer, "C56@2970L323,56@2912L381,61@3336L1862,84@5208L3831,61@3302L5738,126@9049L30:MiscPages.kt#vz4689");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-314507541, $changed, -1, "com.pymcl.android.ui.pages.MultiplayerPage.<anonymous> (MiscPages.kt:56)");
            }
            UiKt.Section("联机", "输入邀请码即可加入。陶瓦是 EasyTier P2P 打洞，不是 FRP 隧道；", null, false, ComposableLambdaKt.rememberComposableLambda(1482769053, true, new Function3() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return MiscPagesKt.MultiplayerPage$lambda$15$0($state, $mp$delegate, $busy$delegate, $lanOn$delegate, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24630, 12);
            GamePagesKt.m7768TwoPaneAjpBEmI(0.0f, 0.42f, ComposableLambdaKt.rememberComposableLambda(2037380148, true, new Function3() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return MiscPagesKt.MultiplayerPage$lambda$15$1($mp$delegate, $lanOn$delegate, $lan$delegate, $state, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), ComposableLambdaKt.rememberComposableLambda(1334784309, true, new Function3() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return MiscPagesKt.MultiplayerPage$lambda$15$2($state, $mp$delegate, $busy$delegate, $codeHint, $codeOk, $code$delegate, $clip, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, GL11.GL_MAP2_COLOR_4, 1);
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
    public static final Unit MultiplayerPage$lambda$15$0(final AppState $state, State $mp$delegate, final MutableState $busy$delegate, final MutableState $lanOn$delegate, RowScope Section, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Section, "$this$Section");
        ComposerKt.sourceInformation($composer, "C58@3147L38,58@3067L118,59@3265L18,59@3198L85:MiscPages.kt#vz4689");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1482769053, $changed, -1, "com.pymcl.android.ui.pages.MultiplayerPage.<anonymous>.<anonymous> (MiscPages.kt:58)");
            }
            BtnKind btnKind = BtnKind.Normal;
            boolean z = MpLogic.INSTANCE.canDisconnect(MultiplayerPage$lambda$1($mp$delegate).getPhase()) && !MultiplayerPage$lambda$6($busy$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, -988076637, "CC(remember):MiscPages.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($state);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MiscPagesKt.MultiplayerPage$lambda$15$0$0$0($state, $busy$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Btn("退出房间", btnKind, null, z, false, null, false, (Function0) objRememberedValue, $composer, 54, 116);
            String str = MultiplayerPage$lambda$9($lanOn$delegate) ? "停止局域网发现" : "局域网发现";
            BtnKind btnKind2 = BtnKind.Ghost;
            ImageVector refresh = Ico.INSTANCE.getRefresh();
            ComposerKt.sourceInformationMarkerStart($composer, -988072881, "CC(remember):MiscPages.kt#9igjgp");
            Object objRememberedValue2 = $composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MiscPagesKt.MultiplayerPage$lambda$15$0$1$0($lanOn$delegate);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Btn(str, btnKind2, refresh, false, false, null, false, (Function0) objRememberedValue2, $composer, 12582960, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultiplayerPage$lambda$15$0$0$0(AppState $state, MutableState $busy$delegate) {
        MultiplayerPage$act($state, $busy$delegate, new MiscPagesKt$MultiplayerPage$3$1$1$1$1($state, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultiplayerPage$lambda$15$0$1$0(MutableState $lanOn$delegate) {
        MultiplayerPage$lambda$10($lanOn$delegate, !MultiplayerPage$lambda$9($lanOn$delegate));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultiplayerPage$lambda$15$1(final State $mp$delegate, final MutableState $lanOn$delegate, final State $lan$delegate, final AppState $state, ColumnScope TwoPane, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TwoPane, "$this$TwoPane");
        ComposerKt.sourceInformation($composer, "C62@3380L1808,62@3350L1838:MiscPages.kt#vz4689");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2037380148, $changed, -1, "com.pymcl.android.ui.pages.MultiplayerPage.<anonymous>.<anonymous> (MiscPages.kt:62)");
            }
            UiKt.m7594CardDzVHIIc(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1964072100, true, new Function3() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda64
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return MiscPagesKt.MultiplayerPage$lambda$15$1$0($mp$delegate, $lanOn$delegate, $lan$delegate, $state, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
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
    /* JADX WARN: Removed duplicated region for block: B:139:0x08a5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x08d2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x04ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit MultiplayerPage$lambda$15$1$0(androidx.compose.runtime.State r75, androidx.compose.runtime.MutableState r76, androidx.compose.runtime.State r77, final com.pymcl.android.ui.state.AppState r78, androidx.compose.foundation.layout.ColumnScope r79, androidx.compose.runtime.Composer r80, int r81) {
        /*
            Method dump skipped, instructions count: 2268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.MiscPagesKt.MultiplayerPage$lambda$15$1$0(androidx.compose.runtime.State, androidx.compose.runtime.MutableState, androidx.compose.runtime.State, com.pymcl.android.ui.state.AppState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultiplayerPage$lambda$15$1$0$2$0$1$0(LanWorldRow $w, AppState $state) {
        MultiplayerPage$enter($state, $w.getAddress());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultiplayerPage$lambda$15$2(final AppState $state, final State $mp$delegate, final MutableState $busy$delegate, final String $codeHint, final boolean $codeOk, final MutableState $code$delegate, final ClipboardManager $clip, ColumnScope TwoPane, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TwoPane, "$this$TwoPane");
        ComposerKt.sourceInformation($composer, "C:MiscPages.kt#vz4689");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1334784309, $changed, -1, "com.pymcl.android.ui.pages.MultiplayerPage.<anonymous>.<anonymous> (MiscPages.kt:85)");
            }
            final boolean on = !MultiplayerPage$lambda$6($busy$delegate);
            switch (WhenMappings.$EnumSwitchMapping$0[MultiplayerPage$lambda$1($mp$delegate).getPhase().ordinal()]) {
                case 1:
                    $composer.startReplaceGroup(-1467497268);
                    ComposerKt.sourceInformation($composer, "87@5387L39,87@5307L119");
                    ComposerKt.sourceInformationMarkerStart($composer, -1467494788, "CC(remember):MiscPages.kt#9igjgp");
                    boolean zChangedInstance = $composer.changedInstance($state);
                    Object objRememberedValue = $composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        Object obj = new Function0() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda93
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MiscPagesKt.MultiplayerPage$lambda$15$2$0$0($state, $busy$delegate);
                            }
                        };
                        $composer.updateRememberedValue(obj);
                        objRememberedValue = obj;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    MpAction("瓦", "联机内核不可用", "本设备无法加载内置的陶瓦联机内核，可改用局域网发现或公网直连。", "重试", false, on, (Function0) objRememberedValue, $composer, GL11.GL_MAP2_TEXTURE_COORD_4, 16);
                    $composer.endReplaceGroup();
                    break;
                case 2:
                    $composer.startReplaceGroup(-1467492324);
                    ComposerKt.sourceInformation($composer, "88@5526L39,88@5462L103");
                    ComposerKt.sourceInformationMarkerStart($composer, -1467490340, "CC(remember):MiscPages.kt#9igjgp");
                    boolean zChangedInstance2 = $composer.changedInstance($state);
                    Object objRememberedValue2 = $composer.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        Object obj2 = new Function0() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda96
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MiscPagesKt.MultiplayerPage$lambda$15$2$1$0($state, $busy$delegate);
                            }
                        };
                        $composer.updateRememberedValue(obj2);
                        objRememberedValue2 = obj2;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    MpAction("启", "启动联机内核", "内核已内置，点一下即可开始联机。", "启动", false, on, (Function0) objRememberedValue2, $composer, GL11.GL_MAP2_TEXTURE_COORD_4, 16);
                    $composer.endReplaceGroup();
                    break;
                case 3:
                    $composer.startReplaceGroup(1752562757);
                    ComposerKt.sourceInformation($composer, "90@5707L38,90@5620L125,91@5796L886,91@5766L916,102@6813L471,102@6703L581");
                    ComposerKt.sourceInformationMarkerStart($composer, -1467484549, "CC(remember):MiscPages.kt#9igjgp");
                    boolean zChangedInstance3 = $composer.changedInstance($state);
                    Object objRememberedValue3 = $composer.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        Object obj3 = new Function0() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda97
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MiscPagesKt.MultiplayerPage$lambda$15$2$2$0($state, $busy$delegate);
                            }
                        };
                        $composer.updateRememberedValue(obj3);
                        objRememberedValue3 = obj3;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    MpAction("房", "我想当房主", "先进入单人世界并“对局域网开放”，再点创建生成邀请码。首次会请求 VPN 授权。", "创建", false, on, (Function0) objRememberedValue3, $composer, GL11.GL_MAP2_TEXTURE_COORD_4, 16);
                    UiKt.m7594CardDzVHIIc(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-795071643, true, new Function3() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda98
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            return MiscPagesKt.MultiplayerPage$lambda$15$2$3($codeHint, $codeOk, on, $state, $code$delegate, $busy$delegate, (ColumnScope) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                        }
                    }, $composer, 54), $composer, 3078, 6);
                    boolean z = on && !$state.getGameRunning();
                    ComposerKt.sourceInformationMarkerStart($composer, -1467448724, "CC(remember):MiscPages.kt#9igjgp");
                    boolean zChangedInstance4 = $composer.changedInstance($state);
                    Object objRememberedValue4 = $composer.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        Object obj4 = new Function0() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda99
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MiscPagesKt.MultiplayerPage$lambda$15$2$4$0($state);
                            }
                        };
                        $composer.updateRememberedValue(obj4);
                        objRememberedValue4 = obj4;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    MpAction("直", "朋友是公网就直连", "让他把单人世界对局域网开放，并在路由映射该端口，然后填他的公网 IP:端口。", "直连", false, z, (Function0) objRememberedValue4, $composer, GL11.GL_MAP2_TEXTURE_COORD_4, 16);
                    $composer.endReplaceGroup();
                    break;
                case 4:
                    $composer.startReplaceGroup(-1467432097);
                    ComposerKt.sourceInformation($composer, "109@7443L38,109@7343L138");
                    String label = MultiplayerPage$lambda$1($mp$delegate).getLabel();
                    if (label.length() == 0) {
                        label = "正在扫描局域网世界";
                    }
                    String str = label;
                    ComposerKt.sourceInformationMarkerStart($composer, -1467428997, "CC(remember):MiscPages.kt#9igjgp");
                    boolean zChangedInstance5 = $composer.changedInstance($state);
                    Object objRememberedValue5 = $composer.rememberedValue();
                    if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        Object obj5 = new Function0() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda100
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MiscPagesKt.MultiplayerPage$lambda$15$2$6$0($state, $busy$delegate);
                            }
                        };
                        $composer.updateRememberedValue(obj5);
                        objRememberedValue5 = obj5;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    MpAction("扫", str, "请启动游戏，进入单人世界，按 ESC，选择对局域网开放。", "取消", false, on, (Function0) objRememberedValue5, $composer, 3462, 16);
                    $composer.endReplaceGroup();
                    break;
                case 5:
                    $composer.startReplaceGroup(1754438071);
                    ComposerKt.sourceInformation($composer, "111@7569L583,111@7539L613,116@8251L38,116@8173L116");
                    UiKt.m7594CardDzVHIIc(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1569393827, true, new Function3() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda101
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            return MiscPagesKt.MultiplayerPage$lambda$15$2$7($clip, $mp$delegate, $state, (ColumnScope) obj6, (Composer) obj7, ((Integer) obj8).intValue());
                        }
                    }, $composer, 54), $composer, 3078, 6);
                    ComposerKt.sourceInformationMarkerStart($composer, -1467403141, "CC(remember):MiscPages.kt#9igjgp");
                    boolean zChangedInstance6 = $composer.changedInstance($state);
                    Object objRememberedValue6 = $composer.rememberedValue();
                    if (zChangedInstance6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        Object obj6 = new Function0() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MiscPagesKt.MultiplayerPage$lambda$15$2$8$0($state, $busy$delegate);
                            }
                        };
                        $composer.updateRememberedValue(obj6);
                        objRememberedValue6 = obj6;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    MpAction("返", "退出", "这会彻底关闭房间，其他房客将一并退出。", "退出", true, on, (Function0) objRememberedValue6, $composer, 28086, 0);
                    $composer.endReplaceGroup();
                    break;
                case 6:
                    $composer.startReplaceGroup(-1467399958);
                    ComposerKt.sourceInformation($composer, "118@8427L38,118@8348L117");
                    String label2 = MultiplayerPage$lambda$1($mp$delegate).getLabel();
                    if (label2.length() == 0) {
                        label2 = "正在加入房间";
                    }
                    String str2 = label2;
                    ComposerKt.sourceInformationMarkerStart($composer, -1467397509, "CC(remember):MiscPages.kt#9igjgp");
                    boolean zChangedInstance7 = $composer.changedInstance($state);
                    Object objRememberedValue7 = $composer.rememberedValue();
                    if (zChangedInstance7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        Object obj7 = new Function0() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MiscPagesKt.MultiplayerPage$lambda$15$2$10$0($state, $busy$delegate);
                            }
                        };
                        $composer.updateRememberedValue(obj7);
                        objRememberedValue7 = obj7;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    MpAction("连", str2, "正在与房主建立连接。", "取消", false, on, (Function0) objRememberedValue7, $composer, 3462, 16);
                    $composer.endReplaceGroup();
                    break;
                case 7:
                    $composer.startReplaceGroup(1755403814);
                    ComposerKt.sourceInformation($composer, "120@8693L23,120@8526L190,121@8807L38,121@8737L108");
                    boolean z2 = MpLogic.INSTANCE.canEnter(MultiplayerPage$lambda$1($mp$delegate).getPhase(), MultiplayerPage$lambda$1($mp$delegate).getServerUrl()) && !$state.getGameRunning();
                    ComposerKt.sourceInformationMarkerStart($composer, -1467389012, "CC(remember):MiscPages.kt#9igjgp");
                    boolean zChangedInstance8 = $composer.changedInstance($state) | $composer.changed($mp$delegate);
                    Object objRememberedValue8 = $composer.rememberedValue();
                    if (zChangedInstance8 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        Object obj8 = new Function0() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MiscPagesKt.MultiplayerPage$lambda$15$2$11$0($mp$delegate, $state);
                            }
                        };
                        $composer.updateRememberedValue(obj8);
                        objRememberedValue8 = obj8;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    MpAction("进", "进入世界", "一键启动游戏并直接进入房主的世界（1.20+ 用快速加入，低版本用 --server）。也已写入多人列表「陶瓦联机大厅」。", "进入", false, z2, (Function0) objRememberedValue8, $composer, GL11.GL_MAP2_TEXTURE_COORD_4, 16);
                    ComposerKt.sourceInformationMarkerStart($composer, -1467385349, "CC(remember):MiscPages.kt#9igjgp");
                    boolean zChangedInstance9 = $composer.changedInstance($state);
                    Object objRememberedValue9 = $composer.rememberedValue();
                    if (zChangedInstance9 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        Object obj9 = new Function0() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda94
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MiscPagesKt.MultiplayerPage$lambda$15$2$12$0($state, $busy$delegate);
                            }
                        };
                        $composer.updateRememberedValue(obj9);
                        objRememberedValue9 = obj9;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    MpAction("返", "退出房间", "断开与房主的连接。", "退出", true, on, (Function0) objRememberedValue9, $composer, 28086, 0);
                    $composer.endReplaceGroup();
                    break;
                case 8:
                    $composer.startReplaceGroup(-1467382389);
                    ComposerKt.sourceInformation($composer, "123@8977L38,123@8897L118");
                    String label3 = MultiplayerPage$lambda$1($mp$delegate).getLabel();
                    if (label3.length() == 0) {
                        label3 = "请返回后重试，或检查网络。";
                    }
                    String str3 = label3;
                    ComposerKt.sourceInformationMarkerStart($composer, -1467379909, "CC(remember):MiscPages.kt#9igjgp");
                    boolean zChangedInstance10 = $composer.changedInstance($state);
                    Object objRememberedValue10 = $composer.rememberedValue();
                    if (zChangedInstance10 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        Object obj10 = new Function0() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda95
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MiscPagesKt.MultiplayerPage$lambda$15$2$14$0($state, $busy$delegate);
                            }
                        };
                        $composer.updateRememberedValue(obj10);
                        objRememberedValue10 = obj10;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    MpAction("联", "联机失败", str3, "返回", false, on, (Function0) objRememberedValue10, $composer, 3126, 16);
                    $composer.endReplaceGroup();
                    break;
                default:
                    $composer.startReplaceGroup(-1467495463);
                    $composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
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
    public static final Unit MultiplayerPage$lambda$15$2$0$0(AppState $state, MutableState $busy$delegate) {
        MultiplayerPage$act($state, $busy$delegate, new MiscPagesKt$MultiplayerPage$3$3$1$1$1($state, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultiplayerPage$lambda$15$2$1$0(AppState $state, MutableState $busy$delegate) {
        MultiplayerPage$act($state, $busy$delegate, new MiscPagesKt$MultiplayerPage$3$3$2$1$1($state, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultiplayerPage$lambda$15$2$2$0(AppState $state, MutableState $busy$delegate) {
        MultiplayerPage$act($state, $busy$delegate, new MiscPagesKt$MultiplayerPage$3$3$3$1$1($state, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:58:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0577  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit MultiplayerPage$lambda$15$2$3(java.lang.String r70, boolean r71, boolean r72, final com.pymcl.android.ui.state.AppState r73, final androidx.compose.runtime.MutableState r74, final androidx.compose.runtime.MutableState r75, androidx.compose.foundation.layout.ColumnScope r76, androidx.compose.runtime.Composer r77, int r78) {
        /*
            Method dump skipped, instructions count: 1409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.MiscPagesKt.MultiplayerPage$lambda$15$2$3(java.lang.String, boolean, boolean, com.pymcl.android.ui.state.AppState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultiplayerPage$lambda$15$2$3$1$0$0(MutableState $code$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String upperCase = it.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        $code$delegate.setValue(upperCase);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultiplayerPage$lambda$15$2$3$1$1$0(AppState $state, MutableState $code$delegate, MutableState $busy$delegate) {
        MultiplayerPage$act($state, $busy$delegate, new MiscPagesKt$MultiplayerPage$3$3$4$2$2$1$1($state, $code$delegate, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultiplayerPage$lambda$15$2$4$0(final AppState $state) {
        $state.open(new DialogSpec.Prompt("公网直连", "例如 1.2.3.4:25565", null, new Function1() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda69
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MiscPagesKt.MultiplayerPage$lambda$15$2$4$0$0($state, (String) obj);
            }
        }, new Function1() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda80
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MiscPagesKt.MultiplayerPage$lambda$15$2$4$0$1($state, (String) obj);
            }
        }, 4, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String MultiplayerPage$lambda$15$2$4$0$0(AppState $state, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if ($state.getApi().normalizeDirect(it) == null) {
            return I18nKt.tr("请填写 IP 或域名，可带 :端口（不支持 127.0.0.1/localhost）", new Object[0]);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultiplayerPage$lambda$15$2$4$0$1(AppState $state, String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        String addr = $state.getApi().normalizeDirect(input);
        if (addr == null) {
            $state.toast("地址不正确", "请填写 IP 或域名，可带 :端口（不支持 127.0.0.1/localhost）", "error");
        } else {
            MultiplayerPage$enter($state, addr);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultiplayerPage$lambda$15$2$6$0(AppState $state, MutableState $busy$delegate) {
        MultiplayerPage$act($state, $busy$delegate, new MiscPagesKt$MultiplayerPage$3$3$7$1$1($state, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit MultiplayerPage$lambda$15$2$7(final androidx.compose.ui.platform.ClipboardManager r61, final androidx.compose.runtime.State r62, final com.pymcl.android.ui.state.AppState r63, androidx.compose.foundation.layout.ColumnScope r64, androidx.compose.runtime.Composer r65, int r66) {
        /*
            Method dump skipped, instructions count: 1019
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.MiscPagesKt.MultiplayerPage$lambda$15$2$7(androidx.compose.ui.platform.ClipboardManager, androidx.compose.runtime.State, com.pymcl.android.ui.state.AppState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultiplayerPage$lambda$15$2$7$1$0(ClipboardManager $clip, AppState $state, State $mp$delegate) {
        $clip.setText(new AnnotatedString(MultiplayerPage$lambda$1($mp$delegate).getCode(), null, 2, null));
        AppState.toast$default($state, "已复制", "已把邀请码复制到剪贴板", null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultiplayerPage$lambda$15$2$8$0(AppState $state, MutableState $busy$delegate) {
        MultiplayerPage$act($state, $busy$delegate, new MiscPagesKt$MultiplayerPage$3$3$9$1$1($state, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultiplayerPage$lambda$15$2$10$0(AppState $state, MutableState $busy$delegate) {
        MultiplayerPage$act($state, $busy$delegate, new MiscPagesKt$MultiplayerPage$3$3$11$1$1($state, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultiplayerPage$lambda$15$2$11$0(State $mp$delegate, AppState $state) {
        MultiplayerPage$enter($state, MultiplayerPage$lambda$1($mp$delegate).getServerUrl());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultiplayerPage$lambda$15$2$12$0(AppState $state, MutableState $busy$delegate) {
        MultiplayerPage$act($state, $busy$delegate, new MiscPagesKt$MultiplayerPage$3$3$13$1$1($state, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultiplayerPage$lambda$15$2$14$0(AppState $state, MutableState $busy$delegate) {
        MultiplayerPage$act($state, $busy$delegate, new MiscPagesKt$MultiplayerPage$3$3$15$1$1($state, null));
        return Unit.INSTANCE;
    }

    private static final void Glyph(final String ch, Composer $composer, final int $changed) {
        Composer $composer2;
        Function0 function0;
        Composer $composer3 = $composer.startRestartGroup(-693865450);
        ComposerKt.sourceInformation($composer3, "C(Glyph)131@9204L6,131@9133L221:MiscPages.kt#vz4689");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(ch) ? 4 : 2;
        }
        if ($composer3.shouldExecute(($dirty & 3) != 2, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-693865450, $dirty, -1, "com.pymcl.android.ui.pages.Glyph (MiscPages.kt:131)");
            }
            Modifier modifierBackground$default = BackgroundKt.background$default(ClipKt.clip(SizeKt.m785size3ABfNKs(Modifier.INSTANCE, Dp.m7018constructorimpl(42)), RoundedCornerShapeKt.m1032RoundedCornerShape0680j_4(Dp.m7018constructorimpl(12))), Py.INSTANCE.getColors($composer3, 6).getLogoBrush(), null, 0.0f, 6, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer3, modifierBackground$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            $composer2 = $composer3;
            int i = ((((48 << 3) & 112) << 6) & User32.WM_PENWINFIRST) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                function0 = constructor;
                $composer3.createNode(function0);
            } else {
                function0 = constructor;
                $composer3.useNode();
            }
            Composer composerM3832constructorimpl = Updater.m3832constructorimpl($composer3);
            Updater.m3839setimpl(composerM3832constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3839setimpl(composerM3832constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3832constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3832constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3832constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3832constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3839setimpl(composerM3832constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i3 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, 1941337821, "C132@9290L6,132@9266L86:MiscPages.kt#vz4689");
            TextKt.m2843Text4IGK_g(I18nKt.tr(ch, new Object[0]), (Modifier) null, Py.INSTANCE.getColors($composer3, 6).m7978getOnLogo0d7_KjU(), TextUnitKt.getSp(18), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, 199680, 0, 131026);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda44
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MiscPagesKt.Glyph$lambda$1(ch, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void MpAction(final String glyph, final String title, final String hint, final String btn, boolean danger, boolean enabled, final Function0<Unit> function0, Composer $composer, final int $changed, final int i) {
        final String str;
        final String str2;
        String str3;
        final String str4;
        boolean z;
        boolean enabled2;
        final Function0<Unit> function02;
        Composer $composer2;
        final boolean danger2;
        final boolean enabled3;
        Composer $composer3 = $composer.startRestartGroup(2022285930);
        ComposerKt.sourceInformation($composer3, "C(MpAction)P(3,6,4)137@9553L307,137@9523L337:MiscPages.kt#vz4689");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            str = glyph;
            $dirty |= $composer3.changed(str) ? 4 : 2;
        } else {
            str = glyph;
        }
        if (($changed & 48) == 0) {
            str2 = title;
            $dirty |= $composer3.changed(str2) ? 32 : 16;
        } else {
            str2 = title;
        }
        if (($changed & 384) == 0) {
            str3 = hint;
            $dirty |= $composer3.changed(str3) ? 256 : 128;
        } else {
            str3 = hint;
        }
        if (($changed & 3072) == 0) {
            str4 = btn;
            $dirty |= $composer3.changed(str4) ? 2048 : 1024;
        } else {
            str4 = btn;
        }
        int i2 = i & 16;
        if (i2 != 0) {
            $dirty |= 24576;
            z = danger;
        } else if (($changed & 24576) == 0) {
            z = danger;
            $dirty |= $composer3.changed(z) ? 16384 : 8192;
        } else {
            z = danger;
        }
        int i3 = i & 32;
        if (i3 != 0) {
            $dirty |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            enabled2 = enabled;
        } else if ((196608 & $changed) == 0) {
            enabled2 = enabled;
            $dirty |= $composer3.changed(enabled2) ? 131072 : 65536;
        } else {
            enabled2 = enabled;
        }
        if ((1572864 & $changed) == 0) {
            function02 = function0;
            $dirty |= $composer3.changedInstance(function02) ? 1048576 : 524288;
        } else {
            function02 = function0;
        }
        if ($composer3.shouldExecute((599187 & $dirty) != 599186, $dirty & 1)) {
            final boolean danger3 = i2 != 0 ? false : z;
            if (i3 != 0) {
                enabled2 = true;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2022285930, $dirty, -1, "com.pymcl.android.ui.pages.MpAction (MiscPages.kt:136)");
            }
            final String str5 = str3;
            final boolean enabled4 = enabled2;
            UiKt.m7594CardDzVHIIc(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1508878342, true, new Function3() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda91
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return MiscPagesKt.MpAction$lambda$0(str, str4, danger3, enabled4, function02, str2, str5, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer3, 3078, 6);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            danger2 = danger3;
            enabled3 = enabled4;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            danger2 = z;
            enabled3 = enabled2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda102
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MiscPagesKt.MpAction$lambda$1(glyph, title, hint, btn, danger2, enabled3, function0, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit MpAction$lambda$0(java.lang.String r55, java.lang.String r56, boolean r57, boolean r58, kotlin.jvm.functions.Function0 r59, java.lang.String r60, java.lang.String r61, androidx.compose.foundation.layout.ColumnScope r62, androidx.compose.runtime.Composer r63, int r64) {
        /*
            Method dump skipped, instructions count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.MiscPagesKt.MpAction$lambda$0(java.lang.String, java.lang.String, boolean, boolean, kotlin.jvm.functions.Function0, java.lang.String, java.lang.String, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ServersPage(com.pymcl.android.ui.state.AppState r25, androidx.compose.runtime.Composer r26, final int r27) {
        /*
            Method dump skipped, instructions count: 838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.MiscPagesKt.ServersPage(com.pymcl.android.ui.state.AppState, androidx.compose.runtime.Composer, int):void");
    }

    private static final List<String> ServersPage$lambda$1(MutableState<List<String>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ServersPage$lambda$4(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<ServerEntry> ServersPage$lambda$7(MutableState<List<ServerEntry>> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean ServersPage$lambda$10(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void ServersPage$lambda$11(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean ServersPage$lambda$13(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ServersPage$lambda$14(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object ServersPage$load(com.pymcl.android.ui.state.AppState r8, androidx.compose.runtime.MutableState<java.lang.Boolean> r9, android.content.Context r10, androidx.compose.runtime.MutableState<java.lang.String> r11, androidx.compose.runtime.MutableState<java.util.List<java.lang.String>> r12, androidx.compose.runtime.MutableState<java.util.List<com.pymcl.core.instance.ServerEntry>> r13, kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
        /*
            boolean r0 = r14 instanceof com.pymcl.android.ui.pages.MiscPagesKt$ServersPage$load$1
            if (r0 == 0) goto L14
            r0 = r14
            com.pymcl.android.ui.pages.MiscPagesKt$ServersPage$load$1 r0 = (com.pymcl.android.ui.pages.MiscPagesKt$ServersPage$load$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.pymcl.android.ui.pages.MiscPagesKt$ServersPage$load$1 r0 = new com.pymcl.android.ui.pages.MiscPagesKt$ServersPage$load$1
            r0.<init>(r14)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            r4 = 0
            switch(r3) {
                case 0: goto L50;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2d:
            java.lang.Object r2 = r0.L$5
            r13 = r2
            androidx.compose.runtime.MutableState r13 = (androidx.compose.runtime.MutableState) r13
            java.lang.Object r2 = r0.L$4
            r12 = r2
            androidx.compose.runtime.MutableState r12 = (androidx.compose.runtime.MutableState) r12
            java.lang.Object r2 = r0.L$3
            r11 = r2
            androidx.compose.runtime.MutableState r11 = (androidx.compose.runtime.MutableState) r11
            java.lang.Object r2 = r0.L$2
            r10 = r2
            android.content.Context r10 = (android.content.Context) r10
            java.lang.Object r2 = r0.L$1
            r9 = r2
            androidx.compose.runtime.MutableState r9 = (androidx.compose.runtime.MutableState) r9
            java.lang.Object r2 = r0.L$0
            r8 = r2
            com.pymcl.android.ui.state.AppState r8 = (com.pymcl.android.ui.state.AppState) r8
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f java.util.concurrent.CancellationException -> Lbe
            r3 = r1
            goto L7f
        L50:
            kotlin.ResultKt.throwOnFailure(r1)
            r3 = 1
            ServersPage$lambda$11(r9, r3)
            kotlinx.coroutines.CoroutineDispatcher r5 = kotlinx.coroutines.Dispatchers.getIO()     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f java.util.concurrent.CancellationException -> Lbe
            kotlin.coroutines.CoroutineContext r5 = (kotlin.coroutines.CoroutineContext) r5     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f java.util.concurrent.CancellationException -> Lbe
            com.pymcl.android.ui.pages.MiscPagesKt$ServersPage$load$r$1 r6 = new com.pymcl.android.ui.pages.MiscPagesKt$ServersPage$load$r$1     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f java.util.concurrent.CancellationException -> Lbe
            r7 = 0
            r6.<init>(r8, r10, r11, r7)     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f java.util.concurrent.CancellationException -> Lbe
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f java.util.concurrent.CancellationException -> Lbe
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f java.util.concurrent.CancellationException -> Lbe
            r0.L$1 = r9     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f java.util.concurrent.CancellationException -> Lbe
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f java.util.concurrent.CancellationException -> Lbe
            r0.L$2 = r7     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f java.util.concurrent.CancellationException -> Lbe
            r0.L$3 = r11     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f java.util.concurrent.CancellationException -> Lbe
            r0.L$4 = r12     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f java.util.concurrent.CancellationException -> Lbe
            r0.L$5 = r13     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f java.util.concurrent.CancellationException -> Lbe
            r0.label = r3     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f java.util.concurrent.CancellationException -> Lbe
            java.lang.Object r3 = kotlinx.coroutines.BuildersKt.withContext(r5, r6, r0)     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f java.util.concurrent.CancellationException -> Lbe
            if (r3 != r2) goto L7f
            return r2
        L7f:
            kotlin.Triple r3 = (kotlin.Triple) r3     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f java.util.concurrent.CancellationException -> Lbe
            java.lang.Object r2 = r3.getFirst()     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f java.util.concurrent.CancellationException -> Lbe
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f java.util.concurrent.CancellationException -> Lbe
            ServersPage$lambda$2(r12, r2)     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f java.util.concurrent.CancellationException -> Lbe
            java.lang.Object r2 = r3.getSecond()     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f java.util.concurrent.CancellationException -> Lbe
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f java.util.concurrent.CancellationException -> Lbe
            ServersPage$lambda$5(r11, r2)     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f java.util.concurrent.CancellationException -> Lbe
            java.lang.Object r2 = r3.getThird()     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f java.util.concurrent.CancellationException -> Lbe
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f java.util.concurrent.CancellationException -> Lbe
            ServersPage$lambda$8(r13, r2)     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f java.util.concurrent.CancellationException -> Lbe
            goto Lb8
        L9d:
            r2 = move-exception
            goto Lc0
        L9f:
            r2 = move-exception
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()     // Catch: java.lang.Throwable -> L9d
            ServersPage$lambda$8(r13, r3)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r3 = "读取服务器列表失败"
            java.lang.String r5 = r2.getMessage()     // Catch: java.lang.Throwable -> L9d
            if (r5 != 0) goto Lb3
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L9d
        Lb3:
            java.lang.String r6 = "error"
            r8.toast(r3, r5, r6)     // Catch: java.lang.Throwable -> L9d
        Lb8:
            ServersPage$lambda$11(r9, r4)
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        Lbe:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L9d
        Lc0:
            ServersPage$lambda$11(r9, r4)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.MiscPagesKt.ServersPage$load(com.pymcl.android.ui.state.AppState, androidx.compose.runtime.MutableState, android.content.Context, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ServersPage$commit(AppState $state, MutableState<Boolean> mutableState, MutableState<String> mutableState2, Context ctx, MutableState<List<ServerEntry>> mutableState3, List<ServerEntry> list, String okTitle, String okBody) {
        if (ServersPage$lambda$13(mutableState)) {
            return;
        }
        ServersPage$lambda$14(mutableState, true);
        String target = ServersPage$lambda$4(mutableState2);
        $state.launch(new MiscPagesKt$ServersPage$commit$1(target, list, $state, okTitle, okBody, ctx, mutableState2, mutableState3, mutableState, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ServersPage$lambda$17$0(AppState $state, Context $ctx, MutableState $all$delegate, MutableState $busy$delegate, MutableState $inst$delegate, Uri uri) {
        if (uri == null) {
            return Unit.INSTANCE;
        }
        $state.launch(new MiscPagesKt$ServersPage$importer$1$1$1($state, $ctx, uri, $all$delegate, $busy$delegate, $inst$delegate, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ServersPage$lambda$18$0(AppState $state, MutableState $all$delegate, List $rows, Context $ctx, Uri uri) {
        if (uri == null) {
            return Unit.INSTANCE;
        }
        String text = ServerLogic.INSTANCE.exportText(ServersPage$lambda$7($all$delegate));
        $state.launch(new MiscPagesKt$ServersPage$exporter$1$1$1($state, $rows, $ctx, uri, text, null));
        return Unit.INSTANCE;
    }

    private static final Function1<String, String> ServersPage$entryValidate(final List<ServerEntry> list) {
        return new Function1() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda60
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MiscPagesKt.ServersPage$entryValidate$lambda$19(list, (String) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ServersPage$entryValidate$lambda$19(List $others, String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        Pair<ServerEntry, String> pair = ServerLogic.INSTANCE.parse(input);
        ServerEntry e = pair.component1();
        String err = pair.component2();
        if (err != null) {
            return I18nKt.tr(err, new Object[0]);
        }
        if (e == null) {
            return I18nKt.tr("请填写服务器地址", new Object[0]);
        }
        ServerLogic serverLogic = ServerLogic.INSTANCE;
        String name = e.getName();
        List list = $others;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ServerEntry) it.next()).getName());
        }
        String strNameProblem = serverLogic.nameProblem(name, (List) arrayList);
        if (strNameProblem != null) {
            return I18nKt.tr(strNameProblem, new Object[0]);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02e2 A[LOOP:0: B:41:0x02dc->B:43:0x02e2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0322  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit ServersPage$lambda$20(final java.util.List r43, final boolean r44, final com.pymcl.android.ui.state.AppState r45, final android.content.Context r46, final androidx.activity.compose.ManagedActivityResultLauncher r47, final androidx.activity.compose.ManagedActivityResultLauncher r48, final androidx.compose.runtime.MutableState r49, final androidx.compose.runtime.MutableState r50, final androidx.compose.runtime.MutableState r51, final androidx.compose.runtime.MutableState r52, androidx.compose.runtime.MutableState r53, androidx.compose.foundation.layout.ColumnScope r54, androidx.compose.runtime.Composer r55, int r56) {
        /*
            Method dump skipped, instructions count: 812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.MiscPagesKt.ServersPage$lambda$20(java.util.List, boolean, com.pymcl.android.ui.state.AppState, android.content.Context, androidx.activity.compose.ManagedActivityResultLauncher, androidx.activity.compose.ManagedActivityResultLauncher, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ServersPage$lambda$20$0(boolean $canEdit, final AppState $state, final List $rows, final Context $ctx, final ManagedActivityResultLauncher $importer, final ManagedActivityResultLauncher $exporter, final MutableState $all$delegate, final MutableState $busy$delegate, final MutableState $inst$delegate, final RowScope Section, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Section, "$this$Section");
        ComposerKt.sourceInformation($composer, "C221@14260L269,221@14202L327,226@14599L138,226@14542L195,227@14816L106,227@14750L172:MiscPages.kt#vz4689");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(Section) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if ($composer.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1559500761, $dirty2, -1, "com.pymcl.android.ui.pages.ServersPage.<anonymous>.<anonymous> (MiscPages.kt:221)");
            }
            BtnKind btnKind = BtnKind.Primary;
            ImageVector add = Ico.INSTANCE.getAdd();
            ComposerKt.sourceInformationMarkerStart($composer, 263357556, "CC(remember):MiscPages.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($state) | $composer.changedInstance($rows) | $composer.changedInstance($ctx);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda49
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MiscPagesKt.ServersPage$lambda$20$0$0$0($state, $rows, $all$delegate, $busy$delegate, $inst$delegate, $ctx);
                    }
                };
                $composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Btn("添加服务器", btnKind, add, $canEdit, false, null, false, (Function0) objRememberedValue, $composer, 54, 112);
            BtnKind btnKind2 = BtnKind.Normal;
            ImageVector upload = Ico.INSTANCE.getUpload();
            ComposerKt.sourceInformationMarkerStart($composer, 263368273, "CC(remember):MiscPages.kt#9igjgp");
            boolean zChangedInstance2 = (($dirty2 & 14) == 4) | $composer.changedInstance($importer) | $composer.changedInstance($state);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda50
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MiscPagesKt.ServersPage$lambda$20$0$1$0(Section, $importer, $state);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue2 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Btn("导入", btnKind2, upload, $canEdit, false, null, false, (Function0) objRememberedValue2, $composer, 54, 112);
            BtnKind btnKind3 = BtnKind.Normal;
            boolean z = $canEdit && !$rows.isEmpty();
            ComposerKt.sourceInformationMarkerStart($composer, 263375185, "CC(remember):MiscPages.kt#9igjgp");
            boolean zChangedInstance3 = (($dirty2 & 14) == 4) | $composer.changedInstance($exporter) | $composer.changedInstance($state);
            Object objRememberedValue3 = $composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda51
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MiscPagesKt.ServersPage$lambda$20$0$2$0(Section, $exporter, $state);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue3 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Btn("导出", btnKind3, null, z, false, null, false, (Function0) objRememberedValue3, $composer, 54, 116);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ServersPage$lambda$20$0$0$0(final AppState $state, List $rows, final MutableState $all$delegate, final MutableState $busy$delegate, final MutableState $inst$delegate, final Context $ctx) {
        $state.open(new DialogSpec.Prompt("添加服务器", "名称|地址，或只填地址（如 mc.example.com:25565）", null, ServersPage$entryValidate($rows), new Function1() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MiscPagesKt.ServersPage$lambda$20$0$0$0$0($all$delegate, $state, $busy$delegate, $inst$delegate, $ctx, (String) obj);
            }
        }, 4, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ServersPage$lambda$20$0$0$0$0(MutableState $all$delegate, AppState $state, MutableState $busy$delegate, MutableState $inst$delegate, Context $ctx, String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        ServerEntry first = ServerLogic.INSTANCE.parse(input).getFirst();
        if (first != null) {
            ServersPage$commit($state, $busy$delegate, $inst$delegate, $ctx, $all$delegate, CollectionsKt.plus((Collection<? extends ServerEntry>) ServersPage$lambda$7($all$delegate), first), "已添加", first.getAddress());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ServersPage$lambda$20$0$1$0(RowScope $this_Section, ManagedActivityResultLauncher $importer, AppState $state) {
        Object objM8116constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            $importer.launch(new String[]{"text/*", "application/octet-stream"});
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
    public static final Unit ServersPage$lambda$20$0$2$0(RowScope $this_Section, ManagedActivityResultLauncher $exporter, AppState $state) {
        Object objM8116constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            $exporter.launch("servers.txt");
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
    public static final Unit ServersPage$lambda$20$1$0$0(MutableState $instances$delegate, MutableState $inst$delegate, int i) {
        String str = (String) CollectionsKt.getOrNull(ServersPage$lambda$1($instances$delegate), i);
        if (str != null) {
            $inst$delegate.setValue(str);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit ServersPage$lambda$20$2$0(final com.pymcl.core.instance.ServerEntry r38, final com.pymcl.android.ui.state.AppState r39, boolean r40, final java.util.List r41, final android.content.Context r42, final androidx.compose.runtime.MutableState r43, final androidx.compose.runtime.MutableState r44, final androidx.compose.runtime.MutableState r45, androidx.compose.foundation.layout.RowScope r46, androidx.compose.runtime.Composer r47, int r48) {
        /*
            Method dump skipped, instructions count: 779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.MiscPagesKt.ServersPage$lambda$20$2$0(com.pymcl.core.instance.ServerEntry, com.pymcl.android.ui.state.AppState, boolean, java.util.List, android.content.Context, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ServersPage$lambda$20$2$0$1$0(AppState $state, ServerEntry $s, MutableState $inst$delegate) {
        $state.navigate(Destination.Launch);
        if (ServerLogic.INSTANCE.needsSwitch(ServersPage$lambda$4($inst$delegate), $state.getSelectedInstance())) {
            String target = ServersPage$lambda$4($inst$delegate);
            $state.launch(new MiscPagesKt$ServersPage$2$3$1$2$1$1($state, target, $s, null));
        } else {
            String target2 = $s.getAddress();
            $state.startGame(target2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ServersPage$lambda$20$2$0$2$0(final AppState $state, final ServerEntry $s, List $rows, final MutableState $all$delegate, final MutableState $busy$delegate, final MutableState $inst$delegate, final Context $ctx) {
        String str = $s.getName() + "|" + $s.getAddress();
        Collection arrayList = new ArrayList();
        for (Object obj : $rows) {
            if (!Intrinsics.areEqual((ServerEntry) obj, $s)) {
                arrayList.add(obj);
            }
        }
        $state.open(new DialogSpec.Prompt("编辑服务器", "名称|地址", str, ServersPage$entryValidate((List) arrayList), new Function1() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda38
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return MiscPagesKt.ServersPage$lambda$20$2$0$2$0$1($s, $all$delegate, $state, $busy$delegate, $inst$delegate, $ctx, (String) obj2);
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ServersPage$lambda$20$2$0$2$0$1(ServerEntry $s, MutableState $all$delegate, AppState $state, MutableState $busy$delegate, MutableState $inst$delegate, Context $ctx, String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        ServerEntry first = ServerLogic.INSTANCE.parse(input).getFirst();
        if (first != null) {
            ServersPage$commit($state, $busy$delegate, $inst$delegate, $ctx, $all$delegate, ServerLogic.INSTANCE.replaceVisible(ServersPage$lambda$7($all$delegate), $s.getName(), $s.getAddress(), ServerEntry.copy$default(first, null, null, null, $s.getIcon(), $s.getDescription(), false, 39, null)), "已保存", first.getAddress());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ServersPage$lambda$20$2$0$3$0(final AppState $state, final ServerEntry $s, final MutableState $all$delegate, final MutableState $busy$delegate, final MutableState $inst$delegate, final Context $ctx) {
        $state.open(new DialogSpec.Confirm("删除服务器", $s.getName(), "删除", true, true, new Function0() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MiscPagesKt.ServersPage$lambda$20$2$0$3$0$0($s, $all$delegate, $state, $busy$delegate, $inst$delegate, $ctx);
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ServersPage$lambda$20$2$0$3$0$0(ServerEntry $s, MutableState $all$delegate, AppState $state, MutableState $busy$delegate, MutableState $inst$delegate, Context $ctx) {
        ServersPage$commit($state, $busy$delegate, $inst$delegate, $ctx, $all$delegate, ServerLogic.INSTANCE.replaceVisible(ServersPage$lambda$7($all$delegate), $s.getName(), $s.getAddress(), null), "已删除", $s.getName());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x02e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void PlaytimePage(com.pymcl.android.ui.state.AppState r25, androidx.compose.runtime.Composer r26, final int r27) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.MiscPagesKt.PlaytimePage(com.pymcl.android.ui.state.AppState, androidx.compose.runtime.Composer, int):void");
    }

    private static final List<PlaytimeRow> PlaytimePage$lambda$1(MutableState<List<PlaytimeRow>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String PlaytimePage$lambda$4(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final List<SettingsExtrasIO.SessionRow> PlaytimePage$lambda$7(MutableState<List<SettingsExtrasIO.SessionRow>> mutableState) {
        return mutableState.getValue();
    }

    private static final int PlaytimePage$lambda$10(MutableIntState $range$delegate) {
        return $range$delegate.getIntValue();
    }

    private static final boolean PlaytimePage$lambda$13(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PlaytimePage$lambda$14(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int PlaytimePage$lambda$16(MutableIntState $tick$delegate) {
        return $tick$delegate.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String PlaytimePage$lambda$20$0(PlaytimeRow it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlaytimePage$lambda$23(final List $shown, final List $names, final int $r, final AppState $state, final Context $ctx, final MutableIntState $range$delegate, final MutableState $rows$delegate, final MutableState $busy$delegate, final MutableState $detail$delegate, final MutableIntState $tick$delegate, final long $total, final MutableState $sessions$delegate, ColumnScope ScrollBody, Composer $composer, int $changed) {
        Composer composer;
        Intrinsics.checkNotNullParameter(ScrollBody, "$this$ScrollBody");
        ComposerKt.sourceInformation($composer, "C286@18427L865,286@18387L905,299@19331L228,299@19301L258,*306@19734L1363,306@19687L1410:MiscPages.kt#vz4689");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1851340994, $changed, -1, "com.pymcl.android.ui.pages.PlaytimePage.<anonymous> (MiscPages.kt:286)");
            }
            UiKt.Section("游戏时长", "按实例与版本统计，每次退出游戏后自动累加", null, false, ComposableLambdaKt.rememberComposableLambda(-747838896, true, new Function3() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return MiscPagesKt.PlaytimePage$lambda$23$0($names, $r, $state, $ctx, $range$delegate, $rows$delegate, $busy$delegate, $detail$delegate, $tick$delegate, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24630, 12);
            UiKt.m7594CardDzVHIIc(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-939609806, true, new Function3() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return MiscPagesKt.PlaytimePage$lambda$23$1($shown, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 3078, 6);
            if (!$shown.isEmpty() || PlaytimePage$lambda$13($busy$delegate)) {
                composer = $composer;
                composer.startReplaceGroup(1625760192);
            } else {
                $composer.startReplaceGroup(1022273807);
                ComposerKt.sourceInformation($composer, "304@19598L45");
                UiKt.Empty(Ico.INSTANCE.getClock(), "还没有游玩记录", "启动一次游戏后这里就有数据了", null, $composer, 432, 8);
                composer = $composer;
            }
            composer.endReplaceGroup();
            Iterator it = $shown.iterator();
            while (it.hasNext()) {
                final PlaytimeRow playtimeRow = (PlaytimeRow) it.next();
                UiKt.m7594CardDzVHIIc(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7018constructorimpl(14), null, ComposableLambdaKt.rememberComposableLambda(200766324, true, new Function3() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return MiscPagesKt.PlaytimePage$lambda$23$2$0(playtimeRow, $total, $detail$delegate, $sessions$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, composer, 54), $composer, 3126, 4);
                composer = $composer;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlaytimePage$lambda$23$0(List $names, int $r, final AppState $state, final Context $ctx, MutableIntState $range$delegate, MutableState $rows$delegate, MutableState $busy$delegate, final MutableState $detail$delegate, final MutableIntState $tick$delegate, RowScope Section, Composer $composer, int $changed) {
        final MutableIntState mutableIntState;
        Intrinsics.checkNotNullParameter(Section, "$this$Section");
        ComposerKt.sourceInformation($composer, "C287@18441L11,287@18491L14,287@18454L64,288@18597L585,288@18531L651,297@19272L10,297@19195L87:MiscPages.kt#vz4689");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-747838896, $changed, -1, "com.pymcl.android.ui.pages.PlaytimePage.<anonymous>.<anonymous> (MiscPages.kt:287)");
            }
            UiKt.Small("范围", null, false, $composer, 6, 6);
            List listPlus = CollectionsKt.plus((Collection) CollectionsKt.listOf(I18nKt.tr("全部实例", new Object[0])), (Iterable) $names);
            ComposerKt.sourceInformationMarkerStart($composer, -1413638562, "CC(remember):MiscPages.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                mutableIntState = $range$delegate;
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda36
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return MiscPagesKt.PlaytimePage$lambda$23$0$0$0(mutableIntState, ((Integer) obj2).intValue());
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            } else {
                mutableIntState = $range$delegate;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Combo(listPlus, $r, (Function1) objRememberedValue, null, true, false, $composer, 24960, 40);
            BtnKind btnKind = BtnKind.Danger;
            boolean z = (PlaytimePage$lambda$1($rows$delegate).isEmpty() || PlaytimePage$lambda$13($busy$delegate)) ? false : true;
            ComposerKt.sourceInformationMarkerStart($composer, -1413634599, "CC(remember):MiscPages.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($state) | $composer.changedInstance($ctx);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                final MutableIntState mutableIntState2 = mutableIntState;
                Object obj2 = new Function0() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda47
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MiscPagesKt.PlaytimePage$lambda$23$0$1$0($state, $ctx, $detail$delegate, mutableIntState2, $tick$delegate);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Btn("清空统计", btnKind, null, z, false, null, false, (Function0) objRememberedValue2, $composer, 54, 116);
            String str = PlaytimePage$lambda$13($busy$delegate) ? "刷新中…" : "刷新";
            BtnKind btnKind2 = BtnKind.Ghost;
            ImageVector refresh = Ico.INSTANCE.getRefresh();
            boolean z2 = !PlaytimePage$lambda$13($busy$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, -1413613574, "CC(remember):MiscPages.kt#9igjgp");
            Object objRememberedValue3 = $composer.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = new Function0() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda58
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MiscPagesKt.PlaytimePage$lambda$23$0$2$0($tick$delegate);
                    }
                };
                $composer.updateRememberedValue(obj3);
                objRememberedValue3 = obj3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Btn(str, btnKind2, refresh, z2, false, null, false, (Function0) objRememberedValue3, $composer, 12582960, 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlaytimePage$lambda$23$0$0$0(MutableIntState $range$delegate, int it) {
        $range$delegate.setIntValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlaytimePage$lambda$23$0$1$0(final AppState $state, final Context $ctx, final MutableState $detail$delegate, final MutableIntState $range$delegate, final MutableIntState $tick$delegate) {
        $state.open(new DialogSpec.Confirm("清空游戏时长", "所有实例的时长记录都会归零（原文件改名为 playtime.json.bak 留作备份）。", "清空", true, false, new Function0() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda41
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MiscPagesKt.PlaytimePage$lambda$23$0$1$0$0($state, $ctx, $detail$delegate, $range$delegate, $tick$delegate);
            }
        }, 16, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlaytimePage$lambda$23$0$1$0$0(AppState $state, Context $ctx, MutableState $detail$delegate, MutableIntState $range$delegate, MutableIntState $tick$delegate) {
        $state.launch(new MiscPagesKt$PlaytimePage$3$1$2$1$1$1($state, $ctx, $detail$delegate, $range$delegate, $tick$delegate, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlaytimePage$lambda$23$0$2$0(MutableIntState $tick$delegate) {
        $tick$delegate.setIntValue(PlaytimePage$lambda$16($tick$delegate) + 1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlaytimePage$lambda$23$1(List $shown, ColumnScope Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C300@19345L13,301@19428L4,301@19471L6,301@19371L118,302@19502L47:MiscPages.kt#vz4689");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-939609806, $changed, -1, "com.pymcl.android.ui.pages.PlaytimePage.<anonymous>.<anonymous> (MiscPages.kt:300)");
            }
            UiKt.Muted("累计游玩", null, false, 0, $composer, 6, 14);
            Iterator it = $shown.iterator();
            long seconds = 0;
            while (it.hasNext()) {
                seconds += ((PlaytimeRow) it.next()).getSeconds();
            }
            TextKt.m2843Text4IGK_g(LaunchPageKt.fmtDuration(seconds), (Modifier) null, Py.INSTANCE.getColors($composer, 6).m7955getAccentText0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TextStyle.m6472copyp1EtxEg$default(Py.INSTANCE.getType($composer, 6).getH1(), 0L, TextUnitKt.getSp(36), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null), $composer, 0, 0, 65530);
            UiKt.Small(I18nKt.tr("{0} 个实例有记录", Integer.valueOf($shown.size())), null, true, $composer, 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x040e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit PlaytimePage$lambda$23$2$0(final com.pymcl.android.ui.state.PlaytimeRow r59, long r60, final androidx.compose.runtime.MutableState r62, final androidx.compose.runtime.MutableState r63, androidx.compose.foundation.layout.ColumnScope r64, androidx.compose.runtime.Composer r65, int r66) {
        /*
            Method dump skipped, instructions count: 1052
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.MiscPagesKt.PlaytimePage$lambda$23$2$0(com.pymcl.android.ui.state.PlaytimeRow, long, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlaytimePage$lambda$23$2$0$0$1$0(PlaytimeRow $row, MutableState $detail$delegate) {
        $detail$delegate.setValue(Intrinsics.areEqual(PlaytimePage$lambda$4($detail$delegate), $row.getInstance()) ? null : $row.getInstance());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlaytimePage$lambda$23$2$0$1(MutableState $sessions$delegate, ColumnScope Pane, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(Pane, "$this$Pane");
        ComposerKt.sourceInformation($composer, "C317@20506L10:MiscPages.kt#vz4689");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-818469930, $changed, -1, "com.pymcl.android.ui.pages.PlaytimePage.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MiscPages.kt:317)");
            }
            UiKt.H3("最近会话", null, false, $composer, 6, 6);
            List ss = PlaytimePage$lambda$7($sessions$delegate);
            if (ss == null) {
                $composer.startReplaceGroup(-570583196);
                ComposerKt.sourceInformation($composer, "320@20620L14");
                UiKt.Muted("正在读取…", null, false, 0, $composer, 6, 14);
                $composer.endReplaceGroup();
            } else if (ss.isEmpty()) {
                $composer.startReplaceGroup(-570581435);
                ComposerKt.sourceInformation($composer, "321@20675L15");
                UiKt.Muted("没有会话明细", null, false, 0, $composer, 6, 14);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-508095345);
                ComposerKt.sourceInformation($composer, "*323@20764L253");
                List list = ss;
                int i = 0;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    SettingsExtrasIO.SessionRow sessionRow = (SettingsExtrasIO.SessionRow) it.next();
                    Modifier modifierM742paddingqDBjuR0$default = PaddingKt.m742paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7018constructorimpl(4), 0.0f, 0.0f, 13, null);
                    ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    Iterable iterable = list;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), $composer, ((6 >> 3) & 14) | ((6 >> 3) & 112));
                    int i2 = i;
                    Iterator it2 = it;
                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM742paddingqDBjuR0$default);
                    Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
                    int i3 = ((((6 << 3) & 112) << 6) & User32.WM_PENWINFIRST) | 6;
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
                    int i4 = (i3 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                    int i5 = ((6 >> 6) & 112) | 6;
                    RowScope rowScope = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart($composer, 1285157750, "C323@20800L64,323@20866L55,323@20923L29,323@20954L61:MiscPages.kt#vz4689");
                    String version = sessionRow.getVersion();
                    if (StringsKt.isBlank(version)) {
                        version = "—";
                    }
                    UiKt.m7603TxtuDo3WH8(version, RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), true, 0L, 0, $composer, 384, 24);
                    UiKt.Small(PlaytimeLogic.startText$default(PlaytimeLogic.INSTANCE, sessionRow.getStartSec(), null, 2, null), null, true, $composer, 384, 2);
                    SpacerKt.Spacer(SizeKt.m790width3ABfNKs(Modifier.INSTANCE, Dp.m7018constructorimpl(12)), $composer, 6);
                    UiKt.Small(PlaytimeLogic.INSTANCE.durationText(sessionRow.getDurationSec()), null, true, $composer, 384, 2);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    list = iterable;
                    i = i2;
                    it = it2;
                }
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

    public static final void TasksPage(final AppState state, Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(state, "state");
        Composer $composer2 = $composer.startRestartGroup(1888162820);
        ComposerKt.sourceInformation($composer2, "C(TasksPage)335@21257L2639,335@21246L2650:MiscPages.kt#vz4689");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= ($changed & 8) == 0 ? $composer2.changed(state) : $composer2.changedInstance(state) ? 4 : 2;
        }
        if (!$composer2.shouldExecute(($dirty & 3) != 2, $dirty & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1888162820, $dirty, -1, "com.pymcl.android.ui.pages.TasksPage (MiscPages.kt:334)");
            }
            UiKt.ScrollBody(null, ComposableLambdaKt.rememberComposableLambda(800187639, true, new Function3() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda53
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return MiscPagesKt.TasksPage$lambda$0(state, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda54
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MiscPagesKt.TasksPage$lambda$1(state, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TasksPage$lambda$0(final AppState $state, ColumnScope ScrollBody, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(ScrollBody, "$this$ScrollBody");
        ComposerKt.sourceInformation($composer, "C337@21375L253,337@21341L287,370@23859L31:MiscPages.kt#vz4689");
        int i = 0;
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(800187639, $changed, -1, "com.pymcl.android.ui.pages.TasksPage.<anonymous> (MiscPages.kt:336)");
            }
            Iterable tasks = $state.getTasks();
            if (!(tasks instanceof Collection) || !((Collection) tasks).isEmpty()) {
                int i2 = 0;
                Iterator<TaskRow> it = tasks.iterator();
                while (it.hasNext()) {
                    if ((((TaskRow) it.next()).getState() == TaskState.Running ? 1 : null) != null && (i2 = i2 + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
                i = i2;
            }
            final int running = i;
            UiKt.Section("下载任务", "安装、下载、启动都在这里排队", null, false, ComposableLambdaKt.rememberComposableLambda(2054379049, true, new Function3() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda42
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return MiscPagesKt.TasksPage$lambda$0$1(running, $state, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24630, 12);
            if ($state.getTasks().isEmpty()) {
                $composer.startReplaceGroup(181188164);
                ComposerKt.sourceInformation($composer, "341@21664L45");
                UiKt.Empty(Ico.INSTANCE.getDownload(), "还没有任务", "去下载页装个版本或模组试试", null, $composer, 432, 8);
            } else {
                $composer.startReplaceGroup(1321909035);
            }
            $composer.endReplaceGroup();
            $composer.startReplaceGroup(181192630);
            ComposerKt.sourceInformation($composer, "*343@21813L2027,343@21766L2074");
            for (final TaskRow taskRow : $state.getTasks().toList()) {
                UiKt.m7594CardDzVHIIc(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7018constructorimpl(14), null, ComposableLambdaKt.rememberComposableLambda(1911494281, true, new Function3() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda43
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return MiscPagesKt.TasksPage$lambda$0$2$0(taskRow, $state, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, $composer, 54), $composer, 3126, 4);
            }
            $composer.endReplaceGroup();
            AiBackgroundTasksSection($state, $composer, AppState.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TasksPage$lambda$0$1(int $running, final AppState $state, RowScope Section, Composer $composer, int $changed) {
        boolean z;
        Intrinsics.checkNotNullParameter(Section, "$this$Section");
        ComposerKt.sourceInformation($composer, "C338@21389L67,339@21559L59,339@21469L149:MiscPages.kt#vz4689");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2054379049, $changed, -1, "com.pymcl.android.ui.pages.TasksPage.<anonymous>.<anonymous> (MiscPages.kt:338)");
            }
            UiKt.Muted(I18nKt.tr("进行中 {0} · 共 {1}", Integer.valueOf($running), Integer.valueOf($state.getTasks().size())), null, true, 0, $composer, 384, 10);
            BtnKind btnKind = BtnKind.Normal;
            Iterable tasks = $state.getTasks();
            if (!(tasks instanceof Collection) || !((Collection) tasks).isEmpty()) {
                Iterator<TaskRow> it = tasks.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    if ((((TaskRow) it.next()).getState() != TaskState.Running ? 1 : null) != null) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = false;
            }
            ComposerKt.sourceInformationMarkerStart($composer, -1426684124, "CC(remember):MiscPages.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($state);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MiscPagesKt.TasksPage$lambda$0$1$1$0($state);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Btn("清除已完成", btnKind, null, z, false, null, false, (Function0) objRememberedValue, $composer, 54, 116);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TasksPage$lambda$0$1$1$0(AppState $state) {
        CollectionsKt.removeAll((List) $state.getTasks(), new Function1() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda37
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(MiscPagesKt.TasksPage$lambda$0$1$1$0$0((TaskRow) obj));
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TasksPage$lambda$0$1$1$0$0(TaskRow it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getState() != TaskState.Running;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x05ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit TasksPage$lambda$0$2$0(final com.pymcl.android.ui.state.TaskRow r82, final com.pymcl.android.ui.state.AppState r83, androidx.compose.foundation.layout.ColumnScope r84, androidx.compose.runtime.Composer r85, int r86) {
        /*
            Method dump skipped, instructions count: 1852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.MiscPagesKt.TasksPage$lambda$0$2$0(com.pymcl.android.ui.state.TaskRow, com.pymcl.android.ui.state.AppState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TasksPage$lambda$0$2$0$0$1$0(AppState $state, TaskRow $t) {
        String str;
        String title;
        if ($state.cancelTask($t.getId())) {
            str = "已取消";
            title = $t.getTitle();
        } else {
            str = "无法取消";
            title = "这个任务已经结束，或这一步不能中途取消";
        }
        $state.toast(str, title, "info");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TasksPage$lambda$0$2$0$0$2$0(AppState $state, TaskRow $t) {
        $state.open(new DialogSpec.TaskLog($t));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TasksPage$lambda$0$2$0$0$3$0(AppState $state, TaskRow $t) {
        $state.open(new DialogSpec.Crash(TaskCrashLogic.analyze$default(TaskCrashLogic.INSTANCE, $t.getTitle(), $t.getDetail(), null, CrashScenes.INSTANCE.ofTaskKind($t.getKind()), 4, null)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TasksPage$lambda$0$2$0$0$4$0(AppState $state, TaskRow $t) {
        $state.getTasks().remove($t);
        return Unit.INSTANCE;
    }

    private static final void AiBackgroundTasksSection(final AppState state, Composer $composer, final int $changed) {
        Composer $composer2;
        Modifier modifier;
        Composer $composer3 = $composer.startRestartGroup(676279320);
        ComposerKt.sourceInformation($composer3, "C(AiBackgroundTasksSection)381@24180L36,382@24244L71,383@24334L60,387@24743L190,387@24724L209,388@24957L382,388@24938L401,407@26001L684,407@25951L734,*420@26826L15,420@26843L1129,420@26769L1203:MiscPages.kt#vz4689");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= ($changed & 8) == 0 ? $composer3.changed(state) : $composer3.changedInstance(state) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if ($composer3.shouldExecute(($dirty2 & 3) != 2, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(676279320, $dirty2, -1, "com.pymcl.android.ui.pages.AiBackgroundTasksSection (MiscPages.kt:380)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, 1364366812, "CC(remember):MiscPages.kt#9igjgp");
            boolean z = ($dirty2 & 14) == 4 || (($dirty2 & 8) != 0 && $composer3.changed(state));
            Object objRememberedValue = $composer3.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objAiExtras = AiPageKt.aiExtras(state);
                $composer3.updateRememberedValue(objAiExtras);
                objRememberedValue = objAiExtras;
            }
            final AiUiExtras ai = (AiUiExtras) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (ai == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda30
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return MiscPagesKt.AiBackgroundTasksSection$lambda$1(state, $changed, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            ComposerKt.sourceInformationMarkerStart($composer3, 1364368895, "CC(remember):MiscPages.kt#9igjgp");
            Object objRememberedValue2 = $composer3.rememberedValue();
            Object obj = null;
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue2 = objMutableStateOf$default;
            }
            final MutableState tasks$delegate = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1364371764, "CC(remember):MiscPages.kt#9igjgp");
            Object objRememberedValue3 = $composer3.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MapsKt.emptyMap(), null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue3 = objMutableStateOf$default2;
            }
            final MutableState titles$delegate = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1364384982, "CC(remember):MiscPages.kt#9igjgp");
            boolean zChangedInstance = $composer3.changedInstance(ai);
            Object objRememberedValue4 = $composer3.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = (Function2) new MiscPagesKt$AiBackgroundTasksSection$1$1(ai, tasks$delegate, titles$delegate, null);
                $composer3.updateRememberedValue(obj2);
                objRememberedValue4 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(ai, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, $composer3, 0);
            ComposerKt.sourceInformationMarkerStart($composer3, 1364392022, "CC(remember):MiscPages.kt#9igjgp");
            boolean zChangedInstance2 = $composer3.changedInstance(ai);
            Object objRememberedValue5 = $composer3.rememberedValue();
            if (zChangedInstance2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = (Function2) new MiscPagesKt$AiBackgroundTasksSection$2$1(tasks$delegate, ai, titles$delegate, null);
                $composer3.updateRememberedValue(obj3);
                objRememberedValue5 = obj3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(ai, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, $composer3, 0);
            if (AiBackgroundTasksSection$lambda$3(tasks$delegate).isEmpty()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = $composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 != null) {
                    scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda31
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            return MiscPagesKt.AiBackgroundTasksSection$lambda$11(state, $changed, (Composer) obj4, ((Integer) obj5).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            $composer2 = $composer3;
            UiKt.Section("AI 后台任务", "助手转到后台执行的安装/下载，完成后会回到对应对话汇报", null, false, ComposableLambdaKt.rememberComposableLambda(-976749914, true, new Function3() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda32
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                    return MiscPagesKt.AiBackgroundTasksSection$lambda$12(state, ai, tasks$delegate, (RowScope) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                }
            }, $composer3, 54), $composer2, 24630, 12);
            for (final AiTaskRow aiTaskRow : AiTaskCenter.rows$default(AiTaskCenter.INSTANCE, AiBackgroundTasksSection$lambda$3(tasks$delegate), AiBackgroundTasksSection$lambda$6(titles$delegate), 0L, null, null, 28, null)) {
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, obj);
                float fM7018constructorimpl = Dp.m7018constructorimpl(14);
                ComposerKt.sourceInformationMarkerStart($composer2, -2122360611, "CC(remember):MiscPages.kt#9igjgp");
                boolean zChangedInstance3 = (($dirty2 & 14) == 4 || (($dirty2 & 8) != 0 && $composer2.changedInstance(state))) | $composer2.changedInstance(ai) | $composer2.changedInstance(aiTaskRow);
                Composer composer = $composer2;
                Object objRememberedValue6 = composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    modifier = modifierFillMaxWidth$default;
                    Object obj4 = new Function0() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda33
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MiscPagesKt.AiBackgroundTasksSection$lambda$13$0$0(aiTaskRow, state, titles$delegate, ai);
                        }
                    };
                    composer.updateRememberedValue(obj4);
                    objRememberedValue6 = obj4;
                } else {
                    modifier = modifierFillMaxWidth$default;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                Composer $composer4 = $composer2;
                UiKt.m7594CardDzVHIIc(modifier, fM7018constructorimpl, (Function0) objRememberedValue6, ComposableLambdaKt.rememberComposableLambda(1802653630, true, new Function3() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda34
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                        return MiscPagesKt.AiBackgroundTasksSection$lambda$13$1(aiTaskRow, ai, state, titles$delegate, (ColumnScope) obj5, (Composer) obj6, ((Integer) obj7).intValue());
                    }
                }, $composer2, 54), $composer4, 3126, 0);
                $composer2 = $composer4;
                obj = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup3 != null) {
            scopeUpdateScopeEndRestartGroup3.updateScope(new Function2() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda35
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    return MiscPagesKt.AiBackgroundTasksSection$lambda$14(state, $changed, (Composer) obj5, ((Integer) obj6).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<BgTaskInfo> AiBackgroundTasksSection$lambda$3(MutableState<List<BgTaskInfo>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<String, String> AiBackgroundTasksSection$lambda$6(MutableState<Map<String, String>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object AiBackgroundTasksSection$snapshot(AiUiExtras ai, Continuation<? super List<BgTaskInfo>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new MiscPagesKt$AiBackgroundTasksSection$snapshot$2(ai, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d A[Catch: all -> 0x00c7, TRY_LEAVE, TryCatch #2 {all -> 0x00c7, blocks: (B:24:0x0067, B:25:0x0087, B:27:0x008d), top: B:51:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object AiBackgroundTasksSection$refreshTitles(com.pymcl.android.data.AiUiExtras r17, androidx.compose.runtime.MutableState<java.util.Map<java.lang.String, java.lang.String>> r18, kotlin.coroutines.Continuation<? super kotlin.Unit> r19) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.MiscPagesKt.AiBackgroundTasksSection$refreshTitles(com.pymcl.android.data.AiUiExtras, androidx.compose.runtime.MutableState, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private static final void AiBackgroundTasksSection$openChat(AppState $state, MutableState<Map<String, String>> mutableState, AiUiExtras ai, AiTaskRow r) {
        String block = AiTaskCenter.INSTANCE.openBlockReason(r.getChatId(), AiSession.INSTANCE.getRunning() ? AiSession.INSTANCE.getActiveChat() : null, AiSession.INSTANCE.getRunning());
        if (block != null) {
            AppState.toast$default($state, block, null, "info", 2, null);
        } else if (!AiBackgroundTasksSection$lambda$6(mutableState).containsKey(r.getChatId())) {
            AppState.toast$default($state, "对话已不存在", null, "warn", 2, null);
        } else {
            $state.launch(new MiscPagesKt$AiBackgroundTasksSection$openChat$1(r, ai, $state, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiBackgroundTasksSection$lambda$12(final AppState $state, final AiUiExtras $ai, final MutableState $tasks$delegate, RowScope Section, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Section, "$this$Section");
        ComposerKt.sourceInformation($composer, "C408@26011L109:MiscPages.kt#vz4689");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-976749914, $changed, -1, "com.pymcl.android.ui.pages.AiBackgroundTasksSection.<anonymous> (MiscPages.kt:408)");
            }
            UiKt.Muted(I18nKt.tr("进行中 {0} · 共 {1}", Integer.valueOf(AiTaskCenter.INSTANCE.runningCount(AiBackgroundTasksSection$lambda$3($tasks$delegate))), Integer.valueOf(AiBackgroundTasksSection$lambda$3($tasks$delegate).size())), null, true, 0, $composer, 384, 10);
            if (AiTaskCenter.INSTANCE.canClear(AiBackgroundTasksSection$lambda$3($tasks$delegate))) {
                $composer.startReplaceGroup(1941178402);
                ComposerKt.sourceInformation($composer, "410@26287L392,410@26235L444");
                String strT = AiText.INSTANCE.t("清除已结束", new Object[0]);
                BtnKind btnKind = BtnKind.Normal;
                ComposerKt.sourceInformationMarkerStart($composer, 1941180014, "CC(remember):MiscPages.kt#9igjgp");
                boolean zChangedInstance = $composer.changedInstance($state) | $composer.changedInstance($ai);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda48
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MiscPagesKt.AiBackgroundTasksSection$lambda$12$0$0($state, $ai, $tasks$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                UiKt.Btn(strT, btnKind, null, false, false, null, false, (Function0) objRememberedValue, $composer, 48, 124);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(47415004);
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
    public static final Unit AiBackgroundTasksSection$lambda$12$0$0(AppState $state, AiUiExtras $ai, MutableState $tasks$delegate) {
        $state.launch(new MiscPagesKt$AiBackgroundTasksSection$4$1$1$1($state, $ai, $tasks$delegate, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiBackgroundTasksSection$lambda$13$0$0(AiTaskRow $r, AppState $state, MutableState $titles$delegate, AiUiExtras $ai) {
        AiBackgroundTasksSection$openChat($state, $titles$delegate, $ai, $r);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x053a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit AiBackgroundTasksSection$lambda$13$1(final com.pymcl.android.data.AiTaskRow r84, final com.pymcl.android.data.AiUiExtras r85, final com.pymcl.android.ui.state.AppState r86, final androidx.compose.runtime.MutableState r87, androidx.compose.foundation.layout.ColumnScope r88, androidx.compose.runtime.Composer r89, int r90) {
        /*
            Method dump skipped, instructions count: 1556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.MiscPagesKt.AiBackgroundTasksSection$lambda$13$1(com.pymcl.android.data.AiTaskRow, com.pymcl.android.data.AiUiExtras, com.pymcl.android.ui.state.AppState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiBackgroundTasksSection$lambda$13$1$0$1$0(AiUiExtras $ai, AiTaskRow $r, AppState $state) {
        if ($ai.cancelTask($r.getId())) {
            $state.toast("已取消后台任务", $r.getTitle(), "info");
        } else {
            AppState.toast$default($state, "任务已经结束", null, "info", 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiBackgroundTasksSection$lambda$13$1$0$2$0(AiTaskRow $r, AppState $state, MutableState $titles$delegate, AiUiExtras $ai) {
        AiBackgroundTasksSection$openChat($state, $titles$delegate, $ai, $r);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FeedbackPage(com.pymcl.android.ui.state.AppState r42, androidx.compose.runtime.Composer r43, final int r44) {
        /*
            Method dump skipped, instructions count: 1242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.MiscPagesKt.FeedbackPage(com.pymcl.android.ui.state.AppState, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int FeedbackPage$lambda$1(MutableIntState $kind$delegate) {
        return $kind$delegate.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String FeedbackPage$lambda$4(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String FeedbackPage$lambda$7(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String FeedbackPage$lambda$10(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean FeedbackPage$lambda$13(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void FeedbackPage$lambda$14(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Uri> FeedbackPage$lambda$16(MutableState<List<Uri>> mutableState) {
        return mutableState.getValue();
    }

    private static final List<FeedbackRecord> FeedbackPage$lambda$19(MutableState<List<FeedbackRecord>> mutableState) {
        return mutableState.getValue();
    }

    private static final List<HelpArticle> FeedbackPage$lambda$22(MutableState<List<HelpArticle>> mutableState) {
        return mutableState.getValue();
    }

    private static final String FeedbackPage$lambda$25(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String FeedbackPage$lambda$28(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean FeedbackPage$lambda$31(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FeedbackPage$lambda$32(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FeedbackPage$lambda$36$0(MutableState $attachments$delegate, List uris) {
        Intrinsics.checkNotNullParameter(uris, "uris");
        if (!uris.isEmpty()) {
            $attachments$delegate.setValue(CollectionsKt.take(CollectionsKt.distinct(CollectionsKt.plus((Collection) FeedbackPage$lambda$16($attachments$delegate), (Iterable) uris)), 10));
        }
        return Unit.INSTANCE;
    }

    private static final String FeedbackPage$composedText(String appVersion, String sysText, MutableIntState kind$delegate, MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, MutableState<Boolean> mutableState4) {
        return FeedbackLogic.compose$default(FeedbackLogic.INSTANCE, FeedbackPage$lambda$1(kind$delegate), FeedbackPage$lambda$4(mutableState), FeedbackPage$lambda$7(mutableState2), FeedbackPage$lambda$10(mutableState3), appVersion, FeedbackPage$lambda$13(mutableState4) ? sysText : null, System.currentTimeMillis(), null, 128, null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Null bind block in PHI insn: 0x005b: PHI (r4v4 ?? I:com.github.caciocavallosilano.cacio.peer.CacioComponentPeer A[D('i' android.content.Intent)]) =  binds: [] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.dex.instructions.PhiInsn.bindArg(PhiInsn.java:47)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:156)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    private static final void FeedbackPage$shareFallback(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Null bind block in PHI insn: 0x005b: PHI (r4v4 ?? I:com.github.caciocavallosilano.cacio.peer.CacioComponentPeer A[D('i' android.content.Intent)]) =  binds: [] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.dex.instructions.PhiInsn.bindArg(PhiInsn.java:47)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:156)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r11v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:403)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:391)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:341)
        */

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FeedbackPage$doSubmit(String problem, AppState $state, MutableState<Boolean> mutableState, Context ctx, String appVersion, String sysText, MutableIntState kind$delegate, MutableState<String> mutableState2, MutableState<String> mutableState3, MutableState<String> mutableState4, MutableState<Boolean> mutableState5, MutableState<List<Uri>> mutableState6, MutableState<List<FeedbackRecord>> mutableState7) {
        if (problem != null) {
            $state.toast("还不能发送", I18nKt.tr(problem, new Object[0]), "warn");
        } else {
            if (FeedbackPage$lambda$31(mutableState)) {
                return;
            }
            FeedbackPage$lambda$32(mutableState, true);
            $state.launch(new MiscPagesKt$FeedbackPage$doSubmit$1($state, ctx, appVersion, sysText, kind$delegate, mutableState2, mutableState3, mutableState4, mutableState5, mutableState6, problem, mutableState7, mutableState, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FeedbackPage$lambda$42(final String $problem, final MutableIntState $kind$delegate, final MutableState $title$delegate, final MutableState $body$delegate, final MutableState $contact$delegate, final MutableState $sys$delegate, final MutableState $attachments$delegate, final AppState $state, final Context $ctx, final String $appVersion, final String $sysText, final ClipboardManager $clip, final ManagedActivityResultLauncher $picker, final MutableState $sending$delegate, final MutableState $hist$delegate, final MutableState $q$delegate, final MutableState $arts$delegate, final MutableState $open$delegate, ColumnScope ScrollBody, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(ScrollBody, "$this$ScrollBody");
        ComposerKt.sourceInformation($composer, "C541@34849L37,542@34910L2063,563@36983L1203,542@34895L3292,581@38196L30:MiscPages.kt#vz4689");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1714277698, $changed, -1, "com.pymcl.android.ui.pages.FeedbackPage.<anonymous> (MiscPages.kt:541)");
            }
            UiKt.Section("反馈与帮助", "遇到问题先看帮助，解决不了再提反馈", null, false, null, $composer, 54, 28);
            GamePagesKt.m7768TwoPaneAjpBEmI(0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(1546349077, true, new Function3() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda86
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return MiscPagesKt.FeedbackPage$lambda$42$0($problem, $kind$delegate, $title$delegate, $body$delegate, $contact$delegate, $sys$delegate, $attachments$delegate, $state, $ctx, $appVersion, $sysText, $clip, $picker, $sending$delegate, $hist$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), ComposableLambdaKt.rememberComposableLambda(-1062718284, true, new Function3() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda87
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return MiscPagesKt.FeedbackPage$lambda$42$1($hist$delegate, $q$delegate, $arts$delegate, $open$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, GL11.GL_AUTO_NORMAL, 3);
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
    public static final Unit FeedbackPage$lambda$42$0(final String $problem, final MutableIntState $kind$delegate, final MutableState $title$delegate, final MutableState $body$delegate, final MutableState $contact$delegate, final MutableState $sys$delegate, final MutableState $attachments$delegate, final AppState $state, final Context $ctx, final String $appVersion, final String $sysText, final ClipboardManager $clip, final ManagedActivityResultLauncher $picker, final MutableState $sending$delegate, final MutableState $hist$delegate, ColumnScope TwoPane, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TwoPane, "$this$TwoPane");
        ComposerKt.sourceInformation($composer, "C543@34954L2009,543@34924L2039:MiscPages.kt#vz4689");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1546349077, $changed, -1, "com.pymcl.android.ui.pages.FeedbackPage.<anonymous>.<anonymous> (MiscPages.kt:543)");
            }
            UiKt.m7594CardDzVHIIc(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1895278683, true, new Function3() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda29
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return MiscPagesKt.FeedbackPage$lambda$42$0$0($problem, $kind$delegate, $title$delegate, $body$delegate, $contact$delegate, $sys$delegate, $attachments$delegate, $state, $ctx, $appVersion, $sysText, $clip, $picker, $sending$delegate, $hist$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x05e3 A[PHI: r6
  0x05e3: PHI (r6v40 androidx.compose.foundation.layout.RowScope) = (r6v38 androidx.compose.foundation.layout.RowScope), (r6v41 androidx.compose.foundation.layout.RowScope) binds: [B:89:0x05e1, B:85:0x05da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0607  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit FeedbackPage$lambda$42$0$0(final java.lang.String r55, final androidx.compose.runtime.MutableIntState r56, final androidx.compose.runtime.MutableState r57, final androidx.compose.runtime.MutableState r58, final androidx.compose.runtime.MutableState r59, final androidx.compose.runtime.MutableState r60, final androidx.compose.runtime.MutableState r61, com.pymcl.android.ui.state.AppState r62, final android.content.Context r63, final java.lang.String r64, java.lang.String r65, final androidx.compose.ui.platform.ClipboardManager r66, final androidx.activity.compose.ManagedActivityResultLauncher r67, final androidx.compose.runtime.MutableState r68, final androidx.compose.runtime.MutableState r69, androidx.compose.foundation.layout.ColumnScope r70, androidx.compose.runtime.Composer r71, int r72) {
        /*
            Method dump skipped, instructions count: 1781
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.MiscPagesKt.FeedbackPage$lambda$42$0$0(java.lang.String, androidx.compose.runtime.MutableIntState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, com.pymcl.android.ui.state.AppState, android.content.Context, java.lang.String, java.lang.String, androidx.compose.ui.platform.ClipboardManager, androidx.activity.compose.ManagedActivityResultLauncher, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FeedbackPage$lambda$42$0$0$0(final MutableIntState $kind$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C545@35142L13,545@35105L51:MiscPages.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1604464646, $changed, -1, "com.pymcl.android.ui.pages.FeedbackPage.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MiscPages.kt:545)");
            }
            List<String> kinds = FeedbackLogic.INSTANCE.getKINDS();
            int iFeedbackPage$lambda$1 = FeedbackPage$lambda$1($kind$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, 2735719, "CC(remember):MiscPages.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda65
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return MiscPagesKt.FeedbackPage$lambda$42$0$0$0$0$0($kind$delegate, ((Integer) obj2).intValue());
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Segmented(kinds, iFeedbackPage$lambda$1, (Function1) objRememberedValue, false, $composer, 384, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FeedbackPage$lambda$42$0$0$0$0$0(MutableIntState $kind$delegate, int it) {
        $kind$delegate.setIntValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FeedbackPage$lambda$42$0$0$1(final MutableState $title$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C546@35222L49,546@35209L99:MiscPages.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-393521565, $changed, -1, "com.pymcl.android.ui.pages.FeedbackPage.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MiscPages.kt:546)");
            }
            String strFeedbackPage$lambda$4 = FeedbackPage$lambda$4($title$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, -217101388, "CC(remember):MiscPages.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return MiscPagesKt.FeedbackPage$lambda$42$0$0$1$0$0($title$delegate, (String) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.m7599InputxAketlw(strFeedbackPage$lambda$4, (Function1) objRememberedValue, "一句话说清问题", SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, 0, 0, 0, 0, null, null, false, false, false, $composer, GL11.GL_MAP2_COLOR_4, 0, 32752);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FeedbackPage$lambda$42$0$0$1$0$0(MutableState $title$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $title$delegate.setValue(StringsKt.take(it, 140));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FeedbackPage$lambda$42$0$0$2(final MutableState $body$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C547@35375L13,547@35363L167:MiscPages.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(777687106, $changed, -1, "com.pymcl.android.ui.pages.FeedbackPage.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MiscPages.kt:547)");
            }
            String strFeedbackPage$lambda$7 = FeedbackPage$lambda$7($body$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, 32999823, "CC(remember):MiscPages.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return MiscPagesKt.FeedbackPage$lambda$42$0$0$2$0$0($body$delegate, (String) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.m7599InputxAketlw(strFeedbackPage$lambda$7, (Function1) objRememberedValue, "详细描述：怎么触发的、期望是什么", SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, 4, 0, 0, ImeAction.INSTANCE.m6639getDefaulteUduSuo(), null, null, false, false, false, $composer, 807079344, 0, 32144);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FeedbackPage$lambda$42$0$0$2$0$0(MutableState $body$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $body$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FeedbackPage$lambda$42$0$0$3(final MutableState $contact$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C548@35600L16,548@35585L69:MiscPages.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1948895777, $changed, -1, "com.pymcl.android.ui.pages.FeedbackPage.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MiscPages.kt:548)");
            }
            String strFeedbackPage$lambda$10 = FeedbackPage$lambda$10($contact$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, 283101201, "CC(remember):MiscPages.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda88
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return MiscPagesKt.FeedbackPage$lambda$42$0$0$3$0$0($contact$delegate, (String) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.m7599InputxAketlw(strFeedbackPage$lambda$10, (Function1) objRememberedValue, "联系方式（可空）", SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, 0, 0, 0, 0, null, null, false, false, false, $composer, GL11.GL_MAP2_COLOR_4, 0, 32752);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FeedbackPage$lambda$42$0$0$3$0$0(MutableState $contact$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $contact$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FeedbackPage$lambda$42$0$0$4$0(MutableState $sys$delegate, boolean it) {
        FeedbackPage$lambda$14($sys$delegate, it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FeedbackPage$lambda$42$0$0$5$0$0(MutableState $attachments$delegate) {
        $attachments$delegate.setValue(CollectionsKt.emptyList());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FeedbackPage$lambda$42$0$0$6$0$0(String $problem, AppState $state, MutableState $sending$delegate, Context $ctx, String $appVersion, String $sysText, MutableIntState $kind$delegate, MutableState $title$delegate, MutableState $body$delegate, MutableState $contact$delegate, MutableState $sys$delegate, MutableState $attachments$delegate, MutableState $hist$delegate) {
        FeedbackPage$doSubmit($problem, $state, $sending$delegate, $ctx, $appVersion, $sysText, $kind$delegate, $title$delegate, $body$delegate, $contact$delegate, $sys$delegate, $attachments$delegate, $hist$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FeedbackPage$lambda$42$0$0$6$1$0(ClipboardManager $clip, String $appVersion, String $sysText, MutableIntState $kind$delegate, MutableState $title$delegate, MutableState $body$delegate, MutableState $contact$delegate, MutableState $sys$delegate, MutableState $attachments$delegate, Context $ctx, AppState $state) {
        FeedbackPage$shareFallback($clip, $appVersion, $sysText, $kind$delegate, $title$delegate, $body$delegate, $contact$delegate, $sys$delegate, $attachments$delegate, $ctx, $state);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FeedbackPage$lambda$42$0$0$6$2$0(RowScope $this_Row, ManagedActivityResultLauncher $picker, AppState $state) {
        Object objM8116constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            $picker.launch(new String[]{"image/*", "text/*", "application/zip", "application/octet-stream"});
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
    public static final Unit FeedbackPage$lambda$42$0$0$6$3$0(AppState $state, String $sysText) {
        $state.open(new DialogSpec.Confirm("系统信息", $sysText, null, false, true, new Function0() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        }, 12, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FeedbackPage$lambda$42$0$0$6$4$0(ClipboardManager $clip, String $sysText, AppState $state) {
        $clip.setText(new AnnotatedString($sysText, null, 2, null));
        AppState.toast$default($state, "已复制", null, null, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FeedbackPage$lambda$42$1(final MutableState $hist$delegate, final MutableState $q$delegate, final MutableState $arts$delegate, final MutableState $open$delegate, ColumnScope TwoPane, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TwoPane, "$this$TwoPane");
        ComposerKt.sourceInformation($composer, "C564@37027L400,564@36997L430,569@37470L706,569@37440L736:MiscPages.kt#vz4689");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1062718284, $changed, -1, "com.pymcl.android.ui.pages.FeedbackPage.<anonymous>.<anonymous> (MiscPages.kt:564)");
            }
            UiKt.m7594CardDzVHIIc(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-209378748, true, new Function3() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda39
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return MiscPagesKt.FeedbackPage$lambda$42$1$0($hist$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 3078, 6);
            UiKt.m7594CardDzVHIIc(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1615786541, true, new Function3() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda40
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return MiscPagesKt.FeedbackPage$lambda$42$1$1($q$delegate, $arts$delegate, $open$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
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
    public static final Unit FeedbackPage$lambda$42$1$0(MutableState $hist$delegate, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Composer composer = $composer;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation(composer, "C565@37045L11,*567@37182L229:MiscPages.kt#vz4689");
        if (composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-209378748, $changed, -1, "com.pymcl.android.ui.pages.FeedbackPage.<anonymous>.<anonymous>.<anonymous> (MiscPages.kt:565)");
            }
            UiKt.H3("我提交过的", null, false, composer, 6, 6);
            if (FeedbackPage$lambda$19($hist$delegate).isEmpty()) {
                composer.startReplaceGroup(650488248);
                ComposerKt.sourceInformation(composer, "566@37093L52");
                UiKt.Muted("还没有提交过反馈；提交记录保存在本机的 feedback_history.json 里", null, false, 0, $composer, 6, 14);
                composer = $composer;
            } else {
                composer.startReplaceGroup(-1309650818);
            }
            composer.endReplaceGroup();
            Iterable iterableFeedbackPage$lambda$19 = FeedbackPage$lambda$19($hist$delegate);
            int i = 0;
            Iterator it = iterableFeedbackPage$lambda$19.iterator();
            while (it.hasNext()) {
                FeedbackRecord feedbackRecord = (FeedbackRecord) it.next();
                Modifier modifierM742paddingqDBjuR0$default = PaddingKt.m742paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7018constructorimpl(6), 0.0f, 0.0f, 13, null);
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
                Iterable iterable = iterableFeedbackPage$lambda$19;
                int i2 = i;
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
                Iterator it2 = it;
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM742paddingqDBjuR0$default);
                Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
                int i3 = ((((390 << 3) & 112) << 6) & User32.WM_PENWINFIRST) | 6;
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
                int i4 = (i3 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                int i5 = ((390 >> 6) & 112) | 6;
                RowScope rowScope = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart($composer, -1720227167, "C567@37266L59,567@37327L25,567@37354L28,567@37384L25:MiscPages.kt#vz4689");
                UiKt.m7603TxtuDo3WH8(feedbackRecord.getTitle(), RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), true, 0L, 1, $composer, 24960, 8);
                UiKt.Tag(feedbackRecord.getStatus(), null, true, $composer, 384, 2);
                SpacerKt.Spacer(SizeKt.m790width3ABfNKs(Modifier.INSTANCE, Dp.m7018constructorimpl(6)), $composer, 6);
                UiKt.Small(feedbackRecord.getDate(), null, true, $composer, 384, 2);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                it = it2;
                iterableFeedbackPage$lambda$19 = iterable;
                i = i2;
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
    public static final Unit FeedbackPage$lambda$42$1$1(final MutableState $q$delegate, MutableState $arts$delegate, MutableState $open$delegate, ColumnScope Card, Composer $composer, int $changed) {
        final MutableState mutableState;
        Function0 function0;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C570@37488L10,570@37500L38,571@37564L10,571@37555L102,*575@37896L6,575@37918L49,575@37857L287:MiscPages.kt#vz4689");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1615786541, $changed, -1, "com.pymcl.android.ui.pages.FeedbackPage.<anonymous>.<anonymous>.<anonymous> (MiscPages.kt:570)");
            }
            UiKt.H3("常见问题", null, false, $composer, 6, 6);
            UiKt.Muted("启动、Java、模组、账号、联机的快速说明（点击标题展开）", null, false, 0, $composer, 6, 14);
            String strFeedbackPage$lambda$25 = FeedbackPage$lambda$25($q$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, -2007292233, "CC(remember):MiscPages.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return MiscPagesKt.FeedbackPage$lambda$42$1$1$0$0($q$delegate, (String) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            String str = "CC(remember):MiscPages.kt#9igjgp";
            UiKt.m7599InputxAketlw(strFeedbackPage$lambda$25, (Function1) objRememberedValue, "搜索帮助文章", PaddingKt.m740paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7018constructorimpl(8), 1, null), false, false, 0, 0, 0, 0, null, Ico.INSTANCE.getSearch(), false, false, false, $composer, GL11.GL_MAP2_COLOR_4, 0, 30704);
            Composer composer = $composer;
            Iterable iterableFeedbackPage$lambda$22 = FeedbackPage$lambda$22($arts$delegate);
            Collection arrayList = new ArrayList();
            for (Object obj2 : iterableFeedbackPage$lambda$22) {
                HelpArticle helpArticle = (HelpArticle) obj2;
                if (((StringsKt.contains$default((CharSequence) helpArticle.getTitle(), (CharSequence) FeedbackPage$lambda$25($q$delegate), false, 2, (Object) null) || StringsKt.contains$default((CharSequence) helpArticle.getBody(), (CharSequence) FeedbackPage$lambda$25($q$delegate), false, 2, (Object) null)) ? 1 : 0) != 0) {
                    arrayList.add(obj2);
                }
            }
            Object obj3 = null;
            List shown = (List) arrayList;
            if (shown.isEmpty()) {
                composer.startReplaceGroup(-2007285219);
                ComposerKt.sourceInformation(composer, "573@37783L16");
                UiKt.Muted("没有匹配的文章", null, false, 0, composer, 6, 14);
            } else {
                composer.startReplaceGroup(-2096284267);
            }
            composer.endReplaceGroup();
            List list = shown;
            int i = 0;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final HelpArticle helpArticle2 = (HelpArticle) it.next();
                Modifier modifierClip = ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, obj3), Py.INSTANCE.getShapes(composer, 6).getCtl());
                String str2 = str;
                ComposerKt.sourceInformationMarkerStart(composer, 811396288, str2);
                boolean zChangedInstance = composer.changedInstance(helpArticle2);
                Object objRememberedValue2 = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    mutableState = $open$delegate;
                    Object obj4 = new Function0() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MiscPagesKt.FeedbackPage$lambda$42$1$1$2$0$0(helpArticle2, mutableState);
                        }
                    };
                    $composer.updateRememberedValue(obj4);
                    objRememberedValue2 = obj4;
                } else {
                    mutableState = $open$delegate;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                Modifier modifierM740paddingVpY3zN4$default = PaddingKt.m740paddingVpY3zN4$default(ClickableKt.m281clickableXHw0xAI$default(modifierClip, false, null, null, (Function0) objRememberedValue2, 7, null), 0.0f, Dp.m7018constructorimpl(6), 1, obj3);
                ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                Iterable iterable = list;
                int i2 = i;
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
                Iterator it2 = it;
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM740paddingVpY3zN4$default);
                Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
                int i3 = ((((0 << 3) & 112) << 6) & User32.WM_PENWINFIRST) | 6;
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
                int i4 = (i3 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                int i5 = ((0 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -340495260, "C576@38020L24:MiscPages.kt#vz4689");
                UiKt.m7603TxtuDo3WH8(helpArticle2.getTitle(), null, true, 0L, 0, $composer, 384, 26);
                if (Intrinsics.areEqual(FeedbackPage$lambda$28(mutableState), helpArticle2.getTitle())) {
                    $composer.startReplaceGroup(1235943728);
                    ComposerKt.sourceInformation($composer, "576@38067L55");
                    UiKt.Muted(helpArticle2.getBody(), PaddingKt.m742paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7018constructorimpl(4), 0.0f, 0.0f, 13, null), true, 0, $composer, 432, 8);
                } else {
                    $composer.startReplaceGroup(-340397239);
                }
                $composer.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                composer = $composer;
                str = str2;
                it = it2;
                list = iterable;
                i = i2;
                obj3 = null;
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
    public static final Unit FeedbackPage$lambda$42$1$1$0$0(MutableState $q$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $q$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FeedbackPage$lambda$42$1$1$2$0$0(HelpArticle $a, MutableState $open$delegate) {
        $open$delegate.setValue(Intrinsics.areEqual(FeedbackPage$lambda$28($open$delegate), $a.getTitle()) ? null : $a.getTitle());
        return Unit.INSTANCE;
    }
}
