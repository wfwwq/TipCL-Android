.class final Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$14$1$1$1;
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
    value = "SMAP\nDialogs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dialogs.kt\ncom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$14$1$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,453:1\n1#2:454\n*E\n"
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
    c = "com.pymcl.android.ui.dialogs.DialogsKt$DialogBody$14$1$1$1"
    f = "Dialogs.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0xb3
    }
    m = "invokeSuspend"
    n = {
        "$this$launch",
        "$this$invokeSuspend_u24lambda_u240\\1"
    }
    nl = {
        0xb3
    }
    s = {
        "L$0",
        "L$1"
    }
    v = 0x2
.end annotation


# instance fields
.field final synthetic $close:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $d:Lcom/pymcl/android/ui/state/DialogSpec;

.field final synthetic $modelId:Ljava/lang/String;

.field final synthetic $state:Lcom/pymcl/android/ui/state/AppState;

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/DialogSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Lcom/pymcl/android/ui/state/DialogSpec;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$14$1$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$14$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p2, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$14$1$1$1;->$d:Lcom/pymcl/android/ui/state/DialogSpec;

    iput-object p3, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$14$1$1$1;->$modelId:Ljava/lang/String;

    iput-object p4, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$14$1$1$1;->$close:Lkotlin/jvm/functions/Function0;

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

    new-instance v0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$14$1$1$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$14$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$14$1$1$1;->$d:Lcom/pymcl/android/ui/state/DialogSpec;

    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$14$1$1$1;->$modelId:Ljava/lang/String;

    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$14$1$1$1;->$close:Lkotlin/jvm/functions/Function0;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$14$1$1$1;-><init>(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/DialogSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$14$1$1$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$14$1$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$14$1$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$14$1$1$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$14$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12
    .param p1, "$result"    # Ljava/lang/Object;

    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$14$1$1$1;->L$0:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    .local v1, "$this$launch":Lkotlinx/coroutines/CoroutineScope;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 179
    iget v2, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$14$1$1$1;->label:I

    const-string v3, ""

    packed-switch v2, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const/4 v0, 0x0

    .local v0, "$i$a$-runCatching-DialogsKt$DialogBody$14$1$1$1$1\\1\\179\\0":I
    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$14$1$1$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lkotlinx/coroutines/CoroutineScope;

    .local v2, "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .end local v0    # "$i$a$-runCatching-DialogsKt$DialogBody$14$1$1$1$1\\1\\179\\0":I
    .end local v2    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$14$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$14$1$1$1;->$d:Lcom/pymcl/android/ui/state/DialogSpec;

    iget-object v5, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$14$1$1$1;->$modelId:Ljava/lang/String;

    :try_start_1
    sget-object v6, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v6, v1

    .line 454
    .local v6, "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    const/4 v7, 0x0

    .line 179
    .local v7, "$i$a$-runCatching-DialogsKt$DialogBody$14$1$1$1$1\\1\\179\\0":I
    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/AppState;->getApi()Lcom/pymcl/android/ui/state/LauncherUiApi;

    move-result-object v2

    check-cast v4, Lcom/pymcl/android/ui/state/DialogSpec$Skin;

    invoke-virtual {v4}, Lcom/pymcl/android/ui/state/DialogSpec$Skin;->getAccount()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$14$1$1$1;->L$0:Ljava/lang/Object;

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$14$1$1$1;->L$1:Ljava/lang/Object;

    const/4 v8, 0x1

    iput v8, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$14$1$1$1;->label:I

    invoke-interface {v2, v4, v3, v5, p0}, Lcom/pymcl/android/ui/state/LauncherUiApi;->setAccountSkin(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_0

    return-object v0

    :cond_0
    move-object v2, v6

    move v0, v7

    .end local v6    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    .end local v7    # "$i$a$-runCatching-DialogsKt$DialogBody$14$1$1$1$1\\1\\179\\0":I
    .restart local v0    # "$i$a$-runCatching-DialogsKt$DialogBody$14$1$1$1$1\\1\\179\\0":I
    .restart local v2    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    :goto_0
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .end local v0    # "$i$a$-runCatching-DialogsKt$DialogBody$14$1$1$1$1\\1\\179\\0":I
    .end local v2    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_1
    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$14$1$1$1;->$close:Lkotlin/jvm/functions/Function0;

    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$14$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    move-object v10, v0

    check-cast v10, Lkotlin/Unit;

    .line 454
    .local v10, "it\\2":Lkotlin/Unit;
    const/4 v11, 0x0

    .line 179
    .local v11, "$i$a$-onSuccess-DialogsKt$DialogBody$14$1$1$1$2\\2\\179\\0":I
    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    const/4 v8, 0x6

    const/4 v9, 0x0

    const-string v5, "\u5df2\u6e05\u9664\uff0c\u56de\u5230\u6e38\u620f\u9ed8\u8ba4\u76ae\u80a4"

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/pymcl/android/ui/state/AppState;->toast$default(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .end local v10    # "it\\2":Lkotlin/Unit;
    .end local v11    # "$i$a$-onSuccess-DialogsKt$DialogBody$14$1$1$1$2\\2\\179\\0":I
    :cond_1
    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$DialogBody$14$1$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 454
    .local v0, "it\\4":Ljava/lang/Throwable;
    const/4 v4, 0x0

    .line 179
    .local v4, "$i$a$-onFailure-DialogsKt$DialogBody$14$1$1$1$3\\4\\179\\0":I
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_2

    goto :goto_2

    :cond_2
    move-object v3, v5

    :goto_2
    const-string v5, "error"

    const-string v6, "\u76ae\u80a4\u6ca1\u80fd\u4fdd\u5b58"

    invoke-virtual {v2, v6, v3, v5}, Lcom/pymcl/android/ui/state/AppState;->toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .end local v0    # "it\\4":Ljava/lang/Throwable;
    .end local v4    # "$i$a$-onFailure-DialogsKt$DialogBody$14$1$1$1$3\\4\\179\\0":I
    :cond_3
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
