package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.lwjgl.system.jni.JNINativeInterface;
import org.lwjgl.system.windows.User32;
import org.tukaani.xz.LZMA2Options;

/* compiled from: Surface.kt */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0087\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001ac\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u008f\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0095\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00072\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u001e2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001f\u001a,\u0010 \u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\u0010H\u0003ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a8\u0010&\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"Surface", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "color", "Landroidx/compose/ui/graphics/Color;", "contentColor", OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "elevation", "Landroidx/compose/ui/unit/Dp;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Landroidx/compose/runtime/Composable;", "Surface-LPr_se0", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Surface-F-jzlyU", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "selected", "Surface-Ny5ogXk", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "checked", "onCheckedChange", "Lkotlin/Function1;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "surfaceColorAtElevation", "elevationOverlay", "Landroidx/compose/material/ElevationOverlay;", "absoluteElevation", "surfaceColorAtElevation-cq6XJ1M", "(JLandroidx/compose/material/ElevationOverlay;FLandroidx/compose/runtime/Composer;I)J", "surface", "backgroundColor", "surface-8ww4TTg", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JLandroidx/compose/foundation/BorderStroke;F)Landroidx/compose/ui/Modifier;", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurfaceKt {
    /* renamed from: Surface-F-jzlyU, reason: not valid java name */
    public static final void m1803SurfaceFjzlyU(Modifier modifier, Shape shape, long color, long contentColor, BorderStroke border, float elevation, final Function2<? super Composer, ? super Integer, Unit> function2, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        Shape shape2;
        long color2;
        long contentColor2;
        BorderStroke border2;
        final Shape shape3;
        final long contentColor3;
        final Modifier modifier3;
        final long color3;
        final BorderStroke border3;
        final float elevation2;
        final float elevation3;
        final Shape shape4;
        final long color4;
        final BorderStroke border4;
        Composer $composer2 = $composer.startRestartGroup(1412203386);
        ComposerKt.sourceInformation($composer2, "C(Surface)P(5,6,1:c#ui.graphics.Color,3:c#ui.graphics.Color!1,4:c#ui.unit.Dp)*103@5304L7,107@5467L875,104@5328L1014:Surface.kt#jmzs0o");
        int $dirty = $changed;
        int i2 = i & 1;
        if (i2 != 0) {
            $dirty |= 6;
            modifier2 = modifier;
        } else if (($changed & 6) == 0) {
            modifier2 = modifier;
            $dirty |= $composer2.changed(modifier2) ? 4 : 2;
        } else {
            modifier2 = modifier;
        }
        int i3 = i & 2;
        if (i3 != 0) {
            $dirty |= 48;
            shape2 = shape;
        } else if (($changed & 48) == 0) {
            shape2 = shape;
            $dirty |= $composer2.changed(shape2) ? 32 : 16;
        } else {
            shape2 = shape;
        }
        if (($changed & 384) == 0) {
            if ((i & 4) == 0) {
                color2 = color;
                int i4 = $composer2.changed(color2) ? 256 : 128;
                $dirty |= i4;
            } else {
                color2 = color;
            }
            $dirty |= i4;
        } else {
            color2 = color;
        }
        if (($changed & 3072) == 0) {
            if ((i & 8) == 0) {
                contentColor2 = contentColor;
                int i5 = $composer2.changed(contentColor2) ? 2048 : 1024;
                $dirty |= i5;
            } else {
                contentColor2 = contentColor;
            }
            $dirty |= i5;
        } else {
            contentColor2 = contentColor;
        }
        int i6 = i & 16;
        if (i6 != 0) {
            $dirty |= 24576;
            border2 = border;
        } else if (($changed & 24576) == 0) {
            border2 = border;
            $dirty |= $composer2.changed(border2) ? 16384 : 8192;
        } else {
            border2 = border;
        }
        int i7 = i & 32;
        if (i7 != 0) {
            $dirty |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            $dirty |= $composer2.changed(elevation) ? 131072 : 65536;
        }
        if ((i & 64) != 0) {
            $dirty |= JNINativeInterface.JNI_VERSION_24;
        } else if (($changed & JNINativeInterface.JNI_VERSION_24) == 0) {
            $dirty |= $composer2.changedInstance(function2) ? 1048576 : 524288;
        }
        if ($composer2.shouldExecute(($dirty & 599187) != 599186, $dirty & 1)) {
            $composer2.startDefaults();
            ComposerKt.sourceInformation($composer2, "97@5087L6,98@5129L22");
            if (($changed & 1) == 0 || $composer2.getDefaultsInvalid()) {
                if (i2 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i3 != 0) {
                    shape2 = RectangleShapeKt.getRectangleShape();
                }
                if ((i & 4) != 0) {
                    color2 = MaterialTheme.INSTANCE.getColors($composer2, 6).m1623getSurface0d7_KjU();
                    $dirty &= -897;
                }
                if ((i & 8) != 0) {
                    contentColor2 = ColorsKt.m1637contentColorForek8zF_U(color2, $composer2, ($dirty >> 6) & 14);
                    $dirty &= -7169;
                }
                if (i6 != 0) {
                    border2 = null;
                }
                if (i7 == 0) {
                    elevation3 = elevation;
                    shape4 = shape2;
                    color4 = color2;
                    border4 = border2;
                } else {
                    elevation3 = Dp.m7018constructorimpl(0);
                    shape4 = shape2;
                    color4 = color2;
                    border4 = border2;
                }
            } else {
                $composer2.skipToGroupEnd();
                if ((i & 4) != 0) {
                    $dirty &= -897;
                }
                if ((i & 8) != 0) {
                    elevation3 = elevation;
                    $dirty &= -7169;
                    shape4 = shape2;
                    color4 = color2;
                    border4 = border2;
                } else {
                    elevation3 = elevation;
                    shape4 = shape2;
                    color4 = color2;
                    border4 = border2;
                }
            }
            $composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1412203386, $dirty, -1, "androidx.compose.material.Surface (Surface.kt:102)");
            }
            ProvidableCompositionLocal<Dp> localAbsoluteElevation = ElevationOverlayKt.getLocalAbsoluteElevation();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localAbsoluteElevation);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            float arg0$iv = ((Dp) objConsume).m7032unboximpl();
            final float absoluteElevation = Dp.m7018constructorimpl(arg0$iv + elevation3);
            final Modifier modifier4 = modifier2;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4380boximpl(contentColor2)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m7016boximpl(absoluteElevation))}, ComposableLambdaKt.rememberComposableLambda(-1822160838, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1
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

                /* JADX WARN: Removed duplicated region for block: B:28:0x0195  */
                /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void invoke(androidx.compose.runtime.Composer r29, int r30) {
                    /*
                        Method dump skipped, instructions count: 413
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt$Surface$1.invoke(androidx.compose.runtime.Composer, int):void");
                }

                /* compiled from: Surface.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.compose.material.SurfaceKt$Surface$1$2, reason: invalid class name */
                static final class AnonymousClass2 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
                    int label;

                    AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                        super(2, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass2(continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass2) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        switch (this.label) {
                            case 0:
                                ResultKt.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            default:
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                }
            }, $composer2, 54), $composer2, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            contentColor3 = contentColor2;
            shape3 = shape4;
            color3 = color4;
            border3 = border4;
            elevation2 = elevation3;
            modifier3 = modifier4;
        } else {
            $composer2.skipToGroupEnd();
            shape3 = shape2;
            contentColor3 = contentColor2;
            modifier3 = modifier2;
            color3 = color2;
            border3 = border2;
            elevation2 = elevation;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$2
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

                public final void invoke(Composer composer, int i8) {
                    SurfaceKt.m1803SurfaceFjzlyU(modifier3, shape3, color3, contentColor3, border3, elevation2, function2, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), i);
                }
            });
        }
    }

    /* renamed from: Surface-LPr_se0, reason: not valid java name */
    public static final void m1804SurfaceLPr_se0(final Function0<Unit> function0, Modifier modifier, boolean enabled, Shape shape, long color, long contentColor, BorderStroke border, float elevation, MutableInteractionSource interactionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        boolean enabled2;
        Shape shape2;
        long color2;
        int i2;
        long contentColor2;
        int i3;
        int i4;
        final boolean enabled3;
        final long contentColor3;
        final Modifier modifier3;
        final Shape shape3;
        final long color3;
        final BorderStroke border2;
        final float elevation2;
        final MutableInteractionSource interactionSource2;
        BorderStroke border3;
        float elevation3;
        final MutableInteractionSource interactionSource3;
        final BorderStroke border4;
        final float elevation4;
        final boolean enabled4;
        final Shape shape4;
        int $dirty;
        final long color4;
        Composer $composer2 = $composer.startRestartGroup(1560876237);
        ComposerKt.sourceInformation($composer2, "C(Surface)P(8,7,5,9,1:c#ui.graphics.Color,3:c#ui.graphics.Color!1,4:c#ui.unit.Dp,6)*209@11068L7,213@11231L963,210@11092L1102:Surface.kt#jmzs0o");
        int $dirty2 = $changed;
        if ((i & 1) != 0) {
            $dirty2 |= 6;
        } else if (($changed & 6) == 0) {
            $dirty2 |= $composer2.changedInstance(function0) ? 4 : 2;
        }
        int i5 = i & 2;
        if (i5 != 0) {
            $dirty2 |= 48;
            modifier2 = modifier;
        } else if (($changed & 48) == 0) {
            modifier2 = modifier;
            $dirty2 |= $composer2.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        int i6 = i & 4;
        if (i6 != 0) {
            $dirty2 |= 384;
            enabled2 = enabled;
        } else if (($changed & 384) == 0) {
            enabled2 = enabled;
            $dirty2 |= $composer2.changed(enabled2) ? 256 : 128;
        } else {
            enabled2 = enabled;
        }
        int i7 = i & 8;
        if (i7 != 0) {
            $dirty2 |= 3072;
            shape2 = shape;
        } else if (($changed & 3072) == 0) {
            shape2 = shape;
            $dirty2 |= $composer2.changed(shape2) ? 2048 : 1024;
        } else {
            shape2 = shape;
        }
        if (($changed & 24576) == 0) {
            if ((i & 16) == 0) {
                color2 = color;
                int i8 = $composer2.changed(color2) ? 16384 : 8192;
                $dirty2 |= i8;
            } else {
                color2 = color;
            }
            $dirty2 |= i8;
        } else {
            color2 = color;
        }
        if ((196608 & $changed) == 0) {
            if ((i & 32) == 0) {
                i2 = i5;
                contentColor2 = contentColor;
                int i9 = $composer2.changed(contentColor2) ? 131072 : 65536;
                $dirty2 |= i9;
            } else {
                i2 = i5;
                contentColor2 = contentColor;
            }
            $dirty2 |= i9;
        } else {
            i2 = i5;
            contentColor2 = contentColor;
        }
        int i10 = i & 64;
        if (i10 != 0) {
            $dirty2 |= JNINativeInterface.JNI_VERSION_24;
        } else if (($changed & JNINativeInterface.JNI_VERSION_24) == 0) {
            $dirty2 |= $composer2.changed(border) ? 1048576 : 524288;
        }
        int i11 = i & 128;
        if (i11 != 0) {
            $dirty2 |= User32.WS_CAPTION;
            i3 = i11;
        } else if (($changed & User32.WS_CAPTION) == 0) {
            i3 = i11;
            $dirty2 |= $composer2.changed(elevation) ? 8388608 : 4194304;
        } else {
            i3 = i11;
        }
        int i12 = i & 256;
        if (i12 != 0) {
            $dirty2 |= 100663296;
            i4 = i12;
        } else if (($changed & 100663296) == 0) {
            i4 = i12;
            $dirty2 |= $composer2.changed(interactionSource) ? 67108864 : 33554432;
        } else {
            i4 = i12;
        }
        if ((i & 512) != 0) {
            $dirty2 |= LZMA2Options.DICT_SIZE_MAX;
        } else if (($changed & LZMA2Options.DICT_SIZE_MAX) == 0) {
            $dirty2 |= $composer2.changedInstance(function2) ? 536870912 : 268435456;
        }
        int $dirty3 = $dirty2;
        if ($composer2.shouldExecute(($dirty2 & 306783379) != 306783378, $dirty3 & 1)) {
            $composer2.startDefaults();
            ComposerKt.sourceInformation($composer2, "202@10794L6,203@10836L22");
            if (($changed & 1) != 0 && !$composer2.getDefaultsInvalid()) {
                $composer2.skipToGroupEnd();
                if ((i & 16) != 0) {
                    $dirty3 &= -57345;
                }
                if ((i & 32) != 0) {
                    border4 = border;
                    elevation4 = elevation;
                    interactionSource3 = interactionSource;
                    $dirty = $dirty3 & (-458753);
                    enabled4 = enabled2;
                    shape4 = shape2;
                    color4 = color2;
                } else {
                    border4 = border;
                    elevation4 = elevation;
                    interactionSource3 = interactionSource;
                    enabled4 = enabled2;
                    shape4 = shape2;
                    $dirty = $dirty3;
                    color4 = color2;
                }
            } else {
                if (i2 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i6 != 0) {
                    enabled2 = true;
                }
                if (i7 != 0) {
                    shape2 = RectangleShapeKt.getRectangleShape();
                }
                if ((i & 16) != 0) {
                    color2 = MaterialTheme.INSTANCE.getColors($composer2, 6).m1623getSurface0d7_KjU();
                    $dirty3 &= -57345;
                }
                if ((i & 32) != 0) {
                    contentColor2 = ColorsKt.m1637contentColorForek8zF_U(color2, $composer2, ($dirty3 >> 12) & 14);
                    $dirty3 &= -458753;
                }
                if (i10 == 0) {
                    border3 = border;
                } else {
                    border3 = null;
                }
                if (i3 == 0) {
                    elevation3 = elevation;
                } else {
                    elevation3 = Dp.m7018constructorimpl(0);
                }
                if (i4 != 0) {
                    border4 = border3;
                    elevation4 = elevation3;
                    interactionSource3 = null;
                    enabled4 = enabled2;
                    shape4 = shape2;
                    $dirty = $dirty3;
                    color4 = color2;
                } else {
                    interactionSource3 = interactionSource;
                    border4 = border3;
                    elevation4 = elevation3;
                    enabled4 = enabled2;
                    shape4 = shape2;
                    $dirty = $dirty3;
                    color4 = color2;
                }
            }
            $composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1560876237, $dirty, -1, "androidx.compose.material.Surface (Surface.kt:208)");
            }
            ProvidableCompositionLocal<Dp> localAbsoluteElevation = ElevationOverlayKt.getLocalAbsoluteElevation();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localAbsoluteElevation);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final float arg0$iv = Dp.m7018constructorimpl(((Dp) objConsume).m7032unboximpl() + elevation4);
            final Modifier modifier4 = modifier2;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4380boximpl(contentColor2)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m7016boximpl(arg0$iv))}, ComposableLambdaKt.rememberComposableLambda(2031491085, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$3
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

                /* JADX WARN: Removed duplicated region for block: B:28:0x01aa  */
                /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void invoke(androidx.compose.runtime.Composer r29, int r30) {
                    /*
                        Method dump skipped, instructions count: 434
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt$Surface$3.invoke(androidx.compose.runtime.Composer, int):void");
                }
            }, $composer2, 54), $composer2, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            contentColor3 = contentColor2;
            modifier3 = modifier4;
            shape3 = shape4;
            color3 = color4;
            border2 = border4;
            elevation2 = elevation4;
            interactionSource2 = interactionSource3;
            enabled3 = enabled4;
        } else {
            $composer2.skipToGroupEnd();
            long j = contentColor2;
            enabled3 = enabled2;
            contentColor3 = j;
            modifier3 = modifier2;
            shape3 = shape2;
            color3 = color2;
            border2 = border;
            elevation2 = elevation;
            interactionSource2 = interactionSource;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$4
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

                public final void invoke(Composer composer, int i13) {
                    SurfaceKt.m1804SurfaceLPr_se0(function0, modifier3, enabled3, shape3, color3, contentColor3, border2, elevation2, interactionSource2, function2, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), i);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r28v4 */
    /* JADX WARN: Type inference failed for: r28v5 */
    /* JADX WARN: Type inference failed for: r28v6 */
    /* JADX WARN: Type inference failed for: r28v7 */
    /* renamed from: Surface-Ny5ogXk, reason: not valid java name */
    public static final void m1805SurfaceNy5ogXk(final boolean z, final Function0<Unit> function0, Modifier modifier, boolean z2, Shape shape, long j, long j2, BorderStroke borderStroke, float f, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2, final int i3) {
        boolean z3;
        Function0<Unit> function02;
        Modifier modifier2;
        boolean z4;
        Shape rectangleShape;
        final long jM1623getSurface0d7_KjU;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        final long j3;
        final float f2;
        final Modifier modifier3;
        final boolean z5;
        final Shape shape2;
        final BorderStroke borderStroke2;
        final MutableInteractionSource mutableInteractionSource2;
        Modifier.Companion companion;
        long jM1637contentColorForek8zF_U;
        boolean z6;
        float fM7018constructorimpl;
        final MutableInteractionSource mutableInteractionSource3;
        final BorderStroke borderStroke3;
        final float f3;
        final boolean z7;
        final Shape shape3;
        int i10;
        int i11;
        final long j4;
        boolean z8;
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(262027249);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Surface)P(9,8,7,5,10,1:c#ui.graphics.Color,3:c#ui.graphics.Color!1,4:c#ui.unit.Dp,6)*319@17008L7,323@17171L1009,320@17032L1148:Surface.kt#jmzs0o");
        int i13 = i;
        if ((i3 & 1) != 0) {
            i13 |= 6;
            z3 = z;
        } else if ((i & 6) == 0) {
            z3 = z;
            i13 |= composerStartRestartGroup.changed(z3) ? 4 : 2;
        } else {
            z3 = z;
        }
        if ((i3 & 2) != 0) {
            i13 |= 48;
            function02 = function0;
        } else if ((i & 48) == 0) {
            function02 = function0;
            i13 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
        } else {
            function02 = function0;
        }
        int i14 = i3 & 4;
        if (i14 != 0) {
            i13 |= 384;
            modifier2 = modifier;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i13 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        int i15 = i3 & 8;
        if (i15 != 0) {
            i13 |= 3072;
            z4 = z2;
        } else if ((i & 3072) == 0) {
            z4 = z2;
            i13 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
        } else {
            z4 = z2;
        }
        int i16 = i3 & 16;
        if (i16 != 0) {
            i13 |= 24576;
            rectangleShape = shape;
        } else if ((i & 24576) == 0) {
            rectangleShape = shape;
            i13 |= composerStartRestartGroup.changed(rectangleShape) ? 16384 : 8192;
        } else {
            rectangleShape = shape;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            if ((i3 & 32) == 0) {
                jM1623getSurface0d7_KjU = j;
                int i17 = composerStartRestartGroup.changed(jM1623getSurface0d7_KjU) ? 131072 : 65536;
                i13 |= i17;
            } else {
                jM1623getSurface0d7_KjU = j;
            }
            i13 |= i17;
        } else {
            jM1623getSurface0d7_KjU = j;
        }
        if ((i & JNINativeInterface.JNI_VERSION_24) == 0) {
            if ((i3 & 64) == 0) {
                i12 = i13;
                i5 = i2;
                int i18 = composerStartRestartGroup.changed(j2) ? 1048576 : 524288;
                i4 = i12 | i18;
            } else {
                i12 = i13;
                i5 = i2;
            }
            i4 = i12 | i18;
        } else {
            i4 = i13;
            i5 = i2;
        }
        int i19 = i3 & 128;
        if (i19 != 0) {
            i4 |= User32.WS_CAPTION;
            i6 = i19;
        } else if ((i & User32.WS_CAPTION) == 0) {
            i6 = i19;
            i4 |= composerStartRestartGroup.changed(borderStroke) ? 8388608 : 4194304;
        } else {
            i6 = i19;
        }
        int i20 = i3 & 256;
        if (i20 != 0) {
            i4 |= 100663296;
            i7 = i20;
        } else if ((i & 100663296) == 0) {
            i7 = i20;
            i4 |= composerStartRestartGroup.changed(f) ? 67108864 : 33554432;
        } else {
            i7 = i20;
        }
        int i21 = i3 & 512;
        if (i21 != 0) {
            i4 |= LZMA2Options.DICT_SIZE_MAX;
            i8 = i21;
        } else if ((i & LZMA2Options.DICT_SIZE_MAX) == 0) {
            i8 = i21;
            i4 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 536870912 : 268435456;
        } else {
            i8 = i21;
        }
        if ((i3 & 1024) != 0) {
            i9 = i5 | 6;
        } else {
            if ((i2 & 6) == 0) {
                i5 |= composerStartRestartGroup.changedInstance(function2) ? 4 : 2;
            }
            i9 = i5;
        }
        if (composerStartRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i9 & 3) == 2) ? false : true, i4 & 1)) {
            composerStartRestartGroup.startDefaults();
            ComposerKt.sourceInformation(composerStartRestartGroup, "312@16734L6,313@16776L22");
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                companion = i14 != 0 ? Modifier.INSTANCE : modifier2;
                boolean z9 = i15 != 0 ? true : z4;
                if (i16 != 0) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                }
                if ((i3 & 32) != 0) {
                    jM1623getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1623getSurface0d7_KjU();
                    i4 &= -458753;
                }
                if ((i3 & 64) != 0) {
                    jM1637contentColorForek8zF_U = ColorsKt.m1637contentColorForek8zF_U(jM1623getSurface0d7_KjU, composerStartRestartGroup, (i4 >> 15) & 14);
                    i4 &= -3670017;
                } else {
                    jM1637contentColorForek8zF_U = j2;
                }
                BorderStroke borderStroke4 = i6 != 0 ? null : borderStroke;
                if (i7 != 0) {
                    z6 = true;
                    fM7018constructorimpl = Dp.m7018constructorimpl(0);
                } else {
                    z6 = true;
                    fM7018constructorimpl = f;
                }
                if (i8 != 0) {
                    borderStroke3 = borderStroke4;
                    f3 = fM7018constructorimpl;
                    z7 = z9;
                    mutableInteractionSource3 = null;
                    shape3 = rectangleShape;
                    i10 = i4;
                    i11 = 262027249;
                    j4 = jM1623getSurface0d7_KjU;
                    z8 = z6;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource;
                    borderStroke3 = borderStroke4;
                    f3 = fM7018constructorimpl;
                    z7 = z9;
                    shape3 = rectangleShape;
                    i10 = i4;
                    i11 = 262027249;
                    j4 = jM1623getSurface0d7_KjU;
                    z8 = z6;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 32) != 0) {
                    i4 &= -458753;
                }
                if ((i3 & 64) != 0) {
                    borderStroke3 = borderStroke;
                    f3 = f;
                    mutableInteractionSource3 = mutableInteractionSource;
                    i10 = i4 & (-3670017);
                    j4 = jM1623getSurface0d7_KjU;
                    companion = modifier2;
                    z7 = z4;
                    shape3 = rectangleShape;
                    i11 = 262027249;
                    z8 = 1;
                    jM1637contentColorForek8zF_U = j2;
                } else {
                    borderStroke3 = borderStroke;
                    f3 = f;
                    mutableInteractionSource3 = mutableInteractionSource;
                    companion = modifier2;
                    z7 = z4;
                    shape3 = rectangleShape;
                    i10 = i4;
                    i11 = 262027249;
                    z8 = 1;
                    jM1637contentColorForek8zF_U = j2;
                    j4 = jM1623getSurface0d7_KjU;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(i11, i10, i9, "androidx.compose.material.Surface (Surface.kt:318)");
            }
            ProvidableCompositionLocal<Dp> localAbsoluteElevation = ElevationOverlayKt.getLocalAbsoluteElevation();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localAbsoluteElevation);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final float fM7018constructorimpl2 = Dp.m7018constructorimpl(((Dp) objConsume).m7032unboximpl() + f3);
            ProvidedValue[] providedValueArr = new ProvidedValue[2];
            providedValueArr[0] = ContentColorKt.getLocalContentColor().provides(Color.m4380boximpl(jM1637contentColorForek8zF_U));
            providedValueArr[z8] = ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m7016boximpl(fM7018constructorimpl2));
            final Modifier modifier4 = companion;
            final boolean z10 = z3;
            final Function0<Unit> function03 = function02;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.rememberComposableLambda(-1391199439, z8, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Removed duplicated region for block: B:28:0x01ac  */
                /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void invoke(androidx.compose.runtime.Composer r29, int r30) {
                    /*
                        Method dump skipped, instructions count: 436
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt$Surface$5.invoke(androidx.compose.runtime.Composer, int):void");
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j3 = jM1637contentColorForek8zF_U;
            shape2 = shape3;
            jM1623getSurface0d7_KjU = j4;
            borderStroke2 = borderStroke3;
            f2 = f3;
            mutableInteractionSource2 = mutableInteractionSource3;
            z5 = z7;
            modifier3 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            j3 = j2;
            f2 = f;
            modifier3 = modifier2;
            z5 = z4;
            shape2 = rectangleShape;
            borderStroke2 = borderStroke;
            mutableInteractionSource2 = mutableInteractionSource;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    SurfaceKt.m1805SurfaceNy5ogXk(z, function0, modifier3, z5, shape2, jM1623getSurface0d7_KjU, j3, borderStroke2, f2, mutableInteractionSource2, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r28v4 */
    /* JADX WARN: Type inference failed for: r28v5 */
    /* JADX WARN: Type inference failed for: r28v6 */
    /* JADX WARN: Type inference failed for: r28v7 */
    /* renamed from: Surface-Ny5ogXk, reason: not valid java name */
    public static final void m1806SurfaceNy5ogXk(final boolean z, final Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z2, Shape shape, long j, long j2, BorderStroke borderStroke, float f, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2, final int i3) {
        boolean z3;
        Function1<? super Boolean, Unit> function12;
        Modifier modifier2;
        boolean z4;
        Shape rectangleShape;
        final long jM1623getSurface0d7_KjU;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        final long j3;
        final float f2;
        final Modifier modifier3;
        final boolean z5;
        final Shape shape2;
        final BorderStroke borderStroke2;
        final MutableInteractionSource mutableInteractionSource2;
        Modifier.Companion companion;
        long jM1637contentColorForek8zF_U;
        boolean z6;
        float fM7018constructorimpl;
        final MutableInteractionSource mutableInteractionSource3;
        final BorderStroke borderStroke3;
        final float f3;
        final boolean z7;
        final Shape shape3;
        int i10;
        int i11;
        final long j4;
        boolean z8;
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(1341569296);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Surface)P(1,9,8,6,10,2:c#ui.graphics.Color,4:c#ui.graphics.Color!1,5:c#ui.unit.Dp,7)*430@23068L7,434@23231L1019,431@23092L1158:Surface.kt#jmzs0o");
        int i13 = i;
        if ((i3 & 1) != 0) {
            i13 |= 6;
            z3 = z;
        } else if ((i & 6) == 0) {
            z3 = z;
            i13 |= composerStartRestartGroup.changed(z3) ? 4 : 2;
        } else {
            z3 = z;
        }
        if ((i3 & 2) != 0) {
            i13 |= 48;
            function12 = function1;
        } else if ((i & 48) == 0) {
            function12 = function1;
            i13 |= composerStartRestartGroup.changedInstance(function12) ? 32 : 16;
        } else {
            function12 = function1;
        }
        int i14 = i3 & 4;
        if (i14 != 0) {
            i13 |= 384;
            modifier2 = modifier;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i13 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        int i15 = i3 & 8;
        if (i15 != 0) {
            i13 |= 3072;
            z4 = z2;
        } else if ((i & 3072) == 0) {
            z4 = z2;
            i13 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
        } else {
            z4 = z2;
        }
        int i16 = i3 & 16;
        if (i16 != 0) {
            i13 |= 24576;
            rectangleShape = shape;
        } else if ((i & 24576) == 0) {
            rectangleShape = shape;
            i13 |= composerStartRestartGroup.changed(rectangleShape) ? 16384 : 8192;
        } else {
            rectangleShape = shape;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            if ((i3 & 32) == 0) {
                jM1623getSurface0d7_KjU = j;
                int i17 = composerStartRestartGroup.changed(jM1623getSurface0d7_KjU) ? 131072 : 65536;
                i13 |= i17;
            } else {
                jM1623getSurface0d7_KjU = j;
            }
            i13 |= i17;
        } else {
            jM1623getSurface0d7_KjU = j;
        }
        if ((i & JNINativeInterface.JNI_VERSION_24) == 0) {
            if ((i3 & 64) == 0) {
                i12 = i13;
                i5 = i2;
                int i18 = composerStartRestartGroup.changed(j2) ? 1048576 : 524288;
                i4 = i12 | i18;
            } else {
                i12 = i13;
                i5 = i2;
            }
            i4 = i12 | i18;
        } else {
            i4 = i13;
            i5 = i2;
        }
        int i19 = i3 & 128;
        if (i19 != 0) {
            i4 |= User32.WS_CAPTION;
            i6 = i19;
        } else if ((i & User32.WS_CAPTION) == 0) {
            i6 = i19;
            i4 |= composerStartRestartGroup.changed(borderStroke) ? 8388608 : 4194304;
        } else {
            i6 = i19;
        }
        int i20 = i3 & 256;
        if (i20 != 0) {
            i4 |= 100663296;
            i7 = i20;
        } else if ((i & 100663296) == 0) {
            i7 = i20;
            i4 |= composerStartRestartGroup.changed(f) ? 67108864 : 33554432;
        } else {
            i7 = i20;
        }
        int i21 = i3 & 512;
        if (i21 != 0) {
            i4 |= LZMA2Options.DICT_SIZE_MAX;
            i8 = i21;
        } else if ((i & LZMA2Options.DICT_SIZE_MAX) == 0) {
            i8 = i21;
            i4 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 536870912 : 268435456;
        } else {
            i8 = i21;
        }
        if ((i3 & 1024) != 0) {
            i9 = i5 | 6;
        } else {
            if ((i2 & 6) == 0) {
                i5 |= composerStartRestartGroup.changedInstance(function2) ? 4 : 2;
            }
            i9 = i5;
        }
        if (composerStartRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i9 & 3) == 2) ? false : true, i4 & 1)) {
            composerStartRestartGroup.startDefaults();
            ComposerKt.sourceInformation(composerStartRestartGroup, "423@22794L6,424@22836L22");
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                companion = i14 != 0 ? Modifier.INSTANCE : modifier2;
                boolean z9 = i15 != 0 ? true : z4;
                if (i16 != 0) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                }
                if ((i3 & 32) != 0) {
                    jM1623getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1623getSurface0d7_KjU();
                    i4 &= -458753;
                }
                if ((i3 & 64) != 0) {
                    jM1637contentColorForek8zF_U = ColorsKt.m1637contentColorForek8zF_U(jM1623getSurface0d7_KjU, composerStartRestartGroup, (i4 >> 15) & 14);
                    i4 &= -3670017;
                } else {
                    jM1637contentColorForek8zF_U = j2;
                }
                BorderStroke borderStroke4 = i6 != 0 ? null : borderStroke;
                if (i7 != 0) {
                    z6 = true;
                    fM7018constructorimpl = Dp.m7018constructorimpl(0);
                } else {
                    z6 = true;
                    fM7018constructorimpl = f;
                }
                if (i8 != 0) {
                    borderStroke3 = borderStroke4;
                    f3 = fM7018constructorimpl;
                    z7 = z9;
                    mutableInteractionSource3 = null;
                    shape3 = rectangleShape;
                    i10 = i4;
                    i11 = 1341569296;
                    j4 = jM1623getSurface0d7_KjU;
                    z8 = z6;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource;
                    borderStroke3 = borderStroke4;
                    f3 = fM7018constructorimpl;
                    z7 = z9;
                    shape3 = rectangleShape;
                    i10 = i4;
                    i11 = 1341569296;
                    j4 = jM1623getSurface0d7_KjU;
                    z8 = z6;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 32) != 0) {
                    i4 &= -458753;
                }
                if ((i3 & 64) != 0) {
                    borderStroke3 = borderStroke;
                    f3 = f;
                    mutableInteractionSource3 = mutableInteractionSource;
                    i10 = i4 & (-3670017);
                    j4 = jM1623getSurface0d7_KjU;
                    companion = modifier2;
                    z7 = z4;
                    shape3 = rectangleShape;
                    i11 = 1341569296;
                    z8 = 1;
                    jM1637contentColorForek8zF_U = j2;
                } else {
                    borderStroke3 = borderStroke;
                    f3 = f;
                    mutableInteractionSource3 = mutableInteractionSource;
                    companion = modifier2;
                    z7 = z4;
                    shape3 = rectangleShape;
                    i10 = i4;
                    i11 = 1341569296;
                    z8 = 1;
                    jM1637contentColorForek8zF_U = j2;
                    j4 = jM1623getSurface0d7_KjU;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(i11, i10, i9, "androidx.compose.material.Surface (Surface.kt:429)");
            }
            ProvidableCompositionLocal<Dp> localAbsoluteElevation = ElevationOverlayKt.getLocalAbsoluteElevation();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localAbsoluteElevation);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final float fM7018constructorimpl2 = Dp.m7018constructorimpl(((Dp) objConsume).m7032unboximpl() + f3);
            ProvidedValue[] providedValueArr = new ProvidedValue[2];
            providedValueArr[0] = ContentColorKt.getLocalContentColor().provides(Color.m4380boximpl(jM1637contentColorForek8zF_U));
            providedValueArr[z8] = ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m7016boximpl(fM7018constructorimpl2));
            final Modifier modifier4 = companion;
            final boolean z10 = z3;
            final Function1<? super Boolean, Unit> function13 = function12;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.rememberComposableLambda(-311657392, z8, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Removed duplicated region for block: B:28:0x01ac  */
                /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void invoke(androidx.compose.runtime.Composer r29, int r30) {
                    /*
                        Method dump skipped, instructions count: 436
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt$Surface$7.invoke(androidx.compose.runtime.Composer, int):void");
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j3 = jM1637contentColorForek8zF_U;
            shape2 = shape3;
            jM1623getSurface0d7_KjU = j4;
            borderStroke2 = borderStroke3;
            f2 = f3;
            mutableInteractionSource2 = mutableInteractionSource3;
            z5 = z7;
            modifier3 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            j3 = j2;
            f2 = f;
            modifier3 = modifier2;
            z5 = z4;
            shape2 = rectangleShape;
            borderStroke2 = borderStroke;
            mutableInteractionSource2 = mutableInteractionSource;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    SurfaceKt.m1806SurfaceNy5ogXk(z, function1, modifier3, z5, shape2, jM1623getSurface0d7_KjU, j3, borderStroke2, f2, mutableInteractionSource2, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: surface-8ww4TTg, reason: not valid java name */
    public static final Modifier m1809surface8ww4TTg(Modifier $this$surface_u2d8ww4TTg, Shape shape, long backgroundColor, BorderStroke border, float elevation) {
        Modifier $this$surface_u2d8ww4TTg2 = ShadowKt.m4025shadows4CzXII$default($this$surface_u2d8ww4TTg, elevation, shape, false, 0L, 0L, 24, null);
        Modifier.Companion companionBorder = Modifier.INSTANCE;
        if (border != null) {
            companionBorder = BorderKt.border(companionBorder, border, shape);
        }
        return ClipKt.clip(BackgroundKt.m246backgroundbw27NRU($this$surface_u2d8ww4TTg2.then(companionBorder), backgroundColor, shape), shape);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: surfaceColorAtElevation-cq6XJ1M, reason: not valid java name */
    public static final long m1810surfaceColorAtElevationcq6XJ1M(long color, ElevationOverlay elevationOverlay, float absoluteElevation, Composer $composer, int $changed) {
        Composer $composer2;
        long color2;
        ComposerKt.sourceInformationMarkerStart($composer, 1561611256, "C(surfaceColorAtElevation)P(1:c#ui.graphics.Color,2,0:c#ui.unit.Dp)481@24772L6:Surface.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1561611256, $changed, -1, "androidx.compose.material.surfaceColorAtElevation (Surface.kt:480)");
        }
        if (!Color.m4391equalsimpl0(color, MaterialTheme.INSTANCE.getColors($composer, 6).m1623getSurface0d7_KjU()) || elevationOverlay == null) {
            $composer2 = $composer;
            $composer2.startReplaceGroup(1082990783);
            $composer2.endReplaceGroup();
            color2 = color;
        } else {
            $composer.startReplaceGroup(1082922676);
            ComposerKt.sourceInformation($composer, "482@24843L31");
            $composer2 = $composer;
            color2 = elevationOverlay.mo1660apply7g2Lkgo(color, absoluteElevation, $composer2, ($changed & 14) | (($changed >> 3) & 112) | (($changed << 3) & User32.WM_PENWINFIRST));
            $composer2.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd($composer2);
        return color2;
    }
}
