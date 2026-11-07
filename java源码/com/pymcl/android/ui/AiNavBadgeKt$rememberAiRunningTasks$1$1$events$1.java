package com.pymcl.android.ui;

import com.pymcl.ai.BgTaskInfo;
import com.pymcl.android.data.AiUiExtras;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* compiled from: AiNavBadge.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lcom/pymcl/ai/BgTaskInfo;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.AiNavBadgeKt$rememberAiRunningTasks$1$1$events$1", f = "AiNavBadge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes20.dex */
final class AiNavBadgeKt$rememberAiRunningTasks$1$1$events$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Flow<? extends BgTaskInfo>>, Object> {
    final /* synthetic */ AiUiExtras $ai;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AiNavBadgeKt$rememberAiRunningTasks$1$1$events$1(AiUiExtras aiUiExtras, Continuation<? super AiNavBadgeKt$rememberAiRunningTasks$1$1$events$1> continuation) {
        super(2, continuation);
        this.$ai = aiUiExtras;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AiNavBadgeKt$rememberAiRunningTasks$1$1$events$1 aiNavBadgeKt$rememberAiRunningTasks$1$1$events$1 = new AiNavBadgeKt$rememberAiRunningTasks$1$1$events$1(this.$ai, continuation);
        aiNavBadgeKt$rememberAiRunningTasks$1$1$events$1.L$0 = obj;
        return aiNavBadgeKt$rememberAiRunningTasks$1$1$events$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Flow<? extends BgTaskInfo>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Flow<BgTaskInfo>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Flow<BgTaskInfo>> continuation) {
        return ((AiNavBadgeKt$rememberAiRunningTasks$1$1$events$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objM8116constructorimpl;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                AiUiExtras aiUiExtras = this.$ai;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    objM8116constructorimpl = Result.m8116constructorimpl(aiUiExtras.getBackgroundEvents());
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
                    return null;
                }
                return objM8116constructorimpl;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
