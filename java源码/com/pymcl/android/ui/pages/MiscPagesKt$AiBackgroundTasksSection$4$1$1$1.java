package com.pymcl.android.ui.pages;

import androidx.compose.runtime.MutableState;
import com.pymcl.ai.BgClearResult;
import com.pymcl.ai.BgTaskInfo;
import com.pymcl.android.data.AiTaskCenter;
import com.pymcl.android.data.AiUiExtras;
import com.pymcl.android.ui.state.AppState;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: MiscPages.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.MiscPagesKt$AiBackgroundTasksSection$4$1$1$1", f = "MiscPages.kt", i = {}, l = {413}, m = "invokeSuspend", n = {}, nl = {414}, s = {}, v = 2)
/* loaded from: classes22.dex */
final class MiscPagesKt$AiBackgroundTasksSection$4$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AiUiExtras $ai;
    final /* synthetic */ AppState $state;
    final /* synthetic */ MutableState<List<BgTaskInfo>> $tasks$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MiscPagesKt$AiBackgroundTasksSection$4$1$1$1(AppState appState, AiUiExtras aiUiExtras, MutableState<List<BgTaskInfo>> mutableState, Continuation<? super MiscPagesKt$AiBackgroundTasksSection$4$1$1$1> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$ai = aiUiExtras;
        this.$tasks$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MiscPagesKt$AiBackgroundTasksSection$4$1$1$1(this.$state, this.$ai, this.$tasks$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MiscPagesKt$AiBackgroundTasksSection$4$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objWithContext;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new MiscPagesKt$AiBackgroundTasksSection$4$1$1$1$r$1(this.$ai, null), this);
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
        BgClearResult r = (BgClearResult) objWithContext;
        this.$tasks$delegate.setValue(AiTaskCenter.INSTANCE.afterClear(MiscPagesKt.AiBackgroundTasksSection$lambda$3(this.$tasks$delegate), r));
        Triple tripleClearMessage$default = AiTaskCenter.clearMessage$default(AiTaskCenter.INSTANCE, r, false, 2, null);
        String title = (String) tripleClearMessage$default.component1();
        String body = (String) tripleClearMessage$default.component2();
        String kind = (String) tripleClearMessage$default.component3();
        this.$state.toast(title, body, kind);
        return Unit.INSTANCE;
    }
}
