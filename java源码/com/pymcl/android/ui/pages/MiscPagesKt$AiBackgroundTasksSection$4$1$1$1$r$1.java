package com.pymcl.android.ui.pages;

import com.pymcl.ai.BgClearResult;
import com.pymcl.android.data.AiUiExtras;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/pymcl/ai/BgClearResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.MiscPagesKt$AiBackgroundTasksSection$4$1$1$1$r$1", f = "MiscPages.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes22.dex */
final class MiscPagesKt$AiBackgroundTasksSection$4$1$1$1$r$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super BgClearResult>, Object> {
    final /* synthetic */ AiUiExtras $ai;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MiscPagesKt$AiBackgroundTasksSection$4$1$1$1$r$1(AiUiExtras aiUiExtras, Continuation<? super MiscPagesKt$AiBackgroundTasksSection$4$1$1$1$r$1> continuation) {
        super(2, continuation);
        this.$ai = aiUiExtras;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MiscPagesKt$AiBackgroundTasksSection$4$1$1$1$r$1(this.$ai, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super BgClearResult> continuation) {
        return ((MiscPagesKt$AiBackgroundTasksSection$4$1$1$1$r$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                return this.$ai.clearFinishedTasks();
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
