.class final Lcom/pymcl/ai/AiService$send$1$inner$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AiService.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/ai/AiService$send$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
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
    c = "com.pymcl.ai.AiService$send$1$inner$1"
    f = "AiService.kt"
    i = {
        0x1
    }
    l = {
        0x5e,
        0x60
    }
    m = "invokeSuspend"
    n = {
        "e"
    }
    nl = {
        0x5f,
        0x61
    }
    s = {
        "L$0"
    }
    v = 0x2
.end annotation


# instance fields
.field final synthetic $$this$channelFlow:Lkotlinx/coroutines/channels/ProducerScope;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/ProducerScope<",
            "Lcom/pymcl/ai/AiEvent;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $hidden:Ljava/lang/String;

.field final synthetic $id:Ljava/lang/String;

.field final synthetic $text:Ljava/lang/String;

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/pymcl/ai/AiService;


# direct methods
.method constructor <init>(Lcom/pymcl/ai/AiService;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/ai/AiService;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlinx/coroutines/channels/ProducerScope<",
            "-",
            "Lcom/pymcl/ai/AiEvent;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/ai/AiService$send$1$inner$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/ai/AiService$send$1$inner$1;->this$0:Lcom/pymcl/ai/AiService;

    iput-object p2, p0, Lcom/pymcl/ai/AiService$send$1$inner$1;->$id:Ljava/lang/String;

    iput-object p3, p0, Lcom/pymcl/ai/AiService$send$1$inner$1;->$text:Ljava/lang/String;

    iput-object p4, p0, Lcom/pymcl/ai/AiService$send$1$inner$1;->$hidden:Ljava/lang/String;

    iput-object p5, p0, Lcom/pymcl/ai/AiService$send$1$inner$1;->$$this$channelFlow:Lkotlinx/coroutines/channels/ProducerScope;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7
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

    new-instance v0, Lcom/pymcl/ai/AiService$send$1$inner$1;

    iget-object v1, p0, Lcom/pymcl/ai/AiService$send$1$inner$1;->this$0:Lcom/pymcl/ai/AiService;

    iget-object v2, p0, Lcom/pymcl/ai/AiService$send$1$inner$1;->$id:Ljava/lang/String;

    iget-object v3, p0, Lcom/pymcl/ai/AiService$send$1$inner$1;->$text:Ljava/lang/String;

    iget-object v4, p0, Lcom/pymcl/ai/AiService$send$1$inner$1;->$hidden:Ljava/lang/String;

    iget-object v5, p0, Lcom/pymcl/ai/AiService$send$1$inner$1;->$$this$channelFlow:Lkotlinx/coroutines/channels/ProducerScope;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/pymcl/ai/AiService$send$1$inner$1;-><init>(Lcom/pymcl/ai/AiService;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/ai/AiService$send$1$inner$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/ai/AiService$send$1$inner$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/ai/AiService$send$1$inner$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/ai/AiService$send$1$inner$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 93
    iget v0, p0, Lcom/pymcl/ai/AiService$send$1$inner$1;->label:I

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lcom/pymcl/ai/AiService$send$1$inner$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Exception;

    .local v0, "e":Ljava/lang/Exception;
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    .end local v0    # "e":Ljava/lang/Exception;
    :pswitch_1
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 96
    :catch_0
    move-exception v0

    goto :goto_1

    .line 95
    :catch_1
    move-exception v0

    goto :goto_4

    .line 93
    :pswitch_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 94
    :try_start_1
    iget-object v0, p0, Lcom/pymcl/ai/AiService$send$1$inner$1;->this$0:Lcom/pymcl/ai/AiService;

    invoke-static {v0}, Lcom/pymcl/ai/AiService;->access$getAgent$p(Lcom/pymcl/ai/AiService;)Lcom/pymcl/ai/AiAgent;

    move-result-object v3

    iget-object v4, p0, Lcom/pymcl/ai/AiService$send$1$inner$1;->$id:Ljava/lang/String;

    iget-object v5, p0, Lcom/pymcl/ai/AiService$send$1$inner$1;->$text:Ljava/lang/String;

    iget-object v6, p0, Lcom/pymcl/ai/AiService$send$1$inner$1;->$hidden:Ljava/lang/String;

    new-instance v0, Lcom/pymcl/ai/AiService$send$1$inner$1$1;

    iget-object v7, p0, Lcom/pymcl/ai/AiService$send$1$inner$1;->$$this$channelFlow:Lkotlinx/coroutines/channels/ProducerScope;

    invoke-direct {v0, v7, v2}, Lcom/pymcl/ai/AiService$send$1$inner$1$1;-><init>(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)V

    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function2;

    move-object v8, p0

    check-cast v8, Lkotlin/coroutines/Continuation;

    const/4 v0, 0x1

    iput v0, p0, Lcom/pymcl/ai/AiService$send$1$inner$1;->label:I

    invoke-virtual/range {v3 .. v8}, Lcom/pymcl/ai/AiAgent;->run(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ne v0, v1, :cond_0

    .line 93
    return-object v1

    .line 94
    :cond_0
    :goto_0
    goto :goto_3

    .line 96
    .restart local v0    # "e":Ljava/lang/Exception;
    :goto_1
    iget-object v3, p0, Lcom/pymcl/ai/AiService$send$1$inner$1;->$$this$channelFlow:Lkotlinx/coroutines/channels/ProducerScope;

    new-instance v4, Lcom/pymcl/ai/AiEvent$Fail;

    iget-object v5, p0, Lcom/pymcl/ai/AiService$send$1$inner$1;->this$0:Lcom/pymcl/ai/AiService;

    invoke-virtual {v5}, Lcom/pymcl/ai/AiService;->getClient()Lcom/pymcl/ai/AiClient;

    move-result-object v5

    move-object v6, v0

    check-cast v6, Ljava/lang/Throwable;

    invoke-virtual {v5, v6}, Lcom/pymcl/ai/AiClient;->describeError(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v4, v5, v6, v7, v2}, Lcom/pymcl/ai/AiEvent$Fail;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, p0

    check-cast v2, Lkotlin/coroutines/Continuation;

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, p0, Lcom/pymcl/ai/AiService$send$1$inner$1;->L$0:Ljava/lang/Object;

    iput v7, p0, Lcom/pymcl/ai/AiService$send$1$inner$1;->label:I

    invoke-interface {v3, v4, v2}, Lkotlinx/coroutines/channels/ProducerScope;->send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_1

    .line 93
    return-object v1

    .line 97
    :cond_1
    :goto_2
    nop

    .end local v0    # "e":Ljava/lang/Exception;
    :goto_3
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 95
    .local v0, "e":Ljava/util/concurrent/CancellationException;
    :goto_4
    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
