.class final Lcom/pymcl/android/ui/pages/MiscPagesKt$MultiplayerPage$3$3$4$2$2$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "MiscPages.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/pages/MiscPagesKt;->MultiplayerPage(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMiscPages.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiscPages.kt\ncom/pymcl/android/ui/pages/MiscPagesKt$MultiplayerPage$3$3$4$2$2$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,585:1\n1#2:586\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
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
    c = "com.pymcl.android.ui.pages.MiscPagesKt$MultiplayerPage$3$3$4$2$2$1$1"
    f = "MiscPages.kt"
    i = {}
    l = {
        0x62
    }
    m = "invokeSuspend"
    n = {}
    nl = {
        0x24a
    }
    s = {}
    v = 0x2
.end annotation


# instance fields
.field final synthetic $code$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $state:Lcom/pymcl/android/ui/state/AppState;

.field label:I


# direct methods
.method constructor <init>(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/pages/MiscPagesKt$MultiplayerPage$3$3$4$2$2$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$MultiplayerPage$3$3$4$2$2$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$MultiplayerPage$3$3$4$2$2$1$1;->$code$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v0, 0x1

    invoke-direct {p0, v0, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/pymcl/android/ui/pages/MiscPagesKt$MultiplayerPage$3$3$4$2$2$1$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$MultiplayerPage$3$3$4$2$2$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$MultiplayerPage$3$3$4$2$2$1$1;->$code$delegate:Landroidx/compose/runtime/MutableState;

    invoke-direct {v0, v1, v2, p1}, Lcom/pymcl/android/ui/pages/MiscPagesKt$MultiplayerPage$3$3$4$2$2$1$1;-><init>(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/pymcl/android/ui/pages/MiscPagesKt$MultiplayerPage$3$3$4$2$2$1$1;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/pymcl/android/ui/pages/MiscPagesKt$MultiplayerPage$3$3$4$2$2$1$1;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/pages/MiscPagesKt$MultiplayerPage$3$3$4$2$2$1$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/pages/MiscPagesKt$MultiplayerPage$3$3$4$2$2$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 98
    iget v1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$MultiplayerPage$3$3$4$2$2$1$1;->label:I

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

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$MultiplayerPage$3$3$4$2$2$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/AppState;->getApi()Lcom/pymcl/android/ui/state/LauncherUiApi;

    move-result-object v1

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$MultiplayerPage$3$3$4$2$2$1$1;->$code$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v2}, Lcom/pymcl/android/ui/pages/MiscPagesKt;->access$MultiplayerPage$lambda$3(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v2

    move-object v3, p0

    check-cast v3, Lkotlin/coroutines/Continuation;

    const/4 v4, 0x1

    iput v4, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$MultiplayerPage$3$3$4$2$2$1$1;->label:I

    invoke-interface {v1, v2, v3}, Lcom/pymcl/android/ui/state/LauncherUiApi;->terracottaJoin(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_0

    return-object v0

    :cond_0
    :goto_0
    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v0, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$MultiplayerPage$3$3$4$2$2$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    .line 586
    .local v1, "err\\1":Ljava/lang/String;
    const/4 v2, 0x0

    .line 98
    .local v2, "$i$a$-let-MiscPagesKt$MultiplayerPage$3$3$4$2$2$1$1$1\\1\\98\\0":I
    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v3}, Lcom/pymcl/android/ui/i18n/I18nKt;->tr(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "error"

    const-string v5, "\u65e0\u6cd5\u52a0\u5165"

    invoke-virtual {v0, v5, v3, v4}, Lcom/pymcl/android/ui/state/AppState;->toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .end local v1    # "err\\1":Ljava/lang/String;
    .end local v2    # "$i$a$-let-MiscPagesKt$MultiplayerPage$3$3$4$2$2$1$1$1\\1\\98\\0":I
    :cond_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
