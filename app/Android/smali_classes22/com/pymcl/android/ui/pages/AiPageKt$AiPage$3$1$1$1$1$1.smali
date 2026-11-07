.class final Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$1$1$1;
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
    c = "com.pymcl.android.ui.pages.AiPageKt$AiPage$3$1$1$1$1$1"
    f = "AiPage.kt"
    i = {}
    l = {
        0xbf,
        0xbf,
        0xbf
    }
    m = "invokeSuspend"
    n = {}
    nl = {
        0xbf,
        0xbf,
        0xc0
    }
    s = {}
    v = 0x2
.end annotation


# instance fields
.field final synthetic $ai:Lcom/pymcl/android/data/AiUiExtras;

.field final synthetic $chats$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/ChatSummary;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $s:Lcom/pymcl/android/ui/pages/AiSession;

.field final synthetic $state:Lcom/pymcl/android/ui/state/AppState;

.field L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lcom/pymcl/android/ui/pages/AiSession;Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/data/AiUiExtras;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/pages/AiSession;",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Lcom/pymcl/android/data/AiUiExtras;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/ChatSummary;",
            ">;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$1$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$1$1$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$1$1$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$1$1$1;->$chats$delegate:Landroidx/compose/runtime/MutableState;

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

    new-instance v0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$1$1$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$1$1$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$1$1$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$1$1$1;->$chats$delegate:Landroidx/compose/runtime/MutableState;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$1$1$1;-><init>(Lcom/pymcl/android/ui/pages/AiSession;Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/data/AiUiExtras;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$1$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$1$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$1$1$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 189
    iget v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$1$1$1;->label:I

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_2
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$1$1$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/pymcl/android/ui/pages/AiSession;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v2, p1

    goto :goto_0

    :pswitch_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 190
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$1$1$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/pages/AiSession;->getRunning()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$1$1$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$1$1$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    invoke-static {v1, v2}, Lcom/pymcl/android/ui/pages/AiPageKt;->access$AiPage$stop(Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/pages/AiSession;)V

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    const/4 v7, 0x6

    const/4 v8, 0x0

    const-string v4, "\u5df2\u505c\u6b62\u4e0a\u4e00\u4e2a\u5bf9\u8bdd\u7684\u56de\u5408"

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/pymcl/android/ui/state/AppState;->toast$default(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 191
    :cond_0
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$1$1$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$1$1$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$1$1$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    move-object v3, p0

    check-cast v3, Lkotlin/coroutines/Continuation;

    iput-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$1$1$1;->L$0:Ljava/lang/Object;

    const/4 v4, 0x1

    iput v4, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$1$1$1;->label:I

    invoke-interface {v2, v3}, Lcom/pymcl/android/data/AiUiExtras;->newChat(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_1

    .line 189
    return-object v0

    .line 191
    :cond_1
    :goto_0
    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/pymcl/android/ui/pages/AiSession;->setActiveChat(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$1$1$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$1$1$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$1$1$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    invoke-virtual {v3}, Lcom/pymcl/android/ui/pages/AiSession;->getActiveChat()Ljava/lang/String;

    move-result-object v3

    move-object v4, p0

    check-cast v4, Lkotlin/coroutines/Continuation;

    const/4 v5, 0x0

    iput-object v5, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$1$1$1;->L$0:Ljava/lang/Object;

    const/4 v5, 0x2

    iput v5, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$1$1$1;->label:I

    invoke-static {v1, v2, v3, v4}, Lcom/pymcl/android/ui/pages/AiPageKt;->access$AiPage$loadHistory(Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/pages/AiSession;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    .line 189
    return-object v0

    .line 191
    :cond_2
    :goto_1
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$1$1$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$1$1$1;->$chats$delegate:Landroidx/compose/runtime/MutableState;

    move-object v4, p0

    check-cast v4, Lkotlin/coroutines/Continuation;

    const/4 v5, 0x3

    iput v5, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$1$1$1;->label:I

    invoke-static {v1, v2, v3, v4}, Lcom/pymcl/android/ui/pages/AiPageKt;->access$AiPage$reloadChats(Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_3

    .line 189
    return-object v0

    .line 191
    :cond_3
    :goto_2
    goto :goto_3

    :cond_4
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$1$1$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    invoke-virtual {v0}, Lcom/pymcl/android/ui/pages/AiSession;->getItems()Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->clear()V

    .line 192
    :goto_3
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
