package com.pymcl.android.ui.pages;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.core.instance.ServerEntry;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MiscPages.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.MiscPagesKt$ServersPage$1$1", f = "MiscPages.kt", i = {}, l = {174}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes22.dex */
final class MiscPagesKt$ServersPage$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<List<ServerEntry>> $all$delegate;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<String> $inst$delegate;
    final /* synthetic */ MutableState<List<String>> $instances$delegate;
    final /* synthetic */ MutableState<Boolean> $loading$delegate;
    final /* synthetic */ AppState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MiscPagesKt$ServersPage$1$1(AppState appState, MutableState<Boolean> mutableState, Context context, MutableState<String> mutableState2, MutableState<List<String>> mutableState3, MutableState<List<ServerEntry>> mutableState4, Continuation<? super MiscPagesKt$ServersPage$1$1> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$loading$delegate = mutableState;
        this.$ctx = context;
        this.$inst$delegate = mutableState2;
        this.$instances$delegate = mutableState3;
        this.$all$delegate = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MiscPagesKt$ServersPage$1$1(this.$state, this.$loading$delegate, this.$ctx, this.$inst$delegate, this.$instances$delegate, this.$all$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MiscPagesKt$ServersPage$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                if (MiscPagesKt.ServersPage$load(this.$state, this.$loading$delegate, this.$ctx, this.$inst$delegate, this.$instances$delegate, this.$all$delegate, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
