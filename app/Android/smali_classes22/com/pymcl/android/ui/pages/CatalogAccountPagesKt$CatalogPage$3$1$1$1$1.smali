.class final Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$1$1$1;
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
    c = "com.pymcl.android.ui.pages.CatalogAccountPagesKt$CatalogPage$3$1$1$1$1"
    f = "CatalogAccountPages.kt"
    i = {}
    l = {
        0x7c
    }
    m = "invokeSuspend"
    n = {}
    nl = {
        0x7d
    }
    s = {}
    v = 0x2
.end annotation


# instance fields
.field final synthetic $checking$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $inst:Ljava/lang/String;

.field final synthetic $mode$delegate:Landroidx/compose/runtime/MutableIntState;

.field final synthetic $state:Lcom/pymcl/android/ui/state/AppState;

.field final synthetic $updates$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $ver:Ljava/lang/String;

.field L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;",
            "Landroidx/compose/runtime/MutableIntState;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$1$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$1$1$1;->$inst:Ljava/lang/String;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$1$1$1;->$ver:Ljava/lang/String;

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$1$1$1;->$updates$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$1$1$1;->$mode$delegate:Landroidx/compose/runtime/MutableIntState;

    iput-object p6, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$1$1$1;->$checking$delegate:Landroidx/compose/runtime/MutableState;

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

    new-instance v0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$1$1$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$1$1$1;->$inst:Ljava/lang/String;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$1$1$1;->$ver:Ljava/lang/String;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$1$1$1;->$updates$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v5, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$1$1$1;->$mode$delegate:Landroidx/compose/runtime/MutableIntState;

    iget-object v6, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$1$1$1;->$checking$delegate:Landroidx/compose/runtime/MutableState;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$1$1$1;-><init>(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$1$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$1$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$1$1$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 122
    iget v1, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$1$1$1;->label:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$1$1$1;->L$0:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/runtime/MutableState;

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v4, p1

    goto :goto_0

    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 123
    nop

    .line 124
    :try_start_1
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$1$1$1;->$updates$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v4}, Lcom/pymcl/android/ui/state/AppState;->getApi()Lcom/pymcl/android/ui/state/LauncherUiApi;

    move-result-object v4

    iget-object v5, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$1$1$1;->$inst:Ljava/lang/String;

    iget-object v6, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$1$1$1;->$ver:Ljava/lang/String;

    move-object v7, p0

    check-cast v7, Lkotlin/coroutines/Continuation;

    iput-object v1, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$1$1$1;->L$0:Ljava/lang/Object;

    iput v2, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$1$1$1;->label:I

    invoke-interface {v4, v5, v6, v7}, Lcom/pymcl/android/ui/state/LauncherUiApi;->checkModUpdates(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_0

    .line 122
    return-object v0

    .line 124
    :cond_0
    move-object v0, v1

    :goto_0
    check-cast v4, Ljava/util/Map;

    invoke-static {v0, v4}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt;->access$CatalogPage$lambda$35(Landroidx/compose/runtime/MutableState;Ljava/util/Map;)V

    .line 125
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$1$1$1;->$updates$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v0}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt;->access$CatalogPage$lambda$34(Landroidx/compose/runtime/MutableState;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    const-string v5, "\u90fd\u662f\u6700\u65b0\u7684"

    const-string v6, "\u6ca1\u6709\u627e\u5230\u53ef\u66f4\u65b0\u7684\u6a21\u7ec4"

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/pymcl/android/ui/state/AppState;->toast$default(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$1$1$1;->$mode$delegate:Landroidx/compose/runtime/MutableIntState;

    invoke-static {v0, v2}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt;->access$CatalogPage$lambda$2(Landroidx/compose/runtime/MutableIntState;I)V

    iget-object v0, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    const-string v1, "{0} \u4e2a\u6a21\u7ec4\u53ef\u66f4\u65b0"

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$1$1$1;->$updates$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v2}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt;->access$CatalogPage$lambda$34(Landroidx/compose/runtime/MutableState;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v2

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/pymcl/android/ui/i18n/I18nKt;->tr(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    const-string v4, "info"

    invoke-virtual {v0, v1, v2, v4}, Lcom/pymcl/android/ui/state/AppState;->toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 126
    :goto_1
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$1$1$1;->$checking$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v0, v3}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt;->access$CatalogPage$lambda$38(Landroidx/compose/runtime/MutableState;Z)V

    .line 127
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 126
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$CatalogPage$3$1$1$1$1;->$checking$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1, v3}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt;->access$CatalogPage$lambda$38(Landroidx/compose/runtime/MutableState;Z)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
