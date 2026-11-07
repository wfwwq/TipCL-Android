package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.lwjgl.system.windows.User32;

/* compiled from: RadioButton.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aO\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\r2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007¢\u0006\u0002\u0010\u0017\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004¨\u0006\u0018"}, d2 = {"RadioAnimationDuration", "", "RadioButtonDotSize", "Landroidx/compose/ui/unit/Dp;", "F", "RadioButtonPadding", "RadioButtonRippleRadius", "RadioButtonSize", "RadioRadius", "RadioStrokeWidth", "RadioButton", "", "selected", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "colors", "Landroidx/compose/material/RadioButtonColors;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/RadioButtonColors;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RadioButtonKt {
    private static final int RadioAnimationDuration = 100;
    private static final float RadioButtonDotSize;
    private static final float RadioRadius;
    private static final float RadioStrokeWidth;
    private static final float RadioButtonRippleRadius = Dp.m7018constructorimpl(24);
    private static final float RadioButtonPadding = Dp.m7018constructorimpl(2);
    private static final float RadioButtonSize = Dp.m7018constructorimpl(20);

    public static final void RadioButton(final boolean selected, final Function0<Unit> function0, Modifier modifier, boolean enabled, MutableInteractionSource interactionSource, RadioButtonColors colors, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        boolean z;
        MutableInteractionSource mutableInteractionSource;
        RadioButtonColors radioButtonColors;
        final Modifier modifier3;
        final boolean enabled2;
        final MutableInteractionSource interactionSource2;
        final RadioButtonColors colors2;
        Modifier.Companion modifier4;
        boolean enabled3;
        Composer $composer2;
        int $dirty;
        MutableInteractionSource interactionSource3;
        RadioButtonColors colors3;
        float arg0$iv;
        boolean z2;
        RadioButtonColors colors4;
        Modifier modifier5;
        int i2;
        Modifier.Companion selectableModifier;
        Composer $composer3 = $composer.startRestartGroup(1314435585);
        ComposerKt.sourceInformation($composer3, "C(RadioButton)P(5,4,3,1,2)83@3750L176,87@3955L29,114@4841L385,101@4434L792:RadioButton.kt#jmzs0o");
        int $dirty2 = $changed;
        if ((i & 1) != 0) {
            $dirty2 |= 6;
        } else if (($changed & 6) == 0) {
            $dirty2 |= $composer3.changed(selected) ? 4 : 2;
        }
        if ((i & 2) != 0) {
            $dirty2 |= 48;
        } else if (($changed & 48) == 0) {
            $dirty2 |= $composer3.changedInstance(function0) ? 32 : 16;
        }
        int i3 = i & 4;
        if (i3 != 0) {
            $dirty2 |= 384;
            modifier2 = modifier;
        } else if (($changed & 384) == 0) {
            modifier2 = modifier;
            $dirty2 |= $composer3.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        int i4 = i & 8;
        if (i4 != 0) {
            $dirty2 |= 3072;
            z = enabled;
        } else if (($changed & 3072) == 0) {
            z = enabled;
            $dirty2 |= $composer3.changed(z) ? 2048 : 1024;
        } else {
            z = enabled;
        }
        int i5 = i & 16;
        if (i5 != 0) {
            $dirty2 |= 24576;
            mutableInteractionSource = interactionSource;
        } else if (($changed & 24576) == 0) {
            mutableInteractionSource = interactionSource;
            $dirty2 |= $composer3.changed(mutableInteractionSource) ? 16384 : 8192;
        } else {
            mutableInteractionSource = interactionSource;
        }
        if ((196608 & $changed) == 0) {
            if ((i & 32) == 0) {
                radioButtonColors = colors;
                int i6 = $composer3.changed(radioButtonColors) ? 131072 : 65536;
                $dirty2 |= i6;
            } else {
                radioButtonColors = colors;
            }
            $dirty2 |= i6;
        } else {
            radioButtonColors = colors;
        }
        if ($composer3.shouldExecute((74899 & $dirty2) != 74898, $dirty2 & 1)) {
            $composer3.startDefaults();
            ComposerKt.sourceInformation($composer3, "80@3709L8");
            if (($changed & 1) == 0 || $composer3.getDefaultsInvalid()) {
                modifier4 = i3 != 0 ? Modifier.INSTANCE : modifier2;
                enabled3 = i4 != 0 ? true : z;
                MutableInteractionSource interactionSource4 = i5 != 0 ? null : mutableInteractionSource;
                if ((i & 32) != 0) {
                    $composer2 = $composer3;
                    $dirty = $dirty2 & (-458753);
                    colors3 = RadioButtonDefaults.INSTANCE.m1762colorsRGew2ao(0L, 0L, 0L, $composer2, 3072, 7);
                    interactionSource3 = interactionSource4;
                } else {
                    $composer2 = $composer3;
                    $dirty = $dirty2;
                    interactionSource3 = interactionSource4;
                    colors3 = colors;
                }
            } else {
                $composer3.skipToGroupEnd();
                if ((i & 32) != 0) {
                    $dirty2 &= -458753;
                }
                $dirty = $dirty2;
                modifier4 = modifier2;
                enabled3 = z;
                interactionSource3 = mutableInteractionSource;
                $composer2 = $composer3;
                colors3 = radioButtonColors;
            }
            $composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1314435585, $dirty, -1, "androidx.compose.material.RadioButton (RadioButton.kt:81)");
            }
            if (selected) {
                float arg0$iv2 = RadioButtonDotSize;
                arg0$iv = Dp.m7018constructorimpl(arg0$iv2 / 2);
            } else {
                arg0$iv = Dp.m7018constructorimpl(0);
            }
            int $dirty3 = $dirty;
            $composer3 = $composer2;
            final State dotRadius = AnimateAsStateKt.m136animateDpAsStateAjpBEmI(arg0$iv, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, $composer3, 48, 12);
            final State radioColor = colors3.radioColor(enabled3, selected, $composer3, (($dirty3 >> 9) & 14) | (($dirty3 << 3) & 112) | (($dirty3 >> 9) & User32.WM_PENWINFIRST));
            if (function0 != null) {
                Modifier modifier6 = Modifier.INSTANCE;
                int iM6228getRadioButtono7Vup1c = Role.INSTANCE.m6228getRadioButtono7Vup1c();
                Modifier modifier7 = modifier6;
                IndicationNodeFactory indicationNodeFactoryM1767rippleH2RKhps$default = RippleKt.m1767rippleH2RKhps$default(false, RadioButtonRippleRadius, 0L, 4, null);
                Role roleM6216boximpl = Role.m6216boximpl(iM6228getRadioButtono7Vup1c);
                colors4 = colors3;
                i2 = 2;
                z2 = false;
                modifier5 = modifier4;
                enabled2 = enabled3;
                selectableModifier = SelectableKt.m1000selectableO2vRcR0(modifier7, selected, interactionSource3, indicationNodeFactoryM1767rippleH2RKhps$default, enabled2, roleM6216boximpl, function0);
            } else {
                z2 = false;
                colors4 = colors3;
                modifier5 = modifier4;
                i2 = 2;
                enabled2 = enabled3;
                selectableModifier = Modifier.INSTANCE;
            }
            Modifier modifierM777requiredSize3ABfNKs = SizeKt.m777requiredSize3ABfNKs(PaddingKt.m738padding3ABfNKs(SizeKt.wrapContentSize$default(modifier5.then(function0 != null ? InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE) : Modifier.INSTANCE).then(selectableModifier), Alignment.INSTANCE.getCenter(), z2, i2, null), RadioButtonPadding), RadioButtonSize);
            ComposerKt.sourceInformationMarkerStart($composer3, 61089864, "CC(remember):RadioButton.kt#9igjgp");
            boolean invalid$iv = $composer3.changed(radioColor) | $composer3.changed(dotRadius);
            Object it$iv = $composer3.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$1$1
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
                        float strokeWidth = $this$Canvas.mo389toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                        float f = 2;
                        DrawScope.m4933drawCircleVaOC9Bg$default($this$Canvas, radioColor.getValue().m4400unboximpl(), $this$Canvas.mo389toPx0680j_4(RadioButtonKt.RadioRadius) - (strokeWidth / f), 0L, 0.0f, new Stroke(strokeWidth, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                        if (Dp.m7017compareTo0680j_4(dotRadius.getValue().m7032unboximpl(), Dp.m7018constructorimpl(0)) > 0) {
                            DrawScope.m4933drawCircleVaOC9Bg$default($this$Canvas, radioColor.getValue().m4400unboximpl(), $this$Canvas.mo389toPx0680j_4(dotRadius.getValue().m7032unboximpl()) - (strokeWidth / f), 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                        }
                    }
                };
                $composer3.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            CanvasKt.Canvas(modifierM777requiredSize3ABfNKs, (Function1) it$iv, $composer3, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            interactionSource2 = interactionSource3;
            modifier3 = modifier5;
            colors2 = colors4;
        } else {
            $composer3.skipToGroupEnd();
            modifier3 = modifier2;
            enabled2 = z;
            interactionSource2 = mutableInteractionSource;
            colors2 = colors;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.RadioButtonKt.RadioButton.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i7) {
                    RadioButtonKt.RadioButton(selected, function0, modifier3, enabled2, interactionSource2, colors2, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), i);
                }
            });
        }
    }

    static {
        float arg0$iv = RadioButtonSize;
        RadioRadius = Dp.m7018constructorimpl(arg0$iv / 2);
        RadioButtonDotSize = Dp.m7018constructorimpl(12);
        RadioStrokeWidth = Dp.m7018constructorimpl(2);
    }
}
