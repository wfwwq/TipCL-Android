.class final Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;
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
    c = "com.pymcl.android.ui.pages.MiscPagesKt$AiBackgroundTasksSection$2$1"
    f = "MiscPages.kt"
    i = {}
    l = {
        0x186,
        0x187,
        0x188,
        0x18a,
        0x18b
    }
    m = "invokeSuspend"
    n = {}
    nl = {
        0x187,
        0x188,
        0x189,
        0x18b,
        -0x1
    }
    s = {}
    v = 0x2
.end annotation


# instance fields
.field final synthetic $ai:Lcom/pymcl/android/data/AiUiExtras;

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

.field final synthetic $titles$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Landroidx/compose/runtime/MutableState;Lcom/pymcl/android/data/AiUiExtras;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/pymcl/ai/BgTaskInfo;",
            ">;>;",
            "Lcom/pymcl/android/data/AiUiExtras;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;->$tasks$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;->$titles$delegate:Landroidx/compose/runtime/MutableState;

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

    new-instance v0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;->$tasks$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;->$titles$delegate:Landroidx/compose/runtime/MutableState;

    invoke-direct {v0, v1, v2, v3, p2}, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;-><init>(Landroidx/compose/runtime/MutableState;Lcom/pymcl/android/data/AiUiExtras;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 389
    iget v1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;->label:I

    const/4 v2, 0x0

    packed-switch v1, :pswitch_data_0

    .end local p0    # "this":Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .restart local p0    # "this":Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;
    :pswitch_0
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;->L$2:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;->L$1:Ljava/lang/Object;

    check-cast v3, Lcom/pymcl/android/data/AiTaskCenter;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;->L$0:Ljava/lang/Object;

    check-cast v4, Landroidx/compose/runtime/MutableState;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v5, v1

    move-object v6, v4

    move-object v1, v0

    move-object v4, v3

    move-object v3, p0

    move-object v0, p1

    goto/16 :goto_5

    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v1, p0

    goto/16 :goto_4

    :pswitch_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_3
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;->L$2:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;->L$1:Ljava/lang/Object;

    check-cast v3, Lcom/pymcl/android/data/AiTaskCenter;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;->L$0:Ljava/lang/Object;

    check-cast v4, Landroidx/compose/runtime/MutableState;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v5, p1

    goto :goto_1

    :pswitch_4
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_5
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 390
    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    const/4 v3, 0x1

    iput v3, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;->label:I

    invoke-static {v1}, Lkotlinx/coroutines/YieldKt;->yield(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_0

    .line 389
    return-object v0

    .line 391
    :cond_0
    :goto_0
    iget-object v4, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;->$tasks$delegate:Landroidx/compose/runtime/MutableState;

    sget-object v3, Lcom/pymcl/android/data/AiTaskCenter;->INSTANCE:Lcom/pymcl/android/data/AiTaskCenter;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;->$tasks$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1}, Lcom/pymcl/android/ui/pages/MiscPagesKt;->access$AiBackgroundTasksSection$lambda$3(Landroidx/compose/runtime/MutableState;)Ljava/util/List;

    move-result-object v1

    iget-object v5, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    move-object v6, p0

    check-cast v6, Lkotlin/coroutines/Continuation;

    iput-object v4, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;->L$0:Ljava/lang/Object;

    iput-object v3, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;->L$1:Ljava/lang/Object;

    iput-object v1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;->L$2:Ljava/lang/Object;

    const/4 v7, 0x2

    iput v7, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;->label:I

    invoke-static {v5, v6}, Lcom/pymcl/android/ui/pages/MiscPagesKt;->access$AiBackgroundTasksSection$snapshot(Lcom/pymcl/android/data/AiUiExtras;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v0, :cond_1

    .line 389
    return-object v0

    .line 391
    :cond_1
    :goto_1
    check-cast v5, Ljava/util/List;

    invoke-virtual {v3, v1, v5}, Lcom/pymcl/android/data/AiTaskCenter;->mergeSnapshot(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-static {v4, v1}, Lcom/pymcl/android/ui/pages/MiscPagesKt;->access$AiBackgroundTasksSection$lambda$4(Landroidx/compose/runtime/MutableState;Ljava/util/List;)V

    .line 392
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;->$titles$delegate:Landroidx/compose/runtime/MutableState;

    move-object v4, p0

    check-cast v4, Lkotlin/coroutines/Continuation;

    iput-object v2, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;->L$0:Ljava/lang/Object;

    iput-object v2, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;->L$1:Ljava/lang/Object;

    iput-object v2, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;->L$2:Ljava/lang/Object;

    const/4 v5, 0x3

    iput v5, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;->label:I

    invoke-static {v1, v3, v4}, Lcom/pymcl/android/ui/pages/MiscPagesKt;->access$AiBackgroundTasksSection$refreshTitles(Lcom/pymcl/android/data/AiUiExtras;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    .line 389
    return-object v0

    .line 393
    :cond_2
    :goto_2
    move-object v1, p0

    .line 394
    .end local p0    # "this":Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;
    .local v1, "this":Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;
    :cond_3
    :goto_3
    move-object v3, v1

    check-cast v3, Lkotlin/coroutines/Continuation;

    iput-object v2, v1, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;->L$0:Ljava/lang/Object;

    iput-object v2, v1, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;->L$1:Ljava/lang/Object;

    iput-object v2, v1, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;->L$2:Ljava/lang/Object;

    const/4 v4, 0x4

    iput v4, v1, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;->label:I

    const-wide/16 v4, 0x1388

    invoke-static {v4, v5, v3}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_4

    .line 389
    return-object v0

    .line 395
    :cond_4
    :goto_4
    sget-object v3, Lcom/pymcl/android/data/AiTaskCenter;->INSTANCE:Lcom/pymcl/android/data/AiTaskCenter;

    iget-object v4, v1, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;->$tasks$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v4}, Lcom/pymcl/android/ui/pages/MiscPagesKt;->access$AiBackgroundTasksSection$lambda$3(Landroidx/compose/runtime/MutableState;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/pymcl/android/data/AiTaskCenter;->runningCount(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    iget-object v4, v1, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;->$tasks$delegate:Landroidx/compose/runtime/MutableState;

    sget-object v3, Lcom/pymcl/android/data/AiTaskCenter;->INSTANCE:Lcom/pymcl/android/data/AiTaskCenter;

    iget-object v5, v1, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;->$tasks$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v5}, Lcom/pymcl/android/ui/pages/MiscPagesKt;->access$AiBackgroundTasksSection$lambda$3(Landroidx/compose/runtime/MutableState;)Ljava/util/List;

    move-result-object v5

    iget-object v6, v1, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    move-object v7, v1

    check-cast v7, Lkotlin/coroutines/Continuation;

    iput-object v4, v1, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;->L$0:Ljava/lang/Object;

    iput-object v3, v1, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;->L$1:Ljava/lang/Object;

    iput-object v5, v1, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;->L$2:Ljava/lang/Object;

    const/4 v8, 0x5

    iput v8, v1, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;->label:I

    invoke-static {v6, v7}, Lcom/pymcl/android/ui/pages/MiscPagesKt;->access$AiBackgroundTasksSection$snapshot(Lcom/pymcl/android/data/AiUiExtras;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v0, :cond_5

    .line 389
    return-object v0

    .line 395
    :cond_5
    move-object v9, v0

    move-object v0, p1

    move-object p1, v6

    move-object v6, v4

    move-object v4, v3

    move-object v3, v1

    move-object v1, v9

    .end local v1    # "this":Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;
    .end local p1    # "$result":Ljava/lang/Object;
    .local v0, "$result":Ljava/lang/Object;
    .local v3, "this":Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$2$1;
    :goto_5
    check-cast p1, Ljava/util/List;

    invoke-virtual {v4, v5, p1}, Lcom/pymcl/android/data/AiTaskCenter;->mergeSnapshot(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-static {v6, p1}, Lcom/pymcl/android/ui/pages/MiscPagesKt;->access$AiBackgroundTasksSection$lambda$4(Landroidx/compose/runtime/MutableState;Ljava/util/List;)V

    move-object p1, v0

    move-object v0, v1

    move-object v1, v3

    goto :goto_3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
