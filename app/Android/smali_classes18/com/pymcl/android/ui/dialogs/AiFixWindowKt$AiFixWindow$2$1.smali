.class final Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AiFixWindow.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/dialogs/AiFixWindowKt;->AiFixWindow(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/CrashInfo;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
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
    c = "com.pymcl.android.ui.dialogs.AiFixWindowKt$AiFixWindow$2$1"
    f = "AiFixWindow.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0x5e
    }
    m = "invokeSuspend"
    n = {
        "x",
        "id"
    }
    nl = {
        0x63
    }
    s = {
        "L$0",
        "L$1"
    }
    v = 0x2
.end annotation


# instance fields
.field final synthetic $ai:Lcom/pymcl/android/data/AiUiExtras;

.field final synthetic $chatId$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $items:Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/pymcl/android/ui/state/AiItem;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $running$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $state:Lcom/pymcl/android/ui/state/AppState;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lcom/pymcl/android/data/AiUiExtras;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/compose/runtime/MutableState;Lcom/pymcl/android/ui/state/AppState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/data/AiUiExtras;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/pymcl/android/ui/state/AiItem;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iput-object p2, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1;->$chatId$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p3, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1;->$items:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iput-object p4, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1;->$running$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1;->$state:Lcom/pymcl/android/ui/state/AppState;

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

    new-instance v0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1;->$chatId$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1;->$items:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1;->$running$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v5, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1;-><init>(Lcom/pymcl/android/data/AiUiExtras;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/compose/runtime/MutableState;Lcom/pymcl/android/ui/state/AppState;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 91
    iget v1, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1;->label:I

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1;->L$1:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .local v0, "id":Ljava/lang/String;
    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/pymcl/android/data/AiUiExtras;

    .local v1, "x":Lcom/pymcl/android/data/AiUiExtras;
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    .end local v0    # "id":Ljava/lang/String;
    .end local v1    # "x":Lcom/pymcl/android/data/AiUiExtras;
    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 92
    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    if-nez v1, :cond_0

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    :cond_0
    move-object v3, v1

    .line 93
    .local v3, "x":Lcom/pymcl/android/data/AiUiExtras;
    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1;->$chatId$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1}, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt;->access$AiFixWindow$lambda$9(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 94
    .local v2, "id":Ljava/lang/String;
    :cond_1
    invoke-interface {v3}, Lcom/pymcl/android/data/AiUiExtras;->getBackgroundEvents()Lkotlinx/coroutines/flow/Flow;

    move-result-object v9

    new-instance v1, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1$1;

    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1;->$items:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iget-object v5, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1;->$running$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v6, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v7, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v8, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1;->$chatId$delegate:Landroidx/compose/runtime/MutableState;

    invoke-direct/range {v1 .. v8}, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1$1;-><init>(Ljava/lang/String;Lcom/pymcl/android/data/AiUiExtras;Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/compose/runtime/MutableState;Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;)V

    check-cast v1, Lkotlinx/coroutines/flow/FlowCollector;

    move-object v4, p0

    check-cast v4, Lkotlin/coroutines/Continuation;

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1;->L$0:Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1;->L$1:Ljava/lang/Object;

    const/4 v5, 0x1

    iput v5, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1;->label:I

    invoke-interface {v9, v1, v4}, Lkotlinx/coroutines/flow/Flow;->collect(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    .line 91
    return-object v0

    .line 94
    :cond_2
    move-object v0, v2

    move-object v1, v3

    .line 99
    .end local v2    # "id":Ljava/lang/String;
    .end local v3    # "x":Lcom/pymcl/android/data/AiUiExtras;
    .restart local v0    # "id":Ljava/lang/String;
    .restart local v1    # "x":Lcom/pymcl/android/data/AiUiExtras;
    :goto_0
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
