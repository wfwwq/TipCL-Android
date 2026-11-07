.class final Lcom/pymcl/android/ui/state/AppState$watchGame$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AppState.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/state/AppState;->watchGame()Lkotlinx/coroutines/Job;
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
    c = "com.pymcl.android.ui.state.AppState$watchGame$1"
    f = "AppState.kt"
    i = {}
    l = {
        0x12c,
        0x12d,
        0x12e
    }
    m = "invokeSuspend"
    n = {}
    nl = {
        0x12d,
        0x12e,
        0x12f
    }
    s = {}
    v = 0x2
.end annotation


# instance fields
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
            "Lcom/pymcl/android/ui/state/AppState$watchGame$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/state/AppState$watchGame$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

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

    new-instance v0, Lcom/pymcl/android/ui/state/AppState$watchGame$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/state/AppState$watchGame$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    invoke-direct {v0, v1, p2}, Lcom/pymcl/android/ui/state/AppState$watchGame$1;-><init>(Lcom/pymcl/android/ui/state/AppState;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/state/AppState$watchGame$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/state/AppState$watchGame$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/state/AppState$watchGame$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/state/AppState$watchGame$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 299
    iget v1, p0, Lcom/pymcl/android/ui/state/AppState$watchGame$1;->label:I

    packed-switch v1, :pswitch_data_0

    .end local p0    # "this":Lcom/pymcl/android/ui/state/AppState$watchGame$1;
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .restart local p0    # "this":Lcom/pymcl/android/ui/state/AppState$watchGame$1;
    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v1, p0

    goto/16 :goto_3

    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v1, p0

    goto :goto_2

    :pswitch_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 300
    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    const/4 v2, 0x1

    iput v2, p0, Lcom/pymcl/android/ui/state/AppState$watchGame$1;->label:I

    const-wide/16 v2, 0x1388

    invoke-static {v2, v3, v1}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_0

    .line 299
    return-object v0

    .line 301
    :cond_0
    :goto_0
    move-object v1, p0

    .end local p0    # "this":Lcom/pymcl/android/ui/state/AppState$watchGame$1;
    .local v1, "this":Lcom/pymcl/android/ui/state/AppState$watchGame$1;
    :goto_1
    iget-object v2, v1, Lcom/pymcl/android/ui/state/AppState$watchGame$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/AppState;->getGameRunning()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, v1, Lcom/pymcl/android/ui/state/AppState$watchGame$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/AppState;->getApi()Lcom/pymcl/android/ui/state/LauncherUiApi;

    move-result-object v2

    invoke-interface {v2}, Lcom/pymcl/android/ui/state/LauncherUiApi;->isGameRunning()Z

    move-result v2

    if-eqz v2, :cond_2

    move-object v2, v1

    check-cast v2, Lkotlin/coroutines/Continuation;

    const/4 v3, 0x2

    iput v3, v1, Lcom/pymcl/android/ui/state/AppState$watchGame$1;->label:I

    const-wide/16 v3, 0x7d0

    invoke-static {v3, v4, v2}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_1

    .line 299
    return-object v0

    .line 301
    :cond_1
    :goto_2
    goto :goto_1

    .line 302
    :cond_2
    iget-object v2, v1, Lcom/pymcl/android/ui/state/AppState$watchGame$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/AppState;->getGameRunning()Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, v1, Lcom/pymcl/android/ui/state/AppState$watchGame$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/pymcl/android/ui/state/AppState;->setGameRunning(Z)V

    iget-object v2, v1, Lcom/pymcl/android/ui/state/AppState$watchGame$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/AppState;->getLaunchLog()Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    const-string v4, "[PyMCL] \u6e38\u620f\u8fdb\u7a0b\u5df2\u9000\u51fa"

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v4, v3}, Lcom/pymcl/android/ui/i18n/I18nKt;->tr(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    iget-object v2, v1, Lcom/pymcl/android/ui/state/AppState$watchGame$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    move-object v3, v1

    check-cast v3, Lkotlin/coroutines/Continuation;

    const/4 v4, 0x3

    iput v4, v1, Lcom/pymcl/android/ui/state/AppState$watchGame$1;->label:I

    invoke-static {v2, v3}, Lcom/pymcl/android/ui/state/AppState;->access$handleGameExit(Lcom/pymcl/android/ui/state/AppState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_3

    .line 299
    return-object v0

    .line 303
    :cond_3
    :goto_3
    nop

    :cond_4
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
