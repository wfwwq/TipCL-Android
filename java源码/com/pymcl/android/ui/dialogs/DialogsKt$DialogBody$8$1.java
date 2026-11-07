package com.pymcl.android.ui.dialogs;

import androidx.compose.runtime.MutableState;
import com.pymcl.android.ui.state.AppState;
import kotlin.Metadata;
import kotlin.Pair;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: Dialogs.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.dialogs.DialogsKt$DialogBody$8$1", f = "Dialogs.kt", i = {0, 0}, l = {114}, m = "invokeSuspend", n = {"$this$LaunchedEffect", "$this$invokeSuspend_u24lambda_u240\\1"}, nl = {119}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes18.dex */
final class DialogsKt$DialogBody$8$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $close;
    final /* synthetic */ MutableState<String> $code$delegate;
    final /* synthetic */ AppState $state;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DialogsKt$DialogBody$8$1(AppState appState, Function0<Unit> function0, MutableState<String> mutableState, Continuation<? super DialogsKt$DialogBody$8$1> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$close = function0;
        this.$code$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DialogsKt$DialogBody$8$1 dialogsKt$DialogBody$8$1 = new DialogsKt$DialogBody$8$1(this.$state, this.$close, this.$code$delegate, continuation);
        dialogsKt$DialogBody$8$1.L$0 = obj;
        return dialogsKt$DialogBody$8$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DialogsKt$DialogBody$8$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objM8116constructorimpl;
        CoroutineScope $this$LaunchedEffect = (CoroutineScope) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    final AppState appState = this.$state;
                    final Function0<Unit> function0 = this.$close;
                    final MutableState<String> mutableState = this.$code$delegate;
                    Result.Companion companion = Result.INSTANCE;
                    Flow<Pair<String, String>> flowStartMicrosoftLogin = appState.getApi().startMicrosoftLogin();
                    FlowCollector<? super Pair<String, String>> flowCollector = new FlowCollector() { // from class: com.pymcl.android.ui.dialogs.DialogsKt$DialogBody$8$1$1$1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object value, Continuation $completion) {
                            return emit((Pair<String, String>) value, (Continuation<? super Unit>) $completion);
                        }

                        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
                        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
                        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
                        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
                        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
                        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
                        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
                        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
                         */
                        public final Object emit(Pair<String, String> pair, Continuation<? super Unit> continuation) {
                            String e = pair.component1();
                            String p = pair.component2();
                            switch (e.hashCode()) {
                                case -1748127485:
                                    if (e.equals("login_code")) {
                                        mutableState.setValue(p);
                                        break;
                                    }
                                    break;
                                case -673660814:
                                    if (e.equals("finished")) {
                                        AppState.toast$default(appState, "登录成功", p, null, 4, null);
                                        appState.refreshData();
                                        function0.invoke();
                                        break;
                                    }
                                    break;
                                case -155687544:
                                    if (e.equals("login_status")) {
                                        appState.toast("登录失败", p, "error");
                                        function0.invoke();
                                        break;
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.L$0 = SpillingKt.nullOutSpilledVariable($this$LaunchedEffect);
                    this.L$1 = SpillingKt.nullOutSpilledVariable($this$LaunchedEffect);
                    this.label = 1;
                    if (flowStartMicrosoftLogin.collect(flowCollector, this) != coroutine_suspended) {
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
        Throwable thM8119exceptionOrNullimpl = Result.m8119exceptionOrNullimpl(objM8116constructorimpl);
        if (thM8119exceptionOrNullimpl != null) {
            String message = thM8119exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            appState2.toast("登录失败", message, "error");
        }
        return Unit.INSTANCE;
    }
}
