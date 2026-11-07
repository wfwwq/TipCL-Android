.class final Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AiPage.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/pages/AiPageKt;->AiPage(Lcom/pymcl/android/ui/state/AppState;ZLjava/util/List;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.pymcl.android.ui.pages.AiPageKt$AiPage$3$1$1$2$1$1$1$1"
    f = "AiPage.kt"
    i = {}
    l = {
        0xcb,
        0xcb
    }
    m = "invokeSuspend"
    n = {}
    nl = {
        0xcb,
        0xcc
    }
    s = {}
    v = 0x2
.end annotation


# instance fields
.field final synthetic $ai:Lcom/pymcl/android/data/AiUiExtras;

.field final synthetic $ch:Lcom/pymcl/android/ui/state/ChatSummary;

.field final synthetic $s:Lcom/pymcl/android/ui/pages/AiSession;

.field final synthetic $state:Lcom/pymcl/android/ui/state/AppState;

.field label:I


# direct methods
.method constructor <init>(Lcom/pymcl/android/ui/pages/AiSession;Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/state/ChatSummary;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/pages/AiSession;",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Lcom/pymcl/android/data/AiUiExtras;",
            "Lcom/pymcl/android/ui/state/ChatSummary;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$1$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$1$1$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$1$1$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$1$1$1;->$ch:Lcom/pymcl/android/ui/state/ChatSummary;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
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

    new-instance v0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$1$1$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$1$1$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$1$1$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$1$1$1;->$ch:Lcom/pymcl/android/ui/state/ChatSummary;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$1$1$1;-><init>(Lcom/pymcl/android/ui/pages/AiSession;Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/state/ChatSummary;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$1$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$1$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$1$1$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 201
    iget v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$1$1$1;->label:I

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v1, p1

    goto :goto_0

    :pswitch_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 202
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$1$1$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/pages/AiSession;->getRunning()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$1$1$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$1$1$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    invoke-static {v1, v2}, Lcom/pymcl/android/ui/pages/AiPageKt;->access$AiPage$stop(Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/pages/AiSession;)V

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    const/4 v7, 0x2

    const/4 v8, 0x0

    const-string v4, "\u5207\u6362\u5bf9\u8bdd\u65f6\u6b63\u5728\u8fd0\u884c\u7684\u90a3\u4e00\u8f6e\u5df2\u4e2d\u65ad"

    const/4 v5, 0x0

    const-string v6, "info"

    invoke-static/range {v3 .. v8}, Lcom/pymcl/android/ui/state/AppState;->toast$default(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 203
    :cond_0
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$1$1$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    if-eqz v1, :cond_2

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$1$1$1;->$ch:Lcom/pymcl/android/ui/state/ChatSummary;

    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/ChatSummary;->getId()Ljava/lang/String;

    move-result-object v2

    move-object v3, p0

    check-cast v3, Lkotlin/coroutines/Continuation;

    const/4 v4, 0x1

    iput v4, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$1$1$1;->label:I

    invoke-interface {v1, v2, v3}, Lcom/pymcl/android/data/AiUiExtras;->setActive(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_1

    .line 201
    return-object v0

    .line 203
    :cond_1
    :goto_0
    check-cast v1, Lkotlin/Unit;

    :cond_2
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$1$1$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$1$1$1;->$ch:Lcom/pymcl/android/ui/state/ChatSummary;

    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/ChatSummary;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/pymcl/android/ui/pages/AiSession;->setActiveChat(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$1$1$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$1$1$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$1$1$1;->$ch:Lcom/pymcl/android/ui/state/ChatSummary;

    invoke-virtual {v3}, Lcom/pymcl/android/ui/state/ChatSummary;->getId()Ljava/lang/String;

    move-result-object v3

    move-object v4, p0

    check-cast v4, Lkotlin/coroutines/Continuation;

    const/4 v5, 0x2

    iput v5, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$1$1$1;->label:I

    invoke-static {v1, v2, v3, v4}, Lcom/pymcl/android/ui/pages/AiPageKt;->access$AiPage$loadHistory(Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/pages/AiSession;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_3

    .line 201
    return-object v0

    .line 204
    :cond_3
    :goto_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
