.class final Lcom/pymcl/android/data/RepositoryUiApiExt$identifyInstalled$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "RepositoryUiApiExt.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/data/RepositoryUiApiExt;->identifyInstalled(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    value = "SMAP\nRepositoryUiApiExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepositoryUiApiExt.kt\ncom/pymcl/android/data/RepositoryUiApiExt$identifyInstalled$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,174:1\n1#2:175\n3938#3:176\n4474#3,2:177\n1221#4:179\n1739#4:180\n1814#4,3:181\n*S KotlinDebug\n*F\n+ 1 RepositoryUiApiExt.kt\ncom/pymcl/android/data/RepositoryUiApiExt$identifyInstalled$2\n*L\n76#1:176\n76#1:177,2\n76#1:179\n76#1:180\n76#1:181,3\n*E\n"
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
    c = "com.pymcl.android.data.RepositoryUiApiExt$identifyInstalled$2"
    f = "RepositoryUiApiExt.kt"
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

.field final synthetic this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/pymcl/android/data/RepositoryUiApiExt;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/pymcl/android/data/RepositoryUiApiExt;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/data/RepositoryUiApiExt$identifyInstalled$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$identifyInstalled$2;->$kind:Ljava/lang/String;

    iput-object p2, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$identifyInstalled$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    iput-object p3, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$identifyInstalled$2;->$instance:Ljava/lang/String;

    iput-object p4, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$identifyInstalled$2;->$version:Ljava/lang/String;

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

    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApiExt$identifyInstalled$2;

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$identifyInstalled$2;->$kind:Ljava/lang/String;

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$identifyInstalled$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    iget-object v3, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$identifyInstalled$2;->$instance:Ljava/lang/String;

    iget-object v4, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$identifyInstalled$2;->$version:Ljava/lang/String;

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/pymcl/android/data/RepositoryUiApiExt$identifyInstalled$2;-><init>(Ljava/lang/String;Lcom/pymcl/android/data/RepositoryUiApiExt;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApiExt$identifyInstalled$2;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApiExt$identifyInstalled$2;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/data/RepositoryUiApiExt$identifyInstalled$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/RepositoryUiApiExt$identifyInstalled$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v1, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 71
    iget v0, v1, Lcom/pymcl/android/data/RepositoryUiApiExt$identifyInstalled$2;->label:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 72
    sget-object v0, Lcom/pymcl/core/mods/ResKind;->Companion:Lcom/pymcl/core/mods/ResKind$Companion;

    iget-object v2, v1, Lcom/pymcl/android/data/RepositoryUiApiExt$identifyInstalled$2;->$kind:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/pymcl/core/mods/ResKind$Companion;->of(Ljava/lang/String;)Lcom/pymcl/core/mods/ResKind;

    move-result-object v2

    .local v2, "k":Lcom/pymcl/core/mods/ResKind;
    sget-object v0, Lcom/pymcl/core/mods/ResKind;->WORLD:Lcom/pymcl/core/mods/ResKind;

    if-eq v2, v0, :cond_1d

    sget-object v0, Lcom/pymcl/core/mods/ResKind;->MODPACK:Lcom/pymcl/core/mods/ResKind;

    if-ne v2, v0, :cond_0

    goto/16 :goto_11

    .line 73
    :cond_0
    iget-object v0, v1, Lcom/pymcl/android/data/RepositoryUiApiExt$identifyInstalled$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    invoke-static {v0}, Lcom/pymcl/android/data/RepositoryUiApiExt;->access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApiExt;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/android/data/LauncherRepository;->getCatalog()Lcom/pymcl/core/mods/ModCatalog;

    move-result-object v0

    iget-object v3, v1, Lcom/pymcl/android/data/RepositoryUiApiExt$identifyInstalled$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    iget-object v4, v1, Lcom/pymcl/android/data/RepositoryUiApiExt$identifyInstalled$2;->$instance:Ljava/lang/String;

    iget-object v5, v1, Lcom/pymcl/android/data/RepositoryUiApiExt$identifyInstalled$2;->$version:Ljava/lang/String;

    invoke-static {v3, v4, v5}, Lcom/pymcl/android/data/RepositoryUiApiExt;->access$gameDir(Lcom/pymcl/android/data/RepositoryUiApiExt;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/pymcl/core/mods/ModCatalog;->targetDir(Lcom/pymcl/core/mods/ResKind;Ljava/io/File;)Ljava/io/File;

    move-result-object v5

    .line 74
    .local v5, "dir":Ljava/io/File;
    iget-object v0, v1, Lcom/pymcl/android/data/RepositoryUiApiExt$identifyInstalled$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    const/4 v10, 0x0

    :try_start_0
    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 175
    .local v0, "$this$invokeSuspend_u24lambda_u240\\1":Lcom/pymcl/android/data/RepositoryUiApiExt;
    const/4 v11, 0x0

    .line 74
    .local v11, "$i$a$-runCatching-RepositoryUiApiExt$identifyInstalled$2$idents$1\\1\\74\\0":I
    invoke-virtual {v0}, Lcom/pymcl/android/data/RepositoryUiApiExt;->getTools()Lcom/pymcl/core/mods/ModTools;

    move-result-object v4

    sget-object v6, Lcom/pymcl/core/mods/ResKind;->MOD:Lcom/pymcl/core/mods/ResKind;

    if-ne v2, v6, :cond_1

    const/4 v6, 0x1

    goto :goto_0

    :cond_1
    move v6, v10

    :goto_0
    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/pymcl/core/mods/ModTools;->identifyDir$default(Lcom/pymcl/core/mods/ModTools;Ljava/io/File;ZZILjava/lang/Object;)Ljava/util/Map;

    move-result-object v4

    .end local v0    # "$this$invokeSuspend_u24lambda_u240\\1":Lcom/pymcl/android/data/RepositoryUiApiExt;
    .end local v11    # "$i$a$-runCatching-RepositoryUiApiExt$identifyInstalled$2$idents$1\\1\\74\\0":I
    invoke-static {v4}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_1
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v4

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    move-object v0, v4

    :cond_2
    check-cast v0, Ljava/util/Map;

    .line 75
    .local v0, "idents":Ljava/util/Map;
    const/16 v16, 0x0

    .line 76
    .local v16, "shared":Z
    invoke-virtual {v5}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v4

    if-nez v4, :cond_3

    new-array v4, v10, [Ljava/io/File;

    .local v4, "$this$filter\\2":[Ljava/lang/Object;
    :cond_3
    const/4 v6, 0x0

    .line 176
    .local v6, "$i$f$filter\\2\\76":I
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    check-cast v7, Ljava/util/Collection;

    .local v7, "destination\\3":Ljava/util/Collection;
    move-object v8, v4

    .local v8, "$this$filterTo\\3":[Ljava/lang/Object;
    const/4 v9, 0x0

    .line 177
    .local v9, "$i$f$filterTo\\3\\176":I
    array-length v11, v8

    move v12, v10

    :goto_2
    if-ge v12, v11, :cond_8

    aget-object v13, v8, v12

    .local v13, "element\\3":Ljava/lang/Object;
    move-object v14, v13

    .local v14, "it\\4":Ljava/io/File;
    const/4 v15, 0x0

    .line 76
    .local v15, "$i$a$-filter-RepositoryUiApiExt$identifyInstalled$2$1\\4\\177\\0":I
    invoke-virtual {v14}, Ljava/io/File;->isFile()Z

    move-result v17

    if-eqz v17, :cond_5

    const/16 v20, 0x1

    sget-object v3, Lcom/pymcl/core/mods/ResKind;->MOD:Lcom/pymcl/core/mods/ResKind;

    if-ne v2, v3, :cond_4

    sget-object v3, Lcom/pymcl/core/mods/ModTools;->Companion:Lcom/pymcl/core/mods/ModTools$Companion;

    invoke-static {v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v3, v14}, Lcom/pymcl/core/mods/ModTools$Companion;->isModFile(Ljava/io/File;)Z

    move-result v3

    if-eqz v3, :cond_6

    :cond_4
    move/from16 v3, v20

    goto :goto_3

    :cond_5
    const/16 v20, 0x1

    :cond_6
    move v3, v10

    .line 177
    .end local v14    # "it\\4":Ljava/io/File;
    .end local v15    # "$i$a$-filter-RepositoryUiApiExt$identifyInstalled$2$1\\4\\177\\0":I
    :goto_3
    if-eqz v3, :cond_7

    invoke-interface {v7, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .end local v13    # "element\\3":Ljava/lang/Object;
    :cond_7
    add-int/lit8 v12, v12, 0x1

    goto :goto_2

    .line 178
    :cond_8
    const/16 v20, 0x1

    .end local v7    # "destination\\3":Ljava/util/Collection;
    .end local v8    # "$this$filterTo\\3":[Ljava/lang/Object;
    .end local v9    # "$i$f$filterTo\\3\\176":I
    move-object v3, v7

    check-cast v3, Ljava/util/List;

    .line 176
    nop

    .end local v4    # "$this$filter\\2":[Ljava/lang/Object;
    .end local v6    # "$i$f$filter\\2\\76":I
    check-cast v3, Ljava/lang/Iterable;

    .line 76
    nop

    .local v3, "$this$sortedBy\\5":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 179
    .local v4, "$i$f$sortedBy\\5\\76":I
    new-instance v6, Lcom/pymcl/android/data/RepositoryUiApiExt$identifyInstalled$2$invokeSuspend$$inlined$sortedBy$1;

    invoke-direct {v6}, Lcom/pymcl/android/data/RepositoryUiApiExt$identifyInstalled$2$invokeSuspend$$inlined$sortedBy$1;-><init>()V

    check-cast v6, Ljava/util/Comparator;

    invoke-static {v3, v6}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v3

    .end local v3    # "$this$sortedBy\\5":Ljava/lang/Iterable;
    .end local v4    # "$i$f$sortedBy\\5\\76":I
    check-cast v3, Ljava/lang/Iterable;

    .line 76
    nop

    .local v3, "$this$map\\6":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 180
    .local v4, "$i$f$map\\6\\76":I
    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v3, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v6, Ljava/util/Collection;

    .local v6, "destination\\7":Ljava/util/Collection;
    move-object v7, v3

    .local v7, "$this$mapTo\\7":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 181
    .local v8, "$i$f$mapTo\\7\\180":I
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_4
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_1c

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v21

    .line 182
    .local v21, "item\\7":Ljava/lang/Object;
    move-object/from16 v11, v21

    check-cast v11, Ljava/io/File;

    .local v11, "f\\8":Ljava/io/File;
    const/16 v22, 0x0

    .line 77
    .local v22, "$i$a$-map-RepositoryUiApiExt$identifyInstalled$2$3\\8\\182\\0":I
    invoke-virtual {v11}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    move-object/from16 v23, v12

    check-cast v23, Lcom/pymcl/core/mods/ModIdent;

    .local v23, "id\\8":Lcom/pymcl/core/mods/ModIdent;
    sget-object v12, Lcom/pymcl/core/mods/ResKind;->MOD:Lcom/pymcl/core/mods/ResKind;

    if-ne v2, v12, :cond_9

    sget-object v12, Lcom/pymcl/core/mods/LocalModMetaReader;->INSTANCE:Lcom/pymcl/core/mods/LocalModMetaReader;

    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v12, v11}, Lcom/pymcl/core/mods/LocalModMetaReader;->read(Ljava/io/File;)Lcom/pymcl/core/mods/LocalModMeta;

    move-result-object v12

    goto :goto_5

    :cond_9
    const/4 v12, 0x0

    :goto_5
    move-object/from16 v24, v12

    .line 78
    .local v24, "meta\\8":Lcom/pymcl/core/mods/LocalModMeta;
    invoke-virtual {v11}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v12

    const-string v14, "getName(...)"

    invoke-static {v12, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, ".disabled"

    if-eqz v23, :cond_c

    invoke-virtual/range {v23 .. v23}, Lcom/pymcl/core/mods/ModIdent;->getTitle()Ljava/lang/String;

    move-result-object v17

    if-eqz v17, :cond_c

    check-cast v17, Ljava/lang/CharSequence;

    invoke-interface/range {v17 .. v17}, Ljava/lang/CharSequence;->length()I

    move-result v18

    if-nez v18, :cond_a

    move/from16 v18, v20

    goto :goto_6

    :cond_a
    move/from16 v18, v10

    :goto_6
    if-eqz v18, :cond_b

    .line 175
    const/16 v17, 0x0

    .line 78
    .local v17, "$i$a$-ifEmpty-RepositoryUiApiExt$identifyInstalled$2$3$1\\9\\78\\8":I
    const/16 v17, 0x0

    .end local v17    # "$i$a$-ifEmpty-RepositoryUiApiExt$identifyInstalled$2$3$1\\9\\78\\8":I
    :cond_b
    check-cast v17, Ljava/lang/String;

    if-nez v17, :cond_10

    :cond_c
    if-eqz v24, :cond_f

    invoke-virtual/range {v24 .. v24}, Lcom/pymcl/core/mods/LocalModMeta;->getName()Ljava/lang/String;

    move-result-object v17

    if-eqz v17, :cond_f

    check-cast v17, Ljava/lang/CharSequence;

    invoke-interface/range {v17 .. v17}, Ljava/lang/CharSequence;->length()I

    move-result v18

    if-nez v18, :cond_d

    move/from16 v18, v20

    goto :goto_7

    :cond_d
    move/from16 v18, v10

    :goto_7
    if-eqz v18, :cond_e

    .line 175
    const/16 v17, 0x0

    .line 78
    .local v17, "$i$a$-ifEmpty-RepositoryUiApiExt$identifyInstalled$2$3$2\\10\\78\\8":I
    const/16 v17, 0x0

    .end local v17    # "$i$a$-ifEmpty-RepositoryUiApiExt$identifyInstalled$2$3$2\\10\\78\\8":I
    :cond_e
    check-cast v17, Ljava/lang/String;

    goto :goto_8

    :cond_f
    const/16 v17, 0x0

    :goto_8
    if-nez v17, :cond_10

    invoke-virtual {v11}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v13, v15

    check-cast v13, Ljava/lang/CharSequence;

    invoke-static {v10, v13}, Lkotlin/text/StringsKt;->removeSuffix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v10

    const-string v13, ".jar"

    check-cast v13, Ljava/lang/CharSequence;

    invoke-static {v10, v13}, Lkotlin/text/StringsKt;->removeSuffix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v10

    const-string v13, ".zip"

    check-cast v13, Ljava/lang/CharSequence;

    invoke-static {v10, v13}, Lkotlin/text/StringsKt;->removeSuffix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v17

    :cond_10
    move-object/from16 v13, v17

    .line 79
    invoke-virtual {v11}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v14, 0x2

    move-object/from16 v25, v0

    const/4 v0, 0x0

    const/4 v1, 0x0

    .end local v0    # "idents":Ljava/util/Map;
    .local v25, "idents":Ljava/util/Map;
    invoke-static {v10, v15, v1, v14, v0}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v10

    xor-int/lit8 v14, v10, 0x1

    const-string v10, ""

    if-eqz v24, :cond_13

    invoke-virtual/range {v24 .. v24}, Lcom/pymcl/core/mods/LocalModMeta;->getVersion()Ljava/lang/String;

    move-result-object v15

    if-eqz v15, :cond_13

    check-cast v15, Ljava/lang/CharSequence;

    invoke-interface {v15}, Ljava/lang/CharSequence;->length()I

    move-result v17

    if-nez v17, :cond_11

    move/from16 v17, v20

    goto :goto_9

    :cond_11
    move/from16 v17, v1

    :goto_9
    if-eqz v17, :cond_12

    .line 175
    const/4 v15, 0x0

    .line 79
    .local v15, "$i$a$-ifEmpty-RepositoryUiApiExt$identifyInstalled$2$3$3\\11\\79\\8":I
    move-object v15, v0

    .end local v15    # "$i$a$-ifEmpty-RepositoryUiApiExt$identifyInstalled$2$3$3\\11\\79\\8":I
    :cond_12
    check-cast v15, Ljava/lang/String;

    if-nez v15, :cond_15

    :cond_13
    if-eqz v23, :cond_14

    invoke-virtual/range {v23 .. v23}, Lcom/pymcl/core/mods/ModIdent;->getVersionName()Ljava/lang/String;

    move-result-object v15

    goto :goto_a

    :cond_14
    move-object v15, v10

    .line 80
    :cond_15
    :goto_a
    if-eqz v23, :cond_17

    invoke-virtual/range {v23 .. v23}, Lcom/pymcl/core/mods/ModIdent;->getIconUrl()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_16

    goto :goto_b

    :cond_16
    move-object/from16 v17, v0

    goto :goto_c

    :cond_17
    :goto_b
    move-object/from16 v17, v10

    :goto_c
    if-eqz v23, :cond_19

    invoke-virtual/range {v23 .. v23}, Lcom/pymcl/core/mods/ModIdent;->getPrimaryId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_18

    goto :goto_d

    :cond_18
    move-object/from16 v18, v0

    goto :goto_e

    :cond_19
    :goto_d
    move-object/from16 v18, v10

    :goto_e
    if-eqz v23, :cond_1b

    invoke-virtual/range {v23 .. v23}, Lcom/pymcl/core/mods/ModIdent;->getSource()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1a

    goto :goto_f

    :cond_1a
    move-object/from16 v19, v0

    goto :goto_10

    :cond_1b
    :goto_f
    move-object/from16 v19, v10

    .line 78
    :goto_10
    move-object v0, v11

    .end local v11    # "f\\8":Ljava/io/File;
    .local v0, "f\\8":Ljava/io/File;
    new-instance v11, Lcom/pymcl/android/ui/state/InstalledEntry;

    invoke-direct/range {v11 .. v19}, Lcom/pymcl/android/ui/state/InstalledEntry;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    nop

    .line 182
    .end local v0    # "f\\8":Ljava/io/File;
    .end local v22    # "$i$a$-map-RepositoryUiApiExt$identifyInstalled$2$3\\8\\182\\0":I
    .end local v23    # "id\\8":Lcom/pymcl/core/mods/ModIdent;
    .end local v24    # "meta\\8":Lcom/pymcl/core/mods/LocalModMeta;
    invoke-interface {v6, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v10, v1

    move-object/from16 v0, v25

    move-object/from16 v1, p0

    goto/16 :goto_4

    .line 183
    .end local v21    # "item\\7":Ljava/lang/Object;
    .end local v25    # "idents":Ljava/util/Map;
    .local v0, "idents":Ljava/util/Map;
    :cond_1c
    move-object/from16 v25, v0

    .end local v0    # "idents":Ljava/util/Map;
    .end local v6    # "destination\\7":Ljava/util/Collection;
    .end local v7    # "$this$mapTo\\7":Ljava/lang/Iterable;
    .end local v8    # "$i$f$mapTo\\7\\180":I
    .restart local v25    # "idents":Ljava/util/Map;
    move-object v0, v6

    check-cast v0, Ljava/util/List;

    .line 180
    nop

    .line 81
    .end local v3    # "$this$map\\6":Ljava/lang/Iterable;
    .end local v4    # "$i$f$map\\6\\76":I
    return-object v0

    .line 72
    .end local v5    # "dir":Ljava/io/File;
    .end local v16    # "shared":Z
    .end local v25    # "idents":Ljava/util/Map;
    :cond_1d
    :goto_11
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
