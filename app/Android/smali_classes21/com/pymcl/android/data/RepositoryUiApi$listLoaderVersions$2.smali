.class final Lcom/pymcl/android/data/RepositoryUiApi$listLoaderVersions$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "RepositoryUiApi.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/data/RepositoryUiApi;->listLoaderVersions(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Ljava/util/List<",
        "+",
        "Ljava/lang/String;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRepositoryUiApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepositoryUiApi.kt\ncom/pymcl/android/data/RepositoryUiApi$listLoaderVersions$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,494:1\n1#2:495\n1739#3:496\n1814#3,3:497\n1544#3:500\n1633#3,5:501\n*S KotlinDebug\n*F\n+ 1 RepositoryUiApi.kt\ncom/pymcl/android/data/RepositoryUiApi$listLoaderVersions$2\n*L\n143#1:496\n143#1:497,3\n145#1:500\n145#1:501,5\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        ""
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
    c = "com.pymcl.android.data.RepositoryUiApi$listLoaderVersions$2"
    f = "RepositoryUiApi.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0x8f
    }
    m = "invokeSuspend"
    n = {
        "t",
        "$this$invokeSuspend_u24lambda_u240\\1"
    }
    nl = {
        0x1f0
    }
    s = {
        "L$0",
        "L$1"
    }
    v = 0x2
.end annotation


# instance fields
.field final synthetic $loader:Ljava/lang/String;

.field final synthetic $mc:Ljava/lang/String;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/pymcl/android/data/RepositoryUiApi;


# direct methods
.method constructor <init>(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/data/RepositoryUiApi;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/data/RepositoryUiApi$listLoaderVersions$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/data/RepositoryUiApi$listLoaderVersions$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    iput-object p2, p0, Lcom/pymcl/android/data/RepositoryUiApi$listLoaderVersions$2;->$loader:Ljava/lang/String;

    iput-object p3, p0, Lcom/pymcl/android/data/RepositoryUiApi$listLoaderVersions$2;->$mc:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-direct {p0, v0, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 4
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

    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$listLoaderVersions$2;

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$listLoaderVersions$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApi$listLoaderVersions$2;->$loader:Ljava/lang/String;

    iget-object v3, p0, Lcom/pymcl/android/data/RepositoryUiApi$listLoaderVersions$2;->$mc:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/pymcl/android/data/RepositoryUiApi$listLoaderVersions$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi$listLoaderVersions$2;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi$listLoaderVersions$2;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/data/RepositoryUiApi$listLoaderVersions$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/RepositoryUiApi$listLoaderVersions$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v1, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 141
    iget v2, v1, Lcom/pymcl/android/data/RepositoryUiApi$listLoaderVersions$2;->label:I

    const/4 v3, 0x1

    packed-switch v2, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const/4 v0, 0x0

    .local v0, "$i$a$-runCatching-RepositoryUiApi$listLoaderVersions$2$vs$1\\1\\143\\0":I
    iget-object v2, v1, Lcom/pymcl/android/data/RepositoryUiApi$listLoaderVersions$2;->L$1:Ljava/lang/Object;

    check-cast v2, Lcom/pymcl/android/data/RepositoryUiApi;

    .local v2, "$this$invokeSuspend_u24lambda_u240\\1":Lcom/pymcl/android/data/RepositoryUiApi;
    iget-object v4, v1, Lcom/pymcl/android/data/RepositoryUiApi$listLoaderVersions$2;->L$0:Ljava/lang/Object;

    check-cast v4, Lcom/pymcl/core/loader/LoaderType;

    .local v4, "t":Lcom/pymcl/core/loader/LoaderType;
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v5, p1

    goto :goto_0

    .line 143
    .end local v0    # "$i$a$-runCatching-RepositoryUiApi$listLoaderVersions$2$vs$1\\1\\143\\0":I
    .end local v2    # "$this$invokeSuspend_u24lambda_u240\\1":Lcom/pymcl/android/data/RepositoryUiApi;
    :catchall_0
    move-exception v0

    goto :goto_2

    .line 141
    .end local v4    # "t":Lcom/pymcl/core/loader/LoaderType;
    :pswitch_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 142
    iget-object v2, v1, Lcom/pymcl/android/data/RepositoryUiApi$listLoaderVersions$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    iget-object v4, v1, Lcom/pymcl/android/data/RepositoryUiApi$listLoaderVersions$2;->$loader:Ljava/lang/String;

    invoke-static {v2, v4}, Lcom/pymcl/android/data/RepositoryUiApi;->access$loaderType(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;)Lcom/pymcl/core/loader/LoaderType;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    move-object v4, v2

    .line 143
    .restart local v4    # "t":Lcom/pymcl/core/loader/LoaderType;
    iget-object v2, v1, Lcom/pymcl/android/data/RepositoryUiApi$listLoaderVersions$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    iget-object v5, v1, Lcom/pymcl/android/data/RepositoryUiApi$listLoaderVersions$2;->$mc:Ljava/lang/String;

    :try_start_1
    sget-object v6, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 495
    .restart local v2    # "$this$invokeSuspend_u24lambda_u240\\1":Lcom/pymcl/android/data/RepositoryUiApi;
    const/4 v6, 0x0

    .line 143
    .local v6, "$i$a$-runCatching-RepositoryUiApi$listLoaderVersions$2$vs$1\\1\\143\\0":I
    invoke-static {v2}, Lcom/pymcl/android/data/RepositoryUiApi;->access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApi;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v7

    iput-object v4, v1, Lcom/pymcl/android/data/RepositoryUiApi$listLoaderVersions$2;->L$0:Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v1, Lcom/pymcl/android/data/RepositoryUiApi$listLoaderVersions$2;->L$1:Ljava/lang/Object;

    iput v3, v1, Lcom/pymcl/android/data/RepositoryUiApi$listLoaderVersions$2;->label:I

    invoke-virtual {v7, v4, v5, v1}, Lcom/pymcl/android/data/LauncherRepository;->loaderVersions(Lcom/pymcl/core/loader/LoaderType;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v0, :cond_1

    .line 141
    return-object v0

    .line 143
    :cond_1
    move v0, v6

    .line 141
    .end local v6    # "$i$a$-runCatching-RepositoryUiApi$listLoaderVersions$2$vs$1\\1\\143\\0":I
    .restart local v0    # "$i$a$-runCatching-RepositoryUiApi$listLoaderVersions$2$vs$1\\1\\143\\0":I
    :goto_0
    check-cast v5, Ljava/lang/Iterable;

    .local v5, "$this$map\\2":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 496
    .local v6, "$i$f$map\\2\\143":I
    new-instance v7, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v5, v8}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v7, Ljava/util/Collection;

    .local v7, "destination\\3":Ljava/util/Collection;
    move-object v8, v5

    .local v8, "$this$mapTo\\3":Ljava/lang/Iterable;
    const/4 v9, 0x0

    .line 497
    .local v9, "$i$f$mapTo\\3\\496":I
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_2

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .line 498
    .local v11, "item\\3":Ljava/lang/Object;
    move-object v12, v11

    check-cast v12, Lcom/pymcl/core/loader/LoaderVersion;

    .local v12, "it\\4":Lcom/pymcl/core/loader/LoaderVersion;
    const/4 v13, 0x0

    .line 143
    .local v13, "$i$a$-map-RepositoryUiApi$listLoaderVersions$2$vs$1$1\\4\\498\\1":I
    invoke-virtual {v12}, Lcom/pymcl/core/loader/LoaderVersion;->getVersion()Ljava/lang/String;

    move-result-object v14

    .line 498
    .end local v12    # "it\\4":Lcom/pymcl/core/loader/LoaderVersion;
    .end local v13    # "$i$a$-map-RepositoryUiApi$listLoaderVersions$2$vs$1$1\\4\\498\\1":I
    invoke-interface {v7, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 499
    .end local v11    # "item\\3":Ljava/lang/Object;
    :cond_2
    nop

    .end local v7    # "destination\\3":Ljava/util/Collection;
    .end local v8    # "$this$mapTo\\3":Ljava/lang/Iterable;
    .end local v9    # "$i$f$mapTo\\3\\496":I
    check-cast v7, Ljava/util/List;

    .line 496
    nop

    .line 143
    .end local v5    # "$this$map\\2":Ljava/lang/Iterable;
    .end local v6    # "$i$f$map\\2\\143":I
    nop

    .end local v0    # "$i$a$-runCatching-RepositoryUiApi$listLoaderVersions$2$vs$1\\1\\143\\0":I
    .end local v2    # "$this$invokeSuspend_u24lambda_u240\\1":Lcom/pymcl/android/data/RepositoryUiApi;
    invoke-static {v7}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :goto_2
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_3
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v2

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    move-object v0, v2

    :cond_3
    check-cast v0, Ljava/util/List;

    .line 145
    .local v0, "vs":Ljava/util/List;
    sget-object v2, Lcom/pymcl/core/loader/LoaderType;->OPTIFINE:Lcom/pymcl/core/loader/LoaderType;

    if-ne v4, v2, :cond_5

    move-object v2, v0

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$flatMap\\5":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 500
    .local v5, "$i$f$flatMap\\5\\145":I
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    check-cast v6, Ljava/util/Collection;

    .local v6, "destination\\6":Ljava/util/Collection;
    move-object v7, v2

    .local v7, "$this$flatMapTo\\6":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 501
    .local v8, "$i$f$flatMapTo\\6\\500":I
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_4
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .line 502
    .local v10, "element\\6":Ljava/lang/Object;
    move-object v11, v10

    check-cast v11, Ljava/lang/String;

    .local v11, "it\\7":Ljava/lang/String;
    const/4 v12, 0x0

    .line 145
    .local v12, "$i$a$-flatMap-RepositoryUiApi$listLoaderVersions$2$1\\7\\502\\0":I
    const/4 v13, 0x2

    new-array v13, v13, [Ljava/lang/String;

    const/4 v14, 0x0

    aput-object v11, v13, v14

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    const-string v15, "\uff08Forge \u6a21\u7ec4\uff09"

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    aput-object v14, v13, v3

    invoke-static {v13}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v13

    check-cast v13, Ljava/lang/Iterable;

    .line 502
    .end local v11    # "it\\7":Ljava/lang/String;
    .end local v12    # "$i$a$-flatMap-RepositoryUiApi$listLoaderVersions$2$1\\7\\502\\0":I
    nop

    .line 503
    .local v13, "list\\6":Ljava/lang/Iterable;
    invoke-static {v6, v13}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_4

    .line 505
    .end local v10    # "element\\6":Ljava/lang/Object;
    .end local v13    # "list\\6":Ljava/lang/Iterable;
    :cond_4
    nop

    .end local v6    # "destination\\6":Ljava/util/Collection;
    .end local v7    # "$this$flatMapTo\\6":Ljava/lang/Iterable;
    .end local v8    # "$i$f$flatMapTo\\6\\500":I
    move-object v3, v6

    check-cast v3, Ljava/util/List;

    .line 500
    nop

    .end local v2    # "$this$flatMap\\5":Ljava/lang/Iterable;
    .end local v5    # "$i$f$flatMap\\5\\145":I
    goto :goto_5

    .line 145
    :cond_5
    move-object v3, v0

    :goto_5
    return-object v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
