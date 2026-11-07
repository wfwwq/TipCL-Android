package com.pymcl.android.ui.pages;

import androidx.compose.runtime.MutableLongState;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.PlaytimeRow;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LaunchPage.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.LaunchPageKt$PlaytimeCard$1$1", f = "LaunchPage.kt", i = {}, l = {443}, m = "invokeSuspend", n = {}, nl = {475}, s = {}, v = 2)
/* loaded from: classes22.dex */
final class LaunchPageKt$PlaytimeCard$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AppState $state;
    final /* synthetic */ MutableLongState $total$delegate;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LaunchPageKt$PlaytimeCard$1$1(AppState appState, MutableLongState mutableLongState, Continuation<? super LaunchPageKt$PlaytimeCard$1$1> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$total$delegate = mutableLongState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LaunchPageKt$PlaytimeCard$1$1(this.$state, this.$total$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LaunchPageKt$PlaytimeCard$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object playtime;
        MutableLongState mutableLongState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                MutableLongState mutableLongState2 = this.$total$delegate;
                this.L$0 = mutableLongState2;
                this.label = 1;
                playtime = this.$state.getApi().getPlaytime(this);
                if (playtime != coroutine_suspended) {
                    mutableLongState = mutableLongState2;
                    break;
                } else {
                    return coroutine_suspended;
                }
            case 1:
                mutableLongState = (MutableLongState) this.L$0;
                ResultKt.throwOnFailure($result);
                playtime = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Iterator it = ((Iterable) playtime).iterator();
        long seconds = 0;
        while (it.hasNext()) {
            seconds += ((PlaytimeRow) it.next()).getSeconds();
        }
        mutableLongState.setLongValue(seconds);
        return Unit.INSTANCE;
    }
}
