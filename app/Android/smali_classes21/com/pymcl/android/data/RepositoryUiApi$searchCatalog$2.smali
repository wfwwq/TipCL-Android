.class final Lcom/pymcl/android/data/RepositoryUiApi$searchCatalog$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "RepositoryUiApi.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/data/RepositoryUiApi;->searchCatalog(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lcom/pymcl/android/ui/state/CatalogHit;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRepositoryUiApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepositoryUiApi.kt\ncom/pymcl/android/data/RepositoryUiApi$searchCatalog$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,494:1\n1#2:495\n1739#3:496\n1814#3,3:497\n*S KotlinDebug\n*F\n+ 1 RepositoryUiApi.kt\ncom/pymcl/android/data/RepositoryUiApi$searchCatalog$2\n*L\n228#1:496\n228#1:497,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lcom/pymcl/android/ui/state/CatalogHit;"
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
    c = "com.pymcl.android.data.RepositoryUiApi$searchCatalog$2"
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
.field final synthetic $category:Ljava/lang/String;

.field final synthetic $gameVersion:Ljava/lang/String;

.field final synthetic $kind:Ljava/lang/String;

.field final synthetic $query:Ljava/lang/String;

.field final synthetic $source:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lcom/pymcl/android/data/RepositoryUiApi;


# direct methods
.method constructor <init>(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/data/RepositoryUiApi;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/data/RepositoryUiApi$searchCatalog$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/data/RepositoryUiApi$searchCatalog$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    iput-object p2, p0, Lcom/pymcl/android/data/RepositoryUiApi$searchCatalog$2;->$gameVersion:Ljava/lang/String;

    iput-object p3, p0, Lcom/pymcl/android/data/RepositoryUiApi$searchCatalog$2;->$kind:Ljava/lang/String;

    iput-object p4, p0, Lcom/pymcl/android/data/RepositoryUiApi$searchCatalog$2;->$query:Ljava/lang/String;

    iput-object p5, p0, Lcom/pymcl/android/data/RepositoryUiApi$searchCatalog$2;->$source:Ljava/lang/String;

    iput-object p6, p0, Lcom/pymcl/android/data/RepositoryUiApi$searchCatalog$2;->$category:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-direct {p0, v0, p7}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 8
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

    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$searchCatalog$2;

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$searchCatalog$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApi$searchCatalog$2;->$gameVersion:Ljava/lang/String;

    iget-object v3, p0, Lcom/pymcl/android/data/RepositoryUiApi$searchCatalog$2;->$kind:Ljava/lang/String;

    iget-object v4, p0, Lcom/pymcl/android/data/RepositoryUiApi$searchCatalog$2;->$query:Ljava/lang/String;

    iget-object v5, p0, Lcom/pymcl/android/data/RepositoryUiApi$searchCatalog$2;->$source:Ljava/lang/String;

    iget-object v6, p0, Lcom/pymcl/android/data/RepositoryUiApi$searchCatalog$2;->$category:Ljava/lang/String;

    move-object v7, p1

    invoke-direct/range {v0 .. v7}, Lcom/pymcl/android/data/RepositoryUiApi$searchCatalog$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi$searchCatalog$2;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lcom/pymcl/android/ui/state/CatalogHit;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi$searchCatalog$2;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/data/RepositoryUiApi$searchCatalog$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/RepositoryUiApi$searchCatalog$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 225
    iget v0, p0, Lcom/pymcl/android/data/RepositoryUiApi$searchCatalog$2;->label:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 226
    iget-object v0, p0, Lcom/pymcl/android/data/RepositoryUiApi$searchCatalog$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    invoke-static {v0}, Lcom/pymcl/android/data/RepositoryUiApi;->access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApi;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/android/data/LauncherRepository;->getConfig()Lcom/pymcl/core/config/ConfigStore;

    move-result-object v0

    const-string v1, "catalog_favorites"

    invoke-virtual {v0, v1}, Lcom/pymcl/core/config/ConfigStore;->list(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    .line 227
    .local v0, "favs":Ljava/util/Set;
    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$searchCatalog$2;->$gameVersion:Ljava/lang/String;

    move-object v2, v1

    .line 495
    .local v2, "it\\1":Ljava/lang/String;
    const/4 v3, 0x0

    .line 227
    .local v3, "$i$a$-takeUnless-RepositoryUiApi$searchCatalog$2$gv$1\\1\\227\\0":I
    const-string v4, "\u5168\u90e8"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    .end local v2    # "it\\1":Ljava/lang/String;
    .end local v3    # "$i$a$-takeUnless-RepositoryUiApi$searchCatalog$2$gv$1\\1\\227\\0":I
    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    const-string v1, ""

    :cond_1
    move-object v6, v1

    .line 228
    .local v6, "gv":Ljava/lang/String;
    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$searchCatalog$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    invoke-static {v1}, Lcom/pymcl/android/data/RepositoryUiApi;->access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApi;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v1

    invoke-virtual {v1}, Lcom/pymcl/android/data/LauncherRepository;->getCatalog()Lcom/pymcl/core/mods/ModCatalog;

    move-result-object v2

    sget-object v1, Lcom/pymcl/core/mods/ResKind;->Companion:Lcom/pymcl/core/mods/ResKind$Companion;

    iget-object v3, p0, Lcom/pymcl/android/data/RepositoryUiApi$searchCatalog$2;->$kind:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lcom/pymcl/core/mods/ResKind$Companion;->of(Ljava/lang/String;)Lcom/pymcl/core/mods/ResKind;

    move-result-object v3

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$searchCatalog$2;->$query:Ljava/lang/String;

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/pymcl/android/data/RepositoryUiApi$searchCatalog$2;->$source:Ljava/lang/String;

    iget-object v7, p0, Lcom/pymcl/android/data/RepositoryUiApi$searchCatalog$2;->$category:Ljava/lang/String;

    const/16 v9, 0x20

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v10}, Lcom/pymcl/core/mods/ModCatalog;->search$default(Lcom/pymcl/core/mods/ModCatalog;Lcom/pymcl/core/mods/ResKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$map\\2":Ljava/lang/Iterable;
    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApi$searchCatalog$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    const/4 v3, 0x0

    .line 496
    .local v3, "$i$f$map\\2\\228":I
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v1, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination\\3":Ljava/util/Collection;
    move-object v5, v1

    .local v5, "$this$mapTo\\3":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 497
    .local v7, "$i$f$mapTo\\3\\496":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 498
    .local v9, "item\\3":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Lcom/pymcl/core/mods/ModHit;

    .local v10, "it\\4":Lcom/pymcl/core/mods/ModHit;
    const/4 v11, 0x0

    .line 228
    .local v11, "$i$a$-map-RepositoryUiApi$searchCatalog$2$1\\4\\498\\0":I
    invoke-static {v2, v10, v0}, Lcom/pymcl/android/data/RepositoryUiApi;->access$hitOf(Lcom/pymcl/android/data/RepositoryUiApi;Lcom/pymcl/core/mods/ModHit;Ljava/util/Set;)Lcom/pymcl/android/ui/state/CatalogHit;

    move-result-object v10

    .line 498
    .end local v10    # "it\\4":Lcom/pymcl/core/mods/ModHit;
    .end local v11    # "$i$a$-map-RepositoryUiApi$searchCatalog$2$1\\4\\498\\0":I
    invoke-interface {v4, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 499
    .end local v9    # "item\\3":Ljava/lang/Object;
    :cond_2
    nop

    .end local v4    # "destination\\3":Ljava/util/Collection;
    .end local v5    # "$this$mapTo\\3":Ljava/lang/Iterable;
    .end local v7    # "$i$f$mapTo\\3\\496":I
    move-object v2, v4

    check-cast v2, Ljava/util/List;

    .line 496
    nop

    .line 228
    .end local v1    # "$this$map\\2":Ljava/lang/Iterable;
    .end local v3    # "$i$f$map\\2\\228":I
    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
