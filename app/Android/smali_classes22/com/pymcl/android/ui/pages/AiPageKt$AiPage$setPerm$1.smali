.class final Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setPerm$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AiPage.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/pages/AiPageKt;->AiPage$setPerm(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/data/AiUiExtras;Landroidx/compose/runtime/MutableIntState;I)Lkotlinx/coroutines/Job;
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
    value = "SMAP\nAiPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiPage.kt\ncom/pymcl/android/ui/pages/AiPageKt$AiPage$setPerm$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,517:1\n1#2:518\n*E\n"
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
    c = "com.pymcl.android.ui.pages.AiPageKt$AiPage$setPerm$1"
    f = "AiPage.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1
    }
    l = {
        0x77,
        0x77
    }
    m = "invokeSuspend"
    n = {
        "$this$launch",
        "$this$invokeSuspend_u24lambda_u240\\1",
        "$this$launch",
        "$this$invokeSuspend_u24lambda_u240\\1"
    }
    nl = {
        0x77,
        0x77
    }
    s = {
        "L$0",
        "L$1",
        "L$0",
        "L$1"
    }
    v = 0x2
.end annotation


# instance fields
.field final synthetic $ai:Lcom/pymcl/android/data/AiUiExtras;

.field final synthetic $i:I

.field final synthetic $perm$delegate:Landroidx/compose/runtime/MutableIntState;

.field final synthetic $state:Lcom/pymcl/android/ui/state/AppState;

.field I$0:I

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(ILcom/pymcl/android/data/AiUiExtras;Landroidx/compose/runtime/MutableIntState;Lcom/pymcl/android/ui/state/AppState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/pymcl/android/data/AiUiExtras;",
            "Landroidx/compose/runtime/MutableIntState;",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setPerm$1;",
            ">;)V"
        }
    .end annotation

    iput p1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setPerm$1;->$i:I

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setPerm$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setPerm$1;->$perm$delegate:Landroidx/compose/runtime/MutableIntState;

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setPerm$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6
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

    new-instance v0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setPerm$1;

    iget v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setPerm$1;->$i:I

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setPerm$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setPerm$1;->$perm$delegate:Landroidx/compose/runtime/MutableIntState;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setPerm$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setPerm$1;-><init>(ILcom/pymcl/android/data/AiUiExtras;Landroidx/compose/runtime/MutableIntState;Lcom/pymcl/android/ui/state/AppState;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setPerm$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setPerm$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setPerm$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setPerm$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setPerm$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v1, p0

    iget-object v0, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setPerm$1;->L$0:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlinx/coroutines/CoroutineScope;

    .local v2, "$this$launch":Lkotlinx/coroutines/CoroutineScope;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 115
    iget v3, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setPerm$1;->label:I

    packed-switch v3, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const/4 v0, 0x0

    .local v0, "$i$a$-runCatching-AiPageKt$AiPage$setPerm$1$1\\1\\119\\0":I
    iget-object v3, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setPerm$1;->L$1:Ljava/lang/Object;

    check-cast v3, Lkotlinx/coroutines/CoroutineScope;

    .local v3, "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_1

    .end local v0    # "$i$a$-runCatching-AiPageKt$AiPage$setPerm$1$1\\1\\119\\0":I
    .end local v3    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    :pswitch_1
    const/4 v3, 0x0

    .local v3, "$i$a$-runCatching-AiPageKt$AiPage$setPerm$1$1\\1\\119\\0":I
    iget v4, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setPerm$1;->I$0:I

    iget-object v5, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setPerm$1;->L$2:Ljava/lang/Object;

    check-cast v5, Lcom/pymcl/android/data/AiUiExtras;

    iget-object v6, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setPerm$1;->L$1:Ljava/lang/Object;

    check-cast v6, Lkotlinx/coroutines/CoroutineScope;

    .local v6, "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v7, v5

    move v5, v4

    move-object/from16 v4, p1

    goto :goto_0

    .line 119
    .end local v3    # "$i$a$-runCatching-AiPageKt$AiPage$setPerm$1$1\\1\\119\\0":I
    .end local v6    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    :catchall_0
    move-exception v0

    goto/16 :goto_2

    .line 115
    :pswitch_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 116
    iget v3, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setPerm$1;->$i:I

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-ltz v3, :cond_0

    iget v3, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setPerm$1;->$i:I

    sget-object v6, Lcom/pymcl/ai/Permission;->INSTANCE:Lcom/pymcl/ai/Permission;

    invoke-virtual {v6}, Lcom/pymcl/ai/Permission;->getUI_MODES()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v6

    if-ge v3, v6, :cond_0

    move v5, v4

    :cond_0
    if-nez v5, :cond_1

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 117
    :cond_1
    iget-object v3, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setPerm$1;->$perm$delegate:Landroidx/compose/runtime/MutableIntState;

    iget v5, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setPerm$1;->$i:I

    invoke-static {v3, v5}, Lcom/pymcl/android/ui/pages/AiPageKt;->access$AiPage$lambda$12(Landroidx/compose/runtime/MutableIntState;I)V

    .line 118
    iget-object v3, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setPerm$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    if-nez v3, :cond_2

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 119
    :cond_2
    iget-object v5, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setPerm$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iget v3, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setPerm$1;->$i:I

    :try_start_2
    sget-object v6, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v6, v2

    .line 518
    .restart local v6    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    const/4 v7, 0x0

    .line 119
    .local v7, "$i$a$-runCatching-AiPageKt$AiPage$setPerm$1$1\\1\\119\\0":I
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setPerm$1;->L$0:Ljava/lang/Object;

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setPerm$1;->L$1:Ljava/lang/Object;

    iput-object v5, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setPerm$1;->L$2:Ljava/lang/Object;

    iput v3, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setPerm$1;->I$0:I

    iput v4, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setPerm$1;->label:I

    invoke-interface {v5, v1}, Lcom/pymcl/android/data/AiUiExtras;->settings(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_3

    .line 115
    return-object v0

    .line 119
    :cond_3
    move-object/from16 v25, v5

    move v5, v3

    move v3, v7

    move-object/from16 v7, v25

    .end local v7    # "$i$a$-runCatching-AiPageKt$AiPage$setPerm$1$1\\1\\119\\0":I
    .restart local v3    # "$i$a$-runCatching-AiPageKt$AiPage$setPerm$1$1\\1\\119\\0":I
    :goto_0
    move-object v8, v4

    check-cast v8, Lcom/pymcl/ai/AiSettings;

    sget-object v4, Lcom/pymcl/ai/Permission;->INSTANCE:Lcom/pymcl/ai/Permission;

    invoke-virtual {v4}, Lcom/pymcl/ai/Permission;->getUI_MODES()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v18, v4

    check-cast v18, Ljava/lang/String;

    const/16 v23, 0x1dff

    const/16 v24, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v8 .. v24}, Lcom/pymcl/ai/AiSettings;->copy$default(Lcom/pymcl/ai/AiSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;DLjava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Lcom/pymcl/ai/AiSettings;

    move-result-object v4

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setPerm$1;->L$0:Ljava/lang/Object;

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setPerm$1;->L$1:Ljava/lang/Object;

    const/4 v5, 0x0

    iput-object v5, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setPerm$1;->L$2:Ljava/lang/Object;

    const/4 v5, 0x2

    iput v5, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setPerm$1;->label:I

    invoke-interface {v7, v4, v1}, Lcom/pymcl/android/data/AiUiExtras;->saveSettings(Lcom/pymcl/ai/AiSettings;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_4

    .line 115
    return-object v0

    .line 119
    :cond_4
    move v0, v3

    move-object v3, v6

    .end local v6    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    .restart local v0    # "$i$a$-runCatching-AiPageKt$AiPage$setPerm$1$1\\1\\119\\0":I
    .local v3, "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    :goto_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .end local v0    # "$i$a$-runCatching-AiPageKt$AiPage$setPerm$1$1\\1\\119\\0":I
    .end local v3    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    :goto_2
    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_3
    iget-object v3, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setPerm$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 518
    .local v0, "it\\3":Ljava/lang/Throwable;
    const/4 v4, 0x0

    .line 119
    .local v4, "$i$a$-onFailure-AiPageKt$AiPage$setPerm$1$2\\3\\119\\0":I
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_5

    const-string v5, ""

    :cond_5
    const-string v6, "error"

    const-string v7, "\u6743\u9650\u8bbe\u7f6e\u4fdd\u5b58\u5931\u8d25"

    invoke-virtual {v3, v7, v5, v6}, Lcom/pymcl/android/ui/state/AppState;->toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    .end local v0    # "it\\3":Ljava/lang/Throwable;
    .end local v4    # "$i$a$-onFailure-AiPageKt$AiPage$setPerm$1$2\\3\\119\\0":I
    :cond_6
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
