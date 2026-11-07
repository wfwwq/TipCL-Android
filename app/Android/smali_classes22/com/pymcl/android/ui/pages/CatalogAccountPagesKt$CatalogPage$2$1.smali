.class final Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$2$1;
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
    value = "SMAP\nCatalogAccountPages.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatalogAccountPages.kt\ncom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,318:1\n1#2:319\n*E\n"
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
    c = "com.pymcl.android.ui.pages.CatalogAccountPagesKt$CatalogPage$2$1"
    f = "CatalogAccountPages.kt"
    i = {
        0x0,
        0x1,
        0x1
    }
    l = {
        0x72,
        0x73
    }
    m = "invokeSuspend"
    n = {
        "$this$LaunchedEffect",
        "$this$LaunchedEffect",
        "$this$invokeSuspend_u24lambda_u240\\1"
    }
    nl = {
        0x73,
        0x73
    }
    s = {
        "L$0",
        "L$0",
        "L$1"
    }
    v = 0x2
.end annotation


# instance fields
.field final synthetic $inst:Ljava/lang/String;

.field final synthetic $installed$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/InstalledEntry;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $kind:Lcom/pymcl/android/ui/state/CatalogKind;

.field final synthetic $state:Lcom/pymcl/android/ui/state/AppState;

.field final synthetic $ver:Ljava/lang/String;

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/CatalogKind;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Lcom/pymcl/android/ui/state/CatalogKind;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/InstalledEntry;",
            ">;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$2$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$2$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$2$1;->$kind:Lcom/pymcl/android/ui/state/CatalogKind;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$2$1;->$inst:Ljava/lang/String;

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$2$1;->$ver:Ljava/lang/String;

    iput-object p5, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$2$1;->$installed$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7
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

    new-instance v0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$2$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$2$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$2$1;->$kind:Lcom/pymcl/android/ui/state/CatalogKind;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$2$1;->$inst:Ljava/lang/String;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$2$1;->$ver:Ljava/lang/String;

    iget-object v5, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$2$1;->$installed$delegate:Landroidx/compose/runtime/MutableState;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$2$1;-><init>(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/CatalogKind;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$2$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$2$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$2$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$2$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9
    .param p1, "$result"    # Ljava/lang/Object;

    iget-object v0, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$2$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlinx/coroutines/CoroutineScope;

    .local v0, "$this$LaunchedEffect":Lkotlinx/coroutines/CoroutineScope;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 113
    iget v2, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$2$1;->label:I

    packed-switch v2, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    const/4 v1, 0x0

    .local v1, "$i$a$-runCatching-CatalogAccountPagesKt$CatalogPage$2$1$1\\1\\115\\0":I
    iget-object v2, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$2$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lkotlinx/coroutines/CoroutineScope;

    .local v2, "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v6, v2

    move-object v2, p1

    goto/16 :goto_1

    .line 115
    .end local v1    # "$i$a$-runCatching-CatalogAccountPagesKt$CatalogPage$2$1$1\\1\\115\\0":I
    .end local v2    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    :catchall_0
    move-exception v1

    goto/16 :goto_2

    .line 113
    :pswitch_1
    iget-object v2, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$2$1;->L$1:Ljava/lang/Object;

    check-cast v2, Landroidx/compose/runtime/MutableState;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v3, p1

    goto :goto_0

    :pswitch_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 114
    iget-object v2, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$2$1;->$installed$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$2$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v3}, Lcom/pymcl/android/ui/state/AppState;->getApi()Lcom/pymcl/android/ui/state/LauncherUiApi;

    move-result-object v3

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$2$1;->$kind:Lcom/pymcl/android/ui/state/CatalogKind;

    invoke-virtual {v4}, Lcom/pymcl/android/ui/state/CatalogKind;->getKey()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$2$1;->$inst:Ljava/lang/String;

    iget-object v6, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$2$1;->$ver:Ljava/lang/String;

    move-object v7, p0

    check-cast v7, Lkotlin/coroutines/Continuation;

    iput-object v0, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$2$1;->L$0:Ljava/lang/Object;

    iput-object v2, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$2$1;->L$1:Ljava/lang/Object;

    const/4 v8, 0x1

    iput v8, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$2$1;->label:I

    invoke-interface {v3, v4, v5, v6, v7}, Lcom/pymcl/android/ui/state/LauncherUiApi;->getInstalled(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_0

    .line 113
    return-object v1

    .line 114
    :cond_0
    :goto_0
    check-cast v3, Ljava/util/List;

    invoke-static {v2, v3}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt;->access$CatalogPage$lambda$26(Landroidx/compose/runtime/MutableState;Ljava/util/List;)V

    .line 115
    iget-object v2, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$2$1;->$kind:Lcom/pymcl/android/ui/state/CatalogKind;

    sget-object v3, Lcom/pymcl/android/ui/state/CatalogKind;->World:Lcom/pymcl/android/ui/state/CatalogKind;

    if-eq v2, v3, :cond_4

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$2$1;->$kind:Lcom/pymcl/android/ui/state/CatalogKind;

    sget-object v3, Lcom/pymcl/android/ui/state/CatalogKind;->Modpack:Lcom/pymcl/android/ui/state/CatalogKind;

    if-eq v2, v3, :cond_4

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$2$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$2$1;->$kind:Lcom/pymcl/android/ui/state/CatalogKind;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$2$1;->$inst:Ljava/lang/String;

    iget-object v5, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$2$1;->$ver:Ljava/lang/String;

    :try_start_1
    sget-object v6, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v6, v0

    .line 319
    .local v6, "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    const/4 v7, 0x0

    .line 115
    .local v7, "$i$a$-runCatching-CatalogAccountPagesKt$CatalogPage$2$1$1\\1\\115\\0":I
    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/AppState;->getApi()Lcom/pymcl/android/ui/state/LauncherUiApi;

    move-result-object v2

    invoke-static {v2}, Lcom/pymcl/android/ui/state/LauncherUiApiKt;->getExt(Lcom/pymcl/android/ui/state/LauncherUiApi;)Lcom/pymcl/android/ui/state/LauncherUiApiExt;

    move-result-object v2

    invoke-virtual {v3}, Lcom/pymcl/android/ui/state/CatalogKind;->getKey()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$2$1;->L$0:Ljava/lang/Object;

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$2$1;->L$1:Ljava/lang/Object;

    const/4 v8, 0x2

    iput v8, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$2$1;->label:I

    invoke-interface {v2, v3, v4, v5, p0}, Lcom/pymcl/android/ui/state/LauncherUiApiExt;->identifyInstalled(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_1

    .line 113
    return-object v1

    .line 115
    :cond_1
    move v1, v7

    .end local v7    # "$i$a$-runCatching-CatalogAccountPagesKt$CatalogPage$2$1$1\\1\\115\\0":I
    .restart local v1    # "$i$a$-runCatching-CatalogAccountPagesKt$CatalogPage$2$1$1\\1\\115\\0":I
    :goto_1
    check-cast v2, Ljava/util/List;

    .end local v1    # "$i$a$-runCatching-CatalogAccountPagesKt$CatalogPage$2$1$1\\1\\115\\0":I
    .end local v6    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :goto_2
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :goto_3
    invoke-static {v1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    move-object v1, v3

    :cond_2
    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_4

    move-object v2, v1

    .line 319
    .local v2, "it\\2":Ljava/util/List;
    const/4 v4, 0x0

    .line 115
    .local v4, "$i$a$-takeIf-CatalogAccountPagesKt$CatalogPage$2$1$2\\2\\115\\0":I
    move-object v5, v2

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    .end local v2    # "it\\2":Ljava/util/List;
    .end local v4    # "$i$a$-takeIf-CatalogAccountPagesKt$CatalogPage$2$1$2\\2\\115\\0":I
    if-nez v5, :cond_3

    move-object v3, v1

    :cond_3
    if-eqz v3, :cond_4

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$2$1;->$installed$delegate:Landroidx/compose/runtime/MutableState;

    .line 319
    .local v3, "it\\3":Ljava/util/List;
    const/4 v2, 0x0

    .line 115
    .local v2, "$i$a$-let-CatalogAccountPagesKt$CatalogPage$2$1$3\\3\\115\\0":I
    invoke-static {v1, v3}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt;->access$CatalogPage$lambda$26(Landroidx/compose/runtime/MutableState;Ljava/util/List;)V

    .line 116
    .end local v2    # "$i$a$-let-CatalogAccountPagesKt$CatalogPage$2$1$3\\3\\115\\0":I
    .end local v3    # "it\\3":Ljava/util/List;
    :cond_4
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
