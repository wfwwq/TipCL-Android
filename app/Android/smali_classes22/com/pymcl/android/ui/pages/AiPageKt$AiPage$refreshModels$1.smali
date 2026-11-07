.class final Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$refreshModels$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AiPage.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/pages/AiPageKt;->AiPage$refreshModels(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/data/AiUiExtras;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Z)Lkotlinx/coroutines/Job;
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
    value = "SMAP\nAiPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiPage.kt\ncom/pymcl/android/ui/pages/AiPageKt$AiPage$refreshModels$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,517:1\n1#2:518\n777#3:519\n873#3,2:520\n*S KotlinDebug\n*F\n+ 1 AiPage.kt\ncom/pymcl/android/ui/pages/AiPageKt$AiPage$refreshModels$1\n*L\n103#1:519\n103#1:520,2\n*E\n"
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
    c = "com.pymcl.android.ui.pages.AiPageKt$AiPage$refreshModels$1"
    f = "AiPage.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1
    }
    l = {
        0x65,
        0x65
    }
    m = "invokeSuspend"
    n = {
        "$this$launch",
        "$this$invokeSuspend_u24lambda_u240\\1",
        "$this$launch",
        "$this$invokeSuspend_u24lambda_u240\\1"
    }
    nl = {
        0x65,
        0x65
    }
    s = {
        "L$0",
        "L$2",
        "L$0",
        "L$1"
    }
    v = 0x2
.end annotation


# instance fields
.field final synthetic $ai:Lcom/pymcl/android/data/AiUiExtras;

.field final synthetic $model$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $models$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $state:Lcom/pymcl/android/ui/state/AppState;

.field final synthetic $toast:Z

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/state/AppState;ZLandroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/data/AiUiExtras;",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Z",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$refreshModels$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$refreshModels$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$refreshModels$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-boolean p3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$refreshModels$1;->$toast:Z

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$refreshModels$1;->$model$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$refreshModels$1;->$models$delegate:Landroidx/compose/runtime/MutableState;

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

    new-instance v0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$refreshModels$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$refreshModels$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$refreshModels$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-boolean v3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$refreshModels$1;->$toast:Z

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$refreshModels$1;->$model$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v5, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$refreshModels$1;->$models$delegate:Landroidx/compose/runtime/MutableState;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$refreshModels$1;-><init>(Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/state/AppState;ZLandroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$refreshModels$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$refreshModels$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$refreshModels$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$refreshModels$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$refreshModels$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v1, p0

    iget-object v0, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$refreshModels$1;->L$0:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlinx/coroutines/CoroutineScope;

    .local v2, "$this$launch":Lkotlinx/coroutines/CoroutineScope;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 100
    iget v3, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$refreshModels$1;->label:I

    const/4 v4, 0x0

    packed-switch v3, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const/4 v0, 0x0

    .local v0, "$i$a$-runCatching-AiPageKt$AiPage$refreshModels$1$r$1\\1\\101\\0":I
    iget-object v3, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$refreshModels$1;->L$1:Ljava/lang/Object;

    check-cast v3, Lkotlinx/coroutines/CoroutineScope;

    .local v3, "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v4, p1

    goto :goto_1

    .end local v0    # "$i$a$-runCatching-AiPageKt$AiPage$refreshModels$1$r$1\\1\\101\\0":I
    .end local v3    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    :pswitch_1
    const/4 v3, 0x0

    .local v3, "$i$a$-runCatching-AiPageKt$AiPage$refreshModels$1$r$1\\1\\101\\0":I
    iget-object v5, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$refreshModels$1;->L$2:Ljava/lang/Object;

    check-cast v5, Lkotlinx/coroutines/CoroutineScope;

    .local v5, "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    iget-object v6, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$refreshModels$1;->L$1:Ljava/lang/Object;

    check-cast v6, Lcom/pymcl/android/ui/state/AppState;

    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move v7, v3

    move-object/from16 v3, p1

    goto :goto_0

    .end local v3    # "$i$a$-runCatching-AiPageKt$AiPage$refreshModels$1$r$1\\1\\101\\0":I
    .end local v5    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    :pswitch_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 101
    iget-object v3, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$refreshModels$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v6, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$refreshModels$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    :try_start_2
    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v5, v2

    .line 518
    .restart local v5    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    const/4 v7, 0x0

    .line 101
    .local v7, "$i$a$-runCatching-AiPageKt$AiPage$refreshModels$1$r$1\\1\\101\\0":I
    if-eqz v3, :cond_1

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$refreshModels$1;->L$0:Ljava/lang/Object;

    iput-object v6, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$refreshModels$1;->L$1:Ljava/lang/Object;

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$refreshModels$1;->L$2:Ljava/lang/Object;

    const/4 v8, 0x1

    iput v8, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$refreshModels$1;->label:I

    invoke-static {v3, v4, v1, v8, v4}, Lcom/pymcl/android/data/AiUiExtras;->models$default(Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/ai/AiSettings;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_0

    .line 100
    return-object v0

    .line 101
    :cond_0
    :goto_0
    check-cast v3, Ljava/util/List;

    if-nez v3, :cond_3

    :cond_1
    move-object v3, v5

    .end local v5    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    .local v3, "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    invoke-virtual {v6}, Lcom/pymcl/android/ui/state/AppState;->getApi()Lcom/pymcl/android/ui/state/LauncherUiApi;

    move-result-object v5

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$refreshModels$1;->L$0:Ljava/lang/Object;

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$refreshModels$1;->L$1:Ljava/lang/Object;

    iput-object v4, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$refreshModels$1;->L$2:Ljava/lang/Object;

    const/4 v4, 0x2

    iput v4, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$refreshModels$1;->label:I

    invoke-interface {v5, v1}, Lcom/pymcl/android/ui/state/LauncherUiApi;->aiListModels(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_2

    .line 100
    return-object v0

    .line 101
    :cond_2
    move v0, v7

    .end local v7    # "$i$a$-runCatching-AiPageKt$AiPage$refreshModels$1$r$1\\1\\101\\0":I
    .restart local v0    # "$i$a$-runCatching-AiPageKt$AiPage$refreshModels$1$r$1\\1\\101\\0":I
    :goto_1
    check-cast v4, Ljava/util/List;

    move-object v3, v4

    .end local v0    # "$i$a$-runCatching-AiPageKt$AiPage$refreshModels$1$r$1\\1\\101\\0":I
    .end local v3    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    :cond_3
    invoke-static {v3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 102
    .local v0, "r":Ljava/lang/Object;
    :goto_2
    iget-boolean v3, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$refreshModels$1;->$toast:Z

    iget-object v4, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$refreshModels$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v5, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$refreshModels$1;->$model$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v6, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$refreshModels$1;->$models$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v7

    const/4 v10, 0x0

    if-eqz v7, :cond_8

    move-object v11, v0

    check-cast v11, Ljava/util/List;

    .local v11, "list\\2":Ljava/util/List;
    const/4 v12, 0x0

    .line 103
    .local v12, "$i$a$-onSuccess-AiPageKt$AiPage$refreshModels$1$1\\2\\102\\0":I
    move-object v7, v11

    check-cast v7, Ljava/util/Collection;

    invoke-static {v5}, Lcom/pymcl/android/ui/pages/AiPageKt;->access$AiPage$lambda$8(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v7, v5}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    .local v5, "$this$filter\\3":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 519
    .local v7, "$i$f$filter\\3\\103":I
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    check-cast v8, Ljava/util/Collection;

    .local v8, "destination\\4":Ljava/util/Collection;
    move-object v9, v5

    .local v9, "$this$filterTo\\4":Ljava/lang/Iterable;
    const/4 v13, 0x0

    .line 520
    .local v13, "$i$f$filterTo\\4\\519":I
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :cond_4
    :goto_3
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_5

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    .local v15, "element\\4":Ljava/lang/Object;
    move-object/from16 v16, v15

    check-cast v16, Ljava/lang/String;

    .local v16, "it\\5":Ljava/lang/String;
    const/16 v17, 0x0

    .line 103
    .local v17, "$i$a$-filter-AiPageKt$AiPage$refreshModels$1$1$1\\5\\520\\2":I
    move-object/from16 v18, v16

    check-cast v18, Ljava/lang/CharSequence;

    invoke-static/range {v18 .. v18}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v18

    .line 520
    .end local v16    # "it\\5":Ljava/lang/String;
    .end local v17    # "$i$a$-filter-AiPageKt$AiPage$refreshModels$1$1$1\\5\\520\\2":I
    if-nez v18, :cond_4

    invoke-interface {v8, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 521
    .end local v15    # "element\\4":Ljava/lang/Object;
    :cond_5
    nop

    .end local v8    # "destination\\4":Ljava/util/Collection;
    .end local v9    # "$this$filterTo\\4":Ljava/lang/Iterable;
    .end local v13    # "$i$f$filterTo\\4\\519":I
    check-cast v8, Ljava/util/List;

    .line 519
    nop

    .end local v5    # "$this$filter\\3":Ljava/lang/Iterable;
    .end local v7    # "$i$f$filter\\3\\103":I
    check-cast v8, Ljava/lang/Iterable;

    .line 103
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->distinct(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v5

    invoke-static {v6, v5}, Lcom/pymcl/android/ui/pages/AiPageKt;->access$AiPage$lambda$6(Landroidx/compose/runtime/MutableState;Ljava/util/List;)V

    .line 104
    if-eqz v3, :cond_7

    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_6

    const-string v3, "\u7f51\u5173\u6ca1\u8fd4\u56de\u6a21\u578b\u5217\u8868\uff0c\u53ef\u76f4\u63a5\u624b\u586b\u6a21\u578b\u540d"

    new-array v5, v10, [Ljava/lang/Object;

    invoke-static {v3, v5}, Lcom/pymcl/android/ui/i18n/I18nKt;->tr(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v5, "info"

    const-string v6, "\u6ca1\u53d6\u5230\u6a21\u578b"

    invoke-virtual {v4, v6, v3, v5}, Lcom/pymcl/android/ui/state/AppState;->toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    :cond_6
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v5, "\u5171 {0} \u4e2a\u53ef\u7528\u6a21\u578b"

    invoke-static {v5, v3}, Lcom/pymcl/android/ui/i18n/I18nKt;->tr(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x4

    const/4 v9, 0x0

    const-string v5, "\u6a21\u578b\u5217\u8868\u5df2\u5237\u65b0"

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/pymcl/android/ui/state/AppState;->toast$default(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 105
    :cond_7
    :goto_4
    nop

    .line 102
    .end local v11    # "list\\2":Ljava/util/List;
    .end local v12    # "$i$a$-onSuccess-AiPageKt$AiPage$refreshModels$1$1\\2\\102\\0":I
    :cond_8
    iget-boolean v3, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$refreshModels$1;->$toast:Z

    iget-object v4, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$refreshModels$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v5, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$refreshModels$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    .line 105
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v6

    if-eqz v6, :cond_b

    .line 518
    .local v6, "e\\7":Ljava/lang/Throwable;
    const/4 v7, 0x0

    .line 105
    .local v7, "$i$a$-onFailure-AiPageKt$AiPage$refreshModels$1$2\\7\\105\\0":I
    if-eqz v3, :cond_b

    if-eqz v5, :cond_9

    invoke-interface {v5, v6}, Lcom/pymcl/android/data/AiUiExtras;->describeError(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_9

    .line 518
    nop

    .local v3, "it\\8":Ljava/lang/String;
    const/4 v5, 0x0

    .line 105
    .local v5, "$i$a$-let-AiPageKt$AiPage$refreshModels$1$2$1\\8\\105\\7":I
    sget-object v8, Lcom/pymcl/android/data/AiSettingsForm;->Companion:Lcom/pymcl/android/data/AiSettingsForm$Companion;

    invoke-virtual {v8, v3}, Lcom/pymcl/android/data/AiSettingsForm$Companion;->splitDetail(Ljava/lang/String;)Lkotlin/Pair;

    move-result-object v8

    invoke-virtual {v8}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    .end local v3    # "it\\8":Ljava/lang/String;
    .end local v5    # "$i$a$-let-AiPageKt$AiPage$refreshModels$1$2$1\\8\\105\\7":I
    if-nez v8, :cond_a

    :cond_9
    const-string v3, "\u6ca1\u80fd\u4ece\u7f51\u5173\u53d6\u5230\u6a21\u578b\u5217\u8868\uff0c\u53ef\u76f4\u63a5\u624b\u586b\u6a21\u578b\u540d"

    new-array v5, v10, [Ljava/lang/Object;

    invoke-static {v3, v5}, Lcom/pymcl/android/ui/i18n/I18nKt;->tr(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    :cond_a
    const-string v3, "error"

    const-string v5, "\u62c9\u53d6\u5931\u8d25"

    invoke-virtual {v4, v5, v8, v3}, Lcom/pymcl/android/ui/state/AppState;->toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    .end local v6    # "e\\7":Ljava/lang/Throwable;
    .end local v7    # "$i$a$-onFailure-AiPageKt$AiPage$refreshModels$1$2\\7\\105\\0":I
    :cond_b
    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
