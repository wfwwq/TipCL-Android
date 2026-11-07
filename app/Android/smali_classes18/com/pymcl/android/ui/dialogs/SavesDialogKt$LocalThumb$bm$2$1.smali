.class final Lcom/pymcl/android/ui/dialogs/SavesDialogKt$LocalThumb$bm$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SavesDialog.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/dialogs/SavesDialogKt;->LocalThumb-EUb7tLY(Ljava/lang/String;FLandroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/ContentScale;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/runtime/ProduceStateScope<",
        "Landroid/graphics/Bitmap;",
        ">;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSavesDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavesDialog.kt\ncom/pymcl/android/ui/dialogs/SavesDialogKt$LocalThumb$bm$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,393:1\n1#2:394\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Landroidx/compose/runtime/ProduceStateScope;",
        "Landroid/graphics/Bitmap;"
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
    c = "com.pymcl.android.ui.dialogs.SavesDialogKt$LocalThumb$bm$2$1"
    f = "SavesDialog.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0x184
    }
    m = "invokeSuspend"
    n = {
        "$this$produceState",
        "p\\1"
    }
    nl = {
        0x184
    }
    s = {
        "L$0",
        "L$1"
    }
    v = 0x2
.end annotation


# instance fields
.field final synthetic $path:Ljava/lang/String;

.field final synthetic $px:I

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Ljava/lang/String;ILkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/dialogs/SavesDialogKt$LocalThumb$bm$2$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$LocalThumb$bm$2$1;->$path:Ljava/lang/String;

    iput p2, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$LocalThumb$bm$2$1;->$px:I

    const/4 v0, 0x2

    invoke-direct {p0, v0, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
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

    new-instance v0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$LocalThumb$bm$2$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$LocalThumb$bm$2$1;->$path:Ljava/lang/String;

    iget v2, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$LocalThumb$bm$2$1;->$px:I

    invoke-direct {v0, v1, v2, p2}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$LocalThumb$bm$2$1;-><init>(Ljava/lang/String;ILkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$LocalThumb$bm$2$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public final invoke(Landroidx/compose/runtime/ProduceStateScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/ProduceStateScope<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$LocalThumb$bm$2$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$LocalThumb$bm$2$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$LocalThumb$bm$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Landroidx/compose/runtime/ProduceStateScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$LocalThumb$bm$2$1;->invoke(Landroidx/compose/runtime/ProduceStateScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8
    .param p1, "$result"    # Ljava/lang/Object;

    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$LocalThumb$bm$2$1;->L$0:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/runtime/ProduceStateScope;

    .local v0, "$this$produceState":Landroidx/compose/runtime/ProduceStateScope;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 388
    iget v2, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$LocalThumb$bm$2$1;->label:I

    packed-switch v2, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    const/4 v1, 0x0

    .local v1, "$i$a$-let-SavesDialogKt$LocalThumb$bm$2$1$1\\1\\388\\0":I
    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$LocalThumb$bm$2$1;->L$2:Ljava/lang/Object;

    check-cast v2, Landroidx/compose/runtime/ProduceStateScope;

    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$LocalThumb$bm$2$1;->L$1:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    .local v3, "p\\1":Ljava/lang/String;
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v4, p1

    goto :goto_0

    .end local v1    # "$i$a$-let-SavesDialogKt$LocalThumb$bm$2$1$1\\1\\388\\0":I
    .end local v3    # "p\\1":Ljava/lang/String;
    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$LocalThumb$bm$2$1;->$path:Ljava/lang/String;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    iget v4, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$LocalThumb$bm$2$1;->$px:I

    .line 394
    nop

    .local v2, "p\\1":Ljava/lang/String;
    const/4 v5, 0x0

    .line 388
    .local v5, "$i$a$-let-SavesDialogKt$LocalThumb$bm$2$1$1\\1\\388\\0":I
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v6

    check-cast v6, Lkotlin/coroutines/CoroutineContext;

    new-instance v7, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$LocalThumb$bm$2$1$1$1;

    invoke-direct {v7, v2, v4, v3}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$LocalThumb$bm$2$1$1$1;-><init>(Ljava/lang/String;ILkotlin/coroutines/Continuation;)V

    check-cast v7, Lkotlin/jvm/functions/Function2;

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$LocalThumb$bm$2$1;->L$0:Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$LocalThumb$bm$2$1;->L$1:Ljava/lang/Object;

    iput-object v0, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$LocalThumb$bm$2$1;->L$2:Ljava/lang/Object;

    const/4 v3, 0x1

    iput v3, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$LocalThumb$bm$2$1;->label:I

    invoke-static {v6, v7, p0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_0

    return-object v1

    :cond_0
    move-object v4, v3

    move v1, v5

    move-object v3, v2

    move-object v2, v0

    .end local v2    # "p\\1":Ljava/lang/String;
    .end local v5    # "$i$a$-let-SavesDialogKt$LocalThumb$bm$2$1$1\\1\\388\\0":I
    .restart local v1    # "$i$a$-let-SavesDialogKt$LocalThumb$bm$2$1$1\\1\\388\\0":I
    .restart local v3    # "p\\1":Ljava/lang/String;
    :goto_0
    move-object v3, v4

    check-cast v3, Landroid/graphics/Bitmap;

    .end local v1    # "$i$a$-let-SavesDialogKt$LocalThumb$bm$2$1$1\\1\\388\\0":I
    .end local v3    # "p\\1":Ljava/lang/String;
    goto :goto_1

    :cond_1
    move-object v2, v0

    :goto_1
    invoke-interface {v2, v3}, Landroidx/compose/runtime/ProduceStateScope;->setValue(Ljava/lang/Object;)V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
