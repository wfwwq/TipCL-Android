.class final Lcom/pymcl/android/data/RepositoryUiApi$getInstalledVersions$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "RepositoryUiApi.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/data/RepositoryUiApi;->getInstalledVersions(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lcom/pymcl/android/ui/state/InstalledVersion;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRepositoryUiApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepositoryUiApi.kt\ncom/pymcl/android/data/RepositoryUiApi$getInstalledVersions$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,494:1\n1739#2:495\n1814#2,2:496\n1816#2:499\n1#3:498\n*S KotlinDebug\n*F\n+ 1 RepositoryUiApi.kt\ncom/pymcl/android/data/RepositoryUiApi$getInstalledVersions$2\n*L\n111#1:495\n111#1:496,2\n111#1:499\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lcom/pymcl/android/ui/state/InstalledVersion;"
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
    c = "com.pymcl.android.data.RepositoryUiApi$getInstalledVersions$2"
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
.field final synthetic $instance:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lcom/pymcl/android/data/RepositoryUiApi;


# direct methods
.method constructor <init>(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/data/RepositoryUiApi;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/data/RepositoryUiApi$getInstalledVersions$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/data/RepositoryUiApi$getInstalledVersions$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    iput-object p2, p0, Lcom/pymcl/android/data/RepositoryUiApi$getInstalledVersions$2;->$instance:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-direct {p0, v0, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
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

    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$getInstalledVersions$2;

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$getInstalledVersions$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApi$getInstalledVersions$2;->$instance:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p1}, Lcom/pymcl/android/data/RepositoryUiApi$getInstalledVersions$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi$getInstalledVersions$2;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lcom/pymcl/android/ui/state/InstalledVersion;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi$getInstalledVersions$2;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/data/RepositoryUiApi$getInstalledVersions$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/RepositoryUiApi$getInstalledVersions$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v1, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 109
    iget v0, v1, Lcom/pymcl/android/data/RepositoryUiApi$getInstalledVersions$2;->label:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 110
    iget-object v0, v1, Lcom/pymcl/android/data/RepositoryUiApi$getInstalledVersions$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    iget-object v2, v1, Lcom/pymcl/android/data/RepositoryUiApi$getInstalledVersions$2;->$instance:Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/pymcl/android/data/RepositoryUiApi;->access$instOrNull(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;)Lcom/pymcl/core/instance/Instance;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    move-object v2, v0

    .local v2, "i":Lcom/pymcl/core/instance/Instance;
    iget-object v0, v1, Lcom/pymcl/android/data/RepositoryUiApi$getInstalledVersions$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    invoke-static {v0}, Lcom/pymcl/android/data/RepositoryUiApi;->access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApi;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/pymcl/android/data/LauncherRepository;->dirsFor(Lcom/pymcl/core/instance/Instance;)Lcom/pymcl/core/version/GameDirs;

    move-result-object v3

    .line 111
    .local v3, "d":Lcom/pymcl/core/version/GameDirs;
    invoke-virtual {v2}, Lcom/pymcl/core/instance/Instance;->versions()Ljava/util/List;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/Iterable;

    .local v4, "$this$map\\1":Ljava/lang/Iterable;
    iget-object v5, v1, Lcom/pymcl/android/data/RepositoryUiApi$getInstalledVersions$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    const/4 v6, 0x0

    .line 495
    .local v6, "$i$f$map\\1\\111":I
    new-instance v0, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v4, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v0, v7}, Ljava/util/ArrayList;-><init>(I)V

    move-object v7, v0

    check-cast v7, Ljava/util/Collection;

    .local v7, "destination\\2":Ljava/util/Collection;
    move-object v8, v4

    .local v8, "$this$mapTo\\2":Ljava/lang/Iterable;
    const/4 v9, 0x0

    .line 496
    .local v9, "$i$f$mapTo\\2\\495":I
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .line 497
    .local v11, "item\\2":Ljava/lang/Object;
    move-object v14, v11

    check-cast v14, Ljava/lang/String;

    .local v14, "id\\3":Ljava/lang/String;
    const/16 v19, 0x0

    .line 112
    .local v19, "$i$a$-map-RepositoryUiApi$getInstalledVersions$2$1\\3\\497\\0":I
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, v5

    .line 498
    .local v0, "$this$invokeSuspend_u24lambda_u240_u240\\4":Lcom/pymcl/android/data/RepositoryUiApi;
    const/16 v18, 0x0

    .line 112
    .local v18, "$i$a$-runCatching-RepositoryUiApi$getInstalledVersions$2$1$v$1\\4\\112\\3":I
    sget-object v12, Lcom/pymcl/core/version/ResolvedVersion;->Companion:Lcom/pymcl/core/version/ResolvedVersion$Companion;

    invoke-virtual {v3}, Lcom/pymcl/core/version/GameDirs;->getVersionsDir()Ljava/io/File;

    move-result-object v13

    const/16 v16, 0x4

    const/16 v17, 0x0

    const/4 v15, 0x0

    invoke-static/range {v12 .. v17}, Lcom/pymcl/core/version/ResolvedVersion$Companion;->load$default(Lcom/pymcl/core/version/ResolvedVersion$Companion;Ljava/io/File;Ljava/lang/String;IILjava/lang/Object;)Lcom/pymcl/core/version/ResolvedVersion;

    move-result-object v12

    .end local v0    # "$this$invokeSuspend_u24lambda_u240_u240\\4":Lcom/pymcl/android/data/RepositoryUiApi;
    .end local v18    # "$i$a$-runCatching-RepositoryUiApi$getInstalledVersions$2$1$v$1\\4\\112\\3":I
    invoke-static {v12}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    sget-object v12, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_1
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v12

    const/4 v13, 0x0

    if-eqz v12, :cond_1

    move-object v0, v13

    :cond_1
    check-cast v0, Lcom/pymcl/core/version/ResolvedVersion;

    .line 113
    .local v0, "v\\3":Lcom/pymcl/core/version/ResolvedVersion;
    invoke-static {v5}, Lcom/pymcl/android/data/RepositoryUiApi;->access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApi;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v12

    invoke-virtual {v12}, Lcom/pymcl/android/data/LauncherRepository;->getConfig()Lcom/pymcl/core/config/ConfigStore;

    move-result-object v12

    invoke-virtual {v2, v14, v12}, Lcom/pymcl/core/instance/Instance;->settings(Ljava/lang/String;Lcom/pymcl/core/config/ConfigStore;)Lcom/pymcl/core/instance/VersionSettings;

    move-result-object v20

    .line 114
    .local v20, "s\\3":Lcom/pymcl/core/instance/VersionSettings;
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/pymcl/core/version/ResolvedVersion;->getMcVersion()Ljava/lang/String;

    move-result-object v12

    if-nez v12, :cond_2

    goto :goto_2

    :cond_2
    move-object/from16 v22, v14

    move-object v14, v12

    move-object v12, v13

    move-object/from16 v13, v22

    goto :goto_3

    :cond_3
    :goto_2
    move-object v12, v13

    move-object v13, v14

    .end local v14    # "id\\3":Ljava/lang/String;
    .local v13, "id\\3":Ljava/lang/String;
    :goto_3
    if-eqz v0, :cond_4

    .line 498
    move-object v12, v0

    .local v12, "it\\5":Lcom/pymcl/core/version/ResolvedVersion;
    const/4 v15, 0x0

    .line 114
    .local v15, "$i$a$-let-RepositoryUiApi$getInstalledVersions$2$1$1\\5\\114\\3":I
    invoke-static {v5, v12}, Lcom/pymcl/android/data/RepositoryUiApi;->access$loaderOf(Lcom/pymcl/android/data/RepositoryUiApi;Lcom/pymcl/core/version/ResolvedVersion;)Ljava/lang/String;

    move-result-object v12

    move-object v15, v12

    .end local v12    # "it\\5":Lcom/pymcl/core/version/ResolvedVersion;
    .end local v15    # "$i$a$-let-RepositoryUiApi$getInstalledVersions$2$1$1\\5\\114\\3":I
    goto :goto_4

    :cond_4
    move-object v15, v12

    :goto_4
    invoke-virtual/range {v20 .. v20}, Lcom/pymcl/core/instance/VersionSettings;->isolation()Ljava/lang/String;

    move-result-object v12

    move-object/from16 v21, v0

    .end local v0    # "v\\3":Lcom/pymcl/core/version/ResolvedVersion;
    .local v21, "v\\3":Lcom/pymcl/core/version/ResolvedVersion;
    const-string v0, "none"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v12, 0x1

    xor-int/lit8 v16, v0, 0x1

    invoke-virtual/range {v20 .. v20}, Lcom/pymcl/core/instance/VersionSettings;->load()Ljava/util/Map;

    move-result-object v0

    move/from16 v17, v12

    const-string v12, "hidden"

    invoke-static {v0, v12}, Lcom/pymcl/core/util/JsonKt;->bool(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static/range {v17 .. v17}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v12

    invoke-static {v0, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v21, :cond_5

    move/from16 v18, v17

    goto :goto_5

    :cond_5
    const/4 v12, 0x0

    move/from16 v18, v12

    :goto_5
    new-instance v12, Lcom/pymcl/android/ui/state/InstalledVersion;

    move/from16 v17, v0

    invoke-direct/range {v12 .. v18}, Lcom/pymcl/android/ui/state/InstalledVersion;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    .line 497
    .end local v13    # "id\\3":Ljava/lang/String;
    .end local v19    # "$i$a$-map-RepositoryUiApi$getInstalledVersions$2$1\\3\\497\\0":I
    .end local v20    # "s\\3":Lcom/pymcl/core/instance/VersionSettings;
    .end local v21    # "v\\3":Lcom/pymcl/core/version/ResolvedVersion;
    invoke-interface {v7, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 499
    .end local v11    # "item\\2":Ljava/lang/Object;
    :cond_6
    nop

    .end local v7    # "destination\\2":Ljava/util/Collection;
    .end local v8    # "$this$mapTo\\2":Ljava/lang/Iterable;
    .end local v9    # "$i$f$mapTo\\2\\495":I
    move-object v0, v7

    check-cast v0, Ljava/util/List;

    .line 495
    nop

    .line 115
    .end local v4    # "$this$map\\1":Ljava/lang/Iterable;
    .end local v6    # "$i$f$map\\1\\111":I
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
