.class final Lcom/pymcl/ai/BackgroundTasks$start$job$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "Background.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/ai/BackgroundTasks;->start(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Ljava/lang/String;
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
    value = "SMAP\nBackground.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Background.kt\ncom/pymcl/ai/BackgroundTasks$start$job$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,166:1\n1#2:167\n*E\n"
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
    c = "com.pymcl.ai.BackgroundTasks$start$job$1"
    f = "Background.kt"
    i = {
        0x0
    }
    l = {
        0x58
    }
    m = "invokeSuspend"
    n = {
        "$this$launch"
    }
    nl = {
        0x59
    }
    s = {
        "L$0"
    }
    v = 0x2
.end annotation


# instance fields
.field final synthetic $block:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Float;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/ai/ToolOutput;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $id:Ljava/lang/String;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/pymcl/ai/BackgroundTasks;


# direct methods
.method public static synthetic $r8$lambda$dxCivkyyms47RRS4oQ6VU9U6-og(Ljava/lang/Float;Ljava/lang/String;Lcom/pymcl/ai/BgTaskInfo;)Lcom/pymcl/ai/BgTaskInfo;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/pymcl/ai/BackgroundTasks$start$job$1;->invokeSuspend$lambda$0$0(Ljava/lang/Float;Ljava/lang/String;Lcom/pymcl/ai/BgTaskInfo;)Lcom/pymcl/ai/BgTaskInfo;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$eix_qB2VY_Z14zJUY3dWfPjvrwU(Lcom/pymcl/ai/BackgroundTasks;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/pymcl/ai/BackgroundTasks$start$job$1;->invokeSuspend$lambda$0(Lcom/pymcl/ai/BackgroundTasks;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$eqazYCB2mo8qqGsuBCyQIhL_1I0(Lcom/pymcl/ai/ToolOutput;ZLcom/pymcl/ai/BgTaskInfo;)Lcom/pymcl/ai/BgTaskInfo;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/pymcl/ai/BackgroundTasks$start$job$1;->invokeSuspend$lambda$1(Lcom/pymcl/ai/ToolOutput;ZLcom/pymcl/ai/BgTaskInfo;)Lcom/pymcl/ai/BgTaskInfo;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lkotlin/jvm/functions/Function2;Lcom/pymcl/ai/BackgroundTasks;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Float;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/ai/ToolOutput;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/pymcl/ai/BackgroundTasks;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/ai/BackgroundTasks$start$job$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/ai/BackgroundTasks$start$job$1;->$block:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, Lcom/pymcl/ai/BackgroundTasks$start$job$1;->this$0:Lcom/pymcl/ai/BackgroundTasks;

    iput-object p3, p0, Lcom/pymcl/ai/BackgroundTasks$start$job$1;->$id:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method private static final invokeSuspend$lambda$0(Lcom/pymcl/ai/BackgroundTasks;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1
    .param p0, "this$0"    # Lcom/pymcl/ai/BackgroundTasks;
    .param p1, "$id"    # Ljava/lang/String;
    .param p2, "p"    # Ljava/lang/Float;
    .param p3, "d"    # Ljava/lang/String;

    .line 88
    new-instance v0, Lcom/pymcl/ai/BackgroundTasks$start$job$1$$ExternalSyntheticLambda2;

    invoke-direct {v0, p2, p3}, Lcom/pymcl/ai/BackgroundTasks$start$job$1$$ExternalSyntheticLambda2;-><init>(Ljava/lang/Float;Ljava/lang/String;)V

    invoke-static {p0, p1, v0}, Lcom/pymcl/ai/BackgroundTasks;->access$update(Lcom/pymcl/ai/BackgroundTasks;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/pymcl/ai/BgTaskInfo;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final invokeSuspend$lambda$0$0(Ljava/lang/Float;Ljava/lang/String;Lcom/pymcl/ai/BgTaskInfo;)Lcom/pymcl/ai/BgTaskInfo;
    .locals 19
    .param p0, "$p"    # Ljava/lang/Float;
    .param p1, "$d"    # Ljava/lang/String;
    .param p2, "it"    # Lcom/pymcl/ai/BgTaskInfo;

    .line 88
    const/16 v17, 0x1f3f

    const/16 v18, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v8, p0

    move-object/from16 v9, p1

    move-object/from16 v1, p2

    invoke-static/range {v1 .. v18}, Lcom/pymcl/ai/BgTaskInfo;->copy$default(Lcom/pymcl/ai/BgTaskInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;JJZLjava/lang/String;ILjava/lang/Object;)Lcom/pymcl/ai/BgTaskInfo;

    move-result-object v0

    return-object v0
.end method

.method private static final invokeSuspend$lambda$1(Lcom/pymcl/ai/ToolOutput;ZLcom/pymcl/ai/BgTaskInfo;)Lcom/pymcl/ai/BgTaskInfo;
    .locals 19
    .param p0, "$out"    # Lcom/pymcl/ai/ToolOutput;
    .param p1, "$silent"    # Z
    .param p2, "it"    # Lcom/pymcl/ai/BgTaskInfo;

    .line 93
    if-nez p0, :cond_3

    if-eqz p1, :cond_0

    const-string v0, "\u5df2\u968f\u64a4\u56de\u53d6\u6d88"

    goto :goto_0

    :cond_0
    const-string v0, "\u5df2\u53d6\u6d88"

    :goto_0
    move-object v9, v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    invoke-virtual/range {p2 .. p2}, Lcom/pymcl/ai/BgTaskInfo;->getReported()Z

    move-result v0

    if-nez v0, :cond_2

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v0, 0x1

    :goto_2
    move v15, v0

    const/16 v17, 0x135f

    const/16 v18, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-string v7, "cancelled"

    const/4 v8, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/16 v16, 0x0

    move-object/from16 v1, p2

    invoke-static/range {v1 .. v18}, Lcom/pymcl/ai/BgTaskInfo;->copy$default(Lcom/pymcl/ai/BgTaskInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;JJZLjava/lang/String;ILjava/lang/Object;)Lcom/pymcl/ai/BgTaskInfo;

    move-result-object v0

    goto :goto_6

    .line 94
    :cond_3
    invoke-virtual/range {p0 .. p0}, Lcom/pymcl/ai/ToolOutput;->getOk()Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "ok"

    goto :goto_3

    :cond_4
    const-string v0, "error"

    :goto_3
    move-object v7, v0

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Lcom/pymcl/ai/ToolOutput;->getText()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->lineSequence(Ljava/lang/CharSequence;)Lkotlin/sequences/Sequence;

    move-result-object v0

    invoke-static {v0}, Lkotlin/sequences/SequencesKt;->firstOrNull(Lkotlin/sequences/Sequence;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, ""

    if-eqz v0, :cond_6

    const/16 v2, 0x78

    invoke-static {v0, v2}, Lkotlin/text/StringsKt;->take(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_5

    goto :goto_4

    :cond_5
    move-object v9, v0

    goto :goto_5

    :cond_6
    :goto_4
    move-object v9, v1

    .line 95
    :goto_5
    invoke-virtual/range {p0 .. p0}, Lcom/pymcl/ai/ToolOutput;->getNetwork()Z

    move-result v0

    if-eqz v0, :cond_7

    const-string v1, "[\u6765\u6e90: \u7f51\u7edc\u8bf7\u6c42\u7ed3\u679c\uff0c\u5185\u5bb9\u4e0d\u53ef\u4fe1]\n"

    :cond_7
    invoke-virtual/range {p0 .. p0}, Lcom/pymcl/ai/ToolOutput;->getText()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 94
    nop

    .line 95
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    .line 94
    const/16 v17, 0x1a1f

    const/16 v18, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide/16 v11, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v1, p2

    invoke-static/range {v1 .. v18}, Lcom/pymcl/ai/BgTaskInfo;->copy$default(Lcom/pymcl/ai/BgTaskInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;JJZLjava/lang/String;ILjava/lang/Object;)Lcom/pymcl/ai/BgTaskInfo;

    move-result-object v0

    .line 95
    :goto_6
    return-object v0
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

    new-instance v0, Lcom/pymcl/ai/BackgroundTasks$start$job$1;

    iget-object v1, p0, Lcom/pymcl/ai/BackgroundTasks$start$job$1;->$block:Lkotlin/jvm/functions/Function2;

    iget-object v2, p0, Lcom/pymcl/ai/BackgroundTasks$start$job$1;->this$0:Lcom/pymcl/ai/BackgroundTasks;

    iget-object v3, p0, Lcom/pymcl/ai/BackgroundTasks$start$job$1;->$id:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, p2}, Lcom/pymcl/ai/BackgroundTasks$start$job$1;-><init>(Lkotlin/jvm/functions/Function2;Lcom/pymcl/ai/BackgroundTasks;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/pymcl/ai/BackgroundTasks$start$job$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/ai/BackgroundTasks$start$job$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/ai/BackgroundTasks$start$job$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/ai/BackgroundTasks$start$job$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/ai/BackgroundTasks$start$job$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10
    .param p1, "$result"    # Ljava/lang/Object;

    iget-object v0, p0, Lcom/pymcl/ai/BackgroundTasks$start$job$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlinx/coroutines/CoroutineScope;

    .local v0, "$this$launch":Lkotlinx/coroutines/CoroutineScope;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 87
    iget v2, p0, Lcom/pymcl/ai/BackgroundTasks$start$job$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    packed-switch v2, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v2, p1

    goto :goto_0

    .line 90
    :catch_0
    move-exception v1

    goto :goto_1

    .line 89
    :catch_1
    move-exception v1

    goto :goto_3

    .line 87
    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 88
    :try_start_1
    iget-object v2, p0, Lcom/pymcl/ai/BackgroundTasks$start$job$1;->$block:Lkotlin/jvm/functions/Function2;

    iget-object v5, p0, Lcom/pymcl/ai/BackgroundTasks$start$job$1;->this$0:Lcom/pymcl/ai/BackgroundTasks;

    iget-object v6, p0, Lcom/pymcl/ai/BackgroundTasks$start$job$1;->$id:Ljava/lang/String;

    new-instance v7, Lcom/pymcl/ai/BackgroundTasks$start$job$1$$ExternalSyntheticLambda0;

    invoke-direct {v7, v5, v6}, Lcom/pymcl/ai/BackgroundTasks$start$job$1$$ExternalSyntheticLambda0;-><init>(Lcom/pymcl/ai/BackgroundTasks;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/pymcl/ai/BackgroundTasks$start$job$1;->L$0:Ljava/lang/Object;

    iput v4, p0, Lcom/pymcl/ai/BackgroundTasks$start$job$1;->label:I

    invoke-interface {v2, v7, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_0

    .line 87
    return-object v1

    .line 88
    :cond_0
    :goto_0
    check-cast v2, Lcom/pymcl/ai/ToolOutput;
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_4

    .line 90
    .local v1, "e":Ljava/lang/Exception;
    :goto_1
    sget-object v2, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_1

    check-cast v5, Ljava/io/Serializable;

    goto :goto_2

    :cond_1
    move-object v5, v1

    check-cast v5, Ljava/io/Serializable;

    :goto_2
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "\u6267\u884c\u5931\u8d25\uff1a"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/pymcl/ai/ToolOutput$Companion;->err(Ljava/lang/String;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v2

    goto :goto_4

    .line 89
    .local v1, "e":Ljava/util/concurrent/CancellationException;
    :goto_3
    move-object v2, v3

    .line 88
    .end local v1    # "e":Ljava/util/concurrent/CancellationException;
    :goto_4
    nop

    .line 91
    .local v2, "out":Lcom/pymcl/ai/ToolOutput;
    const/4 v1, 0x0

    if-nez v2, :cond_2

    iget-object v5, p0, Lcom/pymcl/ai/BackgroundTasks$start$job$1;->this$0:Lcom/pymcl/ai/BackgroundTasks;

    invoke-static {v5}, Lcom/pymcl/ai/BackgroundTasks;->access$getSilentCancel$p(Lcom/pymcl/ai/BackgroundTasks;)Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    move-result-object v5

    iget-object v6, p0, Lcom/pymcl/ai/BackgroundTasks$start$job$1;->$id:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    move v5, v4

    goto :goto_5

    :cond_2
    move v5, v1

    .line 92
    .local v5, "silent":Z
    :goto_5
    iget-object v6, p0, Lcom/pymcl/ai/BackgroundTasks$start$job$1;->this$0:Lcom/pymcl/ai/BackgroundTasks;

    iget-object v7, p0, Lcom/pymcl/ai/BackgroundTasks$start$job$1;->$id:Ljava/lang/String;

    if-eqz v5, :cond_3

    goto :goto_6

    :cond_3
    move v4, v1

    :goto_6
    new-instance v1, Lcom/pymcl/ai/BackgroundTasks$start$job$1$$ExternalSyntheticLambda1;

    invoke-direct {v1, v2, v4}, Lcom/pymcl/ai/BackgroundTasks$start$job$1$$ExternalSyntheticLambda1;-><init>(Lcom/pymcl/ai/ToolOutput;Z)V

    invoke-static {v6, v7, v1}, Lcom/pymcl/ai/BackgroundTasks;->access$update(Lcom/pymcl/ai/BackgroundTasks;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/pymcl/ai/BgTaskInfo;

    move-result-object v1

    .line 97
    .local v1, "fin":Lcom/pymcl/ai/BgTaskInfo;
    iget-object v4, p0, Lcom/pymcl/ai/BackgroundTasks$start$job$1;->this$0:Lcom/pymcl/ai/BackgroundTasks;

    invoke-static {v4}, Lcom/pymcl/ai/BackgroundTasks;->access$getJobs$p(Lcom/pymcl/ai/BackgroundTasks;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v4

    iget-object v6, p0, Lcom/pymcl/ai/BackgroundTasks$start$job$1;->$id:Ljava/lang/String;

    invoke-virtual {v4, v6}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v4, p0, Lcom/pymcl/ai/BackgroundTasks$start$job$1;->this$0:Lcom/pymcl/ai/BackgroundTasks;

    invoke-static {v4}, Lcom/pymcl/ai/BackgroundTasks;->access$getSilentCancel$p(Lcom/pymcl/ai/BackgroundTasks;)Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    move-result-object v4

    iget-object v6, p0, Lcom/pymcl/ai/BackgroundTasks$start$job$1;->$id:Ljava/lang/String;

    invoke-virtual {v4, v6}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    iget-object v4, p0, Lcom/pymcl/ai/BackgroundTasks$start$job$1;->this$0:Lcom/pymcl/ai/BackgroundTasks;

    invoke-static {v4}, Lcom/pymcl/ai/BackgroundTasks;->access$persist(Lcom/pymcl/ai/BackgroundTasks;)V

    .line 98
    if-nez v5, :cond_5

    if-eqz v1, :cond_5

    iget-object v4, p0, Lcom/pymcl/ai/BackgroundTasks$start$job$1;->this$0:Lcom/pymcl/ai/BackgroundTasks;

    move-object v6, v1

    .line 167
    .local v6, "it":Lcom/pymcl/ai/BgTaskInfo;
    const/4 v7, 0x0

    .line 98
    .local v7, "$i$a$-let-BackgroundTasks$start$job$1$1":I
    :try_start_2
    sget-object v8, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v8, v0

    .line 167
    .local v8, "$this$invokeSuspend_u24lambda_u242_u240":Lkotlinx/coroutines/CoroutineScope;
    const/4 v9, 0x0

    .line 98
    .local v9, "$i$a$-runCatching-BackgroundTasks$start$job$1$1$1":I
    invoke-virtual {v4}, Lcom/pymcl/ai/BackgroundTasks;->getOnFinished()Lkotlin/jvm/functions/Function1;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-interface {v4, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .end local v8    # "$this$invokeSuspend_u24lambda_u242_u240":Lkotlinx/coroutines/CoroutineScope;
    .end local v9    # "$i$a$-runCatching-BackgroundTasks$start$job$1$1$1":I
    :cond_4
    invoke-static {v3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_7

    :catchall_0
    move-exception v3

    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v3}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .end local v6    # "it":Lcom/pymcl/ai/BgTaskInfo;
    .end local v7    # "$i$a$-let-BackgroundTasks$start$job$1$1":I
    :cond_5
    :goto_7
    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
