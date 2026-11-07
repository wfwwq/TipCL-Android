.class final Lcom/pymcl/ai/AiService$rewind$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AiService.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/ai/AiService;->rewind(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lcom/pymcl/ai/RewindOutcome;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAiService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiService.kt\ncom/pymcl/ai/AiService$rewind$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n1#2:141\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/pymcl/ai/RewindOutcome;",
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
    c = "com.pymcl.ai.AiService$rewind$2"
    f = "AiService.kt"
    i = {
        0x1
    }
    l = {
        0x7d,
        0x7f
    }
    m = "invokeSuspend"
    n = {
        "id"
    }
    nl = {
        0x7e,
        0x80
    }
    s = {
        "L$0"
    }
    v = 0x2
.end annotation


# instance fields
.field final synthetic $chatId:Ljava/lang/String;

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/pymcl/ai/AiService;


# direct methods
.method constructor <init>(Lcom/pymcl/ai/AiService;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/ai/AiService;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/ai/AiService$rewind$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/ai/AiService$rewind$2;->this$0:Lcom/pymcl/ai/AiService;

    iput-object p2, p0, Lcom/pymcl/ai/AiService$rewind$2;->$chatId:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
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

    new-instance v0, Lcom/pymcl/ai/AiService$rewind$2;

    iget-object v1, p0, Lcom/pymcl/ai/AiService$rewind$2;->this$0:Lcom/pymcl/ai/AiService;

    iget-object v2, p0, Lcom/pymcl/ai/AiService$rewind$2;->$chatId:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p2}, Lcom/pymcl/ai/AiService$rewind$2;-><init>(Lcom/pymcl/ai/AiService;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/ai/AiService$rewind$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lcom/pymcl/ai/RewindOutcome;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/ai/AiService$rewind$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/ai/AiService$rewind$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/ai/AiService$rewind$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 124
    iget v1, p0, Lcom/pymcl/ai/AiService$rewind$2;->label:I

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lcom/pymcl/ai/AiService$rewind$2;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .local v0, "id":Ljava/lang/String;
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v2, p1

    goto/16 :goto_2

    .end local v0    # "id":Ljava/lang/String;
    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v1, p1

    goto :goto_0

    :pswitch_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 125
    iget-object v1, p0, Lcom/pymcl/ai/AiService$rewind$2;->this$0:Lcom/pymcl/ai/AiService;

    invoke-virtual {v1}, Lcom/pymcl/ai/AiService;->isRunning()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/pymcl/ai/AiService$rewind$2;->this$0:Lcom/pymcl/ai/AiService;

    invoke-virtual {v1}, Lcom/pymcl/ai/AiService;->stop()V

    iget-object v1, p0, Lcom/pymcl/ai/AiService$rewind$2;->this$0:Lcom/pymcl/ai/AiService;

    invoke-static {v1}, Lcom/pymcl/ai/AiService;->access$getJob$p(Lcom/pymcl/ai/AiService;)Lkotlinx/coroutines/Job;

    move-result-object v1

    if-eqz v1, :cond_1

    move-object v2, p0

    check-cast v2, Lkotlin/coroutines/Continuation;

    const/4 v3, 0x1

    iput v3, p0, Lcom/pymcl/ai/AiService$rewind$2;->label:I

    invoke-interface {v1, v2}, Lkotlinx/coroutines/Job;->join(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_0

    .line 124
    return-object v0

    .line 125
    :cond_0
    :goto_0
    check-cast v1, Lkotlin/Unit;

    .line 126
    :cond_1
    iget-object v1, p0, Lcom/pymcl/ai/AiService$rewind$2;->$chatId:Ljava/lang/String;

    if-eqz v1, :cond_3

    move-object v2, v1

    .line 141
    .local v2, "it":Ljava/lang/String;
    const/4 v3, 0x0

    .line 126
    .local v3, "$i$a$-takeIf-AiService$rewind$2$id$1":I
    move-object v4, v2

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v4

    .end local v2    # "it":Ljava/lang/String;
    .end local v3    # "$i$a$-takeIf-AiService$rewind$2$id$1":I
    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    if-nez v1, :cond_4

    :cond_3
    iget-object v1, p0, Lcom/pymcl/ai/AiService$rewind$2;->this$0:Lcom/pymcl/ai/AiService;

    invoke-virtual {v1}, Lcom/pymcl/ai/AiService;->getChats()Lcom/pymcl/ai/ChatStore;

    move-result-object v1

    invoke-virtual {v1}, Lcom/pymcl/ai/ChatStore;->activeId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4

    new-instance v2, Lcom/pymcl/ai/RewindOutcome;

    const/16 v9, 0x20

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v10}, Lcom/pymcl/ai/RewindOutcome;-><init>(IIZZLjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    .line 127
    .local v1, "id":Ljava/lang/String;
    :cond_4
    iget-object v2, p0, Lcom/pymcl/ai/AiService$rewind$2;->this$0:Lcom/pymcl/ai/AiService;

    invoke-static {v2}, Lcom/pymcl/ai/AiService;->access$getAgent$p(Lcom/pymcl/ai/AiService;)Lcom/pymcl/ai/AiAgent;

    move-result-object v2

    move-object v3, p0

    check-cast v3, Lkotlin/coroutines/Continuation;

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, p0, Lcom/pymcl/ai/AiService$rewind$2;->L$0:Ljava/lang/Object;

    const/4 v4, 0x2

    iput v4, p0, Lcom/pymcl/ai/AiService$rewind$2;->label:I

    invoke-virtual {v2, v1, v3}, Lcom/pymcl/ai/AiAgent;->rewind(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_5

    .line 124
    return-object v0

    .line 127
    :cond_5
    move-object v0, v1

    .line 124
    .end local v1    # "id":Ljava/lang/String;
    .restart local v0    # "id":Ljava/lang/String;
    :goto_2
    move-object v1, v2

    check-cast v1, Lcom/pymcl/ai/AiAgent$RewindResult;

    .line 128
    .local v1, "rr":Lcom/pymcl/ai/AiAgent$RewindResult;
    invoke-virtual {v1}, Lcom/pymcl/ai/AiAgent$RewindResult;->getRollback()Lcom/pymcl/ai/RollbackResult;

    move-result-object v2

    .line 129
    .local v2, "r":Lcom/pymcl/ai/RollbackResult;
    new-instance v3, Lcom/pymcl/ai/RewindOutcome;

    invoke-virtual {v2}, Lcom/pymcl/ai/RollbackResult;->getRestored()I

    move-result v4

    invoke-virtual {v2}, Lcom/pymcl/ai/RollbackResult;->getFailed()I

    move-result v5

    invoke-virtual {v2}, Lcom/pymcl/ai/RollbackResult;->getHadEntries()Z

    move-result v6

    invoke-virtual {v2}, Lcom/pymcl/ai/RollbackResult;->getRewindable()Z

    move-result v7

    invoke-virtual {v1}, Lcom/pymcl/ai/AiAgent$RewindResult;->getUserText()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lcom/pymcl/ai/AiAgent$RewindResult;->getCancelledTasks()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v9

    invoke-direct/range {v3 .. v9}, Lcom/pymcl/ai/RewindOutcome;-><init>(IIZZLjava/lang/String;I)V

    return-object v3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
