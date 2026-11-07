package com.pymcl.android.ui.state;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AppState.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.state.AppState$startGame$2$vid$2$1", f = "AppState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes20.dex */
final class AppState$startGame$2$vid$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $id;
    final /* synthetic */ Float $p;
    int label;
    final /* synthetic */ AppState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppState$startGame$2$vid$2$1(AppState appState, Float f, String str, Continuation<? super AppState$startGame$2$vid$2$1> continuation) {
        super(2, continuation);
        this.this$0 = appState;
        this.$p = f;
        this.$id = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppState$startGame$2$vid$2$1(this.this$0, this.$p, this.$id, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AppState$startGame$2$vid$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TaskRow invokeSuspend$lambda$0(Float $p, TaskRow it) {
        return TaskRow.copy$default(it, null, null, $p, null, null, null, 59, null);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                AppState appState = this.this$0;
                Float launchProgress = this.$p;
                if (launchProgress == null) {
                    launchProgress = this.this$0.getLaunchProgress();
                }
                appState.setLaunchProgress(launchProgress);
                AppState appState2 = this.this$0;
                String str = this.$id;
                final Float f = this.$p;
                appState2.updateTask(str, new Function1() { // from class: com.pymcl.android.ui.state.AppState$startGame$2$vid$2$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AppState$startGame$2$vid$2$1.invokeSuspend$lambda$0(f, (TaskRow) obj);
                    }
                });
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
