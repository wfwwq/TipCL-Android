.class final Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "MiscPages.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Ljava/util/List<",
        "+",
        "Lcom/pymcl/android/data/FeedbackHistory$Entry;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lcom/pymcl/android/data/FeedbackHistory$Entry;",
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
    c = "com.pymcl.android.ui.pages.MiscPagesKt$FeedbackPage$doSubmit$1$2"
    f = "MiscPages.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    nl = {}
    s = {}
    v = 0x2
.end annotation


# instance fields
.field final synthetic $ctx:Landroid/content/Context;

.field final synthetic $kind$delegate:Landroidx/compose/runtime/MutableIntState;

.field final synthetic $outcome:Lcom/pymcl/android/data/FeedbackSubmit$Outcome;

.field final synthetic $title$delegate:Landroidx/compose/runtime/MutableState;
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
.method constructor <init>(Landroid/content/Context;Lcom/pymcl/android/data/FeedbackSubmit$Outcome;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/pymcl/android/data/FeedbackSubmit$Outcome;",
            "Landroidx/compose/runtime/MutableIntState;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1$2;->$ctx:Landroid/content/Context;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1$2;->$outcome:Lcom/pymcl/android/data/FeedbackSubmit$Outcome;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1$2;->$kind$delegate:Landroidx/compose/runtime/MutableIntState;

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1$2;->$title$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6
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

    new-instance v0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1$2;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1$2;->$ctx:Landroid/content/Context;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1$2;->$outcome:Lcom/pymcl/android/data/FeedbackSubmit$Outcome;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1$2;->$kind$delegate:Landroidx/compose/runtime/MutableIntState;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1$2;->$title$delegate:Landroidx/compose/runtime/MutableState;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1$2;-><init>(Landroid/content/Context;Lcom/pymcl/android/data/FeedbackSubmit$Outcome;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Ljava/util/List<",
            "Lcom/pymcl/android/data/FeedbackHistory$Entry;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 522
    iget v0, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1$2;->label:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 523
    sget-object v0, Lcom/pymcl/android/data/FeedbackHistory;->INSTANCE:Lcom/pymcl/android/data/FeedbackHistory;

    .line 524
    sget-object v1, Lcom/pymcl/android/data/LauncherRepository;->Companion:Lcom/pymcl/android/data/LauncherRepository$Companion;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1$2;->$ctx:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/pymcl/android/data/LauncherRepository$Companion;->rootDir(Landroid/content/Context;)Ljava/io/File;

    move-result-object v1

    .line 525
    new-instance v2, Lcom/pymcl/android/data/FeedbackHistory$Entry;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1$2;->$outcome:Lcom/pymcl/android/data/FeedbackSubmit$Outcome;

    check-cast v3, Lcom/pymcl/android/data/FeedbackSubmit$Outcome$Submitted;

    invoke-virtual {v3}, Lcom/pymcl/android/data/FeedbackSubmit$Outcome$Submitted;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 526
    sget-object v6, Lcom/pymcl/android/data/FeedbackLogic;->INSTANCE:Lcom/pymcl/android/data/FeedbackLogic;

    invoke-virtual {v6}, Lcom/pymcl/android/data/FeedbackLogic;->getCATEGORY()Ljava/util/List;

    move-result-object v6

    iget-object v7, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1$2;->$kind$delegate:Landroidx/compose/runtime/MutableIntState;

    invoke-static {v7}, Lcom/pymcl/android/ui/pages/MiscPagesKt;->access$FeedbackPage$lambda$1(Landroidx/compose/runtime/MutableIntState;)I

    move-result v7

    sget-object v8, Lcom/pymcl/android/data/FeedbackLogic;->INSTANCE:Lcom/pymcl/android/data/FeedbackLogic;

    invoke-virtual {v8}, Lcom/pymcl/android/data/FeedbackLogic;->getCATEGORY()Ljava/util/List;

    move-result-object v8

    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    move-result v8

    const/4 v9, 0x0

    invoke-static {v7, v9, v8}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v7

    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    iget-object v7, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1$2;->$title$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v7}, Lcom/pymcl/android/ui/pages/MiscPagesKt;->access$FeedbackPage$lambda$4(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v7

    check-cast v7, Ljava/lang/CharSequence;

    invoke-static {v7}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    .line 525
    const/4 v8, 0x1

    invoke-direct/range {v2 .. v8}, Lcom/pymcl/android/data/FeedbackHistory$Entry;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Z)V

    .line 523
    invoke-virtual {v0, v1, v2}, Lcom/pymcl/android/data/FeedbackHistory;->append(Ljava/io/File;Lcom/pymcl/android/data/FeedbackHistory$Entry;)Ljava/util/List;

    move-result-object v0

    .line 526
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
