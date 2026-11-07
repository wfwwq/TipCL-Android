.class final Lcom/pymcl/android/data/LauncherRepository$installVanilla$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "LauncherRepository.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/data/LauncherRepository;->installVanilla(Ljava/lang/String;Lcom/pymcl/core/instance/Instance;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Ljava/lang/String;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
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
    c = "com.pymcl.android.data.LauncherRepository$installVanilla$2"
    f = "LauncherRepository.kt"
    i = {}
    l = {
        0x5e
    }
    m = "invokeSuspend"
    n = {}
    nl = {
        -0x1
    }
    s = {}
    v = 0x2
.end annotation


# instance fields
.field final synthetic $id:Ljava/lang/String;

.field final synthetic $inst:Lcom/pymcl/core/instance/Instance;

.field label:I

.field final synthetic this$0:Lcom/pymcl/android/data/LauncherRepository;


# direct methods
.method constructor <init>(Lcom/pymcl/android/data/LauncherRepository;Lcom/pymcl/core/instance/Instance;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/data/LauncherRepository;",
            "Lcom/pymcl/core/instance/Instance;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/data/LauncherRepository$installVanilla$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/data/LauncherRepository$installVanilla$2;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    iput-object p2, p0, Lcom/pymcl/android/data/LauncherRepository$installVanilla$2;->$inst:Lcom/pymcl/core/instance/Instance;

    iput-object p3, p0, Lcom/pymcl/android/data/LauncherRepository$installVanilla$2;->$id:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
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

    new-instance v0, Lcom/pymcl/android/data/LauncherRepository$installVanilla$2;

    iget-object v1, p0, Lcom/pymcl/android/data/LauncherRepository$installVanilla$2;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    iget-object v2, p0, Lcom/pymcl/android/data/LauncherRepository$installVanilla$2;->$inst:Lcom/pymcl/core/instance/Instance;

    iget-object v3, p0, Lcom/pymcl/android/data/LauncherRepository$installVanilla$2;->$id:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, p2}, Lcom/pymcl/android/data/LauncherRepository$installVanilla$2;-><init>(Lcom/pymcl/android/data/LauncherRepository;Lcom/pymcl/core/instance/Instance;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/data/LauncherRepository$installVanilla$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/data/LauncherRepository$installVanilla$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/data/LauncherRepository$installVanilla$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/LauncherRepository$installVanilla$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 93
    iget v1, p0, Lcom/pymcl/android/data/LauncherRepository$installVanilla$2;->label:I

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 94
    iget-object v1, p0, Lcom/pymcl/android/data/LauncherRepository$installVanilla$2;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v1}, Lcom/pymcl/android/data/LauncherRepository;->getGame()Lcom/pymcl/core/version/GameInstaller;

    move-result-object v2

    iget-object v1, p0, Lcom/pymcl/android/data/LauncherRepository$installVanilla$2;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    iget-object v3, p0, Lcom/pymcl/android/data/LauncherRepository$installVanilla$2;->$inst:Lcom/pymcl/core/instance/Instance;

    invoke-virtual {v1, v3}, Lcom/pymcl/android/data/LauncherRepository;->dirsFor(Lcom/pymcl/core/instance/Instance;)Lcom/pymcl/core/version/GameDirs;

    move-result-object v3

    iget-object v4, p0, Lcom/pymcl/android/data/LauncherRepository$installVanilla$2;->$id:Ljava/lang/String;

    iget-object v1, p0, Lcom/pymcl/android/data/LauncherRepository$installVanilla$2;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v1}, Lcom/pymcl/android/data/LauncherRepository;->getConfig()Lcom/pymcl/core/config/ConfigStore;

    move-result-object v1

    const-string v5, "skip_assets"

    invoke-virtual {v1, v5}, Lcom/pymcl/core/config/ConfigStore;->bool(Ljava/lang/String;)Z

    move-result v5

    move-object v7, p0

    check-cast v7, Lkotlin/coroutines/Continuation;

    const/4 v1, 0x1

    iput v1, p0, Lcom/pymcl/android/data/LauncherRepository$installVanilla$2;->label:I

    const/4 v6, 0x0

    const/16 v8, 0x8

    const/4 v9, 0x0

    invoke-static/range {v2 .. v9}, Lcom/pymcl/core/version/GameInstaller;->installVanilla$default(Lcom/pymcl/core/version/GameInstaller;Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;ZLcom/pymcl/core/version/ManifestEntry;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_0

    .line 93
    return-object v0

    .line 94
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository$installVanilla$2;->$inst:Lcom/pymcl/core/instance/Instance;

    const-string v1, "mc_version"

    iget-object v2, p0, Lcom/pymcl/android/data/LauncherRepository$installVanilla$2;->$id:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/pymcl/core/instance/Instance;->setMeta(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository$installVanilla$2;->$id:Ljava/lang/String;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
