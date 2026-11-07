.class final Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$2$1$1$1;
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
    c = "com.pymcl.android.ui.pages.CatalogAccountPagesKt$CatalogPage$3$1$2$1$1$1"
    f = "CatalogAccountPages.kt"
    i = {}
    l = {
        0x84
    }
    m = "invokeSuspend"
    n = {}
    nl = {
        0x85
    }
    s = {}
    v = 0x2
.end annotation


# instance fields
.field final synthetic $kind:Lcom/pymcl/android/ui/state/CatalogKind;

.field final synthetic $state:Lcom/pymcl/android/ui/state/AppState;

.field final synthetic $url:Ljava/lang/String;

.field label:I


# direct methods
.method constructor <init>(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/CatalogKind;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Lcom/pymcl/android/ui/state/CatalogKind;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$2$1$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$2$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$2$1$1$1;->$kind:Lcom/pymcl/android/ui/state/CatalogKind;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$2$1$1$1;->$url:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 4
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

    new-instance v0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$2$1$1$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$2$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$2$1$1$1;->$kind:Lcom/pymcl/android/ui/state/CatalogKind;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$2$1$1$1;->$url:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, p2}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$2$1$1$1;-><init>(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/CatalogKind;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$2$1$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$2$1$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$2$1$1$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$2$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 131
    iget v1, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$2$1$1$1;->label:I

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v1, p1

    goto :goto_0

    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 132
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$2$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/AppState;->getApi()Lcom/pymcl/android/ui/state/LauncherUiApi;

    move-result-object v1

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$2$1$1$1;->$kind:Lcom/pymcl/android/ui/state/CatalogKind;

    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/CatalogKind;->getKey()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$2$1$1$1;->$url:Ljava/lang/String;

    move-object v4, p0

    check-cast v4, Lkotlin/coroutines/Continuation;

    const/4 v5, 0x1

    iput v5, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$2$1$1$1;->label:I

    invoke-interface {v1, v2, v3, v4}, Lcom/pymcl/android/ui/state/LauncherUiApi;->resolveCatalogLink(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_0

    .line 131
    return-object v0

    :cond_0
    :goto_0
    move-object v0, v1

    check-cast v0, Lcom/pymcl/android/ui/state/CatalogHit;

    .line 133
    .local v0, "hit":Lcom/pymcl/android/ui/state/CatalogHit;
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$2$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    if-nez v0, :cond_1

    const-string v2, "\u652f\u6301 modrinth.com \u4e0e curseforge.com \u7684\u9879\u76ee\u94fe\u63a5"

    const-string v3, "error"

    const-string v4, "\u65e0\u6cd5\u8bc6\u522b\u94fe\u63a5"

    invoke-virtual {v1, v4, v2, v3}, Lcom/pymcl/android/ui/state/AppState;->toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    new-instance v2, Lcom/pymcl/android/ui/state/DialogSpec$CatalogFiles;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$2$1$1$1;->$kind:Lcom/pymcl/android/ui/state/CatalogKind;

    invoke-direct {v2, v3, v0}, Lcom/pymcl/android/ui/state/DialogSpec$CatalogFiles;-><init>(Lcom/pymcl/android/ui/state/CatalogKind;Lcom/pymcl/android/ui/state/CatalogHit;)V

    check-cast v2, Lcom/pymcl/android/ui/state/DialogSpec;

    invoke-virtual {v1, v2}, Lcom/pymcl/android/ui/state/AppState;->open(Lcom/pymcl/android/ui/state/DialogSpec;)V

    .line 134
    :goto_1
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
