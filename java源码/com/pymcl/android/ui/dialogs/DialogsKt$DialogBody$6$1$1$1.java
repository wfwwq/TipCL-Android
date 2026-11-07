package com.pymcl.android.ui.dialogs;

import androidx.compose.runtime.MutableState;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.DialogSpec;
import com.pymcl.android.ui.state.LauncherUiApi;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Dialogs.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.dialogs.DialogsKt$DialogBody$6$1$1$1", f = "Dialogs.kt", i = {0, 0}, l = {97}, m = "invokeSuspend", n = {"$this$launch", "$this$invokeSuspend_u24lambda_u240\\1"}, nl = {97}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes18.dex */
final class DialogsKt$DialogBody$6$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $busy$delegate;
    final /* synthetic */ Function0<Unit> $close;
    final /* synthetic */ DialogSpec $d;
    final /* synthetic */ MutableState<String> $n$delegate;
    final /* synthetic */ AppState $state;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DialogsKt$DialogBody$6$1$1$1(AppState appState, MutableState<String> mutableState, DialogSpec dialogSpec, Function0<Unit> function0, MutableState<Boolean> mutableState2, Continuation<? super DialogsKt$DialogBody$6$1$1$1> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$n$delegate = mutableState;
        this.$d = dialogSpec;
        this.$close = function0;
        this.$busy$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DialogsKt$DialogBody$6$1$1$1 dialogsKt$DialogBody$6$1$1$1 = new DialogsKt$DialogBody$6$1$1$1(this.$state, this.$n$delegate, this.$d, this.$close, this.$busy$delegate, continuation);
        dialogsKt$DialogBody$6$1$1$1.L$0 = obj;
        return dialogsKt$DialogBody$6$1$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DialogsKt$DialogBody$6$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objM8116constructorimpl;
        CoroutineScope $this$launch = (CoroutineScope) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    AppState appState = this.$state;
                    MutableState<String> mutableState = this.$n$delegate;
                    Result.Companion companion = Result.INSTANCE;
                    LauncherUiApi api = appState.getApi();
                    String strDialogBody$lambda$9 = DialogsKt.DialogBody$lambda$9(mutableState);
                    this.L$0 = SpillingKt.nullOutSpilledVariable($this$launch);
                    this.L$1 = SpillingKt.nullOutSpilledVariable($this$launch);
                    this.label = 1;
                    if (api.addOfflineAccount(strDialogBody$lambda$9, this) != coroutine_suspended) {
                        break;
                    } else {
                        return coroutine_suspended;
                    }
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objM8116constructorimpl = Result.m8116constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        AppState appState2 = this.$state;
        DialogSpec dialogSpec = this.$d;
        Function0<Unit> function0 = this.$close;
        if (Result.m8123isSuccessimpl(objM8116constructorimpl)) {
            AppState.toast$default(appState2, Intrinsics.areEqual(dialogSpec, DialogSpec.AccountGate.INSTANCE) ? "已创建离线用户" : "已添加", null, null, 6, null);
            function0.invoke();
            if (Intrinsics.areEqual(dialogSpec, DialogSpec.AccountGate.INSTANCE)) {
                appState2.resumePendingLaunch();
            } else {
                appState2.refreshData();
            }
        }
        AppState appState3 = this.$state;
        MutableState<Boolean> mutableState2 = this.$busy$delegate;
        Throwable thM8119exceptionOrNullimpl = Result.m8119exceptionOrNullimpl(objM8116constructorimpl);
        if (thM8119exceptionOrNullimpl != null) {
            DialogsKt.DialogBody$lambda$13(mutableState2, false);
            String message = thM8119exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            appState3.toast("添加失败", message, "error");
        }
        return Unit.INSTANCE;
    }
}
