package androidx.compose.material;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.jni.JNINativeInterface;
import org.lwjgl.system.windows.User32;
import org.tukaani.xz.LZMA2Options;

/* compiled from: Scaffold.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a§\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0013\b\u0002\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0002\b\u00122\u0013\b\u0002\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0002\b\u00122\u0019\b\u0002\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t0\u0015¢\u0006\u0002\b\u00122\u0013\b\u0002\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0002\b\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2 \b\u0002\u0010\u001c\u001a\u001a\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015¢\u0006\u0002\b\u0012¢\u0006\u0002\b\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001b2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00012\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020$2\b\b\u0002\u0010(\u001a\u00020$2\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\t0\u0015¢\u0006\u0002\b\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a\u009f\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0013\b\u0002\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0002\b\u00122\u0013\b\u0002\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0002\b\u00122\u0019\b\u0002\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t0\u0015¢\u0006\u0002\b\u00122\u0013\b\u0002\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0002\b\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2 \b\u0002\u0010\u001c\u001a\u001a\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015¢\u0006\u0002\b\u0012¢\u0006\u0002\b\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001b2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00012\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020$2\b\b\u0002\u0010(\u001a\u00020$2\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\t0\u0015¢\u0006\u0002\b\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a¨\u0001\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\u001b2\u0006\u00101\u001a\u00020\u00192\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0002\b\u0012¢\u0006\u0002\b22\u001c\u0010)\u001a\u0018\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\t0\u0015¢\u0006\u0002\b\u0012¢\u0006\u0002\b22\u0016\u00103\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0002\b\u0012¢\u0006\u0002\b22\u0016\u00104\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0002\b\u0012¢\u0006\u0002\b22\u0006\u0010\n\u001a\u00020\u000b2\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0002\b\u0012¢\u0006\u0002\b2H\u0003ø\u0001\u0000¢\u0006\u0004\b5\u00106\u001a!\u00107\u001a\u00020\u000f2\b\b\u0002\u00108\u001a\u0002092\b\b\u0002\u0010:\u001a\u00020\u0016H\u0007¢\u0006\u0002\u0010;\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u001c\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006<"}, d2 = {"FabSpacing", "Landroidx/compose/ui/unit/Dp;", "F", "LocalFabPlacement", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/FabPlacement;", "getLocalFabPlacement", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "Scaffold", "", "contentWindowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "modifier", "Landroidx/compose/ui/Modifier;", "scaffoldState", "Landroidx/compose/material/ScaffoldState;", "topBar", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "bottomBar", "snackbarHost", "Lkotlin/Function1;", "Landroidx/compose/material/SnackbarHostState;", "floatingActionButton", "floatingActionButtonPosition", "Landroidx/compose/material/FabPosition;", "isFloatingActionButtonDocked", "", "drawerContent", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "drawerGesturesEnabled", "drawerShape", "Landroidx/compose/ui/graphics/Shape;", "drawerElevation", "drawerBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "drawerContentColor", "drawerScrimColor", "backgroundColor", "contentColor", "content", "Landroidx/compose/foundation/layout/PaddingValues;", "Scaffold-u4IkXBM", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;Landroidx/compose/material/ScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLkotlin/jvm/functions/Function3;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Scaffold-27mzLpw", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/ScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLkotlin/jvm/functions/Function3;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "ScaffoldLayout", "isFabDocked", "fabPosition", "Landroidx/compose/ui/UiComposable;", "snackbar", "fab", "ScaffoldLayout-i1QSOvI", "(ZILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "rememberScaffoldState", "drawerState", "Landroidx/compose/material/DrawerState;", "snackbarHostState", "(Landroidx/compose/material/DrawerState;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ScaffoldState;", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScaffoldKt {
    private static final ProvidableCompositionLocal<FabPlacement> LocalFabPlacement = CompositionLocalKt.staticCompositionLocalOf(new Function0<FabPlacement>() { // from class: androidx.compose.material.ScaffoldKt$LocalFabPlacement$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final FabPlacement invoke() {
            return null;
        }
    });
    private static final float FabSpacing = Dp.m7018constructorimpl(16);

    public static final ScaffoldState rememberScaffoldState(DrawerState drawerState, SnackbarHostState snackbarHostState, Composer $composer, int $changed, int i) {
        ComposerKt.sourceInformationMarkerStart($composer, 1569641925, "C(rememberScaffoldState)71@2876L39,72@2960L32,73@3012L58:Scaffold.kt#jmzs0o");
        if ((i & 1) != 0) {
            drawerState = DrawerKt.rememberDrawerState(DrawerValue.Closed, null, $composer, 6, 2);
        }
        if ((i & 2) != 0) {
            ComposerKt.sourceInformationMarkerStart($composer, -694657848, "CC(remember):Scaffold.kt#9igjgp");
            Object it$iv = $composer.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new SnackbarHostState();
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            snackbarHostState = (SnackbarHostState) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1569641925, $changed, -1, "androidx.compose.material.rememberScaffoldState (Scaffold.kt:73)");
        }
        ComposerKt.sourceInformationMarkerStart($composer, -694656158, "CC(remember):Scaffold.kt#9igjgp");
        Object it$iv2 = $composer.rememberedValue();
        if (it$iv2 == Composer.INSTANCE.getEmpty()) {
            Object value$iv2 = new ScaffoldState(drawerState, snackbarHostState);
            $composer.updateRememberedValue(value$iv2);
            it$iv2 = value$iv2;
        }
        ScaffoldState scaffoldState = (ScaffoldState) it$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        return scaffoldState;
    }

    /* renamed from: Scaffold-u4IkXBM, reason: not valid java name */
    public static final void m1771Scaffoldu4IkXBM(final WindowInsets contentWindowInsets, Modifier modifier, ScaffoldState scaffoldState, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function23, int floatingActionButtonPosition, final boolean isFloatingActionButtonDocked, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32, boolean drawerGesturesEnabled, Shape drawerShape, float drawerElevation, long drawerBackgroundColor, long drawerContentColor, long drawerScrimColor, long backgroundColor, long contentColor, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function33, Composer $composer, final int $changed, final int $changed1, final int i) {
        Modifier modifier2;
        ScaffoldState scaffoldState2;
        Function2 topBar;
        Function2 bottomBar;
        Function3 snackbarHost;
        Function2 floatingActionButton;
        int floatingActionButtonPosition2;
        int i2;
        int i3;
        int i4;
        int i5;
        int $dirty1;
        int i6;
        int $dirty12;
        int $dirty13;
        Composer $composer2;
        final long drawerScrimColor2;
        final long backgroundColor2;
        final long contentColor2;
        final Function2 topBar2;
        final int floatingActionButtonPosition3;
        final Function2 bottomBar2;
        final Function3 snackbarHost2;
        final Modifier modifier3;
        final ScaffoldState scaffoldState3;
        final Function2 floatingActionButton2;
        final boolean isFloatingActionButtonDocked2;
        final Function3 drawerContent;
        final boolean drawerGesturesEnabled2;
        final Shape drawerShape2;
        final float drawerElevation2;
        final long drawerBackgroundColor2;
        final long drawerContentColor2;
        CornerBasedShape drawerShape3;
        int $dirty14;
        float drawerElevation3;
        boolean isFloatingActionButtonDocked3;
        int $dirty;
        boolean drawerGesturesEnabled3;
        long drawerBackgroundColor3;
        long drawerContentColor3;
        Function3 drawerContent2;
        int i7;
        long drawerScrimColor3;
        long backgroundColor3;
        long contentColor3;
        long backgroundColor4;
        int $dirty15;
        boolean drawerGesturesEnabled4;
        Function3 drawerContent3;
        Function3 drawerContent4;
        boolean drawerGesturesEnabled5;
        Function3 drawerContent5;
        boolean drawerGesturesEnabled6;
        int $dirty16;
        Composer $composer3 = $composer.startRestartGroup(-1288630565);
        ComposerKt.sourceInformation($composer3, "C(Scaffold)P(4,15,16,18,1,17,12,13:c#material.FabPosition,14,6,9,11,8:c#ui.unit.Dp,5:c#ui.graphics.Color,7:c#ui.graphics.Color,10:c#ui.graphics.Color,0:c#ui.graphics.Color,3:c#ui.graphics.Color)198@9536L74,200@9647L1022:Scaffold.kt#jmzs0o");
        int $dirty2 = $changed;
        int $dirty17 = $changed1;
        if ((i & 1) != 0) {
            $dirty2 |= 6;
        } else if (($changed & 6) == 0) {
            $dirty2 |= $composer3.changed(contentWindowInsets) ? 4 : 2;
        }
        int i8 = i & 2;
        if (i8 != 0) {
            $dirty2 |= 48;
            modifier2 = modifier;
        } else if (($changed & 48) == 0) {
            modifier2 = modifier;
            $dirty2 |= $composer3.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        if (($changed & 384) == 0) {
            if ((i & 4) == 0) {
                scaffoldState2 = scaffoldState;
                int i9 = $composer3.changed(scaffoldState2) ? 256 : 128;
                $dirty2 |= i9;
            } else {
                scaffoldState2 = scaffoldState;
            }
            $dirty2 |= i9;
        } else {
            scaffoldState2 = scaffoldState;
        }
        int i10 = i & 8;
        int i11 = 1024;
        if (i10 != 0) {
            $dirty2 |= 3072;
            topBar = function2;
        } else if (($changed & 3072) == 0) {
            topBar = function2;
            $dirty2 |= $composer3.changedInstance(topBar) ? 2048 : 1024;
        } else {
            topBar = function2;
        }
        int i12 = i & 16;
        if (i12 != 0) {
            $dirty2 |= 24576;
            bottomBar = function22;
        } else if (($changed & 24576) == 0) {
            bottomBar = function22;
            $dirty2 |= $composer3.changedInstance(bottomBar) ? 16384 : 8192;
        } else {
            bottomBar = function22;
        }
        int i13 = i & 32;
        if (i13 != 0) {
            $dirty2 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            snackbarHost = function3;
        } else if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            snackbarHost = function3;
            $dirty2 |= $composer3.changedInstance(snackbarHost) ? 131072 : 65536;
        } else {
            snackbarHost = function3;
        }
        int i14 = i & 64;
        if (i14 != 0) {
            $dirty2 |= JNINativeInterface.JNI_VERSION_24;
            floatingActionButton = function23;
        } else if (($changed & JNINativeInterface.JNI_VERSION_24) == 0) {
            floatingActionButton = function23;
            $dirty2 |= $composer3.changedInstance(floatingActionButton) ? 1048576 : 524288;
        } else {
            floatingActionButton = function23;
        }
        int i15 = i & 128;
        if (i15 != 0) {
            $dirty2 |= User32.WS_CAPTION;
            floatingActionButtonPosition2 = floatingActionButtonPosition;
        } else if (($changed & User32.WS_CAPTION) == 0) {
            floatingActionButtonPosition2 = floatingActionButtonPosition;
            $dirty2 |= $composer3.changed(floatingActionButtonPosition2) ? 8388608 : 4194304;
        } else {
            floatingActionButtonPosition2 = floatingActionButtonPosition;
        }
        int i16 = i & 256;
        if (i16 != 0) {
            $dirty2 |= 100663296;
            i2 = i16;
        } else if (($changed & 100663296) == 0) {
            i2 = i16;
            $dirty2 |= $composer3.changed(isFloatingActionButtonDocked) ? 67108864 : 33554432;
        } else {
            i2 = i16;
        }
        int i17 = i & 512;
        if (i17 != 0) {
            $dirty2 |= LZMA2Options.DICT_SIZE_MAX;
            i3 = i17;
        } else if (($changed & LZMA2Options.DICT_SIZE_MAX) == 0) {
            i3 = i17;
            $dirty2 |= $composer3.changedInstance(function32) ? 536870912 : 268435456;
        } else {
            i3 = i17;
        }
        int i18 = i & 1024;
        if (i18 != 0) {
            $dirty17 |= 6;
            i4 = i18;
        } else if (($changed1 & 6) == 0) {
            i4 = i18;
            $dirty17 |= $composer3.changed(drawerGesturesEnabled) ? 4 : 2;
        } else {
            i4 = i18;
        }
        if (($changed1 & 48) == 0) {
            $dirty17 |= ((i & 2048) == 0 && $composer3.changed(drawerShape)) ? 32 : 16;
        }
        int i19 = i & 4096;
        if (i19 != 0) {
            $dirty17 |= 384;
            i5 = i19;
        } else {
            i5 = i19;
            if (($changed1 & 384) == 0) {
                $dirty17 |= $composer3.changed(drawerElevation) ? 256 : 128;
            }
        }
        if (($changed1 & 3072) == 0) {
            if ((i & 8192) == 0) {
                $dirty16 = $dirty17;
                i6 = i8;
                if ($composer3.changed(drawerBackgroundColor)) {
                    i11 = 2048;
                }
            } else {
                $dirty16 = $dirty17;
                i6 = i8;
            }
            $dirty1 = $dirty16 | i11;
        } else {
            $dirty1 = $dirty17;
            i6 = i8;
        }
        int $dirty18 = $dirty1;
        if (($changed1 & 24576) == 0) {
            $dirty12 = $dirty18 | (((i & 16384) == 0 && $composer3.changed(drawerContentColor)) ? 16384 : 8192);
        } else {
            $dirty12 = $dirty18;
        }
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            $dirty12 |= ((i & 32768) == 0 && $composer3.changed(drawerScrimColor)) ? 131072 : 65536;
        }
        if (($changed1 & JNINativeInterface.JNI_VERSION_24) == 0) {
            $dirty12 |= ((i & 65536) == 0 && $composer3.changed(backgroundColor)) ? 1048576 : 524288;
        }
        if (($changed1 & User32.WS_CAPTION) == 0) {
            $dirty12 |= ((i & 131072) == 0 && $composer3.changed(contentColor)) ? 8388608 : 4194304;
        }
        if ((i & 262144) != 0) {
            $dirty13 = $dirty12 | 100663296;
        } else if (($changed1 & 100663296) == 0) {
            $dirty13 = $dirty12 | ($composer3.changedInstance(function33) ? 67108864 : 33554432);
        } else {
            $dirty13 = $dirty12;
        }
        if ($composer3.shouldExecute((($dirty2 & 306783379) == 306783378 && ($dirty13 & 38347923) == 38347922) ? false : true, $dirty2 & 1)) {
            $composer3.startDefaults();
            ComposerKt.sourceInformation($composer3, "180@8570L23,189@9080L6,191@9195L6,192@9243L38,193@9328L10,194@9383L6,195@9428L32");
            if (($changed & 1) == 0 || $composer3.getDefaultsInvalid()) {
                if (i6 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i & 4) != 0) {
                    $dirty2 &= -897;
                    scaffoldState2 = rememberScaffoldState(null, null, $composer3, 0, 3);
                }
                if (i10 != 0) {
                    topBar = ComposableSingletons$ScaffoldKt.INSTANCE.m1648getLambda1$material_release();
                }
                if (i12 != 0) {
                    bottomBar = ComposableSingletons$ScaffoldKt.INSTANCE.m1649getLambda2$material_release();
                }
                if (i13 != 0) {
                    snackbarHost = ComposableSingletons$ScaffoldKt.INSTANCE.m1650getLambda3$material_release();
                }
                if (i14 != 0) {
                    floatingActionButton = ComposableSingletons$ScaffoldKt.INSTANCE.m1651getLambda4$material_release();
                }
                if (i15 != 0) {
                    floatingActionButtonPosition2 = FabPosition.INSTANCE.m1698getEnd5ygKITE();
                }
                boolean isFloatingActionButtonDocked4 = i2 != 0 ? false : isFloatingActionButtonDocked;
                Function3 drawerContent6 = i3 != 0 ? null : function32;
                boolean drawerGesturesEnabled7 = i4 != 0 ? true : drawerGesturesEnabled;
                if ((i & 2048) != 0) {
                    drawerShape3 = MaterialTheme.INSTANCE.getShapes($composer3, 6).getLarge();
                    $dirty14 = $dirty13 & (-113);
                } else {
                    drawerShape3 = drawerShape;
                    $dirty14 = $dirty13;
                }
                drawerElevation3 = i5 != 0 ? DrawerDefaults.INSTANCE.m1667getElevationD9Ej5fM() : drawerElevation;
                if ((i & 8192) != 0) {
                    isFloatingActionButtonDocked3 = isFloatingActionButtonDocked4;
                    $dirty = $dirty2;
                    drawerGesturesEnabled3 = drawerGesturesEnabled7;
                    drawerBackgroundColor3 = MaterialTheme.INSTANCE.getColors($composer3, 6).m1623getSurface0d7_KjU();
                    $dirty14 &= -7169;
                } else {
                    isFloatingActionButtonDocked3 = isFloatingActionButtonDocked4;
                    $dirty = $dirty2;
                    drawerGesturesEnabled3 = drawerGesturesEnabled7;
                    drawerBackgroundColor3 = drawerBackgroundColor;
                }
                if ((i & 16384) != 0) {
                    drawerContentColor3 = ColorsKt.m1637contentColorForek8zF_U(drawerBackgroundColor3, $composer3, ($dirty14 >> 9) & 14);
                    $dirty14 &= -57345;
                } else {
                    drawerContentColor3 = drawerContentColor;
                }
                if ((32768 & i) != 0) {
                    drawerContent2 = drawerContent6;
                    i7 = 6;
                    drawerScrimColor3 = DrawerDefaults.INSTANCE.getScrimColor($composer3, 6);
                    $dirty14 &= -458753;
                } else {
                    drawerContent2 = drawerContent6;
                    i7 = 6;
                    drawerScrimColor3 = drawerScrimColor;
                }
                if ((i & 65536) != 0) {
                    $dirty14 &= -3670017;
                    backgroundColor3 = MaterialTheme.INSTANCE.getColors($composer3, i7).m1612getBackground0d7_KjU();
                } else {
                    backgroundColor3 = backgroundColor;
                }
                if ((i & 131072) != 0) {
                    $dirty15 = $dirty14 & (-29360129);
                    isFloatingActionButtonDocked = isFloatingActionButtonDocked3;
                    contentColor3 = ColorsKt.m1637contentColorForek8zF_U(backgroundColor3, $composer3, ($dirty14 >> 18) & 14);
                    backgroundColor4 = backgroundColor3;
                    drawerGesturesEnabled4 = drawerGesturesEnabled3;
                    drawerContent3 = drawerContent2;
                } else {
                    isFloatingActionButtonDocked = isFloatingActionButtonDocked3;
                    contentColor3 = contentColor;
                    backgroundColor4 = backgroundColor3;
                    $dirty15 = $dirty14;
                    drawerGesturesEnabled4 = drawerGesturesEnabled3;
                    drawerContent3 = drawerContent2;
                }
            } else {
                $composer3.skipToGroupEnd();
                if ((i & 4) != 0) {
                    $dirty2 &= -897;
                }
                if ((i & 2048) != 0) {
                    $dirty13 &= -113;
                }
                $dirty15 = $dirty13;
                if ((i & 8192) != 0) {
                    $dirty15 &= -7169;
                }
                if ((i & 16384) != 0) {
                    $dirty15 &= -57345;
                }
                if ((32768 & i) != 0) {
                    $dirty15 &= -458753;
                }
                if ((i & 65536) != 0) {
                    $dirty15 &= -3670017;
                }
                if ((i & 131072) != 0) {
                    $dirty15 &= -29360129;
                }
                drawerContent3 = function32;
                drawerGesturesEnabled4 = drawerGesturesEnabled;
                drawerShape3 = drawerShape;
                drawerElevation3 = drawerElevation;
                drawerContentColor3 = drawerContentColor;
                drawerScrimColor3 = drawerScrimColor;
                backgroundColor4 = backgroundColor;
                contentColor3 = contentColor;
                $dirty = $dirty2;
                drawerBackgroundColor3 = drawerBackgroundColor;
            }
            $composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                drawerContent4 = drawerContent3;
                drawerGesturesEnabled5 = drawerGesturesEnabled4;
                ComposerKt.traceEventStart(-1288630565, $dirty, $dirty15, "androidx.compose.material.Scaffold (Scaffold.kt:197)");
            } else {
                drawerContent4 = drawerContent3;
                drawerGesturesEnabled5 = drawerGesturesEnabled4;
            }
            ComposerKt.sourceInformationMarkerStart($composer3, -1364486362, "CC(remember):Scaffold.kt#9igjgp");
            boolean invalid$iv = ($dirty & 14) == 4;
            int $dirty19 = $dirty15;
            Object value$iv = $composer3.rememberedValue();
            if (invalid$iv || value$iv == Composer.INSTANCE.getEmpty()) {
                value$iv = new MutableWindowInsets(contentWindowInsets);
                $composer3.updateRememberedValue(value$iv);
            }
            final MutableWindowInsets safeInsets = (MutableWindowInsets) value$iv;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final Function2 topBar3 = topBar;
            final int floatingActionButtonPosition4 = floatingActionButtonPosition2;
            final Function2 bottomBar3 = bottomBar;
            final Function3 snackbarHost3 = snackbarHost;
            final ScaffoldState scaffoldState4 = scaffoldState2;
            final Function2 floatingActionButton3 = floatingActionButton;
            final long backgroundColor5 = backgroundColor4;
            final long contentColor4 = contentColor3;
            boolean isFloatingActionButtonDocked5 = isFloatingActionButtonDocked;
            final Function3 child = ComposableLambdaKt.rememberComposableLambda(-219833176, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier4, Composer composer, Integer num) {
                    invoke(modifier4, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Modifier childModifier, Composer $composer4, int $changed2) {
                    ComposerKt.sourceInformation($composer4, "C203@9788L275,210@10164L495,201@9688L971:Scaffold.kt#jmzs0o");
                    int $dirty3 = $changed2;
                    if (($changed2 & 6) == 0) {
                        $dirty3 |= $composer4.changed(childModifier) ? 4 : 2;
                    }
                    int $dirty4 = $dirty3;
                    if ($composer4.shouldExecute(($dirty4 & 19) != 18, $dirty4 & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-219833176, $dirty4, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:201)");
                        }
                        ComposerKt.sourceInformationMarkerStart($composer4, 339316590, "CC(remember):Scaffold.kt#9igjgp");
                        boolean invalid$iv2 = $composer4.changed(safeInsets) | $composer4.changed(contentWindowInsets);
                        final MutableWindowInsets mutableWindowInsets = safeInsets;
                        final WindowInsets windowInsets = contentWindowInsets;
                        Object it$iv = $composer4.rememberedValue();
                        if (invalid$iv2 || it$iv == Composer.INSTANCE.getEmpty()) {
                            Object value$iv2 = (Function1) new Function1<WindowInsets, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(WindowInsets windowInsets2) {
                                    invoke2(windowInsets2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(WindowInsets consumedWindowInsets) {
                                    mutableWindowInsets.setInsets(WindowInsetsKt.exclude(windowInsets, consumedWindowInsets));
                                }
                            };
                            $composer4.updateRememberedValue(value$iv2);
                            it$iv = value$iv2;
                        }
                        ComposerKt.sourceInformationMarkerEnd($composer4);
                        Modifier modifierOnConsumedWindowInsetsChanged = WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(childModifier, (Function1) it$iv);
                        long j = backgroundColor5;
                        long j2 = contentColor4;
                        final boolean z = isFloatingActionButtonDocked;
                        final int i20 = floatingActionButtonPosition4;
                        final Function2<Composer, Integer, Unit> function24 = topBar3;
                        final Function3<PaddingValues, Composer, Integer, Unit> function34 = function33;
                        final Function2<Composer, Integer, Unit> function25 = floatingActionButton3;
                        final MutableWindowInsets mutableWindowInsets2 = safeInsets;
                        final Function2<Composer, Integer, Unit> function26 = bottomBar3;
                        final Function3<SnackbarHostState, Composer, Integer, Unit> function35 = snackbarHost3;
                        final ScaffoldState scaffoldState5 = scaffoldState4;
                        SurfaceKt.m1803SurfaceFjzlyU(modifierOnConsumedWindowInsetsChanged, null, j, j2, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(1772955108, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer $composer5, int $changed3) {
                                ComposerKt.sourceInformation($composer5, "C217@10487L49,211@10182L463:Scaffold.kt#jmzs0o");
                                if ($composer5.shouldExecute(($changed3 & 3) != 2, $changed3 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1772955108, $changed3, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous> (Scaffold.kt:211)");
                                    }
                                    boolean z2 = z;
                                    int i21 = i20;
                                    Function2<Composer, Integer, Unit> function27 = function24;
                                    Function3<PaddingValues, Composer, Integer, Unit> function36 = function34;
                                    final Function3<SnackbarHostState, Composer, Integer, Unit> function37 = function35;
                                    final ScaffoldState scaffoldState6 = scaffoldState5;
                                    ScaffoldKt.m1772ScaffoldLayouti1QSOvI(z2, i21, function27, function36, ComposableLambdaKt.rememberComposableLambda(433906483, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.2.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                            invoke(composer, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer $composer6, int $changed4) {
                                            ComposerKt.sourceInformation($composer6, "C217@10489L45:Scaffold.kt#jmzs0o");
                                            if (!$composer6.shouldExecute(($changed4 & 3) != 2, $changed4 & 1)) {
                                                $composer6.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(433906483, $changed4, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:217)");
                                            }
                                            function37.invoke(scaffoldState6.getSnackbarHostState(), $composer6, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, $composer5, 54), function25, mutableWindowInsets2, function26, $composer5, 24576);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                $composer5.skipToGroupEnd();
                            }
                        }, $composer4, 54), $composer4, JNINativeInterface.JNI_VERSION_24, 50);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    $composer4.skipToGroupEnd();
                }
            }, $composer3, 54);
            if (drawerContent4 != null) {
                $composer3.startReplaceGroup(651765711);
                ComposerKt.sourceInformation($composer3, "235@11170L19,225@10712L487");
                long drawerBackgroundColor4 = drawerBackgroundColor3;
                Function3 drawerContent7 = drawerContent4;
                boolean drawerGesturesEnabled8 = drawerGesturesEnabled5;
                DrawerKt.m1670ModalDrawerGs3lGvM(drawerContent7, modifier2, scaffoldState2.getDrawerState(), drawerGesturesEnabled8, drawerShape3, drawerElevation3, drawerBackgroundColor4, drawerContentColor3, drawerScrimColor3, ComposableLambdaKt.rememberComposableLambda(-1409196448, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer $composer4, int $changed2) {
                        ComposerKt.sourceInformation($composer4, "C235@11172L15:Scaffold.kt#jmzs0o");
                        if (!$composer4.shouldExecute(($changed2 & 3) != 2, $changed2 & 1)) {
                            $composer4.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1409196448, $changed2, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:235)");
                        }
                        child.invoke(Modifier.INSTANCE, $composer4, 54);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, $composer3, 54), $composer3, (($dirty >> 27) & 14) | LZMA2Options.DICT_SIZE_MAX | ($dirty & 112) | (($dirty19 << 9) & GL11.GL_RENDER) | (($dirty19 << 9) & 57344) | (($dirty19 << 9) & 458752) | (($dirty19 << 9) & 3670016) | (($dirty19 << 9) & 29360128) | (234881024 & ($dirty19 << 9)), 0);
                drawerContent5 = drawerContent7;
                drawerGesturesEnabled6 = drawerGesturesEnabled8;
                drawerBackgroundColor3 = drawerBackgroundColor4;
                $composer2 = $composer3;
                $composer2.endReplaceGroup();
            } else {
                drawerContent5 = drawerContent4;
                drawerGesturesEnabled6 = drawerGesturesEnabled5;
                $composer2 = $composer3;
                $composer2.startReplaceGroup(652256007);
                ComposerKt.sourceInformation($composer2, "238@11221L15");
                child.invoke(modifier2, $composer2, Integer.valueOf((($dirty >> 3) & 14) | 48));
                $composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            topBar2 = topBar;
            floatingActionButtonPosition3 = floatingActionButtonPosition2;
            isFloatingActionButtonDocked2 = isFloatingActionButtonDocked5;
            Function2 function24 = bottomBar;
            drawerContent = drawerContent5;
            modifier3 = modifier2;
            drawerShape2 = drawerShape3;
            floatingActionButton2 = floatingActionButton;
            drawerBackgroundColor2 = drawerBackgroundColor3;
            bottomBar2 = function24;
            snackbarHost2 = snackbarHost;
            drawerGesturesEnabled2 = drawerGesturesEnabled6;
            scaffoldState3 = scaffoldState2;
            drawerElevation2 = drawerElevation3;
            drawerContentColor2 = drawerContentColor3;
            drawerScrimColor2 = drawerScrimColor3;
            backgroundColor2 = backgroundColor4;
            contentColor2 = contentColor3;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            drawerScrimColor2 = drawerScrimColor;
            backgroundColor2 = backgroundColor;
            contentColor2 = contentColor;
            topBar2 = topBar;
            floatingActionButtonPosition3 = floatingActionButtonPosition2;
            bottomBar2 = bottomBar;
            snackbarHost2 = snackbarHost;
            modifier3 = modifier2;
            scaffoldState3 = scaffoldState2;
            floatingActionButton2 = floatingActionButton;
            isFloatingActionButtonDocked2 = isFloatingActionButtonDocked;
            drawerContent = function32;
            drawerGesturesEnabled2 = drawerGesturesEnabled;
            drawerShape2 = drawerShape;
            drawerElevation2 = drawerElevation;
            drawerBackgroundColor2 = drawerBackgroundColor;
            drawerContentColor2 = drawerContentColor;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i20) {
                    ScaffoldKt.m1771Scaffoldu4IkXBM(contentWindowInsets, modifier3, scaffoldState3, topBar2, bottomBar2, snackbarHost2, floatingActionButton2, floatingActionButtonPosition3, isFloatingActionButtonDocked2, drawerContent, drawerGesturesEnabled2, drawerShape2, drawerElevation2, drawerBackgroundColor2, drawerContentColor2, drawerScrimColor2, backgroundColor2, contentColor2, function33, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), RecomposeScopeImplKt.updateChangedFlags($changed1), i);
                }
            });
        }
    }

    /* renamed from: Scaffold-27mzLpw, reason: not valid java name */
    public static final void m1770Scaffold27mzLpw(Modifier modifier, ScaffoldState scaffoldState, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function23, int floatingActionButtonPosition, boolean isFloatingActionButtonDocked, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32, boolean drawerGesturesEnabled, Shape drawerShape, float drawerElevation, long drawerBackgroundColor, long drawerContentColor, long drawerScrimColor, long backgroundColor, long contentColor, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function33, Composer $composer, final int $changed, final int $changed1, final int i) {
        Modifier modifier2;
        ScaffoldState scaffoldState2;
        Function2 topBar;
        Function2 bottomBar;
        Function3 snackbarHost;
        Function2 floatingActionButton;
        int floatingActionButtonPosition2;
        int i2;
        int i3;
        int i4;
        int $dirty;
        int $dirty1;
        long j;
        int $dirty12;
        Composer $composer2;
        final long drawerContentColor2;
        final long drawerContentColor3;
        final long drawerScrimColor2;
        final Function2 topBar2;
        final Function2 bottomBar2;
        final Modifier modifier3;
        final ScaffoldState scaffoldState3;
        final Function3 snackbarHost2;
        final Function2 floatingActionButton2;
        final int floatingActionButtonPosition3;
        final boolean isFloatingActionButtonDocked2;
        final Function3 snackbarHost3;
        final boolean drawerGesturesEnabled2;
        final Shape drawerShape2;
        final float drawerElevation2;
        final long drawerBackgroundColor2;
        final long drawerBackgroundColor3;
        int $dirty2;
        boolean isFloatingActionButtonDocked3;
        Function3 drawerContent;
        boolean drawerGesturesEnabled3;
        CornerBasedShape drawerShape3;
        int $dirty13;
        float drawerElevation3;
        boolean isFloatingActionButtonDocked4;
        Function3 drawerContent2;
        long drawerBackgroundColor4;
        long drawerContentColor4;
        long drawerBackgroundColor5;
        long drawerScrimColor3;
        long backgroundColor2;
        boolean drawerGesturesEnabled4;
        Modifier modifier4;
        Function3 snackbarHost4;
        int floatingActionButtonPosition4;
        long drawerBackgroundColor6;
        long drawerContentColor5;
        Function3 drawerContent3;
        long contentColor2;
        long backgroundColor3;
        int $dirty3;
        int $dirty14;
        Shape drawerShape4;
        ScaffoldState scaffoldState4;
        Function2 floatingActionButton3;
        boolean isFloatingActionButtonDocked5;
        int $dirty15;
        Composer $composer3 = $composer.startRestartGroup(1037492569);
        ComposerKt.sourceInformation($composer3, "C(Scaffold)P(14,15,17,1,16,11,12:c#material.FabPosition,13,5,8,10,7:c#ui.unit.Dp,4:c#ui.graphics.Color,6:c#ui.graphics.Color,9:c#ui.graphics.Color,0:c#ui.graphics.Color,3:c#ui.graphics.Color)324@16098L495:Scaffold.kt#jmzs0o");
        int $dirty4 = $changed;
        int $dirty16 = $changed1;
        int i5 = i & 1;
        if (i5 != 0) {
            $dirty4 |= 6;
            modifier2 = modifier;
        } else if (($changed & 6) == 0) {
            modifier2 = modifier;
            $dirty4 |= $composer3.changed(modifier2) ? 4 : 2;
        } else {
            modifier2 = modifier;
        }
        if (($changed & 48) == 0) {
            if ((i & 2) == 0) {
                scaffoldState2 = scaffoldState;
                int i6 = $composer3.changed(scaffoldState2) ? 32 : 16;
                $dirty4 |= i6;
            } else {
                scaffoldState2 = scaffoldState;
            }
            $dirty4 |= i6;
        } else {
            scaffoldState2 = scaffoldState;
        }
        int i7 = i & 4;
        if (i7 != 0) {
            $dirty4 |= 384;
            topBar = function2;
        } else if (($changed & 384) == 0) {
            topBar = function2;
            $dirty4 |= $composer3.changedInstance(topBar) ? 256 : 128;
        } else {
            topBar = function2;
        }
        int i8 = i & 8;
        int i9 = 2048;
        if (i8 != 0) {
            $dirty4 |= 3072;
            bottomBar = function22;
        } else if (($changed & 3072) == 0) {
            bottomBar = function22;
            $dirty4 |= $composer3.changedInstance(bottomBar) ? 2048 : 1024;
        } else {
            bottomBar = function22;
        }
        int i10 = i & 16;
        if (i10 != 0) {
            $dirty4 |= 24576;
            snackbarHost = function3;
        } else if (($changed & 24576) == 0) {
            snackbarHost = function3;
            $dirty4 |= $composer3.changedInstance(snackbarHost) ? 16384 : 8192;
        } else {
            snackbarHost = function3;
        }
        int i11 = i & 32;
        if (i11 != 0) {
            $dirty4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            floatingActionButton = function23;
        } else if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            floatingActionButton = function23;
            $dirty4 |= $composer3.changedInstance(floatingActionButton) ? 131072 : 65536;
        } else {
            floatingActionButton = function23;
        }
        int i12 = i & 64;
        if (i12 != 0) {
            $dirty4 |= JNINativeInterface.JNI_VERSION_24;
            floatingActionButtonPosition2 = floatingActionButtonPosition;
        } else if (($changed & JNINativeInterface.JNI_VERSION_24) == 0) {
            floatingActionButtonPosition2 = floatingActionButtonPosition;
            $dirty4 |= $composer3.changed(floatingActionButtonPosition2) ? 1048576 : 524288;
        } else {
            floatingActionButtonPosition2 = floatingActionButtonPosition;
        }
        int i13 = i & 128;
        if (i13 != 0) {
            $dirty4 |= User32.WS_CAPTION;
        } else if (($changed & User32.WS_CAPTION) == 0) {
            $dirty4 |= $composer3.changed(isFloatingActionButtonDocked) ? 8388608 : 4194304;
        }
        int i14 = i & 256;
        if (i14 != 0) {
            $dirty4 |= 100663296;
            i2 = i14;
        } else if (($changed & 100663296) == 0) {
            i2 = i14;
            $dirty4 |= $composer3.changedInstance(function32) ? 67108864 : 33554432;
        } else {
            i2 = i14;
        }
        int i15 = i & 512;
        if (i15 != 0) {
            $dirty4 |= LZMA2Options.DICT_SIZE_MAX;
            i3 = i15;
        } else if (($changed & LZMA2Options.DICT_SIZE_MAX) == 0) {
            i3 = i15;
            $dirty4 |= $composer3.changed(drawerGesturesEnabled) ? 536870912 : 268435456;
        } else {
            i3 = i15;
        }
        if (($changed1 & 6) == 0) {
            $dirty16 |= ((i & 1024) == 0 && $composer3.changed(drawerShape)) ? 4 : 2;
        }
        int i16 = i & 2048;
        if (i16 != 0) {
            $dirty16 |= 48;
            i4 = i16;
        } else if (($changed1 & 48) == 0) {
            i4 = i16;
            $dirty16 |= $composer3.changed(drawerElevation) ? 32 : 16;
        } else {
            i4 = i16;
        }
        if (($changed1 & 384) == 0) {
            if ((i & 4096) == 0) {
                $dirty = $dirty4;
                $dirty15 = $dirty16;
                int i17 = $composer3.changed(drawerBackgroundColor) ? 256 : 128;
                $dirty1 = $dirty15 | i17;
            } else {
                $dirty = $dirty4;
                $dirty15 = $dirty16;
            }
            $dirty1 = $dirty15 | i17;
        } else {
            $dirty = $dirty4;
            $dirty1 = $dirty16;
        }
        int $dirty17 = $dirty1;
        if (($changed1 & 3072) == 0) {
            if ((i & 8192) == 0) {
                j = drawerContentColor;
                if (!$composer3.changed(j)) {
                }
                $dirty12 = $dirty17 | i9;
            } else {
                j = drawerContentColor;
            }
            i9 = 1024;
            $dirty12 = $dirty17 | i9;
        } else {
            j = drawerContentColor;
            $dirty12 = $dirty17;
        }
        int $dirty18 = $dirty12;
        if (($changed1 & 24576) == 0) {
            $dirty18 |= ((i & 16384) == 0 && $composer3.changed(drawerScrimColor)) ? 16384 : 8192;
        }
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            $dirty18 |= ((i & 32768) == 0 && $composer3.changed(backgroundColor)) ? 131072 : 65536;
        }
        if (($changed1 & JNINativeInterface.JNI_VERSION_24) == 0) {
            $dirty18 |= ((i & 65536) == 0 && $composer3.changed(contentColor)) ? 1048576 : 524288;
        }
        if ((i & 131072) != 0) {
            $dirty18 |= User32.WS_CAPTION;
        } else if (($changed1 & User32.WS_CAPTION) == 0) {
            $dirty18 |= $composer3.changedInstance(function33) ? 8388608 : 4194304;
        }
        if ($composer3.shouldExecute((($dirty & 306783379) == 306783378 && ($dirty18 & 4793491) == 4793490) ? false : true, $dirty & 1)) {
            $composer3.startDefaults();
            ComposerKt.sourceInformation($composer3, "306@15149L23,315@15659L6,317@15774L6,318@15822L38,319@15907L10,320@15962L6,321@16007L32");
            if (($changed & 1) != 0 && !$composer3.getDefaultsInvalid()) {
                $composer3.skipToGroupEnd();
                $dirty3 = (i & 2) != 0 ? $dirty & (-113) : $dirty;
                if ((i & 1024) != 0) {
                    $dirty18 &= -15;
                }
                $dirty14 = $dirty18;
                if ((i & 4096) != 0) {
                    $dirty14 &= -897;
                }
                if ((i & 8192) != 0) {
                    $dirty14 &= -7169;
                }
                if ((i & 16384) != 0) {
                    $dirty14 &= -57345;
                }
                if ((32768 & i) != 0) {
                    $dirty14 &= -458753;
                }
                if ((i & 65536) != 0) {
                    $dirty14 &= -3670017;
                }
                drawerContent3 = function32;
                drawerShape4 = drawerShape;
                drawerElevation3 = drawerElevation;
                drawerContentColor5 = drawerBackgroundColor;
                drawerScrimColor3 = drawerScrimColor;
                backgroundColor3 = backgroundColor;
                contentColor2 = contentColor;
                drawerBackgroundColor6 = j;
                modifier4 = modifier2;
                scaffoldState4 = scaffoldState2;
                snackbarHost4 = snackbarHost;
                floatingActionButton3 = floatingActionButton;
                floatingActionButtonPosition4 = floatingActionButtonPosition2;
                isFloatingActionButtonDocked5 = isFloatingActionButtonDocked;
                drawerGesturesEnabled4 = drawerGesturesEnabled;
            } else {
                if (i5 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i & 2) == 0) {
                    $dirty2 = $dirty;
                } else {
                    $dirty2 = $dirty & (-113);
                    scaffoldState2 = rememberScaffoldState(null, null, $composer3, 0, 3);
                }
                if (i7 != 0) {
                    topBar = ComposableSingletons$ScaffoldKt.INSTANCE.m1652getLambda5$material_release();
                }
                if (i8 != 0) {
                    bottomBar = ComposableSingletons$ScaffoldKt.INSTANCE.m1653getLambda6$material_release();
                }
                if (i10 != 0) {
                    snackbarHost = ComposableSingletons$ScaffoldKt.INSTANCE.m1654getLambda7$material_release();
                }
                if (i11 != 0) {
                    floatingActionButton = ComposableSingletons$ScaffoldKt.INSTANCE.m1655getLambda8$material_release();
                }
                if (i12 != 0) {
                    floatingActionButtonPosition2 = FabPosition.INSTANCE.m1698getEnd5ygKITE();
                }
                if (i13 == 0) {
                    isFloatingActionButtonDocked3 = isFloatingActionButtonDocked;
                } else {
                    isFloatingActionButtonDocked3 = false;
                }
                if (i2 == 0) {
                    drawerContent = function32;
                } else {
                    drawerContent = null;
                }
                if (i3 == 0) {
                    drawerGesturesEnabled3 = drawerGesturesEnabled;
                } else {
                    drawerGesturesEnabled3 = true;
                }
                if ((i & 1024) == 0) {
                    drawerShape3 = drawerShape;
                    $dirty13 = $dirty18;
                } else {
                    drawerShape3 = MaterialTheme.INSTANCE.getShapes($composer3, 6).getLarge();
                    $dirty13 = $dirty18 & (-15);
                }
                if (i4 == 0) {
                    drawerElevation3 = drawerElevation;
                } else {
                    drawerElevation3 = DrawerDefaults.INSTANCE.m1667getElevationD9Ej5fM();
                }
                if ((i & 4096) == 0) {
                    isFloatingActionButtonDocked4 = isFloatingActionButtonDocked3;
                    drawerContent2 = drawerContent;
                    drawerBackgroundColor4 = drawerBackgroundColor;
                } else {
                    isFloatingActionButtonDocked4 = isFloatingActionButtonDocked3;
                    $dirty13 &= -897;
                    drawerContent2 = drawerContent;
                    drawerBackgroundColor4 = MaterialTheme.INSTANCE.getColors($composer3, 6).m1623getSurface0d7_KjU();
                }
                if ((i & 8192) == 0) {
                    drawerContentColor4 = drawerContentColor;
                } else {
                    drawerContentColor4 = ColorsKt.m1637contentColorForek8zF_U(drawerBackgroundColor4, $composer3, ($dirty13 >> 6) & 14);
                    $dirty13 &= -7169;
                }
                if ((i & 16384) == 0) {
                    drawerBackgroundColor5 = drawerBackgroundColor4;
                    drawerScrimColor3 = drawerScrimColor;
                } else {
                    drawerBackgroundColor5 = drawerBackgroundColor4;
                    drawerScrimColor3 = DrawerDefaults.INSTANCE.getScrimColor($composer3, 6);
                    $dirty13 &= -57345;
                }
                if ((32768 & i) == 0) {
                    backgroundColor2 = backgroundColor;
                } else {
                    backgroundColor2 = MaterialTheme.INSTANCE.getColors($composer3, 6).m1612getBackground0d7_KjU();
                    $dirty13 &= -458753;
                }
                if ((i & 65536) == 0) {
                    int $dirty19 = floatingActionButtonPosition2;
                    drawerGesturesEnabled4 = drawerGesturesEnabled3;
                    modifier4 = modifier2;
                    snackbarHost4 = snackbarHost;
                    floatingActionButtonPosition4 = $dirty19;
                    long j2 = drawerBackgroundColor5;
                    drawerBackgroundColor6 = drawerContentColor4;
                    drawerContentColor5 = j2;
                    drawerContent3 = drawerContent2;
                    contentColor2 = contentColor;
                    backgroundColor3 = backgroundColor2;
                    $dirty3 = $dirty2;
                    $dirty14 = $dirty13;
                    drawerShape4 = drawerShape3;
                    scaffoldState4 = scaffoldState2;
                    floatingActionButton3 = floatingActionButton;
                    isFloatingActionButtonDocked5 = isFloatingActionButtonDocked4;
                } else {
                    long contentColor3 = ColorsKt.m1637contentColorForek8zF_U(backgroundColor2, $composer3, ($dirty13 >> 15) & 14);
                    int i18 = (-3670017) & $dirty13;
                    int $dirty110 = floatingActionButtonPosition2;
                    drawerGesturesEnabled4 = drawerGesturesEnabled3;
                    modifier4 = modifier2;
                    snackbarHost4 = snackbarHost;
                    floatingActionButtonPosition4 = $dirty110;
                    long j3 = drawerBackgroundColor5;
                    drawerBackgroundColor6 = drawerContentColor4;
                    drawerContentColor5 = j3;
                    drawerShape4 = drawerShape3;
                    scaffoldState4 = scaffoldState2;
                    floatingActionButton3 = floatingActionButton;
                    contentColor2 = contentColor3;
                    isFloatingActionButtonDocked5 = isFloatingActionButtonDocked4;
                    backgroundColor3 = backgroundColor2;
                    $dirty3 = $dirty2;
                    $dirty14 = i18;
                    drawerContent3 = drawerContent2;
                }
            }
            $composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1037492569, $dirty3, $dirty14, "androidx.compose.material.Scaffold (Scaffold.kt:323)");
            }
            int $dirty5 = $dirty3;
            $composer2 = $composer3;
            m1771Scaffoldu4IkXBM(WindowInsetsKt.m810WindowInsetsa9UjIt4$default(Dp.m7018constructorimpl(0), 0.0f, 0.0f, 0.0f, 14, null), modifier4, scaffoldState4, topBar, bottomBar, snackbarHost4, floatingActionButton3, floatingActionButtonPosition4, isFloatingActionButtonDocked5, drawerContent3, drawerGesturesEnabled4, drawerShape4, drawerElevation3, drawerContentColor5, drawerBackgroundColor6, drawerScrimColor3, backgroundColor3, contentColor2, function33, $composer2, (($dirty5 << 3) & 112) | (($dirty5 << 3) & User32.WM_PENWINFIRST) | (($dirty5 << 3) & GL11.GL_RENDER) | (($dirty5 << 3) & 57344) | (($dirty5 << 3) & 458752) | (($dirty5 << 3) & 3670016) | (($dirty5 << 3) & 29360128) | (($dirty5 << 3) & 234881024) | (($dirty5 << 3) & 1879048192), (($dirty5 >> 27) & 14) | (($dirty14 << 3) & 112) | (($dirty14 << 3) & User32.WM_PENWINFIRST) | (($dirty14 << 3) & GL11.GL_RENDER) | (($dirty14 << 3) & 57344) | (($dirty14 << 3) & 458752) | (($dirty14 << 3) & 3670016) | (($dirty14 << 3) & 29360128) | (($dirty14 << 3) & 234881024), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
            scaffoldState3 = scaffoldState4;
            topBar2 = topBar;
            bottomBar2 = bottomBar;
            snackbarHost2 = snackbarHost4;
            floatingActionButton2 = floatingActionButton3;
            floatingActionButtonPosition3 = floatingActionButtonPosition4;
            isFloatingActionButtonDocked2 = isFloatingActionButtonDocked5;
            snackbarHost3 = drawerContent3;
            drawerGesturesEnabled2 = drawerGesturesEnabled4;
            drawerShape2 = drawerShape4;
            drawerElevation2 = drawerElevation3;
            drawerBackgroundColor2 = drawerContentColor5;
            drawerContentColor2 = drawerBackgroundColor6;
            drawerBackgroundColor3 = drawerScrimColor3;
            drawerContentColor3 = backgroundColor3;
            drawerScrimColor2 = contentColor2;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            drawerContentColor2 = drawerContentColor;
            drawerContentColor3 = backgroundColor;
            drawerScrimColor2 = contentColor;
            topBar2 = topBar;
            bottomBar2 = bottomBar;
            modifier3 = modifier2;
            scaffoldState3 = scaffoldState2;
            snackbarHost2 = snackbarHost;
            floatingActionButton2 = floatingActionButton;
            floatingActionButtonPosition3 = floatingActionButtonPosition2;
            isFloatingActionButtonDocked2 = isFloatingActionButtonDocked;
            snackbarHost3 = function32;
            drawerGesturesEnabled2 = drawerGesturesEnabled;
            drawerShape2 = drawerShape;
            drawerElevation2 = drawerElevation;
            drawerBackgroundColor2 = drawerBackgroundColor;
            drawerBackgroundColor3 = drawerScrimColor;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i19) {
                    ScaffoldKt.m1770Scaffold27mzLpw(modifier3, scaffoldState3, topBar2, bottomBar2, snackbarHost2, floatingActionButton2, floatingActionButtonPosition3, isFloatingActionButtonDocked2, snackbarHost3, drawerGesturesEnabled2, drawerShape2, drawerElevation2, drawerBackgroundColor2, drawerContentColor2, drawerBackgroundColor3, drawerContentColor3, drawerScrimColor2, function33, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), RecomposeScopeImplKt.updateChangedFlags($changed1), i);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ScaffoldLayout-i1QSOvI, reason: not valid java name */
    public static final void m1772ScaffoldLayouti1QSOvI(final boolean isFabDocked, final int fabPosition, final Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final WindowInsets contentWindowInsets, final Function2<? super Composer, ? super Integer, Unit> function24, Composer $composer, final int $changed) {
        boolean z;
        final int i;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function32;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        Function2<? super Composer, ? super Integer, Unit> function27;
        WindowInsets windowInsets;
        Function2<? super Composer, ? super Integer, Unit> function28;
        int i2;
        Composer $composer2 = $composer.startRestartGroup(-468424875);
        ComposerKt.sourceInformation($composer2, "C(ScaffoldLayout)P(5,4:c#material.FabPosition,7,1,6,3,2)383@18273L626,399@18922L6942,399@18905L6959:Scaffold.kt#jmzs0o");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            z = isFabDocked;
            $dirty |= $composer2.changed(z) ? 4 : 2;
        } else {
            z = isFabDocked;
        }
        if (($changed & 48) == 0) {
            i = fabPosition;
            $dirty |= $composer2.changed(i) ? 32 : 16;
        } else {
            i = fabPosition;
        }
        if (($changed & 384) == 0) {
            function25 = function2;
            $dirty |= $composer2.changedInstance(function25) ? 256 : 128;
        } else {
            function25 = function2;
        }
        if (($changed & 3072) == 0) {
            function32 = function3;
            $dirty |= $composer2.changedInstance(function32) ? 2048 : 1024;
        } else {
            function32 = function3;
        }
        if (($changed & 24576) == 0) {
            function26 = function22;
            $dirty |= $composer2.changedInstance(function26) ? 16384 : 8192;
        } else {
            function26 = function22;
        }
        if ((196608 & $changed) == 0) {
            function27 = function23;
            $dirty |= $composer2.changedInstance(function27) ? 131072 : 65536;
        } else {
            function27 = function23;
        }
        if (($changed & JNINativeInterface.JNI_VERSION_24) == 0) {
            windowInsets = contentWindowInsets;
            $dirty |= $composer2.changed(windowInsets) ? 1048576 : 524288;
        } else {
            windowInsets = contentWindowInsets;
        }
        if (($changed & User32.WS_CAPTION) == 0) {
            function28 = function24;
            $dirty |= $composer2.changedInstance(function28) ? 8388608 : 4194304;
        } else {
            function28 = function24;
        }
        if ($composer2.shouldExecute(($dirty & 4793491) != 4793490, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-468424875, $dirty, -1, "androidx.compose.material.ScaffoldLayout (Scaffold.kt:378)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, -771521224, "CC(remember):Scaffold.kt#9igjgp");
            Object it$iv = $composer2.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new ScaffoldKt$ScaffoldLayout$contentPadding$1$1();
                $composer2.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            final ScaffoldKt$ScaffoldLayout$contentPadding$1$1 contentPadding = (ScaffoldKt$ScaffoldLayout$contentPadding$1$1) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -771494140, "CC(remember):Scaffold.kt#9igjgp");
            boolean invalid$iv = (($dirty & User32.WM_PENWINFIRST) == 256) | ((57344 & $dirty) == 16384) | ((3670016 & $dirty) == 1048576) | ((458752 & $dirty) == 131072) | (($dirty & 112) == 32) | (($dirty & 14) == 4) | ((29360128 & $dirty) == 8388608) | (($dirty & GL11.GL_RENDER) == 2048);
            Object value$iv2 = $composer2.rememberedValue();
            if (invalid$iv || value$iv2 == Composer.INSTANCE.getEmpty()) {
                final boolean z2 = z;
                final WindowInsets windowInsets2 = windowInsets;
                final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function33 = function32;
                final Function2<? super Composer, ? super Integer, Unit> function29 = function28;
                i2 = 0;
                final Function2<? super Composer, ? super Integer, Unit> function210 = function27;
                value$iv2 = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m1774invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                    }

                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final MeasureResult m1774invoke0kLqBqw(SubcomposeMeasureScope $this$SubcomposeLayout, long constraints) {
                        Object maxElem$iv;
                        Object maxElem$iv2;
                        final FabPlacement fabPlacement;
                        Object maxElem$iv3;
                        Integer numValueOf;
                        final int snackbarOffsetFromBottom;
                        Object maxElem$iv4;
                        Object maxElem$iv5;
                        int layoutWidth = Constraints.m6971getMaxWidthimpl(constraints);
                        int layoutHeight = Constraints.m6970getMaxHeightimpl(constraints);
                        long looseConstraints = Constraints.m6960copyZbe2FdA(constraints, (11 & 1) != 0 ? Constraints.m6973getMinWidthimpl(constraints) : 0, (11 & 2) != 0 ? Constraints.m6971getMaxWidthimpl(constraints) : 0, (11 & 4) != 0 ? Constraints.m6972getMinHeightimpl(constraints) : 0, (11 & 8) != 0 ? Constraints.m6970getMaxHeightimpl(constraints) : 0);
                        List $this$fastMap$iv = $this$SubcomposeLayout.subcompose(ScaffoldLayoutContent.TopBar, function25);
                        List target$iv = new ArrayList($this$fastMap$iv.size());
                        int index$iv$iv = 0;
                        int size = $this$fastMap$iv.size();
                        while (index$iv$iv < size) {
                            Object item$iv$iv = $this$fastMap$iv.get(index$iv$iv);
                            int layoutWidth2 = layoutWidth;
                            Measurable it = (Measurable) item$iv$iv;
                            target$iv.add(it.mo5750measureBRTryo0(looseConstraints));
                            index$iv$iv++;
                            $this$fastMap$iv = $this$fastMap$iv;
                            layoutWidth = layoutWidth2;
                        }
                        int layoutWidth3 = layoutWidth;
                        List topBarPlaceables = target$iv;
                        if (topBarPlaceables.isEmpty()) {
                            maxElem$iv = null;
                        } else {
                            maxElem$iv = topBarPlaceables.get(0);
                            Placeable it2 = (Placeable) maxElem$iv;
                            int maxValue$iv = it2.getHeight();
                            int i$iv = 1;
                            int lastIndex = CollectionsKt.getLastIndex(topBarPlaceables);
                            if (1 <= lastIndex) {
                                while (true) {
                                    Object e$iv = topBarPlaceables.get(i$iv);
                                    Placeable it3 = (Placeable) e$iv;
                                    int v$iv = it3.getHeight();
                                    if (maxValue$iv < v$iv) {
                                        maxElem$iv = e$iv;
                                        maxValue$iv = v$iv;
                                    }
                                    if (i$iv == lastIndex) {
                                        break;
                                    }
                                    i$iv++;
                                }
                            }
                        }
                        Placeable placeable = (Placeable) maxElem$iv;
                        final int topBarHeight = placeable != null ? placeable.getHeight() : 0;
                        List $this$fastMap$iv2 = $this$SubcomposeLayout.subcompose(ScaffoldLayoutContent.Snackbar, function26);
                        WindowInsets windowInsets3 = windowInsets2;
                        int $i$f$fastMap = 0;
                        List target$iv2 = new ArrayList($this$fastMap$iv2.size());
                        int index$iv$iv2 = 0;
                        int size2 = $this$fastMap$iv2.size();
                        while (index$iv$iv2 < size2) {
                            Object item$iv$iv2 = $this$fastMap$iv2.get(index$iv$iv2);
                            List $this$fastMap$iv3 = $this$fastMap$iv2;
                            Measurable it4 = (Measurable) item$iv$iv2;
                            int layoutHeight2 = layoutHeight;
                            int $i$f$fastMap2 = $i$f$fastMap;
                            int leftInset = windowInsets3.getLeft($this$SubcomposeLayout, $this$SubcomposeLayout.getLayoutDirection());
                            List topBarPlaceables2 = topBarPlaceables;
                            int rightInset = windowInsets3.getRight($this$SubcomposeLayout, $this$SubcomposeLayout.getLayoutDirection());
                            int bottomInset = windowInsets3.getBottom($this$SubcomposeLayout);
                            WindowInsets windowInsets4 = windowInsets3;
                            int i3 = (-leftInset) - rightInset;
                            int leftInset2 = -bottomInset;
                            target$iv2.add(it4.mo5750measureBRTryo0(ConstraintsKt.m6990offsetNN6EwU(looseConstraints, i3, leftInset2)));
                            index$iv$iv2++;
                            $this$fastMap$iv2 = $this$fastMap$iv3;
                            layoutHeight = layoutHeight2;
                            $i$f$fastMap = $i$f$fastMap2;
                            topBarPlaceables = topBarPlaceables2;
                            windowInsets3 = windowInsets4;
                        }
                        final int layoutHeight3 = layoutHeight;
                        final List topBarPlaceables3 = topBarPlaceables;
                        List snackbarPlaceables = target$iv2;
                        if (snackbarPlaceables.isEmpty()) {
                            maxElem$iv2 = null;
                        } else {
                            maxElem$iv2 = snackbarPlaceables.get(0);
                            Placeable it5 = (Placeable) maxElem$iv2;
                            int maxValue$iv2 = it5.getHeight();
                            int i$iv2 = 1;
                            int lastIndex2 = CollectionsKt.getLastIndex(snackbarPlaceables);
                            if (1 <= lastIndex2) {
                                while (true) {
                                    Object e$iv2 = snackbarPlaceables.get(i$iv2);
                                    Placeable it6 = (Placeable) e$iv2;
                                    int v$iv2 = it6.getHeight();
                                    if (maxValue$iv2 < v$iv2) {
                                        maxElem$iv2 = e$iv2;
                                        maxValue$iv2 = v$iv2;
                                    }
                                    if (i$iv2 == lastIndex2) {
                                        break;
                                    }
                                    i$iv2++;
                                }
                            }
                        }
                        Placeable placeable2 = (Placeable) maxElem$iv2;
                        int snackbarHeight = placeable2 != null ? placeable2.getHeight() : 0;
                        List $this$fastMap$iv4 = $this$SubcomposeLayout.subcompose(ScaffoldLayoutContent.Fab, function210);
                        WindowInsets windowInsets5 = windowInsets2;
                        int $i$f$fastMap3 = 0;
                        ArrayList target$iv3 = new ArrayList($this$fastMap$iv4.size());
                        List $this$fastForEach$iv$iv = $this$fastMap$iv4;
                        int index$iv$iv3 = 0;
                        int size3 = $this$fastForEach$iv$iv.size();
                        while (index$iv$iv3 < size3) {
                            Object item$iv$iv3 = $this$fastForEach$iv$iv.get(index$iv$iv3);
                            List $this$fastMap$iv5 = $this$fastMap$iv4;
                            ArrayList arrayList = target$iv3;
                            int $i$f$fastMap4 = $i$f$fastMap3;
                            Measurable measurable = (Measurable) item$iv$iv3;
                            ArrayList target$iv4 = target$iv3;
                            List $this$fastForEach$iv$iv2 = $this$fastForEach$iv$iv;
                            int leftInset3 = windowInsets5.getLeft($this$SubcomposeLayout, $this$SubcomposeLayout.getLayoutDirection());
                            List snackbarPlaceables2 = snackbarPlaceables;
                            int rightInset2 = windowInsets5.getRight($this$SubcomposeLayout, $this$SubcomposeLayout.getLayoutDirection());
                            int bottomInset2 = windowInsets5.getBottom($this$SubcomposeLayout);
                            WindowInsets windowInsets6 = windowInsets5;
                            int i4 = (-leftInset3) - rightInset2;
                            int leftInset4 = -bottomInset2;
                            arrayList.add(measurable.mo5750measureBRTryo0(ConstraintsKt.m6990offsetNN6EwU(looseConstraints, i4, leftInset4)));
                            index$iv$iv3++;
                            $this$fastMap$iv4 = $this$fastMap$iv5;
                            $i$f$fastMap3 = $i$f$fastMap4;
                            target$iv3 = target$iv4;
                            $this$fastForEach$iv$iv = $this$fastForEach$iv$iv2;
                            snackbarPlaceables = snackbarPlaceables2;
                            windowInsets5 = windowInsets6;
                        }
                        final List snackbarPlaceables3 = snackbarPlaceables;
                        final ArrayList fabPlaceables = target$iv3;
                        if (fabPlaceables.isEmpty()) {
                            fabPlacement = null;
                        } else {
                            if (fabPlaceables.isEmpty()) {
                                maxElem$iv4 = null;
                            } else {
                                maxElem$iv4 = fabPlaceables.get(0);
                                Placeable it7 = (Placeable) maxElem$iv4;
                                int maxValue$iv3 = it7.getWidth();
                                int i$iv3 = 1;
                                int lastIndex3 = CollectionsKt.getLastIndex(fabPlaceables);
                                if (1 <= lastIndex3) {
                                    while (true) {
                                        Object e$iv3 = fabPlaceables.get(i$iv3);
                                        Placeable it8 = (Placeable) e$iv3;
                                        int v$iv3 = it8.getWidth();
                                        if (maxValue$iv3 < v$iv3) {
                                            maxElem$iv4 = e$iv3;
                                            maxValue$iv3 = v$iv3;
                                        }
                                        if (i$iv3 == lastIndex3) {
                                            break;
                                        }
                                        i$iv3++;
                                    }
                                }
                            }
                            Placeable placeable3 = (Placeable) maxElem$iv4;
                            int fabWidth = placeable3 != null ? placeable3.getWidth() : 0;
                            if (fabPlaceables.isEmpty()) {
                                maxElem$iv5 = null;
                            } else {
                                maxElem$iv5 = fabPlaceables.get(0);
                                Placeable it9 = (Placeable) maxElem$iv5;
                                int maxValue$iv4 = it9.getHeight();
                                int i$iv4 = 1;
                                int lastIndex4 = CollectionsKt.getLastIndex(fabPlaceables);
                                if (1 <= lastIndex4) {
                                    while (true) {
                                        Object e$iv4 = fabPlaceables.get(i$iv4);
                                        Placeable it10 = (Placeable) e$iv4;
                                        int v$iv4 = it10.getHeight();
                                        if (maxValue$iv4 < v$iv4) {
                                            maxElem$iv5 = e$iv4;
                                            maxValue$iv4 = v$iv4;
                                        }
                                        if (i$iv4 == lastIndex4) {
                                            break;
                                        }
                                        i$iv4++;
                                    }
                                }
                            }
                            Placeable placeable4 = (Placeable) maxElem$iv5;
                            int fabHeight = placeable4 != null ? placeable4.getHeight() : 0;
                            if (fabWidth == 0 || fabHeight == 0) {
                                fabPlacement = null;
                            } else {
                                int i5 = i;
                                int fabLeftOffset = FabPosition.m1693equalsimpl0(i5, FabPosition.INSTANCE.m1699getStart5ygKITE()) ? $this$SubcomposeLayout.getLayoutDirection() == LayoutDirection.Ltr ? $this$SubcomposeLayout.mo383roundToPx0680j_4(ScaffoldKt.FabSpacing) : (layoutWidth3 - $this$SubcomposeLayout.mo383roundToPx0680j_4(ScaffoldKt.FabSpacing)) - fabWidth : FabPosition.m1693equalsimpl0(i5, FabPosition.INSTANCE.m1698getEnd5ygKITE()) ? $this$SubcomposeLayout.getLayoutDirection() == LayoutDirection.Ltr ? (layoutWidth3 - $this$SubcomposeLayout.mo383roundToPx0680j_4(ScaffoldKt.FabSpacing)) - fabWidth : $this$SubcomposeLayout.mo383roundToPx0680j_4(ScaffoldKt.FabSpacing) : (layoutWidth3 - fabWidth) / 2;
                                fabPlacement = new FabPlacement(z2, fabLeftOffset, fabWidth, fabHeight);
                            }
                        }
                        ScaffoldLayoutContent scaffoldLayoutContent = ScaffoldLayoutContent.BottomBar;
                        final Function2<Composer, Integer, Unit> function211 = function29;
                        List $this$fastMap$iv6 = $this$SubcomposeLayout.subcompose(scaffoldLayoutContent, ComposableLambdaKt.composableLambdaInstance(424088350, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1$bottomBarPlaceables$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer $composer3, int $changed2) {
                                ComposerKt.sourceInformation($composer3, "C475@22502L156:Scaffold.kt#jmzs0o");
                                if ($composer3.shouldExecute(($changed2 & 3) != 2, $changed2 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(424088350, $changed2, -1, "androidx.compose.material.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:475)");
                                    }
                                    CompositionLocalKt.CompositionLocalProvider(ScaffoldKt.getLocalFabPlacement().provides(fabPlacement), function211, $composer3, ProvidedValue.$stable);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                $composer3.skipToGroupEnd();
                            }
                        }));
                        List target$iv5 = new ArrayList($this$fastMap$iv6.size());
                        int index$iv$iv4 = 0;
                        int size4 = $this$fastMap$iv6.size();
                        while (index$iv$iv4 < size4) {
                            Object item$iv$iv4 = $this$fastMap$iv6.get(index$iv$iv4);
                            List $this$fastMap$iv7 = $this$fastMap$iv6;
                            Measurable it11 = (Measurable) item$iv$iv4;
                            target$iv5.add(it11.mo5750measureBRTryo0(looseConstraints));
                            index$iv$iv4++;
                            $this$fastMap$iv6 = $this$fastMap$iv7;
                        }
                        final List bottomBarPlaceables = target$iv5;
                        if (bottomBarPlaceables.isEmpty()) {
                            maxElem$iv3 = null;
                        } else {
                            maxElem$iv3 = bottomBarPlaceables.get(0);
                            Placeable it12 = (Placeable) maxElem$iv3;
                            int maxValue$iv5 = it12.getHeight();
                            int i$iv5 = 1;
                            int lastIndex5 = CollectionsKt.getLastIndex(bottomBarPlaceables);
                            if (1 <= lastIndex5) {
                                while (true) {
                                    Object e$iv5 = bottomBarPlaceables.get(i$iv5);
                                    Placeable it13 = (Placeable) e$iv5;
                                    int height = it13.getHeight();
                                    if (maxValue$iv5 < height) {
                                        maxElem$iv3 = e$iv5;
                                        maxValue$iv5 = height;
                                    }
                                    if (i$iv5 == lastIndex5) {
                                        break;
                                    }
                                    i$iv5++;
                                }
                            }
                        }
                        Placeable placeable5 = (Placeable) maxElem$iv3;
                        Integer bottomBarHeight = placeable5 != null ? Integer.valueOf(placeable5.getHeight()) : null;
                        if (fabPlacement != null) {
                            FabPlacement it14 = fabPlacement;
                            numValueOf = Integer.valueOf(bottomBarHeight == null ? it14.getHeight() + $this$SubcomposeLayout.mo383roundToPx0680j_4(ScaffoldKt.FabSpacing) + windowInsets2.getBottom($this$SubcomposeLayout) : z2 ? (it14.getHeight() / 2) + bottomBarHeight.intValue() : $this$SubcomposeLayout.mo383roundToPx0680j_4(ScaffoldKt.FabSpacing) + bottomBarHeight.intValue() + it14.getHeight());
                        } else {
                            numValueOf = null;
                        }
                        Integer fabOffsetFromBottom = numValueOf;
                        if (snackbarHeight != 0) {
                            snackbarOffsetFromBottom = snackbarHeight + (fabOffsetFromBottom != null ? fabOffsetFromBottom.intValue() : bottomBarHeight != null ? bottomBarHeight.intValue() : windowInsets2.getBottom($this$SubcomposeLayout));
                        } else {
                            snackbarOffsetFromBottom = 0;
                        }
                        PaddingValues insets = WindowInsetsKt.asPaddingValues(windowInsets2, $this$SubcomposeLayout);
                        final Integer bottomBarHeight2 = bottomBarHeight;
                        contentPadding.setPaddingHolder(PaddingKt.m734PaddingValuesa9UjIt4(PaddingKt.calculateStartPadding(insets, $this$SubcomposeLayout.getLayoutDirection()), topBarPlaceables3.isEmpty() ? insets.getTop() : Dp.m7018constructorimpl(0), PaddingKt.calculateEndPadding(insets, $this$SubcomposeLayout.getLayoutDirection()), (bottomBarPlaceables.isEmpty() || bottomBarHeight == null) ? insets.getBottom() : $this$SubcomposeLayout.mo386toDpu2uoSUM(bottomBarHeight.intValue())));
                        int bodyContentHeight = layoutHeight3 - topBarHeight;
                        ScaffoldLayoutContent scaffoldLayoutContent2 = ScaffoldLayoutContent.MainContent;
                        final Function3<PaddingValues, Composer, Integer, Unit> function34 = function33;
                        final ScaffoldKt$ScaffoldLayout$contentPadding$1$1 scaffoldKt$ScaffoldLayout$contentPadding$1$1 = contentPadding;
                        List $this$fastMap$iv8 = $this$SubcomposeLayout.subcompose(scaffoldLayoutContent2, ComposableLambdaKt.composableLambdaInstance(-570781649, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1$bodyContentPlaceables$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer $composer3, int $changed2) {
                                ComposerKt.sourceInformation($composer3, "C534@24944L23:Scaffold.kt#jmzs0o");
                                if (!$composer3.shouldExecute(($changed2 & 3) != 2, $changed2 & 1)) {
                                    $composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-570781649, $changed2, -1, "androidx.compose.material.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:534)");
                                }
                                function34.invoke(scaffoldKt$ScaffoldLayout$contentPadding$1$1, $composer3, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }));
                        List target$iv6 = new ArrayList($this$fastMap$iv8.size());
                        int size5 = $this$fastMap$iv8.size();
                        int index$iv$iv5 = 0;
                        while (index$iv$iv5 < size5) {
                            Object item$iv$iv5 = $this$fastMap$iv8.get(index$iv$iv5);
                            int i6 = size5;
                            Measurable it15 = (Measurable) item$iv$iv5;
                            target$iv6.add(it15.mo5750measureBRTryo0(Constraints.m6960copyZbe2FdA(looseConstraints, (11 & 1) != 0 ? Constraints.m6973getMinWidthimpl(looseConstraints) : 0, (11 & 2) != 0 ? Constraints.m6971getMaxWidthimpl(looseConstraints) : 0, (11 & 4) != 0 ? Constraints.m6972getMinHeightimpl(looseConstraints) : 0, (11 & 8) != 0 ? Constraints.m6970getMaxHeightimpl(looseConstraints) : bodyContentHeight)));
                            index$iv$iv5++;
                            size5 = i6;
                            fabOffsetFromBottom = fabOffsetFromBottom;
                            $this$fastMap$iv8 = $this$fastMap$iv8;
                        }
                        final Integer fabOffsetFromBottom2 = fabOffsetFromBottom;
                        final List bodyContentPlaceables = target$iv6;
                        final FabPlacement fabPlacement2 = fabPlacement;
                        return MeasureScope.layout$default($this$SubcomposeLayout, layoutWidth3, layoutHeight3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope $this$layout) {
                                List $this$fastForEach$iv = bodyContentPlaceables;
                                int i7 = topBarHeight;
                                int size6 = $this$fastForEach$iv.size();
                                for (int index$iv = 0; index$iv < size6; index$iv++) {
                                    Object item$iv = $this$fastForEach$iv.get(index$iv);
                                    Placeable it16 = (Placeable) item$iv;
                                    Placeable.PlacementScope.place$default($this$layout, it16, 0, i7, 0.0f, 4, null);
                                }
                                List $this$fastForEach$iv2 = topBarPlaceables3;
                                int size7 = $this$fastForEach$iv2.size();
                                for (int index$iv2 = 0; index$iv2 < size7; index$iv2++) {
                                    Object item$iv2 = $this$fastForEach$iv2.get(index$iv2);
                                    Placeable it17 = (Placeable) item$iv2;
                                    Placeable.PlacementScope.place$default($this$layout, it17, 0, 0, 0.0f, 4, null);
                                }
                                List $this$fastForEach$iv3 = snackbarPlaceables3;
                                int i8 = layoutHeight3;
                                int i9 = snackbarOffsetFromBottom;
                                int size8 = $this$fastForEach$iv3.size();
                                for (int index$iv3 = 0; index$iv3 < size8; index$iv3++) {
                                    Object item$iv3 = $this$fastForEach$iv3.get(index$iv3);
                                    Placeable it18 = (Placeable) item$iv3;
                                    Placeable.PlacementScope.place$default($this$layout, it18, 0, i8 - i9, 0.0f, 4, null);
                                }
                                List $this$fastForEach$iv4 = bottomBarPlaceables;
                                int i10 = layoutHeight3;
                                Integer num = bottomBarHeight2;
                                int index$iv4 = 0;
                                int size9 = $this$fastForEach$iv4.size();
                                while (true) {
                                    int iIntValue = 0;
                                    if (index$iv4 >= size9) {
                                        break;
                                    }
                                    Object item$iv4 = $this$fastForEach$iv4.get(index$iv4);
                                    Placeable it19 = (Placeable) item$iv4;
                                    if (num != null) {
                                        iIntValue = num.intValue();
                                    }
                                    Placeable.PlacementScope.place$default($this$layout, it19, 0, i10 - iIntValue, 0.0f, 4, null);
                                    index$iv4++;
                                }
                                List $this$fastForEach$iv5 = fabPlaceables;
                                FabPlacement fabPlacement3 = fabPlacement2;
                                int i11 = layoutHeight3;
                                Integer num2 = fabOffsetFromBottom2;
                                int size10 = $this$fastForEach$iv5.size();
                                for (int index$iv5 = 0; index$iv5 < size10; index$iv5++) {
                                    Object item$iv5 = $this$fastForEach$iv5.get(index$iv5);
                                    Placeable it20 = (Placeable) item$iv5;
                                    Placeable.PlacementScope.place$default($this$layout, it20, fabPlacement3 != null ? fabPlacement3.getLeft() : 0, i11 - (num2 != null ? num2.intValue() : 0), 0.0f, 4, null);
                                }
                            }
                        }, 4, null);
                    }
                };
                $composer2.updateRememberedValue(value$iv2);
            } else {
                i2 = 0;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) value$iv2, $composer2, i2, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i3) {
                    ScaffoldKt.m1772ScaffoldLayouti1QSOvI(isFabDocked, fabPosition, function2, function3, function22, function23, contentWindowInsets, function24, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1));
                }
            });
        }
    }

    public static final ProvidableCompositionLocal<FabPlacement> getLocalFabPlacement() {
        return LocalFabPlacement;
    }
}
