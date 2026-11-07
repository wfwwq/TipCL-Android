.class final Lcom/pymcl/android/ui/PyMclAppKt$MergeSettingsExtras$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "PyMclApp.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/PyMclAppKt;->MergeSettingsExtras(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/Composer;I)V
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
    c = "com.pymcl.android.ui.PyMclAppKt$MergeSettingsExtras$1$1"
    f = "PyMclApp.kt"
    i = {
        0x0,
        0x1
    }
    l = {
        0x77,
        0x78
    }
    m = "invokeSuspend"
    n = {
        "start",
        "start"
    }
    nl = {
        0x78,
        0x79
    }
    s = {
        "L$0",
        "L$0"
    }
    v = 0x2
.end annotation


# instance fields
.field final synthetic $ctx:Landroid/content/Context;

.field final synthetic $state:Lcom/pymcl/android/ui/state/AppState;

.field L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public static synthetic $r8$lambda$gkkZeMvkqoZzVdCsjIdF0TUkG3I(Ljava/util/Map;Lcom/pymcl/android/ui/state/UiSettings;)Lcom/pymcl/android/ui/state/UiSettings;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/android/ui/PyMclAppKt$MergeSettingsExtras$1$1;->invokeSuspend$lambda$0(Ljava/util/Map;Lcom/pymcl/android/ui/state/UiSettings;)Lcom/pymcl/android/ui/state/UiSettings;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/pymcl/android/ui/state/AppState;Landroid/content/Context;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Landroid/content/Context;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/PyMclAppKt$MergeSettingsExtras$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/PyMclAppKt$MergeSettingsExtras$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p2, p0, Lcom/pymcl/android/ui/PyMclAppKt$MergeSettingsExtras$1$1;->$ctx:Landroid/content/Context;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method private static final invokeSuspend$lambda$0(Ljava/util/Map;Lcom/pymcl/android/ui/state/UiSettings;)Lcom/pymcl/android/ui/state/UiSettings;
    .locals 2
    .param p0, "$snap"    # Ljava/util/Map;
    .param p1, "it"    # Lcom/pymcl/android/ui/state/UiSettings;

    .line 121
    sget-object v0, Lcom/pymcl/android/data/SettingsLogic$Extras;->INSTANCE:Lcom/pymcl/android/data/SettingsLogic$Extras;

    invoke-static {}, Lcom/pymcl/android/ui/theme/BgPreset;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v1

    invoke-interface {v1}, Lkotlin/enums/EnumEntries;->size()I

    move-result v1

    invoke-virtual {v0, p0, p1, v1}, Lcom/pymcl/android/data/SettingsLogic$Extras;->applyFrom(Ljava/util/Map;Lcom/pymcl/android/ui/state/UiSettings;I)Lcom/pymcl/android/ui/state/UiSettings;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
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

    new-instance v0, Lcom/pymcl/android/ui/PyMclAppKt$MergeSettingsExtras$1$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/PyMclAppKt$MergeSettingsExtras$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v2, p0, Lcom/pymcl/android/ui/PyMclAppKt$MergeSettingsExtras$1$1;->$ctx:Landroid/content/Context;

    invoke-direct {v0, v1, v2, p2}, Lcom/pymcl/android/ui/PyMclAppKt$MergeSettingsExtras$1$1;-><init>(Lcom/pymcl/android/ui/state/AppState;Landroid/content/Context;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/PyMclAppKt$MergeSettingsExtras$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/PyMclAppKt$MergeSettingsExtras$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/PyMclAppKt$MergeSettingsExtras$1$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/PyMclAppKt$MergeSettingsExtras$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 62
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 115
    iget v2, v0, Lcom/pymcl/android/ui/PyMclAppKt$MergeSettingsExtras$1$1;->label:I

    const/4 v3, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    iget-object v1, v0, Lcom/pymcl/android/ui/PyMclAppKt$MergeSettingsExtras$1$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/pymcl/android/ui/state/UiSettings;

    .local v1, "start":Lcom/pymcl/android/ui/state/UiSettings;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    goto/16 :goto_1

    .end local v1    # "start":Lcom/pymcl/android/ui/state/UiSettings;
    :pswitch_1
    iget-object v2, v0, Lcom/pymcl/android/ui/PyMclAppKt$MergeSettingsExtras$1$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/pymcl/android/ui/state/UiSettings;

    .local v2, "start":Lcom/pymcl/android/ui/state/UiSettings;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_0

    .end local v2    # "start":Lcom/pymcl/android/ui/state/UiSettings;
    :pswitch_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 116
    invoke-static {}, Lcom/pymcl/android/ui/PyMclAppKt;->access$getExtrasMerged$p()Ljava/util/Set;

    move-result-object v2

    iget-object v4, v0, Lcom/pymcl/android/ui/PyMclAppKt$MergeSettingsExtras$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    invoke-interface {v2, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 117
    :cond_0
    iget-object v2, v0, Lcom/pymcl/android/ui/PyMclAppKt$MergeSettingsExtras$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/AppState;->getSettings()Lcom/pymcl/android/ui/state/UiSettings;

    move-result-object v2

    .line 118
    .restart local v2    # "start":Lcom/pymcl/android/ui/state/UiSettings;
    new-instance v4, Lcom/pymcl/android/ui/state/UiSettings;

    const v60, 0x3fffff

    const/16 v61, 0x0

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

    const/16 v44, 0x0

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

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, -0x1

    invoke-direct/range {v4 .. v61}, Lcom/pymcl/android/ui/state/UiSettings;-><init>(ZILjava/lang/String;IIZIZZIZILjava/lang/String;Ljava/lang/String;ZIIIIIIIIZILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;IIILjava/lang/String;ZZZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;IZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 119
    new-instance v4, Lcom/pymcl/android/ui/PyMclAppKt$MergeSettingsExtras$1$1$1;

    iget-object v5, v0, Lcom/pymcl/android/ui/PyMclAppKt$MergeSettingsExtras$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    invoke-direct {v4, v5, v2, v3}, Lcom/pymcl/android/ui/PyMclAppKt$MergeSettingsExtras$1$1$1;-><init>(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/UiSettings;Lkotlin/coroutines/Continuation;)V

    check-cast v4, Lkotlin/jvm/functions/Function2;

    move-object v5, v0

    check-cast v5, Lkotlin/coroutines/Continuation;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v0, Lcom/pymcl/android/ui/PyMclAppKt$MergeSettingsExtras$1$1;->L$0:Ljava/lang/Object;

    const/4 v6, 0x1

    iput v6, v0, Lcom/pymcl/android/ui/PyMclAppKt$MergeSettingsExtras$1$1;->label:I

    const-wide/16 v6, 0x2710

    invoke-static {v6, v7, v4, v5}, Lkotlinx/coroutines/TimeoutKt;->withTimeoutOrNull(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_1

    .line 115
    return-object v1

    .line 120
    :cond_1
    :goto_0
    nop

    :cond_2
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v4

    check-cast v4, Lkotlin/coroutines/CoroutineContext;

    new-instance v5, Lcom/pymcl/android/ui/PyMclAppKt$MergeSettingsExtras$1$1$snap$1;

    iget-object v6, v0, Lcom/pymcl/android/ui/PyMclAppKt$MergeSettingsExtras$1$1;->$ctx:Landroid/content/Context;

    invoke-direct {v5, v6, v3}, Lcom/pymcl/android/ui/PyMclAppKt$MergeSettingsExtras$1$1$snap$1;-><init>(Landroid/content/Context;Lkotlin/coroutines/Continuation;)V

    check-cast v5, Lkotlin/jvm/functions/Function2;

    move-object v3, v0

    check-cast v3, Lkotlin/coroutines/Continuation;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v0, Lcom/pymcl/android/ui/PyMclAppKt$MergeSettingsExtras$1$1;->L$0:Ljava/lang/Object;

    const/4 v6, 0x2

    iput v6, v0, Lcom/pymcl/android/ui/PyMclAppKt$MergeSettingsExtras$1$1;->label:I

    invoke-static {v4, v5, v3}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_3

    .line 115
    return-object v1

    .line 120
    :cond_3
    move-object v1, v2

    .end local v2    # "start":Lcom/pymcl/android/ui/state/UiSettings;
    .restart local v1    # "start":Lcom/pymcl/android/ui/state/UiSettings;
    :goto_1
    check-cast v3, Ljava/util/Map;

    if-nez v3, :cond_4

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v2

    .line 121
    .local v3, "snap":Ljava/util/Map;
    :cond_4
    iget-object v2, v0, Lcom/pymcl/android/ui/PyMclAppKt$MergeSettingsExtras$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    new-instance v4, Lcom/pymcl/android/ui/PyMclAppKt$MergeSettingsExtras$1$1$$ExternalSyntheticLambda0;

    invoke-direct {v4, v3}, Lcom/pymcl/android/ui/PyMclAppKt$MergeSettingsExtras$1$1$$ExternalSyntheticLambda0;-><init>(Ljava/util/Map;)V

    invoke-virtual {v2, v4}, Lcom/pymcl/android/ui/state/AppState;->updateSettings(Lkotlin/jvm/functions/Function1;)V

    .line 122
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
