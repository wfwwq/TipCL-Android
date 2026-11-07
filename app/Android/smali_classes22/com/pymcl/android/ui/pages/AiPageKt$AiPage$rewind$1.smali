.class final Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AiPage.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/pages/AiPageKt;->AiPage$rewind(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/pages/AiSession;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)Lkotlinx/coroutines/Job;
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
    value = "SMAP\nAiPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiPage.kt\ncom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,517:1\n391#2,7:518\n1#3:525\n*S KotlinDebug\n*F\n+ 1 AiPage.kt\ncom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1\n*L\n169#1:518,7\n*E\n"
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
    c = "com.pymcl.android.ui.pages.AiPageKt$AiPage$rewind$1"
    f = "AiPage.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1,
        0x2,
        0x2,
        0x3,
        0x3
    }
    l = {
        0xad,
        0xae,
        0xae,
        0xb1
    }
    m = "invokeSuspend"
    n = {
        "$this$launch",
        "$this$invokeSuspend_u24lambda_u241\\3",
        "$this$launch",
        "r\\4",
        "$this$launch",
        "r\\4",
        "$this$launch",
        "r\\4"
    }
    nl = {
        0xad,
        0xae,
        0xaf,
        0xb2
    }
    s = {
        "L$0",
        "L$1",
        "L$0",
        "L$6",
        "L$0",
        "L$6",
        "L$0",
        "L$2"
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

.field final synthetic $input$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $s:Lcom/pymcl/android/ui/pages/AiSession;

.field final synthetic $state:Lcom/pymcl/android/ui/state/AppState;

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field L$7:Ljava/lang/Object;

.field L$8:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/pages/AiSession;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/data/AiUiExtras;",
            "Lcom/pymcl/android/ui/pages/AiSession;",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/ChatSummary;",
            ">;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->$input$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->$chats$delegate:Landroidx/compose/runtime/MutableState;

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

    new-instance v0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->$input$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v5, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->$chats$delegate:Landroidx/compose/runtime/MutableState;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;-><init>(Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/pages/AiSession;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v1, p0

    iget-object v0, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$0:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlinx/coroutines/CoroutineScope;

    .local v2, "$this$launch":Lkotlinx/coroutines/CoroutineScope;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 167
    iget v0, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->label:I

    const-string v4, "error"

    const-string v5, ""

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const/4 v0, 0x0

    .local v0, "$i$a$-onSuccess-AiPageKt$AiPage$rewind$1$2\\4\\173\\0":I
    iget-object v3, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$2:Ljava/lang/Object;

    check-cast v3, Lcom/pymcl/ai/RewindOutcome;

    .local v3, "r\\4":Lcom/pymcl/ai/RewindOutcome;
    iget-object v6, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$1:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_a

    .end local v0    # "$i$a$-onSuccess-AiPageKt$AiPage$rewind$1$2\\4\\173\\0":I
    .end local v3    # "r\\4":Lcom/pymcl/ai/RewindOutcome;
    :pswitch_1
    const/4 v0, 0x0

    .restart local v0    # "$i$a$-onSuccess-AiPageKt$AiPage$rewind$1$2\\4\\173\\0":I
    iget-object v7, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$6:Ljava/lang/Object;

    check-cast v7, Lcom/pymcl/ai/RewindOutcome;

    .local v7, "r\\4":Lcom/pymcl/ai/RewindOutcome;
    iget-object v8, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$5:Ljava/lang/Object;

    check-cast v8, Landroidx/compose/runtime/MutableState;

    iget-object v9, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$4:Ljava/lang/Object;

    check-cast v9, Landroidx/compose/runtime/MutableState;

    iget-object v10, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$3:Ljava/lang/Object;

    check-cast v10, Lcom/pymcl/android/ui/state/AppState;

    iget-object v11, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$2:Ljava/lang/Object;

    check-cast v11, Lcom/pymcl/android/data/AiUiExtras;

    iget-object v12, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$1:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v6, v12

    goto/16 :goto_7

    .end local v0    # "$i$a$-onSuccess-AiPageKt$AiPage$rewind$1$2\\4\\173\\0":I
    .end local v7    # "r\\4":Lcom/pymcl/ai/RewindOutcome;
    :pswitch_2
    const/4 v0, 0x0

    .restart local v0    # "$i$a$-onSuccess-AiPageKt$AiPage$rewind$1$2\\4\\173\\0":I
    iget-object v7, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$8:Ljava/lang/Object;

    check-cast v7, Lcom/pymcl/android/data/AiUiExtras;

    iget-object v8, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$7:Ljava/lang/Object;

    check-cast v8, Lcom/pymcl/android/ui/pages/AiSession;

    iget-object v9, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$6:Ljava/lang/Object;

    check-cast v9, Lcom/pymcl/ai/RewindOutcome;

    .local v9, "r\\4":Lcom/pymcl/ai/RewindOutcome;
    iget-object v10, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$5:Ljava/lang/Object;

    check-cast v10, Landroidx/compose/runtime/MutableState;

    iget-object v11, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$4:Ljava/lang/Object;

    check-cast v11, Landroidx/compose/runtime/MutableState;

    iget-object v12, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$3:Ljava/lang/Object;

    check-cast v12, Lcom/pymcl/android/ui/state/AppState;

    iget-object v13, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$2:Ljava/lang/Object;

    check-cast v13, Lcom/pymcl/android/data/AiUiExtras;

    iget-object v14, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$1:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v15, v14

    move-object v14, v13

    move-object/from16 v13, p1

    goto/16 :goto_5

    .end local v0    # "$i$a$-onSuccess-AiPageKt$AiPage$rewind$1$2\\4\\173\\0":I
    .end local v9    # "r\\4":Lcom/pymcl/ai/RewindOutcome;
    :pswitch_3
    const/4 v0, 0x0

    .local v0, "$i$a$-runCatching-AiPageKt$AiPage$rewind$1$1\\3\\173\\0":I
    iget-object v7, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$1:Ljava/lang/Object;

    check-cast v7, Lkotlinx/coroutines/CoroutineScope;

    .local v7, "$this$invokeSuspend_u24lambda_u241\\3":Lkotlinx/coroutines/CoroutineScope;
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v9, v0

    move-object/from16 v0, p1

    goto/16 :goto_2

    .line 173
    .end local v0    # "$i$a$-runCatching-AiPageKt$AiPage$rewind$1$1\\3\\173\\0":I
    .end local v7    # "$this$invokeSuspend_u24lambda_u241\\3":Lkotlinx/coroutines/CoroutineScope;
    :catchall_0
    move-exception v0

    goto/16 :goto_3

    .line 167
    :pswitch_4
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 168
    iget-object v0, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    const/4 v7, 0x1

    if-nez v0, :cond_3

    .line 169
    iget-object v0, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    invoke-virtual {v0}, Lcom/pymcl/android/ui/pages/AiSession;->getItems()Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .local v0, "$this$indexOfLast\\1":Ljava/util/List;
    const/4 v3, 0x0

    .line 518
    .local v3, "$i$f$indexOfLast\\1\\169":I
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    invoke-interface {v0, v4}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v4

    .line 519
    .local v4, "iterator\\1":Ljava/util/ListIterator;
    :cond_0
    invoke-interface {v4}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 520
    invoke-interface {v4}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/pymcl/android/ui/state/AiItem;

    .local v5, "it\\2":Lcom/pymcl/android/ui/state/AiItem;
    const/4 v6, 0x0

    .line 169
    .local v6, "$i$a$-indexOfLast-AiPageKt$AiPage$rewind$1$lastUser$1\\2\\520\\0":I
    instance-of v5, v5, Lcom/pymcl/android/ui/state/AiItem$User;

    .line 520
    .end local v5    # "it\\2":Lcom/pymcl/android/ui/state/AiItem;
    .end local v6    # "$i$a$-indexOfLast-AiPageKt$AiPage$rewind$1$lastUser$1\\2\\520\\0":I
    if-eqz v5, :cond_0

    .line 521
    invoke-interface {v4}, Ljava/util/ListIterator;->nextIndex()I

    move-result v5

    goto :goto_0

    .line 524
    :cond_1
    const/4 v5, -0x1

    .line 169
    .end local v0    # "$this$indexOfLast\\1":Ljava/util/List;
    .end local v3    # "$i$f$indexOfLast\\1\\169":I
    .end local v4    # "iterator\\1":Ljava/util/ListIterator;
    :goto_0
    nop

    .line 170
    .local v5, "lastUser":I
    if-ltz v5, :cond_2

    :goto_1
    iget-object v0, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    invoke-virtual {v0}, Lcom/pymcl/android/ui/pages/AiSession;->getItems()Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->size()I

    move-result v0

    if-le v0, v5, :cond_2

    iget-object v0, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    invoke-virtual {v0}, Lcom/pymcl/android/ui/pages/AiSession;->getItems()Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-result-object v0

    iget-object v3, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    invoke-virtual {v3}, Lcom/pymcl/android/ui/pages/AiSession;->getItems()Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->size()I

    move-result v3

    sub-int/2addr v3, v7

    invoke-virtual {v0, v3}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->remove(I)Ljava/lang/Object;

    goto :goto_1

    .line 171
    :cond_2
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 173
    .end local v5    # "lastUser":I
    :cond_3
    iget-object v0, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    :try_start_1
    sget-object v8, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v8, v2

    .line 525
    .local v8, "$this$invokeSuspend_u24lambda_u241\\3":Lkotlinx/coroutines/CoroutineScope;
    const/4 v9, 0x0

    .line 173
    .local v9, "$i$a$-runCatching-AiPageKt$AiPage$rewind$1$1\\3\\173\\0":I
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$0:Ljava/lang/Object;

    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$1:Ljava/lang/Object;

    iput v7, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->label:I

    invoke-interface {v0, v1}, Lcom/pymcl/android/data/AiUiExtras;->rewind(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_4

    .line 167
    return-object v3

    .line 173
    :cond_4
    move-object v7, v8

    .end local v8    # "$this$invokeSuspend_u24lambda_u241\\3":Lkotlinx/coroutines/CoroutineScope;
    .restart local v7    # "$this$invokeSuspend_u24lambda_u241\\3":Lkotlinx/coroutines/CoroutineScope;
    :goto_2
    check-cast v0, Lcom/pymcl/ai/RewindOutcome;

    .end local v7    # "$this$invokeSuspend_u24lambda_u241\\3":Lkotlinx/coroutines/CoroutineScope;
    .end local v9    # "$i$a$-runCatching-AiPageKt$AiPage$rewind$1$1\\3\\173\\0":I
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_4

    :goto_3
    sget-object v7, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_4
    move-object v14, v0

    iget-object v8, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    iget-object v7, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v12, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v11, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->$input$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v10, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->$chats$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v14}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    move-object v9, v14

    check-cast v9, Lcom/pymcl/ai/RewindOutcome;

    .local v9, "r\\4":Lcom/pymcl/ai/RewindOutcome;
    const/4 v0, 0x0

    .line 174
    .local v0, "$i$a$-onSuccess-AiPageKt$AiPage$rewind$1$2\\4\\173\\0":I
    invoke-virtual {v8}, Lcom/pymcl/android/ui/pages/AiSession;->getActiveChat()Ljava/lang/String;

    move-result-object v13

    if-nez v13, :cond_6

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    iput-object v13, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$0:Ljava/lang/Object;

    iput-object v14, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$1:Ljava/lang/Object;

    iput-object v7, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$2:Ljava/lang/Object;

    iput-object v12, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$3:Ljava/lang/Object;

    iput-object v11, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$4:Ljava/lang/Object;

    iput-object v10, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$5:Ljava/lang/Object;

    iput-object v9, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$6:Ljava/lang/Object;

    iput-object v8, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$7:Ljava/lang/Object;

    iput-object v7, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$8:Ljava/lang/Object;

    const/4 v13, 0x2

    iput v13, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->label:I

    invoke-interface {v7, v1}, Lcom/pymcl/android/data/AiUiExtras;->activeChat(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v3, :cond_5

    .line 167
    return-object v3

    .line 174
    :cond_5
    move-object v15, v14

    move-object v14, v7

    .line 167
    :goto_5
    check-cast v13, Ljava/lang/String;

    move-object/from16 v16, v9

    move-object v9, v8

    move-object v8, v10

    move-object/from16 v10, v16

    goto :goto_6

    .line 174
    :cond_6
    move-object v15, v9

    move-object v9, v8

    move-object v8, v10

    move-object v10, v15

    move-object v15, v14

    move-object v14, v7

    .end local v9    # "r\\4":Lcom/pymcl/ai/RewindOutcome;
    .local v10, "r\\4":Lcom/pymcl/ai/RewindOutcome;
    :goto_6
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$0:Ljava/lang/Object;

    iput-object v15, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$1:Ljava/lang/Object;

    iput-object v14, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$2:Ljava/lang/Object;

    iput-object v12, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$3:Ljava/lang/Object;

    iput-object v11, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$4:Ljava/lang/Object;

    iput-object v8, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$5:Ljava/lang/Object;

    iput-object v10, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$6:Ljava/lang/Object;

    const/4 v6, 0x0

    iput-object v6, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$7:Ljava/lang/Object;

    iput-object v6, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$8:Ljava/lang/Object;

    const/4 v6, 0x3

    iput v6, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->label:I

    invoke-static {v7, v9, v13, v1}, Lcom/pymcl/android/ui/pages/AiPageKt;->access$AiPage$loadHistory(Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/pages/AiSession;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v3, :cond_7

    .line 167
    return-object v3

    .line 174
    :cond_7
    move-object v7, v10

    move-object v9, v11

    move-object v10, v12

    move-object v11, v14

    move-object v6, v15

    .line 175
    .end local v10    # "r\\4":Lcom/pymcl/ai/RewindOutcome;
    .local v7, "r\\4":Lcom/pymcl/ai/RewindOutcome;
    :goto_7
    invoke-virtual {v7}, Lcom/pymcl/ai/RewindOutcome;->getUserText()Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_8

    invoke-static {v9}, Lcom/pymcl/android/ui/pages/AiPageKt;->access$AiPage$lambda$14(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v12

    check-cast v12, Ljava/lang/CharSequence;

    invoke-static {v12}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v12

    if-eqz v12, :cond_8

    invoke-virtual {v7}, Lcom/pymcl/ai/RewindOutcome;->getUserText()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v9, v12}, Lcom/pymcl/android/ui/pages/AiPageKt;->access$AiPage$lambda$15(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    .line 176
    :cond_8
    invoke-virtual {v7}, Lcom/pymcl/ai/RewindOutcome;->getMessage()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7}, Lcom/pymcl/ai/RewindOutcome;->getUserText()Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_9

    const/4 v12, 0x0

    new-array v12, v12, [Ljava/lang/Object;

    const-string v13, "\u53ef\u4ee5\u7ee7\u7eed\u8bf4\u4e0b\u4e00\u53e5"

    invoke-static {v13, v12}, Lcom/pymcl/android/ui/i18n/I18nKt;->tr(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    goto :goto_8

    :cond_9
    move-object v12, v5

    :goto_8
    invoke-virtual {v7}, Lcom/pymcl/ai/RewindOutcome;->getFailed()I

    move-result v13

    if-lez v13, :cond_a

    move-object v13, v4

    goto :goto_9

    :cond_a
    const-string v13, "ok"

    :goto_9
    invoke-virtual {v10, v9, v12, v13}, Lcom/pymcl/android/ui/state/AppState;->toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$0:Ljava/lang/Object;

    iput-object v6, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$1:Ljava/lang/Object;

    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$2:Ljava/lang/Object;

    const/4 v9, 0x0

    iput-object v9, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$3:Ljava/lang/Object;

    iput-object v9, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$4:Ljava/lang/Object;

    iput-object v9, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$5:Ljava/lang/Object;

    iput-object v9, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->L$6:Ljava/lang/Object;

    const/4 v9, 0x4

    iput v9, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->label:I

    invoke-static {v11, v10, v8, v1}, Lcom/pymcl/android/ui/pages/AiPageKt;->access$AiPage$reloadChats(Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v3, :cond_b

    .line 167
    return-object v3

    .line 177
    :cond_b
    move-object v3, v7

    .line 178
    .end local v7    # "r\\4":Lcom/pymcl/ai/RewindOutcome;
    .local v3, "r\\4":Lcom/pymcl/ai/RewindOutcome;
    :goto_a
    move-object v14, v6

    .line 173
    .end local v0    # "$i$a$-onSuccess-AiPageKt$AiPage$rewind$1$2\\4\\173\\0":I
    .end local v3    # "r\\4":Lcom/pymcl/ai/RewindOutcome;
    :cond_c
    iget-object v0, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$rewind$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    .line 178
    invoke-static {v14}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_e

    .line 525
    .local v3, "it\\6":Ljava/lang/Throwable;
    const/4 v6, 0x0

    .line 178
    .local v6, "$i$a$-onFailure-AiPageKt$AiPage$rewind$1$3\\6\\178\\0":I
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_d

    goto :goto_b

    :cond_d
    move-object v5, v7

    :goto_b
    const-string v7, "\u64a4\u56de\u5931\u8d25"

    invoke-virtual {v0, v7, v5, v4}, Lcom/pymcl/android/ui/state/AppState;->toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    .end local v3    # "it\\6":Ljava/lang/Throwable;
    .end local v6    # "$i$a$-onFailure-AiPageKt$AiPage$rewind$1$3\\6\\178\\0":I
    :cond_e
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
