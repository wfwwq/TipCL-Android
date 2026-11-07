.class final Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SavesDialog.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/dialogs/SavesDialogKt;->SavesSheet(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/DialogSpec$Saves;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
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
    value = "SMAP\nSavesDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavesDialog.kt\ncom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,393:1\n1#2:394\n*E\n"
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
    c = "com.pymcl.android.ui.dialogs.SavesDialogKt$SavesSheet$1$1"
    f = "SavesDialog.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0x4b
    }
    m = "invokeSuspend"
    n = {
        "$this$LaunchedEffect",
        "$this$invokeSuspend_u24lambda_u240\\1"
    }
    nl = {
        0x4d
    }
    s = {
        "L$0",
        "L$1"
    }
    v = 0x2
.end annotation


# instance fields
.field final synthetic $ctx:Landroid/content/Context;

.field final synthetic $d:Lcom/pymcl/android/ui/state/DialogSpec$Saves;

.field final synthetic $err$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $targets$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/pymcl/core/instance/SaveTarget;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $targetsLoaded$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Landroidx/compose/runtime/MutableState;Lcom/pymcl/android/ui/state/DialogSpec$Saves;Landroid/content/Context;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/pymcl/android/ui/state/DialogSpec$Saves;",
            "Landroid/content/Context;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/pymcl/core/instance/SaveTarget;",
            ">;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$1$1;->$targetsLoaded$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p2, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$1$1;->$d:Lcom/pymcl/android/ui/state/DialogSpec$Saves;

    iput-object p3, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$1$1;->$ctx:Landroid/content/Context;

    iput-object p4, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$1$1;->$err$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$1$1;->$targets$delegate:Landroidx/compose/runtime/MutableState;

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

    new-instance v0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$1$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$1$1;->$targetsLoaded$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$1$1;->$d:Lcom/pymcl/android/ui/state/DialogSpec$Saves;

    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$1$1;->$ctx:Landroid/content/Context;

    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$1$1;->$err$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v5, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$1$1;->$targets$delegate:Landroidx/compose/runtime/MutableState;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$1$1;-><init>(Landroidx/compose/runtime/MutableState;Lcom/pymcl/android/ui/state/DialogSpec$Saves;Landroid/content/Context;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$1$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$1$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11
    .param p1, "$result"    # Ljava/lang/Object;

    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$1$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlinx/coroutines/CoroutineScope;

    .local v0, "$this$LaunchedEffect":Lkotlinx/coroutines/CoroutineScope;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 73
    iget v2, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$1$1;->label:I

    const/4 v3, 0x1

    packed-switch v2, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    const/4 v1, 0x0

    .local v1, "$i$a$-runCatching-SavesDialogKt$SavesSheet$1$1$1\\1\\75\\0":I
    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$1$1;->L$2:Ljava/lang/Object;

    check-cast v2, Landroidx/compose/runtime/MutableState;

    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$1$1;->L$1:Ljava/lang/Object;

    check-cast v4, Lkotlinx/coroutines/CoroutineScope;

    .local v4, "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v6, v4

    move-object v4, p1

    goto :goto_0

    .end local v1    # "$i$a$-runCatching-SavesDialogKt$SavesSheet$1$1$1\\1\\75\\0":I
    .end local v4    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 74
    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$1$1;->$targetsLoaded$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v4, 0x0

    invoke-static {v2, v4}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt;->access$SavesSheet$lambda$60(Landroidx/compose/runtime/MutableState;Z)V

    .line 75
    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$1$1;->$targets$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$1$1;->$d:Lcom/pymcl/android/ui/state/DialogSpec$Saves;

    iget-object v5, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$1$1;->$ctx:Landroid/content/Context;

    :try_start_1
    sget-object v6, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v6, v0

    .line 394
    .local v6, "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    const/4 v7, 0x0

    .line 75
    .local v7, "$i$a$-runCatching-SavesDialogKt$SavesSheet$1$1$1\\1\\75\\0":I
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v8

    check-cast v8, Lkotlin/coroutines/CoroutineContext;

    new-instance v9, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$1$1$1$1;

    const/4 v10, 0x0

    invoke-direct {v9, v4, v5, v10}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$1$1$1$1;-><init>(Lcom/pymcl/android/ui/state/DialogSpec$Saves;Landroid/content/Context;Lkotlin/coroutines/Continuation;)V

    check-cast v9, Lkotlin/jvm/functions/Function2;

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$1$1;->L$0:Ljava/lang/Object;

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$1$1;->L$1:Ljava/lang/Object;

    iput-object v2, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$1$1;->L$2:Ljava/lang/Object;

    iput v3, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$1$1;->label:I

    invoke-static {v8, v9, p0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_0

    .line 73
    return-object v1

    .line 75
    :cond_0
    move v1, v7

    .line 73
    .end local v7    # "$i$a$-runCatching-SavesDialogKt$SavesSheet$1$1$1\\1\\75\\0":I
    .restart local v1    # "$i$a$-runCatching-SavesDialogKt$SavesSheet$1$1$1\\1\\75\\0":I
    :goto_0
    check-cast v4, Ljava/util/List;

    .line 77
    nop

    .line 75
    .end local v1    # "$i$a$-runCatching-SavesDialogKt$SavesSheet$1$1$1\\1\\75\\0":I
    .end local v6    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    invoke-static {v4}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :goto_1
    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$1$1;->$err$delegate:Landroidx/compose/runtime/MutableState;

    .line 77
    invoke-static {v1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v5

    if-nez v5, :cond_1

    goto :goto_2

    .line 394
    :cond_1
    nop

    .local v5, "it\\2":Ljava/lang/Throwable;
    const/4 v1, 0x0

    .line 77
    .local v1, "$i$a$-getOrElse-SavesDialogKt$SavesSheet$1$1$2\\2\\77\\0":I
    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_2

    invoke-virtual {v5}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v6

    :cond_2
    invoke-static {v4, v6}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt;->access$SavesSheet$lambda$14(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    .end local v1    # "$i$a$-getOrElse-SavesDialogKt$SavesSheet$1$1$2\\2\\77\\0":I
    .end local v5    # "it\\2":Ljava/lang/Throwable;
    :goto_2
    check-cast v1, Ljava/util/List;

    .line 75
    invoke-static {v2, v1}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt;->access$SavesSheet$lambda$5(Landroidx/compose/runtime/MutableState;Ljava/util/List;)V

    .line 78
    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$1$1;->$targetsLoaded$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1, v3}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt;->access$SavesSheet$lambda$60(Landroidx/compose/runtime/MutableState;Z)V

    .line 79
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
