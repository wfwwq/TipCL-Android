.class final Lcom/pymcl/android/data/RepositoryUiApi$startMicrosoftLogin$1$job$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "RepositoryUiApi.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/data/RepositoryUiApi$startMicrosoftLogin$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.pymcl.android.data.RepositoryUiApi$startMicrosoftLogin$1$job$1"
    f = "RepositoryUiApi.kt"
    i = {
        0x1,
        0x2
    }
    l = {
        0xc0,
        0xc1,
        0xc2
    }
    m = "invokeSuspend"
    n = {
        "acc",
        "e"
    }
    nl = {
        0xc1,
        0xc2,
        0xc3
    }
    s = {
        "L$0",
        "L$0"
    }
    v = 0x2
.end annotation


# instance fields
.field final synthetic $$this$channelFlow:Lkotlinx/coroutines/channels/ProducerScope;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/ProducerScope<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $cancelled:Lkotlin/jvm/internal/Ref$BooleanRef;

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/pymcl/android/data/RepositoryUiApi;


# direct methods
.method public static synthetic $r8$lambda$631elNd44m25Rj4ffFUvRGzBR1E(Lkotlinx/coroutines/channels/ProducerScope;Lcom/pymcl/core/auth/DeviceCode;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi$startMicrosoftLogin$1$job$1;->invokeSuspend$lambda$0(Lkotlinx/coroutines/channels/ProducerScope;Lcom/pymcl/core/auth/DeviceCode;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$OiwxR1pCIm8fBxTid0fX3_0p4J8(Lkotlin/jvm/internal/Ref$BooleanRef;)Z
    .locals 0

    invoke-static {p0}, Lcom/pymcl/android/data/RepositoryUiApi$startMicrosoftLogin$1$job$1;->invokeSuspend$lambda$1(Lkotlin/jvm/internal/Ref$BooleanRef;)Z

    move-result p0

    return p0
.end method

.method constructor <init>(Lcom/pymcl/android/data/RepositoryUiApi;Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/data/RepositoryUiApi;",
            "Lkotlinx/coroutines/channels/ProducerScope<",
            "-",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;",
            "Lkotlin/jvm/internal/Ref$BooleanRef;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/data/RepositoryUiApi$startMicrosoftLogin$1$job$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/data/RepositoryUiApi$startMicrosoftLogin$1$job$1;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    iput-object p2, p0, Lcom/pymcl/android/data/RepositoryUiApi$startMicrosoftLogin$1$job$1;->$$this$channelFlow:Lkotlinx/coroutines/channels/ProducerScope;

    iput-object p3, p0, Lcom/pymcl/android/data/RepositoryUiApi$startMicrosoftLogin$1$job$1;->$cancelled:Lkotlin/jvm/internal/Ref$BooleanRef;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method private static final invokeSuspend$lambda$0(Lkotlinx/coroutines/channels/ProducerScope;Lcom/pymcl/core/auth/DeviceCode;)Lkotlin/Unit;
    .locals 3
    .param p0, "$$this$channelFlow"    # Lkotlinx/coroutines/channels/ProducerScope;
    .param p1, "dc"    # Lcom/pymcl/core/auth/DeviceCode;

    .line 192
    invoke-virtual {p1}, Lcom/pymcl/core/auth/DeviceCode;->getUserCode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/pymcl/core/auth/DeviceCode;->getVerificationUri()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "|"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "login_code"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    invoke-interface {p0, v0}, Lkotlinx/coroutines/channels/ProducerScope;->trySend-JP2dKIU(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final invokeSuspend$lambda$1(Lkotlin/jvm/internal/Ref$BooleanRef;)Z
    .locals 1
    .param p0, "$cancelled"    # Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 192
    iget-boolean v0, p0, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    return v0
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

    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$startMicrosoftLogin$1$job$1;

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$startMicrosoftLogin$1$job$1;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApi$startMicrosoftLogin$1$job$1;->$$this$channelFlow:Lkotlinx/coroutines/channels/ProducerScope;

    iget-object v3, p0, Lcom/pymcl/android/data/RepositoryUiApi$startMicrosoftLogin$1$job$1;->$cancelled:Lkotlin/jvm/internal/Ref$BooleanRef;

    invoke-direct {v0, v1, v2, v3, p2}, Lcom/pymcl/android/data/RepositoryUiApi$startMicrosoftLogin$1$job$1;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/data/RepositoryUiApi$startMicrosoftLogin$1$job$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/data/RepositoryUiApi$startMicrosoftLogin$1$job$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/data/RepositoryUiApi$startMicrosoftLogin$1$job$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/RepositoryUiApi$startMicrosoftLogin$1$job$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 190
    iget v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$startMicrosoftLogin$1$job$1;->label:I

    const/4 v2, 0x1

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lcom/pymcl/android/data/RepositoryUiApi$startMicrosoftLogin$1$job$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Exception;

    .local v0, "e":Ljava/lang/Exception;
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_3

    .end local v0    # "e":Ljava/lang/Exception;
    :pswitch_1
    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$startMicrosoftLogin$1$job$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/pymcl/core/account/Account;

    .local v1, "acc":Lcom/pymcl/core/account/Account;
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    .end local v1    # "acc":Lcom/pymcl/core/account/Account;
    :pswitch_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, p1

    goto :goto_0

    .line 194
    :catch_0
    move-exception v1

    goto :goto_2

    .line 190
    :pswitch_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 191
    nop

    .line 192
    :try_start_1
    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$startMicrosoftLogin$1$job$1;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    invoke-static {v1}, Lcom/pymcl/android/data/RepositoryUiApi;->access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApi;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v1

    iget-object v3, p0, Lcom/pymcl/android/data/RepositoryUiApi$startMicrosoftLogin$1$job$1;->$$this$channelFlow:Lkotlinx/coroutines/channels/ProducerScope;

    new-instance v4, Lcom/pymcl/android/data/RepositoryUiApi$startMicrosoftLogin$1$job$1$$ExternalSyntheticLambda0;

    invoke-direct {v4, v3}, Lcom/pymcl/android/data/RepositoryUiApi$startMicrosoftLogin$1$job$1$$ExternalSyntheticLambda0;-><init>(Lkotlinx/coroutines/channels/ProducerScope;)V

    iget-object v3, p0, Lcom/pymcl/android/data/RepositoryUiApi$startMicrosoftLogin$1$job$1;->$cancelled:Lkotlin/jvm/internal/Ref$BooleanRef;

    new-instance v5, Lcom/pymcl/android/data/RepositoryUiApi$startMicrosoftLogin$1$job$1$$ExternalSyntheticLambda1;

    invoke-direct {v5, v3}, Lcom/pymcl/android/data/RepositoryUiApi$startMicrosoftLogin$1$job$1$$ExternalSyntheticLambda1;-><init>(Lkotlin/jvm/internal/Ref$BooleanRef;)V

    move-object v3, p0

    check-cast v3, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lcom/pymcl/android/data/RepositoryUiApi$startMicrosoftLogin$1$job$1;->label:I

    invoke-virtual {v1, v4, v5, v3}, Lcom/pymcl/android/data/LauncherRepository;->loginMicrosoft(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_0

    .line 190
    return-object v0

    :cond_0
    :goto_0
    check-cast v1, Lcom/pymcl/core/account/Account;

    .line 193
    .restart local v1    # "acc":Lcom/pymcl/core/account/Account;
    iget-object v3, p0, Lcom/pymcl/android/data/RepositoryUiApi$startMicrosoftLogin$1$job$1;->$$this$channelFlow:Lkotlinx/coroutines/channels/ProducerScope;

    const-string v4, "finished"

    invoke-virtual {v1}, Lcom/pymcl/core/account/Account;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    move-object v5, p0

    check-cast v5, Lkotlin/coroutines/Continuation;

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, p0, Lcom/pymcl/android/data/RepositoryUiApi$startMicrosoftLogin$1$job$1;->L$0:Ljava/lang/Object;

    const/4 v6, 0x2

    iput v6, p0, Lcom/pymcl/android/data/RepositoryUiApi$startMicrosoftLogin$1$job$1;->label:I

    invoke-interface {v3, v4, v5}, Lkotlinx/coroutines/channels/ProducerScope;->send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ne v3, v0, :cond_1

    .line 190
    return-object v0

    .line 193
    .end local v1    # "acc":Lcom/pymcl/core/account/Account;
    :cond_1
    :goto_1
    goto :goto_4

    .line 194
    .local v1, "e":Ljava/lang/Exception;
    :goto_2
    iget-object v3, p0, Lcom/pymcl/android/data/RepositoryUiApi$startMicrosoftLogin$1$job$1;->$$this$channelFlow:Lkotlinx/coroutines/channels/ProducerScope;

    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_2

    invoke-virtual {v1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v4

    :cond_2
    const-string v5, "login_status"

    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    move-object v5, p0

    check-cast v5, Lkotlin/coroutines/Continuation;

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, p0, Lcom/pymcl/android/data/RepositoryUiApi$startMicrosoftLogin$1$job$1;->L$0:Ljava/lang/Object;

    const/4 v6, 0x3

    iput v6, p0, Lcom/pymcl/android/data/RepositoryUiApi$startMicrosoftLogin$1$job$1;->label:I

    invoke-interface {v3, v4, v5}, Lkotlinx/coroutines/channels/ProducerScope;->send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_3

    .line 190
    return-object v0

    .line 194
    :cond_3
    move-object v0, v1

    .line 195
    .end local v1    # "e":Ljava/lang/Exception;
    .restart local v0    # "e":Ljava/lang/Exception;
    :goto_3
    nop

    .end local v0    # "e":Ljava/lang/Exception;
    :goto_4
    iget-object v0, p0, Lcom/pymcl/android/data/RepositoryUiApi$startMicrosoftLogin$1$job$1;->$$this$channelFlow:Lkotlinx/coroutines/channels/ProducerScope;

    check-cast v0, Lkotlinx/coroutines/channels/SendChannel;

    const/4 v1, 0x0

    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/channels/SendChannel$DefaultImpls;->close$default(Lkotlinx/coroutines/channels/SendChannel;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    .line 196
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
