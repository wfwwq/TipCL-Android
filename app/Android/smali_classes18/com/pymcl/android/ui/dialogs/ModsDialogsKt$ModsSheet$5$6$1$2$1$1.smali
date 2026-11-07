.class final Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$6$1$2$1$1;
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
    c = "com.pymcl.android.ui.dialogs.ModsDialogsKt$ModsSheet$5$6$1$2$1$1"
    f = "ModsDialogs.kt"
    i = {}
    l = {
        0xaa
    }
    m = "invokeSuspend"
    n = {}
    nl = {
        -0x1
    }
    s = {}
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

.field final synthetic $m:Lcom/pymcl/android/ui/state/InstalledEntry;

.field final synthetic $on:Z

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

.field label:I


# direct methods
.method constructor <init>(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Lcom/pymcl/android/ui/state/InstalledEntry;ZLandroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Ljava/lang/String;",
            "Lcom/pymcl/android/ui/state/InstalledEntry;",
            "Z",
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
            "Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$6$1$2$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$6$1$2$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p2, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$6$1$2$1$1;->$inst:Ljava/lang/String;

    iput-object p3, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$6$1$2$1$1;->$m:Lcom/pymcl/android/ui/state/InstalledEntry;

    iput-boolean p4, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$6$1$2$1$1;->$on:Z

    iput-object p5, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$6$1$2$1$1;->$ver$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$6$1$2$1$1;->$rows$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p7, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$6$1$2$1$1;->$injected$delegate:Landroidx/compose/runtime/MutableState;

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

    new-instance v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$6$1$2$1$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$6$1$2$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$6$1$2$1$1;->$inst:Ljava/lang/String;

    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$6$1$2$1$1;->$m:Lcom/pymcl/android/ui/state/InstalledEntry;

    iget-boolean v4, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$6$1$2$1$1;->$on:Z

    iget-object v5, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$6$1$2$1$1;->$ver$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v6, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$6$1$2$1$1;->$rows$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v7, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$6$1$2$1$1;->$injected$delegate:Landroidx/compose/runtime/MutableState;

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$6$1$2$1$1;-><init>(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Lcom/pymcl/android/ui/state/InstalledEntry;ZLandroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$6$1$2$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$6$1$2$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$6$1$2$1$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$6$1$2$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 170
    iget v1, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$6$1$2$1$1;->label:I

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$6$1$2$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/AppState;->getApi()Lcom/pymcl/android/ui/state/LauncherUiApi;

    move-result-object v2

    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$6$1$2$1$1;->$inst:Ljava/lang/String;

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$6$1$2$1$1;->$ver$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt;->access$ModsSheet$lambda$4(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v5

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$6$1$2$1$1;->$m:Lcom/pymcl/android/ui/state/InstalledEntry;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/InstalledEntry;->getFilename()Ljava/lang/String;

    move-result-object v6

    iget-boolean v7, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$6$1$2$1$1;->$on:Z

    move-object v8, p0

    check-cast v8, Lkotlin/coroutines/Continuation;

    const/4 v1, 0x1

    iput v1, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$6$1$2$1$1;->label:I

    const-string v3, "mod"

    invoke-interface/range {v2 .. v8}, Lcom/pymcl/android/ui/state/LauncherUiApi;->setInstalledEnabled(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_0

    return-object v0

    :cond_0
    :goto_0
    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$6$1$2$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-boolean v0, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$6$1$2$1$1;->$on:Z

    if-eqz v0, :cond_1

    const-string v0, "\u5df2\u542f\u7528"

    goto :goto_1

    :cond_1
    const-string v0, "\u5df2\u7981\u7528"

    :goto_1
    move-object v3, v0

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/pymcl/android/ui/state/AppState;->toast$default(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$6$1$2$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$6$1$2$1$1;->$inst:Ljava/lang/String;

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$6$1$2$1$1;->$ver$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$6$1$2$1$1;->$rows$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$5$6$1$2$1$1;->$injected$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt;->access$ModsSheet$reload(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)Lkotlinx/coroutines/Job;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
