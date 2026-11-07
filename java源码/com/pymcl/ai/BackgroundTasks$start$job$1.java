package com.pymcl.ai;

import com.pymcl.ai.ToolOutput;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Background.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.ai.BackgroundTasks$start$job$1", f = "Background.kt", i = {0}, l = {88}, m = "invokeSuspend", n = {"$this$launch"}, nl = {89}, s = {"L$0"}, v = 2)
/* loaded from: classes4.dex */
final class BackgroundTasks$start$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Function2<? super Float, ? super String, Unit>, Continuation<? super ToolOutput>, Object> $block;
    final /* synthetic */ String $id;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BackgroundTasks this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BackgroundTasks$start$job$1(Function2<? super Function2<? super Float, ? super String, Unit>, ? super Continuation<? super ToolOutput>, ? extends Object> function2, BackgroundTasks backgroundTasks, String str, Continuation<? super BackgroundTasks$start$job$1> continuation) {
        super(2, continuation);
        this.$block = function2;
        this.this$0 = backgroundTasks;
        this.$id = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BackgroundTasks$start$job$1 backgroundTasks$start$job$1 = new BackgroundTasks$start$job$1(this.$block, this.this$0, this.$id, continuation);
        backgroundTasks$start$job$1.L$0 = obj;
        return backgroundTasks$start$job$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BackgroundTasks$start$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        final ToolOutput out;
        Object objInvoke;
        CoroutineScope $this$launch = (CoroutineScope) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        Unit unit = null;
        try {
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Function2<Function2<? super Float, ? super String, Unit>, Continuation<? super ToolOutput>, Object> function2 = this.$block;
                    final BackgroundTasks backgroundTasks = this.this$0;
                    final String str = this.$id;
                    Function2<? super Float, ? super String, Unit> function22 = new Function2() { // from class: com.pymcl.ai.BackgroundTasks$start$job$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return BackgroundTasks$start$job$1.invokeSuspend$lambda$0(backgroundTasks, str, (Float) obj, (String) obj2);
                        }
                    };
                    this.L$0 = $this$launch;
                    this.label = 1;
                    objInvoke = function2.invoke(function22, this);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    objInvoke = $result;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            out = (ToolOutput) objInvoke;
        } catch (CancellationException e) {
            out = null;
        } catch (Exception e2) {
            ToolOutput.Companion companion = ToolOutput.INSTANCE;
            String message = e2.getMessage();
            out = companion.err("执行失败：" + (message != null ? message : e2));
        }
        boolean silent = out == null && this.this$0.silentCancel.contains(this.$id);
        BackgroundTasks backgroundTasks2 = this.this$0;
        String str2 = this.$id;
        final boolean z = silent;
        BgTaskInfo fin = backgroundTasks2.update(str2, new Function1() { // from class: com.pymcl.ai.BackgroundTasks$start$job$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BackgroundTasks$start$job$1.invokeSuspend$lambda$1(out, z, (BgTaskInfo) obj);
            }
        });
        this.this$0.jobs.remove(this.$id);
        this.this$0.silentCancel.remove(this.$id);
        this.this$0.persist();
        if (!silent && fin != null) {
            BackgroundTasks backgroundTasks3 = this.this$0;
            try {
                Result.Companion companion2 = Result.INSTANCE;
                Function1<BgTaskInfo, Unit> onFinished = backgroundTasks3.getOnFinished();
                if (onFinished != null) {
                    onFinished.invoke(fin);
                    unit = Unit.INSTANCE;
                }
                Result.m8116constructorimpl(unit);
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                Result.m8116constructorimpl(ResultKt.createFailure(th));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(BackgroundTasks this$0, String $id, final Float p, final String d) {
        this$0.update($id, new Function1() { // from class: com.pymcl.ai.BackgroundTasks$start$job$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BackgroundTasks$start$job$1.invokeSuspend$lambda$0$0(p, d, (BgTaskInfo) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BgTaskInfo invokeSuspend$lambda$0$0(Float $p, String $d, BgTaskInfo it) {
        return it.copy((7135 & 1) != 0 ? it.id : null, (7135 & 2) != 0 ? it.chatId : null, (7135 & 4) != 0 ? it.callId : null, (7135 & 8) != 0 ? it.tool : null, (7135 & 16) != 0 ? it.title : null, (7135 & 32) != 0 ? it.state : null, (7135 & 64) != 0 ? it.progress : $p, (7135 & 128) != 0 ? it.detail : $d, (7135 & 256) != 0 ? it.result : null, (7135 & 512) != 0 ? it.startedAt : 0L, (7135 & 1024) != 0 ? it.finishedAt : 0L, (7135 & 2048) != 0 ? it.reported : false, (7135 & 4096) != 0 ? it.turnId : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BgTaskInfo invokeSuspend$lambda$1(ToolOutput $out, boolean $silent, BgTaskInfo it) {
        String strTake;
        if ($out == null) {
            return it.copy((7135 & 1) != 0 ? it.id : null, (7135 & 2) != 0 ? it.chatId : null, (7135 & 4) != 0 ? it.callId : null, (7135 & 8) != 0 ? it.tool : null, (7135 & 16) != 0 ? it.title : null, (7135 & 32) != 0 ? it.state : "cancelled", (7135 & 64) != 0 ? it.progress : null, (7135 & 128) != 0 ? it.detail : $silent ? "已随撤回取消" : "已取消", (7135 & 256) != 0 ? it.result : null, (7135 & 512) != 0 ? it.startedAt : 0L, (7135 & 1024) != 0 ? it.finishedAt : System.currentTimeMillis(), (7135 & 2048) != 0 ? it.reported : it.getReported() || $silent, (7135 & 4096) != 0 ? it.turnId : null);
        }
        String str = $out.getOk() ? SettingsProtocol.EXTRA_OK : "error";
        Float fValueOf = Float.valueOf(1.0f);
        String str2 = (String) SequencesKt.firstOrNull(StringsKt.lineSequence($out.getText()));
        return it.copy((7135 & 1) != 0 ? it.id : null, (7135 & 2) != 0 ? it.chatId : null, (7135 & 4) != 0 ? it.callId : null, (7135 & 8) != 0 ? it.tool : null, (7135 & 16) != 0 ? it.title : null, (7135 & 32) != 0 ? it.state : str, (7135 & 64) != 0 ? it.progress : fValueOf, (7135 & 128) != 0 ? it.detail : (str2 == null || (strTake = StringsKt.take(str2, 120)) == null) ? "" : strTake, (7135 & 256) != 0 ? it.result : ($out.getNetwork() ? AiAgent.UNTRUSTED : "") + $out.getText(), (7135 & 512) != 0 ? it.startedAt : 0L, (7135 & 1024) != 0 ? it.finishedAt : System.currentTimeMillis(), (7135 & 2048) != 0 ? it.reported : false, (7135 & 4096) != 0 ? it.turnId : null);
    }
}
