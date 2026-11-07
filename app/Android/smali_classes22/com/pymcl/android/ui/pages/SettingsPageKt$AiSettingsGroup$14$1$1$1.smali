.class final Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SettingsPage.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


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
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSettingsPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsPage.kt\ncom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$1$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,308:1\n1#2:309\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"
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
    c = "com.pymcl.android.ui.pages.SettingsPageKt$AiSettingsGroup$14$1$1$1"
    f = "SettingsPage.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1
    }
    l = {
        0x11d,
        0x11d
    }
    m = "invokeSuspend"
    n = {
        "st",
        "$this$invokeSuspend_u24lambda_u240\\1",
        "st",
        "$this$invokeSuspend_u24lambda_u240\\1"
    }
    nl = {
        0x11d,
        0x11d
    }
    s = {
        "L$0",
        "L$2",
        "L$0",
        "L$1"
    }
    v = 0x2
.end annotation


# instance fields
.field final synthetic $ai:Lcom/pymcl/android/data/AiBridge;

.field final synthetic $b:Lcom/pymcl/ai/AiSettings;

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

.field final synthetic $state:Lcom/pymcl/android/ui/state/AppState;

.field final synthetic $this_Row:Landroidx/compose/foundation/layout/RowScope;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lcom/pymcl/ai/AiSettings;Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/MutableState;Lcom/pymcl/android/data/AiBridge;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/ai/AiSettings;",
            "Landroidx/compose/foundation/layout/RowScope;",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/pymcl/android/data/AiSettingsForm;",
            ">;",
            "Lcom/pymcl/android/data/AiBridge;",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/pymcl/ai/AiSettings;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$1$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$1$1$1;->$b:Lcom/pymcl/ai/AiSettings;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$1$1$1;->$this_Row:Landroidx/compose/foundation/layout/RowScope;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$1$1$1;->$form$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$1$1$1;->$ai:Lcom/pymcl/android/data/AiBridge;

    iput-object p5, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p6, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$1$1$1;->$base$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v0, 0x1

    invoke-direct {p0, v0, p7}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 8
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

    new-instance v0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$1$1$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$1$1$1;->$b:Lcom/pymcl/ai/AiSettings;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$1$1$1;->$this_Row:Landroidx/compose/foundation/layout/RowScope;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$1$1$1;->$form$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$1$1$1;->$ai:Lcom/pymcl/android/data/AiBridge;

    iget-object v5, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v6, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$1$1$1;->$base$delegate:Landroidx/compose/runtime/MutableState;

    move-object v7, p1

    invoke-direct/range {v0 .. v7}, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$1$1$1;-><init>(Lcom/pymcl/ai/AiSettings;Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/MutableState;Lcom/pymcl/android/data/AiBridge;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$1$1$1;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$1$1$1;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$1$1$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 283
    iget v1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$1$1$1;->label:I

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const/4 v0, 0x0

    .local v0, "$i$a$-runCatching-SettingsPageKt$AiSettingsGroup$14$1$1$1$1\\1\\285\\0":I
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$1$1$1;->L$1:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/foundation/layout/RowScope;

    .local v1, "$this$invokeSuspend_u24lambda_u240\\1":Landroidx/compose/foundation/layout/RowScope;
    iget-object v2, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$1$1$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/pymcl/ai/AiSettings;

    .local v2, "st":Lcom/pymcl/ai/AiSettings;
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-object v3, p1

    goto :goto_1

    .end local v0    # "$i$a$-runCatching-SettingsPageKt$AiSettingsGroup$14$1$1$1$1\\1\\285\\0":I
    .end local v1    # "$this$invokeSuspend_u24lambda_u240\\1":Landroidx/compose/foundation/layout/RowScope;
    .end local v2    # "st":Lcom/pymcl/ai/AiSettings;
    :pswitch_1
    const/4 v1, 0x0

    .local v1, "$i$a$-runCatching-SettingsPageKt$AiSettingsGroup$14$1$1$1$1\\1\\285\\0":I
    iget-object v2, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$1$1$1;->L$2:Ljava/lang/Object;

    check-cast v2, Landroidx/compose/foundation/layout/RowScope;

    .local v2, "$this$invokeSuspend_u24lambda_u240\\1":Landroidx/compose/foundation/layout/RowScope;
    iget-object v3, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$1$1$1;->L$1:Ljava/lang/Object;

    check-cast v3, Lcom/pymcl/android/data/AiBridge;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$1$1$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lcom/pymcl/ai/AiSettings;

    .local v4, "st":Lcom/pymcl/ai/AiSettings;
    :try_start_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 285
    .end local v1    # "$i$a$-runCatching-SettingsPageKt$AiSettingsGroup$14$1$1$1$1\\1\\285\\0":I
    .end local v2    # "$this$invokeSuspend_u24lambda_u240\\1":Landroidx/compose/foundation/layout/RowScope;
    :catchall_0
    move-exception v0

    move-object v2, v4

    goto :goto_2

    .line 283
    .end local v4    # "st":Lcom/pymcl/ai/AiSettings;
    :pswitch_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 284
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$1$1$1;->$form$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1}, Lcom/pymcl/android/ui/pages/SettingsPageKt;->access$AiSettingsGroup$lambda$5(Landroidx/compose/runtime/MutableState;)Lcom/pymcl/android/data/AiSettingsForm;

    move-result-object v1

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$1$1$1;->$b:Lcom/pymcl/ai/AiSettings;

    invoke-virtual {v1, v2}, Lcom/pymcl/android/data/AiSettingsForm;->toSettings(Lcom/pymcl/ai/AiSettings;)Lcom/pymcl/ai/AiSettings;

    move-result-object v2

    .line 285
    .local v2, "st":Lcom/pymcl/ai/AiSettings;
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$1$1$1;->$this_Row:Landroidx/compose/foundation/layout/RowScope;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$1$1$1;->$ai:Lcom/pymcl/android/data/AiBridge;

    :try_start_2
    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 309
    .local v1, "$this$invokeSuspend_u24lambda_u240\\1":Landroidx/compose/foundation/layout/RowScope;
    const/4 v4, 0x0

    .line 285
    .local v4, "$i$a$-runCatching-SettingsPageKt$AiSettingsGroup$14$1$1$1$1\\1\\285\\0":I
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$1$1$1;->L$0:Ljava/lang/Object;

    iput-object v3, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$1$1$1;->L$1:Ljava/lang/Object;

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$1$1$1;->L$2:Ljava/lang/Object;

    const/4 v5, 0x1

    iput v5, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$1$1$1;->label:I

    invoke-virtual {v3, v2, p0}, Lcom/pymcl/android/data/AiBridge;->saveSettings(Lcom/pymcl/ai/AiSettings;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne v5, v0, :cond_0

    .line 283
    return-object v0

    .line 285
    :cond_0
    move-object v11, v2

    move-object v2, v1

    move v1, v4

    move-object v4, v11

    .local v1, "$i$a$-runCatching-SettingsPageKt$AiSettingsGroup$14$1$1$1$1\\1\\285\\0":I
    .local v2, "$this$invokeSuspend_u24lambda_u240\\1":Landroidx/compose/foundation/layout/RowScope;
    .local v4, "st":Lcom/pymcl/ai/AiSettings;
    :goto_0
    :try_start_3
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$1$1$1;->L$0:Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$1$1$1;->L$1:Ljava/lang/Object;

    const/4 v5, 0x0

    iput-object v5, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$1$1$1;->L$2:Ljava/lang/Object;

    const/4 v5, 0x2

    iput v5, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$1$1$1;->label:I

    invoke-virtual {v3, p0}, Lcom/pymcl/android/data/AiBridge;->settings(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-ne v3, v0, :cond_1

    .line 283
    return-object v0

    .line 285
    :cond_1
    move v0, v1

    move-object v1, v2

    move-object v2, v4

    .end local v4    # "st":Lcom/pymcl/ai/AiSettings;
    .restart local v0    # "$i$a$-runCatching-SettingsPageKt$AiSettingsGroup$14$1$1$1$1\\1\\285\\0":I
    .local v1, "$this$invokeSuspend_u24lambda_u240\\1":Landroidx/compose/foundation/layout/RowScope;
    .local v2, "st":Lcom/pymcl/ai/AiSettings;
    :goto_1
    :try_start_4
    check-cast v3, Lcom/pymcl/ai/AiSettings;

    .end local v0    # "$i$a$-runCatching-SettingsPageKt$AiSettingsGroup$14$1$1$1$1\\1\\285\\0":I
    .end local v1    # "$this$invokeSuspend_u24lambda_u240\\1":Landroidx/compose/foundation/layout/RowScope;
    invoke-static {v3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    :goto_2
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_3
    iget-object v3, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$1$1$1;->$base$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$1$1$1;->$form$delegate:Landroidx/compose/runtime/MutableState;

    .line 286
    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    move-object v9, v0

    check-cast v9, Lcom/pymcl/ai/AiSettings;

    .line 309
    .local v9, "saved\\2":Lcom/pymcl/ai/AiSettings;
    const/4 v10, 0x0

    .line 286
    .local v10, "$i$a$-onSuccess-SettingsPageKt$AiSettingsGroup$14$1$1$1$2\\2\\286\\0":I
    invoke-static {v1, v9}, Lcom/pymcl/android/ui/pages/SettingsPageKt;->access$AiSettingsGroup$lambda$3(Landroidx/compose/runtime/MutableState;Lcom/pymcl/ai/AiSettings;)V

    sget-object v1, Lcom/pymcl/android/data/AiSettingsForm;->Companion:Lcom/pymcl/android/data/AiSettingsForm$Companion;

    invoke-virtual {v1, v9}, Lcom/pymcl/android/data/AiSettingsForm$Companion;->from(Lcom/pymcl/ai/AiSettings;)Lcom/pymcl/android/data/AiSettingsForm;

    move-result-object v1

    invoke-static {v4, v1}, Lcom/pymcl/android/ui/pages/SettingsPageKt;->access$AiSettingsGroup$lambda$6(Landroidx/compose/runtime/MutableState;Lcom/pymcl/android/data/AiSettingsForm;)V

    invoke-static {v3, v9}, Lcom/pymcl/android/ui/pages/SettingsPageKt;->access$AiSettingsGroup$syncUi(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/ai/AiSettings;)V

    const/4 v7, 0x6

    const/4 v8, 0x0

    const-string v4, "\u5df2\u4fdd\u5b58"

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/pymcl/android/ui/state/AppState;->toast$default(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .end local v9    # "saved\\2":Lcom/pymcl/ai/AiSettings;
    .end local v10    # "$i$a$-onSuccess-SettingsPageKt$AiSettingsGroup$14$1$1$1$2\\2\\286\\0":I
    :cond_2
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    .line 287
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 309
    .local v0, "e\\4":Ljava/lang/Throwable;
    const/4 v3, 0x0

    .line 287
    .local v3, "$i$a$-onFailure-SettingsPageKt$AiSettingsGroup$14$1$1$1$3\\4\\287\\0":I
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_3

    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v4

    :cond_3
    const-string v5, "error"

    const-string v6, "\u4fdd\u5b58\u5931\u8d25"

    invoke-virtual {v1, v6, v4, v5}, Lcom/pymcl/android/ui/state/AppState;->toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 288
    .end local v0    # "e\\4":Ljava/lang/Throwable;
    .end local v3    # "$i$a$-onFailure-SettingsPageKt$AiSettingsGroup$14$1$1$1$3\\4\\287\\0":I
    :cond_4
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
