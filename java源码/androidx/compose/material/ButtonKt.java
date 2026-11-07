package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.jni.JNINativeInterface;
import org.lwjgl.system.windows.User32;
import org.tukaani.xz.LZMA2Options;

/* compiled from: Button.kt */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a\u008f\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008f\u0001\u0010\u001a\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008f\u0001\u0010\u001b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019¨\u0006\u001c²\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u0084\u0002"}, d2 = {"Button", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "elevation", "Landroidx/compose/material/ButtonElevation;", "shape", "Landroidx/compose/ui/graphics/Shape;", OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "colors", "Landroidx/compose/material/ButtonColors;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/ButtonElevation;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/ButtonColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "OutlinedButton", "TextButton", "material_release", "contentColor", "Landroidx/compose/ui/graphics/Color;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ButtonKt {
    public static final void Button(final Function0<Unit> function0, Modifier modifier, boolean enabled, MutableInteractionSource interactionSource, ButtonElevation elevation, Shape shape, BorderStroke border, ButtonColors colors, PaddingValues contentPadding, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        boolean z;
        MutableInteractionSource mutableInteractionSource;
        Shape shape2;
        BorderStroke borderStroke;
        int i2;
        Composer $composer2;
        final BorderStroke border2;
        final PaddingValues contentPadding2;
        final Modifier modifier3;
        final boolean enabled2;
        final MutableInteractionSource interactionSource2;
        final Shape shape3;
        final ButtonElevation elevation2;
        final ButtonColors colors2;
        MutableInteractionSource interactionSource3;
        ButtonElevation elevation3;
        int $dirty;
        CornerBasedShape shape4;
        Composer $composer3;
        int i3;
        boolean z2;
        ButtonColors colors3;
        final PaddingValues contentPadding3;
        Shape shape5;
        BorderStroke border3;
        boolean enabled3;
        int $dirty2;
        MutableInteractionSource interactionSource4;
        Modifier modifier4;
        State<Dp> stateElevation;
        Composer $composer4 = $composer.startRestartGroup(-2116133464);
        ComposerKt.sourceInformation($composer4, "C(Button)P(8,7,5,6,4,9!2,3)109@5204L21,115@5401L24,120@5649L644,110@5230L1063:Button.kt#jmzs0o");
        int $dirty3 = $changed;
        if ((i & 1) != 0) {
            $dirty3 |= 6;
        } else if (($changed & 6) == 0) {
            $dirty3 |= $composer4.changedInstance(function0) ? 4 : 2;
        }
        int i4 = i & 2;
        if (i4 != 0) {
            $dirty3 |= 48;
            modifier2 = modifier;
        } else if (($changed & 48) == 0) {
            modifier2 = modifier;
            $dirty3 |= $composer4.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        int i5 = i & 4;
        if (i5 != 0) {
            $dirty3 |= 384;
            z = enabled;
        } else if (($changed & 384) == 0) {
            z = enabled;
            $dirty3 |= $composer4.changed(z) ? 256 : 128;
        } else {
            z = enabled;
        }
        int i6 = i & 8;
        if (i6 != 0) {
            $dirty3 |= 3072;
            mutableInteractionSource = interactionSource;
        } else if (($changed & 3072) == 0) {
            mutableInteractionSource = interactionSource;
            $dirty3 |= $composer4.changed(mutableInteractionSource) ? 2048 : 1024;
        } else {
            mutableInteractionSource = interactionSource;
        }
        if (($changed & 24576) == 0) {
            $dirty3 |= ((i & 16) == 0 && $composer4.changed(elevation)) ? 16384 : 8192;
        }
        if ((196608 & $changed) == 0) {
            if ((i & 32) == 0) {
                shape2 = shape;
                int i7 = $composer4.changed(shape2) ? 131072 : 65536;
                $dirty3 |= i7;
            } else {
                shape2 = shape;
            }
            $dirty3 |= i7;
        } else {
            shape2 = shape;
        }
        int i8 = i & 64;
        if (i8 != 0) {
            $dirty3 |= JNINativeInterface.JNI_VERSION_24;
            borderStroke = border;
        } else if ((1572864 & $changed) == 0) {
            borderStroke = border;
            $dirty3 |= $composer4.changed(borderStroke) ? 1048576 : 524288;
        } else {
            borderStroke = border;
        }
        if (($changed & User32.WS_CAPTION) == 0) {
            $dirty3 |= ((i & 128) == 0 && $composer4.changed(colors)) ? 8388608 : 4194304;
        }
        int i9 = i & 256;
        if (i9 != 0) {
            $dirty3 |= 100663296;
            i2 = i9;
        } else if (($changed & 100663296) == 0) {
            i2 = i9;
            $dirty3 |= $composer4.changed(contentPadding) ? 67108864 : 33554432;
        } else {
            i2 = i9;
        }
        if ((i & 512) != 0) {
            $dirty3 |= LZMA2Options.DICT_SIZE_MAX;
        } else if (($changed & LZMA2Options.DICT_SIZE_MAX) == 0) {
            $dirty3 |= $composer4.changedInstance(function3) ? 536870912 : 268435456;
        }
        int $dirty4 = $dirty3;
        if ($composer4.shouldExecute((306783379 & $dirty4) != 306783378, $dirty4 & 1)) {
            $composer4.startDefaults();
            ComposerKt.sourceInformation($composer4, "100@4784L11,101@4830L6,103@4920L14");
            if (($changed & 1) == 0 || $composer4.getDefaultsInvalid()) {
                Modifier.Companion modifier5 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                boolean enabled4 = i5 != 0 ? true : z;
                interactionSource3 = i6 != 0 ? null : mutableInteractionSource;
                if ((i & 16) != 0) {
                    elevation3 = ButtonDefaults.INSTANCE.m1586elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer4, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                    $dirty = $dirty4 & (-57345);
                } else {
                    elevation3 = elevation;
                    $dirty = $dirty4;
                }
                if ((i & 32) != 0) {
                    shape4 = MaterialTheme.INSTANCE.getShapes($composer4, 6).getSmall();
                    $dirty &= -458753;
                } else {
                    shape4 = shape2;
                }
                BorderStroke border4 = i8 != 0 ? null : border;
                if ((i & 128) != 0) {
                    i3 = i2;
                    z2 = false;
                    colors3 = ButtonDefaults.INSTANCE.m1585buttonColorsro_MJ88(0L, 0L, 0L, 0L, $composer4, 24576, 15);
                    $composer3 = $composer4;
                    $dirty &= -29360129;
                } else {
                    $composer3 = $composer4;
                    i3 = i2;
                    z2 = false;
                    colors3 = colors;
                }
                if (i3 != 0) {
                    contentPadding3 = ButtonDefaults.INSTANCE.getContentPadding();
                    shape5 = shape4;
                    border3 = border4;
                    enabled3 = enabled4;
                    modifier2 = modifier5;
                    $dirty2 = $dirty;
                } else {
                    contentPadding3 = contentPadding;
                    shape5 = shape4;
                    border3 = border4;
                    enabled3 = enabled4;
                    modifier2 = modifier5;
                    $dirty2 = $dirty;
                }
            } else {
                $composer4.skipToGroupEnd();
                $dirty2 = (i & 16) != 0 ? $dirty4 & (-57345) : $dirty4;
                if ((i & 32) != 0) {
                    $dirty2 &= -458753;
                }
                if ((i & 128) != 0) {
                    $dirty2 &= -29360129;
                }
                elevation3 = elevation;
                contentPadding3 = contentPadding;
                interactionSource3 = mutableInteractionSource;
                border3 = borderStroke;
                shape5 = shape2;
                z2 = false;
                enabled3 = z;
                $composer3 = $composer4;
                colors3 = colors;
            }
            $composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2116133464, $dirty2, -1, "androidx.compose.material.Button (Button.kt:106)");
            }
            if (interactionSource3 == null) {
                $composer3.startReplaceGroup(1050689923);
                ComposerKt.sourceInformation($composer3, "108@5133L39");
                ComposerKt.sourceInformationMarkerStart($composer3, -243201441, "CC(remember):Button.kt#9igjgp");
                Composer $this$cache$iv = $composer3;
                Object it$iv = $this$cache$iv.rememberedValue();
                if (it$iv == Composer.INSTANCE.getEmpty()) {
                    Object value$iv = InteractionSourceKt.MutableInteractionSource();
                    $this$cache$iv.updateRememberedValue(value$iv);
                    it$iv = value$iv;
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endReplaceGroup();
                interactionSource4 = (MutableInteractionSource) it$iv;
            } else {
                $composer3.startReplaceGroup(-243202092);
                $composer3.endReplaceGroup();
                interactionSource4 = interactionSource3;
            }
            final State contentColor$delegate = colors3.contentColor(enabled3, $composer3, (($dirty2 >> 6) & 14) | (($dirty2 >> 18) & 112));
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifier2, z2, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ButtonKt.Button.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver $this$semantics) {
                    SemanticsPropertiesKt.m6242setRolekuIjeqM($this$semantics, Role.INSTANCE.m6223getButtono7Vup1c());
                }
            }, 1, null);
            long jM4400unboximpl = colors3.backgroundColor(enabled3, $composer3, (($dirty2 >> 6) & 14) | (($dirty2 >> 18) & 112)).getValue().m4400unboximpl();
            long jButton$lambda$1 = Button$lambda$1(contentColor$delegate);
            long jM4388copywmQWz5c = Color.m4388copywmQWz5c(jButton$lambda$1, (14 & 1) != 0 ? Color.m4392getAlphaimpl(jButton$lambda$1) : 1.0f, (14 & 2) != 0 ? Color.m4396getRedimpl(jButton$lambda$1) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(jButton$lambda$1) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(jButton$lambda$1) : 0.0f);
            if (elevation3 == null) {
                $composer3.startReplaceGroup(1051096580);
                $composer3.endReplaceGroup();
                stateElevation = null;
                modifier4 = modifier2;
            } else {
                $composer3.startReplaceGroup(-243188323);
                ComposerKt.sourceInformation($composer3, "118@5543L37");
                modifier4 = modifier2;
                stateElevation = elevation3.elevation(enabled3, interactionSource4, $composer3, (($dirty2 >> 6) & User32.WM_PENWINFIRST) | (($dirty2 >> 6) & 14));
                $composer3.endReplaceGroup();
            }
            ButtonElevation elevation4 = elevation3;
            Composer $composer5 = $composer3;
            SurfaceKt.m1804SurfaceLPr_se0(function0, modifierSemantics$default, enabled3, shape5, jM4400unboximpl, jM4388copywmQWz5c, border3, stateElevation != null ? stateElevation.getValue().m7032unboximpl() : Dp.m7018constructorimpl(0), interactionSource4, ComposableLambdaKt.rememberComposableLambda(7524271, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt.Button.2
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

                public final void invoke(Composer $composer6, int $changed2) {
                    ComposerKt.sourceInformation($composer6, "C121@5731L556,121@5659L628:Button.kt#jmzs0o");
                    if ($composer6.shouldExecute(($changed2 & 3) != 2, $changed2 & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(7524271, $changed2, -1, "androidx.compose.material.Button.<anonymous> (Button.kt:121)");
                        }
                        ProvidedValue<Float> providedValueProvides = ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m4392getAlphaimpl(ButtonKt.Button$lambda$1(contentColor$delegate))));
                        final PaddingValues paddingValues = contentPadding3;
                        final Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                        CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.rememberComposableLambda(-1699085201, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt.Button.2.1
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

                            public final void invoke(Composer $composer7, int $changed3) {
                                ComposerKt.sourceInformation($composer7, "C122@5784L10,122@5803L474,122@5745L532:Button.kt#jmzs0o");
                                if (!$composer7.shouldExecute(($changed3 & 3) != 2, $changed3 & 1)) {
                                    $composer7.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1699085201, $changed3, -1, "androidx.compose.material.Button.<anonymous>.<anonymous> (Button.kt:122)");
                                }
                                TextStyle button = MaterialTheme.INSTANCE.getTypography($composer7, 6).getButton();
                                final PaddingValues paddingValues2 = paddingValues;
                                final Function3<RowScope, Composer, Integer, Unit> function33 = function32;
                                TextKt.ProvideTextStyle(button, ComposableLambdaKt.rememberComposableLambda(-630330208, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt.Button.2.1.1
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

                                    public final void invoke(Composer $composer8, int $changed4) {
                                        ComposerKt.sourceInformation($composer8, "C123@5821L442:Button.kt#jmzs0o");
                                        if ($composer8.shouldExecute(($changed4 & 3) != 2, $changed4 & 1)) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-630330208, $changed4, -1, "androidx.compose.material.Button.<anonymous>.<anonymous>.<anonymous> (Button.kt:123)");
                                            }
                                            Modifier modifier$iv = PaddingKt.padding(SizeKt.m769defaultMinSizeVpY3zN4(Modifier.INSTANCE, ButtonDefaults.INSTANCE.m1591getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m1590getMinHeightD9Ej5fM()), paddingValues2);
                                            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getCenter();
                                            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
                                            Function3 content$iv = function33;
                                            ComposerKt.sourceInformationMarkerStart($composer8, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                            MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer8, ((432 >> 3) & 14) | ((432 >> 3) & 112));
                                            int $changed$iv$iv = (432 << 3) & 112;
                                            ComposerKt.sourceInformationMarkerStart($composer8, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                            int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer8, 0);
                                            CompositionLocalMap localMap$iv$iv = $composer8.getCurrentCompositionLocalMap();
                                            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer8, modifier$iv);
                                            Function0 factory$iv$iv$iv = ComposeUiNode.INSTANCE.getConstructor();
                                            int $changed$iv$iv$iv = (($changed$iv$iv << 6) & User32.WM_PENWINFIRST) | 6;
                                            ComposerKt.sourceInformationMarkerStart($composer8, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                            if (!($composer8.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            $composer8.startReusableNode();
                                            if ($composer8.getInserting()) {
                                                $composer8.createNode(factory$iv$iv$iv);
                                            } else {
                                                $composer8.useNode();
                                            }
                                            Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3832constructorimpl($composer8);
                                            Updater.m3839setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m3839setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2 block$iv$iv$iv = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if ($this$Layout_u24lambda_u240$iv$iv.getInserting() || !Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
                                                $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
                                                $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
                                            }
                                            Updater.m3839setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
                                            int i10 = ($changed$iv$iv$iv >> 6) & 14;
                                            ComposerKt.sourceInformationMarkerStart($composer8, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                            content$iv.invoke(RowScopeInstance.INSTANCE, $composer8, Integer.valueOf(((432 >> 6) & 112) | 6));
                                            ComposerKt.sourceInformationMarkerEnd($composer8);
                                            $composer8.endNode();
                                            ComposerKt.sourceInformationMarkerEnd($composer8);
                                            ComposerKt.sourceInformationMarkerEnd($composer8);
                                            ComposerKt.sourceInformationMarkerEnd($composer8);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        $composer8.skipToGroupEnd();
                                    }
                                }, $composer7, 54), $composer7, 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, $composer6, 54), $composer6, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    $composer6.skipToGroupEnd();
                }
            }, $composer3, 54), $composer5, ($dirty2 & 14) | LZMA2Options.DICT_SIZE_MAX | ($dirty2 & User32.WM_PENWINFIRST) | (($dirty2 >> 6) & GL11.GL_RENDER) | (3670016 & $dirty2), 0);
            $composer2 = $composer5;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            elevation2 = elevation4;
            contentPadding2 = contentPadding3;
            colors2 = colors3;
            enabled2 = enabled3;
            shape3 = shape5;
            border2 = border3;
            modifier3 = modifier4;
            interactionSource2 = interactionSource3;
        } else {
            $composer2 = $composer4;
            $composer2.skipToGroupEnd();
            border2 = border;
            contentPadding2 = contentPadding;
            modifier3 = modifier2;
            enabled2 = z;
            interactionSource2 = mutableInteractionSource;
            shape3 = shape2;
            elevation2 = elevation;
            colors2 = colors;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt.Button.3
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

                public final void invoke(Composer composer, int i10) {
                    ButtonKt.Button(function0, modifier3, enabled2, interactionSource2, elevation2, shape3, border2, colors2, contentPadding2, function3, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), i);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long Button$lambda$1(State<Color> state) {
        Object thisObj$iv = state.getValue();
        return ((Color) thisObj$iv).m4400unboximpl();
    }

    public static final void OutlinedButton(Function0<Unit> function0, Modifier modifier, boolean enabled, MutableInteractionSource interactionSource, ButtonElevation elevation, Shape shape, BorderStroke border, ButtonColors colors, PaddingValues contentPadding, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer $composer, int $changed, int i) {
        ComposerKt.sourceInformationMarkerStart($composer, -1776134358, "C(OutlinedButton)P(8,7,5,6,4,9!2,3)177@8396L6,178@8453L14,179@8511L22,183@8655L314:Button.kt#jmzs0o");
        Modifier modifier2 = (i & 2) != 0 ? Modifier.INSTANCE : modifier;
        boolean enabled2 = (i & 4) != 0 ? true : enabled;
        MutableInteractionSource interactionSource2 = (i & 8) != 0 ? null : interactionSource;
        ButtonElevation elevation2 = (i & 16) != 0 ? null : elevation;
        Shape shape2 = (i & 32) != 0 ? MaterialTheme.INSTANCE.getShapes($composer, 6).getSmall() : shape;
        BorderStroke border2 = (i & 64) != 0 ? ButtonDefaults.INSTANCE.getOutlinedBorder($composer, 6) : border;
        ButtonColors colors2 = (i & 128) != 0 ? ButtonDefaults.INSTANCE.m1593outlinedButtonColorsRGew2ao(0L, 0L, 0L, $composer, 3072, 7) : colors;
        PaddingValues contentPadding2 = (i & 256) != 0 ? ButtonDefaults.INSTANCE.getContentPadding() : contentPadding;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1776134358, $changed, -1, "androidx.compose.material.OutlinedButton (Button.kt:183)");
        }
        Button(function0, modifier2, enabled2, interactionSource2, elevation2, shape2, border2, colors2, contentPadding2, function3, $composer, ($changed & 14) | ($changed & 112) | ($changed & User32.WM_PENWINFIRST) | ($changed & GL11.GL_RENDER) | (57344 & $changed) | (458752 & $changed) | (3670016 & $changed) | (29360128 & $changed) | (234881024 & $changed) | (1879048192 & $changed), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
    }

    public static final void TextButton(Function0<Unit> function0, Modifier modifier, boolean enabled, MutableInteractionSource interactionSource, ButtonElevation elevation, Shape shape, BorderStroke border, ButtonColors colors, PaddingValues contentPadding, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer $composer, int $changed, int i) {
        ComposerKt.sourceInformationMarkerStart($composer, 288797557, "C(TextButton)P(8,7,5,6,4,9!2,3)235@11067L6,237@11157L18,241@11307L314:Button.kt#jmzs0o");
        Modifier modifier2 = (i & 2) != 0 ? Modifier.INSTANCE : modifier;
        boolean enabled2 = (i & 4) != 0 ? true : enabled;
        MutableInteractionSource interactionSource2 = (i & 8) != 0 ? null : interactionSource;
        ButtonElevation elevation2 = (i & 16) != 0 ? null : elevation;
        Shape shape2 = (i & 32) != 0 ? MaterialTheme.INSTANCE.getShapes($composer, 6).getSmall() : shape;
        BorderStroke border2 = (i & 64) != 0 ? null : border;
        ButtonColors colors2 = (i & 128) != 0 ? ButtonDefaults.INSTANCE.m1594textButtonColorsRGew2ao(0L, 0L, 0L, $composer, 3072, 7) : colors;
        PaddingValues contentPadding2 = (i & 256) != 0 ? ButtonDefaults.INSTANCE.getTextButtonContentPadding() : contentPadding;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(288797557, $changed, -1, "androidx.compose.material.TextButton (Button.kt:241)");
        }
        Button(function0, modifier2, enabled2, interactionSource2, elevation2, shape2, border2, colors2, contentPadding2, function3, $composer, ($changed & 14) | ($changed & 112) | ($changed & User32.WM_PENWINFIRST) | ($changed & GL11.GL_RENDER) | (57344 & $changed) | (458752 & $changed) | (3670016 & $changed) | (29360128 & $changed) | (234881024 & $changed) | (1879048192 & $changed), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
    }
}
