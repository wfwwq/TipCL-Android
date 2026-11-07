.class final Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$2$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SavesDialog.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.pymcl.android.ui.dialogs.SavesDialogKt$SavesSheet$2$1$1$1"
    f = "SavesDialog.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    nl = {}
    s = {}
    v = 0x2
.end annotation


# instance fields
.field final synthetic $backups$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/pymcl/core/instance/SaveBackup;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $m:Lcom/pymcl/core/instance/SaveManager;

.field final synthetic $media$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/pymcl/core/instance/MediaFile;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $saves$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/pymcl/core/instance/SaveInfo;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $tab$delegate:Landroidx/compose/runtime/MutableIntState;

.field final synthetic $trash$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/pymcl/core/instance/TrashEntry;",
            ">;>;"
        }
    .end annotation
.end field

.field label:I


# direct methods
.method constructor <init>(Lcom/pymcl/core/instance/SaveManager;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/instance/SaveManager;",
            "Landroidx/compose/runtime/MutableIntState;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/pymcl/core/instance/SaveInfo;",
            ">;>;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/pymcl/core/instance/SaveBackup;",
            ">;>;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/pymcl/core/instance/TrashEntry;",
            ">;>;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/pymcl/core/instance/MediaFile;",
            ">;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$2$1$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$2$1$1$1;->$m:Lcom/pymcl/core/instance/SaveManager;

    iput-object p2, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$2$1$1$1;->$tab$delegate:Landroidx/compose/runtime/MutableIntState;

    iput-object p3, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$2$1$1$1;->$saves$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p4, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$2$1$1$1;->$backups$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$2$1$1$1;->$trash$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$2$1$1$1;->$media$delegate:Landroidx/compose/runtime/MutableState;

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

    new-instance v0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$2$1$1$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$2$1$1$1;->$m:Lcom/pymcl/core/instance/SaveManager;

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$2$1$1$1;->$tab$delegate:Landroidx/compose/runtime/MutableIntState;

    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$2$1$1$1;->$saves$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$2$1$1$1;->$backups$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v5, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$2$1$1$1;->$trash$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v6, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$2$1$1$1;->$media$delegate:Landroidx/compose/runtime/MutableState;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$2$1$1$1;-><init>(Lcom/pymcl/core/instance/SaveManager;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$2$1$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$2$1$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$2$1$1$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$2$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 86
    iget v0, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$2$1$1$1;->label:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 87
    sget-object v0, Lcom/pymcl/android/data/SavesFormat;->INSTANCE:Lcom/pymcl/android/data/SavesFormat;

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$2$1$1$1;->$tab$delegate:Landroidx/compose/runtime/MutableIntState;

    invoke-static {v1}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt;->access$SavesSheet$lambda$1(Landroidx/compose/runtime/MutableIntState;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/SavesFormat;->mediaKind(I)Lcom/pymcl/core/instance/MediaKind;

    move-result-object v0

    .line 88
    .local v0, "kind":Lcom/pymcl/core/instance/MediaKind;
    if-nez v0, :cond_0

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$2$1$1$1;->$saves$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$2$1$1$1;->$m:Lcom/pymcl/core/instance/SaveManager;

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lcom/pymcl/core/instance/SaveManager;->listSaves$default(Lcom/pymcl/core/instance/SaveManager;ZILjava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt;->access$SavesSheet$lambda$17(Landroidx/compose/runtime/MutableState;Ljava/util/List;)V

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$2$1$1$1;->$backups$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$2$1$1$1;->$m:Lcom/pymcl/core/instance/SaveManager;

    invoke-static {v2, v5, v4, v5}, Lcom/pymcl/core/instance/SaveManager;->listBackups$default(Lcom/pymcl/core/instance/SaveManager;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt;->access$SavesSheet$lambda$20(Landroidx/compose/runtime/MutableState;Ljava/util/List;)V

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$2$1$1$1;->$trash$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$2$1$1$1;->$m:Lcom/pymcl/core/instance/SaveManager;

    invoke-virtual {v2}, Lcom/pymcl/core/instance/SaveManager;->listTrash()Ljava/util/List;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt;->access$SavesSheet$lambda$23(Landroidx/compose/runtime/MutableState;Ljava/util/List;)V

    goto :goto_0

    .line 89
    :cond_0
    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$2$1$1$1;->$media$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$2$1$1$1;->$m:Lcom/pymcl/core/instance/SaveManager;

    invoke-virtual {v2, v0}, Lcom/pymcl/core/instance/SaveManager;->listMedia(Lcom/pymcl/core/instance/MediaKind;)Ljava/util/List;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt;->access$SavesSheet$lambda$26(Landroidx/compose/runtime/MutableState;Ljava/util/List;)V

    .line 90
    :goto_0
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
