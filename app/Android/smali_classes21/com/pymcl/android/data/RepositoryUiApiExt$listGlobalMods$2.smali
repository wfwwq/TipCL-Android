.class final Lcom/pymcl/android/data/RepositoryUiApiExt$listGlobalMods$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "RepositoryUiApiExt.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/data/RepositoryUiApiExt;->listGlobalMods(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    value = "SMAP\nRepositoryUiApiExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepositoryUiApiExt.kt\ncom/pymcl/android/data/RepositoryUiApiExt$listGlobalMods$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,174:1\n1#2:175\n1739#3:176\n1814#3,3:177\n*S KotlinDebug\n*F\n+ 1 RepositoryUiApiExt.kt\ncom/pymcl/android/data/RepositoryUiApiExt$listGlobalMods$2\n*L\n134#1:176\n134#1:177,3\n*E\n"
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
    c = "com.pymcl.android.data.RepositoryUiApiExt$listGlobalMods$2"
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
.field label:I

.field final synthetic this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;


# direct methods
.method constructor <init>(Lcom/pymcl/android/data/RepositoryUiApiExt;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/data/RepositoryUiApiExt;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/data/RepositoryUiApiExt$listGlobalMods$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$listGlobalMods$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    const/4 v0, 0x1

    invoke-direct {p0, v0, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
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

    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApiExt$listGlobalMods$2;

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$listGlobalMods$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    invoke-direct {v0, v1, p1}, Lcom/pymcl/android/data/RepositoryUiApiExt$listGlobalMods$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApiExt;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApiExt$listGlobalMods$2;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApiExt$listGlobalMods$2;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/data/RepositoryUiApiExt$listGlobalMods$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/RepositoryUiApiExt$listGlobalMods$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v1, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 131
    iget v0, v1, Lcom/pymcl/android/data/RepositoryUiApiExt$listGlobalMods$2;->label:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 132
    iget-object v0, v1, Lcom/pymcl/android/data/RepositoryUiApiExt$listGlobalMods$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    invoke-virtual {v0}, Lcom/pymcl/android/data/RepositoryUiApiExt;->globalMods()Lcom/pymcl/core/mods/GlobalMods;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/core/mods/GlobalMods;->list()Ljava/util/List;

    move-result-object v2

    .line 133
    .local v2, "files":Ljava/util/List;
    iget-object v0, v1, Lcom/pymcl/android/data/RepositoryUiApiExt$listGlobalMods$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    :try_start_0
    sget-object v6, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 175
    .local v0, "$this$invokeSuspend_u24lambda_u240\\1":Lcom/pymcl/android/data/RepositoryUiApiExt;
    const/4 v6, 0x0

    .line 133
    .local v6, "$i$a$-runCatching-RepositoryUiApiExt$listGlobalMods$2$idents$1\\1\\133\\0":I
    invoke-virtual {v0}, Lcom/pymcl/android/data/RepositoryUiApiExt;->getTools()Lcom/pymcl/core/mods/ModTools;

    move-result-object v7

    invoke-static {v7, v2, v4, v3, v5}, Lcom/pymcl/core/mods/ModTools;->identify$default(Lcom/pymcl/core/mods/ModTools;Ljava/util/List;ZILjava/lang/Object;)Ljava/util/Map;

    move-result-object v7

    .end local v0    # "$this$invokeSuspend_u24lambda_u240\\1":Lcom/pymcl/android/data/RepositoryUiApiExt;
    .end local v6    # "$i$a$-runCatching-RepositoryUiApiExt$listGlobalMods$2$idents$1\\1\\133\\0":I
    invoke-static {v7}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v6, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v6

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    move-object v0, v6

    :cond_0
    check-cast v0, Ljava/util/Map;

    .line 134
    .local v0, "idents":Ljava/util/Map;
    move-object v6, v2

    check-cast v6, Ljava/lang/Iterable;

    .local v6, "$this$map\\2":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 176
    .local v7, "$i$f$map\\2\\134":I
    new-instance v8, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v6, v9}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v8, Ljava/util/Collection;

    .local v8, "destination\\3":Ljava/util/Collection;
    move-object v9, v6

    .local v9, "$this$mapTo\\3":Ljava/lang/Iterable;
    const/4 v10, 0x0

    .line 177
    .local v10, "$i$f$mapTo\\3\\176":I
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_14

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .line 178
    .local v12, "item\\3":Ljava/lang/Object;
    move-object v13, v12

    check-cast v13, Ljava/io/File;

    .local v13, "f\\4":Ljava/io/File;
    const/4 v14, 0x0

    .line 134
    .local v14, "$i$a$-map-RepositoryUiApiExt$listGlobalMods$2$1\\4\\178\\0":I
    invoke-virtual {v13}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-interface {v0, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/pymcl/core/mods/ModIdent;

    .local v15, "id\\4":Lcom/pymcl/core/mods/ModIdent;
    sget-object v3, Lcom/pymcl/core/mods/LocalModMetaReader;->INSTANCE:Lcom/pymcl/core/mods/LocalModMetaReader;

    invoke-virtual {v3, v13}, Lcom/pymcl/core/mods/LocalModMetaReader;->read(Ljava/io/File;)Lcom/pymcl/core/mods/LocalModMeta;

    move-result-object v3

    .line 135
    .local v3, "meta\\4":Lcom/pymcl/core/mods/LocalModMeta;
    invoke-virtual {v13}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "getName(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v28, v0

    .end local v0    # "idents":Ljava/util/Map;
    .local v28, "idents":Ljava/util/Map;
    const-string v0, ".disabled"

    const/16 v17, 0x1

    if-eqz v15, :cond_4

    invoke-virtual {v15}, Lcom/pymcl/core/mods/ModIdent;->getTitle()Ljava/lang/String;

    move-result-object v18

    if-eqz v18, :cond_4

    check-cast v18, Ljava/lang/CharSequence;

    invoke-interface/range {v18 .. v18}, Ljava/lang/CharSequence;->length()I

    move-result v19

    if-nez v19, :cond_1

    move/from16 v19, v17

    goto :goto_2

    :cond_1
    const/16 v19, 0x0

    :goto_2
    if-eqz v19, :cond_2

    .line 175
    const/16 v18, 0x0

    .line 135
    .local v18, "$i$a$-ifEmpty-RepositoryUiApiExt$listGlobalMods$2$1$1\\5\\135\\4":I
    const/16 v18, 0x0

    .end local v18    # "$i$a$-ifEmpty-RepositoryUiApiExt$listGlobalMods$2$1$1\\5\\135\\4":I
    :cond_2
    check-cast v18, Ljava/lang/String;

    if-nez v18, :cond_3

    goto :goto_3

    :cond_3
    move-object/from16 v29, v2

    move-object/from16 v19, v18

    goto :goto_6

    :cond_4
    :goto_3
    if-eqz v3, :cond_7

    invoke-virtual {v3}, Lcom/pymcl/core/mods/LocalModMeta;->getName()Ljava/lang/String;

    move-result-object v18

    if-eqz v18, :cond_7

    check-cast v18, Ljava/lang/CharSequence;

    invoke-interface/range {v18 .. v18}, Ljava/lang/CharSequence;->length()I

    move-result v19

    if-nez v19, :cond_5

    move/from16 v19, v17

    goto :goto_4

    :cond_5
    const/16 v19, 0x0

    :goto_4
    if-eqz v19, :cond_6

    .line 175
    const/16 v18, 0x0

    .line 135
    .local v18, "$i$a$-ifEmpty-RepositoryUiApiExt$listGlobalMods$2$1$2\\6\\135\\4":I
    const/16 v18, 0x0

    .end local v18    # "$i$a$-ifEmpty-RepositoryUiApiExt$listGlobalMods$2$1$2\\6\\135\\4":I
    :cond_6
    check-cast v18, Ljava/lang/String;

    goto :goto_5

    :cond_7
    const/16 v18, 0x0

    :goto_5
    if-nez v18, :cond_8

    invoke-virtual {v13}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v29, v2

    .end local v2    # "files":Ljava/util/List;
    .local v29, "files":Ljava/util/List;
    move-object v2, v0

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v1, v2}, Lkotlin/text/StringsKt;->removeSuffix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    const-string v2, ".jar"

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v1, v2}, Lkotlin/text/StringsKt;->removeSuffix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v18

    move-object/from16 v19, v18

    goto :goto_6

    .end local v29    # "files":Ljava/util/List;
    .restart local v2    # "files":Ljava/util/List;
    :cond_8
    move-object/from16 v29, v2

    .end local v2    # "files":Ljava/util/List;
    .restart local v29    # "files":Ljava/util/List;
    move-object/from16 v19, v18

    .line 136
    :goto_6
    invoke-virtual {v13}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v16, v3

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v5, 0x0

    .end local v3    # "meta\\4":Lcom/pymcl/core/mods/LocalModMeta;
    .local v16, "meta\\4":Lcom/pymcl/core/mods/LocalModMeta;
    invoke-static {v1, v0, v5, v2, v3}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v20, v0, 0x1

    const-string v0, ""

    if-eqz v16, :cond_b

    invoke-virtual/range {v16 .. v16}, Lcom/pymcl/core/mods/LocalModMeta;->getVersion()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_b

    check-cast v1, Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v18

    if-nez v18, :cond_9

    goto :goto_7

    :cond_9
    move/from16 v17, v5

    :goto_7
    if-eqz v17, :cond_a

    .line 175
    const/4 v1, 0x0

    .line 136
    .local v1, "$i$a$-ifEmpty-RepositoryUiApiExt$listGlobalMods$2$1$3\\7\\136\\4":I
    move-object v1, v3

    .end local v1    # "$i$a$-ifEmpty-RepositoryUiApiExt$listGlobalMods$2$1$3\\7\\136\\4":I
    :cond_a
    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_c

    :cond_b
    if-eqz v15, :cond_d

    invoke-virtual {v15}, Lcom/pymcl/core/mods/ModIdent;->getVersionName()Ljava/lang/String;

    move-result-object v1

    :cond_c
    move-object/from16 v21, v1

    goto :goto_8

    :cond_d
    move-object/from16 v21, v0

    .line 135
    :goto_8
    nop

    .line 136
    if-eqz v15, :cond_f

    invoke-virtual {v15}, Lcom/pymcl/core/mods/ModIdent;->getIconUrl()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_e

    goto :goto_9

    :cond_e
    move-object/from16 v23, v1

    goto :goto_a

    :cond_f
    :goto_9
    move-object/from16 v23, v0

    :goto_a
    if-eqz v15, :cond_11

    invoke-virtual {v15}, Lcom/pymcl/core/mods/ModIdent;->getPrimaryId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_10

    goto :goto_b

    :cond_10
    move-object/from16 v24, v1

    goto :goto_c

    :cond_11
    :goto_b
    move-object/from16 v24, v0

    :goto_c
    if-eqz v15, :cond_13

    invoke-virtual {v15}, Lcom/pymcl/core/mods/ModIdent;->getSource()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_12

    goto :goto_d

    :cond_12
    move-object/from16 v25, v1

    goto :goto_e

    :cond_13
    :goto_d
    move-object/from16 v25, v0

    .line 135
    :goto_e
    new-instance v17, Lcom/pymcl/android/ui/state/InstalledEntry;

    const/16 v22, 0x0

    const/16 v26, 0x10

    const/16 v27, 0x0

    move-object/from16 v18, v4

    invoke-direct/range {v17 .. v27}, Lcom/pymcl/android/ui/state/InstalledEntry;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 136
    move-object/from16 v0, v17

    .line 178
    .end local v13    # "f\\4":Ljava/io/File;
    .end local v14    # "$i$a$-map-RepositoryUiApiExt$listGlobalMods$2$1\\4\\178\\0":I
    .end local v15    # "id\\4":Lcom/pymcl/core/mods/ModIdent;
    .end local v16    # "meta\\4":Lcom/pymcl/core/mods/LocalModMeta;
    invoke-interface {v8, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, p0

    move v4, v5

    move-object/from16 v0, v28

    move-object v5, v3

    move v3, v2

    move-object/from16 v2, v29

    goto/16 :goto_1

    .line 179
    .end local v12    # "item\\3":Ljava/lang/Object;
    .end local v28    # "idents":Ljava/util/Map;
    .end local v29    # "files":Ljava/util/List;
    .restart local v0    # "idents":Ljava/util/Map;
    .restart local v2    # "files":Ljava/util/List;
    :cond_14
    move-object/from16 v28, v0

    .end local v0    # "idents":Ljava/util/Map;
    .end local v8    # "destination\\3":Ljava/util/Collection;
    .end local v9    # "$this$mapTo\\3":Ljava/lang/Iterable;
    .end local v10    # "$i$f$mapTo\\3\\176":I
    .restart local v28    # "idents":Ljava/util/Map;
    move-object v0, v8

    check-cast v0, Ljava/util/List;

    .line 176
    nop

    .line 136
    .end local v6    # "$this$map\\2":Ljava/lang/Iterable;
    .end local v7    # "$i$f$map\\2\\134":I
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
