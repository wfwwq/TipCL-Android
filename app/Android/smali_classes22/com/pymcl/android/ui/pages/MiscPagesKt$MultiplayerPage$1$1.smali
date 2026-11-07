.class final Lcom/pymcl/android/ui/pages/MiscPagesKt$MultiplayerPage$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "MiscPages.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/pages/MiscPagesKt;->MultiplayerPage(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/Composer;I)V
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
    value = "SMAP\nMiscPages.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiscPages.kt\ncom/pymcl/android/ui/pages/MiscPagesKt$MultiplayerPage$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,585:1\n1#2:586\n*E\n"
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
    c = "com.pymcl.android.ui.pages.MiscPagesKt$MultiplayerPage$1$1"
    f = "MiscPages.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0x2c
    }
    m = "invokeSuspend"
    n = {
        "$this$LaunchedEffect",
        "c"
    }
    nl = {
        0x2d
    }
    s = {
        "L$0",
        "L$1"
    }
    v = 0x2
.end annotation


# instance fields
.field final synthetic $ctx:Landroid/content/Context;

.field final synthetic $state:Lcom/pymcl/android/ui/state/AppState;

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lcom/pymcl/android/ui/state/AppState;Landroid/content/Context;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Landroid/content/Context;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/pages/MiscPagesKt$MultiplayerPage$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$MultiplayerPage$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$MultiplayerPage$1$1;->$ctx:Landroid/content/Context;

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

    new-instance v0, Lcom/pymcl/android/ui/pages/MiscPagesKt$MultiplayerPage$1$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$MultiplayerPage$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$MultiplayerPage$1$1;->$ctx:Landroid/content/Context;

    invoke-direct {v0, v1, v2, p2}, Lcom/pymcl/android/ui/pages/MiscPagesKt$MultiplayerPage$1$1;-><init>(Lcom/pymcl/android/ui/state/AppState;Landroid/content/Context;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/pymcl/android/ui/pages/MiscPagesKt$MultiplayerPage$1$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/MiscPagesKt$MultiplayerPage$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/MiscPagesKt$MultiplayerPage$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/pages/MiscPagesKt$MultiplayerPage$1$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/pages/MiscPagesKt$MultiplayerPage$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7
    .param p1, "$result"    # Ljava/lang/Object;

    iget-object v0, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$MultiplayerPage$1$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlinx/coroutines/CoroutineScope;

    .local v0, "$this$LaunchedEffect":Lkotlinx/coroutines/CoroutineScope;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 42
    iget v2, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$MultiplayerPage$1$1;->label:I

    packed-switch v2, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$MultiplayerPage$1$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/pymcl/multiplayer/MultiplayerController;

    .local v1, "c":Lcom/pymcl/multiplayer/MultiplayerController;
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    .end local v1    # "c":Lcom/pymcl/multiplayer/MultiplayerController;
    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 43
    iget-object v2, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$MultiplayerPage$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/AppState;->getApi()Lcom/pymcl/android/ui/state/LauncherUiApi;

    move-result-object v2

    instance-of v2, v2, Lcom/pymcl/android/data/RepositoryUiApi;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$MultiplayerPage$1$1;->$ctx:Landroid/content/Context;

    :try_start_0
    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v4, v0

    .line 586
    .local v4, "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    const/4 v5, 0x0

    .line 43
    .local v5, "$i$a$-runCatching-MiscPagesKt$MultiplayerPage$1$1$c$1\\1\\43\\0":I
    sget-object v6, Lcom/pymcl/multiplayer/MultiplayerController;->Companion:Lcom/pymcl/multiplayer/MultiplayerController$Companion;

    invoke-virtual {v6, v2}, Lcom/pymcl/multiplayer/MultiplayerController$Companion;->get(Landroid/content/Context;)Lcom/pymcl/multiplayer/MultiplayerController;

    move-result-object v2

    .end local v4    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    .end local v5    # "$i$a$-runCatching-MiscPagesKt$MultiplayerPage$1$1$c$1\\1\\43\\0":I
    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    :goto_0
    invoke-static {v2}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    move-object v3, v2

    :goto_1
    check-cast v3, Lcom/pymcl/multiplayer/MultiplayerController;

    .line 44
    .local v3, "c":Lcom/pymcl/multiplayer/MultiplayerController;
    :cond_1
    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lcom/pymcl/multiplayer/MultiplayerController;->getNotices()Lkotlinx/coroutines/flow/SharedFlow;

    move-result-object v2

    if-eqz v2, :cond_3

    new-instance v4, Lcom/pymcl/android/ui/pages/MiscPagesKt$MultiplayerPage$1$1$1;

    iget-object v5, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$MultiplayerPage$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    invoke-direct {v4, v5}, Lcom/pymcl/android/ui/pages/MiscPagesKt$MultiplayerPage$1$1$1;-><init>(Lcom/pymcl/android/ui/state/AppState;)V

    check-cast v4, Lkotlinx/coroutines/flow/FlowCollector;

    move-object v5, p0

    check-cast v5, Lkotlin/coroutines/Continuation;

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$MultiplayerPage$1$1;->L$0:Ljava/lang/Object;

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$MultiplayerPage$1$1;->L$1:Ljava/lang/Object;

    const/4 v6, 0x1

    iput v6, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$MultiplayerPage$1$1;->label:I

    invoke-interface {v2, v4, v5}, Lkotlinx/coroutines/flow/SharedFlow;->collect(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_2

    .line 42
    return-object v1

    .line 44
    :cond_2
    move-object v1, v3

    .end local v3    # "c":Lcom/pymcl/multiplayer/MultiplayerController;
    .restart local v1    # "c":Lcom/pymcl/multiplayer/MultiplayerController;
    :goto_2
    new-instance v2, Lkotlin/KotlinNothingValueException;

    invoke-direct {v2}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v2

    .line 45
    .end local v1    # "c":Lcom/pymcl/multiplayer/MultiplayerController;
    .restart local v3    # "c":Lcom/pymcl/multiplayer/MultiplayerController;
    :cond_3
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
