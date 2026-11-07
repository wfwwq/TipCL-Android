package com.pymcl.ai;

import androidx.core.app.NotificationCompat;
import com.pymcl.core.util.JsonKt;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* compiled from: AiAgent.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000e\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\n"}, d2 = {"<anonymous>", "Lcom/pymcl/ai/ToolOutput;", NotificationCompat.CATEGORY_PROGRESS, "Lkotlin/Function2;", "", "", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.ai.AiAgent$runTool$id$1", f = "AiAgent.kt", i = {0}, l = {273}, m = "invokeSuspend", n = {NotificationCompat.CATEGORY_PROGRESS}, nl = {274}, s = {"L$0"}, v = 2)
/* loaded from: classes4.dex */
final class AiAgent$runTool$id$1 extends SuspendLambda implements Function2<Function2<? super Float, ? super String, ? extends Unit>, Continuation<? super ToolOutput>, Object> {
    final /* synthetic */ Map<String, Object> $args;
    final /* synthetic */ String $chatId;
    final /* synthetic */ long $t0;
    final /* synthetic */ ToolCall $tc;
    final /* synthetic */ String $turnId;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AiAgent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AiAgent$runTool$id$1(AiAgent aiAgent, ToolCall toolCall, Map<String, Object> map, String str, String str2, long j, Continuation<? super AiAgent$runTool$id$1> continuation) {
        super(2, continuation);
        this.this$0 = aiAgent;
        this.$tc = toolCall;
        this.$args = map;
        this.$chatId = str;
        this.$turnId = str2;
        this.$t0 = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AiAgent$runTool$id$1 aiAgent$runTool$id$1 = new AiAgent$runTool$id$1(this.this$0, this.$tc, this.$args, this.$chatId, this.$turnId, this.$t0, continuation);
        aiAgent$runTool$id$1.L$0 = obj;
        return aiAgent$runTool$id$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Function2<? super Float, ? super String, ? extends Unit> function2, Continuation<? super ToolOutput> continuation) {
        return invoke2((Function2<? super Float, ? super String, Unit>) function2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Function2<? super Float, ? super String, Unit> function2, Continuation<? super ToolOutput> continuation) {
        return ((AiAgent$runTool$id$1) create(function2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objExecute;
        Object objM8116constructorimpl;
        Function2 progress = (Function2) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.L$0 = SpillingKt.nullOutSpilledVariable(progress);
                this.label = 1;
                objExecute = this.this$0.host.execute(this.$tc.getName(), this.$args, progress, this);
                if (objExecute == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                objExecute = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ToolOutput o = (ToolOutput) objExecute;
        HookRunner h = this.this$0.hooks;
        if (h != null) {
            AiAgent aiAgent = this.this$0;
            ToolCall toolCall = this.$tc;
            Map<String, Object> map = this.$args;
            String str = this.$chatId;
            try {
                Result.Companion companion = Result.INSTANCE;
                objM8116constructorimpl = Result.m8116constructorimpl(h.run("PostToolUse", toolCall.getName(), map, str, o.getText()));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
            }
            Result.m8115boximpl(objM8116constructorimpl);
        }
        AuditLog auditLog = this.this$0.audit;
        if (auditLog != null) {
            Pair[] pairArr = new Pair[8];
            pairArr[0] = TuplesKt.to(NotificationCompat.CATEGORY_EVENT, "background_done");
            pairArr[1] = TuplesKt.to("chat_id", this.$chatId);
            pairArr[2] = TuplesKt.to("turn_id", this.$turnId);
            pairArr[3] = TuplesKt.to("call_id", this.$tc.getId());
            pairArr[4] = TuplesKt.to("tool", this.$tc.getName());
            pairArr[5] = TuplesKt.to(NotificationCompat.CATEGORY_STATUS, o.getOk() ? SettingsProtocol.EXTRA_OK : "error");
            pairArr[6] = TuplesKt.to("duration_ms", Boxing.boxLong(System.currentTimeMillis() - this.$t0));
            pairArr[7] = TuplesKt.to("summary", StringsKt.take(o.getText(), 200));
            Result.m8115boximpl(auditLog.m7523appendIoAF18A(JsonKt.jobj(pairArr)));
        }
        return o;
    }
}
