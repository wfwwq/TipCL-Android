.class final Lcom/pymcl/android/data/RepositoryUiApi$getAccountRows$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "RepositoryUiApi.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/data/RepositoryUiApi;->getAccountRows(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lcom/pymcl/android/ui/state/AccountRow;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRepositoryUiApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepositoryUiApi.kt\ncom/pymcl/android/data/RepositoryUiApi$getAccountRows$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,494:1\n296#2,2:495\n1739#2:497\n1814#2,3:498\n*S KotlinDebug\n*F\n+ 1 RepositoryUiApi.kt\ncom/pymcl/android/data/RepositoryUiApi$getAccountRows$2\n*L\n178#1:495,2\n179#1:497\n179#1:498,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lcom/pymcl/android/ui/state/AccountRow;"
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
    c = "com.pymcl.android.data.RepositoryUiApi$getAccountRows$2"
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
.field label:I

.field final synthetic this$0:Lcom/pymcl/android/data/RepositoryUiApi;


# direct methods
.method constructor <init>(Lcom/pymcl/android/data/RepositoryUiApi;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/data/RepositoryUiApi;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/data/RepositoryUiApi$getAccountRows$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/data/RepositoryUiApi$getAccountRows$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

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

    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$getAccountRows$2;

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$getAccountRows$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    invoke-direct {v0, v1, p1}, Lcom/pymcl/android/data/RepositoryUiApi$getAccountRows$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi$getAccountRows$2;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lcom/pymcl/android/ui/state/AccountRow;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi$getAccountRows$2;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/data/RepositoryUiApi$getAccountRows$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/RepositoryUiApi$getAccountRows$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 176
    iget v1, v0, Lcom/pymcl/android/data/RepositoryUiApi$getAccountRows$2;->label:I

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 177
    iget-object v1, v0, Lcom/pymcl/android/data/RepositoryUiApi$getAccountRows$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    invoke-static {v1}, Lcom/pymcl/android/data/RepositoryUiApi;->access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApi;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v1

    invoke-virtual {v1}, Lcom/pymcl/android/data/LauncherRepository;->getAccounts()Lcom/pymcl/core/account/AccountStore;

    move-result-object v1

    invoke-virtual {v1}, Lcom/pymcl/core/account/AccountStore;->load()Lkotlin/Pair;

    move-result-object v1

    invoke-virtual {v1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .local v2, "act":Ljava/lang/String;
    invoke-virtual {v1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 178
    .local v1, "list":Ljava/util/List;
    move-object v3, v1

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$firstOrNull\\1":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 495
    .local v4, "$i$f$firstOrNull\\1\\178":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .local v6, "element\\1":Ljava/lang/Object;
    move-object v8, v6

    check-cast v8, Lcom/pymcl/core/account/Account;

    .local v8, "it\\2":Lcom/pymcl/core/account/Account;
    const/4 v9, 0x0

    .line 178
    .local v9, "$i$a$-firstOrNull-RepositoryUiApi$getAccountRows$2$activeName$1\\2\\495\\0":I
    invoke-virtual {v8}, Lcom/pymcl/core/account/Account;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    .line 495
    .end local v8    # "it\\2":Lcom/pymcl/core/account/Account;
    .end local v9    # "$i$a$-firstOrNull-RepositoryUiApi$getAccountRows$2$activeName$1\\2\\495\\0":I
    if-eqz v8, :cond_0

    goto :goto_0

    .line 496
    .end local v6    # "element\\1":Ljava/lang/Object;
    :cond_1
    move-object v6, v7

    .line 178
    .end local v3    # "$this$firstOrNull\\1":Ljava/lang/Iterable;
    .end local v4    # "$i$f$firstOrNull\\1\\178":I
    :goto_0
    check-cast v6, Lcom/pymcl/core/account/Account;

    if-eqz v6, :cond_3

    invoke-virtual {v6}, Lcom/pymcl/core/account/Account;->getName()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    move-object v7, v3

    goto :goto_2

    :cond_3
    :goto_1
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/pymcl/core/account/Account;

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lcom/pymcl/core/account/Account;->getName()Ljava/lang/String;

    move-result-object v7

    .line 179
    .local v7, "activeName":Ljava/lang/String;
    :cond_4
    :goto_2
    move-object v3, v1

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$map\\3":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 497
    .local v4, "$i$f$map\\3\\179":I
    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v3, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v5, Ljava/util/Collection;

    .local v5, "destination\\4":Ljava/util/Collection;
    move-object v6, v3

    .local v6, "$this$mapTo\\4":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 498
    .local v8, "$i$f$mapTo\\4\\497":I
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .line 499
    .local v10, "item\\4":Ljava/lang/Object;
    move-object v11, v10

    check-cast v11, Lcom/pymcl/core/account/Account;

    .local v11, "it\\5":Lcom/pymcl/core/account/Account;
    const/4 v12, 0x0

    .line 179
    .local v12, "$i$a$-map-RepositoryUiApi$getAccountRows$2$1\\5\\499\\0":I
    new-instance v13, Lcom/pymcl/android/ui/state/AccountRow;

    invoke-virtual {v11}, Lcom/pymcl/core/account/Account;->getName()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v11}, Lcom/pymcl/core/account/Account;->getType()Lcom/pymcl/core/account/AccountType;

    move-result-object v15

    invoke-virtual {v15}, Lcom/pymcl/core/account/AccountType;->getId()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v11}, Lcom/pymcl/core/account/Account;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v16

    invoke-virtual {v11}, Lcom/pymcl/core/account/Account;->getUuid()Ljava/lang/String;

    move-result-object v17

    const/16 v21, 0x4

    const/16 v22, 0x0

    const-string v18, "-"

    const-string v19, ""

    const/16 v20, 0x0

    invoke-static/range {v17 .. v22}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v11}, Lcom/pymcl/core/account/Account;->getRaw()Ljava/util/Map;

    move-result-object v0

    move-object/from16 v19, v1

    .end local v1    # "list":Ljava/util/List;
    .local v19, "list":Ljava/util/List;
    const-string v1, "skin_model"

    invoke-static {v0, v1}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_5

    const-string v0, "classic"

    :cond_5
    move-object/from16 v18, v0

    invoke-direct/range {v13 .. v18}, Lcom/pymcl/android/ui/state/AccountRow;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    .line 499
    .end local v11    # "it\\5":Lcom/pymcl/core/account/Account;
    .end local v12    # "$i$a$-map-RepositoryUiApi$getAccountRows$2$1\\5\\499\\0":I
    invoke-interface {v5, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p0

    move-object/from16 v1, v19

    goto :goto_3

    .line 500
    .end local v10    # "item\\4":Ljava/lang/Object;
    .end local v19    # "list":Ljava/util/List;
    .restart local v1    # "list":Ljava/util/List;
    :cond_6
    nop

    .end local v5    # "destination\\4":Ljava/util/Collection;
    .end local v6    # "$this$mapTo\\4":Ljava/lang/Iterable;
    .end local v8    # "$i$f$mapTo\\4\\497":I
    move-object v0, v5

    check-cast v0, Ljava/util/List;

    .line 497
    nop

    .line 179
    .end local v3    # "$this$map\\3":Ljava/lang/Iterable;
    .end local v4    # "$i$f$map\\3\\179":I
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
