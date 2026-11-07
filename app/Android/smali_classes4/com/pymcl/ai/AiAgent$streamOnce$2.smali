.class final Lcom/pymcl/ai/AiAgent$streamOnce$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AiAgent.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/ai/AiAgent;->streamOnce(Lcom/pymcl/ai/AiSettings;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlin/jvm/functions/Function1<",
        "-",
        "Lcom/pymcl/ai/AiEvent;",
        "+",
        "Lkotlin/Unit;",
        ">;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lcom/pymcl/ai/AssistantTurn;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/pymcl/ai/AssistantTurn;",
        "send",
        "Lkotlin/Function1;",
        "Lcom/pymcl/ai/AiEvent;",
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
    c = "com.pymcl.ai.AiAgent$streamOnce$2"
    f = "AiAgent.kt"
    i = {
        0x0
    }
    l = {
        0xc4
    }
    m = "invokeSuspend"
    n = {
        "send"
    }
    nl = {
        -0x1
    }
    s = {
        "L$0"
    }
    v = 0x2
.end annotation


# instance fields
.field final synthetic $model:Ljava/lang/String;

.field final synthetic $req:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $st:Lcom/pymcl/ai/AiSettings;

.field final synthetic $tools:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/pymcl/ai/AiAgent;


# direct methods
.method public static synthetic $r8$lambda$0U5KJG3AScVcECj_Lwvwz4BijW0(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/ai/AiAgent$streamOnce$2;->invokeSuspend$lambda$0$1(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$Xlp9eqIZfC_V3oZrq2TfNIkcd_s(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/ai/AiAgent$streamOnce$2;->invokeSuspend$lambda$0$0(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$fgzoYpDNu5Mvuei_rlm56DeMOBs(Lcom/pymcl/ai/AiAgent;Lcom/pymcl/ai/AiSettings;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;)Lcom/pymcl/ai/AssistantTurn;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/pymcl/ai/AiAgent$streamOnce$2;->invokeSuspend$lambda$0(Lcom/pymcl/ai/AiAgent;Lcom/pymcl/ai/AiSettings;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;)Lcom/pymcl/ai/AssistantTurn;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/pymcl/ai/AiAgent;Lcom/pymcl/ai/AiSettings;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/ai/AiAgent;",
            "Lcom/pymcl/ai/AiSettings;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/ai/AiAgent$streamOnce$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/ai/AiAgent$streamOnce$2;->this$0:Lcom/pymcl/ai/AiAgent;

    iput-object p2, p0, Lcom/pymcl/ai/AiAgent$streamOnce$2;->$st:Lcom/pymcl/ai/AiSettings;

    iput-object p3, p0, Lcom/pymcl/ai/AiAgent$streamOnce$2;->$model:Ljava/lang/String;

    iput-object p4, p0, Lcom/pymcl/ai/AiAgent$streamOnce$2;->$req:Ljava/util/List;

    iput-object p5, p0, Lcom/pymcl/ai/AiAgent$streamOnce$2;->$tools:Ljava/util/List;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method private static final invokeSuspend$lambda$0(Lcom/pymcl/ai/AiAgent;Lcom/pymcl/ai/AiSettings;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;)Lcom/pymcl/ai/AssistantTurn;
    .locals 7
    .param p0, "this$0"    # Lcom/pymcl/ai/AiAgent;
    .param p1, "$st"    # Lcom/pymcl/ai/AiSettings;
    .param p2, "$model"    # Ljava/lang/String;
    .param p3, "$req"    # Ljava/util/List;
    .param p4, "$tools"    # Ljava/util/List;
    .param p5, "$send"    # Lkotlin/jvm/functions/Function1;

    .line 196
    invoke-static {p0}, Lcom/pymcl/ai/AiAgent;->access$getClient$p(Lcom/pymcl/ai/AiAgent;)Lcom/pymcl/ai/AiClient;

    move-result-object v0

    new-instance v5, Lcom/pymcl/ai/AiAgent$streamOnce$2$$ExternalSyntheticLambda0;

    invoke-direct {v5, p5}, Lcom/pymcl/ai/AiAgent$streamOnce$2$$ExternalSyntheticLambda0;-><init>(Lkotlin/jvm/functions/Function1;)V

    new-instance v6, Lcom/pymcl/ai/AiAgent$streamOnce$2$$ExternalSyntheticLambda1;

    invoke-direct {v6, p5}, Lcom/pymcl/ai/AiAgent$streamOnce$2$$ExternalSyntheticLambda1;-><init>(Lkotlin/jvm/functions/Function1;)V

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .end local p1    # "$st":Lcom/pymcl/ai/AiSettings;
    .end local p2    # "$model":Ljava/lang/String;
    .end local p3    # "$req":Ljava/util/List;
    .end local p4    # "$tools":Ljava/util/List;
    .local v1, "$st":Lcom/pymcl/ai/AiSettings;
    .local v2, "$model":Ljava/lang/String;
    .local v3, "$req":Ljava/util/List;
    .local v4, "$tools":Ljava/util/List;
    invoke-virtual/range {v0 .. v6}, Lcom/pymcl/ai/AiClient;->streamChat(Lcom/pymcl/ai/AiSettings;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/pymcl/ai/AssistantTurn;

    move-result-object p1

    return-object p1
.end method

.method private static final invokeSuspend$lambda$0$0(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1
    .param p0, "$send"    # Lkotlin/jvm/functions/Function1;
    .param p1, "it"    # Ljava/lang/String;

    .line 196
    new-instance v0, Lcom/pymcl/ai/AiEvent$Delta;

    invoke-direct {v0, p1}, Lcom/pymcl/ai/AiEvent$Delta;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final invokeSuspend$lambda$0$1(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1
    .param p0, "$send"    # Lkotlin/jvm/functions/Function1;
    .param p1, "it"    # Ljava/lang/String;

    .line 196
    new-instance v0, Lcom/pymcl/ai/AiEvent$Think;

    invoke-direct {v0, p1}, Lcom/pymcl/ai/AiEvent$Think;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
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

    new-instance v0, Lcom/pymcl/ai/AiAgent$streamOnce$2;

    iget-object v1, p0, Lcom/pymcl/ai/AiAgent$streamOnce$2;->this$0:Lcom/pymcl/ai/AiAgent;

    iget-object v2, p0, Lcom/pymcl/ai/AiAgent$streamOnce$2;->$st:Lcom/pymcl/ai/AiSettings;

    iget-object v3, p0, Lcom/pymcl/ai/AiAgent$streamOnce$2;->$model:Ljava/lang/String;

    iget-object v4, p0, Lcom/pymcl/ai/AiAgent$streamOnce$2;->$req:Ljava/util/List;

    iget-object v5, p0, Lcom/pymcl/ai/AiAgent$streamOnce$2;->$tools:Ljava/util/List;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/pymcl/ai/AiAgent$streamOnce$2;-><init>(Lcom/pymcl/ai/AiAgent;Lcom/pymcl/ai/AiSettings;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/pymcl/ai/AiAgent$streamOnce$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/jvm/functions/Function1;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/ai/AiAgent$streamOnce$2;->invoke(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invoke(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/pymcl/ai/AiEvent;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/ai/AssistantTurn;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/ai/AiAgent$streamOnce$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/ai/AiAgent$streamOnce$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/ai/AiAgent$streamOnce$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9
    .param p1, "$result"    # Ljava/lang/Object;

    iget-object v0, p0, Lcom/pymcl/ai/AiAgent$streamOnce$2;->L$0:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function1;

    .local v7, "send":Lkotlin/jvm/functions/Function1;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 196
    iget v1, p0, Lcom/pymcl/ai/AiAgent$streamOnce$2;->label:I

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v1, p1

    goto :goto_0

    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lkotlin/coroutines/CoroutineContext;

    iget-object v2, p0, Lcom/pymcl/ai/AiAgent$streamOnce$2;->this$0:Lcom/pymcl/ai/AiAgent;

    iget-object v3, p0, Lcom/pymcl/ai/AiAgent$streamOnce$2;->$st:Lcom/pymcl/ai/AiSettings;

    iget-object v4, p0, Lcom/pymcl/ai/AiAgent$streamOnce$2;->$model:Ljava/lang/String;

    iget-object v5, p0, Lcom/pymcl/ai/AiAgent$streamOnce$2;->$req:Ljava/util/List;

    iget-object v6, p0, Lcom/pymcl/ai/AiAgent$streamOnce$2;->$tools:Ljava/util/List;

    new-instance v1, Lcom/pymcl/ai/AiAgent$streamOnce$2$$ExternalSyntheticLambda2;

    invoke-direct/range {v1 .. v7}, Lcom/pymcl/ai/AiAgent$streamOnce$2$$ExternalSyntheticLambda2;-><init>(Lcom/pymcl/ai/AiAgent;Lcom/pymcl/ai/AiSettings;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    move-object v2, p0

    check-cast v2, Lkotlin/coroutines/Continuation;

    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, p0, Lcom/pymcl/ai/AiAgent$streamOnce$2;->L$0:Ljava/lang/Object;

    const/4 v3, 0x1

    iput v3, p0, Lcom/pymcl/ai/AiAgent$streamOnce$2;->label:I

    invoke-static {v8, v1, v2}, Lkotlinx/coroutines/InterruptibleKt;->runInterruptible(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_0

    return-object v0

    :cond_0
    :goto_0
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
