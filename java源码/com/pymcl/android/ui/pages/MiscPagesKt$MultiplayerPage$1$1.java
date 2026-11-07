package com.pymcl.android.ui.pages;

import android.content.Context;
import com.pymcl.android.data.RepositoryUiApi;
import com.pymcl.android.ui.i18n.I18nKt;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.multiplayer.MultiplayerController;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

/* compiled from: MiscPages.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.MiscPagesKt$MultiplayerPage$1$1", f = "MiscPages.kt", i = {0, 0}, l = {44}, m = "invokeSuspend", n = {"$this$LaunchedEffect", "c"}, nl = {45}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes22.dex */
final class MiscPagesKt$MultiplayerPage$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ AppState $state;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MiscPagesKt$MultiplayerPage$1$1(AppState appState, Context context, Continuation<? super MiscPagesKt$MultiplayerPage$1$1> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$ctx = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MiscPagesKt$MultiplayerPage$1$1 miscPagesKt$MultiplayerPage$1$1 = new MiscPagesKt$MultiplayerPage$1$1(this.$state, this.$ctx, continuation);
        miscPagesKt$MultiplayerPage$1$1.L$0 = obj;
        return miscPagesKt$MultiplayerPage$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MiscPagesKt$MultiplayerPage$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SharedFlow<String> notices;
        MultiplayerController multiplayerControllerM8116constructorimpl;
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                if (this.$state.getApi() instanceof RepositoryUiApi) {
                    Context context = this.$ctx;
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        multiplayerControllerM8116constructorimpl = Result.m8116constructorimpl(MultiplayerController.INSTANCE.get(context));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        multiplayerControllerM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
                    }
                    multiplayerController = Result.m8122isFailureimpl(multiplayerControllerM8116constructorimpl) ? null : multiplayerControllerM8116constructorimpl;
                }
                if (multiplayerController != null && (notices = multiplayerController.getNotices()) != null) {
                    final AppState appState = this.$state;
                    this.L$0 = SpillingKt.nullOutSpilledVariable(coroutineScope);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(multiplayerController);
                    this.label = 1;
                    if (notices.collect(new FlowCollector() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$MultiplayerPage$1$1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object value, Continuation $completion) {
                            return emit((String) value, (Continuation<? super Unit>) $completion);
                        }

                        public final Object emit(String msg, Continuation<? super Unit> continuation) {
                            appState.toast("联机已取消", I18nKt.tr(msg, new Object[0]), "warn");
                            return Unit.INSTANCE;
                        }
                    }, this) != coroutine_suspended) {
                        break;
                    } else {
                        return coroutine_suspended;
                    }
                } else {
                    return Unit.INSTANCE;
                }
                break;
            case 1:
                ResultKt.throwOnFailure(obj);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        throw new KotlinNothingValueException();
    }
}
