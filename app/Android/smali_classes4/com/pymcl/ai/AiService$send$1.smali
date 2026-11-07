.class final Lcom/pymcl/ai/AiService$send$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AiService.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/ai/AiService;->send(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/channels/ProducerScope<",
        "-",
        "Lcom/pymcl/ai/AiEvent;",
        ">;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAiService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiService.kt\ncom/pymcl/ai/AiService$send$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n1#2:141\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/channels/ProducerScope;",
        "Lcom/pymcl/ai/AiEvent;"
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
    c = "com.pymcl.ai.AiService$send$1"
    f = "AiService.kt"
    i = {
        0x0,
        0x1,
        0x2,
        0x2,
        0x2,
        0x3,
        0x3,
        0x3
    }
    l = {
        0x58,
        0x59,
        0x64,
        0x65
    }
    m = "invokeSuspend"
    n = {
        "$this$channelFlow",
        "$this$channelFlow",
        "$this$channelFlow",
        "id",
        "inner",
        "$this$channelFlow",
        "id",
        "inner"
    }
    nl = {
        0x59,
        0x5a,
        0x65,
        0x67
    }
    s = {
        "L$0",
        "L$0",
        "L$0",
        "L$1",
        "L$2",
        "L$0",
        "L$1",
        "L$2"
    }
    v = 0x2
.end annotation


# instance fields
.field final synthetic $chatId:Ljava/lang/String;

.field final synthetic $hidden:Ljava/lang/String;

.field final synthetic $text:Ljava/lang/String;

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/pymcl/ai/AiService;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/pymcl/ai/AiService;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/pymcl/ai/AiService;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/ai/AiService$send$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/ai/AiService$send$1;->$text:Ljava/lang/String;

    iput-object p2, p0, Lcom/pymcl/ai/AiService$send$1;->$hidden:Ljava/lang/String;

    iput-object p3, p0, Lcom/pymcl/ai/AiService$send$1;->this$0:Lcom/pymcl/ai/AiService;

    iput-object p4, p0, Lcom/pymcl/ai/AiService$send$1;->$chatId:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6
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

    new-instance v0, Lcom/pymcl/ai/AiService$send$1;

    iget-object v1, p0, Lcom/pymcl/ai/AiService$send$1;->$text:Ljava/lang/String;

    iget-object v2, p0, Lcom/pymcl/ai/AiService$send$1;->$hidden:Ljava/lang/String;

    iget-object v3, p0, Lcom/pymcl/ai/AiService$send$1;->this$0:Lcom/pymcl/ai/AiService;

    iget-object v4, p0, Lcom/pymcl/ai/AiService$send$1;->$chatId:Ljava/lang/String;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/pymcl/ai/AiService$send$1;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/pymcl/ai/AiService;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/pymcl/ai/AiService$send$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/channels/ProducerScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/ai/AiService$send$1;->invoke(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invoke(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/channels/ProducerScope<",
            "-",
            "Lcom/pymcl/ai/AiEvent;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/ai/AiService$send$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/ai/AiService$send$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/ai/AiService$send$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v1, p0

    iget-object v0, v1, Lcom/pymcl/ai/AiService$send$1;->L$0:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lkotlinx/coroutines/channels/ProducerScope;

    .local v7, "$this$channelFlow":Lkotlinx/coroutines/channels/ProducerScope;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 87
    iget v2, v1, Lcom/pymcl/ai/AiService$send$1;->label:I

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, v1, Lcom/pymcl/ai/AiService$send$1;->L$2:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlinx/coroutines/Job;

    .local v2, "inner":Lkotlinx/coroutines/Job;
    iget-object v0, v1, Lcom/pymcl/ai/AiService$send$1;->L$1:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .local v3, "id":Ljava/lang/String;
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_7

    .end local v2    # "inner":Lkotlinx/coroutines/Job;
    .end local v3    # "id":Ljava/lang/String;
    :pswitch_1
    iget-object v2, v1, Lcom/pymcl/ai/AiService$send$1;->L$2:Ljava/lang/Object;

    check-cast v2, Lkotlinx/coroutines/Job;

    .restart local v2    # "inner":Lkotlinx/coroutines/Job;
    iget-object v3, v1, Lcom/pymcl/ai/AiService$send$1;->L$1:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    .restart local v3    # "id":Ljava/lang/String;
    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_6

    .line 103
    :catchall_0
    move-exception v0

    goto/16 :goto_8

    .line 87
    .end local v2    # "inner":Lkotlinx/coroutines/Job;
    .end local v3    # "id":Ljava/lang/String;
    :pswitch_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_3
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_4
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 88
    iget-object v2, v1, Lcom/pymcl/ai/AiService$send$1;->$text:Ljava/lang/String;

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    const/4 v3, 0x2

    if-eqz v2, :cond_3

    iget-object v2, v1, Lcom/pymcl/ai/AiService$send$1;->$hidden:Ljava/lang/String;

    check-cast v2, Ljava/lang/CharSequence;

    if-eqz v2, :cond_1

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move v2, v10

    goto :goto_1

    :cond_1
    :goto_0
    move v2, v9

    :goto_1
    if-eqz v2, :cond_3

    new-instance v2, Lcom/pymcl/ai/AiEvent$Fail;

    sget-object v4, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    const-string v5, "\u6d88\u606f\u662f\u7a7a\u7684"

    new-array v6, v10, [Ljava/lang/Object;

    invoke-virtual {v4, v5, v6}, Lcom/pymcl/ai/AiText;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v4, v10, v3, v11}, Lcom/pymcl/ai/AiEvent$Fail;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v3, v1

    check-cast v3, Lkotlin/coroutines/Continuation;

    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v1, Lcom/pymcl/ai/AiService$send$1;->L$0:Ljava/lang/Object;

    iput v9, v1, Lcom/pymcl/ai/AiService$send$1;->label:I

    invoke-interface {v7, v2, v3}, Lkotlinx/coroutines/channels/ProducerScope;->send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_2

    .line 87
    return-object v0

    .line 89
    :cond_2
    :goto_2
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    :cond_3
    iget-object v2, v1, Lcom/pymcl/ai/AiService$send$1;->this$0:Lcom/pymcl/ai/AiService;

    invoke-virtual {v2}, Lcom/pymcl/ai/AiService;->isRunning()Z

    move-result v2

    if-eqz v2, :cond_5

    new-instance v2, Lcom/pymcl/ai/AiEvent$Fail;

    sget-object v4, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    const-string v5, "\u4e0a\u4e00\u6761\u8fd8\u5728\u5904\u7406\uff1a\u7b49\u5b83\u8bf4\u5b8c\uff0c\u6216\u70b9\u300c\u505c\u6b62\u300d\u518d\u53d1"

    new-array v6, v10, [Ljava/lang/Object;

    invoke-virtual {v4, v5, v6}, Lcom/pymcl/ai/AiText;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v4, v10, v3, v11}, Lcom/pymcl/ai/AiEvent$Fail;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v4, v1

    check-cast v4, Lkotlin/coroutines/Continuation;

    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v1, Lcom/pymcl/ai/AiService$send$1;->L$0:Ljava/lang/Object;

    iput v3, v1, Lcom/pymcl/ai/AiService$send$1;->label:I

    invoke-interface {v7, v2, v4}, Lkotlinx/coroutines/channels/ProducerScope;->send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_4

    .line 87
    return-object v0

    .line 90
    :cond_4
    :goto_3
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    :cond_5
    iget-object v2, v1, Lcom/pymcl/ai/AiService$send$1;->$chatId:Ljava/lang/String;

    if-eqz v2, :cond_7

    move-object v3, v2

    .line 141
    .local v3, "it":Ljava/lang/String;
    const/4 v4, 0x0

    .line 90
    .local v4, "$i$a$-takeIf-AiService$send$1$id$1":I
    move-object v5, v3

    check-cast v5, Ljava/lang/CharSequence;

    invoke-static {v5}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v5

    .end local v3    # "it":Ljava/lang/String;
    .end local v4    # "$i$a$-takeIf-AiService$send$1$id$1":I
    if-nez v5, :cond_6

    goto :goto_4

    :cond_6
    move-object v2, v11

    :goto_4
    if-eqz v2, :cond_7

    iget-object v3, v1, Lcom/pymcl/ai/AiService$send$1;->this$0:Lcom/pymcl/ai/AiService;

    move-object v4, v2

    .line 141
    .local v4, "it":Ljava/lang/String;
    const/4 v5, 0x0

    .line 90
    .local v5, "$i$a$-also-AiService$send$1$id$2":I
    invoke-virtual {v3}, Lcom/pymcl/ai/AiService;->getChats()Lcom/pymcl/ai/ChatStore;

    move-result-object v3

    invoke-virtual {v3, v4}, Lcom/pymcl/ai/ChatStore;->setActive(Ljava/lang/String;)Z

    .end local v4    # "it":Ljava/lang/String;
    .end local v5    # "$i$a$-also-AiService$send$1$id$2":I
    goto :goto_5

    :cond_7
    iget-object v2, v1, Lcom/pymcl/ai/AiService$send$1;->this$0:Lcom/pymcl/ai/AiService;

    invoke-virtual {v2}, Lcom/pymcl/ai/AiService;->getChats()Lcom/pymcl/ai/ChatStore;

    move-result-object v2

    invoke-virtual {v2}, Lcom/pymcl/ai/ChatStore;->ensureActive()Ljava/lang/String;

    move-result-object v2

    move-object v4, v2

    .line 91
    .local v4, "id":Ljava/lang/String;
    :goto_5
    iget-object v2, v1, Lcom/pymcl/ai/AiService$send$1;->this$0:Lcom/pymcl/ai/AiService;

    invoke-static {v2, v4}, Lcom/pymcl/ai/AiService;->access$setRunningChat$p(Lcom/pymcl/ai/AiService;Ljava/lang/String;)V

    .line 93
    move-object v12, v7

    check-cast v12, Lkotlinx/coroutines/CoroutineScope;

    new-instance v2, Lcom/pymcl/ai/AiService$send$1$inner$1;

    iget-object v3, v1, Lcom/pymcl/ai/AiService$send$1;->this$0:Lcom/pymcl/ai/AiService;

    iget-object v5, v1, Lcom/pymcl/ai/AiService$send$1;->$text:Ljava/lang/String;

    iget-object v6, v1, Lcom/pymcl/ai/AiService$send$1;->$hidden:Ljava/lang/String;

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/pymcl/ai/AiService$send$1$inner$1;-><init>(Lcom/pymcl/ai/AiService;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)V

    move-object v15, v2

    check-cast v15, Lkotlin/jvm/functions/Function2;

    const/16 v16, 0x3

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v12 .. v17}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object v2

    .line 98
    .restart local v2    # "inner":Lkotlinx/coroutines/Job;
    iget-object v3, v1, Lcom/pymcl/ai/AiService$send$1;->this$0:Lcom/pymcl/ai/AiService;

    invoke-static {v3, v2}, Lcom/pymcl/ai/AiService;->access$setJob$p(Lcom/pymcl/ai/AiService;Lkotlinx/coroutines/Job;)V

    .line 99
    nop

    .line 100
    :try_start_2
    move-object v3, v1

    check-cast v3, Lkotlin/coroutines/Continuation;

    iput-object v7, v1, Lcom/pymcl/ai/AiService$send$1;->L$0:Ljava/lang/Object;

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v1, Lcom/pymcl/ai/AiService$send$1;->L$1:Ljava/lang/Object;

    iput-object v2, v1, Lcom/pymcl/ai/AiService$send$1;->L$2:Ljava/lang/Object;

    const/4 v5, 0x3

    iput v5, v1, Lcom/pymcl/ai/AiService$send$1;->label:I

    invoke-interface {v2, v3}, Lkotlinx/coroutines/Job;->join(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne v3, v0, :cond_8

    .line 87
    return-object v0

    .line 100
    :cond_8
    move-object v3, v4

    .line 101
    .end local v4    # "id":Ljava/lang/String;
    .local v3, "id":Ljava/lang/String;
    :goto_6
    :try_start_3
    invoke-interface {v2}, Lkotlinx/coroutines/Job;->isCancelled()Z

    move-result v4

    if-eqz v4, :cond_a

    new-instance v4, Lcom/pymcl/ai/AiEvent$Fail;

    sget-object v5, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    const-string v6, "\u5df2\u505c\u6b62"

    new-array v8, v10, [Ljava/lang/Object;

    invoke-virtual {v5, v6, v8}, Lcom/pymcl/ai/AiText;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5, v9}, Lcom/pymcl/ai/AiEvent$Fail;-><init>(Ljava/lang/String;Z)V

    move-object v5, v1

    check-cast v5, Lkotlin/coroutines/Continuation;

    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v1, Lcom/pymcl/ai/AiService$send$1;->L$0:Ljava/lang/Object;

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v1, Lcom/pymcl/ai/AiService$send$1;->L$1:Ljava/lang/Object;

    iput-object v2, v1, Lcom/pymcl/ai/AiService$send$1;->L$2:Ljava/lang/Object;

    const/4 v6, 0x4

    iput v6, v1, Lcom/pymcl/ai/AiService$send$1;->label:I

    invoke-interface {v7, v4, v5}, Lkotlinx/coroutines/channels/ProducerScope;->send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-ne v4, v0, :cond_9

    .line 87
    return-object v0

    .line 103
    :cond_9
    :goto_7
    nop

    :cond_a
    iget-object v0, v1, Lcom/pymcl/ai/AiService$send$1;->this$0:Lcom/pymcl/ai/AiService;

    invoke-static {v0}, Lcom/pymcl/ai/AiService;->access$getAgent$p(Lcom/pymcl/ai/AiService;)Lcom/pymcl/ai/AiAgent;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/ai/AiAgent;->cancelPending()V

    iget-object v0, v1, Lcom/pymcl/ai/AiService$send$1;->this$0:Lcom/pymcl/ai/AiService;

    invoke-static {v0, v11}, Lcom/pymcl/ai/AiService;->access$setRunningChat$p(Lcom/pymcl/ai/AiService;Ljava/lang/String;)V

    iget-object v0, v1, Lcom/pymcl/ai/AiService$send$1;->this$0:Lcom/pymcl/ai/AiService;

    invoke-static {v0}, Lcom/pymcl/ai/AiService;->access$getJob$p(Lcom/pymcl/ai/AiService;)Lkotlinx/coroutines/Job;

    move-result-object v0

    if-ne v0, v2, :cond_b

    iget-object v0, v1, Lcom/pymcl/ai/AiService$send$1;->this$0:Lcom/pymcl/ai/AiService;

    invoke-static {v0, v11}, Lcom/pymcl/ai/AiService;->access$setJob$p(Lcom/pymcl/ai/AiService;Lkotlinx/coroutines/Job;)V

    .line 104
    :cond_b
    nop

    .line 105
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 103
    .end local v3    # "id":Ljava/lang/String;
    .restart local v4    # "id":Ljava/lang/String;
    :catchall_1
    move-exception v0

    move-object v3, v4

    .end local v4    # "id":Ljava/lang/String;
    .restart local v3    # "id":Ljava/lang/String;
    :goto_8
    iget-object v4, v1, Lcom/pymcl/ai/AiService$send$1;->this$0:Lcom/pymcl/ai/AiService;

    invoke-static {v4}, Lcom/pymcl/ai/AiService;->access$getAgent$p(Lcom/pymcl/ai/AiService;)Lcom/pymcl/ai/AiAgent;

    move-result-object v4

    invoke-virtual {v4}, Lcom/pymcl/ai/AiAgent;->cancelPending()V

    iget-object v4, v1, Lcom/pymcl/ai/AiService$send$1;->this$0:Lcom/pymcl/ai/AiService;

    invoke-static {v4, v11}, Lcom/pymcl/ai/AiService;->access$setRunningChat$p(Lcom/pymcl/ai/AiService;Ljava/lang/String;)V

    iget-object v4, v1, Lcom/pymcl/ai/AiService$send$1;->this$0:Lcom/pymcl/ai/AiService;

    invoke-static {v4}, Lcom/pymcl/ai/AiService;->access$getJob$p(Lcom/pymcl/ai/AiService;)Lkotlinx/coroutines/Job;

    move-result-object v4

    if-ne v4, v2, :cond_c

    iget-object v4, v1, Lcom/pymcl/ai/AiService$send$1;->this$0:Lcom/pymcl/ai/AiService;

    invoke-static {v4, v11}, Lcom/pymcl/ai/AiService;->access$setJob$p(Lcom/pymcl/ai/AiService;Lkotlinx/coroutines/Job;)V

    :cond_c
    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
