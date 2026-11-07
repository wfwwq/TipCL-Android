.class final Lcom/pymcl/android/data/LauncherRepository$installLoader$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "LauncherRepository.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/data/LauncherRepository;->installLoader(Lcom/pymcl/core/loader/LoaderType;Ljava/lang/String;Ljava/lang/String;Lcom/pymcl/core/instance/Instance;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/android/data/LauncherRepository$installLoader$2$WhenMappings;
    }
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
    c = "com.pymcl.android.data.LauncherRepository$installLoader$2"
    f = "LauncherRepository.kt"
    i = {
        0x0,
        0x1,
        0x2,
        0x3,
        0x4
    }
    l = {
        0x61,
        0x62,
        0x62,
        0x63,
        0x63
    }
    m = "invokeSuspend"
    n = {
        "d",
        "d",
        "d",
        "d",
        "d"
    }
    nl = {
        0x62,
        0x62,
        0x63,
        0x63,
        0x61
    }
    s = {
        "L$0",
        "L$0",
        "L$0",
        "L$0",
        "L$0"
    }
    v = 0x2
.end annotation


# instance fields
.field final synthetic $inst:Lcom/pymcl/core/instance/Instance;

.field final synthetic $mc:Ljava/lang/String;

.field final synthetic $type:Lcom/pymcl/core/loader/LoaderType;

.field final synthetic $version:Ljava/lang/String;

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/pymcl/android/data/LauncherRepository;


# direct methods
.method constructor <init>(Lcom/pymcl/android/data/LauncherRepository;Lcom/pymcl/core/instance/Instance;Lcom/pymcl/core/loader/LoaderType;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/data/LauncherRepository;",
            "Lcom/pymcl/core/instance/Instance;",
            "Lcom/pymcl/core/loader/LoaderType;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/data/LauncherRepository$installLoader$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    iput-object p2, p0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->$inst:Lcom/pymcl/core/instance/Instance;

    iput-object p3, p0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->$type:Lcom/pymcl/core/loader/LoaderType;

    iput-object p4, p0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->$mc:Ljava/lang/String;

    iput-object p5, p0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->$version:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7
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

    new-instance v0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;

    iget-object v1, p0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    iget-object v2, p0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->$inst:Lcom/pymcl/core/instance/Instance;

    iget-object v3, p0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->$type:Lcom/pymcl/core/loader/LoaderType;

    iget-object v4, p0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->$mc:Ljava/lang/String;

    iget-object v5, p0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->$version:Ljava/lang/String;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;-><init>(Lcom/pymcl/android/data/LauncherRepository;Lcom/pymcl/core/instance/Instance;Lcom/pymcl/core/loader/LoaderType;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 95
    iget v1, p0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->label:I

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/pymcl/core/version/GameDirs;

    .local v0, "d":Lcom/pymcl/core/version/GameDirs;
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v1, p1

    goto :goto_0

    .end local v0    # "d":Lcom/pymcl/core/version/GameDirs;
    :pswitch_1
    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/pymcl/core/version/GameDirs;

    .restart local v0    # "d":Lcom/pymcl/core/version/GameDirs;
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v1, p1

    goto/16 :goto_1

    .end local v0    # "d":Lcom/pymcl/core/version/GameDirs;
    :pswitch_2
    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/pymcl/core/version/GameDirs;

    .restart local v0    # "d":Lcom/pymcl/core/version/GameDirs;
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v1, p1

    goto/16 :goto_2

    .end local v0    # "d":Lcom/pymcl/core/version/GameDirs;
    :pswitch_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 96
    iget-object v1, p0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    iget-object v2, p0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->$inst:Lcom/pymcl/core/instance/Instance;

    invoke-virtual {v1, v2}, Lcom/pymcl/android/data/LauncherRepository;->dirsFor(Lcom/pymcl/core/instance/Instance;)Lcom/pymcl/core/version/GameDirs;

    move-result-object v4

    .line 97
    .local v4, "d":Lcom/pymcl/core/version/GameDirs;
    iget-object v1, p0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->$type:Lcom/pymcl/core/loader/LoaderType;

    sget-object v2, Lcom/pymcl/android/data/LauncherRepository$installLoader$2$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Lcom/pymcl/core/loader/LoaderType;->ordinal()I

    move-result v1

    aget v1, v2, v1

    packed-switch v1, :pswitch_data_1

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 99
    :pswitch_4
    iget-object v1, p0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v1}, Lcom/pymcl/android/data/LauncherRepository;->getLoaders()Lcom/pymcl/core/loader/LoaderInstaller;

    move-result-object v3

    iget-object v5, p0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->$mc:Ljava/lang/String;

    iget-object v6, p0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->$version:Ljava/lang/String;

    move-object v8, p0

    check-cast v8, Lkotlin/coroutines/Continuation;

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->L$0:Ljava/lang/Object;

    const/4 v1, 0x5

    iput v1, p0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->label:I

    const/4 v7, 0x0

    const/16 v9, 0x8

    const/4 v10, 0x0

    invoke-static/range {v3 .. v10}, Lcom/pymcl/core/loader/LoaderInstaller;->installLiteLoader$default(Lcom/pymcl/core/loader/LoaderInstaller;Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/lang/String;Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_0

    .line 95
    return-object v0

    .line 99
    :pswitch_5
    iget-object v1, p0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v1}, Lcom/pymcl/android/data/LauncherRepository;->getLoaders()Lcom/pymcl/core/loader/LoaderInstaller;

    move-result-object v1

    iget-object v2, p0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->$mc:Ljava/lang/String;

    iget-object v3, p0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->$version:Ljava/lang/String;

    move-object v5, p0

    check-cast v5, Lkotlin/coroutines/Continuation;

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, p0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->L$0:Ljava/lang/Object;

    const/4 v6, 0x4

    iput v6, p0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->label:I

    invoke-virtual {v1, v4, v2, v3, v5}, Lcom/pymcl/core/loader/LoaderInstaller;->installOptiFine(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_0

    .line 95
    return-object v0

    .line 99
    :cond_0
    move-object v0, v4

    .end local v4    # "d":Lcom/pymcl/core/version/GameDirs;
    .restart local v0    # "d":Lcom/pymcl/core/version/GameDirs;
    :goto_0
    check-cast v1, Ljava/lang/String;

    goto :goto_3

    .line 98
    .end local v0    # "d":Lcom/pymcl/core/version/GameDirs;
    .restart local v4    # "d":Lcom/pymcl/core/version/GameDirs;
    :pswitch_6
    iget-object v1, p0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v1}, Lcom/pymcl/android/data/LauncherRepository;->getLoaders()Lcom/pymcl/core/loader/LoaderInstaller;

    move-result-object v1

    iget-object v2, p0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->$mc:Ljava/lang/String;

    iget-object v3, p0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->$version:Ljava/lang/String;

    move-object v5, p0

    check-cast v5, Lkotlin/coroutines/Continuation;

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, p0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->L$0:Ljava/lang/Object;

    const/4 v6, 0x3

    iput v6, p0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->label:I

    invoke-virtual {v1, v4, v2, v3, v5}, Lcom/pymcl/core/loader/LoaderInstaller;->installNeoForge(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_1

    .line 95
    return-object v0

    .line 98
    :pswitch_7
    iget-object v1, p0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v1}, Lcom/pymcl/android/data/LauncherRepository;->getLoaders()Lcom/pymcl/core/loader/LoaderInstaller;

    move-result-object v1

    iget-object v2, p0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->$mc:Ljava/lang/String;

    iget-object v3, p0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->$version:Ljava/lang/String;

    move-object v5, p0

    check-cast v5, Lkotlin/coroutines/Continuation;

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, p0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->L$0:Ljava/lang/Object;

    const/4 v6, 0x2

    iput v6, p0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->label:I

    invoke-virtual {v1, v4, v2, v3, v5}, Lcom/pymcl/core/loader/LoaderInstaller;->installForge(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_1

    .line 95
    return-object v0

    .line 98
    :cond_1
    move-object v0, v4

    .end local v4    # "d":Lcom/pymcl/core/version/GameDirs;
    .restart local v0    # "d":Lcom/pymcl/core/version/GameDirs;
    :goto_1
    check-cast v1, Ljava/lang/String;

    goto :goto_3

    .line 97
    .end local v0    # "d":Lcom/pymcl/core/version/GameDirs;
    .restart local v4    # "d":Lcom/pymcl/core/version/GameDirs;
    :pswitch_8
    iget-object v1, p0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v1}, Lcom/pymcl/android/data/LauncherRepository;->getLoaders()Lcom/pymcl/core/loader/LoaderInstaller;

    move-result-object v3

    iget-object v5, p0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->$type:Lcom/pymcl/core/loader/LoaderType;

    iget-object v6, p0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->$mc:Ljava/lang/String;

    iget-object v7, p0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->$version:Ljava/lang/String;

    move-object v9, p0

    check-cast v9, Lkotlin/coroutines/Continuation;

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->L$0:Ljava/lang/Object;

    const/4 v1, 0x1

    iput v1, p0, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;->label:I

    const/4 v8, 0x0

    const/16 v10, 0x10

    const/4 v11, 0x0

    invoke-static/range {v3 .. v11}, Lcom/pymcl/core/loader/LoaderInstaller;->installFabricLike$default(Lcom/pymcl/core/loader/LoaderInstaller;Lcom/pymcl/core/version/GameDirs;Lcom/pymcl/core/loader/LoaderType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    .line 95
    return-object v0

    .line 97
    :cond_2
    move-object v0, v4

    .end local v4    # "d":Lcom/pymcl/core/version/GameDirs;
    .restart local v0    # "d":Lcom/pymcl/core/version/GameDirs;
    :goto_2
    check-cast v1, Ljava/lang/String;

    .line 99
    :goto_3
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch
.end method
