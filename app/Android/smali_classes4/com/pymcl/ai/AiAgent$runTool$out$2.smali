.class final Lcom/pymcl/ai/AiAgent$runTool$out$2;
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
        "Lkotlin/jvm/functions/Function1<",
        "-",
        "Lcom/pymcl/ai/AiEvent;",
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

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/pymcl/ai/ToolOutput;",
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
    c = "com.pymcl.ai.AiAgent$runTool$out$2"
    f = "AiAgent.kt"
    i = {
        0x0
    }
    l = {
        0x11e
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

.field final synthetic $tc:Lcom/pymcl/ai/ToolCall;

.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/pymcl/ai/AiAgent;


# direct methods
.method public static synthetic $r8$lambda$CiJXk9hNHWDhWZGUNH4KxttwHKw(Lkotlin/jvm/functions/Function1;Lcom/pymcl/ai/ToolCall;Ljava/lang/Float;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/pymcl/ai/AiAgent$runTool$out$2;->invokeSuspend$lambda$0(Lkotlin/jvm/functions/Function1;Lcom/pymcl/ai/ToolCall;Ljava/lang/Float;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/pymcl/ai/AiAgent;Lcom/pymcl/ai/ToolCall;Ljava/util/Map;Lkotlin/coroutines/Continuation;)V
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
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/ai/AiAgent$runTool$out$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/ai/AiAgent$runTool$out$2;->this$0:Lcom/pymcl/ai/AiAgent;

    iput-object p2, p0, Lcom/pymcl/ai/AiAgent$runTool$out$2;->$tc:Lcom/pymcl/ai/ToolCall;

    iput-object p3, p0, Lcom/pymcl/ai/AiAgent$runTool$out$2;->$args:Ljava/util/Map;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method private static final invokeSuspend$lambda$0(Lkotlin/jvm/functions/Function1;Lcom/pymcl/ai/ToolCall;Ljava/lang/Float;Ljava/lang/String;)Lkotlin/Unit;
    .locals 2
    .param p0, "$send"    # Lkotlin/jvm/functions/Function1;
    .param p1, "$tc"    # Lcom/pymcl/ai/ToolCall;
    .param p2, "p"    # Ljava/lang/Float;
    .param p3, "d"    # Ljava/lang/String;

    .line 286
    new-instance v0, Lcom/pymcl/ai/AiEvent$ToolProgress;

    invoke-virtual {p1}, Lcom/pymcl/ai/ToolCall;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p2, p3}, Lcom/pymcl/ai/AiEvent$ToolProgress;-><init>(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 4
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

    new-instance v0, Lcom/pymcl/ai/AiAgent$runTool$out$2;

    iget-object v1, p0, Lcom/pymcl/ai/AiAgent$runTool$out$2;->this$0:Lcom/pymcl/ai/AiAgent;

    iget-object v2, p0, Lcom/pymcl/ai/AiAgent$runTool$out$2;->$tc:Lcom/pymcl/ai/ToolCall;

    iget-object v3, p0, Lcom/pymcl/ai/AiAgent$runTool$out$2;->$args:Ljava/util/Map;

    invoke-direct {v0, v1, v2, v3, p2}, Lcom/pymcl/ai/AiAgent$runTool$out$2;-><init>(Lcom/pymcl/ai/AiAgent;Lcom/pymcl/ai/ToolCall;Ljava/util/Map;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/pymcl/ai/AiAgent$runTool$out$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/jvm/functions/Function1;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/ai/AiAgent$runTool$out$2;->invoke(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lcom/pymcl/ai/ToolOutput;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/ai/AiAgent$runTool$out$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/ai/AiAgent$runTool$out$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/ai/AiAgent$runTool$out$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8
    .param p1, "$result"    # Ljava/lang/Object;

    iget-object v0, p0, Lcom/pymcl/ai/AiAgent$runTool$out$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    .local v0, "send":Lkotlin/jvm/functions/Function1;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 286
    iget v2, p0, Lcom/pymcl/ai/AiAgent$runTool$out$2;->label:I

    packed-switch v2, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v2, p1

    goto :goto_0

    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v2, p0, Lcom/pymcl/ai/AiAgent$runTool$out$2;->this$0:Lcom/pymcl/ai/AiAgent;

    invoke-static {v2}, Lcom/pymcl/ai/AiAgent;->access$getHost$p(Lcom/pymcl/ai/AiAgent;)Lcom/pymcl/ai/AiToolHost;

    move-result-object v2

    iget-object v3, p0, Lcom/pymcl/ai/AiAgent$runTool$out$2;->$tc:Lcom/pymcl/ai/ToolCall;

    invoke-virtual {v3}, Lcom/pymcl/ai/ToolCall;->getName()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/pymcl/ai/AiAgent$runTool$out$2;->$args:Ljava/util/Map;

    iget-object v5, p0, Lcom/pymcl/ai/AiAgent$runTool$out$2;->$tc:Lcom/pymcl/ai/ToolCall;

    new-instance v6, Lcom/pymcl/ai/AiAgent$runTool$out$2$$ExternalSyntheticLambda0;

    invoke-direct {v6, v0, v5}, Lcom/pymcl/ai/AiAgent$runTool$out$2$$ExternalSyntheticLambda0;-><init>(Lkotlin/jvm/functions/Function1;Lcom/pymcl/ai/ToolCall;)V

    move-object v5, p0

    check-cast v5, Lkotlin/coroutines/Continuation;

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, p0, Lcom/pymcl/ai/AiAgent$runTool$out$2;->L$0:Ljava/lang/Object;

    const/4 v7, 0x1

    iput v7, p0, Lcom/pymcl/ai/AiAgent$runTool$out$2;->label:I

    invoke-interface {v2, v3, v4, v6, v5}, Lcom/pymcl/ai/AiToolHost;->execute(Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_0

    return-object v1

    :cond_0
    :goto_0
    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
