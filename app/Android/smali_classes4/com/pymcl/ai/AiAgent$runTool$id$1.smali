.class final Lcom/pymcl/ai/AiAgent$runTool$id$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AiAgent.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/ai/AiAgent;->runTool(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/pymcl/ai/ToolCall;Lcom/pymcl/ai/AiSettings;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlin/jvm/functions/Function2<",
        "-",
        "Ljava/lang/Float;",
        "-",
        "Ljava/lang/String;",
        "+",
        "Lkotlin/Unit;",
        ">;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lcom/pymcl/ai/ToolOutput;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAiAgent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiAgent.kt\ncom/pymcl/ai/AiAgent$runTool$id$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,409:1\n1#2:410\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000e\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/pymcl/ai/ToolOutput;",
        "progress",
        "Lkotlin/Function2;",
        "",
        "",
        ""
    }
    k = 0x3
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.pymcl.ai.AiAgent$runTool$id$1"
    f = "AiAgent.kt"
    i = {
        0x0
    }
    l = {
        0x111
    }
    m = "invokeSuspend"
    n = {
        "progress"
    }
    nl = {
        0x112
    }
    s = {
        "L$0"
    }
    v = 0x2
.end annotation


# instance fields
.field final synthetic $args:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $chatId:Ljava/lang/String;

.field final synthetic $t0:J

.field final synthetic $tc:Lcom/pymcl/ai/ToolCall;

.field final synthetic $turnId:Ljava/lang/String;

.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/pymcl/ai/AiAgent;


# direct methods
.method constructor <init>(Lcom/pymcl/ai/AiAgent;Lcom/pymcl/ai/ToolCall;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/ai/AiAgent;",
            "Lcom/pymcl/ai/ToolCall;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "J",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/ai/AiAgent$runTool$id$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/ai/AiAgent$runTool$id$1;->this$0:Lcom/pymcl/ai/AiAgent;

    iput-object p2, p0, Lcom/pymcl/ai/AiAgent$runTool$id$1;->$tc:Lcom/pymcl/ai/ToolCall;

    iput-object p3, p0, Lcom/pymcl/ai/AiAgent$runTool$id$1;->$args:Ljava/util/Map;

    iput-object p4, p0, Lcom/pymcl/ai/AiAgent$runTool$id$1;->$chatId:Ljava/lang/String;

    iput-object p5, p0, Lcom/pymcl/ai/AiAgent$runTool$id$1;->$turnId:Ljava/lang/String;

    iput-wide p6, p0, Lcom/pymcl/ai/AiAgent$runTool$id$1;->$t0:J

    const/4 v0, 0x2

    invoke-direct {p0, v0, p8}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/pymcl/ai/AiAgent$runTool$id$1;

    iget-object v1, p0, Lcom/pymcl/ai/AiAgent$runTool$id$1;->this$0:Lcom/pymcl/ai/AiAgent;

    iget-object v2, p0, Lcom/pymcl/ai/AiAgent$runTool$id$1;->$tc:Lcom/pymcl/ai/ToolCall;

    iget-object v3, p0, Lcom/pymcl/ai/AiAgent$runTool$id$1;->$args:Ljava/util/Map;

    iget-object v4, p0, Lcom/pymcl/ai/AiAgent$runTool$id$1;->$chatId:Ljava/lang/String;

    iget-object v5, p0, Lcom/pymcl/ai/AiAgent$runTool$id$1;->$turnId:Ljava/lang/String;

    iget-wide v6, p0, Lcom/pymcl/ai/AiAgent$runTool$id$1;->$t0:J

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lcom/pymcl/ai/AiAgent$runTool$id$1;-><init>(Lcom/pymcl/ai/AiAgent;Lcom/pymcl/ai/ToolCall;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/pymcl/ai/AiAgent$runTool$id$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/jvm/functions/Function2;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/ai/AiAgent$runTool$id$1;->invoke(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invoke(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Float;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/ai/ToolOutput;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/ai/AiAgent$runTool$id$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/ai/AiAgent$runTool$id$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/ai/AiAgent$runTool$id$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13
    .param p1, "$result"    # Ljava/lang/Object;

    iget-object v0, p0, Lcom/pymcl/ai/AiAgent$runTool$id$1;->L$0:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lkotlin/jvm/functions/Function2;

    .local v1, "progress":Lkotlin/jvm/functions/Function2;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 272
    iget v2, p0, Lcom/pymcl/ai/AiAgent$runTool$id$1;->label:I

    const/4 v3, 0x1

    packed-switch v2, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v2, p1

    goto :goto_0

    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 273
    iget-object v2, p0, Lcom/pymcl/ai/AiAgent$runTool$id$1;->this$0:Lcom/pymcl/ai/AiAgent;

    invoke-static {v2}, Lcom/pymcl/ai/AiAgent;->access$getHost$p(Lcom/pymcl/ai/AiAgent;)Lcom/pymcl/ai/AiToolHost;

    move-result-object v2

    iget-object v4, p0, Lcom/pymcl/ai/AiAgent$runTool$id$1;->$tc:Lcom/pymcl/ai/ToolCall;

    invoke-virtual {v4}, Lcom/pymcl/ai/ToolCall;->getName()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/pymcl/ai/AiAgent$runTool$id$1;->$args:Ljava/util/Map;

    move-object v6, p0

    check-cast v6, Lkotlin/coroutines/Continuation;

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, p0, Lcom/pymcl/ai/AiAgent$runTool$id$1;->L$0:Ljava/lang/Object;

    iput v3, p0, Lcom/pymcl/ai/AiAgent$runTool$id$1;->label:I

    invoke-interface {v2, v4, v5, v1, v6}, Lcom/pymcl/ai/AiToolHost;->execute(Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_0

    .line 272
    return-object v0

    :cond_0
    :goto_0
    check-cast v2, Lcom/pymcl/ai/ToolOutput;

    .line 274
    .local v2, "o":Lcom/pymcl/ai/ToolOutput;
    iget-object v0, p0, Lcom/pymcl/ai/AiAgent$runTool$id$1;->this$0:Lcom/pymcl/ai/AiAgent;

    invoke-static {v0}, Lcom/pymcl/ai/AiAgent;->access$getHooks$p(Lcom/pymcl/ai/AiAgent;)Lcom/pymcl/ai/HookRunner;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v4, p0, Lcom/pymcl/ai/AiAgent$runTool$id$1;->this$0:Lcom/pymcl/ai/AiAgent;

    iget-object v5, p0, Lcom/pymcl/ai/AiAgent$runTool$id$1;->$tc:Lcom/pymcl/ai/ToolCall;

    iget-object v9, p0, Lcom/pymcl/ai/AiAgent$runTool$id$1;->$args:Ljava/util/Map;

    iget-object v10, p0, Lcom/pymcl/ai/AiAgent$runTool$id$1;->$chatId:Ljava/lang/String;

    move-object v6, v0

    .line 410
    .local v6, "h":Lcom/pymcl/ai/HookRunner;
    const/4 v12, 0x0

    .line 274
    .local v12, "$i$a$-let-AiAgent$runTool$id$1$1":I
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 410
    .local v4, "$this$invokeSuspend_u24lambda_u240_u240":Lcom/pymcl/ai/AiAgent;
    const/4 v0, 0x0

    .line 274
    .local v0, "$i$a$-runCatching-AiAgent$runTool$id$1$1$1":I
    const-string v7, "PostToolUse"

    invoke-virtual {v5}, Lcom/pymcl/ai/ToolCall;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2}, Lcom/pymcl/ai/ToolOutput;->getText()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {v6 .. v11}, Lcom/pymcl/ai/HookRunner;->run(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/pymcl/ai/HookOutcome;

    move-result-object v5

    .end local v0    # "$i$a$-runCatching-AiAgent$runTool$id$1$1$1":I
    .end local v4    # "$this$invokeSuspend_u24lambda_u240_u240":Lcom/pymcl/ai/AiAgent;
    invoke-static {v5}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .end local v6    # "h":Lcom/pymcl/ai/HookRunner;
    .end local v12    # "$i$a$-let-AiAgent$runTool$id$1$1":I
    :goto_1
    invoke-static {v0}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    .line 275
    :cond_1
    iget-object v0, p0, Lcom/pymcl/ai/AiAgent$runTool$id$1;->this$0:Lcom/pymcl/ai/AiAgent;

    invoke-static {v0}, Lcom/pymcl/ai/AiAgent;->access$getAudit$p(Lcom/pymcl/ai/AiAgent;)Lcom/pymcl/ai/AuditLog;

    move-result-object v0

    if-eqz v0, :cond_3

    const/16 v4, 0x8

    new-array v4, v4, [Lkotlin/Pair;

    const-string v5, "event"

    const-string v6, "background_done"

    invoke-static {v5, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    const-string v5, "chat_id"

    iget-object v6, p0, Lcom/pymcl/ai/AiAgent$runTool$id$1;->$chatId:Ljava/lang/String;

    invoke-static {v5, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    aput-object v5, v4, v3

    const-string v3, "turn_id"

    iget-object v5, p0, Lcom/pymcl/ai/AiAgent$runTool$id$1;->$turnId:Ljava/lang/String;

    invoke-static {v3, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v5, 0x2

    aput-object v3, v4, v5

    iget-object v3, p0, Lcom/pymcl/ai/AiAgent$runTool$id$1;->$tc:Lcom/pymcl/ai/ToolCall;

    invoke-virtual {v3}, Lcom/pymcl/ai/ToolCall;->getId()Ljava/lang/String;

    move-result-object v3

    const-string v5, "call_id"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v5, 0x3

    aput-object v3, v4, v5

    iget-object v3, p0, Lcom/pymcl/ai/AiAgent$runTool$id$1;->$tc:Lcom/pymcl/ai/ToolCall;

    invoke-virtual {v3}, Lcom/pymcl/ai/ToolCall;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v5, "tool"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v5, 0x4

    aput-object v3, v4, v5

    .line 276
    invoke-virtual {v2}, Lcom/pymcl/ai/ToolOutput;->getOk()Z

    move-result v3

    if-eqz v3, :cond_2

    const-string v3, "ok"

    goto :goto_2

    :cond_2
    const-string v3, "error"

    :goto_2
    const-string v5, "status"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v5, 0x5

    aput-object v3, v4, v5

    .line 275
    nop

    .line 276
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    iget-wide v7, p0, Lcom/pymcl/ai/AiAgent$runTool$id$1;->$t0:J

    sub-long/2addr v5, v7

    invoke-static {v5, v6}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    move-result-object v3

    const-string v5, "duration_ms"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v5, 0x6

    aput-object v3, v4, v5

    .line 275
    nop

    .line 276
    invoke-virtual {v2}, Lcom/pymcl/ai/ToolOutput;->getText()Ljava/lang/String;

    move-result-object v3

    const/16 v5, 0xc8

    invoke-static {v3, v5}, Lkotlin/text/StringsKt;->take(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    const-string v5, "summary"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v5, 0x7

    aput-object v3, v4, v5

    .line 275
    invoke-static {v4}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/pymcl/ai/AuditLog;->append-IoAF18A(Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    .line 277
    :cond_3
    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
