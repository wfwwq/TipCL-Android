.class final Lcom/pymcl/android/ui/pages/GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "GamePages.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/pages/GamePagesKt;->InstancePage(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/Composer;I)V
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
    c = "com.pymcl.android.ui.pages.GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$2"
    f = "GamePages.kt"
    i = {}
    l = {
        0xcc
    }
    m = "invokeSuspend"
    n = {}
    nl = {
        0xcb
    }
    s = {}
    v = 0x2
.end annotation


# instance fields
.field final synthetic $r:Lcom/pymcl/android/ui/state/InstanceRow;

.field final synthetic $state:Lcom/pymcl/android/ui/state/AppState;

.field label:I


# direct methods
.method constructor <init>(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/InstanceRow;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Lcom/pymcl/android/ui/state/InstanceRow;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/pages/GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$2;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$2;->$r:Lcom/pymcl/android/ui/state/InstanceRow;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
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

    new-instance v0, Lcom/pymcl/android/ui/pages/GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$2;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$2;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$2;->$r:Lcom/pymcl/android/ui/state/InstanceRow;

    invoke-direct {v0, v1, v2, p2}, Lcom/pymcl/android/ui/pages/GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$2;-><init>(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/InstanceRow;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/pages/GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/pages/GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 202
    iget v1, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$2;->label:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v1, p1

    goto :goto_1

    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 203
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$2;->$state:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/AppState;->getSelectedInstance()Ljava/lang/String;

    move-result-object v1

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$2;->$r:Lcom/pymcl/android/ui/state/InstanceRow;

    invoke-virtual {v4}, Lcom/pymcl/android/ui/state/InstanceRow;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$2;->$state:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/AppState;->getSelectedVersion()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    if-eqz v1, :cond_1

    iget-object v0, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$2;->$state:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/AppState;->getSelectedVersion()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    .line 204
    :cond_1
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$2;->$state:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/AppState;->getApi()Lcom/pymcl/android/ui/state/LauncherUiApi;

    move-result-object v1

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$2;->$r:Lcom/pymcl/android/ui/state/InstanceRow;

    invoke-virtual {v4}, Lcom/pymcl/android/ui/state/InstanceRow;->getName()Ljava/lang/String;

    move-result-object v4

    move-object v5, p0

    check-cast v5, Lkotlin/coroutines/Continuation;

    iput v3, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$2;->label:I

    invoke-interface {v1, v4, v5}, Lcom/pymcl/android/ui/state/LauncherUiApi;->getInstalledVersions(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    .line 202
    return-object v0

    .line 204
    :cond_2
    :goto_1
    check-cast v1, Ljava/util/List;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/state/InstalledVersion;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/InstalledVersion;->getId()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    if-nez v0, :cond_4

    const-string v0, ""

    .line 203
    :cond_4
    :goto_3
    nop

    .line 205
    .local v0, "v":Ljava/lang/String;
    move-object v1, v0

    check-cast v1, Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_5

    move v2, v3

    :cond_5
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$2;->$state:Lcom/pymcl/android/ui/state/AppState;

    if-eqz v2, :cond_6

    const-string v2, "\u5148\u5728\u8fd9\u4e2a\u5b9e\u4f8b\u91cc\u5b89\u88c5\u4e00\u4e2a\u7248\u672c"

    const-string v3, "warn"

    const-string v4, "\u6ca1\u6709\u53ef\u5bfc\u51fa\u7684\u7248\u672c"

    invoke-virtual {v1, v4, v2, v3}, Lcom/pymcl/android/ui/state/AppState;->toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    :cond_6
    new-instance v2, Lcom/pymcl/android/ui/state/DialogSpec$ExportModpack;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$2;->$r:Lcom/pymcl/android/ui/state/InstanceRow;

    invoke-virtual {v3}, Lcom/pymcl/android/ui/state/InstanceRow;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Lcom/pymcl/android/ui/state/DialogSpec$ExportModpack;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    check-cast v2, Lcom/pymcl/android/ui/state/DialogSpec;

    invoke-virtual {v1, v2}, Lcom/pymcl/android/ui/state/AppState;->open(Lcom/pymcl/android/ui/state/DialogSpec;)V

    .line 206
    :goto_4
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
