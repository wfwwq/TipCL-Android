package com.pymcl.ai;

import com.pymcl.ai.AiEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: AiAgent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, d2 = {"<anonymous>", "Lcom/pymcl/ai/ToolOutput;", "send", "Lkotlin/Function1;", "Lcom/pymcl/ai/AiEvent;", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.ai.AiAgent$runTool$out$2", f = "AiAgent.kt", i = {0}, l = {286}, m = "invokeSuspend", n = {"send"}, nl = {-1}, s = {"L$0"}, v = 2)
/* loaded from: classes4.dex */
final class AiAgent$runTool$out$2 extends SuspendLambda implements Function2<Function1<? super AiEvent, ? extends Unit>, Continuation<? super ToolOutput>, Object> {
    final /* synthetic */ Map<String, Object> $args;
    final /* synthetic */ ToolCall $tc;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AiAgent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AiAgent$runTool$out$2(AiAgent aiAgent, ToolCall toolCall, Map<String, Object> map, Continuation<? super AiAgent$runTool$out$2> continuation) {
        super(2, continuation);
        this.this$0 = aiAgent;
        this.$tc = toolCall;
        this.$args = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AiAgent$runTool$out$2 aiAgent$runTool$out$2 = new AiAgent$runTool$out$2(this.this$0, this.$tc, this.$args, continuation);
        aiAgent$runTool$out$2.L$0 = obj;
        return aiAgent$runTool$out$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Function1<? super AiEvent, ? extends Unit> function1, Continuation<? super ToolOutput> continuation) {
        return invoke2((Function1<? super AiEvent, Unit>) function1, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Function1<? super AiEvent, Unit> function1, Continuation<? super ToolOutput> continuation) {
        return ((AiAgent$runTool$out$2) create(function1, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(Function1 $send, ToolCall $tc, Float p, String d) {
        $send.invoke(new AiEvent.ToolProgress($tc.getId(), p, d));
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        final Function1 send = (Function1) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                AiToolHost aiToolHost = this.this$0.host;
                String name = this.$tc.getName();
                Map<String, Object> map = this.$args;
                final ToolCall toolCall = this.$tc;
                this.L$0 = SpillingKt.nullOutSpilledVariable(send);
                this.label = 1;
                Object objExecute = aiToolHost.execute(name, map, new Function2() { // from class: com.pymcl.ai.AiAgent$runTool$out$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AiAgent$runTool$out$2.invokeSuspend$lambda$0(send, toolCall, (Float) obj, (String) obj2);
                    }
                }, this);
                return objExecute == coroutine_suspended ? coroutine_suspended : objExecute;
            case 1:
                ResultKt.throwOnFailure($result);
                return $result;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
