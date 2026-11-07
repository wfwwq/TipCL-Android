.class final Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1;
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
    c = "com.pymcl.android.ui.pages.AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1"
    f = "AiPage.kt"
    i = {}
    l = {
        0xd4,
        0xd5,
        0xd5,
        0xd6
    }
    m = "invokeSuspend"
    n = {}
    nl = {
        0xd5,
        0xd5,
        0xd6,
        0xd7
    }
    s = {}
    v = 0x2
.end annotation


# instance fields
.field final synthetic $ai:Lcom/pymcl/android/data/AiUiExtras;

.field final synthetic $ch:Lcom/pymcl/android/ui/state/ChatSummary;

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
.method constructor <init>(Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/state/ChatSummary;Lcom/pymcl/android/ui/pages/AiSession;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/data/AiUiExtras;",
            "Lcom/pymcl/android/ui/state/ChatSummary;",
            "Lcom/pymcl/android/ui/pages/AiSession;",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/ChatSummary;",
            ">;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1;->$ch:Lcom/pymcl/android/ui/state/ChatSummary;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p5, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1;->$chats$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
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

    new-instance v0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1;->$ch:Lcom/pymcl/android/ui/state/ChatSummary;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v5, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1;->$chats$delegate:Landroidx/compose/runtime/MutableState;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1;-><init>(Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/state/ChatSummary;Lcom/pymcl/android/ui/pages/AiSession;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 211
    iget v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1;->label:I

    const/4 v2, 0x0

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_2
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/pymcl/android/ui/pages/AiSession;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v3, p1

    goto :goto_1

    :pswitch_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v1, p1

    goto :goto_0

    :pswitch_4
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 212
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    if-eqz v1, :cond_1

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1;->$ch:Lcom/pymcl/android/ui/state/ChatSummary;

    invoke-virtual {v3}, Lcom/pymcl/android/ui/state/ChatSummary;->getId()Ljava/lang/String;

    move-result-object v3

    move-object v4, p0

    check-cast v4, Lkotlin/coroutines/Continuation;

    const/4 v5, 0x1

    iput v5, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1;->label:I

    invoke-interface {v1, v3, v4}, Lcom/pymcl/android/data/AiUiExtras;->deleteChat(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_0

    .line 211
    return-object v0

    .line 212
    :cond_0
    :goto_0
    check-cast v1, Lkotlin/Unit;

    .line 213
    :cond_1
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1;->$ch:Lcom/pymcl/android/ui/state/ChatSummary;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/ChatSummary;->getId()Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    invoke-virtual {v3}, Lcom/pymcl/android/ui/pages/AiSession;->getActiveChat()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    if-eqz v3, :cond_3

    move-object v4, p0

    check-cast v4, Lkotlin/coroutines/Continuation;

    iput-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1;->L$0:Ljava/lang/Object;

    const/4 v5, 0x2

    iput v5, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1;->label:I

    invoke-interface {v3, v4}, Lcom/pymcl/android/data/AiUiExtras;->activeChat(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_2

    .line 211
    return-object v0

    .line 213
    :cond_2
    :goto_1
    check-cast v3, Ljava/lang/String;

    goto :goto_2

    :cond_3
    move-object v3, v2

    :goto_2
    invoke-virtual {v1, v3}, Lcom/pymcl/android/ui/pages/AiSession;->setActiveChat(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    invoke-virtual {v4}, Lcom/pymcl/android/ui/pages/AiSession;->getActiveChat()Ljava/lang/String;

    move-result-object v4

    move-object v5, p0

    check-cast v5, Lkotlin/coroutines/Continuation;

    iput-object v2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1;->L$0:Ljava/lang/Object;

    const/4 v2, 0x3

    iput v2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1;->label:I

    invoke-static {v1, v3, v4, v5}, Lcom/pymcl/android/ui/pages/AiPageKt;->access$AiPage$loadHistory(Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/pages/AiSession;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_4

    .line 211
    return-object v0

    .line 214
    :cond_4
    :goto_3
    nop

    :cond_5
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1;->$chats$delegate:Landroidx/compose/runtime/MutableState;

    move-object v4, p0

    check-cast v4, Lkotlin/coroutines/Continuation;

    const/4 v5, 0x4

    iput v5, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1;->label:I

    invoke-static {v1, v2, v3, v4}, Lcom/pymcl/android/ui/pages/AiPageKt;->access$AiPage$reloadChats(Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_6

    .line 211
    return-object v0

    .line 215
    :cond_6
    :goto_4
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
