.class final Lcom/pymcl/android/ui/state/AppState$startGameFor$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AppState.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/state/AppState;->startGameFor(Ljava/lang/String;Ljava/lang/String;)V
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
    c = "com.pymcl.android.ui.state.AppState$startGameFor$1"
    f = "AppState.kt"
    i = {}
    l = {
        0x11d
    }
    m = "invokeSuspend"
    n = {}
    nl = {
        0x11e
    }
    s = {}
    v = 0x2
.end annotation


# instance fields
.field final synthetic $instance:Ljava/lang/String;

.field final synthetic $version:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lcom/pymcl/android/ui/state/AppState;


# direct methods
.method constructor <init>(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/state/AppState$startGameFor$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/state/AppState$startGameFor$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    iput-object p2, p0, Lcom/pymcl/android/ui/state/AppState$startGameFor$1;->$instance:Ljava/lang/String;

    iput-object p3, p0, Lcom/pymcl/android/ui/state/AppState$startGameFor$1;->$version:Ljava/lang/String;

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

    new-instance v0, Lcom/pymcl/android/ui/state/AppState$startGameFor$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/state/AppState$startGameFor$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    iget-object v2, p0, Lcom/pymcl/android/ui/state/AppState$startGameFor$1;->$instance:Ljava/lang/String;

    iget-object v3, p0, Lcom/pymcl/android/ui/state/AppState$startGameFor$1;->$version:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, p2}, Lcom/pymcl/android/ui/state/AppState$startGameFor$1;-><init>(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/state/AppState$startGameFor$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/state/AppState$startGameFor$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/state/AppState$startGameFor$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/state/AppState$startGameFor$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 282
    iget v1, p0, Lcom/pymcl/android/ui/state/AppState$startGameFor$1;->label:I

    const/4 v2, 0x1

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

    .line 283
    iget-object v1, p0, Lcom/pymcl/android/ui/state/AppState$startGameFor$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/AppState;->getSelectedInstance()Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lcom/pymcl/android/ui/state/AppState$startGameFor$1;->$instance:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/pymcl/android/ui/state/AppState$startGameFor$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    iget-object v3, p0, Lcom/pymcl/android/ui/state/AppState$startGameFor$1;->$instance:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lcom/pymcl/android/ui/state/AppState;->setSelectedInstance(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/pymcl/android/ui/state/AppState$startGameFor$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    const-string v3, ""

    invoke-virtual {v1, v3}, Lcom/pymcl/android/ui/state/AppState;->setSelectedVersion(Ljava/lang/String;)V

    .line 284
    :cond_0
    iget-object v1, p0, Lcom/pymcl/android/ui/state/AppState$startGameFor$1;->$version:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/pymcl/android/ui/state/AppState$startGameFor$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    iget-object v3, p0, Lcom/pymcl/android/ui/state/AppState$startGameFor$1;->$version:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lcom/pymcl/android/ui/state/AppState;->setSelectedVersion(Ljava/lang/String;)V

    .line 285
    :cond_1
    iget-object v1, p0, Lcom/pymcl/android/ui/state/AppState$startGameFor$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    move-object v3, p0

    check-cast v3, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lcom/pymcl/android/ui/state/AppState$startGameFor$1;->label:I

    invoke-virtual {v1, v3}, Lcom/pymcl/android/ui/state/AppState;->reload(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    .line 282
    return-object v0

    .line 286
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState$startGameFor$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    const/4 v1, 0x0

    invoke-static {v0, v1, v2, v1}, Lcom/pymcl/android/ui/state/AppState;->startGame$default(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;ILjava/lang/Object;)V

    .line 287
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
