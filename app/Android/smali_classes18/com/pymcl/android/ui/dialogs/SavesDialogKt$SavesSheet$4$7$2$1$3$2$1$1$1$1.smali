.class final Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$4$7$2$1$3$2$1$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SavesDialog.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


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
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Ljava/lang/String;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        ""
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
    c = "com.pymcl.android.ui.dialogs.SavesDialogKt$SavesSheet$4$7$2$1$3$2$1$1$1$1"
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
.field final synthetic $p:Ljava/io/File;

.field final synthetic $s:Lcom/pymcl/core/instance/SaveInfo;

.field final synthetic $sm:Lcom/pymcl/core/instance/SaveManager;

.field label:I


# direct methods
.method constructor <init>(Lcom/pymcl/core/instance/SaveManager;Lcom/pymcl/core/instance/SaveInfo;Ljava/io/File;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/instance/SaveManager;",
            "Lcom/pymcl/core/instance/SaveInfo;",
            "Ljava/io/File;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$4$7$2$1$3$2$1$1$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$4$7$2$1$3$2$1$1$1$1;->$sm:Lcom/pymcl/core/instance/SaveManager;

    iput-object p2, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$4$7$2$1$3$2$1$1$1$1;->$s:Lcom/pymcl/core/instance/SaveInfo;

    iput-object p3, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$4$7$2$1$3$2$1$1$1$1;->$p:Ljava/io/File;

    const/4 v0, 0x1

    invoke-direct {p0, v0, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$4$7$2$1$3$2$1$1$1$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$4$7$2$1$3$2$1$1$1$1;->$sm:Lcom/pymcl/core/instance/SaveManager;

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$4$7$2$1$3$2$1$1$1$1;->$s:Lcom/pymcl/core/instance/SaveInfo;

    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$4$7$2$1$3$2$1$1$1$1;->$p:Ljava/io/File;

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$4$7$2$1$3$2$1$1$1$1;-><init>(Lcom/pymcl/core/instance/SaveManager;Lcom/pymcl/core/instance/SaveInfo;Ljava/io/File;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$4$7$2$1$3$2$1$1$1$1;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$4$7$2$1$3$2$1$1$1$1;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$4$7$2$1$3$2$1$1$1$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$4$7$2$1$3$2$1$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 268
    iget v0, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$4$7$2$1$3$2$1$1$1$1;->label:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$4$7$2$1$3$2$1$1$1$1;->$sm:Lcom/pymcl/core/instance/SaveManager;

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$4$7$2$1$3$2$1$1$1$1;->$s:Lcom/pymcl/core/instance/SaveInfo;

    invoke-virtual {v1}, Lcom/pymcl/core/instance/SaveInfo;->getDirName()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$SavesSheet$4$7$2$1$3$2$1$1$1$1;->$p:Ljava/io/File;

    invoke-virtual {v0, v1, v2}, Lcom/pymcl/core/instance/SaveManager;->installDatapack(Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getName(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
