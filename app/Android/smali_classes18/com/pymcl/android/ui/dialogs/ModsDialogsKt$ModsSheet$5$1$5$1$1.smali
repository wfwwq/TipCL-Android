.class final Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$1$5$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ModsDialogs.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/dialogs/ModsDialogsKt;->ModsSheet(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/DialogSpec$Mods;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
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
    value = "SMAP\nModsDialogs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModsDialogs.kt\ncom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$1$5$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,306:1\n1#2:307\n*E\n"
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
    c = "com.pymcl.android.ui.dialogs.ModsDialogsKt$ModsSheet$5$1$5$1$1"
    f = "ModsDialogs.kt"
    i = {}
    l = {
        0x8f
    }
    m = "invokeSuspend"
    n = {}
    nl = {
        0x133
    }
    s = {}
    v = 0x2
.end annotation


# instance fields
.field final synthetic $busy$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $conflicts$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/ConflictRow;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $inst:Ljava/lang/String;

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

.field L$0:Ljava/lang/Object;

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
            "Lcom/pymcl/android/ui/state/ConflictRow;",
            ">;>;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$1$5$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$1$5$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p2, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$1$5$1$1;->$inst:Ljava/lang/String;

    iput-object p3, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$1$5$1$1;->$ver$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p4, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$1$5$1$1;->$conflicts$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$1$5$1$1;->$busy$delegate:Landroidx/compose/runtime/MutableState;

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

    new-instance v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$1$5$1$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$1$5$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$1$5$1$1;->$inst:Ljava/lang/String;

    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$1$5$1$1;->$ver$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$1$5$1$1;->$conflicts$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v5, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$1$5$1$1;->$busy$delegate:Landroidx/compose/runtime/MutableState;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$1$5$1$1;-><init>(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$1$5$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$1$5$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$1$5$1$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$1$5$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 142
    iget v1, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$1$5$1$1;->label:I

    const/4 v2, 0x0

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$1$5$1$1;->L$0:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/runtime/MutableState;

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v3, p1

    goto :goto_0

    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 143
    :try_start_1
    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$1$5$1$1;->$conflicts$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$1$5$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v3}, Lcom/pymcl/android/ui/state/AppState;->getApi()Lcom/pymcl/android/ui/state/LauncherUiApi;

    move-result-object v3

    invoke-static {v3}, Lcom/pymcl/android/ui/state/LauncherUiApiKt;->getExt8(Lcom/pymcl/android/ui/state/LauncherUiApi;)Lcom/pymcl/android/ui/state/LauncherUiApiExt8;

    move-result-object v3

    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$1$5$1$1;->$inst:Ljava/lang/String;

    iget-object v5, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$1$5$1$1;->$ver$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v5}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt;->access$ModsSheet$lambda$4(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v5

    move-object v6, p0

    check-cast v6, Lkotlin/coroutines/Continuation;

    iput-object v1, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$1$5$1$1;->L$0:Ljava/lang/Object;

    const/4 v7, 0x1

    iput v7, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$1$5$1$1;->label:I

    invoke-interface {v3, v4, v5, v6}, Lcom/pymcl/android/ui/state/LauncherUiApiExt8;->modConflicts(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_0

    .line 142
    return-object v0

    .line 143
    :cond_0
    move-object v0, v1

    .line 142
    :goto_0
    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$1$5$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    move-object v1, v3

    check-cast v1, Ljava/util/List;

    .line 307
    nop

    .local v1, "it\\1":Ljava/util/List;
    const/4 v10, 0x0

    .line 143
    .local v10, "$i$a$-also-ModsDialogsKt$ModsSheet$5$1$5$1$1$1\\1\\143\\0":I
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_1

    const-string v5, "\u6ca1\u6709\u53d1\u73b0\u51b2\u7a81"

    const-string v6, "\u91cd\u590d\u3001\u7f3a\u524d\u7f6e\u3001\u7248\u672c\u533a\u95f4\u3001\u4e0d\u517c\u5bb9\u58f0\u660e\u90fd\u68c0\u67e5\u8fc7\u4e86"

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/pymcl/android/ui/state/AppState;->toast$default(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .end local v1    # "it\\1":Ljava/util/List;
    .end local v10    # "$i$a$-also-ModsDialogsKt$ModsSheet$5$1$5$1$1$1\\1\\143\\0":I
    :cond_1
    check-cast v3, Ljava/util/List;

    invoke-static {v0, v3}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt;->access$ModsSheet$lambda$24(Landroidx/compose/runtime/MutableState;Ljava/util/List;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 144
    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_0
    move-exception v0

    .local v0, "e":Ljava/lang/Exception;
    :try_start_2
    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$1$5$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    const-string v3, "\u68c0\u67e5\u5931\u8d25"

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_2

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v4

    :cond_2
    const-string v5, "error"

    invoke-virtual {v1, v3, v4, v5}, Lcom/pymcl/android/ui/state/AppState;->toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .end local v0    # "e":Ljava/lang/Exception;
    :goto_1
    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$1$5$1$1;->$busy$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v0, v2}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt;->access$ModsSheet$lambda$21(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    .line 145
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 144
    :goto_2
    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$1$5$1$1;->$busy$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1, v2}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt;->access$ModsSheet$lambda$21(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
