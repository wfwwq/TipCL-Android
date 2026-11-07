package com.pymcl.android.ui.dialogs;

import androidx.compose.runtime.MutableState;
import com.pymcl.android.ui.state.AppState;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Dialogs.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.dialogs.DialogsKt$DialogBody$11$1$1$1$1", f = "Dialogs.kt", i = {0, 0, 1, 1}, l = {148, 148}, m = "invokeSuspend", n = {"$this$launch", "$this$invokeSuspend_u24lambda_u240\\1", "$this$launch", "$this$invokeSuspend_u24lambda_u240\\1"}, nl = {148, 148}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 2)
/* loaded from: classes18.dex */
final class DialogsKt$DialogBody$11$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $apiUrl;
    final /* synthetic */ boolean $nide;
    final /* synthetic */ String $nideId;
    final /* synthetic */ MutableState<String> $pw$delegate;
    final /* synthetic */ AppState $state;
    final /* synthetic */ String $u;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DialogsKt$DialogBody$11$1$1$1$1(boolean z, AppState appState, String str, String str2, String str3, MutableState<String> mutableState, Continuation<? super DialogsKt$DialogBody$11$1$1$1$1> continuation) {
        super(2, continuation);
        this.$nide = z;
        this.$state = appState;
        this.$nideId = str;
        this.$u = str2;
        this.$apiUrl = str3;
        this.$pw$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DialogsKt$DialogBody$11$1$1$1$1 dialogsKt$DialogBody$11$1$1$1$1 = new DialogsKt$DialogBody$11$1$1$1$1(this.$nide, this.$state, this.$nideId, this.$u, this.$apiUrl, this.$pw$delegate, continuation);
        dialogsKt$DialogBody$11$1$1$1$1.L$0 = obj;
        return dialogsKt$DialogBody$11$1$1$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DialogsKt$DialogBody$11$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objM8116constructorimpl;
        Object objStartAuthlibLogin;
        CoroutineScope $this$launch = (CoroutineScope) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    boolean z = this.$nide;
                    AppState appState = this.$state;
                    String str = this.$nideId;
                    String str2 = this.$u;
                    String str3 = this.$apiUrl;
                    MutableState<String> mutableState = this.$pw$delegate;
                    Result.Companion companion = Result.INSTANCE;
                    if (!z) {
                        LauncherUiApi api = appState.getApi();
                        String strDialogBody$lambda$33 = DialogsKt.DialogBody$lambda$33(mutableState);
                        this.L$0 = SpillingKt.nullOutSpilledVariable($this$launch);
                        this.L$1 = SpillingKt.nullOutSpilledVariable($this$launch);
                        this.label = 2;
                        objStartAuthlibLogin = api.startAuthlibLogin(str3, str2, strDialogBody$lambda$33, this);
                        if (objStartAuthlibLogin != coroutine_suspended) {
                            break;
                        } else {
                            return coroutine_suspended;
                        }
                    } else {
                        LauncherUiApi api2 = appState.getApi();
                        Intrinsics.checkNotNull(str);
                        String strDialogBody$lambda$332 = DialogsKt.DialogBody$lambda$33(mutableState);
                        this.L$0 = SpillingKt.nullOutSpilledVariable($this$launch);
                        this.L$1 = SpillingKt.nullOutSpilledVariable($this$launch);
                        this.label = 1;
                        objStartAuthlibLogin = api2.startNide8Login(str, str2, strDialogBody$lambda$332, this);
                        if (objStartAuthlibLogin != coroutine_suspended) {
                            break;
                        } else {
                            return coroutine_suspended;
                        }
                    }
                case 1:
                    ResultKt.throwOnFailure($result);
                    objStartAuthlibLogin = $result;
                    break;
                case 2:
                    ResultKt.throwOnFailure($result);
                    objStartAuthlibLogin = $result;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objM8116constructorimpl = Result.m8116constructorimpl((String) objStartAuthlibLogin);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        AppState appState2 = this.$state;
        if (Result.m8123isSuccessimpl(objM8116constructorimpl)) {
            AppState.toast$default(appState2, "登录成功", (String) objM8116constructorimpl, null, 4, null);
            appState2.refreshData();
        }
        AppState appState3 = this.$state;
        Throwable thM8119exceptionOrNullimpl = Result.m8119exceptionOrNullimpl(objM8116constructorimpl);
        if (thM8119exceptionOrNullimpl != null) {
            String message = thM8119exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = thM8119exceptionOrNullimpl.toString();
            }
            appState3.toast("登录失败", message, "error");
        }
        return Unit.INSTANCE;
    }
}
