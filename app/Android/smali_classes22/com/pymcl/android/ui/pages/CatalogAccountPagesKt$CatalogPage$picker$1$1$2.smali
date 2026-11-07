.class final Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$picker$1$1$2;
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
    c = "com.pymcl.android.ui.pages.CatalogAccountPagesKt$CatalogPage$picker$1$1$2"
    f = "CatalogAccountPages.kt"
    i = {
        0x0,
        0x1,
        0x1
    }
    l = {
        0x59,
        0x5a
    }
    m = "invokeSuspend"
    n = {
        "p",
        "p",
        "f"
    }
    nl = {
        0x5a,
        -0x1
    }
    s = {
        "L$0",
        "L$0",
        "L$1"
    }
    v = 0x2
.end annotation


# instance fields
.field final synthetic $ctx:Landroid/content/Context;

.field final synthetic $inst:Ljava/lang/String;

.field final synthetic $kind:Lcom/pymcl/android/ui/state/CatalogKind;

.field final synthetic $state:Lcom/pymcl/android/ui/state/AppState;

.field final synthetic $uri:Landroid/net/Uri;

.field final synthetic $ver:Ljava/lang/String;

.field synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/CatalogKind;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Lcom/pymcl/android/ui/state/CatalogKind;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Landroid/content/Context;",
            "Landroid/net/Uri;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$picker$1$1$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$picker$1$1$2;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$picker$1$1$2;->$kind:Lcom/pymcl/android/ui/state/CatalogKind;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$picker$1$1$2;->$inst:Ljava/lang/String;

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$picker$1$1$2;->$ver:Ljava/lang/String;

    iput-object p5, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$picker$1$1$2;->$ctx:Landroid/content/Context;

    iput-object p6, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$picker$1$1$2;->$uri:Landroid/net/Uri;

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

    new-instance v0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$picker$1$1$2;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$picker$1$1$2;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$picker$1$1$2;->$kind:Lcom/pymcl/android/ui/state/CatalogKind;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$picker$1$1$2;->$inst:Ljava/lang/String;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$picker$1$1$2;->$ver:Ljava/lang/String;

    iget-object v5, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$picker$1$1$2;->$ctx:Landroid/content/Context;

    iget-object v6, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$picker$1$1$2;->$uri:Landroid/net/Uri;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$picker$1$1$2;-><init>(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/CatalogKind;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$picker$1$1$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/jvm/functions/Function2;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$picker$1$1$2;->invoke(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$picker$1$1$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$picker$1$1$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$picker$1$1$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10
    .param p1, "$result"    # Ljava/lang/Object;

    iget-object v0, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$picker$1$1$2;->L$0:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function2;

    .local v6, "p":Lkotlin/jvm/functions/Function2;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 88
    iget v1, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$picker$1$1$2;->label:I

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$picker$1$1$2;->L$1:Ljava/lang/Object;

    check-cast v0, Ljava/io/File;

    .local v0, "f":Ljava/io/File;
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v1, p1

    goto :goto_1

    .end local v0    # "f":Ljava/io/File;
    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v1, p1

    goto :goto_0

    :pswitch_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 89
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    check-cast v1, Lkotlin/coroutines/CoroutineContext;

    new-instance v2, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$picker$1$1$2$f$1;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$picker$1$1$2;->$ctx:Landroid/content/Context;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$picker$1$1$2;->$uri:Landroid/net/Uri;

    const/4 v5, 0x0

    invoke-direct {v2, v3, v4, v5}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$picker$1$1$2$f$1;-><init>(Landroid/content/Context;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)V

    check-cast v2, Lkotlin/jvm/functions/Function2;

    move-object v3, p0

    check-cast v3, Lkotlin/coroutines/Continuation;

    iput-object v6, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$picker$1$1$2;->L$0:Ljava/lang/Object;

    const/4 v4, 0x1

    iput v4, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$picker$1$1$2;->label:I

    invoke-static {v1, v2, v3}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_0

    .line 88
    return-object v0

    :cond_0
    :goto_0
    move-object v8, v1

    check-cast v8, Ljava/io/File;

    .line 90
    .local v8, "f":Ljava/io/File;
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$picker$1$1$2;->$state:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/AppState;->getApi()Lcom/pymcl/android/ui/state/LauncherUiApi;

    move-result-object v1

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$picker$1$1$2;->$kind:Lcom/pymcl/android/ui/state/CatalogKind;

    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/CatalogKind;->getKey()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$picker$1$1$2;->$inst:Ljava/lang/String;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$picker$1$1$2;->$ver:Ljava/lang/String;

    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    const-string v7, "getAbsolutePath(...)"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v7, p0

    check-cast v7, Lkotlin/coroutines/Continuation;

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$picker$1$1$2;->L$0:Ljava/lang/Object;

    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$picker$1$1$2;->L$1:Ljava/lang/Object;

    const/4 v9, 0x2

    iput v9, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$picker$1$1$2;->label:I

    invoke-interface/range {v1 .. v7}, Lcom/pymcl/android/ui/state/LauncherUiApi;->importLocalFile(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_1

    .line 88
    return-object v0

    .line 90
    :cond_1
    move-object v0, v8

    .end local v8    # "f":Ljava/io/File;
    .restart local v0    # "f":Ljava/io/File;
    :goto_1
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
