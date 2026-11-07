.class final Lcom/pymcl/android/ui/state/AppState$progressOf$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AppState.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/state/AppState;->progressOf(Ljava/lang/String;)Lkotlin/jvm/functions/Function2;
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
    c = "com.pymcl.android.ui.state.AppState$progressOf$1$1"
    f = "AppState.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    nl = {}
    s = {}
    v = 0x2
.end annotation


# instance fields
.field final synthetic $d:Ljava/lang/String;

.field final synthetic $id:Ljava/lang/String;

.field final synthetic $p:Ljava/lang/Float;

.field label:I

.field final synthetic this$0:Lcom/pymcl/android/ui/state/AppState;


# direct methods
.method public static synthetic $r8$lambda$5ZczxOh9KIWR7bujUqes9hdbQxA(Ljava/lang/Float;Ljava/lang/String;Lcom/pymcl/android/ui/state/TaskRow;)Lcom/pymcl/android/ui/state/TaskRow;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/pymcl/android/ui/state/AppState$progressOf$1$1;->invokeSuspend$lambda$0(Ljava/lang/Float;Ljava/lang/String;Lcom/pymcl/android/ui/state/TaskRow;)Lcom/pymcl/android/ui/state/TaskRow;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Ljava/lang/String;",
            "Ljava/lang/Float;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/state/AppState$progressOf$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/state/AppState$progressOf$1$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    iput-object p2, p0, Lcom/pymcl/android/ui/state/AppState$progressOf$1$1;->$id:Ljava/lang/String;

    iput-object p3, p0, Lcom/pymcl/android/ui/state/AppState$progressOf$1$1;->$p:Ljava/lang/Float;

    iput-object p4, p0, Lcom/pymcl/android/ui/state/AppState$progressOf$1$1;->$d:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method private static final invokeSuspend$lambda$0(Ljava/lang/Float;Ljava/lang/String;Lcom/pymcl/android/ui/state/TaskRow;)Lcom/pymcl/android/ui/state/TaskRow;
    .locals 11
    .param p0, "$p"    # Ljava/lang/Float;
    .param p1, "$d"    # Ljava/lang/String;
    .param p2, "it"    # Lcom/pymcl/android/ui/state/TaskRow;

    .line 181
    invoke-virtual {p2}, Lcom/pymcl/android/ui/state/TaskRow;->getState()Lcom/pymcl/android/ui/state/TaskState;

    move-result-object v0

    sget-object v1, Lcom/pymcl/android/ui/state/TaskState;->Running:Lcom/pymcl/android/ui/state/TaskState;

    if-ne v0, v1, :cond_0

    const/16 v9, 0x2b

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v5, p0

    move-object v7, p1

    move-object v2, p2

    .end local p0    # "$p":Ljava/lang/Float;
    .end local p1    # "$d":Ljava/lang/String;
    .end local p2    # "it":Lcom/pymcl/android/ui/state/TaskRow;
    .local v2, "it":Lcom/pymcl/android/ui/state/TaskRow;
    .local v5, "$p":Ljava/lang/Float;
    .local v7, "$d":Ljava/lang/String;
    invoke-static/range {v2 .. v10}, Lcom/pymcl/android/ui/state/TaskRow;->copy$default(Lcom/pymcl/android/ui/state/TaskRow;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Lcom/pymcl/android/ui/state/TaskState;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/pymcl/android/ui/state/TaskRow;

    move-result-object p0

    goto :goto_0

    .end local v2    # "it":Lcom/pymcl/android/ui/state/TaskRow;
    .end local v5    # "$p":Ljava/lang/Float;
    .end local v7    # "$d":Ljava/lang/String;
    .restart local p0    # "$p":Ljava/lang/Float;
    .restart local p1    # "$d":Ljava/lang/String;
    .restart local p2    # "it":Lcom/pymcl/android/ui/state/TaskRow;
    :cond_0
    move-object v5, p0

    move-object v7, p1

    move-object v2, p2

    .end local p0    # "$p":Ljava/lang/Float;
    .end local p1    # "$d":Ljava/lang/String;
    .end local p2    # "it":Lcom/pymcl/android/ui/state/TaskRow;
    .restart local v2    # "it":Lcom/pymcl/android/ui/state/TaskRow;
    .restart local v5    # "$p":Ljava/lang/Float;
    .restart local v7    # "$d":Ljava/lang/String;
    move-object p0, v2

    :goto_0
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6
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

    new-instance v0, Lcom/pymcl/android/ui/state/AppState$progressOf$1$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/state/AppState$progressOf$1$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    iget-object v2, p0, Lcom/pymcl/android/ui/state/AppState$progressOf$1$1;->$id:Ljava/lang/String;

    iget-object v3, p0, Lcom/pymcl/android/ui/state/AppState$progressOf$1$1;->$p:Ljava/lang/Float;

    iget-object v4, p0, Lcom/pymcl/android/ui/state/AppState$progressOf$1$1;->$d:Ljava/lang/String;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/pymcl/android/ui/state/AppState$progressOf$1$1;-><init>(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/state/AppState$progressOf$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/state/AppState$progressOf$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/state/AppState$progressOf$1$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/state/AppState$progressOf$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 181
    iget v0, p0, Lcom/pymcl/android/ui/state/AppState$progressOf$1$1;->label:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState$progressOf$1$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/AppState;->getTaskJobs$PyMCL_Android_app_debug()Lcom/pymcl/android/ui/state/TaskJobs;

    move-result-object v0

    iget-object v1, p0, Lcom/pymcl/android/ui/state/AppState$progressOf$1$1;->$id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/state/TaskJobs;->isCancelled(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState$progressOf$1$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    iget-object v1, p0, Lcom/pymcl/android/ui/state/AppState$progressOf$1$1;->$id:Ljava/lang/String;

    iget-object v2, p0, Lcom/pymcl/android/ui/state/AppState$progressOf$1$1;->$p:Ljava/lang/Float;

    iget-object v3, p0, Lcom/pymcl/android/ui/state/AppState$progressOf$1$1;->$d:Ljava/lang/String;

    new-instance v4, Lcom/pymcl/android/ui/state/AppState$progressOf$1$1$$ExternalSyntheticLambda0;

    invoke-direct {v4, v2, v3}, Lcom/pymcl/android/ui/state/AppState$progressOf$1$1$$ExternalSyntheticLambda0;-><init>(Ljava/lang/Float;Ljava/lang/String;)V

    invoke-static {v0, v1, v4}, Lcom/pymcl/android/ui/state/AppState;->access$updateTask(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    :cond_0
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
