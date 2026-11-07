.class final Lcom/pymcl/android/data/RepositoryUiApi$getInstalled$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "RepositoryUiApi.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/data/RepositoryUiApi;->getInstalled(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lcom/pymcl/android/ui/state/InstalledEntry;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRepositoryUiApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepositoryUiApi.kt\ncom/pymcl/android/data/RepositoryUiApi$getInstalled$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,494:1\n3938#2:495\n4474#2,2:496\n777#3:498\n873#3,2:499\n1221#3:501\n1739#3:502\n1814#3,3:503\n*S KotlinDebug\n*F\n+ 1 RepositoryUiApi.kt\ncom/pymcl/android/data/RepositoryUiApi$getInstalled$2\n*L\n251#1:495\n251#1:496,2\n252#1:498\n252#1:499,2\n253#1:501\n253#1:502\n253#1:503,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lcom/pymcl/android/ui/state/InstalledEntry;"
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
    c = "com.pymcl.android.data.RepositoryUiApi$getInstalled$2"
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

.field final synthetic $kind:Ljava/lang/String;

.field final synthetic $version:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lcom/pymcl/android/data/RepositoryUiApi;


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/pymcl/android/data/RepositoryUiApi;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/data/RepositoryUiApi$getInstalled$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/data/RepositoryUiApi$getInstalled$2;->$kind:Ljava/lang/String;

    iput-object p2, p0, Lcom/pymcl/android/data/RepositoryUiApi$getInstalled$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    iput-object p3, p0, Lcom/pymcl/android/data/RepositoryUiApi$getInstalled$2;->$instance:Ljava/lang/String;

    iput-object p4, p0, Lcom/pymcl/android/data/RepositoryUiApi$getInstalled$2;->$version:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-direct {p0, v0, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6
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

    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$getInstalled$2;

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$getInstalled$2;->$kind:Ljava/lang/String;

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApi$getInstalled$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    iget-object v3, p0, Lcom/pymcl/android/data/RepositoryUiApi$getInstalled$2;->$instance:Ljava/lang/String;

    iget-object v4, p0, Lcom/pymcl/android/data/RepositoryUiApi$getInstalled$2;->$version:Ljava/lang/String;

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/pymcl/android/data/RepositoryUiApi$getInstalled$2;-><init>(Ljava/lang/String;Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi$getInstalled$2;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lcom/pymcl/android/ui/state/InstalledEntry;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi$getInstalled$2;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/data/RepositoryUiApi$getInstalled$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/RepositoryUiApi$getInstalled$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 247
    iget v1, v0, Lcom/pymcl/android/data/RepositoryUiApi$getInstalled$2;->label:I

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 248
    sget-object v1, Lcom/pymcl/core/mods/ResKind;->Companion:Lcom/pymcl/core/mods/ResKind$Companion;

    iget-object v2, v0, Lcom/pymcl/android/data/RepositoryUiApi$getInstalled$2;->$kind:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/pymcl/core/mods/ResKind$Companion;->of(Ljava/lang/String;)Lcom/pymcl/core/mods/ResKind;

    move-result-object v1

    .local v1, "k":Lcom/pymcl/core/mods/ResKind;
    iget-object v2, v0, Lcom/pymcl/android/data/RepositoryUiApi$getInstalled$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    iget-object v3, v0, Lcom/pymcl/android/data/RepositoryUiApi$getInstalled$2;->$instance:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/pymcl/android/data/RepositoryUiApi;->access$instOrNull(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;)Lcom/pymcl/core/instance/Instance;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v2

    return-object v2

    .line 249
    .local v2, "i":Lcom/pymcl/core/instance/Instance;
    :cond_0
    iget-object v3, v0, Lcom/pymcl/android/data/RepositoryUiApi$getInstalled$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    invoke-static {v3}, Lcom/pymcl/android/data/RepositoryUiApi;->access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApi;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v3

    invoke-virtual {v3}, Lcom/pymcl/android/data/LauncherRepository;->getCatalog()Lcom/pymcl/core/mods/ModCatalog;

    move-result-object v3

    iget-object v4, v0, Lcom/pymcl/android/data/RepositoryUiApi$getInstalled$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    iget-object v5, v0, Lcom/pymcl/android/data/RepositoryUiApi$getInstalled$2;->$version:Ljava/lang/String;

    invoke-static {v4, v2, v5}, Lcom/pymcl/android/data/RepositoryUiApi;->access$gameDirOf(Lcom/pymcl/android/data/RepositoryUiApi;Lcom/pymcl/core/instance/Instance;Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    invoke-virtual {v3, v1, v4}, Lcom/pymcl/core/mods/ModCatalog;->targetDir(Lcom/pymcl/core/mods/ResKind;Ljava/io/File;)Ljava/io/File;

    move-result-object v3

    .line 250
    .local v3, "dir":Ljava/io/File;
    invoke-virtual {v3}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v4

    if-nez v4, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v4

    return-object v4

    .line 251
    .local v4, "files":[Ljava/io/File;
    :cond_1
    move-object v5, v4

    .local v5, "$this$filter\\1":[Ljava/lang/Object;
    const/4 v6, 0x0

    .line 495
    .local v6, "$i$f$filter\\1\\251":I
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    check-cast v7, Ljava/util/Collection;

    .local v7, "destination\\2":Ljava/util/Collection;
    move-object v8, v5

    .local v8, "$this$filterTo\\2":[Ljava/lang/Object;
    const/4 v9, 0x0

    .line 496
    .local v9, "$i$f$filterTo\\2\\495":I
    array-length v10, v8

    const/4 v12, 0x0

    :goto_0
    if-ge v12, v10, :cond_6

    aget-object v14, v8, v12

    .local v14, "element\\2":Ljava/lang/Object;
    move-object v15, v14

    .local v15, "it\\3":Ljava/io/File;
    const/16 v16, 0x0

    .line 251
    .local v16, "$i$a$-filter-RepositoryUiApi$getInstalled$2$1\\3\\496\\0":I
    const/16 v17, 0x1

    sget-object v13, Lcom/pymcl/core/mods/ResKind;->WORLD:Lcom/pymcl/core/mods/ResKind;

    if-ne v1, v13, :cond_2

    invoke-virtual {v15}, Ljava/io/File;->isDirectory()Z

    move-result v13

    goto :goto_2

    :cond_2
    invoke-virtual {v15}, Ljava/io/File;->isFile()Z

    move-result v13

    if-nez v13, :cond_4

    sget-object v13, Lcom/pymcl/core/mods/ResKind;->MOD:Lcom/pymcl/core/mods/ResKind;

    if-eq v1, v13, :cond_3

    invoke-virtual {v15}, Ljava/io/File;->isDirectory()Z

    move-result v13

    if-eqz v13, :cond_3

    goto :goto_1

    :cond_3
    const/4 v13, 0x0

    goto :goto_2

    :cond_4
    :goto_1
    move/from16 v13, v17

    .line 496
    .end local v15    # "it\\3":Ljava/io/File;
    .end local v16    # "$i$a$-filter-RepositoryUiApi$getInstalled$2$1\\3\\496\\0":I
    :goto_2
    if-eqz v13, :cond_5

    invoke-interface {v7, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .end local v14    # "element\\2":Ljava/lang/Object;
    :cond_5
    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    .line 497
    :cond_6
    const/16 v17, 0x1

    .end local v7    # "destination\\2":Ljava/util/Collection;
    .end local v8    # "$this$filterTo\\2":[Ljava/lang/Object;
    .end local v9    # "$i$f$filterTo\\2\\495":I
    check-cast v7, Ljava/util/List;

    .line 495
    nop

    .end local v5    # "$this$filter\\1":[Ljava/lang/Object;
    .end local v6    # "$i$f$filter\\1\\251":I
    check-cast v7, Ljava/lang/Iterable;

    .line 252
    nop

    .local v7, "$this$filter\\4":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 498
    .local v5, "$i$f$filter\\4\\252":I
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    check-cast v6, Ljava/util/Collection;

    .local v6, "destination\\5":Ljava/util/Collection;
    move-object v8, v7

    .local v8, "$this$filterTo\\5":Ljava/lang/Iterable;
    const/4 v9, 0x0

    .line 499
    .local v9, "$i$f$filterTo\\5\\498":I
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    const-string v13, ".jar"

    const/4 v15, 0x2

    const-string v11, "getName(...)"

    if-eqz v12, :cond_b

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .local v12, "element\\5":Ljava/lang/Object;
    move-object/from16 v18, v12

    check-cast v18, Ljava/io/File;

    .local v18, "it\\6":Ljava/io/File;
    const/16 v19, 0x0

    .line 252
    .local v19, "$i$a$-filter-RepositoryUiApi$getInstalled$2$2\\6\\499\\0":I
    sget-object v14, Lcom/pymcl/core/mods/ResKind;->MOD:Lcom/pymcl/core/mods/ResKind;

    if-ne v1, v14, :cond_8

    invoke-virtual/range {v18 .. v18}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v20, v1

    const/4 v0, 0x0

    const/4 v1, 0x0

    .end local v1    # "k":Lcom/pymcl/core/mods/ResKind;
    .local v20, "k":Lcom/pymcl/core/mods/ResKind;
    invoke-static {v14, v13, v1, v15, v0}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_9

    invoke-virtual/range {v18 .. v18}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, ".jar.disabled"

    invoke-static {v13, v11, v1, v15, v0}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_4

    :cond_7
    const/4 v1, 0x0

    goto :goto_5

    .end local v20    # "k":Lcom/pymcl/core/mods/ResKind;
    .restart local v1    # "k":Lcom/pymcl/core/mods/ResKind;
    :cond_8
    move-object/from16 v20, v1

    .end local v1    # "k":Lcom/pymcl/core/mods/ResKind;
    .restart local v20    # "k":Lcom/pymcl/core/mods/ResKind;
    :cond_9
    :goto_4
    move/from16 v1, v17

    .line 499
    .end local v18    # "it\\6":Ljava/io/File;
    .end local v19    # "$i$a$-filter-RepositoryUiApi$getInstalled$2$2\\6\\499\\0":I
    :goto_5
    if-eqz v1, :cond_a

    invoke-interface {v6, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_a
    move-object/from16 v0, p0

    move-object/from16 v1, v20

    goto :goto_3

    .line 500
    .end local v12    # "element\\5":Ljava/lang/Object;
    .end local v20    # "k":Lcom/pymcl/core/mods/ResKind;
    .restart local v1    # "k":Lcom/pymcl/core/mods/ResKind;
    :cond_b
    move-object/from16 v20, v1

    .end local v1    # "k":Lcom/pymcl/core/mods/ResKind;
    .end local v6    # "destination\\5":Ljava/util/Collection;
    .end local v8    # "$this$filterTo\\5":Ljava/lang/Iterable;
    .end local v9    # "$i$f$filterTo\\5\\498":I
    .restart local v20    # "k":Lcom/pymcl/core/mods/ResKind;
    move-object v0, v6

    check-cast v0, Ljava/util/List;

    .line 498
    nop

    .end local v5    # "$i$f$filter\\4\\252":I
    .end local v7    # "$this$filter\\4":Ljava/lang/Iterable;
    check-cast v0, Ljava/lang/Iterable;

    .line 253
    nop

    .local v0, "$this$sortedBy\\7":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 501
    .local v1, "$i$f$sortedBy\\7\\253":I
    new-instance v5, Lcom/pymcl/android/data/RepositoryUiApi$getInstalled$2$invokeSuspend$$inlined$sortedBy$1;

    invoke-direct {v5}, Lcom/pymcl/android/data/RepositoryUiApi$getInstalled$2$invokeSuspend$$inlined$sortedBy$1;-><init>()V

    check-cast v5, Ljava/util/Comparator;

    invoke-static {v0, v5}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    .end local v0    # "$this$sortedBy\\7":Ljava/lang/Iterable;
    .end local v1    # "$i$f$sortedBy\\7\\253":I
    check-cast v0, Ljava/lang/Iterable;

    .line 253
    nop

    .local v0, "$this$map\\8":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 502
    .local v1, "$i$f$map\\8\\253":I
    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v0, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v5, Ljava/util/Collection;

    .local v5, "destination\\9":Ljava/util/Collection;
    move-object v6, v0

    .local v6, "$this$mapTo\\9":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 503
    .local v7, "$i$f$mapTo\\9\\502":I
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_6
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_c

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 504
    .local v9, "item\\9":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Ljava/io/File;

    .local v10, "it\\10":Ljava/io/File;
    const/4 v12, 0x0

    .line 254
    .local v12, "$i$a$-map-RepositoryUiApi$getInstalled$2$4\\10\\504\\0":I
    new-instance v21, Lcom/pymcl/android/ui/state/InstalledEntry;

    invoke-virtual {v10}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v10}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v19, v0

    .end local v0    # "$this$map\\8":Ljava/lang/Iterable;
    .local v19, "$this$map\\8":Ljava/lang/Iterable;
    const-string v0, ".disabled"

    move/from16 v32, v1

    .end local v1    # "$i$f$map\\8\\253":I
    .local v32, "$i$f$map\\8\\253":I
    move-object v1, v0

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v15, v1}, Lkotlin/text/StringsKt;->removeSuffix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    move-object v15, v13

    check-cast v15, Ljava/lang/CharSequence;

    invoke-static {v1, v15}, Lkotlin/text/StringsKt;->removeSuffix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    const-string v15, ".zip"

    check-cast v15, Ljava/lang/CharSequence;

    invoke-static {v1, v15}, Lkotlin/text/StringsKt;->removeSuffix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v23

    invoke-virtual {v10}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v16, v2

    move-object/from16 v18, v3

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v15, 0x0

    .end local v2    # "i":Lcom/pymcl/core/instance/Instance;
    .end local v3    # "dir":Ljava/io/File;
    .local v16, "i":Lcom/pymcl/core/instance/Instance;
    .local v18, "dir":Ljava/io/File;
    invoke-static {v1, v0, v3, v2, v15}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v24, v0, 0x1

    const/16 v30, 0xf0

    const/16 v31, 0x0

    const-string v25, ""

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    move-object/from16 v22, v14

    invoke-direct/range {v21 .. v31}, Lcom/pymcl/android/ui/state/InstalledEntry;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 504
    move-object/from16 v0, v21

    .end local v10    # "it\\10":Ljava/io/File;
    .end local v12    # "$i$a$-map-RepositoryUiApi$getInstalled$2$4\\10\\504\\0":I
    invoke-interface {v5, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v15, v2

    move-object/from16 v2, v16

    move-object/from16 v3, v18

    move-object/from16 v0, v19

    move/from16 v1, v32

    goto :goto_6

    .line 505
    .end local v9    # "item\\9":Ljava/lang/Object;
    .end local v16    # "i":Lcom/pymcl/core/instance/Instance;
    .end local v18    # "dir":Ljava/io/File;
    .end local v19    # "$this$map\\8":Ljava/lang/Iterable;
    .end local v32    # "$i$f$map\\8\\253":I
    .restart local v0    # "$this$map\\8":Ljava/lang/Iterable;
    .restart local v1    # "$i$f$map\\8\\253":I
    .restart local v2    # "i":Lcom/pymcl/core/instance/Instance;
    .restart local v3    # "dir":Ljava/io/File;
    :cond_c
    move-object/from16 v19, v0

    .end local v0    # "$this$map\\8":Ljava/lang/Iterable;
    .end local v5    # "destination\\9":Ljava/util/Collection;
    .end local v6    # "$this$mapTo\\9":Ljava/lang/Iterable;
    .end local v7    # "$i$f$mapTo\\9\\502":I
    .restart local v19    # "$this$map\\8":Ljava/lang/Iterable;
    move-object v0, v5

    check-cast v0, Ljava/util/List;

    .line 502
    nop

    .line 255
    .end local v1    # "$i$f$map\\8\\253":I
    .end local v19    # "$this$map\\8":Ljava/lang/Iterable;
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
