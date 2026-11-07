package com.pymcl.android.ui.pages;

import android.content.Context;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.vector.ImageVector;
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
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.pymcl.android.data.HomepageLogic;
import com.pymcl.android.data.LaunchConfigIO;
import com.pymcl.android.data.LaunchConfigLogic;
import com.pymcl.android.ui.Destination;
import com.pymcl.android.ui.components.BtnKind;
import com.pymcl.android.ui.components.Ico;
import com.pymcl.android.ui.components.UiKt;
import com.pymcl.android.ui.i18n.I18nKt;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.CatalogKind;
import com.pymcl.android.ui.state.DialogSpec;
import com.pymcl.android.ui.state.LaunchGate;
import com.pymcl.android.ui.state.NavKey;
import com.pymcl.android.ui.state.NewsItem;
import com.pymcl.android.ui.state.TaskState;
import com.pymcl.android.ui.theme.Py;
import com.pymcl.multiplayer.TerracottaVpnService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.windows.User32;

/* compiled from: LaunchPage.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a'\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007b\u0002\b\u0010b\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013¢\u0006\u0002\u0010\u000f\u001a\u007f\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0018\u0010\u001c\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\f0\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u001fH\u0003b\u0002\b\u0010b\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013¢\u0006\u0004\b \u0010!\u001aC\u0010\"\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u001fH\u0003b\u0002\b\u0010b\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013¢\u0006\u0002\u0010#\u001aE\u0010$\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020'2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u001fH\u0003b\u0002\b\u0010b\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013¢\u0006\u0002\u0010(\u001aG\u0010)\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u00072\u001e\b\u0002\u0010+\u001a\u0018\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\f0\u001d¢\u0006\u0002\b\u0010¢\u0006\u0002\b-H\u0003b\u0002\b\u0010b\f\b/\u0012\b\b0\u0012\u0004\b\b(1¢\u0006\u0002\u0010.\u001a=\u00102\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020'2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u001fH\u0003b\u0002\b\u0010b\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013¢\u0006\u0002\u00103\u001a'\u00104\u001a\u00020\f2\u0006\u00105\u001a\u00020\u0007H\u0003b\u0002\b\u0010b\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013¢\u0006\u0002\u00106\u001a/\u00107\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020'H\u0003b\u0002\b\u0010b\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013¢\u0006\u0002\u00108\u001a:\u00109\u001a\u00020\f2\u0006\u0010:\u001a\u00020\u00072\u0011\u0010;\u001a\r\u0012\u0004\u0012\u00020\f0\u001f¢\u0006\u0002\b\u0010H\u0003b\u0002\b\u0010b\f\b/\u0012\b\b0\u0012\u0004\b\b(1¢\u0006\u0002\u0010<\u001a/\u0010=\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020'H\u0003b\u0002\b\u0010b\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013¢\u0006\u0002\u00108\u001a/\u0010>\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020'H\u0003b\u0002\b\u0010b\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013¢\u0006\u0002\u00108\u001a7\u0010?\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020'2\u0006\u0010@\u001a\u00020\u0007H\u0003b\u0002\b\u0010b\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013¢\u0006\u0002\u0010A\u001a/\u0010B\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020'H\u0003b\u0002\b\u0010b\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013¢\u0006\u0002\u00108\u001a/\u0010C\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020'H\u0003b\u0002\b\u0010b\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013¢\u0006\u0002\u00108\u001a/\u0010D\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020'H\u0003b\u0002\b\u0010b\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013¢\u0006\u0002\u00108\u001a/\u0010E\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020'H\u0003b\u0002\b\u0010b\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013¢\u0006\u0002\u00108\u001a\u000e\u0010F\u001a\u00020\u00072\u0006\u0010G\u001a\u00020H\u001a/\u0010I\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020'H\u0003b\u0002\b\u0010b\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013¢\u0006\u0002\u00108\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"&\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006J²\u0006\u0010\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u008a\u008e\u0002²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u008e\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0017X\u008a\u008e\u0002²\u0006\n\u0010K\u001a\u00020\u0017X\u008a\u008e\u0002²\u0006\n\u0010L\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\f\u0010M\u001a\u0004\u0018\u00010NX\u008a\u008e\u0002²\u0006\n\u0010O\u001a\u00020PX\u008a\u008e\u0002²\u0006\n\u0010Q\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u0010R\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u0010S\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010T\u001a\u00020\nX\u008a\u008e\u0002²\u0006\u0012\u0010U\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010VX\u008a\u008e\u0002²\u0006\u0012\u0010W\u001a\n\u0012\u0004\u0012\u00020X\u0018\u00010\u0001X\u008a\u008e\u0002²\u0006\n\u0010Y\u001a\u00020HX\u008a\u008e\u0002"}, d2 = {"DefaultDash", "", "Lcom/pymcl/android/ui/pages/DashCardSpec;", "getDefaultDash", "()Ljava/util/List;", "cardTitle", "", "", "minSize", "Lkotlin/Pair;", "", "LaunchPage", "", "state", "Lcom/pymcl/android/ui/state/AppState;", "(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/runtime/ComposableTarget;", "applier", "androidx.compose.ui.UiComposable", "DashCanvas", "cards", "editing", "", "snap", "W", "Landroidx/compose/ui/unit/Dp;", "H", "onChange", "Lkotlin/Function1;", "onEdit", "Lkotlin/Function0;", "DashCanvas-3GLzNTs", "(Lcom/pymcl/android/ui/state/AppState;Ljava/util/List;ZZFFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "DashStack", "(Lcom/pymcl/android/ui/state/AppState;Ljava/util/List;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "DashCardBody", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "CardHead", "title", "right", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/runtime/ComposableInferredTarget;", "scheme", "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]", "BannerCard", "(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "BannerTag", TerracottaVpnService.EXTRA_TEXT, "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "ConfigCard", "(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "LabeledRow", "label", "content", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "LogCard", "NewsCard", "LocalHomepage", "path", "(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "NewsFeed", "QuickCard", "NotesCard", "PlaytimeCard", "fmtDuration", "sec", "", "TasksSummaryCard", "PyMCL-Android:app_debug", "menu", "direct", "loaded", "Lcom/pymcl/android/data/LaunchConfigIO$State;", "mem", "", "w", "h", "java", "reload", "html", "Lkotlin/Result;", "news", "Lcom/pymcl/android/ui/state/NewsItem;", "total"}, k = 2, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes22.dex */
public final class LaunchPageKt {
    private static final List<DashCardSpec> DefaultDash = CollectionsKt.listOf((Object[]) new DashCardSpec[]{new DashCardSpec("banner-main", "banner", 0.0f, 0.0f, 0.74f, 0.3f, 0), new DashCardSpec("playtime-main", "playtime", 0.74f, 0.0f, 0.26f, 0.3f, 1), new DashCardSpec("config-main", "config", 0.0f, 0.3f, 0.3f, 0.7f, 2), new DashCardSpec("log-main", "log", 0.3f, 0.3f, 0.44f, 0.42f, 3), new DashCardSpec("notes-main", "notes", 0.3f, 0.72f, 0.22f, 0.28f, 4), new DashCardSpec("tasks-main", "tasks", 0.52f, 0.72f, 0.22f, 0.28f, 5), new DashCardSpec("quick-main", "quick", 0.74f, 0.3f, 0.26f, 0.3f, 6), new DashCardSpec("news-main", "news", 0.74f, 0.6f, 0.26f, 0.4f, 7)});
    private static final Map<String, String> cardTitle = MapsKt.mapOf(TuplesKt.to("banner", "启动横幅"), TuplesKt.to("config", "启动配置"), TuplesKt.to("log", "实时日志"), TuplesKt.to("news", "新闻主页"), TuplesKt.to("quick", "快捷入口"), TuplesKt.to("notes", "便签"), TuplesKt.to("playtime", "游戏时长"), TuplesKt.to("tasks", "任务摘要"));
    private static final Map<String, Pair<Integer, Integer>> minSize = MapsKt.mapOf(TuplesKt.to("banner", TuplesKt.to(340, 125)), TuplesKt.to("config", TuplesKt.to(330, 300)), TuplesKt.to("log", TuplesKt.to(260, 180)), TuplesKt.to("news", TuplesKt.to(220, 180)), TuplesKt.to("quick", TuplesKt.to(220, 150)), TuplesKt.to("notes", TuplesKt.to(180, 130)), TuplesKt.to("playtime", TuplesKt.to(220, 130)), TuplesKt.to("tasks", TuplesKt.to(220, 130)));

    /* compiled from: LaunchPage.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[LaunchGate.Reason.values().length];
            try {
                iArr[LaunchGate.Reason.Ok.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[LaunchGate.Reason.NoAccount.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LaunchGate.Action.values().length];
            try {
                iArr2[LaunchGate.Action.Stop.ordinal()] = 1;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr2[LaunchGate.Action.DownloadGame.ordinal()] = 2;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr2[LaunchGate.Action.Repair.ordinal()] = 3;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr2[LaunchGate.Action.OpenInstances.ordinal()] = 4;
            } catch (NoSuchFieldError e6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[HomepageLogic.Mode.values().length];
            try {
                iArr3[HomepageLogic.Mode.News.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr3[HomepageLogic.Mode.Blank.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr3[HomepageLogic.Mode.LocalUnset.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr3[HomepageLogic.Mode.Local.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[TaskState.values().length];
            try {
                iArr4[TaskState.Failed.ordinal()] = 1;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr4[TaskState.Done.ordinal()] = 2;
            } catch (NoSuchFieldError e12) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BannerCard$lambda$7(AppState appState, Modifier modifier, Function0 function0, int i, Composer composer, int i2) {
        BannerCard(appState, modifier, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BannerTag$lambda$0(String str, int i, Composer composer, int i2) {
        BannerTag(str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CardHead$lambda$1(String str, Function3 function3, int i, int i2, Composer composer, int i3) {
        CardHead(str, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConfigCard$lambda$22(AppState appState, Modifier modifier, int i, Composer composer, int i2) {
        ConfigCard(appState, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DashCanvas_3GLzNTs$lambda$1(AppState appState, List list, boolean z, boolean z2, float f, float f2, Function1 function1, Function0 function0, int i, Composer composer, int i2) {
        m7797DashCanvas3GLzNTs(appState, list, z, z2, f, f2, function1, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DashCardBody$lambda$1(AppState appState, String str, Modifier modifier, Function0 function0, int i, Composer composer, int i2) {
        DashCardBody(appState, str, modifier, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DashStack$lambda$2(AppState appState, List list, Function0 function0, int i, Composer composer, int i2) {
        DashStack(appState, list, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LabeledRow$lambda$1(String str, Function2 function2, int i, Composer composer, int i2) {
        LabeledRow(str, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LaunchPage$lambda$10(AppState appState, int i, Composer composer, int i2) {
        LaunchPage(appState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LocalHomepage$lambda$8(AppState appState, Modifier modifier, String str, int i, Composer composer, int i2) {
        LocalHomepage(appState, modifier, str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LogCard$lambda$1(AppState appState, Modifier modifier, int i, Composer composer, int i2) {
        LogCard(appState, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewsCard$lambda$1(AppState appState, Modifier modifier, int i, Composer composer, int i2) {
        NewsCard(appState, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewsFeed$lambda$5(AppState appState, Modifier modifier, int i, Composer composer, int i2) {
        NewsFeed(appState, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NotesCard$lambda$1(AppState appState, Modifier modifier, int i, Composer composer, int i2) {
        NotesCard(appState, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlaytimeCard$lambda$7(AppState appState, Modifier modifier, int i, Composer composer, int i2) {
        PlaytimeCard(appState, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuickCard$lambda$1(AppState appState, Modifier modifier, int i, Composer composer, int i2) {
        QuickCard(appState, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TasksSummaryCard$lambda$1(AppState appState, Modifier modifier, int i, Composer composer, int i2) {
        TasksSummaryCard(appState, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final List<DashCardSpec> getDefaultDash() {
        return DefaultDash;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x04dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LaunchPage(final com.pymcl.android.ui.state.AppState r70, androidx.compose.runtime.Composer r71, final int r72) {
        /*
            Method dump skipped, instructions count: 1445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.LaunchPageKt.LaunchPage(com.pymcl.android.ui.state.AppState, androidx.compose.runtime.Composer, int):void");
    }

    private static final List<DashCardSpec> LaunchPage$lambda$1(MutableState<List<DashCardSpec>> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean LaunchPage$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void LaunchPage$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean LaunchPage$lambda$7(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void LaunchPage$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LaunchPage$lambda$9$0$0$0(AppState $state, MutableState $cards$delegate) {
        Iterable iterable;
        boolean z;
        Iterable iterable2 = DefaultDash;
        Collection arrayList = new ArrayList();
        for (Object obj : iterable2) {
            DashCardSpec dashCardSpec = (DashCardSpec) obj;
            Iterable iterableLaunchPage$lambda$1 = LaunchPage$lambda$1($cards$delegate);
            if ((iterableLaunchPage$lambda$1 instanceof Collection) && ((Collection) iterableLaunchPage$lambda$1).isEmpty()) {
                iterable = iterable2;
                z = true;
            } else {
                Iterator it = iterableLaunchPage$lambda$1.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        iterable = iterable2;
                        z = true;
                        break;
                    }
                    iterable = iterable2;
                    if (Intrinsics.areEqual(((DashCardSpec) it.next()).getId(), dashCardSpec.getId())) {
                        z = false;
                        break;
                    }
                    iterable2 = iterable;
                }
            }
            if (z) {
                arrayList.add(obj);
            }
            iterable2 = iterable;
        }
        List missing = (List) arrayList;
        if (missing.isEmpty()) {
            AppState.toast$default($state, "卡片都在画布上了", null, null, 6, null);
        } else {
            $cards$delegate.setValue(CollectionsKt.plus((Collection<? extends DashCardSpec>) LaunchPage$lambda$1($cards$delegate), DashCardSpec.copy$default((DashCardSpec) CollectionsKt.first(missing), null, null, 0.0f, 0.0f, 0.0f, 0.0f, LaunchPage$lambda$1($cards$delegate).size(), 63, null)));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LaunchPage$lambda$9$0$1$0(MutableState $snap$delegate) {
        LaunchPage$lambda$8($snap$delegate, !LaunchPage$lambda$7($snap$delegate));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LaunchPage$lambda$9$0$2$0(MutableState $cards$delegate) {
        $cards$delegate.setValue(DefaultDash);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LaunchPage$lambda$9$0$3$0(MutableState $editing$delegate) {
        LaunchPage$lambda$5($editing$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LaunchPage$lambda$9$1(final AppState $state, final MutableState $cards$delegate, final MutableState $editing$delegate, MutableState $snap$delegate, BoxWithConstraintsScope BoxWithConstraints, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        ComposerKt.sourceInformation($composer, "C:LaunchPage.kt#vz4689");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(BoxWithConstraints) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        boolean z = false;
        if ($composer.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-350577947, $dirty2, -1, "com.pymcl.android.ui.pages.LaunchPage.<anonymous>.<anonymous> (LaunchPage.kt:73)");
            }
            if (Dp.m7017compareTo0680j_4(BoxWithConstraints.mo645getMaxWidthD9Ej5fM(), Dp.m7018constructorimpl(860)) >= 0 && Dp.m7017compareTo0680j_4(BoxWithConstraints.mo644getMaxHeightD9Ej5fM(), Dp.m7018constructorimpl(520)) >= 0) {
                z = true;
            }
            boolean canvas = z;
            if (canvas) {
                $composer.startReplaceGroup(-1897954887);
                ComposerKt.sourceInformation($composer, "74@4029L14,74@4054L18,74@3957L116");
                List<DashCardSpec> listLaunchPage$lambda$1 = LaunchPage$lambda$1($cards$delegate);
                boolean zLaunchPage$lambda$4 = LaunchPage$lambda$4($editing$delegate);
                boolean zLaunchPage$lambda$7 = LaunchPage$lambda$7($snap$delegate);
                float fMo645getMaxWidthD9Ej5fM = BoxWithConstraints.mo645getMaxWidthD9Ej5fM();
                float fMo644getMaxHeightD9Ej5fM = BoxWithConstraints.mo644getMaxHeightD9Ej5fM();
                ComposerKt.sourceInformationMarkerStart($composer, -1897952685, "CC(remember):LaunchPage.kt#9igjgp");
                Object objRememberedValue = $composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.LaunchPageKt$$ExternalSyntheticLambda17
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LaunchPageKt.LaunchPage$lambda$9$1$0$0($cards$delegate, (List) obj2);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                Function1 function1 = (Function1) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerStart($composer, -1897951881, "CC(remember):LaunchPage.kt#9igjgp");
                Object objRememberedValue2 = $composer.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function0() { // from class: com.pymcl.android.ui.pages.LaunchPageKt$$ExternalSyntheticLambda18
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LaunchPageKt.LaunchPage$lambda$9$1$1$0($editing$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                    objRememberedValue2 = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                m7797DashCanvas3GLzNTs($state, listLaunchPage$lambda$1, zLaunchPage$lambda$4, zLaunchPage$lambda$7, fMo645getMaxWidthD9Ej5fM, fMo644getMaxHeightD9Ej5fM, function1, (Function0) objRememberedValue2, $composer, AppState.$stable | 14155776);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-1897950612);
                ComposerKt.sourceInformation($composer, "75@4124L69,75@4091L103");
                List<DashCardSpec> listLaunchPage$lambda$12 = LaunchPage$lambda$1($cards$delegate);
                ComposerKt.sourceInformationMarkerStart($composer, -1897949590, "CC(remember):LaunchPage.kt#9igjgp");
                boolean zChangedInstance = $composer.changedInstance($state);
                Object objRememberedValue3 = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    Object obj3 = new Function0() { // from class: com.pymcl.android.ui.pages.LaunchPageKt$$ExternalSyntheticLambda19
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LaunchPageKt.LaunchPage$lambda$9$1$2$0($state, $editing$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj3);
                    objRememberedValue3 = obj3;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                DashStack($state, listLaunchPage$lambda$12, (Function0) objRememberedValue3, $composer, AppState.$stable);
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
    public static final Unit LaunchPage$lambda$9$1$0$0(MutableState $cards$delegate, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $cards$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LaunchPage$lambda$9$1$1$0(MutableState $editing$delegate) {
        LaunchPage$lambda$5($editing$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LaunchPage$lambda$9$1$2$0(AppState $state, MutableState $editing$delegate) {
        LaunchPage$lambda$5($editing$delegate, true);
        $state.toast("画布编辑需要更大的窗口", "手机横屏按卡片顺序排列", "info");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x07dc  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0814 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x08e4  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x08e6  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x08fa  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x092c  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x094b  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x098b  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0a15  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0286  */
    /* renamed from: DashCanvas-3GLzNTs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void m7797DashCanvas3GLzNTs(final com.pymcl.android.ui.state.AppState r111, final java.util.List<com.pymcl.android.ui.pages.DashCardSpec> r112, final boolean r113, final boolean r114, final float r115, final float r116, final kotlin.jvm.functions.Function1<? super java.util.List<com.pymcl.android.ui.pages.DashCardSpec>, kotlin.Unit> r117, final kotlin.jvm.functions.Function0<kotlin.Unit> r118, androidx.compose.runtime.Composer r119, final int r120) {
        /*
            Method dump skipped, instructions count: 2625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.LaunchPageKt.m7797DashCanvas3GLzNTs(com.pymcl.android.ui.state.AppState, java.util.List, boolean, boolean, float, float, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset DashCanvas_3GLzNTs$lambda$0$1$4$0(DashCardSpec $spec, float $pxW, float $pxH, Animatable $appear, Density $density, Density offset) {
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        return IntOffset.m7137boximpl(IntOffset.m7140constructorimpl((MathKt.roundToInt($spec.getX() * $pxW) << 32) | (MathKt.roundToInt(($spec.getY() * $pxH) + ((1 - ((Number) $appear.getValue()).floatValue()) * 10 * $density.getDensity())) & 4294967295L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DashCanvas_3GLzNTs$lambda$0$1$6$0$0$0(Function1 $onChange, List $cards, DashCardSpec $spec) {
        Collection arrayList = new ArrayList();
        for (Object obj : $cards) {
            if (!Intrinsics.areEqual(((DashCardSpec) obj).getId(), $spec.getId())) {
                arrayList.add(obj);
            }
        }
        $onChange.invoke((List) arrayList);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0482, code lost:
    
        if (r1.equals("log") == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0484, code lost:
    
        r79 = r1;
        r78 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0489, code lost:
    
        r78 = r2;
        r0 = androidx.compose.ui.unit.Dp.m7018constructorimpl(220);
        r79 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0477, code lost:
    
        if (r1.equals("news") == false) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02cb A[LOOP:2: B:69:0x02c5->B:71:0x02cb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x030b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void DashStack(com.pymcl.android.ui.state.AppState r81, final java.util.List<com.pymcl.android.ui.pages.DashCardSpec> r82, kotlin.jvm.functions.Function0<kotlin.Unit> r83, androidx.compose.runtime.Composer r84, final int r85) {
        /*
            Method dump skipped, instructions count: 1490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.LaunchPageKt.DashStack(com.pymcl.android.ui.state.AppState, java.util.List, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void DashCardBody(final com.pymcl.android.ui.state.AppState r12, final java.lang.String r13, final androidx.compose.ui.Modifier r14, final kotlin.jvm.functions.Function0<kotlin.Unit> r15, androidx.compose.runtime.Composer r16, final int r17) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.LaunchPageKt.DashCardBody(com.pymcl.android.ui.state.AppState, java.lang.String, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DashCardBody$lambda$0(String $type, ColumnScope Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C166@9154L27:LaunchPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1885013040, $changed, -1, "com.pymcl.android.ui.pages.DashCardBody.<anonymous> (LaunchPage.kt:166)");
            }
            String str = cardTitle.get($type);
            UiKt.H3(str == null ? $type : str, null, false, $composer, 0, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void CardHead(java.lang.String r33, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.LaunchPageKt.CardHead(java.lang.String, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:208:0x0c3b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0c47  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0c4d  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0d5e  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0d6a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0d70  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0da1  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0db7  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0e15  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0e1c  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0e23  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0e2a  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0e4f  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0e52  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0e94  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0e97  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0f24  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0f30  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0fa8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void BannerCard(final com.pymcl.android.ui.state.AppState r165, final androidx.compose.ui.Modifier r166, final kotlin.jvm.functions.Function0<kotlin.Unit> r167, androidx.compose.runtime.Composer r168, final int r169) {
        /*
            Method dump skipped, instructions count: 4064
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.LaunchPageKt.BannerCard(com.pymcl.android.ui.state.AppState, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    private static final boolean BannerCard$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void BannerCard$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String BannerCard$lambda$4(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BannerCard$lambda$6$0$0$4$0$0(MutableState $menu$delegate) {
        BannerCard$lambda$2($menu$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BannerCard$lambda$6$0$0$4$1$0(MutableState $menu$delegate) {
        BannerCard$lambda$2($menu$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BannerCard$lambda$6$0$0$4$2(final AppState $state, final Function0 $onEdit, final MutableState $menu$delegate, ColumnScope DropdownMenu, Composer $composer, int $changed) {
        Composer composer = $composer;
        Intrinsics.checkNotNullParameter(DropdownMenu, "$this$DropdownMenu");
        ComposerKt.sourceInformation(composer, "C*192@10653L10,192@10675L702,192@10636L742:LaunchPage.kt#vz4689");
        boolean z = true;
        if (!composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(333940163, $changed, -1, "com.pymcl.android.ui.pages.BannerCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LaunchPage.kt:191)");
            }
            for (final String str : CollectionsKt.listOf((Object[]) new String[]{"查看启动命令", "复制启动命令", "导出启动脚本 (.bat)", "创建桌面快捷方式", "修复当前版本", "打开实例文件夹", "版本设置", "编辑布局"})) {
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-556470461, z, new Function2() { // from class: com.pymcl.android.ui.pages.LaunchPageKt$$ExternalSyntheticLambda57
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LaunchPageKt.BannerCard$lambda$6$0$0$4$2$0$0(str, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer, 54);
                ComposerKt.sourceInformationMarkerStart(composer, -1396929871, "CC(remember):LaunchPage.kt#9igjgp");
                boolean zChangedInstance = composer.changedInstance($state) | composer.changed(str) | composer.changed($onEdit);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.pymcl.android.ui.pages.LaunchPageKt$$ExternalSyntheticLambda58
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LaunchPageKt.BannerCard$lambda$6$0$0$4$2$0$1$0($state, str, $onEdit, $menu$delegate);
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
    public static final Unit BannerCard$lambda$6$0$0$4$2$0$0(String $k, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C192@10655L6:LaunchPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-556470461, $changed, -1, "com.pymcl.android.ui.pages.BannerCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LaunchPage.kt:192)");
            }
            UiKt.m7603TxtuDo3WH8($k, null, false, 0L, 0, $composer, 0, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BannerCard$lambda$6$0$0$4$2$0$1$0(AppState $state, String $k, Function0 $onEdit, MutableState $menu$delegate) {
        BannerCard$lambda$2($menu$delegate, false);
        LaunchGate.Verdict g = $state.getLaunchVerdict();
        if (Intrinsics.areEqual($k, "编辑布局")) {
            $onEdit.invoke();
        } else {
            if ((g.getVersion().length() == 0) && g.getReason() != LaunchGate.Reason.Running) {
                $state.toast("没有版本", "先安装并选中一个版本", "warn");
            } else if (Intrinsics.areEqual($k, "版本设置")) {
                $state.open(new DialogSpec.VersionSetup(g.getVersion()));
            } else if (Intrinsics.areEqual($k, "修复当前版本")) {
                AppState.startGame$default($state, null, 1, null);
            } else {
                $state.toast($k, "当前系统不支持", "info");
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BannerCard$lambda$6$0$2$0$0(MutableState $direct$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $direct$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit BannerCard$lambda$6$0$2$1(com.pymcl.android.ui.theme.PyColors r53, androidx.compose.runtime.MutableState r54, kotlin.jvm.functions.Function2 r55, androidx.compose.runtime.Composer r56, int r57) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.LaunchPageKt.BannerCard$lambda$6$0$2$1(com.pymcl.android.ui.theme.PyColors, androidx.compose.runtime.MutableState, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BannerCard$lambda$6$0$2$2$0(AppState $state, MutableState $direct$delegate) {
        String string = StringsKt.trim((CharSequence) BannerCard$lambda$4($direct$delegate)).toString();
        if (string.length() == 0) {
            string = null;
        }
        $state.startGame(string);
        return Unit.INSTANCE;
    }

    private static final void BannerTag(final String text, Composer $composer, final int $changed) {
        Composer $composer2;
        Composer $composer3 = $composer.startRestartGroup(-1604796224);
        ComposerKt.sourceInformation($composer3, "C(BannerTag)243@14134L6,243@14106L181:LaunchPage.kt#vz4689");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(text) ? 4 : 2;
        }
        if ($composer3.shouldExecute(($dirty & 3) != 2, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1604796224, $dirty, -1, "com.pymcl.android.ui.pages.BannerTag (LaunchPage.kt:243)");
            }
            Modifier modifierClip = ClipKt.clip(Modifier.INSTANCE, Py.INSTANCE.getShapes($composer3, 6).getPill());
            long jM4427getWhite0d7_KjU = Color.INSTANCE.m4427getWhite0d7_KjU();
            $composer2 = $composer3;
            TextKt.m2843Text4IGK_g(text, PaddingKt.m739paddingVpY3zN4(BackgroundKt.m247backgroundbw27NRU$default(modifierClip, Color.m4388copywmQWz5c(jM4427getWhite0d7_KjU, (14 & 1) != 0 ? Color.m4392getAlphaimpl(jM4427getWhite0d7_KjU) : 0.18f, (14 & 2) != 0 ? Color.m4396getRedimpl(jM4427getWhite0d7_KjU) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(jM4427getWhite0d7_KjU) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(jM4427getWhite0d7_KjU) : 0.0f), null, 2, null), Dp.m7018constructorimpl(8), Dp.m7018constructorimpl(2)), Color.INSTANCE.m4427getWhite0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, ($dirty & 14) | GL11.GL_AUTO_NORMAL, 3072, 122864);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.pages.LaunchPageKt$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LaunchPageKt.BannerTag$lambda$0(text, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x033a A[LOOP:0: B:102:0x0334->B:104:0x033a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0304  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void ConfigCard(final com.pymcl.android.ui.state.AppState r26, androidx.compose.ui.Modifier r27, androidx.compose.runtime.Composer r28, final int r29) {
        /*
            Method dump skipped, instructions count: 991
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.LaunchPageKt.ConfigCard(com.pymcl.android.ui.state.AppState, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LaunchConfigIO.State ConfigCard$lambda$1(MutableState<LaunchConfigIO.State> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ConfigCard$lambda$4(MutableFloatState $mem$delegate) {
        return $mem$delegate.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ConfigCard$lambda$7(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ConfigCard$lambda$10(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final int ConfigCard$lambda$13(MutableIntState $java$delegate) {
        return $java$delegate.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0528  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit ConfigCard$lambda$21(java.lang.String r46, final java.util.List r47, final com.pymcl.android.ui.state.AppState r48, final java.util.List r49, final java.util.List r50, final androidx.compose.runtime.MutableIntState r51, final androidx.compose.runtime.MutableState r52, final android.content.Context r53, final androidx.compose.runtime.MutableFloatState r54, final int r55, final androidx.compose.runtime.MutableState r56, final androidx.compose.runtime.MutableState r57, androidx.compose.foundation.layout.ColumnScope r58, androidx.compose.runtime.Composer r59, int r60) {
        /*
            Method dump skipped, instructions count: 1332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.LaunchPageKt.ConfigCard$lambda$21(java.lang.String, java.util.List, com.pymcl.android.ui.state.AppState, java.util.List, java.util.List, androidx.compose.runtime.MutableIntState, androidx.compose.runtime.MutableState, android.content.Context, androidx.compose.runtime.MutableFloatState, int, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConfigCard$lambda$21$0$0(final List $instances, final AppState $state, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C285@17334L169,285@17257L284:LaunchPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2083232617, $changed, -1, "com.pymcl.android.ui.pages.ConfigCard.<anonymous>.<anonymous>.<anonymous> (LaunchPage.kt:285)");
            }
            int iCoerceAtLeast = RangesKt.coerceAtLeast($instances.indexOf($state.getSelectedInstance()), 0);
            ComposerKt.sourceInformationMarkerStart($composer, 531787698, "CC(remember):LaunchPage.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($instances) | $composer.changedInstance($state);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.LaunchPageKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return LaunchPageKt.ConfigCard$lambda$21$0$0$0$0($instances, $state, ((Integer) obj2).intValue());
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Combo($instances, iCoerceAtLeast, (Function1) objRememberedValue, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, false, $composer, 27648, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConfigCard$lambda$21$0$0$0$0(List $instances, AppState $state, int i) {
        String n = (String) CollectionsKt.getOrNull($instances, i);
        if (n == null) {
            return Unit.INSTANCE;
        }
        if (!Intrinsics.areEqual(n, $state.getSelectedInstance())) {
            $state.setSelectedInstance(n);
            $state.setSelectedVersion("");
            $state.refreshData();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConfigCard$lambda$21$0$1(final AppState $state, final List $versions, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C:LaunchPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1630466912, $changed, -1, "com.pymcl.android.ui.pages.ConfigCard.<anonymous>.<anonymous>.<anonymous> (LaunchPage.kt:286)");
            }
            if ($state.getInstalledVersions().isEmpty()) {
                $composer.startReplaceGroup(-784359180);
                ComposerKt.sourceInformation($composer, "286@17690L40,286@17614L116");
                BtnKind btnKind = BtnKind.Soft;
                ImageVector download = Ico.INSTANCE.getDownload();
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart($composer, -784356824, "CC(remember):LaunchPage.kt#9igjgp");
                boolean zChangedInstance = $composer.changedInstance($state);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.pymcl.android.ui.pages.LaunchPageKt$$ExternalSyntheticLambda59
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LaunchPageKt.ConfigCard$lambda$21$0$1$0$0($state);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                UiKt.Btn("下载游戏", btnKind, download, false, false, modifierFillMaxWidth$default, false, (Function0) objRememberedValue, $composer, 196662, 88);
            } else {
                $composer.startReplaceGroup(-784355214);
                ComposerKt.sourceInformation($composer, "286@17810L66,286@17736L178");
                int iCoerceAtLeast = RangesKt.coerceAtLeast($versions.indexOf($state.getSelectedVersion()), 0);
                ComposerKt.sourceInformationMarkerStart($composer, -784352958, "CC(remember):LaunchPage.kt#9igjgp");
                boolean zChangedInstance2 = $composer.changedInstance($versions) | $composer.changedInstance($state);
                Object objRememberedValue2 = $composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function1() { // from class: com.pymcl.android.ui.pages.LaunchPageKt$$ExternalSyntheticLambda60
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return LaunchPageKt.ConfigCard$lambda$21$0$1$1$0($versions, $state, ((Integer) obj3).intValue());
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                    objRememberedValue2 = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                UiKt.Combo($versions, iCoerceAtLeast, (Function1) objRememberedValue2, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, false, $composer, 27648, 32);
            }
            $composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConfigCard$lambda$21$0$1$0$0(AppState $state) {
        $state.navigate(Destination.Versions);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConfigCard$lambda$21$0$1$1$0(List $versions, AppState $state, int i) {
        String str = (String) CollectionsKt.getOrNull($versions, i);
        if (str != null) {
            $state.setSelectedVersion(str);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConfigCard$lambda$21$0$2(final List $accounts, final AppState $state, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C:LaunchPage.kt#vz4689");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1409718367, $changed, -1, "com.pymcl.android.ui.pages.ConfigCard.<anonymous>.<anonymous>.<anonymous> (LaunchPage.kt:288)");
            }
            if (!$accounts.isEmpty()) {
                $composer.startReplaceGroup(-1824646930);
                ComposerKt.sourceInformation($composer, "289@18183L127,289@18111L237");
                int iCoerceAtLeast = RangesKt.coerceAtLeast($accounts.indexOf($state.getActiveAccount()), 0);
                ComposerKt.sourceInformationMarkerStart($composer, -1824644736, "CC(remember):LaunchPage.kt#9igjgp");
                boolean zChangedInstance = $composer.changedInstance($accounts) | $composer.changedInstance($state);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.LaunchPageKt$$ExternalSyntheticLambda52
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LaunchPageKt.ConfigCard$lambda$21$0$2$1$0($accounts, $state, ((Integer) obj2).intValue());
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                UiKt.Combo($accounts, iCoerceAtLeast, (Function1) objRememberedValue, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, false, $composer, 27648, 32);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-1824651002);
                ComposerKt.sourceInformation($composer, "288@18052L37,288@17988L101");
                BtnKind btnKind = BtnKind.Soft;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart($composer, -1824649018, "CC(remember):LaunchPage.kt#9igjgp");
                boolean zChangedInstance2 = $composer.changedInstance($state);
                Object objRememberedValue2 = $composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function0() { // from class: com.pymcl.android.ui.pages.LaunchPageKt$$ExternalSyntheticLambda51
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LaunchPageKt.ConfigCard$lambda$21$0$2$0$0($state);
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                    objRememberedValue2 = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                UiKt.Btn("添加离线账号", btnKind, null, false, false, modifierFillMaxWidth$default, false, (Function0) objRememberedValue2, $composer, 196662, 92);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConfigCard$lambda$21$0$2$0$0(AppState $state) {
        $state.open(DialogSpec.OfflineAdd.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConfigCard$lambda$21$0$2$1$0(List $accounts, AppState $state, int i) {
        String n = (String) CollectionsKt.getOrNull($accounts, i);
        if (n == null) {
            return Unit.INSTANCE;
        }
        $state.launch(new LaunchPageKt$ConfigCard$3$1$3$2$1$1($state, n, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConfigCard$lambda$21$0$3(final MutableIntState $java$delegate, final MutableState $loaded$delegate, final AppState $state, final Context $ctx, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C292@18494L322,292@18412L504:LaunchPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-154936350, $changed, -1, "com.pymcl.android.ui.pages.ConfigCard.<anonymous>.<anonymous>.<anonymous> (LaunchPage.kt:292)");
            }
            Iterable java_options = LaunchConfigLogic.INSTANCE.getJAVA_OPTIONS();
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(java_options, 10));
            Iterator it = java_options.iterator();
            while (it.hasNext()) {
                arrayList.add(I18nKt.tr((String) it.next(), new Object[0]));
            }
            ArrayList arrayList2 = (List) arrayList;
            int iConfigCard$lambda$13 = ConfigCard$lambda$13($java$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, 1430026532, "CC(remember):LaunchPage.kt#9igjgp");
            boolean zChanged = $composer.changed($java$delegate) | $composer.changed($loaded$delegate) | $composer.changedInstance($state) | $composer.changedInstance($ctx);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.LaunchPageKt$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return LaunchPageKt.ConfigCard$lambda$21$0$3$1$0($state, $java$delegate, $loaded$delegate, $ctx, ((Integer) obj2).intValue());
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            Function1 function1 = (Function1) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Combo(arrayList2, iConfigCard$lambda$13, function1, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, (ConfigCard$lambda$1($loaded$delegate) == null || $state.getInstanceNames().isEmpty()) ? false : true, $composer, 27648, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConfigCard$lambda$21$0$3$1$0(AppState $state, MutableIntState $java$delegate, MutableState $loaded$delegate, Context $ctx, int i) {
        if (i == ConfigCard$lambda$13($java$delegate) || ConfigCard$lambda$1($loaded$delegate) == null) {
            return Unit.INSTANCE;
        }
        String inst = $state.getSelectedInstance();
        $java$delegate.setIntValue(i);
        $state.launch(new LaunchPageKt$ConfigCard$3$1$4$2$1$1($ctx, inst, i, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit ConfigCard$lambda$21$0$4(final androidx.compose.runtime.MutableFloatState r35, final int r36, androidx.compose.runtime.MutableState r37, androidx.compose.runtime.Composer r38, int r39) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.LaunchPageKt.ConfigCard$lambda$21$0$4(androidx.compose.runtime.MutableFloatState, int, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConfigCard$lambda$21$0$4$0$0$0(int $memMax, MutableFloatState $mem$delegate, float it) {
        $mem$delegate.setFloatValue(LaunchConfigLogic.INSTANCE.clampMem(MathKt.roundToInt(it), $memMax));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0224 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0295  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit ConfigCard$lambda$21$0$5(final androidx.compose.runtime.MutableState r53, final androidx.compose.runtime.MutableState r54, androidx.compose.runtime.Composer r55, int r56) {
        /*
            Method dump skipped, instructions count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.LaunchPageKt.ConfigCard$lambda$21$0$5(androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConfigCard$lambda$21$0$5$0$0$0(MutableState $w$delegate, String v) throws IOException {
        Intrinsics.checkNotNullParameter(v, "v");
        String str = v;
        Appendable sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        $w$delegate.setValue(StringsKt.take(((StringBuilder) sb).toString(), 5));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConfigCard$lambda$21$0$5$0$1$0(MutableState $h$delegate, String v) throws IOException {
        Intrinsics.checkNotNullParameter(v, "v");
        String str = v;
        Appendable sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        $h$delegate.setValue(StringsKt.take(((StringBuilder) sb).toString(), 5));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConfigCard$lambda$21$1$0$0(AppState $state) {
        $state.open(DialogSpec.MicrosoftLogin.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConfigCard$lambda$21$1$1$0(AppState $state) {
        $state.open(DialogSpec.AuthlibLogin.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConfigCard$lambda$21$1$2$0(AppState $state) {
        if (StringsKt.isBlank($state.getSelectedVersion())) {
            $state.toast("没有版本", "先安装并选中一个版本", "warn");
        } else {
            $state.open(new DialogSpec.VersionSetup($state.getSelectedVersion()));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x02fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void LabeledRow(java.lang.String r53, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r54, androidx.compose.runtime.Composer r55, final int r56) {
        /*
            Method dump skipped, instructions count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.LaunchPageKt.LabeledRow(java.lang.String, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int):void");
    }

    private static final void LogCard(final AppState state, Modifier modifier, Composer $composer, final int $changed) {
        final Modifier modifier2;
        Composer $composer2 = $composer.startRestartGroup(1372293832);
        ComposerKt.sourceInformation($composer2, "C(LogCard)P(1)333@21093L7,334@21142L411,334@21127L426:LaunchPage.kt#vz4689");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= ($changed & 8) == 0 ? $composer2.changed(state) : $composer2.changedInstance(state) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(modifier) ? 32 : 16;
        }
        if (!$composer2.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            modifier2 = modifier;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1372293832, $dirty, -1, "com.pymcl.android.ui.pages.LogCard (LaunchPage.kt:332)");
            }
            ProvidableCompositionLocal<ClipboardManager> localClipboardManager = CompositionLocalsKt.getLocalClipboardManager();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localClipboardManager);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final ClipboardManager clip = (ClipboardManager) objConsume;
            modifier2 = modifier;
            UiKt.m7594CardDzVHIIc(modifier2, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-930756520, true, new Function3() { // from class: com.pymcl.android.ui.pages.LaunchPageKt$$ExternalSyntheticLambda31
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return LaunchPageKt.LogCard$lambda$0(state, clip, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, (($dirty >> 3) & 14) | 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.pages.LaunchPageKt$$ExternalSyntheticLambda32
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LaunchPageKt.LogCard$lambda$1(state, modifier2, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LogCard$lambda$0(final AppState $state, final ClipboardManager $clip, ColumnScope Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C335@21169L242,335@21152L259,340@21498L49:LaunchPage.kt#vz4689");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(Card) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if (!$composer.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-930756520, $dirty2, -1, "com.pymcl.android.ui.pages.LogCard.<anonymous> (LaunchPage.kt:335)");
            }
            CardHead("实时日志", ComposableLambdaKt.rememberComposableLambda(-417409774, true, new Function3() { // from class: com.pymcl.android.ui.pages.LaunchPageKt$$ExternalSyntheticLambda33
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return LaunchPageKt.LogCard$lambda$0$0($clip, $state, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 54, 0);
            SnapshotStateList<String> launchLog = $state.getLaunchLog();
            if (launchLog.isEmpty()) {
                launchLog = CollectionsKt.listOf("[PyMCL] " + I18nKt.tr("就绪", new Object[0]));
            }
            List lines = launchLog;
            UiKt.LogBox(lines, ColumnScope.weight$default(Card, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null), null, $composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LogCard$lambda$0$0(final ClipboardManager $clip, final AppState $state, RowScope CardHead, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(CardHead, "$this$CardHead");
        ComposerKt.sourceInformation($composer, "C336@21210L126,336@21183L153,337@21374L27,337@21349L52:LaunchPage.kt#vz4689");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-417409774, $changed, -1, "com.pymcl.android.ui.pages.LogCard.<anonymous>.<anonymous> (LaunchPage.kt:336)");
            }
            BtnKind btnKind = BtnKind.Ghost;
            ComposerKt.sourceInformationMarkerStart($composer, -1698832848, "CC(remember):LaunchPage.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($clip) | $composer.changedInstance($state);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.pymcl.android.ui.pages.LaunchPageKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LaunchPageKt.LogCard$lambda$0$0$0$0($clip, $state);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Btn("复制日志", btnKind, null, false, false, null, false, (Function0) objRememberedValue, $composer, 54, 124);
            BtnKind btnKind2 = BtnKind.Ghost;
            ComposerKt.sourceInformationMarkerStart($composer, -1698827699, "CC(remember):LaunchPage.kt#9igjgp");
            boolean zChangedInstance2 = $composer.changedInstance($state);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.pymcl.android.ui.pages.LaunchPageKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LaunchPageKt.LogCard$lambda$0$0$1$0($state);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Btn("清空", btnKind2, null, false, false, null, false, (Function0) objRememberedValue2, $composer, 54, 124);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LogCard$lambda$0$0$0$0(ClipboardManager $clip, AppState $state) {
        $clip.setText(new AnnotatedString(CollectionsKt.joinToString$default($state.getLaunchLog(), StringUtils.LF, null, null, 0, null, null, 62, null), null, 2, null));
        AppState.toast$default($state, "已复制", "日志已放进剪贴板", null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LogCard$lambda$0$0$1$0(AppState $state) {
        $state.getLaunchLog().clear();
        return Unit.INSTANCE;
    }

    private static final void NewsCard(final AppState state, Modifier modifier, Composer $composer, final int $changed) {
        final Modifier modifier2;
        Composer $composer2 = $composer.startRestartGroup(1682357245);
        ComposerKt.sourceInformation($composer2, "C(NewsCard)P(1):LaunchPage.kt#vz4689");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= ($changed & 8) == 0 ? $composer2.changed(state) : $composer2.changedInstance(state) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(modifier) ? 32 : 16;
        }
        if (!$composer2.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            modifier2 = modifier;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1682357245, $dirty, -1, "com.pymcl.android.ui.pages.NewsCard (LaunchPage.kt:345)");
            }
            HomepageLogic.Mode mode = HomepageLogic.INSTANCE.mode(state.getSettings().getHomepage(), state.getSettings().getCustomHomepage());
            switch (WhenMappings.$EnumSwitchMapping$2[mode.ordinal()]) {
                case 1:
                    modifier2 = modifier;
                    $composer2.startReplaceGroup(1837619446);
                    ComposerKt.sourceInformation($composer2, "349@21898L25");
                    NewsFeed(state, modifier2, $composer2, AppState.$stable | ($dirty & 14) | ($dirty & 112));
                    $composer2.endReplaceGroup();
                    break;
                case 2:
                    modifier2 = modifier;
                    $composer2.startReplaceGroup(1837622252);
                    ComposerKt.sourceInformation($composer2, "350@21983L111");
                    UiKt.m7594CardDzVHIIc(modifier2, 0.0f, null, ComposableSingletons$LaunchPageKt.INSTANCE.getLambda$62218958$PyMCL_Android_app_debug(), $composer2, (($dirty >> 3) & 14) | 3072, 6);
                    $composer2.endReplaceGroup();
                    break;
                case 3:
                    $composer2.startReplaceGroup(1837627956);
                    ComposerKt.sourceInformation($composer2, "351@22174L168,351@22159L183");
                    modifier2 = modifier;
                    UiKt.m7594CardDzVHIIc(modifier2, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(47968813, true, new Function3() { // from class: com.pymcl.android.ui.pages.LaunchPageKt$$ExternalSyntheticLambda29
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return LaunchPageKt.NewsCard$lambda$0(state, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    }, $composer2, 54), $composer2, (($dirty >> 3) & 14) | 3072, 6);
                    $composer2.endReplaceGroup();
                    break;
                case 4:
                    $composer2.startReplaceGroup(1837635610);
                    ComposerKt.sourceInformation($composer2, "355@22402L61");
                    LocalHomepage(state, modifier, state.getSettings().getCustomHomepage(), $composer2, AppState.$stable | ($dirty & 14) | ($dirty & 112));
                    $composer2.endReplaceGroup();
                    modifier2 = modifier;
                    break;
                default:
                    $composer2.startReplaceGroup(1837617760);
                    $composer2.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.pages.LaunchPageKt$$ExternalSyntheticLambda30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LaunchPageKt.NewsCard$lambda$1(state, modifier2, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewsCard$lambda$0(final AppState $state, ColumnScope Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C352@22205L72,352@22188L89,353@22290L42:LaunchPage.kt#vz4689");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(47968813, $changed, -1, "com.pymcl.android.ui.pages.NewsCard.<anonymous> (LaunchPage.kt:352)");
            }
            CardHead("新闻主页", ComposableLambdaKt.rememberComposableLambda(2038733363, true, new Function3() { // from class: com.pymcl.android.ui.pages.LaunchPageKt$$ExternalSyntheticLambda28
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return LaunchPageKt.NewsCard$lambda$0$0($state, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 54, 0);
            UiKt.Muted("未设置自定义主页。到设置 → 启动页主页 填本地 HTML 路径。", null, false, 0, $composer, 6, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewsCard$lambda$0$0(final AppState $state, RowScope CardHead, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(CardHead, "$this$CardHead");
        ComposerKt.sourceInformation($composer, "C352@22235L40,352@22207L68:LaunchPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2038733363, $changed, -1, "com.pymcl.android.ui.pages.NewsCard.<anonymous>.<anonymous> (LaunchPage.kt:352)");
            }
            ImageVector gear = Ico.INSTANCE.getGear();
            String strTr = I18nKt.tr("设置", new Object[0]);
            ComposerKt.sourceInformationMarkerStart($composer, 717675867, "CC(remember):LaunchPage.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($state);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.pymcl.android.ui.pages.LaunchPageKt$$ExternalSyntheticLambda72
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LaunchPageKt.NewsCard$lambda$0$0$0$0($state);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.m7597IconBtndrOMvmE(gear, strTr, null, (Function0) objRememberedValue, $composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewsCard$lambda$0$0$0$0(AppState $state) {
        $state.navigate(Destination.Settings);
        return Unit.INSTANCE;
    }

    private static final void LocalHomepage(final AppState state, final Modifier modifier, final String path, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-1152668270);
        ComposerKt.sourceInformation($composer2, "C(LocalHomepage)P(2)361@22582L33,362@22632L64,363@22730L161,363@22701L190,366@22911L1236,366@22896L1251:LaunchPage.kt#vz4689");
        int $dirty = $changed;
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(modifier) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changed(path) ? 256 : 128;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 145) != 144, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1152668270, $dirty2, -1, "com.pymcl.android.ui.pages.LocalHomepage (LaunchPage.kt:360)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, 387357779, "CC(remember):LaunchPage.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objMutableIntStateOf = SnapshotIntStateKt.mutableIntStateOf(0);
                $composer2.updateRememberedValue(objMutableIntStateOf);
                objRememberedValue = objMutableIntStateOf;
            }
            final MutableIntState reload$delegate = (MutableIntState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            int iLocalHomepage$lambda$1 = LocalHomepage$lambda$1(reload$delegate);
            ComposerKt.sourceInformationMarkerStart($composer2, 387359410, "CC(remember):LaunchPage.kt#9igjgp");
            boolean zChanged = $composer2.changed(iLocalHomepage$lambda$1) | (($dirty2 & User32.WM_PENWINFIRST) == 256);
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue2 = objMutableStateOf$default;
            }
            final MutableState html$delegate = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Integer numValueOf = Integer.valueOf(LocalHomepage$lambda$1(reload$delegate));
            ComposerKt.sourceInformationMarkerStart($composer2, 387362643, "CC(remember):LaunchPage.kt#9igjgp");
            boolean zChanged2 = $composer2.changed(html$delegate) | (($dirty2 & User32.WM_PENWINFIRST) == 256);
            Object objRememberedValue3 = $composer2.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj = (Function2) new LaunchPageKt$LocalHomepage$1$1(path, html$delegate, null);
                $composer2.updateRememberedValue(obj);
                objRememberedValue3 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(path, numValueOf, (Function2) objRememberedValue3, $composer2, ($dirty2 >> 6) & 14);
            UiKt.m7594CardDzVHIIc(modifier, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1755183618, true, new Function3() { // from class: com.pymcl.android.ui.pages.LaunchPageKt$$ExternalSyntheticLambda73
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return LaunchPageKt.LocalHomepage$lambda$7(reload$delegate, html$delegate, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer2, 54), $composer2, (($dirty2 >> 3) & 14) | 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.pages.LaunchPageKt$$ExternalSyntheticLambda74
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return LaunchPageKt.LocalHomepage$lambda$8(state, modifier, path, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final int LocalHomepage$lambda$1(MutableIntState $reload$delegate) {
        return $reload$delegate.getIntValue();
    }

    private static final Result<String> LocalHomepage$lambda$4(MutableState<Result<String>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LocalHomepage$lambda$7(final MutableIntState $reload$delegate, MutableState $html$delegate, ColumnScope Card, Composer $composer, int $changed) {
        String message;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C367@22938L47,367@22921L64:LaunchPage.kt#vz4689");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(Card) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if ($composer.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1755183618, $dirty2, -1, "com.pymcl.android.ui.pages.LocalHomepage.<anonymous> (LaunchPage.kt:367)");
            }
            CardHead("新闻主页", ComposableLambdaKt.rememberComposableLambda(188541832, true, new Function3() { // from class: com.pymcl.android.ui.pages.LaunchPageKt$$ExternalSyntheticLambda34
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return LaunchPageKt.LocalHomepage$lambda$7$0($reload$delegate, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 54, 0);
            final Result r = LocalHomepage$lambda$4($html$delegate);
            if (r == null) {
                $composer.startReplaceGroup(-1190685985);
                ComposerKt.sourceInformation($composer, "370@23097L6,370@23123L6,370@23047L93");
                BoxKt.Box(BackgroundKt.m247backgroundbw27NRU$default(ClipKt.clip(SizeKt.m771height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7018constructorimpl(36)), Py.INSTANCE.getShapes($composer, 6).getCtl()), Py.INSTANCE.getColors($composer, 6).m7972getLineSoft0d7_KjU(), null, 2, null), $composer, 0);
                $composer.endReplaceGroup();
            } else if (Result.m8122isFailureimpl(r.getValue())) {
                $composer.startReplaceGroup(-1190682133);
                ComposerKt.sourceInformation($composer, "371@23168L73");
                String strTr = I18nKt.tr("读不了自定义主页：", new Object[0]);
                Throwable thM8119exceptionOrNullimpl = Result.m8119exceptionOrNullimpl(r.getValue());
                if (thM8119exceptionOrNullimpl == null || (message = thM8119exceptionOrNullimpl.getMessage()) == null) {
                    message = "";
                }
                UiKt.Muted(strTr + message, null, true, 0, $composer, 384, 10);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(1743708219);
                ComposerKt.sourceInformation($composer, "380@24105L6,373@23333L508,379@23868L165,372@23294L837");
                Modifier modifierClip = ClipKt.clip(ColumnScope.weight$default(Card, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null), Py.INSTANCE.getShapes($composer, 6).getCtl());
                ComposerKt.sourceInformationMarkerStart($composer, -1190676418, "CC(remember):LaunchPage.kt#9igjgp");
                Object objRememberedValue = $composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.LaunchPageKt$$ExternalSyntheticLambda35
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LaunchPageKt.LocalHomepage$lambda$7$1$0((Context) obj2);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                Function1 function1 = (Function1) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerStart($composer, -1190659641, "CC(remember):LaunchPage.kt#9igjgp");
                boolean zChangedInstance = $composer.changedInstance(r);
                Object objRememberedValue2 = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function1() { // from class: com.pymcl.android.ui.pages.LaunchPageKt$$ExternalSyntheticLambda36
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return LaunchPageKt.LocalHomepage$lambda$7$2$0(r, (WebView) obj3);
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                    objRememberedValue2 = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                AndroidView_androidKt.AndroidView(function1, modifierClip, (Function1) objRememberedValue2, $composer, 6, 0);
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
    public static final Unit LocalHomepage$lambda$7$0(final MutableIntState $reload$delegate, RowScope CardHead, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(CardHead, "$this$CardHead");
        ComposerKt.sourceInformation($composer, "C367@22971L12,367@22940L43:LaunchPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(188541832, $changed, -1, "com.pymcl.android.ui.pages.LocalHomepage.<anonymous>.<anonymous> (LaunchPage.kt:367)");
            }
            ImageVector refresh = Ico.INSTANCE.getRefresh();
            String strTr = I18nKt.tr("刷新", new Object[0]);
            ComposerKt.sourceInformationMarkerStart($composer, 800075188, "CC(remember):LaunchPage.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.pymcl.android.ui.pages.LaunchPageKt$$ExternalSyntheticLambda50
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LaunchPageKt.LocalHomepage$lambda$7$0$0$0($reload$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.m7597IconBtndrOMvmE(refresh, strTr, null, (Function0) objRememberedValue, $composer, 3072, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LocalHomepage$lambda$7$0$0$0(MutableIntState $reload$delegate) {
        $reload$delegate.setIntValue(LocalHomepage$lambda$1($reload$delegate) + 1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebView LocalHomepage$lambda$7$1$0(Context c) {
        Intrinsics.checkNotNullParameter(c, "c");
        WebView webView = new WebView(c);
        webView.getSettings().setJavaScriptEnabled(false);
        webView.getSettings().setAllowFileAccess(false);
        webView.getSettings().setAllowContentAccess(false);
        webView.setWebViewClient(new WebViewClient() { // from class: com.pymcl.android.ui.pages.LaunchPageKt$LocalHomepage$2$2$1$1$1
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView v, WebResourceRequest req) {
                return true;
            }
        });
        webView.setBackgroundColor(0);
        return webView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LocalHomepage$lambda$7$2$0(Result $r, WebView v) {
        Intrinsics.checkNotNullParameter(v, "v");
        Object value = $r.getValue();
        if (Result.m8122isFailureimpl(value)) {
            value = null;
        }
        String str = (String) value;
        if (str == null) {
            str = "";
        }
        String body = str;
        if (!Intrinsics.areEqual(v.getTag(), Integer.valueOf(body.hashCode()))) {
            v.setTag(Integer.valueOf(body.hashCode()));
            v.loadDataWithBaseURL(null, body, "text/html", "utf-8", null);
        }
        return Unit.INSTANCE;
    }

    private static final void NewsFeed(final AppState state, final Modifier modifier, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-818495185);
        ComposerKt.sourceInformation($composer2, "C(NewsFeed)P(1)388@24239L50,389@24315L74,389@24294L95,390@24409L906,390@24394L921:LaunchPage.kt#vz4689");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= ($changed & 8) == 0 ? $composer2.changed(state) : $composer2.changedInstance(state) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(modifier) ? 32 : 16;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-818495185, $dirty2, -1, "com.pymcl.android.ui.pages.NewsFeed (LaunchPage.kt:387)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, -594855391, "CC(remember):LaunchPage.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            }
            final MutableState news$delegate = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer2, -594852935, "CC(remember):LaunchPage.kt#9igjgp");
            boolean z = ($dirty2 & 14) == 4 || (($dirty2 & 8) != 0 && $composer2.changedInstance(state));
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj = (Function2) new LaunchPageKt$NewsFeed$1$1(state, news$delegate, null);
                $composer2.updateRememberedValue(obj);
                objRememberedValue2 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, $composer2, 6);
            UiKt.m7594CardDzVHIIc(modifier, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(801387935, true, new Function3() { // from class: com.pymcl.android.ui.pages.LaunchPageKt$$ExternalSyntheticLambda44
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return LaunchPageKt.NewsFeed$lambda$4(state, news$delegate, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer2, 54), $composer2, (($dirty2 >> 3) & 14) | 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.pages.LaunchPageKt$$ExternalSyntheticLambda55
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return LaunchPageKt.NewsFeed$lambda$5(state, modifier, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final List<NewsItem> NewsFeed$lambda$1(MutableState<List<NewsItem>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit NewsFeed$lambda$4(final com.pymcl.android.ui.state.AppState r49, final androidx.compose.runtime.MutableState r50, androidx.compose.foundation.layout.ColumnScope r51, androidx.compose.runtime.Composer r52, int r53) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.LaunchPageKt.NewsFeed$lambda$4(com.pymcl.android.ui.state.AppState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewsFeed$lambda$4$0(final AppState $state, final MutableState $news$delegate, RowScope CardHead, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(CardHead, "$this$CardHead");
        ComposerKt.sourceInformation($composer, "C391@24471L104,391@24438L137:LaunchPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-464732123, $changed, -1, "com.pymcl.android.ui.pages.NewsFeed.<anonymous>.<anonymous> (LaunchPage.kt:391)");
            }
            ImageVector refresh = Ico.INSTANCE.getRefresh();
            String strTr = I18nKt.tr("刷新新闻", new Object[0]);
            ComposerKt.sourceInformationMarkerStart($composer, 69029805, "CC(remember):LaunchPage.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($state);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.pymcl.android.ui.pages.LaunchPageKt$$ExternalSyntheticLambda63
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LaunchPageKt.NewsFeed$lambda$4$0$0$0($state, $news$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.m7597IconBtndrOMvmE(refresh, strTr, null, (Function0) objRememberedValue, $composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewsFeed$lambda$4$0$0$0(AppState $state, MutableState $news$delegate) {
        $news$delegate.setValue(null);
        $state.launch(new LaunchPageKt$NewsFeed$2$1$1$1$1($state, $news$delegate, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit NewsFeed$lambda$4$1$1$0(com.pymcl.android.ui.state.NewsItem r36, androidx.compose.foundation.layout.ColumnScope r37, androidx.compose.runtime.Composer r38, int r39) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.LaunchPageKt.NewsFeed$lambda$4$1$1$0(com.pymcl.android.ui.state.NewsItem, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    private static final void QuickCard(final AppState state, Modifier modifier, Composer $composer, final int $changed) {
        final Modifier modifier2;
        Composer $composer2 = $composer.startRestartGroup(1324627775);
        ComposerKt.sourceInformation($composer2, "C(QuickCard)P(1)414@25952L829,414@25937L844:LaunchPage.kt#vz4689");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= ($changed & 8) == 0 ? $composer2.changed(state) : $composer2.changedInstance(state) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(modifier) ? 32 : 16;
        }
        if ($composer2.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1324627775, $dirty, -1, "com.pymcl.android.ui.pages.QuickCard (LaunchPage.kt:407)");
            }
            final List items = CollectionsKt.listOf((Object[]) new Triple[]{new Triple("下载游戏", Ico.INSTANCE.getGrass(), new NavKey(Destination.Versions, null, 2, null)), new Triple("装模组", Ico.INSTANCE.getPuzzle(), new NavKey(Destination.Library, CatalogKind.Mod)), new Triple("整合包", Ico.INSTANCE.getBox(), new NavKey(Destination.Library, CatalogKind.Modpack)), new Triple("实例", Ico.INSTANCE.getCube(), new NavKey(Destination.Instances, null, 2, null)), new Triple("账号", Ico.INSTANCE.getPerson(), new NavKey(Destination.Accounts, null, 2, null)), new Triple("问 AI", Ico.INSTANCE.getSparkle(), new NavKey(Destination.Ai, null, 2, null)), new Triple("联机", Ico.INSTANCE.getWifi(), new NavKey(Destination.Multiplayer, null, 2, null)), new Triple("设置", Ico.INSTANCE.getGear(), new NavKey(Destination.Settings, null, 2, null))});
            modifier2 = modifier;
            UiKt.m7594CardDzVHIIc(modifier2, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1396943, true, new Function3() { // from class: com.pymcl.android.ui.pages.LaunchPageKt$$ExternalSyntheticLambda54
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return LaunchPageKt.QuickCard$lambda$0(items, state, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, (($dirty >> 3) & 14) | 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            modifier2 = modifier;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.pages.LaunchPageKt$$ExternalSyntheticLambda56
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LaunchPageKt.QuickCard$lambda$1(state, modifier2, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x05b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit QuickCard$lambda$0(java.util.List r103, com.pymcl.android.ui.state.AppState r104, androidx.compose.foundation.layout.ColumnScope r105, androidx.compose.runtime.Composer r106, int r107) {
        /*
            Method dump skipped, instructions count: 1469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.LaunchPageKt.QuickCard$lambda$0(java.util.List, com.pymcl.android.ui.state.AppState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuickCard$lambda$0$0$0$0$0$0$0(AppState $state, NavKey $key) {
        $state.navigate($key);
        return Unit.INSTANCE;
    }

    private static final void NotesCard(final AppState state, Modifier modifier, Composer $composer, final int $changed) {
        final Modifier modifier2;
        Composer $composer2 = $composer.startRestartGroup(-539384085);
        ComposerKt.sourceInformation($composer2, "C(NotesCard)P(1)433@26877L223,433@26862L238:LaunchPage.kt#vz4689");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= ($changed & 8) == 0 ? $composer2.changed(state) : $composer2.changedInstance(state) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(modifier) ? 32 : 16;
        }
        if (!$composer2.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            modifier2 = modifier;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-539384085, $dirty, -1, "com.pymcl.android.ui.pages.NotesCard (LaunchPage.kt:432)");
            }
            modifier2 = modifier;
            UiKt.m7594CardDzVHIIc(modifier2, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1862614917, true, new Function3() { // from class: com.pymcl.android.ui.pages.LaunchPageKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return LaunchPageKt.NotesCard$lambda$0(state, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, (($dirty >> 3) & 14) | 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.pages.LaunchPageKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LaunchPageKt.NotesCard$lambda$1(state, modifier2, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NotesCard$lambda$0(final AppState $state, ColumnScope Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C434@26887L14,435@26929L20,435@26910L184:LaunchPage.kt#vz4689");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(Card) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if ($composer.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1862614917, $dirty2, -1, "com.pymcl.android.ui.pages.NotesCard.<anonymous> (LaunchPage.kt:434)");
            }
            CardHead("便签", null, $composer, 6, 2);
            String notes = $state.getNotes();
            ComposerKt.sourceInformationMarkerStart($composer, 1028428879, "CC(remember):LaunchPage.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($state);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.pages.LaunchPageKt$$ExternalSyntheticLambda75
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return LaunchPageKt.NotesCard$lambda$0$0$0($state, (String) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.m7599InputxAketlw(notes, (Function1) objRememberedValue, "随手记点什么…", ColumnScope.weight$default(Card, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null), false, false, 0, 20, 0, ImeAction.INSTANCE.m6639getDefaulteUduSuo(), null, null, false, false, false, $composer, 818086272, 0, 32080);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NotesCard$lambda$0$0$0(AppState $state, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $state.setNotes(it);
        return Unit.INSTANCE;
    }

    private static final void PlaytimeCard(final AppState state, Modifier modifier, Composer $composer, final int $changed) {
        final Modifier modifier2 = modifier;
        Composer $composer2 = $composer.startRestartGroup(362648719);
        ComposerKt.sourceInformation($composer2, "C(PlaytimeCard)P(1)441@27197L34,442@27257L56,442@27236L77,443@27329L27,444@27373L6,445@27414L46,445@27392L68,446@27480L225,446@27465L240:LaunchPage.kt#vz4689");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= ($changed & 8) == 0 ? $composer2.changed(state) : $composer2.changedInstance(state) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(modifier2) ? 32 : 16;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(362648719, $dirty2, -1, "com.pymcl.android.ui.pages.PlaytimeCard (LaunchPage.kt:440)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, 613070353, "CC(remember):LaunchPage.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objMutableLongStateOf = SnapshotLongStateKt.mutableLongStateOf(0L);
                $composer2.updateRememberedValue(objMutableLongStateOf);
                objRememberedValue = objMutableLongStateOf;
            }
            MutableLongState total$delegate = (MutableLongState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer2, 613072295, "CC(remember):LaunchPage.kt#9igjgp");
            boolean z = ($dirty2 & 14) == 4 || (($dirty2 & 8) != 0 && $composer2.changedInstance(state));
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj = (Function2) new LaunchPageKt$PlaytimeCard$1$1(state, total$delegate, null);
                $composer2.updateRememberedValue(obj);
                objRememberedValue2 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, $composer2, 6);
            ComposerKt.sourceInformationMarkerStart($composer2, 613074570, "CC(remember):LaunchPage.kt#9igjgp");
            Object objRememberedValue3 = $composer2.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object objAnimatable$default = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                $composer2.updateRememberedValue(objAnimatable$default);
                objRememberedValue3 = objAnimatable$default;
            }
            final Animatable anim = (Animatable) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            int cu = Py.INSTANCE.getMotion($composer2, 6).getCountUp();
            Long lValueOf = Long.valueOf(PlaytimeCard$lambda$1(total$delegate));
            ComposerKt.sourceInformationMarkerStart($composer2, 613077309, "CC(remember):LaunchPage.kt#9igjgp");
            boolean zChangedInstance = $composer2.changedInstance(anim) | $composer2.changed(cu);
            Object objRememberedValue4 = $composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = (Function2) new LaunchPageKt$PlaytimeCard$2$1(anim, cu, total$delegate, null);
                $composer2.updateRememberedValue(obj2);
                objRememberedValue4 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(lValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, $composer2, 0);
            modifier2 = modifier;
            UiKt.m7594CardDzVHIIc(modifier2, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-797224705, true, new Function3() { // from class: com.pymcl.android.ui.pages.LaunchPageKt$$ExternalSyntheticLambda70
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    return LaunchPageKt.PlaytimeCard$lambda$6(anim, (ColumnScope) obj3, (Composer) obj4, ((Integer) obj5).intValue());
                }
            }, $composer2, 54), $composer2, (($dirty2 >> 3) & 14) | 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.pages.LaunchPageKt$$ExternalSyntheticLambda71
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return LaunchPageKt.PlaytimeCard$lambda$7(state, modifier2, $changed, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long PlaytimeCard$lambda$1(MutableLongState $total$delegate) {
        return $total$delegate.getLongValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlaytimeCard$lambda$6(Animatable $anim, ColumnScope Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C447@27490L16,448@27515L27,449@27601L4,449@27621L6,449@27551L88,450@27648L15,451@27672L27:LaunchPage.kt#vz4689");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(Card) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if ($composer.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-797224705, $dirty2, -1, "com.pymcl.android.ui.pages.PlaytimeCard.<anonymous> (LaunchPage.kt:447)");
            }
            CardHead("游戏时长", null, $composer, 6, 2);
            SpacerKt.Spacer(ColumnScope.weight$default(Card, Modifier.INSTANCE, 1.0f, false, 2, null), $composer, 0);
            TextKt.m2843Text4IGK_g(fmtDuration((long) ((Number) $anim.getValue()).floatValue()), (Modifier) null, Py.INSTANCE.getColors($composer, 6).m7955getAccentText0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, Py.INSTANCE.getType($composer, 6).getH1(), $composer, 0, 0, 65530);
            UiKt.Muted("累计游玩时间", null, false, 0, $composer, 6, 14);
            SpacerKt.Spacer(ColumnScope.weight$default(Card, Modifier.INSTANCE, 1.0f, false, 2, null), $composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final String fmtDuration(long sec) {
        long j = 3600;
        long h = sec / j;
        long m = (sec % j) / 60;
        return (h > 0 ? new StringBuilder().append(h).append("h ") : new StringBuilder()).append(m).append("m").toString();
    }

    private static final void TasksSummaryCard(final AppState state, Modifier modifier, Composer $composer, final int $changed) {
        final Modifier modifier2;
        Composer $composer2 = $composer.startRestartGroup(736239800);
        ComposerKt.sourceInformation($composer2, "C(TasksSummaryCard)P(1)459@27938L676,459@27923L691:LaunchPage.kt#vz4689");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= ($changed & 8) == 0 ? $composer2.changed(state) : $composer2.changedInstance(state) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(modifier) ? 32 : 16;
        }
        if (!$composer2.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            modifier2 = modifier;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(736239800, $dirty, -1, "com.pymcl.android.ui.pages.TasksSummaryCard (LaunchPage.kt:458)");
            }
            modifier2 = modifier;
            UiKt.m7594CardDzVHIIc(modifier2, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1884543704, true, new Function3() { // from class: com.pymcl.android.ui.pages.LaunchPageKt$$ExternalSyntheticLambda38
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return LaunchPageKt.TasksSummaryCard$lambda$0(state, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, (($dirty >> 3) & 14) | 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.pages.LaunchPageKt$$ExternalSyntheticLambda39
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LaunchPageKt.TasksSummaryCard$lambda$1(state, modifier2, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit TasksSummaryCard$lambda$0(final com.pymcl.android.ui.state.AppState r71, androidx.compose.foundation.layout.ColumnScope r72, androidx.compose.runtime.Composer r73, int r74) {
        /*
            Method dump skipped, instructions count: 1036
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.LaunchPageKt.TasksSummaryCard$lambda$0(com.pymcl.android.ui.state.AppState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TasksSummaryCard$lambda$0$0(final AppState $state, RowScope CardHead, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(CardHead, "$this$CardHead");
        ComposerKt.sourceInformation($composer, "C460@28005L37,460@27967L75:LaunchPage.kt#vz4689");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1143158354, $changed, -1, "com.pymcl.android.ui.pages.TasksSummaryCard.<anonymous>.<anonymous> (LaunchPage.kt:460)");
            }
            ImageVector chevronRight = Ico.INSTANCE.getChevronRight();
            String strTr = I18nKt.tr("下载任务", new Object[0]);
            ComposerKt.sourceInformationMarkerStart($composer, 936450899, "CC(remember):LaunchPage.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($state);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.pymcl.android.ui.pages.LaunchPageKt$$ExternalSyntheticLambda37
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LaunchPageKt.TasksSummaryCard$lambda$0$0$0$0($state);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.m7597IconBtndrOMvmE(chevronRight, strTr, null, (Function0) objRememberedValue, $composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TasksSummaryCard$lambda$0$0$0$0(AppState $state) {
        $state.navigate(Destination.Tasks);
        return Unit.INSTANCE;
    }
}
