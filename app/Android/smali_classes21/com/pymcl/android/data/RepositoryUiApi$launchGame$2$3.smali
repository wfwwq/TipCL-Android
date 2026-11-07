.class final Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2$3;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "RepositoryUiApi.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Ljava/lang/Object;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001H\n"
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
    c = "com.pymcl.android.data.RepositoryUiApi$launchGame$2$3"
    f = "RepositoryUiApi.kt"
    i = {
        0x1
    }
    l = {
        0x137,
        0x13c
    }
    m = "invokeSuspend"
    n = {
        "q"
    }
    nl = {
        0x13a,
        0x13d
    }
    s = {
        "L$0"
    }
    v = 0x2
.end annotation


# instance fields
.field final synthetic $dirs:Lcom/pymcl/core/version/GameDirs;

.field final synthetic $i:Lcom/pymcl/core/instance/Instance;

.field final synthetic $onLog:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $skipAssets:Z

.field final synthetic $vid:Ljava/lang/String;

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/pymcl/android/data/RepositoryUiApi;


# direct methods
.method constructor <init>(Lcom/pymcl/core/instance/Instance;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/pymcl/android/data/RepositoryUiApi;Lcom/pymcl/core/version/GameDirs;ZLkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/instance/Instance;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/pymcl/android/data/RepositoryUiApi;",
            "Lcom/pymcl/core/version/GameDirs;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2$3;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2$3;->$i:Lcom/pymcl/core/instance/Instance;

    iput-object p2, p0, Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2$3;->$vid:Ljava/lang/String;

    iput-object p3, p0, Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2$3;->$onLog:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2$3;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    iput-object p5, p0, Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2$3;->$dirs:Lcom/pymcl/core/version/GameDirs;

    iput-boolean p6, p0, Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2$3;->$skipAssets:Z

    const/4 v0, 0x1

    invoke-direct {p0, v0, p7}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 8
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

    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2$3;

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2$3;->$i:Lcom/pymcl/core/instance/Instance;

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2$3;->$vid:Ljava/lang/String;

    iget-object v3, p0, Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2$3;->$onLog:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2$3;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    iget-object v5, p0, Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2$3;->$dirs:Lcom/pymcl/core/version/GameDirs;

    iget-boolean v6, p0, Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2$3;->$skipAssets:Z

    move-object v7, p1

    invoke-direct/range {v0 .. v7}, Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2$3;-><init>(Lcom/pymcl/core/instance/Instance;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/pymcl/android/data/RepositoryUiApi;Lcom/pymcl/core/version/GameDirs;ZLkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2$3;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2$3;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2$3;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 310
    iget v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2$3;->label:I

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2$3;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/pymcl/core/version/QuickCheckResult;

    .local v0, "q":Lcom/pymcl/core/version/QuickCheckResult;
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_1

    .end local v0    # "q":Lcom/pymcl/core/version/QuickCheckResult;
    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v1, p1

    goto :goto_0

    :pswitch_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 311
    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2$3;->$i:Lcom/pymcl/core/instance/Instance;

    invoke-virtual {v1}, Lcom/pymcl/core/instance/Instance;->versions()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2$3;->$vid:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2$3;->$onLog:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2$3;->$vid:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "[PyMCL] \u5b89\u88c5\u539f\u7248 "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2$3;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    invoke-static {v1}, Lcom/pymcl/android/data/RepositoryUiApi;->access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApi;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v1

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2$3;->$vid:Ljava/lang/String;

    iget-object v3, p0, Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2$3;->$i:Lcom/pymcl/core/instance/Instance;

    move-object v4, p0

    check-cast v4, Lkotlin/coroutines/Continuation;

    const/4 v5, 0x1

    iput v5, p0, Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2$3;->label:I

    invoke-virtual {v1, v2, v3, v4}, Lcom/pymcl/android/data/LauncherRepository;->installVanilla(Ljava/lang/String;Lcom/pymcl/core/instance/Instance;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_0

    .line 310
    return-object v0

    .line 311
    :cond_0
    :goto_0
    goto/16 :goto_3

    .line 314
    :cond_1
    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2$3;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    invoke-static {v1}, Lcom/pymcl/android/data/RepositoryUiApi;->access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApi;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v1

    invoke-virtual {v1}, Lcom/pymcl/android/data/LauncherRepository;->getGame()Lcom/pymcl/core/version/GameInstaller;

    move-result-object v1

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2$3;->$dirs:Lcom/pymcl/core/version/GameDirs;

    iget-object v3, p0, Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2$3;->$vid:Ljava/lang/String;

    iget-boolean v4, p0, Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2$3;->$skipAssets:Z

    invoke-virtual {v1, v2, v3, v4}, Lcom/pymcl/core/version/GameInstaller;->quickCheck(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Z)Lcom/pymcl/core/version/QuickCheckResult;

    move-result-object v1

    .line 315
    .local v1, "q":Lcom/pymcl/core/version/QuickCheckResult;
    invoke-virtual {v1}, Lcom/pymcl/core/version/QuickCheckResult;->getComplete()Z

    move-result v2

    const-string v3, "\uff09"

    if-eqz v2, :cond_2

    iget-object v0, p0, Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2$3;->$onLog:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1}, Lcom/pymcl/core/version/QuickCheckResult;->getReason()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "[PyMCL] \u6587\u4ef6\u5b8c\u6574\uff08\u5feb\u901f\u68c0\u67e5\uff1a"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 316
    :cond_2
    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2$3;->$onLog:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1}, Lcom/pymcl/core/version/QuickCheckResult;->getReason()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "[PyMCL] \u68c0\u67e5\u6587\u4ef6\u5b8c\u6574\u6027\uff08\u5168\u91cf\u6821\u9a8c\uff1a"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2$3;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    invoke-static {v2}, Lcom/pymcl/android/data/RepositoryUiApi;->access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApi;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v2

    invoke-virtual {v2}, Lcom/pymcl/android/data/LauncherRepository;->getGame()Lcom/pymcl/core/version/GameInstaller;

    move-result-object v2

    iget-object v3, p0, Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2$3;->$dirs:Lcom/pymcl/core/version/GameDirs;

    iget-object v4, p0, Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2$3;->$vid:Ljava/lang/String;

    iget-boolean v5, p0, Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2$3;->$skipAssets:Z

    move-object v6, p0

    check-cast v6, Lkotlin/coroutines/Continuation;

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, p0, Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2$3;->L$0:Ljava/lang/Object;

    const/4 v7, 0x2

    iput v7, p0, Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2$3;->label:I

    invoke-virtual {v2, v3, v4, v5, v6}, Lcom/pymcl/core/version/GameInstaller;->completeFiles(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_3

    .line 310
    return-object v0

    .line 316
    :cond_3
    move-object v0, v1

    .line 317
    .end local v1    # "q":Lcom/pymcl/core/version/QuickCheckResult;
    .restart local v0    # "q":Lcom/pymcl/core/version/QuickCheckResult;
    :goto_1
    nop

    .end local v0    # "q":Lcom/pymcl/core/version/QuickCheckResult;
    :goto_2
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_3
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
