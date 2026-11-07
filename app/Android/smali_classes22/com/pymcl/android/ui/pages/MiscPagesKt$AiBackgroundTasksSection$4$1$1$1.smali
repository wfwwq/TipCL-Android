.class final Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$4$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "MiscPages.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/pages/MiscPagesKt;->AiBackgroundTasksSection(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/Composer;I)V
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
    c = "com.pymcl.android.ui.pages.MiscPagesKt$AiBackgroundTasksSection$4$1$1$1"
    f = "MiscPages.kt"
    i = {}
    l = {
        0x19d
    }
    m = "invokeSuspend"
    n = {}
    nl = {
        0x19e
    }
    s = {}
    v = 0x2
.end annotation


# instance fields
.field final synthetic $ai:Lcom/pymcl/android/data/AiUiExtras;

.field final synthetic $state:Lcom/pymcl/android/ui/state/AppState;

.field final synthetic $tasks$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/pymcl/ai/BgTaskInfo;",
            ">;>;"
        }
    .end annotation
.end field

.field label:I


# direct methods
.method constructor <init>(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/data/AiUiExtras;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Lcom/pymcl/android/data/AiUiExtras;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/pymcl/ai/BgTaskInfo;",
            ">;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$4$1$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$4$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$4$1$1$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$4$1$1$1;->$tasks$delegate:Landroidx/compose/runtime/MutableState;

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

    new-instance v0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$4$1$1$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$4$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$4$1$1$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$4$1$1$1;->$tasks$delegate:Landroidx/compose/runtime/MutableState;

    invoke-direct {v0, v1, v2, v3, p2}, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$4$1$1$1;-><init>(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/data/AiUiExtras;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$4$1$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$4$1$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$4$1$1$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$4$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 412
    iget v1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$4$1$1$1;->label:I

    const/4 v2, 0x0

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

    .line 413
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    check-cast v1, Lkotlin/coroutines/CoroutineContext;

    new-instance v3, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$4$1$1$1$r$1;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$4$1$1$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    invoke-direct {v3, v4, v2}, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$4$1$1$1$r$1;-><init>(Lcom/pymcl/android/data/AiUiExtras;Lkotlin/coroutines/Continuation;)V

    check-cast v3, Lkotlin/jvm/functions/Function2;

    move-object v4, p0

    check-cast v4, Lkotlin/coroutines/Continuation;

    const/4 v5, 0x1

    iput v5, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$4$1$1$1;->label:I

    invoke-static {v1, v3, v4}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_0

    .line 412
    return-object v0

    :cond_0
    :goto_0
    move-object v0, v1

    check-cast v0, Lcom/pymcl/ai/BgClearResult;

    .line 414
    .local v0, "r":Lcom/pymcl/ai/BgClearResult;
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$4$1$1$1;->$tasks$delegate:Landroidx/compose/runtime/MutableState;

    sget-object v3, Lcom/pymcl/android/data/AiTaskCenter;->INSTANCE:Lcom/pymcl/android/data/AiTaskCenter;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$4$1$1$1;->$tasks$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v4}, Lcom/pymcl/android/ui/pages/MiscPagesKt;->access$AiBackgroundTasksSection$lambda$3(Landroidx/compose/runtime/MutableState;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v3, v4, v0}, Lcom/pymcl/android/data/AiTaskCenter;->afterClear(Ljava/util/List;Lcom/pymcl/ai/BgClearResult;)Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/pymcl/android/ui/pages/MiscPagesKt;->access$AiBackgroundTasksSection$lambda$4(Landroidx/compose/runtime/MutableState;Ljava/util/List;)V

    .line 415
    sget-object v1, Lcom/pymcl/android/data/AiTaskCenter;->INSTANCE:Lcom/pymcl/android/data/AiTaskCenter;

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v1, v0, v3, v4, v2}, Lcom/pymcl/android/data/AiTaskCenter;->clearMessage$default(Lcom/pymcl/android/data/AiTaskCenter;Lcom/pymcl/ai/BgClearResult;ZILjava/lang/Object;)Lkotlin/Triple;

    move-result-object v1

    invoke-virtual {v1}, Lkotlin/Triple;->component1()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .local v2, "title":Ljava/lang/String;
    invoke-virtual {v1}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .local v3, "body":Ljava/lang/String;
    invoke-virtual {v1}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 416
    .local v1, "kind":Ljava/lang/String;
    iget-object v4, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$4$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v4, v2, v3, v1}, Lcom/pymcl/android/ui/state/AppState;->toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 417
    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v4

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
