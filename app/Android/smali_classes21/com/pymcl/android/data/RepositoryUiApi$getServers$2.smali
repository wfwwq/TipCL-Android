.class final Lcom/pymcl/android/data/RepositoryUiApi$getServers$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "RepositoryUiApi.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/data/RepositoryUiApi;->getServers(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lcom/pymcl/android/ui/state/ServerRow;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRepositoryUiApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepositoryUiApi.kt\ncom/pymcl/android/data/RepositoryUiApi$getServers$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,494:1\n777#2:495\n873#2,2:496\n1739#2:498\n1814#2,3:499\n*S KotlinDebug\n*F\n+ 1 RepositoryUiApi.kt\ncom/pymcl/android/data/RepositoryUiApi$getServers$2\n*L\n397#1:495\n397#1:496,2\n397#1:498\n397#1:499,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lcom/pymcl/android/ui/state/ServerRow;"
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
    c = "com.pymcl.android.data.RepositoryUiApi$getServers$2"
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
            "Lcom/pymcl/android/data/RepositoryUiApi$getServers$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/data/RepositoryUiApi$getServers$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    iput-object p2, p0, Lcom/pymcl/android/data/RepositoryUiApi$getServers$2;->$instance:Ljava/lang/String;

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

    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$getServers$2;

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$getServers$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApi$getServers$2;->$instance:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p1}, Lcom/pymcl/android/data/RepositoryUiApi$getServers$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi$getServers$2;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lcom/pymcl/android/ui/state/ServerRow;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi$getServers$2;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/data/RepositoryUiApi$getServers$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/RepositoryUiApi$getServers$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 394
    iget v0, p0, Lcom/pymcl/android/data/RepositoryUiApi$getServers$2;->label:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 395
    iget-object v0, p0, Lcom/pymcl/android/data/RepositoryUiApi$getServers$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$getServers$2;->$instance:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/pymcl/android/data/RepositoryUiApi;->access$instOrNull(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;)Lcom/pymcl/core/instance/Instance;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    move-object v2, v0

    .line 397
    .local v2, "i":Lcom/pymcl/core/instance/Instance;
    sget-object v1, Lcom/pymcl/core/instance/ServersStore;->Companion:Lcom/pymcl/core/instance/ServersStore$Companion;

    iget-object v0, p0, Lcom/pymcl/android/data/RepositoryUiApi$getServers$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    invoke-static {v0}, Lcom/pymcl/android/data/RepositoryUiApi;->access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApi;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/android/data/LauncherRepository;->getConfig()Lcom/pymcl/core/config/ConfigStore;

    move-result-object v0

    const-string v3, "default_isolation"

    invoke-virtual {v0, v3}, Lcom/pymcl/core/config/ConfigStore;->string(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/pymcl/core/instance/ServersStore$Companion;->forInstance$default(Lcom/pymcl/core/instance/ServersStore$Companion;Lcom/pymcl/core/instance/Instance;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/pymcl/core/instance/ServersStore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/core/instance/ServersStore;->list()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$filter\\1":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 495
    .local v1, "$i$f$filter\\1\\397":I
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    check-cast v3, Ljava/util/Collection;

    .local v3, "destination\\2":Ljava/util/Collection;
    move-object v4, v0

    .local v4, "$this$filterTo\\2":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 496
    .local v5, "$i$f$filterTo\\2\\495":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_1
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .local v7, "element\\2":Ljava/lang/Object;
    move-object v8, v7

    check-cast v8, Lcom/pymcl/core/instance/ServerEntry;

    .local v8, "it\\3":Lcom/pymcl/core/instance/ServerEntry;
    const/4 v9, 0x0

    .line 397
    .local v9, "$i$a$-filter-RepositoryUiApi$getServers$2$1\\3\\496\\0":I
    invoke-virtual {v8}, Lcom/pymcl/core/instance/ServerEntry;->getHidden()Z

    move-result v10

    .line 496
    .end local v8    # "it\\3":Lcom/pymcl/core/instance/ServerEntry;
    .end local v9    # "$i$a$-filter-RepositoryUiApi$getServers$2$1\\3\\496\\0":I
    if-nez v10, :cond_1

    invoke-interface {v3, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 497
    .end local v7    # "element\\2":Ljava/lang/Object;
    :cond_2
    nop

    .end local v3    # "destination\\2":Ljava/util/Collection;
    .end local v4    # "$this$filterTo\\2":Ljava/lang/Iterable;
    .end local v5    # "$i$f$filterTo\\2\\495":I
    check-cast v3, Ljava/util/List;

    .line 495
    nop

    .end local v0    # "$this$filter\\1":Ljava/lang/Iterable;
    .end local v1    # "$i$f$filter\\1\\397":I
    check-cast v3, Ljava/lang/Iterable;

    .line 397
    nop

    .local v3, "$this$map\\4":Ljava/lang/Iterable;
    const/4 v0, 0x0

    .line 498
    .local v0, "$i$f$map\\4\\397":I
    new-instance v1, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v3, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .local v1, "destination\\5":Ljava/util/Collection;
    move-object v4, v3

    .local v4, "$this$mapTo\\5":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 499
    .local v5, "$i$f$mapTo\\5\\498":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 500
    .local v7, "item\\5":Ljava/lang/Object;
    move-object v8, v7

    check-cast v8, Lcom/pymcl/core/instance/ServerEntry;

    .local v8, "it\\6":Lcom/pymcl/core/instance/ServerEntry;
    const/4 v9, 0x0

    .line 397
    .local v9, "$i$a$-map-RepositoryUiApi$getServers$2$2\\6\\500\\0":I
    new-instance v10, Lcom/pymcl/android/ui/state/ServerRow;

    invoke-virtual {v8}, Lcom/pymcl/core/instance/ServerEntry;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v8}, Lcom/pymcl/core/instance/ServerEntry;->getAddress()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8}, Lcom/pymcl/core/instance/ServerEntry;->getDescription()Ljava/lang/String;

    move-result-object v13

    invoke-direct {v10, v11, v12, v13}, Lcom/pymcl/android/ui/state/ServerRow;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 500
    .end local v8    # "it\\6":Lcom/pymcl/core/instance/ServerEntry;
    .end local v9    # "$i$a$-map-RepositoryUiApi$getServers$2$2\\6\\500\\0":I
    invoke-interface {v1, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 501
    .end local v7    # "item\\5":Ljava/lang/Object;
    :cond_3
    nop

    .end local v1    # "destination\\5":Ljava/util/Collection;
    .end local v4    # "$this$mapTo\\5":Ljava/lang/Iterable;
    .end local v5    # "$i$f$mapTo\\5\\498":I
    check-cast v1, Ljava/util/List;

    .line 498
    nop

    .line 397
    .end local v0    # "$i$f$map\\4\\397":I
    .end local v3    # "$this$map\\4":Ljava/lang/Iterable;
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
