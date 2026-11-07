.class final Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AiFixWindow.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/dialogs/AiFixWindowKt;->AiFixWindow$runFix(Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/compose/runtime/MutableState;Lkotlinx/coroutines/flow/Flow;)V
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
    value = "SMAP\nAiFixWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiFixWindow.kt\ncom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"
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
    c = "com.pymcl.android.ui.dialogs.AiFixWindowKt$AiFixWindow$runFix$1"
    f = "AiFixWindow.kt"
    i = {
        0x0
    }
    l = {
        0x3c
    }
    m = "invokeSuspend"
    n = {
        "r"
    }
    nl = {
        0x3e
    }
    s = {
        "L$0"
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

.field final synthetic $f:Lkotlinx/coroutines/flow/Flow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/Flow<",
            "Lcom/pymcl/ai/AiEvent;",
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

.field final synthetic $x:Lcom/pymcl/android/data/AiUiExtras;

.field L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lkotlinx/coroutines/flow/Flow;Lcom/pymcl/android/data/AiUiExtras;Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/state/AppState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/flow/Flow<",
            "+",
            "Lcom/pymcl/ai/AiEvent;",
            ">;",
            "Lcom/pymcl/android/data/AiUiExtras;",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/pymcl/android/ui/state/AiItem;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/pymcl/android/data/AiUiExtras;",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->$f:Lkotlinx/coroutines/flow/Flow;

    iput-object p2, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->$x:Lcom/pymcl/android/data/AiUiExtras;

    iput-object p3, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->$items:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iput-object p4, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->$running$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->$chatId$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iput-object p7, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p8}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 9
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

    new-instance v0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->$f:Lkotlinx/coroutines/flow/Flow;

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->$x:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->$items:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->$running$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v5, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->$chatId$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v6, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v7, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;-><init>(Lkotlinx/coroutines/flow/Flow;Lcom/pymcl/android/data/AiUiExtras;Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/state/AppState;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 57
    iget v1, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->label:I

    const/4 v2, 0x0

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/pymcl/android/data/AiItemReducer;

    .local v0, "r":Lcom/pymcl/android/data/AiItemReducer;
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .end local v0    # "r":Lcom/pymcl/android/data/AiItemReducer;
    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 58
    nop

    .line 59
    :try_start_1
    new-instance v1, Lcom/pymcl/android/data/AiItemReducer;

    invoke-direct {v1}, Lcom/pymcl/android/data/AiItemReducer;-><init>()V

    .line 60
    .local v1, "r":Lcom/pymcl/android/data/AiItemReducer;
    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->$f:Lkotlinx/coroutines/flow/Flow;

    new-instance v4, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1$1;

    iget-object v5, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->$items:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-direct {v4, v1, v5}, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1$1;-><init>(Lcom/pymcl/android/data/AiItemReducer;Landroidx/compose/runtime/snapshots/SnapshotStateList;)V

    check-cast v4, Lkotlinx/coroutines/flow/FlowCollector;

    move-object v5, p0

    check-cast v5, Lkotlin/coroutines/Continuation;

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->L$0:Ljava/lang/Object;

    const/4 v6, 0x1

    iput v6, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->label:I

    invoke-interface {v3, v4, v5}, Lkotlinx/coroutines/flow/Flow;->collect(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne v3, v0, :cond_0

    .line 57
    return-object v0

    .line 62
    .end local v1    # "r":Lcom/pymcl/android/data/AiItemReducer;
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->$running$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v0, v2}, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt;->access$AiFixWindow$lambda$4(Landroidx/compose/runtime/MutableState;Z)V

    .line 63
    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->$x:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->$chatId$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1}, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt;->access$AiFixWindow$lambda$9(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/pymcl/android/data/AiUiExtras;->needsReport(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->$x:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->$chatId$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1}, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt;->access$AiFixWindow$lambda$9(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/pymcl/android/data/AiUiExtras;->report(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->$running$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->$items:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iget-object v5, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->$chatId$delegate:Landroidx/compose/runtime/MutableState;

    move-object v6, v0

    .line 148
    .local v6, "it\\1":Lkotlinx/coroutines/flow/Flow;
    const/4 v0, 0x0

    .line 63
    .local v0, "$i$a$-let-AiFixWindowKt$AiFixWindow$runFix$1$2\\1\\63\\0":I
    invoke-static/range {v1 .. v6}, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt;->access$AiFixWindow$runFix(Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/compose/runtime/MutableState;Lkotlinx/coroutines/flow/Flow;)V

    .line 64
    .end local v0    # "$i$a$-let-AiFixWindowKt$AiFixWindow$runFix$1$2\\1\\63\\0":I
    .end local v6    # "it\\1":Lkotlinx/coroutines/flow/Flow;
    :cond_1
    nop

    .line 65
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 62
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->$running$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1, v2}, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt;->access$AiFixWindow$lambda$4(Landroidx/compose/runtime/MutableState;Z)V

    .line 63
    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->$x:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->$chatId$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v2}, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt;->access$AiFixWindow$lambda$9(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/pymcl/android/data/AiUiExtras;->needsReport(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->$x:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->$chatId$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v2}, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt;->access$AiFixWindow$lambda$9(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/pymcl/android/data/AiUiExtras;->report(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->$running$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v5, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->$items:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iget-object v6, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->$chatId$delegate:Landroidx/compose/runtime/MutableState;

    move-object v7, v1

    .line 148
    .local v7, "it\\2":Lkotlinx/coroutines/flow/Flow;
    const/4 v1, 0x0

    .line 63
    .local v1, "$i$a$-let-AiFixWindowKt$AiFixWindow$runFix$1$2\\2\\63\\0":I
    invoke-static/range {v2 .. v7}, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt;->access$AiFixWindow$runFix(Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/compose/runtime/MutableState;Lkotlinx/coroutines/flow/Flow;)V

    .end local v1    # "$i$a$-let-AiFixWindowKt$AiFixWindow$runFix$1$2\\2\\63\\0":I
    .end local v7    # "it\\2":Lkotlinx/coroutines/flow/Flow;
    :cond_2
    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
