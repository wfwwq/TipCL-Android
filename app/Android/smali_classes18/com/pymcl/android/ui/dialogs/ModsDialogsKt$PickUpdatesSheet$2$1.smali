.class final Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ModsDialogs.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/dialogs/ModsDialogsKt;->PickUpdatesSheet(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/DialogSpec$PickUpdates;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
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
    value = "SMAP\nModsDialogs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModsDialogs.kt\ncom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,306:1\n1#2:307\n1358#3,2:308\n1435#3,4:310\n2068#3,2:314\n*S KotlinDebug\n*F\n+ 1 ModsDialogs.kt\ncom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1\n*L\n268#1:308,2\n268#1:310,4\n269#1:314,2\n*E\n"
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
    c = "com.pymcl.android.ui.dialogs.ModsDialogsKt$PickUpdatesSheet$2$1"
    f = "ModsDialogs.kt"
    i = {
        0x0,
        0x1,
        0x1,
        0x1
    }
    l = {
        0x10b,
        0x10c
    }
    m = "invokeSuspend"
    n = {
        "$this$LaunchedEffect",
        "$this$LaunchedEffect",
        "u",
        "$this$invokeSuspend_u24lambda_u241\\2"
    }
    nl = {
        0x133,
        0x134
    }
    s = {
        "L$0",
        "L$0",
        "L$1",
        "L$2"
    }
    v = 0x2
.end annotation


# instance fields
.field final synthetic $chosen:Landroidx/compose/runtime/snapshots/SnapshotStateMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/snapshots/SnapshotStateMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $d:Lcom/pymcl/android/ui/state/DialogSpec$PickUpdates;

.field final synthetic $error$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $ready$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $state:Lcom/pymcl/android/ui/state/AppState;

.field final synthetic $titles$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $updates$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $ver$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Landroidx/compose/runtime/snapshots/SnapshotStateMap;Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/DialogSpec$PickUpdates;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/snapshots/SnapshotStateMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Lcom/pymcl/android/ui/state/DialogSpec$PickUpdates;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->$chosen:Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    iput-object p2, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p3, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->$d:Lcom/pymcl/android/ui/state/DialogSpec$PickUpdates;

    iput-object p4, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->$ready$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->$updates$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->$error$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p7, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->$ver$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p8, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->$titles$delegate:Landroidx/compose/runtime/MutableState;

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

    new-instance v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->$chosen:Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->$d:Lcom/pymcl/android/ui/state/DialogSpec$PickUpdates;

    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->$ready$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v5, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->$updates$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v6, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->$error$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v7, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->$ver$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v8, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->$titles$delegate:Landroidx/compose/runtime/MutableState;

    move-object v9, p2

    invoke-direct/range {v0 .. v9}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;-><init>(Landroidx/compose/runtime/snapshots/SnapshotStateMap;Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/DialogSpec$PickUpdates;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v1, p0

    iget-object v0, v1, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->L$0:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlinx/coroutines/CoroutineScope;

    .local v2, "$this$LaunchedEffect":Lkotlinx/coroutines/CoroutineScope;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 262
    iget v3, v1, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->label:I

    const-string v4, "/"

    const/4 v5, 0x1

    packed-switch v3, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const/4 v0, 0x0

    .local v0, "$i$a$-runCatching-ModsDialogsKt$PickUpdatesSheet$2$1$1\\2\\268\\0":I
    iget-object v3, v1, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->L$3:Ljava/lang/Object;

    check-cast v3, Landroidx/compose/runtime/MutableState;

    iget-object v4, v1, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->L$2:Ljava/lang/Object;

    check-cast v4, Lkotlinx/coroutines/CoroutineScope;

    .local v4, "$this$invokeSuspend_u24lambda_u241\\2":Lkotlinx/coroutines/CoroutineScope;
    iget-object v6, v1, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->L$1:Ljava/lang/Object;

    check-cast v6, Ljava/util/Map;

    .local v6, "u":Ljava/util/Map;
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v9, v4

    move-object/from16 v4, p1

    goto/16 :goto_2

    .line 268
    .end local v0    # "$i$a$-runCatching-ModsDialogsKt$PickUpdatesSheet$2$1$1\\2\\268\\0":I
    .end local v4    # "$this$invokeSuspend_u24lambda_u241\\2":Lkotlinx/coroutines/CoroutineScope;
    :catchall_0
    move-exception v0

    move/from16 v17, v5

    goto/16 :goto_4

    .line 262
    .end local v6    # "u":Ljava/util/Map;
    :pswitch_1
    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-object/from16 v3, p1

    goto/16 :goto_1

    .line 270
    :catch_0
    move-exception v0

    goto/16 :goto_7

    .line 262
    :pswitch_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 263
    iget-object v3, v1, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->$ready$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v3}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt;->access$PickUpdatesSheet$lambda$7(Landroidx/compose/runtime/MutableState;)Z

    move-result v3

    if-nez v3, :cond_0

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 264
    :cond_0
    iget-object v3, v1, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->$updates$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v6, 0x0

    invoke-static {v3, v6}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt;->access$PickUpdatesSheet$lambda$11(Landroidx/compose/runtime/MutableState;Ljava/util/Map;)V

    iget-object v3, v1, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->$error$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v3, v6}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt;->access$PickUpdatesSheet$lambda$17(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    iget-object v3, v1, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->$chosen:Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    invoke-virtual {v3}, Landroidx/compose/runtime/snapshots/SnapshotStateMap;->clear()V

    .line 265
    iget-object v3, v1, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->$ver$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v3}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt;->access$PickUpdatesSheet$lambda$4(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_1

    move v3, v5

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_2

    iget-object v0, v1, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->$updates$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt;->access$PickUpdatesSheet$lambda$11(Landroidx/compose/runtime/MutableState;Ljava/util/Map;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 266
    :cond_2
    nop

    .line 267
    :try_start_2
    iget-object v3, v1, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v3}, Lcom/pymcl/android/ui/state/AppState;->getModWatcher()Lcom/pymcl/android/ui/state/ModUpdateWatcher;

    move-result-object v3

    invoke-virtual {v3}, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->getDetails()Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    move-result-object v3

    iget-object v6, v1, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->$d:Lcom/pymcl/android/ui/state/DialogSpec$PickUpdates;

    invoke-virtual {v6}, Lcom/pymcl/android/ui/state/DialogSpec$PickUpdates;->getInstance()Ljava/lang/String;

    move-result-object v6

    iget-object v7, v1, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->$ver$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v7}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt;->access$PickUpdatesSheet$lambda$4(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Landroidx/compose/runtime/snapshots/SnapshotStateMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    if-nez v3, :cond_4

    iget-object v3, v1, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v3}, Lcom/pymcl/android/ui/state/AppState;->getApi()Lcom/pymcl/android/ui/state/LauncherUiApi;

    move-result-object v3

    iget-object v6, v1, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->$d:Lcom/pymcl/android/ui/state/DialogSpec$PickUpdates;

    invoke-virtual {v6}, Lcom/pymcl/android/ui/state/DialogSpec$PickUpdates;->getInstance()Ljava/lang/String;

    move-result-object v6

    iget-object v7, v1, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->$ver$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v7}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt;->access$PickUpdatesSheet$lambda$4(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v7

    move-object v8, v1

    check-cast v8, Lkotlin/coroutines/Continuation;

    iput-object v2, v1, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->L$0:Ljava/lang/Object;

    iput v5, v1, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->label:I

    invoke-interface {v3, v6, v7, v8}, Lcom/pymcl/android/ui/state/LauncherUiApi;->checkModUpdates(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_3

    .line 262
    return-object v0

    :cond_3
    :goto_1
    iget-object v6, v1, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v7, v1, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->$d:Lcom/pymcl/android/ui/state/DialogSpec$PickUpdates;

    iget-object v8, v1, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->$ver$delegate:Landroidx/compose/runtime/MutableState;

    move-object v9, v3

    check-cast v9, Ljava/util/Map;

    .line 307
    .local v9, "it\\1":Ljava/util/Map;
    const/4 v10, 0x0

    .line 267
    .local v10, "$i$a$-also-ModsDialogsKt$PickUpdatesSheet$2$1$u$1\\1\\267\\0":I
    invoke-virtual {v6}, Lcom/pymcl/android/ui/state/AppState;->getModWatcher()Lcom/pymcl/android/ui/state/ModUpdateWatcher;

    move-result-object v6

    invoke-virtual {v6}, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->getDetails()Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    move-result-object v6

    check-cast v6, Ljava/util/Map;

    invoke-virtual {v7}, Lcom/pymcl/android/ui/state/DialogSpec$PickUpdates;->getInstance()Ljava/lang/String;

    move-result-object v7

    invoke-static {v8}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt;->access$PickUpdatesSheet$lambda$4(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v8

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v6, v4, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .end local v9    # "it\\1":Ljava/util/Map;
    .end local v10    # "$i$a$-also-ModsDialogsKt$PickUpdatesSheet$2$1$u$1\\1\\267\\0":I
    check-cast v3, Ljava/util/Map;

    :cond_4
    move-object v6, v3

    .line 268
    .restart local v6    # "u":Ljava/util/Map;
    iget-object v3, v1, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->$titles$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v4, v1, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v7, v1, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->$d:Lcom/pymcl/android/ui/state/DialogSpec$PickUpdates;

    iget-object v8, v1, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->$ver$delegate:Landroidx/compose/runtime/MutableState;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :try_start_3
    sget-object v9, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v9, v2

    .line 307
    .local v9, "$this$invokeSuspend_u24lambda_u241\\2":Lkotlinx/coroutines/CoroutineScope;
    const/4 v10, 0x0

    .line 268
    .local v10, "$i$a$-runCatching-ModsDialogsKt$PickUpdatesSheet$2$1$1\\2\\268\\0":I
    invoke-virtual {v4}, Lcom/pymcl/android/ui/state/AppState;->getApi()Lcom/pymcl/android/ui/state/LauncherUiApi;

    move-result-object v4

    invoke-virtual {v7}, Lcom/pymcl/android/ui/state/DialogSpec$PickUpdates;->getInstance()Ljava/lang/String;

    move-result-object v7

    invoke-static {v8}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt;->access$PickUpdatesSheet$lambda$4(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v1, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->L$0:Ljava/lang/Object;

    iput-object v6, v1, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->L$1:Ljava/lang/Object;

    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v1, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->L$2:Ljava/lang/Object;

    iput-object v3, v1, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->L$3:Ljava/lang/Object;

    const/4 v11, 0x2

    iput v11, v1, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->label:I

    invoke-interface {v4, v7, v8, v1}, Lcom/pymcl/android/ui/state/LauncherUiApi;->getInstalledMods(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_5

    .line 262
    return-object v0

    .line 268
    :cond_5
    move v0, v10

    .line 262
    .end local v10    # "$i$a$-runCatching-ModsDialogsKt$PickUpdatesSheet$2$1$1\\2\\268\\0":I
    .restart local v0    # "$i$a$-runCatching-ModsDialogsKt$PickUpdatesSheet$2$1$1\\2\\268\\0":I
    :goto_2
    check-cast v4, Ljava/lang/Iterable;

    .local v4, "$this$associate\\3":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 308
    .local v7, "$i$f$associate\\3\\268":I
    const/16 v8, 0xa

    invoke-static {v4, v8}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-static {v8}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v8

    const/16 v10, 0x10

    invoke-static {v8, v10}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v8

    .line 309
    .local v8, "capacity\\3":I
    new-instance v10, Ljava/util/LinkedHashMap;

    invoke-direct {v10, v8}, Ljava/util/LinkedHashMap;-><init>(I)V

    check-cast v10, Ljava/util/Map;

    .local v10, "destination\\4":Ljava/util/Map;
    move-object v11, v4

    .local v11, "$this$associateTo\\4":Ljava/lang/Iterable;
    const/4 v12, 0x0

    .line 310
    .local v12, "$i$f$associateTo\\4\\309":I
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_3
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_6

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    .line 311
    .local v14, "element\\4":Ljava/lang/Object;
    move-object v15, v14

    check-cast v15, Lcom/pymcl/android/ui/state/InstalledEntry;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .local v15, "it\\5":Lcom/pymcl/android/ui/state/InstalledEntry;
    const/16 v16, 0x0

    .line 268
    .local v16, "$i$a$-associate-ModsDialogsKt$PickUpdatesSheet$2$1$1$1\\5\\311\\2":I
    move/from16 v17, v5

    :try_start_4
    invoke-virtual {v15}, Lcom/pymcl/android/ui/state/InstalledEntry;->getFilename()Ljava/lang/String;

    move-result-object v5

    move/from16 v18, v0

    .end local v0    # "$i$a$-runCatching-ModsDialogsKt$PickUpdatesSheet$2$1$1\\2\\268\\0":I
    .local v18, "$i$a$-runCatching-ModsDialogsKt$PickUpdatesSheet$2$1$1\\2\\268\\0":I
    invoke-virtual {v15}, Lcom/pymcl/android/ui/state/InstalledEntry;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    .line 311
    .end local v15    # "it\\5":Lcom/pymcl/android/ui/state/InstalledEntry;
    .end local v16    # "$i$a$-associate-ModsDialogsKt$PickUpdatesSheet$2$1$1$1\\5\\311\\2":I
    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v10, v5, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move/from16 v5, v17

    move/from16 v0, v18

    goto :goto_3

    .line 313
    .end local v14    # "element\\4":Ljava/lang/Object;
    .end local v18    # "$i$a$-runCatching-ModsDialogsKt$PickUpdatesSheet$2$1$1\\2\\268\\0":I
    .restart local v0    # "$i$a$-runCatching-ModsDialogsKt$PickUpdatesSheet$2$1$1\\2\\268\\0":I
    :cond_6
    move/from16 v18, v0

    move/from16 v17, v5

    .line 309
    .end local v0    # "$i$a$-runCatching-ModsDialogsKt$PickUpdatesSheet$2$1$1\\2\\268\\0":I
    .end local v10    # "destination\\4":Ljava/util/Map;
    .end local v11    # "$this$associateTo\\4":Ljava/lang/Iterable;
    .end local v12    # "$i$f$associateTo\\4\\309":I
    .restart local v18    # "$i$a$-runCatching-ModsDialogsKt$PickUpdatesSheet$2$1$1\\2\\268\\0":I
    nop

    .line 268
    .end local v4    # "$this$associate\\3":Ljava/lang/Iterable;
    .end local v7    # "$i$f$associate\\3\\268":I
    .end local v8    # "capacity\\3":I
    nop

    .end local v9    # "$this$invokeSuspend_u24lambda_u241\\2":Lkotlinx/coroutines/CoroutineScope;
    .end local v18    # "$i$a$-runCatching-ModsDialogsKt$PickUpdatesSheet$2$1$1\\2\\268\\0":I
    invoke-static {v10}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_5

    :catchall_1
    move-exception v0

    :goto_4
    :try_start_5
    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_5
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v4

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    move-object v0, v4

    :cond_7
    check-cast v0, Ljava/util/Map;

    invoke-static {v3, v0}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt;->access$PickUpdatesSheet$lambda$14(Landroidx/compose/runtime/MutableState;Ljava/util/Map;)V

    .line 269
    iget-object v0, v1, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->$updates$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v0, v6}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt;->access$PickUpdatesSheet$lambda$11(Landroidx/compose/runtime/MutableState;Ljava/util/Map;)V

    invoke-interface {v6}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    iget-object v3, v1, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->$chosen:Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    .local v0, "$this$forEach\\6":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 314
    .local v4, "$i$f$forEach\\6\\269":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .local v7, "element\\6":Ljava/lang/Object;
    move-object v8, v7

    check-cast v8, Ljava/lang/String;

    .local v8, "it\\7":Ljava/lang/String;
    const/4 v9, 0x0

    .line 269
    .local v9, "$i$a$-forEach-ModsDialogsKt$PickUpdatesSheet$2$1$2\\7\\314\\0":I
    move-object v10, v3

    check-cast v10, Ljava/util/Map;

    invoke-static/range {v17 .. v17}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v11

    invoke-interface {v10, v8, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .end local v7    # "element\\6":Ljava/lang/Object;
    .end local v8    # "it\\7":Ljava/lang/String;
    .end local v9    # "$i$a$-forEach-ModsDialogsKt$PickUpdatesSheet$2$1$2\\7\\314\\0":I
    goto :goto_6

    .line 315
    :cond_8
    nop

    .end local v0    # "$this$forEach\\6":Ljava/lang/Iterable;
    .end local v4    # "$i$f$forEach\\6\\269":I
    .end local v6    # "u":Ljava/util/Map;
    goto :goto_8

    .line 270
    .local v0, "e":Ljava/lang/Exception;
    :goto_7
    iget-object v3, v1, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->$error$delegate:Landroidx/compose/runtime/MutableState;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_9

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v4

    :cond_9
    invoke-static {v3, v4}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt;->access$PickUpdatesSheet$lambda$17(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    iget-object v3, v1, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$PickUpdatesSheet$2$1;->$updates$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt;->access$PickUpdatesSheet$lambda$11(Landroidx/compose/runtime/MutableState;Ljava/util/Map;)V

    .line 271
    .end local v0    # "e":Ljava/lang/Exception;
    :goto_8
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
