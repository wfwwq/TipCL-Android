.class final Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "DownloadManager.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    value = "SMAP\nDownloadManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DownloadManager.kt\ncom/pymcl/core/download/DownloadManager$downloadAll$2$1$1\n+ 2 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreKt\n*L\n1#1,208:1\n81#2,6:209\n*S KotlinDebug\n*F\n+ 1 DownloadManager.kt\ncom/pymcl/core/download/DownloadManager$downloadAll$2$1$1\n*L\n94#1:209,6\n*E\n"
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
    c = "com.pymcl.core.download.DownloadManager$downloadAll$2$1$1"
    f = "DownloadManager.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0xd1
    }
    m = "invokeSuspend"
    n = {
        "$this$launch",
        "$this$withPermit$iv"
    }
    nl = {
        0xd2
    }
    s = {
        "L$0",
        "L$1"
    }
    v = 0x2
.end annotation


# instance fields
.field final synthetic $done:Ljava/util/concurrent/atomic/AtomicInteger;

.field final synthetic $doneBytes:Ljava/util/concurrent/atomic/AtomicLong;

.field final synthetic $errors:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $failed:Ljava/util/concurrent/atomic/AtomicInteger;

.field final synthetic $item:Lcom/pymcl/core/download/DownloadItem;

.field final synthetic $list:Ljava/util/List;
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

.field final synthetic $sem:Lkotlinx/coroutines/sync/Semaphore;

.field final synthetic $t0:J

.field final synthetic $total:J

.field J$0:J

.field J$1:J

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$10:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field L$7:Ljava/lang/Object;

.field L$8:Ljava/lang/Object;

.field L$9:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/pymcl/core/download/DownloadManager;


# direct methods
.method public static synthetic $r8$lambda$-4W_myKVicRc2Zr-OJNgsIFtsJo(Ljava/util/concurrent/atomic/AtomicLong;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->invokeSuspend$lambda$0$0(Ljava/util/concurrent/atomic/AtomicLong;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$eLKZdLFvmldnS4iPikdZDTDk9Og(Lkotlinx/coroutines/Job;)Z
    .locals 0

    invoke-static {p0}, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->invokeSuspend$lambda$0$1(Lkotlinx/coroutines/Job;)Z

    move-result p0

    return p0
.end method

.method constructor <init>(Lkotlinx/coroutines/sync/Semaphore;Lcom/pymcl/core/download/DownloadManager;Lcom/pymcl/core/download/DownloadItem;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/ConcurrentLinkedQueue;JLjava/lang/String;Ljava/util/List;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/sync/Semaphore;",
            "Lcom/pymcl/core/download/DownloadManager;",
            "Lcom/pymcl/core/download/DownloadItem;",
            "Ljava/util/concurrent/atomic/AtomicLong;",
            "Ljava/util/concurrent/atomic/AtomicInteger;",
            "Ljava/util/concurrent/atomic/AtomicInteger;",
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Ljava/lang/String;",
            ">;J",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/pymcl/core/download/DownloadItem;",
            ">;J",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/pymcl/core/download/DownloadProgress;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iput-object v1, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->$sem:Lkotlinx/coroutines/sync/Semaphore;

    move-object/from16 v2, p2

    iput-object v2, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->this$0:Lcom/pymcl/core/download/DownloadManager;

    move-object/from16 v3, p3

    iput-object v3, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->$item:Lcom/pymcl/core/download/DownloadItem;

    move-object/from16 v4, p4

    iput-object v4, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->$doneBytes:Ljava/util/concurrent/atomic/AtomicLong;

    move-object/from16 v5, p5

    iput-object v5, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->$done:Ljava/util/concurrent/atomic/AtomicInteger;

    move-object/from16 v6, p6

    iput-object v6, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->$failed:Ljava/util/concurrent/atomic/AtomicInteger;

    move-object/from16 v7, p7

    iput-object v7, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->$errors:Ljava/util/concurrent/ConcurrentLinkedQueue;

    move-wide/from16 v8, p8

    iput-wide v8, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->$t0:J

    move-object/from16 v10, p10

    iput-object v10, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->$name:Ljava/lang/String;

    move-object/from16 v11, p11

    iput-object v11, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->$list:Ljava/util/List;

    move-wide/from16 v12, p12

    iput-wide v12, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->$total:J

    move-object/from16 v14, p14

    iput-object v14, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->$onProgress:Lkotlin/jvm/functions/Function1;

    const/4 v15, 0x2

    move-object/from16 v1, p15

    invoke-direct {v0, v15, v1}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method private static final invokeSuspend$lambda$0$0(Ljava/util/concurrent/atomic/AtomicLong;I)Lkotlin/Unit;
    .locals 2
    .param p0, "$doneBytes"    # Ljava/util/concurrent/atomic/AtomicLong;
    .param p1, "n"    # I

    .line 99
    int-to-long v0, p1

    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final invokeSuspend$lambda$0$1(Lkotlinx/coroutines/Job;)Z
    .locals 1
    .param p0, "$job"    # Lkotlinx/coroutines/Job;

    .line 99
    invoke-interface {p0}, Lkotlinx/coroutines/Job;->isActive()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 17
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

    move-object/from16 v0, p0

    new-instance v1, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;

    iget-object v2, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->$sem:Lkotlinx/coroutines/sync/Semaphore;

    iget-object v3, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->this$0:Lcom/pymcl/core/download/DownloadManager;

    iget-object v4, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->$item:Lcom/pymcl/core/download/DownloadItem;

    iget-object v5, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->$doneBytes:Ljava/util/concurrent/atomic/AtomicLong;

    iget-object v6, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->$done:Ljava/util/concurrent/atomic/AtomicInteger;

    iget-object v7, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->$failed:Ljava/util/concurrent/atomic/AtomicInteger;

    iget-object v8, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->$errors:Ljava/util/concurrent/ConcurrentLinkedQueue;

    iget-wide v9, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->$t0:J

    iget-object v11, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->$name:Ljava/lang/String;

    iget-object v12, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->$list:Ljava/util/List;

    iget-wide v13, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->$total:J

    iget-object v15, v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->$onProgress:Lkotlin/jvm/functions/Function1;

    move-object/from16 v16, p2

    invoke-direct/range {v1 .. v16}, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;-><init>(Lkotlinx/coroutines/sync/Semaphore;Lcom/pymcl/core/download/DownloadManager;Lcom/pymcl/core/download/DownloadItem;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/ConcurrentLinkedQueue;JLjava/lang/String;Ljava/util/List;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    move-object v2, v1

    move-object/from16 v1, p1

    iput-object v1, v2, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lkotlin/coroutines/Continuation;

    return-object v2
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 35
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v1, p0

    iget-object v0, v1, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->L$0:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlinx/coroutines/CoroutineScope;

    .local v2, "$this$launch":Lkotlinx/coroutines/CoroutineScope;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 94
    iget v3, v1, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->label:I

    packed-switch v3, :pswitch_data_0

    move-object/from16 v16, v2

    .end local v2    # "$this$launch":Lkotlinx/coroutines/CoroutineScope;
    .local v16, "$this$launch":Lkotlinx/coroutines/CoroutineScope;
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .end local v16    # "$this$launch":Lkotlinx/coroutines/CoroutineScope;
    .restart local v2    # "$this$launch":Lkotlinx/coroutines/CoroutineScope;
    :pswitch_0
    const/4 v0, 0x0

    .local v0, "$i$f$withPermit":I
    iget-wide v3, v1, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->J$1:J

    iget-wide v5, v1, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->J$0:J

    iget-object v7, v1, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->L$10:Ljava/lang/Object;

    check-cast v7, Lkotlin/jvm/functions/Function1;

    iget-object v8, v1, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->L$9:Ljava/lang/Object;

    check-cast v8, Ljava/util/List;

    iget-object v9, v1, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->L$8:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v10, v1, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->L$7:Ljava/lang/Object;

    check-cast v10, Ljava/util/concurrent/ConcurrentLinkedQueue;

    iget-object v11, v1, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->L$6:Ljava/lang/Object;

    check-cast v11, Ljava/util/concurrent/atomic/AtomicInteger;

    iget-object v12, v1, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->L$5:Ljava/lang/Object;

    check-cast v12, Ljava/util/concurrent/atomic/AtomicInteger;

    iget-object v13, v1, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->L$4:Ljava/lang/Object;

    check-cast v13, Ljava/util/concurrent/atomic/AtomicLong;

    iget-object v14, v1, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->L$3:Ljava/lang/Object;

    check-cast v14, Lcom/pymcl/core/download/DownloadItem;

    iget-object v15, v1, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->L$2:Ljava/lang/Object;

    check-cast v15, Lcom/pymcl/core/download/DownloadManager;

    move/from16 v16, v0

    .end local v0    # "$i$f$withPermit":I
    .local v16, "$i$f$withPermit":I
    iget-object v0, v1, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lkotlinx/coroutines/sync/Semaphore;

    .local v0, "$this$withPermit$iv":Lkotlinx/coroutines/sync/Semaphore;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-wide/from16 v25, v3

    move-wide/from16 v19, v5

    move-object/from16 v30, v7

    move-object/from16 v22, v8

    move/from16 v18, v16

    move-object v3, v0

    move-object/from16 v16, v2

    move-object/from16 v21, v9

    move-object/from16 v24, v11

    move-object/from16 v23, v12

    goto :goto_0

    .end local v0    # "$this$withPermit$iv":Lkotlinx/coroutines/sync/Semaphore;
    .end local v16    # "$i$f$withPermit":I
    :pswitch_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v3, v1, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->$sem:Lkotlinx/coroutines/sync/Semaphore;

    .local v3, "$this$withPermit$iv":Lkotlinx/coroutines/sync/Semaphore;
    iget-object v15, v1, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->this$0:Lcom/pymcl/core/download/DownloadManager;

    iget-object v14, v1, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->$item:Lcom/pymcl/core/download/DownloadItem;

    iget-object v13, v1, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->$doneBytes:Ljava/util/concurrent/atomic/AtomicLong;

    iget-object v12, v1, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->$done:Ljava/util/concurrent/atomic/AtomicInteger;

    iget-object v11, v1, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->$failed:Ljava/util/concurrent/atomic/AtomicInteger;

    iget-object v10, v1, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->$errors:Ljava/util/concurrent/ConcurrentLinkedQueue;

    iget-wide v5, v1, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->$t0:J

    iget-object v9, v1, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->$name:Ljava/lang/String;

    iget-object v8, v1, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->$list:Ljava/util/List;

    move-wide/from16 v16, v5

    iget-wide v4, v1, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->$total:J

    iget-object v7, v1, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->$onProgress:Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x0

    .line 209
    .local v6, "$i$f$withPermit":I
    move/from16 v18, v6

    .end local v6    # "$i$f$withPermit":I
    .local v18, "$i$f$withPermit":I
    move-object v6, v1

    check-cast v6, Lkotlin/coroutines/Continuation;

    iput-object v2, v1, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->L$0:Ljava/lang/Object;

    iput-object v3, v1, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->L$1:Ljava/lang/Object;

    iput-object v15, v1, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->L$2:Ljava/lang/Object;

    iput-object v14, v1, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->L$3:Ljava/lang/Object;

    iput-object v13, v1, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->L$4:Ljava/lang/Object;

    iput-object v12, v1, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->L$5:Ljava/lang/Object;

    iput-object v11, v1, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->L$6:Ljava/lang/Object;

    iput-object v10, v1, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->L$7:Ljava/lang/Object;

    iput-object v9, v1, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->L$8:Ljava/lang/Object;

    iput-object v8, v1, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->L$9:Ljava/lang/Object;

    iput-object v7, v1, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->L$10:Ljava/lang/Object;

    move-object/from16 v20, v7

    move-object/from16 v19, v8

    move-wide/from16 v7, v16

    iput-wide v7, v1, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->J$0:J

    iput-wide v4, v1, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->J$1:J

    move-object/from16 v16, v2

    .end local v2    # "$this$launch":Lkotlinx/coroutines/CoroutineScope;
    .local v16, "$this$launch":Lkotlinx/coroutines/CoroutineScope;
    const/4 v2, 0x1

    iput v2, v1, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->label:I

    invoke-interface {v3, v6}, Lkotlinx/coroutines/sync/Semaphore;->acquire(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_0

    .line 94
    return-object v0

    .line 209
    :cond_0
    move-wide/from16 v25, v4

    move-object/from16 v22, v19

    move-object/from16 v30, v20

    move-wide/from16 v19, v7

    move-object/from16 v21, v9

    move-object/from16 v24, v11

    move-object/from16 v23, v12

    .line 210
    :goto_0
    nop

    .line 211
    const/4 v2, 0x0

    .line 96
    .local v2, "$i$a$-withPermit-DownloadManager$downloadAll$2$1$1$1":I
    :try_start_0
    invoke-interface/range {v16 .. v16}, Lkotlinx/coroutines/CoroutineScope;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    invoke-static {v0}, Lkotlinx/coroutines/JobKt;->getJob(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/Job;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v4, v0

    .line 97
    .local v4, "job":Lkotlinx/coroutines/Job;
    nop

    .line 98
    :try_start_1
    invoke-virtual {v15, v14}, Lcom/pymcl/core/download/DownloadManager;->isValid(Lcom/pymcl/core/download/DownloadItem;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v14}, Lcom/pymcl/core/download/DownloadItem;->getSize()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    goto :goto_1

    :cond_1
    invoke-virtual {v14}, Lcom/pymcl/core/download/DownloadItem;->getDest()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v5

    :goto_1
    invoke-virtual {v13, v5, v6}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    move-result-wide v5

    invoke-static {v5, v6}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    goto :goto_2

    .line 99
    :cond_2
    new-instance v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1$$ExternalSyntheticLambda0;

    invoke-direct {v0, v13}, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1$$ExternalSyntheticLambda0;-><init>(Ljava/util/concurrent/atomic/AtomicLong;)V

    new-instance v5, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1$$ExternalSyntheticLambda1;

    invoke-direct {v5, v4}, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1$$ExternalSyntheticLambda1;-><init>(Lkotlinx/coroutines/Job;)V

    invoke-virtual {v15, v14, v0, v5}, Lcom/pymcl/core/download/DownloadManager;->download(Lcom/pymcl/core/download/DownloadItem;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    .line 100
    :goto_2
    invoke-virtual/range {v23 .. v23}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    .line 101
    :catch_0
    move-exception v0

    .local v0, "e":Ljava/lang/Exception;
    :try_start_2
    invoke-virtual/range {v24 .. v24}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    invoke-virtual {v14}, Lcom/pymcl/core/download/DownloadItem;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v7, ": "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v10, v5}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 102
    .end local v0    # "e":Ljava/lang/Exception;
    :goto_3
    invoke-virtual {v14}, Lcom/pymcl/core/download/DownloadItem;->getName()Ljava/lang/String;

    move-result-object v31

    const/16 v33, 0x800

    const/16 v34, 0x0

    const/16 v32, 0x0

    move-object/from16 v28, v10

    move-object/from16 v27, v13

    move-object/from16 v29, v15

    invoke-static/range {v19 .. v34}, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;->invokeSuspend$emit$default(JLjava/lang/String;Ljava/util/List;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/atomic/AtomicInteger;JLjava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/ConcurrentLinkedQueue;Lcom/pymcl/core/download/DownloadManager;Lkotlin/jvm/functions/Function1;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 103
    nop

    .end local v2    # "$i$a$-withPermit-DownloadManager$downloadAll$2$1$1$1":I
    .end local v4    # "job":Lkotlinx/coroutines/Job;
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 211
    nop

    .line 213
    invoke-interface {v3}, Lkotlinx/coroutines/sync/Semaphore;->release()V

    .line 214
    nop

    .line 210
    nop

    .line 103
    .end local v3    # "$this$withPermit$iv":Lkotlinx/coroutines/sync/Semaphore;
    .end local v18    # "$i$f$withPermit":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 101
    .restart local v2    # "$i$a$-withPermit-DownloadManager$downloadAll$2$1$1$1":I
    .restart local v3    # "$this$withPermit$iv":Lkotlinx/coroutines/sync/Semaphore;
    .restart local v4    # "job":Lkotlinx/coroutines/Job;
    .restart local v18    # "$i$f$withPermit":I
    :catch_1
    move-exception v0

    .end local v3    # "$this$withPermit$iv":Lkotlinx/coroutines/sync/Semaphore;
    .end local v16    # "$this$launch":Lkotlinx/coroutines/CoroutineScope;
    .end local v18    # "$i$f$withPermit":I
    .end local p1    # "$result":Ljava/lang/Object;
    .local v0, "e":Ljava/util/concurrent/CancellationException;
    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 213
    .end local v0    # "e":Ljava/util/concurrent/CancellationException;
    .end local v2    # "$i$a$-withPermit-DownloadManager$downloadAll$2$1$1$1":I
    .end local v4    # "job":Lkotlinx/coroutines/Job;
    .restart local v3    # "$this$withPermit$iv":Lkotlinx/coroutines/sync/Semaphore;
    .restart local v16    # "$this$launch":Lkotlinx/coroutines/CoroutineScope;
    .restart local v18    # "$i$f$withPermit":I
    .restart local p1    # "$result":Ljava/lang/Object;
    :catchall_0
    move-exception v0

    invoke-interface {v3}, Lkotlinx/coroutines/sync/Semaphore;->release()V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
