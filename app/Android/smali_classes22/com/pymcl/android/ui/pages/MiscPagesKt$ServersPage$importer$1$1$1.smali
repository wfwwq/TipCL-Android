.class final Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$importer$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "MiscPages.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/pages/MiscPagesKt;->ServersPage(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/Composer;I)V
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
    c = "com.pymcl.android.ui.pages.MiscPagesKt$ServersPage$importer$1$1$1"
    f = "MiscPages.kt"
    i = {}
    l = {
        0xc1
    }
    m = "invokeSuspend"
    n = {}
    nl = {
        0xc4
    }
    s = {}
    v = 0x2
.end annotation


# instance fields
.field final synthetic $all$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/pymcl/core/instance/ServerEntry;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $busy$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $ctx:Landroid/content/Context;

.field final synthetic $inst$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $state:Lcom/pymcl/android/ui/state/AppState;

.field final synthetic $uri:Landroid/net/Uri;

.field label:I


# direct methods
.method constructor <init>(Lcom/pymcl/android/ui/state/AppState;Landroid/content/Context;Landroid/net/Uri;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Landroid/content/Context;",
            "Landroid/net/Uri;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/pymcl/core/instance/ServerEntry;",
            ">;>;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$importer$1$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$importer$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$importer$1$1$1;->$ctx:Landroid/content/Context;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$importer$1$1$1;->$uri:Landroid/net/Uri;

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$importer$1$1$1;->$all$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$importer$1$1$1;->$busy$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$importer$1$1$1;->$inst$delegate:Landroidx/compose/runtime/MutableState;

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

    new-instance v0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$importer$1$1$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$importer$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$importer$1$1$1;->$ctx:Landroid/content/Context;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$importer$1$1$1;->$uri:Landroid/net/Uri;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$importer$1$1$1;->$all$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v5, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$importer$1$1$1;->$busy$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v6, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$importer$1$1$1;->$inst$delegate:Landroidx/compose/runtime/MutableState;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$importer$1$1$1;-><init>(Lcom/pymcl/android/ui/state/AppState;Landroid/content/Context;Landroid/net/Uri;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$importer$1$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$importer$1$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$importer$1$1$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$importer$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 192
    iget v1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$importer$1$1$1;->label:I

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

    .line 193
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    check-cast v1, Lkotlin/coroutines/CoroutineContext;

    new-instance v2, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$importer$1$1$1$text$1;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$importer$1$1$1;->$ctx:Landroid/content/Context;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$importer$1$1$1;->$uri:Landroid/net/Uri;

    const/4 v5, 0x0

    invoke-direct {v2, v3, v4, v5}, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$importer$1$1$1$text$1;-><init>(Landroid/content/Context;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)V

    check-cast v2, Lkotlin/jvm/functions/Function2;

    move-object v3, p0

    check-cast v3, Lkotlin/coroutines/Continuation;

    const/4 v4, 0x1

    iput v4, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$importer$1$1$1;->label:I

    invoke-static {v1, v2, v3}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_0

    .line 192
    return-object v0

    :cond_0
    :goto_0
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 196
    .local v0, "text":Ljava/lang/String;
    if-nez v0, :cond_1

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$importer$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    const-string v2, "\u8bfb\u4e0d\u5230\u8fd9\u4e2a\u6587\u4ef6"

    const-string v3, "error"

    const-string v4, "\u5bfc\u5165\u5931\u8d25"

    invoke-virtual {v1, v4, v2, v3}, Lcom/pymcl/android/ui/state/AppState;->toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 197
    :cond_1
    sget-object v1, Lcom/pymcl/android/data/ServerLogic;->INSTANCE:Lcom/pymcl/android/data/ServerLogic;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$importer$1$1$1;->$all$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v2}, Lcom/pymcl/android/ui/pages/MiscPagesKt;->access$ServersPage$lambda$7(Landroidx/compose/runtime/MutableState;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/pymcl/android/data/ServerLogic;->importText(Ljava/lang/String;Ljava/util/List;)Lcom/pymcl/android/data/ServerLogic$ImportResult;

    move-result-object v1

    .line 198
    .local v1, "r":Lcom/pymcl/android/data/ServerLogic$ImportResult;
    invoke-virtual {v1}, Lcom/pymcl/android/data/ServerLogic$ImportResult;->getAdded()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    const-string v3, "\u65e0\u6cd5\u8bc6\u522b {0} \u884c\uff0c\u91cd\u590d {1} \u4e2a"

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$importer$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v1}, Lcom/pymcl/android/data/ServerLogic$ImportResult;->getBadLines()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1}, Lcom/pymcl/android/data/ServerLogic$ImportResult;->getDuplicates()I

    move-result v5

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v5

    filled-new-array {v4, v5}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/pymcl/android/ui/i18n/I18nKt;->tr(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "warn"

    const-string v5, "\u6ca1\u6709\u53ef\u5bfc\u5165\u7684\u670d\u52a1\u5668"

    invoke-virtual {v2, v5, v3, v4}, Lcom/pymcl/android/ui/state/AppState;->toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 199
    :cond_2
    iget-object v6, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$importer$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v7, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$importer$1$1$1;->$busy$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v8, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$importer$1$1$1;->$inst$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v9, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$importer$1$1$1;->$ctx:Landroid/content/Context;

    iget-object v10, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$importer$1$1$1;->$all$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$ServersPage$importer$1$1$1;->$all$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v2}, Lcom/pymcl/android/ui/pages/MiscPagesKt;->access$ServersPage$lambda$7(Landroidx/compose/runtime/MutableState;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-virtual {v1}, Lcom/pymcl/android/data/ServerLogic$ImportResult;->getAdded()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v11

    invoke-virtual {v1}, Lcom/pymcl/android/data/ServerLogic$ImportResult;->getAdded()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v4, "\u5df2\u5bfc\u5165 {0} \u4e2a\u670d\u52a1\u5668"

    invoke-static {v4, v2}, Lcom/pymcl/android/ui/i18n/I18nKt;->tr(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    .line 200
    invoke-virtual {v1}, Lcom/pymcl/android/data/ServerLogic$ImportResult;->getBadLines()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v1}, Lcom/pymcl/android/data/ServerLogic$ImportResult;->getDuplicates()I

    move-result v2

    if-nez v2, :cond_3

    const-string v2, ""

    goto :goto_1

    :cond_3
    invoke-virtual {v1}, Lcom/pymcl/android/data/ServerLogic$ImportResult;->getBadLines()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1}, Lcom/pymcl/android/data/ServerLogic$ImportResult;->getDuplicates()I

    move-result v4

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v2, v4}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3, v2}, Lcom/pymcl/android/ui/i18n/I18nKt;->tr(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    :goto_1
    move-object v13, v2

    .line 199
    invoke-static/range {v6 .. v13}, Lcom/pymcl/android/ui/pages/MiscPagesKt;->access$ServersPage$commit(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroid/content/Context;Landroidx/compose/runtime/MutableState;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 201
    :goto_2
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
