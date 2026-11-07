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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Dialogs.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.dialogs.DialogsKt$DialogBody$14$3$1$1", f = "Dialogs.kt", i = {0, 0}, l = {181}, m = "invokeSuspend", n = {"$this$launch", "$this$invokeSuspend_u24lambda_u240\\1"}, nl = {181}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes18.dex */
final class DialogsKt$DialogBody$14$3$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $close;
    final /* synthetic */ DialogSpec $d;
    final /* synthetic */ String $modelId;
    final /* synthetic */ MutableState<String> $picked$delegate;
    final /* synthetic */ AppState $state;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DialogsKt$DialogBody$14$3$1$1(AppState appState, DialogSpec dialogSpec, String str, MutableState<String> mutableState, Function0<Unit> function0, Continuation<? super DialogsKt$DialogBody$14$3$1$1> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$d = dialogSpec;
        this.$modelId = str;
        this.$picked$delegate = mutableState;
        this.$close = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DialogsKt$DialogBody$14$3$1$1 dialogsKt$DialogBody$14$3$1$1 = new DialogsKt$DialogBody$14$3$1$1(this.$state, this.$d, this.$modelId, this.$picked$delegate, this.$close, continuation);
        dialogsKt$DialogBody$14$3$1$1.L$0 = obj;
        return dialogsKt$DialogBody$14$3$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DialogsKt$DialogBody$14$3$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    DialogSpec dialogSpec = this.$d;
                    String str = this.$modelId;
                    MutableState<String> mutableState = this.$picked$delegate;
                    Result.Companion companion = Result.INSTANCE;
                    LauncherUiApi api = appState.getApi();
                    String account = ((DialogSpec.Skin) dialogSpec).getAccount();
                    String strDialogBody$lambda$44 = DialogsKt.DialogBody$lambda$44(mutableState);
                    this.L$0 = SpillingKt.nullOutSpilledVariable($this$launch);
                    this.L$1 = SpillingKt.nullOutSpilledVariable($this$launch);
                    this.label = 1;
                    if (api.setAccountSkin(account, strDialogBody$lambda$44, str, this) != coroutine_suspended) {
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
        Function0<Unit> function0 = this.$close;
        AppState appState2 = this.$state;
        if (Result.m8123isSuccessimpl(objM8116constructorimpl)) {
            function0.invoke();
            AppState.toast$default(appState2, "皮肤已更新", "下次启动游戏时生效", null, 4, null);
        }
        AppState appState3 = this.$state;
        Throwable thM8119exceptionOrNullimpl = Result.m8119exceptionOrNullimpl(objM8116constructorimpl);
        if (thM8119exceptionOrNullimpl != null) {
            String message = thM8119exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            appState3.toast("皮肤没能保存", message, "error");
        }
        return Unit.INSTANCE;
    }
}
