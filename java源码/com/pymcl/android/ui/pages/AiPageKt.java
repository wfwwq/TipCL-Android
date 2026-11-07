package com.pymcl.android.ui.pages;

import android.content.res.Resources;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
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
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.pymcl.ai.AiEvent;
import com.pymcl.ai.AskOption;
import com.pymcl.ai.AskQuestion;
import com.pymcl.ai.Permission;
import com.pymcl.android.R;
import com.pymcl.android.data.AiConfirmOutcome;
import com.pymcl.android.data.AiSettingsForm;
import com.pymcl.android.data.AiUiExtras;
import com.pymcl.android.data.RepositoryUiApi;
import com.pymcl.android.ui.components.BtnKind;
import com.pymcl.android.ui.components.Ico;
import com.pymcl.android.ui.components.TagTone;
import com.pymcl.android.ui.components.UiKt;
import com.pymcl.android.ui.i18n.I18nKt;
import com.pymcl.android.ui.state.AiItem;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.ChatSummary;
import com.pymcl.android.ui.state.DialogSpec;
import com.pymcl.android.ui.state.LauncherUiApi;
import com.pymcl.android.ui.state.PermissionRule;
import com.pymcl.android.ui.state.TaskState;
import com.pymcl.android.ui.theme.Py;
import com.pymcl.android.ui.theme.PyColors;
import com.pymcl.multiplayer.TerracottaVpnService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import org.apache.commons.lang3.concurrent.AbstractCircuitBreaker;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.windows.User32;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AiPage.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000\u001aA\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007b\u0002\b\fb\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f¢\u0006\u0002\u0010\u000b\u001a3\u0010\u0010\u001a\u00020\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\u0012H\u0003b\u0002\b\fb\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f¢\u0006\u0002\u0010\u0014\u001a=\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u0018H\u0007b\u0002\b\fb\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f¢\u0006\u0002\u0010\u0019\u001aY\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0016\u001a\u00020\n2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001d2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0018H\u0001b\u0002\b\fb\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f¢\u0006\u0002\u0010\u001f\u001aO\u0010 \u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\u0012H\u0003b\u0002\b\fb\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f¢\u0006\u0002\u0010&\u001aY\u0010'\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010(\u001a\u00020)2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00040\u00122\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040\u001dH\u0003b\u0002\b\fb\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f¢\u0006\u0002\u0010,\u001a5\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00132\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001dH\u0003b\u0002\b\fb\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f¢\u0006\u0002\u0010/\u001a'\u00100\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0013H\u0003b\u0002\b\fb\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f¢\u0006\u0002\u00101\u001a1\u00104\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00132\u0006\u00106\u001a\u000207H\u0007b\u0002\b\fb\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f¢\u0006\u0004\b8\u00109\u001a'\u0010:\u001a\u00020\u00042\u0006\u0010;\u001a\u00020<H\u0003b\u0002\b\fb\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f¢\u0006\u0002\u0010=\u001am\u0010>\u001a\u00020\u00042\u0006\u0010?\u001a\u00020\u00132\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010A\u001a\u00020\u00072\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00040\u001d2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00040\u001d2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00040\u001dH\u0003b\u0002\b\fb\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f¢\u0006\u0002\u0010E\"\u001a\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020)03X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006F²\u0006\u0010\u0010G\u001a\b\u0012\u0004\u0012\u00020H0\tX\u008a\u008e\u0002²\u0006\u0010\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00130\tX\u008a\u008e\u0002²\u0006\n\u0010J\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u0010(\u001a\u00020)X\u008a\u008e\u0002²\u0006\n\u0010K\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u0010L\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\u0010\u0010M\u001a\b\u0012\u0004\u0012\u00020N0\tX\u008a\u008e\u0002²\u0006\n\u00105\u001a\u00020)X\u008a\u008e\u0002²\u0006\n\u0010O\u001a\u00020)X\u008a\u008e\u0002²\u0006\n\u0010P\u001a\u00020)X\u008a\u008e\u0002²\u0006\n\u0010Q\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u0010R\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u0010R\u001a\u00020\u0007X\u008a\u008e\u0002"}, d2 = {"aiExtras", "Lcom/pymcl/android/data/AiUiExtras;", "Lcom/pymcl/android/ui/state/AppState;", "AiPage", "", "state", "compact", "", "initial", "", "Lcom/pymcl/android/ui/state/AiItem;", "(Lcom/pymcl/android/ui/state/AppState;ZLjava/util/List;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/runtime/ComposableTarget;", "applier", "androidx.compose.ui.UiComposable", "EmptyChat", "onPick", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "AiItemView", "it", "items", "", "(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/AiItem;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "AiRow", "ai", "onRetry", "Lkotlin/Function0;", "local", "(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/state/AiItem;Lkotlin/jvm/functions/Function0;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V", "AskCard", "item", "Lcom/pymcl/android/ui/state/AiItem$Ask;", "full", "Lcom/pymcl/ai/AiEvent$Ask;", "onResolved", "(Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/state/AiItem$Ask;Lcom/pymcl/ai/AiEvent$Ask;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "PermissionPanel", "perm", "", "onPerm", "onClose", "(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/data/AiUiExtras;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ErrorRow", TerracottaVpnService.EXTRA_TEXT, "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ThinkFold", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "toolIcons", "", "ToolIcon", "tool", "size", "Landroidx/compose/ui/unit/Dp;", "ToolIcon-ziNgDLE", "(Ljava/lang/String;FLandroidx/compose/runtime/Composer;I)V", "ToolLine", "t", "Lcom/pymcl/android/ui/state/AiItem$Tool;", "(Lcom/pymcl/android/ui/state/AiItem$Tool;Landroidx/compose/runtime/Composer;I)V", "ChatInput", "value", "onChange", "running", "onSend", "onStop", "onRewind", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "PyMCL-Android:app_debug", "chats", "Lcom/pymcl/android/ui/state/ChatSummary;", "models", "model", "input", "showPerm", "rules", "Lcom/pymcl/android/ui/state/PermissionRule;", "behavior", "scope", "content", AbstractCircuitBreaker.PROPERTY_NAME}, k = 2, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes22.dex */
public final class AiPageKt {
    private static final Map<String, Integer> toolIcons = MapsKt.mapOf(TuplesKt.to("ask_user", Integer.valueOf(R.drawable.tool_ask_user)), TuplesKt.to("create_instance", Integer.valueOf(R.drawable.tool_create_instance)), TuplesKt.to("delete_instance", Integer.valueOf(R.drawable.tool_delete_instance)), TuplesKt.to("delete_mod", Integer.valueOf(R.drawable.tool_delete_mod)), TuplesKt.to("diagnose_launch", Integer.valueOf(R.drawable.tool_diagnose_launch)), TuplesKt.to("disable_mod", Integer.valueOf(R.drawable.tool_disable_mod)), TuplesKt.to("dispatch_subagent", Integer.valueOf(R.drawable.tool_dispatch_subagent)), TuplesKt.to("download_java", Integer.valueOf(R.drawable.tool_download_java)), TuplesKt.to("enable_mod", Integer.valueOf(R.drawable.tool_enable_mod)), TuplesKt.to("get_installed_versions", Integer.valueOf(R.drawable.tool_get_installed_versions)), TuplesKt.to("get_java_list", Integer.valueOf(R.drawable.tool_get_java_list)), TuplesKt.to("get_launcher_state", Integer.valueOf(R.drawable.tool_get_launcher_state)), TuplesKt.to("inspect_mod", Integer.valueOf(R.drawable.tool_inspect_mod)), TuplesKt.to("install_datapack", Integer.valueOf(R.drawable.tool_install_datapack)), TuplesKt.to("install_game", Integer.valueOf(R.drawable.tool_install_game)), TuplesKt.to("install_mod", Integer.valueOf(R.drawable.tool_install_mod)), TuplesKt.to("install_modpack", Integer.valueOf(R.drawable.tool_install_modpack)), TuplesKt.to("install_resourcepack", Integer.valueOf(R.drawable.tool_install_resourcepack)), TuplesKt.to("install_shader", Integer.valueOf(R.drawable.tool_install_shader)), TuplesKt.to("install_world", Integer.valueOf(R.drawable.tool_install_world)), TuplesKt.to("launch_game", Integer.valueOf(R.drawable.tool_launch_game)), TuplesKt.to("list_installed_versions", Integer.valueOf(R.drawable.tool_list_installed_versions)), TuplesKt.to("list_instances", Integer.valueOf(R.drawable.tool_list_instances)), TuplesKt.to("list_mods", Integer.valueOf(R.drawable.tool_list_mods)), TuplesKt.to("scan_mod_conflicts", Integer.valueOf(R.drawable.tool_scan_mod_conflicts)), TuplesKt.to("update_plan", Integer.valueOf(R.drawable.tool_update_plan)));

    /* compiled from: AiPage.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TaskState.values().length];
            try {
                iArr[TaskState.Done.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[TaskState.Failed.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[TaskState.Running.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiItemView$lambda$1(AppState appState, AiItem aiItem, List list, int i, Composer composer, int i2) throws XmlPullParserException, Resources.NotFoundException, IllegalArgumentException {
        AiItemView(appState, aiItem, list, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiPage$lambda$26(AppState appState, boolean z, List list, int i, int i2, Composer composer, int i3) {
        AiPage(appState, z, list, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiRow$lambda$7(AppState appState, AiUiExtras aiUiExtras, AiItem aiItem, Function0 function0, List list, int i, int i2, Composer composer, int i3) throws XmlPullParserException, Resources.NotFoundException, IllegalArgumentException {
        AiRow(appState, aiUiExtras, aiItem, function0, list, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AskCard$lambda$1(AiUiExtras aiUiExtras, AiItem.Ask ask, AiEvent.Ask ask2, Function1 function1, int i, Composer composer, int i2) {
        AskCard(aiUiExtras, ask, ask2, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatInput$lambda$1(String str, Function1 function1, boolean z, Function0 function0, Function0 function02, Function0 function03, int i, Composer composer, int i2) {
        ChatInput(str, function1, z, function0, function02, function03, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmptyChat$lambda$1(Function1 function1, int i, Composer composer, int i2) {
        EmptyChat(function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ErrorRow$lambda$4(String str, Function0 function0, int i, Composer composer, int i2) {
        ErrorRow(str, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PermissionPanel$lambda$19(AppState appState, AiUiExtras aiUiExtras, int i, Function1 function1, Function0 function0, int i2, Composer composer, int i3) {
        PermissionPanel(appState, aiUiExtras, i, function1, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ThinkFold$lambda$4(String str, int i, Composer composer, int i2) {
        ThinkFold(str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ToolIcon_ziNgDLE$lambda$0(String str, float f, int i, Composer composer, int i2) throws XmlPullParserException, Resources.NotFoundException, IllegalArgumentException {
        m7716ToolIconziNgDLE(str, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ToolLine$lambda$1(AiItem.Tool tool, int i, Composer composer, int i2) throws XmlPullParserException, Resources.NotFoundException, IllegalArgumentException {
        ToolLine(tool, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final AiUiExtras aiExtras(AppState $this$aiExtras) {
        Intrinsics.checkNotNullParameter($this$aiExtras, "<this>");
        LauncherUiApi api = $this$aiExtras.getApi();
        RepositoryUiApi repositoryUiApi = api instanceof RepositoryUiApi ? (RepositoryUiApi) api : null;
        return repositoryUiApi != null ? repositoryUiApi.getAi() : null;
    }

    public static final void AiPage(final AppState state, boolean compact, List<? extends AiItem> list, Composer $composer, final int $changed, final int i) {
        boolean z;
        Composer $composer2;
        final List initial;
        final boolean compact2;
        AiSession s;
        MutableState chats$delegate;
        MutableState model$delegate;
        MutableState model$delegate2;
        String str;
        MutableState input$delegate;
        final AiUiExtras ai;
        final MutableState chats$delegate2;
        AiSession s2;
        int $dirty;
        MutableState mutableState;
        final MutableState model$delegate3;
        final MutableState models$delegate;
        final MutableIntState perm$delegate;
        List initial2;
        AppState state2 = state;
        List initial3 = list;
        Intrinsics.checkNotNullParameter(state2, "state");
        Composer $composer3 = $composer.startRestartGroup(1830401609);
        ComposerKt.sourceInformation($composer3, "C(AiPage)P(2)70@2907L36,72@2983L59,73@3061L45,74@3124L31,75@3172L33,76@3223L31,77@3275L34,86@3677L878,86@3656L899,154@7341L393,154@7322L412,183@8744L4594,183@8701L4637:AiPage.kt#vz4689");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= ($changed & 8) == 0 ? $composer3.changed(state2) : $composer3.changedInstance(state2) ? 4 : 2;
        }
        int i2 = i & 2;
        if (i2 != 0) {
            $dirty2 |= 48;
            z = compact;
        } else if (($changed & 48) == 0) {
            z = compact;
            $dirty2 |= $composer3.changed(z) ? 32 : 16;
        } else {
            z = compact;
        }
        int i3 = i & 4;
        if (i3 != 0) {
            $dirty2 |= 384;
        } else if (($changed & 384) == 0) {
            $dirty2 |= ($changed & 512) == 0 ? $composer3.changed(initial3) : $composer3.changedInstance(initial3) ? 256 : 128;
        }
        int $dirty3 = $dirty2;
        if (!$composer3.shouldExecute(($dirty3 & 147) != 146, $dirty3 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            initial = initial3;
            compact2 = z;
        } else {
            boolean compact3 = i2 != 0 ? false : z;
            if (i3 != 0) {
                initial3 = CollectionsKt.emptyList();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1830401609, $dirty3, -1, "com.pymcl.android.ui.pages.AiPage (AiPage.kt:69)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, -1920641683, "CC(remember):AiPage.kt#9igjgp");
            boolean z2 = ($dirty3 & 14) == 4 || (($dirty3 & 8) != 0 && $composer3.changed(state2));
            Object objRememberedValue = $composer3.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objAiExtras = aiExtras(state2);
                $composer3.updateRememberedValue(objAiExtras);
                objRememberedValue = objAiExtras;
            }
            AiUiExtras ai2 = (AiUiExtras) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            AiSession s3 = AiSession.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer3, -1920639228, "CC(remember):AiPage.kt#9igjgp");
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue2 = objMutableStateOf$default;
            }
            MutableState chats$delegate3 = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -1920636746, "CC(remember):AiPage.kt#9igjgp");
            Object objRememberedValue3 = $composer3.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                s = s3;
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue3 = objMutableStateOf$default2;
            } else {
                s = s3;
            }
            MutableState models$delegate2 = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -1920634744, "CC(remember):AiPage.kt#9igjgp");
            Object objRememberedValue4 = $composer3.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default3);
                objRememberedValue4 = objMutableStateOf$default3;
            }
            MutableState model$delegate4 = (MutableState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -1920633206, "CC(remember):AiPage.kt#9igjgp");
            Object objRememberedValue5 = $composer3.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                Object objMutableIntStateOf = SnapshotIntStateKt.mutableIntStateOf(0);
                $composer3.updateRememberedValue(objMutableIntStateOf);
                objRememberedValue5 = objMutableIntStateOf;
            }
            MutableIntState perm$delegate2 = (MutableIntState) objRememberedValue5;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -1920631576, "CC(remember):AiPage.kt#9igjgp");
            Object objRememberedValue6 = $composer3.rememberedValue();
            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default4);
                objRememberedValue6 = objMutableStateOf$default4;
            }
            MutableState input$delegate2 = (MutableState) objRememberedValue6;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -1920629909, "CC(remember):AiPage.kt#9igjgp");
            Object objRememberedValue7 = $composer3.rememberedValue();
            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                chats$delegate = chats$delegate3;
                model$delegate = model$delegate4;
                model$delegate2 = null;
                Object objMutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default5);
                objRememberedValue7 = objMutableStateOf$default5;
            } else {
                chats$delegate = chats$delegate3;
                model$delegate = model$delegate4;
                model$delegate2 = null;
            }
            final MutableState showPerm$delegate = (MutableState) objRememberedValue7;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer3, -1920616201, "CC(remember):AiPage.kt#9igjgp");
            boolean zChangedInstance = (($dirty3 & User32.WM_PENWINFIRST) == 256 || (($dirty3 & 512) != 0 && $composer3.changedInstance(initial3))) | $composer3.changedInstance(ai2) | (($dirty3 & 14) == 4 || (($dirty3 & 8) != 0 && $composer3.changedInstance(state2)));
            Object objRememberedValue8 = $composer3.rememberedValue();
            if (zChangedInstance || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                List initial4 = initial3;
                MutableState model$delegate5 = model$delegate;
                str = "CC(remember):AiPage.kt#9igjgp";
                input$delegate = input$delegate2;
                ai = ai2;
                chats$delegate2 = chats$delegate;
                s2 = s;
                $dirty = $dirty3;
                mutableState = model$delegate2;
                AiPageKt$AiPage$1$1 aiPageKt$AiPage$1$1 = new AiPageKt$AiPage$1$1(initial4, s2, ai, state, chats$delegate2, model$delegate5, perm$delegate2, models$delegate2, null);
                model$delegate3 = model$delegate5;
                models$delegate = models$delegate2;
                perm$delegate = perm$delegate2;
                initial2 = initial4;
                state2 = state;
                objRememberedValue8 = aiPageKt$AiPage$1$1;
                $composer3.updateRememberedValue(objRememberedValue8);
            } else {
                initial2 = initial3;
                str = "CC(remember):AiPage.kt#9igjgp";
                models$delegate = models$delegate2;
                input$delegate = input$delegate2;
                perm$delegate = perm$delegate2;
                ai = ai2;
                chats$delegate2 = chats$delegate;
                s2 = s;
                $dirty = $dirty3;
                mutableState = model$delegate2;
                model$delegate3 = model$delegate;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue8, $composer3, 6);
            ComposerKt.sourceInformationMarkerStart($composer3, -1920499438, str);
            boolean zChangedInstance2 = $composer3.changedInstance(ai) | (($dirty & 14) == 4 || (($dirty & 8) != 0 && $composer3.changedInstance(state2)));
            Object objRememberedValue9 = $composer3.rememberedValue();
            if (zChangedInstance2 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                MutableState chats$delegate4 = chats$delegate2;
                AiUiExtras ai3 = ai;
                ai = ai3;
                chats$delegate2 = chats$delegate4;
                Object obj = (Function2) new AiPageKt$AiPage$2$1(ai3, s2, state2, chats$delegate4, null);
                $composer3.updateRememberedValue(obj);
                objRememberedValue9 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(ai, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue9, $composer3, 0);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, mutableState);
            final AiSession s4 = s2;
            final boolean compact4 = compact3;
            final MutableState input$delegate3 = input$delegate;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1121959455, true, new Function3() { // from class: com.pymcl.android.ui.pages.AiPageKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return AiPageKt.AiPage$lambda$25(compact4, state, ai, s4, chats$delegate2, models$delegate, model$delegate3, perm$delegate, showPerm$delegate, input$delegate3, (BoxWithConstraintsScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54);
            $composer2 = $composer3;
            BoxWithConstraintsKt.BoxWithConstraints(modifierFillMaxSize$default, null, false, composableLambdaRememberComposableLambda, $composer2, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            compact2 = compact3;
            initial = initial2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.pages.AiPageKt$$ExternalSyntheticLambda25
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return AiPageKt.AiPage$lambda$26(state, compact2, initial, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final List<ChatSummary> AiPage$lambda$2(MutableState<List<ChatSummary>> mutableState) {
        return mutableState.getValue();
    }

    private static final List<String> AiPage$lambda$5(MutableState<List<String>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String AiPage$lambda$8(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final int AiPage$lambda$11(MutableIntState $perm$delegate) {
        return $perm$delegate.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String AiPage$lambda$14(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean AiPage$lambda$17(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void AiPage$lambda$18(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object AiPage$reloadChats(com.pymcl.android.data.AiUiExtras r8, com.pymcl.android.ui.state.AppState r9, androidx.compose.runtime.MutableState<java.util.List<com.pymcl.android.ui.state.ChatSummary>> r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.AiPageKt.AiPage$reloadChats(com.pymcl.android.data.AiUiExtras, com.pymcl.android.ui.state.AppState, androidx.compose.runtime.MutableState, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Type inference failed for: r3v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object AiPage$loadHistory(com.pymcl.android.data.AiUiExtras r6, com.pymcl.android.ui.pages.AiSession r7, java.lang.String r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            boolean r0 = r9 instanceof com.pymcl.android.ui.pages.AiPageKt$AiPage$loadHistory$1
            if (r0 == 0) goto L14
            r0 = r9
            com.pymcl.android.ui.pages.AiPageKt$AiPage$loadHistory$1 r0 = (com.pymcl.android.ui.pages.AiPageKt$AiPage$loadHistory$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.pymcl.android.ui.pages.AiPageKt$AiPage$loadHistory$1 r0 = new com.pymcl.android.ui.pages.AiPageKt$AiPage$loadHistory$1
            r0.<init>(r9)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L47;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            r2 = 0
            java.lang.Object r3 = r0.L$3
            androidx.compose.runtime.snapshots.SnapshotStateList r3 = (androidx.compose.runtime.snapshots.SnapshotStateList) r3
            java.lang.Object r4 = r0.L$2
            r8 = r4
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r4 = r0.L$1
            r7 = r4
            com.pymcl.android.ui.pages.AiSession r7 = (com.pymcl.android.ui.pages.AiSession) r7
            java.lang.Object r4 = r0.L$0
            r6 = r4
            com.pymcl.android.data.AiUiExtras r6 = (com.pymcl.android.data.AiUiExtras) r6
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Throwable -> L45
            r5 = r1
            goto L85
        L45:
            r2 = move-exception
            goto L8c
        L47:
            kotlin.ResultKt.throwOnFailure(r1)
            if (r6 != 0) goto L4f
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L4f:
            androidx.compose.runtime.snapshots.SnapshotStateList r3 = r7.getItems()
            r3.clear()
            androidx.compose.runtime.snapshots.SnapshotStateMap r3 = r7.getAsks()
            r3.clear()
            if (r8 == 0) goto La6
            androidx.compose.runtime.snapshots.SnapshotStateList r3 = r7.getItems()
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L45
            r4 = 0
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)     // Catch: java.lang.Throwable -> L45
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L45
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)     // Catch: java.lang.Throwable -> L45
            r0.L$1 = r5     // Catch: java.lang.Throwable -> L45
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)     // Catch: java.lang.Throwable -> L45
            r0.L$2 = r5     // Catch: java.lang.Throwable -> L45
            r0.L$3 = r3     // Catch: java.lang.Throwable -> L45
            r5 = 1
            r0.label = r5     // Catch: java.lang.Throwable -> L45
            java.lang.Object r5 = r6.history(r8, r0)     // Catch: java.lang.Throwable -> L45
            if (r5 != r2) goto L84
            return r2
        L84:
            r2 = r4
        L85:
            java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Throwable -> L45
            java.lang.Object r2 = kotlin.Result.m8116constructorimpl(r5)     // Catch: java.lang.Throwable -> L45
            goto L96
        L8c:
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE
            java.lang.Object r2 = kotlin.ResultKt.createFailure(r2)
            java.lang.Object r2 = kotlin.Result.m8116constructorimpl(r2)
        L96:
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
            boolean r5 = kotlin.Result.m8122isFailureimpl(r2)
            if (r5 == 0) goto La1
            r2 = r4
        La1:
            java.util.Collection r2 = (java.util.Collection) r2
            r3.addAll(r2)
        La6:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.AiPageKt.AiPage$loadHistory(com.pymcl.android.data.AiUiExtras, com.pymcl.android.ui.pages.AiSession, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private static final Job AiPage$refreshModels(AppState $state, AiUiExtras ai, MutableState<String> mutableState, MutableState<List<String>> mutableState2, boolean toast) {
        return $state.launch(new AiPageKt$AiPage$refreshModels$1(ai, $state, toast, mutableState, mutableState2, null));
    }

    private static final Job AiPage$setModel(AppState $state, AiUiExtras ai, MutableState<String> mutableState, String m) {
        return $state.launch(new AiPageKt$AiPage$setModel$1(ai, m, $state, mutableState, null));
    }

    private static final Job AiPage$setPerm(AppState $state, AiUiExtras ai, MutableIntState perm$delegate, int i) {
        return $state.launch(new AiPageKt$AiPage$setPerm$1(i, ai, perm$delegate, $state, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AiPage$runFlow(AiUiExtras ai, AiSession s, AppState $state, MutableState<List<ChatSummary>> mutableState, Flow<? extends AiEvent> flow) {
        if (ai == null) {
            return;
        }
        s.setRunning(true);
        $state.launch(new AiPageKt$AiPage$runFlow$1(flow, s, ai, ai, $state, mutableState, null));
    }

    static /* synthetic */ void AiPage$send$default(AiSession aiSession, AiUiExtras aiUiExtras, AppState appState, MutableState mutableState, MutableState mutableState2, String str, String str2, int i, Object obj) {
        if ((i & 64) != 0) {
            str2 = null;
        }
        AiPage$send(aiSession, aiUiExtras, appState, mutableState, mutableState2, str, str2);
    }

    private static final void AiPage$send(AiSession s, AiUiExtras ai, AppState $state, MutableState<String> mutableState, MutableState<List<ChatSummary>> mutableState2, String text, String hidden) {
        if (StringsKt.isBlank(text)) {
            return;
        }
        if (s.getRunning()) {
            if (!(ai != null && ai.steer(text))) {
                $state.toast("上一条还在处理", "等它说完，或点「停止」再发", "info");
                return;
            }
            s.upsert(new AiItem.User("steer-" + System.nanoTime(), text));
            $state.toast("已插队", "这句话会立刻交给正在运行的助手", "info");
            mutableState.setValue("");
            return;
        }
        s.upsert(new AiItem.User("u" + System.nanoTime(), text));
        mutableState.setValue("");
        if (ai == null) {
            s.setRunning(true);
            $state.launch(new AiPageKt$AiPage$send$1($state, text, s, null));
        } else {
            AiPage$runFlow(ai, s, $state, mutableState2, ai.send(text, s.getActiveChat(), hidden));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AiPage$stop(AiUiExtras ai, AiSession s) {
        if (ai != null) {
            ai.stop();
        }
        if (ai == null) {
            s.setRunning(false);
        }
    }

    private static final Job AiPage$rewind(AppState $state, AiUiExtras ai, AiSession s, MutableState<String> mutableState, MutableState<List<ChatSummary>> mutableState2) {
        return $state.launch(new AiPageKt$AiPage$rewind$1(ai, s, $state, mutableState, mutableState2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AiPage$retry(AiSession s, AppState $state, AiUiExtras ai, MutableState<String> mutableState, MutableState<List<ChatSummary>> mutableState2) {
        Object objPrevious;
        if (s.getRunning()) {
            $state.toast("上一条还在处理", "等它说完，或点「停止」再发", "info");
            return;
        }
        List items = s.getItems();
        ListIterator listIterator = items.listIterator(items.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (((AiItem) objPrevious) instanceof AiItem.User) {
                    break;
                }
            }
        }
        AiItem aiItem = (AiItem) objPrevious;
        if (aiItem != null) {
            AiPage$send$default(s, ai, $state, mutableState, mutableState2, ((AiItem.User) aiItem).getText(), null, 64, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0e4f  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0e5f  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0ebd  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0ecd  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0f1b  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0f29  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x1127  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x11ad  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x12e6  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x1320  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x132e  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x1362  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x139c  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x13d2  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x1429  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit AiPage$lambda$25(boolean r157, com.pymcl.android.ui.state.AppState r158, com.pymcl.android.data.AiUiExtras r159, final com.pymcl.android.ui.pages.AiSession r160, final androidx.compose.runtime.MutableState r161, final androidx.compose.runtime.MutableState r162, androidx.compose.runtime.MutableState r163, androidx.compose.runtime.MutableIntState r164, androidx.compose.runtime.MutableState r165, final androidx.compose.runtime.MutableState r166, androidx.compose.foundation.layout.BoxWithConstraintsScope r167, androidx.compose.runtime.Composer r168, int r169) {
        /*
            Method dump skipped, instructions count: 5177
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.AiPageKt.AiPage$lambda$25(boolean, com.pymcl.android.ui.state.AppState, com.pymcl.android.data.AiUiExtras, com.pymcl.android.ui.pages.AiSession, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableIntState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.BoxWithConstraintsScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiPage$lambda$25$0$0$0$0(AppState $state, AiSession $s, AiUiExtras $ai, MutableState $chats$delegate) {
        $state.launch(new AiPageKt$AiPage$3$1$1$1$1$1($s, $state, $ai, $chats$delegate, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiPage$lambda$25$0$0$1$0$0$0(ChatSummary $ch, AiSession $s, AppState $state, AiUiExtras $ai) {
        if (Intrinsics.areEqual($ch.getId(), $s.getActiveChat())) {
            return Unit.INSTANCE;
        }
        $state.launch(new AiPageKt$AiPage$3$1$1$2$1$1$1$1($s, $state, $ai, $ch, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiPage$lambda$25$0$0$1$0$1$1$0(final AppState $state, final ChatSummary $ch, final AiUiExtras $ai, final AiSession $s, final MutableState $chats$delegate) {
        $state.open(new DialogSpec.Confirm("删除这个对话", $ch.getTitle(), "删除", true, false, new Function0() { // from class: com.pymcl.android.ui.pages.AiPageKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AiPageKt.AiPage$lambda$25$0$0$1$0$1$1$0$0($state, $ai, $ch, $s, $chats$delegate);
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiPage$lambda$25$0$0$1$0$1$1$0$0(AppState $state, AiUiExtras $ai, ChatSummary $ch, AiSession $s, MutableState $chats$delegate) {
        $state.launch(new AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1($ai, $ch, $s, $state, $chats$delegate, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiPage$lambda$25$0$1$0$2$0(List $opts, AppState $state, AiUiExtras $ai, MutableState $model$delegate, int it) {
        AiPage$setModel($state, $ai, $model$delegate, (String) $opts.get(it));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiPage$lambda$25$0$1$0$3$0(AppState $state, AiUiExtras $ai, MutableState $model$delegate, MutableState $models$delegate) {
        AiPage$refreshModels($state, $ai, $model$delegate, $models$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiPage$lambda$25$0$1$0$4$0(AppState $state, AiUiExtras $ai, MutableIntState $perm$delegate, int it) {
        AiPage$setPerm($state, $ai, $perm$delegate, it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiPage$lambda$25$0$1$0$5$0(AiUiExtras $ai, AppState $state, MutableState $showPerm$delegate) {
        if ($ai != null) {
            AiPage$lambda$18($showPerm$delegate, true);
        } else {
            $state.open(DialogSpec.AiPermission.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiPage$lambda$25$0$1$2$0$0(AiSession $s, AiUiExtras $ai, AppState $state, MutableState $input$delegate, MutableState $chats$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AiPage$send$default($s, $ai, $state, $input$delegate, $chats$delegate, it, null, 64, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiPage$lambda$25$0$1$2$1$0(final AiSession $s, final AppState $state, final AiUiExtras $ai, final MutableState $input$delegate, final MutableState $chats$delegate, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final List items = $s.getItems();
        final Function1 function1 = new Function1() { // from class: com.pymcl.android.ui.pages.AiPageKt$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AiPageKt.AiPage$lambda$25$0$1$2$1$0$0((AiItem) obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: com.pymcl.android.ui.pages.AiPageKt$AiPage$lambda$25$0$1$2$1$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((AiItem) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(AiItem aiItem) {
                return null;
            }
        };
        LazyColumn.items(items.size(), new Function1<Integer, Object>() { // from class: com.pymcl.android.ui.pages.AiPageKt$AiPage$lambda$25$0$1$2$1$0$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke(items.get(index));
            }
        }, new Function1<Integer, Object>() { // from class: com.pymcl.android.ui.pages.AiPageKt$AiPage$lambda$25$0$1$2$1$0$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function12.invoke(items.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.pymcl.android.ui.pages.AiPageKt$AiPage$lambda$25$0$1$2$1$0$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) throws XmlPullParserException, Resources.NotFoundException, IllegalArgumentException {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) throws XmlPullParserException, Resources.NotFoundException, IllegalArgumentException {
                ComposerKt.sourceInformation($composer, "C178@8826L22:LazyDsl.kt#428nma");
                int $dirty = $changed;
                if (($changed & 6) == 0) {
                    $dirty |= $composer.changed($this$items) ? 4 : 2;
                }
                if (($changed & 48) == 0) {
                    $dirty |= $composer.changed(it) ? 32 : 16;
                }
                if (!$composer.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
                    $composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, $dirty, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                int i = $dirty & 14;
                AiItem aiItem = (AiItem) items.get(it);
                $composer.startReplaceGroup(1502885745);
                ComposerKt.sourceInformation($composer, "C*240@12902L11,240@12869L45:AiPage.kt#vz4689");
                AppState appState = $state;
                AiUiExtras aiUiExtras = $ai;
                ComposerKt.sourceInformationMarkerStart($composer, 879765200, "CC(remember):AiPage.kt#9igjgp");
                boolean zChangedInstance = $composer.changedInstance($state) | $composer.changedInstance($ai);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final AiSession aiSession = $s;
                    final AppState appState2 = $state;
                    final AiUiExtras aiUiExtras2 = $ai;
                    final MutableState mutableState = $input$delegate;
                    final MutableState mutableState2 = $chats$delegate;
                    Object obj = (Function0) new Function0<Unit>() { // from class: com.pymcl.android.ui.pages.AiPageKt$AiPage$3$1$2$3$2$1$2$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            AiPageKt.AiPage$retry(aiSession, appState2, aiUiExtras2, mutableState, mutableState2);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                AiPageKt.AiRow(appState, aiUiExtras, aiItem, (Function0) objRememberedValue, null, $composer, AppState.$stable | ((i << 3) & User32.WM_PENWINFIRST), 16);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        if ($s.getRunning() && (CollectionsKt.lastOrNull((List) $s.getItems()) instanceof AiItem.User)) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$AiPageKt.INSTANCE.getLambda$101157331$PyMCL_Android_app_debug(), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object AiPage$lambda$25$0$1$2$1$0$0(AiItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getId() + Reflection.getOrCreateKotlinClass(it.getClass()).getSimpleName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiPage$lambda$25$0$1$2$2$0(AppState $state, AiUiExtras $ai, MutableIntState $perm$delegate, int it) {
        AiPage$setPerm($state, $ai, $perm$delegate, it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiPage$lambda$25$0$1$2$3$0(MutableState $showPerm$delegate) {
        AiPage$lambda$18($showPerm$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiPage$lambda$25$0$1$3$0(MutableState $input$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $input$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiPage$lambda$25$0$1$4$0(MutableState $input$delegate, AiSession $s, AiUiExtras $ai, AppState $state, MutableState $chats$delegate) {
        AiPage$send$default($s, $ai, $state, $input$delegate, $chats$delegate, AiPage$lambda$14($input$delegate), null, 64, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiPage$lambda$25$0$1$5$0(AiUiExtras $ai, AiSession $s) {
        AiPage$stop($ai, $s);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiPage$lambda$25$0$1$6$0(AppState $state, AiUiExtras $ai, AiSession $s, MutableState $input$delegate, MutableState $chats$delegate) {
        AiPage$rewind($state, $ai, $s, $input$delegate, $chats$delegate);
        return Unit.INSTANCE;
    }

    private static final void EmptyChat(final Function1<? super String, Unit> function1, Composer $composer, final int $changed) {
        Composer $composer2;
        Function0 function0;
        Function0 function02;
        Function0 function03;
        Composer $composer3;
        Composer $composer4 = $composer.startRestartGroup(-1799787108);
        ComposerKt.sourceInformation($composer4, "C(EmptyChat)253@13453L21,253@13408L1156:AiPage.kt#vz4689");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer4.changedInstance(function1) ? 4 : 2;
        }
        if ($composer4.shouldExecute(($dirty & 3) != 2, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1799787108, $dirty, -1, "com.pymcl.android.ui.pages.EmptyChat (AiPage.kt:252)");
            }
            Modifier modifierM738padding3ABfNKs = PaddingKt.m738padding3ABfNKs(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, $composer4, 0, 1), false, null, false, 14, null), Dp.m7018constructorimpl(24));
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Arrangement.Vertical center = Arrangement.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer4, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, $composer4, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer4, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer4.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer4, modifierM738padding3ABfNKs);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((432 << 3) & 112) << 6) & User32.WM_PENWINFIRST) | 6;
            int $dirty2 = $dirty;
            String str = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
            ComposerKt.sourceInformationMarkerStart($composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!($composer4.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer4.startReusableNode();
            if ($composer4.getInserting()) {
                function0 = constructor;
                $composer4.createNode(function0);
            } else {
                function0 = constructor;
                $composer4.useNode();
            }
            Composer composerM3832constructorimpl = Updater.m3832constructorimpl($composer4);
            Updater.m3839setimpl(composerM3832constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3839setimpl(composerM3832constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3832constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3832constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3832constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3832constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3839setimpl(composerM3832constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            Composer composer = $composer4;
            ComposerKt.sourceInformationMarkerStart(composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i3 = ((432 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer, -33389925, "C254@13667L6,254@13596L201,255@13806L30,255@13838L11,256@13858L110,257@13977L30:AiPage.kt#vz4689");
            Modifier modifierBackground$default = BackgroundKt.background$default(ClipKt.clip(SizeKt.m785size3ABfNKs(Modifier.INSTANCE, Dp.m7018constructorimpl(52)), RoundedCornerShapeKt.m1032RoundedCornerShape0680j_4(Dp.m7018constructorimpl(14))), Py.INSTANCE.getColors(composer, 6).getLogoBrush(), null, 0.0f, 6, null);
            Alignment center2 = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierBackground$default);
            Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = ((((48 << 3) & 112) << 6) & User32.WM_PENWINFIRST) | 6;
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                function02 = constructor2;
                composer.createNode(function02);
            } else {
                function02 = constructor2;
                composer.useNode();
            }
            Composer composerM3832constructorimpl2 = Updater.m3832constructorimpl(composer);
            Updater.m3839setimpl(composerM3832constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3839setimpl(composerM3832constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3832constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3832constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM3832constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3832constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3839setimpl(composerM3832constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = (i4 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart(composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i6 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer, 455112349, "C254@13781L6,254@13725L70:AiPage.kt#vz4689");
            IconKt.m2300Iconww6aTOc(Ico.INSTANCE.getSparkle(), (String) null, SizeKt.m785size3ABfNKs(Modifier.INSTANCE, Dp.m7018constructorimpl(26)), Py.INSTANCE.getColors(composer, 6).m7978getOnLogo0d7_KjU(), composer, 432, 0);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            SpacerKt.Spacer(SizeKt.m771height3ABfNKs(Modifier.INSTANCE, Dp.m7018constructorimpl(10)), composer, 6);
            UiKt.H2("问点什么吧", null, false, composer, 6, 6);
            UiKt.Muted("「下一款 1.20.1 Fabric」「装钠和光影」「启动闪退了帮我看看」——写操作前会先弹确认。", SizeKt.m792widthInVpY3zN4$default(PaddingKt.m742paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7018constructorimpl(4), 0.0f, 0.0f, 13, null), 0.0f, Dp.m7018constructorimpl(520), 1, null), false, 0, composer, 54, 12);
            SpacerKt.Spacer(SizeKt.m771height3ABfNKs(Modifier.INSTANCE, Dp.m7018constructorimpl(16)), composer, 6);
            List listListOf = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("下个最新版", "帮我下载最新正式版 Minecraft"), TuplesKt.to("装 Fabric + 钠", "给我装 1.20.1 Fabric，再装钠和 Iris 光影"), TuplesKt.to("崩溃分析", "刚才启动失败了，读一下日志告诉我原因"), TuplesKt.to("扫模组冲突", "扫一下当前实例的模组冲突")});
            composer.startReplaceGroup(-1663626077);
            ComposerKt.sourceInformation(composer, "*260@14238L310");
            Iterable iterableChunked = CollectionsKt.chunked(listListOf, 2);
            int i7 = 0;
            Iterator it = iterableChunked.iterator();
            while (it.hasNext()) {
                Iterable iterable = (List) it.next();
                List list = listListOf;
                Iterable iterable2 = iterableChunked;
                Composer composer2 = composer;
                int i8 = i7;
                Iterator it2 = it;
                Modifier modifierM742paddingqDBjuR0$default = PaddingKt.m742paddingqDBjuR0$default(SizeKt.m792widthInVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m7018constructorimpl(User32.WM_MDISETMENU), 1, null), 0.0f, 0.0f, 0.0f, Dp.m7018constructorimpl(8), 7, null);
                Arrangement.Horizontal horizontalM619spacedBy0680j_4 = Arrangement.INSTANCE.m619spacedBy0680j_4(Dp.m7018constructorimpl(8));
                ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalM619spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer2, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierM742paddingqDBjuR0$default);
                Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                int i9 = ((((54 << 3) & 112) << 6) & User32.WM_PENWINFIRST) | 6;
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    function03 = constructor3;
                    composer2.createNode(function03);
                } else {
                    function03 = constructor3;
                    composer2.useNode();
                }
                String str2 = str;
                Composer composerM3832constructorimpl3 = Updater.m3832constructorimpl(composer2);
                Updater.m3839setimpl(composerM3832constructorimpl3, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3839setimpl(composerM3832constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3832constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3832constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM3832constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM3832constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m3839setimpl(composerM3832constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                int i10 = (i9 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                int i11 = ((54 >> 6) & 112) | 6;
                RowScope rowScope = RowScopeInstance.INSTANCE;
                Composer composer3 = composer2;
                ComposerKt.sourceInformationMarkerStart(composer3, -683516721, "C:AiPage.kt#vz4689");
                composer3.startReplaceGroup(-1546069456);
                ComposerKt.sourceInformation(composer3, "*262@14464L17,262@14483L33,262@14411L105");
                Iterable<Pair> iterable3 = iterable;
                int i12 = 0;
                for (Pair pair : iterable3) {
                    Iterable iterable4 = iterable3;
                    final String str3 = (String) pair.component1();
                    int i13 = i12;
                    final String str4 = (String) pair.component2();
                    Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
                    Modifier modifier = modifierMaterializeModifier3;
                    int i14 = i11;
                    float fM7018constructorimpl = Dp.m7018constructorimpl(12);
                    ComposerKt.sourceInformationMarkerStart(composer3, 947919063, "CC(remember):AiPage.kt#9igjgp");
                    boolean zChanged = (($dirty2 & 14) == 4) | $composer4.changed(str4);
                    Composer composer4 = composer3;
                    Object objRememberedValue = composer4.rememberedValue();
                    if (zChanged) {
                        $composer3 = $composer4;
                    } else {
                        $composer3 = $composer4;
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        Composer composer5 = composer3;
                        UiKt.m7594CardDzVHIIc(modifierWeight$default, fM7018constructorimpl, (Function0) objRememberedValue, ComposableLambdaKt.rememberComposableLambda(-389932746, true, new Function3() { // from class: com.pymcl.android.ui.pages.AiPageKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                return AiPageKt.EmptyChat$lambda$0$1$0$0$1(str3, str4, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                            }
                        }, composer3, 54), composer5, GL11.GL_INDEX_MODE, 0);
                        composer3 = composer5;
                        iterable3 = iterable4;
                        i12 = i13;
                        modifierMaterializeModifier3 = modifier;
                        i11 = i14;
                        $composer4 = $composer3;
                    }
                    Object obj = new Function0() { // from class: com.pymcl.android.ui.pages.AiPageKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AiPageKt.EmptyChat$lambda$0$1$0$0$0$0(function1, str4);
                        }
                    };
                    composer4.updateRememberedValue(obj);
                    objRememberedValue = obj;
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    Composer composer52 = composer3;
                    UiKt.m7594CardDzVHIIc(modifierWeight$default, fM7018constructorimpl, (Function0) objRememberedValue, ComposableLambdaKt.rememberComposableLambda(-389932746, true, new Function3() { // from class: com.pymcl.android.ui.pages.AiPageKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj2, Object obj22, Object obj3) {
                            return AiPageKt.EmptyChat$lambda$0$1$0$0$1(str3, str4, (ColumnScope) obj2, (Composer) obj22, ((Integer) obj3).intValue());
                        }
                    }, composer3, 54), composer52, GL11.GL_INDEX_MODE, 0);
                    composer3 = composer52;
                    iterable3 = iterable4;
                    i12 = i13;
                    modifierMaterializeModifier3 = modifier;
                    i11 = i14;
                    $composer4 = $composer3;
                }
                Composer composer6 = composer3;
                composer6.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer6);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                listListOf = list;
                i7 = i8;
                it = it2;
                iterableChunked = iterable2;
                composer = composer2;
                str = str2;
            }
            $composer2 = $composer4;
            Composer composer7 = composer;
            composer7.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer7);
            ComposerKt.sourceInformationMarkerEnd(composer);
            $composer4.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerEnd($composer4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer4;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.pages.AiPageKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return AiPageKt.EmptyChat$lambda$1(function1, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmptyChat$lambda$0$1$0$0$0$0(Function1 $onPick, String $p) {
        $onPick.invoke(I18nKt.tr($p, new Object[0]));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmptyChat$lambda$0$1$0$0$1(String $t, String $p, ColumnScope Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C262@14485L5,262@14492L22:AiPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-389932746, $changed, -1, "com.pymcl.android.ui.pages.EmptyChat.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AiPage.kt:262)");
            }
            UiKt.H3($t, null, false, $composer, 0, 6);
            UiKt.Muted($p, null, false, 2, $composer, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final void AiItemView(AppState state, AiItem it, List<AiItem> items, Composer $composer, final int $changed) throws XmlPullParserException, Resources.NotFoundException, IllegalArgumentException {
        final AppState state2;
        final AiItem it2;
        final List items2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNullParameter(items, "items");
        Composer $composer2 = $composer.startRestartGroup(955038543);
        ComposerKt.sourceInformation($composer2, "C(AiItemView)P(2)272@14747L2,272@14702L63:AiPage.kt#vz4689");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= ($changed & 8) == 0 ? $composer2.changed(state) : $composer2.changedInstance(state) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= ($changed & 64) == 0 ? $composer2.changed(it) : $composer2.changedInstance(it) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= ($changed & 512) == 0 ? $composer2.changed(items) : $composer2.changedInstance(items) ? 256 : 128;
        }
        if (!$composer2.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
            state2 = state;
            it2 = it;
            items2 = items;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(955038543, $dirty, -1, "com.pymcl.android.ui.pages.AiItemView (AiPage.kt:271)");
            }
            AiUiExtras aiUiExtrasAiExtras = aiExtras(state);
            ComposerKt.sourceInformationMarkerStart($composer2, -1330957583, "CC(remember):AiPage.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.pymcl.android.ui.pages.AiPageKt$$ExternalSyntheticLambda42
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                $composer2.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            state2 = state;
            it2 = it;
            items2 = items;
            AiRow(state2, aiUiExtrasAiExtras, it2, (Function0) objRememberedValue, items2, $composer2, AppState.$stable | 3072 | ($dirty & 14) | (($dirty << 3) & User32.WM_PENWINFIRST) | (57344 & ($dirty << 6)), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.pages.AiPageKt$$ExternalSyntheticLambda43
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return AiPageKt.AiItemView$lambda$1(state2, it2, items2, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x077c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x078f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x079d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x07e3  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x07fe A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AiRow(final com.pymcl.android.ui.state.AppState r89, final com.pymcl.android.data.AiUiExtras r90, final com.pymcl.android.ui.state.AiItem r91, final kotlin.jvm.functions.Function0<kotlin.Unit> r92, java.util.List<com.pymcl.android.ui.state.AiItem> r93, androidx.compose.runtime.Composer r94, final int r95, final int r96) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 3081
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.AiPageKt.AiRow(com.pymcl.android.ui.state.AppState, com.pymcl.android.data.AiUiExtras, com.pymcl.android.ui.state.AiItem, kotlin.jvm.functions.Function0, java.util.List, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final void AiRow$replace(List<AiItem> list, AiItem $it, AiItem aiItem) {
        List list2 = list == null ? AiSession.INSTANCE.getItems() : list;
        int i = 0;
        Iterator<AiItem> it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                AiItem aiItem2 = (AiItem) it.next();
                if (Intrinsics.areEqual(aiItem2.getId(), $it.getId()) && aiItem2.getClass() == $it.getClass()) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        if (i >= 0) {
            list2.set(i, aiItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiRow$lambda$1$0(AiItem $it, PyColors $c, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C285@15330L189:AiPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1102961455, $changed, -1, "com.pymcl.android.ui.pages.AiRow.<anonymous>.<anonymous> (AiPage.kt:285)");
            }
            TextKt.m2843Text4IGK_g(((AiItem.User) $it).getText(), PaddingKt.m739paddingVpY3zN4(BackgroundKt.m247backgroundbw27NRU$default(ClipKt.clip(SizeKt.m792widthInVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m7018constructorimpl(520), 1, null), RoundedCornerShapeKt.m1033RoundedCornerShapea9UjIt4(Dp.m7018constructorimpl(12), Dp.m7018constructorimpl(4), Dp.m7018constructorimpl(12), Dp.m7018constructorimpl(12))), $c.m7954getAccentStrong0d7_KjU(), null, 2, null), Dp.m7018constructorimpl(12), Dp.m7018constructorimpl(8)), $c.m7976getOnAccentStrong0d7_KjU(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3072, 0, 131056);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiRow$lambda$2$1$0(AiItem $it, PyColors $c, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C290@15964L99:AiPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(451614331, $changed, -1, "com.pymcl.android.ui.pages.AiRow.<anonymous>.<anonymous>.<anonymous> (AiPage.kt:290)");
            }
            TextKt.m2843Text4IGK_g(((AiItem.Assistant) $it).getText() + (((AiItem.Assistant) $it).getStreaming() ? " ▍" : ""), (Modifier) null, $c.m7967getInk0d7_KjU(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(20), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3072, 6, 130034);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiRow$lambda$2$1$1$0$0(ClipboardManager $clip, AiItem $it, AppState $state) {
        $clip.setText(new AnnotatedString(((AiItem.Assistant) $it).getText(), null, 2, null));
        AppState.toast$default($state, "已复制", null, null, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiRow$lambda$2$1$1$1$0(Function0 $onRetry) {
        $onRetry.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiRow$lambda$4(AiItem $it, PyColors $c, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C303@16851L8,*305@16918L336:AiPage.kt#vz4689");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1372711681, $changed, -1, "com.pymcl.android.ui.pages.AiRow.<anonymous> (AiPage.kt:303)");
            }
            UiKt.H3("计划", null, false, $composer, 6, 6);
            Iterable steps = ((AiItem.Plan) $it).getSteps();
            int i = 0;
            Iterator it = steps.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                String str = (String) pair.component1();
                String str2 = (String) pair.component2();
                Modifier modifierM742paddingqDBjuR0$default = PaddingKt.m742paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7018constructorimpl(4), 0.0f, 0.0f, 13, null);
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
                Iterable iterable = steps;
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM742paddingqDBjuR0$default);
                Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
                int i2 = i;
                int i3 = ((((390 << 3) & 112) << 6) & User32.WM_PENWINFIRST) | 6;
                Iterator it2 = it;
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
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                int i5 = ((390 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -1431339399, "C306@17022L89,307@17132L104:AiPage.kt#vz4689");
                UiKt.m7595DotiPRSM58(Intrinsics.areEqual(str2, "completed") ? $c.m7974getOk0d7_KjU() : Intrinsics.areEqual(str2, "in_progress") ? $c.m7987getWarn0d7_KjU() : $c.m7968getInkFaint0d7_KjU(), Dp.m7018constructorimpl(8), $composer, 48, 0);
                UiKt.m7603TxtuDo3WH8(str, PaddingKt.m742paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m7018constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null), true, Intrinsics.areEqual(str2, "completed") ? $c.m7969getInkMuted0d7_KjU() : $c.m7967getInk0d7_KjU(), 0, $composer, 432, 16);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                steps = iterable;
                i = i2;
                it = it2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x054b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit AiRow$lambda$5(final com.pymcl.android.ui.state.AiItem r50, final com.pymcl.android.data.AiUiExtras r51, final java.util.List r52, final com.pymcl.android.ui.state.AppState r53, androidx.compose.foundation.layout.ColumnScope r54, androidx.compose.runtime.Composer r55, int r56) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 1369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.AiPageKt.AiRow$lambda$5(com.pymcl.android.ui.state.AiItem, com.pymcl.android.data.AiUiExtras, java.util.List, com.pymcl.android.ui.state.AppState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    static /* synthetic */ void AiRow$lambda$5$1$act$default(AiUiExtras aiUiExtras, AiItem aiItem, AppState appState, List list, AiConfirmOutcome aiConfirmOutcome, boolean z, boolean z2, int i, Object obj) {
        if ((i & 32) != 0) {
            z = false;
        }
        if ((i & 64) != 0) {
            z2 = false;
        }
        AiRow$lambda$5$1$act(aiUiExtras, aiItem, appState, list, aiConfirmOutcome, z, z2);
    }

    private static final void AiRow$lambda$5$1$act(AiUiExtras $ai, AiItem $it, AppState $state, List<AiItem> list, AiConfirmOutcome o, boolean always, boolean global) {
        boolean delivered = $ai != null ? $ai.confirm(o.getOk(), always, global) : true;
        AiRow$replace(list, $it, AiItem.Confirm.copy$default((AiItem.Confirm) $it, null, null, null, false, (delivered ? o : AiConfirmOutcome.Expired).getLabel(), 15, null));
        if (!delivered) {
            $state.toast("这个确认已失效", "助手已不在等它；需要的话请重新发一次", "info");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiRow$lambda$5$1$0$0(AiUiExtras $ai, AiItem $it, AppState $state, List $local) {
        AiRow$lambda$5$1$act$default($ai, $it, $state, $local, AiConfirmOutcome.Allowed, false, false, 96, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiRow$lambda$5$1$1$0(AiUiExtras $ai, AiItem $it, AppState $state, List $local) {
        AiRow$lambda$5$1$act$default($ai, $it, $state, $local, AiConfirmOutcome.AlwaysInstance, true, false, 64, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiRow$lambda$5$1$2$0(AiUiExtras $ai, AiItem $it, AppState $state, List $local) {
        AiRow$lambda$5$1$act($ai, $it, $state, $local, AiConfirmOutcome.AlwaysGlobal, true, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiRow$lambda$5$1$3$0(AiUiExtras $ai, AiItem $it, AppState $state, List $local) {
        AiRow$lambda$5$1$act$default($ai, $it, $state, $local, AiConfirmOutcome.Denied, false, false, 96, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiRow$lambda$6$0(AiItem $it, List $local, String r) {
        Intrinsics.checkNotNullParameter(r, "r");
        AiRow$replace($local, $it, AiItem.Ask.copy$default((AiItem.Ask) $it, null, null, null, false, r, 15, null));
        return Unit.INSTANCE;
    }

    private static final void AskCard(final AiUiExtras ai, final AiItem.Ask item, final AiEvent.Ask full, final Function1<? super String, Unit> function1, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-24518799);
        ComposerKt.sourceInformation($composer2, "C(AskCard)P(!1,2)338@19379L1877,338@19325L1931:AiPage.kt#vz4689");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= ($changed & 8) == 0 ? $composer2.changed(ai) : $composer2.changedInstance(ai) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= ($changed & 64) == 0 ? $composer2.changed(item) : $composer2.changedInstance(item) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(full) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer2.changedInstance(function1) ? 2048 : 1024;
        }
        int $dirty2 = $dirty;
        if ($composer2.shouldExecute(($dirty2 & 1171) != 1170, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-24518799, $dirty2, -1, "com.pymcl.android.ui.pages.AskCard (AiPage.kt:337)");
            }
            UiKt.m7594CardDzVHIIc(SizeKt.m792widthInVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m7018constructorimpl(User32.WM_MDISETMENU), 1, null), Dp.m7018constructorimpl(12), null, ComposableLambdaKt.rememberComposableLambda(2028617697, true, new Function3() { // from class: com.pymcl.android.ui.pages.AiPageKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AiPageKt.AskCard$lambda$0(full, item, function1, ai, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, 3126, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.pages.AiPageKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AiPageKt.AskCard$lambda$1(ai, item, full, function1, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AskCard$lambda$0(AiEvent.Ask $full, AiItem.Ask $item, Function1 $onResolved, AiUiExtras $ai, ColumnScope Card, Composer $composer, int $changed) {
        final List<Pair> qs;
        Composer composer;
        String str;
        final Function1 function1;
        final AiUiExtras aiUiExtras;
        Object obj;
        boolean done;
        SnapshotStateMap sel;
        boolean z;
        String str2;
        Iterable questions;
        Composer composer2 = $composer;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation(composer2, "C342@19693L62,343@19776L57:AiPage.kt#vz4689");
        if (composer2.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2028617697, $changed, -1, "com.pymcl.android.ui.pages.AskCard.<anonymous> (AiPage.kt:339)");
            }
            if ($full == null || (questions = $full.getQuestions()) == null) {
                String question = $item.getQuestion();
                Iterable<String> options = $item.getOptions();
                Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(options, 10));
                for (String str3 : options) {
                    arrayList.add(TuplesKt.to(str3, str3));
                }
                qs = CollectionsKt.listOf(TuplesKt.to(new Triple("q0", question, (List) arrayList), Boolean.valueOf($item.getMulti())));
            } else {
                Iterable<AskQuestion> iterable = questions;
                int i = 0;
                Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (AskQuestion askQuestion : iterable) {
                    String id = askQuestion.getId();
                    String prompt = askQuestion.getPrompt();
                    Iterable options2 = askQuestion.getOptions();
                    Iterable iterable2 = iterable;
                    int i2 = i;
                    Collection arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(options2, 10));
                    Iterable<AskOption> iterable3 = options2;
                    for (AskOption askOption : iterable3) {
                        arrayList3.add(TuplesKt.to(askOption.getId(), askOption.getLabel()));
                        options2 = options2;
                        iterable3 = iterable3;
                    }
                    arrayList2.add(TuplesKt.to(new Triple(id, prompt, (List) arrayList3), Boolean.valueOf(askQuestion.getMulti())));
                    iterable = iterable2;
                    i = i2;
                }
                qs = (List) arrayList2;
            }
            if ($full == null || StringsKt.isBlank($full.getTitle())) {
                composer2.startReplaceGroup(65281953);
            } else {
                composer2.startReplaceGroup(-413536933);
                ComposerKt.sourceInformation(composer2, "341@19648L26");
                UiKt.H3($full.getTitle(), null, true, composer2, 384, 2);
            }
            composer2.endReplaceGroup();
            String id2 = $item.getId();
            String str4 = "CC(remember):AiPage.kt#9igjgp";
            ComposerKt.sourceInformationMarkerStart(composer2, -413535457, "CC(remember):AiPage.kt#9igjgp");
            boolean zChanged = composer2.changed(id2);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateMapOf = SnapshotStateKt.mutableStateMapOf();
                $composer.updateRememberedValue(objMutableStateMapOf);
                objRememberedValue = objMutableStateMapOf;
            }
            SnapshotStateMap sel2 = (SnapshotStateMap) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer2);
            String id3 = $item.getId();
            ComposerKt.sourceInformationMarkerStart(composer2, -413532806, "CC(remember):AiPage.kt#9igjgp");
            boolean zChanged2 = composer2.changed(id3);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateMapOf2 = SnapshotStateKt.mutableStateMapOf();
                $composer.updateRememberedValue(objMutableStateMapOf2);
                objRememberedValue2 = objMutableStateMapOf2;
            }
            final SnapshotStateMap other = (SnapshotStateMap) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composer2);
            boolean done2 = $item.getResolved() != null;
            composer2.startReplaceGroup(-413528673);
            ComposerKt.sourceInformation(composer2, "*347@19965L86,355@20458L23,355@20434L112");
            for (Pair pair : qs) {
                Triple triple = (Triple) pair.component1();
                boolean zBooleanValue = ((Boolean) pair.component2()).booleanValue();
                String str5 = (String) triple.component1();
                String str6 = (String) triple.component2();
                Iterable<Pair> iterable4 = (List) triple.component3();
                String str7 = str5;
                boolean done3 = done2;
                boolean z2 = zBooleanValue;
                UiKt.m7603TxtuDo3WH8(str6 + (zBooleanValue ? I18nKt.tr("（可多选）", new Object[0]) : ""), PaddingKt.m742paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7018constructorimpl(6), 0.0f, 0.0f, 13, null), true, 0L, 0, $composer, 432, 24);
                Composer composer3 = $composer;
                composer3.startReplaceGroup(-413523042);
                ComposerKt.sourceInformation(composer3, "*349@20172L235,349@20114L293");
                for (Pair pair2 : iterable4) {
                    final String str8 = (String) pair2.component1();
                    String str9 = (String) pair2.component2();
                    Set setEmptySet = (Set) sel2.get(str7);
                    if (setEmptySet == null) {
                        setEmptySet = SetsKt.emptySet();
                    }
                    boolean zContains = setEmptySet.contains(str8);
                    ComposerKt.sourceInformationMarkerStart(composer3, 913990828, str4);
                    boolean zChanged3 = composer3.changed(done3) | composer3.changed(sel2) | composer3.changed(str7) | composer3.changed(z2) | composer3.changed(str8);
                    Object objRememberedValue3 = $composer.rememberedValue();
                    if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        final String str10 = str7;
                        final boolean z3 = z2;
                        final SnapshotStateMap sel3 = sel2;
                        final boolean done4 = done3;
                        objRememberedValue3 = new Function1() { // from class: com.pymcl.android.ui.pages.AiPageKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return AiPageKt.AskCard$lambda$0$4$0$0$0(done4, sel3, str10, z3, str8, ((Boolean) obj2).booleanValue());
                            }
                        };
                        done = done4;
                        sel = sel3;
                        z = z3;
                        str2 = str10;
                        $composer.updateRememberedValue(objRememberedValue3);
                    } else {
                        str2 = str7;
                        z = z2;
                        done = done3;
                        sel = sel2;
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    UiKt.Check(str9, zContains, true, (Function1) objRememberedValue3, $composer, 384, 0);
                    sel2 = sel;
                    composer3 = $composer;
                    str7 = str2;
                    done3 = done;
                    z2 = z;
                }
                final String str11 = str7;
                Composer composer4 = composer3;
                boolean done5 = done3;
                SnapshotStateMap sel4 = sel2;
                composer4.endReplaceGroup();
                String str12 = (String) other.get(str11);
                String str13 = str12 == null ? "" : str12;
                ComposerKt.sourceInformationMarkerStart(composer4, 1794248465, str4);
                boolean zChanged4 = composer4.changed(other) | composer4.changed(str11);
                Object objRememberedValue4 = $composer.rememberedValue();
                if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function1() { // from class: com.pymcl.android.ui.pages.AiPageKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return AiPageKt.AskCard$lambda$0$4$1$0(other, str11, (String) obj3);
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                    objRememberedValue4 = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd(composer4);
                UiKt.m7599InputxAketlw(str13, (Function1) objRememberedValue4, "选「其它」时在这里填", PaddingKt.m740paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7018constructorimpl(4), 1, null), false, false, 0, 0, 0, 0, null, null, false, false, false, composer4, GL11.GL_AUTO_NORMAL, 0, 32752);
                composer2 = composer4;
                other = other;
                sel2 = sel4;
                done2 = done5;
                str4 = str4;
            }
            final SnapshotStateMap sel5 = sel2;
            boolean done6 = done2;
            String str14 = str4;
            final SnapshotStateMap sel6 = other;
            composer2.endReplaceGroup();
            if (done6) {
                composer2.startReplaceGroup(-413507198);
                ComposerKt.sourceInformation(composer2, "357@20575L97");
                String resolved = $item.getResolved();
                UiKt.Tag(Intrinsics.areEqual(resolved, "skip") ? "已跳过" : Intrinsics.areEqual(resolved, "expired") ? "已失效" : "已提交", TagTone.Neutral, false, composer2, 48, 4);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-413503179);
                ComposerKt.sourceInformation(composer2, "358@20686L564");
                Arrangement.Horizontal horizontalM619spacedBy0680j_4 = Arrangement.INSTANCE.m619spacedBy0680j_4(Dp.m7018constructorimpl(6));
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
                    $composer.createNode(constructor);
                } else {
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
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                int i5 = ((48 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -1623365441, "C359@20783L329,359@20756L356,364@21150L90,364@21125L115:AiPage.kt#vz4689");
                BtnKind btnKind = BtnKind.Primary;
                ComposerKt.sourceInformationMarkerStart($composer, -883649911, str14);
                boolean zChangedInstance = $composer.changedInstance(qs) | $composer.changed(sel5) | $composer.changed(sel6) | $composer.changed($onResolved) | $composer.changedInstance($ai);
                Object objRememberedValue5 = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    composer = $composer;
                    str = str14;
                    function1 = $onResolved;
                    aiUiExtras = $ai;
                    obj = new Function0() { // from class: com.pymcl.android.ui.pages.AiPageKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AiPageKt.AskCard$lambda$0$5$0$0(qs, function1, aiUiExtras, sel5, sel6);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                } else {
                    composer = $composer;
                    obj = objRememberedValue5;
                    str = str14;
                    function1 = $onResolved;
                    aiUiExtras = $ai;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                UiKt.Btn("确定", btnKind, null, false, false, null, false, (Function0) obj, composer, 54, 124);
                Composer composer5 = composer;
                BtnKind btnKind2 = BtnKind.Ghost;
                ComposerKt.sourceInformationMarkerStart(composer5, -883638406, str);
                boolean zChanged5 = composer5.changed(function1) | composer5.changedInstance(aiUiExtras);
                Object objRememberedValue6 = composer5.rememberedValue();
                if (zChanged5 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new Function0() { // from class: com.pymcl.android.ui.pages.AiPageKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AiPageKt.AskCard$lambda$0$5$1$0(function1, aiUiExtras);
                        }
                    };
                    composer5.updateRememberedValue(objRememberedValue6);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                UiKt.Btn("跳过", btnKind2, null, false, false, null, false, (Function0) objRememberedValue6, composer, 54, 124);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
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
    public static final Unit AskCard$lambda$0$4$0$0$0(boolean $done, SnapshotStateMap $sel, String $qid, boolean $multi, String $oid, boolean v) {
        if ($done) {
            return Unit.INSTANCE;
        }
        Set cur = (Set) $sel.get($qid);
        if (cur == null) {
            cur = SetsKt.emptySet();
        }
        $sel.put($qid, $multi ? v ? SetsKt.plus((Set<? extends String>) cur, $oid) : SetsKt.minus((Set<? extends String>) cur, $oid) : v ? SetsKt.setOf($oid) : SetsKt.emptySet());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AskCard$lambda$0$4$1$0(SnapshotStateMap $other, String $qid, String v) {
        Intrinsics.checkNotNullParameter(v, "v");
        $other.put($qid, v);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit AskCard$lambda$0$5$0$0(java.util.List r20, kotlin.jvm.functions.Function1 r21, com.pymcl.android.data.AiUiExtras r22, androidx.compose.runtime.snapshots.SnapshotStateMap r23, androidx.compose.runtime.snapshots.SnapshotStateMap r24) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.AiPageKt.AskCard$lambda$0$5$0$0(java.util.List, kotlin.jvm.functions.Function1, com.pymcl.android.data.AiUiExtras, androidx.compose.runtime.snapshots.SnapshotStateMap, androidx.compose.runtime.snapshots.SnapshotStateMap):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AskCard$lambda$0$5$1$0(Function1 $onResolved, AiUiExtras $ai) {
        boolean z = false;
        if ($ai != null && !$ai.answer(MapsKt.emptyMap(), true)) {
            z = true;
        }
        $onResolved.invoke(z ? "expired" : "skip");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x048a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void PermissionPanel(final com.pymcl.android.ui.state.AppState r54, final com.pymcl.android.data.AiUiExtras r55, final int r56, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r57, final kotlin.jvm.functions.Function0<kotlin.Unit> r58, androidx.compose.runtime.Composer r59, final int r60) {
        /*
            Method dump skipped, instructions count: 1200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.AiPageKt.PermissionPanel(com.pymcl.android.ui.state.AppState, com.pymcl.android.data.AiUiExtras, int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    private static final List<PermissionRule> PermissionPanel$lambda$1(MutableState<List<PermissionRule>> mutableState) {
        return mutableState.getValue();
    }

    private static final int PermissionPanel$lambda$5(MutableIntState $tool$delegate) {
        return $tool$delegate.getIntValue();
    }

    private static final int PermissionPanel$lambda$8(MutableIntState $behavior$delegate) {
        return $behavior$delegate.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int PermissionPanel$lambda$11(MutableIntState $scope$delegate) {
        return $scope$delegate.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String PermissionPanel$lambda$14(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object PermissionPanel$reload(com.pymcl.android.data.AiUiExtras r7, androidx.compose.runtime.MutableState<java.util.List<com.pymcl.android.ui.state.PermissionRule>> r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            boolean r0 = r9 instanceof com.pymcl.android.ui.pages.AiPageKt$PermissionPanel$reload$1
            if (r0 == 0) goto L14
            r0 = r9
            com.pymcl.android.ui.pages.AiPageKt$PermissionPanel$reload$1 r0 = (com.pymcl.android.ui.pages.AiPageKt$PermissionPanel$reload$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.pymcl.android.ui.pages.AiPageKt$PermissionPanel$reload$1 r0 = new com.pymcl.android.ui.pages.AiPageKt$PermissionPanel$reload$1
            r0.<init>(r9)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L4a;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            r2 = 0
            java.lang.Object r3 = r0.L$2
            androidx.compose.runtime.MutableState r3 = (androidx.compose.runtime.MutableState) r3
            java.lang.Object r4 = r0.L$1
            r8 = r4
            androidx.compose.runtime.MutableState r8 = (androidx.compose.runtime.MutableState) r8
            java.lang.Object r4 = r0.L$0
            r7 = r4
            com.pymcl.android.data.AiUiExtras r7 = (com.pymcl.android.data.AiUiExtras) r7
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Throwable -> L44
            r4 = r2
            r2 = r8
            r8 = r3
            r3 = r4
            r4 = r1
            goto L69
        L44:
            r2 = move-exception
            r6 = r2
            r2 = r8
            r8 = r3
            r3 = r6
            goto L75
        L4a:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L72
            r3 = 0
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)     // Catch: java.lang.Throwable -> L72
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L72
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)     // Catch: java.lang.Throwable -> L72
            r0.L$1 = r4     // Catch: java.lang.Throwable -> L72
            r0.L$2 = r8     // Catch: java.lang.Throwable -> L72
            r4 = 1
            r0.label = r4     // Catch: java.lang.Throwable -> L72
            java.lang.Object r4 = r7.rules(r0)     // Catch: java.lang.Throwable -> L72
            if (r4 != r2) goto L68
            return r2
        L68:
            r2 = r8
        L69:
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L70
            java.lang.Object r3 = kotlin.Result.m8116constructorimpl(r4)     // Catch: java.lang.Throwable -> L70
            goto L7f
        L70:
            r3 = move-exception
            goto L75
        L72:
            r2 = move-exception
            r3 = r2
            r2 = r8
        L75:
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r3 = kotlin.Result.m8116constructorimpl(r3)
        L7f:
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
            boolean r5 = kotlin.Result.m8122isFailureimpl(r3)
            if (r5 == 0) goto L8a
            r3 = r4
        L8a:
            java.util.List r3 = (java.util.List) r3
            PermissionPanel$lambda$2(r8, r3)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.AiPageKt.PermissionPanel$reload(com.pymcl.android.data.AiUiExtras, androidx.compose.runtime.MutableState, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0874  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0cbb  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0cd4  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0cf1  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0d13  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0fd4  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0fe8  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0ff9  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0ffc  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x1057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x084f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit PermissionPanel$lambda$18$1(kotlin.jvm.functions.Function0 r99, final int r100, final kotlin.jvm.functions.Function1 r101, final java.util.List r102, final androidx.compose.runtime.MutableIntState r103, final androidx.compose.runtime.MutableIntState r104, final androidx.compose.runtime.MutableIntState r105, final androidx.compose.runtime.MutableState r106, final com.pymcl.android.ui.state.AppState r107, final com.pymcl.android.data.AiUiExtras r108, final androidx.compose.runtime.MutableState r109, androidx.compose.foundation.layout.ColumnScope r110, androidx.compose.runtime.Composer r111, int r112) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 4195
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.AiPageKt.PermissionPanel$lambda$18$1(kotlin.jvm.functions.Function0, int, kotlin.jvm.functions.Function1, java.util.List, androidx.compose.runtime.MutableIntState, androidx.compose.runtime.MutableIntState, androidx.compose.runtime.MutableIntState, androidx.compose.runtime.MutableState, com.pymcl.android.ui.state.AppState, com.pymcl.android.data.AiUiExtras, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PermissionPanel$lambda$18$1$1$0(int $perm, Function1 $onPerm, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C385@22634L41:AiPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1304794359, $changed, -1, "com.pymcl.android.ui.pages.PermissionPanel.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AiPage.kt:385)");
            }
            UiKt.Combo(Permission.INSTANCE.getUI_LABELS(), $perm, $onPerm, null, false, false, $composer, 0, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PermissionPanel$lambda$18$1$1$1$0$0(MutableIntState $tool$delegate, int it) {
        $tool$delegate.setIntValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PermissionPanel$lambda$18$1$1$1$1$0(MutableIntState $behavior$delegate, int it) {
        $behavior$delegate.setIntValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PermissionPanel$lambda$18$1$1$1$2$0(MutableIntState $scope$delegate, int it) {
        $scope$delegate.setIntValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PermissionPanel$lambda$18$1$1$2$0(MutableState $content$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $content$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PermissionPanel$lambda$18$1$1$3$0$0(List $tools, AppState $state, MutableIntState $tool$delegate, MutableIntState $behavior$delegate, MutableState $content$delegate, AiUiExtras $ai, MutableIntState $scope$delegate, MutableState $rules$delegate) {
        String t = (String) $tools.get(PermissionPanel$lambda$5($tool$delegate));
        String b = (String) CollectionsKt.listOf((Object[]) new String[]{"allow", "deny", "ask"}).get(PermissionPanel$lambda$8($behavior$delegate));
        if (Intrinsics.areEqual(b, "allow") && StringsKt.startsWith$default(t, "delete_", false, 2, (Object) null) && StringsKt.isBlank(PermissionPanel$lambda$14($content$delegate))) {
            AppState.toast$default($state, "删除类工具的「允许」规则必须限定参数", null, "info", 2, null);
            return Unit.INSTANCE;
        }
        $state.launch(new AiPageKt$PermissionPanel$2$2$2$4$1$1$1($ai, t, b, $state, $content$delegate, $scope$delegate, $rules$delegate, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PermissionPanel$lambda$18$1$1$4$0$1$0(AppState $state, AiUiExtras $ai, PermissionRule $r, MutableState $rules$delegate) {
        $state.launch(new AiPageKt$PermissionPanel$2$2$2$5$1$2$1$1($ai, $r, $rules$delegate, null));
        return Unit.INSTANCE;
    }

    private static final void ErrorRow(final String text, final Function0<Unit> function0, Composer $composer, final int $changed) {
        Composer $composer2;
        Function0 function02;
        Function0 function03;
        Composer $composer3 = $composer.startRestartGroup(627367135);
        ComposerKt.sourceInformation($composer3, "C(ErrorRow)P(1)428@25566L6,430@25670L40,431@25761L6,431@25822L6,431@25715L651:AiPage.kt#vz4689");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(text) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 32 : 16;
        }
        if ($composer3.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(627367135, $dirty, -1, "com.pymcl.android.ui.pages.ErrorRow (AiPage.kt:427)");
            }
            PyColors c = Py.INSTANCE.getColors($composer3, 6);
            Pair<String, String> pairSplitDetail = AiSettingsForm.INSTANCE.splitDetail(text);
            String head = pairSplitDetail.component1();
            final String detail = pairSplitDetail.component2();
            ComposerKt.sourceInformationMarkerStart($composer3, 1604400743, "CC(remember):AiPage.kt#9igjgp");
            boolean z = ($dirty & 14) == 4;
            Object objRememberedValue = $composer3.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            }
            final MutableState open$delegate = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Modifier modifierM739paddingVpY3zN4 = PaddingKt.m739paddingVpY3zN4(BorderKt.m258borderxT4_qwU(BackgroundKt.m247backgroundbw27NRU$default(ClipKt.clip(SizeKt.m792widthInVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m7018constructorimpl(User32.WM_MDISETMENU), 1, null), Py.INSTANCE.getShapes($composer3, 6).getCtl()), c.m7981getPaper20d7_KjU(), null, 2, null), Dp.m7018constructorimpl(1), c.m7972getLineSoft0d7_KjU(), Py.INSTANCE.getShapes($composer3, 6).getCtl()), Dp.m7018constructorimpl(10), Dp.m7018constructorimpl(7));
            ComposerKt.sourceInformationMarkerStart($composer3, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer3, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            $composer2 = $composer3;
            int $dirty2 = $dirty;
            ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer3, modifierM739paddingVpY3zN4);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((0 << 3) & 112) << 6) & User32.WM_PENWINFIRST) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                function02 = constructor;
                $composer3.createNode(function02);
            } else {
                function02 = constructor;
                $composer3.useNode();
            }
            Composer composerM3832constructorimpl = Updater.m3832constructorimpl($composer3);
            Updater.m3839setimpl(composerM3832constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3839setimpl(composerM3832constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3832constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3832constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3832constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3832constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3839setimpl(composerM3832constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i3 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -656752820, "C432@25866L285:AiPage.kt#vz4689");
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            Modifier modifier = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer3, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
            CompositionLocalMap currentCompositionLocalMap2 = $composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer3, modifier);
            Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = ((((384 << 3) & 112) << 6) & User32.WM_PENWINFIRST) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                function03 = constructor2;
                $composer3.createNode(function03);
            } else {
                function03 = constructor2;
                $composer3.useNode();
            }
            Composer composerM3832constructorimpl2 = Updater.m3832constructorimpl($composer3);
            Updater.m3839setimpl(composerM3832constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3839setimpl(composerM3832constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3832constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3832constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM3832constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3832constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3839setimpl(composerM3832constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = (i4 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            int i6 = ((384 >> 6) & 112) | 6;
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer3, 1067296173, "C433@25932L27,433@25961L28,433@25991L56,434@26060L28,434@26128L13,434@26090L51:AiPage.kt#vz4689");
            UiKt.Tag("助手出错", TagTone.Danger, false, $composer3, 54, 4);
            SpacerKt.Spacer(SizeKt.m790width3ABfNKs(Modifier.INSTANCE, Dp.m7018constructorimpl(8)), $composer3, 6);
            UiKt.m7603TxtuDo3WH8(head, rowScope.weight(Modifier.INSTANCE, 1.0f, false), true, 0L, 0, $composer3, 384, 24);
            SpacerKt.Spacer(SizeKt.m790width3ABfNKs(Modifier.INSTANCE, Dp.m7018constructorimpl(8)), $composer3, 6);
            BtnKind btnKind = BtnKind.Ghost;
            ImageVector refresh = Ico.INSTANCE.getRefresh();
            ComposerKt.sourceInformationMarkerStart($composer3, 1419908306, "CC(remember):AiPage.kt#9igjgp");
            boolean z2 = ($dirty2 & 112) == 32;
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.pymcl.android.ui.pages.AiPageKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AiPageKt.ErrorRow$lambda$3$0$0$0(function0);
                    }
                };
                $composer3.updateRememberedValue(obj);
                objRememberedValue2 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            UiKt.Btn("重试", btnKind, refresh, false, false, null, false, (Function0) objRememberedValue2, $composer3, 54, 120);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (detail != null) {
                $composer3.startReplaceGroup(-656451067);
                ComposerKt.sourceInformation($composer3, "437@26275L16,437@26194L98");
                String str = ErrorRow$lambda$1(open$delegate) ? "收起详情 ▲" : "查看原始错误 ▼";
                Modifier modifierM742paddingqDBjuR0$default = PaddingKt.m742paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7018constructorimpl(4), 0.0f, 0.0f, 13, null);
                ComposerKt.sourceInformationMarkerStart($composer3, 2057037017, "CC(remember):AiPage.kt#9igjgp");
                boolean zChanged = $composer3.changed(open$delegate);
                Object objRememberedValue3 = $composer3.rememberedValue();
                if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function0() { // from class: com.pymcl.android.ui.pages.AiPageKt$$ExternalSyntheticLambda18
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AiPageKt.ErrorRow$lambda$3$1$0(open$delegate);
                        }
                    };
                    $composer3.updateRememberedValue(obj2);
                    objRememberedValue3 = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                UiKt.Small(str, ClickableKt.m281clickableXHw0xAI$default(modifierM742paddingqDBjuR0$default, false, null, null, (Function0) objRememberedValue3, 7, null), false, $composer3, 0, 4);
                if (ErrorRow$lambda$1(open$delegate)) {
                    $composer3.startReplaceGroup(2057038316);
                    ComposerKt.sourceInformation($composer3, "438@26334L16,438@26315L35");
                    SelectionContainerKt.SelectionContainer(null, ComposableLambdaKt.rememberComposableLambda(1772714096, true, new Function2() { // from class: com.pymcl.android.ui.pages.AiPageKt$$ExternalSyntheticLambda19
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            return AiPageKt.ErrorRow$lambda$3$2(detail, (Composer) obj3, ((Integer) obj4).intValue());
                        }
                    }, $composer3, 54), $composer3, 48, 1);
                } else {
                    $composer3.startReplaceGroup(-656288007);
                }
                $composer3.endReplaceGroup();
                $composer3.endReplaceGroup();
            } else {
                $composer3.startReplaceGroup(-656278087);
                $composer3.endReplaceGroup();
            }
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.pages.AiPageKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return AiPageKt.ErrorRow$lambda$4(text, function0, $changed, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    private static final boolean ErrorRow$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void ErrorRow$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ErrorRow$lambda$3$0$0$0(Function0 $onRetry) {
        $onRetry.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ErrorRow$lambda$3$1$0(MutableState $open$delegate) {
        ErrorRow$lambda$2($open$delegate, !ErrorRow$lambda$1($open$delegate));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ErrorRow$lambda$3$2(String $detail, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C438@26336L12:AiPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1772714096, $changed, -1, "com.pymcl.android.ui.pages.ErrorRow.<anonymous>.<anonymous> (AiPage.kt:438)");
            }
            UiKt.Mono($detail, null, 0, $composer, 0, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void ThinkFold(final java.lang.String r62, androidx.compose.runtime.Composer r63, final int r64) {
        /*
            Method dump skipped, instructions count: 997
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.AiPageKt.ThinkFold(java.lang.String, androidx.compose.runtime.Composer, int):void");
    }

    private static final boolean ThinkFold$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void ThinkFold$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ThinkFold$lambda$3$0$0(MutableState $open$delegate) {
        ThinkFold$lambda$2($open$delegate, !ThinkFold$lambda$1($open$delegate));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ThinkFold$lambda$3$2(String $text, AnimatedVisibilityScope AnimatedVisibility, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        ComposerKt.sourceInformation($composer, "C450@26886L6,450@26831L89:AiPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1239450370, $changed, -1, "com.pymcl.android.ui.pages.ThinkFold.<anonymous>.<anonymous> (AiPage.kt:450)");
            }
            TextKt.m2843Text4IGK_g($text, PaddingKt.m742paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m7018constructorimpl(18), 0.0f, 0.0f, 0.0f, 14, null), Py.INSTANCE.getColors($composer, 6).m7969getInkMuted0d7_KjU(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, GL11.GL_INDEX_MODE, 0, 131056);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: ToolIcon-ziNgDLE, reason: not valid java name */
    public static final void m7716ToolIconziNgDLE(String tool, final float size, Composer $composer, final int $changed) throws XmlPullParserException, Resources.NotFoundException, IllegalArgumentException {
        final String str;
        Composer $composer2;
        ColorFilter colorFilterM4431tintxETnrds$default;
        Intrinsics.checkNotNullParameter(tool, "tool");
        Composer $composer3 = $composer.startRestartGroup(-508147834);
        ComposerKt.sourceInformation($composer3, "C(ToolIcon)P(1,0:c#ui.unit.Dp):AiPage.kt#vz4689");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(tool) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(size) ? 32 : 16;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            str = tool;
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-508147834, $dirty2, -1, "com.pymcl.android.ui.pages.ToolIcon (AiPage.kt:471)");
            }
            Integer id = toolIcons.get(tool);
            if (id != null) {
                $composer3.startReplaceGroup(1296207049);
                ComposerKt.sourceInformation($composer3, "473@28971L19,473@29040L6,473@28965L163");
                Painter painterPainterResource = PainterResources_androidKt.painterResource(id.intValue(), $composer3, 0);
                Modifier modifierM785size3ABfNKs = SizeKt.m785size3ABfNKs(Modifier.INSTANCE, size);
                if (Py.INSTANCE.getColors($composer3, 6).getDark()) {
                    $composer3.startReplaceGroup(1296211037);
                    ComposerKt.sourceInformation($composer3, "473@29102L6");
                    colorFilterM4431tintxETnrds$default = ColorFilter.Companion.m4431tintxETnrds$default(ColorFilter.INSTANCE, Py.INSTANCE.getColors($composer3, 6).m7970getInkSoft0d7_KjU(), 0, 2, null);
                    $composer3.endReplaceGroup();
                } else {
                    $composer3.startReplaceGroup(1527864663);
                    $composer3.endReplaceGroup();
                    colorFilterM4431tintxETnrds$default = null;
                }
                $composer2 = $composer3;
                ImageKt.Image(painterPainterResource, tool, modifierM785size3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, colorFilterM4431tintxETnrds$default, $composer2, ($dirty2 << 3) & 112, 56);
                str = tool;
                $composer2.endReplaceGroup();
            } else {
                str = tool;
                $composer3.startReplaceGroup(1296212489);
                ComposerKt.sourceInformation($composer3, "474@29190L6,474@29138L67");
                IconKt.m2300Iconww6aTOc(Ico.INSTANCE.getGear(), (String) null, SizeKt.m785size3ABfNKs(Modifier.INSTANCE, size), Py.INSTANCE.getColors($composer3, 6).m7970getInkSoft0d7_KjU(), $composer3, 48, 0);
                $composer2 = $composer3;
                $composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.pages.AiPageKt$$ExternalSyntheticLambda57
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AiPageKt.ToolIcon_ziNgDLE$lambda$0(str, size, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x05d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void ToolLine(final com.pymcl.android.ui.state.AiItem.Tool r86, androidx.compose.runtime.Composer r87, final int r88) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 1534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.AiPageKt.ToolLine(com.pymcl.android.ui.state.AiItem$Tool, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x031f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void ChatInput(final java.lang.String r46, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r47, final boolean r48, final kotlin.jvm.functions.Function0<kotlin.Unit> r49, final kotlin.jvm.functions.Function0<kotlin.Unit> r50, final kotlin.jvm.functions.Function0<kotlin.Unit> r51, androidx.compose.runtime.Composer r52, final int r53) {
        /*
            Method dump skipped, instructions count: 839
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.AiPageKt.ChatInput(java.lang.String, kotlin.jvm.functions.Function1, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }
}
