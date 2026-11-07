package com.pymcl.android.ui.pages;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import com.pymcl.android.ui.theme.PyMotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LaunchPage.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.LaunchPageKt$DashCanvas$1$2$1$1", f = "LaunchPage.kt", i = {}, l = {93, 93}, m = "invokeSuspend", n = {}, nl = {93, -1}, s = {}, v = 2)
/* loaded from: classes22.dex */
final class LaunchPageKt$DashCanvas$1$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $appear;
    final /* synthetic */ int $idx;
    final /* synthetic */ PyMotion $mo;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LaunchPageKt$DashCanvas$1$2$1$1(int i, PyMotion pyMotion, Animatable<Float, AnimationVector1D> animatable, Continuation<? super LaunchPageKt$DashCanvas$1$2$1$1> continuation) {
        super(2, continuation);
        this.$idx = i;
        this.$mo = pyMotion;
        this.$appear = animatable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LaunchPageKt$DashCanvas$1$2$1$1(this.$idx, this.$mo, this.$appear, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LaunchPageKt$DashCanvas$1$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.label
            switch(r1) {
                case 0: goto L19;
                case 1: goto L15;
                case 2: goto L11;
                default: goto L9;
            }
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L11:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L64
        L15:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L39
        L19:
            kotlin.ResultKt.throwOnFailure(r11)
            int r1 = r10.$idx
            com.pymcl.android.ui.theme.PyMotion r2 = r10.$mo
            int r2 = r2.getStaggerStep()
            int r1 = r1 * r2
            long r1 = (long) r1
            r3 = 320(0x140, double:1.58E-321)
            long r1 = kotlin.ranges.RangesKt.coerceAtMost(r1, r3)
            r3 = r10
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            r4 = 1
            r10.label = r4
            java.lang.Object r1 = kotlinx.coroutines.DelayKt.delay(r1, r3)
            if (r1 != r0) goto L39
            return r0
        L39:
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r2 = r10.$appear
            r1 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r3 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r1)
            com.pymcl.android.ui.theme.PyMotion r1 = r10.$mo
            r4 = 220(0xdc, float:3.08E-43)
            int r1 = r1.ms(r4)
            r4 = 0
            r5 = 6
            r6 = 0
            androidx.compose.animation.core.TweenSpec r1 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r1, r4, r6, r5, r6)
            r4 = r1
            androidx.compose.animation.core.AnimationSpec r4 = (androidx.compose.animation.core.AnimationSpec) r4
            r7 = r10
            kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
            r1 = 2
            r10.label = r1
            r5 = 0
            r8 = 12
            r9 = 0
            java.lang.Object r1 = androidx.compose.animation.core.Animatable.animateTo$default(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r1 != r0) goto L64
            return r0
        L64:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.LaunchPageKt$DashCanvas$1$2$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
