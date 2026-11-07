.class final Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$11$1$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "Dialogs.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/dialogs/DialogsKt;->DialogBody(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/DialogSpec;Landroidx/compose/runtime/Composer;I)V
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
    value = "SMAP\nDialogs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dialogs.kt\ncom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$11$1$1$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,453:1\n1#2:454\n*E\n"
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
    c = "com.pymcl.android.ui.dialogs.DialogsKt$DialogBody$11$1$1$1$1"
    f = "Dialogs.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1
    }
    l = {
        0x94,
        0x94
    }
    m = "invokeSuspend"
    n = {
        "$this$launch",
        "$this$invokeSuspend_u24lambda_u240\\1",
        "$this$launch",
        "$this$invokeSuspend_u24lambda_u240\\1"
    }
    nl = {
        0x94,
        0x94
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
.field final synthetic $apiUrl:Ljava/lang/String;

.field final synthetic $nide:Z

.field final synthetic $nideId:Ljava/lang/String;

.field final synthetic $pw$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $state:Lcom/pymcl/android/ui/state/AppState;

.field final synthetic $u:Ljava/lang/String;

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(ZLcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$11$1$1$1$1;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$11$1$1$1$1;->$nide:Z

    iput-object p2, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$11$1$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p3, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$11$1$1$1$1;->$nideId:Ljava/lang/String;

    iput-object p4, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$11$1$1$1$1;->$u:Ljava/lang/String;

    iput-object p5, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$11$1$1$1$1;->$apiUrl:Ljava/lang/String;

    iput-object p6, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$11$1$1$1$1;->$pw$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p7}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 8
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

    new-instance v0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$11$1$1$1$1;

    iget-boolean v1, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$11$1$1$1$1;->$nide:Z

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$11$1$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$11$1$1$1$1;->$nideId:Ljava/lang/String;

    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$11$1$1$1$1;->$u:Ljava/lang/String;

    iget-object v5, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$11$1$1$1$1;->$apiUrl:Ljava/lang/String;

    iget-object v6, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$11$1$1$1$1;->$pw$delegate:Landroidx/compose/runtime/MutableState;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$11$1$1$1$1;-><init>(ZLcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$11$1$1$1$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$11$1$1$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$11$1$1$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$11$1$1$1$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$11$1$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10
    .param p1, "$result"    # Ljava/lang/Object;

    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$11$1$1$1$1;->L$0:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    .local v1, "$this$launch":Lkotlinx/coroutines/CoroutineScope;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 147
    iget v2, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$11$1$1$1$1;->label:I

    packed-switch v2, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const/4 v0, 0x0

    .local v0, "$i$a$-runCatching-DialogsKt$DialogBody$11$1$1$1$1$1\\1\\148\\0":I
    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$11$1$1$1$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lkotlinx/coroutines/CoroutineScope;

    .local v2, "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v8, v2

    move-object v2, p1

    goto :goto_0

    .end local v0    # "$i$a$-runCatching-DialogsKt$DialogBody$11$1$1$1$1$1\\1\\148\\0":I
    .end local v2    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    :pswitch_1
    const/4 v0, 0x0

    .restart local v0    # "$i$a$-runCatching-DialogsKt$DialogBody$11$1$1$1$1$1\\1\\148\\0":I
    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$11$1$1$1$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lkotlinx/coroutines/CoroutineScope;

    .restart local v2    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    :try_start_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v8, v2

    move-object v2, p1

    goto :goto_0

    .end local v0    # "$i$a$-runCatching-DialogsKt$DialogBody$11$1$1$1$1$1\\1\\148\\0":I
    .end local v2    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    :pswitch_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 148
    iget-boolean v2, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$11$1$1$1$1;->$nide:Z

    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$11$1$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$11$1$1$1$1;->$nideId:Ljava/lang/String;

    iget-object v5, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$11$1$1$1$1;->$u:Ljava/lang/String;

    iget-object v6, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$11$1$1$1$1;->$apiUrl:Ljava/lang/String;

    iget-object v7, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$11$1$1$1$1;->$pw$delegate:Landroidx/compose/runtime/MutableState;

    :try_start_2
    sget-object v8, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v8, v1

    .line 454
    .local v8, "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    const/4 v9, 0x0

    .line 148
    .local v9, "$i$a$-runCatching-DialogsKt$DialogBody$11$1$1$1$1$1\\1\\148\\0":I
    if-eqz v2, :cond_1

    invoke-virtual {v3}, Lcom/pymcl/android/ui/state/AppState;->getApi()Lcom/pymcl/android/ui/state/LauncherUiApi;

    move-result-object v2

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v7}, Lcom/pymcl/android/ui/dialogs/DialogsKt;->access$DialogBody$lambda$33(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$11$1$1$1$1;->L$0:Ljava/lang/Object;

    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$11$1$1$1$1;->L$1:Ljava/lang/Object;

    const/4 v6, 0x1

    iput v6, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$11$1$1$1$1;->label:I

    invoke-interface {v2, v4, v5, v3, p0}, Lcom/pymcl/android/ui/state/LauncherUiApi;->startNide8Login(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_0

    .line 147
    return-object v0

    .line 148
    :cond_0
    move v0, v9

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Lcom/pymcl/android/ui/state/AppState;->getApi()Lcom/pymcl/android/ui/state/LauncherUiApi;

    move-result-object v2

    invoke-static {v7}, Lcom/pymcl/android/ui/dialogs/DialogsKt;->access$DialogBody$lambda$33(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$11$1$1$1$1;->L$0:Ljava/lang/Object;

    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$11$1$1$1$1;->L$1:Ljava/lang/Object;

    const/4 v4, 0x2

    iput v4, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$11$1$1$1$1;->label:I

    invoke-interface {v2, v6, v5, v3, p0}, Lcom/pymcl/android/ui/state/LauncherUiApi;->startAuthlibLogin(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_2

    .line 147
    return-object v0

    .line 148
    :cond_2
    move v0, v9

    .end local v9    # "$i$a$-runCatching-DialogsKt$DialogBody$11$1$1$1$1$1\\1\\148\\0":I
    .restart local v0    # "$i$a$-runCatching-DialogsKt$DialogBody$11$1$1$1$1$1\\1\\148\\0":I
    :goto_0
    check-cast v2, Ljava/lang/String;

    .end local v0    # "$i$a$-runCatching-DialogsKt$DialogBody$11$1$1$1$1$1\\1\\148\\0":I
    .end local v8    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_1
    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$11$1$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    .line 149
    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 454
    .local v4, "it\\2":Ljava/lang/String;
    const/4 v8, 0x0

    .line 149
    .local v8, "$i$a$-onSuccess-DialogsKt$DialogBody$11$1$1$1$1$2\\2\\149\\0":I
    const/4 v6, 0x4

    const/4 v7, 0x0

    const-string v3, "\u767b\u5f55\u6210\u529f"

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/pymcl/android/ui/state/AppState;->toast$default(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/AppState;->refreshData()Lkotlinx/coroutines/Job;

    .end local v4    # "it\\2":Ljava/lang/String;
    .end local v8    # "$i$a$-onSuccess-DialogsKt$DialogBody$11$1$1$1$1$2\\2\\149\\0":I
    :cond_3
    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$11$1$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    .line 150
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 454
    .local v0, "it\\4":Ljava/lang/Throwable;
    const/4 v3, 0x0

    .line 150
    .local v3, "$i$a$-onFailure-DialogsKt$DialogBody$11$1$1$1$1$3\\4\\150\\0":I
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_4

    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v4

    :cond_4
    const-string v5, "error"

    const-string v6, "\u767b\u5f55\u5931\u8d25"

    invoke-virtual {v2, v6, v4, v5}, Lcom/pymcl/android/ui/state/AppState;->toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    .end local v0    # "it\\4":Ljava/lang/Throwable;
    .end local v3    # "$i$a$-onFailure-DialogsKt$DialogBody$11$1$1$1$1$3\\4\\150\\0":I
    :cond_5
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
