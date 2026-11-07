.class final Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$saveAll$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SettingsPage.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/pages/SettingsPageKt;->SettingsPage$saveAll(Lcom/pymcl/android/ui/state/AppState;ILandroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroid/content/Context;Landroidx/compose/runtime/MutableState;)V
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
    c = "com.pymcl.android.ui.pages.SettingsPageKt$SettingsPage$saveAll$2"
    f = "SettingsPage.kt"
    i = {}
    l = {
        0x33,
        0x34
    }
    m = "invokeSuspend"
    n = {}
    nl = {
        0x34,
        0x35
    }
    s = {}
    v = 0x2
.end annotation


# instance fields
.field final synthetic $savedWallpaper$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/pymcl/android/data/SettingsLogic$WallpaperSnap;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $saving$delegate:Landroidx/compose/runtime/MutableState;
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

.field final synthetic $v:Lcom/pymcl/android/data/SettingsLogic$Validation;

.field label:I


# direct methods
.method public static synthetic $r8$lambda$MJX-mMB4zM80T7zg-1EO2676bkA(Lcom/pymcl/android/data/SettingsLogic$Validation;Lcom/pymcl/android/ui/state/UiSettings;)Lcom/pymcl/android/ui/state/UiSettings;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$saveAll$2;->invokeSuspend$lambda$0(Lcom/pymcl/android/data/SettingsLogic$Validation;Lcom/pymcl/android/ui/state/UiSettings;)Lcom/pymcl/android/ui/state/UiSettings;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/data/SettingsLogic$Validation;Landroid/content/Context;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Lcom/pymcl/android/data/SettingsLogic$Validation;",
            "Landroid/content/Context;",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/pymcl/android/data/SettingsLogic$WallpaperSnap;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$saveAll$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$saveAll$2;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$saveAll$2;->$v:Lcom/pymcl/android/data/SettingsLogic$Validation;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$saveAll$2;->$sctx:Landroid/content/Context;

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$saveAll$2;->$savedWallpaper$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$saveAll$2;->$saving$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method private static final invokeSuspend$lambda$0(Lcom/pymcl/android/data/SettingsLogic$Validation;Lcom/pymcl/android/ui/state/UiSettings;)Lcom/pymcl/android/ui/state/UiSettings;
    .locals 1
    .param p0, "$v"    # Lcom/pymcl/android/data/SettingsLogic$Validation;
    .param p1, "it"    # Lcom/pymcl/android/ui/state/UiSettings;

    .line 50
    invoke-virtual {p0}, Lcom/pymcl/android/data/SettingsLogic$Validation;->getFixed()Lcom/pymcl/android/ui/state/UiSettings;

    move-result-object v0

    return-object v0
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

    new-instance v0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$saveAll$2;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$saveAll$2;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$saveAll$2;->$v:Lcom/pymcl/android/data/SettingsLogic$Validation;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$saveAll$2;->$sctx:Landroid/content/Context;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$saveAll$2;->$savedWallpaper$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v5, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$saveAll$2;->$saving$delegate:Landroidx/compose/runtime/MutableState;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$saveAll$2;-><init>(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/data/SettingsLogic$Validation;Landroid/content/Context;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$saveAll$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$saveAll$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$saveAll$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$saveAll$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 48
    iget v1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$saveAll$2;->label:I

    const/4 v2, 0x0

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 57
    :catchall_0
    move-exception v0

    goto/16 :goto_5

    .line 56
    :catch_0
    move-exception v0

    goto :goto_2

    .line 55
    :catch_1
    move-exception v0

    goto/16 :goto_4

    .line 48
    :pswitch_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 49
    nop

    .line 50
    :try_start_1
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$saveAll$2;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$saveAll$2;->$v:Lcom/pymcl/android/data/SettingsLogic$Validation;

    new-instance v4, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$saveAll$2$$ExternalSyntheticLambda0;

    invoke-direct {v4, v3}, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$saveAll$2$$ExternalSyntheticLambda0;-><init>(Lcom/pymcl/android/data/SettingsLogic$Validation;)V

    invoke-virtual {v1, v4}, Lcom/pymcl/android/ui/state/AppState;->updateSettings(Lkotlin/jvm/functions/Function1;)V

    .line 51
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$saveAll$2;->$state:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/AppState;->getApi()Lcom/pymcl/android/ui/state/LauncherUiApi;

    move-result-object v1

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$saveAll$2;->$v:Lcom/pymcl/android/data/SettingsLogic$Validation;

    invoke-virtual {v3}, Lcom/pymcl/android/data/SettingsLogic$Validation;->getFixed()Lcom/pymcl/android/ui/state/UiSettings;

    move-result-object v3

    move-object v4, p0

    check-cast v4, Lkotlin/coroutines/Continuation;

    const/4 v5, 0x1

    iput v5, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$saveAll$2;->label:I

    invoke-interface {v1, v3, v4}, Lcom/pymcl/android/ui/state/LauncherUiApi;->saveSettings(Lcom/pymcl/android/ui/state/UiSettings;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_0

    .line 48
    return-object v0

    .line 52
    :cond_0
    :goto_0
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    check-cast v1, Lkotlin/coroutines/CoroutineContext;

    new-instance v3, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$saveAll$2$2;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$saveAll$2;->$sctx:Landroid/content/Context;

    iget-object v5, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$saveAll$2;->$v:Lcom/pymcl/android/data/SettingsLogic$Validation;

    const/4 v6, 0x0

    invoke-direct {v3, v4, v5, v6}, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$saveAll$2$2;-><init>(Landroid/content/Context;Lcom/pymcl/android/data/SettingsLogic$Validation;Lkotlin/coroutines/Continuation;)V

    check-cast v3, Lkotlin/jvm/functions/Function2;

    move-object v4, p0

    check-cast v4, Lkotlin/coroutines/Continuation;

    const/4 v5, 0x2

    iput v5, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$saveAll$2;->label:I

    invoke-static {v1, v3, v4}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_1

    .line 48
    return-object v0

    .line 53
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$saveAll$2;->$savedWallpaper$delegate:Landroidx/compose/runtime/MutableState;

    sget-object v1, Lcom/pymcl/android/data/SettingsLogic;->INSTANCE:Lcom/pymcl/android/data/SettingsLogic;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$saveAll$2;->$v:Lcom/pymcl/android/data/SettingsLogic$Validation;

    invoke-virtual {v3}, Lcom/pymcl/android/data/SettingsLogic$Validation;->getFixed()Lcom/pymcl/android/ui/state/UiSettings;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/pymcl/android/data/SettingsLogic;->snap(Lcom/pymcl/android/ui/state/UiSettings;)Lcom/pymcl/android/data/SettingsLogic$WallpaperSnap;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/pymcl/android/ui/pages/SettingsPageKt;->access$SettingsPage$lambda$7(Landroidx/compose/runtime/MutableState;Lcom/pymcl/android/data/SettingsLogic$WallpaperSnap;)V

    .line 54
    iget-object v3, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$saveAll$2;->$state:Lcom/pymcl/android/ui/state/AppState;

    const-string v4, "\u5df2\u4fdd\u5b58"

    const-string v5, "\u4e0b\u8f7d\u8bbe\u7f6e\u7acb\u5373\u751f\u6548\uff1b\u5185\u5b58\u3001\u5206\u8fa8\u7387\u3001JVM \u53c2\u6570\u3001GC \u5728\u4e0b\u6b21\u542f\u52a8\u6e38\u620f\u65f6\u751f\u6548"

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/pymcl/android/ui/state/AppState;->toast$default(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    .line 56
    .local v0, "e":Ljava/lang/Exception;
    :goto_2
    :try_start_2
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$saveAll$2;->$state:Lcom/pymcl/android/ui/state/AppState;

    const-string v3, "\u4fdd\u5b58\u5931\u8d25"

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_2

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v4

    :cond_2
    const-string v5, "error"

    invoke-virtual {v1, v3, v4, v5}, Lcom/pymcl/android/ui/state/AppState;->toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 57
    .end local v0    # "e":Ljava/lang/Exception;
    :goto_3
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$saveAll$2;->$saving$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v0, v2}, Lcom/pymcl/android/ui/pages/SettingsPageKt;->access$SettingsPage$lambda$4(Landroidx/compose/runtime/MutableState;Z)V

    .line 58
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 55
    .end local p1    # "$result":Ljava/lang/Object;
    .local v0, "e":Ljava/util/concurrent/CancellationException;
    :goto_4
    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 57
    .end local v0    # "e":Ljava/util/concurrent/CancellationException;
    .restart local p1    # "$result":Ljava/lang/Object;
    :goto_5
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$saveAll$2;->$saving$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1, v2}, Lcom/pymcl/android/ui/pages/SettingsPageKt;->access$SettingsPage$lambda$4(Landroidx/compose/runtime/MutableState;Z)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
