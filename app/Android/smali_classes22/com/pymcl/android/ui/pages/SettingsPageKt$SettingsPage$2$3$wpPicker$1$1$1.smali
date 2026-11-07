.class final Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$2$3$wpPicker$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SettingsPage.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/pages/SettingsPageKt;->SettingsPage(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/Composer;I)V
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
    c = "com.pymcl.android.ui.pages.SettingsPageKt$SettingsPage$2$3$wpPicker$1$1$1"
    f = "SettingsPage.kt"
    i = {}
    l = {
        0x66
    }
    m = "invokeSuspend"
    n = {}
    nl = {
        0x67
    }
    s = {}
    v = 0x2
.end annotation


# instance fields
.field final synthetic $importing$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $sctx:Landroid/content/Context;

.field final synthetic $state:Lcom/pymcl/android/ui/state/AppState;

.field final synthetic $uri:Landroid/net/Uri;

.field label:I


# direct methods
.method public static synthetic $r8$lambda$u14VtpxQJkGuaCw-alPlGzS7qys(Ljava/lang/String;Lcom/pymcl/android/ui/state/UiSettings;)Lcom/pymcl/android/ui/state/UiSettings;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$2$3$wpPicker$1$1$1;->invokeSuspend$lambda$0(Ljava/lang/String;Lcom/pymcl/android/ui/state/UiSettings;)Lcom/pymcl/android/ui/state/UiSettings;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/pymcl/android/ui/state/AppState;Landroid/content/Context;Landroid/net/Uri;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Landroid/content/Context;",
            "Landroid/net/Uri;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$2$3$wpPicker$1$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$2$3$wpPicker$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$2$3$wpPicker$1$1$1;->$sctx:Landroid/content/Context;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$2$3$wpPicker$1$1$1;->$uri:Landroid/net/Uri;

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$2$3$wpPicker$1$1$1;->$importing$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method private static final invokeSuspend$lambda$0(Ljava/lang/String;Lcom/pymcl/android/ui/state/UiSettings;)Lcom/pymcl/android/ui/state/UiSettings;
    .locals 59
    .param p0, "$path"    # Ljava/lang/String;
    .param p1, "it"    # Lcom/pymcl/android/ui/state/UiSettings;

    .line 103
    const v57, 0x3fffff

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

    const/16 v56, -0x1001

    move-object/from16 v14, p0

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

    new-instance v0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$2$3$wpPicker$1$1$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$2$3$wpPicker$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$2$3$wpPicker$1$1$1;->$sctx:Landroid/content/Context;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$2$3$wpPicker$1$1$1;->$uri:Landroid/net/Uri;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$2$3$wpPicker$1$1$1;->$importing$delegate:Landroidx/compose/runtime/MutableState;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$2$3$wpPicker$1$1$1;-><init>(Lcom/pymcl/android/ui/state/AppState;Landroid/content/Context;Landroid/net/Uri;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$2$3$wpPicker$1$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$2$3$wpPicker$1$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$2$3$wpPicker$1$1$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$2$3$wpPicker$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 100
    iget v1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$2$3$wpPicker$1$1$1;->label:I

    const/4 v2, 0x0

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, p1

    goto :goto_0

    .line 106
    :catchall_0
    move-exception v0

    goto :goto_4

    .line 105
    :catch_0
    move-exception v0

    goto :goto_1

    .line 104
    :catch_1
    move-exception v0

    goto :goto_3

    .line 100
    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 101
    nop

    .line 102
    :try_start_1
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    check-cast v1, Lkotlin/coroutines/CoroutineContext;

    new-instance v3, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$2$3$wpPicker$1$1$1$path$1;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$2$3$wpPicker$1$1$1;->$sctx:Landroid/content/Context;

    iget-object v5, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$2$3$wpPicker$1$1$1;->$uri:Landroid/net/Uri;

    const/4 v6, 0x0

    invoke-direct {v3, v4, v5, v6}, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$2$3$wpPicker$1$1$1$path$1;-><init>(Landroid/content/Context;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)V

    check-cast v3, Lkotlin/jvm/functions/Function2;

    move-object v4, p0

    check-cast v4, Lkotlin/coroutines/Continuation;

    const/4 v5, 0x1

    iput v5, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$2$3$wpPicker$1$1$1;->label:I

    invoke-static {v1, v3, v4}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_0

    .line 100
    return-object v0

    :cond_0
    :goto_0
    check-cast v1, Ljava/lang/String;

    .line 103
    .local v1, "path":Ljava/lang/String;
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$2$3$wpPicker$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    new-instance v3, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$2$3$wpPicker$1$1$1$$ExternalSyntheticLambda0;

    invoke-direct {v3, v1}, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$2$3$wpPicker$1$1$1$$ExternalSyntheticLambda0;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v3}, Lcom/pymcl/android/ui/pages/SettingsPageKt;->access$SettingsPage$up(Lcom/pymcl/android/ui/state/AppState;Lkotlin/jvm/functions/Function1;)V

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$2$3$wpPicker$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    const-string v5, "\u5df2\u8bbe\u7f6e\u58c1\u7eb8"

    const-string v6, "\u70b9\u300c\u4fdd\u5b58\u8bbe\u7f6e\u300d\u540e\u4e0b\u6b21\u6253\u5f00\u4ecd\u751f\u6548"

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/pymcl/android/ui/state/AppState;->toast$default(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .end local v1    # "path":Ljava/lang/String;
    goto :goto_2

    .line 105
    .local v0, "e":Ljava/lang/Exception;
    :goto_1
    :try_start_2
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$2$3$wpPicker$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    const-string v3, "\u8bbe\u7f6e\u58c1\u7eb8\u5931\u8d25"

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_1

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v4

    :cond_1
    const-string v5, "error"

    invoke-virtual {v1, v3, v4, v5}, Lcom/pymcl/android/ui/state/AppState;->toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 106
    .end local v0    # "e":Ljava/lang/Exception;
    :goto_2
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$2$3$wpPicker$1$1$1;->$importing$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v0, v2}, Lcom/pymcl/android/ui/pages/SettingsPageKt;->access$SettingsPage$lambda$20$2$2(Landroidx/compose/runtime/MutableState;Z)V

    .line 107
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 104
    .end local p1    # "$result":Ljava/lang/Object;
    .local v0, "e":Ljava/util/concurrent/CancellationException;
    :goto_3
    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 106
    .end local v0    # "e":Ljava/util/concurrent/CancellationException;
    .restart local p1    # "$result":Ljava/lang/Object;
    :goto_4
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$2$3$wpPicker$1$1$1;->$importing$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1, v2}, Lcom/pymcl/android/ui/pages/SettingsPageKt;->access$SettingsPage$lambda$20$2$2(Landroidx/compose/runtime/MutableState;Z)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
