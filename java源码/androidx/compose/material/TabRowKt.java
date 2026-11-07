package androidx.compose.material;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.jni.JNINativeInterface;
import org.lwjgl.system.windows.User32;

/* compiled from: TabRow.kt */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a©\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000123\b\u0002\u0010\u0010\u001a-\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00070\u0011¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\u0018\b\u0002\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u001a¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u001a¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u009f\u0001\u0010\u001e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r23\b\u0002\u0010\u0010\u001a-\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00070\u0011¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\u0018\b\u0002\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u001a¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u001a¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"ScrollableTabRowMinimumTabWidth", "Landroidx/compose/ui/unit/Dp;", "F", "ScrollableTabRowScrollSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "ScrollableTabRow", "", "selectedTabIndex", "", "modifier", "Landroidx/compose/ui/Modifier;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "edgePadding", "indicator", "Lkotlin/Function1;", "", "Landroidx/compose/material/TabPosition;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "tabPositions", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/UiComposable;", "divider", "Lkotlin/Function0;", "tabs", "ScrollableTabRow-sKfQg0A", "(ILandroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TabRow", "TabRow-pAZo6Ak", "(ILandroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TabRowKt {
    private static final float ScrollableTabRowMinimumTabWidth = Dp.m7018constructorimpl(90);
    private static final AnimationSpec<Float> ScrollableTabRowScrollSpec = AnimationSpecKt.tween$default(250, 0, EasingKt.getFastOutSlowInEasing(), 2, null);

    /* renamed from: TabRow-pAZo6Ak, reason: not valid java name */
    public static final void m1834TabRowpAZo6Ak(final int selectedTabIndex, Modifier modifier, long backgroundColor, long contentColor, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer $composer, final int $changed, final int i) {
        long j;
        long j2;
        Function3 indicator;
        Function2 function23;
        Composer $composer2;
        final long backgroundColor2;
        final long contentColor2;
        final Modifier modifier2;
        final Function3 indicator2;
        final Function2 divider;
        long backgroundColor3;
        long contentColor3;
        Modifier modifier3;
        int $dirty;
        final Function3 indicator3;
        long backgroundColor4;
        Modifier modifier4;
        final Function2 divider2;
        long contentColor4;
        boolean z;
        Composer $composer3 = $composer.startRestartGroup(-249175289);
        ComposerKt.sourceInformation($composer3, "C(TabRow)P(5,4,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3)150@7337L1392,146@7206L1523:TabRow.kt#jmzs0o");
        int $dirty2 = $changed;
        if ((i & 1) != 0) {
            $dirty2 |= 6;
        } else if (($changed & 6) == 0) {
            $dirty2 |= $composer3.changed(selectedTabIndex) ? 4 : 2;
        }
        int i2 = i & 2;
        if (i2 != 0) {
            $dirty2 |= 48;
        } else if (($changed & 48) == 0) {
            $dirty2 |= $composer3.changed(modifier) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            if ((i & 4) == 0) {
                j = backgroundColor;
                int i3 = $composer3.changed(j) ? 256 : 128;
                $dirty2 |= i3;
            } else {
                j = backgroundColor;
            }
            $dirty2 |= i3;
        } else {
            j = backgroundColor;
        }
        if (($changed & 3072) == 0) {
            if ((i & 8) == 0) {
                j2 = contentColor;
                int i4 = $composer3.changed(j2) ? 2048 : 1024;
                $dirty2 |= i4;
            } else {
                j2 = contentColor;
            }
            $dirty2 |= i4;
        } else {
            j2 = contentColor;
        }
        int i5 = i & 16;
        if (i5 != 0) {
            $dirty2 |= 24576;
            indicator = function3;
        } else if (($changed & 24576) == 0) {
            indicator = function3;
            $dirty2 |= $composer3.changedInstance(indicator) ? 16384 : 8192;
        } else {
            indicator = function3;
        }
        int i6 = i & 32;
        if (i6 != 0) {
            $dirty2 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            function23 = function2;
        } else if ((196608 & $changed) == 0) {
            function23 = function2;
            $dirty2 |= $composer3.changedInstance(function23) ? 131072 : 65536;
        } else {
            function23 = function2;
        }
        if ((i & 64) != 0) {
            $dirty2 |= JNINativeInterface.JNI_VERSION_24;
        } else if (($changed & JNINativeInterface.JNI_VERSION_24) == 0) {
            $dirty2 |= $composer3.changedInstance(function22) ? 1048576 : 524288;
        }
        if ($composer3.shouldExecute(($dirty2 & 599187) != 599186, $dirty2 & 1)) {
            $composer3.startDefaults();
            ComposerKt.sourceInformation($composer3, "137@6742L6,138@6791L32,140@6930L125");
            if (($changed & 1) == 0 || $composer3.getDefaultsInvalid()) {
                Modifier.Companion modifier5 = i2 != 0 ? Modifier.INSTANCE : modifier;
                if ((i & 4) != 0) {
                    backgroundColor3 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors($composer3, 6));
                    $dirty2 &= -897;
                } else {
                    backgroundColor3 = j;
                }
                if ((i & 8) != 0) {
                    contentColor3 = ColorsKt.m1637contentColorForek8zF_U(backgroundColor3, $composer3, ($dirty2 >> 6) & 14);
                    $dirty2 &= -7169;
                } else {
                    contentColor3 = j2;
                }
                if (i5 != 0) {
                    modifier3 = modifier5;
                    indicator = ComposableLambdaKt.rememberComposableLambda(-553782708, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer, Integer num) {
                            invoke((List<TabPosition>) list, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(List<TabPosition> list, Composer $composer4, int $changed2) {
                            ComposerKt.sourceInformation($composer4, "C141@6975L70:TabRow.kt#jmzs0o");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-553782708, $changed2, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:141)");
                            }
                            TabRowDefaults.INSTANCE.m1828Indicator9IZ8Weo(TabRowDefaults.INSTANCE.tabIndicatorOffset(Modifier.INSTANCE, list.get(selectedTabIndex)), 0.0f, 0L, $composer4, 3072, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, $composer3, 54);
                } else {
                    modifier3 = modifier5;
                }
                if (i6 != 0) {
                    $dirty = $dirty2;
                    indicator3 = indicator;
                    backgroundColor4 = backgroundColor3;
                    divider2 = ComposableSingletons$TabRowKt.INSTANCE.m1657getLambda1$material_release();
                    contentColor4 = contentColor3;
                    z = true;
                    modifier4 = modifier3;
                } else {
                    $dirty = $dirty2;
                    indicator3 = indicator;
                    backgroundColor4 = backgroundColor3;
                    modifier4 = modifier3;
                    divider2 = function23;
                    contentColor4 = contentColor3;
                    z = true;
                }
            } else {
                $composer3.skipToGroupEnd();
                if ((i & 4) != 0) {
                    $dirty2 &= -897;
                }
                if ((i & 8) != 0) {
                    $dirty = $dirty2 & (-7169);
                    indicator3 = indicator;
                    divider2 = function23;
                    modifier4 = modifier;
                    backgroundColor4 = j;
                    contentColor4 = j2;
                    z = true;
                } else {
                    modifier4 = modifier;
                    $dirty = $dirty2;
                    indicator3 = indicator;
                    divider2 = function23;
                    backgroundColor4 = j;
                    contentColor4 = j2;
                    z = true;
                }
            }
            $composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-249175289, $dirty, -1, "androidx.compose.material.TabRow (TabRow.kt:145)");
            }
            $composer2 = $composer3;
            SurfaceKt.m1803SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier4), null, backgroundColor4, contentColor4, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1961746365, z, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2
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
                    ComposerKt.sourceInformation($composer4, "C151@7389L1334,151@7347L1376:TabRow.kt#jmzs0o");
                    if (!$composer4.shouldExecute(($changed2 & 3) != 2, $changed2 & 1)) {
                        $composer4.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1961746365, $changed2, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:151)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    ComposerKt.sourceInformationMarkerStart($composer4, 463606016, "CC(remember):TabRow.kt#9igjgp");
                    boolean invalid$iv = $composer4.changed(function22) | $composer4.changed(divider2) | $composer4.changed(indicator3);
                    final Function2<Composer, Integer, Unit> function24 = function22;
                    final Function2<Composer, Integer, Unit> function25 = divider2;
                    final Function3<List<TabPosition>, Composer, Integer, Unit> function32 = indicator3;
                    Object it$iv = $composer4.rememberedValue();
                    if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                        Object value$iv = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                return m1836invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                            }

                            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final MeasureResult m1836invoke0kLqBqw(final SubcomposeMeasureScope $this$SubcomposeLayout, final long constraints) {
                                Object maxElem$iv;
                                int tabRowWidth = Constraints.m6971getMaxWidthimpl(constraints);
                                List tabMeasurables = $this$SubcomposeLayout.subcompose(TabSlots.Tabs, function24);
                                int tabCount = tabMeasurables.size();
                                final int tabWidth = tabRowWidth / tabCount;
                                List $this$fastMap$iv = tabMeasurables;
                                List target$iv = new ArrayList($this$fastMap$iv.size());
                                List $this$fastForEach$iv$iv = $this$fastMap$iv;
                                int index$iv$iv = 0;
                                int size = $this$fastForEach$iv$iv.size();
                                while (index$iv$iv < size) {
                                    Object item$iv$iv = $this$fastForEach$iv$iv.get(index$iv$iv);
                                    Measurable it = (Measurable) item$iv$iv;
                                    int i7 = size;
                                    int index$iv$iv2 = index$iv$iv;
                                    int index$iv$iv3 = tabWidth;
                                    long jM6960copyZbe2FdA = Constraints.m6960copyZbe2FdA(constraints, (11 & 1) != 0 ? Constraints.m6973getMinWidthimpl(constraints) : index$iv$iv3, (11 & 2) != 0 ? Constraints.m6971getMaxWidthimpl(constraints) : tabWidth, (11 & 4) != 0 ? Constraints.m6972getMinHeightimpl(constraints) : 0, (11 & 8) != 0 ? Constraints.m6970getMaxHeightimpl(constraints) : 0);
                                    tabWidth = index$iv$iv3;
                                    target$iv.add(it.mo5750measureBRTryo0(jM6960copyZbe2FdA));
                                    index$iv$iv = index$iv$iv2 + 1;
                                    $this$fastForEach$iv$iv = $this$fastForEach$iv$iv;
                                    size = i7;
                                    $this$fastMap$iv = $this$fastMap$iv;
                                    tabRowWidth = tabRowWidth;
                                }
                                final int tabRowWidth2 = tabRowWidth;
                                final List tabPlaceables = target$iv;
                                if (tabPlaceables.isEmpty()) {
                                    maxElem$iv = null;
                                } else {
                                    maxElem$iv = tabPlaceables.get(0);
                                    Placeable it2 = (Placeable) maxElem$iv;
                                    int maxValue$iv = it2.getHeight();
                                    int i$iv = 1;
                                    int lastIndex = CollectionsKt.getLastIndex(tabPlaceables);
                                    if (1 <= lastIndex) {
                                        while (true) {
                                            Object e$iv = tabPlaceables.get(i$iv);
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
                                int tabRowHeight = placeable != null ? placeable.getHeight() : 0;
                                ArrayList arrayList = new ArrayList(tabCount);
                                for (int i8 = 0; i8 < tabCount; i8++) {
                                    int index = i8;
                                    float arg0$iv = $this$SubcomposeLayout.mo386toDpu2uoSUM(tabWidth);
                                    arrayList.add(new TabPosition(Dp.m7018constructorimpl(index * arg0$iv), $this$SubcomposeLayout.mo386toDpu2uoSUM(tabWidth), null));
                                }
                                final ArrayList tabPositions = arrayList;
                                final int tabRowHeight2 = tabRowHeight;
                                final Function2<Composer, Integer, Unit> function26 = function25;
                                final Function3<List<TabPosition>, Composer, Integer, Unit> function33 = function32;
                                return MeasureScope.layout$default($this$SubcomposeLayout, tabRowWidth2, tabRowHeight2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1.1
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
                                        List $this$fastForEachIndexed$iv = tabPlaceables;
                                        int i9 = tabWidth;
                                        int size2 = $this$fastForEachIndexed$iv.size();
                                        for (int index$iv = 0; index$iv < size2; index$iv++) {
                                            Object item$iv = $this$fastForEachIndexed$iv.get(index$iv);
                                            int index2 = index$iv;
                                            Placeable.PlacementScope.placeRelative$default($this$layout, (Placeable) item$iv, index2 * i9, 0, 0.0f, 4, null);
                                        }
                                        List $this$fastForEach$iv = $this$SubcomposeLayout.subcompose(TabSlots.Divider, function26);
                                        long j3 = constraints;
                                        int i10 = tabRowHeight2;
                                        int size3 = $this$fastForEach$iv.size();
                                        for (int index$iv2 = 0; index$iv2 < size3; index$iv2++) {
                                            Object item$iv2 = $this$fastForEach$iv.get(index$iv2);
                                            Measurable it4 = (Measurable) item$iv2;
                                            Placeable placeable2 = it4.mo5750measureBRTryo0(Constraints.m6960copyZbe2FdA(j3, (11 & 1) != 0 ? Constraints.m6973getMinWidthimpl(j3) : 0, (11 & 2) != 0 ? Constraints.m6971getMaxWidthimpl(j3) : 0, (11 & 4) != 0 ? Constraints.m6972getMinHeightimpl(j3) : 0, (11 & 8) != 0 ? Constraints.m6970getMaxHeightimpl(j3) : 0));
                                            Placeable.PlacementScope.placeRelative$default($this$layout, placeable2, 0, i10 - placeable2.getHeight(), 0.0f, 4, null);
                                        }
                                        SubcomposeMeasureScope subcomposeMeasureScope = $this$SubcomposeLayout;
                                        TabSlots tabSlots = TabSlots.Indicator;
                                        final Function3<List<TabPosition>, Composer, Integer, Unit> function34 = function33;
                                        final List<TabPosition> list = tabPositions;
                                        List $this$fastForEach$iv2 = subcomposeMeasureScope.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-641946361, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.TabRow.2.1.1.1.3
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
                                                ComposerKt.sourceInformation($composer5, "C176@8516L23:TabRow.kt#jmzs0o");
                                                if (!$composer5.shouldExecute(($changed3 & 3) != 2, $changed3 & 1)) {
                                                    $composer5.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-641946361, $changed3, -1, "androidx.compose.material.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:176)");
                                                }
                                                function34.invoke(list, $composer5, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }));
                                        int i11 = tabRowWidth2;
                                        int i12 = tabRowHeight2;
                                        int size4 = $this$fastForEach$iv2.size();
                                        for (int index$iv3 = 0; index$iv3 < size4; index$iv3++) {
                                            Object item$iv3 = $this$fastForEach$iv2.get(index$iv3);
                                            Measurable it5 = (Measurable) item$iv3;
                                            Placeable.PlacementScope.placeRelative$default($this$layout, it5.mo5750measureBRTryo0(Constraints.INSTANCE.m6981fixedJhjzzOo(i11, i12)), 0, 0, 0.0f, 4, null);
                                        }
                                    }
                                }, 4, null);
                            }
                        };
                        $composer4.updateRememberedValue(value$iv);
                        it$iv = value$iv;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer4);
                    SubcomposeLayoutKt.SubcomposeLayout(modifierFillMaxWidth$default, (Function2) it$iv, $composer4, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, $composer3, 54), $composer2, ($dirty & User32.WM_PENWINFIRST) | JNINativeInterface.JNI_VERSION_24 | ($dirty & GL11.GL_RENDER), 50);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
            indicator2 = indicator3;
            divider = divider2;
            backgroundColor2 = backgroundColor4;
            contentColor2 = contentColor4;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            backgroundColor2 = j;
            contentColor2 = j2;
            modifier2 = modifier;
            indicator2 = indicator;
            divider = function23;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$3
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
                    TabRowKt.m1834TabRowpAZo6Ak(selectedTabIndex, modifier2, backgroundColor2, contentColor2, indicator2, divider, function22, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), i);
                }
            });
        }
    }

    /* renamed from: ScrollableTabRow-sKfQg0A, reason: not valid java name */
    public static final void m1833ScrollableTabRowsKfQg0A(final int selectedTabIndex, Modifier modifier, long backgroundColor, long contentColor, float edgePadding, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer $composer, final int $changed, final int i) {
        long j;
        long j2;
        float f;
        Function3 function32;
        Composer $composer2;
        final long backgroundColor2;
        final float edgePadding2;
        final Modifier modifier2;
        final long contentColor2;
        final Function3 indicator;
        final Function2 divider;
        long backgroundColor3;
        long contentColor3;
        float edgePadding3;
        Function3 indicator2;
        Function2 divider2;
        Modifier modifier3;
        long backgroundColor4;
        int i2;
        int i3;
        long contentColor4;
        Composer $composer3 = $composer.startRestartGroup(-1473476840);
        ComposerKt.sourceInformation($composer3, "C(ScrollableTabRow)P(6,5,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3:c#ui.unit.Dp,4)237@11978L2927,237@11895L3010:TabRow.kt#jmzs0o");
        int $dirty = $changed;
        if ((i & 1) != 0) {
            $dirty |= 6;
        } else if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(selectedTabIndex) ? 4 : 2;
        }
        int i4 = i & 2;
        if (i4 != 0) {
            $dirty |= 48;
        } else if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(modifier) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            if ((i & 4) == 0) {
                j = backgroundColor;
                int i5 = $composer3.changed(j) ? 256 : 128;
                $dirty |= i5;
            } else {
                j = backgroundColor;
            }
            $dirty |= i5;
        } else {
            j = backgroundColor;
        }
        if (($changed & 3072) == 0) {
            if ((i & 8) == 0) {
                j2 = contentColor;
                int i6 = $composer3.changed(j2) ? 2048 : 1024;
                $dirty |= i6;
            } else {
                j2 = contentColor;
            }
            $dirty |= i6;
        } else {
            j2 = contentColor;
        }
        int i7 = i & 16;
        if (i7 != 0) {
            $dirty |= 24576;
            f = edgePadding;
        } else if (($changed & 24576) == 0) {
            f = edgePadding;
            $dirty |= $composer3.changed(f) ? 16384 : 8192;
        } else {
            f = edgePadding;
        }
        int i8 = i & 32;
        if (i8 != 0) {
            $dirty |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            function32 = function3;
        } else if ((196608 & $changed) == 0) {
            function32 = function3;
            $dirty |= $composer3.changedInstance(function32) ? 131072 : 65536;
        } else {
            function32 = function3;
        }
        int i9 = i & 64;
        if (i9 != 0) {
            $dirty |= JNINativeInterface.JNI_VERSION_24;
        } else if (($changed & JNINativeInterface.JNI_VERSION_24) == 0) {
            $dirty |= $composer3.changedInstance(function2) ? 1048576 : 524288;
        }
        if ((i & 128) != 0) {
            $dirty |= User32.WS_CAPTION;
        } else if (($changed & User32.WS_CAPTION) == 0) {
            $dirty |= $composer3.changedInstance(function22) ? 8388608 : 4194304;
        }
        if ($composer3.shouldExecute(($dirty & 4793491) != 4793490, $dirty & 1)) {
            $composer3.startDefaults();
            ComposerKt.sourceInformation($composer3, "227@11369L6,228@11418L32,231@11619L125");
            if (($changed & 1) == 0 || $composer3.getDefaultsInvalid()) {
                Modifier.Companion modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier;
                if ((i & 4) != 0) {
                    backgroundColor3 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors($composer3, 6));
                    $dirty &= -897;
                } else {
                    backgroundColor3 = j;
                }
                if ((i & 8) != 0) {
                    contentColor3 = ColorsKt.m1637contentColorForek8zF_U(backgroundColor3, $composer3, ($dirty >> 6) & 14);
                    $dirty &= -7169;
                } else {
                    contentColor3 = j2;
                }
                edgePadding3 = i7 != 0 ? TabRowDefaults.INSTANCE.m1831getScrollableTabRowPaddingD9Ej5fM() : f;
                indicator2 = i8 != 0 ? ComposableLambdaKt.rememberComposableLambda(-655609869, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer, Integer num) {
                        invoke((List<TabPosition>) list, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(List<TabPosition> list, Composer $composer4, int $changed2) {
                        ComposerKt.sourceInformation($composer4, "C232@11664L70:TabRow.kt#jmzs0o");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-655609869, $changed2, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:232)");
                        }
                        TabRowDefaults.INSTANCE.m1828Indicator9IZ8Weo(TabRowDefaults.INSTANCE.tabIndicatorOffset(Modifier.INSTANCE, list.get(selectedTabIndex)), 0.0f, 0L, $composer4, 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, $composer3, 54) : function32;
                if (i9 != 0) {
                    divider2 = ComposableSingletons$TabRowKt.INSTANCE.m1658getLambda2$material_release();
                    modifier3 = modifier4;
                    backgroundColor4 = backgroundColor3;
                    i2 = 1572864;
                    i3 = -1473476840;
                    contentColor4 = contentColor3;
                } else {
                    divider2 = function2;
                    modifier3 = modifier4;
                    backgroundColor4 = backgroundColor3;
                    i2 = 1572864;
                    i3 = -1473476840;
                    contentColor4 = contentColor3;
                }
            } else {
                $composer3.skipToGroupEnd();
                if ((i & 4) != 0) {
                    $dirty &= -897;
                }
                if ((i & 8) != 0) {
                    divider2 = function2;
                    $dirty &= -7169;
                    i2 = 1572864;
                    i3 = -1473476840;
                    contentColor4 = j2;
                    edgePadding3 = f;
                    indicator2 = function32;
                    modifier3 = modifier;
                    backgroundColor4 = j;
                } else {
                    divider2 = function2;
                    i2 = 1572864;
                    i3 = -1473476840;
                    contentColor4 = j2;
                    edgePadding3 = f;
                    indicator2 = function32;
                    modifier3 = modifier;
                    backgroundColor4 = j;
                }
            }
            $composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(i3, $dirty, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:236)");
            }
            final float edgePadding4 = edgePadding3;
            final Function3 indicator3 = indicator2;
            final Function2 divider3 = divider2;
            $composer2 = $composer3;
            SurfaceKt.m1803SurfaceFjzlyU(modifier3, null, backgroundColor4, contentColor4, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(1455860572, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
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
                    ComposerKt.sourceInformation($composer4, "C238@12006L21,239@12057L24,241@12126L147,250@12524L2375,244@12282L2617:TabRow.kt#jmzs0o");
                    if (!$composer4.shouldExecute(($changed2 & 3) != 2, $changed2 & 1)) {
                        $composer4.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1455860572, $changed2, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:238)");
                    }
                    ScrollState scrollState = ScrollKt.rememberScrollState(0, $composer4, 0, 1);
                    ComposerKt.sourceInformationMarkerStart($composer4, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
                    ComposerKt.sourceInformationMarkerStart($composer4, -954203484, "CC(remember):Effects.kt#9igjgp");
                    Object it$iv$iv = $composer4.rememberedValue();
                    if (it$iv$iv == Composer.INSTANCE.getEmpty()) {
                        Object value$iv$iv = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer4);
                        $composer4.updateRememberedValue(value$iv$iv);
                        it$iv$iv = value$iv$iv;
                    }
                    CoroutineScope coroutineScope = (CoroutineScope) it$iv$iv;
                    ComposerKt.sourceInformationMarkerEnd($composer4);
                    ComposerKt.sourceInformationMarkerEnd($composer4);
                    ComposerKt.sourceInformationMarkerStart($composer4, -1241506492, "CC(remember):TabRow.kt#9igjgp");
                    boolean invalid$iv = $composer4.changed(scrollState) | $composer4.changed(coroutineScope);
                    Object it$iv = $composer4.rememberedValue();
                    if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                        Object value$iv = new ScrollableTabData(scrollState, coroutineScope);
                        $composer4.updateRememberedValue(value$iv);
                        it$iv = value$iv;
                    }
                    final ScrollableTabData scrollableTabData = (ScrollableTabData) it$iv;
                    ComposerKt.sourceInformationMarkerEnd($composer4);
                    Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollState, false, null, false, 14, null)));
                    ComposerKt.sourceInformationMarkerStart($composer4, -1241491528, "CC(remember):TabRow.kt#9igjgp");
                    boolean invalid$iv2 = $composer4.changed(edgePadding4) | $composer4.changed(function22) | $composer4.changed(divider3) | $composer4.changed(indicator3) | $composer4.changedInstance(scrollableTabData) | $composer4.changed(selectedTabIndex);
                    final float f2 = edgePadding4;
                    final Function2<Composer, Integer, Unit> function23 = function22;
                    final Function2<Composer, Integer, Unit> function24 = divider3;
                    final int i10 = selectedTabIndex;
                    final Function3<List<TabPosition>, Composer, Integer, Unit> function33 = indicator3;
                    Object it$iv2 = $composer4.rememberedValue();
                    if (invalid$iv2 || it$iv2 == Composer.INSTANCE.getEmpty()) {
                        Object value$iv2 = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                return m1835invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                            }

                            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final MeasureResult m1835invoke0kLqBqw(final SubcomposeMeasureScope $this$SubcomposeLayout, final long constraints) {
                                int minTabWidth = $this$SubcomposeLayout.mo383roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                int padding = $this$SubcomposeLayout.mo383roundToPx0680j_4(f2);
                                long tabConstraints = Constraints.m6960copyZbe2FdA(constraints, (11 & 1) != 0 ? Constraints.m6973getMinWidthimpl(constraints) : minTabWidth, (11 & 2) != 0 ? Constraints.m6971getMaxWidthimpl(constraints) : 0, (11 & 4) != 0 ? Constraints.m6972getMinHeightimpl(constraints) : 0, (11 & 8) != 0 ? Constraints.m6970getMaxHeightimpl(constraints) : 0);
                                List $this$fastMap$iv = $this$SubcomposeLayout.subcompose(TabSlots.Tabs, function23);
                                List target$iv = new ArrayList($this$fastMap$iv.size());
                                int index$iv$iv = 0;
                                int size = $this$fastMap$iv.size();
                                while (index$iv$iv < size) {
                                    Object item$iv$iv = $this$fastMap$iv.get(index$iv$iv);
                                    target$iv.add(((Measurable) item$iv$iv).mo5750measureBRTryo0(tabConstraints));
                                    index$iv$iv++;
                                    $this$fastMap$iv = $this$fastMap$iv;
                                    padding = padding;
                                }
                                final int padding2 = padding;
                                final List tabPlaceables = target$iv;
                                final Ref.IntRef layoutWidth = new Ref.IntRef();
                                layoutWidth.element = padding2 * 2;
                                final Ref.IntRef layoutHeight = new Ref.IntRef();
                                List $this$fastForEach$iv = tabPlaceables;
                                int index$iv = 0;
                                int size2 = $this$fastForEach$iv.size();
                                while (index$iv < size2) {
                                    Object item$iv = $this$fastForEach$iv.get(index$iv);
                                    Placeable it = (Placeable) item$iv;
                                    layoutWidth.element += it.getWidth();
                                    layoutHeight.element = Math.max(layoutHeight.element, it.getHeight());
                                    index$iv++;
                                    $this$fastForEach$iv = $this$fastForEach$iv;
                                }
                                int i11 = layoutWidth.element;
                                int i12 = layoutHeight.element;
                                final Function2<Composer, Integer, Unit> function25 = function24;
                                final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                final int i13 = i10;
                                final Function3<List<TabPosition>, Composer, Integer, Unit> function34 = function33;
                                return MeasureScope.layout$default($this$SubcomposeLayout, i11, i12, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2$1$1.2
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
                                        final List tabPositions = new ArrayList();
                                        int left = padding2;
                                        List $this$fastForEach$iv2 = tabPlaceables;
                                        SubcomposeMeasureScope subcomposeMeasureScope = $this$SubcomposeLayout;
                                        int size3 = $this$fastForEach$iv2.size();
                                        int left2 = left;
                                        for (int index$iv2 = 0; index$iv2 < size3; index$iv2++) {
                                            Object item$iv2 = $this$fastForEach$iv2.get(index$iv2);
                                            Placeable it2 = (Placeable) item$iv2;
                                            Placeable.PlacementScope.placeRelative$default($this$layout, it2, left2, 0, 0.0f, 4, null);
                                            tabPositions.add(new TabPosition(subcomposeMeasureScope.mo386toDpu2uoSUM(left2), subcomposeMeasureScope.mo386toDpu2uoSUM(it2.getWidth()), null));
                                            left2 += it2.getWidth();
                                        }
                                        List $this$fastForEach$iv3 = $this$SubcomposeLayout.subcompose(TabSlots.Divider, function25);
                                        long j3 = constraints;
                                        Ref.IntRef intRef = layoutWidth;
                                        Ref.IntRef intRef2 = layoutHeight;
                                        int size4 = $this$fastForEach$iv3.size();
                                        for (int index$iv3 = 0; index$iv3 < size4; index$iv3++) {
                                            Object item$iv3 = $this$fastForEach$iv3.get(index$iv3);
                                            Measurable it3 = (Measurable) item$iv3;
                                            Placeable placeable = it3.mo5750measureBRTryo0(Constraints.m6960copyZbe2FdA(j3, (11 & 1) != 0 ? Constraints.m6973getMinWidthimpl(j3) : intRef.element, (11 & 2) != 0 ? Constraints.m6971getMaxWidthimpl(j3) : intRef.element, (11 & 4) != 0 ? Constraints.m6972getMinHeightimpl(j3) : 0, (11 & 8) != 0 ? Constraints.m6970getMaxHeightimpl(j3) : 0));
                                            Placeable.PlacementScope.placeRelative$default($this$layout, placeable, 0, intRef2.element - placeable.getHeight(), 0.0f, 4, null);
                                        }
                                        SubcomposeMeasureScope subcomposeMeasureScope2 = $this$SubcomposeLayout;
                                        TabSlots tabSlots = TabSlots.Indicator;
                                        final Function3<List<TabPosition>, Composer, Integer, Unit> function35 = function34;
                                        List $this$fastForEach$iv4 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-411868839, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.1.2.3
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
                                                ComposerKt.sourceInformation($composer5, "C292@14433L23:TabRow.kt#jmzs0o");
                                                if (!$composer5.shouldExecute(($changed3 & 3) != 2, $changed3 & 1)) {
                                                    $composer5.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-411868839, $changed3, -1, "androidx.compose.material.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:292)");
                                                }
                                                function35.invoke(tabPositions, $composer5, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }));
                                        Ref.IntRef intRef3 = layoutWidth;
                                        Ref.IntRef intRef4 = layoutHeight;
                                        int size5 = $this$fastForEach$iv4.size();
                                        for (int index$iv4 = 0; index$iv4 < size5; index$iv4++) {
                                            Object item$iv4 = $this$fastForEach$iv4.get(index$iv4);
                                            Measurable it4 = (Measurable) item$iv4;
                                            Placeable.PlacementScope.placeRelative$default($this$layout, it4.mo5750measureBRTryo0(Constraints.INSTANCE.m6981fixedJhjzzOo(intRef3.element, intRef4.element)), 0, 0, 0.0f, 4, null);
                                        }
                                        scrollableTabData2.onLaidOut($this$SubcomposeLayout, padding2, tabPositions, i13);
                                    }
                                }, 4, null);
                            }
                        };
                        $composer4.updateRememberedValue(value$iv2);
                        it$iv2 = value$iv2;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer4);
                    SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, (Function2) it$iv2, $composer4, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, $composer3, 54), $composer2, i2 | (($dirty >> 3) & 14) | ($dirty & User32.WM_PENWINFIRST) | ($dirty & GL11.GL_RENDER), 50);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            edgePadding2 = edgePadding3;
            indicator = indicator2;
            divider = divider2;
            modifier2 = modifier3;
            contentColor2 = contentColor4;
            backgroundColor2 = backgroundColor4;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            backgroundColor2 = j;
            edgePadding2 = f;
            modifier2 = modifier;
            contentColor2 = j2;
            indicator = function32;
            divider = function2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$3
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
                    TabRowKt.m1833ScrollableTabRowsKfQg0A(selectedTabIndex, modifier2, backgroundColor2, contentColor2, edgePadding2, indicator, divider, function22, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), i);
                }
            });
        }
    }
}
