.class final Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SettingsPage.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/pages/SettingsPageKt;->SettingsPage(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/Composer;I)V
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
    c = "com.pymcl.android.ui.pages.SettingsPageKt$SettingsPage$1$1"
    f = "SettingsPage.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    nl = {}
    s = {}
    v = 0x2
.end annotation


# instance fields
.field final synthetic $heightText$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $limitText$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $s:Lcom/pymcl/android/ui/state/UiSettings;

.field final synthetic $widthText$delegate:Landroidx/compose/runtime/MutableState;
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
.method constructor <init>(Lcom/pymcl/android/ui/state/UiSettings;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/UiSettings;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$1$1;->$s:Lcom/pymcl/android/ui/state/UiSettings;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$1$1;->$widthText$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$1$1;->$heightText$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$1$1;->$limitText$delegate:Landroidx/compose/runtime/MutableState;

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

    new-instance v0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$1$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$1$1;->$s:Lcom/pymcl/android/ui/state/UiSettings;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$1$1;->$widthText$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$1$1;->$heightText$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$1$1;->$limitText$delegate:Landroidx/compose/runtime/MutableState;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$1$1;-><init>(Lcom/pymcl/android/ui/state/UiSettings;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$1$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 36
    iget v0, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$1$1;->label:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 37
    sget-object v0, Lcom/pymcl/android/data/SettingsLogic;->INSTANCE:Lcom/pymcl/android/data/SettingsLogic;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$1$1;->$widthText$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1}, Lcom/pymcl/android/ui/pages/SettingsPageKt;->access$SettingsPage$lambda$9(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lcom/pymcl/android/data/SettingsLogic;->parseIntField$default(Lcom/pymcl/android/data/SettingsLogic;Ljava/lang/String;IILjava/lang/Object;)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$1$1;->$s:Lcom/pymcl/android/ui/state/UiSettings;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/UiSettings;->getWidth()I

    move-result v1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eq v0, v1, :cond_1

    :goto_0
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$1$1;->$widthText$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$1$1;->$s:Lcom/pymcl/android/ui/state/UiSettings;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/UiSettings;->getWidth()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/pymcl/android/ui/pages/SettingsPageKt;->access$SettingsPage$lambda$10(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    .line 38
    :cond_1
    sget-object v0, Lcom/pymcl/android/data/SettingsLogic;->INSTANCE:Lcom/pymcl/android/data/SettingsLogic;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$1$1;->$heightText$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1}, Lcom/pymcl/android/ui/pages/SettingsPageKt;->access$SettingsPage$lambda$12(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v2, v3, v4}, Lcom/pymcl/android/data/SettingsLogic;->parseIntField$default(Lcom/pymcl/android/data/SettingsLogic;Ljava/lang/String;IILjava/lang/Object;)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$1$1;->$s:Lcom/pymcl/android/ui/state/UiSettings;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/UiSettings;->getHeight()I

    move-result v1

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eq v0, v1, :cond_3

    :goto_1
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$1$1;->$heightText$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$1$1;->$s:Lcom/pymcl/android/ui/state/UiSettings;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/UiSettings;->getHeight()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/pymcl/android/ui/pages/SettingsPageKt;->access$SettingsPage$lambda$13(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    .line 39
    :cond_3
    sget-object v0, Lcom/pymcl/android/data/SettingsLogic;->INSTANCE:Lcom/pymcl/android/data/SettingsLogic;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$1$1;->$limitText$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1}, Lcom/pymcl/android/ui/pages/SettingsPageKt;->access$SettingsPage$lambda$15(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v2, v3, v4}, Lcom/pymcl/android/data/SettingsLogic;->parseIntField$default(Lcom/pymcl/android/data/SettingsLogic;Ljava/lang/String;IILjava/lang/Object;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    :cond_4
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$1$1;->$s:Lcom/pymcl/android/ui/state/UiSettings;

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/UiSettings;->getSpeedLimit()I

    move-result v0

    if-eq v2, v0, :cond_5

    iget-object v0, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$1$1;->$limitText$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$1$1;->$s:Lcom/pymcl/android/ui/state/UiSettings;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/UiSettings;->getSpeedLimit()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/pymcl/android/ui/pages/SettingsPageKt;->access$SettingsPage$lambda$16(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    .line 40
    :cond_5
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
