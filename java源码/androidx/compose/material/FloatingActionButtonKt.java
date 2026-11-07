package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import com.pymcl.multiplayer.TerracottaVpnService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.jni.JNINativeInterface;
import org.lwjgl.system.windows.User32;
import org.tukaani.xz.LZMA2Options;

/* compiled from: FloatingActionButton.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0088\u0001\u0010\u0006\u001a\u00020\u00072\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0002\b\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\f\u001a\u00020\r2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t¢\u0006\u0002\b\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001aq\u0010\u001a\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0002\b\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"ExtendedFabIconPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ExtendedFabSize", "ExtendedFabTextPadding", "FabSize", "ExtendedFloatingActionButton", "", TerracottaVpnService.EXTRA_TEXT, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "onClick", "modifier", "Landroidx/compose/ui/Modifier;", "icon", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "elevation", "Landroidx/compose/material/FloatingActionButtonElevation;", "ExtendedFloatingActionButton-wqdebIU", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material/FloatingActionButtonElevation;Landroidx/compose/runtime/Composer;II)V", "FloatingActionButton", "content", "FloatingActionButton-bogVsAg", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material/FloatingActionButtonElevation;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FloatingActionButtonKt {
    private static final float FabSize = Dp.m7018constructorimpl(56);
    private static final float ExtendedFabSize = Dp.m7018constructorimpl(48);
    private static final float ExtendedFabIconPadding = Dp.m7018constructorimpl(12);
    private static final float ExtendedFabTextPadding = Dp.m7018constructorimpl(20);

    /* renamed from: FloatingActionButton-bogVsAg, reason: not valid java name */
    public static final void m1708FloatingActionButtonbogVsAg(final Function0<Unit> function0, Modifier modifier, MutableInteractionSource interactionSource, Shape shape, long backgroundColor, long contentColor, FloatingActionButtonElevation elevation, final Function2<? super Composer, ? super Integer, Unit> function2, Composer $composer, final int $changed, final int i) {
        Function0<Unit> function02;
        MutableInteractionSource interactionSource2;
        Shape shape2;
        long j;
        final long contentColor2;
        Composer $composer2;
        final Modifier modifier2;
        final MutableInteractionSource interactionSource3;
        final Shape shape3;
        final long backgroundColor2;
        final long contentColor3;
        final FloatingActionButtonElevation elevation2;
        int i2;
        Shape shape4;
        int $dirty;
        long backgroundColor3;
        int $dirty2;
        Modifier modifier3;
        int $dirty3;
        FloatingActionButtonElevation elevation3;
        Shape shape5;
        long backgroundColor4;
        int i3;
        MutableInteractionSource interactionSource4;
        Composer $composer3 = $composer.startRestartGroup(1028985328);
        ComposerKt.sourceInformation($composer3, "C(FloatingActionButton)P(6,5,4,7,0:c#ui.graphics.Color,2:c#ui.graphics.Color,3)99@4545L28,101@4633L419,93@4324L728:FloatingActionButton.kt#jmzs0o");
        int $dirty4 = $changed;
        if ((i & 1) != 0) {
            $dirty4 |= 6;
            function02 = function0;
        } else if (($changed & 6) == 0) {
            function02 = function0;
            $dirty4 |= $composer3.changedInstance(function02) ? 4 : 2;
        } else {
            function02 = function0;
        }
        int i4 = i & 2;
        if (i4 != 0) {
            $dirty4 |= 48;
        } else if (($changed & 48) == 0) {
            $dirty4 |= $composer3.changed(modifier) ? 32 : 16;
        }
        int i5 = i & 4;
        if (i5 != 0) {
            $dirty4 |= 384;
            interactionSource2 = interactionSource;
        } else if (($changed & 384) == 0) {
            interactionSource2 = interactionSource;
            $dirty4 |= $composer3.changed(interactionSource2) ? 256 : 128;
        } else {
            interactionSource2 = interactionSource;
        }
        if (($changed & 3072) == 0) {
            if ((i & 8) == 0) {
                shape2 = shape;
                int i6 = $composer3.changed(shape2) ? 2048 : 1024;
                $dirty4 |= i6;
            } else {
                shape2 = shape;
            }
            $dirty4 |= i6;
        } else {
            shape2 = shape;
        }
        if (($changed & 24576) == 0) {
            if ((i & 16) == 0) {
                j = backgroundColor;
                int i7 = $composer3.changed(j) ? 16384 : 8192;
                $dirty4 |= i7;
            } else {
                j = backgroundColor;
            }
            $dirty4 |= i7;
        } else {
            j = backgroundColor;
        }
        if ((196608 & $changed) == 0) {
            if ((i & 32) == 0) {
                contentColor2 = contentColor;
                int i8 = $composer3.changed(contentColor2) ? 131072 : 65536;
                $dirty4 |= i8;
            } else {
                contentColor2 = contentColor;
            }
            $dirty4 |= i8;
        } else {
            contentColor2 = contentColor;
        }
        if (($changed & JNINativeInterface.JNI_VERSION_24) == 0) {
            $dirty4 |= ((i & 64) == 0 && $composer3.changed(elevation)) ? 1048576 : 524288;
        }
        if ((i & 128) != 0) {
            $dirty4 |= User32.WS_CAPTION;
        } else if (($changed & User32.WS_CAPTION) == 0) {
            $dirty4 |= $composer3.changedInstance(function2) ? 8388608 : 4194304;
        }
        if ($composer3.shouldExecute((4793491 & $dirty4) != 4793490, $dirty4 & 1)) {
            $composer3.startDefaults();
            ComposerKt.sourceInformation($composer3, "85@3904L6,86@3992L6,87@4036L32,88@4146L11");
            if (($changed & 1) == 0 || $composer3.getDefaultsInvalid()) {
                Modifier.Companion modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier;
                MutableInteractionSource interactionSource5 = i5 != 0 ? null : interactionSource2;
                if ((i & 8) != 0) {
                    i2 = -458753;
                    $dirty4 &= -7169;
                    shape4 = MaterialTheme.INSTANCE.getShapes($composer3, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                } else {
                    i2 = -458753;
                    shape4 = shape2;
                }
                if ((i & 16) != 0) {
                    $dirty = $dirty4 & (-57345);
                    backgroundColor3 = MaterialTheme.INSTANCE.getColors($composer3, 6).m1621getSecondary0d7_KjU();
                } else {
                    $dirty = $dirty4;
                    backgroundColor3 = j;
                }
                if ((i & 32) != 0) {
                    contentColor2 = ColorsKt.m1637contentColorForek8zF_U(backgroundColor3, $composer3, ($dirty >> 12) & 14);
                    $dirty2 = $dirty & i2;
                } else {
                    $dirty2 = $dirty;
                }
                if ((i & 64) != 0) {
                    $dirty3 = $dirty2 & (-3670017);
                    interactionSource2 = interactionSource5;
                    shape5 = shape4;
                    backgroundColor4 = backgroundColor3;
                    i3 = 1028985328;
                    elevation3 = FloatingActionButtonDefaults.INSTANCE.m1704elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, $composer3, 24576, 15);
                    modifier3 = modifier4;
                } else {
                    long backgroundColor5 = backgroundColor3;
                    modifier3 = modifier4;
                    $dirty3 = $dirty2;
                    elevation3 = elevation;
                    interactionSource2 = interactionSource5;
                    shape5 = shape4;
                    backgroundColor4 = backgroundColor5;
                    i3 = 1028985328;
                }
            } else {
                $composer3.skipToGroupEnd();
                if ((i & 8) != 0) {
                    $dirty4 &= -7169;
                }
                if ((i & 16) != 0) {
                    $dirty4 &= -57345;
                }
                if ((i & 32) != 0) {
                    $dirty4 &= -458753;
                }
                if ((i & 64) != 0) {
                    int i9 = $dirty4 & (-3670017);
                    modifier3 = modifier;
                    elevation3 = elevation;
                    shape5 = shape2;
                    backgroundColor4 = j;
                    i3 = 1028985328;
                    $dirty3 = i9;
                } else {
                    elevation3 = elevation;
                    shape5 = shape2;
                    backgroundColor4 = j;
                    i3 = 1028985328;
                    $dirty3 = $dirty4;
                    modifier3 = modifier;
                }
            }
            $composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(i3, $dirty3, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:90)");
            }
            if (interactionSource2 == null) {
                $composer3.startReplaceGroup(-1991740377);
                ComposerKt.sourceInformation($composer3, "92@4280L39");
                ComposerKt.sourceInformationMarkerStart($composer3, 628486971, "CC(remember):FloatingActionButton.kt#9igjgp");
                Object it$iv = $composer3.rememberedValue();
                if (it$iv == Composer.INSTANCE.getEmpty()) {
                    Object value$iv = InteractionSourceKt.MutableInteractionSource();
                    $composer3.updateRememberedValue(value$iv);
                    it$iv = value$iv;
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endReplaceGroup();
                interactionSource4 = (MutableInteractionSource) it$iv;
            } else {
                $composer3.startReplaceGroup(628486320);
                $composer3.endReplaceGroup();
                interactionSource4 = interactionSource2;
            }
            long contentColor4 = contentColor2;
            $composer2 = $composer3;
            SurfaceKt.m1804SurfaceLPr_se0(function02, SemanticsModifierKt.semantics$default(modifier3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver $this$semantics) {
                    SemanticsPropertiesKt.m6242setRolekuIjeqM($this$semantics, Role.INSTANCE.m6223getButtono7Vup1c());
                }
            }, 1, null), false, shape5, backgroundColor4, contentColor4, null, elevation3.elevation(interactionSource4, $composer3, ($dirty3 >> 15) & 112).getValue().m7032unboximpl(), interactionSource4, ComposableLambdaKt.rememberComposableLambda(1972871863, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
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
                    ComposerKt.sourceInformation($composer4, "C102@4715L331,102@4643L403:FloatingActionButton.kt#jmzs0o");
                    if (!$composer4.shouldExecute(($changed2 & 3) != 2, $changed2 & 1)) {
                        $composer4.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1972871863, $changed2, -1, "androidx.compose.material.FloatingActionButton.<anonymous> (FloatingActionButton.kt:102)");
                    }
                    ProvidedValue<Float> providedValueProvides = ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m4392getAlphaimpl(contentColor2)));
                    final Function2<Composer, Integer, Unit> function22 = function2;
                    CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.rememberComposableLambda(1867794295, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2.1
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
                            ComposerKt.sourceInformation($composer5, "C103@4760L10,103@4779L257,103@4729L307:FloatingActionButton.kt#jmzs0o");
                            if (!$composer5.shouldExecute(($changed3 & 3) != 2, $changed3 & 1)) {
                                $composer5.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1867794295, $changed3, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:103)");
                            }
                            TextStyle button = MaterialTheme.INSTANCE.getTypography($composer5, 6).getButton();
                            final Function2<Composer, Integer, Unit> function23 = function22;
                            TextKt.ProvideTextStyle(button, ComposableLambdaKt.rememberComposableLambda(-1567914264, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.2.1.1
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
                                    Function0 factory$iv$iv$iv;
                                    ComposerKt.sourceInformation($composer6, "C104@4797L225:FloatingActionButton.kt#jmzs0o");
                                    if ($composer6.shouldExecute(($changed4 & 3) != 2, $changed4 & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1567914264, $changed4, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:104)");
                                        }
                                        Modifier modifier$iv = SizeKt.m769defaultMinSizeVpY3zN4(Modifier.INSTANCE, FloatingActionButtonKt.FabSize, FloatingActionButtonKt.FabSize);
                                        Alignment contentAlignment$iv = Alignment.INSTANCE.getCenter();
                                        Function2<Composer, Integer, Unit> function24 = function23;
                                        ComposerKt.sourceInformationMarkerStart($composer6, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
                                        int $changed$iv$iv = (54 << 3) & 112;
                                        ComposerKt.sourceInformationMarkerStart($composer6, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer6, 0);
                                        CompositionLocalMap localMap$iv$iv = $composer6.getCurrentCompositionLocalMap();
                                        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer6, modifier$iv);
                                        Function0 factory$iv$iv$iv2 = ComposeUiNode.INSTANCE.getConstructor();
                                        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & User32.WM_PENWINFIRST) | 6;
                                        ComposerKt.sourceInformationMarkerStart($composer6, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                        if (!($composer6.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        $composer6.startReusableNode();
                                        if ($composer6.getInserting()) {
                                            factory$iv$iv$iv = factory$iv$iv$iv2;
                                            $composer6.createNode(factory$iv$iv$iv);
                                        } else {
                                            factory$iv$iv$iv = factory$iv$iv$iv2;
                                            $composer6.useNode();
                                        }
                                        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3832constructorimpl($composer6);
                                        Updater.m3839setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3839setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2 block$iv$iv$iv = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() || !Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
                                            $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
                                            $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
                                        }
                                        Updater.m3839setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
                                        int i10 = ($changed$iv$iv$iv >> 6) & 14;
                                        ComposerKt.sourceInformationMarkerStart($composer6, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        int i11 = ((54 >> 6) & 112) | 6;
                                        ComposerKt.sourceInformationMarkerStart($composer6, -1042253398, "C108@4995L9:FloatingActionButton.kt#jmzs0o");
                                        function24.invoke($composer6, 0);
                                        ComposerKt.sourceInformationMarkerEnd($composer6);
                                        ComposerKt.sourceInformationMarkerEnd($composer6);
                                        $composer6.endNode();
                                        ComposerKt.sourceInformationMarkerEnd($composer6);
                                        ComposerKt.sourceInformationMarkerEnd($composer6);
                                        ComposerKt.sourceInformationMarkerEnd($composer6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    $composer6.skipToGroupEnd();
                                }
                            }, $composer5, 54), $composer5, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, $composer4, 54), $composer4, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, $composer3, 54), $composer2, ($dirty3 & 14) | LZMA2Options.DICT_SIZE_MAX | ($dirty3 & GL11.GL_RENDER) | (57344 & $dirty3) | (458752 & $dirty3), 68);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            elevation2 = elevation3;
            interactionSource3 = interactionSource2;
            shape3 = shape5;
            backgroundColor2 = backgroundColor4;
            contentColor3 = contentColor4;
            modifier2 = modifier3;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier2 = modifier;
            interactionSource3 = interactionSource2;
            shape3 = shape2;
            backgroundColor2 = j;
            contentColor3 = contentColor2;
            elevation2 = elevation;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3
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
                    FloatingActionButtonKt.m1708FloatingActionButtonbogVsAg(function0, modifier2, interactionSource3, shape3, backgroundColor2, contentColor3, elevation2, function2, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), i);
                }
            });
        }
    }

    /* renamed from: ExtendedFloatingActionButton-wqdebIU, reason: not valid java name */
    public static final void m1707ExtendedFloatingActionButtonwqdebIU(final Function2<? super Composer, ? super Integer, Unit> function2, final Function0<Unit> function0, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, MutableInteractionSource interactionSource, Shape shape, long backgroundColor, long contentColor, FloatingActionButtonElevation elevation, Composer $composer, final int $changed, final int i) {
        Function0<Unit> function02;
        Modifier modifier2;
        final Function2 icon;
        MutableInteractionSource interactionSource2;
        Shape shape2;
        final FloatingActionButtonElevation elevation2;
        Composer $composer2;
        final Modifier modifier3;
        final Function2 icon2;
        final MutableInteractionSource interactionSource3;
        final Shape shape3;
        final long backgroundColor2;
        final long contentColor2;
        int $dirty;
        long backgroundColor3;
        long contentColor3;
        Composer $composer3;
        MutableInteractionSource interactionSource4;
        FloatingActionButtonElevation elevation3;
        long contentColor4;
        long contentColor5;
        int $dirty2;
        Shape shape4;
        Composer $composer4 = $composer.startRestartGroup(-1555720195);
        ComposerKt.sourceInformation($composer4, "C(ExtendedFloatingActionButton)P(8,6,5,3,4,7,0:c#ui.graphics.Color,1:c#ui.graphics.Color)168@7877L441,160@7549L769:FloatingActionButton.kt#jmzs0o");
        int $dirty3 = $changed;
        if ((i & 1) != 0) {
            $dirty3 |= 6;
        } else if (($changed & 6) == 0) {
            $dirty3 |= $composer4.changedInstance(function2) ? 4 : 2;
        }
        if ((i & 2) != 0) {
            $dirty3 |= 48;
            function02 = function0;
        } else if (($changed & 48) == 0) {
            function02 = function0;
            $dirty3 |= $composer4.changedInstance(function02) ? 32 : 16;
        } else {
            function02 = function0;
        }
        int i2 = i & 4;
        if (i2 != 0) {
            $dirty3 |= 384;
            modifier2 = modifier;
        } else if (($changed & 384) == 0) {
            modifier2 = modifier;
            $dirty3 |= $composer4.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        int i3 = i & 8;
        if (i3 != 0) {
            $dirty3 |= 3072;
            icon = function22;
        } else if (($changed & 3072) == 0) {
            icon = function22;
            $dirty3 |= $composer4.changedInstance(icon) ? 2048 : 1024;
        } else {
            icon = function22;
        }
        int i4 = i & 16;
        if (i4 != 0) {
            $dirty3 |= 24576;
            interactionSource2 = interactionSource;
        } else if (($changed & 24576) == 0) {
            interactionSource2 = interactionSource;
            $dirty3 |= $composer4.changed(interactionSource2) ? 16384 : 8192;
        } else {
            interactionSource2 = interactionSource;
        }
        if ((196608 & $changed) == 0) {
            if ((i & 32) == 0) {
                shape2 = shape;
                int i5 = $composer4.changed(shape2) ? 131072 : 65536;
                $dirty3 |= i5;
            } else {
                shape2 = shape;
            }
            $dirty3 |= i5;
        } else {
            shape2 = shape;
        }
        if ((1572864 & $changed) == 0) {
            $dirty3 |= ((i & 64) == 0 && $composer4.changed(backgroundColor)) ? 1048576 : 524288;
        }
        if (($changed & User32.WS_CAPTION) == 0) {
            $dirty3 |= ((i & 128) == 0 && $composer4.changed(contentColor)) ? 8388608 : 4194304;
        }
        if ((100663296 & $changed) == 0) {
            if ((i & 256) == 0) {
                elevation2 = elevation;
                int i6 = $composer4.changed(elevation2) ? 67108864 : 33554432;
                $dirty3 |= i6;
            } else {
                elevation2 = elevation;
            }
            $dirty3 |= i6;
        } else {
            elevation2 = elevation;
        }
        if ($composer4.shouldExecute(($dirty3 & 38347923) != 38347922, $dirty3 & 1)) {
            $composer4.startDefaults();
            ComposerKt.sourceInformation($composer4, "155@7287L6,156@7375L6,157@7419L32,158@7529L11");
            if (($changed & 1) != 0 && !$composer4.getDefaultsInvalid()) {
                $composer4.skipToGroupEnd();
                if ((i & 32) != 0) {
                    $dirty3 &= -458753;
                }
                if ((i & 64) != 0) {
                    $dirty3 &= -3670017;
                }
                if ((i & 128) != 0) {
                    $dirty3 &= -29360129;
                }
                if ((i & 256) != 0) {
                    contentColor5 = backgroundColor;
                    contentColor4 = contentColor;
                    $dirty3 &= -234881025;
                    $composer3 = $composer4;
                    interactionSource4 = interactionSource2;
                    elevation3 = elevation2;
                    $dirty2 = 12582912;
                    shape4 = shape2;
                } else {
                    contentColor5 = backgroundColor;
                    contentColor4 = contentColor;
                    $composer3 = $composer4;
                    interactionSource4 = interactionSource2;
                    elevation3 = elevation2;
                    $dirty2 = 12582912;
                    shape4 = shape2;
                }
            } else {
                if (i2 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i3 != 0) {
                    icon = null;
                }
                if (i4 != 0) {
                    interactionSource2 = null;
                }
                if ((i & 32) != 0) {
                    $dirty3 &= -458753;
                    shape2 = MaterialTheme.INSTANCE.getShapes($composer4, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                }
                if ((i & 64) == 0) {
                    $dirty = $dirty3;
                    backgroundColor3 = backgroundColor;
                } else {
                    $dirty = $dirty3 & (-3670017);
                    backgroundColor3 = MaterialTheme.INSTANCE.getColors($composer4, 6).m1621getSecondary0d7_KjU();
                }
                if ((i & 128) == 0) {
                    contentColor3 = contentColor;
                } else {
                    contentColor3 = ColorsKt.m1637contentColorForek8zF_U(backgroundColor3, $composer4, ($dirty >> 18) & 14);
                    $dirty &= -29360129;
                }
                if ((i & 256) == 0) {
                    $composer3 = $composer4;
                    interactionSource4 = interactionSource2;
                    elevation3 = elevation2;
                    contentColor4 = contentColor3;
                    contentColor5 = backgroundColor3;
                    $dirty3 = $dirty;
                    $dirty2 = 12582912;
                    shape4 = shape2;
                } else {
                    $composer3 = $composer4;
                    elevation3 = FloatingActionButtonDefaults.INSTANCE.m1704elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, $composer4, 24576, 15);
                    interactionSource4 = interactionSource2;
                    contentColor4 = contentColor3;
                    contentColor5 = backgroundColor3;
                    $dirty3 = $dirty & (-234881025);
                    $dirty2 = 12582912;
                    shape4 = shape2;
                }
            }
            $composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1555720195, $dirty3, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:159)");
            }
            $composer2 = $composer3;
            m1708FloatingActionButtonbogVsAg(function02, SizeKt.m789sizeInqDBjuR0$default(modifier2, ExtendedFabSize, ExtendedFabSize, 0.0f, 0.0f, 12, null), interactionSource4, shape4, contentColor5, contentColor4, elevation3, ComposableLambdaKt.rememberComposableLambda(1418981691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$1
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

                public final void invoke(Composer $composer5, int $changed2) {
                    Function0 factory$iv$iv$iv;
                    ComposerKt.sourceInformation($composer5, "C170@7983L329:FloatingActionButton.kt#jmzs0o");
                    if ($composer5.shouldExecute(($changed2 & 3) != 2, $changed2 & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1418981691, $changed2, -1, "androidx.compose.material.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:169)");
                        }
                        float startPadding = icon == null ? FloatingActionButtonKt.ExtendedFabTextPadding : FloatingActionButtonKt.ExtendedFabIconPadding;
                        Modifier modifier$iv = PaddingKt.m742paddingqDBjuR0$default(Modifier.INSTANCE, startPadding, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                        Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
                        Function2<Composer, Integer, Unit> function23 = icon;
                        Function2<Composer, Integer, Unit> function24 = function2;
                        ComposerKt.sourceInformationMarkerStart($composer5, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getStart();
                        MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer5, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                        int $changed$iv$iv = (384 << 3) & 112;
                        ComposerKt.sourceInformationMarkerStart($composer5, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer5, 0);
                        CompositionLocalMap localMap$iv$iv = $composer5.getCurrentCompositionLocalMap();
                        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer5, modifier$iv);
                        Function0 factory$iv$iv$iv2 = ComposeUiNode.INSTANCE.getConstructor();
                        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & User32.WM_PENWINFIRST) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer5, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer5.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        $composer5.startReusableNode();
                        if ($composer5.getInserting()) {
                            factory$iv$iv$iv = factory$iv$iv$iv2;
                            $composer5.createNode(factory$iv$iv$iv);
                        } else {
                            factory$iv$iv$iv = factory$iv$iv$iv2;
                            $composer5.useNode();
                        }
                        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3832constructorimpl($composer5);
                        Updater.m3839setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3839setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 block$iv$iv$iv = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() || !Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
                            $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
                            $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
                        }
                        Updater.m3839setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
                        int i7 = ($changed$iv$iv$iv >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer5, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        int i8 = ((384 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer5, -565234578, "C178@8296L6:FloatingActionButton.kt#jmzs0o");
                        if (function23 != null) {
                            $composer5.startReplaceGroup(-565217870);
                            ComposerKt.sourceInformation($composer5, "175@8200L6,176@8223L46");
                            function23.invoke($composer5, 0);
                            SpacerKt.Spacer(SizeKt.m790width3ABfNKs(Modifier.INSTANCE, FloatingActionButtonKt.ExtendedFabIconPadding), $composer5, 6);
                            $composer5.endReplaceGroup();
                        } else {
                            $composer5.startReplaceGroup(-565120809);
                            $composer5.endReplaceGroup();
                        }
                        function24.invoke($composer5, 0);
                        ComposerKt.sourceInformationMarkerEnd($composer5);
                        ComposerKt.sourceInformationMarkerEnd($composer5);
                        $composer5.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer5);
                        ComposerKt.sourceInformationMarkerEnd($composer5);
                        ComposerKt.sourceInformationMarkerEnd($composer5);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    $composer5.skipToGroupEnd();
                }
            }, $composer3, 54), $composer2, $dirty2 | (($dirty3 >> 3) & 14) | (($dirty3 >> 6) & User32.WM_PENWINFIRST) | (($dirty3 >> 6) & GL11.GL_RENDER) | (($dirty3 >> 6) & 57344) | (($dirty3 >> 6) & 458752) | (($dirty3 >> 6) & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            icon2 = icon;
            interactionSource3 = interactionSource4;
            shape3 = shape4;
            backgroundColor2 = contentColor5;
            contentColor2 = contentColor4;
            elevation2 = elevation3;
        } else {
            $composer2 = $composer4;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
            icon2 = icon;
            interactionSource3 = interactionSource2;
            shape3 = shape2;
            backgroundColor2 = backgroundColor;
            contentColor2 = contentColor;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
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

                public final void invoke(Composer composer, int i7) {
                    FloatingActionButtonKt.m1707ExtendedFloatingActionButtonwqdebIU(function2, function0, modifier3, icon2, interactionSource3, shape3, backgroundColor2, contentColor2, elevation2, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), i);
                }
            });
        }
    }
}
