.class final Lcom/pymcl/android/ui/state/AppState$loadInitial$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AppState.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/state/AppState;->loadInitial()Lkotlinx/coroutines/Job;
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
    value = "SMAP\nAppState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppState.kt\ncom/pymcl/android/ui/state/AppState$loadInitial$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,341:1\n1#2:342\n*E\n"
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
    c = "com.pymcl.android.ui.state.AppState$loadInitial$1"
    f = "AppState.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x2
    }
    l = {
        0x13f,
        0x141,
        0x143
    }
    m = "invokeSuspend"
    n = {
        "$this$launch",
        "$this$invokeSuspend_u24lambda_u240\\1",
        "$this$launch",
        "$this$launch"
    }
    nl = {
        0x13f,
        0x143,
        0x144
    }
    s = {
        "L$0",
        "L$1",
        "L$0",
        "L$0"
    }
    v = 0x2
.end annotation


# instance fields
.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/pymcl/android/ui/state/AppState;


# direct methods
.method constructor <init>(Lcom/pymcl/android/ui/state/AppState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/state/AppState$loadInitial$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/state/AppState$loadInitial$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

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

    new-instance v0, Lcom/pymcl/android/ui/state/AppState$loadInitial$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/state/AppState$loadInitial$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    invoke-direct {v0, v1, p2}, Lcom/pymcl/android/ui/state/AppState$loadInitial$1;-><init>(Lcom/pymcl/android/ui/state/AppState;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/pymcl/android/ui/state/AppState$loadInitial$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/state/AppState$loadInitial$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/state/AppState$loadInitial$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/state/AppState$loadInitial$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/state/AppState$loadInitial$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8
    .param p1, "$result"    # Ljava/lang/Object;

    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState$loadInitial$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlinx/coroutines/CoroutineScope;

    .local v0, "$this$launch":Lkotlinx/coroutines/CoroutineScope;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 318
    iget v2, p0, Lcom/pymcl/android/ui/state/AppState$loadInitial$1;->label:I

    const/4 v3, 0x1

    packed-switch v2, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_2
    const/4 v2, 0x0

    .local v2, "$i$a$-runCatching-AppState$loadInitial$1$1\\1\\319\\0":I
    iget-object v4, p0, Lcom/pymcl/android/ui/state/AppState$loadInitial$1;->L$1:Ljava/lang/Object;

    check-cast v4, Lkotlinx/coroutines/CoroutineScope;

    .local v4, "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v5, v2

    move-object v2, p1

    goto :goto_0

    .end local v2    # "$i$a$-runCatching-AppState$loadInitial$1$1\\1\\319\\0":I
    .end local v4    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    :pswitch_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 319
    iget-object v2, p0, Lcom/pymcl/android/ui/state/AppState$loadInitial$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    :try_start_1
    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v4, v0

    .line 342
    .restart local v4    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    const/4 v5, 0x0

    .line 319
    .local v5, "$i$a$-runCatching-AppState$loadInitial$1$1\\1\\319\\0":I
    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/AppState;->getApi()Lcom/pymcl/android/ui/state/LauncherUiApi;

    move-result-object v2

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, p0, Lcom/pymcl/android/ui/state/AppState$loadInitial$1;->L$0:Ljava/lang/Object;

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, p0, Lcom/pymcl/android/ui/state/AppState$loadInitial$1;->L$1:Ljava/lang/Object;

    iput v3, p0, Lcom/pymcl/android/ui/state/AppState$loadInitial$1;->label:I

    invoke-interface {v2, p0}, Lcom/pymcl/android/ui/state/LauncherUiApi;->getSettings(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_0

    .line 318
    return-object v1

    .line 319
    :cond_0
    :goto_0
    check-cast v2, Lcom/pymcl/android/ui/state/UiSettings;

    .end local v4    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    .end local v5    # "$i$a$-runCatching-AppState$loadInitial$1$1\\1\\319\\0":I
    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v2

    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    :goto_1
    iget-object v4, p0, Lcom/pymcl/android/ui/state/AppState$loadInitial$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    invoke-static {v2}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    move-object v5, v2

    check-cast v5, Lcom/pymcl/android/ui/state/UiSettings;

    .line 342
    .local v5, "it\\2":Lcom/pymcl/android/ui/state/UiSettings;
    const/4 v6, 0x0

    .line 319
    .local v6, "$i$a$-onSuccess-AppState$loadInitial$1$2\\2\\319\\0":I
    invoke-virtual {v4, v5}, Lcom/pymcl/android/ui/state/AppState;->setSettings(Lcom/pymcl/android/ui/state/UiSettings;)V

    .end local v5    # "it\\2":Lcom/pymcl/android/ui/state/UiSettings;
    .end local v6    # "$i$a$-onSuccess-AppState$loadInitial$1$2\\2\\319\\0":I
    :cond_1
    iget-object v4, p0, Lcom/pymcl/android/ui/state/AppState$loadInitial$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    invoke-static {v2}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 342
    .local v2, "it\\4":Ljava/lang/Throwable;
    const/4 v5, 0x0

    .line 319
    .local v5, "$i$a$-onFailure-AppState$loadInitial$1$3\\4\\319\\0":I
    invoke-virtual {v4}, Lcom/pymcl/android/ui/state/AppState;->getLaunchLog()Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-result-object v4

    check-cast v4, Ljava/util/Collection;

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    const-string v7, "[PyMCL] \u8bfb\u53d6\u8bbe\u7f6e\u5931\u8d25\uff1a{0}"

    invoke-static {v7, v6}, Lcom/pymcl/android/ui/i18n/I18nKt;->tr(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 320
    .end local v2    # "it\\4":Ljava/lang/Throwable;
    .end local v5    # "$i$a$-onFailure-AppState$loadInitial$1$3\\4\\319\\0":I
    :cond_2
    sget-object v2, Lcom/pymcl/android/ui/i18n/I18n;->INSTANCE:Lcom/pymcl/android/ui/i18n/I18n;

    iget-object v4, p0, Lcom/pymcl/android/ui/state/AppState$loadInitial$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v4}, Lcom/pymcl/android/ui/state/AppState;->getSettings()Lcom/pymcl/android/ui/state/UiSettings;

    move-result-object v4

    invoke-virtual {v4}, Lcom/pymcl/android/ui/state/UiSettings;->getLanguage()I

    move-result v4

    if-ne v4, v3, :cond_3

    sget-object v4, Lcom/pymcl/android/ui/i18n/I18n$Lang;->En:Lcom/pymcl/android/ui/i18n/I18n$Lang;

    goto :goto_2

    :cond_3
    sget-object v4, Lcom/pymcl/android/ui/i18n/I18n$Lang;->Zh:Lcom/pymcl/android/ui/i18n/I18n$Lang;

    :goto_2
    invoke-virtual {v2, v4}, Lcom/pymcl/android/ui/i18n/I18n;->set(Lcom/pymcl/android/ui/i18n/I18n$Lang;)V

    .line 321
    iget-object v2, p0, Lcom/pymcl/android/ui/state/AppState$loadInitial$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    move-object v4, p0

    check-cast v4, Lkotlin/coroutines/Continuation;

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, p0, Lcom/pymcl/android/ui/state/AppState$loadInitial$1;->L$0:Ljava/lang/Object;

    const/4 v5, 0x0

    iput-object v5, p0, Lcom/pymcl/android/ui/state/AppState$loadInitial$1;->L$1:Ljava/lang/Object;

    const/4 v5, 0x2

    iput v5, p0, Lcom/pymcl/android/ui/state/AppState$loadInitial$1;->label:I

    invoke-virtual {v2, v4}, Lcom/pymcl/android/ui/state/AppState;->reload(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    .line 318
    return-object v1

    .line 323
    :cond_4
    :goto_3
    iget-object v2, p0, Lcom/pymcl/android/ui/state/AppState$loadInitial$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/AppState;->getApi()Lcom/pymcl/android/ui/state/LauncherUiApi;

    move-result-object v2

    invoke-interface {v2}, Lcom/pymcl/android/ui/state/LauncherUiApi;->isGameRunning()Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v1, p0, Lcom/pymcl/android/ui/state/AppState$loadInitial$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v1, v3}, Lcom/pymcl/android/ui/state/AppState;->setGameRunning(Z)V

    iget-object v1, p0, Lcom/pymcl/android/ui/state/AppState$loadInitial$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    invoke-static {v1}, Lcom/pymcl/android/ui/state/AppState;->access$watchGame(Lcom/pymcl/android/ui/state/AppState;)Lkotlinx/coroutines/Job;

    goto :goto_4

    :cond_5
    iget-object v2, p0, Lcom/pymcl/android/ui/state/AppState$loadInitial$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    move-object v3, p0

    check-cast v3, Lkotlin/coroutines/Continuation;

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, p0, Lcom/pymcl/android/ui/state/AppState$loadInitial$1;->L$0:Ljava/lang/Object;

    const/4 v4, 0x3

    iput v4, p0, Lcom/pymcl/android/ui/state/AppState$loadInitial$1;->label:I

    invoke-static {v2, v3}, Lcom/pymcl/android/ui/state/AppState;->access$handleGameExit(Lcom/pymcl/android/ui/state/AppState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_6

    .line 318
    return-object v1

    .line 324
    :cond_6
    :goto_4
    iget-object v1, p0, Lcom/pymcl/android/ui/state/AppState$loadInitial$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/AppState;->getSettings()Lcom/pymcl/android/ui/state/UiSettings;

    move-result-object v1

    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/UiSettings;->getFirstRun()Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, p0, Lcom/pymcl/android/ui/state/AppState$loadInitial$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    sget-object v2, Lcom/pymcl/android/ui/state/DialogSpec$FirstRun;->INSTANCE:Lcom/pymcl/android/ui/state/DialogSpec$FirstRun;

    check-cast v2, Lcom/pymcl/android/ui/state/DialogSpec;

    invoke-virtual {v1, v2}, Lcom/pymcl/android/ui/state/AppState;->open(Lcom/pymcl/android/ui/state/DialogSpec;)V

    .line 325
    :cond_7
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
