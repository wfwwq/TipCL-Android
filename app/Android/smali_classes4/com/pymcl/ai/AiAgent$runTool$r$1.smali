.class final Lcom/pymcl/ai/AiAgent$runTool$r$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AiAgent.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/ai/AiAgent;->runTool(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/pymcl/ai/ToolCall;Lcom/pymcl/ai/AiSettings;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lcom/pymcl/ai/SnapshotResult;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAiAgent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiAgent.kt\ncom/pymcl/ai/AiAgent$runTool$r$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,409:1\n1#2:410\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/pymcl/ai/SnapshotResult;",
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
    c = "com.pymcl.ai.AiAgent$runTool$r$1"
    f = "AiAgent.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    nl = {}
    s = {}
    v = 0x2
.end annotation


# instance fields
.field final synthetic $chatId:Ljava/lang/String;

.field final synthetic $paths:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $tc:Lcom/pymcl/ai/ToolCall;

.field final synthetic $turnId:Ljava/lang/String;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/pymcl/ai/AiAgent;


# direct methods
.method constructor <init>(Lcom/pymcl/ai/AiAgent;Ljava/lang/String;Ljava/lang/String;Lcom/pymcl/ai/ToolCall;Ljava/util/List;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/ai/AiAgent;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/pymcl/ai/ToolCall;",
            "Ljava/util/List<",
            "+",
            "Ljava/io/File;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/ai/AiAgent$runTool$r$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/ai/AiAgent$runTool$r$1;->this$0:Lcom/pymcl/ai/AiAgent;

    iput-object p2, p0, Lcom/pymcl/ai/AiAgent$runTool$r$1;->$chatId:Ljava/lang/String;

    iput-object p3, p0, Lcom/pymcl/ai/AiAgent$runTool$r$1;->$turnId:Ljava/lang/String;

    iput-object p4, p0, Lcom/pymcl/ai/AiAgent$runTool$r$1;->$tc:Lcom/pymcl/ai/ToolCall;

    iput-object p5, p0, Lcom/pymcl/ai/AiAgent$runTool$r$1;->$paths:Ljava/util/List;

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

    new-instance v0, Lcom/pymcl/ai/AiAgent$runTool$r$1;

    iget-object v1, p0, Lcom/pymcl/ai/AiAgent$runTool$r$1;->this$0:Lcom/pymcl/ai/AiAgent;

    iget-object v2, p0, Lcom/pymcl/ai/AiAgent$runTool$r$1;->$chatId:Ljava/lang/String;

    iget-object v3, p0, Lcom/pymcl/ai/AiAgent$runTool$r$1;->$turnId:Ljava/lang/String;

    iget-object v4, p0, Lcom/pymcl/ai/AiAgent$runTool$r$1;->$tc:Lcom/pymcl/ai/ToolCall;

    iget-object v5, p0, Lcom/pymcl/ai/AiAgent$runTool$r$1;->$paths:Ljava/util/List;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/pymcl/ai/AiAgent$runTool$r$1;-><init>(Lcom/pymcl/ai/AiAgent;Ljava/lang/String;Ljava/lang/String;Lcom/pymcl/ai/ToolCall;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/pymcl/ai/AiAgent$runTool$r$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/ai/AiAgent$runTool$r$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lcom/pymcl/ai/SnapshotResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/ai/AiAgent$runTool$r$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/ai/AiAgent$runTool$r$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/ai/AiAgent$runTool$r$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8
    .param p1, "$result"    # Ljava/lang/Object;

    iget-object v0, p0, Lcom/pymcl/ai/AiAgent$runTool$r$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlinx/coroutines/CoroutineScope;

    .local v0, "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 264
    iget v1, p0, Lcom/pymcl/ai/AiAgent$runTool$r$1;->label:I

    packed-switch v1, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/pymcl/ai/AiAgent$runTool$r$1;->this$0:Lcom/pymcl/ai/AiAgent;

    iget-object v2, p0, Lcom/pymcl/ai/AiAgent$runTool$r$1;->$chatId:Ljava/lang/String;

    iget-object v3, p0, Lcom/pymcl/ai/AiAgent$runTool$r$1;->$turnId:Ljava/lang/String;

    iget-object v4, p0, Lcom/pymcl/ai/AiAgent$runTool$r$1;->$tc:Lcom/pymcl/ai/ToolCall;

    iget-object v5, p0, Lcom/pymcl/ai/AiAgent$runTool$r$1;->$paths:Ljava/util/List;

    :try_start_0
    sget-object v6, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v6, v0

    .line 410
    .local v6, "$this$invokeSuspend_u24lambda_u240":Lkotlinx/coroutines/CoroutineScope;
    const/4 v7, 0x0

    .line 264
    .local v7, "$i$a$-runCatching-AiAgent$runTool$r$1$1":I
    invoke-static {v1}, Lcom/pymcl/ai/AiAgent;->access$getCheckpoints$p(Lcom/pymcl/ai/AiAgent;)Lcom/pymcl/ai/CheckpointStore;

    move-result-object v1

    invoke-virtual {v4}, Lcom/pymcl/ai/ToolCall;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/pymcl/ai/CheckpointStore;->snapshot(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/pymcl/ai/SnapshotResult;

    move-result-object v1

    .end local v6    # "$this$invokeSuspend_u24lambda_u240":Lkotlinx/coroutines/CoroutineScope;
    .end local v7    # "$i$a$-runCatching-AiAgent$runTool$r$1$1":I
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :goto_0
    invoke-static {v1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_1

    .line 410
    .local v2, "it":Ljava/lang/Throwable;
    :cond_0
    const/4 v1, 0x0

    .line 264
    .local v1, "$i$a$-getOrElse-AiAgent$runTool$r$1$2":I
    new-instance v3, Lcom/pymcl/ai/SnapshotResult;

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\u68c0\u67e5\u70b9\u4e0d\u53ef\u7528\uff1a"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-direct {v3, v5, v5, v4}, Lcom/pymcl/ai/SnapshotResult;-><init>(ZILjava/lang/String;)V

    move-object v1, v3

    .end local v1    # "$i$a$-getOrElse-AiAgent$runTool$r$1$2":I
    .end local v2    # "it":Ljava/lang/Throwable;
    :goto_1
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
