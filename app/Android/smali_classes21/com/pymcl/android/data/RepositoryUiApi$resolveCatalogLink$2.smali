.class final Lcom/pymcl/android/data/RepositoryUiApi$resolveCatalogLink$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "RepositoryUiApi.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/data/RepositoryUiApi;->resolveCatalogLink(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lcom/pymcl/android/ui/state/CatalogHit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRepositoryUiApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepositoryUiApi.kt\ncom/pymcl/android/data/RepositoryUiApi$resolveCatalogLink$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,494:1\n1#2:495\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"
    }
    d2 = {
        "<anonymous>",
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
    c = "com.pymcl.android.data.RepositoryUiApi$resolveCatalogLink$2"
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
.field final synthetic $kind:Ljava/lang/String;

.field final synthetic $url:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lcom/pymcl/android/data/RepositoryUiApi;


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/pymcl/android/data/RepositoryUiApi;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/data/RepositoryUiApi$resolveCatalogLink$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/data/RepositoryUiApi$resolveCatalogLink$2;->$url:Ljava/lang/String;

    iput-object p2, p0, Lcom/pymcl/android/data/RepositoryUiApi$resolveCatalogLink$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    iput-object p3, p0, Lcom/pymcl/android/data/RepositoryUiApi$resolveCatalogLink$2;->$kind:Ljava/lang/String;

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

    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$resolveCatalogLink$2;

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$resolveCatalogLink$2;->$url:Ljava/lang/String;

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApi$resolveCatalogLink$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    iget-object v3, p0, Lcom/pymcl/android/data/RepositoryUiApi$resolveCatalogLink$2;->$kind:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/pymcl/android/data/RepositoryUiApi$resolveCatalogLink$2;-><init>(Ljava/lang/String;Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi$resolveCatalogLink$2;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lcom/pymcl/android/ui/state/CatalogHit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi$resolveCatalogLink$2;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/data/RepositoryUiApi$resolveCatalogLink$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/RepositoryUiApi$resolveCatalogLink$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 266
    iget v0, p0, Lcom/pymcl/android/data/RepositoryUiApi$resolveCatalogLink$2;->label:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 267
    sget-object v0, Lcom/pymcl/core/mods/ModCatalog;->Companion:Lcom/pymcl/core/mods/ModCatalog$Companion;

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$resolveCatalogLink$2;->$url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/pymcl/core/mods/ModCatalog$Companion;->parseLink(Ljava/lang/String;)Lkotlin/Pair;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v0}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .local v2, "id":Ljava/lang/String;
    invoke-virtual {v0}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pymcl/core/mods/ResKind;

    .line 268
    .local v0, "k":Lcom/pymcl/core/mods/ResKind;
    iget-object v3, p0, Lcom/pymcl/android/data/RepositoryUiApi$resolveCatalogLink$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    invoke-static {v3}, Lcom/pymcl/android/data/RepositoryUiApi;->access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApi;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v3

    invoke-virtual {v3}, Lcom/pymcl/android/data/LauncherRepository;->getConfig()Lcom/pymcl/core/config/ConfigStore;

    move-result-object v3

    const-string v4, "catalog_favorites"

    invoke-virtual {v3, v4}, Lcom/pymcl/core/config/ConfigStore;->list(Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v3

    .line 269
    .local v3, "favs":Ljava/util/Set;
    const/4 v4, 0x0

    const/4 v5, 0x2

    const-string v6, "cfslug:"

    invoke-static {v2, v6, v4, v5, v1}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object v4, p0, Lcom/pymcl/android/data/RepositoryUiApi$resolveCatalogLink$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    invoke-static {v4}, Lcom/pymcl/android/data/RepositoryUiApi;->access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApi;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v4

    invoke-virtual {v4}, Lcom/pymcl/android/data/LauncherRepository;->getCatalog()Lcom/pymcl/core/mods/ModCatalog;

    move-result-object v4

    if-nez v0, :cond_1

    sget-object v5, Lcom/pymcl/core/mods/ResKind;->Companion:Lcom/pymcl/core/mods/ResKind$Companion;

    iget-object v7, p0, Lcom/pymcl/android/data/RepositoryUiApi$resolveCatalogLink$2;->$kind:Ljava/lang/String;

    invoke-virtual {v5, v7}, Lcom/pymcl/core/mods/ResKind$Companion;->of(Ljava/lang/String;)Lcom/pymcl/core/mods/ResKind;

    move-result-object v5

    goto :goto_0

    :cond_1
    move-object v5, v0

    :goto_0
    check-cast v6, Ljava/lang/CharSequence;

    invoke-static {v2, v6}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lcom/pymcl/core/mods/ModCatalog;->resolveCfSlug(Lcom/pymcl/core/mods/ResKind;Ljava/lang/String;)Lcom/pymcl/core/mods/ModHit;

    move-result-object v4

    if-eqz v4, :cond_3

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$resolveCatalogLink$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    .line 495
    .local v4, "it\\1":Lcom/pymcl/core/mods/ModHit;
    const/4 v5, 0x0

    .line 269
    .local v5, "$i$a$-let-RepositoryUiApi$resolveCatalogLink$2$1\\1\\269\\0":I
    invoke-static {v1, v4, v3}, Lcom/pymcl/android/data/RepositoryUiApi;->access$hitOf(Lcom/pymcl/android/data/RepositoryUiApi;Lcom/pymcl/core/mods/ModHit;Ljava/util/Set;)Lcom/pymcl/android/ui/state/CatalogHit;

    move-result-object v1

    .end local v4    # "it\\1":Lcom/pymcl/core/mods/ModHit;
    .end local v5    # "$i$a$-let-RepositoryUiApi$resolveCatalogLink$2$1\\1\\269\\0":I
    goto :goto_1

    .line 270
    :cond_2
    iget-object v4, p0, Lcom/pymcl/android/data/RepositoryUiApi$resolveCatalogLink$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    invoke-static {v4}, Lcom/pymcl/android/data/RepositoryUiApi;->access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApi;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v4

    invoke-virtual {v4}, Lcom/pymcl/android/data/LauncherRepository;->getCatalog()Lcom/pymcl/core/mods/ModCatalog;

    move-result-object v4

    invoke-virtual {v4, v2}, Lcom/pymcl/core/mods/ModCatalog;->project(Ljava/lang/String;)Lcom/pymcl/core/mods/ModHit;

    move-result-object v4

    if-eqz v4, :cond_3

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$resolveCatalogLink$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    .line 495
    .local v4, "it\\2":Lcom/pymcl/core/mods/ModHit;
    const/4 v5, 0x0

    .line 270
    .local v5, "$i$a$-let-RepositoryUiApi$resolveCatalogLink$2$2\\2\\270\\0":I
    invoke-static {v1, v4, v3}, Lcom/pymcl/android/data/RepositoryUiApi;->access$hitOf(Lcom/pymcl/android/data/RepositoryUiApi;Lcom/pymcl/core/mods/ModHit;Ljava/util/Set;)Lcom/pymcl/android/ui/state/CatalogHit;

    move-result-object v1

    .end local v4    # "it\\2":Lcom/pymcl/core/mods/ModHit;
    .end local v5    # "$i$a$-let-RepositoryUiApi$resolveCatalogLink$2$2\\2\\270\\0":I
    :cond_3
    :goto_1
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
