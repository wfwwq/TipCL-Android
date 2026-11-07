.class final Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;
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

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLaunchPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LaunchPage.kt\ncom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,474:1\n1#2:475\n*E\n"
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
    c = "com.pymcl.android.ui.pages.LaunchPageKt$ConfigCard$2$1"
    f = "LaunchPage.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1
    }
    l = {
        0x10e,
        0x10f
    }
    m = "invokeSuspend"
    n = {
        "st",
        "d",
        "st",
        "d"
    }
    nl = {
        0x10f,
        0x112
    }
    s = {
        "L$0",
        "L$1",
        "L$0",
        "L$1"
    }
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

.field final synthetic $resErr:Ljava/lang/String;

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

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method public static synthetic $r8$lambda$XiOug2KpgKFYbwYm4hniv37zC_I(Lcom/pymcl/android/data/LaunchConfigLogic$Display;Lcom/pymcl/android/ui/state/UiSettings;)Lcom/pymcl/android/ui/state/UiSettings;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;->invokeSuspend$lambda$0$0(Lcom/pymcl/android/data/LaunchConfigLogic$Display;Lcom/pymcl/android/ui/state/UiSettings;)Lcom/pymcl/android/ui/state/UiSettings;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroid/content/Context;Lcom/pymcl/android/ui/state/AppState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/pymcl/android/data/LaunchConfigIO$State;",
            ">;",
            "Landroidx/compose/runtime/MutableFloatState;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/content/Context;",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;->$resErr:Ljava/lang/String;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;->$loaded$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;->$mem$delegate:Landroidx/compose/runtime/MutableFloatState;

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;->$w$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;->$h$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;->$ctx:Landroid/content/Context;

    iput-object p7, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p8}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method private static final invokeSuspend$lambda$0$0(Lcom/pymcl/android/data/LaunchConfigLogic$Display;Lcom/pymcl/android/ui/state/UiSettings;)Lcom/pymcl/android/ui/state/UiSettings;
    .locals 59
    .param p0, "$d"    # Lcom/pymcl/android/data/LaunchConfigLogic$Display;
    .param p1, "it"    # Lcom/pymcl/android/ui/state/UiSettings;

    .line 276
    invoke-virtual/range {p0 .. p0}, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->getMemoryMb()I

    move-result v29

    invoke-virtual/range {p0 .. p0}, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->getWidth()I

    move-result v30

    invoke-virtual/range {p0 .. p0}, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->getHeight()I

    move-result v31

    const v57, 0x3fffff

    const/16 v58, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const v56, -0x38000001

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v58}, Lcom/pymcl/android/ui/state/UiSettings;->copy$default(Lcom/pymcl/android/ui/state/UiSettings;ZILjava/lang/String;IIZIZZIZILjava/lang/String;Ljava/lang/String;ZIIIIIIIIZILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;IIILjava/lang/String;ZZZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;IZIILjava/lang/Object;)Lcom/pymcl/android/ui/state/UiSettings;

    move-result-object v0

    return-object v0
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

    new-instance v0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;->$resErr:Ljava/lang/String;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;->$loaded$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;->$mem$delegate:Landroidx/compose/runtime/MutableFloatState;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;->$w$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v5, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;->$h$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v6, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;->$ctx:Landroid/content/Context;

    iget-object v7, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;-><init>(Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroid/content/Context;Lcom/pymcl/android/ui/state/AppState;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 265
    iget v1, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;->label:I

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lcom/pymcl/android/data/LaunchConfigLogic$Display;

    .local v0, "d":Lcom/pymcl/android/data/LaunchConfigLogic$Display;
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/pymcl/android/data/LaunchConfigIO$State;

    .local v1, "st":Lcom/pymcl/android/data/LaunchConfigIO$State;
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v3, p1

    move-object v5, v0

    move-object v4, v1

    goto/16 :goto_1

    .end local v0    # "d":Lcom/pymcl/android/data/LaunchConfigLogic$Display;
    .end local v1    # "st":Lcom/pymcl/android/data/LaunchConfigIO$State;
    :pswitch_1
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/pymcl/android/data/LaunchConfigLogic$Display;

    .local v1, "d":Lcom/pymcl/android/data/LaunchConfigLogic$Display;
    iget-object v2, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/pymcl/android/data/LaunchConfigIO$State;

    .local v2, "st":Lcom/pymcl/android/data/LaunchConfigIO$State;
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_0

    .end local v1    # "d":Lcom/pymcl/android/data/LaunchConfigLogic$Display;
    .end local v2    # "st":Lcom/pymcl/android/data/LaunchConfigIO$State;
    :pswitch_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 266
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;->$loaded$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1}, Lcom/pymcl/android/ui/pages/LaunchPageKt;->access$ConfigCard$lambda$1(Landroidx/compose/runtime/MutableState;)Lcom/pymcl/android/data/LaunchConfigIO$State;

    move-result-object v1

    if-nez v1, :cond_0

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 267
    .local v1, "st":Lcom/pymcl/android/data/LaunchConfigIO$State;
    :cond_0
    iget-object v2, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;->$resErr:Ljava/lang/String;

    if-eqz v2, :cond_1

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 268
    :cond_1
    invoke-virtual {v1}, Lcom/pymcl/android/data/LaunchConfigIO$State;->getDisplay()Lcom/pymcl/android/data/LaunchConfigLogic$Display;

    move-result-object v2

    sget-object v3, Lcom/pymcl/android/data/LaunchConfigLogic;->INSTANCE:Lcom/pymcl/android/data/LaunchConfigLogic;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;->$mem$delegate:Landroidx/compose/runtime/MutableFloatState;

    invoke-static {v4}, Lcom/pymcl/android/ui/pages/LaunchPageKt;->access$ConfigCard$lambda$4(Landroidx/compose/runtime/MutableFloatState;)F

    move-result v4

    invoke-static {v4}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v4

    invoke-virtual {v1}, Lcom/pymcl/android/data/LaunchConfigIO$State;->getMemMax()I

    move-result v5

    invoke-virtual {v1}, Lcom/pymcl/android/data/LaunchConfigIO$State;->getDisplay()Lcom/pymcl/android/data/LaunchConfigLogic$Display;

    move-result-object v6

    invoke-virtual {v6}, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->getMemoryMb()I

    move-result v6

    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-virtual {v3, v4, v5}, Lcom/pymcl/android/data/LaunchConfigLogic;->clampMem(II)I

    move-result v3

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;->$w$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v4}, Lcom/pymcl/android/ui/pages/LaunchPageKt;->access$ConfigCard$lambda$7(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    iget-object v5, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;->$h$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v5}, Lcom/pymcl/android/ui/pages/LaunchPageKt;->access$ConfigCard$lambda$10(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v5

    check-cast v5, Ljava/lang/CharSequence;

    invoke-static {v5}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->copy$default(Lcom/pymcl/android/data/LaunchConfigLogic$Display;IIIZILjava/lang/Object;)Lcom/pymcl/android/data/LaunchConfigLogic$Display;

    move-result-object v2

    .line 269
    .local v2, "d":Lcom/pymcl/android/data/LaunchConfigLogic$Display;
    invoke-virtual {v1}, Lcom/pymcl/android/data/LaunchConfigIO$State;->getDisplay()Lcom/pymcl/android/data/LaunchConfigLogic$Display;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 270
    :cond_2
    move-object v3, p0

    check-cast v3, Lkotlin/coroutines/Continuation;

    iput-object v1, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;->L$0:Ljava/lang/Object;

    iput-object v2, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;->L$1:Ljava/lang/Object;

    const/4 v4, 0x1

    iput v4, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;->label:I

    const-wide/16 v4, 0x258

    invoke-static {v4, v5, v3}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_3

    .line 265
    return-object v0

    .line 270
    :cond_3
    move-object v11, v2

    move-object v2, v1

    move-object v1, v11

    .line 271
    .local v1, "d":Lcom/pymcl/android/data/LaunchConfigLogic$Display;
    .local v2, "st":Lcom/pymcl/android/data/LaunchConfigIO$State;
    :goto_0
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v3

    check-cast v3, Lkotlin/coroutines/CoroutineContext;

    new-instance v4, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1$ok$1;

    iget-object v5, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;->$ctx:Landroid/content/Context;

    iget-object v6, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    const/4 v7, 0x0

    invoke-direct {v4, v5, v6, v1, v7}, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1$ok$1;-><init>(Landroid/content/Context;Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/data/LaunchConfigLogic$Display;Lkotlin/coroutines/Continuation;)V

    check-cast v4, Lkotlin/jvm/functions/Function2;

    move-object v5, p0

    check-cast v5, Lkotlin/coroutines/Continuation;

    iput-object v2, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;->L$0:Ljava/lang/Object;

    iput-object v1, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;->L$1:Ljava/lang/Object;

    const/4 v6, 0x2

    iput v6, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;->label:I

    invoke-static {v3, v4, v5}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_4

    .line 265
    return-object v0

    .line 271
    :cond_4
    move-object v5, v1

    move-object v4, v2

    .end local v1    # "d":Lcom/pymcl/android/data/LaunchConfigLogic$Display;
    .end local v2    # "st":Lcom/pymcl/android/data/LaunchConfigIO$State;
    .local v4, "st":Lcom/pymcl/android/data/LaunchConfigIO$State;
    .local v5, "d":Lcom/pymcl/android/data/LaunchConfigLogic$Display;
    :goto_1
    check-cast v3, Lkotlin/Result;

    invoke-virtual {v3}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    .line 274
    .local v0, "ok":Ljava/lang/Object;
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;->$loaded$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    move-object v3, v0

    check-cast v3, Lkotlin/Unit;

    .local v3, "it\\1":Lkotlin/Unit;
    const/4 v10, 0x0

    .line 275
    .local v10, "$i$a$-onSuccess-LaunchPageKt$ConfigCard$2$1$1\\1\\274\\0":I
    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/pymcl/android/data/LaunchConfigIO$State;->copy$default(Lcom/pymcl/android/data/LaunchConfigIO$State;Lcom/pymcl/android/data/LaunchConfigLogic$Display;IIILjava/lang/Object;)Lcom/pymcl/android/data/LaunchConfigIO$State;

    move-result-object v6

    invoke-static {v2, v6}, Lcom/pymcl/android/ui/pages/LaunchPageKt;->access$ConfigCard$lambda$2(Landroidx/compose/runtime/MutableState;Lcom/pymcl/android/data/LaunchConfigIO$State;)V

    .line 276
    invoke-virtual {v5}, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->getVersionOverride()Z

    move-result v2

    if-nez v2, :cond_5

    new-instance v2, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1$$ExternalSyntheticLambda0;

    invoke-direct {v2, v5}, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1$$ExternalSyntheticLambda0;-><init>(Lcom/pymcl/android/data/LaunchConfigLogic$Display;)V

    invoke-virtual {v1, v2}, Lcom/pymcl/android/ui/state/AppState;->updateSettings(Lkotlin/jvm/functions/Function1;)V

    .line 277
    :cond_5
    nop

    .line 274
    .end local v3    # "it\\1":Lkotlin/Unit;
    .end local v10    # "$i$a$-onSuccess-LaunchPageKt$ConfigCard$2$1$1\\1\\274\\0":I
    :cond_6
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    .line 277
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_8

    .line 475
    .local v2, "it\\3":Ljava/lang/Throwable;
    const/4 v3, 0x0

    .line 277
    .local v3, "$i$a$-onFailure-LaunchPageKt$ConfigCard$2$1$2\\3\\277\\0":I
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_7

    invoke-virtual {v2}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v6

    :cond_7
    const-string v7, "error"

    const-string v8, "\u4fdd\u5b58\u5931\u8d25"

    invoke-virtual {v1, v8, v6, v7}, Lcom/pymcl/android/ui/state/AppState;->toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 278
    .end local v2    # "it\\3":Ljava/lang/Throwable;
    .end local v3    # "$i$a$-onFailure-LaunchPageKt$ConfigCard$2$1$2\\3\\277\\0":I
    :cond_8
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
