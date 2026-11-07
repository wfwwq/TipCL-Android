.class final Lcom/pymcl/android/data/RepositoryUiApi$collectGameExit$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "RepositoryUiApi.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/data/RepositoryUiApi;->collectGameExit(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lcom/pymcl/android/ui/state/GameExitInfo;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRepositoryUiApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepositoryUiApi.kt\ncom/pymcl/android/data/RepositoryUiApi$collectGameExit$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,494:1\n1#2:495\n1739#3:496\n1814#3,3:497\n*S KotlinDebug\n*F\n+ 1 RepositoryUiApi.kt\ncom/pymcl/android/data/RepositoryUiApi$collectGameExit$2\n*L\n361#1:496\n361#1:497,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/pymcl/android/ui/state/GameExitInfo;"
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
    c = "com.pymcl.android.data.RepositoryUiApi$collectGameExit$2"
    f = "RepositoryUiApi.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    nl = {}
    s = {}
    v = 0x2
.end annotation


# instance fields
.field final synthetic $userStopped:Z

.field label:I

.field final synthetic this$0:Lcom/pymcl/android/data/RepositoryUiApi;


# direct methods
.method public static synthetic $r8$lambda$nuwTCg2BhZdf9Cxxk_kXVAPZzLY(Lcom/pymcl/core/crash/CrashReason;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/android/data/RepositoryUiApi$collectGameExit$2;->invokeSuspend$lambda$3$4(Lcom/pymcl/core/crash/CrashReason;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/pymcl/android/data/RepositoryUiApi;ZLkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/data/RepositoryUiApi;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/data/RepositoryUiApi$collectGameExit$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/data/RepositoryUiApi$collectGameExit$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    iput-boolean p2, p0, Lcom/pymcl/android/data/RepositoryUiApi$collectGameExit$2;->$userStopped:Z

    const/4 v0, 0x1

    invoke-direct {p0, v0, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method private static final invokeSuspend$lambda$3$4(Lcom/pymcl/core/crash/CrashReason;)Ljava/lang/CharSequence;
    .locals 1
    .param p0, "it"    # Lcom/pymcl/core/crash/CrashReason;

    .line 370
    invoke-virtual {p0}, Lcom/pymcl/core/crash/CrashReason;->getTitle()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    return-object v0
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$collectGameExit$2;

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$collectGameExit$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    iget-boolean v2, p0, Lcom/pymcl/android/data/RepositoryUiApi$collectGameExit$2;->$userStopped:Z

    invoke-direct {v0, v1, v2, p1}, Lcom/pymcl/android/data/RepositoryUiApi$collectGameExit$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;ZLkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi$collectGameExit$2;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/state/GameExitInfo;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi$collectGameExit$2;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/data/RepositoryUiApi$collectGameExit$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/RepositoryUiApi$collectGameExit$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 38
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v1, p0

    const-string v2, "\n"

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 352
    iget v0, v1, Lcom/pymcl/android/data/RepositoryUiApi$collectGameExit$2;->label:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 353
    sget-object v0, Lcom/pymcl/runtime/GameSession;->Companion:Lcom/pymcl/runtime/GameSession$Companion;

    iget-object v3, v1, Lcom/pymcl/android/data/RepositoryUiApi$collectGameExit$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    invoke-virtual {v3}, Lcom/pymcl/android/data/RepositoryUiApi;->getCtx$PyMCL_Android_app_debug()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/pymcl/runtime/GameSession$Companion;->of(Landroid/content/Context;)Lcom/pymcl/runtime/GameSession;

    move-result-object v3

    .line 354
    .local v3, "session":Lcom/pymcl/runtime/GameSession;
    invoke-virtual {v3}, Lcom/pymcl/runtime/GameSession;->read()Lcom/pymcl/runtime/GameSession$Info;

    move-result-object v0

    const/4 v4, 0x0

    if-nez v0, :cond_0

    return-object v4

    :cond_0
    move-object v5, v0

    .line 355
    .local v5, "info":Lcom/pymcl/runtime/GameSession$Info;
    invoke-virtual {v3}, Lcom/pymcl/runtime/GameSession;->consume()V

    .line 356
    const-wide/16 v6, 0x0

    const/4 v8, 0x1

    invoke-static {v5, v6, v7, v8, v4}, Lcom/pymcl/runtime/GameSession$Info;->durationSec$default(Lcom/pymcl/runtime/GameSession$Info;JILjava/lang/Object;)J

    move-result-wide v14

    .line 357
    .local v14, "dur":J
    iget-object v0, v1, Lcom/pymcl/android/data/RepositoryUiApi$collectGameExit$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    :try_start_0
    sget-object v9, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 495
    .local v0, "$this$invokeSuspend_u24lambda_u240\\1":Lcom/pymcl/android/data/RepositoryUiApi;
    const/4 v9, 0x0

    .line 357
    .local v9, "$i$a$-runCatching-RepositoryUiApi$collectGameExit$2$inst$1\\1\\357\\0":I
    invoke-static {v0}, Lcom/pymcl/android/data/RepositoryUiApi;->access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApi;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v10

    invoke-virtual {v10}, Lcom/pymcl/android/data/LauncherRepository;->getInstances()Lcom/pymcl/core/instance/InstanceManager;

    move-result-object v10

    invoke-virtual {v5}, Lcom/pymcl/runtime/GameSession$Info;->getInstance()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Lcom/pymcl/core/instance/InstanceManager;->get(Ljava/lang/String;)Lcom/pymcl/core/instance/Instance;

    move-result-object v10

    .end local v0    # "$this$invokeSuspend_u24lambda_u240\\1":Lcom/pymcl/android/data/RepositoryUiApi;
    .end local v9    # "$i$a$-runCatching-RepositoryUiApi$collectGameExit$2$inst$1\\1\\357\\0":I
    invoke-static {v10}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v9, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    move-object v0, v4

    :cond_1
    move-object v10, v0

    check-cast v10, Lcom/pymcl/core/instance/Instance;

    .line 358
    .local v10, "inst":Lcom/pymcl/core/instance/Instance;
    if-eqz v10, :cond_2

    cmp-long v0, v14, v6

    if-lez v0, :cond_2

    iget-object v0, v1, Lcom/pymcl/android/data/RepositoryUiApi$collectGameExit$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    :try_start_1
    sget-object v6, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 495
    .local v0, "$this$invokeSuspend_u24lambda_u241\\2":Lcom/pymcl/android/data/RepositoryUiApi;
    const/4 v6, 0x0

    .line 358
    .local v6, "$i$a$-runCatching-RepositoryUiApi$collectGameExit$2$1\\2\\358\\0":I
    invoke-static {v0}, Lcom/pymcl/android/data/RepositoryUiApi;->access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApi;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v9

    invoke-virtual {v5}, Lcom/pymcl/runtime/GameSession$Info;->getVersion()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v5}, Lcom/pymcl/runtime/GameSession$Info;->getStartMs()J

    move-result-wide v12
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    const/16 v7, 0x3e8

    move/from16 v16, v8

    move-object/from16 v17, v9

    int-to-long v8, v7

    :try_start_2
    div-long/2addr v12, v8

    move-object/from16 v9, v17

    invoke-virtual/range {v9 .. v15}, Lcom/pymcl/android/data/LauncherRepository;->recordPlaytime(Lcom/pymcl/core/instance/Instance;Ljava/lang/String;JJ)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-object v7, v10

    .end local v0    # "$this$invokeSuspend_u24lambda_u241\\2":Lcom/pymcl/android/data/RepositoryUiApi;
    .end local v6    # "$i$a$-runCatching-RepositoryUiApi$collectGameExit$2$1\\2\\358\\0":I
    .end local v10    # "inst":Lcom/pymcl/core/instance/Instance;
    .local v7, "inst":Lcom/pymcl/core/instance/Instance;
    :try_start_3
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    goto :goto_2

    .end local v7    # "inst":Lcom/pymcl/core/instance/Instance;
    .restart local v10    # "inst":Lcom/pymcl/core/instance/Instance;
    :catchall_2
    move-exception v0

    goto :goto_1

    :catchall_3
    move-exception v0

    move/from16 v16, v8

    :goto_1
    move-object v7, v10

    .end local v10    # "inst":Lcom/pymcl/core/instance/Instance;
    .restart local v7    # "inst":Lcom/pymcl/core/instance/Instance;
    :goto_2
    sget-object v6, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_3
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 495
    .local v0, "it\\4":Ljava/lang/Throwable;
    const/4 v6, 0x0

    .line 358
    .local v6, "$i$a$-onFailure-RepositoryUiApi$collectGameExit$2$2\\4\\358\\0":I
    const-string v8, "PyMCL"

    const-string v9, "playtime"

    invoke-static {v8, v9, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .end local v0    # "it\\4":Ljava/lang/Throwable;
    .end local v6    # "$i$a$-onFailure-RepositoryUiApi$collectGameExit$2$2\\4\\358\\0":I
    goto :goto_4

    .end local v7    # "inst":Lcom/pymcl/core/instance/Instance;
    .restart local v10    # "inst":Lcom/pymcl/core/instance/Instance;
    :cond_2
    move/from16 v16, v8

    move-object v7, v10

    .line 359
    .end local v10    # "inst":Lcom/pymcl/core/instance/Instance;
    .restart local v7    # "inst":Lcom/pymcl/core/instance/Instance;
    :cond_3
    :goto_4
    iget-boolean v0, v1, Lcom/pymcl/android/data/RepositoryUiApi$collectGameExit$2;->$userStopped:Z

    const/4 v8, 0x0

    if-nez v0, :cond_5

    invoke-virtual {v5}, Lcom/pymcl/runtime/GameSession$Info;->getExitCode()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_5

    :cond_4
    const/4 v0, -0x1

    :goto_5
    if-eqz v0, :cond_5

    move/from16 v0, v16

    goto :goto_6

    :cond_5
    move v0, v8

    :goto_6
    move/from16 v17, v0

    .line 360
    .local v17, "crashed":Z
    if-nez v17, :cond_6

    goto/16 :goto_13

    :cond_6
    iget-object v0, v1, Lcom/pymcl/android/data/RepositoryUiApi$collectGameExit$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    :try_start_4
    sget-object v9, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v9, v0

    .local v9, "$this$invokeSuspend_u24lambda_u243\\5":Lcom/pymcl/android/data/RepositoryUiApi;
    const/4 v10, 0x0

    .line 361
    .local v10, "$i$a$-runCatching-RepositoryUiApi$collectGameExit$2$crash$1\\5\\360\\0":I
    const/16 v0, 0x190

    const/4 v11, 0x2

    invoke-static {v3, v0, v8, v11, v4}, Lcom/pymcl/runtime/GameSession;->logTail$default(Lcom/pymcl/runtime/GameSession;IIILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$map\\6":Ljava/lang/Iterable;
    const/4 v12, 0x0

    .line 496
    .local v12, "$i$f$map\\6\\361":I
    new-instance v13, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v0, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v13, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v13, Ljava/util/Collection;

    .local v13, "destination\\7":Ljava/util/Collection;
    move-object v4, v0

    .local v4, "$this$mapTo\\7":Ljava/lang/Iterable;
    const/16 v18, 0x0

    .line 497
    .local v18, "$i$f$mapTo\\7\\496":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_7
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_7

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v20

    .line 498
    .local v20, "item\\7":Ljava/lang/Object;
    move-object/from16 v21, v20

    check-cast v21, Ljava/lang/String;

    move-object/from16 v22, v21

    .local v22, "it\\8":Ljava/lang/String;
    const/16 v21, 0x0

    .line 361
    .local v21, "$i$a$-map-RepositoryUiApi$collectGameExit$2$crash$1$tail$1\\8\\498\\5":I
    sget-object v6, Lcom/pymcl/core/crash/CrashAnalyzer;->INSTANCE:Lcom/pymcl/core/crash/CrashAnalyzer;

    move/from16 v23, v8

    move-object/from16 v8, v22

    .end local v22    # "it\\8":Ljava/lang/String;
    .local v8, "it\\8":Ljava/lang/String;
    invoke-virtual {v6, v8}, Lcom/pymcl/core/crash/CrashAnalyzer;->filterSecrets(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 498
    .end local v8    # "it\\8":Ljava/lang/String;
    .end local v21    # "$i$a$-map-RepositoryUiApi$collectGameExit$2$crash$1$tail$1\\8\\498\\5":I
    invoke-interface {v13, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move/from16 v8, v23

    goto :goto_7

    .line 499
    .end local v20    # "item\\7":Ljava/lang/Object;
    :cond_7
    move/from16 v23, v8

    .end local v4    # "$this$mapTo\\7":Ljava/lang/Iterable;
    .end local v13    # "destination\\7":Ljava/util/Collection;
    .end local v18    # "$i$f$mapTo\\7\\496":I
    move-object v4, v13

    check-cast v4, Ljava/util/List;

    .line 496
    nop

    .line 361
    .end local v0    # "$this$map\\6":Ljava/lang/Iterable;
    .end local v12    # "$i$f$map\\6\\361":I
    nop

    .line 362
    .local v4, "tail\\5":Ljava/util/List;
    invoke-virtual {v5}, Lcom/pymcl/runtime/GameSession$Info;->getExitCode()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_8

    :cond_8
    const/4 v0, -0x1

    :goto_8
    move v6, v0

    .line 363
    .local v6, "code\\5":I
    invoke-static {v9}, Lcom/pymcl/android/data/RepositoryUiApi;->access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApi;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v0

    new-instance v8, Ljava/io/File;

    invoke-virtual {v5}, Lcom/pymcl/runtime/GameSession$Info;->getGameDir()Ljava/lang/String;

    move-result-object v12

    invoke-direct {v8, v12}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    move-object/from16 v24, v4

    check-cast v24, Ljava/lang/Iterable;

    move-object/from16 v25, v2

    check-cast v25, Ljava/lang/CharSequence;

    const/16 v31, 0x3e

    const/16 v32, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-static/range {v24 .. v32}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0, v8, v6, v12}, Lcom/pymcl/android/data/LauncherRepository;->analyzeCrash(Ljava/io/File;ILjava/lang/String;)Ljava/util/List;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_6

    move-object v8, v0

    .line 365
    .local v8, "reasons\\5":Ljava/util/List;
    if-eqz v7, :cond_9

    :try_start_5
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, v9

    .line 495
    .local v0, "$this$invokeSuspend_u24lambda_u243_u241\\9":Lcom/pymcl/android/data/RepositoryUiApi;
    const/4 v12, 0x0

    .line 365
    .local v12, "$i$a$-runCatching-RepositoryUiApi$collectGameExit$2$crash$1$1\\9\\365\\5":I
    invoke-static {v0}, Lcom/pymcl/android/data/RepositoryUiApi;->access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApi;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v13

    invoke-virtual {v13}, Lcom/pymcl/android/data/LauncherRepository;->getGame()Lcom/pymcl/core/version/GameInstaller;

    move-result-object v13
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    move/from16 v18, v11

    :try_start_6
    invoke-static {v0}, Lcom/pymcl/android/data/RepositoryUiApi;->access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApi;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v11

    invoke-virtual {v11, v7}, Lcom/pymcl/android/data/LauncherRepository;->dirsFor(Lcom/pymcl/core/instance/Instance;)Lcom/pymcl/core/version/GameDirs;

    move-result-object v11

    move-object/from16 v19, v0

    .end local v0    # "$this$invokeSuspend_u24lambda_u243_u241\\9":Lcom/pymcl/android/data/RepositoryUiApi;
    .local v19, "$this$invokeSuspend_u24lambda_u243_u241\\9":Lcom/pymcl/android/data/RepositoryUiApi;
    invoke-virtual {v5}, Lcom/pymcl/runtime/GameSession$Info;->getVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v11, v0}, Lcom/pymcl/core/version/GameInstaller;->invalidateVerified(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;)V

    .end local v12    # "$i$a$-runCatching-RepositoryUiApi$collectGameExit$2$crash$1$1\\9\\365\\5":I
    .end local v19    # "$this$invokeSuspend_u24lambda_u243_u241\\9":Lcom/pymcl/android/data/RepositoryUiApi;
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    goto :goto_a

    :catchall_4
    move-exception v0

    goto :goto_9

    :catchall_5
    move-exception v0

    move/from16 v18, v11

    :goto_9
    :try_start_7
    sget-object v11, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_a

    :cond_9
    move/from16 v18, v11

    .line 366
    :goto_a
    invoke-virtual {v5}, Lcom/pymcl/runtime/GameSession$Info;->getExitCode()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_a

    const-string v0, "\u6e38\u620f\u8fdb\u7a0b\u610f\u5916\u7ed3\u675f\uff08\u672a\u6536\u5230\u9000\u51fa\u7801\uff1a\u53ef\u80fd\u88ab\u7cfb\u7edf\u56de\u6536\u6216 native \u5d29\u6e83\uff09"

    goto :goto_b

    :cond_a
    sget-object v0, Lcom/pymcl/core/crash/CrashAnalyzer;->INSTANCE:Lcom/pymcl/core/crash/CrashAnalyzer;

    invoke-virtual {v0, v6}, Lcom/pymcl/core/crash/CrashAnalyzer;->describeExit(I)Ljava/lang/String;

    move-result-object v0

    .line 367
    .local v0, "exitDesc\\5":Ljava/lang/String;
    :goto_b
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/pymcl/core/crash/CrashReason;

    .line 368
    .local v11, "first\\5":Lcom/pymcl/core/crash/CrashReason;
    invoke-virtual {v5}, Lcom/pymcl/runtime/GameSession$Info;->getInstance()Ljava/lang/String;

    move-result-object v25

    invoke-virtual {v5}, Lcom/pymcl/runtime/GameSession$Info;->getVersion()Ljava/lang/String;

    move-result-object v26

    if-eqz v11, :cond_b

    invoke-virtual {v11}, Lcom/pymcl/core/crash/CrashReason;->getTitle()Ljava/lang/String;

    move-result-object v12

    if-nez v12, :cond_c

    :cond_b
    const-string v12, "\u6e38\u620f\u5f02\u5e38\u9000\u51fa"

    :cond_c
    move-object/from16 v28, v12

    .line 369
    const/4 v12, 0x4

    new-array v12, v12, [Ljava/lang/String;

    if-eqz v11, :cond_d

    invoke-virtual {v11}, Lcom/pymcl/core/crash/CrashReason;->getDescription()Ljava/lang/String;

    move-result-object v13

    if-nez v13, :cond_e

    :cond_d
    const-string v13, "\u672a\u5339\u914d\u5230\u5df2\u77e5\u5d29\u6e83\u539f\u56e0\uff0c\u8bf7\u67e5\u770b\u4e0b\u65b9\u65e5\u5fd7\u3002"

    :cond_e
    aput-object v13, v12, v23

    if-eqz v11, :cond_10

    invoke-virtual {v11}, Lcom/pymcl/core/crash/CrashReason;->getExtra()Ljava/util/List;

    move-result-object v13

    if-eqz v13, :cond_10

    .line 495
    move-object/from16 v19, v13

    .local v19, "it\\10":Ljava/util/List;
    const/16 v20, 0x0

    .line 369
    .local v20, "$i$a$-takeIf-RepositoryUiApi$collectGameExit$2$crash$1$2\\10\\369\\5":I
    move-object/from16 v21, v19

    check-cast v21, Ljava/util/Collection;

    invoke-interface/range {v21 .. v21}, Ljava/util/Collection;->isEmpty()Z

    move-result v21

    .end local v19    # "it\\10":Ljava/util/List;
    .end local v20    # "$i$a$-takeIf-RepositoryUiApi$collectGameExit$2$crash$1$2\\10\\369\\5":I
    if-nez v21, :cond_f

    goto :goto_c

    :cond_f
    const/4 v13, 0x0

    :goto_c
    if-eqz v13, :cond_10

    move-object/from16 v29, v13

    check-cast v29, Ljava/lang/Iterable;

    const-string v13, "\u3001"

    move-object/from16 v30, v13

    check-cast v30, Ljava/lang/CharSequence;

    const/16 v36, 0x3e

    const/16 v37, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    invoke-static/range {v29 .. v37}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    goto :goto_d

    :cond_10
    const/4 v13, 0x0

    :goto_d
    aput-object v13, v12, v16

    .line 370
    move-object v13, v8

    check-cast v13, Ljava/lang/Iterable;

    move/from16 v1, v16

    invoke-static {v13, v1}, Lkotlin/collections/CollectionsKt;->drop(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v1

    .line 495
    move-object v13, v1

    .local v13, "it\\11":Ljava/util/List;
    const/16 v16, 0x0

    .line 370
    .local v16, "$i$a$-takeIf-RepositoryUiApi$collectGameExit$2$crash$1$3\\11\\370\\5":I
    move-object/from16 v19, v13

    check-cast v19, Ljava/util/Collection;

    invoke-interface/range {v19 .. v19}, Ljava/util/Collection;->isEmpty()Z

    move-result v19

    .end local v13    # "it\\11":Ljava/util/List;
    .end local v16    # "$i$a$-takeIf-RepositoryUiApi$collectGameExit$2$crash$1$3\\11\\370\\5":I
    if-nez v19, :cond_11

    goto :goto_e

    :cond_11
    const/4 v1, 0x0

    :goto_e
    if-eqz v1, :cond_12

    move-object/from16 v29, v1

    check-cast v29, Ljava/lang/Iterable;

    const-string v1, "\uff1b"

    move-object/from16 v30, v1

    check-cast v30, Ljava/lang/CharSequence;

    const-string v1, "\u5176\u5b83\u53ef\u80fd\uff1a"

    move-object/from16 v31, v1

    check-cast v31, Ljava/lang/CharSequence;

    new-instance v35, Lcom/pymcl/android/data/RepositoryUiApi$collectGameExit$2$$ExternalSyntheticLambda0;

    invoke-direct/range {v35 .. v35}, Lcom/pymcl/android/data/RepositoryUiApi$collectGameExit$2$$ExternalSyntheticLambda0;-><init>()V

    const/16 v36, 0x1c

    const/16 v37, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    invoke-static/range {v29 .. v37}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_f

    :cond_12
    const/4 v1, 0x0

    :goto_f
    aput-object v1, v12, v18

    .line 369
    nop

    .line 370
    const/4 v1, 0x3

    aput-object v0, v12, v1

    .line 369
    invoke-static {v12}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    move-object/from16 v29, v1

    check-cast v29, Ljava/lang/Iterable;

    .line 370
    move-object/from16 v30, v2

    check-cast v30, Ljava/lang/CharSequence;

    const/16 v36, 0x3e

    const/16 v37, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    invoke-static/range {v29 .. v37}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v29

    .line 371
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v30

    const/16 v1, 0x3c

    invoke-static {v4, v1}, Lkotlin/collections/CollectionsKt;->takeLast(Ljava/util/List;I)Ljava/util/List;

    move-result-object v31

    invoke-virtual {v5}, Lcom/pymcl/runtime/GameSession$Info;->getGameDir()Ljava/lang/String;

    move-result-object v32

    .line 368
    new-instance v24, Lcom/pymcl/android/ui/state/CrashInfo;

    const/16 v33, 0x0

    const/16 v34, 0x100

    const/16 v35, 0x0

    move/from16 v27, v6

    .end local v6    # "code\\5":I
    .local v27, "code\\5":I
    invoke-direct/range {v24 .. v35}, Lcom/pymcl/android/ui/state/CrashInfo;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/pymcl/android/ui/state/CrashScene;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 371
    nop

    .line 360
    .end local v0    # "exitDesc\\5":Ljava/lang/String;
    .end local v4    # "tail\\5":Ljava/util/List;
    .end local v8    # "reasons\\5":Ljava/util/List;
    .end local v9    # "$this$invokeSuspend_u24lambda_u243\\5":Lcom/pymcl/android/data/RepositoryUiApi;
    .end local v10    # "$i$a$-runCatching-RepositoryUiApi$collectGameExit$2$crash$1\\5\\360\\0":I
    .end local v11    # "first\\5":Lcom/pymcl/core/crash/CrashReason;
    .end local v27    # "code\\5":I
    invoke-static/range {v24 .. v24}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    goto :goto_10

    :catchall_6
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 372
    :goto_10
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_13

    goto :goto_12

    .line 495
    .local v1, "it\\12":Ljava/lang/Throwable;
    :cond_13
    const/4 v0, 0x0

    .line 372
    .local v0, "$i$a$-getOrElse-RepositoryUiApi$collectGameExit$2$crash$2\\12\\372\\0":I
    new-instance v23, Lcom/pymcl/android/ui/state/CrashInfo;

    invoke-virtual {v5}, Lcom/pymcl/runtime/GameSession$Info;->getInstance()Ljava/lang/String;

    move-result-object v24

    invoke-virtual {v5}, Lcom/pymcl/runtime/GameSession$Info;->getVersion()Ljava/lang/String;

    move-result-object v25

    invoke-virtual {v5}, Lcom/pymcl/runtime/GameSession$Info;->getExitCode()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_14

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    move/from16 v26, v6

    goto :goto_11

    :cond_14
    const/16 v26, -0x1

    :goto_11
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\u5d29\u6e83\u5206\u6790\u5931\u8d25\uff1a"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v28

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v29

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v30

    invoke-virtual {v5}, Lcom/pymcl/runtime/GameSession$Info;->getGameDir()Ljava/lang/String;

    move-result-object v31

    const/16 v33, 0x100

    const/16 v34, 0x0

    const-string v27, "\u6e38\u620f\u5f02\u5e38\u9000\u51fa"

    const/16 v32, 0x0

    invoke-direct/range {v23 .. v34}, Lcom/pymcl/android/ui/state/CrashInfo;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/pymcl/android/ui/state/CrashScene;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v23

    .end local v0    # "$i$a$-getOrElse-RepositoryUiApi$collectGameExit$2$crash$2\\12\\372\\0":I
    .end local v1    # "it\\12":Ljava/lang/Throwable;
    :goto_12
    move-object v4, v0

    check-cast v4, Lcom/pymcl/android/ui/state/CrashInfo;

    .line 360
    :goto_13
    nop

    .line 373
    .local v4, "crash":Lcom/pymcl/android/ui/state/CrashInfo;
    new-instance v9, Lcom/pymcl/android/ui/state/GameExitInfo;

    invoke-virtual {v5}, Lcom/pymcl/runtime/GameSession$Info;->getInstance()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v5}, Lcom/pymcl/runtime/GameSession$Info;->getVersion()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v5}, Lcom/pymcl/runtime/GameSession$Info;->getExitCode()Ljava/lang/Integer;

    move-result-object v12

    move-wide v13, v14

    move-object v15, v4

    .end local v4    # "crash":Lcom/pymcl/android/ui/state/CrashInfo;
    .end local v14    # "dur":J
    .local v13, "dur":J
    .local v15, "crash":Lcom/pymcl/android/ui/state/CrashInfo;
    invoke-direct/range {v9 .. v15}, Lcom/pymcl/android/ui/state/GameExitInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;JLcom/pymcl/android/ui/state/CrashInfo;)V

    move-wide v14, v13

    .end local v13    # "dur":J
    .end local v15    # "crash":Lcom/pymcl/android/ui/state/CrashInfo;
    .restart local v4    # "crash":Lcom/pymcl/android/ui/state/CrashInfo;
    .restart local v14    # "dur":J
    return-object v9

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
