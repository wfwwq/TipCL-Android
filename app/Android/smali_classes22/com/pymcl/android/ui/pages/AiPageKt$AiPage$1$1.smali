.class final Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;
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

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAiPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiPage.kt\ncom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,517:1\n1#2:518\n2068#3:519\n2945#3,3:520\n2069#3:523\n777#3:524\n873#3,2:525\n*S KotlinDebug\n*F\n+ 1 AiPage.kt\ncom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1\n*L\n95#1:519\n95#1:520,3\n95#1:523\n96#1:524\n96#1:525,2\n*E\n"
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
    c = "com.pymcl.android.ui.pages.AiPageKt$AiPage$1$1"
    f = "AiPage.kt"
    i = {
        0x0,
        0x1,
        0x1,
        0x2,
        0x2,
        0x3,
        0x3,
        0x4,
        0x4,
        0x5,
        0x5
    }
    l = {
        0x59,
        0x5b,
        0x5d,
        0x5d,
        0x5d,
        0x61
    }
    m = "invokeSuspend"
    n = {
        "$this$LaunchedEffect",
        "$this$LaunchedEffect",
        "$this$invokeSuspend_u24lambda_u240\\1",
        "$this$LaunchedEffect",
        "st",
        "$this$LaunchedEffect",
        "st",
        "$this$LaunchedEffect",
        "st",
        "$this$LaunchedEffect",
        "$this$invokeSuspend_u24lambda_u243\\10"
    }
    nl = {
        0x5a,
        0x5b,
        0x5d,
        0x5d,
        0x5f,
        0x61
    }
    s = {
        "L$0",
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$0",
        "L$1"
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

.field final synthetic $initial:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/AiItem;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $model$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $models$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $perm$delegate:Landroidx/compose/runtime/MutableIntState;

.field final synthetic $s:Lcom/pymcl/android/ui/pages/AiSession;

.field final synthetic $state:Lcom/pymcl/android/ui/state/AppState;

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Ljava/util/List;Lcom/pymcl/android/ui/pages/AiSession;Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/pymcl/android/ui/state/AiItem;",
            ">;",
            "Lcom/pymcl/android/ui/pages/AiSession;",
            "Lcom/pymcl/android/data/AiUiExtras;",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/ChatSummary;",
            ">;>;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableIntState;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$initial:Ljava/util/List;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p5, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$chats$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$model$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p7, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$perm$delegate:Landroidx/compose/runtime/MutableIntState;

    iput-object p8, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$models$delegate:Landroidx/compose/runtime/MutableState;

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

    new-instance v0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$initial:Ljava/util/List;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v5, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$chats$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v6, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$model$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v7, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$perm$delegate:Landroidx/compose/runtime/MutableIntState;

    iget-object v8, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$models$delegate:Landroidx/compose/runtime/MutableState;

    move-object v9, p2

    invoke-direct/range {v0 .. v9}, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;-><init>(Ljava/util/List;Lcom/pymcl/android/ui/pages/AiSession;Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v1, p0

    iget-object v0, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->L$0:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlinx/coroutines/CoroutineScope;

    .local v2, "$this$LaunchedEffect":Lkotlinx/coroutines/CoroutineScope;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 87
    iget v0, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->label:I

    const-string v4, ""

    const/4 v5, 0x0

    const/4 v6, 0x1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const/4 v0, 0x0

    .local v0, "$i$a$-runCatching-AiPageKt$AiPage$1$1$3\\10\\97\\0":I
    iget-object v3, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->L$2:Ljava/lang/Object;

    check-cast v3, Landroidx/compose/runtime/MutableState;

    iget-object v5, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->L$1:Ljava/lang/Object;

    check-cast v5, Lkotlinx/coroutines/CoroutineScope;

    .local v5, "$this$invokeSuspend_u24lambda_u243\\10":Lkotlinx/coroutines/CoroutineScope;
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v7, v0

    move-object/from16 v0, p1

    goto/16 :goto_10

    .line 97
    .end local v0    # "$i$a$-runCatching-AiPageKt$AiPage$1$1$3\\10\\97\\0":I
    .end local v5    # "$this$invokeSuspend_u24lambda_u243\\10":Lkotlinx/coroutines/CoroutineScope;
    :catchall_0
    move-exception v0

    goto/16 :goto_11

    .line 87
    :pswitch_1
    iget-object v0, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lcom/pymcl/ai/AiSettings;

    .local v0, "st":Lcom/pymcl/ai/AiSettings;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_9

    .end local v0    # "st":Lcom/pymcl/ai/AiSettings;
    :pswitch_2
    iget-object v0, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->L$2:Ljava/lang/Object;

    check-cast v0, Lcom/pymcl/android/ui/pages/AiSession;

    iget-object v4, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->L$1:Ljava/lang/Object;

    check-cast v4, Lcom/pymcl/ai/AiSettings;

    .local v4, "st":Lcom/pymcl/ai/AiSettings;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v7, p1

    goto/16 :goto_8

    .end local v4    # "st":Lcom/pymcl/ai/AiSettings;
    :pswitch_3
    iget-object v0, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->L$2:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->L$1:Ljava/lang/Object;

    check-cast v4, Lcom/pymcl/ai/AiSettings;

    .restart local v4    # "st":Lcom/pymcl/ai/AiSettings;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v7, p1

    goto/16 :goto_6

    .end local v4    # "st":Lcom/pymcl/ai/AiSettings;
    :pswitch_4
    const/4 v0, 0x0

    .local v0, "$i$a$-runCatching-AiPageKt$AiPage$1$1$st$1\\1\\91\\0":I
    iget-object v7, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->L$1:Ljava/lang/Object;

    check-cast v7, Lkotlinx/coroutines/CoroutineScope;

    .local v7, "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move v8, v0

    move-object/from16 v0, p1

    goto :goto_1

    .line 91
    .end local v0    # "$i$a$-runCatching-AiPageKt$AiPage$1$1$st$1\\1\\91\\0":I
    .end local v7    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    :catchall_1
    move-exception v0

    goto :goto_2

    .line 87
    :pswitch_5
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_6
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 88
    iget-object v0, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$initial:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    invoke-virtual {v0}, Lcom/pymcl/android/ui/pages/AiSession;->getItems()Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    invoke-virtual {v0}, Lcom/pymcl/android/ui/pages/AiSession;->getItems()Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-result-object v0

    iget-object v7, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$initial:Ljava/util/List;

    check-cast v7, Ljava/util/Collection;

    invoke-virtual {v0, v7}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->addAll(Ljava/util/Collection;)Z

    .line 89
    :cond_0
    iget-object v0, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v7, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v8, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$chats$delegate:Landroidx/compose/runtime/MutableState;

    move-object v9, v1

    check-cast v9, Lkotlin/coroutines/Continuation;

    iput-object v2, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->L$0:Ljava/lang/Object;

    iput v6, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->label:I

    invoke-static {v0, v7, v8, v9}, Lcom/pymcl/android/ui/pages/AiPageKt;->access$AiPage$reloadChats(Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_1

    .line 87
    return-object v3

    .line 90
    :cond_1
    :goto_0
    iget-object v0, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    if-eqz v0, :cond_17

    .line 91
    iget-object v0, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    :try_start_2
    sget-object v7, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v7, v2

    .line 518
    .restart local v7    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    const/4 v8, 0x0

    .line 91
    .local v8, "$i$a$-runCatching-AiPageKt$AiPage$1$1$st$1\\1\\91\\0":I
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->L$0:Ljava/lang/Object;

    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->L$1:Ljava/lang/Object;

    const/4 v9, 0x2

    iput v9, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->label:I

    invoke-interface {v0, v1}, Lcom/pymcl/android/data/AiUiExtras;->settings(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_2

    .line 87
    return-object v3

    .line 91
    :cond_2
    :goto_1
    check-cast v0, Lcom/pymcl/ai/AiSettings;

    .end local v7    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    .end local v8    # "$i$a$-runCatching-AiPageKt$AiPage$1$1$st$1\\1\\91\\0":I
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :goto_2
    sget-object v7, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_3
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    move-object v0, v5

    :cond_3
    check-cast v0, Lcom/pymcl/ai/AiSettings;

    .line 92
    .local v0, "st":Lcom/pymcl/ai/AiSettings;
    iget-object v7, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$model$delegate:Landroidx/compose/runtime/MutableState;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/pymcl/ai/AiSettings;->getModel()Ljava/lang/String;

    move-result-object v8

    goto :goto_4

    :cond_4
    move-object v8, v5

    :goto_4
    if-nez v8, :cond_5

    goto :goto_5

    :cond_5
    move-object v4, v8

    :goto_5
    invoke-static {v7, v4}, Lcom/pymcl/android/ui/pages/AiPageKt;->access$AiPage$lambda$9(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    iget-object v4, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$perm$delegate:Landroidx/compose/runtime/MutableIntState;

    sget-object v7, Lcom/pymcl/ai/Permission;->INSTANCE:Lcom/pymcl/ai/Permission;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lcom/pymcl/ai/AiSettings;->getPermissionMode()Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_7

    :cond_6
    const-string v8, "default"

    :cond_7
    invoke-virtual {v7, v8}, Lcom/pymcl/ai/Permission;->uiIndex(Ljava/lang/String;)I

    move-result v7

    invoke-static {v4, v7}, Lcom/pymcl/android/ui/pages/AiPageKt;->access$AiPage$lambda$12(Landroidx/compose/runtime/MutableIntState;I)V

    .line 93
    iget-object v4, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    invoke-virtual {v4}, Lcom/pymcl/android/ui/pages/AiSession;->getLoaded()Z

    move-result v4

    if-eqz v4, :cond_a

    iget-object v4, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    invoke-virtual {v4}, Lcom/pymcl/android/ui/pages/AiSession;->getRunning()Z

    move-result v4

    if-nez v4, :cond_d

    iget-object v4, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    invoke-virtual {v4}, Lcom/pymcl/android/ui/pages/AiSession;->getActiveChat()Ljava/lang/String;

    move-result-object v4

    iget-object v7, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    move-object v8, v1

    check-cast v8, Lkotlin/coroutines/Continuation;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->L$0:Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->L$1:Ljava/lang/Object;

    iput-object v4, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->L$2:Ljava/lang/Object;

    const/4 v9, 0x3

    iput v9, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->label:I

    invoke-interface {v7, v8}, Lcom/pymcl/android/data/AiUiExtras;->activeChat(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v3, :cond_8

    .line 87
    return-object v3

    .line 93
    :cond_8
    move-object/from16 v20, v4

    move-object v4, v0

    move-object/from16 v0, v20

    .end local v0    # "st":Lcom/pymcl/ai/AiSettings;
    .restart local v4    # "st":Lcom/pymcl/ai/AiSettings;
    :goto_6
    invoke-static {v0, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    move-object v0, v4

    goto :goto_7

    :cond_9
    move-object v0, v4

    goto :goto_a

    .end local v4    # "st":Lcom/pymcl/ai/AiSettings;
    .restart local v0    # "st":Lcom/pymcl/ai/AiSettings;
    :cond_a
    :goto_7
    iget-object v4, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    iget-object v7, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    move-object v8, v1

    check-cast v8, Lkotlin/coroutines/Continuation;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->L$0:Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->L$1:Ljava/lang/Object;

    iput-object v4, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->L$2:Ljava/lang/Object;

    const/4 v9, 0x4

    iput v9, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->label:I

    invoke-interface {v7, v8}, Lcom/pymcl/android/data/AiUiExtras;->activeChat(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v3, :cond_b

    .line 87
    return-object v3

    .line 93
    :cond_b
    move-object/from16 v20, v4

    move-object v4, v0

    move-object/from16 v0, v20

    .end local v0    # "st":Lcom/pymcl/ai/AiSettings;
    .restart local v4    # "st":Lcom/pymcl/ai/AiSettings;
    :goto_8
    check-cast v7, Ljava/lang/String;

    invoke-virtual {v0, v7}, Lcom/pymcl/android/ui/pages/AiSession;->setActiveChat(Ljava/lang/String;)V

    iget-object v0, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v7, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    iget-object v8, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    invoke-virtual {v8}, Lcom/pymcl/android/ui/pages/AiSession;->getActiveChat()Ljava/lang/String;

    move-result-object v8

    move-object v9, v1

    check-cast v9, Lkotlin/coroutines/Continuation;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->L$0:Ljava/lang/Object;

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->L$1:Ljava/lang/Object;

    iput-object v5, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->L$2:Ljava/lang/Object;

    const/4 v5, 0x5

    iput v5, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->label:I

    invoke-static {v0, v7, v8, v9}, Lcom/pymcl/android/ui/pages/AiPageKt;->access$AiPage$loadHistory(Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/pages/AiSession;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_c

    .line 87
    return-object v3

    .line 93
    :cond_c
    move-object v0, v4

    .end local v4    # "st":Lcom/pymcl/ai/AiSettings;
    .restart local v0    # "st":Lcom/pymcl/ai/AiSettings;
    :goto_9
    iget-object v3, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    invoke-virtual {v3, v6}, Lcom/pymcl/android/ui/pages/AiSession;->setLoaded(Z)V

    .line 95
    :cond_d
    :goto_a
    iget-object v3, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    invoke-interface {v3}, Lcom/pymcl/android/data/AiUiExtras;->pendingCard()Lcom/pymcl/ai/AiEvent;

    move-result-object v3

    if-eqz v3, :cond_14

    iget-object v4, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    .line 518
    .local v3, "c\\2":Lcom/pymcl/ai/AiEvent;
    const/4 v5, 0x0

    .line 95
    .local v5, "$i$a$-let-AiPageKt$AiPage$1$1$1\\2\\95\\0":I
    new-instance v7, Lcom/pymcl/android/data/AiItemReducer;

    invoke-direct {v7}, Lcom/pymcl/android/data/AiItemReducer;-><init>()V

    invoke-virtual {v7, v3}, Lcom/pymcl/android/data/AiItemReducer;->reduce(Lcom/pymcl/ai/AiEvent;)Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    .local v7, "$this$forEach\\3":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 519
    .local v8, "$i$f$forEach\\3\\95":I
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_b
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_12

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .local v10, "element\\3":Ljava/lang/Object;
    move-object v11, v10

    check-cast v11, Lcom/pymcl/android/ui/state/AiItem;

    .local v11, "it\\4":Lcom/pymcl/android/ui/state/AiItem;
    const/4 v12, 0x0

    .line 95
    .local v12, "$i$a$-forEach-AiPageKt$AiPage$1$1$1$1\\4\\519\\2":I
    invoke-virtual {v4}, Lcom/pymcl/android/ui/pages/AiSession;->getItems()Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-result-object v13

    check-cast v13, Ljava/lang/Iterable;

    .local v13, "$this$none\\5":Ljava/lang/Iterable;
    const/4 v14, 0x0

    .line 520
    .local v14, "$i$f$none\\5\\95":I
    instance-of v15, v13, Ljava/util/Collection;

    if-eqz v15, :cond_e

    move-object v15, v13

    check-cast v15, Ljava/util/Collection;

    invoke-interface {v15}, Ljava/util/Collection;->isEmpty()Z

    move-result v15

    if-eqz v15, :cond_e

    move-object/from16 v19, v0

    move v0, v6

    goto :goto_d

    .line 521
    :cond_e
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_c
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_10

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    .local v16, "element\\5":Ljava/lang/Object;
    move-object/from16 v17, v16

    check-cast v17, Lcom/pymcl/android/ui/state/AiItem;

    .local v17, "x\\6":Lcom/pymcl/android/ui/state/AiItem;
    const/16 v18, 0x0

    .line 95
    .local v18, "$i$a$-none-AiPageKt$AiPage$1$1$1$1$1\\6\\521\\4":I
    invoke-interface/range {v17 .. v17}, Lcom/pymcl/android/ui/state/AiItem;->getId()Ljava/lang/String;

    move-result-object v6

    move-object/from16 v19, v0

    .end local v0    # "st":Lcom/pymcl/ai/AiSettings;
    .local v19, "st":Lcom/pymcl/ai/AiSettings;
    invoke-interface {v11}, Lcom/pymcl/android/ui/state/AiItem;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    .line 521
    .end local v17    # "x\\6":Lcom/pymcl/android/ui/state/AiItem;
    .end local v18    # "$i$a$-none-AiPageKt$AiPage$1$1$1$1$1\\6\\521\\4":I
    if-eqz v0, :cond_f

    const/4 v0, 0x0

    goto :goto_d

    :cond_f
    move-object/from16 v0, v19

    const/4 v6, 0x1

    goto :goto_c

    .line 522
    .end local v16    # "element\\5":Ljava/lang/Object;
    .end local v19    # "st":Lcom/pymcl/ai/AiSettings;
    .restart local v0    # "st":Lcom/pymcl/ai/AiSettings;
    :cond_10
    move-object/from16 v19, v0

    .end local v0    # "st":Lcom/pymcl/ai/AiSettings;
    .restart local v19    # "st":Lcom/pymcl/ai/AiSettings;
    const/4 v0, 0x1

    .line 95
    .end local v13    # "$this$none\\5":Ljava/lang/Iterable;
    .end local v14    # "$i$f$none\\5\\95":I
    :goto_d
    if-eqz v0, :cond_11

    invoke-virtual {v4, v11}, Lcom/pymcl/android/ui/pages/AiSession;->upsert(Lcom/pymcl/android/ui/state/AiItem;)V

    .line 519
    .end local v10    # "element\\3":Ljava/lang/Object;
    .end local v11    # "it\\4":Lcom/pymcl/android/ui/state/AiItem;
    .end local v12    # "$i$a$-forEach-AiPageKt$AiPage$1$1$1$1\\4\\519\\2":I
    :cond_11
    move-object/from16 v0, v19

    const/4 v6, 0x1

    goto :goto_b

    .line 523
    .end local v19    # "st":Lcom/pymcl/ai/AiSettings;
    .restart local v0    # "st":Lcom/pymcl/ai/AiSettings;
    :cond_12
    move-object/from16 v19, v0

    .line 95
    .end local v0    # "st":Lcom/pymcl/ai/AiSettings;
    .end local v7    # "$this$forEach\\3":Ljava/lang/Iterable;
    .end local v8    # "$i$f$forEach\\3\\95":I
    .restart local v19    # "st":Lcom/pymcl/ai/AiSettings;
    instance-of v0, v3, Lcom/pymcl/ai/AiEvent$Ask;

    if-eqz v0, :cond_13

    invoke-virtual {v4}, Lcom/pymcl/android/ui/pages/AiSession;->getAsks()Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    move-object v4, v3

    check-cast v4, Lcom/pymcl/ai/AiEvent$Ask;

    invoke-virtual {v4}, Lcom/pymcl/ai/AiEvent$Ask;->getCallId()Ljava/lang/String;

    move-result-object v4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "ask-"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .end local v3    # "c\\2":Lcom/pymcl/ai/AiEvent;
    .end local v5    # "$i$a$-let-AiPageKt$AiPage$1$1$1\\2\\95\\0":I
    :cond_13
    goto :goto_e

    .end local v19    # "st":Lcom/pymcl/ai/AiSettings;
    .restart local v0    # "st":Lcom/pymcl/ai/AiSettings;
    :cond_14
    move-object/from16 v19, v0

    .line 96
    .end local v0    # "st":Lcom/pymcl/ai/AiSettings;
    .restart local v19    # "st":Lcom/pymcl/ai/AiSettings;
    :goto_e
    iget-object v0, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$models$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v3, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$model$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v3}, Lcom/pymcl/android/ui/pages/AiPageKt;->access$AiPage$lambda$8(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$filter\\7":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 524
    .local v4, "$i$f$filter\\7\\96":I
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    check-cast v5, Ljava/util/Collection;

    .local v5, "destination\\8":Ljava/util/Collection;
    move-object v6, v3

    .local v6, "$this$filterTo\\8":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 525
    .local v7, "$i$f$filterTo\\8\\524":I
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_15
    :goto_f
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_16

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .local v9, "element\\8":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Ljava/lang/String;

    .local v10, "it\\9":Ljava/lang/String;
    const/4 v11, 0x0

    .line 96
    .local v11, "$i$a$-filter-AiPageKt$AiPage$1$1$2\\9\\525\\0":I
    move-object v12, v10

    check-cast v12, Ljava/lang/CharSequence;

    invoke-static {v12}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v12

    .line 525
    .end local v10    # "it\\9":Ljava/lang/String;
    .end local v11    # "$i$a$-filter-AiPageKt$AiPage$1$1$2\\9\\525\\0":I
    if-nez v12, :cond_15

    invoke-interface {v5, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_f

    .line 526
    .end local v9    # "element\\8":Ljava/lang/Object;
    :cond_16
    nop

    .end local v5    # "destination\\8":Ljava/util/Collection;
    .end local v6    # "$this$filterTo\\8":Ljava/lang/Iterable;
    .end local v7    # "$i$f$filterTo\\8\\524":I
    check-cast v5, Ljava/util/List;

    .line 524
    nop

    .line 96
    .end local v3    # "$this$filter\\7":Ljava/lang/Iterable;
    .end local v4    # "$i$f$filter\\7\\96":I
    invoke-static {v0, v5}, Lcom/pymcl/android/ui/pages/AiPageKt;->access$AiPage$lambda$6(Landroidx/compose/runtime/MutableState;Ljava/util/List;)V

    .end local v19    # "st":Lcom/pymcl/ai/AiSettings;
    goto :goto_14

    .line 97
    :cond_17
    iget-object v5, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$models$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v0, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    :try_start_3
    sget-object v6, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v6, v2

    .line 518
    .local v6, "$this$invokeSuspend_u24lambda_u243\\10":Lkotlinx/coroutines/CoroutineScope;
    const/4 v7, 0x0

    .line 97
    .local v7, "$i$a$-runCatching-AiPageKt$AiPage$1$1$3\\10\\97\\0":I
    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/AppState;->getApi()Lcom/pymcl/android/ui/state/LauncherUiApi;

    move-result-object v0

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->L$0:Ljava/lang/Object;

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->L$1:Ljava/lang/Object;

    iput-object v5, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->L$2:Ljava/lang/Object;

    const/4 v8, 0x6

    iput v8, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->label:I

    invoke-interface {v0, v1}, Lcom/pymcl/android/ui/state/LauncherUiApi;->aiListModels(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-ne v0, v3, :cond_18

    .line 87
    return-object v3

    .line 97
    :cond_18
    move-object v3, v5

    move-object v5, v6

    .end local v6    # "$this$invokeSuspend_u24lambda_u243\\10":Lkotlinx/coroutines/CoroutineScope;
    .local v5, "$this$invokeSuspend_u24lambda_u243\\10":Lkotlinx/coroutines/CoroutineScope;
    :goto_10
    :try_start_4
    check-cast v0, Ljava/util/List;

    .end local v5    # "$this$invokeSuspend_u24lambda_u243\\10":Lkotlinx/coroutines/CoroutineScope;
    .end local v7    # "$i$a$-runCatching-AiPageKt$AiPage$1$1$3\\10\\97\\0":I
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_12

    :catchall_2
    move-exception v0

    move-object v3, v5

    :goto_11
    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_12
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v5

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_19

    move-object v0, v5

    :cond_19
    iget-object v5, v1, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$1$1;->$model$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Ljava/util/List;

    .line 518
    move-object v6, v0

    .local v6, "it\\11":Ljava/util/List;
    const/4 v7, 0x0

    .line 97
    .local v7, "$i$a$-also-AiPageKt$AiPage$1$1$4\\11\\97\\0":I
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    if-nez v8, :cond_1a

    goto :goto_13

    :cond_1a
    move-object v4, v8

    :goto_13
    invoke-static {v5, v4}, Lcom/pymcl/android/ui/pages/AiPageKt;->access$AiPage$lambda$9(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    .end local v6    # "it\\11":Ljava/util/List;
    .end local v7    # "$i$a$-also-AiPageKt$AiPage$1$1$4\\11\\97\\0":I
    invoke-static {v3, v0}, Lcom/pymcl/android/ui/pages/AiPageKt;->access$AiPage$lambda$6(Landroidx/compose/runtime/MutableState;Ljava/util/List;)V

    .line 98
    :goto_14
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
