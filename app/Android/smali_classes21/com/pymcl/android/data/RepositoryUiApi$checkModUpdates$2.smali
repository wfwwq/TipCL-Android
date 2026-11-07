.class final Lcom/pymcl/android/data/RepositoryUiApi$checkModUpdates$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "RepositoryUiApi.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/data/RepositoryUiApi;->checkModUpdates(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Ljava/util/Map<",
        "Ljava/lang/String;",
        "+",
        "Ljava/lang/String;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRepositoryUiApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepositoryUiApi.kt\ncom/pymcl/android/data/RepositoryUiApi$checkModUpdates$2\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,494:1\n610#2:495\n559#2:496\n1419#3,4:497\n*S KotlinDebug\n*F\n+ 1 RepositoryUiApi.kt\ncom/pymcl/android/data/RepositoryUiApi$checkModUpdates$2\n*L\n284#1:495\n284#1:496\n284#1:497,4\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001H\n"
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
    c = "com.pymcl.android.data.RepositoryUiApi$checkModUpdates$2"
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

.field final synthetic $version:Ljava/lang/String;

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
            "Lcom/pymcl/android/data/RepositoryUiApi$checkModUpdates$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/data/RepositoryUiApi$checkModUpdates$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    iput-object p2, p0, Lcom/pymcl/android/data/RepositoryUiApi$checkModUpdates$2;->$instance:Ljava/lang/String;

    iput-object p3, p0, Lcom/pymcl/android/data/RepositoryUiApi$checkModUpdates$2;->$version:Ljava/lang/String;

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

    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$checkModUpdates$2;

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$checkModUpdates$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApi$checkModUpdates$2;->$instance:Ljava/lang/String;

    iget-object v3, p0, Lcom/pymcl/android/data/RepositoryUiApi$checkModUpdates$2;->$version:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/pymcl/android/data/RepositoryUiApi$checkModUpdates$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi$checkModUpdates$2;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi$checkModUpdates$2;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/data/RepositoryUiApi$checkModUpdates$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/RepositoryUiApi$checkModUpdates$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 282
    iget v0, p0, Lcom/pymcl/android/data/RepositoryUiApi$checkModUpdates$2;->label:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 284
    sget-object v0, Lcom/pymcl/android/data/RepositoryUiApiExt;->Companion:Lcom/pymcl/android/data/RepositoryUiApiExt$Companion;

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$checkModUpdates$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    invoke-virtual {v1}, Lcom/pymcl/android/data/RepositoryUiApi;->getCtx$PyMCL_Android_app_debug()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/RepositoryUiApiExt$Companion;->get(Landroid/content/Context;)Lcom/pymcl/android/data/RepositoryUiApiExt;

    move-result-object v0

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$checkModUpdates$2;->$instance:Ljava/lang/String;

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApi$checkModUpdates$2;->$version:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/pymcl/android/data/RepositoryUiApiExt;->checkUpdates(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    .local v0, "$this$mapValues\\1":Ljava/util/Map;
    const/4 v1, 0x0

    .line 495
    .local v1, "$i$f$mapValues\\1\\284":I
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v3

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    check-cast v2, Ljava/util/Map;

    .local v2, "destination\\2":Ljava/util/Map;
    move-object v3, v0

    .local v3, "$this$mapValuesTo\\2":Ljava/util/Map;
    const/4 v4, 0x0

    .line 496
    .local v4, "$i$f$mapValuesTo\\2\\495":I
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    .local v5, "$this$associateByTo\\3":Ljava/lang/Iterable;
    move-object v6, v2

    .local v6, "destination\\3":Ljava/util/Map;
    const/4 v7, 0x0

    .line 497
    .local v7, "$i$f$associateByTo\\3\\496":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_0

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 498
    .local v9, "element\\3":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Ljava/util/Map$Entry;

    .local v10, "it\\4":Ljava/util/Map$Entry;
    const/4 v11, 0x0

    .line 496
    .local v11, "$i$a$-associateByTo-MapsKt__MapsKt$mapValuesTo$1\\4\\498\\2":I
    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v10

    .line 498
    .end local v10    # "it\\4":Ljava/util/Map$Entry;
    .end local v11    # "$i$a$-associateByTo-MapsKt__MapsKt$mapValuesTo$1\\4\\498\\2":I
    move-object v11, v9

    check-cast v11, Ljava/util/Map$Entry;

    .local v11, "it\\5":Ljava/util/Map$Entry;
    const/4 v12, 0x0

    .line 284
    .local v12, "$i$a$-mapValues-RepositoryUiApi$checkModUpdates$2$1\\5\\498\\0":I
    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/pymcl/core/mods/ModFile;

    invoke-virtual {v13}, Lcom/pymcl/core/mods/ModFile;->getDisplayName()Ljava/lang/String;

    move-result-object v11

    .line 498
    .end local v11    # "it\\5":Ljava/util/Map$Entry;
    .end local v12    # "$i$a$-mapValues-RepositoryUiApi$checkModUpdates$2$1\\5\\498\\0":I
    invoke-interface {v6, v10, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 500
    .end local v9    # "element\\3":Ljava/lang/Object;
    :cond_0
    nop

    .line 496
    .end local v5    # "$this$associateByTo\\3":Ljava/lang/Iterable;
    .end local v6    # "destination\\3":Ljava/util/Map;
    .end local v7    # "$i$f$associateByTo\\3\\496":I
    nop

    .line 495
    .end local v2    # "destination\\2":Ljava/util/Map;
    .end local v3    # "$this$mapValuesTo\\2":Ljava/util/Map;
    .end local v4    # "$i$f$mapValuesTo\\2\\495":I
    nop

    .line 284
    .end local v0    # "$this$mapValues\\1":Ljava/util/Map;
    .end local v1    # "$i$f$mapValues\\1\\284":I
    return-object v6

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
