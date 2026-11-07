.class final Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$3$1$1;
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
        "Lkotlin/jvm/functions/Function2<",
        "-",
        "Ljava/lang/Float;",
        "-",
        "Ljava/lang/String;",
        "+",
        "Lkotlin/Unit;",
        ">;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Ljava/lang/String;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "p",
        "Lkotlin/Function2;",
        "",
        ""
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
    c = "com.pymcl.android.ui.pages.CatalogAccountPagesKt$CatalogPage$3$1$3$1$1"
    f = "CatalogAccountPages.kt"
    i = {
        0x0,
        0x1,
        0x1,
        0x1
    }
    l = {
        0x8b,
        0x8e
    }
    m = "invokeSuspend"
    n = {
        "p",
        "p",
        "r",
        "f"
    }
    nl = {
        0x8c,
        0x8f
    }
    s = {
        "L$0",
        "L$0",
        "L$1",
        "L$2"
    }
    v = 0x2
.end annotation


# instance fields
.field final synthetic $exportSaver:Landroidx/activity/compose/ManagedActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/compose/ManagedActivityResultLauncher<",
            "Ljava/lang/String;",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $inst:Ljava/lang/String;

.field final synthetic $kind:Lcom/pymcl/android/ui/state/CatalogKind;

.field final synthetic $pendingExport$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $state:Lcom/pymcl/android/ui/state/AppState;

.field final synthetic $ver:Ljava/lang/String;

.field synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/CatalogKind;Ljava/lang/String;Ljava/lang/String;Landroidx/activity/compose/ManagedActivityResultLauncher;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Lcom/pymcl/android/ui/state/CatalogKind;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Landroidx/activity/compose/ManagedActivityResultLauncher<",
            "Ljava/lang/String;",
            "Landroid/net/Uri;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/io/File;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$3$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$3$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$3$1$1;->$kind:Lcom/pymcl/android/ui/state/CatalogKind;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$3$1$1;->$inst:Ljava/lang/String;

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$3$1$1;->$ver:Ljava/lang/String;

    iput-object p5, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$3$1$1;->$exportSaver:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iput-object p6, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$3$1$1;->$pendingExport$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p7}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 8
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

    new-instance v0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$3$1$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$3$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$3$1$1;->$kind:Lcom/pymcl/android/ui/state/CatalogKind;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$3$1$1;->$inst:Ljava/lang/String;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$3$1$1;->$ver:Ljava/lang/String;

    iget-object v5, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$3$1$1;->$exportSaver:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iget-object v6, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$3$1$1;->$pendingExport$delegate:Landroidx/compose/runtime/MutableState;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$3$1$1;-><init>(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/CatalogKind;Ljava/lang/String;Ljava/lang/String;Landroidx/activity/compose/ManagedActivityResultLauncher;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$3$1$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/jvm/functions/Function2;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$3$1$1;->invoke(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invoke(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Float;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$3$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$3$1$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$3$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9
    .param p1, "$result"    # Ljava/lang/Object;

    iget-object v0, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$3$1$1;->L$0:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lkotlin/jvm/functions/Function2;

    .local v5, "p":Lkotlin/jvm/functions/Function2;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 138
    iget v1, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$3$1$1;->label:I

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$3$1$1;->L$2:Ljava/lang/Object;

    check-cast v0, Ljava/io/File;

    .local v0, "f":Ljava/io/File;
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$3$1$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/pymcl/android/ui/state/ContentExportResult;

    .local v1, "r":Lcom/pymcl/android/ui/state/ContentExportResult;
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    .end local v0    # "f":Ljava/io/File;
    .end local v1    # "r":Lcom/pymcl/android/ui/state/ContentExportResult;
    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v1, p1

    goto :goto_0

    :pswitch_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 139
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$3$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/AppState;->getApi()Lcom/pymcl/android/ui/state/LauncherUiApi;

    move-result-object v1

    invoke-static {v1}, Lcom/pymcl/android/ui/state/LauncherUiApiKt;->getExt8(Lcom/pymcl/android/ui/state/LauncherUiApi;)Lcom/pymcl/android/ui/state/LauncherUiApiExt8;

    move-result-object v1

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$3$1$1;->$kind:Lcom/pymcl/android/ui/state/CatalogKind;

    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/CatalogKind;->getKey()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$3$1$1;->$inst:Ljava/lang/String;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$3$1$1;->$ver:Ljava/lang/String;

    move-object v6, p0

    check-cast v6, Lkotlin/coroutines/Continuation;

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$3$1$1;->L$0:Ljava/lang/Object;

    const/4 v7, 0x1

    iput v7, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$3$1$1;->label:I

    invoke-interface/range {v1 .. v6}, Lcom/pymcl/android/ui/state/LauncherUiApiExt8;->exportAllContents(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_0

    .line 138
    return-object v0

    :cond_0
    :goto_0
    check-cast v1, Lcom/pymcl/android/ui/state/ContentExportResult;

    .line 140
    .restart local v1    # "r":Lcom/pymcl/android/ui/state/ContentExportResult;
    new-instance v2, Ljava/io/File;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/ContentExportResult;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 141
    .local v2, "f":Ljava/io/File;
    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/ContentExportResult;->getOk()I

    move-result v3

    if-eqz v3, :cond_3

    .line 142
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    move-result-object v3

    check-cast v3, Lkotlin/coroutines/CoroutineContext;

    new-instance v4, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$3$1$1$1;

    iget-object v6, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$3$1$1;->$exportSaver:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iget-object v7, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$3$1$1;->$pendingExport$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v8, 0x0

    invoke-direct {v4, v2, v6, v7, v8}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$3$1$1$1;-><init>(Ljava/io/File;Landroidx/activity/compose/ManagedActivityResultLauncher;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast v4, Lkotlin/jvm/functions/Function2;

    move-object v6, p0

    check-cast v6, Lkotlin/coroutines/Continuation;

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$3$1$1;->L$0:Ljava/lang/Object;

    iput-object v1, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$3$1$1;->L$1:Ljava/lang/Object;

    iput-object v2, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$3$1$1;->L$2:Ljava/lang/Object;

    const/4 v7, 0x2

    iput v7, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$3$1$1;->label:I

    invoke-static {v3, v4, v6}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_1

    .line 138
    return-object v0

    .line 142
    :cond_1
    move-object v0, v2

    .line 143
    .end local v2    # "f":Ljava/io/File;
    .restart local v0    # "f":Ljava/io/File;
    :goto_1
    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/ContentExportResult;->getFailed()I

    move-result v2

    if-lez v2, :cond_2

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$3$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/ContentExportResult;->getSummary()Ljava/lang/String;

    move-result-object v3

    const-string v4, "warn"

    const-string v6, "\u90e8\u5206\u6ca1\u80fd\u5bfc\u51fa"

    invoke-virtual {v2, v6, v3, v4}, Lcom/pymcl/android/ui/state/AppState;->toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    :cond_2
    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/ContentExportResult;->getOk()I

    move-result v2

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "{0} \u4e2a \u2192 {1}"

    invoke-static {v3, v2}, Lcom/pymcl/android/ui/i18n/I18nKt;->tr(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    return-object v2

    .line 141
    .end local v0    # "f":Ljava/io/File;
    .restart local v2    # "f":Ljava/io/File;
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/ContentExportResult;->getSummary()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
