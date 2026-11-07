package com.pymcl.ai;

import java.io.File;
import java.util.List;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/pymcl/ai/SnapshotResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.ai.AiAgent$runTool$r$1", f = "AiAgent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes4.dex */
final class AiAgent$runTool$r$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SnapshotResult>, Object> {
    final /* synthetic */ String $chatId;
    final /* synthetic */ List<File> $paths;
    final /* synthetic */ ToolCall $tc;
    final /* synthetic */ String $turnId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AiAgent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AiAgent$runTool$r$1(AiAgent aiAgent, String str, String str2, ToolCall toolCall, List<? extends File> list, Continuation<? super AiAgent$runTool$r$1> continuation) {
        super(2, continuation);
        this.this$0 = aiAgent;
        this.$chatId = str;
        this.$turnId = str2;
        this.$tc = toolCall;
        this.$paths = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AiAgent$runTool$r$1 aiAgent$runTool$r$1 = new AiAgent$runTool$r$1(this.this$0, this.$chatId, this.$turnId, this.$tc, this.$paths, continuation);
        aiAgent$runTool$r$1.L$0 = obj;
        return aiAgent$runTool$r$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SnapshotResult> continuation) {
        return ((AiAgent$runTool$r$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objM8116constructorimpl;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                AiAgent aiAgent = this.this$0;
                String str = this.$chatId;
                String str2 = this.$turnId;
                ToolCall toolCall = this.$tc;
                List<File> list = this.$paths;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    objM8116constructorimpl = Result.m8116constructorimpl(aiAgent.checkpoints.snapshot(str, str2, toolCall.getName(), list));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
                }
                Throwable it = Result.m8119exceptionOrNullimpl(objM8116constructorimpl);
                if (it == null) {
                    return objM8116constructorimpl;
                }
                return new SnapshotResult(false, 0, "检查点不可用：" + it.getMessage());
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
