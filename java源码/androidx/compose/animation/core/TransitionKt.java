package androidx.compose.animation.core;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.Transition.DeferredAnimation;
import androidx.compose.animation.core.Transition.TransitionAnimationState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.windows.User32;

/* compiled from: Transition.kt */
@Metadata(d1 = {"\u0000ª\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\b\u0000\u0010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a-\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\b\u0000\u0010\u00142\u0006\u0010\u001b\u001a\u0002H\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0002\u0010\u001c\u001a3\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\b\u0000\u0010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u001d2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0002\u0010\u001e\u001ai\u0010\u001f\u001a\u00020\u0011\"\u0004\b\u0000\u0010 \"\u0004\b\u0001\u0010\u0014\"\b\b\u0002\u0010!*\u00020\"*\b\u0012\u0004\u0012\u0002H 0\u00132\u001c\u0010#\u001a\u0018\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H!0$R\b\u0012\u0004\u0012\u0002H 0\u00132\u0006\u0010%\u001a\u0002H\u00142\u0006\u0010&\u001a\u0002H\u00142\f\u0010'\u001a\b\u0012\u0004\u0012\u0002H\u00140(H\u0003¢\u0006\u0002\u0010)\u001a\u0082\u0001\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u0002H 0\u00132*\b\n\u0010-\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H 0.\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0(0\u000f¢\u0006\u0002\b/¢\u0006\u0002\b02\b\b\u0002\u0010\u0017\u001a\u00020\u00182&\u00101\u001a\"\u0012\u0013\u0012\u0011H ¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0004\u0012\u00020,0\u000f¢\u0006\u0002\b/H\u0087\b¢\u0006\u0002\u00105\u001a\u0082\u0001\u00106\u001a\b\u0012\u0004\u0012\u00020\u00030+\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u0002H 0\u00132*\b\n\u0010-\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H 0.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030(0\u000f¢\u0006\u0002\b/¢\u0006\u0002\b02\b\b\u0002\u0010\u0017\u001a\u00020\u00182&\u00101\u001a\"\u0012\u0013\u0012\u0011H ¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0004\u0012\u00020\u00030\u000f¢\u0006\u0002\b/H\u0087\b¢\u0006\u0002\u00105\u001a\u0082\u0001\u00107\u001a\b\u0012\u0004\u0012\u00020\u00010+\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u0002H 0\u00132*\b\n\u0010-\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H 0.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010(0\u000f¢\u0006\u0002\b/¢\u0006\u0002\b02\b\b\u0002\u0010\u0017\u001a\u00020\u00182&\u00101\u001a\"\u0012\u0013\u0012\u0011H ¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b/H\u0087\b¢\u0006\u0002\u00105\u001a\u0082\u0001\u00108\u001a\b\u0012\u0004\u0012\u0002090+\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u0002H 0\u00132*\b\n\u0010-\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H 0.\u0012\n\u0012\b\u0012\u0004\u0012\u0002090(0\u000f¢\u0006\u0002\b/¢\u0006\u0002\b02\b\b\u0002\u0010\u0017\u001a\u00020\u00182&\u00101\u001a\"\u0012\u0013\u0012\u0011H ¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0004\u0012\u0002090\u000f¢\u0006\u0002\b/H\u0087\b¢\u0006\u0002\u00105\u001a\u0082\u0001\u0010:\u001a\b\u0012\u0004\u0012\u00020;0+\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u0002H 0\u00132*\b\n\u0010-\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H 0.\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0(0\u000f¢\u0006\u0002\b/¢\u0006\u0002\b02\b\b\u0002\u0010\u0017\u001a\u00020\u00182&\u00101\u001a\"\u0012\u0013\u0012\u0011H ¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0004\u0012\u00020;0\u000f¢\u0006\u0002\b/H\u0087\b¢\u0006\u0002\u00105\u001a\u0082\u0001\u0010<\u001a\b\u0012\u0004\u0012\u00020=0+\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u0002H 0\u00132*\b\n\u0010-\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H 0.\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0(0\u000f¢\u0006\u0002\b/¢\u0006\u0002\b02\b\b\u0002\u0010\u0017\u001a\u00020\u00182&\u00101\u001a\"\u0012\u0013\u0012\u0011H ¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0004\u0012\u00020=0\u000f¢\u0006\u0002\b/H\u0087\b¢\u0006\u0002\u00105\u001a\u0082\u0001\u0010>\u001a\b\u0012\u0004\u0012\u00020?0+\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u0002H 0\u00132*\b\n\u0010-\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H 0.\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0(0\u000f¢\u0006\u0002\b/¢\u0006\u0002\b02\b\b\u0002\u0010\u0017\u001a\u00020\u00182&\u00101\u001a\"\u0012\u0013\u0012\u0011H ¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0004\u0012\u00020?0\u000f¢\u0006\u0002\b/H\u0087\b¢\u0006\u0002\u00105\u001a\u0082\u0001\u0010@\u001a\b\u0012\u0004\u0012\u00020A0+\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u0002H 0\u00132*\b\n\u0010-\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H 0.\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0(0\u000f¢\u0006\u0002\b/¢\u0006\u0002\b02\b\b\u0002\u0010\u0017\u001a\u00020\u00182&\u00101\u001a\"\u0012\u0013\u0012\u0011H ¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0004\u0012\u00020A0\u000f¢\u0006\u0002\b/H\u0087\b¢\u0006\u0002\u00105\u001a¦\u0001\u0010B\u001a\b\u0012\u0004\u0012\u0002H\u00140+\"\u0004\b\u0000\u0010 \"\u0004\b\u0001\u0010\u0014\"\b\b\u0002\u0010!*\u00020\"*\b\u0012\u0004\u0012\u0002H 0\u00132\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H!0D2*\b\n\u0010-\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H 0.\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140(0\u000f¢\u0006\u0002\b/¢\u0006\u0002\b02\b\b\u0002\u0010\u0017\u001a\u00020\u00182&\u00101\u001a\"\u0012\u0013\u0012\u0011H ¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0004\u0012\u0002H\u00140\u000f¢\u0006\u0002\b/H\u0087\b¢\u0006\u0002\u0010E\u001a\\\u0010F\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\b\u0000\u0010 \"\u0004\b\u0001\u0010\u0014*\b\u0012\u0004\u0012\u0002H 0\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00182&\u0010G\u001a\"\u0012\u0013\u0012\u0011H ¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H\u00140\u000f¢\u0006\u0002\b/H\u0087\b¢\u0006\u0002\u0010I\u001aA\u0010J\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\b\u0000\u0010 \"\u0004\b\u0001\u0010\u0014*\b\u0012\u0004\u0012\u0002H 0\u00132\u0006\u0010K\u001a\u0002H\u00142\u0006\u0010\u001b\u001a\u0002H\u00142\u0006\u0010L\u001a\u00020\u0018H\u0001¢\u0006\u0002\u0010M\u001aa\u0010N\u001a\u0018\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H!0OR\b\u0012\u0004\u0012\u0002H 0\u0013\"\u0004\b\u0000\u0010 \"\u0004\b\u0001\u0010\u0014\"\b\b\u0002\u0010!*\u00020\"*\b\u0012\u0004\u0012\u0002H 0\u00132\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H!0D2\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0007¢\u0006\u0002\u0010P\u001am\u0010Q\u001a\b\u0012\u0004\u0012\u0002H\u00140+\"\u0004\b\u0000\u0010 \"\u0004\b\u0001\u0010\u0014\"\b\b\u0002\u0010!*\u00020\"*\b\u0012\u0004\u0012\u0002H 0\u00132\u0006\u0010%\u001a\u0002H\u00142\u0006\u0010&\u001a\u0002H\u00142\f\u0010'\u001a\b\u0012\u0004\u0012\u0002H\u00140(2\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H!0D2\u0006\u0010\u0017\u001a\u00020\u0018H\u0001¢\u0006\u0002\u0010R\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u001b\u0010\b\u001a\u00020\t8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\"\u001e\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006S"}, d2 = {"AnimationDebugDurationScale", "", "NoReset", "", "ResetAnimationSnap", "ResetAnimationSnapCurrent", "ResetAnimationSnapTarget", "ResetNoSnap", "SeekableStateObserver", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "getSeekableStateObserver", "()Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "SeekableStateObserver$delegate", "Lkotlin/Lazy;", "SeekableTransitionStateTotalDurationChanged", "Lkotlin/Function1;", "Landroidx/compose/animation/core/SeekableTransitionState;", "", "rememberTransition", "Landroidx/compose/animation/core/Transition;", "T", "transitionState", "Landroidx/compose/animation/core/TransitionState;", "label", "", "(Landroidx/compose/animation/core/TransitionState;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "updateTransition", "targetState", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/core/MutableTransitionState;", "(Landroidx/compose/animation/core/MutableTransitionState;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "UpdateInitialAndTargetValues", "S", "V", "Landroidx/compose/animation/core/AnimationVector;", "transitionAnimation", "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "initialValue", "targetValue", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/Transition$TransitionAnimationState;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/runtime/Composer;I)V", "animateDp", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/unit/Dp;", "transitionSpec", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "targetValueByState", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "state", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateFloat", "animateInt", "animateIntOffset", "Landroidx/compose/ui/unit/IntOffset;", "animateIntSize", "Landroidx/compose/ui/unit/IntSize;", "animateOffset", "Landroidx/compose/ui/geometry/Offset;", "animateRect", "Landroidx/compose/ui/geometry/Rect;", "animateSize", "Landroidx/compose/ui/geometry/Size;", "animateValue", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "createChildTransition", "transformToChildState", "parentState", "(Landroidx/compose/animation/core/Transition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "createChildTransitionInternal", "initialState", "childLabel", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/Transition;", "createDeferredAnimation", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition$DeferredAnimation;", "createTransitionAnimation", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TransitionKt {
    public static final int AnimationDebugDurationScale = 1;
    private static final float NoReset = -1.0f;
    private static final float ResetAnimationSnap = -3.0f;
    private static final float ResetAnimationSnapCurrent = -4.0f;
    private static final float ResetAnimationSnapTarget = -5.0f;
    private static final float ResetNoSnap = -2.0f;
    private static final Function1<SeekableTransitionState<?>, Unit> SeekableTransitionStateTotalDurationChanged = new Function1<SeekableTransitionState<?>, Unit>() { // from class: androidx.compose.animation.core.TransitionKt$SeekableTransitionStateTotalDurationChanged$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SeekableTransitionState<?> seekableTransitionState) {
            invoke2(seekableTransitionState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(SeekableTransitionState<?> seekableTransitionState) {
            seekableTransitionState.onTotalDurationChanged$animation_core_release();
        }
    };
    private static final Lazy SeekableStateObserver$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<SnapshotStateObserver>() { // from class: androidx.compose.animation.core.TransitionKt$SeekableStateObserver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final SnapshotStateObserver invoke() {
            SnapshotStateObserver $this$invoke_u24lambda_u240 = new SnapshotStateObserver(new Function1<Function0<? extends Unit>, Unit>() { // from class: androidx.compose.animation.core.TransitionKt$SeekableStateObserver$2.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Function0<? extends Unit> function0) {
                    invoke2((Function0<Unit>) function0);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Function0<Unit> function0) {
                    function0.invoke();
                }
            });
            $this$invoke_u24lambda_u240.start();
            return $this$invoke_u24lambda_u240;
        }
    });

    public static final <T> Transition<T> updateTransition(T t, String label, Composer $composer, int $changed, int i) {
        ComposerKt.sourceInformationMarkerStart($composer, 2029166765, "C(updateTransition)P(1)87@3839L51,88@3906L22,89@3962L190,89@3933L219:Transition.kt#pdpnli");
        if ((i & 2) != 0) {
            label = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2029166765, $changed, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:86)");
        }
        ComposerKt.sourceInformationMarkerStart($composer, -659287883, "CC(remember):Transition.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv == Composer.INSTANCE.getEmpty()) {
            Object value$iv = new Transition(t, label);
            $composer.updateRememberedValue(value$iv);
            it$iv = value$iv;
        }
        final Transition transition = (Transition) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        transition.animateTo$animation_core_release(t, $composer, ($changed & 8) | 48 | ($changed & 14));
        ComposerKt.sourceInformationMarkerStart($composer, -659283808, "CC(remember):Transition.kt#9igjgp");
        Object it$iv2 = $composer.rememberedValue();
        if (it$iv2 == Composer.INSTANCE.getEmpty()) {
            Object value$iv2 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final DisposableEffectResult invoke(DisposableEffectScope $this$DisposableEffect) {
                    final Transition<T> transition2 = transition;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            transition2.onDisposed$animation_core_release();
                        }
                    };
                }
            };
            $composer.updateRememberedValue(value$iv2);
            it$iv2 = value$iv2;
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.DisposableEffect(transition, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) it$iv2, $composer, 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        return transition;
    }

    public static final SnapshotStateObserver getSeekableStateObserver() {
        return (SnapshotStateObserver) SeekableStateObserver$delegate.getValue();
    }

    public static final <T> Transition<T> rememberTransition(TransitionState<T> transitionState, String label, Composer $composer, int $changed, int i) {
        ComposerKt.sourceInformationMarkerStart($composer, 1643203617, "C(rememberTransition)P(1)805@34726L82,818@35438L190,818@35409L219:Transition.kt#pdpnli");
        String label2 = (i & 2) != 0 ? null : label;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1643203617, $changed, -1, "androidx.compose.animation.core.rememberTransition (Transition.kt:803)");
        }
        ComposerKt.sourceInformationMarkerStart($composer, 587437176, "CC(remember):Transition.kt#9igjgp");
        boolean invalid$iv = true;
        boolean invalid$iv2 = ((($changed & 14) ^ 6) > 4 && $composer.changed(transitionState)) || ($changed & 6) == 4;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv2 || it$iv == Composer.INSTANCE.getEmpty()) {
            Object value$iv = new Transition((TransitionState) transitionState, label2);
            $composer.updateRememberedValue(value$iv);
            it$iv = value$iv;
        }
        final Transition transition = (Transition) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (transitionState instanceof SeekableTransitionState) {
            $composer.startReplaceGroup(1030829284);
            ComposerKt.sourceInformation($composer, "807@34945L382,807@34871L456");
            T currentState = transitionState.getCurrentState();
            T targetState = transitionState.getTargetState();
            ComposerKt.sourceInformationMarkerStart($composer, 587444484, "CC(remember):Transition.kt#9igjgp");
            if (((($changed & 14) ^ 6) <= 4 || !$composer.changed(transitionState)) && ($changed & 6) != 4) {
                invalid$iv = false;
            }
            Object it$iv2 = $composer.rememberedValue();
            if (invalid$iv || it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = (Function2) new TransitionKt$rememberTransition$1$1(transitionState, null);
                $composer.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            EffectsKt.LaunchedEffect(currentState, targetState, (Function2) it$iv2, $composer, 0);
            $composer.endReplaceGroup();
        } else {
            $composer.startReplaceGroup(1031290843);
            ComposerKt.sourceInformation($composer, "816@35360L38");
            transition.animateTo$animation_core_release(transitionState.getTargetState(), $composer, 0);
            $composer.endReplaceGroup();
        }
        ComposerKt.sourceInformationMarkerStart($composer, 587460068, "CC(remember):Transition.kt#9igjgp");
        boolean invalid$iv3 = $composer.changed(transition);
        Object it$iv3 = $composer.rememberedValue();
        if (invalid$iv3 || it$iv3 == Composer.INSTANCE.getEmpty()) {
            Object value$iv3 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$rememberTransition$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final DisposableEffectResult invoke(DisposableEffectScope $this$DisposableEffect) {
                    final Transition<T> transition2 = transition;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$rememberTransition$2$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            transition2.onDisposed$animation_core_release();
                        }
                    };
                }
            };
            $composer.updateRememberedValue(value$iv3);
            it$iv3 = value$iv3;
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.DisposableEffect(transition, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) it$iv3, $composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        return transition;
    }

    @Deprecated(message = "Use rememberTransition() instead", replaceWith = @ReplaceWith(expression = "rememberTransition(transitionState, label)", imports = {}))
    public static final <T> Transition<T> updateTransition(MutableTransitionState<T> mutableTransitionState, String label, Composer $composer, int $changed, int i) {
        ComposerKt.sourceInformationMarkerStart($composer, 882913843, "C(updateTransition)P(1)858@37095L32:Transition.kt#pdpnli");
        if ((i & 2) != 0) {
            label = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(882913843, $changed, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:856)");
        }
        MutableTransitionState<T> state = mutableTransitionState;
        Transition<T> transitionRememberTransition = rememberTransition(state, label, $composer, ($changed & 14) | ($changed & 112), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        return transitionRememberTransition;
    }

    public static final <S, T, V extends AnimationVector> Transition<S>.DeferredAnimation<T, V> createDeferredAnimation(final Transition<S> transition, TwoWayConverter<T, V> twoWayConverter, String label, Composer $composer, int $changed, int i) {
        ComposerKt.sourceInformationMarkerStart($composer, -1714122528, "C(createDeferredAnimation)P(1)1732@73286L58,1733@73376L43,1733@73349L70:Transition.kt#pdpnli");
        if ((i & 2) != 0) {
            label = "DeferredAnimation";
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1714122528, $changed, -1, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:1731)");
        }
        ComposerKt.sourceInformationMarkerStart($composer, -1378213409, "CC(remember):Transition.kt#9igjgp");
        boolean z = true;
        boolean invalid$iv = ((($changed & 14) ^ 6) > 4 && $composer.changed(transition)) || ($changed & 6) == 4;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
            Object value$iv = transition.new DeferredAnimation(twoWayConverter, label);
            $composer.updateRememberedValue(value$iv);
            it$iv = value$iv;
        }
        final Transition.DeferredAnimation lazyAnim = (Transition.DeferredAnimation) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, -1378210544, "CC(remember):Transition.kt#9igjgp");
        if (((($changed & 14) ^ 6) <= 4 || !$composer.changed(transition)) && ($changed & 6) != 4) {
            z = false;
        }
        boolean invalid$iv2 = $composer.changedInstance(lazyAnim) | z;
        Object it$iv2 = $composer.rememberedValue();
        if (invalid$iv2 || it$iv2 == Composer.INSTANCE.getEmpty()) {
            Object value$iv2 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$createDeferredAnimation$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final DisposableEffectResult invoke(DisposableEffectScope $this$DisposableEffect) {
                    final Transition<S> transition2 = transition;
                    final Transition<S>.DeferredAnimation<T, V> deferredAnimation = lazyAnim;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createDeferredAnimation$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            transition2.removeAnimation$animation_core_release(deferredAnimation);
                        }
                    };
                }
            };
            $composer.updateRememberedValue(value$iv2);
            it$iv2 = value$iv2;
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.DisposableEffect(lazyAnim, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) it$iv2, $composer, 0);
        if (transition.isSeeking()) {
            lazyAnim.setupSeeking$animation_core_release();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        return lazyAnim;
    }

    public static final <S, T> Transition<T> createChildTransition(Transition<S> transition, String label, Function3<? super S, ? super Composer, ? super Integer, ? extends T> function3, Composer $composer, int $changed, int i) {
        String label2;
        ComposerKt.sourceInformationMarkerStart($composer, 1215497572, "CC(createChildTransition)1761@74780L36,1762@74840L74,1763@74937L39,1764@74988L63:Transition.kt#pdpnli");
        boolean invalid$iv = true;
        if ((i & 1) != 0) {
            label2 = "ChildTransition";
        } else {
            label2 = label;
        }
        ComposerKt.sourceInformationMarkerStart($composer, 272047797, "CC(remember):Transition.kt#9igjgp");
        if (((($changed & 14) ^ 6) <= 4 || !$composer.changed(transition)) && ($changed & 6) != 4) {
            invalid$iv = false;
        }
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
            Object value$iv = transition.getCurrentState();
            $composer.updateRememberedValue(value$iv);
            it$iv = value$iv;
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        Object initialParentState = it$iv;
        Object initialState = function3.invoke(transition.isSeeking() ? transition.getCurrentState() : initialParentState, $composer, Integer.valueOf(($changed >> 3) & 112));
        Object targetState = function3.invoke(transition.getTargetState(), $composer, Integer.valueOf(($changed >> 3) & 112));
        Transition $this$createChildTransition = createChildTransitionInternal(transition, initialState, targetState, label2, $composer, ($changed & 14) | (($changed << 6) & GL11.GL_RENDER));
        ComposerKt.sourceInformationMarkerEnd($composer);
        return $this$createChildTransition;
    }

    public static final <S, T> Transition<T> createChildTransitionInternal(final Transition<S> transition, T t, T t2, String childLabel, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -198307638, "C(createChildTransitionInternal)P(1,2)1775@75259L124,1779@75418L92,1779@75389L121:Transition.kt#pdpnli");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-198307638, $changed, -1, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:1773)");
        }
        ComposerKt.sourceInformationMarkerStart($composer, 1039311242, "CC(remember):Transition.kt#9igjgp");
        boolean invalid$iv = ((($changed & 14) ^ 6) > 4 && $composer.changed(transition)) || ($changed & 6) == 4;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
            Object value$iv = new Transition(new MutableTransitionState(t), transition, transition.getLabel() + " > " + childLabel);
            $composer.updateRememberedValue(value$iv);
            it$iv = value$iv;
        }
        final Transition transition2 = (Transition) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, 1039316298, "CC(remember):Transition.kt#9igjgp");
        boolean invalid$iv2 = $composer.changed(transition2) | (((($changed & 14) ^ 6) > 4 && $composer.changed(transition)) || ($changed & 6) == 4);
        Object it$iv2 = $composer.rememberedValue();
        if (invalid$iv2 || it$iv2 == Composer.INSTANCE.getEmpty()) {
            Object value$iv2 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$createChildTransitionInternal$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final DisposableEffectResult invoke(DisposableEffectScope $this$DisposableEffect) {
                    transition.addTransition$animation_core_release(transition2);
                    final Transition<S> transition3 = transition;
                    final Transition<T> transition4 = transition2;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createChildTransitionInternal$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            transition3.removeTransition$animation_core_release(transition4);
                        }
                    };
                }
            };
            $composer.updateRememberedValue(value$iv2);
            it$iv2 = value$iv2;
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.DisposableEffect(transition2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) it$iv2, $composer, 0);
        if (transition.isSeeking()) {
            transition2.seek(t, t2, transition.getLastSeekedTimeNanos());
        } else {
            transition2.updateTarget$animation_core_release(t2);
            transition2.setSeeking$animation_core_release(false);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        return transition2;
    }

    public static final <S, T, V extends AnimationVector> State<T> animateValue(Transition<S> transition, TwoWayConverter<T, V> twoWayConverter, Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<T>> function3, String label, Function3<? super S, ? super Composer, ? super Integer, ? extends T> function32, Composer $composer, int $changed, int i) {
        String label2;
        ComposerKt.sourceInformationMarkerStart($composer, -142660079, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli");
        if ((i & 2) != 0) {
            Function3 transitionSpec = new Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<T>>() { // from class: androidx.compose.animation.core.TransitionKt.animateValue.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object p1, Composer composer, Integer num) {
                    return invoke((Transition.Segment) p1, composer, num.intValue());
                }

                public final SpringSpec<T> invoke(Transition.Segment<S> segment, Composer $composer2, int $changed2) {
                    $composer2.startReplaceGroup(-895531546);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-895531546, $changed2, -1, "androidx.compose.animation.core.animateValue.<anonymous> (Transition.kt:1827)");
                    }
                    SpringSpec<T> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    $composer2.endReplaceGroup();
                    return springSpecSpring$default;
                }
            };
            function3 = transitionSpec;
        }
        if ((i & 4) == 0) {
            label2 = label;
        } else {
            label2 = "ValueAnimation";
        }
        Object initialValue = function32.invoke(transition.getCurrentState(), $composer, Integer.valueOf(($changed >> 9) & 112));
        Object targetValue = function32.invoke(transition.getTargetState(), $composer, Integer.valueOf(($changed >> 9) & 112));
        FiniteAnimationSpec animationSpec = function3.invoke(transition.getSegment(), $composer, Integer.valueOf(($changed >> 3) & 112));
        State<T> stateCreateTransitionAnimation = createTransitionAnimation(transition, initialValue, targetValue, animationSpec, twoWayConverter, label2, $composer, ($changed & 14) | (57344 & ($changed << 9)) | (($changed << 6) & 458752));
        ComposerKt.sourceInformationMarkerEnd($composer);
        return stateCreateTransitionAnimation;
    }

    public static final <S, T, V extends AnimationVector> State<T> createTransitionAnimation(final Transition<S> transition, T t, T t2, FiniteAnimationSpec<T> finiteAnimationSpec, TwoWayConverter<T, V> twoWayConverter, String label, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -304821198, "C(createTransitionAnimation)P(1,3!1,4)1850@78332L543,1862@78880L91,1864@79015L108,1864@78977L146:Transition.kt#pdpnli");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-304821198, $changed, -1, "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:1848)");
        }
        ComposerKt.sourceInformationMarkerStart($composer, 1397710670, "CC(remember):Transition.kt#9igjgp");
        boolean z = true;
        boolean invalid$iv = ((($changed & 14) ^ 6) > 4 && $composer.changed(transition)) || ($changed & 6) == 4;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
            Object value$iv = transition.new TransitionAnimationState(t, AnimationStateKt.createZeroVectorFrom(twoWayConverter, t2), twoWayConverter, label);
            $composer.updateRememberedValue(value$iv);
            it$iv = value$iv;
        }
        final Transition.TransitionAnimationState transitionAnimation = (Transition.TransitionAnimationState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        UpdateInitialAndTargetValues(transition, transitionAnimation, t, t2, finiteAnimationSpec, $composer, ($changed & 14) | ((($changed >> 3) & 8) << 6) | (($changed << 3) & User32.WM_PENWINFIRST) | ((($changed >> 3) & 8) << 9) | (($changed << 3) & GL11.GL_RENDER) | (57344 & ($changed << 3)));
        ComposerKt.sourceInformationMarkerStart($composer, 1397732091, "CC(remember):Transition.kt#9igjgp");
        if (((($changed & 14) ^ 6) <= 4 || !$composer.changed(transition)) && ($changed & 6) != 4) {
            z = false;
        }
        boolean invalid$iv2 = $composer.changed(transitionAnimation) | z;
        Object it$iv2 = $composer.rememberedValue();
        if (invalid$iv2 || it$iv2 == Composer.INSTANCE.getEmpty()) {
            Object value$iv2 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final DisposableEffectResult invoke(DisposableEffectScope $this$DisposableEffect) {
                    transition.addAnimation$animation_core_release(transitionAnimation);
                    final Transition<S> transition2 = transition;
                    final Transition<S>.TransitionAnimationState<T, V> transitionAnimationState = transitionAnimation;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            transition2.removeAnimation$animation_core_release(transitionAnimationState);
                        }
                    };
                }
            };
            $composer.updateRememberedValue(value$iv2);
            it$iv2 = value$iv2;
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.DisposableEffect(transitionAnimation, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) it$iv2, $composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        return transitionAnimation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <S, T, V extends AnimationVector> void UpdateInitialAndTargetValues(final Transition<S> transition, final Transition<S>.TransitionAnimationState<T, V> transitionAnimationState, final T t, final T t2, final FiniteAnimationSpec<T> finiteAnimationSpec, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(867041821);
        ComposerKt.sourceInformation($composer2, "C(UpdateInitialAndTargetValues)P(3,1,2):Transition.kt#pdpnli");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(transition) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(transitionAnimationState) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= ($changed & 512) == 0 ? $composer2.changed(t) : $composer2.changedInstance(t) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= ($changed & 4096) == 0 ? $composer2.changed(t2) : $composer2.changedInstance(t2) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= (32768 & $changed) == 0 ? $composer2.changed(finiteAnimationSpec) : $composer2.changedInstance(finiteAnimationSpec) ? 16384 : 8192;
        }
        if ($composer2.shouldExecute(($dirty & 9363) != 9362, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(867041821, $dirty, -1, "androidx.compose.animation.core.UpdateInitialAndTargetValues (Transition.kt:1880)");
            }
            if (transition.isSeeking()) {
                transitionAnimationState.updateInitialAndTargetValue$animation_core_release(t, t2, finiteAnimationSpec);
            } else {
                transitionAnimationState.updateTargetValue$animation_core_release(t2, finiteAnimationSpec);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.core.TransitionKt.UpdateInitialAndTargetValues.1
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
                    TransitionKt.UpdateInitialAndTargetValues(transition, transitionAnimationState, t, t2, finiteAnimationSpec, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1));
                }
            });
        }
    }

    public static final <S> State<Float> animateFloat(Transition<S> transition, Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Float>> function3, String label, Function3<? super S, ? super Composer, ? super Integer, Float> function32, Composer $composer, int $changed, int i) {
        ComposerKt.sourceInformationMarkerStart($composer, -1338768149, "CC(animateFloat)P(2)1924@81822L78:Transition.kt#pdpnli");
        Function3 transitionSpec = (i & 1) != 0 ? new Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Float>>() { // from class: androidx.compose.animation.core.TransitionKt.animateFloat.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ SpringSpec<Float> invoke(Object p1, Composer composer, Integer num) {
                return invoke((Transition.Segment) p1, composer, num.intValue());
            }

            public final SpringSpec<Float> invoke(Transition.Segment<S> segment, Composer $composer2, int $changed2) {
                $composer2.startReplaceGroup(-522164544);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-522164544, $changed2, -1, "androidx.compose.animation.core.animateFloat.<anonymous> (Transition.kt:1920)");
                }
                SpringSpec<Float> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                $composer2.endReplaceGroup();
                return springSpecSpring$default;
            }
        } : function3;
        String label2 = (i & 2) != 0 ? "FloatAnimation" : label;
        TwoWayConverter typeConverter$iv = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        int $changed$iv = ($changed & 14) | (($changed << 3) & User32.WM_PENWINFIRST) | (($changed << 3) & GL11.GL_RENDER) | (($changed << 3) & 57344);
        String label$iv = label2;
        Function3 transitionSpec$iv = transitionSpec;
        ComposerKt.sourceInformationMarkerStart($composer, -142660079, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli");
        Object initialValue$iv = function32.invoke(transition.getCurrentState(), $composer, Integer.valueOf(($changed$iv >> 9) & 112));
        Object targetValue$iv = function32.invoke(transition.getTargetState(), $composer, Integer.valueOf(($changed$iv >> 9) & 112));
        FiniteAnimationSpec<Float> animationSpec$iv = transitionSpec$iv.invoke(transition.getSegment(), $composer, Integer.valueOf(($changed$iv >> 3) & 112));
        State<Float> stateCreateTransitionAnimation = createTransitionAnimation(transition, initialValue$iv, targetValue$iv, animationSpec$iv, typeConverter$iv, label$iv, $composer, (($changed$iv << 9) & 57344) | ($changed$iv & 14) | (($changed$iv << 6) & 458752));
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        return stateCreateTransitionAnimation;
    }

    public static final <S> State<Dp> animateDp(Transition<S> transition, Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Dp>> function3, String label, Function3<? super S, ? super Composer, ? super Integer, Dp> function32, Composer $composer, int $changed, int i) {
        ComposerKt.sourceInformationMarkerStart($composer, 184732935, "CC(animateDp)P(2)1954@83539L75:Transition.kt#pdpnli");
        Function3 transitionSpec = (i & 1) != 0 ? new Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Dp>>() { // from class: androidx.compose.animation.core.TransitionKt.animateDp.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ SpringSpec<Dp> invoke(Object p1, Composer composer, Integer num) {
                return invoke((Transition.Segment) p1, composer, num.intValue());
            }

            public final SpringSpec<Dp> invoke(Transition.Segment<S> segment, Composer $composer2, int $changed2) {
                $composer2.startReplaceGroup(-575880366);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-575880366, $changed2, -1, "androidx.compose.animation.core.animateDp.<anonymous> (Transition.kt:1950)");
                }
                SpringSpec<Dp> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, Dp.m7016boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Dp.INSTANCE)), 3, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                $composer2.endReplaceGroup();
                return springSpecSpring$default;
            }
        } : function3;
        String label2 = (i & 2) != 0 ? "DpAnimation" : label;
        TwoWayConverter typeConverter$iv = VectorConvertersKt.getVectorConverter(Dp.INSTANCE);
        int $changed$iv = ($changed & 14) | (($changed << 3) & User32.WM_PENWINFIRST) | (($changed << 3) & GL11.GL_RENDER) | (($changed << 3) & 57344);
        String label$iv = label2;
        Function3 transitionSpec$iv = transitionSpec;
        ComposerKt.sourceInformationMarkerStart($composer, -142660079, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli");
        Object initialValue$iv = function32.invoke(transition.getCurrentState(), $composer, Integer.valueOf(($changed$iv >> 9) & 112));
        Object targetValue$iv = function32.invoke(transition.getTargetState(), $composer, Integer.valueOf(($changed$iv >> 9) & 112));
        FiniteAnimationSpec<Dp> animationSpec$iv = transitionSpec$iv.invoke(transition.getSegment(), $composer, Integer.valueOf(($changed$iv >> 3) & 112));
        State<Dp> stateCreateTransitionAnimation = createTransitionAnimation(transition, initialValue$iv, targetValue$iv, animationSpec$iv, typeConverter$iv, label$iv, $composer, (($changed$iv << 9) & 57344) | ($changed$iv & 14) | (($changed$iv << 6) & 458752));
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        return stateCreateTransitionAnimation;
    }

    public static final <S> State<Offset> animateOffset(Transition<S> transition, Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Offset>> function3, String label, Function3<? super S, ? super Composer, ? super Integer, Offset> function32, Composer $composer, int $changed, int i) {
        ComposerKt.sourceInformationMarkerStart($composer, 2078477582, "CC(animateOffset)P(2)1984@85282L79:Transition.kt#pdpnli");
        Function3 transitionSpec = (i & 1) != 0 ? new Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Offset>>() { // from class: androidx.compose.animation.core.TransitionKt.animateOffset.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ SpringSpec<Offset> invoke(Object p1, Composer composer, Integer num) {
                return invoke((Transition.Segment) p1, composer, num.intValue());
            }

            public final SpringSpec<Offset> invoke(Transition.Segment<S> segment, Composer $composer2, int $changed2) {
                $composer2.startReplaceGroup(1623385561);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1623385561, $changed2, -1, "androidx.compose.animation.core.animateOffset.<anonymous> (Transition.kt:1980)");
                }
                SpringSpec<Offset> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, Offset.m4138boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Offset.INSTANCE)), 3, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                $composer2.endReplaceGroup();
                return springSpecSpring$default;
            }
        } : function3;
        String label2 = (i & 2) != 0 ? "OffsetAnimation" : label;
        TwoWayConverter typeConverter$iv = VectorConvertersKt.getVectorConverter(Offset.INSTANCE);
        int $changed$iv = ($changed & 14) | (($changed << 3) & User32.WM_PENWINFIRST) | (($changed << 3) & GL11.GL_RENDER) | (($changed << 3) & 57344);
        String label$iv = label2;
        Function3 transitionSpec$iv = transitionSpec;
        ComposerKt.sourceInformationMarkerStart($composer, -142660079, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli");
        Object initialValue$iv = function32.invoke(transition.getCurrentState(), $composer, Integer.valueOf(($changed$iv >> 9) & 112));
        Object targetValue$iv = function32.invoke(transition.getTargetState(), $composer, Integer.valueOf(($changed$iv >> 9) & 112));
        FiniteAnimationSpec<Offset> animationSpec$iv = transitionSpec$iv.invoke(transition.getSegment(), $composer, Integer.valueOf(($changed$iv >> 3) & 112));
        State<Offset> stateCreateTransitionAnimation = createTransitionAnimation(transition, initialValue$iv, targetValue$iv, animationSpec$iv, typeConverter$iv, label$iv, $composer, (($changed$iv << 9) & 57344) | ($changed$iv & 14) | (($changed$iv << 6) & 458752));
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        return stateCreateTransitionAnimation;
    }

    public static final <S> State<Size> animateSize(Transition<S> transition, Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Size>> function3, String label, Function3<? super S, ? super Composer, ? super Integer, Size> function32, Composer $composer, int $changed, int i) {
        ComposerKt.sourceInformationMarkerStart($composer, -802210820, "CC(animateSize)P(2)2014@87014L77:Transition.kt#pdpnli");
        Function3 transitionSpec = (i & 1) != 0 ? new Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Size>>() { // from class: androidx.compose.animation.core.TransitionKt.animateSize.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ SpringSpec<Size> invoke(Object p1, Composer composer, Integer num) {
                return invoke((Transition.Segment) p1, composer, num.intValue());
            }

            public final SpringSpec<Size> invoke(Transition.Segment<S> segment, Composer $composer2, int $changed2) {
                $composer2.startReplaceGroup(-1607152761);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1607152761, $changed2, -1, "androidx.compose.animation.core.animateSize.<anonymous> (Transition.kt:2010)");
                }
                SpringSpec<Size> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, Size.m4206boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Size.INSTANCE)), 3, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                $composer2.endReplaceGroup();
                return springSpecSpring$default;
            }
        } : function3;
        String label2 = (i & 2) != 0 ? "SizeAnimation" : label;
        TwoWayConverter typeConverter$iv = VectorConvertersKt.getVectorConverter(Size.INSTANCE);
        int $changed$iv = ($changed & 14) | (($changed << 3) & User32.WM_PENWINFIRST) | (($changed << 3) & GL11.GL_RENDER) | (($changed << 3) & 57344);
        String label$iv = label2;
        Function3 transitionSpec$iv = transitionSpec;
        ComposerKt.sourceInformationMarkerStart($composer, -142660079, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli");
        Object initialValue$iv = function32.invoke(transition.getCurrentState(), $composer, Integer.valueOf(($changed$iv >> 9) & 112));
        Object targetValue$iv = function32.invoke(transition.getTargetState(), $composer, Integer.valueOf(($changed$iv >> 9) & 112));
        FiniteAnimationSpec<Size> animationSpec$iv = transitionSpec$iv.invoke(transition.getSegment(), $composer, Integer.valueOf(($changed$iv >> 3) & 112));
        State<Size> stateCreateTransitionAnimation = createTransitionAnimation(transition, initialValue$iv, targetValue$iv, animationSpec$iv, typeConverter$iv, label$iv, $composer, (($changed$iv << 9) & 57344) | ($changed$iv & 14) | (($changed$iv << 6) & 458752));
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        return stateCreateTransitionAnimation;
    }

    public static final <S> State<IntOffset> animateIntOffset(Transition<S> transition, Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<IntOffset>> function3, String label, Function3<? super S, ? super Composer, ? super Integer, IntOffset> function32, Composer $composer, int $changed, int i) {
        ComposerKt.sourceInformationMarkerStart($composer, 776131825, "CC(animateIntOffset)P(2)2048@88801L82:Transition.kt#pdpnli");
        Function3 transitionSpec = (i & 1) != 0 ? new Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<IntOffset>>() { // from class: androidx.compose.animation.core.TransitionKt.animateIntOffset.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ SpringSpec<IntOffset> invoke(Object p1, Composer composer, Integer num) {
                return invoke((Transition.Segment) p1, composer, num.intValue());
            }

            public final SpringSpec<IntOffset> invoke(Transition.Segment<S> segment, Composer $composer2, int $changed2) {
                $composer2.startReplaceGroup(-1953479610);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1953479610, $changed2, -1, "androidx.compose.animation.core.animateIntOffset.<anonymous> (Transition.kt:2043)");
                }
                SpringSpec<IntOffset> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m7137boximpl(IntOffset.m7140constructorimpl((1 << 32) | (1 & 4294967295L))), 3, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                $composer2.endReplaceGroup();
                return springSpecSpring$default;
            }
        } : function3;
        String label2 = (i & 2) != 0 ? "IntOffsetAnimation" : label;
        TwoWayConverter typeConverter$iv = VectorConvertersKt.getVectorConverter(IntOffset.INSTANCE);
        int $changed$iv = ($changed & 14) | (($changed << 3) & User32.WM_PENWINFIRST) | (($changed << 3) & GL11.GL_RENDER) | (($changed << 3) & 57344);
        String label$iv = label2;
        Function3 transitionSpec$iv = transitionSpec;
        ComposerKt.sourceInformationMarkerStart($composer, -142660079, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli");
        Object initialValue$iv = function32.invoke(transition.getCurrentState(), $composer, Integer.valueOf(($changed$iv >> 9) & 112));
        Object targetValue$iv = function32.invoke(transition.getTargetState(), $composer, Integer.valueOf(($changed$iv >> 9) & 112));
        FiniteAnimationSpec<IntOffset> animationSpec$iv = transitionSpec$iv.invoke(transition.getSegment(), $composer, Integer.valueOf(($changed$iv >> 3) & 112));
        State<IntOffset> stateCreateTransitionAnimation = createTransitionAnimation(transition, initialValue$iv, targetValue$iv, animationSpec$iv, typeConverter$iv, label$iv, $composer, (($changed$iv << 9) & 57344) | ($changed$iv & 14) | (($changed$iv << 6) & 458752));
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        return stateCreateTransitionAnimation;
    }

    public static final <S> State<Integer> animateInt(Transition<S> transition, Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Integer>> function3, String label, Function3<? super S, ? super Composer, ? super Integer, Integer> function32, Composer $composer, int $changed, int i) {
        ComposerKt.sourceInformationMarkerStart($composer, 1318902782, "CC(animateInt)P(2)2078@90507L76:Transition.kt#pdpnli");
        Function3 transitionSpec = (i & 1) != 0 ? new Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Integer>>() { // from class: androidx.compose.animation.core.TransitionKt.animateInt.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ SpringSpec<Integer> invoke(Object p1, Composer composer, Integer num) {
                return invoke((Transition.Segment) p1, composer, num.intValue());
            }

            public final SpringSpec<Integer> invoke(Transition.Segment<S> segment, Composer $composer2, int $changed2) {
                $composer2.startReplaceGroup(-785273069);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-785273069, $changed2, -1, "androidx.compose.animation.core.animateInt.<anonymous> (Transition.kt:2074)");
                }
                SpringSpec<Integer> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, 1, 3, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                $composer2.endReplaceGroup();
                return springSpecSpring$default;
            }
        } : function3;
        String label2 = (i & 2) != 0 ? "IntAnimation" : label;
        TwoWayConverter typeConverter$iv = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
        int $changed$iv = ($changed & 14) | (($changed << 3) & User32.WM_PENWINFIRST) | (($changed << 3) & GL11.GL_RENDER) | (($changed << 3) & 57344);
        String label$iv = label2;
        Function3 transitionSpec$iv = transitionSpec;
        ComposerKt.sourceInformationMarkerStart($composer, -142660079, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli");
        Object initialValue$iv = function32.invoke(transition.getCurrentState(), $composer, Integer.valueOf(($changed$iv >> 9) & 112));
        Object targetValue$iv = function32.invoke(transition.getTargetState(), $composer, Integer.valueOf(($changed$iv >> 9) & 112));
        FiniteAnimationSpec<Integer> animationSpec$iv = transitionSpec$iv.invoke(transition.getSegment(), $composer, Integer.valueOf(($changed$iv >> 3) & 112));
        State<Integer> stateCreateTransitionAnimation = createTransitionAnimation(transition, initialValue$iv, targetValue$iv, animationSpec$iv, typeConverter$iv, label$iv, $composer, (($changed$iv << 9) & 57344) | ($changed$iv & 14) | (($changed$iv << 6) & 458752));
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        return stateCreateTransitionAnimation;
    }

    public static final <S> State<IntSize> animateIntSize(Transition<S> transition, Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<IntSize>> function3, String label, Function3<? super S, ? super Composer, ? super Integer, IntSize> function32, Composer $composer, int $changed, int i) {
        ComposerKt.sourceInformationMarkerStart($composer, -2104123233, "CC(animateIntSize)P(2)2109@92259L80:Transition.kt#pdpnli");
        Function3 transitionSpec = (i & 1) != 0 ? new Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<IntSize>>() { // from class: androidx.compose.animation.core.TransitionKt.animateIntSize.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ SpringSpec<IntSize> invoke(Object p1, Composer composer, Integer num) {
                return invoke((Transition.Segment) p1, composer, num.intValue());
            }

            public final SpringSpec<IntSize> invoke(Transition.Segment<S> segment, Composer $composer2, int $changed2) {
                $composer2.startReplaceGroup(967893300);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(967893300, $changed2, -1, "androidx.compose.animation.core.animateIntSize.<anonymous> (Transition.kt:2105)");
                }
                SpringSpec<IntSize> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m7181boximpl(IntSize.m7184constructorimpl((1 << 32) | (1 & 4294967295L))), 3, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                $composer2.endReplaceGroup();
                return springSpecSpring$default;
            }
        } : function3;
        String label2 = (i & 2) != 0 ? "IntSizeAnimation" : label;
        TwoWayConverter typeConverter$iv = VectorConvertersKt.getVectorConverter(IntSize.INSTANCE);
        int $changed$iv = ($changed & 14) | (($changed << 3) & User32.WM_PENWINFIRST) | (($changed << 3) & GL11.GL_RENDER) | (($changed << 3) & 57344);
        String label$iv = label2;
        Function3 transitionSpec$iv = transitionSpec;
        ComposerKt.sourceInformationMarkerStart($composer, -142660079, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli");
        Object initialValue$iv = function32.invoke(transition.getCurrentState(), $composer, Integer.valueOf(($changed$iv >> 9) & 112));
        Object targetValue$iv = function32.invoke(transition.getTargetState(), $composer, Integer.valueOf(($changed$iv >> 9) & 112));
        FiniteAnimationSpec<IntSize> animationSpec$iv = transitionSpec$iv.invoke(transition.getSegment(), $composer, Integer.valueOf(($changed$iv >> 3) & 112));
        State<IntSize> stateCreateTransitionAnimation = createTransitionAnimation(transition, initialValue$iv, targetValue$iv, animationSpec$iv, typeConverter$iv, label$iv, $composer, (($changed$iv << 9) & 57344) | ($changed$iv & 14) | (($changed$iv << 6) & 458752));
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        return stateCreateTransitionAnimation;
    }

    public static final <S> State<Rect> animateRect(Transition<S> transition, Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Rect>> function3, String label, Function3<? super S, ? super Composer, ? super Integer, Rect> function32, Composer $composer, int $changed, int i) {
        ComposerKt.sourceInformationMarkerStart($composer, 1496278239, "CC(animateRect)P(2)2139@93992L77:Transition.kt#pdpnli");
        Function3 transitionSpec = (i & 1) != 0 ? new Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Rect>>() { // from class: androidx.compose.animation.core.TransitionKt.animateRect.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ SpringSpec<Rect> invoke(Object p1, Composer composer, Integer num) {
                return invoke((Transition.Segment) p1, composer, num.intValue());
            }

            public final SpringSpec<Rect> invoke(Transition.Segment<S> segment, Composer $composer2, int $changed2) {
                $composer2.startReplaceGroup(691336298);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(691336298, $changed2, -1, "androidx.compose.animation.core.animateRect.<anonymous> (Transition.kt:2135)");
                }
                SpringSpec<Rect> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.INSTANCE), 3, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                $composer2.endReplaceGroup();
                return springSpecSpring$default;
            }
        } : function3;
        String label2 = (i & 2) != 0 ? "RectAnimation" : label;
        TwoWayConverter typeConverter$iv = VectorConvertersKt.getVectorConverter(Rect.INSTANCE);
        int $changed$iv = ($changed & 14) | (($changed << 3) & User32.WM_PENWINFIRST) | (($changed << 3) & GL11.GL_RENDER) | (($changed << 3) & 57344);
        String label$iv = label2;
        Function3 transitionSpec$iv = transitionSpec;
        ComposerKt.sourceInformationMarkerStart($composer, -142660079, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli");
        Object initialValue$iv = function32.invoke(transition.getCurrentState(), $composer, Integer.valueOf(($changed$iv >> 9) & 112));
        Object targetValue$iv = function32.invoke(transition.getTargetState(), $composer, Integer.valueOf(($changed$iv >> 9) & 112));
        FiniteAnimationSpec<Rect> animationSpec$iv = transitionSpec$iv.invoke(transition.getSegment(), $composer, Integer.valueOf(($changed$iv >> 3) & 112));
        State<Rect> stateCreateTransitionAnimation = createTransitionAnimation(transition, initialValue$iv, targetValue$iv, animationSpec$iv, typeConverter$iv, label$iv, $composer, (($changed$iv << 9) & 57344) | ($changed$iv & 14) | (($changed$iv << 6) & 458752));
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        return stateCreateTransitionAnimation;
    }
}
