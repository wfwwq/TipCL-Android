.class final Lcom/pymcl/android/ui/pages/GamePagesKt$VersionPage$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "GamePages.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/pages/GamePagesKt;->VersionPage(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/Composer;I)V
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
    value = "SMAP\nGamePages.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GamePages.kt\ncom/pymcl/android/ui/pages/GamePagesKt$VersionPage$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,303:1\n1#2:304\n*E\n"
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
    c = "com.pymcl.android.ui.pages.GamePagesKt$VersionPage$2$1"
    f = "GamePages.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0x2e
    }
    m = "invokeSuspend"
    n = {
        "$this$LaunchedEffect",
        "$this$invokeSuspend_u24lambda_u240\\1"
    }
    nl = {
        0x2e
    }
    s = {
        "L$0",
        "L$1"
    }
    v = 0x2
.end annotation


# instance fields
.field final synthetic $loader$delegate:Landroidx/compose/runtime/MutableIntState;

.field final synthetic $loaderLoaded$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $loaderVer$delegate:Landroidx/compose/runtime/MutableIntState;

.field final synthetic $loaderVersions$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $loaders:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $selected$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
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
.method constructor <init>(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Lcom/pymcl/android/ui/state/AppState;Ljava/util/List;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Landroidx/compose/runtime/MutableIntState;",
            "Landroidx/compose/runtime/MutableIntState;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/pages/GamePagesKt$VersionPage$2$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$VersionPage$2$1;->$loaderLoaded$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$VersionPage$2$1;->$loaderVersions$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$VersionPage$2$1;->$loaderVer$delegate:Landroidx/compose/runtime/MutableIntState;

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$VersionPage$2$1;->$loader$delegate:Landroidx/compose/runtime/MutableIntState;

    iput-object p5, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$VersionPage$2$1;->$selected$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$VersionPage$2$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p7, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$VersionPage$2$1;->$loaders:Ljava/util/List;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p8}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 9
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

    new-instance v0, Lcom/pymcl/android/ui/pages/GamePagesKt$VersionPage$2$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$VersionPage$2$1;->$loaderLoaded$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$VersionPage$2$1;->$loaderVersions$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$VersionPage$2$1;->$loaderVer$delegate:Landroidx/compose/runtime/MutableIntState;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$VersionPage$2$1;->$loader$delegate:Landroidx/compose/runtime/MutableIntState;

    iget-object v5, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$VersionPage$2$1;->$selected$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v6, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$VersionPage$2$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v7, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$VersionPage$2$1;->$loaders:Ljava/util/List;

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lcom/pymcl/android/ui/pages/GamePagesKt$VersionPage$2$1;-><init>(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Lcom/pymcl/android/ui/state/AppState;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/pymcl/android/ui/pages/GamePagesKt$VersionPage$2$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/GamePagesKt$VersionPage$2$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/GamePagesKt$VersionPage$2$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/pages/GamePagesKt$VersionPage$2$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/pages/GamePagesKt$VersionPage$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10
    .param p1, "$result"    # Ljava/lang/Object;

    iget-object v0, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$VersionPage$2$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlinx/coroutines/CoroutineScope;

    .local v0, "$this$LaunchedEffect":Lkotlinx/coroutines/CoroutineScope;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 44
    iget v2, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$VersionPage$2$1;->label:I

    const/4 v3, 0x1

    packed-switch v2, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    const/4 v1, 0x0

    .local v1, "$i$a$-runCatching-GamePagesKt$VersionPage$2$1$1\\1\\46\\0":I
    iget-object v2, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$VersionPage$2$1;->L$2:Ljava/lang/Object;

    check-cast v2, Landroidx/compose/runtime/MutableState;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$VersionPage$2$1;->L$1:Ljava/lang/Object;

    check-cast v4, Lkotlinx/coroutines/CoroutineScope;

    .local v4, "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v8, v4

    move-object v4, p1

    goto :goto_0

    .line 46
    .end local v1    # "$i$a$-runCatching-GamePagesKt$VersionPage$2$1$1\\1\\46\\0":I
    .end local v4    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    :catchall_0
    move-exception v1

    goto :goto_1

    .line 44
    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 45
    iget-object v2, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$VersionPage$2$1;->$loaderLoaded$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v4, 0x0

    invoke-static {v2, v4}, Lcom/pymcl/android/ui/pages/GamePagesKt;->access$VersionPage$lambda$27(Landroidx/compose/runtime/MutableState;Z)V

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$VersionPage$2$1;->$loaderVersions$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v5

    invoke-static {v2, v5}, Lcom/pymcl/android/ui/pages/GamePagesKt;->access$VersionPage$lambda$20(Landroidx/compose/runtime/MutableState;Ljava/util/List;)V

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$VersionPage$2$1;->$loaderVer$delegate:Landroidx/compose/runtime/MutableIntState;

    invoke-static {v2, v4}, Lcom/pymcl/android/ui/pages/GamePagesKt;->access$VersionPage$lambda$23(Landroidx/compose/runtime/MutableIntState;I)V

    .line 46
    iget-object v2, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$VersionPage$2$1;->$loaderVersions$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$VersionPage$2$1;->$loader$delegate:Landroidx/compose/runtime/MutableIntState;

    invoke-static {v4}, Lcom/pymcl/android/ui/pages/GamePagesKt;->access$VersionPage$lambda$16(Landroidx/compose/runtime/MutableIntState;)I

    move-result v4

    if-eqz v4, :cond_3

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$VersionPage$2$1;->$selected$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v4}, Lcom/pymcl/android/ui/pages/GamePagesKt;->access$VersionPage$lambda$13(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_0

    goto :goto_3

    :cond_0
    iget-object v4, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$VersionPage$2$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v5, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$VersionPage$2$1;->$loaders:Ljava/util/List;

    iget-object v6, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$VersionPage$2$1;->$loader$delegate:Landroidx/compose/runtime/MutableIntState;

    iget-object v7, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$VersionPage$2$1;->$selected$delegate:Landroidx/compose/runtime/MutableState;

    :try_start_1
    sget-object v8, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v8, v0

    .line 304
    .local v8, "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    const/4 v9, 0x0

    .line 46
    .local v9, "$i$a$-runCatching-GamePagesKt$VersionPage$2$1$1\\1\\46\\0":I
    invoke-virtual {v4}, Lcom/pymcl/android/ui/state/AppState;->getApi()Lcom/pymcl/android/ui/state/LauncherUiApi;

    move-result-object v4

    invoke-static {v6}, Lcom/pymcl/android/ui/pages/GamePagesKt;->access$VersionPage$lambda$16(Landroidx/compose/runtime/MutableIntState;)I

    move-result v6

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-static {v7}, Lcom/pymcl/android/ui/pages/GamePagesKt;->access$VersionPage$lambda$13(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$VersionPage$2$1;->L$0:Ljava/lang/Object;

    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$VersionPage$2$1;->L$1:Ljava/lang/Object;

    iput-object v2, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$VersionPage$2$1;->L$2:Ljava/lang/Object;

    iput v3, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$VersionPage$2$1;->label:I

    invoke-interface {v4, v5, v6, p0}, Lcom/pymcl/android/ui/state/LauncherUiApi;->listLoaderVersions(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_1

    .line 44
    return-object v1

    .line 46
    :cond_1
    move v1, v9

    .end local v9    # "$i$a$-runCatching-GamePagesKt$VersionPage$2$1$1\\1\\46\\0":I
    .restart local v1    # "$i$a$-runCatching-GamePagesKt$VersionPage$2$1$1\\1\\46\\0":I
    :goto_0
    check-cast v4, Ljava/util/List;

    .end local v1    # "$i$a$-runCatching-GamePagesKt$VersionPage$2$1$1\\1\\46\\0":I
    .end local v8    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    invoke-static {v4}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :goto_1
    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :goto_2
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    move-object v1, v4

    :cond_2
    check-cast v1, Ljava/util/List;

    goto :goto_4

    :cond_3
    :goto_3
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    :goto_4
    invoke-static {v2, v1}, Lcom/pymcl/android/ui/pages/GamePagesKt;->access$VersionPage$lambda$20(Landroidx/compose/runtime/MutableState;Ljava/util/List;)V

    .line 47
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$VersionPage$2$1;->$loaderLoaded$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1, v3}, Lcom/pymcl/android/ui/pages/GamePagesKt;->access$VersionPage$lambda$27(Landroidx/compose/runtime/MutableState;Z)V

    .line 48
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
