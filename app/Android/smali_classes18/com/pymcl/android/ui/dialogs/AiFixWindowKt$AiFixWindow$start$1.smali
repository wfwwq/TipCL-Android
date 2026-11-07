.class final Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$start$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AiFixWindow.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/dialogs/AiFixWindowKt;->AiFixWindow$start(Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/snapshots/SnapshotStateList;Ljava/lang/String;Lcom/pymcl/android/ui/state/CrashInfo;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
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
    c = "com.pymcl.android.ui.dialogs.AiFixWindowKt$AiFixWindow$start$1"
    f = "AiFixWindow.kt"
    i = {}
    l = {
        0x49
    }
    m = "invokeSuspend"
    n = {}
    nl = {
        0x4a
    }
    s = {}
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

.field final synthetic $info:Lcom/pymcl/android/ui/state/CrashInfo;

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

.field final synthetic $visible:Ljava/lang/String;

.field final synthetic $x:Lcom/pymcl/android/data/AiUiExtras;

.field label:I


# direct methods
.method constructor <init>(Lcom/pymcl/android/data/AiUiExtras;Landroidx/compose/runtime/snapshots/SnapshotStateList;Ljava/lang/String;Lcom/pymcl/android/ui/state/CrashInfo;Landroidx/compose/runtime/MutableState;Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/data/AiUiExtras;",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/pymcl/android/ui/state/AiItem;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/pymcl/android/ui/state/CrashInfo;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/pymcl/android/data/AiUiExtras;",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$start$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$start$1;->$x:Lcom/pymcl/android/data/AiUiExtras;

    iput-object p2, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$start$1;->$items:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iput-object p3, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$start$1;->$visible:Ljava/lang/String;

    iput-object p4, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$start$1;->$info:Lcom/pymcl/android/ui/state/CrashInfo;

    iput-object p5, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$start$1;->$chatId$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$start$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iput-object p7, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$start$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p8, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$start$1;->$running$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p9}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 10
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

    new-instance v0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$start$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$start$1;->$x:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$start$1;->$items:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$start$1;->$visible:Ljava/lang/String;

    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$start$1;->$info:Lcom/pymcl/android/ui/state/CrashInfo;

    iget-object v5, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$start$1;->$chatId$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v6, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$start$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v7, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$start$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v8, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$start$1;->$running$delegate:Landroidx/compose/runtime/MutableState;

    move-object v9, p2

    invoke-direct/range {v0 .. v9}, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$start$1;-><init>(Lcom/pymcl/android/data/AiUiExtras;Landroidx/compose/runtime/snapshots/SnapshotStateList;Ljava/lang/String;Lcom/pymcl/android/ui/state/CrashInfo;Landroidx/compose/runtime/MutableState;Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$start$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$start$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$start$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$start$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 71
    iget v2, v0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$start$1;->label:I

    packed-switch v2, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_0

    :pswitch_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 72
    iget-object v2, v0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$start$1;->$x:Lcom/pymcl/android/data/AiUiExtras;

    invoke-interface {v2}, Lcom/pymcl/android/data/AiUiExtras;->isRunning()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$start$1;->$x:Lcom/pymcl/android/data/AiUiExtras;

    invoke-interface {v2}, Lcom/pymcl/android/data/AiUiExtras;->stop()V

    .line 73
    :cond_0
    iget-object v2, v0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$start$1;->$x:Lcom/pymcl/android/data/AiUiExtras;

    move-object v3, v0

    check-cast v3, Lkotlin/coroutines/Continuation;

    const/4 v4, 0x1

    iput v4, v0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$start$1;->label:I

    invoke-interface {v2, v3}, Lcom/pymcl/android/data/AiUiExtras;->newChat(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_1

    .line 71
    return-object v1

    .line 73
    :cond_1
    :goto_0
    move-object v1, v2

    check-cast v1, Ljava/lang/String;

    .local v1, "id":Ljava/lang/String;
    iget-object v2, v0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$start$1;->$chatId$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v2, v1}, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt;->access$AiFixWindow$lambda$10(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    .line 74
    sget-object v2, Lcom/pymcl/android/ui/pages/AiSession;->INSTANCE:Lcom/pymcl/android/ui/pages/AiSession;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/pymcl/android/ui/pages/AiSession;->setLoaded(Z)V

    .line 75
    iget-object v2, v0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$start$1;->$items:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    check-cast v2, Ljava/util/Collection;

    new-instance v3, Lcom/pymcl/android/ui/state/AiItem$User;

    const-string v4, "fix-u"

    iget-object v5, v0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$start$1;->$visible:Ljava/lang/String;

    invoke-direct {v3, v4, v5}, Lcom/pymcl/android/ui/state/AiItem$User;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 76
    iget-object v6, v0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$start$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v7, v0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$start$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v8, v0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$start$1;->$running$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v9, v0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$start$1;->$items:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iget-object v10, v0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$start$1;->$chatId$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v2, v0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$start$1;->$x:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v3, v0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$start$1;->$visible:Ljava/lang/String;

    sget-object v11, Lcom/pymcl/android/data/AiFixPrompt;->INSTANCE:Lcom/pymcl/android/data/AiFixPrompt;

    iget-object v12, v0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$start$1;->$info:Lcom/pymcl/android/ui/state/CrashInfo;

    const/4 v15, 0x6

    const/16 v16, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Lcom/pymcl/android/data/AiFixPrompt;->hidden$default(Lcom/pymcl/android/data/AiFixPrompt;Lcom/pymcl/android/ui/state/CrashInfo;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v1, v4}, Lcom/pymcl/android/data/AiUiExtras;->send(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v11

    invoke-static/range {v6 .. v11}, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt;->access$AiFixWindow$runFix(Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/compose/runtime/MutableState;Lkotlinx/coroutines/flow/Flow;)V

    .line 77
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
