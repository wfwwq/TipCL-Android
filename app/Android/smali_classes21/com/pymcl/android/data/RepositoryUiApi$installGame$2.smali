.class final Lcom/pymcl/android/data/RepositoryUiApi$installGame$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "RepositoryUiApi.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/data/RepositoryUiApi;->installGame(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Ljava/lang/String;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"
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
    c = "com.pymcl.android.data.RepositoryUiApi$installGame$2"
    f = "RepositoryUiApi.kt"
    i = {
        0x0
    }
    l = {
        0x9c
    }
    m = "invokeSuspend"
    n = {
        "i"
    }
    nl = {
        0xac
    }
    s = {
        "L$0"
    }
    v = 0x2
.end annotation


# instance fields
.field final synthetic $instance:Ljava/lang/String;

.field final synthetic $loader:Ljava/lang/String;

.field final synthetic $loaderVersion:Ljava/lang/String;

.field final synthetic $onProgress:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Ljava/lang/Float;",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $version:Ljava/lang/String;

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/pymcl/android/data/RepositoryUiApi;


# direct methods
.method constructor <init>(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/data/RepositoryUiApi;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Float;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/data/RepositoryUiApi$installGame$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    iput-object p2, p0, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2;->$instance:Ljava/lang/String;

    iput-object p3, p0, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2;->$onProgress:Lkotlin/jvm/functions/Function2;

    iput-object p4, p0, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2;->$version:Ljava/lang/String;

    iput-object p5, p0, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2;->$loader:Ljava/lang/String;

    iput-object p6, p0, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2;->$loaderVersion:Ljava/lang/String;

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

    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2;

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2;->$instance:Ljava/lang/String;

    iget-object v3, p0, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2;->$onProgress:Lkotlin/jvm/functions/Function2;

    iget-object v4, p0, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2;->$version:Ljava/lang/String;

    iget-object v5, p0, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2;->$loader:Ljava/lang/String;

    iget-object v6, p0, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2;->$loaderVersion:Ljava/lang/String;

    move-object v7, p1

    invoke-direct/range {v0 .. v7}, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 154
    iget v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2;->label:I

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/pymcl/core/instance/Instance;

    .local v0, "i":Lcom/pymcl/core/instance/Instance;
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v1, p1

    goto :goto_0

    .end local v0    # "i":Lcom/pymcl/core/instance/Instance;
    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 155
    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2;->$instance:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/pymcl/android/data/RepositoryUiApi;->access$instForInstall(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;)Lcom/pymcl/core/instance/Instance;

    move-result-object v6

    .line 156
    .local v6, "i":Lcom/pymcl/core/instance/Instance;
    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2;->$onProgress:Lkotlin/jvm/functions/Function2;

    new-instance v3, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;

    iget-object v4, p0, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    iget-object v5, p0, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2;->$version:Ljava/lang/String;

    iget-object v7, p0, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2;->$loader:Ljava/lang/String;

    iget-object v8, p0, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2;->$loaderVersion:Ljava/lang/String;

    iget-object v9, p0, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2;->$onProgress:Lkotlin/jvm/functions/Function2;

    const/4 v10, 0x0

    invoke-direct/range {v3 .. v10}, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Lcom/pymcl/core/instance/Instance;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v4, p0

    check-cast v4, Lkotlin/coroutines/Continuation;

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, p0, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2;->L$0:Ljava/lang/Object;

    const/4 v5, 0x1

    iput v5, p0, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2;->label:I

    invoke-static {v1, v2, v3, v4}, Lcom/pymcl/android/data/RepositoryUiApi;->access$withProgress(Lcom/pymcl/android/data/RepositoryUiApi;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_0

    .line 154
    return-object v0

    .line 156
    :cond_0
    move-object v0, v6

    .line 172
    .end local v6    # "i":Lcom/pymcl/core/instance/Instance;
    .restart local v0    # "i":Lcom/pymcl/core/instance/Instance;
    :goto_0
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
