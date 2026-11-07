.class final Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "CatalogAccountPages.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt;->CatalogPage(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/CatalogKind;Landroidx/compose/runtime/Composer;I)V
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
    value = "SMAP\nCatalogAccountPages.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatalogAccountPages.kt\ncom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,318:1\n1#2:319\n777#3:320\n873#3,2:321\n1739#3:323\n1814#3,3:324\n*S KotlinDebug\n*F\n+ 1 CatalogAccountPages.kt\ncom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1\n*L\n110#1:320\n110#1:321,2\n110#1:323\n110#1:324,3\n*E\n"
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
    c = "com.pymcl.android.ui.pages.CatalogAccountPagesKt$CatalogPage$1$1"
    f = "CatalogAccountPages.kt"
    i = {
        0x0,
        0x1,
        0x1
    }
    l = {
        0x6d,
        0x6e
    }
    m = "invokeSuspend"
    n = {
        "$this$LaunchedEffect",
        "$this$LaunchedEffect",
        "$this$invokeSuspend_u24lambda_u240\\1"
    }
    nl = {
        0x6e,
        0x140
    }
    s = {
        "L$0",
        "L$0",
        "L$2"
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

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/pymcl/android/ui/state/LatestOnly;Lcom/pymcl/android/ui/state/CatalogKind;Ljava/util/List;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;>;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Lcom/pymcl/android/ui/state/LatestOnly;",
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
            "Landroidx/compose/runtime/MutableIntState;",
            "Landroidx/compose/runtime/MutableIntState;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/pymcl/android/ui/state/CatalogHit;",
            ">;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->$favs$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->$gameVersions$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->$searchSeq:Lcom/pymcl/android/ui/state/LatestOnly;

    iput-object p5, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->$kind:Lcom/pymcl/android/ui/state/CatalogKind;

    iput-object p6, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->$sources:Ljava/util/List;

    iput-object p7, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->$hits$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p8, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->$error$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p9, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->$query$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p10, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->$source$delegate:Landroidx/compose/runtime/MutableIntState;

    iput-object p11, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->$gvIndex$delegate:Landroidx/compose/runtime/MutableIntState;

    iput-object p12, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->$category$delegate:Landroidx/compose/runtime/MutableIntState;

    iput-object p13, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->$favHits$delegate:Landroidx/compose/runtime/MutableState;

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

    new-instance v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;

    iget-object v2, v0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v3, v0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->$favs$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v4, v0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->$gameVersions$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v5, v0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->$searchSeq:Lcom/pymcl/android/ui/state/LatestOnly;

    iget-object v6, v0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->$kind:Lcom/pymcl/android/ui/state/CatalogKind;

    iget-object v7, v0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->$sources:Ljava/util/List;

    iget-object v8, v0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->$hits$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v9, v0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->$error$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v10, v0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->$query$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v11, v0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->$source$delegate:Landroidx/compose/runtime/MutableIntState;

    iget-object v12, v0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->$gvIndex$delegate:Landroidx/compose/runtime/MutableIntState;

    iget-object v13, v0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->$category$delegate:Landroidx/compose/runtime/MutableIntState;

    iget-object v14, v0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->$favHits$delegate:Landroidx/compose/runtime/MutableState;

    move-object/from16 v15, p2

    invoke-direct/range {v1 .. v15}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;-><init>(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/pymcl/android/ui/state/LatestOnly;Lcom/pymcl/android/ui/state/CatalogKind;Ljava/util/List;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    move-object v2, v1

    move-object/from16 v1, p1

    iput-object v1, v2, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lkotlin/coroutines/Continuation;

    return-object v2
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v1, p0

    iget-object v0, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->L$0:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlinx/coroutines/CoroutineScope;

    .local v2, "$this$LaunchedEffect":Lkotlinx/coroutines/CoroutineScope;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 108
    iget v3, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->label:I

    packed-switch v3, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const/4 v0, 0x0

    .local v0, "$i$a$-runCatching-CatalogAccountPagesKt$CatalogPage$1$1$1\\1\\110\\0":I
    iget-object v3, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->L$2:Ljava/lang/Object;

    check-cast v3, Lkotlinx/coroutines/CoroutineScope;

    .local v3, "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    iget-object v4, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->L$1:Ljava/lang/Object;

    check-cast v4, Landroidx/compose/runtime/MutableState;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v5, v3

    move-object/from16 v3, p1

    goto :goto_1

    .line 110
    .end local v0    # "$i$a$-runCatching-CatalogAccountPagesKt$CatalogPage$1$1$1\\1\\110\\0":I
    .end local v3    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    :catchall_0
    move-exception v0

    goto/16 :goto_4

    .line 108
    :pswitch_1
    iget-object v3, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->L$1:Ljava/lang/Object;

    check-cast v3, Landroidx/compose/runtime/MutableState;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v4, p1

    goto :goto_0

    :pswitch_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 109
    iget-object v3, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->$favs$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v4, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v4}, Lcom/pymcl/android/ui/state/AppState;->getApi()Lcom/pymcl/android/ui/state/LauncherUiApi;

    move-result-object v4

    move-object v5, v1

    check-cast v5, Lkotlin/coroutines/Continuation;

    iput-object v2, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->L$0:Ljava/lang/Object;

    iput-object v3, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->L$1:Ljava/lang/Object;

    const/4 v6, 0x1

    iput v6, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->label:I

    invoke-interface {v4, v5}, Lcom/pymcl/android/ui/state/LauncherUiApi;->favorites(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_0

    .line 108
    return-object v0

    .line 109
    :cond_0
    :goto_0
    check-cast v4, Ljava/util/Set;

    invoke-static {v3, v4}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt;->access$CatalogPage$lambda$29(Landroidx/compose/runtime/MutableState;Ljava/util/Set;)V

    .line 110
    iget-object v3, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v4, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->$gameVersions$delegate:Landroidx/compose/runtime/MutableState;

    :try_start_1
    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v5, v2

    .line 319
    .local v5, "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    const/4 v6, 0x0

    .line 110
    .local v6, "$i$a$-runCatching-CatalogAccountPagesKt$CatalogPage$1$1$1\\1\\110\\0":I
    invoke-virtual {v3}, Lcom/pymcl/android/ui/state/AppState;->getApi()Lcom/pymcl/android/ui/state/LauncherUiApi;

    move-result-object v3

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->L$0:Ljava/lang/Object;

    iput-object v4, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->L$1:Ljava/lang/Object;

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->L$2:Ljava/lang/Object;

    const/4 v7, 0x2

    iput v7, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->label:I

    invoke-interface {v3, v1}, Lcom/pymcl/android/ui/state/LauncherUiApi;->getVersionList(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_1

    .line 108
    return-object v0

    .line 110
    :cond_1
    move v0, v6

    .line 108
    .end local v6    # "$i$a$-runCatching-CatalogAccountPagesKt$CatalogPage$1$1$1\\1\\110\\0":I
    .restart local v0    # "$i$a$-runCatching-CatalogAccountPagesKt$CatalogPage$1$1$1\\1\\110\\0":I
    :goto_1
    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$filter\\2":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 320
    .local v6, "$i$f$filter\\2\\110":I
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    check-cast v7, Ljava/util/Collection;

    .local v7, "destination\\3":Ljava/util/Collection;
    move-object v8, v3

    .local v8, "$this$filterTo\\3":Ljava/lang/Iterable;
    const/4 v9, 0x0

    .line 321
    .local v9, "$i$f$filterTo\\3\\320":I
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_2
    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_3

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .local v11, "element\\3":Ljava/lang/Object;
    move-object v12, v11

    check-cast v12, Lcom/pymcl/android/ui/state/RemoteVersion;

    .local v12, "it\\4":Lcom/pymcl/android/ui/state/RemoteVersion;
    const/4 v13, 0x0

    .line 110
    .local v13, "$i$a$-filter-CatalogAccountPagesKt$CatalogPage$1$1$1$rel$1\\4\\321\\1":I
    invoke-virtual {v12}, Lcom/pymcl/android/ui/state/RemoteVersion;->getType()Ljava/lang/String;

    move-result-object v14

    const-string v15, "release"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    .line 321
    .end local v12    # "it\\4":Lcom/pymcl/android/ui/state/RemoteVersion;
    .end local v13    # "$i$a$-filter-CatalogAccountPagesKt$CatalogPage$1$1$1$rel$1\\4\\321\\1":I
    if-eqz v14, :cond_2

    invoke-interface {v7, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 322
    .end local v11    # "element\\3":Ljava/lang/Object;
    :cond_3
    nop

    .end local v7    # "destination\\3":Ljava/util/Collection;
    .end local v8    # "$this$filterTo\\3":Ljava/lang/Iterable;
    .end local v9    # "$i$f$filterTo\\3\\320":I
    check-cast v7, Ljava/util/List;

    .line 320
    nop

    .end local v3    # "$this$filter\\2":Ljava/lang/Iterable;
    .end local v6    # "$i$f$filter\\2\\110":I
    check-cast v7, Ljava/lang/Iterable;

    .line 110
    nop

    .local v7, "$this$map\\5":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 323
    .local v3, "$i$f$map\\5\\110":I
    new-instance v6, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v7, v8}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v6, Ljava/util/Collection;

    .local v6, "destination\\6":Ljava/util/Collection;
    move-object v8, v7

    .local v8, "$this$mapTo\\6":Ljava/lang/Iterable;
    const/4 v9, 0x0

    .line 324
    .local v9, "$i$f$mapTo\\6\\323":I
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_4

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .line 325
    .local v11, "item\\6":Ljava/lang/Object;
    move-object v12, v11

    check-cast v12, Lcom/pymcl/android/ui/state/RemoteVersion;

    .local v12, "it\\7":Lcom/pymcl/android/ui/state/RemoteVersion;
    const/4 v13, 0x0

    .line 110
    .local v13, "$i$a$-map-CatalogAccountPagesKt$CatalogPage$1$1$1$rel$2\\7\\325\\1":I
    invoke-virtual {v12}, Lcom/pymcl/android/ui/state/RemoteVersion;->getId()Ljava/lang/String;

    move-result-object v14

    .line 325
    .end local v12    # "it\\7":Lcom/pymcl/android/ui/state/RemoteVersion;
    .end local v13    # "$i$a$-map-CatalogAccountPagesKt$CatalogPage$1$1$1$rel$2\\7\\325\\1":I
    invoke-interface {v6, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 326
    .end local v11    # "item\\6":Ljava/lang/Object;
    :cond_4
    nop

    .end local v6    # "destination\\6":Ljava/util/Collection;
    .end local v8    # "$this$mapTo\\6":Ljava/lang/Iterable;
    .end local v9    # "$i$f$mapTo\\6\\323":I
    check-cast v6, Ljava/util/List;

    .line 323
    nop

    .end local v3    # "$i$f$map\\5\\110":I
    .end local v7    # "$this$map\\5":Ljava/lang/Iterable;
    check-cast v6, Ljava/lang/Iterable;

    .line 110
    const/16 v3, 0x1e

    invoke-static {v6, v3}, Lkotlin/collections/CollectionsKt;->take(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v3

    .local v3, "rel\\1":Ljava/util/List;
    const-string v6, "\u5168\u90e8"

    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/util/Collection;

    move-object v7, v3

    check-cast v7, Ljava/lang/Iterable;

    invoke-static {v6, v7}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v6

    invoke-static {v4, v6}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt;->access$CatalogPage$lambda$17(Landroidx/compose/runtime/MutableState;Ljava/util/List;)V

    .end local v0    # "$i$a$-runCatching-CatalogAccountPagesKt$CatalogPage$1$1$1\\1\\110\\0":I
    .end local v3    # "rel\\1":Ljava/util/List;
    .end local v5    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_5

    :goto_4
    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    :goto_5
    iget-object v3, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v4, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->$searchSeq:Lcom/pymcl/android/ui/state/LatestOnly;

    iget-object v5, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->$kind:Lcom/pymcl/android/ui/state/CatalogKind;

    iget-object v6, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->$sources:Ljava/util/List;

    iget-object v7, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->$hits$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v8, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->$error$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v9, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->$query$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v10, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->$source$delegate:Landroidx/compose/runtime/MutableIntState;

    iget-object v11, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->$gameVersions$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v12, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->$gvIndex$delegate:Landroidx/compose/runtime/MutableIntState;

    iget-object v13, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->$category$delegate:Landroidx/compose/runtime/MutableIntState;

    iget-object v14, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->$favs$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v15, v1, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$1$1;->$favHits$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static/range {v3 .. v15}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt;->access$CatalogPage$search(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/LatestOnly;Lcom/pymcl/android/ui/state/CatalogKind;Ljava/util/List;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)Lkotlinx/coroutines/Job;

    .line 112
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
