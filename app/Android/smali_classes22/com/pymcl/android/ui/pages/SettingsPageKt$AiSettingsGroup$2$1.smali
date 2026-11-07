.class final Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SettingsPage.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/pages/SettingsPageKt;->AiSettingsGroup(Landroidx/compose/foundation/layout/ColumnScope;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/Composer;I)V
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
    c = "com.pymcl.android.ui.pages.SettingsPageKt$AiSettingsGroup$2$1"
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
.field final synthetic $base$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/pymcl/ai/AiSettings;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $form$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/pymcl/android/data/AiSettingsForm;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $uiModel:Ljava/lang/String;

.field label:I


# direct methods
.method constructor <init>(Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/pymcl/ai/AiSettings;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/pymcl/android/data/AiSettingsForm;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$2$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$2$1;->$uiModel:Ljava/lang/String;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$2$1;->$base$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$2$1;->$form$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 4
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

    new-instance v0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$2$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$2$1;->$uiModel:Ljava/lang/String;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$2$1;->$base$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$2$1;->$form$delegate:Landroidx/compose/runtime/MutableState;

    invoke-direct {v0, v1, v2, v3, p2}, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$2$1;-><init>(Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$2$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$2$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$2$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 238
    iget v1, v0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$2$1;->label:I

    packed-switch v1, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v1, v0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$2$1;->$uiModel:Ljava/lang/String;

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, v0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$2$1;->$base$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1}, Lcom/pymcl/android/ui/pages/SettingsPageKt;->access$AiSettingsGroup$lambda$2(Landroidx/compose/runtime/MutableState;)Lcom/pymcl/ai/AiSettings;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v1, v0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$2$1;->$uiModel:Ljava/lang/String;

    iget-object v2, v0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$2$1;->$base$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v2}, Lcom/pymcl/android/ui/pages/SettingsPageKt;->access$AiSettingsGroup$lambda$2(Landroidx/compose/runtime/MutableState;)Lcom/pymcl/ai/AiSettings;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/pymcl/ai/AiSettings;->getModel()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, v0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$2$1;->$base$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v2, v0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$2$1;->$base$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v2}, Lcom/pymcl/android/ui/pages/SettingsPageKt;->access$AiSettingsGroup$lambda$2(Landroidx/compose/runtime/MutableState;)Lcom/pymcl/ai/AiSettings;

    move-result-object v4

    if-eqz v4, :cond_1

    iget-object v10, v0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$2$1;->$uiModel:Ljava/lang/String;

    const/16 v19, 0x1fdf

    const/16 v20, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v4 .. v20}, Lcom/pymcl/ai/AiSettings;->copy$default(Lcom/pymcl/ai/AiSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;DLjava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Lcom/pymcl/ai/AiSettings;

    move-result-object v3

    :cond_1
    invoke-static {v1, v3}, Lcom/pymcl/android/ui/pages/SettingsPageKt;->access$AiSettingsGroup$lambda$3(Landroidx/compose/runtime/MutableState;Lcom/pymcl/ai/AiSettings;)V

    iget-object v1, v0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$2$1;->$form$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v2, v0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$2$1;->$form$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v2}, Lcom/pymcl/android/ui/pages/SettingsPageKt;->access$AiSettingsGroup$lambda$5(Landroidx/compose/runtime/MutableState;)Lcom/pymcl/android/data/AiSettingsForm;

    move-result-object v3

    iget-object v9, v0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$2$1;->$uiModel:Ljava/lang/String;

    const/16 v13, 0x1df

    const/4 v14, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v3 .. v14}, Lcom/pymcl/android/data/AiSettingsForm;->copy$default(Lcom/pymcl/android/data/AiSettingsForm;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Lcom/pymcl/android/data/AiSettingsForm;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/pymcl/android/ui/pages/SettingsPageKt;->access$AiSettingsGroup$lambda$6(Landroidx/compose/runtime/MutableState;Lcom/pymcl/android/data/AiSettingsForm;)V

    :cond_2
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
