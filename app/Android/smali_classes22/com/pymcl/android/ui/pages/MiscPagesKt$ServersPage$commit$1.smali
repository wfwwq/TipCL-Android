.class final Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$commit$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "MiscPages.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/pages/MiscPagesKt;->ServersPage$commit(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroid/content/Context;Landroidx/compose/runtime/MutableState;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
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
    c = "com.pymcl.android.ui.pages.MiscPagesKt$ServersPage$commit$1"
    f = "MiscPages.kt"
    i = {}
    l = {
        0xb6
    }
    m = "invokeSuspend"
    n = {}
    nl = {
        0xb7
    }
    s = {}
    v = 0x2
.end annotation


# instance fields
.field final synthetic $all$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/pymcl/core/instance/ServerEntry;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $busy$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $ctx:Landroid/content/Context;

.field final synthetic $inst$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $next:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/pymcl/core/instance/ServerEntry;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $okBody:Ljava/lang/String;

.field final synthetic $okTitle:Ljava/lang/String;

.field final synthetic $state:Lcom/pymcl/android/ui/state/AppState;

.field final synthetic $target:Ljava/lang/String;

.field label:I


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/util/List;Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/pymcl/core/instance/ServerEntry;",
            ">;",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Landroid/content/Context;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/pymcl/core/instance/ServerEntry;",
            ">;>;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$commit$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$commit$1;->$target:Ljava/lang/String;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$commit$1;->$next:Ljava/util/List;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$commit$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$commit$1;->$okTitle:Ljava/lang/String;

    iput-object p5, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$commit$1;->$okBody:Ljava/lang/String;

    iput-object p6, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$commit$1;->$ctx:Landroid/content/Context;

    iput-object p7, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$commit$1;->$inst$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p8, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$commit$1;->$all$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p9, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$commit$1;->$busy$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p10}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 11
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

    new-instance v0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$commit$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$commit$1;->$target:Ljava/lang/String;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$commit$1;->$next:Ljava/util/List;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$commit$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$commit$1;->$okTitle:Ljava/lang/String;

    iget-object v5, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$commit$1;->$okBody:Ljava/lang/String;

    iget-object v6, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$commit$1;->$ctx:Landroid/content/Context;

    iget-object v7, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$commit$1;->$inst$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v8, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$commit$1;->$all$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v9, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$commit$1;->$busy$delegate:Landroidx/compose/runtime/MutableState;

    move-object v10, p2

    invoke-direct/range {v0 .. v10}, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$commit$1;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$commit$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$commit$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$commit$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$commit$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 180
    iget v1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$commit$1;->label:I

    const/4 v2, 0x0

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 187
    :catchall_0
    move-exception v0

    goto :goto_4

    .line 186
    :catch_0
    move-exception v0

    goto :goto_1

    .line 185
    :catch_1
    move-exception v0

    goto :goto_3

    .line 180
    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 181
    nop

    .line 182
    :try_start_1
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    check-cast v1, Lkotlin/coroutines/CoroutineContext;

    new-instance v3, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$commit$1$1;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$commit$1;->$ctx:Landroid/content/Context;

    iget-object v5, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$commit$1;->$target:Ljava/lang/String;

    iget-object v6, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$commit$1;->$next:Ljava/util/List;

    const/4 v7, 0x0

    invoke-direct {v3, v4, v5, v6, v7}, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$commit$1$1;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    check-cast v3, Lkotlin/jvm/functions/Function2;

    move-object v4, p0

    check-cast v4, Lkotlin/coroutines/Continuation;

    const/4 v5, 0x1

    iput v5, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$commit$1;->label:I

    invoke-static {v1, v3, v4}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_0

    .line 180
    return-object v0

    .line 183
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$commit$1;->$target:Ljava/lang/String;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$commit$1;->$inst$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1}, Lcom/pymcl/android/ui/pages/MiscPagesKt;->access$ServersPage$lambda$4(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$commit$1;->$all$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$commit$1;->$next:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/pymcl/android/ui/pages/MiscPagesKt;->access$ServersPage$lambda$8(Landroidx/compose/runtime/MutableState;Ljava/util/List;)V

    .line 184
    :cond_1
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$commit$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$commit$1;->$okTitle:Ljava/lang/String;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$commit$1;->$okBody:Ljava/lang/String;

    const-string v4, "ok"

    invoke-virtual {v0, v1, v3, v4}, Lcom/pymcl/android/ui/state/AppState;->toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    .line 186
    .local v0, "e":Ljava/lang/Exception;
    :goto_1
    :try_start_2
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$commit$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    const-string v3, "\u4fdd\u5b58\u5931\u8d25"

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_2

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v4

    :cond_2
    const-string v5, "error"

    invoke-virtual {v1, v3, v4, v5}, Lcom/pymcl/android/ui/state/AppState;->toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 187
    .end local v0    # "e":Ljava/lang/Exception;
    :goto_2
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$commit$1;->$busy$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v0, v2}, Lcom/pymcl/android/ui/pages/MiscPagesKt;->access$ServersPage$lambda$14(Landroidx/compose/runtime/MutableState;Z)V

    .line 188
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 185
    .end local p1    # "$result":Ljava/lang/Object;
    .local v0, "e":Ljava/util/concurrent/CancellationException;
    :goto_3
    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 187
    .end local v0    # "e":Ljava/util/concurrent/CancellationException;
    .restart local p1    # "$result":Ljava/lang/Object;
    :goto_4
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$commit$1;->$busy$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1, v2}, Lcom/pymcl/android/ui/pages/MiscPagesKt;->access$ServersPage$lambda$14(Landroidx/compose/runtime/MutableState;Z)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
