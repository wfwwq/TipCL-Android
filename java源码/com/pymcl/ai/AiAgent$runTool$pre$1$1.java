package com.pymcl.ai;

import java.util.Map;
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

/* compiled from: AiAgent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/pymcl/ai/HookOutcome;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.ai.AiAgent$runTool$pre$1$1", f = "AiAgent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes4.dex */
final class AiAgent$runTool$pre$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super HookOutcome>, Object> {
    final /* synthetic */ Map<String, Object> $args;
    final /* synthetic */ String $chatId;
    final /* synthetic */ HookRunner $h;
    final /* synthetic */ ToolCall $tc;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AiAgent$runTool$pre$1$1(HookRunner hookRunner, ToolCall toolCall, Map<String, Object> map, String str, Continuation<? super AiAgent$runTool$pre$1$1> continuation) {
        super(2, continuation);
        this.$h = hookRunner;
        this.$tc = toolCall;
        this.$args = map;
        this.$chatId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AiAgent$runTool$pre$1$1 aiAgent$runTool$pre$1$1 = new AiAgent$runTool$pre$1$1(this.$h, this.$tc, this.$args, this.$chatId, continuation);
        aiAgent$runTool$pre$1$1.L$0 = obj;
        return aiAgent$runTool$pre$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super HookOutcome> continuation) {
        return ((AiAgent$runTool$pre$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objM8116constructorimpl;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                HookRunner hookRunner = this.$h;
                ToolCall toolCall = this.$tc;
                Map<String, Object> map = this.$args;
                String str = this.$chatId;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    objM8116constructorimpl = Result.m8116constructorimpl(HookRunner.run$default(hookRunner, "PreToolUse", toolCall.getName(), map, str, null, 16, null));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
                }
                return Result.m8122isFailureimpl(objM8116constructorimpl) ? new HookOutcome(false, null, false, null, 15, null) : objM8116constructorimpl;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
