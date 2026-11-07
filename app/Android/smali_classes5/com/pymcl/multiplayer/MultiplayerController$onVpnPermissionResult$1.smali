.class final Lcom/pymcl/multiplayer/MultiplayerController$onVpnPermissionResult$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "MultiplayerController.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/multiplayer/MultiplayerController;->onVpnPermissionResult(Z)V
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
    value = "SMAP\nMultiplayerController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiplayerController.kt\ncom/pymcl/multiplayer/MultiplayerController$onVpnPermissionResult$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1#2:169\n*E\n"
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
    c = "com.pymcl.multiplayer.MultiplayerController$onVpnPermissionResult$1"
    f = "MultiplayerController.kt"
    i = {
        0x0
    }
    l = {
        0xa3
    }
    m = "invokeSuspend"
    n = {
        "$this$launch"
    }
    nl = {
        0xa4
    }
    s = {
        "L$0"
    }
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
            "Lcom/pymcl/multiplayer/MultiplayerController$onVpnPermissionResult$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/multiplayer/MultiplayerController$onVpnPermissionResult$1;->this$0:Lcom/pymcl/multiplayer/MultiplayerController;

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

    new-instance v0, Lcom/pymcl/multiplayer/MultiplayerController$onVpnPermissionResult$1;

    iget-object v1, p0, Lcom/pymcl/multiplayer/MultiplayerController$onVpnPermissionResult$1;->this$0:Lcom/pymcl/multiplayer/MultiplayerController;

    invoke-direct {v0, v1, p2}, Lcom/pymcl/multiplayer/MultiplayerController$onVpnPermissionResult$1;-><init>(Lcom/pymcl/multiplayer/MultiplayerController;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/pymcl/multiplayer/MultiplayerController$onVpnPermissionResult$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/multiplayer/MultiplayerController$onVpnPermissionResult$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/multiplayer/MultiplayerController$onVpnPermissionResult$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/multiplayer/MultiplayerController$onVpnPermissionResult$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/multiplayer/MultiplayerController$onVpnPermissionResult$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .param p1, "$result"    # Ljava/lang/Object;

    iget-object v0, p0, Lcom/pymcl/multiplayer/MultiplayerController$onVpnPermissionResult$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlinx/coroutines/CoroutineScope;

    .local v0, "$this$launch":Lkotlinx/coroutines/CoroutineScope;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 162
    iget v2, p0, Lcom/pymcl/multiplayer/MultiplayerController$onVpnPermissionResult$1;->label:I

    packed-switch v2, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 163
    :try_start_0
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v2, v0

    .line 169
    .local v2, "$this$invokeSuspend_u24lambda_u240":Lkotlinx/coroutines/CoroutineScope;
    const/4 v3, 0x0

    .line 163
    .local v3, "$i$a$-runCatching-MultiplayerController$onVpnPermissionResult$1$1":I
    invoke-static {}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI;->getPendingVpnServiceRequest()Lnet/burningtnt/terracotta/TerracottaAndroidAPI$VpnServiceRequest;

    move-result-object v4

    invoke-interface {v4}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$VpnServiceRequest;->reject()V

    .end local v2    # "$this$invokeSuspend_u24lambda_u240":Lkotlinx/coroutines/CoroutineScope;
    .end local v3    # "$i$a$-runCatching-MultiplayerController$onVpnPermissionResult$1$1":I
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    iget-object v2, p0, Lcom/pymcl/multiplayer/MultiplayerController$onVpnPermissionResult$1;->this$0:Lcom/pymcl/multiplayer/MultiplayerController;

    move-object v3, p0

    check-cast v3, Lkotlin/coroutines/Continuation;

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, p0, Lcom/pymcl/multiplayer/MultiplayerController$onVpnPermissionResult$1;->L$0:Ljava/lang/Object;

    const/4 v4, 0x1

    iput v4, p0, Lcom/pymcl/multiplayer/MultiplayerController$onVpnPermissionResult$1;->label:I

    invoke-virtual {v2, v3}, Lcom/pymcl/multiplayer/MultiplayerController;->stop(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_0

    .line 162
    return-object v1

    .line 164
    :cond_0
    :goto_1
    iget-object v1, p0, Lcom/pymcl/multiplayer/MultiplayerController$onVpnPermissionResult$1;->this$0:Lcom/pymcl/multiplayer/MultiplayerController;

    invoke-static {v1}, Lcom/pymcl/multiplayer/MultiplayerController;->access$get_notices$p(Lcom/pymcl/multiplayer/MultiplayerController;)Lkotlinx/coroutines/flow/MutableSharedFlow;

    move-result-object v1

    const-string v2, "\u6ca1\u6709\u83b7\u5f97 VPN \u6388\u6743\uff0c\u8054\u673a\u5df2\u53d6\u6d88\u3002\u9676\u74e6\u8054\u673a\u9700\u8981\u5efa\u7acb\u865a\u62df\u7f51\u5361\uff0c\u8bf7\u91cd\u65b0\u70b9\u300c\u521b\u5efa\u300d\u6216\u300c\u52a0\u5165\u300d\u5e76\u5728\u7cfb\u7edf\u5f39\u7a97\u91cc\u5141\u8bb8"

    invoke-interface {v1, v2}, Lkotlinx/coroutines/flow/MutableSharedFlow;->tryEmit(Ljava/lang/Object;)Z

    .line 165
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
