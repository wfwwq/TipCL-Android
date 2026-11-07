.class final Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AiPage.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/pages/AiPageKt;->AiPage$setModel(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/data/AiUiExtras;Landroidx/compose/runtime/MutableState;Ljava/lang/String;)Lkotlinx/coroutines/Job;
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
    value = "SMAP\nAiPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiPage.kt\ncom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,517:1\n1#2:518\n*E\n"
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
    c = "com.pymcl.android.ui.pages.AiPageKt$AiPage$setModel$1"
    f = "AiPage.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1
    }
    l = {
        0x6e,
        0x6e
    }
    m = "invokeSuspend"
    n = {
        "$this$launch",
        "$this$invokeSuspend_u24lambda_u240\\1",
        "$this$launch",
        "$this$invokeSuspend_u24lambda_u240\\1"
    }
    nl = {
        0x6e,
        0x6e
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

.field final synthetic $m:Ljava/lang/String;

.field final synthetic $model$delegate:Landroidx/compose/runtime/MutableState;
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

.field L$3:Ljava/lang/Object;

.field label:I


# direct methods
.method public static synthetic $r8$lambda$zN_arRYxDUqAhi7N_OT4Rw9qeN0(Ljava/lang/String;Lcom/pymcl/android/ui/state/UiSettings;)Lcom/pymcl/android/ui/state/UiSettings;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1;->invokeSuspend$lambda$1$0(Ljava/lang/String;Lcom/pymcl/android/ui/state/UiSettings;)Lcom/pymcl/android/ui/state/UiSettings;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/pymcl/android/data/AiUiExtras;Ljava/lang/String;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/data/AiUiExtras;",
            "Ljava/lang/String;",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1;->$m:Ljava/lang/String;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1;->$model$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method private static final invokeSuspend$lambda$1$0(Ljava/lang/String;Lcom/pymcl/android/ui/state/UiSettings;)Lcom/pymcl/android/ui/state/UiSettings;
    .locals 59
    .param p0, "$m"    # Ljava/lang/String;
    .param p1, "it"    # Lcom/pymcl/android/ui/state/UiSettings;

    .line 111
    const v57, 0x3ffbff

    const/16 v58, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, -0x1

    move-object/from16 v44, p0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v58}, Lcom/pymcl/android/ui/state/UiSettings;->copy$default(Lcom/pymcl/android/ui/state/UiSettings;ZILjava/lang/String;IIZIZZIZILjava/lang/String;Ljava/lang/String;ZIIIIIIIIZILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;IIILjava/lang/String;ZZZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;IZIILjava/lang/Object;)Lcom/pymcl/android/ui/state/UiSettings;

    move-result-object v0

    return-object v0
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

    new-instance v0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1;->$m:Ljava/lang/String;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1;->$model$delegate:Landroidx/compose/runtime/MutableState;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1;-><init>(Lcom/pymcl/android/data/AiUiExtras;Ljava/lang/String;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v1, p0

    iget-object v0, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1;->L$0:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlinx/coroutines/CoroutineScope;

    .local v2, "$this$launch":Lkotlinx/coroutines/CoroutineScope;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 108
    iget v3, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1;->label:I

    packed-switch v3, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const/4 v0, 0x0

    .local v0, "$i$a$-runCatching-AiPageKt$AiPage$setModel$1$1\\1\\110\\0":I
    iget-object v3, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1;->L$1:Ljava/lang/Object;

    check-cast v3, Lkotlinx/coroutines/CoroutineScope;

    .local v3, "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_1

    .end local v0    # "$i$a$-runCatching-AiPageKt$AiPage$setModel$1$1\\1\\110\\0":I
    .end local v3    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    :pswitch_1
    const/4 v3, 0x0

    .local v3, "$i$a$-runCatching-AiPageKt$AiPage$setModel$1$1\\1\\110\\0":I
    iget-object v4, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1;->L$3:Ljava/lang/Object;

    check-cast v4, Lcom/pymcl/android/data/AiUiExtras;

    iget-object v5, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1;->L$2:Ljava/lang/Object;

    check-cast v5, Lkotlinx/coroutines/CoroutineScope;

    .local v5, "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    iget-object v6, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1;->L$1:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object/from16 v7, p1

    move-object v12, v6

    goto :goto_0

    .line 110
    .end local v3    # "$i$a$-runCatching-AiPageKt$AiPage$setModel$1$1\\1\\110\\0":I
    .end local v5    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    :catchall_0
    move-exception v0

    goto/16 :goto_2

    .line 108
    :pswitch_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 109
    iget-object v3, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    if-eqz v3, :cond_6

    iget-object v3, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1;->$m:Ljava/lang/String;

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_4

    .line 110
    :cond_0
    iget-object v4, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v6, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1;->$m:Ljava/lang/String;

    :try_start_2
    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v3, v2

    .line 518
    .local v3, "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    const/4 v5, 0x0

    .line 110
    .local v5, "$i$a$-runCatching-AiPageKt$AiPage$setModel$1$1\\1\\110\\0":I
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1;->L$0:Ljava/lang/Object;

    iput-object v6, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1;->L$1:Ljava/lang/Object;

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1;->L$2:Ljava/lang/Object;

    iput-object v4, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1;->L$3:Ljava/lang/Object;

    const/4 v7, 0x1

    iput v7, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1;->label:I

    invoke-interface {v4, v1}, Lcom/pymcl/android/data/AiUiExtras;->settings(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v0, :cond_1

    .line 108
    return-object v0

    .line 110
    :cond_1
    move v12, v5

    move-object v5, v3

    move v3, v12

    move-object v12, v6

    .local v3, "$i$a$-runCatching-AiPageKt$AiPage$setModel$1$1\\1\\110\\0":I
    .local v5, "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    :goto_0
    move-object v6, v7

    check-cast v6, Lcom/pymcl/ai/AiSettings;

    const/16 v21, 0x1fdf

    const/16 v22, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v6 .. v22}, Lcom/pymcl/ai/AiSettings;->copy$default(Lcom/pymcl/ai/AiSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;DLjava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Lcom/pymcl/ai/AiSettings;

    move-result-object v6

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1;->L$0:Ljava/lang/Object;

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1;->L$1:Ljava/lang/Object;

    const/4 v7, 0x0

    iput-object v7, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1;->L$2:Ljava/lang/Object;

    iput-object v7, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1;->L$3:Ljava/lang/Object;

    const/4 v7, 0x2

    iput v7, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1;->label:I

    invoke-interface {v4, v6, v1}, Lcom/pymcl/android/data/AiUiExtras;->saveSettings(Lcom/pymcl/ai/AiSettings;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_2

    .line 108
    return-object v0

    .line 110
    :cond_2
    move v0, v3

    move-object v3, v5

    .end local v5    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    .restart local v0    # "$i$a$-runCatching-AiPageKt$AiPage$setModel$1$1\\1\\110\\0":I
    .local v3, "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    :goto_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .end local v0    # "$i$a$-runCatching-AiPageKt$AiPage$setModel$1$1\\1\\110\\0":I
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
    iget-object v3, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1;->$m:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v5, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1;->$model$delegate:Landroidx/compose/runtime/MutableState;

    .line 111
    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    move-object v10, v0

    check-cast v10, Lkotlin/Unit;

    .line 518
    .local v10, "it\\2":Lkotlin/Unit;
    const/4 v11, 0x0

    .line 111
    .local v11, "$i$a$-onSuccess-AiPageKt$AiPage$setModel$1$2\\2\\111\\0":I
    invoke-static {v5, v3}, Lcom/pymcl/android/ui/pages/AiPageKt;->access$AiPage$lambda$9(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    new-instance v5, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1$$ExternalSyntheticLambda0;

    invoke-direct {v5, v3}, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1$$ExternalSyntheticLambda0;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Lcom/pymcl/android/ui/state/AppState;->updateSettings(Lkotlin/jvm/functions/Function1;)V

    const-string v5, "\u4e0b\u4e00\u8f6e\u5bf9\u8bdd\u5f00\u59cb\u7528 {0}"

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v5, v3}, Lcom/pymcl/android/ui/i18n/I18nKt;->tr(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x4

    const/4 v9, 0x0

    const-string v5, "\u6a21\u578b\u5df2\u5207\u6362"

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/pymcl/android/ui/state/AppState;->toast$default(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .end local v10    # "it\\2":Lkotlin/Unit;
    .end local v11    # "$i$a$-onSuccess-AiPageKt$AiPage$setModel$1$2\\2\\111\\0":I
    :cond_3
    iget-object v3, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$setModel$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    .line 112
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 518
    .local v0, "it\\4":Ljava/lang/Throwable;
    const/4 v4, 0x0

    .line 112
    .local v4, "$i$a$-onFailure-AiPageKt$AiPage$setModel$1$3\\4\\112\\0":I
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_4

    const-string v5, ""

    :cond_4
    const-string v6, "error"

    const-string v7, "\u6a21\u578b\u4fdd\u5b58\u5931\u8d25"

    invoke-virtual {v3, v7, v5, v6}, Lcom/pymcl/android/ui/state/AppState;->toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    .end local v0    # "it\\4":Ljava/lang/Throwable;
    .end local v4    # "$i$a$-onFailure-AiPageKt$AiPage$setModel$1$3\\4\\112\\0":I
    :cond_5
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 109
    :cond_6
    :goto_4
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
