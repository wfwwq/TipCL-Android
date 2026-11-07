package com.pymcl.android.ui;

import android.content.Context;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import com.pymcl.android.ui.NavEntry;
import com.pymcl.android.ui.components.Ico;
import com.pymcl.android.ui.pages.AiPageKt;
import com.pymcl.android.ui.pages.CatalogAccountPagesKt;
import com.pymcl.android.ui.pages.GamePagesKt;
import com.pymcl.android.ui.pages.LaunchPageKt;
import com.pymcl.android.ui.pages.MiscPagesKt;
import com.pymcl.android.ui.pages.SettingsPageKt;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.CatalogKind;
import com.pymcl.android.ui.state.NavKey;
import com.pymcl.android.ui.state.TaskRow;
import com.pymcl.android.ui.state.TaskState;
import com.pymcl.android.ui.state.UiSettings;
import com.pymcl.android.ui.theme.Py;
import com.pymcl.android.ui.theme.PyColors;
import com.pymcl.android.ui.theme.PyMotion;
import java.awt.Graphics;
import java.awt.Shape;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.lwjgl.system.windows.User32;
import org.lwjgl.util.shaderc.SPV;
import sun.awt.RepaintArea;

/* compiled from: PyMclApp.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0005\u001a\n\u0010\u0006\u001a\u00020\u0004*\u00020\u0007\u001a\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0004H\u0002\u001a\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0005H\u0002\u001a\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0015H\u0003b\u0002\b\u001c¢\u0006\u0002\u0010\u001b\u001a'\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0015H\u0007b\u0002\b\u001cb\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( ¢\u0006\u0002\u0010\u001b\u001a'\u0010!\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0015H\u0003b\u0002\b\u001cb\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( ¢\u0006\u0002\u0010\u001b\u001a7\u0010\"\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0003b\u0002\b\u001cb\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( ¢\u0006\u0002\u0010&\u001a/\u0010'\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010#\u001a\u00020$H\u0003b\u0002\b\u001cb\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( ¢\u0006\u0002\u0010(\u001aA\u0010)\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\t2\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010+\u001a\u00020$H\u0003b\u0002\b\u001cb\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( ¢\u0006\u0002\u0010,\u001am\u0010-\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0000\u001a\u00020\u00012\u0006\u0010.\u001a\u00020$2\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010+\u001a\u00020$2\b\b\u0002\u0010/\u001a\u0002002\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00012\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u001903H\u0003b\u0002\b\u001cb\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( ¢\u0006\u0002\u00104\u001a/\u00105\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u00106\u001a\u000207H\u0003b\u0002\b\u001cb\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( ¢\u0006\u0002\u00108\u001a/\u00109\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010:\u001a\u00020\u0007H\u0007b\u0002\b\u001cb\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( ¢\u0006\u0002\u0010;\u001a/\u0010<\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u00106\u001a\u000207H\u0003b\u0002\b\u001cb\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( ¢\u0006\u0002\u00108\u001a/\u0010=\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u00106\u001a\u000207H\u0003b\u0002\b\u001cb\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( ¢\u0006\u0002\u00108\"\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000\"2\u0010\u0013\u001a&\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u0015 \u0016*\u0012\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u0015\u0018\u00010\u00170\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006>²\u0006\f\u0010?\u001a\u0004\u0018\u00010@X\u008a\u008e\u0002²\u0006\n\u0010A\u001a\u00020BX\u008a\u0084\u0002²\u0006\n\u0010C\u001a\u00020DX\u008a\u0084\u0002"}, d2 = {"icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/pymcl/android/ui/Destination;", "pcTitle", "", "Lcom/pymcl/android/ui/state/CatalogKind;", "title", "Lcom/pymcl/android/ui/state/NavKey;", "item", "Lcom/pymcl/android/ui/NavEntry$Item;", "d", "label", "cat", "k", "groupedNav", "", "Lcom/pymcl/android/ui/NavEntry;", "compactTop", "compactBottom", "extrasMerged", "", "Lcom/pymcl/android/ui/state/AppState;", "kotlin.jvm.PlatformType", "", "MergeSettingsExtras", "", "state", "(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/Composable;", "PyMclApp", "Landroidx/compose/runtime/ComposableTarget;", "applier", "androidx.compose.ui.UiComposable", "Wallpaper", "ChromeBar", "collapsed", "", "showMenu", "(Lcom/pymcl/android/ui/state/AppState;ZZLandroidx/compose/runtime/Composer;I)V", "SideBar", "(Lcom/pymcl/android/ui/state/AppState;ZLandroidx/compose/runtime/Composer;I)V", "NavItemView", "e", "small", "(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/NavEntry$Item;ZZLandroidx/compose/runtime/Composer;II)V", "NavRow", "selected", "badge", "", "trailing", "onClick", "Lkotlin/Function0;", "(Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;ZZZILandroidx/compose/ui/graphics/vector/ImageVector;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "PageHost", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "PageFor", "key", "(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/NavKey;Landroidx/compose/runtime/Composer;I)V", "TaskDock", "ToastHost", "PyMCL-Android:app_debug", "bmp", "Landroidx/compose/ui/graphics/ImageBitmap;", "w", "Landroidx/compose/ui/unit/Dp;", "bg", "Landroidx/compose/ui/graphics/Color;"}, k = 2, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class PyMclAppKt {
    private static final List<NavEntry> groupedNav = CollectionsKt.listOf((Object[]) new NavEntry[]{new NavEntry.Group("账户"), item$default(Destination.Accounts, null, 2, null), new NavEntry.Group("游戏"), item$default(Destination.Launch, null, 2, null), item$default(Destination.Instances, null, 2, null), new NavEntry.Sec("download", "下载", Ico.INSTANCE.getDownload(), CollectionsKt.listOf((Object[]) new NavEntry.Item[]{item$default(Destination.Versions, null, 2, null), cat(CatalogKind.Mod), cat(CatalogKind.Modpack), cat(CatalogKind.Datapack), cat(CatalogKind.Resource), cat(CatalogKind.Shader), cat(CatalogKind.World), item$default(Destination.Java, null, 2, null)})), new NavEntry.Group("通用"), item$default(Destination.Settings, null, 2, null), item(Destination.Multiplayer, "多人联机"), item$default(Destination.Ai, null, 2, null), new NavEntry.Sec("more", "更多", Ico.INSTANCE.getMore(), CollectionsKt.listOf((Object[]) new NavEntry.Item[]{cat(CatalogKind.Mods), item$default(Destination.Servers, null, 2, null), item(Destination.PlayTime, "时长"), item(Destination.Feedback, "反馈")})), item$default(Destination.Tasks, null, 2, null)});
    private static final List<Destination> compactTop = CollectionsKt.listOf((Object[]) new Destination[]{Destination.Launch, Destination.Instances, Destination.Versions, Destination.Library, Destination.Accounts, Destination.Ai, Destination.Multiplayer});
    private static final List<Destination> compactBottom = CollectionsKt.listOf((Object[]) new Destination[]{Destination.Settings, Destination.Tasks});
    private static final Set<AppState> extrasMerged = Collections.newSetFromMap(new WeakHashMap());

    /* compiled from: PyMclApp.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Destination.values().length];
            try {
                iArr[Destination.Launch.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[Destination.Versions.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[Destination.Library.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[Destination.Instances.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[Destination.Java.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr[Destination.Accounts.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                iArr[Destination.Ai.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[Destination.Multiplayer.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[Destination.Servers.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[Destination.Settings.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[Destination.PlayTime.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr[Destination.Tasks.ordinal()] = 12;
            } catch (NoSuchFieldError e12) {
            }
            try {
                iArr[Destination.Feedback.ordinal()] = 13;
            } catch (NoSuchFieldError e13) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogKind.values().length];
            try {
                iArr2[CatalogKind.Mod.ordinal()] = 1;
            } catch (NoSuchFieldError e14) {
            }
            try {
                iArr2[CatalogKind.Mods.ordinal()] = 2;
            } catch (NoSuchFieldError e15) {
            }
            try {
                iArr2[CatalogKind.Modpack.ordinal()] = 3;
            } catch (NoSuchFieldError e16) {
            }
            try {
                iArr2[CatalogKind.Datapack.ordinal()] = 4;
            } catch (NoSuchFieldError e17) {
            }
            try {
                iArr2[CatalogKind.Resource.ordinal()] = 5;
            } catch (NoSuchFieldError e18) {
            }
            try {
                iArr2[CatalogKind.Shader.ordinal()] = 6;
            } catch (NoSuchFieldError e19) {
            }
            try {
                iArr2[CatalogKind.World.ordinal()] = 7;
            } catch (NoSuchFieldError e20) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChromeBar$lambda$1(AppState appState, boolean z, boolean z2, int i, Composer composer, int i2) {
        ChromeBar(appState, z, z2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MergeSettingsExtras$lambda$1(AppState appState, int i, Composer composer, int i2) {
        MergeSettingsExtras(appState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavItemView$lambda$2(AppState appState, NavEntry.Item item, boolean z, boolean z2, int i, int i2, Composer composer, int i3) {
        NavItemView(appState, item, z, z2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavRow$lambda$2(String str, ImageVector imageVector, boolean z, boolean z2, boolean z3, int i, ImageVector imageVector2, Function0 function0, int i2, int i3, Composer composer, int i4) {
        NavRow(str, imageVector, z, z2, z3, i, imageVector2, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PageFor$lambda$0(AppState appState, NavKey navKey, int i, Composer composer, int i2) {
        PageFor(appState, navKey, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PageHost$lambda$2(AppState appState, Modifier modifier, int i, Composer composer, int i2) {
        PageHost(appState, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PyMclApp$lambda$1(AppState appState, int i, Composer composer, int i2) {
        PyMclApp(appState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SideBar$lambda$2(AppState appState, boolean z, int i, Composer composer, int i2) {
        SideBar(appState, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaskDock$lambda$3(AppState appState, Modifier modifier, int i, Composer composer, int i2) {
        TaskDock(appState, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ToastHost$lambda$1(AppState appState, Modifier modifier, int i, Composer composer, int i2) {
        ToastHost(appState, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Wallpaper$lambda$0(AppState appState, int i, Composer composer, int i2) {
        Wallpaper(appState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Wallpaper$lambda$6(AppState appState, int i, Composer composer, int i2) {
        Wallpaper(appState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final ImageVector icon(Destination $this$icon) {
        Intrinsics.checkNotNullParameter($this$icon, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[$this$icon.ordinal()]) {
            case 1:
                return Ico.INSTANCE.getPlay();
            case 2:
                return Ico.INSTANCE.getGrass();
            case 3:
                return Ico.INSTANCE.getPuzzle();
            case 4:
                return Ico.INSTANCE.getCube();
            case 5:
                return Ico.INSTANCE.getCoffee();
            case 6:
                return Ico.INSTANCE.getPerson();
            case 7:
                return Ico.INSTANCE.getSparkle();
            case 8:
                return Ico.INSTANCE.getWifi();
            case 9:
                return Ico.INSTANCE.getServer();
            case 10:
                return Ico.INSTANCE.getGear();
            case 11:
                return Ico.INSTANCE.getClock();
            case 12:
                return Ico.INSTANCE.getDownload();
            case 13:
                return Ico.INSTANCE.getHelp();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String pcTitle(Destination $this$pcTitle) {
        Intrinsics.checkNotNullParameter($this$pcTitle, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[$this$pcTitle.ordinal()]) {
            case 1:
                return "启动";
            case 2:
                return "原版游戏";
            case 3:
                return "Mod";
            case 4:
                return "版本管理";
            case 5:
                return "Java";
            case 6:
                return "账号";
            case 7:
                return "AI 助手";
            case 8:
                return "联机";
            case 9:
                return "服务器";
            case 10:
                return "设置";
            case 11:
                return "游戏时长";
            case 12:
                return "下载任务";
            case 13:
                return "反馈与帮助";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final ImageVector icon(CatalogKind $this$icon) {
        Intrinsics.checkNotNullParameter($this$icon, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$1[$this$icon.ordinal()]) {
            case 1:
            case 2:
                return Ico.INSTANCE.getPuzzle();
            case 3:
                return Ico.INSTANCE.getBox();
            case 4:
                return Ico.INSTANCE.getData();
            case 5:
                return Ico.INSTANCE.getImage();
            case 6:
                return Ico.INSTANCE.getSun();
            case 7:
                return Ico.INSTANCE.getGlobe();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String title(NavKey $this$title) {
        String title;
        Intrinsics.checkNotNullParameter($this$title, "<this>");
        CatalogKind catalog = $this$title.getCatalog();
        return (catalog == null || (title = catalog.getTitle()) == null) ? pcTitle($this$title.getDest()) : title;
    }

    private static final NavEntry.Item item(Destination d, String label) {
        return new NavEntry.Item(new NavKey(d, null, 2, null), label, icon(d));
    }

    static /* synthetic */ NavEntry.Item item$default(Destination destination, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = pcTitle(destination);
        }
        return item(destination, str);
    }

    private static final NavEntry.Item cat(CatalogKind k) {
        return new NavEntry.Item(new NavKey(Destination.Library, k), k.getTitle(), icon(k));
    }

    private static final void MergeSettingsExtras(final AppState state, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(1135122325);
        ComposerKt.sourceInformation($composer2, "C(MergeSettingsExtras)113@5829L7,114@5882L663,114@5860L685:PyMclApp.kt#n2hyjj");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= ($changed & 8) == 0 ? $composer2.changed(state) : $composer2.changedInstance(state) ? 4 : 2;
        }
        boolean z = false;
        if (!$composer2.shouldExecute(($dirty & 3) != 2, $dirty & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1135122325, $dirty, -1, "com.pymcl.android.ui.MergeSettingsExtras (PyMclApp.kt:112)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Context ctx = ((Context) objConsume).getApplicationContext();
            ComposerKt.sourceInformationMarkerStart($composer2, -69133332, "CC(remember):PyMclApp.kt#9igjgp");
            if (($dirty & 14) == 4 || (($dirty & 8) != 0 && $composer2.changedInstance(state))) {
                z = true;
            }
            boolean zChangedInstance = $composer2.changedInstance(ctx) | z;
            Object objRememberedValue = $composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = (Function2) new PyMclAppKt$MergeSettingsExtras$1$1(state, ctx, null);
                $composer2.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(state, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, $composer2, AppState.$stable | ($dirty & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.PyMclAppKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return PyMclAppKt.MergeSettingsExtras$lambda$1(state, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    public static final void PyMclApp(final AppState state, Composer $composer, final int $changed) {
        Composer $composer2;
        Function0 function0;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer $composer3 = $composer.startRestartGroup(2008678663);
        ComposerKt.sourceInformation($composer3, "C(PyMclApp)126@6608L6,127@6619L26,128@6650L1730:PyMclApp.kt#n2hyjj");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= ($changed & 8) == 0 ? $composer3.changed(state) : $composer3.changedInstance(state) ? 4 : 2;
        }
        if (!$composer3.shouldExecute(($dirty & 3) != 2, $dirty & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2008678663, $dirty, -1, "com.pymcl.android.ui.PyMclApp (PyMclApp.kt:125)");
            }
            final PyColors c = Py.INSTANCE.getColors($composer3, 6);
            MergeSettingsExtras(state, $composer3, AppState.$stable | ($dirty & 14));
            Modifier modifierM247backgroundbw27NRU$default = BackgroundKt.m247backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), c.m7957getCanvas0d7_KjU(), null, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            Alignment.INSTANCE.getTopStart();
            Shape clip = Graphics.getClip();
            ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer3, modifierM247backgroundbw27NRU$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            $composer2 = $composer3;
            int i = ((((0 << 3) & 112) << 6) & User32.WM_PENWINFIRST) | 6;
            int $dirty2 = $dirty;
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
            Updater.m3839setimpl(composerM3832constructorimpl, clip, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
            int i3 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, 792612993, "C129@6709L16,130@6777L1597,130@6734L1640:PyMclApp.kt#n2hyjj");
            Wallpaper(state, $composer3, AppState.$stable | ($dirty2 & 14));
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(1621043627, true, new Function3() { // from class: com.pymcl.android.ui.PyMclAppKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return PyMclAppKt.PyMclApp$lambda$0$0(state, c, (BoxWithConstraintsScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer3, 3078, 6);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.PyMclAppKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PyMclAppKt.PyMclApp$lambda$1(state, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:69:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x054f  */
    /* JADX WARN: Type inference failed for: r3v50, types: [androidx.compose.ui.Modifier, void] */
    /* JADX WARN: Type inference failed for: r4v58, types: [androidx.compose.ui.Modifier, void] */
    /* JADX WARN: Type inference failed for: r4v6, types: [float, void] */
    /* JADX WARN: Type inference failed for: r81v1, types: [float, java.awt.Graphics] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit PyMclApp$lambda$0$0(com.pymcl.android.ui.state.AppState r87, com.pymcl.android.ui.theme.PyColors r88, androidx.compose.foundation.layout.BoxWithConstraintsScope r89, androidx.compose.runtime.Composer r90, int r91) {
        /*
            Method dump skipped, instructions count: 1371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.PyMclAppKt.PyMclApp$lambda$0$0(com.pymcl.android.ui.state.AppState, com.pymcl.android.ui.theme.PyColors, androidx.compose.foundation.layout.BoxWithConstraintsScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void Wallpaper(final com.pymcl.android.ui.state.AppState r29, androidx.compose.runtime.Composer r30, final int r31) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.PyMclAppKt.Wallpaper(com.pymcl.android.ui.state.AppState, androidx.compose.runtime.Composer, int):void");
    }

    private static final ImageBitmap Wallpaper$lambda$2(MutableState<ImageBitmap> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0850  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x08c8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x08de  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0907  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x091b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0992  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0444  */
    /* JADX WARN: Type inference failed for: r3v29, types: [float, java.awt.Graphics] */
    /* JADX WARN: Type inference failed for: r42v0, types: [java.awt.Component, void] */
    /* JADX WARN: Type inference failed for: r43v0, types: [float, java.awt.Graphics] */
    /* JADX WARN: Type inference failed for: r4v27, types: [androidx.compose.ui.Modifier, void] */
    /* JADX WARN: Type inference failed for: r4v80, types: [androidx.compose.ui.Modifier, void] */
    /* JADX WARN: Type inference failed for: r65v3, types: [float, java.awt.Graphics] */
    /* JADX WARN: Type inference failed for: r65v4, types: [androidx.compose.ui.Modifier, void] */
    /* JADX WARN: Type inference failed for: r67v4, types: [float, java.awt.Graphics] */
    /* JADX WARN: Type inference failed for: r7v23, types: [float, java.awt.Graphics] */
    /* JADX WARN: Type inference failed for: r95v3, types: [androidx.compose.ui.Modifier, void] */
    /* JADX WARN: Type inference failed for: r96v1, types: [float, java.awt.Graphics] */
    /* JADX WARN: Type inference failed for: r9v37, types: [androidx.compose.ui.Modifier, void] */
    /* JADX WARN: Type inference failed for: r9v44, types: [androidx.compose.ui.Modifier, void] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void ChromeBar(final com.pymcl.android.ui.state.AppState r119, final boolean r120, final boolean r121, androidx.compose.runtime.Composer r122, final int r123) {
        /*
            Method dump skipped, instructions count: 2498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.PyMclAppKt.ChromeBar(com.pymcl.android.ui.state.AppState, boolean, boolean, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChromeBar$lambda$0$0$0$0(AppState $state, boolean $collapsed) {
        $state.setSideCollapsed(Boolean.valueOf(!$collapsed));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChromeBar$lambda$0$0$3$0(AppState $state, boolean $collapsed) {
        $state.setSideCollapsed(Boolean.valueOf(!$collapsed));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChromeBar$lambda$0$0$4$0(AppState $state) {
        $state.updateSettings(new Function1() { // from class: com.pymcl.android.ui.PyMclAppKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PyMclAppKt.ChromeBar$lambda$0$0$4$0$0((UiSettings) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings ChromeBar$lambda$0$0$4$0$0(UiSettings it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UiSettings.copy$default(it, !it.getDark(), 0, null, 0, 0, false, 0, false, false, 0, false, 0, null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, 0, 0, 0, null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, 0, false, -2, SPV.kDefaultMaxIdBound, null);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ConstructorVisitor
        java.lang.IllegalArgumentException: Illegal Capacity: -1
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:161)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.BaseInvokeNode.<init>(BaseInvokeNode.java:11)
        	at jadx.core.dex.instructions.mods.ConstructorInsn.<init>(ConstructorInsn.java:32)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:76)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    private static final void SideBar(
    /*  JADX ERROR: IllegalArgumentException in pass: ConstructorVisitor
        java.lang.IllegalArgumentException: Illegal Capacity: -1
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:161)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.BaseInvokeNode.<init>(BaseInvokeNode.java:11)
        	at jadx.core.dex.instructions.mods.ConstructorInsn.<init>(ConstructorInsn.java:32)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:76)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r129v0 ??
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

    private static final float SideBar$lambda$0(State<Dp> state) {
        return ((Dp) state.getValue()).m7032unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SideBar$lambda$1$0$0$1$2$0(boolean $open, AppState $state, NavEntry $e) {
        SnapshotStateList<String> expandedSections = $state.getExpandedSections();
        String id = ((NavEntry.Sec) $e).getId();
        if ($open) {
            expandedSections.remove(id);
        } else {
            expandedSections.add(id);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v9, types: [androidx.compose.ui.Modifier, void] */
    public static final Unit SideBar$lambda$1$0$0$1$3(boolean z, NavEntry navEntry, AppState appState, AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Function0<ComposeUiNode> function0;
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        ComposerKt.sourceInformation(composer, "C247@14897L139:PyMclApp.kt#n2hyjj");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1191360673, i, -1, "com.pymcl.android.ui.SideBar.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PyMclApp.kt:247)");
            }
            ?? UpdateComponent = RepaintArea.updateComponent(Modifier.INSTANCE, z ? Dp.m7018constructorimpl(0) : Dp.m7018constructorimpl(12));
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, UpdateComponent);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i2 = ((((0 << 3) & 112) << 6) & User32.WM_PENWINFIRST) | 6;
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                function0 = constructor;
                composer.createNode(function0);
            } else {
                function0 = constructor;
                composer.useNode();
            }
            Composer composerM3832constructorimpl = Updater.m3832constructorimpl(composer);
            Updater.m3839setimpl(composerM3832constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3839setimpl(composerM3832constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3832constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3832constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3832constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3832constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3839setimpl(composerM3832constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i3 = (i2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart(composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i4 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer, -1333469454, "C:PyMclApp.kt#n2hyjj");
            composer.startReplaceGroup(788269190);
            ComposerKt.sourceInformation(composer, "*247@14985L47");
            List<NavEntry.Item> children = ((NavEntry.Sec) navEntry).getChildren();
            Iterator<T> it = children.iterator();
            while (it.hasNext()) {
                NavItemView(appState, (NavEntry.Item) it.next(), z, true, composer, AppState.$stable | 3072 | (NavKey.$stable << 3), 0);
                children = children;
            }
            composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void NavItemView(final com.pymcl.android.ui.state.AppState r21, final com.pymcl.android.ui.NavEntry.Item r22, final boolean r23, boolean r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.PyMclAppKt.NavItemView(com.pymcl.android.ui.state.AppState, com.pymcl.android.ui.NavEntry$Item, boolean, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavItemView$lambda$1$0(AppState $state, NavEntry.Item $e) {
        $state.navigate($e.getKey());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0676  */
    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.compose.ui.Modifier, void] */
    /* JADX WARN: Type inference failed for: r0v58, types: [androidx.compose.ui.Modifier, void] */
    /* JADX WARN: Type inference failed for: r17v15, types: [float, java.awt.Graphics] */
    /* JADX WARN: Type inference failed for: r2v71, types: [float, java.awt.Graphics] */
    /* JADX WARN: Type inference failed for: r3v123, types: [androidx.compose.ui.Modifier, void] */
    /* JADX WARN: Type inference failed for: r3v13, types: [androidx.compose.ui.Modifier, void] */
    /* JADX WARN: Type inference failed for: r50v0, types: [float, java.awt.Graphics] */
    /* JADX WARN: Type inference failed for: r66v1, types: [androidx.compose.ui.Modifier, void] */
    /* JADX WARN: Type inference failed for: r66v5, types: [androidx.compose.ui.Modifier, void] */
    /* JADX WARN: Type inference failed for: r67v3, types: [androidx.compose.ui.Modifier, void] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void NavRow(final java.lang.String r96, final androidx.compose.ui.graphics.vector.ImageVector r97, final boolean r98, final boolean r99, boolean r100, int r101, androidx.compose.ui.graphics.vector.ImageVector r102, final kotlin.jvm.functions.Function0<kotlin.Unit> r103, androidx.compose.runtime.Composer r104, final int r105, final int r106) {
        /*
            Method dump skipped, instructions count: 2825
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.PyMclAppKt.NavRow(java.lang.String, androidx.compose.ui.graphics.vector.ImageVector, boolean, boolean, boolean, int, androidx.compose.ui.graphics.vector.ImageVector, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final long NavRow$lambda$0(State<Color> state) {
        return ((Color) state.getValue()).m4400unboximpl();
    }

    private static final void PageHost(final AppState state, Modifier modifier, Composer $composer, final int $changed) {
        final Modifier modifier2;
        Composer $composer2 = $composer.startRestartGroup(1664493901);
        ComposerKt.sourceInformation($composer2, "C(PageHost)P(1)315@19231L6,318@19317L317,323@19658L30,316@19242L446:PyMclApp.kt#n2hyjj");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= ($changed & 8) == 0 ? $composer2.changed(state) : $composer2.changedInstance(state) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(modifier) ? 32 : 16;
        }
        boolean z = false;
        if (!$composer2.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            modifier2 = modifier;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1664493901, $dirty, -1, "com.pymcl.android.ui.PageHost (PyMclApp.kt:314)");
            }
            final PyMotion m = Py.INSTANCE.getMotion($composer2, 6);
            NavKey current = state.getCurrent();
            ComposerKt.sourceInformationMarkerStart($composer2, 1850809962, "CC(remember):PyMclApp.kt#9igjgp");
            if (($dirty & 14) == 4 || (($dirty & 8) != 0 && $composer2.changedInstance(state))) {
                z = true;
            }
            boolean zChanged = $composer2.changed(m) | z;
            Object objRememberedValue = $composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.PyMclAppKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return PyMclAppKt.PageHost$lambda$0$0(state, m, (AnimatedContentTransitionScope) obj2);
                    }
                };
                $composer2.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            modifier2 = modifier;
            AnimatedContentKt.AnimatedContent(current, modifier2, (Function1) objRememberedValue, null, "page", null, ComposableLambdaKt.rememberComposableLambda(1444683874, true, new Function4() { // from class: com.pymcl.android.ui.PyMclAppKt$$ExternalSyntheticLambda26
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    return PyMclAppKt.PageHost$lambda$1(state, (AnimatedContentScope) obj2, (NavKey) obj3, (Composer) obj4, ((Integer) obj5).intValue());
                }
            }, $composer2, 54), $composer2, 1597440 | NavKey.$stable | ($dirty & 112), 40);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.PyMclAppKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return PyMclAppKt.PageHost$lambda$2(state, modifier2, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform PageHost$lambda$0$0(AppState $state, PyMotion $m, AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        final int dir = $state.getNavForward() ? 1 : -1;
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default($m.getPage(), 0, PyMotion.INSTANCE.getEaseOut(), 2, null), 0.0f, 2, null).plus(EnterExitTransitionKt.slideInHorizontally(AnimationSpecKt.tween$default($m.getPage(), 0, PyMotion.INSTANCE.getEaseOut(), 2, null), new Function1() { // from class: com.pymcl.android.ui.PyMclAppKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(PyMclAppKt.PageHost$lambda$0$0$0(dir, ((Integer) obj).intValue()));
            }
        })), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default($m.ms(140), 0, null, 6, null), 0.0f, 2, null).plus(EnterExitTransitionKt.slideOutHorizontally(AnimationSpecKt.tween$default($m.ms(140), 0, null, 6, null), new Function1() { // from class: com.pymcl.android.ui.PyMclAppKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(PyMclAppKt.PageHost$lambda$0$0$1(dir, ((Integer) obj).intValue()));
            }
        })));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int PageHost$lambda$0$0$0(int $dir, int it) {
        return $dir * 40;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int PageHost$lambda$0$0$1(int $dir, int it) {
        return (-$dir) * 20;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PageHost$lambda$1(AppState $state, AnimatedContentScope AnimatedContent, NavKey key, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        Intrinsics.checkNotNullParameter(key, "key");
        ComposerKt.sourceInformation($composer, "C323@19667L19:PyMclApp.kt#n2hyjj");
        int $dirty = $changed;
        if (($changed & 48) == 0) {
            $dirty |= ($changed & 64) == 0 ? $composer.changed(key) : $composer.changedInstance(key) ? 32 : 16;
        }
        if ($composer.shouldExecute(($dirty & 145) != 144, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1444683874, $dirty, -1, "com.pymcl.android.ui.PageHost.<anonymous> (PyMclApp.kt:323)");
            }
            PageFor($state, key, $composer, AppState.$stable | (NavKey.$stable << 3) | ($dirty & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final void PageFor(AppState state, final NavKey key, Composer $composer, final int $changed) {
        final AppState state2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(key, "key");
        Composer $composer2 = $composer.startRestartGroup(984151137);
        ComposerKt.sourceInformation($composer2, "C(PageFor)P(1):PyMclApp.kt#n2hyjj");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= ($changed & 8) == 0 ? $composer2.changed(state) : $composer2.changedInstance(state) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= ($changed & 64) == 0 ? $composer2.changed(key) : $composer2.changedInstance(key) ? 32 : 16;
        }
        if (!$composer2.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            state2 = state;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(984151137, $dirty, -1, "com.pymcl.android.ui.PageFor (PyMclApp.kt:327)");
            }
            switch (WhenMappings.$EnumSwitchMapping$0[key.getDest().ordinal()]) {
                case 1:
                    state2 = state;
                    $composer2.startReplaceGroup(876440626);
                    ComposerKt.sourceInformation($composer2, "329@19800L17");
                    LaunchPageKt.LaunchPage(state2, $composer2, AppState.$stable | ($dirty & 14));
                    $composer2.endReplaceGroup();
                    break;
                case 2:
                    state2 = state;
                    $composer2.startReplaceGroup(876442227);
                    ComposerKt.sourceInformation($composer2, "330@19850L18");
                    GamePagesKt.VersionPage(state2, $composer2, AppState.$stable | ($dirty & 14));
                    $composer2.endReplaceGroup();
                    break;
                case 3:
                    state2 = state;
                    $composer2.startReplaceGroup(876443859);
                    ComposerKt.sourceInformation($composer2, "331@19900L50");
                    CatalogKind catalog = key.getCatalog();
                    if (catalog == null) {
                        catalog = CatalogKind.Mod;
                    }
                    CatalogAccountPagesKt.CatalogPage(state2, catalog, $composer2, AppState.$stable | ($dirty & 14));
                    $composer2.endReplaceGroup();
                    break;
                case 4:
                    state2 = state;
                    $composer2.startReplaceGroup(876446516);
                    ComposerKt.sourceInformation($composer2, "332@19984L19");
                    GamePagesKt.InstancePage(state2, $composer2, AppState.$stable | ($dirty & 14));
                    $composer2.endReplaceGroup();
                    break;
                case 5:
                    state2 = state;
                    $composer2.startReplaceGroup(876448048);
                    ComposerKt.sourceInformation($composer2, "333@20032L15");
                    GamePagesKt.JavaPage(state2, $composer2, AppState.$stable | ($dirty & 14));
                    $composer2.endReplaceGroup();
                    break;
                case 6:
                    state2 = state;
                    $composer2.startReplaceGroup(876449587);
                    ComposerKt.sourceInformation($composer2, "334@20080L18");
                    CatalogAccountPagesKt.AccountPage(state2, $composer2, AppState.$stable | ($dirty & 14));
                    $composer2.endReplaceGroup();
                    break;
                case 7:
                    $composer2.startReplaceGroup(876451022);
                    ComposerKt.sourceInformation($composer2, "335@20125L13");
                    state2 = state;
                    AiPageKt.AiPage(state2, false, null, $composer2, AppState.$stable | ($dirty & 14), 6);
                    $composer2.endReplaceGroup();
                    break;
                case 8:
                    $composer2.startReplaceGroup(876452599);
                    ComposerKt.sourceInformation($composer2, "336@20174L22");
                    MiscPagesKt.MultiplayerPage(state, $composer2, AppState.$stable | ($dirty & 14));
                    $composer2.endReplaceGroup();
                    state2 = state;
                    break;
                case 9:
                    $composer2.startReplaceGroup(876454323);
                    ComposerKt.sourceInformation($composer2, "337@20228L18");
                    MiscPagesKt.ServersPage(state, $composer2, AppState.$stable | ($dirty & 14));
                    $composer2.endReplaceGroup();
                    state2 = state;
                    break;
                case 10:
                    $composer2.startReplaceGroup(876455956);
                    ComposerKt.sourceInformation($composer2, "338@20279L19");
                    SettingsPageKt.SettingsPage(state, $composer2, AppState.$stable | ($dirty & 14));
                    $composer2.endReplaceGroup();
                    state2 = state;
                    break;
                case 11:
                    $composer2.startReplaceGroup(876457620);
                    ComposerKt.sourceInformation($composer2, "339@20331L19");
                    MiscPagesKt.PlaytimePage(state, $composer2, AppState.$stable | ($dirty & 14));
                    $composer2.endReplaceGroup();
                    state2 = state;
                    break;
                case 12:
                    $composer2.startReplaceGroup(876459185);
                    ComposerKt.sourceInformation($composer2, "340@20380L16");
                    MiscPagesKt.TasksPage(state, $composer2, AppState.$stable | ($dirty & 14));
                    $composer2.endReplaceGroup();
                    state2 = state;
                    break;
                case 13:
                    $composer2.startReplaceGroup(876460756);
                    ComposerKt.sourceInformation($composer2, "341@20429L19");
                    MiscPagesKt.FeedbackPage(state, $composer2, AppState.$stable | ($dirty & 14));
                    $composer2.endReplaceGroup();
                    state2 = state;
                    break;
                default:
                    $composer2.startReplaceGroup(876439775);
                    $composer2.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.PyMclAppKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PyMclAppKt.PageFor$lambda$0(state2, key, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void TaskDock(final AppState state, final Modifier modifier, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(1034595564);
        ComposerKt.sourceInformation($composer2, "C(TaskDock)P(1)349@20657L6,351@20845L6,351@20862L6,351@20905L6,351@20923L984,350@20668L1239:PyMclApp.kt#n2hyjj");
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
                ComposerKt.traceEventStart(1034595564, $dirty2, -1, "com.pymcl.android.ui.TaskDock (PyMclApp.kt:347)");
            }
            Iterable tasks = state.getTasks();
            Collection arrayList = new ArrayList();
            for (TaskRow taskRow : tasks) {
                if (taskRow.getState() == TaskState.Running) {
                    arrayList.add(taskRow);
                }
            }
            final List running = (List) arrayList;
            final PyColors c = Py.INSTANCE.getColors($composer2, 6);
            boolean z = (running.isEmpty() || state.getCurrent().getDest() == Destination.Tasks || state.getCurrent().getDest() == Destination.Ai) ? false : true;
            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(Py.INSTANCE.getMotion($composer2, 6).ms(240), 0, null, 6, null);
            ComposerKt.sourceInformationMarkerStart($composer2, 2108902610, "CC(remember):PyMclApp.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.pymcl.android.ui.PyMclAppKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Integer.valueOf(PyMclAppKt.TaskDock$lambda$1$0(((Integer) obj2).intValue()));
                    }
                };
                $composer2.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            AnimatedVisibilityKt.AnimatedVisibility(z, modifier, EnterExitTransitionKt.slideInVertically(tweenSpecTween$default, (Function1) objRememberedValue).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null)), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(Py.INSTANCE.getMotion($composer2, 6).ms(180), 0, null, 6, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.rememberComposableLambda(865209796, true, new Function3() { // from class: com.pymcl.android.ui.PyMclAppKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return PyMclAppKt.TaskDock$lambda$2(running, c, state, (AnimatedVisibilityScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer2, 54), $composer2, 196608 | ($dirty2 & 112), 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.PyMclAppKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return PyMclAppKt.TaskDock$lambda$3(state, modifier, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int TaskDock$lambda$1$0(int it) {
        return it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0481  */
    /* JADX WARN: Type inference failed for: r0v39, types: [androidx.compose.ui.Modifier, void] */
    /* JADX WARN: Type inference failed for: r1v19, types: [androidx.compose.ui.Modifier, void] */
    /* JADX WARN: Type inference failed for: r1v29, types: [float, java.awt.Graphics] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit TaskDock$lambda$2(java.util.List r85, com.pymcl.android.ui.theme.PyColors r86, final com.pymcl.android.ui.state.AppState r87, androidx.compose.animation.AnimatedVisibilityScope r88, androidx.compose.runtime.Composer r89, int r90) {
        /*
            Method dump skipped, instructions count: 1163
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.PyMclAppKt.TaskDock$lambda$2(java.util.List, com.pymcl.android.ui.theme.PyColors, com.pymcl.android.ui.state.AppState, androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaskDock$lambda$2$0$0(AppState $state) {
        $state.navigate(Destination.Tasks);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0203  */
    /* JADX WARN: Type inference failed for: r36v0, types: [float, java.awt.Graphics] */
    /* JADX WARN: Type inference failed for: r4v38, types: [androidx.compose.ui.Modifier, void] */
    /* JADX WARN: Type inference failed for: r4v58, types: [androidx.compose.ui.Modifier, void] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void ToastHost(final com.pymcl.android.ui.state.AppState r117, final androidx.compose.ui.Modifier r118, androidx.compose.runtime.Composer r119, final int r120) {
        /*
            Method dump skipped, instructions count: 1868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.PyMclAppKt.ToastHost(com.pymcl.android.ui.state.AppState, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }
}
