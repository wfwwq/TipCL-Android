.class final Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AiPage.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/pages/AiPageKt;->AiPage$runFlow(Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/pages/AiSession;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Lkotlinx/coroutines/flow/Flow;)V
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

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAiPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiPage.kt\ncom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,517:1\n1#2:518\n*E\n"
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
    c = "com.pymcl.android.ui.pages.AiPageKt$AiPage$runFlow$1"
    f = "AiPage.kt"
    i = {
        0x0,
        0x1,
        0x2
    }
    l = {
        0x81,
        0x86,
        0x86
    }
    m = "invokeSuspend"
    n = {
        "r",
        "r",
        "r"
    }
    nl = {
        0x86,
        0x86,
        0x88
    }
    s = {
        "L$0",
        "L$0",
        "L$0"
    }
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

.field final synthetic $f:Lkotlinx/coroutines/flow/Flow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/Flow<",
            "Lcom/pymcl/ai/AiEvent;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $s:Lcom/pymcl/android/ui/pages/AiSession;

.field final synthetic $state:Lcom/pymcl/android/ui/state/AppState;

.field final synthetic $x:Lcom/pymcl/android/data/AiUiExtras;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lkotlinx/coroutines/flow/Flow;Lcom/pymcl/android/ui/pages/AiSession;Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/flow/Flow<",
            "+",
            "Lcom/pymcl/ai/AiEvent;",
            ">;",
            "Lcom/pymcl/android/ui/pages/AiSession;",
            "Lcom/pymcl/android/data/AiUiExtras;",
            "Lcom/pymcl/android/data/AiUiExtras;",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/ChatSummary;",
            ">;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->$f:Lkotlinx/coroutines/flow/Flow;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->$x:Lcom/pymcl/android/data/AiUiExtras;

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iput-object p5, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p6, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->$chats$delegate:Landroidx/compose/runtime/MutableState;

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

    new-instance v0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->$f:Lkotlinx/coroutines/flow/Flow;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->$x:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v5, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v6, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->$chats$delegate:Landroidx/compose/runtime/MutableState;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;-><init>(Lkotlinx/coroutines/flow/Flow;Lcom/pymcl/android/ui/pages/AiSession;Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 126
    iget v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->label:I

    const/4 v2, 0x0

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/pymcl/android/data/AiItemReducer;

    .local v0, "r":Lcom/pymcl/android/data/AiItemReducer;
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_2

    .end local v0    # "r":Lcom/pymcl/android/data/AiItemReducer;
    :pswitch_1
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/pymcl/android/ui/pages/AiSession;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lcom/pymcl/android/data/AiItemReducer;

    .local v3, "r":Lcom/pymcl/android/data/AiItemReducer;
    :try_start_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v4, p1

    goto :goto_1

    .end local v3    # "r":Lcom/pymcl/android/data/AiItemReducer;
    :pswitch_2
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/pymcl/android/data/AiItemReducer;

    .local v1, "r":Lcom/pymcl/android/data/AiItemReducer;
    :try_start_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object v3, v1

    goto :goto_0

    .end local v1    # "r":Lcom/pymcl/android/data/AiItemReducer;
    :pswitch_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 127
    nop

    .line 128
    :try_start_3
    new-instance v1, Lcom/pymcl/android/data/AiItemReducer;

    invoke-direct {v1}, Lcom/pymcl/android/data/AiItemReducer;-><init>()V

    .line 129
    .restart local v1    # "r":Lcom/pymcl/android/data/AiItemReducer;
    iget-object v3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->$f:Lkotlinx/coroutines/flow/Flow;

    new-instance v4, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1$1;

    iget-object v5, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    iget-object v6, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->$x:Lcom/pymcl/android/data/AiUiExtras;

    invoke-direct {v4, v5, v6, v1}, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1$1;-><init>(Lcom/pymcl/android/ui/pages/AiSession;Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/data/AiItemReducer;)V

    check-cast v4, Lkotlinx/coroutines/flow/FlowCollector;

    move-object v5, p0

    check-cast v5, Lkotlin/coroutines/Continuation;

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->L$0:Ljava/lang/Object;

    const/4 v6, 0x1

    iput v6, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->label:I

    invoke-interface {v3, v4, v5}, Lkotlinx/coroutines/flow/Flow;->collect(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_0

    .line 126
    return-object v0

    .line 129
    :cond_0
    move-object v3, v1

    .line 134
    .end local v1    # "r":Lcom/pymcl/android/data/AiItemReducer;
    .restart local v3    # "r":Lcom/pymcl/android/data/AiItemReducer;
    :goto_0
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->$x:Lcom/pymcl/android/data/AiUiExtras;

    move-object v5, p0

    check-cast v5, Lkotlin/coroutines/Continuation;

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->L$0:Ljava/lang/Object;

    iput-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->L$1:Ljava/lang/Object;

    const/4 v6, 0x2

    iput v6, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->label:I

    invoke-interface {v4, v5}, Lcom/pymcl/android/data/AiUiExtras;->activeChat(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_1

    .line 126
    return-object v0

    .line 134
    :cond_1
    :goto_1
    check-cast v4, Ljava/lang/String;

    invoke-virtual {v1, v4}, Lcom/pymcl/android/ui/pages/AiSession;->setActiveChat(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v5, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->$chats$delegate:Landroidx/compose/runtime/MutableState;

    move-object v6, p0

    check-cast v6, Lkotlin/coroutines/Continuation;

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->L$0:Ljava/lang/Object;

    const/4 v7, 0x0

    iput-object v7, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->L$1:Ljava/lang/Object;

    const/4 v7, 0x3

    iput v7, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->label:I

    invoke-static {v1, v4, v5, v6}, Lcom/pymcl/android/ui/pages/AiPageKt;->access$AiPage$reloadChats(Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-ne v1, v0, :cond_2

    .line 126
    return-object v0

    .line 136
    .end local v3    # "r":Lcom/pymcl/android/data/AiItemReducer;
    :cond_2
    :goto_2
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    invoke-virtual {v0, v2}, Lcom/pymcl/android/ui/pages/AiSession;->setRunning(Z)V

    .line 137
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->$x:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/pages/AiSession;->getActiveChat()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/pymcl/android/data/AiUiExtras;->needsReport(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->$x:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/pages/AiSession;->getActiveChat()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/pymcl/android/data/AiUiExtras;->report(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->$chats$delegate:Landroidx/compose/runtime/MutableState;

    .line 518
    .local v0, "it\\1":Lkotlinx/coroutines/flow/Flow;
    const/4 v5, 0x0

    .line 137
    .local v5, "$i$a$-let-AiPageKt$AiPage$runFlow$1$2\\1\\137\\0":I
    invoke-static {v1, v2, v3, v4, v0}, Lcom/pymcl/android/ui/pages/AiPageKt;->access$AiPage$runFlow(Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/pages/AiSession;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Lkotlinx/coroutines/flow/Flow;)V

    .line 138
    .end local v0    # "it\\1":Lkotlinx/coroutines/flow/Flow;
    .end local v5    # "$i$a$-let-AiPageKt$AiPage$runFlow$1$2\\1\\137\\0":I
    :cond_3
    nop

    .line 139
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 136
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    invoke-virtual {v1, v2}, Lcom/pymcl/android/ui/pages/AiSession;->setRunning(Z)V

    .line 137
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->$x:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    invoke-virtual {v2}, Lcom/pymcl/android/ui/pages/AiSession;->getActiveChat()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/pymcl/android/data/AiUiExtras;->needsReport(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->$x:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    invoke-virtual {v2}, Lcom/pymcl/android/ui/pages/AiSession;->getActiveChat()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/pymcl/android/data/AiUiExtras;->report(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v1

    if-eqz v1, :cond_4

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v5, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$runFlow$1;->$chats$delegate:Landroidx/compose/runtime/MutableState;

    .line 518
    .local v1, "it\\2":Lkotlinx/coroutines/flow/Flow;
    const/4 v6, 0x0

    .line 137
    .local v6, "$i$a$-let-AiPageKt$AiPage$runFlow$1$2\\2\\137\\0":I
    invoke-static {v2, v3, v4, v5, v1}, Lcom/pymcl/android/ui/pages/AiPageKt;->access$AiPage$runFlow(Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/pages/AiSession;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Lkotlinx/coroutines/flow/Flow;)V

    .end local v1    # "it\\2":Lkotlinx/coroutines/flow/Flow;
    .end local v6    # "$i$a$-let-AiPageKt$AiPage$runFlow$1$2\\2\\137\\0":I
    :cond_4
    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
