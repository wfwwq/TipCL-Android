.class final Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$2$1$1;
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
    value = "SMAP\nSettingsPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsPage.kt\ncom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$2$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,308:1\n1#2:309\n*E\n"
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
    c = "com.pymcl.android.ui.pages.SettingsPageKt$AiSettingsGroup$14$2$1$1"
    f = "SettingsPage.kt"
    i = {
        0x0
    }
    l = {
        0x125
    }
    m = "invokeSuspend"
    n = {
        "$this$invokeSuspend_u24lambda_u240\\1"
    }
    nl = {
        0x125
    }
    s = {
        "L$0"
    }
    v = 0x2
.end annotation


# instance fields
.field final synthetic $ai:Lcom/pymcl/android/data/AiBridge;

.field final synthetic $b:Lcom/pymcl/ai/AiSettings;

.field final synthetic $form$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/pymcl/android/data/AiSettingsForm;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $lastResult$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Lkotlin/Pair<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $showDetail$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $state:Lcom/pymcl/android/ui/state/AppState;

.field final synthetic $this_Row:Landroidx/compose/foundation/layout/RowScope;

.field L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Landroidx/compose/foundation/layout/RowScope;Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/data/AiBridge;Lcom/pymcl/ai/AiSettings;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/layout/RowScope;",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Lcom/pymcl/android/data/AiBridge;",
            "Lcom/pymcl/ai/AiSettings;",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/pymcl/android/data/AiSettingsForm;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Lkotlin/Pair<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            ">;>;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$2$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$2$1$1;->$this_Row:Landroidx/compose/foundation/layout/RowScope;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$2$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$2$1$1;->$ai:Lcom/pymcl/android/data/AiBridge;

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$2$1$1;->$b:Lcom/pymcl/ai/AiSettings;

    iput-object p5, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$2$1$1;->$form$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$2$1$1;->$lastResult$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p7, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$2$1$1;->$showDetail$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v0, 0x1

    invoke-direct {p0, v0, p8}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 9
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

    new-instance v0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$2$1$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$2$1$1;->$this_Row:Landroidx/compose/foundation/layout/RowScope;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$2$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$2$1$1;->$ai:Lcom/pymcl/android/data/AiBridge;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$2$1$1;->$b:Lcom/pymcl/ai/AiSettings;

    iget-object v5, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$2$1$1;->$form$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v6, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$2$1$1;->$lastResult$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v7, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$2$1$1;->$showDetail$delegate:Landroidx/compose/runtime/MutableState;

    move-object v8, p1

    invoke-direct/range {v0 .. v8}, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$2$1$1;-><init>(Landroidx/compose/foundation/layout/RowScope;Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/data/AiBridge;Lcom/pymcl/ai/AiSettings;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$2$1$1;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1}, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$2$1$1;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$2$1$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$2$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 292
    iget v1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$2$1$1;->label:I

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const/4 v0, 0x0

    .local v0, "$i$a$-runCatching-SettingsPageKt$AiSettingsGroup$14$2$1$1$1\\1\\293\\0":I
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$2$1$1;->L$0:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/foundation/layout/RowScope;

    .local v1, "$this$invokeSuspend_u24lambda_u240\\1":Landroidx/compose/foundation/layout/RowScope;
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v2, p1

    goto :goto_0

    .end local v0    # "$i$a$-runCatching-SettingsPageKt$AiSettingsGroup$14$2$1$1$1\\1\\293\\0":I
    .end local v1    # "$this$invokeSuspend_u24lambda_u240\\1":Landroidx/compose/foundation/layout/RowScope;
    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 293
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$2$1$1;->$this_Row:Landroidx/compose/foundation/layout/RowScope;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$2$1$1;->$ai:Lcom/pymcl/android/data/AiBridge;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$2$1$1;->$b:Lcom/pymcl/ai/AiSettings;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$2$1$1;->$form$delegate:Landroidx/compose/runtime/MutableState;

    :try_start_1
    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 309
    .restart local v1    # "$this$invokeSuspend_u24lambda_u240\\1":Landroidx/compose/foundation/layout/RowScope;
    const/4 v5, 0x0

    .line 293
    .local v5, "$i$a$-runCatching-SettingsPageKt$AiSettingsGroup$14$2$1$1$1\\1\\293\\0":I
    invoke-static {v4}, Lcom/pymcl/android/ui/pages/SettingsPageKt;->access$AiSettingsGroup$lambda$5(Landroidx/compose/runtime/MutableState;)Lcom/pymcl/android/data/AiSettingsForm;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/pymcl/android/data/AiSettingsForm;->toSettings(Lcom/pymcl/ai/AiSettings;)Lcom/pymcl/ai/AiSettings;

    move-result-object v3

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$2$1$1;->L$0:Ljava/lang/Object;

    const/4 v4, 0x1

    iput v4, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$2$1$1;->label:I

    invoke-virtual {v2, v3, p0}, Lcom/pymcl/android/data/AiBridge;->testConnection(Lcom/pymcl/ai/AiSettings;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_0

    .line 292
    return-object v0

    .line 293
    :cond_0
    move v0, v5

    .end local v5    # "$i$a$-runCatching-SettingsPageKt$AiSettingsGroup$14$2$1$1$1\\1\\293\\0":I
    .restart local v0    # "$i$a$-runCatching-SettingsPageKt$AiSettingsGroup$14$2$1$1$1\\1\\293\\0":I
    :goto_0
    check-cast v2, Lkotlin/Pair;

    .end local v0    # "$i$a$-runCatching-SettingsPageKt$AiSettingsGroup$14$2$1$1$1\\1\\293\\0":I
    .end local v1    # "$this$invokeSuspend_u24lambda_u240\\1":Landroidx/compose/foundation/layout/RowScope;
    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_1
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$2$1$1;->$ai:Lcom/pymcl/android/data/AiBridge;

    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    goto :goto_2

    .line 309
    .local v2, "e\\2":Ljava/lang/Throwable;
    :cond_1
    const/4 v0, 0x0

    .line 293
    .local v0, "$i$a$-getOrElse-SettingsPageKt$AiSettingsGroup$14$2$1$1$2\\2\\293\\0":I
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v1, v2}, Lcom/pymcl/android/data/AiBridge;->describeError(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    .end local v0    # "$i$a$-getOrElse-SettingsPageKt$AiSettingsGroup$14$2$1$1$2\\2\\293\\0":I
    .end local v2    # "e\\2":Ljava/lang/Throwable;
    :goto_2
    check-cast v0, Lkotlin/Pair;

    invoke-virtual {v0}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    .local v1, "ok":Z
    invoke-virtual {v0}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 294
    .local v0, "msg":Ljava/lang/String;
    iget-object v2, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$2$1$1;->$lastResult$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v4, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/pymcl/android/ui/pages/SettingsPageKt;->access$AiSettingsGroup$lambda$15(Landroidx/compose/runtime/MutableState;Lkotlin/Pair;)V

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$2$1$1;->$showDetail$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v2, v3}, Lcom/pymcl/android/ui/pages/SettingsPageKt;->access$AiSettingsGroup$lambda$18(Landroidx/compose/runtime/MutableState;Z)V

    .line 295
    iget-object v2, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$14$2$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    if-eqz v1, :cond_2

    const-string v3, "AI \u8fde\u63a5\u6210\u529f"

    goto :goto_3

    :cond_2
    const-string v3, "AI \u8fde\u63a5\u5931\u8d25"

    :goto_3
    sget-object v4, Lcom/pymcl/android/data/AiSettingsForm;->Companion:Lcom/pymcl/android/data/AiSettingsForm$Companion;

    invoke-virtual {v4, v0}, Lcom/pymcl/android/data/AiSettingsForm$Companion;->splitDetail(Ljava/lang/String;)Lkotlin/Pair;

    move-result-object v4

    invoke-virtual {v4}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-eqz v1, :cond_3

    const-string v5, "ok"

    goto :goto_4

    :cond_3
    const-string v5, "error"

    :goto_4
    invoke-virtual {v2, v3, v4, v5}, Lcom/pymcl/android/ui/state/AppState;->toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 296
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
