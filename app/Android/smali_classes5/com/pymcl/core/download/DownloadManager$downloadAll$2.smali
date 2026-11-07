.class final Lcom/pymcl/core/download/DownloadManager$downloadAll$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "DownloadManager.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/core/download/DownloadManager;->downloadAll(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    value = "SMAP\nDownloadManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DownloadManager.kt\ncom/pymcl/core/download/DownloadManager$downloadAll$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,208:1\n1849#2,8:209\n1739#2:218\n1814#2,3:219\n1#3:217\n*S KotlinDebug\n*F\n+ 1 DownloadManager.kt\ncom/pymcl/core/download/DownloadManager$downloadAll$2\n*L\n82#1:209,8\n94#1:218\n94#1:219,3\n*E\n"
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
    c = "com.pymcl.core.download.DownloadManager$downloadAll$2"
    f = "DownloadManager.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0x67
    }
    m = "invokeSuspend"
    n = {
        "$this$coroutineScope",
        "list",
        "doneBytes",
        "done",
        "failed",
        "errors",
        "sem",
        "total",
        "t0"
    }
    nl = {
        0x68
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5",
        "L$6",
        "J$0",
        "J$1"
    }
    v = 0x2
.end annotation


# instance fields
.field final synthetic $items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/pymcl/core/download/DownloadItem;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $name:Ljava/lang/String;

.field final synthetic $onProgress:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/pymcl/core/download/DownloadProgress;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field J$0:J

.field J$1:J

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/pymcl/core/download/DownloadManager;


# direct methods
.method constructor <init>(Ljava/util/List;Lcom/pymcl/core/download/DownloadManager;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/pymcl/core/download/DownloadItem;",
            ">;",
            "Lcom/pymcl/core/download/DownloadManager;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/pymcl/core/download/DownloadProgress;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/core/download/DownloadManager$downloadAll$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->$items:Ljava/util/List;

    iput-object p2, p0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->this$0:Lcom/pymcl/core/download/DownloadManager;

    iput-object p3, p0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->$name:Ljava/lang/String;

    iput-object p4, p0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->$onProgress:Lkotlin/jvm/functions/Function1;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method private static final invokeSuspend$emit(JLjava/lang/String;Ljava/util/List;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/atomic/AtomicInteger;JLjava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/ConcurrentLinkedQueue;Lcom/pymcl/core/download/DownloadManager;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Z)V
    .locals 17
    .param p0, "t0"    # J
    .param p2, "$name"    # Ljava/lang/String;
    .param p3, "list"    # Ljava/util/List;
    .param p4, "done"    # Ljava/util/concurrent/atomic/AtomicInteger;
    .param p5, "failed"    # Ljava/util/concurrent/atomic/AtomicInteger;
    .param p6, "total"    # J
    .param p8, "doneBytes"    # Ljava/util/concurrent/atomic/AtomicLong;
    .param p9, "errors"    # Ljava/util/concurrent/ConcurrentLinkedQueue;
    .param p10, "this$0"    # Lcom/pymcl/core/download/DownloadManager;
    .param p11, "$onProgress"    # Lkotlin/jvm/functions/Function1;
    .param p12, "cur"    # Ljava/lang/String;
    .param p13, "fin"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/pymcl/core/download/DownloadItem;",
            ">;",
            "Ljava/util/concurrent/atomic/AtomicInteger;",
            "Ljava/util/concurrent/atomic/AtomicInteger;",
            "J",
            "Ljava/util/concurrent/atomic/AtomicLong;",
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/pymcl/core/download/DownloadManager;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/pymcl/core/download/DownloadProgress;",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    .line 88
    move-object/from16 v0, p11

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    sub-long v1, v1, p0

    long-to-double v1, v1

    const-wide v3, 0x41cdcd6500000000L    # 1.0E9

    div-double/2addr v1, v3

    .line 89
    .local v1, "el":D
    new-instance v3, Lcom/pymcl/core/download/DownloadProgress;

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    move-result v5

    invoke-virtual/range {p4 .. p4}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v6

    invoke-virtual/range {p5 .. p5}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v7

    invoke-virtual/range {p8 .. p8}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v10

    const-wide/16 v8, 0x0

    cmpl-double v4, v1, v8

    if-lez v4, :cond_0

    invoke-virtual/range {p8 .. p8}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v8

    long-to-double v8, v8

    div-double/2addr v8, v1

    double-to-long v8, v8

    goto :goto_0

    :cond_0
    const-wide/16 v8, 0x0

    :goto_0
    move-wide v12, v8

    move-object/from16 v4, p9

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v16, v4

    check-cast v16, Ljava/lang/String;

    move-object/from16 v4, p2

    move-wide/from16 v8, p6

    move-object/from16 v14, p12

    move/from16 v15, p13

    invoke-direct/range {v3 .. v16}, Lcom/pymcl/core/download/DownloadProgress;-><init>(Ljava/lang/String;IIIJJJLjava/lang/String;ZLjava/lang/String;)V

    .line 90
    .local v3, "p":Lcom/pymcl/core/download/DownloadProgress;
    invoke-static/range {p10 .. p10}, Lcom/pymcl/core/download/DownloadManager;->access$get_progress$p(Lcom/pymcl/core/download/DownloadManager;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v4

    invoke-interface {v4, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    if-eqz v0, :cond_1

    invoke-interface {v0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    :cond_1
    return-void
.end method

.method static synthetic invokeSuspend$emit$default(JLjava/lang/String;Ljava/util/List;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/atomic/AtomicInteger;JLjava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/ConcurrentLinkedQueue;Lcom/pymcl/core/download/DownloadManager;Lkotlin/jvm/functions/Function1;Ljava/lang/String;ZILjava/lang/Object;)V
    .locals 16

    .line 87
    move/from16 v0, p14

    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_0

    const-string v1, ""

    move-object v14, v1

    goto :goto_0

    :cond_0
    move-object/from16 v14, p12

    :goto_0
    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    move v15, v0

    goto :goto_1

    :cond_1
    move/from16 v15, p13

    :goto_1
    move-wide/from16 v2, p0

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-wide/from16 v8, p6

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    invoke-static/range {v2 .. v15}, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->invokeSuspend$emit(JLjava/lang/String;Ljava/util/List;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/atomic/AtomicInteger;JLjava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/ConcurrentLinkedQueue;Lcom/pymcl/core/download/DownloadManager;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Z)V

    return-void
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

    new-instance v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;

    iget-object v1, p0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->$items:Ljava/util/List;

    iget-object v2, p0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->this$0:Lcom/pymcl/core/download/DownloadManager;

    iget-object v3, p0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->$name:Ljava/lang/String;

    iget-object v4, p0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->$onProgress:Lkotlin/jvm/functions/Function1;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;-><init>(Ljava/util/List;Lcom/pymcl/core/download/DownloadManager;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 34
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->L$0:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lkotlinx/coroutines/CoroutineScope;

    .local v2, "$this$coroutineScope":Lkotlinx/coroutines/CoroutineScope;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 81
    iget v3, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->label:I

    const/4 v8, 0x2

    const/4 v9, 0x0

    packed-switch v3, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    iget-wide v3, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->J$1:J

    .local v3, "t0":J
    iget-wide v5, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->J$0:J

    .local v5, "total":J
    iget-object v1, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->L$6:Ljava/lang/Object;

    check-cast v1, Lkotlinx/coroutines/sync/Semaphore;

    .local v1, "sem":Lkotlinx/coroutines/sync/Semaphore;
    iget-object v7, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->L$5:Ljava/lang/Object;

    check-cast v7, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .local v7, "errors":Ljava/util/concurrent/ConcurrentLinkedQueue;
    iget-object v10, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->L$4:Ljava/lang/Object;

    check-cast v10, Ljava/util/concurrent/atomic/AtomicInteger;

    .local v10, "failed":Ljava/util/concurrent/atomic/AtomicInteger;
    iget-object v11, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->L$3:Ljava/lang/Object;

    check-cast v11, Ljava/util/concurrent/atomic/AtomicInteger;

    .local v11, "done":Ljava/util/concurrent/atomic/AtomicInteger;
    iget-object v12, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->L$2:Ljava/lang/Object;

    check-cast v12, Ljava/util/concurrent/atomic/AtomicLong;

    .local v12, "doneBytes":Ljava/util/concurrent/atomic/AtomicLong;
    iget-object v13, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->L$1:Ljava/lang/Object;

    check-cast v13, Ljava/util/List;

    .local v13, "list":Ljava/util/List;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v8, v12

    move-object v12, v7

    move-object v7, v11

    move-object v11, v8

    move-object v8, v10

    move-wide v9, v5

    move-object v6, v13

    goto/16 :goto_4

    .end local v1    # "sem":Lkotlinx/coroutines/sync/Semaphore;
    .end local v3    # "t0":J
    .end local v5    # "total":J
    .end local v7    # "errors":Ljava/util/concurrent/ConcurrentLinkedQueue;
    .end local v10    # "failed":Ljava/util/concurrent/atomic/AtomicInteger;
    .end local v11    # "done":Ljava/util/concurrent/atomic/AtomicInteger;
    .end local v12    # "doneBytes":Ljava/util/concurrent/atomic/AtomicLong;
    .end local v13    # "list":Ljava/util/List;
    :pswitch_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 82
    iget-object v3, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->$items:Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$distinctBy$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 209
    .local v4, "$i$f$distinctBy":I
    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 210
    .local v5, "set$iv":Ljava/util/HashSet;
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 211
    .local v6, "list$iv":Ljava/util/ArrayList;
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_0
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .line 212
    .local v10, "e$iv":Ljava/lang/Object;
    move-object v11, v10

    check-cast v11, Lcom/pymcl/core/download/DownloadItem;

    .local v11, "it":Lcom/pymcl/core/download/DownloadItem;
    const/4 v12, 0x0

    .line 82
    .local v12, "$i$a$-distinctBy-DownloadManager$downloadAll$2$list$1":I
    invoke-virtual {v11}, Lcom/pymcl/core/download/DownloadItem;->getDest()Ljava/io/File;

    move-result-object v13

    invoke-virtual {v13}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v11

    .line 212
    .end local v11    # "it":Lcom/pymcl/core/download/DownloadItem;
    .end local v12    # "$i$a$-distinctBy-DownloadManager$downloadAll$2$list$1":I
    nop

    .line 213
    .local v11, "key$iv":Ljava/lang/Object;
    invoke-virtual {v5, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_0

    .line 214
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 216
    .end local v10    # "e$iv":Ljava/lang/Object;
    .end local v11    # "key$iv":Ljava/lang/Object;
    :cond_1
    move-object v3, v6

    check-cast v3, Ljava/util/List;

    .line 82
    .end local v3    # "$this$distinctBy$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$distinctBy":I
    .end local v5    # "set$iv":Ljava/util/HashSet;
    .end local v6    # "list$iv":Ljava/util/ArrayList;
    move-object/from16 v21, v3

    .line 83
    .local v21, "list":Ljava/util/List;
    move-object/from16 v3, v21

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const-wide/16 v4, 0x0

    move-wide/from16 v16, v4

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/pymcl/core/download/DownloadItem;

    .line 217
    nop

    .local v6, "it":Lcom/pymcl/core/download/DownloadItem;
    const/4 v7, 0x0

    .line 83
    .local v7, "$i$a$-sumOfLong-DownloadManager$downloadAll$2$total$1":I
    invoke-virtual {v6}, Lcom/pymcl/core/download/DownloadItem;->getSize()Ljava/lang/Long;

    move-result-object v10

    if-eqz v10, :cond_2

    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    goto :goto_2

    :cond_2
    move-wide v10, v4

    .end local v6    # "it":Lcom/pymcl/core/download/DownloadItem;
    .end local v7    # "$i$a$-sumOfLong-DownloadManager$downloadAll$2$total$1":I
    :goto_2
    add-long v16, v16, v10

    goto :goto_1

    .line 84
    .local v16, "total":J
    :cond_3
    new-instance v14, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v14}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    .local v14, "doneBytes":Ljava/util/concurrent/atomic/AtomicLong;
    new-instance v15, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v15}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .local v15, "done":Ljava/util/concurrent/atomic/AtomicInteger;
    new-instance v3, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 85
    .local v3, "failed":Ljava/util/concurrent/atomic/AtomicInteger;
    new-instance v19, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct/range {v19 .. v19}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 86
    .local v19, "errors":Ljava/util/concurrent/ConcurrentLinkedQueue;
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v10

    .line 92
    .local v10, "t0":J
    iget-object v12, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->$name:Ljava/lang/String;

    iget-object v4, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->this$0:Lcom/pymcl/core/download/DownloadManager;

    iget-object v5, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->$onProgress:Lkotlin/jvm/functions/Function1;

    const/16 v24, 0xc00

    const/16 v25, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v20, v4

    move-object/from16 v18, v14

    move-object v14, v15

    move-object/from16 v13, v21

    move-object v15, v3

    move-object/from16 v21, v5

    .end local v3    # "failed":Ljava/util/concurrent/atomic/AtomicInteger;
    .end local v21    # "list":Ljava/util/List;
    .restart local v13    # "list":Ljava/util/List;
    .local v14, "done":Ljava/util/concurrent/atomic/AtomicInteger;
    .local v15, "failed":Ljava/util/concurrent/atomic/AtomicInteger;
    .local v18, "doneBytes":Ljava/util/concurrent/atomic/AtomicLong;
    invoke-static/range {v10 .. v25}, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->invokeSuspend$emit$default(JLjava/lang/String;Ljava/util/List;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/atomic/AtomicInteger;JLjava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/ConcurrentLinkedQueue;Lcom/pymcl/core/download/DownloadManager;Lkotlin/jvm/functions/Function1;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 93
    move-object/from16 v21, v13

    move-object v15, v14

    move-object/from16 v14, v18

    .end local v13    # "list":Ljava/util/List;
    .end local v18    # "doneBytes":Ljava/util/concurrent/atomic/AtomicLong;
    .restart local v3    # "failed":Ljava/util/concurrent/atomic/AtomicInteger;
    .local v14, "doneBytes":Ljava/util/concurrent/atomic/AtomicLong;
    .local v15, "done":Ljava/util/concurrent/atomic/AtomicInteger;
    .restart local v21    # "list":Ljava/util/List;
    iget-object v4, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->this$0:Lcom/pymcl/core/download/DownloadManager;

    invoke-virtual {v4}, Lcom/pymcl/core/download/DownloadManager;->getThreads()I

    move-result v4

    const/16 v5, 0x40

    const/4 v6, 0x1

    invoke-static {v4, v6, v5}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v4

    const/4 v5, 0x0

    invoke-static {v4, v5, v8, v9}, Lkotlinx/coroutines/sync/SemaphoreKt;->Semaphore$default(IIILjava/lang/Object;)Lkotlinx/coroutines/sync/Semaphore;

    move-result-object v4

    .line 103
    .local v4, "sem":Lkotlinx/coroutines/sync/Semaphore;
    nop

    .line 94
    move-object/from16 v5, v21

    check-cast v5, Ljava/lang/Iterable;

    .local v5, "$this$map$iv":Ljava/lang/Iterable;
    iget-object v12, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->this$0:Lcom/pymcl/core/download/DownloadManager;

    iget-object v7, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->$name:Ljava/lang/String;

    iget-object v13, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->$onProgress:Lkotlin/jvm/functions/Function1;

    const/16 v26, 0x0

    .line 218
    .local v26, "$i$f$map":I
    new-instance v6, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v5, v8}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    move-object v8, v6

    check-cast v8, Ljava/util/Collection;

    .local v8, "destination$iv$iv":Ljava/util/Collection;
    move-object/from16 v27, v5

    .local v27, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/16 v28, 0x0

    .line 219
    .local v28, "$i$f$mapTo":I
    invoke-interface/range {v27 .. v27}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v29

    :goto_3
    invoke-interface/range {v29 .. v29}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface/range {v29 .. v29}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v30

    .line 220
    .local v30, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v24, v13

    move-object/from16 v13, v30

    check-cast v13, Lcom/pymcl/core/download/DownloadItem;

    .local v13, "item":Lcom/pymcl/core/download/DownloadItem;
    const/16 v31, 0x0

    .line 94
    .local v31, "$i$a$-map-DownloadManager$downloadAll$2$1":I
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v6

    check-cast v6, Lkotlin/coroutines/CoroutineContext;

    move-wide/from16 v22, v16

    move-object/from16 v17, v19

    move-wide/from16 v18, v10

    .end local v10    # "t0":J
    .end local v16    # "total":J
    .end local v19    # "errors":Ljava/util/concurrent/ConcurrentLinkedQueue;
    .local v17, "errors":Ljava/util/concurrent/ConcurrentLinkedQueue;
    .local v18, "t0":J
    .local v22, "total":J
    new-instance v10, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;

    const/16 v25, 0x0

    move-object/from16 v16, v3

    move-object v11, v4

    move-object/from16 v20, v7

    .end local v3    # "failed":Ljava/util/concurrent/atomic/AtomicInteger;
    .end local v4    # "sem":Lkotlinx/coroutines/sync/Semaphore;
    .local v11, "sem":Lkotlinx/coroutines/sync/Semaphore;
    .local v16, "failed":Ljava/util/concurrent/atomic/AtomicInteger;
    invoke-direct/range {v10 .. v25}, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;-><init>(Lkotlinx/coroutines/sync/Semaphore;Lcom/pymcl/core/download/DownloadManager;Lcom/pymcl/core/download/DownloadItem;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/ConcurrentLinkedQueue;JLjava/lang/String;Ljava/util/List;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    move-object v4, v10

    move-object v3, v15

    move-object/from16 v10, v17

    move-object/from16 v17, v12

    move-wide/from16 v32, v18

    move-object/from16 v19, v13

    move-object/from16 v18, v14

    move-wide/from16 v12, v32

    move-wide/from16 v14, v22

    .end local v13    # "item":Lcom/pymcl/core/download/DownloadItem;
    .end local v15    # "done":Ljava/util/concurrent/atomic/AtomicInteger;
    .end local v17    # "errors":Ljava/util/concurrent/ConcurrentLinkedQueue;
    .end local v22    # "total":J
    .local v3, "done":Ljava/util/concurrent/atomic/AtomicInteger;
    .local v10, "errors":Ljava/util/concurrent/ConcurrentLinkedQueue;
    .local v12, "t0":J
    .local v14, "total":J
    .local v18, "doneBytes":Ljava/util/concurrent/atomic/AtomicLong;
    .local v19, "item":Lcom/pymcl/core/download/DownloadItem;
    check-cast v4, Lkotlin/jvm/functions/Function2;

    move-object v7, v3

    move-object v3, v6

    .end local v3    # "done":Ljava/util/concurrent/atomic/AtomicInteger;
    .local v7, "done":Ljava/util/concurrent/atomic/AtomicInteger;
    const/4 v6, 0x2

    move-object/from16 v22, v7

    .end local v7    # "done":Ljava/util/concurrent/atomic/AtomicInteger;
    .local v22, "done":Ljava/util/concurrent/atomic/AtomicInteger;
    const/4 v7, 0x0

    move-object/from16 v23, v5

    move-object v5, v4

    .end local v5    # "$this$map$iv":Ljava/lang/Iterable;
    .local v23, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    move-object/from16 v9, v21

    move-object/from16 v32, v18

    move-object/from16 v18, v1

    move-object/from16 v1, v22

    move-wide/from16 v21, v12

    move-object/from16 v12, v16

    const/4 v13, 0x1

    move-object/from16 v16, v11

    move-object/from16 v11, v32

    .end local v18    # "doneBytes":Ljava/util/concurrent/atomic/AtomicLong;
    .end local v22    # "done":Ljava/util/concurrent/atomic/AtomicInteger;
    .local v1, "done":Ljava/util/concurrent/atomic/AtomicInteger;
    .local v9, "list":Ljava/util/List;
    .local v11, "doneBytes":Ljava/util/concurrent/atomic/AtomicLong;
    .local v12, "failed":Ljava/util/concurrent/atomic/AtomicInteger;
    .local v16, "sem":Lkotlinx/coroutines/sync/Semaphore;
    .local v21, "t0":J
    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object v3

    .line 103
    nop

    .line 220
    .end local v19    # "item":Lcom/pymcl/core/download/DownloadItem;
    .end local v31    # "$i$a$-map-DownloadManager$downloadAll$2$1":I
    invoke-interface {v8, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v19, v10

    move-object v3, v12

    move-object/from16 v4, v16

    move-object/from16 v12, v17

    move-object/from16 v7, v20

    move-object/from16 v5, v23

    move-object/from16 v13, v24

    move-wide/from16 v16, v14

    move-object v15, v1

    move-object v14, v11

    move-object/from16 v1, v18

    move-wide/from16 v10, v21

    move-object/from16 v21, v9

    const/4 v9, 0x0

    goto :goto_3

    .line 221
    .end local v1    # "done":Ljava/util/concurrent/atomic/AtomicInteger;
    .end local v9    # "list":Ljava/util/List;
    .end local v11    # "doneBytes":Ljava/util/concurrent/atomic/AtomicLong;
    .end local v12    # "failed":Ljava/util/concurrent/atomic/AtomicInteger;
    .end local v23    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v30    # "item$iv$iv":Ljava/lang/Object;
    .local v3, "failed":Ljava/util/concurrent/atomic/AtomicInteger;
    .restart local v4    # "sem":Lkotlinx/coroutines/sync/Semaphore;
    .restart local v5    # "$this$map$iv":Ljava/lang/Iterable;
    .local v10, "t0":J
    .local v14, "doneBytes":Ljava/util/concurrent/atomic/AtomicLong;
    .restart local v15    # "done":Ljava/util/concurrent/atomic/AtomicInteger;
    .local v16, "total":J
    .local v19, "errors":Ljava/util/concurrent/ConcurrentLinkedQueue;
    .local v21, "list":Ljava/util/List;
    :cond_4
    move-object/from16 v18, v1

    move-object v12, v3

    move-object/from16 v23, v5

    move-object v1, v15

    move-object/from16 v9, v21

    const/4 v13, 0x1

    move-wide/from16 v21, v10

    move-object v11, v14

    move-wide/from16 v14, v16

    move-object/from16 v10, v19

    move-object/from16 v16, v4

    .end local v3    # "failed":Ljava/util/concurrent/atomic/AtomicInteger;
    .end local v4    # "sem":Lkotlinx/coroutines/sync/Semaphore;
    .end local v5    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v8    # "destination$iv$iv":Ljava/util/Collection;
    .end local v15    # "done":Ljava/util/concurrent/atomic/AtomicInteger;
    .end local v19    # "errors":Ljava/util/concurrent/ConcurrentLinkedQueue;
    .end local v27    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v28    # "$i$f$mapTo":I
    .restart local v1    # "done":Ljava/util/concurrent/atomic/AtomicInteger;
    .restart local v9    # "list":Ljava/util/List;
    .local v10, "errors":Ljava/util/concurrent/ConcurrentLinkedQueue;
    .restart local v11    # "doneBytes":Ljava/util/concurrent/atomic/AtomicLong;
    .restart local v12    # "failed":Ljava/util/concurrent/atomic/AtomicInteger;
    .local v14, "total":J
    .local v16, "sem":Lkotlinx/coroutines/sync/Semaphore;
    .local v21, "t0":J
    .restart local v23    # "$this$map$iv":Ljava/lang/Iterable;
    move-object v3, v8

    check-cast v3, Ljava/util/List;

    .line 218
    nop

    .end local v23    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v26    # "$i$f$map":I
    check-cast v3, Ljava/util/Collection;

    move-object v4, v0

    check-cast v4, Lkotlin/coroutines/Continuation;

    .line 103
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->L$0:Ljava/lang/Object;

    iput-object v9, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->L$1:Ljava/lang/Object;

    iput-object v11, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->L$2:Ljava/lang/Object;

    iput-object v1, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->L$3:Ljava/lang/Object;

    iput-object v12, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->L$4:Ljava/lang/Object;

    iput-object v10, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->L$5:Ljava/lang/Object;

    invoke-static/range {v16 .. v16}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->L$6:Ljava/lang/Object;

    iput-wide v14, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->J$0:J

    move-wide/from16 v5, v21

    .end local v21    # "t0":J
    .local v5, "t0":J
    iput-wide v5, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->J$1:J

    iput v13, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->label:I

    invoke-static {v3, v4}, Lkotlinx/coroutines/AwaitKt;->joinAll(Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v4, v18

    if-ne v3, v4, :cond_5

    .line 81
    return-object v4

    .line 103
    :cond_5
    move-object v7, v1

    move-wide v3, v5

    move-object v6, v9

    move-object v8, v12

    move-object/from16 v1, v16

    move-object v12, v10

    move-wide v9, v14

    .line 104
    .end local v5    # "t0":J
    .end local v10    # "errors":Ljava/util/concurrent/ConcurrentLinkedQueue;
    .end local v14    # "total":J
    .end local v16    # "sem":Lkotlinx/coroutines/sync/Semaphore;
    .local v1, "sem":Lkotlinx/coroutines/sync/Semaphore;
    .local v3, "t0":J
    .local v6, "list":Ljava/util/List;
    .restart local v7    # "done":Ljava/util/concurrent/atomic/AtomicInteger;
    .local v8, "failed":Ljava/util/concurrent/atomic/AtomicInteger;
    .local v9, "total":J
    .local v12, "errors":Ljava/util/concurrent/ConcurrentLinkedQueue;
    :goto_4
    iget-object v5, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->$name:Ljava/lang/String;

    iget-object v13, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->this$0:Lcom/pymcl/core/download/DownloadManager;

    iget-object v14, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->$onProgress:Lkotlin/jvm/functions/Function1;

    const/16 v17, 0x400

    const/16 v18, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x1

    invoke-static/range {v3 .. v18}, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->invokeSuspend$emit$default(JLjava/lang/String;Ljava/util/List;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/atomic/AtomicInteger;JLjava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/ConcurrentLinkedQueue;Lcom/pymcl/core/download/DownloadManager;Lkotlin/jvm/functions/Function1;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 105
    move-object v5, v12

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_6

    .line 106
    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v5

    .line 105
    :cond_6
    new-instance v5, Lcom/pymcl/core/download/DownloadError;

    invoke-virtual {v12}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    move-result v13

    move-object v14, v12

    check-cast v14, Ljava/lang/Iterable;

    const/4 v15, 0x5

    invoke-static {v14, v15}, Lkotlin/collections/CollectionsKt;->take(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v14

    move-object v15, v14

    check-cast v15, Ljava/lang/Iterable;

    const-string v14, "; "

    move-object/from16 v16, v14

    check-cast v16, Ljava/lang/CharSequence;

    const/16 v22, 0x3e

    const/16 v23, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v15 .. v23}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v13

    const-string v15, " \u4e2a\u6587\u4ef6\u4e0b\u8f7d\u5931\u8d25\uff1a"

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    const/4 v14, 0x2

    const/4 v15, 0x0

    invoke-direct {v5, v13, v15, v14, v15}, Lcom/pymcl/core/download/DownloadError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v5

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
