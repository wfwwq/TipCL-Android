.class final Lcom/pymcl/android/ui/dialogs/DialogsKt$CrashSheet$exportAndShare$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "Dialogs.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/dialogs/DialogsKt;->CrashSheet$exportAndShare(Lcom/pymcl/android/ui/state/AppState;Landroid/content/Context;Lcom/pymcl/android/ui/state/CrashInfo;Ljava/lang/String;Ljava/lang/String;)Lkotlinx/coroutines/Job;
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
    value = "SMAP\nDialogs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dialogs.kt\ncom/pymcl/android/ui/dialogs/DialogsKt$CrashSheet$exportAndShare$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,453:1\n1#2:454\n*E\n"
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
    c = "com.pymcl.android.ui.dialogs.DialogsKt$CrashSheet$exportAndShare$1"
    f = "Dialogs.kt"
    i = {
        0x0
    }
    l = {
        0x1ab
    }
    m = "invokeSuspend"
    n = {
        "$this$launch"
    }
    nl = {
        0x1ac
    }
    s = {
        "L$0"
    }
    v = 0x2
.end annotation


# instance fields
.field final synthetic $ctx:Landroid/content/Context;

.field final synthetic $info:Lcom/pymcl/android/ui/state/CrashInfo;

.field final synthetic $prefix:Ljava/lang/String;

.field final synthetic $state:Lcom/pymcl/android/ui/state/AppState;

.field final synthetic $title:Ljava/lang/String;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lcom/pymcl/android/ui/state/AppState;Landroid/content/Context;Lcom/pymcl/android/ui/state/CrashInfo;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Landroid/content/Context;",
            "Lcom/pymcl/android/ui/state/CrashInfo;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/dialogs/DialogsKt$CrashSheet$exportAndShare$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$CrashSheet$exportAndShare$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p2, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$CrashSheet$exportAndShare$1;->$ctx:Landroid/content/Context;

    iput-object p3, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$CrashSheet$exportAndShare$1;->$info:Lcom/pymcl/android/ui/state/CrashInfo;

    iput-object p4, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$CrashSheet$exportAndShare$1;->$prefix:Ljava/lang/String;

    iput-object p5, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$CrashSheet$exportAndShare$1;->$title:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7
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

    new-instance v0, Lcom/pymcl/android/ui/dialogs/DialogsKt$CrashSheet$exportAndShare$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$CrashSheet$exportAndShare$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$CrashSheet$exportAndShare$1;->$ctx:Landroid/content/Context;

    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$CrashSheet$exportAndShare$1;->$info:Lcom/pymcl/android/ui/state/CrashInfo;

    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$CrashSheet$exportAndShare$1;->$prefix:Ljava/lang/String;

    iget-object v5, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$CrashSheet$exportAndShare$1;->$title:Ljava/lang/String;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/pymcl/android/ui/dialogs/DialogsKt$CrashSheet$exportAndShare$1;-><init>(Lcom/pymcl/android/ui/state/AppState;Landroid/content/Context;Lcom/pymcl/android/ui/state/CrashInfo;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/pymcl/android/ui/dialogs/DialogsKt$CrashSheet$exportAndShare$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/dialogs/DialogsKt$CrashSheet$exportAndShare$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/dialogs/DialogsKt$CrashSheet$exportAndShare$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/dialogs/DialogsKt$CrashSheet$exportAndShare$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/dialogs/DialogsKt$CrashSheet$exportAndShare$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10
    .param p1, "$result"    # Ljava/lang/Object;

    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$CrashSheet$exportAndShare$1;->L$0:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    .local v1, "$this$launch":Lkotlinx/coroutines/CoroutineScope;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 426
    iget v2, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$CrashSheet$exportAndShare$1;->label:I

    packed-switch v2, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v2, p1

    goto :goto_0

    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 427
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v2

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    new-instance v3, Lcom/pymcl/android/ui/dialogs/DialogsKt$CrashSheet$exportAndShare$1$f$1;

    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$CrashSheet$exportAndShare$1;->$ctx:Landroid/content/Context;

    iget-object v5, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$CrashSheet$exportAndShare$1;->$info:Lcom/pymcl/android/ui/state/CrashInfo;

    const/4 v6, 0x0

    invoke-direct {v3, v4, v5, v6}, Lcom/pymcl/android/ui/dialogs/DialogsKt$CrashSheet$exportAndShare$1$f$1;-><init>(Landroid/content/Context;Lcom/pymcl/android/ui/state/CrashInfo;Lkotlin/coroutines/Continuation;)V

    check-cast v3, Lkotlin/jvm/functions/Function2;

    move-object v4, p0

    check-cast v4, Lkotlin/coroutines/Continuation;

    iput-object v1, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$CrashSheet$exportAndShare$1;->L$0:Ljava/lang/Object;

    const/4 v5, 0x1

    iput v5, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$CrashSheet$exportAndShare$1;->label:I

    invoke-static {v2, v3, v4}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_0

    .line 426
    return-object v0

    :cond_0
    :goto_0
    check-cast v2, Ljava/io/File;

    .line 428
    .local v2, "f":Ljava/io/File;
    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$CrashSheet$exportAndShare$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    const-string v0, "getAbsolutePath(...)"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v7, 0x4

    const/4 v8, 0x0

    const-string v4, "\u5df2\u5bfc\u51fa"

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/pymcl/android/ui/state/AppState;->toast$default(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 429
    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$CrashSheet$exportAndShare$1;->$ctx:Landroid/content/Context;

    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$CrashSheet$exportAndShare$1;->$prefix:Ljava/lang/String;

    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$CrashSheet$exportAndShare$1;->$info:Lcom/pymcl/android/ui/state/CrashInfo;

    iget-object v5, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$CrashSheet$exportAndShare$1;->$title:Ljava/lang/String;

    :try_start_0
    sget-object v6, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v6, v1

    .line 454
    .local v6, "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    const/4 v7, 0x0

    .line 429
    .local v7, "$i$a$-runCatching-DialogsKt$CrashSheet$exportAndShare$1$1\\1\\429\\0":I
    sget-object v8, Lcom/pymcl/android/data/CrashReport;->INSTANCE:Lcom/pymcl/android/data/CrashReport;

    sget-object v9, Lcom/pymcl/android/data/CrashReport;->INSTANCE:Lcom/pymcl/android/data/CrashReport;

    invoke-virtual {v9, v4}, Lcom/pymcl/android/data/CrashReport;->text(Lcom/pymcl/android/ui/state/CrashInfo;)Ljava/lang/String;

    move-result-object v4

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v8, v0, v2, v3, v5}, Lcom/pymcl/android/data/CrashReport;->share(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V

    .end local v6    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    .end local v7    # "$i$a$-runCatching-DialogsKt$CrashSheet$exportAndShare$1$1\\1\\429\\0":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 430
    :goto_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
