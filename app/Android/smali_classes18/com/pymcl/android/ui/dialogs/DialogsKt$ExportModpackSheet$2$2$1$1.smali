.class final Lcom/pymcl/android/ui/dialogs/DialogsKt$ExportModpackSheet$2$2$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "Dialogs.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/dialogs/DialogsKt;->ExportModpackSheet(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/DialogSpec$ExportModpack;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
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
    c = "com.pymcl.android.ui.dialogs.DialogsKt$ExportModpackSheet$2$2$1$1"
    f = "Dialogs.kt"
    i = {}
    l = {
        0x18e
    }
    m = "invokeSuspend"
    n = {}
    nl = {
        0x18f
    }
    s = {}
    v = 0x2
.end annotation


# instance fields
.field final synthetic $busy$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Lkotlin/Pair<",
            "Ljava/lang/Float;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $d:Lcom/pymcl/android/ui/state/DialogSpec$ExportModpack;

.field final synthetic $include:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $name$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $pending$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $saver:Landroidx/activity/compose/ManagedActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/compose/ManagedActivityResultLauncher<",
            "Ljava/lang/String;",
            "Landroid/net/Uri;",
            ">;"
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

.field label:I


# direct methods
.method public static synthetic $r8$lambda$OTNpGVKEgcuORFXMtQQ3nKX_D1M(Landroidx/compose/runtime/MutableState;Ljava/lang/Float;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/pymcl/android/ui/dialogs/DialogsKt$ExportModpackSheet$2$2$1$1;->invokeSuspend$lambda$0(Landroidx/compose/runtime/MutableState;Ljava/lang/Float;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/DialogSpec$ExportModpack;Ljava/util/List;Landroidx/activity/compose/ManagedActivityResultLauncher;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Lcom/pymcl/android/ui/state/DialogSpec$ExportModpack;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/activity/compose/ManagedActivityResultLauncher<",
            "Ljava/lang/String;",
            "Landroid/net/Uri;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Lkotlin/Pair<",
            "Ljava/lang/Float;",
            "Ljava/lang/String;",
            ">;>;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/io/File;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/dialogs/DialogsKt$ExportModpackSheet$2$2$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$ExportModpackSheet$2$2$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p2, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$ExportModpackSheet$2$2$1$1;->$d:Lcom/pymcl/android/ui/state/DialogSpec$ExportModpack;

    iput-object p3, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$ExportModpackSheet$2$2$1$1;->$include:Ljava/util/List;

    iput-object p4, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$ExportModpackSheet$2$2$1$1;->$saver:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iput-object p5, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$ExportModpackSheet$2$2$1$1;->$name$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$ExportModpackSheet$2$2$1$1;->$ver$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p7, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$ExportModpackSheet$2$2$1$1;->$busy$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p8, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$ExportModpackSheet$2$2$1$1;->$pending$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p9}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method private static final invokeSuspend$lambda$0(Landroidx/compose/runtime/MutableState;Ljava/lang/Float;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1
    .param p0, "$busy$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p1, "p"    # Ljava/lang/Float;
    .param p2, "t"    # Ljava/lang/String;

    .line 398
    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/pymcl/android/ui/dialogs/DialogsKt;->access$ExportModpackSheet$lambda$15(Landroidx/compose/runtime/MutableState;Lkotlin/Pair;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
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

    new-instance v0, Lcom/pymcl/android/ui/dialogs/DialogsKt$ExportModpackSheet$2$2$1$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$ExportModpackSheet$2$2$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$ExportModpackSheet$2$2$1$1;->$d:Lcom/pymcl/android/ui/state/DialogSpec$ExportModpack;

    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$ExportModpackSheet$2$2$1$1;->$include:Ljava/util/List;

    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$ExportModpackSheet$2$2$1$1;->$saver:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iget-object v5, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$ExportModpackSheet$2$2$1$1;->$name$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v6, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$ExportModpackSheet$2$2$1$1;->$ver$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v7, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$ExportModpackSheet$2$2$1$1;->$busy$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v8, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$ExportModpackSheet$2$2$1$1;->$pending$delegate:Landroidx/compose/runtime/MutableState;

    move-object v9, p2

    invoke-direct/range {v0 .. v9}, Lcom/pymcl/android/ui/dialogs/DialogsKt$ExportModpackSheet$2$2$1$1;-><init>(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/DialogSpec$ExportModpack;Ljava/util/List;Landroidx/activity/compose/ManagedActivityResultLauncher;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/dialogs/DialogsKt$ExportModpackSheet$2$2$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/dialogs/DialogsKt$ExportModpackSheet$2$2$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/dialogs/DialogsKt$ExportModpackSheet$2$2$1$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/dialogs/DialogsKt$ExportModpackSheet$2$2$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 396
    iget v1, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$ExportModpackSheet$2$2$1$1;->label:I

    const/4 v2, 0x0

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, p1

    goto :goto_0

    .line 400
    :catchall_0
    move-exception v0

    goto :goto_1

    .line 396
    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 397
    nop

    .line 398
    :try_start_1
    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$ExportModpackSheet$2$2$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/AppState;->getApi()Lcom/pymcl/android/ui/state/LauncherUiApi;

    move-result-object v1

    invoke-static {v1}, Lcom/pymcl/android/ui/state/LauncherUiApiKt;->getExt(Lcom/pymcl/android/ui/state/LauncherUiApi;)Lcom/pymcl/android/ui/state/LauncherUiApiExt;

    move-result-object v3

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$ExportModpackSheet$2$2$1$1;->$d:Lcom/pymcl/android/ui/state/DialogSpec$ExportModpack;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/DialogSpec$ExportModpack;->getInstance()Ljava/lang/String;

    move-result-object v4

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$ExportModpackSheet$2$2$1$1;->$d:Lcom/pymcl/android/ui/state/DialogSpec$ExportModpack;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/DialogSpec$ExportModpack;->getVersion()Ljava/lang/String;

    move-result-object v5

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$ExportModpackSheet$2$2$1$1;->$name$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1}, Lcom/pymcl/android/ui/dialogs/DialogsKt;->access$ExportModpackSheet$lambda$5(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v6

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$ExportModpackSheet$2$2$1$1;->$ver$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1}, Lcom/pymcl/android/ui/dialogs/DialogsKt;->access$ExportModpackSheet$lambda$8(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$ExportModpackSheet$2$2$1$1;->$include:Ljava/util/List;

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$ExportModpackSheet$2$2$1$1;->$busy$delegate:Landroidx/compose/runtime/MutableState;

    new-instance v9, Lcom/pymcl/android/ui/dialogs/DialogsKt$ExportModpackSheet$2$2$1$1$$ExternalSyntheticLambda0;

    invoke-direct {v9, v1}, Lcom/pymcl/android/ui/dialogs/DialogsKt$ExportModpackSheet$2$2$1$1$$ExternalSyntheticLambda0;-><init>(Landroidx/compose/runtime/MutableState;)V

    move-object v10, p0

    check-cast v10, Lkotlin/coroutines/Continuation;

    const/4 v1, 0x1

    iput v1, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$ExportModpackSheet$2$2$1$1;->label:I

    invoke-interface/range {v3 .. v10}, Lcom/pymcl/android/ui/state/LauncherUiApiExt;->exportModpack(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_0

    .line 396
    return-object v0

    :cond_0
    :goto_0
    check-cast v1, Ljava/lang/String;

    .line 399
    .local v1, "path":Ljava/lang/String;
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .local v0, "f":Ljava/io/File;
    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$ExportModpackSheet$2$2$1$1;->$pending$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v3, v0}, Lcom/pymcl/android/ui/dialogs/DialogsKt;->access$ExportModpackSheet$lambda$12(Landroidx/compose/runtime/MutableState;Ljava/io/File;)V

    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$ExportModpackSheet$2$2$1$1;->$saver:Landroidx/activity/compose/ManagedActivityResultLauncher;

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "getName(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Landroidx/activity/compose/ManagedActivityResultLauncher;->launch(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 400
    .end local v0    # "f":Ljava/io/File;
    .end local v1    # "path":Ljava/lang/String;
    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$ExportModpackSheet$2$2$1$1;->$busy$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v0, v2}, Lcom/pymcl/android/ui/dialogs/DialogsKt;->access$ExportModpackSheet$lambda$15(Landroidx/compose/runtime/MutableState;Lkotlin/Pair;)V

    .line 401
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 400
    :goto_1
    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$ExportModpackSheet$2$2$1$1;->$busy$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1, v2}, Lcom/pymcl/android/ui/dialogs/DialogsKt;->access$ExportModpackSheet$lambda$15(Landroidx/compose/runtime/MutableState;Lkotlin/Pair;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
