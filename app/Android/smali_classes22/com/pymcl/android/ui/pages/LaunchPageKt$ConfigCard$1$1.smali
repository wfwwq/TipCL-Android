.class final Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "LaunchPage.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/pages/LaunchPageKt;->ConfigCard(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
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
    c = "com.pymcl.android.ui.pages.LaunchPageKt$ConfigCard$1$1"
    f = "LaunchPage.kt"
    i = {}
    l = {
        0x100
    }
    m = "invokeSuspend"
    n = {}
    nl = {
        0x102
    }
    s = {}
    v = 0x2
.end annotation


# instance fields
.field final synthetic $ctx:Landroid/content/Context;

.field final synthetic $h$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $java$delegate:Landroidx/compose/runtime/MutableIntState;

.field final synthetic $loaded$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/pymcl/android/data/LaunchConfigIO$State;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $mem$delegate:Landroidx/compose/runtime/MutableFloatState;

.field final synthetic $state:Lcom/pymcl/android/ui/state/AppState;

.field final synthetic $w$delegate:Landroidx/compose/runtime/MutableState;
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
.method constructor <init>(Landroid/content/Context;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Landroidx/compose/runtime/MutableFloatState;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableIntState;",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/pymcl/android/data/LaunchConfigIO$State;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$1$1;->$ctx:Landroid/content/Context;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$1$1;->$mem$delegate:Landroidx/compose/runtime/MutableFloatState;

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$1$1;->$w$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$1$1;->$h$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$1$1;->$java$delegate:Landroidx/compose/runtime/MutableIntState;

    iput-object p7, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$1$1;->$loaded$delegate:Landroidx/compose/runtime/MutableState;

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

    new-instance v0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$1$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$1$1;->$ctx:Landroid/content/Context;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$1$1;->$mem$delegate:Landroidx/compose/runtime/MutableFloatState;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$1$1;->$w$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v5, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$1$1;->$h$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v6, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$1$1;->$java$delegate:Landroidx/compose/runtime/MutableIntState;

    iget-object v7, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$1$1;->$loaded$delegate:Landroidx/compose/runtime/MutableState;

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$1$1;-><init>(Landroid/content/Context;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$1$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 255
    iget v1, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$1$1;->label:I

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v1, p1

    goto :goto_0

    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 256
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    check-cast v1, Lkotlin/coroutines/CoroutineContext;

    new-instance v2, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$1$1$st$1;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$1$1;->$ctx:Landroid/content/Context;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    const/4 v5, 0x0

    invoke-direct {v2, v3, v4, v5}, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$1$1$st$1;-><init>(Landroid/content/Context;Lcom/pymcl/android/ui/state/AppState;Lkotlin/coroutines/Continuation;)V

    check-cast v2, Lkotlin/jvm/functions/Function2;

    move-object v3, p0

    check-cast v3, Lkotlin/coroutines/Continuation;

    const/4 v4, 0x1

    iput v4, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$1$1;->label:I

    invoke-static {v1, v2, v3}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_0

    .line 255
    return-object v0

    .line 256
    :cond_0
    :goto_0
    check-cast v1, Lcom/pymcl/android/data/LaunchConfigIO$State;

    if-nez v1, :cond_1

    .line 258
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 259
    .local v1, "st":Lcom/pymcl/android/data/LaunchConfigIO$State;
    :cond_1
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$1$1;->$mem$delegate:Landroidx/compose/runtime/MutableFloatState;

    invoke-virtual {v1}, Lcom/pymcl/android/data/LaunchConfigIO$State;->getDisplay()Lcom/pymcl/android/data/LaunchConfigLogic$Display;

    move-result-object v2

    invoke-virtual {v2}, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->getMemoryMb()I

    move-result v2

    invoke-virtual {v1}, Lcom/pymcl/android/data/LaunchConfigIO$State;->getMemMax()I

    move-result v3

    invoke-virtual {v1}, Lcom/pymcl/android/data/LaunchConfigIO$State;->getDisplay()Lcom/pymcl/android/data/LaunchConfigLogic$Display;

    move-result-object v4

    invoke-virtual {v4}, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->getMemoryMb()I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    const/16 v4, 0x200

    invoke-static {v2, v4, v3}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v2

    int-to-float v2, v2

    invoke-static {v0, v2}, Lcom/pymcl/android/ui/pages/LaunchPageKt;->access$ConfigCard$lambda$5(Landroidx/compose/runtime/MutableFloatState;F)V

    .line 260
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$1$1;->$w$delegate:Landroidx/compose/runtime/MutableState;

    invoke-virtual {v1}, Lcom/pymcl/android/data/LaunchConfigIO$State;->getDisplay()Lcom/pymcl/android/data/LaunchConfigLogic$Display;

    move-result-object v2

    invoke-virtual {v2}, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->getWidth()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/pymcl/android/ui/pages/LaunchPageKt;->access$ConfigCard$lambda$8(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$1$1;->$h$delegate:Landroidx/compose/runtime/MutableState;

    invoke-virtual {v1}, Lcom/pymcl/android/data/LaunchConfigIO$State;->getDisplay()Lcom/pymcl/android/data/LaunchConfigLogic$Display;

    move-result-object v2

    invoke-virtual {v2}, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->getHeight()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/pymcl/android/ui/pages/LaunchPageKt;->access$ConfigCard$lambda$11(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$1$1;->$java$delegate:Landroidx/compose/runtime/MutableIntState;

    invoke-virtual {v1}, Lcom/pymcl/android/data/LaunchConfigIO$State;->getJavaIndex()I

    move-result v2

    invoke-static {v0, v2}, Lcom/pymcl/android/ui/pages/LaunchPageKt;->access$ConfigCard$lambda$14(Landroidx/compose/runtime/MutableIntState;I)V

    .line 261
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$1$1;->$loaded$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v0, v1}, Lcom/pymcl/android/ui/pages/LaunchPageKt;->access$ConfigCard$lambda$2(Landroidx/compose/runtime/MutableState;Lcom/pymcl/android/data/LaunchConfigIO$State;)V

    .line 262
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
