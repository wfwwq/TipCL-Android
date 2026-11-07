.class final Lcom/pymcl/multiplayer/MultiplayerController$startPolling$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "MultiplayerController.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/multiplayer/MultiplayerController;->startPolling()V
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
    value = "SMAP\nMultiplayerController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiplayerController.kt\ncom/pymcl/multiplayer/MultiplayerController$startPolling$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1#2:169\n*E\n"
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
    c = "com.pymcl.multiplayer.MultiplayerController$startPolling$1"
    f = "MultiplayerController.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0x77
    }
    m = "invokeSuspend"
    n = {
        "$this$launch",
        "lastIdx"
    }
    nl = {
        0x79
    }
    s = {
        "L$0",
        "L$1"
    }
    v = 0x2
.end annotation


# instance fields
.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

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
            "Lcom/pymcl/multiplayer/MultiplayerController$startPolling$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/multiplayer/MultiplayerController$startPolling$1;->this$0:Lcom/pymcl/multiplayer/MultiplayerController;

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

    new-instance v0, Lcom/pymcl/multiplayer/MultiplayerController$startPolling$1;

    iget-object v1, p0, Lcom/pymcl/multiplayer/MultiplayerController$startPolling$1;->this$0:Lcom/pymcl/multiplayer/MultiplayerController;

    invoke-direct {v0, v1, p2}, Lcom/pymcl/multiplayer/MultiplayerController$startPolling$1;-><init>(Lcom/pymcl/multiplayer/MultiplayerController;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/pymcl/multiplayer/MultiplayerController$startPolling$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/multiplayer/MultiplayerController$startPolling$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/multiplayer/MultiplayerController$startPolling$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/multiplayer/MultiplayerController$startPolling$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/multiplayer/MultiplayerController$startPolling$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11
    .param p1, "$result"    # Ljava/lang/Object;

    iget-object v0, p0, Lcom/pymcl/multiplayer/MultiplayerController$startPolling$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlinx/coroutines/CoroutineScope;

    .local v0, "$this$launch":Lkotlinx/coroutines/CoroutineScope;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 112
    iget v2, p0, Lcom/pymcl/multiplayer/MultiplayerController$startPolling$1;->label:I

    packed-switch v2, :pswitch_data_0

    .end local p0    # "this":Lcom/pymcl/multiplayer/MultiplayerController$startPolling$1;
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .restart local p0    # "this":Lcom/pymcl/multiplayer/MultiplayerController$startPolling$1;
    :pswitch_0
    iget-object v2, p0, Lcom/pymcl/multiplayer/MultiplayerController$startPolling$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/Ref$IntRef;

    .local v2, "lastIdx":Lkotlin/jvm/internal/Ref$IntRef;
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v3, p0

    goto/16 :goto_2

    .end local v2    # "lastIdx":Lkotlin/jvm/internal/Ref$IntRef;
    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 113
    new-instance v2, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .restart local v2    # "lastIdx":Lkotlin/jvm/internal/Ref$IntRef;
    const/4 v3, -0x1

    iput v3, v2, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    move-object v3, p0

    .line 114
    .end local p0    # "this":Lcom/pymcl/multiplayer/MultiplayerController$startPolling$1;
    .local v3, "this":Lcom/pymcl/multiplayer/MultiplayerController$startPolling$1;
    :goto_0
    invoke-static {v0}, Lkotlinx/coroutines/CoroutineScopeKt;->isActive(Lkotlinx/coroutines/CoroutineScope;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 115
    :try_start_0
    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v4, v0

    .line 169
    .local v4, "$this$invokeSuspend_u24lambda_u240":Lkotlinx/coroutines/CoroutineScope;
    const/4 v5, 0x0

    .line 115
    .local v5, "$i$a$-runCatching-MultiplayerController$startPolling$1$1":I
    sget-object v6, Lcom/pymcl/multiplayer/MultiplayerState;->Companion:Lcom/pymcl/multiplayer/MultiplayerState$Companion;

    invoke-static {}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI;->getState()Ljava/lang/String;

    move-result-object v7

    const-string v8, "getState(...)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, v7}, Lcom/pymcl/multiplayer/MultiplayerState$Companion;->parse(Ljava/lang/String;)Lkotlin/Pair;

    move-result-object v6

    .end local v4    # "$this$invokeSuspend_u24lambda_u240":Lkotlinx/coroutines/CoroutineScope;
    .end local v5    # "$i$a$-runCatching-MultiplayerController$startPolling$1$1":I
    invoke-static {v6}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v4

    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v4}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    :goto_1
    iget-object v5, v3, Lcom/pymcl/multiplayer/MultiplayerController$startPolling$1;->this$0:Lcom/pymcl/multiplayer/MultiplayerController;

    invoke-static {v4}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    move-object v6, v4

    check-cast v6, Lkotlin/Pair;

    const/4 v7, 0x0

    .local v7, "$i$a$-onSuccess-MultiplayerController$startPolling$1$2":I
    invoke-virtual {v6}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    .local v8, "i":I
    invoke-virtual {v6}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/pymcl/multiplayer/MultiplayerState;

    .line 117
    .local v6, "s":Lcom/pymcl/multiplayer/MultiplayerState;
    sget-object v9, Lcom/pymcl/multiplayer/MultiplayerState;->Companion:Lcom/pymcl/multiplayer/MultiplayerState$Companion;

    iget v10, v2, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-virtual {v9, v8, v10}, Lcom/pymcl/multiplayer/MultiplayerState$Companion;->isNewer(II)Z

    move-result v9

    if-eqz v9, :cond_0

    iput v8, v2, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-static {v5}, Lcom/pymcl/multiplayer/MultiplayerController;->access$get_state$p(Lcom/pymcl/multiplayer/MultiplayerController;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v9

    invoke-interface {v9, v6}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    sget-object v9, Lcom/pymcl/multiplayer/TerracottaVpnService;->Companion:Lcom/pymcl/multiplayer/TerracottaVpnService$Companion;

    invoke-static {v5}, Lcom/pymcl/multiplayer/MultiplayerController;->access$getApp$p(Lcom/pymcl/multiplayer/MultiplayerController;)Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v9, v5, v6}, Lcom/pymcl/multiplayer/TerracottaVpnService$Companion;->updateText(Landroid/content/Context;Lcom/pymcl/multiplayer/MultiplayerState;)V

    .line 118
    :cond_0
    nop

    .line 115
    .end local v6    # "s":Lcom/pymcl/multiplayer/MultiplayerState;
    .end local v7    # "$i$a$-onSuccess-MultiplayerController$startPolling$1$2":I
    .end local v8    # "i":I
    :cond_1
    nop

    .line 118
    invoke-static {v4}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 169
    .local v4, "it":Ljava/lang/Throwable;
    const/4 v5, 0x0

    .line 118
    .local v5, "$i$a$-onFailure-MultiplayerController$startPolling$1$3":I
    const-string v6, "PyMCL-MP"

    const-string v7, "getState"

    invoke-static {v6, v7, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 119
    .end local v4    # "it":Ljava/lang/Throwable;
    .end local v5    # "$i$a$-onFailure-MultiplayerController$startPolling$1$3":I
    :cond_2
    move-object v4, v3

    check-cast v4, Lkotlin/coroutines/Continuation;

    iput-object v0, v3, Lcom/pymcl/multiplayer/MultiplayerController$startPolling$1;->L$0:Ljava/lang/Object;

    iput-object v2, v3, Lcom/pymcl/multiplayer/MultiplayerController$startPolling$1;->L$1:Ljava/lang/Object;

    const/4 v5, 0x1

    iput v5, v3, Lcom/pymcl/multiplayer/MultiplayerController$startPolling$1;->label:I

    const-wide/16 v5, 0xfa

    invoke-static {v5, v6, v4}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_3

    .line 112
    return-object v1

    .line 119
    :cond_3
    :goto_2
    goto/16 :goto_0

    .line 121
    :cond_4
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
