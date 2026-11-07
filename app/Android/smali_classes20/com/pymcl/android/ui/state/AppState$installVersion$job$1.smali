.class final Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AppState.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/state/AppState;->installVersion(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
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
    c = "com.pymcl.android.ui.state.AppState$installVersion$job$1"
    f = "AppState.kt"
    i = {}
    l = {
        0xda
    }
    m = "invokeSuspend"
    n = {}
    nl = {
        0xdb
    }
    s = {}
    v = 0x2
.end annotation


# instance fields
.field final synthetic $id:Ljava/lang/String;

.field final synthetic $instance:Ljava/lang/String;

.field final synthetic $key:Ljava/lang/String;

.field final synthetic $loader:Ljava/lang/String;

.field final synthetic $loaderVersion:Ljava/lang/String;

.field final synthetic $version:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lcom/pymcl/android/ui/state/AppState;


# direct methods
.method public static synthetic $r8$lambda$pPcw5z950e4oEsRjANLwq83kLL4(Ljava/lang/String;Lcom/pymcl/android/ui/state/TaskRow;)Lcom/pymcl/android/ui/state/TaskRow;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->invokeSuspend$lambda$0(Ljava/lang/String;Lcom/pymcl/android/ui/state/TaskRow;)Lcom/pymcl/android/ui/state/TaskRow;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$qSs1uZh-u32AobmD5vD5fE5uCc4(Ljava/lang/Exception;Lcom/pymcl/android/ui/state/TaskRow;)Lcom/pymcl/android/ui/state/TaskRow;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->invokeSuspend$lambda$2(Ljava/lang/Exception;Lcom/pymcl/android/ui/state/TaskRow;)Lcom/pymcl/android/ui/state/TaskRow;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$yErW6A6hAXLtILfFnMBZ_w0UlEs(Lcom/pymcl/android/ui/state/TaskRow;)Lcom/pymcl/android/ui/state/TaskRow;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->invokeSuspend$lambda$1(Lcom/pymcl/android/ui/state/TaskRow;)Lcom/pymcl/android/ui/state/TaskRow;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    iput-object p2, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->$instance:Ljava/lang/String;

    iput-object p3, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->$version:Ljava/lang/String;

    iput-object p4, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->$loader:Ljava/lang/String;

    iput-object p5, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->$loaderVersion:Ljava/lang/String;

    iput-object p6, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->$id:Ljava/lang/String;

    iput-object p7, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->$key:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p8}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method private static final invokeSuspend$lambda$0(Ljava/lang/String;Lcom/pymcl/android/ui/state/TaskRow;)Lcom/pymcl/android/ui/state/TaskRow;
    .locals 9
    .param p0, "$vid"    # Ljava/lang/String;
    .param p1, "it"    # Lcom/pymcl/android/ui/state/TaskRow;

    .line 220
    sget-object v4, Lcom/pymcl/android/ui/state/TaskState;->Done:Lcom/pymcl/android/ui/state/TaskState;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const/16 v7, 0x23

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x0

    move-object v5, p0

    move-object v0, p1

    .end local p0    # "$vid":Ljava/lang/String;
    .end local p1    # "it":Lcom/pymcl/android/ui/state/TaskRow;
    .local v0, "it":Lcom/pymcl/android/ui/state/TaskRow;
    .local v5, "$vid":Ljava/lang/String;
    invoke-static/range {v0 .. v8}, Lcom/pymcl/android/ui/state/TaskRow;->copy$default(Lcom/pymcl/android/ui/state/TaskRow;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Lcom/pymcl/android/ui/state/TaskState;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/pymcl/android/ui/state/TaskRow;

    move-result-object p0

    return-object p0
.end method

.method private static final invokeSuspend$lambda$1(Lcom/pymcl/android/ui/state/TaskRow;)Lcom/pymcl/android/ui/state/TaskRow;
    .locals 9
    .param p0, "it"    # Lcom/pymcl/android/ui/state/TaskRow;

    .line 225
    sget-object v4, Lcom/pymcl/android/ui/state/TaskState;->Cancelled:Lcom/pymcl/android/ui/state/TaskState;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "\u5df2\u53d6\u6d88"

    invoke-static {v1, v0}, Lcom/pymcl/android/ui/i18n/I18nKt;->tr(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/16 v7, 0x27

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    .end local p0    # "it":Lcom/pymcl/android/ui/state/TaskRow;
    .local v0, "it":Lcom/pymcl/android/ui/state/TaskRow;
    invoke-static/range {v0 .. v8}, Lcom/pymcl/android/ui/state/TaskRow;->copy$default(Lcom/pymcl/android/ui/state/TaskRow;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Lcom/pymcl/android/ui/state/TaskState;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/pymcl/android/ui/state/TaskRow;

    move-result-object p0

    return-object p0
.end method

.method private static final invokeSuspend$lambda$2(Ljava/lang/Exception;Lcom/pymcl/android/ui/state/TaskRow;)Lcom/pymcl/android/ui/state/TaskRow;
    .locals 9
    .param p0, "$e"    # Ljava/lang/Exception;
    .param p1, "it"    # Lcom/pymcl/android/ui/state/TaskRow;

    .line 228
    sget-object v4, Lcom/pymcl/android/ui/state/TaskState;->Failed:Lcom/pymcl/android/ui/state/TaskState;

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    move-object v5, v0

    const/16 v7, 0x27

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    move-object v0, p1

    .end local p1    # "it":Lcom/pymcl/android/ui/state/TaskRow;
    .local v0, "it":Lcom/pymcl/android/ui/state/TaskRow;
    invoke-static/range {v0 .. v8}, Lcom/pymcl/android/ui/state/TaskRow;->copy$default(Lcom/pymcl/android/ui/state/TaskRow;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Lcom/pymcl/android/ui/state/TaskState;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/pymcl/android/ui/state/TaskRow;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 9
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

    new-instance v0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    iget-object v2, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->$instance:Ljava/lang/String;

    iget-object v3, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->$version:Ljava/lang/String;

    iget-object v4, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->$loader:Ljava/lang/String;

    iget-object v5, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->$loaderVersion:Ljava/lang/String;

    iget-object v6, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->$id:Ljava/lang/String;

    iget-object v7, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->$key:Ljava/lang/String;

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;-><init>(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 216
    iget v1, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->label:I

    const/4 v2, 0x1

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

    move-object v1, p1

    goto :goto_0

    .line 230
    :catchall_0
    move-exception v0

    goto/16 :goto_5

    .line 226
    :catch_0
    move-exception v0

    goto/16 :goto_2

    .line 224
    :catch_1
    move-exception v0

    goto/16 :goto_4

    .line 216
    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 217
    nop

    .line 218
    :try_start_1
    iget-object v1, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/AppState;->getApi()Lcom/pymcl/android/ui/state/LauncherUiApi;

    move-result-object v3

    iget-object v4, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->$instance:Ljava/lang/String;

    iget-object v5, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->$version:Ljava/lang/String;

    iget-object v6, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->$loader:Ljava/lang/String;

    iget-object v7, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->$loaderVersion:Ljava/lang/String;

    iget-object v1, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    iget-object v8, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->$id:Ljava/lang/String;

    invoke-static {v1, v8}, Lcom/pymcl/android/ui/state/AppState;->access$progressOf(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;)Lkotlin/jvm/functions/Function2;

    move-result-object v8

    move-object v9, p0

    check-cast v9, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->label:I

    invoke-interface/range {v3 .. v9}, Lcom/pymcl/android/ui/state/LauncherUiApi;->installGame(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_0

    .line 216
    return-object v0

    :cond_0
    :goto_0
    check-cast v1, Ljava/lang/String;

    move-object v5, v1

    .line 219
    .local v5, "vid":Ljava/lang/String;
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/AppState;->getTaskJobs$PyMCL_Android_app_debug()Lcom/pymcl/android/ui/state/TaskJobs;

    move-result-object v0

    iget-object v1, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->$id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/state/TaskJobs;->isCancelled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 230
    .end local v5    # "vid":Ljava/lang/String;
    iget-object v1, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/AppState;->getActiveInstalls()Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-result-object v1

    iget-object v2, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->$key:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->remove(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/AppState;->getTaskJobs$PyMCL_Android_app_debug()Lcom/pymcl/android/ui/state/TaskJobs;

    move-result-object v1

    iget-object v2, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->$id:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/pymcl/android/ui/state/TaskJobs;->finish(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/AppState;->refreshData()Lkotlinx/coroutines/Job;

    .line 219
    .restart local v5    # "vid":Ljava/lang/String;
    return-object v0

    .line 220
    :cond_1
    :try_start_2
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    iget-object v1, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->$id:Ljava/lang/String;

    new-instance v3, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1$$ExternalSyntheticLambda0;

    invoke-direct {v3, v5}, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1$$ExternalSyntheticLambda0;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1, v3}, Lcom/pymcl/android/ui/state/AppState;->access$updateTask(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 222
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/AppState;->getSelectedInstance()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->$instance:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/AppState;->getSelectedInstance()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_4

    :cond_3
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v0, v5}, Lcom/pymcl/android/ui/state/AppState;->setSelectedVersion(Ljava/lang/String;)V

    .line 223
    :cond_4
    iget-object v3, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    const-string v4, "\u5b89\u88c5\u5b8c\u6210"

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/pymcl/android/ui/state/AppState;->toast$default(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .end local v5    # "vid":Ljava/lang/String;
    goto :goto_3

    .line 227
    .local v0, "e":Ljava/lang/Exception;
    :goto_2
    :try_start_3
    iget-object v1, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/AppState;->getTaskJobs$PyMCL_Android_app_debug()Lcom/pymcl/android/ui/state/TaskJobs;

    move-result-object v1

    iget-object v2, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->$id:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/pymcl/android/ui/state/TaskJobs;->isCancelled(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 230
    .end local v0    # "e":Ljava/lang/Exception;
    iget-object v2, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/AppState;->getActiveInstalls()Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-result-object v2

    iget-object v3, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->$key:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->remove(Ljava/lang/Object;)Z

    iget-object v2, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/AppState;->getTaskJobs$PyMCL_Android_app_debug()Lcom/pymcl/android/ui/state/TaskJobs;

    move-result-object v2

    iget-object v3, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->$id:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/pymcl/android/ui/state/TaskJobs;->finish(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/AppState;->refreshData()Lkotlinx/coroutines/Job;

    .line 227
    .restart local v0    # "e":Ljava/lang/Exception;
    return-object v1

    .line 228
    :cond_5
    :try_start_4
    iget-object v1, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    iget-object v2, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->$id:Ljava/lang/String;

    new-instance v3, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1$$ExternalSyntheticLambda2;

    invoke-direct {v3, v0}, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1$$ExternalSyntheticLambda2;-><init>(Ljava/lang/Exception;)V

    invoke-static {v1, v2, v3}, Lcom/pymcl/android/ui/state/AppState;->access$updateTask(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 229
    iget-object v1, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    const-string v2, "\u5b89\u88c5\u5931\u8d25"

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_6

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v3

    :cond_6
    const-string v4, "error"

    invoke-virtual {v1, v2, v3, v4}, Lcom/pymcl/android/ui/state/AppState;->toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 230
    .end local v0    # "e":Ljava/lang/Exception;
    :goto_3
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/AppState;->getActiveInstalls()Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-result-object v0

    iget-object v1, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->$key:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/AppState;->getTaskJobs$PyMCL_Android_app_debug()Lcom/pymcl/android/ui/state/TaskJobs;

    move-result-object v0

    iget-object v1, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->$id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/state/TaskJobs;->finish(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/AppState;->refreshData()Lkotlinx/coroutines/Job;

    .line 231
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 225
    .local v0, "e":Ljava/util/concurrent/CancellationException;
    :goto_4
    :try_start_5
    iget-object v1, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    iget-object v2, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->$id:Ljava/lang/String;

    new-instance v3, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1$$ExternalSyntheticLambda1;

    invoke-direct {v3}, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1$$ExternalSyntheticLambda1;-><init>()V

    invoke-static {v1, v2, v3}, Lcom/pymcl/android/ui/state/AppState;->access$updateTask(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .end local p1    # "$result":Ljava/lang/Object;
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 230
    .end local v0    # "e":Ljava/util/concurrent/CancellationException;
    .restart local p1    # "$result":Ljava/lang/Object;
    :goto_5
    iget-object v1, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/AppState;->getActiveInstalls()Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-result-object v1

    iget-object v2, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->$key:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->remove(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/AppState;->getTaskJobs$PyMCL_Android_app_debug()Lcom/pymcl/android/ui/state/TaskJobs;

    move-result-object v1

    iget-object v2, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->$id:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/pymcl/android/ui/state/TaskJobs;->finish(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/AppState;->refreshData()Lkotlinx/coroutines/Job;

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
