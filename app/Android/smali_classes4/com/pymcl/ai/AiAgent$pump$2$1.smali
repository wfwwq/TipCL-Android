.class final Lcom/pymcl/ai/AiAgent$pump$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AiAgent.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/ai/AiAgent$pump$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.pymcl.ai.AiAgent$pump$2$1"
    f = "AiAgent.kt"
    i = {
        0x1
    }
    l = {
        0xbf,
        0xbf
    }
    m = "invokeSuspend"
    n = {
        "e"
    }
    nl = {
        0xbf,
        -0x1
    }
    s = {
        "L$1"
    }
    v = 0x2
.end annotation


# instance fields
.field final synthetic $ch:Lkotlinx/coroutines/channels/Channel;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/Channel<",
            "Lcom/pymcl/ai/AiEvent;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $emit:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Lcom/pymcl/ai/AiEvent;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lkotlinx/coroutines/channels/Channel;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/channels/Channel<",
            "Lcom/pymcl/ai/AiEvent;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lcom/pymcl/ai/AiEvent;",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/ai/AiAgent$pump$2$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/ai/AiAgent$pump$2$1;->$ch:Lkotlinx/coroutines/channels/Channel;

    iput-object p2, p0, Lcom/pymcl/ai/AiAgent$pump$2$1;->$emit:Lkotlin/jvm/functions/Function2;

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

    new-instance v0, Lcom/pymcl/ai/AiAgent$pump$2$1;

    iget-object v1, p0, Lcom/pymcl/ai/AiAgent$pump$2$1;->$ch:Lkotlinx/coroutines/channels/Channel;

    iget-object v2, p0, Lcom/pymcl/ai/AiAgent$pump$2$1;->$emit:Lkotlin/jvm/functions/Function2;

    invoke-direct {v0, v1, v2, p2}, Lcom/pymcl/ai/AiAgent$pump$2$1;-><init>(Lkotlinx/coroutines/channels/Channel;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/ai/AiAgent$pump$2$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/ai/AiAgent$pump$2$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/ai/AiAgent$pump$2$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/ai/AiAgent$pump$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 191
    iget v1, p0, Lcom/pymcl/ai/AiAgent$pump$2$1;->label:I

    packed-switch v1, :pswitch_data_0

    .end local p0    # "this":Lcom/pymcl/ai/AiAgent$pump$2$1;
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .restart local p0    # "this":Lcom/pymcl/ai/AiAgent$pump$2$1;
    :pswitch_0
    iget-object v1, p0, Lcom/pymcl/ai/AiAgent$pump$2$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/pymcl/ai/AiEvent;

    .local v1, "e":Lcom/pymcl/ai/AiEvent;
    iget-object v2, p0, Lcom/pymcl/ai/AiAgent$pump$2$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lkotlinx/coroutines/channels/ChannelIterator;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v3, p0

    goto/16 :goto_2

    .end local v1    # "e":Lcom/pymcl/ai/AiEvent;
    :pswitch_1
    iget-object v1, p0, Lcom/pymcl/ai/AiAgent$pump$2$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lkotlinx/coroutines/channels/ChannelIterator;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v2, p0

    move-object v3, v1

    move-object v1, v0

    move-object v0, p1

    goto :goto_1

    :pswitch_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/pymcl/ai/AiAgent$pump$2$1;->$ch:Lkotlinx/coroutines/channels/Channel;

    invoke-interface {v1}, Lkotlinx/coroutines/channels/Channel;->iterator()Lkotlinx/coroutines/channels/ChannelIterator;

    move-result-object v1

    move-object v2, p0

    .end local p0    # "this":Lcom/pymcl/ai/AiAgent$pump$2$1;
    .local v2, "this":Lcom/pymcl/ai/AiAgent$pump$2$1;
    :goto_0
    move-object v3, v2

    check-cast v3, Lkotlin/coroutines/Continuation;

    iput-object v1, v2, Lcom/pymcl/ai/AiAgent$pump$2$1;->L$0:Ljava/lang/Object;

    const/4 v4, 0x0

    iput-object v4, v2, Lcom/pymcl/ai/AiAgent$pump$2$1;->L$1:Ljava/lang/Object;

    const/4 v4, 0x1

    iput v4, v2, Lcom/pymcl/ai/AiAgent$pump$2$1;->label:I

    invoke-interface {v1, v3}, Lkotlinx/coroutines/channels/ChannelIterator;->hasNext(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_0

    return-object v0

    :cond_0
    move-object v6, v0

    move-object v0, p1

    move-object p1, v3

    move-object v3, v1

    move-object v1, v6

    .end local p1    # "$result":Ljava/lang/Object;
    .local v0, "$result":Ljava/lang/Object;
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-interface {v3}, Lkotlinx/coroutines/channels/ChannelIterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/pymcl/ai/AiEvent;

    .local p1, "e":Lcom/pymcl/ai/AiEvent;
    iget-object v4, v2, Lcom/pymcl/ai/AiAgent$pump$2$1;->$emit:Lkotlin/jvm/functions/Function2;

    iput-object v3, v2, Lcom/pymcl/ai/AiAgent$pump$2$1;->L$0:Ljava/lang/Object;

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v2, Lcom/pymcl/ai/AiAgent$pump$2$1;->L$1:Ljava/lang/Object;

    const/4 v5, 0x2

    iput v5, v2, Lcom/pymcl/ai/AiAgent$pump$2$1;->label:I

    invoke-interface {v4, p1, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_1

    return-object v1

    :cond_1
    move-object v6, v1

    move-object v1, p1

    move-object p1, v0

    move-object v0, v6

    move-object v6, v3

    move-object v3, v2

    move-object v2, v6

    .end local v0    # "$result":Ljava/lang/Object;
    .end local v2    # "this":Lcom/pymcl/ai/AiAgent$pump$2$1;
    .restart local v1    # "e":Lcom/pymcl/ai/AiEvent;
    .local v3, "this":Lcom/pymcl/ai/AiAgent$pump$2$1;
    .local p1, "$result":Ljava/lang/Object;
    :goto_2
    move-object v1, v2

    move-object v2, v3

    goto :goto_0

    .end local v1    # "e":Lcom/pymcl/ai/AiEvent;
    .end local v3    # "this":Lcom/pymcl/ai/AiAgent$pump$2$1;
    .end local p1    # "$result":Ljava/lang/Object;
    .restart local v0    # "$result":Ljava/lang/Object;
    .restart local v2    # "this":Lcom/pymcl/ai/AiAgent$pump$2$1;
    :cond_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
