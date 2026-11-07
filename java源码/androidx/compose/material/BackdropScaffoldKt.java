package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.Velocity;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlinx.coroutines.CoroutineScope;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.jni.JNINativeInterface;
import org.lwjgl.system.windows.User32;
import org.tukaani.xz.LZMA2Options;

/* compiled from: BackdropScaffold.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a;\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\b\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\b\u000bH\u0003¢\u0006\u0002\u0010\r\u001aò\u0001\u0010\u000e\u001a\u00020\u00062\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\b\u000b2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\b\u000b2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0019\b\u0002\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00060\u0016¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u00012\b\b\u0002\u0010$\u001a\u00020\u001f2\b\b\u0002\u0010%\u001a\u00020\u001f2\b\b\u0002\u0010&\u001a\u00020\u001fH\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001aH\u0010)\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020,2\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.2\u0014\b\u0002\u00100\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00190\u00162\b\b\u0002\u00101\u001a\u00020\u0017H\u0007\u001a[\u00102\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0011\u00103\u001a\r\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\b\u000b2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u0002050\u00162\u001d\u00106\u001a\u0019\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u000607¢\u0006\u0002\b\u000bH\u0003¢\u0006\u0002\u00108\u001a\u001c\u00109\u001a\u00020:2\n\u0010;\u001a\u0006\u0012\u0002\b\u00030<2\u0006\u0010=\u001a\u00020>H\u0000\u001a0\u0010?\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u001f2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010B\u001a\u00020\u0019H\u0003ø\u0001\u0000¢\u0006\u0004\bC\u0010D\u001aE\u0010E\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\b2\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.2\u0014\b\u0002\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00190\u00162\b\b\u0002\u00101\u001a\u00020\u0017H\u0007¢\u0006\u0002\u0010G\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006H²\u0006\n\u0010I\u001a\u00020/X\u008a\u0084\u0002²\u0006\n\u0010J\u001a\u00020/X\u008a\u0084\u0002"}, d2 = {"AnimationSlideOffset", "Landroidx/compose/ui/unit/Dp;", "F", "PositionalThreshold", "VelocityThreshold", "BackLayerTransition", "", "target", "Landroidx/compose/material/BackdropValue;", "appBar", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "(Landroidx/compose/material/BackdropValue;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "BackdropScaffold", "backLayerContent", "frontLayerContent", "modifier", "Landroidx/compose/ui/Modifier;", "scaffoldState", "Landroidx/compose/material/BackdropScaffoldState;", "snackbarHost", "Lkotlin/Function1;", "Landroidx/compose/material/SnackbarHostState;", "gesturesEnabled", "", "peekHeight", "headerHeight", "persistentAppBar", "stickyFrontLayer", "backLayerBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "backLayerContentColor", "frontLayerShape", "Landroidx/compose/ui/graphics/Shape;", "frontLayerElevation", "frontLayerBackgroundColor", "frontLayerContentColor", "frontLayerScrimColor", "BackdropScaffold-0hNv9B8", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BackdropScaffoldState;Lkotlin/jvm/functions/Function3;ZFFZZJJLandroidx/compose/ui/graphics/Shape;FJJJLandroidx/compose/runtime/Composer;III)V", "BackdropScaffoldState", "initialValue", "density", "Landroidx/compose/ui/unit/Density;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmValueChange", "snackbarHostState", "BackdropStack", "backLayer", "calculateBackLayerConstraints", "Landroidx/compose/ui/unit/Constraints;", "frontLayer", "Lkotlin/Function2;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)V", "ConsumeSwipeNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "state", "Landroidx/compose/material/AnchoredDraggableState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "Scrim", "color", "onDismiss", "visible", "Scrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "rememberBackdropScaffoldState", "confirmStateChange", "(Landroidx/compose/material/BackdropValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BackdropScaffoldState;", "material_release", "alpha", "animationProgress"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BackdropScaffoldKt {
    private static final float AnimationSlideOffset = Dp.m7018constructorimpl(20);
    private static final float VelocityThreshold = Dp.m7018constructorimpl(125);
    private static final float PositionalThreshold = Dp.m7018constructorimpl(56);

    public static /* synthetic */ BackdropScaffoldState BackdropScaffoldState$default(BackdropValue backdropValue, Density density, AnimationSpec animationSpec, Function1 function1, SnackbarHostState snackbarHostState, int i, Object obj) {
        if ((i & 4) != 0) {
            animationSpec = BackdropScaffoldDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i & 8) != 0) {
            function1 = new Function1<BackdropValue, Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackdropScaffoldState.1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(BackdropValue it) {
                    return true;
                }
            };
        }
        if ((i & 16) != 0) {
            snackbarHostState = new SnackbarHostState();
        }
        return BackdropScaffoldState(backdropValue, density, animationSpec, function1, snackbarHostState);
    }

    public static final BackdropScaffoldState BackdropScaffoldState(BackdropValue initialValue, Density density, AnimationSpec<Float> animationSpec, Function1<? super BackdropValue, Boolean> function1, SnackbarHostState snackbarHostState) {
        BackdropScaffoldState it = new BackdropScaffoldState(initialValue, animationSpec, function1, snackbarHostState);
        it.setDensity$material_release(density);
        return it;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1 A[PHI: r9
  0x00b1: PHI (r9v3 androidx.compose.material.BackdropValue) = (r9v1 androidx.compose.material.BackdropValue), (r9v4 androidx.compose.material.BackdropValue) binds: [B:28:0x00af, B:24:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.material.BackdropScaffoldState rememberBackdropScaffoldState(androidx.compose.material.BackdropValue r16, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r17, kotlin.jvm.functions.Function1<? super androidx.compose.material.BackdropValue, java.lang.Boolean> r18, androidx.compose.material.SnackbarHostState r19, androidx.compose.runtime.Composer r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BackdropScaffoldKt.rememberBackdropScaffoldState(androidx.compose.material.BackdropValue, androidx.compose.animation.core.AnimationSpec, kotlin.jvm.functions.Function1, androidx.compose.material.SnackbarHostState, androidx.compose.runtime.Composer, int, int):androidx.compose.material.BackdropScaffoldState");
    }

    /* renamed from: BackdropScaffold-0hNv9B8, reason: not valid java name */
    public static final void m1556BackdropScaffold0hNv9B8(Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, Modifier modifier, BackdropScaffoldState scaffoldState, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3, boolean gesturesEnabled, float peekHeight, float headerHeight, boolean persistentAppBar, boolean stickyFrontLayer, long backLayerBackgroundColor, long backLayerContentColor, Shape frontLayerShape, float frontLayerElevation, long frontLayerBackgroundColor, long frontLayerContentColor, long frontLayerScrimColor, Composer $composer, final int $changed, final int $changed1, final int i) {
        BackdropScaffoldState backdropScaffoldState;
        Function3 function32;
        boolean z;
        float f;
        float f2;
        int i2;
        int i3;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        Composer $composer2;
        final Modifier modifier2;
        final float peekHeight2;
        final float headerHeight2;
        final boolean persistentAppBar2;
        final boolean stickyFrontLayer2;
        final float frontLayerElevation2;
        final long frontLayerBackgroundColor2;
        final long frontLayerContentColor2;
        final long frontLayerScrimColor2;
        final boolean gesturesEnabled2;
        final Function3 snackbarHost;
        final BackdropScaffoldState scaffoldState2;
        final long backLayerBackgroundColor2;
        final long backLayerContentColor2;
        final Shape frontLayerShape2;
        Modifier modifier3;
        final BackdropScaffoldState scaffoldState3;
        float peekHeight3;
        float headerHeight3;
        final boolean persistentAppBar3;
        long backLayerBackgroundColor3;
        int $dirty1;
        long backLayerContentColor3;
        long backLayerBackgroundColor4;
        Shape frontLayerShape3;
        float frontLayerElevation3;
        float frontLayerElevation4;
        Shape frontLayerShape4;
        long frontLayerBackgroundColor3;
        final long frontLayerContentColor3;
        long frontLayerBackgroundColor4;
        final Modifier modifier4;
        final float frontLayerElevation5;
        final long frontLayerScrimColor3;
        final Function3 snackbarHost2;
        long backLayerBackgroundColor5;
        final Shape frontLayerShape5;
        final boolean gesturesEnabled3;
        final boolean stickyFrontLayer3;
        long backLayerContentColor4;
        int i4;
        Composer $composer3 = $composer.startRestartGroup(113877443);
        ComposerKt.sourceInformation($composer3, "C(BackdropScaffold)P(!1,2,5,12,15,16,10,13:c#ui.unit.Dp,11:c#ui.unit.Dp,14,17,1:c#ui.graphics.Color,3:c#ui.graphics.Color,9,7:c#ui.unit.Dp,4:c#ui.graphics.Color,6:c#ui.graphics.Color,8:c#ui.graphics.Color)366@16924L7,367@16947L35,367@16936L46,*369@17025L7,370@17099L7,373@17173L383,387@17627L100,394@17885L4095,394@17805L4175:BackdropScaffold.kt#jmzs0o");
        int $dirty = $changed;
        int $dirty12 = $changed1;
        if ((i & 1) != 0) {
            $dirty |= 6;
        } else if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(function2) ? 4 : 2;
        }
        if ((i & 2) != 0) {
            $dirty |= 48;
        } else if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(function22) ? 32 : 16;
        }
        if ((i & 4) != 0) {
            $dirty |= 384;
        } else if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(function23) ? 256 : 128;
        }
        int i5 = i & 8;
        int i6 = 1024;
        if (i5 != 0) {
            $dirty |= 3072;
        } else if (($changed & 3072) == 0) {
            $dirty |= $composer3.changed(modifier) ? 2048 : 1024;
        }
        int i7 = 8192;
        if (($changed & 24576) == 0) {
            if ((i & 16) == 0) {
                backdropScaffoldState = scaffoldState;
                if ($composer3.changed(backdropScaffoldState)) {
                    i4 = 16384;
                }
                $dirty |= i4;
            } else {
                backdropScaffoldState = scaffoldState;
            }
            i4 = 8192;
            $dirty |= i4;
        } else {
            backdropScaffoldState = scaffoldState;
        }
        int i8 = i & 32;
        if (i8 != 0) {
            $dirty |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            function32 = function3;
        } else if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            function32 = function3;
            $dirty |= $composer3.changedInstance(function32) ? 131072 : 65536;
        } else {
            function32 = function3;
        }
        int i9 = i & 64;
        if (i9 != 0) {
            $dirty |= JNINativeInterface.JNI_VERSION_24;
            z = gesturesEnabled;
        } else if (($changed & JNINativeInterface.JNI_VERSION_24) == 0) {
            z = gesturesEnabled;
            $dirty |= $composer3.changed(z) ? 1048576 : 524288;
        } else {
            z = gesturesEnabled;
        }
        if (($changed & User32.WS_CAPTION) == 0) {
            if ((i & 128) == 0) {
                f = peekHeight;
                int i10 = $composer3.changed(f) ? 8388608 : 4194304;
                $dirty |= i10;
            } else {
                f = peekHeight;
            }
            $dirty |= i10;
        } else {
            f = peekHeight;
        }
        if (($changed & 100663296) == 0) {
            if ((i & 256) == 0) {
                f2 = headerHeight;
                int i11 = $composer3.changed(f2) ? 67108864 : 33554432;
                $dirty |= i11;
            } else {
                f2 = headerHeight;
            }
            $dirty |= i11;
        } else {
            f2 = headerHeight;
        }
        int i12 = i & 512;
        if (i12 != 0) {
            $dirty |= LZMA2Options.DICT_SIZE_MAX;
            i2 = i12;
        } else if (($changed & LZMA2Options.DICT_SIZE_MAX) == 0) {
            i2 = i12;
            $dirty |= $composer3.changed(persistentAppBar) ? 536870912 : 268435456;
        } else {
            i2 = i12;
        }
        int i13 = i & 1024;
        if (i13 != 0) {
            $dirty12 |= 6;
            i3 = i13;
        } else if (($changed1 & 6) == 0) {
            i3 = i13;
            $dirty12 |= $composer3.changed(stickyFrontLayer) ? 4 : 2;
        } else {
            i3 = i13;
        }
        if (($changed1 & 48) == 0) {
            $dirty12 |= ((i & 2048) == 0 && $composer3.changed(backLayerBackgroundColor)) ? 32 : 16;
        }
        if (($changed1 & 384) == 0) {
            $dirty12 |= ((i & 4096) == 0 && $composer3.changed(backLayerContentColor)) ? 256 : 128;
        }
        if (($changed1 & 3072) == 0) {
            if ((i & 8192) == 0 && $composer3.changed(frontLayerShape)) {
                i6 = 2048;
            }
            $dirty12 |= i6;
        }
        if (($changed1 & 24576) == 0) {
            if ((i & 16384) == 0 && $composer3.changed(frontLayerElevation)) {
                i7 = 16384;
            }
            $dirty12 |= i7;
        }
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            $dirty12 |= ((i & 32768) == 0 && $composer3.changed(frontLayerBackgroundColor)) ? 131072 : 65536;
        }
        if (($changed1 & JNINativeInterface.JNI_VERSION_24) == 0) {
            $dirty12 |= ((i & 65536) == 0 && $composer3.changed(frontLayerContentColor)) ? 1048576 : 524288;
        }
        if (($changed1 & User32.WS_CAPTION) == 0) {
            $dirty12 |= ((i & 131072) == 0 && $composer3.changed(frontLayerScrimColor)) ? 8388608 : 4194304;
        }
        int $dirty13 = $dirty12;
        if ($composer3.shouldExecute(((306783379 & $dirty) == 306783378 && ($dirty13 & 4793491) == 4793490) ? false : true, $dirty & 1)) {
            $composer3.startDefaults();
            ComposerKt.sourceInformation($composer3, "350@15926L40,357@16335L6,358@16386L41,359@16483L15,361@16629L6,362@16681L42,363@16784L20");
            if (($changed & 1) == 0 || $composer3.getDefaultsInvalid()) {
                Modifier.Companion modifier5 = i5 != 0 ? Modifier.INSTANCE : modifier;
                if ((i & 16) != 0) {
                    modifier3 = modifier5;
                    scaffoldState3 = rememberBackdropScaffoldState(BackdropValue.Concealed, null, null, null, $composer3, 6, 14);
                    $dirty &= -57345;
                } else {
                    modifier3 = modifier5;
                    scaffoldState3 = scaffoldState;
                }
                Function3 snackbarHost3 = i8 != 0 ? ComposableSingletons$BackdropScaffoldKt.INSTANCE.m1644getLambda1$material_release() : function32;
                boolean gesturesEnabled4 = i9 != 0 ? true : z;
                if ((i & 128) != 0) {
                    peekHeight3 = BackdropScaffoldDefaults.INSTANCE.m1555getPeekHeightD9Ej5fM();
                    $dirty &= -29360129;
                } else {
                    peekHeight3 = peekHeight;
                }
                if ((i & 256) != 0) {
                    headerHeight3 = BackdropScaffoldDefaults.INSTANCE.m1554getHeaderHeightD9Ej5fM();
                    $dirty &= -234881025;
                } else {
                    headerHeight3 = headerHeight;
                }
                persistentAppBar3 = i2 != 0 ? true : persistentAppBar;
                boolean stickyFrontLayer4 = i3 != 0 ? true : stickyFrontLayer;
                if ((i & 2048) != 0) {
                    backLayerBackgroundColor3 = MaterialTheme.INSTANCE.getColors($composer3, 6).m1619getPrimary0d7_KjU();
                    $dirty1 = $dirty13 & (-113);
                } else {
                    backLayerBackgroundColor3 = backLayerBackgroundColor;
                    $dirty1 = $dirty13;
                }
                if ((i & 4096) != 0) {
                    backLayerContentColor3 = ColorsKt.m1637contentColorForek8zF_U(backLayerBackgroundColor3, $composer3, ($dirty1 >> 3) & 14);
                    $dirty1 &= -897;
                } else {
                    backLayerContentColor3 = backLayerContentColor;
                }
                if ((i & 8192) != 0) {
                    backLayerBackgroundColor4 = backLayerBackgroundColor3;
                    frontLayerShape3 = BackdropScaffoldDefaults.INSTANCE.getFrontLayerShape($composer3, 0);
                    $dirty1 &= -7169;
                } else {
                    backLayerBackgroundColor4 = backLayerBackgroundColor3;
                    frontLayerShape3 = frontLayerShape;
                }
                if ((i & 16384) != 0) {
                    frontLayerElevation3 = BackdropScaffoldDefaults.INSTANCE.m1553getFrontLayerElevationD9Ej5fM();
                    $dirty1 &= -57345;
                } else {
                    frontLayerElevation3 = frontLayerElevation;
                }
                if ((32768 & i) != 0) {
                    frontLayerElevation4 = frontLayerElevation3;
                    $dirty1 &= -458753;
                    frontLayerShape4 = frontLayerShape3;
                    frontLayerBackgroundColor3 = MaterialTheme.INSTANCE.getColors($composer3, 6).m1623getSurface0d7_KjU();
                } else {
                    frontLayerElevation4 = frontLayerElevation3;
                    frontLayerShape4 = frontLayerShape3;
                    frontLayerBackgroundColor3 = frontLayerBackgroundColor;
                }
                if ((i & 65536) != 0) {
                    frontLayerContentColor3 = ColorsKt.m1637contentColorForek8zF_U(frontLayerBackgroundColor3, $composer3, ($dirty1 >> 15) & 14);
                    $dirty1 &= -3670017;
                } else {
                    frontLayerContentColor3 = frontLayerContentColor;
                }
                if ((i & 131072) != 0) {
                    frontLayerBackgroundColor4 = frontLayerBackgroundColor3;
                    modifier4 = modifier3;
                    $dirty1 &= -29360129;
                    snackbarHost2 = snackbarHost3;
                    backLayerBackgroundColor5 = backLayerBackgroundColor4;
                    frontLayerScrimColor3 = BackdropScaffoldDefaults.INSTANCE.getFrontLayerScrimColor($composer3, 0);
                    frontLayerShape5 = frontLayerShape4;
                    frontLayerElevation5 = frontLayerElevation4;
                    long j = backLayerContentColor3;
                    gesturesEnabled3 = gesturesEnabled4;
                    stickyFrontLayer3 = stickyFrontLayer4;
                    backLayerContentColor4 = j;
                } else {
                    frontLayerBackgroundColor4 = frontLayerBackgroundColor3;
                    modifier4 = modifier3;
                    frontLayerElevation5 = frontLayerElevation4;
                    frontLayerScrimColor3 = frontLayerScrimColor;
                    snackbarHost2 = snackbarHost3;
                    backLayerBackgroundColor5 = backLayerBackgroundColor4;
                    frontLayerShape5 = frontLayerShape4;
                    long j2 = backLayerContentColor3;
                    gesturesEnabled3 = gesturesEnabled4;
                    stickyFrontLayer3 = stickyFrontLayer4;
                    backLayerContentColor4 = j2;
                }
            } else {
                $composer3.skipToGroupEnd();
                if ((i & 16) != 0) {
                    $dirty &= -57345;
                }
                if ((i & 128) != 0) {
                    $dirty &= -29360129;
                }
                if ((i & 256) != 0) {
                    $dirty &= -234881025;
                }
                if ((i & 2048) != 0) {
                    $dirty13 &= -113;
                }
                int $dirty14 = $dirty13;
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
                if ((i & 131072) != 0) {
                    $dirty14 &= -29360129;
                }
                modifier4 = modifier;
                stickyFrontLayer3 = stickyFrontLayer;
                backLayerContentColor4 = backLayerContentColor;
                frontLayerShape5 = frontLayerShape;
                frontLayerElevation5 = frontLayerElevation;
                frontLayerBackgroundColor4 = frontLayerBackgroundColor;
                frontLayerContentColor3 = frontLayerContentColor;
                frontLayerScrimColor3 = frontLayerScrimColor;
                scaffoldState3 = backdropScaffoldState;
                peekHeight3 = f;
                headerHeight3 = f2;
                gesturesEnabled3 = z;
                snackbarHost2 = function32;
                persistentAppBar3 = persistentAppBar;
                $dirty1 = $dirty14;
                backLayerBackgroundColor5 = backLayerBackgroundColor;
            }
            $composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(113877443, $dirty, $dirty1, "androidx.compose.material.BackdropScaffold (BackdropScaffold.kt:364)");
            }
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            long backLayerBackgroundColor6 = backLayerBackgroundColor5;
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final Density density = (Density) objConsume;
            ComposerKt.sourceInformationMarkerStart($composer3, 1348845653, "CC(remember):BackdropScaffold.kt#9igjgp");
            boolean invalid$iv = ((((57344 & $dirty) ^ 24576) > 16384 && $composer3.changed(scaffoldState3)) || ($dirty & 24576) == 16384) | $composer3.changed(density);
            Object value$iv = $composer3.rememberedValue();
            if (invalid$iv || value$iv == Composer.INSTANCE.getEmpty()) {
                value$iv = (Function0) new Function0<Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        scaffoldState3.setDensity$material_release(density);
                    }
                };
                $composer3.updateRememberedValue(value$iv);
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.SideEffect((Function0) value$iv, $composer3, 0);
            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume2 = $composer3.consume(localDensity2);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Density $this$BackdropScaffold_0hNv9B8_u24lambda_u244 = (Density) objConsume2;
            final float peekHeightPx = $this$BackdropScaffold_0hNv9B8_u24lambda_u244.mo389toPx0680j_4(peekHeight3);
            ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume3 = $composer3.consume(localDensity3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Density $this$BackdropScaffold_0hNv9B8_u24lambda_u245 = (Density) objConsume3;
            final float headerHeightPx = $this$BackdropScaffold_0hNv9B8_u24lambda_u245.mo389toPx0680j_4(headerHeight3);
            function24 = function2;
            final Function2 backLayer = ComposableLambdaKt.rememberComposableLambda(461235665, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$backLayer$1
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
                    Function0 factory$iv$iv$iv;
                    ComposerKt.sourceInformation($composer4, "C:BackdropScaffold.kt#jmzs0o");
                    if (!$composer4.shouldExecute(($changed2 & 3) != 2, $changed2 & 1)) {
                        $composer4.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(461235665, $changed2, -1, "androidx.compose.material.BackdropScaffold.<anonymous> (BackdropScaffold.kt:374)");
                    }
                    if (persistentAppBar3) {
                        $composer4.startReplaceGroup(1665275251);
                        ComposerKt.sourceInformation($composer4, "375@17227L94");
                        Function2<Composer, Integer, Unit> function25 = function24;
                        Function2<Composer, Integer, Unit> function26 = function22;
                        ComposerKt.sourceInformationMarkerStart($composer4, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        Modifier modifier$iv = Modifier.INSTANCE;
                        Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
                        Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getStart();
                        MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer4, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                        int $changed$iv$iv = (0 << 3) & 112;
                        ComposerKt.sourceInformationMarkerStart($composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer4, 0);
                        CompositionLocalMap localMap$iv$iv = $composer4.getCurrentCompositionLocalMap();
                        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer4, modifier$iv);
                        Function0 factory$iv$iv$iv2 = ComposeUiNode.INSTANCE.getConstructor();
                        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & User32.WM_PENWINFIRST) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer4.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        $composer4.startReusableNode();
                        if ($composer4.getInserting()) {
                            factory$iv$iv$iv = factory$iv$iv$iv2;
                            $composer4.createNode(factory$iv$iv$iv);
                        } else {
                            factory$iv$iv$iv = factory$iv$iv$iv2;
                            $composer4.useNode();
                        }
                        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3832constructorimpl($composer4);
                        Updater.m3839setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3839setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 block$iv$iv$iv = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() || !Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
                            $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
                            $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
                        }
                        Updater.m3839setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
                        int i14 = ($changed$iv$iv$iv >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer4, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        int i15 = ((0 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer4, -1359516, "C376@17256L8,377@17285L18:BackdropScaffold.kt#jmzs0o");
                        function25.invoke($composer4, 0);
                        function26.invoke($composer4, 0);
                        ComposerKt.sourceInformationMarkerEnd($composer4);
                        ComposerKt.sourceInformationMarkerEnd($composer4);
                        $composer4.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer4);
                        ComposerKt.sourceInformationMarkerEnd($composer4);
                        ComposerKt.sourceInformationMarkerEnd($composer4);
                        $composer4.endReplaceGroup();
                    } else {
                        $composer4.startReplaceGroup(1665408644);
                        ComposerKt.sourceInformation($composer4, "380@17359L173");
                        BackdropScaffoldKt.BackLayerTransition(scaffoldState3.getAnchoredDraggableState$material_release().getTargetValue(), function24, function22, $composer4, 0);
                        $composer4.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, $composer3, 54);
            ComposerKt.sourceInformationMarkerStart($composer3, 1348867478, "CC(remember):BackdropScaffold.kt#9igjgp");
            boolean invalid$iv2 = $composer3.changed(headerHeightPx);
            Object it$iv = $composer3.rememberedValue();
            if (invalid$iv2 || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = (Function1) new Function1<Constraints, Constraints>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Constraints invoke(Constraints constraints) {
                        return Constraints.m6958boximpl(m1563invokeZezNO4M(constraints.getValue()));
                    }

                    /* renamed from: invoke-ZezNO4M, reason: not valid java name */
                    public final long m1563invokeZezNO4M(long it) {
                        return ConstraintsKt.m6991offsetNN6EwU$default(Constraints.m6960copyZbe2FdA(it, (11 & 1) != 0 ? Constraints.m6973getMinWidthimpl(it) : 0, (11 & 2) != 0 ? Constraints.m6971getMaxWidthimpl(it) : 0, (11 & 4) != 0 ? Constraints.m6972getMinHeightimpl(it) : 0, (11 & 8) != 0 ? Constraints.m6970getMaxHeightimpl(it) : 0), 0, -MathKt.roundToInt(headerHeightPx), 1, null);
                    }
                };
                $composer3.updateRememberedValue(value$iv2);
                it$iv = value$iv2;
            }
            final Function1 calculateBackLayerConstraints = (Function1) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final long frontLayerBackgroundColor5 = frontLayerBackgroundColor4;
            final AnchoredDraggableState state = scaffoldState3.getAnchoredDraggableState$material_release();
            final BackdropScaffoldState scaffoldState4 = scaffoldState3;
            final float peekHeight4 = peekHeight3;
            final float headerHeight4 = headerHeight3;
            long backLayerContentColor5 = backLayerContentColor4;
            SurfaceKt.m1803SurfaceFjzlyU(null, null, backLayerBackgroundColor6, backLayerContentColor5, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(1961515015, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2
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
                    ComposerKt.sourceInformation($composer4, "C395@17907L24,396@18020L3954,396@17940L4034:BackdropScaffold.kt#jmzs0o");
                    if (!$composer4.shouldExecute(($changed2 & 3) != 2, $changed2 & 1)) {
                        $composer4.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1961515015, $changed2, -1, "androidx.compose.material.BackdropScaffold.<anonymous> (BackdropScaffold.kt:395)");
                    }
                    ComposerKt.sourceInformationMarkerStart($composer4, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
                    ComposerKt.sourceInformationMarkerStart($composer4, -954203484, "CC(remember):Effects.kt#9igjgp");
                    Object it$iv$iv = $composer4.rememberedValue();
                    if (it$iv$iv == Composer.INSTANCE.getEmpty()) {
                        Object value$iv$iv = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer4);
                        $composer4.updateRememberedValue(value$iv$iv);
                        it$iv$iv = value$iv$iv;
                    }
                    final CoroutineScope scope = (CoroutineScope) it$iv$iv;
                    ComposerKt.sourceInformationMarkerEnd($composer4);
                    ComposerKt.sourceInformationMarkerEnd($composer4);
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                    Function2<Composer, Integer, Unit> function25 = backLayer;
                    Function1<Constraints, Constraints> function1 = calculateBackLayerConstraints;
                    final float f3 = headerHeightPx;
                    final boolean z2 = stickyFrontLayer3;
                    final boolean z3 = gesturesEnabled3;
                    final BackdropScaffoldState backdropScaffoldState2 = scaffoldState4;
                    final AnchoredDraggableState<BackdropValue> anchoredDraggableState = state;
                    final Shape shape = frontLayerShape5;
                    final long j3 = frontLayerBackgroundColor5;
                    final long j4 = frontLayerContentColor3;
                    final float f4 = frontLayerElevation5;
                    final float f5 = headerHeight4;
                    final float f6 = peekHeightPx;
                    final float f7 = peekHeight4;
                    final Function2<Composer, Integer, Unit> function26 = function23;
                    final long j5 = frontLayerScrimColor3;
                    final Function3<SnackbarHostState, Composer, Integer, Unit> function33 = snackbarHost2;
                    BackdropScaffoldKt.BackdropStack(modifierFillMaxSize$default, function25, function1, ComposableLambdaKt.rememberComposableLambda(516504859, true, new Function4<Constraints, Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(4);
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public /* bridge */ /* synthetic */ Unit invoke(Constraints constraints, Float f8, Composer composer, Integer num) {
                            m1561invokejYbf7pk(constraints.getValue(), f8.floatValue(), composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:47:0x017b  */
                        /* renamed from: invoke-jYbf7pk, reason: not valid java name */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void m1561invokejYbf7pk(long r32, float r34, androidx.compose.runtime.Composer r35, int r36) {
                            /*
                                Method dump skipped, instructions count: 707
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2.AnonymousClass1.m1561invokejYbf7pk(long, float, androidx.compose.runtime.Composer, int):void");
                        }
                    }, $composer4, 54), $composer4, GL11.GL_INDEX_MODE);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, $composer3, 54), $composer3, (($dirty1 << 3) & User32.WM_PENWINFIRST) | JNINativeInterface.JNI_VERSION_24 | (($dirty1 << 3) & GL11.GL_RENDER), 51);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            persistentAppBar2 = persistentAppBar3;
            modifier2 = modifier4;
            stickyFrontLayer2 = stickyFrontLayer3;
            frontLayerShape2 = frontLayerShape5;
            frontLayerBackgroundColor2 = frontLayerBackgroundColor5;
            frontLayerElevation2 = frontLayerElevation5;
            headerHeight2 = headerHeight4;
            peekHeight2 = peekHeight4;
            backLayerBackgroundColor2 = backLayerBackgroundColor6;
            scaffoldState2 = scaffoldState4;
            frontLayerScrimColor2 = frontLayerScrimColor3;
            backLayerContentColor2 = backLayerContentColor5;
            gesturesEnabled2 = gesturesEnabled3;
            frontLayerContentColor2 = frontLayerContentColor3;
            snackbarHost = snackbarHost2;
        } else {
            function24 = function2;
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier2 = modifier;
            peekHeight2 = peekHeight;
            headerHeight2 = headerHeight;
            persistentAppBar2 = persistentAppBar;
            stickyFrontLayer2 = stickyFrontLayer;
            frontLayerElevation2 = frontLayerElevation;
            frontLayerBackgroundColor2 = frontLayerBackgroundColor;
            frontLayerContentColor2 = frontLayerContentColor;
            frontLayerScrimColor2 = frontLayerScrimColor;
            gesturesEnabled2 = z;
            snackbarHost = function32;
            scaffoldState2 = scaffoldState;
            backLayerBackgroundColor2 = backLayerBackgroundColor;
            backLayerContentColor2 = backLayerContentColor;
            frontLayerShape2 = frontLayerShape;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function2<? super Composer, ? super Integer, Unit> function25 = function24;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$3
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

                public final void invoke(Composer composer, int i14) {
                    BackdropScaffoldKt.m1556BackdropScaffold0hNv9B8(function25, function22, function23, modifier2, scaffoldState2, snackbarHost, gesturesEnabled2, peekHeight2, headerHeight2, persistentAppBar2, stickyFrontLayer2, backLayerBackgroundColor2, backLayerContentColor2, frontLayerShape2, frontLayerElevation2, frontLayerBackgroundColor2, frontLayerContentColor2, frontLayerScrimColor2, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), RecomposeScopeImplKt.updateChangedFlags($changed1), i);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Scrim-3J-VO9M, reason: not valid java name */
    public static final void m1557Scrim3JVO9M(final long color, final Function0<Unit> function0, final boolean visible, Composer $composer, final int $changed) {
        Modifier.Companion dismissModifier;
        Composer $composer2 = $composer.startRestartGroup(-92141505);
        ComposerKt.sourceInformation($composer2, "C(Scrim)P(0:c#ui.graphics.Color):BackdropScaffold.kt#jmzs0o");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(color) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(function0) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changed(visible) ? 256 : 128;
        }
        if ($composer2.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-92141505, $dirty, -1, "androidx.compose.material.Scrim (BackdropScaffold.kt:494)");
            }
            if ((color != 16 ? 1 : 0) != 0) {
                $composer2.startReplaceGroup(478794687);
                ComposerKt.sourceInformation($composer2, "497@22133L87,504@22481L62,504@22428L115");
                int $dirty2 = $dirty;
                final State alpha$delegate = AnimateAsStateKt.animateFloatAsState(visible ? 1065353216 : 0, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, $composer2, 48, 28);
                if (visible) {
                    $composer2.startReplaceGroup(478960289);
                    ComposerKt.sourceInformation($composer2, "500@22322L37");
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Unit unit = Unit.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart($composer2, 1262377733, "CC(remember):BackdropScaffold.kt#9igjgp");
                    boolean invalid$iv = ($dirty2 & 112) == 32;
                    BackdropScaffoldKt$Scrim$dismissModifier$1$1 value$iv = $composer2.rememberedValue();
                    if (invalid$iv || value$iv == Composer.INSTANCE.getEmpty()) {
                        value$iv = new BackdropScaffoldKt$Scrim$dismissModifier$1$1(function0, null);
                        $composer2.updateRememberedValue(value$iv);
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer2);
                    dismissModifier = companion.then(new SuspendPointerInputElement(unit, null, null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0((Function2) value$iv), 6, null));
                    $composer2.endReplaceGroup();
                } else {
                    $composer2.startReplaceGroup(479060698);
                    $composer2.endReplaceGroup();
                    dismissModifier = Modifier.INSTANCE;
                }
                Modifier modifierThen = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(dismissModifier);
                ComposerKt.sourceInformationMarkerStart($composer2, 1262382846, "CC(remember):BackdropScaffold.kt#9igjgp");
                boolean invalid$iv2 = $composer2.changed(alpha$delegate) | (($dirty2 & 14) == 4);
                Object it$iv = $composer2.rememberedValue();
                if (invalid$iv2 || it$iv == Composer.INSTANCE.getEmpty()) {
                    Object value$iv2 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$Scrim$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope $this$Canvas) {
                            DrawScope.m4946drawRectnJ9OG0$default($this$Canvas, color, 0L, 0L, BackdropScaffoldKt.Scrim_3J_VO9M$lambda$7(alpha$delegate), null, null, 0, 118, null);
                        }
                    };
                    $composer2.updateRememberedValue(value$iv2);
                    it$iv = value$iv2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                CanvasKt.Canvas(modifierThen, (Function1) it$iv, $composer2, 0);
                $composer2.endReplaceGroup();
            } else {
                $composer2.startReplaceGroup(479228098);
                $composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$Scrim$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    BackdropScaffoldKt.m1557Scrim3JVO9M(color, function0, visible, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Scrim_3J_VO9M$lambda$7(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BackLayerTransition(final androidx.compose.material.BackdropValue r61, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r62, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r63, androidx.compose.runtime.Composer r64, final int r65) {
        /*
            Method dump skipped, instructions count: 1338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BackdropScaffoldKt.BackLayerTransition(androidx.compose.material.BackdropValue, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float BackLayerTransition$lambda$10(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BackdropStack(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, final Function1<? super Constraints, Constraints> function1, final Function4<? super Constraints, ? super Float, ? super Composer, ? super Integer, Unit> function4, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-1248995194);
        ComposerKt.sourceInformation($composer2, "C(BackdropStack)P(3)574@25114L896,574@25087L923:BackdropScaffold.kt#jmzs0o");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(modifier) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(function2) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(function1) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer2.changedInstance(function4) ? 2048 : 1024;
        }
        if ($composer2.shouldExecute(($dirty & 1171) != 1170, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1248995194, $dirty, -1, "androidx.compose.material.BackdropStack (BackdropScaffold.kt:573)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, -1431300756, "CC(remember):BackdropScaffold.kt#9igjgp");
            boolean invalid$iv = (($dirty & 112) == 32) | (($dirty & User32.WM_PENWINFIRST) == 256) | (($dirty & GL11.GL_RENDER) == 2048);
            Object it$iv = $composer2.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropStack$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m1564invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                    }

                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final MeasureResult m1564invoke0kLqBqw(SubcomposeMeasureScope $this$SubcomposeLayout, final long constraints) {
                        final Placeable backLayerPlaceable = ((Measurable) CollectionsKt.first((List) $this$SubcomposeLayout.subcompose(BackdropLayers.Back, function2))).mo5750measureBRTryo0(function1.invoke(Constraints.m6958boximpl(constraints)).getValue());
                        final float backLayerHeight = backLayerPlaceable.getHeight();
                        BackdropLayers backdropLayers = BackdropLayers.Front;
                        final Function4<Constraints, Float, Composer, Integer, Unit> function42 = function4;
                        List $this$fastMap$iv = $this$SubcomposeLayout.subcompose(backdropLayers, ComposableLambdaKt.composableLambdaInstance(-1222642649, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropStack$1$1$placeables$1
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
                                ComposerKt.sourceInformation($composer3, "C583@25453L40:BackdropScaffold.kt#jmzs0o");
                                if (!$composer3.shouldExecute(($changed2 & 3) != 2, $changed2 & 1)) {
                                    $composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1222642649, $changed2, -1, "androidx.compose.material.BackdropStack.<anonymous>.<anonymous>.<anonymous> (BackdropScaffold.kt:583)");
                                }
                                function42.invoke(Constraints.m6958boximpl(constraints), Float.valueOf(backLayerHeight), $composer3, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }));
                        List target$iv = new ArrayList($this$fastMap$iv.size());
                        int size = $this$fastMap$iv.size();
                        for (int index$iv$iv = 0; index$iv$iv < size; index$iv$iv++) {
                            Object item$iv$iv = $this$fastMap$iv.get(index$iv$iv);
                            target$iv.add(((Measurable) item$iv$iv).mo5750measureBRTryo0(constraints));
                        }
                        final List placeables = target$iv;
                        int maxWidth = Math.max(Constraints.m6973getMinWidthimpl(constraints), backLayerPlaceable.getWidth());
                        int maxHeight = Math.max(Constraints.m6972getMinHeightimpl(constraints), backLayerPlaceable.getHeight());
                        int size2 = placeables.size();
                        int maxWidth2 = maxWidth;
                        int maxHeight2 = maxHeight;
                        for (int index$iv = 0; index$iv < size2; index$iv++) {
                            Object item$iv = placeables.get(index$iv);
                            Placeable it = (Placeable) item$iv;
                            maxWidth2 = Math.max(maxWidth2, it.getWidth());
                            maxHeight2 = Math.max(maxHeight2, it.getHeight());
                        }
                        return MeasureScope.layout$default($this$SubcomposeLayout, maxWidth2, maxHeight2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropStack$1$1.2
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
                                Placeable.PlacementScope.placeRelative$default($this$layout, backLayerPlaceable, 0, 0, 0.0f, 4, null);
                                List $this$fastForEach$iv = placeables;
                                int size3 = $this$fastForEach$iv.size();
                                for (int index$iv2 = 0; index$iv2 < size3; index$iv2++) {
                                    Object item$iv2 = $this$fastForEach$iv.get(index$iv2);
                                    Placeable it2 = (Placeable) item$iv2;
                                    Placeable.PlacementScope.placeRelative$default($this$layout, it2, 0, 0, 0.0f, 4, null);
                                }
                            }
                        }, 4, null);
                    }
                };
                $composer2.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            SubcomposeLayoutKt.SubcomposeLayout(modifier, (Function2) it$iv, $composer2, $dirty & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackdropStack.2
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

                public final void invoke(Composer composer, int i) {
                    BackdropScaffoldKt.BackdropStack(modifier, function2, function1, function4, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1));
                }
            });
        }
    }

    /* compiled from: BackdropScaffold.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u0015*\u00020\tH\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0014\u001a\u00020\u0015*\u00020\u0003H\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\t*\u00020\u0015H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"androidx/compose/material/BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "toFloat", "", "offsetToFloat", "(J)F", "velocityToFloat", "toOffset", "(F)J", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.material.BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1, reason: invalid class name */
    public static final class AnonymousClass1 implements NestedScrollConnection {
        final /* synthetic */ Orientation $orientation;
        final /* synthetic */ AnchoredDraggableState<?> $state;

        AnonymousClass1(AnchoredDraggableState<?> anchoredDraggableState, Orientation $orientation) {
            this.$state = anchoredDraggableState;
            this.$orientation = $orientation;
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPreScroll-OzD1aCk */
        public long mo816onPreScrollOzD1aCk(long available, int source) {
            float delta = offsetToFloat(available);
            if (delta < 0.0f && NestedScrollSource.m5506equalsimpl0(source, NestedScrollSource.INSTANCE.m5518getUserInputWNlRxjI())) {
                return toOffset(this.$state.dispatchRawDelta(delta));
            }
            return Offset.INSTANCE.m4165getZeroF1C5BW0();
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPostScroll-DzOQY0M */
        public long mo510onPostScrollDzOQY0M(long consumed, long available, int source) {
            if (NestedScrollSource.m5506equalsimpl0(source, NestedScrollSource.INSTANCE.m5518getUserInputWNlRxjI())) {
                return toOffset(this.$state.dispatchRawDelta(offsetToFloat(available)));
            }
            return Offset.INSTANCE.m4165getZeroF1C5BW0();
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPreFling-QWom1Mo */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object mo815onPreFlingQWom1Mo(long r8, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> r10) {
            /*
                r7 = this;
                boolean r0 = r10 instanceof androidx.compose.material.BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPreFling$1
                if (r0 == 0) goto L14
                r0 = r10
                androidx.compose.material.BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPreFling$1 r0 = (androidx.compose.material.BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPreFling$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r1 = r0.label
                int r1 = r1 - r2
                r0.label = r1
                goto L19
            L14:
                androidx.compose.material.BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPreFling$1 r0 = new androidx.compose.material.BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPreFling$1
                r0.<init>(r7, r10)
            L19:
                java.lang.Object r1 = r0.result
                java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r3 = r0.label
                switch(r3) {
                    case 0: goto L32;
                    case 1: goto L2c;
                    default: goto L24;
                }
            L24:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L2c:
                long r8 = r0.J$0
                kotlin.ResultKt.throwOnFailure(r1)
                goto L61
            L32:
                kotlin.ResultKt.throwOnFailure(r1)
                r3 = r7
                float r4 = r3.velocityToFloat(r8)
                androidx.compose.material.AnchoredDraggableState<?> r5 = r3.$state
                float r5 = r5.requireOffset()
                r6 = 0
                int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r6 >= 0) goto L62
                androidx.compose.material.AnchoredDraggableState<?> r6 = r3.$state
                androidx.compose.material.DraggableAnchors r6 = r6.getAnchors()
                float r6 = r6.minAnchor()
                int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                if (r6 <= 0) goto L62
                androidx.compose.material.AnchoredDraggableState<?> r5 = r3.$state
                r0.J$0 = r8
                r6 = 1
                r0.label = r6
                java.lang.Object r3 = r5.settle(r4, r0)
                if (r3 != r2) goto L61
                return r2
            L61:
                goto L68
            L62:
                androidx.compose.ui.unit.Velocity$Companion r8 = androidx.compose.ui.unit.Velocity.INSTANCE
                long r8 = r8.m7267getZero9UxMQ8M()
            L68:
                androidx.compose.ui.unit.Velocity r8 = androidx.compose.ui.unit.Velocity.m7247boximpl(r8)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BackdropScaffoldKt.AnonymousClass1.mo815onPreFlingQWom1Mo(long, kotlin.coroutines.Continuation):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPostFling-RZ2iAVY */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object mo509onPostFlingRZ2iAVY(long r6, long r8, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> r10) {
            /*
                r5 = this;
                boolean r6 = r10 instanceof androidx.compose.material.BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPostFling$1
                if (r6 == 0) goto L14
                r6 = r10
                androidx.compose.material.BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPostFling$1 r6 = (androidx.compose.material.BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPostFling$1) r6
                int r7 = r6.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r7 = r7 & r0
                if (r7 == 0) goto L14
                int r7 = r6.label
                int r7 = r7 - r0
                r6.label = r7
                goto L19
            L14:
                androidx.compose.material.BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPostFling$1 r6 = new androidx.compose.material.BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPostFling$1
                r6.<init>(r5, r10)
            L19:
                java.lang.Object r7 = r6.result
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.label
                switch(r1) {
                    case 0: goto L32;
                    case 1: goto L2c;
                    default: goto L24;
                }
            L24:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L2c:
                long r8 = r6.J$0
                kotlin.ResultKt.throwOnFailure(r7)
                goto L48
            L32:
                kotlin.ResultKt.throwOnFailure(r7)
                r1 = r5
                androidx.compose.material.AnchoredDraggableState<?> r2 = r1.$state
                float r3 = r1.velocityToFloat(r8)
                r6.J$0 = r8
                r4 = 1
                r6.label = r4
                java.lang.Object r1 = r2.settle(r3, r6)
                if (r1 != r0) goto L48
                return r0
            L48:
                androidx.compose.ui.unit.Velocity r0 = androidx.compose.ui.unit.Velocity.m7247boximpl(r8)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BackdropScaffoldKt.AnonymousClass1.mo509onPostFlingRZ2iAVY(long, long, kotlin.coroutines.Continuation):java.lang.Object");
        }

        private final long toOffset(float $this$toOffset) {
            return OffsetKt.Offset(this.$orientation == Orientation.Horizontal ? $this$toOffset : 0.0f, this.$orientation == Orientation.Vertical ? $this$toOffset : 0.0f);
        }

        private final float velocityToFloat(long $this$toFloat) {
            return this.$orientation == Orientation.Horizontal ? Velocity.m7256getXimpl($this$toFloat) : Velocity.m7257getYimpl($this$toFloat);
        }

        private final float offsetToFloat(long $this$toFloat) {
            return this.$orientation == Orientation.Horizontal ? Offset.m4149getXimpl($this$toFloat) : Offset.m4150getYimpl($this$toFloat);
        }
    }

    public static final NestedScrollConnection ConsumeSwipeNestedScrollConnection(AnchoredDraggableState<?> anchoredDraggableState, Orientation orientation) {
        return new AnonymousClass1(anchoredDraggableState, orientation);
    }
}
