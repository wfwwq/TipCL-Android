.class final Lcom/pymcl/android/ui/state/ModUpdateWatcher$startLoop$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ModUpdateWatcher.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/state/ModUpdateWatcher;->startLoop()V
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
    c = "com.pymcl.android.ui.state.ModUpdateWatcher$startLoop$1"
    f = "ModUpdateWatcher.kt"
    i = {
        0x0,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2
    }
    l = {
        0x51,
        0x55,
        0x56
    }
    m = "invokeSuspend"
    n = {
        "$this$launch",
        "$this$launch",
        "last",
        "wait",
        "$this$launch",
        "last",
        "wait"
    }
    nl = {
        0x52,
        0x56,
        0x57
    }
    s = {
        "L$0",
        "L$0",
        "J$0",
        "J$1",
        "L$0",
        "J$0",
        "J$1"
    }
    v = 0x2
.end annotation


# instance fields
.field J$0:J

.field J$1:J

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/pymcl/android/ui/state/ModUpdateWatcher;


# direct methods
.method constructor <init>(Lcom/pymcl/android/ui/state/ModUpdateWatcher;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/ModUpdateWatcher;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/state/ModUpdateWatcher$startLoop$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/state/ModUpdateWatcher$startLoop$1;->this$0:Lcom/pymcl/android/ui/state/ModUpdateWatcher;

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

    new-instance v0, Lcom/pymcl/android/ui/state/ModUpdateWatcher$startLoop$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/state/ModUpdateWatcher$startLoop$1;->this$0:Lcom/pymcl/android/ui/state/ModUpdateWatcher;

    invoke-direct {v0, v1, p2}, Lcom/pymcl/android/ui/state/ModUpdateWatcher$startLoop$1;-><init>(Lcom/pymcl/android/ui/state/ModUpdateWatcher;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/pymcl/android/ui/state/ModUpdateWatcher$startLoop$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/state/ModUpdateWatcher$startLoop$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/state/ModUpdateWatcher$startLoop$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/state/ModUpdateWatcher$startLoop$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/state/ModUpdateWatcher$startLoop$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/pymcl/android/ui/state/ModUpdateWatcher$startLoop$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    .local v1, "$this$launch":Lkotlinx/coroutines/CoroutineScope;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 80
    iget v3, v0, Lcom/pymcl/android/ui/state/ModUpdateWatcher$startLoop$1;->label:I

    const/4 v4, 0x1

    packed-switch v3, :pswitch_data_0

    .end local p0    # "this":Lcom/pymcl/android/ui/state/ModUpdateWatcher$startLoop$1;
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    .restart local p0    # "this":Lcom/pymcl/android/ui/state/ModUpdateWatcher$startLoop$1;
    :pswitch_0
    iget-wide v5, v0, Lcom/pymcl/android/ui/state/ModUpdateWatcher$startLoop$1;->J$1:J

    .local v5, "wait":J
    iget-wide v7, v0, Lcom/pymcl/android/ui/state/ModUpdateWatcher$startLoop$1;->J$0:J

    .local v7, "last":J
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v3, v2

    move-wide v9, v5

    move-object v5, v0

    move-object v2, v1

    move-object/from16 v1, p1

    goto/16 :goto_4

    .end local v5    # "wait":J
    .end local v7    # "last":J
    :pswitch_1
    iget-wide v5, v0, Lcom/pymcl/android/ui/state/ModUpdateWatcher$startLoop$1;->J$1:J

    .restart local v5    # "wait":J
    iget-wide v7, v0, Lcom/pymcl/android/ui/state/ModUpdateWatcher$startLoop$1;->J$0:J

    .restart local v7    # "last":J
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v3, v2

    move-wide v12, v7

    move-object v7, v0

    move-object v2, v1

    move-object/from16 v1, p1

    goto/16 :goto_3

    .end local v5    # "wait":J
    .end local v7    # "last":J
    :pswitch_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_3
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 81
    move-object v3, v0

    check-cast v3, Lkotlin/coroutines/Continuation;

    iput-object v1, v0, Lcom/pymcl/android/ui/state/ModUpdateWatcher$startLoop$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lcom/pymcl/android/ui/state/ModUpdateWatcher$startLoop$1;->label:I

    const-wide/16 v5, 0xfa0

    invoke-static {v5, v6, v3}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_0

    .line 80
    return-object v2

    .line 82
    :cond_0
    :goto_0
    move-object v5, v0

    move-object v3, v2

    move-object v2, v1

    move-object/from16 v1, p1

    .end local p0    # "this":Lcom/pymcl/android/ui/state/ModUpdateWatcher$startLoop$1;
    .end local p1    # "$result":Ljava/lang/Object;
    .local v1, "$result":Ljava/lang/Object;
    .local v2, "$this$launch":Lkotlinx/coroutines/CoroutineScope;
    .local v5, "this":Lcom/pymcl/android/ui/state/ModUpdateWatcher$startLoop$1;
    :cond_1
    :goto_1
    invoke-static {v2}, Lkotlinx/coroutines/CoroutineScopeKt;->isActive(Lkotlinx/coroutines/CoroutineScope;)Z

    move-result v6

    if-eqz v6, :cond_6

    iget-object v6, v5, Lcom/pymcl/android/ui/state/ModUpdateWatcher$startLoop$1;->this$0:Lcom/pymcl/android/ui/state/ModUpdateWatcher;

    invoke-virtual {v6}, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->getEnabled()Z

    move-result v6

    if-eqz v6, :cond_6

    .line 83
    iget-object v6, v5, Lcom/pymcl/android/ui/state/ModUpdateWatcher$startLoop$1;->this$0:Lcom/pymcl/android/ui/state/ModUpdateWatcher;

    invoke-static {v6}, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->access$getPrefs$p(Lcom/pymcl/android/ui/state/ModUpdateWatcher;)Lcom/pymcl/android/ui/state/ModWatchPrefs;

    move-result-object v6

    const-wide/16 v7, 0x0

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Lcom/pymcl/android/ui/state/ModWatchPrefs;->getLastCheck()J

    move-result-wide v9

    goto :goto_2

    :cond_2
    move-wide v9, v7

    :goto_2
    move-wide v12, v9

    .line 84
    .local v12, "last":J
    sget-object v11, Lcom/pymcl/core/mods/ModUpdateSchedule;->INSTANCE:Lcom/pymcl/core/mods/ModUpdateSchedule;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14

    const/16 v18, 0x4

    const/16 v19, 0x0

    const-wide/16 v16, 0x0

    invoke-static/range {v11 .. v19}, Lcom/pymcl/core/mods/ModUpdateSchedule;->delayUntilNext$default(Lcom/pymcl/core/mods/ModUpdateSchedule;JJJILjava/lang/Object;)J

    move-result-wide v9

    .line 85
    .local v9, "wait":J
    cmp-long v6, v9, v7

    if-lez v6, :cond_4

    move-object v6, v5

    check-cast v6, Lkotlin/coroutines/Continuation;

    iput-object v2, v5, Lcom/pymcl/android/ui/state/ModUpdateWatcher$startLoop$1;->L$0:Ljava/lang/Object;

    iput-wide v12, v5, Lcom/pymcl/android/ui/state/ModUpdateWatcher$startLoop$1;->J$0:J

    iput-wide v9, v5, Lcom/pymcl/android/ui/state/ModUpdateWatcher$startLoop$1;->J$1:J

    const/4 v7, 0x2

    iput v7, v5, Lcom/pymcl/android/ui/state/ModUpdateWatcher$startLoop$1;->label:I

    invoke-static {v9, v10, v6}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v3, :cond_3

    .line 80
    return-object v3

    .line 85
    :cond_3
    move-object v7, v5

    move-wide v5, v9

    .end local v9    # "wait":J
    .local v5, "wait":J
    .local v7, "this":Lcom/pymcl/android/ui/state/ModUpdateWatcher$startLoop$1;
    :goto_3
    move-object v5, v7

    goto :goto_1

    .line 86
    .end local v7    # "this":Lcom/pymcl/android/ui/state/ModUpdateWatcher$startLoop$1;
    .local v5, "this":Lcom/pymcl/android/ui/state/ModUpdateWatcher$startLoop$1;
    .restart local v9    # "wait":J
    :cond_4
    iget-object v6, v5, Lcom/pymcl/android/ui/state/ModUpdateWatcher$startLoop$1;->this$0:Lcom/pymcl/android/ui/state/ModUpdateWatcher;

    move-object v7, v5

    check-cast v7, Lkotlin/coroutines/Continuation;

    iput-object v2, v5, Lcom/pymcl/android/ui/state/ModUpdateWatcher$startLoop$1;->L$0:Ljava/lang/Object;

    iput-wide v12, v5, Lcom/pymcl/android/ui/state/ModUpdateWatcher$startLoop$1;->J$0:J

    iput-wide v9, v5, Lcom/pymcl/android/ui/state/ModUpdateWatcher$startLoop$1;->J$1:J

    const/4 v8, 0x3

    iput v8, v5, Lcom/pymcl/android/ui/state/ModUpdateWatcher$startLoop$1;->label:I

    invoke-virtual {v6, v4, v7}, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->checkAll(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v3, :cond_5

    .line 80
    return-object v3

    .line 86
    :cond_5
    move-wide v7, v12

    .line 87
    .end local v12    # "last":J
    .local v7, "last":J
    :goto_4
    iget-object v6, v5, Lcom/pymcl/android/ui/state/ModUpdateWatcher$startLoop$1;->this$0:Lcom/pymcl/android/ui/state/ModUpdateWatcher;

    invoke-static {v6}, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->access$getPrefs$p(Lcom/pymcl/android/ui/state/ModUpdateWatcher;)Lcom/pymcl/android/ui/state/ModWatchPrefs;

    move-result-object v6

    if-eqz v6, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    invoke-virtual {v6, v11, v12}, Lcom/pymcl/android/ui/state/ModWatchPrefs;->setLastCheck(J)V

    goto :goto_1

    .line 89
    .end local v7    # "last":J
    .end local v9    # "wait":J
    :cond_6
    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
