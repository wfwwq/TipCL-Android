.class final Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$10$1$3$1$1;
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
    value = "SMAP\nSettingsPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsPage.kt\ncom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$10$1$3$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,308:1\n1#2:309\n*E\n"
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
    c = "com.pymcl.android.ui.pages.SettingsPageKt$AiSettingsGroup$10$1$3$1$1"
    f = "SettingsPage.kt"
    i = {
        0x0
    }
    l = {
        0x10d
    }
    m = "invokeSuspend"
    n = {
        "$this$invokeSuspend_u24lambda_u240\\1"
    }
    nl = {
        0x10d
    }
    s = {
        "L$0"
    }
    v = 0x2
.end annotation


# instance fields
.field final synthetic $ai:Lcom/pymcl/android/data/AiBridge;

.field final synthetic $aiModels$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

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
.method constructor <init>(Landroidx/compose/foundation/layout/RowScope;Lcom/pymcl/android/data/AiBridge;Lcom/pymcl/ai/AiSettings;Landroidx/compose/runtime/MutableState;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/layout/RowScope;",
            "Lcom/pymcl/android/data/AiBridge;",
            "Lcom/pymcl/ai/AiSettings;",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/pymcl/android/data/AiSettingsForm;",
            ">;",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
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
            "Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$10$1$3$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$10$1$3$1$1;->$this_Row:Landroidx/compose/foundation/layout/RowScope;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$10$1$3$1$1;->$ai:Lcom/pymcl/android/data/AiBridge;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$10$1$3$1$1;->$b:Lcom/pymcl/ai/AiSettings;

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$10$1$3$1$1;->$form$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$10$1$3$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p6, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$10$1$3$1$1;->$aiModels$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p7, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$10$1$3$1$1;->$lastResult$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p8, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$10$1$3$1$1;->$showDetail$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v0, 0x1

    invoke-direct {p0, v0, p9}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 10
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

    new-instance v0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$10$1$3$1$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$10$1$3$1$1;->$this_Row:Landroidx/compose/foundation/layout/RowScope;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$10$1$3$1$1;->$ai:Lcom/pymcl/android/data/AiBridge;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$10$1$3$1$1;->$b:Lcom/pymcl/ai/AiSettings;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$10$1$3$1$1;->$form$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v5, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$10$1$3$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v6, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$10$1$3$1$1;->$aiModels$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v7, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$10$1$3$1$1;->$lastResult$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v8, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$10$1$3$1$1;->$showDetail$delegate:Landroidx/compose/runtime/MutableState;

    move-object v9, p1

    invoke-direct/range {v0 .. v9}, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$10$1$3$1$1;-><init>(Landroidx/compose/foundation/layout/RowScope;Lcom/pymcl/android/data/AiBridge;Lcom/pymcl/ai/AiSettings;Landroidx/compose/runtime/MutableState;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$10$1$3$1$1;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1}, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$10$1$3$1$1;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$10$1$3$1$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$10$1$3$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 268
    iget v1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$10$1$3$1$1;->label:I

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const/4 v0, 0x0

    .local v0, "$i$a$-runCatching-SettingsPageKt$AiSettingsGroup$10$1$3$1$1$1\\1\\269\\0":I
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$10$1$3$1$1;->L$0:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/foundation/layout/RowScope;

    .local v1, "$this$invokeSuspend_u24lambda_u240\\1":Landroidx/compose/foundation/layout/RowScope;
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v2, p1

    goto :goto_0

    .end local v0    # "$i$a$-runCatching-SettingsPageKt$AiSettingsGroup$10$1$3$1$1$1\\1\\269\\0":I
    .end local v1    # "$this$invokeSuspend_u24lambda_u240\\1":Landroidx/compose/foundation/layout/RowScope;
    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 269
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$10$1$3$1$1;->$this_Row:Landroidx/compose/foundation/layout/RowScope;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$10$1$3$1$1;->$ai:Lcom/pymcl/android/data/AiBridge;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$10$1$3$1$1;->$b:Lcom/pymcl/ai/AiSettings;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$10$1$3$1$1;->$form$delegate:Landroidx/compose/runtime/MutableState;

    :try_start_1
    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 309
    .restart local v1    # "$this$invokeSuspend_u24lambda_u240\\1":Landroidx/compose/foundation/layout/RowScope;
    const/4 v5, 0x0

    .line 269
    .local v5, "$i$a$-runCatching-SettingsPageKt$AiSettingsGroup$10$1$3$1$1$1\\1\\269\\0":I
    invoke-static {v4}, Lcom/pymcl/android/ui/pages/SettingsPageKt;->access$AiSettingsGroup$lambda$5(Landroidx/compose/runtime/MutableState;)Lcom/pymcl/android/data/AiSettingsForm;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/pymcl/android/data/AiSettingsForm;->toSettings(Lcom/pymcl/ai/AiSettings;)Lcom/pymcl/ai/AiSettings;

    move-result-object v3

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$10$1$3$1$1;->L$0:Ljava/lang/Object;

    const/4 v4, 0x1

    iput v4, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$10$1$3$1$1;->label:I

    invoke-virtual {v2, v3, p0}, Lcom/pymcl/android/data/AiBridge;->models(Lcom/pymcl/ai/AiSettings;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_0

    .line 268
    return-object v0

    .line 269
    :cond_0
    move v0, v5

    .end local v5    # "$i$a$-runCatching-SettingsPageKt$AiSettingsGroup$10$1$3$1$1$1\\1\\269\\0":I
    .restart local v0    # "$i$a$-runCatching-SettingsPageKt$AiSettingsGroup$10$1$3$1$1$1\\1\\269\\0":I
    :goto_0
    check-cast v2, Ljava/util/List;

    .end local v0    # "$i$a$-runCatching-SettingsPageKt$AiSettingsGroup$10$1$3$1$1$1\\1\\269\\0":I
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
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$10$1$3$1$1;->$ai:Lcom/pymcl/android/data/AiBridge;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$10$1$3$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$10$1$3$1$1;->$aiModels$delegate:Landroidx/compose/runtime/MutableState;

    .line 270
    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v4

    const/4 v8, 0x0

    if-eqz v4, :cond_3

    move-object v9, v0

    check-cast v9, Ljava/util/List;

    .line 309
    .local v9, "l\\2":Ljava/util/List;
    const/4 v10, 0x0

    .line 270
    .local v10, "$i$a$-onSuccess-SettingsPageKt$AiSettingsGroup$10$1$3$1$1$2\\2\\270\\0":I
    invoke-static {v3, v9}, Lcom/pymcl/android/ui/pages/SettingsPageKt;->access$AiSettingsGroup$lambda$9(Landroidx/compose/runtime/MutableState;Ljava/util/List;)V

    invoke-virtual {v1}, Lcom/pymcl/android/data/AiBridge;->takeNetNotice()Ljava/lang/String;

    move-result-object v1

    const-string v3, "info"

    if-eqz v1, :cond_1

    .line 309
    .local v1, "n\\3":Ljava/lang/String;
    const/4 v4, 0x0

    .line 270
    .local v4, "$i$a$-let-SettingsPageKt$AiSettingsGroup$10$1$3$1$1$2$1\\3\\270\\2":I
    const-string v5, "\u5df2\u6539\u7528 HTTP"

    invoke-virtual {v2, v5, v1, v3}, Lcom/pymcl/android/ui/state/AppState;->toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 271
    .end local v1    # "n\\3":Ljava/lang/String;
    .end local v4    # "$i$a$-let-SettingsPageKt$AiSettingsGroup$10$1$3$1$1$2$1\\3\\270\\2":I
    :cond_1
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "\u7f51\u5173\u6ca1\u8fd4\u56de\u6a21\u578b\u5217\u8868\uff0c\u53ef\u76f4\u63a5\u624b\u586b\u6a21\u578b\u540d"

    new-array v4, v8, [Ljava/lang/Object;

    invoke-static {v1, v4}, Lcom/pymcl/android/ui/i18n/I18nKt;->tr(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "\u6ca1\u53d6\u5230\u6a21\u578b"

    invoke-virtual {v2, v4, v1, v3}, Lcom/pymcl/android/ui/state/AppState;->toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v3, "\u5171 {0} \u4e2a\u53ef\u7528\u6a21\u578b"

    invoke-static {v3, v1}, Lcom/pymcl/android/ui/i18n/I18nKt;->tr(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x4

    const/4 v7, 0x0

    const-string v3, "\u6a21\u578b\u5217\u8868\u5df2\u5237\u65b0"

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/pymcl/android/ui/state/AppState;->toast$default(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 270
    .end local v9    # "l\\2":Ljava/util/List;
    .end local v10    # "$i$a$-onSuccess-SettingsPageKt$AiSettingsGroup$10$1$3$1$1$2\\2\\270\\0":I
    :cond_3
    :goto_2
    iget-object v1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$10$1$3$1$1;->$ai:Lcom/pymcl/android/data/AiBridge;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$10$1$3$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$10$1$3$1$1;->$lastResult$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$AiSettingsGroup$10$1$3$1$1;->$showDetail$delegate:Landroidx/compose/runtime/MutableState;

    .line 272
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 309
    .local v0, "e\\5":Ljava/lang/Throwable;
    const/4 v5, 0x0

    .line 272
    .local v5, "$i$a$-onFailure-SettingsPageKt$AiSettingsGroup$10$1$3$1$1$3\\5\\272\\0":I
    invoke-virtual {v1, v0}, Lcom/pymcl/android/data/AiBridge;->describeError(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    .local v1, "m\\5":Ljava/lang/String;
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-static {v6, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    invoke-static {v3, v6}, Lcom/pymcl/android/ui/pages/SettingsPageKt;->access$AiSettingsGroup$lambda$15(Landroidx/compose/runtime/MutableState;Lkotlin/Pair;)V

    invoke-static {v4, v8}, Lcom/pymcl/android/ui/pages/SettingsPageKt;->access$AiSettingsGroup$lambda$18(Landroidx/compose/runtime/MutableState;Z)V

    .line 273
    sget-object v3, Lcom/pymcl/android/data/AiSettingsForm;->Companion:Lcom/pymcl/android/data/AiSettingsForm$Companion;

    invoke-virtual {v3, v1}, Lcom/pymcl/android/data/AiSettingsForm$Companion;->splitDetail(Ljava/lang/String;)Lkotlin/Pair;

    move-result-object v3

    invoke-virtual {v3}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, "error"

    const-string v6, "\u62c9\u53d6\u5931\u8d25"

    invoke-virtual {v2, v6, v3, v4}, Lcom/pymcl/android/ui/state/AppState;->toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 272
    .end local v0    # "e\\5":Ljava/lang/Throwable;
    .end local v1    # "m\\5":Ljava/lang/String;
    .end local v5    # "$i$a$-onFailure-SettingsPageKt$AiSettingsGroup$10$1$3$1$1$3\\5\\272\\0":I
    nop

    .line 274
    :cond_4
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
