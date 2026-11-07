package com.pymcl.android.ui.pages;

import android.content.Context;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import com.pymcl.android.data.LaunchConfigIO;
import com.pymcl.android.ui.state.AppState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: LaunchPage.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.LaunchPageKt$ConfigCard$1$1", f = "LaunchPage.kt", i = {}, l = {256}, m = "invokeSuspend", n = {}, nl = {258}, s = {}, v = 2)
/* loaded from: classes22.dex */
final class LaunchPageKt$ConfigCard$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<String> $h$delegate;
    final /* synthetic */ MutableIntState $java$delegate;
    final /* synthetic */ MutableState<LaunchConfigIO.State> $loaded$delegate;
    final /* synthetic */ MutableFloatState $mem$delegate;
    final /* synthetic */ AppState $state;
    final /* synthetic */ MutableState<String> $w$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LaunchPageKt$ConfigCard$1$1(Context context, AppState appState, MutableFloatState mutableFloatState, MutableState<String> mutableState, MutableState<String> mutableState2, MutableIntState mutableIntState, MutableState<LaunchConfigIO.State> mutableState3, Continuation<? super LaunchPageKt$ConfigCard$1$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$state = appState;
        this.$mem$delegate = mutableFloatState;
        this.$w$delegate = mutableState;
        this.$h$delegate = mutableState2;
        this.$java$delegate = mutableIntState;
        this.$loaded$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LaunchPageKt$ConfigCard$1$1(this.$ctx, this.$state, this.$mem$delegate, this.$w$delegate, this.$h$delegate, this.$java$delegate, this.$loaded$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LaunchPageKt$ConfigCard$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objWithContext;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new LaunchPageKt$ConfigCard$1$1$st$1(this.$ctx, this.$state, null), this);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                objWithContext = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        LaunchConfigIO.State st = (LaunchConfigIO.State) objWithContext;
        if (st == null) {
            return Unit.INSTANCE;
        }
        this.$mem$delegate.setFloatValue(RangesKt.coerceIn(st.getDisplay().getMemoryMb(), 512, Math.max(st.getMemMax(), st.getDisplay().getMemoryMb())));
        this.$w$delegate.setValue(String.valueOf(st.getDisplay().getWidth()));
        this.$h$delegate.setValue(String.valueOf(st.getDisplay().getHeight()));
        this.$java$delegate.setIntValue(st.getJavaIndex());
        this.$loaded$delegate.setValue(st);
        return Unit.INSTANCE;
    }
}
