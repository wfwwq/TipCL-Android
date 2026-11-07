.class final Lcom/pymcl/android/data/RepositoryUiApi$terracottaJoin$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "RepositoryUiApi.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/data/RepositoryUiApi;->terracottaJoin(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/android/data/RepositoryUiApi$terracottaJoin$2$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Ljava/lang/String;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRepositoryUiApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepositoryUiApi.kt\ncom/pymcl/android/data/RepositoryUiApi$terracottaJoin$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,494:1\n1#2:495\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"
    }
    d2 = {
        "<anonymous>",
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
    c = "com.pymcl.android.data.RepositoryUiApi$terracottaJoin$2"
    f = "RepositoryUiApi.kt"
    i = {}
    l = {
        0x1b9
    }
    m = "invokeSuspend"
    n = {}
    nl = {
        0x1ef
    }
    s = {}
    v = 0x2
.end annotation


# instance fields
.field final synthetic $code:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lcom/pymcl/android/data/RepositoryUiApi;


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/pymcl/android/data/RepositoryUiApi;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/pymcl/android/data/RepositoryUiApi;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/data/RepositoryUiApi$terracottaJoin$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/data/RepositoryUiApi$terracottaJoin$2;->$code:Ljava/lang/String;

    iput-object p2, p0, Lcom/pymcl/android/data/RepositoryUiApi$terracottaJoin$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    const/4 v0, 0x1

    invoke-direct {p0, v0, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$terracottaJoin$2;

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$terracottaJoin$2;->$code:Ljava/lang/String;

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApi$terracottaJoin$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    invoke-direct {v0, v1, v2, p1}, Lcom/pymcl/android/data/RepositoryUiApi$terracottaJoin$2;-><init>(Ljava/lang/String;Lcom/pymcl/android/data/RepositoryUiApi;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi$terracottaJoin$2;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi$terracottaJoin$2;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/data/RepositoryUiApi$terracottaJoin$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/RepositoryUiApi$terracottaJoin$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 434
    iget v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$terracottaJoin$2;->label:I

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

    .line 435
    sget-object v1, Lcom/pymcl/multiplayer/TerracottaInterop;->INSTANCE:Lcom/pymcl/multiplayer/TerracottaInterop;

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApi$terracottaJoin$2;->$code:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/pymcl/multiplayer/TerracottaInterop;->classify(Ljava/lang/String;)Lcom/pymcl/multiplayer/TerracottaInterop$CodeKind;

    move-result-object v1

    sget-object v2, Lcom/pymcl/android/data/RepositoryUiApi$terracottaJoin$2$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Lcom/pymcl/multiplayer/TerracottaInterop$CodeKind;->ordinal()I

    move-result v1

    aget v1, v2, v1

    packed-switch v1, :pswitch_data_1

    .line 440
    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$terracottaJoin$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    invoke-static {v1}, Lcom/pymcl/android/data/RepositoryUiApi;->access$prepareMp(Lcom/pymcl/android/data/RepositoryUiApi;)V

    .line 441
    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$terracottaJoin$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    invoke-static {v1}, Lcom/pymcl/android/data/RepositoryUiApi;->access$getMp(Lcom/pymcl/android/data/RepositoryUiApi;)Lcom/pymcl/multiplayer/MultiplayerController;

    move-result-object v1

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApi$terracottaJoin$2;->$code:Ljava/lang/String;

    move-object v3, p0

    check-cast v3, Lkotlin/coroutines/Continuation;

    const/4 v4, 0x1

    iput v4, p0, Lcom/pymcl/android/data/RepositoryUiApi$terracottaJoin$2;->label:I

    invoke-virtual {v1, v2, v3}, Lcom/pymcl/multiplayer/MultiplayerController;->join(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_0

    .line 434
    return-object v0

    .line 437
    :pswitch_2
    const-string v0, "\u9080\u8bf7\u7801\u683c\u5f0f\u4e0d\u6b63\u786e\uff08\u5e94\u4e3a U/XXXX-XXXX-XXXX-XXXX\uff09"

    return-object v0

    .line 436
    :pswitch_3
    const-string v0, "\u8fd9\u662f\u65e7\u7248 PCL \u8054\u673a\u623f\u95f4\u53f7\uff0c\u4e0e\u9676\u74e6\u8054\u673a\u4e0d\u4e92\u901a"

    return-object v0

    .line 441
    :cond_0
    :goto_0
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    :cond_1
    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/pymcl/android/data/RepositoryUiApi$terracottaJoin$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    invoke-static {v0}, Lcom/pymcl/android/data/RepositoryUiApi;->access$getMp(Lcom/pymcl/android/data/RepositoryUiApi;)Lcom/pymcl/multiplayer/MultiplayerController;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/multiplayer/MultiplayerController;->getState()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Lcom/pymcl/multiplayer/MultiplayerState$Unavailable;

    if-eqz v2, :cond_3

    move-object v1, v0

    check-cast v1, Lcom/pymcl/multiplayer/MultiplayerState$Unavailable;

    :cond_3
    if-eqz v1, :cond_4

    .line 495
    .local v1, "it\\1":Lcom/pymcl/multiplayer/MultiplayerState$Unavailable;
    const/4 v0, 0x0

    .line 441
    .local v0, "$i$a$-let-RepositoryUiApi$terracottaJoin$2$1\\1\\441\\0":I
    invoke-virtual {v1}, Lcom/pymcl/multiplayer/MultiplayerState$Unavailable;->getReason()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\u8054\u673a\u5185\u6838\u4e0d\u53ef\u7528\uff1a"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .end local v0    # "$i$a$-let-RepositoryUiApi$terracottaJoin$2$1\\1\\441\\0":I
    .end local v1    # "it\\1":Lcom/pymcl/multiplayer/MultiplayerState$Unavailable;
    if-nez v1, :cond_1

    :cond_4
    const-string v1, "\u5185\u6838\u62d2\u7edd\u4e86\u8be5\u9080\u8bf7\u7801"

    :goto_1
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method
