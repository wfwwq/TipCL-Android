.class final Lcom/pymcl/multiplayer/MultiplayerController$join$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "MultiplayerController.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/multiplayer/MultiplayerController;->join(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Ljava/lang/Boolean;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
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
    c = "com.pymcl.multiplayer.MultiplayerController$join$2"
    f = "MultiplayerController.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    nl = {}
    s = {}
    v = 0x2
.end annotation


# instance fields
.field final synthetic $code:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lcom/pymcl/multiplayer/MultiplayerController;


# direct methods
.method constructor <init>(Lcom/pymcl/multiplayer/MultiplayerController;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/multiplayer/MultiplayerController;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/multiplayer/MultiplayerController$join$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/multiplayer/MultiplayerController$join$2;->this$0:Lcom/pymcl/multiplayer/MultiplayerController;

    iput-object p2, p0, Lcom/pymcl/multiplayer/MultiplayerController$join$2;->$code:Ljava/lang/String;

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

    new-instance v0, Lcom/pymcl/multiplayer/MultiplayerController$join$2;

    iget-object v1, p0, Lcom/pymcl/multiplayer/MultiplayerController$join$2;->this$0:Lcom/pymcl/multiplayer/MultiplayerController;

    iget-object v2, p0, Lcom/pymcl/multiplayer/MultiplayerController$join$2;->$code:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p2}, Lcom/pymcl/multiplayer/MultiplayerController$join$2;-><init>(Lcom/pymcl/multiplayer/MultiplayerController;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/multiplayer/MultiplayerController$join$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/multiplayer/MultiplayerController$join$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/multiplayer/MultiplayerController$join$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/multiplayer/MultiplayerController$join$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 133
    iget v0, p0, Lcom/pymcl/multiplayer/MultiplayerController$join$2;->label:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 134
    iget-object v0, p0, Lcom/pymcl/multiplayer/MultiplayerController$join$2;->this$0:Lcom/pymcl/multiplayer/MultiplayerController;

    invoke-virtual {v0}, Lcom/pymcl/multiplayer/MultiplayerController;->initialize()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 136
    :cond_0
    sget-object v0, Lcom/pymcl/multiplayer/RoomCode;->INSTANCE:Lcom/pymcl/multiplayer/RoomCode;

    iget-object v2, p0, Lcom/pymcl/multiplayer/MultiplayerController$join$2;->$code:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/pymcl/multiplayer/RoomCode;->parse(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/pymcl/multiplayer/MultiplayerController$join$2;->$code:Ljava/lang/String;

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 137
    .local v0, "room":Ljava/lang/String;
    :cond_1
    iget-object v2, p0, Lcom/pymcl/multiplayer/MultiplayerController$join$2;->this$0:Lcom/pymcl/multiplayer/MultiplayerController;

    invoke-static {v2}, Lcom/pymcl/multiplayer/MultiplayerController;->access$ensureWaiting(Lcom/pymcl/multiplayer/MultiplayerController;)V

    iget-object v2, p0, Lcom/pymcl/multiplayer/MultiplayerController$join$2;->this$0:Lcom/pymcl/multiplayer/MultiplayerController;

    invoke-static {v2, v1}, Lcom/pymcl/multiplayer/MultiplayerController;->access$setHost$p(Lcom/pymcl/multiplayer/MultiplayerController;Z)V

    .line 138
    iget-object v1, p0, Lcom/pymcl/multiplayer/MultiplayerController$join$2;->this$0:Lcom/pymcl/multiplayer/MultiplayerController;

    invoke-virtual {v1}, Lcom/pymcl/multiplayer/MultiplayerController;->getPlayerName()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/pymcl/multiplayer/MultiplayerController$join$2;->this$0:Lcom/pymcl/multiplayer/MultiplayerController;

    invoke-virtual {v2}, Lcom/pymcl/multiplayer/MultiplayerController;->getExtraNodes()Ljava/util/List;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI;->setGuesting(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    move-result v1

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
