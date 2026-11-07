package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
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

/* compiled from: Chip.kt */
@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u0090\u0001\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u001b2\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000b0\u001d¢\u0006\u0002\b\u001b¢\u0006\u0002\b\u001fH\u0007¢\u0006\u0002\u0010 \u001aÆ\u0001\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u00112\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020#2\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u001b2\u0015\b\u0002\u0010$\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u001b2\u0015\b\u0002\u0010%\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u001b2\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000b0\u001d¢\u0006\u0002\b\u001b¢\u0006\u0002\b\u001fH\u0007¢\u0006\u0002\u0010&\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006'²\u0006\n\u0010(\u001a\u00020)X\u008a\u0084\u0002²\u0006\n\u0010*\u001a\u00020)X\u008a\u0084\u0002"}, d2 = {"HorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "LeadingIconEndSpacing", "LeadingIconStartSpacing", "SelectedIconContainerSize", "SelectedOverlayOpacity", "", "SurfaceOverlayOpacity", "TrailingIconSpacing", "Chip", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "colors", "Landroidx/compose/material/ChipColors;", "leadingIcon", "Landroidx/compose/runtime/Composable;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/ChipColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "FilterChip", "selected", "Landroidx/compose/material/SelectableChipColors;", "selectedIcon", "trailingIcon", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/SelectableChipColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "material_release", "contentColor", "Landroidx/compose/ui/graphics/Color;", "leadingIconContentColor"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChipKt {
    private static final float SelectedOverlayOpacity = 0.16f;
    private static final float SurfaceOverlayOpacity = 0.12f;
    private static final float HorizontalPadding = Dp.m7018constructorimpl(12);
    private static final float LeadingIconStartSpacing = Dp.m7018constructorimpl(4);
    private static final float LeadingIconEndSpacing = Dp.m7018constructorimpl(8);
    private static final float TrailingIconSpacing = Dp.m7018constructorimpl(8);
    private static final float SelectedIconContainerSize = Dp.m7018constructorimpl(24);

    /* JADX WARN: Type inference failed for: r8v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    public static final void Chip(final Function0<Unit> function0, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, Shape shape, BorderStroke borderStroke, ChipColors chipColors, Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        Function0<Unit> function02;
        Modifier modifier2;
        boolean z2;
        MutableInteractionSource mutableInteractionSource2;
        Shape shape2;
        BorderStroke borderStroke2;
        ChipColors chipColors2;
        int i3;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function22;
        final Modifier modifier3;
        final boolean z3;
        final MutableInteractionSource mutableInteractionSource3;
        final Shape shape3;
        final BorderStroke borderStroke3;
        final ChipColors chipColors3;
        CornerBasedShape cornerBasedShapeCopy;
        int i4;
        BorderStroke borderStroke4;
        boolean z4;
        Composer composer3;
        boolean z5;
        ChipColors chipColorsM1602chipColors5tl4gsc;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Shape shape4;
        BorderStroke borderStroke5;
        boolean z6;
        MutableInteractionSource mutableInteractionSource4;
        ?? r8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-368396408);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Chip)P(7,6,3,4,8!2,5)101@4584L21,107@4781L24,111@4939L1389,102@4610L1718:Chip.kt#jmzs0o");
        int i5 = i;
        if ((i2 & 1) != 0) {
            i5 |= 6;
            function02 = function0;
        } else if ((i & 6) == 0) {
            function02 = function0;
            i5 |= composerStartRestartGroup.changedInstance(function02) ? 4 : 2;
        } else {
            function02 = function0;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i5 |= 48;
            modifier2 = modifier;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i5 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i5 |= 384;
            z2 = z;
        } else if ((i & 384) == 0) {
            z2 = z;
            i5 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i5 |= 3072;
            mutableInteractionSource2 = mutableInteractionSource;
        } else if ((i & 3072) == 0) {
            mutableInteractionSource2 = mutableInteractionSource;
            i5 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 2048 : 1024;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                shape2 = shape;
                int i9 = composerStartRestartGroup.changed(shape2) ? 16384 : 8192;
                i5 |= i9;
            } else {
                shape2 = shape;
            }
            i5 |= i9;
        } else {
            shape2 = shape;
        }
        int i10 = i2 & 32;
        if (i10 != 0) {
            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            borderStroke2 = borderStroke;
        } else if ((196608 & i) == 0) {
            borderStroke2 = borderStroke;
            i5 |= composerStartRestartGroup.changed(borderStroke2) ? 131072 : 65536;
        } else {
            borderStroke2 = borderStroke;
        }
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                chipColors2 = chipColors;
                int i11 = composerStartRestartGroup.changed(chipColors2) ? 1048576 : 524288;
                i5 |= i11;
            } else {
                chipColors2 = chipColors;
            }
            i5 |= i11;
        } else {
            chipColors2 = chipColors;
        }
        int i12 = i2 & 128;
        if (i12 != 0) {
            i5 |= User32.WS_CAPTION;
            i3 = i10;
        } else if ((i & User32.WS_CAPTION) == 0) {
            i3 = i10;
            i5 |= composerStartRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
        } else {
            i3 = i10;
        }
        if ((i2 & 256) != 0) {
            i5 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function3) ? 67108864 : 33554432;
        }
        int i13 = i5;
        if (composerStartRestartGroup.shouldExecute((i5 & 38347923) != 38347922, i13 & 1)) {
            composerStartRestartGroup.startDefaults();
            ComposerKt.sourceInformation(composerStartRestartGroup, "95@4322L6,97@4439L12");
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 16) != 0) {
                    i13 &= -57345;
                }
                if ((i2 & 64) != 0) {
                    ChipColors chipColors4 = chipColors2;
                    shape4 = shape2;
                    chipColorsM1602chipColors5tl4gsc = chipColors4;
                    function23 = function2;
                    i4 = i13 & (-3670017);
                    mutableInteractionSource4 = mutableInteractionSource2;
                    r8 = 1;
                    borderStroke5 = borderStroke2;
                    composer3 = composerStartRestartGroup;
                    z6 = z2;
                    z5 = false;
                } else {
                    ChipColors chipColors5 = chipColors2;
                    shape4 = shape2;
                    chipColorsM1602chipColors5tl4gsc = chipColors5;
                    function23 = function2;
                    mutableInteractionSource4 = mutableInteractionSource2;
                    r8 = 1;
                    borderStroke5 = borderStroke2;
                    i4 = i13;
                    composer3 = composerStartRestartGroup;
                    z6 = z2;
                    z5 = false;
                }
            } else {
                if (i6 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i7 != 0) {
                    z2 = true;
                }
                if (i8 != 0) {
                    mutableInteractionSource2 = null;
                }
                if ((i2 & 16) == 0) {
                    cornerBasedShapeCopy = shape2;
                    i4 = i13;
                } else {
                    cornerBasedShapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                    i4 = i13 & (-57345);
                }
                if (i3 == 0) {
                    borderStroke4 = borderStroke2;
                } else {
                    borderStroke4 = null;
                }
                if ((i2 & 64) == 0) {
                    z4 = true;
                    composer3 = composerStartRestartGroup;
                    z5 = false;
                    chipColorsM1602chipColors5tl4gsc = chipColors;
                } else {
                    z4 = true;
                    z5 = false;
                    chipColorsM1602chipColors5tl4gsc = ChipDefaults.INSTANCE.m1602chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, JNINativeInterface.JNI_VERSION_24, 63);
                    composer3 = composerStartRestartGroup;
                    i4 &= -3670017;
                }
                if (i12 == 0) {
                    function23 = function2;
                    shape4 = cornerBasedShapeCopy;
                    borderStroke5 = borderStroke4;
                    z6 = z2;
                    mutableInteractionSource4 = mutableInteractionSource2;
                    r8 = z4;
                } else {
                    function23 = null;
                    shape4 = cornerBasedShapeCopy;
                    borderStroke5 = borderStroke4;
                    z6 = z2;
                    mutableInteractionSource4 = mutableInteractionSource2;
                    r8 = z4;
                }
            }
            composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-368396408, i4, -1, "androidx.compose.material.Chip (Chip.kt:100)");
            }
            final State<Color> stateContentColor = chipColorsM1602chipColors5tl4gsc.contentColor(z6, composer3, ((i4 >> 6) & 14) | ((i4 >> 15) & 112));
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifier2, z5, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ChipKt.Chip.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver $this$semantics) {
                    SemanticsPropertiesKt.m6242setRolekuIjeqM($this$semantics, Role.INSTANCE.m6223getButtono7Vup1c());
                }
            }, r8, null);
            long jM4400unboximpl = chipColorsM1602chipColors5tl4gsc.backgroundColor(z6, composer3, ((i4 >> 6) & 14) | ((i4 >> 15) & 112)).getValue().m4400unboximpl();
            long jChip$lambda$0 = Chip$lambda$0(stateContentColor);
            final Function2<? super Composer, ? super Integer, Unit> function24 = function23;
            final ChipColors chipColors6 = chipColorsM1602chipColors5tl4gsc;
            final boolean z7 = z6;
            composer2 = composer3;
            SurfaceKt.m1804SurfaceLPr_se0(function02, modifierSemantics$default, z6, shape4, jM4400unboximpl, Color.m4388copywmQWz5c(jChip$lambda$0, (14 & 1) != 0 ? Color.m4392getAlphaimpl(jChip$lambda$0) : 1.0f, (14 & 2) != 0 ? Color.m4396getRedimpl(jChip$lambda$0) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(jChip$lambda$0) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(jChip$lambda$0) : 0.0f), borderStroke5, 0.0f, mutableInteractionSource4, ComposableLambdaKt.rememberComposableLambda(139076687, r8, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.Chip.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                    invoke(composer4, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer $composer, int $changed) {
                    ComposerKt.sourceInformation($composer, "C112@5021L1301,112@4949L1373:Chip.kt#jmzs0o");
                    if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(139076687, $changed, -1, "androidx.compose.material.Chip.<anonymous> (Chip.kt:112)");
                        }
                        ProvidedValue<Float> providedValueProvides = ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m4392getAlphaimpl(ChipKt.Chip$lambda$0(stateContentColor))));
                        final Function2<Composer, Integer, Unit> function25 = function24;
                        final ChipColors chipColors7 = chipColors6;
                        final boolean z8 = z7;
                        final Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                        CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.rememberComposableLambda(667535631, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.Chip.2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer $composer2, int $changed2) {
                                ComposerKt.sourceInformation($composer2, "C113@5074L10,113@5092L1220,113@5035L1277:Chip.kt#jmzs0o");
                                if (!$composer2.shouldExecute(($changed2 & 3) != 2, $changed2 & 1)) {
                                    $composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(667535631, $changed2, -1, "androidx.compose.material.Chip.<anonymous>.<anonymous> (Chip.kt:113)");
                                }
                                TextStyle body2 = MaterialTheme.INSTANCE.getTypography($composer2, 6).getBody2();
                                final Function2<Composer, Integer, Unit> function26 = function25;
                                final ChipColors chipColors8 = chipColors7;
                                final boolean z9 = z8;
                                final Function3<RowScope, Composer, Integer, Unit> function33 = function32;
                                TextKt.ProvideTextStyle(body2, ComposableLambdaKt.rememberComposableLambda(-1131213696, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.Chip.2.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer $composer3, int $changed3) {
                                        float fM7018constructorimpl;
                                        Function0 factory$iv$iv$iv;
                                        ComposerKt.sourceInformation($composer3, "C114@5110L1188:Chip.kt#jmzs0o");
                                        if ($composer3.shouldExecute(($changed3 & 3) != 2, $changed3 & 1)) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1131213696, $changed3, -1, "androidx.compose.material.Chip.<anonymous>.<anonymous>.<anonymous> (Chip.kt:114)");
                                            }
                                            Modifier modifierM770defaultMinSizeVpY3zN4$default = SizeKt.m770defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, ChipDefaults.INSTANCE.m1605getMinHeightD9Ej5fM(), 1, null);
                                            if (function26 == null) {
                                                fM7018constructorimpl = ChipKt.HorizontalPadding;
                                            } else {
                                                fM7018constructorimpl = Dp.m7018constructorimpl(0);
                                            }
                                            Modifier modifier$iv = PaddingKt.m742paddingqDBjuR0$default(modifierM770defaultMinSizeVpY3zN4$default, fM7018constructorimpl, 0.0f, ChipKt.HorizontalPadding, 0.0f, 10, null);
                                            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getStart();
                                            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
                                            Function2<Composer, Integer, Unit> function27 = function26;
                                            ChipColors chipColors9 = chipColors8;
                                            boolean z10 = z9;
                                            Function3<RowScope, Composer, Integer, Unit> function34 = function33;
                                            ComposerKt.sourceInformationMarkerStart($composer3, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                            MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer3, ((432 >> 3) & 14) | ((432 >> 3) & 112));
                                            int $changed$iv$iv = (432 << 3) & 112;
                                            ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                            int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                                            CompositionLocalMap localMap$iv$iv = $composer3.getCurrentCompositionLocalMap();
                                            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer3, modifier$iv);
                                            Function0 factory$iv$iv$iv2 = ComposeUiNode.INSTANCE.getConstructor();
                                            int $changed$iv$iv$iv = (($changed$iv$iv << 6) & User32.WM_PENWINFIRST) | 6;
                                            ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                            if (!($composer3.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            $composer3.startReusableNode();
                                            if ($composer3.getInserting()) {
                                                factory$iv$iv$iv = factory$iv$iv$iv2;
                                                $composer3.createNode(factory$iv$iv$iv);
                                            } else {
                                                factory$iv$iv$iv = factory$iv$iv$iv2;
                                                $composer3.useNode();
                                            }
                                            Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3832constructorimpl($composer3);
                                            Updater.m3839setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m3839setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2 block$iv$iv$iv = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if ($this$Layout_u24lambda_u240$iv$iv.getInserting() || !Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
                                                $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
                                                $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
                                            }
                                            Updater.m3839setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
                                            int i14 = ($changed$iv$iv$iv >> 6) & 14;
                                            ComposerKt.sourceInformationMarkerStart($composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                            int $changed4 = ((432 >> 6) & 112) | 6;
                                            RowScope $this$invoke_u24lambda_u241 = RowScopeInstance.INSTANCE;
                                            ComposerKt.sourceInformationMarkerStart($composer3, 2027589750, "C136@6271L9:Chip.kt#jmzs0o");
                                            if (function27 == null) {
                                                $composer3.startReplaceGroup(2028143316);
                                                $composer3.endReplaceGroup();
                                            } else {
                                                $composer3.startReplaceGroup(2027612844);
                                                ComposerKt.sourceInformation($composer3, "127@5724L47,128@5834L32,129@5891L267,134@6183L45");
                                                SpacerKt.Spacer(SizeKt.m790width3ABfNKs(Modifier.INSTANCE, ChipKt.LeadingIconStartSpacing), $composer3, 6);
                                                State leadingIconContentColor$delegate = chipColors9.leadingIconContentColor(z10, $composer3, 0);
                                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4380boximpl(invoke$lambda$1$lambda$0(leadingIconContentColor$delegate))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m4392getAlphaimpl(invoke$lambda$1$lambda$0(leadingIconContentColor$delegate))))}, function27, $composer3, ProvidedValue.$stable);
                                                SpacerKt.Spacer(SizeKt.m790width3ABfNKs(Modifier.INSTANCE, ChipKt.LeadingIconEndSpacing), $composer3, 6);
                                                $composer3.endReplaceGroup();
                                            }
                                            function34.invoke($this$invoke_u24lambda_u241, $composer3, Integer.valueOf($changed4 & 14));
                                            ComposerKt.sourceInformationMarkerEnd($composer3);
                                            ComposerKt.sourceInformationMarkerEnd($composer3);
                                            $composer3.endNode();
                                            ComposerKt.sourceInformationMarkerEnd($composer3);
                                            ComposerKt.sourceInformationMarkerEnd($composer3);
                                            ComposerKt.sourceInformationMarkerEnd($composer3);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        $composer3.skipToGroupEnd();
                                    }

                                    private static final long invoke$lambda$1$lambda$0(State<Color> state) {
                                        Object thisObj$iv = state.getValue();
                                        return ((Color) thisObj$iv).m4400unboximpl();
                                    }
                                }, $composer2, 54), $composer2, 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, $composer, 54), $composer, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    $composer.skipToGroupEnd();
                }
            }, composer3, 54), composer2, (i4 & 14) | LZMA2Options.DICT_SIZE_MAX | (i4 & User32.WM_PENWINFIRST) | ((i4 >> 3) & GL11.GL_RENDER) | ((i4 << 3) & 3670016) | (234881024 & (i4 << 15)), 128);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            function22 = function24;
            z3 = z6;
            shape3 = shape4;
            mutableInteractionSource3 = mutableInteractionSource4;
            chipColors3 = chipColors6;
            borderStroke3 = borderStroke5;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            function22 = function2;
            modifier3 = modifier2;
            z3 = z2;
            mutableInteractionSource3 = mutableInteractionSource2;
            shape3 = shape2;
            borderStroke3 = borderStroke2;
            chipColors3 = chipColors;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.Chip.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                    invoke(composer4, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer4, int i14) {
                    ChipKt.Chip(function0, modifier3, z3, mutableInteractionSource3, shape3, borderStroke3, chipColors3, function22, function3, composer4, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long Chip$lambda$0(State<Color> state) {
        Object thisObj$iv = state.getValue();
        return ((Color) thisObj$iv).m4400unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FilterChip(final boolean r35, final kotlin.jvm.functions.Function0<kotlin.Unit> r36, androidx.compose.ui.Modifier r37, boolean r38, androidx.compose.foundation.interaction.MutableInteractionSource r39, androidx.compose.ui.graphics.Shape r40, androidx.compose.foundation.BorderStroke r41, androidx.compose.material.SelectableChipColors r42, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r43, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r44, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r45, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r46, androidx.compose.runtime.Composer r47, final int r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 1008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ChipKt.FilterChip(boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.foundation.BorderStroke, androidx.compose.material.SelectableChipColors, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
