.class final Lcom/pymcl/multiplayer/MultiplayerController$stop$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "MultiplayerController.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/multiplayer/MultiplayerController;->stop(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMultiplayerController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiplayerController.kt\ncom/pymcl/multiplayer/MultiplayerController$stop$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1#2:169\n*E\n"
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
    c = "com.pymcl.multiplayer.MultiplayerController$stop$2"
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
.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/pymcl/multiplayer/MultiplayerController;


# direct methods
.method constructor <init>(Lcom/pymcl/multiplayer/MultiplayerController;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/multiplayer/MultiplayerController;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/multiplayer/MultiplayerController$stop$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/multiplayer/MultiplayerController$stop$2;->this$0:Lcom/pymcl/multiplayer/MultiplayerController;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
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

    new-instance v0, Lcom/pymcl/multiplayer/MultiplayerController$stop$2;

    iget-object v1, p0, Lcom/pymcl/multiplayer/MultiplayerController$stop$2;->this$0:Lcom/pymcl/multiplayer/MultiplayerController;

    invoke-direct {v0, v1, p2}, Lcom/pymcl/multiplayer/MultiplayerController$stop$2;-><init>(Lcom/pymcl/multiplayer/MultiplayerController;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/pymcl/multiplayer/MultiplayerController$stop$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/multiplayer/MultiplayerController$stop$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/multiplayer/MultiplayerController$stop$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/multiplayer/MultiplayerController$stop$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/multiplayer/MultiplayerController$stop$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .param p1, "$result"    # Ljava/lang/Object;

    iget-object v0, p0, Lcom/pymcl/multiplayer/MultiplayerController$stop$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlinx/coroutines/CoroutineScope;

    .local v0, "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 144
    iget v1, p0, Lcom/pymcl/multiplayer/MultiplayerController$stop$2;->label:I

    packed-switch v1, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 145
    iget-object v1, p0, Lcom/pymcl/multiplayer/MultiplayerController$stop$2;->this$0:Lcom/pymcl/multiplayer/MultiplayerController;

    invoke-virtual {v1}, Lcom/pymcl/multiplayer/MultiplayerController;->getMetadata()Lnet/burningtnt/terracotta/TerracottaAndroidAPI$Metadata;

    move-result-object v1

    if-nez v1, :cond_0

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 146
    :cond_0
    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v1, v0

    .line 169
    .local v1, "$this$invokeSuspend_u24lambda_u240":Lkotlinx/coroutines/CoroutineScope;
    const/4 v2, 0x0

    .line 146
    .local v2, "$i$a$-runCatching-MultiplayerController$stop$2$1":I
    invoke-static {}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI;->setWaiting()V

    .end local v1    # "$this$invokeSuspend_u24lambda_u240":Lkotlinx/coroutines/CoroutineScope;
    .end local v2    # "$i$a$-runCatching-MultiplayerController$stop$2$1":I
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    :goto_0
    sget-object v1, Lcom/pymcl/multiplayer/TerracottaVpnService;->Companion:Lcom/pymcl/multiplayer/TerracottaVpnService$Companion;

    iget-object v2, p0, Lcom/pymcl/multiplayer/MultiplayerController$stop$2;->this$0:Lcom/pymcl/multiplayer/MultiplayerController;

    invoke-static {v2}, Lcom/pymcl/multiplayer/MultiplayerController;->access$getApp$p(Lcom/pymcl/multiplayer/MultiplayerController;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/pymcl/multiplayer/TerracottaVpnService$Companion;->stop(Landroid/content/Context;)V

    .line 148
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
