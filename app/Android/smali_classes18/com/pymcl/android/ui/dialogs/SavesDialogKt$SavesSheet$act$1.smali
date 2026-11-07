.class final Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$act$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SavesDialog.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/dialogs/SavesDialogKt;->SavesSheet$act(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableIntState;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
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
    c = "com.pymcl.android.ui.dialogs.SavesDialogKt$SavesSheet$act$1"
    f = "SavesDialog.kt"
    i = {}
    l = {
        0x6b
    }
    m = "invokeSuspend"
    n = {}
    nl = {
        0x6d
    }
    s = {}
    v = 0x2
.end annotation


# instance fields
.field final synthetic $block:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
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

.field final synthetic $failTitle:Ljava/lang/String;

.field final synthetic $gen$delegate:Landroidx/compose/runtime/MutableIntState;

.field final synthetic $okTitle:Ljava/lang/String;

.field final synthetic $state:Lcom/pymcl/android/ui/state/AppState;

.field label:I


# direct methods
.method constructor <init>(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Landroidx/compose/runtime/MutableIntState;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$act$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$act$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p2, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$act$1;->$okTitle:Ljava/lang/String;

    iput-object p3, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$act$1;->$failTitle:Ljava/lang/String;

    iput-object p4, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$act$1;->$block:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$act$1;->$gen$delegate:Landroidx/compose/runtime/MutableIntState;

    iput-object p6, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$act$1;->$busy$delegate:Landroidx/compose/runtime/MutableState;

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

    new-instance v0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$act$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$act$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$act$1;->$okTitle:Ljava/lang/String;

    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$act$1;->$failTitle:Ljava/lang/String;

    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$act$1;->$block:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$act$1;->$gen$delegate:Landroidx/compose/runtime/MutableIntState;

    iget-object v6, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$act$1;->$busy$delegate:Landroidx/compose/runtime/MutableState;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$act$1;-><init>(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$act$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$act$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$act$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$act$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 106
    iget v1, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$act$1;->label:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, p1

    goto :goto_0

    .line 109
    :catchall_0
    move-exception v0

    goto :goto_3

    .line 108
    :catch_0
    move-exception v0

    goto :goto_1

    .line 106
    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 107
    :try_start_1
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    check-cast v1, Lkotlin/coroutines/CoroutineContext;

    new-instance v4, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$act$1$msg$1;

    iget-object v5, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$act$1;->$block:Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x0

    invoke-direct {v4, v5, v6}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$act$1$msg$1;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    check-cast v4, Lkotlin/jvm/functions/Function2;

    move-object v5, p0

    check-cast v5, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$act$1;->label:I

    invoke-static {v1, v4, v5}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_0

    .line 106
    return-object v0

    .line 107
    :cond_0
    :goto_0
    check-cast v1, Ljava/lang/String;

    move-object v6, v1

    .local v6, "msg":Ljava/lang/String;
    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$act$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v5, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$act$1;->$okTitle:Ljava/lang/String;

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/pymcl/android/ui/state/AppState;->toast$default(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$act$1;->$gen$delegate:Landroidx/compose/runtime/MutableIntState;

    invoke-static {v0}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt;->access$SavesSheet$lambda$10(Landroidx/compose/runtime/MutableIntState;)I

    move-result v0

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$act$1;->$gen$delegate:Landroidx/compose/runtime/MutableIntState;

    add-int/2addr v0, v2

    invoke-static {v1, v0}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt;->access$SavesSheet$lambda$11(Landroidx/compose/runtime/MutableIntState;I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .end local v6    # "msg":Ljava/lang/String;
    goto :goto_2

    .line 108
    .local v0, "e":Ljava/lang/Exception;
    :goto_1
    :try_start_2
    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$act$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$act$1;->$failTitle:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_1

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v4

    :cond_1
    const-string v5, "error"

    invoke-virtual {v1, v2, v4, v5}, Lcom/pymcl/android/ui/state/AppState;->toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 109
    .end local v0    # "e":Ljava/lang/Exception;
    :goto_2
    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$act$1;->$busy$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v0, v3}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt;->access$SavesSheet$lambda$44(Landroidx/compose/runtime/MutableState;Z)V

    .line 110
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 109
    :goto_3
    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$act$1;->$busy$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1, v3}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt;->access$SavesSheet$lambda$44(Landroidx/compose/runtime/MutableState;Z)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
