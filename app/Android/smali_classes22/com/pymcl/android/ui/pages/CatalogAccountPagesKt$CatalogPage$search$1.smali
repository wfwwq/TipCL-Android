.class final Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "CatalogAccountPages.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt;->CatalogPage$search(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/LatestOnly;Lcom/pymcl/android/ui/state/CatalogKind;Ljava/util/List;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)Lkotlinx/coroutines/Job;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCatalogAccountPages.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatalogAccountPages.kt\ncom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,318:1\n1#2:319\n2068#3,2:320\n*S KotlinDebug\n*F\n+ 1 CatalogAccountPages.kt\ncom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1\n*L\n77#1:320,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
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
    c = "com.pymcl.android.ui.pages.CatalogAccountPagesKt$CatalogPage$search$1"
    f = "CatalogAccountPages.kt"
    i = {
        0x0
    }
    l = {
        0x48
    }
    m = "invokeSuspend"
    n = {
        "t"
    }
    nl = {
        0x49
    }
    s = {
        "J$0"
    }
    v = 0x2
.end annotation


# instance fields
.field final synthetic $category$delegate:Landroidx/compose/runtime/MutableIntState;

.field final synthetic $error$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $favHits$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/pymcl/android/ui/state/CatalogHit;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $favs$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $gameVersions$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $gvIndex$delegate:Landroidx/compose/runtime/MutableIntState;

.field final synthetic $hits$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/CatalogHit;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $kind:Lcom/pymcl/android/ui/state/CatalogKind;

.field final synthetic $query$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $searchSeq:Lcom/pymcl/android/ui/state/LatestOnly;

.field final synthetic $source$delegate:Landroidx/compose/runtime/MutableIntState;

.field final synthetic $sources:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $state:Lcom/pymcl/android/ui/state/AppState;

.field J$0:J

.field label:I


# direct methods
.method constructor <init>(Lcom/pymcl/android/ui/state/LatestOnly;Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/CatalogKind;Ljava/util/List;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/LatestOnly;",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Lcom/pymcl/android/ui/state/CatalogKind;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/CatalogHit;",
            ">;>;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableIntState;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Landroidx/compose/runtime/MutableIntState;",
            "Landroidx/compose/runtime/MutableIntState;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;>;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/pymcl/android/ui/state/CatalogHit;",
            ">;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->$searchSeq:Lcom/pymcl/android/ui/state/LatestOnly;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->$kind:Lcom/pymcl/android/ui/state/CatalogKind;

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->$sources:Ljava/util/List;

    iput-object p5, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->$hits$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->$error$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p7, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->$query$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p8, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->$source$delegate:Landroidx/compose/runtime/MutableIntState;

    iput-object p9, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->$gameVersions$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p10, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->$gvIndex$delegate:Landroidx/compose/runtime/MutableIntState;

    iput-object p11, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->$category$delegate:Landroidx/compose/runtime/MutableIntState;

    iput-object p12, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->$favs$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p13, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->$favHits$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p14}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    new-instance v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;

    iget-object v2, v0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->$searchSeq:Lcom/pymcl/android/ui/state/LatestOnly;

    iget-object v3, v0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v4, v0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->$kind:Lcom/pymcl/android/ui/state/CatalogKind;

    iget-object v5, v0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->$sources:Ljava/util/List;

    iget-object v6, v0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->$hits$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v7, v0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->$error$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v8, v0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->$query$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v9, v0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->$source$delegate:Landroidx/compose/runtime/MutableIntState;

    iget-object v10, v0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->$gameVersions$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v11, v0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->$gvIndex$delegate:Landroidx/compose/runtime/MutableIntState;

    iget-object v12, v0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->$category$delegate:Landroidx/compose/runtime/MutableIntState;

    iget-object v13, v0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->$favs$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v14, v0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->$favHits$delegate:Landroidx/compose/runtime/MutableState;

    move-object/from16 v15, p2

    invoke-direct/range {v1 .. v15}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;-><init>(Lcom/pymcl/android/ui/state/LatestOnly;Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/CatalogKind;Ljava/util/List;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/coroutines/Continuation;

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v1, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 67
    iget v2, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->label:I

    packed-switch v2, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-wide v2, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->J$0:J

    .local v2, "t":J
    const/4 v4, 0x0

    .local v4, "err":Ljava/lang/String;
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 v5, p1

    goto/16 :goto_2

    .end local v2    # "t":J
    .end local v4    # "err":Ljava/lang/String;
    :pswitch_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 69
    iget-object v2, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->$searchSeq:Lcom/pymcl/android/ui/state/LatestOnly;

    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/LatestOnly;->next()J

    move-result-wide v2

    .line 70
    .restart local v2    # "t":J
    iget-object v4, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->$hits$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v5, 0x0

    invoke-static {v4, v5}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt;->access$CatalogPage$lambda$20(Landroidx/compose/runtime/MutableState;Ljava/util/List;)V

    iget-object v4, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->$error$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v4, v5}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt;->access$CatalogPage$lambda$23(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    .line 71
    const/4 v4, 0x0

    .line 72
    .restart local v4    # "err":Ljava/lang/String;
    :try_start_1
    iget-object v6, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v6}, Lcom/pymcl/android/ui/state/AppState;->getApi()Lcom/pymcl/android/ui/state/LauncherUiApi;

    move-result-object v7

    iget-object v6, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->$kind:Lcom/pymcl/android/ui/state/CatalogKind;

    invoke-virtual {v6}, Lcom/pymcl/android/ui/state/CatalogKind;->getKey()Ljava/lang/String;

    move-result-object v8

    iget-object v6, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->$query$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v6}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt;->access$CatalogPage$lambda$4(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v9

    iget-object v6, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->$sources:Ljava/util/List;

    iget-object v10, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->$source$delegate:Landroidx/compose/runtime/MutableIntState;

    invoke-static {v10}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt;->access$CatalogPage$lambda$7(Landroidx/compose/runtime/MutableIntState;)I

    move-result v10

    invoke-interface {v6, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    move-object v10, v6

    check-cast v10, Ljava/lang/String;

    iget-object v6, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->$gameVersions$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v6}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt;->access$CatalogPage$lambda$16(Landroidx/compose/runtime/MutableState;)Ljava/util/List;

    move-result-object v6

    iget-object v11, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->$gvIndex$delegate:Landroidx/compose/runtime/MutableIntState;

    invoke-static {v11}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt;->access$CatalogPage$lambda$13(Landroidx/compose/runtime/MutableIntState;)I

    move-result v11

    const/4 v12, 0x1

    const/4 v13, 0x0

    if-ltz v11, :cond_0

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v14
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ge v11, v14, :cond_0

    move v13, v12

    :cond_0
    const-string v14, ""

    if-eqz v13, :cond_1

    :try_start_2
    invoke-interface {v6, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    goto :goto_0

    .line 319
    :cond_1
    nop

    .local v11, "it\\1":I
    const/4 v6, 0x0

    .line 72
    .local v6, "$i$a$-getOrElse-CatalogAccountPagesKt$CatalogPage$search$1$r$1\\1\\72\\0":I
    nop

    .end local v6    # "$i$a$-getOrElse-CatalogAccountPagesKt$CatalogPage$search$1$r$1\\1\\72\\0":I
    .end local v11    # "it\\1":I
    move-object v6, v14

    :goto_0
    move-object v11, v6

    check-cast v11, Ljava/lang/String;

    .line 319
    nop

    .local v11, "it\\2":Ljava/lang/String;
    const/4 v13, 0x0

    .line 72
    .local v13, "$i$a$-takeUnless-CatalogAccountPagesKt$CatalogPage$search$1$r$2\\2\\72\\0":I
    const-string v15, "\u5168\u90e8"

    invoke-static {v11, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    .end local v11    # "it\\2":Ljava/lang/String;
    .end local v13    # "$i$a$-takeUnless-CatalogAccountPagesKt$CatalogPage$search$1$r$2\\2\\72\\0":I
    if-nez v15, :cond_2

    move-object v5, v6

    :cond_2
    check-cast v5, Ljava/lang/String;

    if-nez v5, :cond_3

    move-object v11, v14

    goto :goto_1

    :cond_3
    move-object v11, v5

    :goto_1
    invoke-static {}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt;->access$getCATEGORIES$p()Ljava/util/List;

    move-result-object v5

    iget-object v6, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->$category$delegate:Landroidx/compose/runtime/MutableIntState;

    invoke-static {v6}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt;->access$CatalogPage$lambda$10(Landroidx/compose/runtime/MutableIntState;)I

    move-result v6

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lkotlin/Pair;

    invoke-virtual {v5}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    move-object v13, v1

    check-cast v13, Lkotlin/coroutines/Continuation;

    iput-wide v2, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->J$0:J

    iput v12, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->label:I

    move-object v12, v5

    invoke-interface/range {v7 .. v13}, Lcom/pymcl/android/ui/state/LauncherUiApi;->searchCatalog(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v0, :cond_4

    .line 67
    return-object v0

    .line 72
    :cond_4
    :goto_2
    check-cast v5, Ljava/util/List;
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_3

    .line 74
    :catch_0
    move-exception v0

    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_5

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v5

    :cond_5
    move-object v4, v5

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v5

    .line 72
    .end local v0    # "e":Ljava/lang/Exception;
    :goto_3
    nop

    .line 75
    .local v5, "r":Ljava/util/List;
    iget-object v0, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->$searchSeq:Lcom/pymcl/android/ui/state/LatestOnly;

    invoke-virtual {v0, v2, v3}, Lcom/pymcl/android/ui/state/LatestOnly;->isLatest(J)Z

    move-result v0

    if-nez v0, :cond_6

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 76
    :cond_6
    iget-object v0, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->$error$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v0, v4}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt;->access$CatalogPage$lambda$23(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    iget-object v0, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->$hits$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v0, v5}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt;->access$CatalogPage$lambda$20(Landroidx/compose/runtime/MutableState;Ljava/util/List;)V

    .line 77
    move-object v0, v5

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$forEach\\3":Ljava/lang/Iterable;
    iget-object v6, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->$favs$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v7, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$search$1;->$favHits$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v8, 0x0

    .line 320
    .local v8, "$i$f$forEach\\3\\77":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_4
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .local v10, "element\\3":Ljava/lang/Object;
    move-object v11, v10

    check-cast v11, Lcom/pymcl/android/ui/state/CatalogHit;

    .local v11, "it\\4":Lcom/pymcl/android/ui/state/CatalogHit;
    const/4 v12, 0x0

    .line 77
    .local v12, "$i$a$-forEach-CatalogAccountPagesKt$CatalogPage$search$1$1\\4\\320\\0":I
    invoke-static {v6}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt;->access$CatalogPage$lambda$28(Landroidx/compose/runtime/MutableState;)Ljava/util/Set;

    move-result-object v13

    invoke-virtual {v11}, Lcom/pymcl/android/ui/state/CatalogHit;->getId()Ljava/lang/String;

    move-result-object v14

    invoke-interface {v13, v14}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_7

    invoke-static {v7}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt;->access$CatalogPage$lambda$31(Landroidx/compose/runtime/MutableState;)Ljava/util/Map;

    move-result-object v13

    invoke-virtual {v11}, Lcom/pymcl/android/ui/state/CatalogHit;->getId()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v13

    invoke-static {v7, v13}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt;->access$CatalogPage$lambda$32(Landroidx/compose/runtime/MutableState;Ljava/util/Map;)V

    .line 320
    .end local v10    # "element\\3":Ljava/lang/Object;
    .end local v11    # "it\\4":Lcom/pymcl/android/ui/state/CatalogHit;
    .end local v12    # "$i$a$-forEach-CatalogAccountPagesKt$CatalogPage$search$1$1\\4\\320\\0":I
    :cond_7
    goto :goto_4

    .line 321
    :cond_8
    nop

    .line 78
    .end local v0    # "$this$forEach\\3":Ljava/lang/Iterable;
    .end local v8    # "$i$f$forEach\\3\\77":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 73
    .end local v5    # "r":Ljava/util/List;
    :catch_1
    move-exception v0

    .local v0, "e":Ljava/util/concurrent/CancellationException;
    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
