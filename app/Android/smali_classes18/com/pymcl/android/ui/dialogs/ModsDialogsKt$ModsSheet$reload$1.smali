.class final Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ModsDialogs.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/dialogs/ModsDialogsKt;->ModsSheet$reload(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)Lkotlinx/coroutines/Job;
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
    value = "SMAP\nModsDialogs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModsDialogs.kt\ncom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,306:1\n1#2:307\n*E\n"
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
    c = "com.pymcl.android.ui.dialogs.ModsDialogsKt$ModsSheet$reload$1"
    f = "ModsDialogs.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2
    }
    l = {
        0x5c,
        0x5d,
        0x60
    }
    m = "invokeSuspend"
    n = {
        "$this$launch",
        "v",
        "$this$launch",
        "v",
        "r",
        "$this$launch",
        "v",
        "r",
        "inj",
        "$this$invokeSuspend_u24lambda_u240\\1"
    }
    nl = {
        0x5d,
        0x5e,
        0x60
    }
    s = {
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$2",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4"
    }
    v = 0x2
.end annotation


# instance fields
.field final synthetic $injected$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $inst:Ljava/lang/String;

.field final synthetic $rows$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/InstalledEntry;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $state:Lcom/pymcl/android/ui/state/AppState;

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

.field L$4:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Ljava/lang/String;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/InstalledEntry;",
            ">;>;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p2, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->$inst:Ljava/lang/String;

    iput-object p3, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->$ver$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p4, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->$rows$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->$injected$delegate:Landroidx/compose/runtime/MutableState;

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

    new-instance v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->$inst:Ljava/lang/String;

    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->$ver$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->$rows$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v5, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->$injected$delegate:Landroidx/compose/runtime/MutableState;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;-><init>(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11
    .param p1, "$result"    # Ljava/lang/Object;

    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlinx/coroutines/CoroutineScope;

    .local v0, "$this$launch":Lkotlinx/coroutines/CoroutineScope;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 89
    iget v2, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->label:I

    packed-switch v2, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    const/4 v1, 0x0

    .local v1, "$i$a$-runCatching-ModsDialogsKt$ModsSheet$reload$1$ids$1\\1\\96\\0":I
    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->L$4:Ljava/lang/Object;

    check-cast v2, Lkotlinx/coroutines/CoroutineScope;

    .local v2, "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->L$3:Ljava/lang/Object;

    check-cast v3, Ljava/util/Set;

    .local v3, "inj":Ljava/util/Set;
    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->L$2:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    .local v4, "r":Ljava/util/List;
    iget-object v5, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->L$1:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    .local v5, "v":Ljava/lang/String;
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v6, v5

    move-object v5, v4

    move-object v4, p1

    goto/16 :goto_2

    .line 96
    .end local v1    # "$i$a$-runCatching-ModsDialogsKt$ModsSheet$reload$1$ids$1\\1\\96\\0":I
    .end local v2    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    :catchall_0
    move-exception v1

    goto/16 :goto_3

    .line 89
    .end local v3    # "inj":Ljava/util/Set;
    .end local v4    # "r":Ljava/util/List;
    .end local v5    # "v":Ljava/lang/String;
    :pswitch_1
    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->L$2:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    .local v2, "r":Ljava/util/List;
    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->L$1:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    .local v3, "v":Ljava/lang/String;
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v4, p1

    move-object v5, v3

    goto :goto_1

    .end local v2    # "r":Ljava/util/List;
    .end local v3    # "v":Ljava/lang/String;
    :pswitch_2
    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->L$1:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    .local v2, "v":Ljava/lang/String;
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v3, p1

    goto :goto_0

    .end local v2    # "v":Ljava/lang/String;
    :pswitch_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 90
    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->$ver$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v2}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt;->access$ModsSheet$lambda$4(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v2

    .line 92
    .restart local v2    # "v":Ljava/lang/String;
    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v3}, Lcom/pymcl/android/ui/state/AppState;->getApi()Lcom/pymcl/android/ui/state/LauncherUiApi;

    move-result-object v3

    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->$inst:Ljava/lang/String;

    move-object v5, p0

    check-cast v5, Lkotlin/coroutines/Continuation;

    iput-object v0, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->L$0:Ljava/lang/Object;

    iput-object v2, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->L$1:Ljava/lang/Object;

    const/4 v6, 0x1

    iput v6, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->label:I

    invoke-interface {v3, v4, v2, v5}, Lcom/pymcl/android/ui/state/LauncherUiApi;->getInstalledMods(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_0

    .line 89
    return-object v1

    :cond_0
    :goto_0
    check-cast v3, Ljava/util/List;

    .line 93
    .local v3, "r":Ljava/util/List;
    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v4}, Lcom/pymcl/android/ui/state/AppState;->getApi()Lcom/pymcl/android/ui/state/LauncherUiApi;

    move-result-object v4

    invoke-static {v4}, Lcom/pymcl/android/ui/state/LauncherUiApiKt;->getExt8(Lcom/pymcl/android/ui/state/LauncherUiApi;)Lcom/pymcl/android/ui/state/LauncherUiApiExt8;

    move-result-object v4

    iget-object v5, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->$inst:Ljava/lang/String;

    move-object v6, p0

    check-cast v6, Lkotlin/coroutines/Continuation;

    iput-object v0, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->L$0:Ljava/lang/Object;

    iput-object v2, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->L$1:Ljava/lang/Object;

    iput-object v3, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->L$2:Ljava/lang/Object;

    const/4 v7, 0x2

    iput v7, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->label:I

    invoke-interface {v4, v5, v2, v6}, Lcom/pymcl/android/ui/state/LauncherUiApiExt8;->globalInjected(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_1

    .line 89
    return-object v1

    .line 93
    :cond_1
    move-object v5, v2

    move-object v2, v3

    .line 89
    .end local v3    # "r":Ljava/util/List;
    .local v2, "r":Ljava/util/List;
    .restart local v5    # "v":Ljava/lang/String;
    :goto_1
    move-object v3, v4

    check-cast v3, Ljava/util/Set;

    .line 94
    .local v3, "inj":Ljava/util/Set;
    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->$ver$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v4}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt;->access$ModsSheet$lambda$4(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 95
    :cond_2
    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->$rows$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v4, v2}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt;->access$ModsSheet$lambda$11(Landroidx/compose/runtime/MutableState;Ljava/util/List;)V

    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->$injected$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v4, v3}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt;->access$ModsSheet$lambda$14(Landroidx/compose/runtime/MutableState;Ljava/util/Set;)V

    .line 96
    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v6, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->$inst:Ljava/lang/String;

    :try_start_1
    sget-object v7, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v7, v0

    .line 307
    .local v7, "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    const/4 v8, 0x0

    .line 96
    .local v8, "$i$a$-runCatching-ModsDialogsKt$ModsSheet$reload$1$ids$1\\1\\96\\0":I
    invoke-virtual {v4}, Lcom/pymcl/android/ui/state/AppState;->getApi()Lcom/pymcl/android/ui/state/LauncherUiApi;

    move-result-object v4

    invoke-static {v4}, Lcom/pymcl/android/ui/state/LauncherUiApiKt;->getExt(Lcom/pymcl/android/ui/state/LauncherUiApi;)Lcom/pymcl/android/ui/state/LauncherUiApiExt;

    move-result-object v4

    const-string v9, "mod"

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->L$0:Ljava/lang/Object;

    iput-object v5, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->L$1:Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->L$2:Ljava/lang/Object;

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->L$3:Ljava/lang/Object;

    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->L$4:Ljava/lang/Object;

    const/4 v10, 0x3

    iput v10, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->label:I

    invoke-interface {v4, v9, v6, v5, p0}, Lcom/pymcl/android/ui/state/LauncherUiApiExt;->identifyInstalled(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    if-ne v4, v1, :cond_3

    .line 89
    return-object v1

    .line 96
    :cond_3
    move-object v6, v5

    move v1, v8

    move-object v5, v2

    move-object v2, v7

    .end local v7    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    .end local v8    # "$i$a$-runCatching-ModsDialogsKt$ModsSheet$reload$1$ids$1\\1\\96\\0":I
    .restart local v1    # "$i$a$-runCatching-ModsDialogsKt$ModsSheet$reload$1$ids$1\\1\\96\\0":I
    .local v2, "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    .local v5, "r":Ljava/util/List;
    .local v6, "v":Ljava/lang/String;
    :goto_2
    :try_start_2
    check-cast v4, Ljava/util/List;

    .end local v1    # "$i$a$-runCatching-ModsDialogsKt$ModsSheet$reload$1$ids$1\\1\\96\\0":I
    .end local v2    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    invoke-static {v4}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v1

    move-object v4, v5

    move-object v5, v6

    goto :goto_3

    .end local v6    # "v":Ljava/lang/String;
    .local v2, "r":Ljava/util/List;
    .local v5, "v":Ljava/lang/String;
    :catchall_2
    move-exception v1

    move-object v4, v2

    .end local v2    # "r":Ljava/util/List;
    .restart local v4    # "r":Ljava/util/List;
    :goto_3
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v6, v5

    move-object v5, v4

    .end local v4    # "r":Ljava/util/List;
    .local v5, "r":Ljava/util/List;
    .restart local v6    # "v":Ljava/lang/String;
    :goto_4
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v2

    invoke-static {v1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    move-object v1, v2

    :cond_4
    check-cast v1, Ljava/util/List;

    .line 97
    .local v1, "ids":Ljava/util/List;
    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_5

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->$ver$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v2}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt;->access$ModsSheet$lambda$4(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$reload$1;->$rows$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v2, v1}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt;->access$ModsSheet$lambda$11(Landroidx/compose/runtime/MutableState;Ljava/util/List;)V

    .line 98
    :cond_5
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
