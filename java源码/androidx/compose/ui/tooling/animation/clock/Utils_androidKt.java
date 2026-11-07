package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.animation.core.Animation;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.animation.core.RepeatableSpec;
import androidx.compose.animation.core.SnapSpec;
import androidx.compose.animation.core.StartOffset;
import androidx.compose.animation.core.StartOffsetType;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.tooling.animation.states.TargetState;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Utils.android.kt */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\u001a\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0000\u001a5\u0010\n\u001a\n\u0012\u0004\u0012\u0002H\f\u0018\u00010\u000b\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001a\u0002H\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0002\u0010\u0011\u001a&\u0010\u0012\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0013R\u0006\u0012\u0002\b\u00030\u00140\u0001*\u0006\u0012\u0002\b\u00030\u0014H\u0000\u001aH\u0010\u0015\u001a\u00020\u0016\"\u0004\b\u0000\u0010\f\"\b\b\u0001\u0010\u0017*\u00020\u0018*\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u00170\u00192\u0006\u0010\u001a\u001a\u00020\u00022\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\f0\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u0006H\u0000\u001a>\u0010\u0015\u001a\u00020\u0016\"\u0004\b\u0000\u0010\f\"\b\b\u0001\u0010\u0017*\u00020\u0018*\u0012\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u00170\u001eR\u00020\u001f2\b\b\u0002\u0010\u001d\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0000\u001aB\u0010\u0015\u001a\u00020\u0016\"\u0004\b\u0000\u0010\f\"\b\b\u0001\u0010\u0017*\u00020\u0018\"\u0004\b\u0002\u0010!*\u0018\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u00170\u0013R\b\u0012\u0004\u0012\u0002H!0\u00142\b\b\u0002\u0010\u001d\u001a\u00020\u0006H\u0000\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\"²\u0006\u001a\u0010#\u001a\u00020\u0006\"\u0004\b\u0000\u0010\f\"\b\b\u0001\u0010\u0017*\u00020\u0018X\u008a\u0084\u0002²\u0006&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\f0%\"\u0004\b\u0000\u0010\f\"\b\b\u0001\u0010\u0017*\u00020\u0018X\u008a\u0084\u0002²\u0006&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\f0%\"\u0004\b\u0000\u0010\f\"\b\b\u0001\u0010\u0017*\u00020\u0018X\u008a\u0084\u0002"}, d2 = {"IGNORE_TRANSITIONS", "", "", "getIGNORE_TRANSITIONS", "()Ljava/util/List;", "millisToNanos", "", "timeMs", "nanosToMillis", "timeNs", "parseParametersToValue", "Landroidx/compose/ui/tooling/animation/states/TargetState;", "T", "currentValue", "par1", "", "par2", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/ui/tooling/animation/states/TargetState;", "allAnimations", "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "Landroidx/compose/animation/core/Transition;", "createTransitionInfo", "Landroidx/compose/animation/tooling/TransitionInfo;", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/Animation;", "label", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "stepMs", "Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;", "Landroidx/compose/animation/core/InfiniteTransition;", "endTimeMs", "S", "ui-tooling_release", "startTimeMs", "values", ""}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes24.dex */
public final class Utils_androidKt {
    private static final List<String> IGNORE_TRANSITIONS = CollectionsKt.listOf("TransformOriginInterruptionHandling");

    public static final List<String> getIGNORE_TRANSITIONS() {
        return IGNORE_TRANSITIONS;
    }

    public static final long nanosToMillis(long timeNs) {
        return (999999 + timeNs) / 1000000;
    }

    public static final long millisToNanos(long timeMs) {
        return 1000000 * timeMs;
    }

    public static final List<Transition<?>.TransitionAnimationState<?, ?>> allAnimations(Transition<?> transition) {
        Iterable $this$flatMap$iv = transition.getTransitions();
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$flatMap$iv) {
            Transition it = (Transition) element$iv$iv;
            Iterable list$iv$iv = allAnimations(it);
            CollectionsKt.addAll(destination$iv$iv, list$iv$iv);
        }
        List descendantAnimations = (List) destination$iv$iv;
        return CollectionsKt.plus((Collection) transition.getAnimations(), (Iterable) descendantAnimations);
    }

    public static /* synthetic */ TransitionInfo createTransitionInfo$default(Transition.TransitionAnimationState transitionAnimationState, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 1;
        }
        return createTransitionInfo(transitionAnimationState, j);
    }

    public static final <T, V extends AnimationVector, S> TransitionInfo createTransitionInfo(Transition<S>.TransitionAnimationState<T, V> transitionAnimationState, long stepMs) {
        return createTransitionInfo(transitionAnimationState.getAnimation(), transitionAnimationState.getLabel(), transitionAnimationState.getAnimationSpec(), stepMs);
    }

    public static /* synthetic */ TransitionInfo createTransitionInfo$default(Animation animation, String str, AnimationSpec animationSpec, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = 1;
        }
        return createTransitionInfo(animation, str, animationSpec, j);
    }

    public static final <T, V extends AnimationVector> TransitionInfo createTransitionInfo(final Animation<T, V> animation, String label, final AnimationSpec<T> animationSpec, final long stepMs) {
        final long endTimeMs = nanosToMillis(animation.getDurationNanos());
        final Lazy startTimeMs$delegate = LazyKt.lazy(new Function0<Long>() { // from class: androidx.compose.ui.tooling.animation.clock.Utils_androidKt$createTransitionInfo$startTimeMs$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Long invoke() {
                Number numberValueOf;
                Object obj = animationSpec;
                if (obj instanceof TweenSpec) {
                    numberValueOf = Integer.valueOf(((TweenSpec) animationSpec).getDelay());
                } else if (obj instanceof SnapSpec) {
                    numberValueOf = Integer.valueOf(((SnapSpec) animationSpec).getDelay());
                } else if (obj instanceof KeyframesSpec) {
                    numberValueOf = Integer.valueOf(((KeyframesSpec) animationSpec).getConfig().getDelayMillis());
                } else if (obj instanceof RepeatableSpec) {
                    if (StartOffsetType.m191equalsimpl0(StartOffset.m184getOffsetTypeEo1U57Q(((RepeatableSpec) animationSpec).getInitialStartOffset()), StartOffsetType.INSTANCE.m195getDelayEo1U57Q())) {
                        numberValueOf = Integer.valueOf(StartOffset.m183getOffsetMillisimpl(((RepeatableSpec) animationSpec).getInitialStartOffset()));
                    } else {
                        numberValueOf = 0L;
                    }
                } else if (obj instanceof InfiniteRepeatableSpec) {
                    if (StartOffsetType.m191equalsimpl0(StartOffset.m184getOffsetTypeEo1U57Q(((InfiniteRepeatableSpec) animationSpec).getInitialStartOffset()), StartOffsetType.INSTANCE.m195getDelayEo1U57Q())) {
                        numberValueOf = Integer.valueOf(StartOffset.m183getOffsetMillisimpl(((InfiniteRepeatableSpec) animationSpec).getInitialStartOffset()));
                    } else {
                        numberValueOf = 0L;
                    }
                } else {
                    numberValueOf = obj instanceof VectorizedDurationBasedAnimationSpec ? Integer.valueOf(((VectorizedDurationBasedAnimationSpec) animationSpec).getDelayMillis()) : 0L;
                }
                return Long.valueOf(numberValueOf.longValue());
            }
        });
        Lazy values$delegate = LazyKt.lazy(new Function0<Map<Long, T>>() { // from class: androidx.compose.ui.tooling.animation.clock.Utils_androidKt$createTransitionInfo$values$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Map<Long, T> invoke() {
                Map values = new LinkedHashMap();
                values.put(Long.valueOf(Utils_androidKt.createTransitionInfo$lambda$1(startTimeMs$delegate)), animation.getValueFromNanos(Utils_androidKt.millisToNanos(Utils_androidKt.createTransitionInfo$lambda$1(startTimeMs$delegate))));
                values.put(Long.valueOf(endTimeMs), animation.getValueFromNanos(Utils_androidKt.millisToNanos(endTimeMs)));
                long millis = Utils_androidKt.createTransitionInfo$lambda$1(startTimeMs$delegate);
                while (millis <= endTimeMs) {
                    values.put(Long.valueOf(millis), animation.getValueFromNanos(Utils_androidKt.millisToNanos(millis)));
                    millis += stepMs;
                }
                return values;
            }
        });
        String label2 = animationSpec.getClass().getName();
        return new TransitionInfo(label, label2, createTransitionInfo$lambda$1(startTimeMs$delegate), endTimeMs, createTransitionInfo$lambda$2(values$delegate));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long createTransitionInfo$lambda$1(Lazy<Long> lazy) {
        return lazy.getValue().longValue();
    }

    private static final <T> Map<Long, T> createTransitionInfo$lambda$2(Lazy<? extends Map<Long, T>> lazy) {
        return lazy.getValue();
    }

    public static /* synthetic */ TransitionInfo createTransitionInfo$default(InfiniteTransition.TransitionAnimationState transitionAnimationState, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 1;
        }
        return createTransitionInfo(transitionAnimationState, j, j2);
    }

    public static final <T, V extends AnimationVector> TransitionInfo createTransitionInfo(final InfiniteTransition.TransitionAnimationState<T, V> transitionAnimationState, final long stepMs, final long endTimeMs) {
        final long startTimeMs = 0;
        Lazy values$delegate = LazyKt.lazy(new Function0<Map<Long, T>>() { // from class: androidx.compose.ui.tooling.animation.clock.Utils_androidKt$createTransitionInfo$values$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Map<Long, T> invoke() {
                Map values = new LinkedHashMap();
                values.put(Long.valueOf(startTimeMs), transitionAnimationState.getAnimation().getValueFromNanos(Utils_androidKt.millisToNanos(startTimeMs)));
                values.put(Long.valueOf(endTimeMs), transitionAnimationState.getAnimation().getValueFromNanos(Utils_androidKt.millisToNanos(endTimeMs)));
                long millis = startTimeMs;
                while (millis <= endTimeMs) {
                    values.put(Long.valueOf(millis), transitionAnimationState.getAnimation().getValueFromNanos(Utils_androidKt.millisToNanos(millis)));
                    millis += stepMs;
                }
                return values;
            }
        });
        return new TransitionInfo(transitionAnimationState.getLabel(), transitionAnimationState.getAnimationSpec().getClass().getName(), 0L, endTimeMs, createTransitionInfo$lambda$3(values$delegate));
    }

    private static final <T> Map<Long, T> createTransitionInfo$lambda$3(Lazy<? extends Map<Long, T>> lazy) {
        return lazy.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    public static final <T> TargetState<T> parseParametersToValue(T t, Object obj, Object obj2) {
        TargetState<T> targetState;
        TargetState<T> targetState2;
        TargetState<T> targetState3;
        if (t == null) {
            return null;
        }
        TargetState parametersToValue$parseDp = parseParametersToValue$parseDp(t, obj, obj2);
        if (parametersToValue$parseDp != null) {
            return parametersToValue$parseDp;
        }
        if (!parseParametersToValue$parametersAreValid(obj, obj2)) {
            return null;
        }
        Intrinsics.checkNotNull(obj2);
        if (parseParametersToValue$parametersHasTheSameType(t, obj, obj2)) {
            return new TargetState<>(obj, obj2);
        }
        if (!(obj instanceof List) || !(obj2 instanceof List)) {
            return null;
        }
        try {
            try {
                try {
                    if (t instanceof IntSize) {
                        try {
                            Object obj3 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue = ((Integer) obj3).intValue();
                            Intrinsics.checkNotNull(((List) obj).get(1), "null cannot be cast to non-null type kotlin.Int");
                            targetState = 0;
                            IntSize intSizeM7181boximpl = IntSize.m7181boximpl(IntSize.m7184constructorimpl((iIntValue << 32) | (((Integer) r12).intValue() & 4294967295L)));
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue2 = ((Integer) obj4).intValue();
                            Intrinsics.checkNotNull(((List) obj2).get(1), "null cannot be cast to non-null type kotlin.Int");
                            targetState2 = new TargetState<>(intSizeM7181boximpl, IntSize.m7181boximpl(IntSize.m7184constructorimpl((iIntValue2 << 32) | (((Integer) r8).intValue() & 4294967295L))));
                            targetState3 = null;
                        } catch (ClassCastException e) {
                            targetState = 0;
                            return targetState;
                        } catch (IllegalArgumentException e2) {
                            targetState = 0;
                            return targetState;
                        } catch (IndexOutOfBoundsException e3) {
                            targetState = 0;
                            return targetState;
                        } catch (NullPointerException e4) {
                            targetState = 0;
                            return targetState;
                        }
                    } else {
                        Object obj5 = null;
                        if (t instanceof IntOffset) {
                            Object obj6 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue3 = ((Integer) obj6).intValue();
                            Intrinsics.checkNotNull(((List) obj).get(1), "null cannot be cast to non-null type kotlin.Int");
                            IntOffset intOffsetM7137boximpl = IntOffset.m7137boximpl(IntOffset.m7140constructorimpl((((Integer) r5).intValue() & 4294967295L) | (iIntValue3 << 32)));
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue4 = ((Integer) obj7).intValue();
                            Intrinsics.checkNotNull(((List) obj2).get(1), "null cannot be cast to non-null type kotlin.Int");
                            targetState2 = new TargetState<>(intOffsetM7137boximpl, IntOffset.m7137boximpl(IntOffset.m7140constructorimpl((iIntValue4 << 32) | (((Integer) r6).intValue() & 4294967295L))));
                            targetState3 = null;
                            targetState = obj5;
                        } else if (t instanceof Size) {
                            Object obj8 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Float");
                            float fFloatValue = ((Float) obj8).floatValue();
                            Object obj9 = ((List) obj).get(1);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type kotlin.Float");
                            float fFloatValue2 = ((Float) obj9).floatValue();
                            targetState3 = null;
                            Size sizeM4206boximpl = Size.m4206boximpl(Size.m4209constructorimpl((Float.floatToRawIntBits(fFloatValue) << 32) | (Float.floatToRawIntBits(fFloatValue2) & 4294967295L)));
                            Object obj10 = ((List) obj2).get(0);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Float");
                            float fFloatValue3 = ((Float) obj10).floatValue();
                            Object obj11 = ((List) obj2).get(1);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type kotlin.Float");
                            float fFloatValue4 = ((Float) obj11).floatValue();
                            long jFloatToRawIntBits = Float.floatToRawIntBits(fFloatValue4) & 4294967295L;
                            targetState2 = new TargetState<>(sizeM4206boximpl, Size.m4206boximpl(Size.m4209constructorimpl((Float.floatToRawIntBits(fFloatValue3) << 32) | jFloatToRawIntBits)));
                            targetState = jFloatToRawIntBits;
                        } else {
                            targetState3 = null;
                            if (t instanceof Offset) {
                                Object obj12 = ((List) obj).get(0);
                                Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type kotlin.Float");
                                float fFloatValue5 = ((Float) obj12).floatValue();
                                Object obj13 = ((List) obj).get(1);
                                Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type kotlin.Float");
                                float fFloatValue6 = ((Float) obj13).floatValue();
                                Offset offsetM4138boximpl = Offset.m4138boximpl(Offset.m4141constructorimpl((Float.floatToRawIntBits(fFloatValue5) << 32) | (Float.floatToRawIntBits(fFloatValue6) & 4294967295L)));
                                Object obj14 = ((List) obj2).get(0);
                                Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type kotlin.Float");
                                float fFloatValue7 = ((Float) obj14).floatValue();
                                Object obj15 = ((List) obj2).get(1);
                                Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type kotlin.Float");
                                float fFloatValue8 = ((Float) obj15).floatValue();
                                long jFloatToRawIntBits2 = Float.floatToRawIntBits(fFloatValue8) & 4294967295L;
                                targetState2 = new TargetState<>(offsetM4138boximpl, Offset.m4138boximpl(Offset.m4141constructorimpl((Float.floatToRawIntBits(fFloatValue7) << 32) | jFloatToRawIntBits2)));
                                targetState = jFloatToRawIntBits2;
                            } else if (t instanceof Rect) {
                                Object obj16 = ((List) obj).get(0);
                                Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.Float");
                                float fFloatValue9 = ((Float) obj16).floatValue();
                                Object obj17 = ((List) obj).get(1);
                                Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type kotlin.Float");
                                float fFloatValue10 = ((Float) obj17).floatValue();
                                Object obj18 = ((List) obj).get(2);
                                Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.Float");
                                float fFloatValue11 = ((Float) obj18).floatValue();
                                Object obj19 = ((List) obj).get(3);
                                Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type kotlin.Float");
                                Rect rect = new Rect(fFloatValue9, fFloatValue10, fFloatValue11, ((Float) obj19).floatValue());
                                Object obj20 = ((List) obj2).get(0);
                                Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type kotlin.Float");
                                float fFloatValue12 = ((Float) obj20).floatValue();
                                Object obj21 = ((List) obj2).get(1);
                                Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type kotlin.Float");
                                float fFloatValue13 = ((Float) obj21).floatValue();
                                Object obj22 = ((List) obj2).get(2);
                                Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type kotlin.Float");
                                float fFloatValue14 = ((Float) obj22).floatValue();
                                Object obj23 = ((List) obj2).get(3);
                                Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type kotlin.Float");
                                targetState2 = new TargetState<>(rect, new Rect(fFloatValue12, fFloatValue13, fFloatValue14, ((Float) obj23).floatValue()));
                                targetState = obj5;
                            } else if (t instanceof Color) {
                                Object obj24 = ((List) obj).get(0);
                                Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type kotlin.Float");
                                float fFloatValue15 = ((Float) obj24).floatValue();
                                Object obj25 = ((List) obj).get(1);
                                Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type kotlin.Float");
                                float fFloatValue16 = ((Float) obj25).floatValue();
                                Object obj26 = ((List) obj).get(2);
                                Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type kotlin.Float");
                                float fFloatValue17 = ((Float) obj26).floatValue();
                                Object obj27 = ((List) obj).get(3);
                                Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type kotlin.Float");
                                Color colorM4380boximpl = Color.m4380boximpl(ColorKt.Color$default(fFloatValue15, fFloatValue16, fFloatValue17, ((Float) obj27).floatValue(), null, 16, null));
                                Object obj28 = ((List) obj2).get(0);
                                Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type kotlin.Float");
                                float fFloatValue18 = ((Float) obj28).floatValue();
                                Object obj29 = ((List) obj2).get(1);
                                Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type kotlin.Float");
                                float fFloatValue19 = ((Float) obj29).floatValue();
                                Object obj30 = ((List) obj2).get(2);
                                Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type kotlin.Float");
                                float fFloatValue20 = ((Float) obj30).floatValue();
                                Object obj31 = ((List) obj2).get(3);
                                Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Float");
                                targetState = 16;
                                targetState2 = new TargetState<>(colorM4380boximpl, Color.m4380boximpl(ColorKt.Color$default(fFloatValue18, fFloatValue19, fFloatValue20, ((Float) obj31).floatValue(), null, 16, null)));
                            } else {
                                if (!(t instanceof Dp)) {
                                    if (parseParametersToValue$parametersAreValid(((List) obj).get(0), ((List) obj2).get(0))) {
                                        Object obj32 = ((List) obj).get(0);
                                        Intrinsics.checkNotNull(obj32);
                                        Object obj33 = ((List) obj2).get(0);
                                        Intrinsics.checkNotNull(obj33);
                                        if (parseParametersToValue$parametersHasTheSameType(t, obj32, obj33)) {
                                            targetState2 = new TargetState<>(((List) obj).get(0), ((List) obj2).get(0));
                                            targetState = obj5;
                                        }
                                    }
                                    return null;
                                }
                                Object obj34 = ((List) obj).get(0);
                                Intrinsics.checkNotNull(obj34);
                                Object obj35 = ((List) obj2).get(0);
                                Intrinsics.checkNotNull(obj35);
                                targetState2 = (TargetState<T>) parseParametersToValue$parseDp(t, obj34, obj35);
                                targetState = obj5;
                            }
                        }
                    }
                    Intrinsics.checkNotNull(targetState2, "null cannot be cast to non-null type androidx.compose.ui.tooling.animation.states.TargetState<T of androidx.compose.ui.tooling.animation.clock.Utils_androidKt.parseParametersToValue>");
                    return targetState2;
                } catch (ClassCastException e5) {
                } catch (IllegalArgumentException e6) {
                } catch (IndexOutOfBoundsException e7) {
                } catch (NullPointerException e8) {
                }
            } catch (ClassCastException e9) {
                return targetState3;
            } catch (IllegalArgumentException e10) {
                return targetState3;
            } catch (IndexOutOfBoundsException e11) {
                return targetState3;
            } catch (NullPointerException e12) {
                return targetState3;
            }
        } catch (ClassCastException e13) {
            return null;
        } catch (IllegalArgumentException e14) {
            return null;
        } catch (IndexOutOfBoundsException e15) {
            return null;
        } catch (NullPointerException e16) {
            return null;
        }
    }

    private static final boolean parseParametersToValue$parametersAreValid(Object par1, Object par2) {
        return (par1 == null || par2 == null || par1.getClass() != par2.getClass()) ? false : true;
    }

    private static final boolean parseParametersToValue$parametersHasTheSameType(Object value, Object par1, Object par2) {
        return value.getClass() == par1.getClass() && value.getClass() == par2.getClass();
    }

    private static final Dp parseParametersToValue$getDp(Object par) {
        Dp dpM7016boximpl = par instanceof Dp ? (Dp) par : null;
        if (dpM7016boximpl == null) {
            Float f = par instanceof Float ? (Float) par : null;
            if (f != null) {
                float $this$dp$iv = f.floatValue();
                dpM7016boximpl = Dp.m7016boximpl(Dp.m7018constructorimpl($this$dp$iv));
            } else {
                dpM7016boximpl = null;
            }
            if (dpM7016boximpl == null) {
                Double d = par instanceof Double ? (Double) par : null;
                if (d != null) {
                    double $this$dp$iv2 = d.doubleValue();
                    dpM7016boximpl = Dp.m7016boximpl(Dp.m7018constructorimpl((float) $this$dp$iv2));
                } else {
                    dpM7016boximpl = null;
                }
                if (dpM7016boximpl == null) {
                    Integer num = par instanceof Integer ? (Integer) par : null;
                    if (num == null) {
                        return null;
                    }
                    int $this$dp$iv3 = num.intValue();
                    return Dp.m7016boximpl(Dp.m7018constructorimpl($this$dp$iv3));
                }
            }
        }
        return dpM7016boximpl;
    }

    private static final <T> TargetState<Dp> parseParametersToValue$parseDp(T t, Object par1, Object par2) {
        if (!(t instanceof Dp) || par2 == null) {
            return null;
        }
        if ((par1 instanceof Dp) && (par2 instanceof Dp)) {
            return new TargetState<>(par1, par2);
        }
        Dp dp1 = parseParametersToValue$getDp(par1);
        Dp dp2 = parseParametersToValue$getDp(par2);
        if (dp1 == null || dp2 == null) {
            return null;
        }
        return new TargetState<>(dp1, dp2);
    }
}
