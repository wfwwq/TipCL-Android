.class final Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$runImport$1$r$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SavesDialog.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$runImport$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Lcom/pymcl/core/instance/SaveImport$Result;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/pymcl/core/instance/SaveImport$Result;",
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
    c = "com.pymcl.android.ui.dialogs.SavesDialogKt$SavesSheet$runImport$1$r$1"
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
.field final synthetic $block:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Ljava/io/File;",
            "Lcom/pymcl/android/data/SaveImportProgress$Cb;",
            "Lcom/pymcl/core/instance/SaveImport$Result;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $imp$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Lkotlin/Triple<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Long;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $job:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lkotlinx/coroutines/Job;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $lastPost:Ljava/util/concurrent/atomic/AtomicLong;

.field final synthetic $m:Lcom/pymcl/core/instance/SaveManager;

.field label:I


# direct methods
.method public static synthetic $r8$lambda$IGpsXn4Egp4iOa11gWPxaB4pXU4(Lkotlin/jvm/internal/Ref$ObjectRef;)Z
    .locals 0

    invoke-static {p0}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$runImport$1$r$1;->invokeSuspend$lambda$1(Lkotlin/jvm/internal/Ref$ObjectRef;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$QbONbihRKg0DGADI2DbJMpYJdNU(Ljava/util/concurrent/atomic/AtomicLong;Landroidx/compose/runtime/MutableState;IIJ)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$runImport$1$r$1;->invokeSuspend$lambda$0(Ljava/util/concurrent/atomic/AtomicLong;Landroidx/compose/runtime/MutableState;IIJ)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lkotlin/jvm/functions/Function2;Lcom/pymcl/core/instance/SaveManager;Ljava/util/concurrent/atomic/AtomicLong;Landroidx/compose/runtime/MutableState;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/io/File;",
            "-",
            "Lcom/pymcl/android/data/SaveImportProgress$Cb;",
            "Lcom/pymcl/core/instance/SaveImport$Result;",
            ">;",
            "Lcom/pymcl/core/instance/SaveManager;",
            "Ljava/util/concurrent/atomic/AtomicLong;",
            "Landroidx/compose/runtime/MutableState<",
            "Lkotlin/Triple<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Long;",
            ">;>;",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lkotlinx/coroutines/Job;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$runImport$1$r$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$runImport$1$r$1;->$block:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$runImport$1$r$1;->$m:Lcom/pymcl/core/instance/SaveManager;

    iput-object p3, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$runImport$1$r$1;->$lastPost:Ljava/util/concurrent/atomic/AtomicLong;

    iput-object p4, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$runImport$1$r$1;->$imp$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$runImport$1$r$1;->$job:Lkotlin/jvm/internal/Ref$ObjectRef;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method private static final invokeSuspend$lambda$0(Ljava/util/concurrent/atomic/AtomicLong;Landroidx/compose/runtime/MutableState;IIJ)Lkotlin/Unit;
    .locals 8
    .param p0, "$lastPost"    # Ljava/util/concurrent/atomic/AtomicLong;
    .param p1, "$imp$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p2, "d"    # I
    .param p3, "t"    # I
    .param p4, "b"    # J

    .line 143
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    .line 144
    .local v0, "last":J
    if-eq p2, p3, :cond_0

    int-to-long v2, p2

    sub-long/2addr v2, v0

    int-to-long v4, p3

    const-wide/16 v6, 0x3c

    div-long/2addr v4, v6

    const-wide/16 v6, 0x1

    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-ltz v2, :cond_1

    :cond_0
    int-to-long v2, p2

    invoke-virtual {p0, v0, v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v2, Lkotlin/Triple;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-direct {v2, v3, v4, v5}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1, v2}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt;->access$SavesSheet$lambda$69(Landroidx/compose/runtime/MutableState;Lkotlin/Triple;)V

    .line 145
    :cond_1
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v2
.end method

.method private static final invokeSuspend$lambda$1(Lkotlin/jvm/internal/Ref$ObjectRef;)Z
    .locals 2
    .param p0, "$job"    # Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 146
    iget-object v0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Lkotlinx/coroutines/Job;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lkotlinx/coroutines/Job;->isActive()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
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

    new-instance v0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$runImport$1$r$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$runImport$1$r$1;->$block:Lkotlin/jvm/functions/Function2;

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$runImport$1$r$1;->$m:Lcom/pymcl/core/instance/SaveManager;

    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$runImport$1$r$1;->$lastPost:Ljava/util/concurrent/atomic/AtomicLong;

    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$runImport$1$r$1;->$imp$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v5, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$runImport$1$r$1;->$job:Lkotlin/jvm/internal/Ref$ObjectRef;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$runImport$1$r$1;-><init>(Lkotlin/jvm/functions/Function2;Lcom/pymcl/core/instance/SaveManager;Ljava/util/concurrent/atomic/AtomicLong;Landroidx/compose/runtime/MutableState;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$runImport$1$r$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lcom/pymcl/core/instance/SaveImport$Result;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$runImport$1$r$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$runImport$1$r$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$runImport$1$r$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 140
    iget v0, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$runImport$1$r$1;->label:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 141
    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$runImport$1$r$1;->$block:Lkotlin/jvm/functions/Function2;

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$runImport$1$r$1;->$m:Lcom/pymcl/core/instance/SaveManager;

    invoke-virtual {v1}, Lcom/pymcl/core/instance/SaveManager;->getSavesDir()Ljava/io/File;

    move-result-object v1

    new-instance v2, Lcom/pymcl/android/data/SaveImportProgress$Cb;

    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$runImport$1$r$1;->$lastPost:Ljava/util/concurrent/atomic/AtomicLong;

    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$runImport$1$r$1;->$imp$delegate:Landroidx/compose/runtime/MutableState;

    new-instance v5, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$runImport$1$r$1$$ExternalSyntheticLambda0;

    invoke-direct {v5, v3, v4}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$runImport$1$r$1$$ExternalSyntheticLambda0;-><init>(Ljava/util/concurrent/atomic/AtomicLong;Landroidx/compose/runtime/MutableState;)V

    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$runImport$1$r$1;->$job:Lkotlin/jvm/internal/Ref$ObjectRef;

    new-instance v4, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$runImport$1$r$1$$ExternalSyntheticLambda1;

    invoke-direct {v4, v3}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$runImport$1$r$1$$ExternalSyntheticLambda1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    invoke-direct {v2, v5, v4}, Lcom/pymcl/android/data/SaveImportProgress$Cb;-><init>(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;)V

    invoke-interface {v0, v1, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 146
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
